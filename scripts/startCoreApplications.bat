@ECHO OFF

ECHO "Starting config-service
start ..\config-service\scripts\startConfigService.bat

ECHO "Waiting for config-service to start, before continuing."
TIMEOUT /T 30

ECHO "Starting discovery-service"
start ..\discovery-service\scripts\startDiscoveryService.bat

ECHO "Starting admin-service"
start ..\admin-service\scripts\startAdminService.bat

REM ECHO "Starting demo-service"
REM start ..\demo-service\scripts\startDemoService.bat

@ECHO ON