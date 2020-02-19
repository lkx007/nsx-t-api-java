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
import io.swagger.client.model.VirtualNetworkInterfaceListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiFabricVifsApi
 */
@Ignore
public class ManagementPlaneApiFabricVifsApiTest {

    private final ManagementPlaneApiFabricVifsApi api = new ManagementPlaneApiFabricVifsApi();

    /**
     * Return the List of Virtual Network Interfaces (VIFs)
     *
     * Returns information about all VIFs. A virtual network interface aggregates network interfaces into a logical interface unit that is indistinuishable from a physical network interface. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVifsTest() throws ApiException {
        String cursor = null;
        String hostId = null;
        String includedFields = null;
        String lportAttachmentId = null;
        String ownerVmId = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String vmId = null;
        VirtualNetworkInterfaceListResult response = api.listVifs(cursor, hostId, includedFields, lportAttachmentId, ownerVmId, pageSize, sortAscending, sortBy, vmId);

        // TODO: test validations
    }
}