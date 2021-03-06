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
import io.swagger.client.model.IPSecVPNPeerEndpoint;
import io.swagger.client.model.IPSecVPNPeerEndpointListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiVpnIpsecPeerEndpointsApi
 */
@Ignore
public class ManagementPlaneApiVpnIpsecPeerEndpointsApiTest {

    private final ManagementPlaneApiVpnIpsecPeerEndpointsApi api = new ManagementPlaneApiVpnIpsecPeerEndpointsApi();

    /**
     * Create custom peer endpoint
     *
     * Create custom IPSec peer endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIPSecVPNPeerEndPointTest() throws ApiException {
        IPSecVPNPeerEndpoint body = null;
        IPSecVPNPeerEndpoint response = api.createIPSecVPNPeerEndPoint(body);

        // TODO: test validations
    }
    /**
     * Delete custom IPSec VPN peer endpoint
     *
     * Delete custom IPSec VPN peer endpoint. All references are strong references and dependent peer endpoints can not be deleted if being referenced.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIPSecVPNPeerEndpointTest() throws ApiException {
        String ipsecVpnPeerEndpointId = null;
        Boolean force = null;
        api.deleteIPSecVPNPeerEndpoint(ipsecVpnPeerEndpointId, force);

        // TODO: test validations
    }
    /**
     * Get IPSec VPN peer endpoint
     *
     * Get custom IPSec VPN peer endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPSecVPNPeerEndpointTest() throws ApiException {
        String ipsecVpnPeerEndpointId = null;
        IPSecVPNPeerEndpoint response = api.getIPSecVPNPeerEndpoint(ipsecVpnPeerEndpointId);

        // TODO: test validations
    }
    /**
     * Get IPSec VPN peer endpoint with PSK
     *
     * Get custom IPSec VPN peer endpoint with PSK.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPSecVPNPeerEndpointWithPSKShowSensitiveDataTest() throws ApiException {
        String ipsecVpnPeerEndpointId = null;
        IPSecVPNPeerEndpoint response = api.getIPSecVPNPeerEndpointWithPSKShowSensitiveData(ipsecVpnPeerEndpointId);

        // TODO: test validations
    }
    /**
     * Get IPSecVPNPeerEndpoint List Result
     *
     * Get paginated list of all peer endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIPSecVPNPeerEndpointsTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        IPSecVPNPeerEndpointListResult response = api.listIPSecVPNPeerEndpoints(cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Edit custom IPSecPeerEndpoint
     *
     * Edit custom IPSec peer endpoint. System owned endpoints are non editable.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIPSecVPNPeerEndpointTest() throws ApiException {
        IPSecVPNPeerEndpoint body = null;
        String ipsecVpnPeerEndpointId = null;
        IPSecVPNPeerEndpoint response = api.updateIPSecVPNPeerEndpoint(body, ipsecVpnPeerEndpointId);

        // TODO: test validations
    }
}
