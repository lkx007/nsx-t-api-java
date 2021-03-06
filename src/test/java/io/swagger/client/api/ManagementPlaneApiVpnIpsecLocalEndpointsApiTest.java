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
import io.swagger.client.model.IPSecVPNLocalEndpoint;
import io.swagger.client.model.IPSecVPNLocalEndpointListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiVpnIpsecLocalEndpointsApi
 */
@Ignore
public class ManagementPlaneApiVpnIpsecLocalEndpointsApiTest {

    private final ManagementPlaneApiVpnIpsecLocalEndpointsApi api = new ManagementPlaneApiVpnIpsecLocalEndpointsApi();

    /**
     * Create custom local endpoint
     *
     * Create custom IPSec local endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIPSecVPNLocalEndpointTest() throws ApiException {
        IPSecVPNLocalEndpoint body = null;
        IPSecVPNLocalEndpoint response = api.createIPSecVPNLocalEndpoint(body);

        // TODO: test validations
    }
    /**
     * Delete custom IPSec local endpoint
     *
     * Delete custom IPSec local endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIPSecVPNLocalEndpointTest() throws ApiException {
        String ipsecVpnLocalEndpointId = null;
        Boolean force = null;
        api.deleteIPSecVPNLocalEndpoint(ipsecVpnLocalEndpointId, force);

        // TODO: test validations
    }
    /**
     * Get custom IPSec local endpoint
     *
     * Get custom IPSec local endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPSecVPNLocalEndpointTest() throws ApiException {
        String ipsecVpnLocalEndpointId = null;
        IPSecVPNLocalEndpoint response = api.getIPSecVPNLocalEndpoint(ipsecVpnLocalEndpointId);

        // TODO: test validations
    }
    /**
     * Get IPSec local endpoint list result
     *
     * Get paginated list of all local endpoints.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIPSecVPNLocalEndpointsTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        String ipsecVpnServiceId = null;
        String logicalRouterId = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        IPSecVPNLocalEndpointListResult response = api.listIPSecVPNLocalEndpoints(cursor, includedFields, ipsecVpnServiceId, logicalRouterId, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Edit custom IPSec local endpoint
     *
     * Edit custom IPSec local endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIPSecVPNLocalEndpointTest() throws ApiException {
        IPSecVPNLocalEndpoint body = null;
        String ipsecVpnLocalEndpointId = null;
        IPSecVPNLocalEndpoint response = api.updateIPSecVPNLocalEndpoint(body, ipsecVpnLocalEndpointId);

        // TODO: test validations
    }
}
