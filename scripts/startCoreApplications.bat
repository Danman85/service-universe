@ECHO OFF

ECHO "Starting config-service
start %PROJECT_DIR%\config-service\scripts\startConfigService.bat

ECHO "Waiting for config-service to start, before continuing."
TIMEOUT /T 15

ECHO "Starting discovery-service"
start %PROJECT_DIR%\discovery-service\scripts\startDiscoveryService.bat

ECHO "Starting admin-service"
start %PROJECT_DIR%\admin-service\scripts\startAdminService.bat

@ECHO ON