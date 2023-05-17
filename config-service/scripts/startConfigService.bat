@ECHO OFF

@REM populate environment variables with default values
SET JDK=%JAVA_HOME%
FOR %%a in ("%~dp0\..\..") do SET PROJECT_DIR=%%~fa
SET PROP_FILE=%PROJECT_DIR%/project.properties
SET ACTIVE_PROFILES_PROPERTY="-Dspring.profiles.active=native,local"

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

SET SERVICE_NAME=config-service
SET BUILD_DIR=%PROJECT_DIR%\%SERVICE_NAME%\target

ECHO %BUILD_DIR%

FOR %%F in (%BUILD_DIR%\*.jar) DO (
    SET JAR_FILE=%%F
)

SET JVM_ARGS=-Xmx128m -Dvisualvm.id=%SERVICE_NAME% %ACTIVE_PROFILES_PROPERTY%

@ECHO ON
%JDK%\bin\java %JVM_ARGS% -jar "%JAR_FILE%"

