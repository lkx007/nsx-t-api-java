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
import io.swagger.client.model.IPSecVPNService;
import io.swagger.client.model.IPSecVPNServiceListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiVpnIpsecServicesApi
 */
@Ignore
public class ManagementPlaneApiVpnIpsecServicesApiTest {

    private final ManagementPlaneApiVpnIpsecServicesApi api = new ManagementPlaneApiVpnIpsecServicesApi();

    /**
     * Create VPN service
     *
     * Create VPN service for given logical router.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIPSecVPNServiceTest() throws ApiException {
        IPSecVPNService body = null;
        IPSecVPNService response = api.createIPSecVPNService(body);

        // TODO: test validations
    }
    /**
     * Delete IPSec VPN service
     *
     * Delete IPSec VPN service for given router.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIPSecVPNServiceTest() throws ApiException {
        String ipsecVpnServiceId = null;
        Boolean force = null;
        api.deleteIPSecVPNService(ipsecVpnServiceId, force);

        // TODO: test validations
    }
    /**
     * Get IPSec VPN service
     *
     * Get IPSec VPN service for given logical router.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPSecVPNServiceTest() throws ApiException {
        String ipsecVpnServiceId = null;
        IPSecVPNService response = api.getIPSecVPNService(ipsecVpnServiceId);

        // TODO: test validations
    }
    /**
     * Get IPSec VPN service list result
     *
     * Get paginated list of all IPSec VPN services.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIPSecVPNServicesTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        IPSecVPNServiceListResult response = api.listIPSecVPNServices(cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Edit IPSec VPN service
     *
     * Edit IPSec VPN service for given logical router.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIPSecVPNServiceTest() throws ApiException {
        IPSecVPNService body = null;
        String ipsecVpnServiceId = null;
        IPSecVPNService response = api.updateIPSecVPNService(body, ipsecVpnServiceId);

        // TODO: test validations
    }
}
