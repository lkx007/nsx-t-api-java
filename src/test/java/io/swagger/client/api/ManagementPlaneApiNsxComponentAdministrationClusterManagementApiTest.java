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
import io.swagger.client.model.AddClusterNodeSpec;
import io.swagger.client.model.ApiError;
import io.swagger.client.model.ApiServiceConfig;
import io.swagger.client.model.ClusterCertificateId;
import io.swagger.client.model.ClusterConfig;
import io.swagger.client.model.ClusterConfiguration;
import io.swagger.client.model.ClusterNodeConfig;
import io.swagger.client.model.ClusterNodeConfigListResult;
import io.swagger.client.model.ClusterNodeInfo;
import io.swagger.client.model.ClusterNodeStatus;
import io.swagger.client.model.ClusterStatus;
import io.swagger.client.model.ClusterVirtualIpProperties;
import io.swagger.client.model.ClustersAggregateInfo;
import io.swagger.client.model.JoinClusterParameters;
import io.swagger.client.model.NodeInterfaceProperties;
import io.swagger.client.model.NodeInterfacePropertiesListResult;
import io.swagger.client.model.NodeInterfaceStatisticsProperties;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiNsxComponentAdministrationClusterManagementApi
 */
@Ignore
public class ManagementPlaneApiNsxComponentAdministrationClusterManagementApiTest {

    private final ManagementPlaneApiNsxComponentAdministrationClusterManagementApi api = new ManagementPlaneApiNsxComponentAdministrationClusterManagementApi();

