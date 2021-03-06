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
import io.swagger.client.model.LogicalRouterPort;
import io.swagger.client.model.LogicalRouterPortArpTable;
import io.swagger.client.model.LogicalRouterPortArpTableInCsvFormat;
import io.swagger.client.model.LogicalRouterPortListResult;
import io.swagger.client.model.LogicalRouterPortState;
import io.swagger.client.model.LogicalRouterPortStatistics;
import io.swagger.client.model.LogicalRouterPortStatisticsSummary;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi
 */
@Ignore
public class ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApiTest {

    private final ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi api = new ManagementPlaneApiLogicalRoutingAndServicesLogicalRouterPortsApi();

    /**
     * Create a Logical Router Port
     *
     * Creates a logical router port. The required parameters include resource_type (LogicalRouterUpLinkPort, LogicalRouterDownLinkPort, LogicalRouterLinkPort, LogicalRouterLoopbackPort, LogicalRouterCentralizedServicePort); and logical_router_id (the router to which each logical router port is assigned). The service_bindings parameter is optional. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLogicalRouterPortTest() throws ApiException {
        LogicalRouterPort body = null;
        LogicalRouterPort response = api.createLogicalRouterPort(body);

        // TODO: test validations
    }
    /**
     * Delete a Logical Router Port
     *
     * Deletes the specified logical router port. You must delete logical router ports before you can delete the associated logical router. To Delete Tier0 router link port you must have to delete attached tier1 router link port, otherwise pass \&quot;force&#x3D;true\&quot; as query param to force delete the Tier0 router link port. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLogicalRouterPortTest() throws ApiException {
        String logicalRouterPortId = null;
        Boolean cascadeDeleteLinkedPorts = null;
        Boolean force = null;
        api.deleteLogicalRouterPort(logicalRouterPortId, cascadeDeleteLinkedPorts, force);

        // TODO: test validations
    }
    /**
     * Get the ARP table (IPv4) or Neighbor Discovery table (IPv6) for the Logical Router Port of the given id 
     *
     * Returns ARP table (IPv4) or Neighbor Discovery table (IPv6) for the Logical Router Port of the given id, on a node if a query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is given. The transport_node_id parameter is mandatory if the router port is not uplink type. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalRouterPortArpTableTest() throws ApiException {
        String logicalRouterPortId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String source = null;
        String transportNodeId = null;
        LogicalRouterPortArpTable response = api.getLogicalRouterPortArpTable(logicalRouterPortId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId);

        // TODO: test validations
    }
    /**
     * Get the ARP table (IPv4) or Neighbor Discovery table (IPv6) for the Logical Router Port of the given id 
     *
     * Returns ARP table (IPv4) or Neighbor Discovery table (IPv6) in CSV format for the Logical Router Port of the given id, on a node if a query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is given. The transport_node_id parameter is mandatory if the router port is not uplink type. Query parameter \&quot;source&#x3D;realtime\&quot; is the only supported source. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalRouterPortArpTableInCsvFormatCsvTest() throws ApiException {
        String logicalRouterPortId = null;
        String source = null;
        String transportNodeId = null;
        LogicalRouterPortArpTableInCsvFormat response = api.getLogicalRouterPortArpTableInCsvFormatCsv(logicalRouterPortId, source, transportNodeId);

        // TODO: test validations
    }
    /**
     * Get the Realized State of a Logical Router Port
     *
     * Return realized state information of a logical router port. Any configuration update that affects the logical router port can use this API to get its realized state by passing a request_id returned by the configuration change operation. e.g. Update configuration of logical router ports, dhcp relays, etc. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalRouterPortStateTest() throws ApiException {
        String logicalRouterPortId = null;
        Long barrierId = null;
        String requestId = null;
        LogicalRouterPortState response = api.getLogicalRouterPortState(logicalRouterPortId, barrierId, requestId);

        // TODO: test validations
    }
    /**
     * Get the statistics of a specified logical router port on all or a specified node
     *
     * Returns the statistics for the Logical Router Port. If query parameter \&quot;transport_node_id&#x3D;&lt;transport-node-id&gt;\&quot; is given,  only the statistics from the given node for the logical router port will be returned. Otherwise the statistics from each node for the same logical router port will be returned. The transport_node_id is mandatory if the router port is not uplink type. The query parameter \&quot;source&#x3D;cached\&quot; will be ignored and it will always return realtime statistics of the logical router port. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalRouterPortStatisticsTest() throws ApiException {
        String logicalRouterPortId = null;
        String source = null;
        String transportNodeId = null;
        LogicalRouterPortStatistics response = api.getLogicalRouterPortStatistics(logicalRouterPortId, source, transportNodeId);

        // TODO: test validations
    }
    /**
     * Get the statistics summary of a specified logical router port
     *
     * Returns the summation of statistics from all nodes for the Specified Logical Router Port. The query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalRouterPortStatisticsSummaryTest() throws ApiException {
        String logicalRouterPortId = null;
        String source = null;
        LogicalRouterPortStatisticsSummary response = api.getLogicalRouterPortStatisticsSummary(logicalRouterPortId, source);

        // TODO: test validations
    }
    /**
     * List Logical Router Ports
     *
     * Returns information about all logical router ports. Information includes the resource_type (LogicalRouterUpLinkPort, LogicalRouterDownLinkPort, LogicalRouterLinkPort, LogicalRouterLoopbackPort, LogicalRouterCentralizedServicePort); logical_router_id (the router to which each logical router port is assigned); and any service_bindings (such as DHCP relay service). The GET request can include a query parameter (logical_router_id or logical_switch_id). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLogicalRouterPortsTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        String logicalRouterId = null;
        String logicalSwitchId = null;
        Long pageSize = null;
        String resourceType = null;
        Boolean sortAscending = null;
        String sortBy = null;
        LogicalRouterPortListResult response = api.listLogicalRouterPorts(cursor, includedFields, logicalRouterId, logicalSwitchId, pageSize, resourceType, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Read Logical Router Port
     *
     * Returns information about the specified logical router port.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readLogicalRouterPortTest() throws ApiException {
        String logicalRouterPortId = null;
        LogicalRouterPort response = api.readLogicalRouterPort(logicalRouterPortId);

        // TODO: test validations
    }
    /**
     * Update a Logical Router Port
     *
     * Modifies the specified logical router port. Required parameters include the resource_type and logical_router_id. Modifiable parameters include the resource_type (LogicalRouterUpLinkPort, LogicalRouterDownLinkPort, LogicalRouterLinkPort, LogicalRouterLoopbackPort, LogicalRouterCentralizedServicePort), logical_router_id (to reassign the port to a different router), and service_bindings. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLogicalRouterPortTest() throws ApiException {
        LogicalRouterPort body = null;
        String logicalRouterPortId = null;
        LogicalRouterPort response = api.updateLogicalRouterPort(body, logicalRouterPortId);

        // TODO: test validations
    }
}
