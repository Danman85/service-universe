@ECHO OFF

@REM populate environment variables with default values
SET JDK=%JAVA_HOME%
FOR %%a in ("%~dp0\..\..") do SET PROJECT_DIR=%%~fa
SET PROP_FILE=%PROJECT_DIR%/scripts/project.properties

IF EXIST %PROP_FILE% (
    ECHO "Property file found, using custom properties"
    FOR /F "tokens=1,2 delims==" %%A IN ( %PROP_FILE% ) do (
        IF "%%A"=="jdk" SET JDK=%%B
    )
) ELSE (
    ECHO "No property file found, using default properties"
)

ECHO "Properties =========================================="
ECHO "- Jdk: %JDK%"

SET SERVICE_NAME=admin-service
SET BUILD_DIR=%project_dir%\%service_name%\target

FOR %%F in (%BUILD_DIR%\*.jar) DO (
    SET JAR_FILE=%%F
)

SET JVM_ARGS=-Xmx128m -Dvisualvm.id=%SERVICE_NAME%

ECHO "Starting: %JAR_FILE%"
ECHO "With JDK location: %JDK%"
%JDK%\bin\java %JVM_ARGS% -jar %JAR_FILE%

@ECHO ON