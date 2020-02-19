# ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi

All URIs are relative to *https://nsxmanager.your.domain/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNodeUserSshKeyAddSshKey**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#addNodeUserSshKeyAddSshKey) | **POST** /node/users/{userid}/ssh-keys?action&#x3D;add_ssh_key | Add SSH public key to authorized_keys file for node user
[**cancelApplianceManagementTaskCancel**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#cancelApplianceManagementTaskCancel) | **POST** /node/tasks/{task-id}?action&#x3D;cancel | Cancel specified task
[**checkRabbitMQManagementPort**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#checkRabbitMQManagementPort) | **GET** /node/rabbitmq-management-port | Check if RabbitMQ management port is enabled or not
[**collectAlarms**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#collectAlarms) | **GET** /hpm/alarms | Collect alarms from all NSX nodes
[**collectAuditLogs**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#collectAuditLogs) | **POST** /administration/audit-logs | Collect audit logs from registered manager nodes
[**collectSupportBundlesCollect**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#collectSupportBundlesCollect) | **POST** /administration/support-bundles?action&#x3D;collect | Collect support bundles from registered cluster and fabric nodes
[**copyFromRemoteFileCopyFromRemoteFile**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#copyFromRemoteFileCopyFromRemoteFile) | **POST** /node/file-store/{file-name}?action&#x3D;copy_from_remote_file | Copy a remote file to the file store
[**copyToRemoteFileCopyToRemoteFile**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#copyToRemoteFileCopyToRemoteFile) | **POST** /node/file-store/{file-name}?action&#x3D;copy_to_remote_file | Copy file in the file store to a remote file store
[**createApplianceManagementServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createApplianceManagementServiceActionRestart) | **POST** /node/services/node-mgmt?action&#x3D;restart | Restart the node management service
[**createClusterBootManagerServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createClusterBootManagerServiceActionRestart) | **POST** /node/services/cluster_manager?action&#x3D;restart | Restart, start or stop the cluster boot manager service
[**createClusterBootManagerServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createClusterBootManagerServiceActionStart) | **POST** /node/services/cluster_manager?action&#x3D;start | Restart, start or stop the cluster boot manager service
[**createClusterBootManagerServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createClusterBootManagerServiceActionStop) | **POST** /node/services/cluster_manager?action&#x3D;stop | Restart, start or stop the cluster boot manager service
[**createCminventoryServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createCminventoryServiceActionRestart) | **POST** /node/services/cm-inventory?action&#x3D;restart | Restart, start or stop the manager service
[**createCminventoryServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createCminventoryServiceActionStart) | **POST** /node/services/cm-inventory?action&#x3D;start | Restart, start or stop the manager service
[**createCminventoryServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createCminventoryServiceActionStop) | **POST** /node/services/cm-inventory?action&#x3D;stop | Restart, start or stop the manager service
[**createControllerServerServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createControllerServerServiceActionRestart) | **POST** /node/services/controller?action&#x3D;restart | Restart, start or stop the controller service
[**createControllerServerServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createControllerServerServiceActionStart) | **POST** /node/services/controller?action&#x3D;start | Restart, start or stop the controller service
[**createControllerServerServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createControllerServerServiceActionStop) | **POST** /node/services/controller?action&#x3D;stop | Restart, start or stop the controller service
[**createFile**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createFile) | **POST** /node/file-store/{file-name} | Upload a file to the file store
[**createLiagentServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createLiagentServiceActionRestart) | **POST** /node/services/liagent?action&#x3D;restart | Restart, start or stop the liagent service
[**createLiagentServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createLiagentServiceActionStart) | **POST** /node/services/liagent?action&#x3D;start | Restart, start or stop the liagent service
[**createLiagentServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createLiagentServiceActionStop) | **POST** /node/services/liagent?action&#x3D;stop | Restart, start or stop the liagent service
[**createMigrationCoordinatorServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createMigrationCoordinatorServiceActionRestart) | **POST** /node/services/migration-coordinator?action&#x3D;restart | Restart, start or stop the migration coordinator service
[**createMigrationCoordinatorServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createMigrationCoordinatorServiceActionStart) | **POST** /node/services/migration-coordinator?action&#x3D;start | Restart, start or stop the migration coordinator service
[**createMigrationCoordinatorServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createMigrationCoordinatorServiceActionStop) | **POST** /node/services/migration-coordinator?action&#x3D;stop | Restart, start or stop the migration coordinator service
[**createNSXMessageBusServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNSXMessageBusServiceActionRestart) | **POST** /node/services/nsx-message-bus?action&#x3D;restart | Restart, start or stop the NSX Message Bus service
[**createNSXMessageBusServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNSXMessageBusServiceActionStart) | **POST** /node/services/nsx-message-bus?action&#x3D;start | Restart, start or stop the NSX Message Bus service
[**createNSXMessageBusServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNSXMessageBusServiceActionStop) | **POST** /node/services/nsx-message-bus?action&#x3D;stop | Restart, start or stop the NSX Message Bus service
[**createNTPServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNTPServiceActionRestart) | **POST** /node/services/ntp?action&#x3D;restart | Restart, start or stop the NTP service
[**createNTPServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNTPServiceActionStart) | **POST** /node/services/ntp?action&#x3D;start | Restart, start or stop the NTP service
[**createNTPServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNTPServiceActionStop) | **POST** /node/services/ntp?action&#x3D;stop | Restart, start or stop the NTP service
[**createNodeNetworkRoute**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNodeNetworkRoute) | **POST** /node/network/routes | Create node network route
[**createNodeStatsServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNodeStatsServiceActionRestart) | **POST** /node/services/node-stats?action&#x3D;restart | Restart, start or stop the NSX node-stats service
[**createNodeStatsServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNodeStatsServiceActionStart) | **POST** /node/services/node-stats?action&#x3D;start | Restart, start or stop the NSX node-stats service
[**createNodeStatsServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNodeStatsServiceActionStop) | **POST** /node/services/node-stats?action&#x3D;stop | Restart, start or stop the NSX node-stats service
[**createNsxUiServiceServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNsxUiServiceServiceActionRestart) | **POST** /node/services/ui-service?action&#x3D;restart | Restart, Start and Stop the ui service
[**createNsxUiServiceServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNsxUiServiceServiceActionStart) | **POST** /node/services/ui-service?action&#x3D;start | Restart, Start and Stop the ui service
[**createNsxUiServiceServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNsxUiServiceServiceActionStop) | **POST** /node/services/ui-service?action&#x3D;stop | Restart, Start and Stop the ui service
[**createNsxUpgradeAgentServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNsxUpgradeAgentServiceActionRestart) | **POST** /node/services/nsx-upgrade-agent?action&#x3D;restart | Restart, start or stop the NSX upgrade agent service
[**createNsxUpgradeAgentServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNsxUpgradeAgentServiceActionStart) | **POST** /node/services/nsx-upgrade-agent?action&#x3D;start | Restart, start or stop the NSX upgrade agent service
[**createNsxUpgradeAgentServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createNsxUpgradeAgentServiceActionStop) | **POST** /node/services/nsx-upgrade-agent?action&#x3D;stop | Restart, start or stop the NSX upgrade agent service
[**createPhonehomeCoordinatorServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createPhonehomeCoordinatorServiceActionRestart) | **POST** /node/services/telemetry?action&#x3D;restart | Restart, start or stop Telemetry service
[**createPhonehomeCoordinatorServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createPhonehomeCoordinatorServiceActionStart) | **POST** /node/services/telemetry?action&#x3D;start | Restart, start or stop Telemetry service
[**createPhonehomeCoordinatorServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createPhonehomeCoordinatorServiceActionStop) | **POST** /node/services/telemetry?action&#x3D;stop | Restart, start or stop Telemetry service
[**createPlatformClientServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createPlatformClientServiceActionRestart) | **POST** /node/services/nsx-platform-client?action&#x3D;restart | Restart, start or stop the NSX Platform Client service
[**createPlatformClientServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createPlatformClientServiceActionStart) | **POST** /node/services/nsx-platform-client?action&#x3D;start | Restart, start or stop the NSX Platform Client service
[**createPlatformClientServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createPlatformClientServiceActionStop) | **POST** /node/services/nsx-platform-client?action&#x3D;stop | Restart, start or stop the NSX Platform Client service
[**createPolicyServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createPolicyServiceActionRestart) | **POST** /node/services/policy?action&#x3D;restart | Restart, start or stop the service
[**createPolicyServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createPolicyServiceActionStart) | **POST** /node/services/policy?action&#x3D;start | Restart, start or stop the service
[**createPolicyServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createPolicyServiceActionStop) | **POST** /node/services/policy?action&#x3D;stop | Restart, start or stop the service
[**createProtonServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createProtonServiceActionRestart) | **POST** /node/services/manager?action&#x3D;restart | Restart, start or stop the service
[**createProtonServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createProtonServiceActionStart) | **POST** /node/services/manager?action&#x3D;start | Restart, start or stop the service
[**createProtonServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createProtonServiceActionStop) | **POST** /node/services/manager?action&#x3D;stop | Restart, start or stop the service
[**createProxyServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createProxyServiceActionRestart) | **POST** /node/services/http?action&#x3D;restart | Restart the http service
[**createProxyServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createProxyServiceActionStart) | **POST** /node/services/http?action&#x3D;start | Start the http service
[**createProxyServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createProxyServiceActionStop) | **POST** /node/services/http?action&#x3D;stop | Stop the http service
[**createProxyServiceApplyCertificateActionApplyCertificate**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createProxyServiceApplyCertificateActionApplyCertificate) | **POST** /node/services/http?action&#x3D;apply_certificate | Update http service certificate
[**createRabbitMQServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createRabbitMQServiceActionRestart) | **POST** /node/services/mgmt-plane-bus?action&#x3D;restart | Restart, start or stop the Rabbit MQ service
[**createRabbitMQServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createRabbitMQServiceActionStart) | **POST** /node/services/mgmt-plane-bus?action&#x3D;start | Restart, start or stop the Rabbit MQ service
[**createRabbitMQServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createRabbitMQServiceActionStop) | **POST** /node/services/mgmt-plane-bus?action&#x3D;stop | Restart, start or stop the Rabbit MQ service
[**createRemoteDirectoryCreateRemoteDirectory**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createRemoteDirectoryCreateRemoteDirectory) | **POST** /node/file-store?action&#x3D;create_remote_directory | Create directory in remote file server
[**createRepositoryServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createRepositoryServiceActionRestart) | **POST** /node/services/install-upgrade?action&#x3D;restart | Restart, start or stop the NSX install-upgrade service
[**createRepositoryServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createRepositoryServiceActionStart) | **POST** /node/services/install-upgrade?action&#x3D;start | Restart, start or stop the NSX install-upgrade service
[**createRepositoryServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createRepositoryServiceActionStop) | **POST** /node/services/install-upgrade?action&#x3D;stop | Restart, start or stop the NSX install-upgrade service
[**createSNMPServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSNMPServiceActionRestart) | **POST** /node/services/snmp?action&#x3D;restart | Restart, start or stop the SNMP service
[**createSNMPServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSNMPServiceActionStart) | **POST** /node/services/snmp?action&#x3D;start | Restart, start or stop the SNMP service
[**createSNMPServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSNMPServiceActionStop) | **POST** /node/services/snmp?action&#x3D;stop | Restart, start or stop the SNMP service
[**createSSHServiceActionNotifyMpaRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSSHServiceActionNotifyMpaRestart) | **POST** /node/services/ssh/notify_mpa?action&#x3D;restart | Restart, start or stop the ssh service
[**createSSHServiceActionNotifyMpaStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSSHServiceActionNotifyMpaStart) | **POST** /node/services/ssh/notify_mpa?action&#x3D;start | Restart, start or stop the ssh service
[**createSSHServiceActionNotifyMpaStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSSHServiceActionNotifyMpaStop) | **POST** /node/services/ssh/notify_mpa?action&#x3D;stop | Restart, start or stop the ssh service
[**createSSHServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSSHServiceActionRestart) | **POST** /node/services/ssh?action&#x3D;restart | Restart, start or stop the ssh service
[**createSSHServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSSHServiceActionStart) | **POST** /node/services/ssh?action&#x3D;start | Restart, start or stop the ssh service
[**createSSHServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSSHServiceActionStop) | **POST** /node/services/ssh?action&#x3D;stop | Restart, start or stop the ssh service
[**createSSHServiceRemoveHostFingerprintActionRemoveHostFingerprint**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSSHServiceRemoveHostFingerprintActionRemoveHostFingerprint) | **POST** /node/services/ssh?action&#x3D;remove_host_fingerprint | Remove a host&#x27;s fingerprint from known hosts file
[**createSearchServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSearchServiceActionRestart) | **POST** /node/services/search?action&#x3D;restart | Restart, start or stop the NSX Search service
[**createSearchServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSearchServiceActionStart) | **POST** /node/services/search?action&#x3D;start | Restart, start or stop the NSX Search service
[**createSearchServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSearchServiceActionStop) | **POST** /node/services/search?action&#x3D;stop | Restart, start or stop the NSX Search service
[**createSyslogServiceActionRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSyslogServiceActionRestart) | **POST** /node/services/syslog?action&#x3D;restart | Restart, start or stop the syslog service
[**createSyslogServiceActionStart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSyslogServiceActionStart) | **POST** /node/services/syslog?action&#x3D;start | Restart, start or stop the syslog service
[**createSyslogServiceActionStop**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#createSyslogServiceActionStop) | **POST** /node/services/syslog?action&#x3D;stop | Restart, start or stop the syslog service
[**dELETERabbitMQManagementPort**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#dELETERabbitMQManagementPort) | **DELETE** /node/rabbitmq-management-port | Delete RabbitMQ management port
[**deleteApplianceManagementTask**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#deleteApplianceManagementTask) | **DELETE** /node/tasks/{task-id} | Delete task
[**deleteFile**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#deleteFile) | **DELETE** /node/file-store/{file-name} | Delete file
[**deleteNodeNetworkRoute**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#deleteNodeNetworkRoute) | **DELETE** /node/network/routes/{route-id} | Delete node network route
[**deleteNodeSyslogExporter**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#deleteNodeSyslogExporter) | **DELETE** /node/services/syslog/exporters/{exporter-name} | Delete node syslog exporter
[**deleteNodeUserSshKeyRemoveSshKey**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#deleteNodeUserSshKeyRemoveSshKey) | **POST** /node/users/{userid}/ssh-keys?action&#x3D;remove_ssh_key | Remove SSH public key from authorized_keys file for node user
[**deleteSupportBundlesAsyncResponseDeleteAsyncResponse**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#deleteSupportBundlesAsyncResponseDeleteAsyncResponse) | **POST** /administration/support-bundles?action&#x3D;delete_async_response | Delete existing support bundles waiting to be downloaded
[**getControllerProfilerStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#getControllerProfilerStatus) | **GET** /node/services/controller/profiler | Get the status (Enabled/Disabled) of controller profiler
[**getNodeMandatoryAccessControl**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#getNodeMandatoryAccessControl) | **GET** /node/hardening-policy/mandatory-access-control | Gets the enable status for Mandatory Access Control
[**getNodeMandatoryAccessControlReport**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#getNodeMandatoryAccessControlReport) | **GET** /node/hardening-policy/mandatory-access-control/report | Get the report for Mandatory Access Control
[**invokeDeleteClusterCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokeDeleteClusterCentralAPI) | **DELETE** /cluster/{target-node-id}/{target-uri} | Invoke DELETE request on target cluster node
[**invokeDeleteFabricCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokeDeleteFabricCentralAPI) | **DELETE** /fabric/nodes/{target-node-id}/{target-uri} | Invoke DELETE request on target fabric node
[**invokeDeleteTransportNodeCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokeDeleteTransportNodeCentralAPI) | **DELETE** /transport-nodes/{target-node-id}/{target-uri} | Invoke DELETE request on target transport node
[**invokeGetClusterCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokeGetClusterCentralAPI) | **GET** /cluster/{target-node-id}/{target-uri} | Invoke GET request on target cluster node
[**invokeGetFabricCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokeGetFabricCentralAPI) | **GET** /fabric/nodes/{target-node-id}/{target-uri} | Invoke GET request on target fabric node
[**invokeGetTransportNodeCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokeGetTransportNodeCentralAPI) | **GET** /transport-nodes/{target-node-id}/{target-uri} | Invoke GET request on target transport node
[**invokePostClusterCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokePostClusterCentralAPI) | **POST** /cluster/{target-node-id}/{target-uri} | Invoke POST request on target cluster node
[**invokePostFabricCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokePostFabricCentralAPI) | **POST** /fabric/nodes/{target-node-id}/{target-uri} | Invoke POST request on target fabric node
[**invokePostTransportNodeCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokePostTransportNodeCentralAPI) | **POST** /transport-nodes/{target-node-id}/{target-uri} | Invoke POST request on target transport node
[**invokePutClusterCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokePutClusterCentralAPI) | **PUT** /cluster/{target-node-id}/{target-uri} | Invoke PUT request on target cluster node
[**invokePutFabricCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokePutFabricCentralAPI) | **PUT** /fabric/nodes/{target-node-id}/{target-uri} | Invoke PUT request on target fabric node
[**invokePutTransportNodeCentralAPI**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#invokePutTransportNodeCentralAPI) | **PUT** /transport-nodes/{target-node-id}/{target-uri} | Invoke PUT request on target transport node
[**listApplianceManagementTasks**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#listApplianceManagementTasks) | **GET** /node/tasks | List appliance management tasks
[**listFiles**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#listFiles) | **GET** /node/file-store | List node files
[**listNodeInterfaces**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#listNodeInterfaces) | **GET** /node/network/interfaces | List the NSX Manager&#x27;s Network Interfaces
[**listNodeNetworkRoutes**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#listNodeNetworkRoutes) | **GET** /node/network/routes | List node network routes
[**listNodeProcesses**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#listNodeProcesses) | **GET** /node/processes | List node processes
[**listNodeServices**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#listNodeServices) | **GET** /node/services | List node services
[**listNodeSyslogExporters**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#listNodeSyslogExporters) | **GET** /node/services/syslog/exporters | List node syslog exporters
[**listNodeUserSshKeys**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#listNodeUserSshKeys) | **GET** /node/users/{userid}/ssh-keys | List SSH keys from authorized_keys file for node user
[**listNodeUsers**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#listNodeUsers) | **GET** /node/users | List node users
[**postNodeSyslogExporter**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#postNodeSyslogExporter) | **POST** /node/services/syslog/exporters | Add node syslog exporter
[**readApplianceManagementService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readApplianceManagementService) | **GET** /node/services/node-mgmt | Read appliance management service properties
[**readApplianceManagementServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readApplianceManagementServiceStatus) | **GET** /node/services/node-mgmt/status | Read appliance management service status
[**readApplianceManagementTaskProperties**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readApplianceManagementTaskProperties) | **GET** /node/tasks/{task-id} | Read task properties
[**readApplianceNodeStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readApplianceNodeStatus) | **GET** /node/status | Read node status
[**readAsyncApplianceManagementTaskResponse**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readAsyncApplianceManagementTaskResponse) | **GET** /node/tasks/{task-id}/response | Read asynchronous task response
[**readAuthProviderVidm**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readAuthProviderVidm) | **GET** /node/aaa/providers/vidm | Read AAA provider vIDM properties
[**readAuthProviderVidmStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readAuthProviderVidmStatus) | **GET** /node/aaa/providers/vidm/status | Read AAA provider vIDM status
[**readClusterBootManagerService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readClusterBootManagerService) | **GET** /node/services/cluster_manager | Read cluster boot manager service properties
[**readClusterBootManagerServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readClusterBootManagerServiceStatus) | **GET** /node/services/cluster_manager/status | Read cluster boot manager service status
[**readCminventoryService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readCminventoryService) | **GET** /node/services/cm-inventory | Read cm inventory service properties
[**readCminventoryServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readCminventoryServiceStatus) | **GET** /node/services/cm-inventory/status | Read manager service status
[**readControllerServerCertificate**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readControllerServerCertificate) | **GET** /node/services/controller/controller-certificate | Read controller server certificate properties
[**readControllerServerService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readControllerServerService) | **GET** /node/services/controller | Read controller service properties
[**readControllerServerServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readControllerServerServiceStatus) | **GET** /node/services/controller/status | Read controller service status
[**readFile**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readFile) | **GET** /node/file-store/{file-name}/data | Read file contents
[**readFileProperties**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readFileProperties) | **GET** /node/file-store/{file-name} | Read file properties
[**readFileThumbprint**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readFileThumbprint) | **GET** /node/file-store/{file-name}/thumbprint | Read file thumbprint
[**readLiagentService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readLiagentService) | **GET** /node/services/liagent | Read liagent service properties
[**readLiagentServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readLiagentServiceStatus) | **GET** /node/services/liagent/status | Read liagent service status
[**readMigrationCoordinatorService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readMigrationCoordinatorService) | **GET** /node/services/migration-coordinator | Read migration coordinator service properties
[**readMigrationCoordinatorServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readMigrationCoordinatorServiceStatus) | **GET** /node/services/migration-coordinator/status | Read migration coordinator service status
[**readNSXMessageBusService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNSXMessageBusService) | **GET** /node/services/nsx-message-bus | Read NSX Message Bus service properties
[**readNSXMessageBusServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNSXMessageBusServiceStatus) | **GET** /node/services/nsx-message-bus/status | Read NSX Message Bus service status
[**readNTPService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNTPService) | **GET** /node/services/ntp | Read NTP service properties
[**readNTPServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNTPServiceStatus) | **GET** /node/services/ntp/status | Read NTP service status
[**readNetworkInterfaceStatistics**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNetworkInterfaceStatistics) | **GET** /node/network/interfaces/{interface-id}/stats | Read the NSX Manager&#x27;s Network Interface Statistics
[**readNetworkProperties**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNetworkProperties) | **GET** /node/network | Read network configuration properties
[**readNodeInterface**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeInterface) | **GET** /node/network/interfaces/{interface-id} | Read the NSX Manager&#x27;s Network Interface
[**readNodeNameServers**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeNameServers) | **GET** /node/network/name-servers | Read the NSX Manager&#x27;s Name Servers
[**readNodeNetworkRoute**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeNetworkRoute) | **GET** /node/network/routes/{route-id} | Read node network route
[**readNodeProcess**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeProcess) | **GET** /node/processes/{process-id} | Read node process
[**readNodeProperties**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeProperties) | **GET** /node | Read node properties
[**readNodeSearchDomains**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeSearchDomains) | **GET** /node/network/search-domains | Read the NSX Manager&#x27;s Search Domains
[**readNodeStatsService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeStatsService) | **GET** /node/services/node-stats | Read NSX node-stats service properties
[**readNodeStatsServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeStatsServiceStatus) | **GET** /node/services/node-stats/status | Read NSX node-stats service status
[**readNodeSupportBundle**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeSupportBundle) | **GET** /node/support-bundle | Read node support bundle
[**readNodeSyslogExporter**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeSyslogExporter) | **GET** /node/services/syslog/exporters/{exporter-name} | Read node syslog exporter
[**readNodeUser**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeUser) | **GET** /node/users/{userid} | Read node user
[**readNodeVersion**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNodeVersion) | **GET** /node/version | Read node version
[**readNsxUiServiceService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNsxUiServiceService) | **GET** /node/services/ui-service | Read ui service properties
[**readNsxUiServiceServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNsxUiServiceServiceStatus) | **GET** /node/services/ui-service/status | Read ui service status
[**readNsxUpgradeAgentService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNsxUpgradeAgentService) | **GET** /node/services/nsx-upgrade-agent | Read NSX upgrade Agent service properties
[**readNsxUpgradeAgentServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readNsxUpgradeAgentServiceStatus) | **GET** /node/services/nsx-upgrade-agent/status | Read Nsx upgrade agent service status
[**readPhonehomeCoordinatorService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readPhonehomeCoordinatorService) | **GET** /node/services/telemetry | Read Telemetry service properties
[**readPhonehomeCoordinatorServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readPhonehomeCoordinatorServiceStatus) | **GET** /node/services/telemetry/status | Read Telemetry service status
[**readPlatformClientService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readPlatformClientService) | **GET** /node/services/nsx-platform-client | Read NSX Platform Client service properties
[**readPlatformClientServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readPlatformClientServiceStatus) | **GET** /node/services/nsx-platform-client/status | Read NSX Platform Client service status
[**readPolicyService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readPolicyService) | **GET** /node/services/policy | Read service properties
[**readPolicyServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readPolicyServiceStatus) | **GET** /node/services/policy/status | Read service status
[**readProtonService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readProtonService) | **GET** /node/services/manager | Read service properties
[**readProtonServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readProtonServiceStatus) | **GET** /node/services/manager/status | Read service status
[**readProxyService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readProxyService) | **GET** /node/services/http | Read http service properties
[**readProxyServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readProxyServiceStatus) | **GET** /node/services/http/status | Read http service status
[**readRabbitMQService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readRabbitMQService) | **GET** /node/services/mgmt-plane-bus | Read Rabbit MQ service properties
[**readRabbitMQServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readRabbitMQServiceStatus) | **GET** /node/services/mgmt-plane-bus/status | Read Rabbit MQ service status
[**readRepositoryService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readRepositoryService) | **GET** /node/services/install-upgrade | Read NSX install-upgrade service properties
[**readRepositoryServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readRepositoryServiceStatus) | **GET** /node/services/install-upgrade/status | Read NSX install-upgrade service status
[**readSNMPService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readSNMPService) | **GET** /node/services/snmp | Read SNMP service properties
[**readSNMPServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readSNMPServiceStatus) | **GET** /node/services/snmp/status | Read SNMP service status
[**readSNMPV3EngineID**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readSNMPV3EngineID) | **GET** /node/services/snmp/v3-engine-id | Read SNMP V3 Engine ID
[**readSSHService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readSSHService) | **GET** /node/services/ssh | Read ssh service properties
[**readSSHServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readSSHServiceStatus) | **GET** /node/services/ssh/status | Read ssh service status
[**readSearchService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readSearchService) | **GET** /node/services/search | Read NSX Search service properties
[**readSearchServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readSearchServiceStatus) | **GET** /node/services/search/status | Read NSX Search service status
[**readSyslogService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readSyslogService) | **GET** /node/services/syslog | Read syslog service properties
[**readSyslogServiceStatus**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#readSyslogServiceStatus) | **GET** /node/services/syslog/status | Read syslog service status
[**resetPolicyServiceLoggingLevelActionResetManagerLoggingLevels**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#resetPolicyServiceLoggingLevelActionResetManagerLoggingLevels) | **POST** /node/services/policy?action&#x3D;reset-manager-logging-levels | Reset the logging levels to default values
[**resetProtonServiceLoggingLevelActionResetManagerLoggingLevels**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#resetProtonServiceLoggingLevelActionResetManagerLoggingLevels) | **POST** /node/services/manager?action&#x3D;reset-manager-logging-levels | Reset the logging levels to default values
[**restartOrShutdownNodeRestart**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#restartOrShutdownNodeRestart) | **POST** /node?action&#x3D;restart | Restart or shutdown node
[**restartOrShutdownNodeShutdown**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#restartOrShutdownNodeShutdown) | **POST** /node?action&#x3D;shutdown | Restart or shutdown node
[**setControllerProfiler**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#setControllerProfiler) | **PUT** /node/services/controller/profiler | Enable or disable controller profiler
[**setNodeMandatoryAccessControl**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#setNodeMandatoryAccessControl) | **PUT** /node/hardening-policy/mandatory-access-control | Enable or disable  Mandatory Access Control
[**setRabbitMQManagementPort**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#setRabbitMQManagementPort) | **POST** /node/rabbitmq-management-port | Set RabbitMQ management port
[**updateApplianceNodeStatusClearBootupError**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateApplianceNodeStatusClearBootupError) | **POST** /node/status?action&#x3D;clear_bootup_error | Update node status
[**updateAuthProviderVidm**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateAuthProviderVidm) | **PUT** /node/aaa/providers/vidm | Update AAA provider vIDM properties
[**updateFile**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateFile) | **PUT** /node/file-store/{file-name}/data | Replace file contents
[**updateNTPService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateNTPService) | **PUT** /node/services/ntp | Update NTP service properties
[**updateNodeInterface**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateNodeInterface) | **PUT** /node/network/interfaces/{interface-id} | Update the NSX Manager&#x27;s Network Interface
[**updateNodeNameServers**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateNodeNameServers) | **PUT** /node/network/name-servers | Update the NSX Manager&#x27;s Name Servers
[**updateNodeProperties**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateNodeProperties) | **PUT** /node | Update node properties
[**updateNodeSearchDomains**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateNodeSearchDomains) | **PUT** /node/network/search-domains | Update the NSX Manager&#x27;s Search Domains
[**updateNodeUser**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateNodeUser) | **PUT** /node/users/{userid} | Update node user
[**updatePolicyService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updatePolicyService) | **PUT** /node/services/policy | Update service properties
[**updateProtonService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateProtonService) | **PUT** /node/services/manager | Update service properties
[**updateProxyService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateProxyService) | **PUT** /node/services/http | Update http service properties
[**updateRepositoryService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateRepositoryService) | **PUT** /node/services/install-upgrade | Update NSX install-upgrade service properties
[**updateSNMPService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateSNMPService) | **PUT** /node/services/snmp | Update SNMP service properties
[**updateSNMPV3EngineID**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateSNMPV3EngineID) | **PUT** /node/services/snmp/v3-engine-id | Update SNMP V3 Engine ID
[**updateSSHService**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateSSHService) | **PUT** /node/services/ssh | Update ssh service properties
[**updateUcState**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#updateUcState) | **PUT** /node/services/install-upgrade/uc-state | Update UC state properties
[**verifyNodeSyslogExporterVerify**](ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi.md#verifyNodeSyslogExporterVerify) | **POST** /node/services/syslog/exporters?action&#x3D;verify | Verify node syslog exporter

<a name="addNodeUserSshKeyAddSshKey"></a>
# **addNodeUserSshKeyAddSshKey**
> addNodeUserSshKeyAddSshKey(body, userid)

Add SSH public key to authorized_keys file for node user

Add SSH public key to authorized_keys file for node user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
SshKeyProperties body = new SshKeyProperties(); // SshKeyProperties | 
String userid = "userid_example"; // String | User id of the user
try {
    apiInstance.addNodeUserSshKeyAddSshKey(body, userid);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#addNodeUserSshKeyAddSshKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SshKeyProperties**](SshKeyProperties.md)|  |
 **userid** | **String**| User id of the user |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelApplianceManagementTaskCancel"></a>
# **cancelApplianceManagementTaskCancel**
> cancelApplianceManagementTaskCancel(taskId)

Cancel specified task

Cancel specified task

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String taskId = "taskId_example"; // String | ID of task to delete
try {
    apiInstance.cancelApplianceManagementTaskCancel(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#cancelApplianceManagementTaskCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| ID of task to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="checkRabbitMQManagementPort"></a>
# **checkRabbitMQManagementPort**
> PortStatus checkRabbitMQManagementPort()

Check if RabbitMQ management port is enabled or not

Returns status as true if RabbitMQ management port is enabled else false

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    PortStatus result = apiInstance.checkRabbitMQManagementPort();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#checkRabbitMQManagementPort");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PortStatus**](PortStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectAlarms"></a>
# **collectAlarms**
> AlarmListResult collectAlarms(cursor, fields, pageSize)

Collect alarms from all NSX nodes

This API is executed on a manager node to return current alarms from all NSX nodes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
Long cursor = 789L; // Long | Opaque cursor to be used for getting next page of records (supplied by current result page)
String fields = "fields_example"; // String | Fields to include in query results
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
try {
    AlarmListResult result = apiInstance.collectAlarms(cursor, fields, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#collectAlarms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **Long**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **fields** | **String**| Fields to include in query results | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]

### Return type

[**AlarmListResult**](AlarmListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectAuditLogs"></a>
# **collectAuditLogs**
> AuditLogListResult collectAuditLogs(body, cursor, fields, pageSize)

Collect audit logs from registered manager nodes

This API is executed on a manager node to display audit logs from all nodes inside the management plane cluster. An audit log collection will be triggered if the local master audit log is outdated. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
AuditLogRequest body = new AuditLogRequest(); // AuditLogRequest | 
Long cursor = 789L; // Long | Opaque cursor to be used for getting next page of records (supplied by current result page)
String fields = "fields_example"; // String | Fields to include in query results
Long pageSize = 789L; // Long | Maximum number of results to return in this page (server may return fewer)
try {
    AuditLogListResult result = apiInstance.collectAuditLogs(body, cursor, fields, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#collectAuditLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditLogRequest**](AuditLogRequest.md)|  |
 **cursor** | **Long**| Opaque cursor to be used for getting next page of records (supplied by current result page) | [optional]
 **fields** | **String**| Fields to include in query results | [optional]
 **pageSize** | **Long**| Maximum number of results to return in this page (server may return fewer) | [optional] [enum: ]

### Return type

[**AuditLogListResult**](AuditLogListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="collectSupportBundlesCollect"></a>
# **collectSupportBundlesCollect**
> SupportBundleResult collectSupportBundlesCollect(body, overrideAsyncResponse, requireDeleteOrOverrideAsyncResponse)

Collect support bundles from registered cluster and fabric nodes

Collect support bundles from registered cluster and fabric nodes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
SupportBundleRequest body = new SupportBundleRequest(); // SupportBundleRequest | 
Boolean overrideAsyncResponse = true; // Boolean | Override any existing support bundle async response
Boolean requireDeleteOrOverrideAsyncResponse = true; // Boolean | Suppress auto-deletion of generated support bundle
try {
    SupportBundleResult result = apiInstance.collectSupportBundlesCollect(body, overrideAsyncResponse, requireDeleteOrOverrideAsyncResponse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#collectSupportBundlesCollect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SupportBundleRequest**](SupportBundleRequest.md)|  |
 **overrideAsyncResponse** | **Boolean**| Override any existing support bundle async response | [optional]
 **requireDeleteOrOverrideAsyncResponse** | **Boolean**| Suppress auto-deletion of generated support bundle | [optional]

### Return type

[**SupportBundleResult**](SupportBundleResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/octet-stream

<a name="copyFromRemoteFileCopyFromRemoteFile"></a>
# **copyFromRemoteFileCopyFromRemoteFile**
> FileProperties copyFromRemoteFileCopyFromRemoteFile(body, fileName)

Copy a remote file to the file store

Copy a remote file to the file store. If you use scp or sftp, you must provide the remote server&#x27;s SSH fingerprint. See the &lt;i&gt;NSX-T Administration Guide&lt;/i&gt; for information and instructions about finding the SSH fingerprint. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
CopyFromRemoteFileProperties body = new CopyFromRemoteFileProperties(); // CopyFromRemoteFileProperties | 
String fileName = "fileName_example"; // String | Destination filename
try {
    FileProperties result = apiInstance.copyFromRemoteFileCopyFromRemoteFile(body, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#copyFromRemoteFileCopyFromRemoteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CopyFromRemoteFileProperties**](CopyFromRemoteFileProperties.md)|  |
 **fileName** | **String**| Destination filename |

### Return type

[**FileProperties**](FileProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyToRemoteFileCopyToRemoteFile"></a>
# **copyToRemoteFileCopyToRemoteFile**
> copyToRemoteFileCopyToRemoteFile(body, fileName)

Copy file in the file store to a remote file store

Copy a file in the file store to a remote server. If you use scp or sftp, you must provide the remote server&#x27;s SSH fingerprint. See the &lt;i&gt;NSX-T Administration Guide&lt;/i&gt; for information and instructions about finding the SSH fingerprint. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
CopyToRemoteFileProperties body = new CopyToRemoteFileProperties(); // CopyToRemoteFileProperties | 
String fileName = "fileName_example"; // String | Destination filename
try {
    apiInstance.copyToRemoteFileCopyToRemoteFile(body, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#copyToRemoteFileCopyToRemoteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CopyToRemoteFileProperties**](CopyToRemoteFileProperties.md)|  |
 **fileName** | **String**| Destination filename |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createApplianceManagementServiceActionRestart"></a>
# **createApplianceManagementServiceActionRestart**
> createApplianceManagementServiceActionRestart()

Restart the node management service

Restart the node management service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.createApplianceManagementServiceActionRestart();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createApplianceManagementServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createClusterBootManagerServiceActionRestart"></a>
# **createClusterBootManagerServiceActionRestart**
> NodeServiceStatusProperties createClusterBootManagerServiceActionRestart()

Restart, start or stop the cluster boot manager service

Restart, start or stop the cluster boot manager service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createClusterBootManagerServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createClusterBootManagerServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createClusterBootManagerServiceActionStart"></a>
# **createClusterBootManagerServiceActionStart**
> NodeServiceStatusProperties createClusterBootManagerServiceActionStart()

Restart, start or stop the cluster boot manager service

Restart, start or stop the cluster boot manager service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createClusterBootManagerServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createClusterBootManagerServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createClusterBootManagerServiceActionStop"></a>
# **createClusterBootManagerServiceActionStop**
> NodeServiceStatusProperties createClusterBootManagerServiceActionStop()

Restart, start or stop the cluster boot manager service

Restart, start or stop the cluster boot manager service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createClusterBootManagerServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createClusterBootManagerServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCminventoryServiceActionRestart"></a>
# **createCminventoryServiceActionRestart**
> NodeServiceStatusProperties createCminventoryServiceActionRestart()

Restart, start or stop the manager service

Restart, start or stop the manager service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createCminventoryServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createCminventoryServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCminventoryServiceActionStart"></a>
# **createCminventoryServiceActionStart**
> NodeServiceStatusProperties createCminventoryServiceActionStart()

Restart, start or stop the manager service

Restart, start or stop the manager service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createCminventoryServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createCminventoryServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createCminventoryServiceActionStop"></a>
# **createCminventoryServiceActionStop**
> NodeServiceStatusProperties createCminventoryServiceActionStop()

Restart, start or stop the manager service

Restart, start or stop the manager service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createCminventoryServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createCminventoryServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createControllerServerServiceActionRestart"></a>
# **createControllerServerServiceActionRestart**
> NodeServiceStatusProperties createControllerServerServiceActionRestart()

Restart, start or stop the controller service

Restart, start or stop the controller service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createControllerServerServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createControllerServerServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createControllerServerServiceActionStart"></a>
# **createControllerServerServiceActionStart**
> NodeServiceStatusProperties createControllerServerServiceActionStart()

Restart, start or stop the controller service

Restart, start or stop the controller service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createControllerServerServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createControllerServerServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createControllerServerServiceActionStop"></a>
# **createControllerServerServiceActionStop**
> NodeServiceStatusProperties createControllerServerServiceActionStop()

Restart, start or stop the controller service

Restart, start or stop the controller service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createControllerServerServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createControllerServerServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFile"></a>
# **createFile**
> FileProperties createFile(fileName)

Upload a file to the file store

When you issue this API, the client must specify: - HTTP header Content-Type:application/octet-stream. - Request body with the contents of the file in the filestore. In the CLI, you can view the filestore with the &lt;em&gt;get files&lt;/em&gt; command. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String fileName = "fileName_example"; // String | Destination filename
try {
    FileProperties result = apiInstance.createFile(fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Destination filename |

### Return type

[**FileProperties**](FileProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLiagentServiceActionRestart"></a>
# **createLiagentServiceActionRestart**
> NodeServiceStatusProperties createLiagentServiceActionRestart()

Restart, start or stop the liagent service

Restart, start or stop the liagent service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createLiagentServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createLiagentServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLiagentServiceActionStart"></a>
# **createLiagentServiceActionStart**
> NodeServiceStatusProperties createLiagentServiceActionStart()

Restart, start or stop the liagent service

Restart, start or stop the liagent service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createLiagentServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createLiagentServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLiagentServiceActionStop"></a>
# **createLiagentServiceActionStop**
> NodeServiceStatusProperties createLiagentServiceActionStop()

Restart, start or stop the liagent service

Restart, start or stop the liagent service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createLiagentServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createLiagentServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMigrationCoordinatorServiceActionRestart"></a>
# **createMigrationCoordinatorServiceActionRestart**
> NodeServiceStatusProperties createMigrationCoordinatorServiceActionRestart()

Restart, start or stop the migration coordinator service

Restart, start or stop the migration coordinator service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createMigrationCoordinatorServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createMigrationCoordinatorServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMigrationCoordinatorServiceActionStart"></a>
# **createMigrationCoordinatorServiceActionStart**
> NodeServiceStatusProperties createMigrationCoordinatorServiceActionStart()

Restart, start or stop the migration coordinator service

Restart, start or stop the migration coordinator service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createMigrationCoordinatorServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createMigrationCoordinatorServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMigrationCoordinatorServiceActionStop"></a>
# **createMigrationCoordinatorServiceActionStop**
> NodeServiceStatusProperties createMigrationCoordinatorServiceActionStop()

Restart, start or stop the migration coordinator service

Restart, start or stop the migration coordinator service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createMigrationCoordinatorServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createMigrationCoordinatorServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNSXMessageBusServiceActionRestart"></a>
# **createNSXMessageBusServiceActionRestart**
> NodeServiceStatusProperties createNSXMessageBusServiceActionRestart()

Restart, start or stop the NSX Message Bus service

Restart, start or stop the NSX Message Bus service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNSXMessageBusServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNSXMessageBusServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNSXMessageBusServiceActionStart"></a>
# **createNSXMessageBusServiceActionStart**
> NodeServiceStatusProperties createNSXMessageBusServiceActionStart()

Restart, start or stop the NSX Message Bus service

Restart, start or stop the NSX Message Bus service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNSXMessageBusServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNSXMessageBusServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNSXMessageBusServiceActionStop"></a>
# **createNSXMessageBusServiceActionStop**
> NodeServiceStatusProperties createNSXMessageBusServiceActionStop()

Restart, start or stop the NSX Message Bus service

Restart, start or stop the NSX Message Bus service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNSXMessageBusServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNSXMessageBusServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNTPServiceActionRestart"></a>
# **createNTPServiceActionRestart**
> NodeServiceStatusProperties createNTPServiceActionRestart()

Restart, start or stop the NTP service

Restart, start or stop the NTP service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNTPServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNTPServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNTPServiceActionStart"></a>
# **createNTPServiceActionStart**
> NodeServiceStatusProperties createNTPServiceActionStart()

Restart, start or stop the NTP service

Restart, start or stop the NTP service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNTPServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNTPServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNTPServiceActionStop"></a>
# **createNTPServiceActionStop**
> NodeServiceStatusProperties createNTPServiceActionStop()

Restart, start or stop the NTP service

Restart, start or stop the NTP service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNTPServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNTPServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNodeNetworkRoute"></a>
# **createNodeNetworkRoute**
> NodeRouteProperties createNodeNetworkRoute(body)

Create node network route

Add a route to the NSX Manager routing table. For static routes, the route_type, interface_id, netmask, and destination are required parameters. For default routes, the route_type, gateway address, and interface_id are required. For blackhole routes, the route_type and destination are required. All other parameters are optional. When you add a static route, the scope and route_id are created automatically. When you add a default or blackhole route, the route_id is created automatically. The route_id is read-only, meaning that it cannot be modified. All other properties can be modified by deleting and readding the route. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeRouteProperties body = new NodeRouteProperties(); // NodeRouteProperties | 
try {
    NodeRouteProperties result = apiInstance.createNodeNetworkRoute(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNodeNetworkRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeRouteProperties**](NodeRouteProperties.md)|  |

### Return type

[**NodeRouteProperties**](NodeRouteProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNodeStatsServiceActionRestart"></a>
# **createNodeStatsServiceActionRestart**
> NodeServiceStatusProperties createNodeStatsServiceActionRestart()

Restart, start or stop the NSX node-stats service

Restart, start or stop the NSX node-stats service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNodeStatsServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNodeStatsServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNodeStatsServiceActionStart"></a>
# **createNodeStatsServiceActionStart**
> NodeServiceStatusProperties createNodeStatsServiceActionStart()

Restart, start or stop the NSX node-stats service

Restart, start or stop the NSX node-stats service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNodeStatsServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNodeStatsServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNodeStatsServiceActionStop"></a>
# **createNodeStatsServiceActionStop**
> NodeServiceStatusProperties createNodeStatsServiceActionStop()

Restart, start or stop the NSX node-stats service

Restart, start or stop the NSX node-stats service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNodeStatsServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNodeStatsServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNsxUiServiceServiceActionRestart"></a>
# **createNsxUiServiceServiceActionRestart**
> NodeServiceStatusProperties createNsxUiServiceServiceActionRestart()

Restart, Start and Stop the ui service

Restart, Start and Stop the ui service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNsxUiServiceServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNsxUiServiceServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNsxUiServiceServiceActionStart"></a>
# **createNsxUiServiceServiceActionStart**
> NodeServiceStatusProperties createNsxUiServiceServiceActionStart()

Restart, Start and Stop the ui service

Restart, Start and Stop the ui service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNsxUiServiceServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNsxUiServiceServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNsxUiServiceServiceActionStop"></a>
# **createNsxUiServiceServiceActionStop**
> NodeServiceStatusProperties createNsxUiServiceServiceActionStop()

Restart, Start and Stop the ui service

Restart, Start and Stop the ui service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNsxUiServiceServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNsxUiServiceServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNsxUpgradeAgentServiceActionRestart"></a>
# **createNsxUpgradeAgentServiceActionRestart**
> NodeServiceStatusProperties createNsxUpgradeAgentServiceActionRestart()

Restart, start or stop the NSX upgrade agent service

Restart, start or stop the NSX upgrade agent service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNsxUpgradeAgentServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNsxUpgradeAgentServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNsxUpgradeAgentServiceActionStart"></a>
# **createNsxUpgradeAgentServiceActionStart**
> NodeServiceStatusProperties createNsxUpgradeAgentServiceActionStart()

Restart, start or stop the NSX upgrade agent service

Restart, start or stop the NSX upgrade agent service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNsxUpgradeAgentServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNsxUpgradeAgentServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createNsxUpgradeAgentServiceActionStop"></a>
# **createNsxUpgradeAgentServiceActionStop**
> NodeServiceStatusProperties createNsxUpgradeAgentServiceActionStop()

Restart, start or stop the NSX upgrade agent service

Restart, start or stop the NSX upgrade agent service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createNsxUpgradeAgentServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createNsxUpgradeAgentServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPhonehomeCoordinatorServiceActionRestart"></a>
# **createPhonehomeCoordinatorServiceActionRestart**
> NodeServiceStatusProperties createPhonehomeCoordinatorServiceActionRestart()

Restart, start or stop Telemetry service

Restart, start or stop Telemetry service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createPhonehomeCoordinatorServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createPhonehomeCoordinatorServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPhonehomeCoordinatorServiceActionStart"></a>
# **createPhonehomeCoordinatorServiceActionStart**
> NodeServiceStatusProperties createPhonehomeCoordinatorServiceActionStart()

Restart, start or stop Telemetry service

Restart, start or stop Telemetry service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createPhonehomeCoordinatorServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createPhonehomeCoordinatorServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPhonehomeCoordinatorServiceActionStop"></a>
# **createPhonehomeCoordinatorServiceActionStop**
> NodeServiceStatusProperties createPhonehomeCoordinatorServiceActionStop()

Restart, start or stop Telemetry service

Restart, start or stop Telemetry service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createPhonehomeCoordinatorServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createPhonehomeCoordinatorServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPlatformClientServiceActionRestart"></a>
# **createPlatformClientServiceActionRestart**
> NodeServiceStatusProperties createPlatformClientServiceActionRestart()

Restart, start or stop the NSX Platform Client service

Restart, start or stop the NSX Platform Client service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createPlatformClientServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createPlatformClientServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPlatformClientServiceActionStart"></a>
# **createPlatformClientServiceActionStart**
> NodeServiceStatusProperties createPlatformClientServiceActionStart()

Restart, start or stop the NSX Platform Client service

Restart, start or stop the NSX Platform Client service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createPlatformClientServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createPlatformClientServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPlatformClientServiceActionStop"></a>
# **createPlatformClientServiceActionStop**
> NodeServiceStatusProperties createPlatformClientServiceActionStop()

Restart, start or stop the NSX Platform Client service

Restart, start or stop the NSX Platform Client service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createPlatformClientServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createPlatformClientServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPolicyServiceActionRestart"></a>
# **createPolicyServiceActionRestart**
> NodeServiceStatusProperties createPolicyServiceActionRestart()

Restart, start or stop the service

Restart, start or stop the service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createPolicyServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createPolicyServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPolicyServiceActionStart"></a>
# **createPolicyServiceActionStart**
> NodeServiceStatusProperties createPolicyServiceActionStart()

Restart, start or stop the service

Restart, start or stop the service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createPolicyServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createPolicyServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPolicyServiceActionStop"></a>
# **createPolicyServiceActionStop**
> NodeServiceStatusProperties createPolicyServiceActionStop()

Restart, start or stop the service

Restart, start or stop the service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createPolicyServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createPolicyServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProtonServiceActionRestart"></a>
# **createProtonServiceActionRestart**
> NodeServiceStatusProperties createProtonServiceActionRestart()

Restart, start or stop the service

Restart, start or stop the service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createProtonServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createProtonServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProtonServiceActionStart"></a>
# **createProtonServiceActionStart**
> NodeServiceStatusProperties createProtonServiceActionStart()

Restart, start or stop the service

Restart, start or stop the service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createProtonServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createProtonServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProtonServiceActionStop"></a>
# **createProtonServiceActionStop**
> NodeServiceStatusProperties createProtonServiceActionStop()

Restart, start or stop the service

Restart, start or stop the service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createProtonServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createProtonServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProxyServiceActionRestart"></a>
# **createProxyServiceActionRestart**
> createProxyServiceActionRestart()

Restart the http service

Restart the http service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.createProxyServiceActionRestart();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createProxyServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProxyServiceActionStart"></a>
# **createProxyServiceActionStart**
> NodeServiceStatusProperties createProxyServiceActionStart()

Start the http service

Start the http service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createProxyServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createProxyServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProxyServiceActionStop"></a>
# **createProxyServiceActionStop**
> createProxyServiceActionStop()

Stop the http service

Stop the http service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.createProxyServiceActionStop();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createProxyServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createProxyServiceApplyCertificateActionApplyCertificate"></a>
# **createProxyServiceApplyCertificateActionApplyCertificate**
> createProxyServiceApplyCertificateActionApplyCertificate(certificateId)

Update http service certificate

Applies a security certificate to the http service. In the POST request, the CERTIFICATE_ID references a certificate created with the /api/v1/trust-management APIs. Issuing this request causes the http service to restart so that the service can begin using the new certificate. When the POST request succeeds, it doesn&#x27;t return a valid response. The request times out because of the restart. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String certificateId = "certificateId_example"; // String | Certificate ID
try {
    apiInstance.createProxyServiceApplyCertificateActionApplyCertificate(certificateId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createProxyServiceApplyCertificateActionApplyCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateId** | **String**| Certificate ID |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRabbitMQServiceActionRestart"></a>
# **createRabbitMQServiceActionRestart**
> NodeServiceStatusProperties createRabbitMQServiceActionRestart()

Restart, start or stop the Rabbit MQ service

Restart, start or stop the Rabbit MQ service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createRabbitMQServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createRabbitMQServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRabbitMQServiceActionStart"></a>
# **createRabbitMQServiceActionStart**
> NodeServiceStatusProperties createRabbitMQServiceActionStart()

Restart, start or stop the Rabbit MQ service

Restart, start or stop the Rabbit MQ service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createRabbitMQServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createRabbitMQServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRabbitMQServiceActionStop"></a>
# **createRabbitMQServiceActionStop**
> NodeServiceStatusProperties createRabbitMQServiceActionStop()

Restart, start or stop the Rabbit MQ service

Restart, start or stop the Rabbit MQ service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createRabbitMQServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createRabbitMQServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRemoteDirectoryCreateRemoteDirectory"></a>
# **createRemoteDirectoryCreateRemoteDirectory**
> createRemoteDirectoryCreateRemoteDirectory(body)

Create directory in remote file server

Create a directory on the remote remote server. Supports only SFTP. You must provide the remote server&#x27;s SSH fingerprint. See the &lt;i&gt;NSX Administration Guide&lt;/i&gt; for information and instructions about finding the SSH fingerprint. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
CreateRemoteDirectoryProperties body = new CreateRemoteDirectoryProperties(); // CreateRemoteDirectoryProperties | 
try {
    apiInstance.createRemoteDirectoryCreateRemoteDirectory(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createRemoteDirectoryCreateRemoteDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRemoteDirectoryProperties**](CreateRemoteDirectoryProperties.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepositoryServiceActionRestart"></a>
# **createRepositoryServiceActionRestart**
> NodeServiceStatusProperties createRepositoryServiceActionRestart()

Restart, start or stop the NSX install-upgrade service

Restart, start or stop the NSX install-upgrade service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createRepositoryServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createRepositoryServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRepositoryServiceActionStart"></a>
# **createRepositoryServiceActionStart**
> NodeServiceStatusProperties createRepositoryServiceActionStart()

Restart, start or stop the NSX install-upgrade service

Restart, start or stop the NSX install-upgrade service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createRepositoryServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createRepositoryServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRepositoryServiceActionStop"></a>
# **createRepositoryServiceActionStop**
> NodeServiceStatusProperties createRepositoryServiceActionStop()

Restart, start or stop the NSX install-upgrade service

Restart, start or stop the NSX install-upgrade service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createRepositoryServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createRepositoryServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSNMPServiceActionRestart"></a>
# **createSNMPServiceActionRestart**
> NodeServiceStatusProperties createSNMPServiceActionRestart()

Restart, start or stop the SNMP service

Restart, start or stop the SNMP service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSNMPServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSNMPServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSNMPServiceActionStart"></a>
# **createSNMPServiceActionStart**
> NodeServiceStatusProperties createSNMPServiceActionStart()

Restart, start or stop the SNMP service

Restart, start or stop the SNMP service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSNMPServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSNMPServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSNMPServiceActionStop"></a>
# **createSNMPServiceActionStop**
> NodeServiceStatusProperties createSNMPServiceActionStop()

Restart, start or stop the SNMP service

Restart, start or stop the SNMP service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSNMPServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSNMPServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSSHServiceActionNotifyMpaRestart"></a>
# **createSSHServiceActionNotifyMpaRestart**
> NodeServiceStatusProperties createSSHServiceActionNotifyMpaRestart()

Restart, start or stop the ssh service

Restart, start or stop the ssh service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSSHServiceActionNotifyMpaRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSSHServiceActionNotifyMpaRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSSHServiceActionNotifyMpaStart"></a>
# **createSSHServiceActionNotifyMpaStart**
> NodeServiceStatusProperties createSSHServiceActionNotifyMpaStart()

Restart, start or stop the ssh service

Restart, start or stop the ssh service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSSHServiceActionNotifyMpaStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSSHServiceActionNotifyMpaStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSSHServiceActionNotifyMpaStop"></a>
# **createSSHServiceActionNotifyMpaStop**
> NodeServiceStatusProperties createSSHServiceActionNotifyMpaStop()

Restart, start or stop the ssh service

Restart, start or stop the ssh service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSSHServiceActionNotifyMpaStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSSHServiceActionNotifyMpaStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSSHServiceActionRestart"></a>
# **createSSHServiceActionRestart**
> NodeServiceStatusProperties createSSHServiceActionRestart()

Restart, start or stop the ssh service

Restart, start or stop the ssh service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSSHServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSSHServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSSHServiceActionStart"></a>
# **createSSHServiceActionStart**
> NodeServiceStatusProperties createSSHServiceActionStart()

Restart, start or stop the ssh service

Restart, start or stop the ssh service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSSHServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSSHServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSSHServiceActionStop"></a>
# **createSSHServiceActionStop**
> NodeServiceStatusProperties createSSHServiceActionStop()

Restart, start or stop the ssh service

Restart, start or stop the ssh service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSSHServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSSHServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSSHServiceRemoveHostFingerprintActionRemoveHostFingerprint"></a>
# **createSSHServiceRemoveHostFingerprintActionRemoveHostFingerprint**
> createSSHServiceRemoveHostFingerprintActionRemoveHostFingerprint(body)

Remove a host&#x27;s fingerprint from known hosts file

Remove a host&#x27;s fingerprint from known hosts file

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
KnownHostParameter body = new KnownHostParameter(); // KnownHostParameter | 
try {
    apiInstance.createSSHServiceRemoveHostFingerprintActionRemoveHostFingerprint(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSSHServiceRemoveHostFingerprintActionRemoveHostFingerprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KnownHostParameter**](KnownHostParameter.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSearchServiceActionRestart"></a>
# **createSearchServiceActionRestart**
> NodeServiceStatusProperties createSearchServiceActionRestart()

Restart, start or stop the NSX Search service

Restart, start or stop the NSX Search service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSearchServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSearchServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSearchServiceActionStart"></a>
# **createSearchServiceActionStart**
> NodeServiceStatusProperties createSearchServiceActionStart()

Restart, start or stop the NSX Search service

Restart, start or stop the NSX Search service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSearchServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSearchServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSearchServiceActionStop"></a>
# **createSearchServiceActionStop**
> NodeServiceStatusProperties createSearchServiceActionStop()

Restart, start or stop the NSX Search service

Restart, start or stop the NSX Search service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSearchServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSearchServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSyslogServiceActionRestart"></a>
# **createSyslogServiceActionRestart**
> NodeServiceStatusProperties createSyslogServiceActionRestart()

Restart, start or stop the syslog service

Restart, start or stop the syslog service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSyslogServiceActionRestart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSyslogServiceActionRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSyslogServiceActionStart"></a>
# **createSyslogServiceActionStart**
> NodeServiceStatusProperties createSyslogServiceActionStart()

Restart, start or stop the syslog service

Restart, start or stop the syslog service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSyslogServiceActionStart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSyslogServiceActionStart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSyslogServiceActionStop"></a>
# **createSyslogServiceActionStop**
> NodeServiceStatusProperties createSyslogServiceActionStop()

Restart, start or stop the syslog service

Restart, start or stop the syslog service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.createSyslogServiceActionStop();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#createSyslogServiceActionStop");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dELETERabbitMQManagementPort"></a>
# **dELETERabbitMQManagementPort**
> dELETERabbitMQManagementPort()

Delete RabbitMQ management port

Delete RabbitMQ management port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.dELETERabbitMQManagementPort();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#dELETERabbitMQManagementPort");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteApplianceManagementTask"></a>
# **deleteApplianceManagementTask**
> deleteApplianceManagementTask(taskId)

Delete task

Delete task

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String taskId = "taskId_example"; // String | ID of task to delete
try {
    apiInstance.deleteApplianceManagementTask(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#deleteApplianceManagementTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| ID of task to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> deleteFile(fileName)

Delete file

Delete file

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String fileName = "fileName_example"; // String | Name of the file to delete
try {
    apiInstance.deleteFile(fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#deleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Name of the file to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNodeNetworkRoute"></a>
# **deleteNodeNetworkRoute**
> deleteNodeNetworkRoute(routeId)

Delete node network route

Delete a route from the NSX Manager routing table. You can modify an existing route by deleting it and then posting the modified version of the route. To verify, remove the route ID from the URI, issue a GET request, and note the absense of the deleted route. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String routeId = "routeId_example"; // String | ID of route to delete
try {
    apiInstance.deleteNodeNetworkRoute(routeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#deleteNodeNetworkRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **String**| ID of route to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNodeSyslogExporter"></a>
# **deleteNodeSyslogExporter**
> deleteNodeSyslogExporter(exporterName)

Delete node syslog exporter

Removes a specified rule from the collection of syslog exporter rules. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String exporterName = "exporterName_example"; // String | Name of syslog exporter to delete
try {
    apiInstance.deleteNodeSyslogExporter(exporterName);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#deleteNodeSyslogExporter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exporterName** | **String**| Name of syslog exporter to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNodeUserSshKeyRemoveSshKey"></a>
# **deleteNodeUserSshKeyRemoveSshKey**
> deleteNodeUserSshKeyRemoveSshKey(body, userid)

Remove SSH public key from authorized_keys file for node user

Remove SSH public key from authorized_keys file for node user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
SshKeyBaseProperties body = new SshKeyBaseProperties(); // SshKeyBaseProperties | 
String userid = "userid_example"; // String | User id of the user
try {
    apiInstance.deleteNodeUserSshKeyRemoveSshKey(body, userid);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#deleteNodeUserSshKeyRemoveSshKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SshKeyBaseProperties**](SshKeyBaseProperties.md)|  |
 **userid** | **String**| User id of the user |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSupportBundlesAsyncResponseDeleteAsyncResponse"></a>
# **deleteSupportBundlesAsyncResponseDeleteAsyncResponse**
> deleteSupportBundlesAsyncResponseDeleteAsyncResponse()

Delete existing support bundles waiting to be downloaded

Delete existing support bundles waiting to be downloaded.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.deleteSupportBundlesAsyncResponseDeleteAsyncResponse();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#deleteSupportBundlesAsyncResponseDeleteAsyncResponse");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getControllerProfilerStatus"></a>
# **getControllerProfilerStatus**
> ControllerProfilerProperties getControllerProfilerStatus()

Get the status (Enabled/Disabled) of controller profiler

Get the status (Enabled/Disabled) of controller profiler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    ControllerProfilerProperties result = apiInstance.getControllerProfilerStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#getControllerProfilerStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerProfilerProperties**](ControllerProfilerProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNodeMandatoryAccessControl"></a>
# **getNodeMandatoryAccessControl**
> MandatoryAccessControlProperties getNodeMandatoryAccessControl()

Gets the enable status for Mandatory Access Control

Gets the enable status for Mandatory Access Control

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    MandatoryAccessControlProperties result = apiInstance.getNodeMandatoryAccessControl();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#getNodeMandatoryAccessControl");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MandatoryAccessControlProperties**](MandatoryAccessControlProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNodeMandatoryAccessControlReport"></a>
# **getNodeMandatoryAccessControlReport**
> getNodeMandatoryAccessControlReport()

Get the report for Mandatory Access Control

Get the report for Mandatory Access Control

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.getNodeMandatoryAccessControlReport();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#getNodeMandatoryAccessControlReport");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="invokeDeleteClusterCentralAPI"></a>
# **invokeDeleteClusterCentralAPI**
> invokeDeleteClusterCentralAPI(targetNodeId, targetUri)

Invoke DELETE request on target cluster node

Invoke DELETE request on target cluster node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID or keyword self
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokeDeleteClusterCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokeDeleteClusterCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID or keyword self |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokeDeleteFabricCentralAPI"></a>
# **invokeDeleteFabricCentralAPI**
> invokeDeleteFabricCentralAPI(targetNodeId, targetUri)

Invoke DELETE request on target fabric node

Invoke DELETE request on target fabric node. This api is deprecated as part of FN+TN unification. Please use Transport Node API DELETE /transport-nodes/&amp;lt;transport-node-id&amp;gt;/&amp;lt;target-node-id&amp;gt;/&amp;lt;target-uri&amp;gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokeDeleteFabricCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokeDeleteFabricCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokeDeleteTransportNodeCentralAPI"></a>
# **invokeDeleteTransportNodeCentralAPI**
> invokeDeleteTransportNodeCentralAPI(targetNodeId, targetUri)

Invoke DELETE request on target transport node

Invoke DELETE request on target transport node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokeDeleteTransportNodeCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokeDeleteTransportNodeCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokeGetClusterCentralAPI"></a>
# **invokeGetClusterCentralAPI**
> invokeGetClusterCentralAPI(targetNodeId, targetUri)

Invoke GET request on target cluster node

Invoke GET request on target cluster node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID or keyword self
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokeGetClusterCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokeGetClusterCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID or keyword self |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokeGetFabricCentralAPI"></a>
# **invokeGetFabricCentralAPI**
> invokeGetFabricCentralAPI(targetNodeId, targetUri)

Invoke GET request on target fabric node

Invoke GET request on target fabric node. This api is deprecated as part of FN+TN unification. Please use Transport Node API GET /transport-nodes/&amp;lt;transport-node-id&amp;gt;/&amp;lt;target-node-id&amp;gt;/&amp;lt;target-uri&amp;gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokeGetFabricCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokeGetFabricCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokeGetTransportNodeCentralAPI"></a>
# **invokeGetTransportNodeCentralAPI**
> invokeGetTransportNodeCentralAPI(targetNodeId, targetUri)

Invoke GET request on target transport node

Invoke GET request on target transport node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokeGetTransportNodeCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokeGetTransportNodeCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokePostClusterCentralAPI"></a>
# **invokePostClusterCentralAPI**
> invokePostClusterCentralAPI(targetNodeId, targetUri)

Invoke POST request on target cluster node

Invoke POST request on target cluster node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID or keyword self
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokePostClusterCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokePostClusterCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID or keyword self |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokePostFabricCentralAPI"></a>
# **invokePostFabricCentralAPI**
> invokePostFabricCentralAPI(targetNodeId, targetUri)

Invoke POST request on target fabric node

Invoke POST request on target fabric node. This api is deprecated as part of FN+TN unification. Please use Transport Node API POST /transport-nodes/&amp;lt;transport-node-id&amp;gt;/&amp;lt;target-node-id&amp;gt;/&amp;lt;target-uri&amp;gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokePostFabricCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokePostFabricCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokePostTransportNodeCentralAPI"></a>
# **invokePostTransportNodeCentralAPI**
> invokePostTransportNodeCentralAPI(targetNodeId, targetUri)

Invoke POST request on target transport node

Invoke POST request on target transport node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokePostTransportNodeCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokePostTransportNodeCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokePutClusterCentralAPI"></a>
# **invokePutClusterCentralAPI**
> invokePutClusterCentralAPI(targetNodeId, targetUri)

Invoke PUT request on target cluster node

Invoke PUT request on target cluster node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID or keyword self
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokePutClusterCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokePutClusterCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID or keyword self |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokePutFabricCentralAPI"></a>
# **invokePutFabricCentralAPI**
> invokePutFabricCentralAPI(targetNodeId, targetUri)

Invoke PUT request on target fabric node

Invoke PUT request on target fabric node. This api is deprecated as part of FN+TN unification. Please use Transport Node API PUT /transport-nodes/&amp;lt;transport-node-id&amp;gt;/&amp;lt;target-node-id&amp;gt;/&amp;lt;target-uri&amp;gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokePutFabricCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokePutFabricCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="invokePutTransportNodeCentralAPI"></a>
# **invokePutTransportNodeCentralAPI**
> invokePutTransportNodeCentralAPI(targetNodeId, targetUri)

Invoke PUT request on target transport node

Invoke PUT request on target transport node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String targetNodeId = "targetNodeId_example"; // String | Target node UUID
String targetUri = "targetUri_example"; // String | URI of API to invoke on target node
try {
    apiInstance.invokePutTransportNodeCentralAPI(targetNodeId, targetUri);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#invokePutTransportNodeCentralAPI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetNodeId** | **String**| Target node UUID |
 **targetUri** | **String**| URI of API to invoke on target node |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listApplianceManagementTasks"></a>
# **listApplianceManagementTasks**
> ApplianceManagementTaskListResult listApplianceManagementTasks(fields, requestMethod, requestPath, requestUri, status, user)

List appliance management tasks

List appliance management tasks

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String fields = "fields_example"; // String | Fields to include in query results
String requestMethod = "requestMethod_example"; // String | Request method(s) to include in query result
String requestPath = "requestPath_example"; // String | Request URI path(s) to include in query result
String requestUri = "requestUri_example"; // String | Request URI(s) to include in query result
String status = "status_example"; // String | Status(es) to include in query result
String user = "user_example"; // String | Names of users to include in query result
try {
    ApplianceManagementTaskListResult result = apiInstance.listApplianceManagementTasks(fields, requestMethod, requestPath, requestUri, status, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#listApplianceManagementTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Fields to include in query results | [optional]
 **requestMethod** | **String**| Request method(s) to include in query result | [optional]
 **requestPath** | **String**| Request URI path(s) to include in query result | [optional]
 **requestUri** | **String**| Request URI(s) to include in query result | [optional]
 **status** | **String**| Status(es) to include in query result | [optional]
 **user** | **String**| Names of users to include in query result | [optional]

### Return type

[**ApplianceManagementTaskListResult**](ApplianceManagementTaskListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFiles"></a>
# **listFiles**
> FilePropertiesListResult listFiles()

List node files

List node files

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    FilePropertiesListResult result = apiInstance.listFiles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#listFiles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FilePropertiesListResult**](FilePropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNodeInterfaces"></a>
# **listNodeInterfaces**
> NodeNetworkInterfacePropertiesListResult listNodeInterfaces()

List the NSX Manager&#x27;s Network Interfaces

Returns the number of interfaces on the NSX Manager appliance and detailed information about each interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network mask, and the IP configuration method (static or DHCP). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeNetworkInterfacePropertiesListResult result = apiInstance.listNodeInterfaces();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#listNodeInterfaces");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeNetworkInterfacePropertiesListResult**](NodeNetworkInterfacePropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNodeNetworkRoutes"></a>
# **listNodeNetworkRoutes**
> NodeRoutePropertiesListResult listNodeNetworkRoutes()

List node network routes

Returns detailed information about each route in the NSX Manager routing table. Route information includes the route type (default, static, and so on), a unique route identifier, the route metric, the protocol from which the route was learned, the route source (which is the preferred egress interface), the route destination, and the route scope. The route scope refers to the distance to the destination network: The \&quot;host\&quot; scope leads to a destination address on the NSX Manager, such as a loopback address; the \&quot;link\&quot; scope leads to a destination on the local network; and the \&quot;global\&quot; scope leads to addresses that are more than one hop away. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeRoutePropertiesListResult result = apiInstance.listNodeNetworkRoutes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#listNodeNetworkRoutes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeRoutePropertiesListResult**](NodeRoutePropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNodeProcesses"></a>
# **listNodeProcesses**
> NodeProcessPropertiesListResult listNodeProcesses()

List node processes

Returns the number of processes and information about each process. Process information includes 1) mem_resident, which is roughly equivalent to the amount of RAM, in bytes, currently used by the process, 2) parent process ID (ppid), 3) process name, 4) process up time in milliseconds, 5) mem_used, wich is the amount of virtual memory used by the process, in bytes, 6) process start time, in milliseconds since epoch, 7) process ID (pid), 8) CPU time, both user and the system, consumed by the process in milliseconds. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeProcessPropertiesListResult result = apiInstance.listNodeProcesses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#listNodeProcesses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeProcessPropertiesListResult**](NodeProcessPropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNodeServices"></a>
# **listNodeServices**
> NodeServicePropertiesListResult listNodeServices()

List node services

Returns a list of all services available on the NSX Manager applicance. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServicePropertiesListResult result = apiInstance.listNodeServices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#listNodeServices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServicePropertiesListResult**](NodeServicePropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNodeSyslogExporters"></a>
# **listNodeSyslogExporters**
> NodeSyslogExporterPropertiesListResult listNodeSyslogExporters()

List node syslog exporters

Returns the collection of registered syslog exporter rules, if any. The rules specify the collector IP address and port, and the protocol to use. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeSyslogExporterPropertiesListResult result = apiInstance.listNodeSyslogExporters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#listNodeSyslogExporters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeSyslogExporterPropertiesListResult**](NodeSyslogExporterPropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNodeUserSshKeys"></a>
# **listNodeUserSshKeys**
> SshKeyPropertiesListResult listNodeUserSshKeys(userid)

List SSH keys from authorized_keys file for node user

Returns a list of all SSH keys from authorized_keys file for node user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String userid = "userid_example"; // String | User id of the user
try {
    SshKeyPropertiesListResult result = apiInstance.listNodeUserSshKeys(userid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#listNodeUserSshKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userid** | **String**| User id of the user |

### Return type

[**SshKeyPropertiesListResult**](SshKeyPropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNodeUsers"></a>
# **listNodeUsers**
> NodeUserPropertiesListResult listNodeUsers()

List node users

Returns the list of users configued to log in to the NSX appliance. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeUserPropertiesListResult result = apiInstance.listNodeUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#listNodeUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeUserPropertiesListResult**](NodeUserPropertiesListResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postNodeSyslogExporter"></a>
# **postNodeSyslogExporter**
> NodeSyslogExporterProperties postNodeSyslogExporter(body)

Add node syslog exporter

Adds a rule for exporting syslog information to a specified server. The required parameters are the rule name (exporter_name); severity level (emerg, alert, crit, and so on); transmission protocol (TCP or UDP); and server IP address or hostname. The optional parameters are the syslog port number, which can be 1 through 65,535 (514, by default); facility level to use when logging messages to syslog (kern, user, mail, and so on); and message IDs (msgids), which identify the types of messages to export. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeSyslogExporterProperties body = new NodeSyslogExporterProperties(); // NodeSyslogExporterProperties | 
try {
    NodeSyslogExporterProperties result = apiInstance.postNodeSyslogExporter(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#postNodeSyslogExporter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeSyslogExporterProperties**](NodeSyslogExporterProperties.md)|  |

### Return type

[**NodeSyslogExporterProperties**](NodeSyslogExporterProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readApplianceManagementService"></a>
# **readApplianceManagementService**
> NodeServiceProperties readApplianceManagementService()

Read appliance management service properties

Read appliance management service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readApplianceManagementService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readApplianceManagementService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readApplianceManagementServiceStatus"></a>
# **readApplianceManagementServiceStatus**
> NodeServiceStatusProperties readApplianceManagementServiceStatus()

Read appliance management service status

Read appliance management service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readApplianceManagementServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readApplianceManagementServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readApplianceManagementTaskProperties"></a>
# **readApplianceManagementTaskProperties**
> ApplianceManagementTaskProperties readApplianceManagementTaskProperties(taskId, suppressRedirect)

Read task properties

Read task properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String taskId = "taskId_example"; // String | ID of task to read
Boolean suppressRedirect = true; // Boolean | Suppress redirect status if applicable
try {
    ApplianceManagementTaskProperties result = apiInstance.readApplianceManagementTaskProperties(taskId, suppressRedirect);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readApplianceManagementTaskProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| ID of task to read |
 **suppressRedirect** | **Boolean**| Suppress redirect status if applicable | [optional]

### Return type

[**ApplianceManagementTaskProperties**](ApplianceManagementTaskProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readApplianceNodeStatus"></a>
# **readApplianceNodeStatus**
> NodeStatusProperties readApplianceNodeStatus()

Read node status

Returns information about the NSX Manager appliance&#x27;s file system, CPU, memory, disk usage, and uptime. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeStatusProperties result = apiInstance.readApplianceNodeStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readApplianceNodeStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeStatusProperties**](NodeStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readAsyncApplianceManagementTaskResponse"></a>
# **readAsyncApplianceManagementTaskResponse**
> readAsyncApplianceManagementTaskResponse(taskId)

Read asynchronous task response

Read asynchronous task response

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String taskId = "taskId_example"; // String | ID of task to read
try {
    apiInstance.readAsyncApplianceManagementTaskResponse(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readAsyncApplianceManagementTaskResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| ID of task to read |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readAuthProviderVidm"></a>
# **readAuthProviderVidm**
> NodeAuthProviderVidmProperties readAuthProviderVidm()

Read AAA provider vIDM properties

Read AAA provider vIDM properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeAuthProviderVidmProperties result = apiInstance.readAuthProviderVidm();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readAuthProviderVidm");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeAuthProviderVidmProperties**](NodeAuthProviderVidmProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readAuthProviderVidmStatus"></a>
# **readAuthProviderVidmStatus**
> NodeAuthProviderVidmStatus readAuthProviderVidmStatus()

Read AAA provider vIDM status

Read AAA provider vIDM status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeAuthProviderVidmStatus result = apiInstance.readAuthProviderVidmStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readAuthProviderVidmStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeAuthProviderVidmStatus**](NodeAuthProviderVidmStatus.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterBootManagerService"></a>
# **readClusterBootManagerService**
> NodeServiceProperties readClusterBootManagerService()

Read cluster boot manager service properties

Read cluster boot manager service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readClusterBootManagerService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readClusterBootManagerService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readClusterBootManagerServiceStatus"></a>
# **readClusterBootManagerServiceStatus**
> NodeServiceStatusProperties readClusterBootManagerServiceStatus()

Read cluster boot manager service status

Read cluster boot manager service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readClusterBootManagerServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readClusterBootManagerServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readCminventoryService"></a>
# **readCminventoryService**
> NodeServiceProperties readCminventoryService()

Read cm inventory service properties

Read cm inventory service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readCminventoryService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readCminventoryService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readCminventoryServiceStatus"></a>
# **readCminventoryServiceStatus**
> NodeServiceStatusProperties readCminventoryServiceStatus()

Read manager service status

Read manager service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readCminventoryServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readCminventoryServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readControllerServerCertificate"></a>
# **readControllerServerCertificate**
> CertificateKeyPair readControllerServerCertificate()

Read controller server certificate properties

Read controller server certificate properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    CertificateKeyPair result = apiInstance.readControllerServerCertificate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readControllerServerCertificate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readControllerServerService"></a>
# **readControllerServerService**
> NodeServiceProperties readControllerServerService()

Read controller service properties

Read controller service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readControllerServerService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readControllerServerService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readControllerServerServiceStatus"></a>
# **readControllerServerServiceStatus**
> NodeServiceStatusProperties readControllerServerServiceStatus()

Read controller service status

Read controller service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readControllerServerServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readControllerServerServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readFile"></a>
# **readFile**
> readFile(fileName)

Read file contents

Read file contents

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String fileName = "fileName_example"; // String | Name of the file to read
try {
    apiInstance.readFile(fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Name of the file to read |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="readFileProperties"></a>
# **readFileProperties**
> FileProperties readFileProperties(fileName)

Read file properties

Read file properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String fileName = "fileName_example"; // String | Name of the file to retrieve information about
try {
    FileProperties result = apiInstance.readFileProperties(fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readFileProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Name of the file to retrieve information about |

### Return type

[**FileProperties**](FileProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readFileThumbprint"></a>
# **readFileThumbprint**
> FileThumbprint readFileThumbprint(fileName)

Read file thumbprint

Read file thumbprint

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String fileName = "fileName_example"; // String | Name of the file for which thumbprint should be computed
try {
    FileThumbprint result = apiInstance.readFileThumbprint(fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readFileThumbprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Name of the file for which thumbprint should be computed |

### Return type

[**FileThumbprint**](FileThumbprint.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLiagentService"></a>
# **readLiagentService**
> NodeServiceProperties readLiagentService()

Read liagent service properties

Read liagent service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readLiagentService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readLiagentService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readLiagentServiceStatus"></a>
# **readLiagentServiceStatus**
> NodeServiceStatusProperties readLiagentServiceStatus()

Read liagent service status

Read liagent service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readLiagentServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readLiagentServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readMigrationCoordinatorService"></a>
# **readMigrationCoordinatorService**
> NodeServiceProperties readMigrationCoordinatorService()

Read migration coordinator service properties

Read migration coordinator service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readMigrationCoordinatorService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readMigrationCoordinatorService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readMigrationCoordinatorServiceStatus"></a>
# **readMigrationCoordinatorServiceStatus**
> NodeServiceStatusProperties readMigrationCoordinatorServiceStatus()

Read migration coordinator service status

Read migration coordinator service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readMigrationCoordinatorServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readMigrationCoordinatorServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNSXMessageBusService"></a>
# **readNSXMessageBusService**
> NodeServiceProperties readNSXMessageBusService()

Read NSX Message Bus service properties

Read NSX Message Bus service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readNSXMessageBusService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNSXMessageBusService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNSXMessageBusServiceStatus"></a>
# **readNSXMessageBusServiceStatus**
> NodeServiceStatusProperties readNSXMessageBusServiceStatus()

Read NSX Message Bus service status

Read NSX Message Bus service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readNSXMessageBusServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNSXMessageBusServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNTPService"></a>
# **readNTPService**
> NodeNtpServiceProperties readNTPService()

Read NTP service properties

Read NTP service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeNtpServiceProperties result = apiInstance.readNTPService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNTPService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeNtpServiceProperties**](NodeNtpServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNTPServiceStatus"></a>
# **readNTPServiceStatus**
> NodeServiceStatusProperties readNTPServiceStatus()

Read NTP service status

Read NTP service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readNTPServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNTPServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNetworkInterfaceStatistics"></a>
# **readNetworkInterfaceStatistics**
> NodeInterfaceStatisticsProperties readNetworkInterfaceStatistics(interfaceId)

Read the NSX Manager&#x27;s Network Interface Statistics

On the specified interface, returns the number of received (rx), transmitted (tx), and dropped packets; the number of bytes and errors received and transmitted on the interface; and the number of detected collisions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String interfaceId = "interfaceId_example"; // String | ID of interface to read
try {
    NodeInterfaceStatisticsProperties result = apiInstance.readNetworkInterfaceStatistics(interfaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNetworkInterfaceStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interfaceId** | **String**| ID of interface to read |

### Return type

[**NodeInterfaceStatisticsProperties**](NodeInterfaceStatisticsProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNetworkProperties"></a>
# **readNetworkProperties**
> NodeNetworkProperties readNetworkProperties()

Read network configuration properties

Read network configuration properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeNetworkProperties result = apiInstance.readNetworkProperties();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNetworkProperties");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeNetworkProperties**](NodeNetworkProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeInterface"></a>
# **readNodeInterface**
> NodeNetworkInterfaceProperties readNodeInterface(interfaceId)

Read the NSX Manager&#x27;s Network Interface

Returns detailed information about the specified interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network  mask, and the IP configuration method. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String interfaceId = "interfaceId_example"; // String | ID of interface to read
try {
    NodeNetworkInterfaceProperties result = apiInstance.readNodeInterface(interfaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeInterface");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interfaceId** | **String**| ID of interface to read |

### Return type

[**NodeNetworkInterfaceProperties**](NodeNetworkInterfaceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeNameServers"></a>
# **readNodeNameServers**
> NodeNameServersProperties readNodeNameServers()

Read the NSX Manager&#x27;s Name Servers

Returns the list of servers that the NSX Manager node uses to look up IP addresses associated with given domain names. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeNameServersProperties result = apiInstance.readNodeNameServers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeNameServers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeNameServersProperties**](NodeNameServersProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeNetworkRoute"></a>
# **readNodeNetworkRoute**
> NodeRouteProperties readNodeNetworkRoute(routeId)

Read node network route

Returns detailed information about a specified route in the NSX Manager routing table. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String routeId = "routeId_example"; // String | ID of route to read
try {
    NodeRouteProperties result = apiInstance.readNodeNetworkRoute(routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeNetworkRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **String**| ID of route to read |

### Return type

[**NodeRouteProperties**](NodeRouteProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeProcess"></a>
# **readNodeProcess**
> NodeProcessProperties readNodeProcess(processId)

Read node process

Returns information for a specified process ID (pid).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String processId = "processId_example"; // String | ID of process to read
try {
    NodeProcessProperties result = apiInstance.readNodeProcess(processId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeProcess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| ID of process to read |

### Return type

[**NodeProcessProperties**](NodeProcessProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeProperties"></a>
# **readNodeProperties**
> NodeProperties readNodeProperties()

Read node properties

Returns information about the NSX appliance. Information includes release number, time zone, system time, kernel version, message of the day (motd), and host name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeProperties result = apiInstance.readNodeProperties();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeProperties");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeProperties**](NodeProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeSearchDomains"></a>
# **readNodeSearchDomains**
> NodeSearchDomainsProperties readNodeSearchDomains()

Read the NSX Manager&#x27;s Search Domains

Returns the domain list that the NSX Manager node uses to complete unqualified host names. When a host name does not include a fully qualified domain name (FQDN), the NSX Management node appends the first-listed domain name to the host name before the host name is looked up. The NSX Management node continues this for each entry in the domain list until it finds a match. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeSearchDomainsProperties result = apiInstance.readNodeSearchDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeSearchDomains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeSearchDomainsProperties**](NodeSearchDomainsProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeStatsService"></a>
# **readNodeStatsService**
> NodeServiceProperties readNodeStatsService()

Read NSX node-stats service properties

Read NSX node-stats service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readNodeStatsService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeStatsService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeStatsServiceStatus"></a>
# **readNodeStatsServiceStatus**
> NodeServiceStatusProperties readNodeStatsServiceStatus()

Read NSX node-stats service status

Read NSX node-stats service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readNodeStatsServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeStatsServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeSupportBundle"></a>
# **readNodeSupportBundle**
> readNodeSupportBundle(all)

Read node support bundle

Read node support bundle

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
Boolean all = true; // Boolean | Include all files
try {
    apiInstance.readNodeSupportBundle(all);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeSupportBundle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **all** | **Boolean**| Include all files | [optional]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="readNodeSyslogExporter"></a>
# **readNodeSyslogExporter**
> NodeSyslogExporterProperties readNodeSyslogExporter(exporterName)

Read node syslog exporter

Returns information about a specific syslog collection point.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String exporterName = "exporterName_example"; // String | Name of syslog exporter
try {
    NodeSyslogExporterProperties result = apiInstance.readNodeSyslogExporter(exporterName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeSyslogExporter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exporterName** | **String**| Name of syslog exporter |

### Return type

[**NodeSyslogExporterProperties**](NodeSyslogExporterProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeUser"></a>
# **readNodeUser**
> NodeUserProperties readNodeUser(userid)

Read node user

Returns information about a specified user who is configued to log in to the NSX appliance 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String userid = "userid_example"; // String | User id of the user
try {
    NodeUserProperties result = apiInstance.readNodeUser(userid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userid** | **String**| User id of the user |

### Return type

[**NodeUserProperties**](NodeUserProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNodeVersion"></a>
# **readNodeVersion**
> NodeVersion readNodeVersion()

Read node version

Read node version

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeVersion result = apiInstance.readNodeVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNodeVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeVersion**](NodeVersion.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNsxUiServiceService"></a>
# **readNsxUiServiceService**
> NodeServiceProperties readNsxUiServiceService()

Read ui service properties

Read ui service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readNsxUiServiceService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNsxUiServiceService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNsxUiServiceServiceStatus"></a>
# **readNsxUiServiceServiceStatus**
> NodeServiceStatusProperties readNsxUiServiceServiceStatus()

Read ui service status

Read ui service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readNsxUiServiceServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNsxUiServiceServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNsxUpgradeAgentService"></a>
# **readNsxUpgradeAgentService**
> NodeServiceProperties readNsxUpgradeAgentService()

Read NSX upgrade Agent service properties

Read NSX upgrade Agent service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readNsxUpgradeAgentService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNsxUpgradeAgentService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readNsxUpgradeAgentServiceStatus"></a>
# **readNsxUpgradeAgentServiceStatus**
> NodeServiceStatusProperties readNsxUpgradeAgentServiceStatus()

Read Nsx upgrade agent service status

Read Nsx upgrade agent service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readNsxUpgradeAgentServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readNsxUpgradeAgentServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPhonehomeCoordinatorService"></a>
# **readPhonehomeCoordinatorService**
> NodeServiceProperties readPhonehomeCoordinatorService()

Read Telemetry service properties

Read Telemetry service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readPhonehomeCoordinatorService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readPhonehomeCoordinatorService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPhonehomeCoordinatorServiceStatus"></a>
# **readPhonehomeCoordinatorServiceStatus**
> NodeServiceStatusProperties readPhonehomeCoordinatorServiceStatus()

Read Telemetry service status

Read Telemetry service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readPhonehomeCoordinatorServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readPhonehomeCoordinatorServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPlatformClientService"></a>
# **readPlatformClientService**
> NodeServiceProperties readPlatformClientService()

Read NSX Platform Client service properties

Read NSX Platform Client service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readPlatformClientService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readPlatformClientService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPlatformClientServiceStatus"></a>
# **readPlatformClientServiceStatus**
> NodeServiceStatusProperties readPlatformClientServiceStatus()

Read NSX Platform Client service status

Read NSX Platform Client service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readPlatformClientServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readPlatformClientServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPolicyService"></a>
# **readPolicyService**
> NodePolicyServiceProperties readPolicyService()

Read service properties

Read service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodePolicyServiceProperties result = apiInstance.readPolicyService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readPolicyService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodePolicyServiceProperties**](NodePolicyServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPolicyServiceStatus"></a>
# **readPolicyServiceStatus**
> NodeServiceStatusProperties readPolicyServiceStatus()

Read service status

Read service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readPolicyServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readPolicyServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readProtonService"></a>
# **readProtonService**
> NodeProtonServiceProperties readProtonService()

Read service properties

Read service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeProtonServiceProperties result = apiInstance.readProtonService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readProtonService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeProtonServiceProperties**](NodeProtonServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readProtonServiceStatus"></a>
# **readProtonServiceStatus**
> NodeServiceStatusProperties readProtonServiceStatus()

Read service status

Read service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readProtonServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readProtonServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readProxyService"></a>
# **readProxyService**
> NodeHttpServiceProperties readProxyService()

Read http service properties

This API is deprecated.  Read the configuration of the http service by calling the GET /api/v1/cluster/api-service API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeHttpServiceProperties result = apiInstance.readProxyService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readProxyService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeHttpServiceProperties**](NodeHttpServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readProxyServiceStatus"></a>
# **readProxyServiceStatus**
> NodeServiceStatusProperties readProxyServiceStatus()

Read http service status

Read http service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readProxyServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readProxyServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readRabbitMQService"></a>
# **readRabbitMQService**
> NodeServiceProperties readRabbitMQService()

Read Rabbit MQ service properties

Read Rabbit MQ service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readRabbitMQService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readRabbitMQService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readRabbitMQServiceStatus"></a>
# **readRabbitMQServiceStatus**
> NodeServiceStatusProperties readRabbitMQServiceStatus()

Read Rabbit MQ service status

Read Rabbit MQ service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readRabbitMQServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readRabbitMQServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readRepositoryService"></a>
# **readRepositoryService**
> NodeInstallUpgradeServiceProperties readRepositoryService()

Read NSX install-upgrade service properties

Read NSX install-upgrade service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeInstallUpgradeServiceProperties result = apiInstance.readRepositoryService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readRepositoryService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeInstallUpgradeServiceProperties**](NodeInstallUpgradeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readRepositoryServiceStatus"></a>
# **readRepositoryServiceStatus**
> NodeServiceStatusProperties readRepositoryServiceStatus()

Read NSX install-upgrade service status

Read NSX install-upgrade service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readRepositoryServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readRepositoryServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readSNMPService"></a>
# **readSNMPService**
> NodeSnmpServiceProperties readSNMPService()

Read SNMP service properties

Read SNMP service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeSnmpServiceProperties result = apiInstance.readSNMPService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readSNMPService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeSnmpServiceProperties**](NodeSnmpServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readSNMPServiceStatus"></a>
# **readSNMPServiceStatus**
> NodeServiceStatusProperties readSNMPServiceStatus()

Read SNMP service status

Read SNMP service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readSNMPServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readSNMPServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readSNMPV3EngineID"></a>
# **readSNMPV3EngineID**
> NodeSnmpV3EngineID readSNMPV3EngineID()

Read SNMP V3 Engine ID

Read SNMP V3 Engine ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeSnmpV3EngineID result = apiInstance.readSNMPV3EngineID();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readSNMPV3EngineID");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeSnmpV3EngineID**](NodeSnmpV3EngineID.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readSSHService"></a>
# **readSSHService**
> NodeSshServiceProperties readSSHService()

Read ssh service properties

Read ssh service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeSshServiceProperties result = apiInstance.readSSHService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readSSHService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeSshServiceProperties**](NodeSshServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readSSHServiceStatus"></a>
# **readSSHServiceStatus**
> NodeServiceStatusProperties readSSHServiceStatus()

Read ssh service status

Read ssh service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readSSHServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readSSHServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readSearchService"></a>
# **readSearchService**
> NodeServiceProperties readSearchService()

Read NSX Search service properties

Read NSX Search service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readSearchService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readSearchService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readSearchServiceStatus"></a>
# **readSearchServiceStatus**
> NodeServiceStatusProperties readSearchServiceStatus()

Read NSX Search service status

Read NSX Search service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readSearchServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readSearchServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readSyslogService"></a>
# **readSyslogService**
> NodeServiceProperties readSyslogService()

Read syslog service properties

Read syslog service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceProperties result = apiInstance.readSyslogService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readSyslogService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceProperties**](NodeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readSyslogServiceStatus"></a>
# **readSyslogServiceStatus**
> NodeServiceStatusProperties readSyslogServiceStatus()

Read syslog service status

Read syslog service status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeServiceStatusProperties result = apiInstance.readSyslogServiceStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#readSyslogServiceStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeServiceStatusProperties**](NodeServiceStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetPolicyServiceLoggingLevelActionResetManagerLoggingLevels"></a>
# **resetPolicyServiceLoggingLevelActionResetManagerLoggingLevels**
> resetPolicyServiceLoggingLevelActionResetManagerLoggingLevels()

Reset the logging levels to default values

Reset the logging levels to default values

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.resetPolicyServiceLoggingLevelActionResetManagerLoggingLevels();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#resetPolicyServiceLoggingLevelActionResetManagerLoggingLevels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetProtonServiceLoggingLevelActionResetManagerLoggingLevels"></a>
# **resetProtonServiceLoggingLevelActionResetManagerLoggingLevels**
> resetProtonServiceLoggingLevelActionResetManagerLoggingLevels()

Reset the logging levels to default values

Reset the logging levels to default values

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.resetProtonServiceLoggingLevelActionResetManagerLoggingLevels();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#resetProtonServiceLoggingLevelActionResetManagerLoggingLevels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restartOrShutdownNodeRestart"></a>
# **restartOrShutdownNodeRestart**
> restartOrShutdownNodeRestart()

Restart or shutdown node

Restarts or shuts down the NSX appliance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.restartOrShutdownNodeRestart();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#restartOrShutdownNodeRestart");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restartOrShutdownNodeShutdown"></a>
# **restartOrShutdownNodeShutdown**
> restartOrShutdownNodeShutdown()

Restart or shutdown node

Restarts or shuts down the NSX appliance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.restartOrShutdownNodeShutdown();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#restartOrShutdownNodeShutdown");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setControllerProfiler"></a>
# **setControllerProfiler**
> setControllerProfiler(body)

Enable or disable controller profiler

Enable or disable controller profiler

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
ControllerProfilerProperties body = new ControllerProfilerProperties(); // ControllerProfilerProperties | 
try {
    apiInstance.setControllerProfiler(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#setControllerProfiler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerProfilerProperties**](ControllerProfilerProperties.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setNodeMandatoryAccessControl"></a>
# **setNodeMandatoryAccessControl**
> MandatoryAccessControlProperties setNodeMandatoryAccessControl(body)

Enable or disable  Mandatory Access Control

Enable or disable  Mandatory Access Control

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
MandatoryAccessControlProperties body = new MandatoryAccessControlProperties(); // MandatoryAccessControlProperties | 
try {
    MandatoryAccessControlProperties result = apiInstance.setNodeMandatoryAccessControl(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#setNodeMandatoryAccessControl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MandatoryAccessControlProperties**](MandatoryAccessControlProperties.md)|  |

### Return type

[**MandatoryAccessControlProperties**](MandatoryAccessControlProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setRabbitMQManagementPort"></a>
# **setRabbitMQManagementPort**
> setRabbitMQManagementPort()

Set RabbitMQ management port

Set RabbitMQ management port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.setRabbitMQManagementPort();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#setRabbitMQManagementPort");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateApplianceNodeStatusClearBootupError"></a>
# **updateApplianceNodeStatusClearBootupError**
> NodeStatusProperties updateApplianceNodeStatusClearBootupError()

Update node status

Clear node bootup status 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    NodeStatusProperties result = apiInstance.updateApplianceNodeStatusClearBootupError();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateApplianceNodeStatusClearBootupError");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NodeStatusProperties**](NodeStatusProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAuthProviderVidm"></a>
# **updateAuthProviderVidm**
> NodeAuthProviderVidmProperties updateAuthProviderVidm(body)

Update AAA provider vIDM properties

Update AAA provider vIDM properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeAuthProviderVidmProperties body = new NodeAuthProviderVidmProperties(); // NodeAuthProviderVidmProperties | 
try {
    NodeAuthProviderVidmProperties result = apiInstance.updateAuthProviderVidm(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateAuthProviderVidm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeAuthProviderVidmProperties**](NodeAuthProviderVidmProperties.md)|  |

### Return type

[**NodeAuthProviderVidmProperties**](NodeAuthProviderVidmProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFile"></a>
# **updateFile**
> FileProperties updateFile(fileName)

Replace file contents

Replace file contents

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
String fileName = "fileName_example"; // String | Name of the file to replace
try {
    FileProperties result = apiInstance.updateFile(fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Name of the file to replace |

### Return type

[**FileProperties**](FileProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNTPService"></a>
# **updateNTPService**
> NodeNtpServiceProperties updateNTPService(body)

Update NTP service properties

Update NTP service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeNtpServiceProperties body = new NodeNtpServiceProperties(); // NodeNtpServiceProperties | 
try {
    NodeNtpServiceProperties result = apiInstance.updateNTPService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateNTPService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeNtpServiceProperties**](NodeNtpServiceProperties.md)|  |

### Return type

[**NodeNtpServiceProperties**](NodeNtpServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeInterface"></a>
# **updateNodeInterface**
> NodeNetworkInterfaceProperties updateNodeInterface(body, interfaceId)

Update the NSX Manager&#x27;s Network Interface

Updates the specified interface properties. You cannot change the properties &lt;code&gt;ip_configuration&lt;/code&gt;, &lt;code&gt;ip_addresses&lt;/code&gt;, or &lt;code&gt;plane&lt;/code&gt;. NSX Manager must have a static IP address. You must use NSX CLI to configure a controller or an edge node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeNetworkInterfaceProperties body = new NodeNetworkInterfaceProperties(); // NodeNetworkInterfaceProperties | 
String interfaceId = "interfaceId_example"; // String | ID of interface to update
try {
    NodeNetworkInterfaceProperties result = apiInstance.updateNodeInterface(body, interfaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateNodeInterface");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeNetworkInterfaceProperties**](NodeNetworkInterfaceProperties.md)|  |
 **interfaceId** | **String**| ID of interface to update |

### Return type

[**NodeNetworkInterfaceProperties**](NodeNetworkInterfaceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeNameServers"></a>
# **updateNodeNameServers**
> NodeNameServersProperties updateNodeNameServers(body)

Update the NSX Manager&#x27;s Name Servers

Modifies the list of servers that the NSX Manager node uses to look up IP addresses associated with given domain names. If DHCP is configured, this method returns a 409 CONFLICT error, because DHCP manages the list of name servers. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeNameServersProperties body = new NodeNameServersProperties(); // NodeNameServersProperties | 
try {
    NodeNameServersProperties result = apiInstance.updateNodeNameServers(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateNodeNameServers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeNameServersProperties**](NodeNameServersProperties.md)|  |

### Return type

[**NodeNameServersProperties**](NodeNameServersProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeProperties"></a>
# **updateNodeProperties**
> NodeProperties updateNodeProperties(body)

Update node properties

Modifies NSX appliance properties. Modifiable properties include the timezone, message of the day (motd), and hostname. The NSX appliance node_version, system_time, and kernel_version are read only and cannot be modified with this method. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeProperties body = new NodeProperties(); // NodeProperties | 
try {
    NodeProperties result = apiInstance.updateNodeProperties(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateNodeProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeProperties**](NodeProperties.md)|  |

### Return type

[**NodeProperties**](NodeProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeSearchDomains"></a>
# **updateNodeSearchDomains**
> NodeSearchDomainsProperties updateNodeSearchDomains(body)

Update the NSX Manager&#x27;s Search Domains

Modifies the list of domain names that the NSX Manager node uses to complete unqualified host names. If DHCP is configured, this method returns a 409 CONFLICT error, because DHCP manages the list of name servers. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeSearchDomainsProperties body = new NodeSearchDomainsProperties(); // NodeSearchDomainsProperties | 
try {
    NodeSearchDomainsProperties result = apiInstance.updateNodeSearchDomains(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateNodeSearchDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeSearchDomainsProperties**](NodeSearchDomainsProperties.md)|  |

### Return type

[**NodeSearchDomainsProperties**](NodeSearchDomainsProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeUser"></a>
# **updateNodeUser**
> NodeUserProperties updateNodeUser(body, userid)

Update node user

Updates attributes of an existing NSX appliance user. This method cannot be used to add a new user. Modifiable attributes include the username, full name of the user, and password. If you specify a password in a PUT request, it is not returned in the response. Nor is it returned in a GET request. The specified password does not meet the following complexity requirements: - minimum 12 characters in length - minimum 1 uppercase character - minimum 1 lowercase character - minimum 1 numeric character - minimum 1 special character - minimum 5 unique characters - default password complexity rules as enforced by the Linux PAM module 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeUserProperties body = new NodeUserProperties(); // NodeUserProperties | 
String userid = "userid_example"; // String | User id of the user
try {
    NodeUserProperties result = apiInstance.updateNodeUser(body, userid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateNodeUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeUserProperties**](NodeUserProperties.md)|  |
 **userid** | **String**| User id of the user |

### Return type

[**NodeUserProperties**](NodeUserProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePolicyService"></a>
# **updatePolicyService**
> NodePolicyServiceProperties updatePolicyService(body)

Update service properties

Update service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodePolicyServiceProperties body = new NodePolicyServiceProperties(); // NodePolicyServiceProperties | 
try {
    NodePolicyServiceProperties result = apiInstance.updatePolicyService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updatePolicyService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodePolicyServiceProperties**](NodePolicyServiceProperties.md)|  |

### Return type

[**NodePolicyServiceProperties**](NodePolicyServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProtonService"></a>
# **updateProtonService**
> NodeProtonServiceProperties updateProtonService(body)

Update service properties

Update service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeProtonServiceProperties body = new NodeProtonServiceProperties(); // NodeProtonServiceProperties | 
try {
    NodeProtonServiceProperties result = apiInstance.updateProtonService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateProtonService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeProtonServiceProperties**](NodeProtonServiceProperties.md)|  |

### Return type

[**NodeProtonServiceProperties**](NodeProtonServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProxyService"></a>
# **updateProxyService**
> NodeHttpServiceProperties updateProxyService(body)

Update http service properties

This API is deprecated.  Make changes to the http service configuration by calling the PUT /api/v1/cluster/api-service API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeHttpServiceProperties body = new NodeHttpServiceProperties(); // NodeHttpServiceProperties | 
try {
    NodeHttpServiceProperties result = apiInstance.updateProxyService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateProxyService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeHttpServiceProperties**](NodeHttpServiceProperties.md)|  |

### Return type

[**NodeHttpServiceProperties**](NodeHttpServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepositoryService"></a>
# **updateRepositoryService**
> NodeInstallUpgradeServiceProperties updateRepositoryService(body)

Update NSX install-upgrade service properties

Update NSX install-upgrade service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeInstallUpgradeServiceProperties body = new NodeInstallUpgradeServiceProperties(); // NodeInstallUpgradeServiceProperties | 
try {
    NodeInstallUpgradeServiceProperties result = apiInstance.updateRepositoryService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateRepositoryService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeInstallUpgradeServiceProperties**](NodeInstallUpgradeServiceProperties.md)|  |

### Return type

[**NodeInstallUpgradeServiceProperties**](NodeInstallUpgradeServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSNMPService"></a>
# **updateSNMPService**
> NodeSnmpServiceProperties updateSNMPService(body)

Update SNMP service properties

Update SNMP service properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeSnmpServiceProperties body = new NodeSnmpServiceProperties(); // NodeSnmpServiceProperties | 
try {
    NodeSnmpServiceProperties result = apiInstance.updateSNMPService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateSNMPService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeSnmpServiceProperties**](NodeSnmpServiceProperties.md)|  |

### Return type

[**NodeSnmpServiceProperties**](NodeSnmpServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSNMPV3EngineID"></a>
# **updateSNMPV3EngineID**
> NodeSnmpV3EngineID updateSNMPV3EngineID(body)

Update SNMP V3 Engine ID

Update SNMP V3 Engine ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeSnmpV3EngineID body = new NodeSnmpV3EngineID(); // NodeSnmpV3EngineID | 
try {
    NodeSnmpV3EngineID result = apiInstance.updateSNMPV3EngineID(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateSNMPV3EngineID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeSnmpV3EngineID**](NodeSnmpV3EngineID.md)|  |

### Return type

[**NodeSnmpV3EngineID**](NodeSnmpV3EngineID.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSSHService"></a>
# **updateSSHService**
> NodeSshServiceProperties updateSSHService(body)

Update ssh service properties

Update ssh service properties. If the start_on_boot property is updated to true, existing ssh sessions if any are stopped and the ssh service is restarted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
NodeSshServiceProperties body = new NodeSshServiceProperties(); // NodeSshServiceProperties | 
try {
    NodeSshServiceProperties result = apiInstance.updateSSHService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateSSHService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeSshServiceProperties**](NodeSshServiceProperties.md)|  |

### Return type

[**NodeSshServiceProperties**](NodeSshServiceProperties.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUcState"></a>
# **updateUcState**
> updateUcState(body)

Update UC state properties

Update UC state properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
UcStateProperties body = new UcStateProperties(); // UcStateProperties | 
try {
    apiInstance.updateUcState(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#updateUcState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UcStateProperties**](UcStateProperties.md)|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyNodeSyslogExporterVerify"></a>
# **verifyNodeSyslogExporterVerify**
> verifyNodeSyslogExporterVerify()

Verify node syslog exporter

Collect iptables rules needed for all existing syslog exporters and verify if the existing iptables rules are the same. If not, remove the stale rules and add the new rules to make sure all exporters work properly. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi apiInstance = new ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi();
try {
    apiInstance.verifyNodeSyslogExporterVerify();
} catch (ApiException e) {
    System.err.println("Exception when calling ManagementPlaneApiNsxComponentAdministrationApplianceManagementApi#verifyNodeSyslogExporterVerify");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

