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
import io.swagger.client.model.BridgeEndpointProfile;
import io.swagger.client.model.BridgeEndpointProfileListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi
 */
@Ignore
public class ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApiTest {

    private final ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi api = new ManagementPlaneApiNetworkTransportBridgeEndpointProfilesApi();

    /**
     * Create a Bridge Endpoint Profile
     *
     * Creates a Bridge Endpoint Profile. Profile contains edge cluster id, indexes of the member nodes, fialover mode and high availability mode for a Bridge EndPoint 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBridgeEndpointProfileTest() throws ApiException {
        BridgeEndpointProfile body = null;
        BridgeEndpointProfile response = api.createBridgeEndpointProfile(body);

        // TODO: test validations
    }
    /**
     * Delete a Bridge Endpoint Profile
     *
     * Deletes the specified Bridge Endpoint Profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBridgeEndpointProfileTest() throws ApiException {
        String bridgeendpointprofileId = null;
        api.deleteBridgeEndpointProfile(bridgeendpointprofileId);

        // TODO: test validations
    }
    /**
     * Get Information about a bridge endpoint Profile
     *
     * Returns information about a specified bridge endpoint profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBridgeEndpointProfileTest() throws ApiException {
        String bridgeendpointprofileId = null;
        BridgeEndpointProfile response = api.getBridgeEndpointProfile(bridgeendpointprofileId);

        // TODO: test validations
    }
    /**
     * List All Bridge Endpoint Profiles
     *
     * Returns information about all configured bridge endoint profiles 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBridgeEndpointProfilesTest() throws ApiException {
        String cursor = null;
        String edgeClusterId = null;
        String failoverMode = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        BridgeEndpointProfileListResult response = api.listBridgeEndpointProfiles(cursor, edgeClusterId, failoverMode, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Update a Bridge Endpoint Profile
     *
     * Modifies a existing bridge endpoint profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBridgeEndpointProfileTest() throws ApiException {
        BridgeEndpointProfile body = null;
        String bridgeendpointprofileId = null;
        BridgeEndpointProfile response = api.updateBridgeEndpointProfile(body, bridgeendpointprofileId);

        // TODO: test validations
    }
}