/*
 * NSX-T Manager API
 * VMware NSX-T Manager REST API
 *
 * OpenAPI spec version: 2.5.1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ApiError;
import io.swagger.client.model.ComputeCollectionTransportNodeTemplate;
import io.swagger.client.model.ComputeCollectionTransportNodeTemplateStateList;
import io.swagger.client.model.HeatMapTransportNodesAggregateStatus;
import io.swagger.client.model.HeatMapTransportZoneStatus;
import io.swagger.client.model.InterfaceNeighborProperties;
import io.swagger.client.model.InterfaceNeighborPropertyListResult;
import io.swagger.client.model.NetworkMigrationSpec;
import io.swagger.client.model.NetworkMigrationSpecListResult;
import io.swagger.client.model.NodeCapabilitiesResult;
import io.swagger.client.model.NodeInterfaceProperties;
import io.swagger.client.model.NodeInterfacePropertiesListResult;
import io.swagger.client.model.NodeInterfaceStatisticsProperties;
import io.swagger.client.model.PnicBondStatusListResult;
import io.swagger.client.model.SoftwareModuleResult;
import io.swagger.client.model.TransportNode;
import io.swagger.client.model.TransportNodeListResult;
import io.swagger.client.model.TransportNodeState;
import io.swagger.client.model.TransportNodeStateListResult;
import io.swagger.client.model.TransportNodeStatus;
import io.swagger.client.model.TransportNodeStatusListResult;
import io.swagger.client.model.TransportNodeTemplateListResult;
import io.swagger.client.model.TunnelList;
import io.swagger.client.model.TunnelProperties;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiNetworkTransportTransportNodesApi
 */
@Ignore
public class ManagementPlaneApiNetworkTransportTransportNodesApiTest {

    private final ManagementPlaneApiNetworkTransportTransportNodesApi api = new ManagementPlaneApiNetworkTransportTransportNodesApi();

