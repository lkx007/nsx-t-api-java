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
import io.swagger.client.model.IPSecVPNIKEProfile;
import io.swagger.client.model.IPSecVPNIKEProfileListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiVpnIpsecIkeProfilesApi
 */
@Ignore
public class ManagementPlaneApiVpnIpsecIkeProfilesApiTest {

    private final ManagementPlaneApiVpnIpsecIkeProfilesApi api = new ManagementPlaneApiVpnIpsecIkeProfilesApi();

    /**
     * Create custom internet key exchange (IKE) Profile
     *
     * Create custom internet key exchange (IKE) Profile. IKE Profile is a reusable profile that captures IKE and phase one negotiation parameters. System will be pre provisioned with system owned non editable default IKE profile and suggested set of profiles that can be used for peering with popular remote peers like AWS VPN. User can create custom profiles as needed. Any change in profile affects all sessions consuming this profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIPSecVPNIKEProfileTest() throws ApiException {
        IPSecVPNIKEProfile body = null;
        IPSecVPNIKEProfile response = api.createIPSecVPNIKEProfile(body);

        // TODO: test validations
    }
    /**
     * Delete custom IKE Profile
     *
     * Delete custom IKE Profile. Profile can not be deleted if profile has references to it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIPSecVPNIKEProfileTest() throws ApiException {
        String ipsecVpnIkeProfileId = null;
        Boolean force = null;
        api.deleteIPSecVPNIKEProfile(ipsecVpnIkeProfileId, force);

        // TODO: test validations
    }
    /**
     * Get IKE Profile
     *
     * Get custom IKE Profile, given the particular id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPSecVPNIKEProfileTest() throws ApiException {
        String ipsecVpnIkeProfileId = null;
        IPSecVPNIKEProfile response = api.getIPSecVPNIKEProfile(ipsecVpnIkeProfileId);

        // TODO: test validations
    }
    /**
     * List IKE profiles
     *
     * Get paginated list of all IKE Profiles.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIPSecVPNIKEProfilesTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        IPSecVPNIKEProfileListResult response = api.listIPSecVPNIKEProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Edit custom IKE Profile
     *
     * Edit custom IKE Profile. System owned profiles are non editable.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIPSecVPNIKEProfileTest() throws ApiException {
        IPSecVPNIKEProfile body = null;
        String ipsecVpnIkeProfileId = null;
        IPSecVPNIKEProfile response = api.updateIPSecVPNIKEProfile(body, ipsecVpnIkeProfileId);

        // TODO: test validations
    }
}