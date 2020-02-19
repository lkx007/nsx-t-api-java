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
import io.swagger.client.model.LogicalPort;
import io.swagger.client.model.LogicalPortListResult;
import io.swagger.client.model.LogicalPortMacAddressCsvListResult;
import io.swagger.client.model.LogicalPortMacAddressListResult;
import io.swagger.client.model.LogicalPortOperationalStatus;
import io.swagger.client.model.LogicalPortState;
import io.swagger.client.model.LogicalPortStatistics;
import io.swagger.client.model.LogicalPortStatusSummary;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi
 */
@Ignore
public class ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApiTest {

    private final ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi api = new ManagementPlaneApiLogicalSwitchingLogicalSwitchPortsApi();

    /**
     * Create a Logical Port
     *
     * Creates a new logical switch port. The required parameters are the associated logical_switch_id and admin_state (UP or DOWN). Optional parameters are the attachment and switching_profile_ids. If you don&#x27;t specify switching_profile_ids, default switching profiles are assigned to the port. If you don&#x27;t specify an attachment, the switch port remains empty. To configure an attachment, you must specify an id, and optionally you can specify an attachment_type (VIF or LOGICALROUTER). The attachment_type is VIF by default. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLogicalPortTest() throws ApiException {
        LogicalPort body = null;
        LogicalPort response = api.createLogicalPort(body);

        // TODO: test validations
    }
    /**
     * Delete a Logical Port
     *
     * Deletes the specified logical switch port. By default, if logical port has attachments, or it is added to any NSGroup, the deletion will be failed. Option detach could be used for deleting logical port forcibly. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLogicalPortTest() throws ApiException {
        String lportId = null;
        Boolean detach = null;
        api.deleteLogicalPort(lportId, detach);

        // TODO: test validations
    }
    /**
     * Get Information About a Logical Port
     *
     * Returns information about a specified logical port.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalPortTest() throws ApiException {
        String lportId = null;
        LogicalPort response = api.getLogicalPort(lportId);

        // TODO: test validations
    }
    /**
     * Get MAC table of a logical port with a given port id (lport-id)
     *
     * Returns MAC table of a specified logical port. If the target transport node id is not provided, the NSX manager will ask the controller for the transport node where the logical port is located. The query parameter \&quot;source&#x3D;cached\&quot; is not supported. MAC table retrieval is not supported on logical ports that are attached to a logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalPortMacTableTest() throws ApiException {
        String lportId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String source = null;
        String transportNodeId = null;
        LogicalPortMacAddressListResult response = api.getLogicalPortMacTable(lportId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId);

        // TODO: test validations
    }
    /**
     * Get MAC table of a logical port with a given port id (lport-id)
     *
     * Returns MAC table in CSV format of a specified logical port. If the target transport node id is not provided, the NSX manager will ask the controller for the transport node where the logical port is located. The query parameter \&quot;source&#x3D;cached\&quot; is not supported. MAC table retrieval is not supported on logical ports that are attached to a logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalPortMacTableInCsvFormatCsvTest() throws ApiException {
        String lportId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String source = null;
        String transportNodeId = null;
        LogicalPortMacAddressCsvListResult response = api.getLogicalPortMacTableInCsvFormatCsv(lportId, cursor, includedFields, pageSize, sortAscending, sortBy, source, transportNodeId);

        // TODO: test validations
    }
    /**
     * Get Operational Status for Logical Port of a Given Port ID (lport-id)
     *
     * Returns operational status of a specified logical port.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalPortOperationalStatusTest() throws ApiException {
        String lportId = null;
        String source = null;
        LogicalPortOperationalStatus response = api.getLogicalPortOperationalStatus(lportId, source);

        // TODO: test validations
    }
    /**
     * Get realized state &amp; location of a logical port
     *
     * Returns transport node id for a specified logical port. Also returns information about all address bindings of the specified logical port. This includes address bindings discovered via various snooping methods like ARP snooping, DHCP snooping etc. and addressing bindings that are realized based on user configuration. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalPortStateTest() throws ApiException {
        String lportId = null;
        LogicalPortState response = api.getLogicalPortState(lportId);

        // TODO: test validations
    }
    /**
     * Get Statistics for Logical Port of a Given Port ID (lport-id)
     *
     * Returns statistics of a specified logical port. If the logical port is attached to a logical router port, query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalPortStatisticsTest() throws ApiException {
        String lportId = null;
        String source = null;
        LogicalPortStatistics response = api.getLogicalPortStatistics(lportId, source);

        // TODO: test validations
    }
    /**
     * Get Operational Status Summary of All Logical Ports in the System
     *
     * Returns operational status of all logical ports. The query parameter \&quot;source&#x3D;realtime\&quot; is not supported. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogicalPortStatusSummaryTest() throws ApiException {
        String attachmentId = null;
        String attachmentType = null;
        String bridgeClusterId = null;
        Boolean containerPortsOnly = null;
        String cursor = null;
        Boolean diagnostic = null;
        String includedFields = null;
        String logicalSwitchId = null;
        Long pageSize = null;
        String parentVifId = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String source = null;
        String switchingProfileId = null;
        String transportNodeId = null;
        String transportZoneId = null;
        LogicalPortStatusSummary response = api.getLogicalPortStatusSummary(attachmentId, attachmentType, bridgeClusterId, containerPortsOnly, cursor, diagnostic, includedFields, logicalSwitchId, pageSize, parentVifId, sortAscending, sortBy, source, switchingProfileId, transportNodeId, transportZoneId);

        // TODO: test validations
    }
    /**
     * List All Logical Ports
     *
     * Returns information about all configured logical switch ports. Logical switch ports connect to VM virtual network interface cards (NICs). Each logical port is associated with one logical switch. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLogicalPortsTest() throws ApiException {
        String attachmentId = null;
        String attachmentType = null;
        String bridgeClusterId = null;
        Boolean containerPortsOnly = null;
        String cursor = null;
        Boolean diagnostic = null;
        String includedFields = null;
        String logicalSwitchId = null;
        Long pageSize = null;
        String parentVifId = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String switchingProfileId = null;
        String transportNodeId = null;
        String transportZoneId = null;
        LogicalPortListResult response = api.listLogicalPorts(attachmentId, attachmentType, bridgeClusterId, containerPortsOnly, cursor, diagnostic, includedFields, logicalSwitchId, pageSize, parentVifId, sortAscending, sortBy, switchingProfileId, transportNodeId, transportZoneId);

        // TODO: test validations
    }
    /**
     * Update a Logical Port
     *
     * Modifies an existing logical switch port. Parameters that can be modified include attachment_type (LOGICALROUTER, VIF), admin_state (UP or DOWN), attachment id and switching_profile_ids. You cannot modify the logical_switch_id. In other words, you cannot move an existing port from one switch to another switch. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLogicalPortTest() throws ApiException {
        LogicalPort body = null;
        String lportId = null;
        LogicalPort response = api.updateLogicalPort(body, lportId);

        // TODO: test validations
    }
}