    /**
     * Create transport node template for compute collection.
     *
     * If automated transport node creation is configured on compute collection, this template will serve as the default setting for transport node creation. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createComputeCollectionTransportNodeTemplateAndTNCollectionTest() throws ApiException {
        ComputeCollectionTransportNodeTemplate body = null;
        ComputeCollectionTransportNodeTemplate response = api.createComputeCollectionTransportNodeTemplateAndTNCollection(body);

        // TODO: test validations
    }
    /**
     * Create a template of network migration specification.
     *
     * Network migration specification once created and can be used as a template to indicate associated component which networks should be migrated and where. Currently migration template can be associated with compute collections which are managed by vCenter host profiles, to trigger automatic migration of networks for Stateless ESX hosts. Currently we only support creation of HostProfileNetworkMigrationSpec type of specification. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNetworkMigrationSpecTest() throws ApiException {
        NetworkMigrationSpec body = null;
        NetworkMigrationSpec response = api.createNetworkMigrationSpec(body);

        // TODO: test validations
    }
    /**
     * Create a Transport Node
     *
     * Transport nodes are hypervisor hosts and NSX Edges that will participate in an NSX-T overlay. For a hypervisor host, this means that it hosts VMs that will communicate over NSX-T logical switches. For NSX Edges, this means that it will have logical router uplinks and downlinks.  This API creates transport node for a host node (hypervisor) or edge node (router) in the transport network.  When you run this command for a host, NSX Manager attempts to install the NSX kernel modules, which are packaged as VIB, RPM, or DEB files. For the installation to succeed, you must provide the host login credentials and the host thumbprint.  To get the ESXi host thumbprint, SSH to the host and run the &lt;b&gt;openssl x509 -in /etc/vmware/ssl/rui.crt -fingerprint -sha256 -noout&lt;/b&gt; command.  To generate host key thumbprint using SHA-256 algorithm please follow the steps below.  Log into the host, making sure that the connection is not vulnerable to a man in the middle attack. Check whether a public key already exists. Host public key is generally located at &#x27;/etc/ssh/ssh_host_rsa_key.pub&#x27;. If the key is not present then generate a new key by running the following command and follow the instructions.  &lt;b&gt;ssh-keygen -t rsa&lt;/b&gt;  Now generate a SHA256 hash of the key using the following command. Please make sure to pass the appropriate file name if the public key is stored with a different file name other than the default &#x27;id_rsa.pub&#x27;.  &lt;b&gt;awk &#x27;{print $2}&#x27; id_rsa.pub | base64 -d | sha256sum -b | sed &#x27;s/ .*$//&#x27; | xxd -r -p | base64&lt;/b&gt; This api is deprecated as part of FN+TN unification. Please use Transport Node API to install NSX components on a node.  Additional documentation on creating a transport node can be found in the NSX-T Installation Guide.  In order for the transport node to forward packets, the host_switch_spec property must be specified.  Host switches (called bridges in OVS on KVM hypervisors) are the individual switches within the host virtual switch. Virtual machines are connected to the host switches.  When creating a transport node, you need to specify if the host switches are already manually preconfigured on the node, or if NSX should create and manage the host switches. You specify this choice by the type of host switches you pass in the host_switch_spec property of the TransportNode request payload.  For a KVM host, you can preconfigure the host switch, or you can have NSX Manager perform the configuration. For an ESXi host or NSX Edge node, NSX Manager always configures the host switch.  To preconfigure the host switches on a KVM host, pass an array of PreconfiguredHostSwitchSpec objects that describes those host switches. In the current NSX-T release, only one prefonfigured host switch can be specified.  See the PreconfiguredHostSwitchSpec schema definition for documentation on the properties that must be provided. Preconfigured host switches are only supported on KVM hosts, not on ESXi hosts or NSX Edge nodes.  To allow NSX to manage the host switch configuration on KVM hosts, ESXi hosts, or NSX Edge nodes, pass an array of StandardHostSwitchSpec objects in the host_switch_spec property, and NSX will automatically create host switches with the properties you provide. In the current NSX-T release, up to 5 host switches can be automatically managed. See the StandardHostSwitchSpec schema definition for documentation on the properties that must be provided.  Note: previous versions of NSX-T used a property named host_switches to specify the host switch configuration on the transport node. That property is deprecated, but still functions. You should configure new host switches using the host_switch_spec property.  The request should either provide node_deployement_info or node_id.  If the host node (hypervisor) or edge node (router) is already added in system then it can be converted to transport node by providing node_id in request.  If host node (hypervisor) or edge node (router) is not already present in system then information should be provided under node_deployment_info. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTransportNodeWithDeploymentInfoTest() throws ApiException {
        TransportNode body = null;
        TransportNode response = api.createTransportNodeWithDeploymentInfo(body);

        // TODO: test validations
    }
    /**
     * Delete a compute collection transport node template
     *
     * Delete the specified compute collection transport node template. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteComputeCollectionTransportNodeTemplateAndTNCollectionTest() throws ApiException {
        String templateId = null;
        api.deleteComputeCollectionTransportNodeTemplateAndTNCollection(templateId);

        // TODO: test validations
    }
    /**
     * Delete a network migration specification template
     *
     * Delete the specified network migration specification template. Delete will fail if this is a HostProfileNetworkMigrationSpec and is associated with certain compute collection. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNetworkMigrationSpecTest() throws ApiException {
        String templateId = null;
        api.deleteNetworkMigrationSpec(templateId);

        // TODO: test validations
    }
    /**
     * Delete a Transport Node
     *
     * Deletes the specified transport node. Query param force can be used to force delete the host nodes. Force deletion of edge and public cloud gateway nodes is not supported.  It also removes the specified node (host or edge) from system. If unprepare_host option is set to false, then host will be deleted without uninstalling the NSX components from the host. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTransportNodeWithDeploymentInfoTest() throws ApiException {
        String transportNodeId = null;
        Boolean force = null;
        Boolean unprepareHost = null;
        api.deleteTransportNodeWithDeploymentInfo(transportNodeId, force, unprepareHost);

        // TODO: test validations
    }
    /**
     * Disable flow cache for an edge transport node
     *
     * Disable flow cache for edge transport node. Caution: This involves restart of the edge dataplane and hence may lead to network disruption. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void disableFlowCacheDisableFlowCacheTest() throws ApiException {
        String transportNodeId = null;
        api.disableFlowCacheDisableFlowCache(transportNodeId);

        // TODO: test validations
    }
    /**
     * Enable flow cache for an edge transport node
     *
     * Enable flow cache for edge transport node. Caution: This involves restart of the edge dataplane and hence may lead to network disruption. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enableFlowCacheEnableFlowCacheTest() throws ApiException {
        String transportNodeId = null;
        api.enableFlowCacheEnableFlowCache(transportNodeId);

        // TODO: test validations
    }
    /**
     * Get high-level summary of all transport nodes. The service layer does not support source &#x3D; realtime or cached.
     *
     * Get high-level summary of all transport nodes. The service layer does not support source &#x3D; realtime or cached.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTransportNodesStatusTest() throws ApiException {
        String nodeType = null;
        HeatMapTransportZoneStatus response = api.getAllTransportNodesStatus(nodeType);

        // TODO: test validations
    }
    /**
     * Get high-level summary of a transport zone. The service layer does not support source &#x3D; realtime or cached.
     *
     * Get high-level summary of a transport zone. The service layer does not support source &#x3D; realtime or cached.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTransportZoneStatusTest() throws ApiException {
        HeatMapTransportNodesAggregateStatus response = api.getAllTransportZoneStatus();

        // TODO: test validations
    }
    /**
     * Get compute collection transportnode template by id
     *
     * Returns compute collection transportnode template by id Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getComputeCollectionTransportNodeTemplateTest() throws ApiException {
        String templateId = null;
        ComputeCollectionTransportNodeTemplate response = api.getComputeCollectionTransportNodeTemplate(templateId);

        // TODO: test validations
    }
    /**
     * Get compute collection transportnode template application states
     *
     * Returns detailed transport node states for this compute collection Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getComputeCollectionTransportNodeTemplateStateTest() throws ApiException {
        String templateId = null;
        String computeCollectionId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        ComputeCollectionTransportNodeTemplateStateList response = api.getComputeCollectionTransportNodeTemplateState(templateId, computeCollectionId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get the module details of a transport node 
     *
     * Get the module details of a transport node 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFabricNodeModulesOfTransportNodeTest() throws ApiException {
        String nodeId = null;
        SoftwareModuleResult response = api.getFabricNodeModulesOfTransportNode(nodeId);

        // TODO: test validations
    }
    /**
     * Get high-level summary of a transport zone
     *
     * Get high-level summary of a transport zone
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHeatmapTransportZoneStatusTest() throws ApiException {
        String zoneId = null;
        String source = null;
        HeatMapTransportZoneStatus response = api.getHeatmapTransportZoneStatus(zoneId, source);

        // TODO: test validations
    }
    /**
     * Get network migration specification template by id.
     *
     * Network migration specification once created and can be used as a template to indicate associated component which networks should be migrated and where. Currently migration template can be associated with compute collections which are managed by vCenter host profiles, to trigger automatic migration of networks for Stateless ESX hosts. Currently we only support creation of HostProfileNetworkMigrationSpec type of specification. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkMigrationSpecTest() throws ApiException {
        String templateId = null;
        NetworkMigrationSpec response = api.getNetworkMigrationSpec(templateId);

        // TODO: test validations
    }
    /**
     * Get high-level summary of a transport node
     *
     * Get high-level summary of a transport node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPnicStatusesForTransportNodeTest() throws ApiException {
        String nodeId = null;
        String status = null;
        PnicBondStatusListResult response = api.getPnicStatusesForTransportNode(nodeId, status);

        // TODO: test validations
    }
    /**
     * Creates a status report of transport nodes of all the transport zones
     *
     * You must provide the request header \&quot;Accept:application/octet-stream\&quot; when calling this API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransportNodeReportTest() throws ApiException {
        String source = null;
        String status = null;
        api.getTransportNodeReport(source, status);

        // TODO: test validations
    }
    /**
     * Creates a status report of transport nodes in a transport zone
     *
     * You must provide the request header \&quot;Accept:application/octet-stream\&quot; when calling this API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransportNodeReportForATransportZoneTest() throws ApiException {
        String zoneId = null;
        String source = null;
        String status = null;
        api.getTransportNodeReportForATransportZone(zoneId, source, status);

        // TODO: test validations
    }
    /**
     * Get a Transport Node&#x27;s State
     *
     * Returns information about the current state of the transport node configuration and information about the associated hostswitch. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransportNodeStateWithDeploymentInfoTest() throws ApiException {
        String transportNodeId = null;
        TransportNodeState response = api.getTransportNodeStateWithDeploymentInfo(transportNodeId);

        // TODO: test validations
    }
    /**
     * Read status of a transport node
     *
     * Read status of a transport node
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransportNodeStatusTest() throws ApiException {
        String nodeId = null;
        String source = null;
        TransportNodeStatus response = api.getTransportNodeStatus(nodeId, source);

        // TODO: test validations
    }
    /**
     * Get a Transport Node
     *
     * Returns information about a specified transport node.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransportNodeWithDeploymentInfoTest() throws ApiException {
        String transportNodeId = null;
        TransportNode response = api.getTransportNodeWithDeploymentInfo(transportNodeId);

        // TODO: test validations
    }
    /**
     * Tunnel properties
     *
     * Tunnel properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTunnelTest() throws ApiException {
        String nodeId = null;
        String tunnelName = null;
        String source = null;
        TunnelProperties response = api.getTunnel(nodeId, tunnelName, source);

        // TODO: test validations
    }
    /**
     * List compute collection transportnode templates
     *
     * Returns all eligible compute collection transportnode templates Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listComputeCollectionTransportNodeTemplatesTest() throws ApiException {
        String computeCollectionId = null;
        TransportNodeTemplateListResult response = api.listComputeCollectionTransportNodeTemplates(computeCollectionId);

        // TODO: test validations
    }
    /**
     * List LLDP Neighbor Properties of Transport Node
     *
     * List LLDP Neighbor Properties for all interfaces of Transport Node 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNeighborPropertiesTest() throws ApiException {
        String nodeId = null;
        InterfaceNeighborPropertyListResult response = api.listNeighborProperties(nodeId);

        // TODO: test validations
    }
    /**
     * List all network migration specification templates.
     *
     * Network migration specification once created and can be used as a template to indicate associated component which networks should be migrated and where. Currently migration template can be associated with compute collections which are managed by vCenter host profiles, to trigger automatic migration of networks for Stateless ESX hosts. Currently we only support creation of HostProfileNetworkMigrationSpec type of specification. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNetworkMigrationSpecsTest() throws ApiException {
        String cursor = null;
        Boolean includeSystemOwned = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String type = null;
        NetworkMigrationSpecListResult response = api.listNetworkMigrationSpecs(cursor, includeSystemOwned, includedFields, pageSize, sortAscending, sortBy, type);

        // TODO: test validations
    }
    /**
     * Read status of all transport nodes with tunnel connections to transport node 
     *
     * Read status of all transport nodes with tunnel connections to transport node 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRemoteTransportNodeStatusTest() throws ApiException {
        String nodeId = null;
        String bfdDiagnosticCode = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String source = null;
        String tunnelStatus = null;
        TransportNodeStatusListResult response = api.listRemoteTransportNodeStatus(nodeId, bfdDiagnosticCode, cursor, includedFields, pageSize, sortAscending, sortBy, source, tunnelStatus);

        // TODO: test validations
    }
    /**
     * Return the list of capabilities of transport node
     *
     * Returns information about capabilities of transport host node. Edge nodes do not have capabilities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransportNodeCapabilitiesTest() throws ApiException {
        String transportNodeId = null;
        NodeCapabilitiesResult response = api.listTransportNodeCapabilities(transportNodeId);

        // TODO: test validations
    }
    /**
     * List the specified transport node&#x27;s network interfaces
     *
     * Returns the number of interfaces on the node and detailed information about each interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network mask, and the IP configuration method (static or DHCP). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransportNodeInterfacesTest() throws ApiException {
        String transportNodeId = null;
        String source = null;
        NodeInterfacePropertiesListResult response = api.listTransportNodeInterfaces(transportNodeId, source);

        // TODO: test validations
    }
    /**
     * Read status of all the transport nodes
     *
     * Read status of all the transport nodes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransportNodeStatusTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String source = null;
        String status = null;
        TransportNodeStatusListResult response = api.listTransportNodeStatus(cursor, includedFields, pageSize, sortAscending, sortBy, source, status);

        // TODO: test validations
    }
    /**
     * Read status of transport nodes in a transport zone
     *
     * Read status of transport nodes in a transport zone
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransportNodeStatusForTransportZoneTest() throws ApiException {
        String zoneId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String source = null;
        String status = null;
        TransportNodeStatusListResult response = api.listTransportNodeStatusForTransportZone(zoneId, cursor, includedFields, pageSize, sortAscending, sortBy, source, status);

        // TODO: test validations
    }
    /**
     * List transport nodes by realized state
     *
     * Returns a list of transport node states that have realized state as provided as query parameter 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransportNodesByStateWithDeploymentInfoTest() throws ApiException {
        String mmState = null;
        String status = null;
        String vtepIp = null;
        TransportNodeStateListResult response = api.listTransportNodesByStateWithDeploymentInfo(mmState, status, vtepIp);

        // TODO: test validations
    }
    /**
     * List Transport Nodes
     *
     * Returns information about all transport nodes along with underlying host or edge details. A transport node is a host or edge that contains hostswitches. A hostswitch can have virtual machines connected to them.  Because each transport node has hostswitches, transport nodes can also have virtual tunnel endpoints, which means that they can be part of the overlay. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransportNodesWithDeploymentInfoTest() throws ApiException {
        String cursor = null;
        Boolean inMaintenanceMode = null;
        String includedFields = null;
        String nodeId = null;
        String nodeIp = null;
        String nodeTypes = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String transportZoneId = null;
        TransportNodeListResult response = api.listTransportNodesWithDeploymentInfo(cursor, inMaintenanceMode, includedFields, nodeId, nodeIp, nodeTypes, pageSize, sortAscending, sortBy, transportZoneId);

        // TODO: test validations
    }
    /**
     * List of tunnels
     *
     * List of tunnels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTunnelsTest() throws ApiException {
        String nodeId = null;
        String bfdDiagnosticCode = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        String remoteNodeId = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String source = null;
        String status = null;
        TunnelList response = api.queryTunnels(nodeId, bfdDiagnosticCode, cursor, includedFields, pageSize, remoteNodeId, sortAscending, sortBy, source, status);

        // TODO: test validations
    }
    /**
     * Read LLDP Neighbor Properties of Transport Node by Interface Name 
     *
     * Read LLDP Neighbor Properties for a specific interface of Transport Node 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNeighborPropertiesTest() throws ApiException {
        String nodeId = null;
        String interfaceName = null;
        InterfaceNeighborProperties response = api.readNeighborProperties(nodeId, interfaceName);

        // TODO: test validations
    }
    /**
     * Read the transport node&#x27;s network interface
     *
     * Returns detailed information about the specified interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network  mask, and the IP configuration method (static or DHCP). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTransportNodeInterfaceTest() throws ApiException {
        String transportNodeId = null;
        String interfaceId = null;
        String source = null;
        NodeInterfaceProperties response = api.readTransportNodeInterface(transportNodeId, interfaceId, source);

        // TODO: test validations
    }
    /**
     * Read the NSX Manager&#x27;s Network Interface Statistics
     *
     * On the specified interface, returns the number of received (rx), transmitted (tx), and dropped packets; the number of bytes and errors received and transmitted on the interface; and the number of detected collisions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readTransportNodeInterfaceStatisticsTest() throws ApiException {
        String transportNodeId = null;
        String interfaceId = null;
        String source = null;
        NodeInterfaceStatisticsProperties response = api.readTransportNodeInterfaceStatistics(transportNodeId, interfaceId, source);

        // TODO: test validations
    }
    /**
     * Refresh the node configuration for the Edge node.
     *
     * The API is applicable for Edge transport nodes. If you update the VM configuration and find a discrepancy in VM configuration at NSX Manager, then use this API to refresh configuration at NSX Manager. It refreshes the VM configuration from sources external to MP. Sources include vSphere Server and the edge node. After this action, the API GET api/v1/transport-nodes will show refreshed data. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshTransportNodeTest() throws ApiException {
        String transportNodeId = null;
        api.refreshTransportNode(transportNodeId);

        // TODO: test validations
    }
    /**
     * Restart the inventory sync for the node if it is paused currently.
     *
     * Restart the inventory sync for the node if it is currently internally paused. After this action the next inventory sync coming from the node is processed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restartTransportNodeInventorySyncRestartInventorySyncTest() throws ApiException {
        String transportNodeId = null;
        api.restartTransportNodeInventorySyncRestartInventorySync(transportNodeId);

        // TODO: test validations
    }
    /**
     * Apply cluster level Transport Node Profile on overridden host
     *
     * A host can be overridden to have different configuration than Transport Node Profile(TNP) on cluster. This action will restore such overridden host back to cluster level TNP.  This API can be used in other case. When TNP is applied to a cluster, if any validation fails (e.g. VMs running on host) then existing transport node (TN) is not updated. In that case after the issue is resolved manually (e.g. VMs powered off), you can call this API to update TN as per cluster level TNP. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restoreParentClusterConfigurationRestoreClusterConfigTest() throws ApiException {
        String transportNodeId = null;
        api.restoreParentClusterConfigurationRestoreClusterConfig(transportNodeId);

        // TODO: test validations
    }
    /**
     * Resync a Transport Node
     *
     * Resync the TransportNode configuration on a host. It is similar to updating the TransportNode with existing configuration, but force synce these configurations to the host (no backend optimizations). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resyncTransportNodeResyncHostConfigTest() throws ApiException {
        String transportnodeId = null;
        api.resyncTransportNodeResyncHostConfig(transportnodeId);

        // TODO: test validations
    }
    /**
     * Update compute collection transportnode template
     *
     * Update configuration of compute collection transportnode template. Compute_collection_id isn&#x27;t allowed to be changed since it represents the association between ComputeCollection and this template. This is determined when ComputeCollectionTransportNodeTemplate got created. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateComputeCollectionTransportNodeTemplateAndTNCollectionTest() throws ApiException {
        ComputeCollectionTransportNodeTemplate body = null;
        String templateId = null;
        ComputeCollectionTransportNodeTemplate response = api.updateComputeCollectionTransportNodeTemplateAndTNCollection(body, templateId);

        // TODO: test validations
    }
    /**
     * Update a template of network migration specification.
     *
     * Network migration specification once created and can be used as a template to indicate associated component which networks should be migrated and where. Currently migration template can be associated with compute collections which are managed by vCenter host profiles, to trigger automatic migration of networks for Stateless ESX hosts. Currently we only support creation of HostProfileNetworkMigrationSpec type of specification. For a HostProfileNetworkMigrationSpec which is already associated with a compute collection, updating it would mean next time the system needs to trigger migration for hosts managed by compute collection, it will use the updated migration specification. Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNetworkMigrationSpecTest() throws ApiException {
        NetworkMigrationSpec body = null;
        String templateId = null;
        NetworkMigrationSpec response = api.updateNetworkMigrationSpec(body, templateId);

        // TODO: test validations
    }
    /**
     * Update transport node maintenance mode
     *
     * Put transport node into maintenance mode or exit from maintenance mode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTransportNodeMaintenanceModeTest() throws ApiException {
        String transportnodeId = null;
        String action = null;
        api.updateTransportNodeMaintenanceMode(transportnodeId, action);

        // TODO: test validations
    }
    /**
     * Update a Transport Node
     *
     * Modifies the transport node information. The host_switch_name field must match the host_switch_name value specified in the transport zone (API: transport-zones). You must create the associated uplink profile (API: host-switch-profiles) before you can specify an uplink_name here. If the host is an ESX and has only one physical NIC being used by a vSphere standard switch, TransportNodeUpdateParameters should be used to migrate the management interface and the physical NIC into a logical switch that is in a transport zone this transport node will join or has already joined. If the migration is already done, TransportNodeUpdateParameters can also be used to migrate the management interface and the physical NIC back to a vSphere standard switch. In other cases, the TransportNodeUpdateParameters should NOT be used. When updating transport node you should follow pattern where you should fetch the existing transport node and then only modify the required properties keeping other properties as is. For API backward compatibility, property host_switches will be still returned in response and will contain the configuration matching the one in host_switch_spec. In update call you should only modify configuration in either host_switch_spec or host_switches, but not both. Property host_switch_spec should be preferred over deprecated host_switches property when creating or updating transport nodes.  It also modifies attributes of node (host or edge). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTransportNodeWithDeploymentInfoTest() throws ApiException {
        TransportNode body = null;
        String transportNodeId = null;
        String esxMgmtIfMigrationDest = null;
        String ifId = null;
        String pingIp = null;
        String vnic = null;
        String vnicMigrationDest = null;
        TransportNode response = api.updateTransportNodeWithDeploymentInfo(body, transportNodeId, esxMgmtIfMigrationDest, ifId, pingIp, vnic, vnicMigrationDest);

        // TODO: test validations
    }
}
