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
import io.swagger.client.model.IPSecVPNDPDProfile;
import io.swagger.client.model.IPSecVPNDPDProfileListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiVpnIpsecDpdProfilesApi
 */
@Ignore
public class ManagementPlaneApiVpnIpsecDpdProfilesApiTest {

    private final ManagementPlaneApiVpnIpsecDpdProfilesApi api = new ManagementPlaneApiVpnIpsecDpdProfilesApi();

    /**
     * Create dead peer detection (DPD) profile
     *
     * Create dead peer detection (DPD) profile. Any change in profile affects all sessions consuming this profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIPSecVPNDPDProfileTest() throws ApiException {
        IPSecVPNDPDProfile body = null;
        IPSecVPNDPDProfile response = api.createIPSecVPNDPDProfile(body);

        // TODO: test validations
    }
    /**
     * Delete dead peer detection (DPD) profile
     *
     * Delete dead peer detection (DPD) profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIPSecVPNDPDProfileTest() throws ApiException {
        String ipsecVpnDpdProfileId = null;
        Boolean force = null;
        api.deleteIPSecVPNDPDProfile(ipsecVpnDpdProfileId, force);

        // TODO: test validations
    }
    /**
     * Get IPSec dead peer detection (DPD) profile
     *
     * Get IPSec dead peer detection (DPD) profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPSecVPNDPDProfileTest() throws ApiException {
        String ipsecVpnDpdProfileId = null;
        IPSecVPNDPDProfile response = api.getIPSecVPNDPDProfile(ipsecVpnDpdProfileId);

        // TODO: test validations
    }
    /**
     * Get IPSec dead peer detection (DPD)  profile list result
     *
     * Get paginated list of all dead peer detection (DPD) profiles.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIPSecVPNDPDProfilesTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        IPSecVPNDPDProfileListResult response = api.listIPSecVPNDPDProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Edit IPSec dead peer detection (DPD) profile
     *
     * Edit IPSec dead peer detection (DPD) profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIPSecVPNDPDProfileTest() throws ApiException {
        IPSecVPNDPDProfile body = null;
        String ipsecVpnDpdProfileId = null;
        IPSecVPNDPDProfile response = api.updateIPSecVPNDPDProfile(body, ipsecVpnDpdProfileId);

        // TODO: test validations
    }
}