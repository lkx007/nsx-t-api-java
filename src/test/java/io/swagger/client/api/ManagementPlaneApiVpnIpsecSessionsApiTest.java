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
import io.swagger.client.model.IPSecVPNSession;
import io.swagger.client.model.IPSecVPNSessionListResult;
import io.swagger.client.model.IPSecVPNSessionState;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiVpnIpsecSessionsApi
 */
@Ignore
public class ManagementPlaneApiVpnIpsecSessionsApiTest {

    private final ManagementPlaneApiVpnIpsecSessionsApi api = new ManagementPlaneApiVpnIpsecSessionsApi();

    /**
     * Create new VPN session
     *
     * Create new VPN session.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIPSecVPNSessionTest() throws ApiException {
        IPSecVPNSession body = null;
        IPSecVPNSession response = api.createIPSecVPNSession(body);

        // TODO: test validations
    }
    /**
     * Delete IPSec VPN session
     *
     * Delete IPSec VPN session.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIPSecVPNSessionTest() throws ApiException {
        String ipsecVpnSessionId = null;
        Boolean force = null;
        api.deleteIPSecVPNSession(ipsecVpnSessionId, force);

        // TODO: test validations
    }
    /**
     * Fetch IPSec VPN session
     *
     * Fetch IPSec VPN session.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPSecVPNSessionTest() throws ApiException {
        String ipsecVpnSessionId = null;
        IPSecVPNSession response = api.getIPSecVPNSession(ipsecVpnSessionId);

        // TODO: test validations
    }
    /**
     * Get the Realized State of a IPSec VPN Session
     *
     * Return realized state information of a ipsec vpn session. Any configuration update that affects the ipsec vpn session can use this API to get its realized state by passing a request_id returned by the configuration change operation. e.g. Update configuration of ipsec vpn session, service, endpoints, profiles, etc. It will return a service disabled error, if the ipsec vpn service associated with the session is disabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPSecVPNSessionStateTest() throws ApiException {
        String ipsecVpnSessionId = null;
        Long barrierId = null;
        String requestId = null;
        IPSecVPNSessionState response = api.getIPSecVPNSessionState(ipsecVpnSessionId, barrierId, requestId);

        // TODO: test validations
    }
    /**
     * Get VPN configuration for the peer site
     *
     * API to download VPN configuration for the peer site. The configuration contains pre-shared key and secret; be careful when sharing or storing it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPeerConfigTest() throws ApiException {
        String ipsecVpnSessionId = null;
        String response = api.getPeerConfig(ipsecVpnSessionId);

        // TODO: test validations
    }
    /**
     * Get IPSec VPN session list result
     *
     * Get paginated list of all IPSec VPN sessions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIPSecVPNSessionsTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        String ipsecVpnServiceId = null;
        String logicalRouterId = null;
        Long pageSize = null;
        String sessionType = null;
        Boolean sortAscending = null;
        String sortBy = null;
        IPSecVPNSessionListResult response = api.listIPSecVPNSessions(cursor, includedFields, ipsecVpnServiceId, logicalRouterId, pageSize, sessionType, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Edit IPSec VPN session
     *
     * Edit IPSec VPN session.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIPSecVPNSessionTest() throws ApiException {
        IPSecVPNSession body = null;
        String ipsecVpnSessionId = null;
        IPSecVPNSession response = api.updateIPSecVPNSession(body, ipsecVpnSessionId);

        // TODO: test validations
    }
}