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
import io.swagger.client.model.BaseSwitchingProfile;
import io.swagger.client.model.SwitchingProfileStatus;
import io.swagger.client.model.SwitchingProfilesListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi
 */
@Ignore
public class ManagementPlaneApiLogicalSwitchingSwitchingProfilesApiTest {

    private final ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi api = new ManagementPlaneApiLogicalSwitchingSwitchingProfilesApi();

    /**
     * Create a Switching Profile
     *
     * Creates a new, custom qos, port-mirroring, spoof-guard or port-security switching profile. You can override their default switching profile assignments by creating a new switching profile and assigning it to one or more logical switches. You cannot override the default ipfix or ip_discovery switching profiles. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSwitchingProfileTest() throws ApiException {
        BaseSwitchingProfile body = null;
        BaseSwitchingProfile response = api.createSwitchingProfile(body);

        // TODO: test validations
    }
    /**
     * Delete a Switching Profile
     *
     * Deletes the specified switching profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSwitchingProfileTest() throws ApiException {
        String switchingProfileId = null;
        Boolean unbind = null;
        api.deleteSwitchingProfile(switchingProfileId, unbind);

        // TODO: test validations
    }
    /**
     * Get Switching Profile by ID
     *
     * Returns information about a specified switching profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSwitchingProfileTest() throws ApiException {
        String switchingProfileId = null;
        BaseSwitchingProfile response = api.getSwitchingProfile(switchingProfileId);

        // TODO: test validations
    }
    /**
     * Get Counts of Ports and Switches Using This Switching Profile
     *
     * Get Counts of Ports and Switches Using This Switching Profile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSwitchingProfileStatusTest() throws ApiException {
        String switchingProfileId = null;
        SwitchingProfileStatus response = api.getSwitchingProfileStatus(switchingProfileId);

        // TODO: test validations
    }
    /**
     * List Switching Profiles
     *
     * Returns information about the system-default and user-configured switching profiles. Each switching profile has a unique ID, a display name, and various other read-only and configurable properties. The default switching profiles are assigned automatically to each switch. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSwitchingProfilesTest() throws ApiException {
        String cursor = null;
        Boolean includeSystemOwned = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        String switchingProfileType = null;
        SwitchingProfilesListResult response = api.listSwitchingProfiles(cursor, includeSystemOwned, includedFields, pageSize, sortAscending, sortBy, switchingProfileType);

        // TODO: test validations
    }
    /**
     * Update a Switching Profile
     *
     * Updates the user-configurable parameters of a switching profile. Only the qos, port-mirroring, spoof-guard and port-security switching profiles can be modified. You cannot modify the ipfix or ip-discovery switching profiles. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSwitchingProfileTest() throws ApiException {
        BaseSwitchingProfile body = null;
        String switchingProfileId = null;
        BaseSwitchingProfile response = api.updateSwitchingProfile(body, switchingProfileId);

        // TODO: test validations
    }
}
