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
import io.swagger.client.model.IdfwComputeCollectionListResult;
import io.swagger.client.model.IdfwComputeCollectionStatus;
import io.swagger.client.model.IdfwTransportNodeStatusListResult;
import io.swagger.client.model.IdfwVirtualMachineStatusListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiIdentityFirewallMonitoringApi
 */
@Ignore
public class ManagementPlaneApiIdentityFirewallMonitoringApiTest {

    private final ManagementPlaneApiIdentityFirewallMonitoringApi api = new ManagementPlaneApiIdentityFirewallMonitoringApi();

    /**
     * Get list of compute collections and status.
     *
     * Retrieve the compute collection status by ID. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getComputeCollectionStatusByIdTest() throws ApiException {
        String computeCollectionExtId = null;
        IdfwComputeCollectionStatus response = api.getComputeCollectionStatusById(computeCollectionExtId);

        // TODO: test validations
    }
    /**
     * List all IDFW enabled ComputeCollection statuses.
     *
     * Retrieve all the Compute collection status. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listComputeCollectionStatusesTest() throws ApiException {
        IdfwComputeCollectionListResult response = api.listComputeCollectionStatuses();

        // TODO: test validations
    }
    /**
     * List all transport node and statuses based on idfw enabled ComputeCollection ID.
     *
     * Retrieve all the transport node and status by idfw enabled   ComputeCollection ID in the request. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransportNodeStatusesByComputeCollectionIdTest() throws ApiException {
        String ccExtId = null;
        IdfwTransportNodeStatusListResult response = api.listTransportNodeStatusesByComputeCollectionId(ccExtId);

        // TODO: test validations
    }
    /**
     * List all VM and statuses based on transport node ID of idfw enabled compute collection.
     *
     * Retrieve all the VM and status by transport node ID of idfw enabled compute collection in the request. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVirtualMachineStatusesByTransportNodeIdTest() throws ApiException {
        String transportNodeId = null;
        IdfwVirtualMachineStatusListResult response = api.listVirtualMachineStatusesByTransportNodeId(transportNodeId);

        // TODO: test validations
    }
}