    /**
     * Add a controller to the cluster
     *
     * Add a new controller to the NSX cluster. Deprecated. Use POST /cluster?action&#x3D;join_cluster to join a node to cluster. The controller comes with the new node. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addClusterNodeTest() throws ApiException {
        AddClusterNodeSpec body = null;
        String action = null;
        ClusterNodeConfig response = api.addClusterNode(body, action);

        // TODO: test validations
    }
    /**
     * Clear the cluster certificate
     *
     * Clears the certificate used for the MP cluster. This does not affect the certificate itself. This API is deprecated. Instead use the  /api/v1/cluster/api-certificate?action&#x3D;set_cluster_certificate API to set the cluster certificate to a different one. It just means that from now on, individual certificates will be used on each MP node. This affects all nodes in the cluster. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearClusterCertificateClearClusterCertificateTest() throws ApiException {
        String certificateId = null;
        ClusterCertificateId response = api.clearClusterCertificateClearClusterCertificate(certificateId);

        // TODO: test validations
    }
    /**
     * Clear cluster virtual IP address
     *
     * Clears the cluster virtual IP address. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearClusterVirtualIpClearVirtualIpTest() throws ApiException {
        ClusterVirtualIpProperties response = api.clearClusterVirtualIpClearVirtualIp();

        // TODO: test validations
    }
    /**
     * Remove a controller from the cluster
     *
     * Removes the specified controller from the NSX cluster. Before you can remove a controller from the cluster, you must shut down the controller service with the \&quot;stop service controller\&quot; command. Deprecated. Use POST /cluster/&lt;node-id&gt;?action&#x3D;remove_node to detach a node from cluster. The controller is removed with the node. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClusterNodeConfigTest() throws ApiException {
        String nodeId = null;
        api.deleteClusterNodeConfig(nodeId);

        // TODO: test validations
    }
    /**
     * Detach a node from the Cluster
     *
     * Detach a node from the Cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detachClusterNodeRemoveNodeTest() throws ApiException {
        String nodeId = null;
        String force = null;
        String gracefulShutdown = null;
        String ignoreRepositoryIpCheck = null;
        ClusterConfiguration response = api.detachClusterNodeRemoveNode(nodeId, force, gracefulShutdown, ignoreRepositoryIpCheck);

        // TODO: test validations
    }
    /**
     * Read API service properties
     *
     * Read the configuration of the NSX API service. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApiServiceConfigTest() throws ApiException {
        ApiServiceConfig response = api.getApiServiceConfig();

        // TODO: test validations
    }
    /**
     * Read cluster certificate ID
     *
     * Returns the ID of the certificate that is used as the cluster certificate for MP 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterCertificateIdTest() throws ApiException {
        ClusterCertificateId response = api.getClusterCertificateId();

        // TODO: test validations
    }
    /**
     * Read cluster node configuration
     *
     * Returns information about the specified NSX cluster node.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterNodeConfigTest() throws ApiException {
        String nodeId = null;
        ClusterNodeInfo response = api.getClusterNodeConfig(nodeId);

        // TODO: test validations
    }
    /**
     * Read cluster virtual IP address
     *
     * Returns the configured cluster virtual IP address or null if not configured. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterVirtualIpTest() throws ApiException {
        ClusterVirtualIpProperties response = api.getClusterVirtualIp();

        // TODO: test validations
    }
    /**
     * Join this node to a NSX Cluster
     *
     * Join this node to a NSX Cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void joinClusterJoinClusterTest() throws ApiException {
        JoinClusterParameters body = null;
        ClusterConfiguration response = api.joinClusterJoinCluster(body);

        // TODO: test validations
    }
    /**
     * List Cluster Node Configurations
     *
     * Returns information about all NSX cluster nodes. Deprecated. Use GET /cluster to get cluster configuration. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listClusterNodeConfigsTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        ClusterNodeConfigListResult response = api.listClusterNodeConfigs(cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * List the specified node&#x27;s Network Interfaces
     *
     * Returns the number of interfaces on the node and detailed information about each interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network mask, and the IP configuration method (static or DHCP). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listClusterNodeInterfacesTest() throws ApiException {
        String nodeId = null;
        String source = null;
        NodeInterfacePropertiesListResult response = api.listClusterNodeInterfaces(nodeId, source);

        // TODO: test validations
    }
    /**
     * Read Cluster Configuration
     *
     * Returns information about the NSX cluster configuration. An NSX cluster has two functions or purposes, commonly referred to as \&quot;roles.\&quot; These two roles are control and management. Each NSX installation has a single cluster. Separate NSX clusters do not share data. In other words, a given data-plane node is attached to only one cluster, not to multiple clusters. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readClusterConfigTest() throws ApiException {
        ClusterConfig response = api.readClusterConfig();

        // TODO: test validations
    }
    /**
     * Read Cluster Node Configuration
     *
     * Returns information about the specified NSX cluster node. Deprecated. Use GET /cluster/&lt;node-id&gt; to get cluster node configuration. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readClusterNodeConfigTest() throws ApiException {
        String nodeId = null;
        ClusterNodeConfig response = api.readClusterNodeConfig(nodeId);

        // TODO: test validations
    }
    /**
     * Read the node&#x27;s Network Interface
     *
     * Returns detailed information about the specified interface. Interface information includes MTU, broadcast and host IP addresses, link and admin status, MAC address, network  mask, and the IP configuration method (static or DHCP). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readClusterNodeInterfaceTest() throws ApiException {
        String nodeId = null;
        String interfaceId = null;
        String source = null;
        NodeInterfaceProperties response = api.readClusterNodeInterface(nodeId, interfaceId, source);

        // TODO: test validations
    }
    /**
     * Read the NSX Manager/Controller&#x27;s Network Interface Statistics
     *
     * On the specified interface, returns the number of received (rx), transmitted (tx), and dropped packets; the number of bytes and errors received and transmitted on the interface; and the number of detected collisions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readClusterNodeInterfaceStatisticsTest() throws ApiException {
        String nodeId = null;
        String interfaceId = null;
        String source = null;
        NodeInterfaceStatisticsProperties response = api.readClusterNodeInterfaceStatistics(nodeId, interfaceId, source);

        // TODO: test validations
    }
    /**
     * Read cluster node runtime status
     *
     * Read aggregated runtime status of cluster node. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readClusterNodeStatusTest() throws ApiException {
        String nodeId = null;
        String source = null;
        ClusterNodeStatus response = api.readClusterNodeStatus(nodeId, source);

        // TODO: test validations
    }
    /**
     * Read cluster runtime status
     *
     * Read aggregated runtime status of all cluster nodes. Deprecated. Use GET /cluster/status instead. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readClusterNodesAggregateStatusTest() throws ApiException {
        ClustersAggregateInfo response = api.readClusterNodesAggregateStatus();

        // TODO: test validations
    }
    /**
     * Read Cluster Status
     *
     * Returns status information for the NSX cluster control role and management role. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readClusterStatusTest() throws ApiException {
        ClusterStatus response = api.readClusterStatus();

        // TODO: test validations
    }
    /**
     * Set the cluster certificate
     *
     * Sets the certificate used for the MP cluster. Issuing this request causes the http service to restart so that the service can begin using the new certificate. When the POST request succeeds, it doesn&#x27;t return a valid response. The request times out because of the restart. This affects all nodes in the cluster. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setClusterCertificateSetClusterCertificateTest() throws ApiException {
        String certificateId = null;
        ClusterCertificateId response = api.setClusterCertificateSetClusterCertificate(certificateId);

        // TODO: test validations
    }
    /**
     * Set cluster virtual IP address
     *
     * Sets the cluster virtual IP address. Note, all nodes in the management cluster must be in the same subnet. If not, a 409 CONFLICT status is returned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setClusterVirtualIpSetVirtualIpTest() throws ApiException {
        String ipAddress = null;
        ClusterVirtualIpProperties response = api.setClusterVirtualIpSetVirtualIp(ipAddress);

        // TODO: test validations
    }
    /**
     * Update API service properties
     *
     * Read the configuration of the NSX API service. Changes are applied to all nodes in the cluster. The API service on each node will restart after it is updated using this API. There may be a delay of up to a minute or so between the time this API call completes and when the new configuration goes into effect.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateApiServiceConfigTest() throws ApiException {
        ApiServiceConfig body = null;
        ApiServiceConfig response = api.updateApiServiceConfig(body);

        // TODO: test validations
    }
}
