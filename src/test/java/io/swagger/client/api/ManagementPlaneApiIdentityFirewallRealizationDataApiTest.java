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
import io.swagger.client.model.IdfwNsgroupVmDetailListResult;
import io.swagger.client.model.IdfwSystemStats;
import io.swagger.client.model.IdfwUserSessionDataAndMappings;
import io.swagger.client.model.IdfwUserStats;
import io.swagger.client.model.IdfwVmStats;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiIdentityFirewallRealizationDataApi
 */
@Ignore
public class ManagementPlaneApiIdentityFirewallRealizationDataApiTest {

    private final ManagementPlaneApiIdentityFirewallRealizationDataApi api = new ManagementPlaneApiIdentityFirewallRealizationDataApi();

    /**
     * Get all IDFW NSGroup VM details for a given NSGroup
     *
     * Get all Identity Firewall NSGroup VM details for a given NSGroup.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNsgroupVmDetailsTest() throws ApiException {
        String groupId = null;
        IdfwNsgroupVmDetailListResult response = api.getNsgroupVmDetails(groupId);

        // TODO: test validations
    }
    /**
     * Get IDFW system statistics data
     *
     * Get IDFW system statistics data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSystemStatsTest() throws ApiException {
        IdfwSystemStats response = api.getSystemStats();

        // TODO: test validations
    }
    /**
     * Get IDFW user login events for a given user
     *
     * Get IDFW user login events for a given user (all active plus up to 5 most recent archived entries). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserStatsTest() throws ApiException {
        String userId = null;
        IdfwUserStats response = api.getUserStats(userId);

        // TODO: test validations
    }
    /**
     * Get IDFW user login events for a given VM
     *
     * Get IDFW user login events for a given VM (all active plus up to 5 most recent archived entries). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVmStatsTest() throws ApiException {
        String vmExtId = null;
        IdfwVmStats response = api.getVmStats(vmExtId);

        // TODO: test validations
    }
    /**
     * Get user session data
     *
     * Get user session data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUserSessionsTest() throws ApiException {
        IdfwUserSessionDataAndMappings response = api.listUserSessions();

        // TODO: test validations
    }
}