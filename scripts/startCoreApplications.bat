@ECHO OFF

ECHO "Starting config-service
start ..\config-service\scripts\startConfigService.bat

ECHO "Waiting for config-service to start, before continuing."
TIMEOUT /T 15

ECHO "Starting discovery-service"
start ..\discovery-service\scripts\startDiscoveryService.bat

ECHO "Starting admin-service"
start ..\admin-service\scripts\startAdminService.bat

ECHO "Starting demo-service"
start ..\demo-service\scripts\startDemoService.bat

@ECHO ON