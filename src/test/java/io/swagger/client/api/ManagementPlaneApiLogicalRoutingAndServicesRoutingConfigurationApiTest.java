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
import io.swagger.client.model.AdvertiseRuleList;
import io.swagger.client.model.AdvertisementConfig;
import io.swagger.client.model.ApiError;
import io.swagger.client.model.BGPCommunityList;
import io.swagger.client.model.BGPCommunityListListResult;
import io.swagger.client.model.BgpConfig;
import io.swagger.client.model.BgpNeighbor;
import io.swagger.client.model.BgpNeighborListResult;
import io.swagger.client.model.DADProfile;
import io.swagger.client.model.DADProfileListResult;
import io.swagger.client.model.IPPrefixList;
import io.swagger.client.model.IPPrefixListListResult;
import io.swagger.client.model.NDRAProfile;
import io.swagger.client.model.NDRAProfileListResult;
import io.swagger.client.model.RedistributionConfig;
import io.swagger.client.model.RedistributionRuleList;
import io.swagger.client.model.RouteMap;
import io.swagger.client.model.RouteMapListResult;
import io.swagger.client.model.RoutingConfig;
import io.swagger.client.model.StaticRoute;
import io.swagger.client.model.StaticRouteListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi
 */
@Ignore
public class ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApiTest {

    private final ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi api = new ManagementPlaneApiLogicalRoutingAndServicesRoutingConfigurationApi();

    /**
     * Add a new BGP Neighbor on a Logical Router
     *
     * Add a new BGP Neighbor on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBgpNeighborTest() throws ApiException {
        BgpNeighbor body = null;
        String logicalRouterId = null;
        BgpNeighbor response = api.addBgpNeighbor(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Add IPPrefixList on a Logical Router
     *
     * Adds a new IPPrefixList on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addIPPrefixListTest() throws ApiException {
        IPPrefixList body = null;
        String logicalRouterId = null;
        IPPrefixList response = api.addIPPrefixList(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Add RouteMap on a Logical Router
     *
     * Adds a new RouteMap on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRouteMapTest() throws ApiException {
        RouteMap body = null;
        String logicalRouterId = null;
        RouteMap response = api.addRouteMap(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Add Static Routes on a Logical Router
     *
     * Adds a new static route on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStaticRouteTest() throws ApiException {
        StaticRoute body = null;
        String logicalRouterId = null;
        StaticRoute response = api.addStaticRoute(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Create a new BGP community list on a Logical Router
     *
     * Add a new BGP Community List on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBGPCommunityListTest() throws ApiException {
        BGPCommunityList body = null;
        String logicalRouterId = null;
        BGPCommunityList response = api.createBGPCommunityList(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Create a new DADProfile
     *
     * Adds a new DADProfile 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDADProfileTest() throws ApiException {
        DADProfile body = null;
        DADProfile response = api.createDADProfile(body);

        // TODO: test validations
    }
    /**
     * Create a new NDRA Profile
     *
     * Adds a new NDRAProfile 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNDRAProfileTest() throws ApiException {
        NDRAProfile body = null;
        NDRAProfile response = api.createNDRAProfile(body);

        // TODO: test validations
    }
    /**
     * Delete a specific BGP community list from a Logical Router
     *
     * Delete a specific BGP community list from a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBGPCommunityListTest() throws ApiException {
        String logicalRouterId = null;
        String communityListId = null;
        api.deleteBGPCommunityList(logicalRouterId, communityListId);

        // TODO: test validations
    }
    /**
     * Delete a specific BGP Neighbor on a Logical Router
     *
     * Delete a specific BGP Neighbor on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBgpNeighborTest() throws ApiException {
        String logicalRouterId = null;
        String id = null;
        api.deleteBgpNeighbor(logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Delete DAD Profile
     *
     * Delete DADProfile 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDADProfileTest() throws ApiException {
        String dadProfileId = null;
        api.deleteDADProfile(dadProfileId);

        // TODO: test validations
    }
    /**
     * Delete a specific IPPrefixList on a Logical Router
     *
     * Deletes a specific IPPrefixList on the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIPPrefixListTest() throws ApiException {
        String logicalRouterId = null;
        String id = null;
        api.deleteIPPrefixList(logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Delete NDRA Profile
     *
     * Delete NDRAProfile 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNDRAProfileTest() throws ApiException {
        String ndRaProfileId = null;
        api.deleteNDRAProfile(ndRaProfileId);

        // TODO: test validations
    }
    /**
     * Delete a specific RouteMap on a Logical Router
     *
     * Deletes a specific RouteMap on the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRouteMapTest() throws ApiException {
        String logicalRouterId = null;
        String id = null;
        api.deleteRouteMap(logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Delete a specific Static Route on a Logical Router
     *
     * Deletes a specific static route on the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteStaticRouteTest() throws ApiException {
        String logicalRouterId = null;
        String id = null;
        api.deleteStaticRoute(logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Paginated list of BGP community lists on a Logical Router
     *
     * Paginated list of BGP Community Lists on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBGPCommunityListsTest() throws ApiException {
        String logicalRouterId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        BGPCommunityListListResult response = api.listBGPCommunityLists(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Paginated list of BGP Neighbors on a Logical Router
     *
     * Paginated list of BGP Neighbors on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBgpNeighborsTest() throws ApiException {
        String logicalRouterId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        BgpNeighborListResult response = api.listBgpNeighbors(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Read All IPV6 DADProfiles
     *
     * Returns all IPv6 DADProfiles. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDADProfilesTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        DADProfileListResult response = api.listDADProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Paginated List of IPPrefixLists
     *
     * Paginated List of IPPrefixLists
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIPPrefixListsTest() throws ApiException {
        String logicalRouterId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        IPPrefixListListResult response = api.listIPPrefixLists(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Read All IPV6 NDRA Profiles
     *
     * Returns all IPv6 NDRA Profiles. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNDRAProfilesTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        NDRAProfileListResult response = api.listNDRAProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Paginated List of RouteMaps
     *
     * Paginated List of RouteMaps
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRouteMapsTest() throws ApiException {
        String logicalRouterId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        RouteMapListResult response = api.listRouteMaps(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Paginated List of Static Routes
     *
     * Returns information about configured static routes, including the network address and next hops for each static route. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listStaticRoutesTest() throws ApiException {
        String logicalRouterId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        StaticRouteListResult response = api.listStaticRoutes(logicalRouterId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Read the Advertisement Rules on a Logical Router
     *
     * Returns the advertisement rule list for the specified TIER1 logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAdvertiseRuleListTest() throws ApiException {
        String logicalRouterId = null;
        AdvertiseRuleList response = api.readAdvertiseRuleList(logicalRouterId);

        // TODO: test validations
    }
    /**
     * Read the Advertisement Configuration on a Logical Router
     *
     * Returns information about the routes to be advertised by the specified TIER1 logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAdvertisementConfigTest() throws ApiException {
        String logicalRouterId = null;
        AdvertisementConfig response = api.readAdvertisementConfig(logicalRouterId);

        // TODO: test validations
    }
    /**
     * Read a specific BGP community list from a Logical Router
     *
     * Read a specific BGP community list from a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBGPCommunityListTest() throws ApiException {
        String logicalRouterId = null;
        String communityListId = null;
        BGPCommunityList response = api.readBGPCommunityList(logicalRouterId, communityListId);

        // TODO: test validations
    }
    /**
     * Read the BGP Configuration on a Logical Router
     *
     * Returns information about the BGP configuration on a specified logical router. Information includes whether or not the BGP configuration is enabled, the AS number, and whether or not graceful restart is enabled. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBgpConfigTest() throws ApiException {
        String logicalRouterId = null;
        BgpConfig response = api.readBgpConfig(logicalRouterId);

        // TODO: test validations
    }
    /**
     * Read a specific BGP Neighbor on a Logical Router
     *
     * Read a specific BGP Neighbor on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBgpNeighborTest() throws ApiException {
        String logicalRouterId = null;
        String id = null;
        BgpNeighbor response = api.readBgpNeighbor(logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Read a specific BGP Neighbor with password on a Logical Router
     *
     * Read a specific BGP Neighbor details with password on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBgpNeighborWithPasswordShowSensitiveDataTest() throws ApiException {
        String logicalRouterId = null;
        String id = null;
        BgpNeighbor response = api.readBgpNeighborWithPasswordShowSensitiveData(logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Read specified IPV6 DADProfile
     *
     * Returns information about specified IPv6 DADProfile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readDADProfileTest() throws ApiException {
        String dadProfileId = null;
        DADProfile response = api.readDADProfile(dadProfileId);

        // TODO: test validations
    }
    /**
     * Read the debug information for the logical router
     *
     * API to download below information as text which will be used for debugging and troubleshooting. 1) Logical router sub-components and ports. 2) Routing configuration as sent to central control plane. 3) TIER1 advertised network information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readDebugInfoTextTest() throws ApiException {
        String logicalRouterId = null;
        String response = api.readDebugInfoText(logicalRouterId);

        // TODO: test validations
    }
    /**
     * Get a specific IPPrefixList on a Logical Router
     *
     * Read a specific IPPrefixList on the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readIPPrefixListTest() throws ApiException {
        String logicalRouterId = null;
        String id = null;
        IPPrefixList response = api.readIPPrefixList(logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Read specified IPV6 NDRA Profile
     *
     * Returns information about specified IPv6 NDRA Profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNDRAProfileTest() throws ApiException {
        String ndRaProfileId = null;
        NDRAProfile response = api.readNDRAProfile(ndRaProfileId);

        // TODO: test validations
    }
    /**
     * Read the Redistribution Configuration on a Logical Router
     *
     * Returns information about configured route redistribution for the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readRedistributionConfigTest() throws ApiException {
        String logicalRouterId = null;
        RedistributionConfig response = api.readRedistributionConfig(logicalRouterId);

        // TODO: test validations
    }
    /**
     * Read All the Redistribution Rules on a Logical Router
     *
     * Returns all the route redistribution rules for the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readRedistributionRuleListTest() throws ApiException {
        String logicalRouterId = null;
        RedistributionRuleList response = api.readRedistributionRuleList(logicalRouterId);

        // TODO: test validations
    }
    /**
     * Get a specific RouteMap on a Logical Router
     *
     * Read a specific RouteMap on the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readRouteMapTest() throws ApiException {
        String logicalRouterId = null;
        String id = null;
        RouteMap response = api.readRouteMap(logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Read the Routing Configuration
     *
     * Returns the routing configuration for a specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readRoutingConfigTest() throws ApiException {
        String logicalRouterId = null;
        RoutingConfig response = api.readRoutingConfig(logicalRouterId);

        // TODO: test validations
    }
    /**
     * Get a specific Static Route on a Logical Router
     *
     * Read a specific static routes on the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readStaticRouteTest() throws ApiException {
        String logicalRouterId = null;
        String id = null;
        StaticRoute response = api.readStaticRoute(logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Unset/Delete password property on specific BGP Neighbor on Logical Router
     *
     * Unset/Delete the password property on the specific BGP Neighbor. No other property of the BgpNeighbor can be updated using this API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unSetPasswordOnBgpNeighborTest() throws ApiException {
        String logicalRouterId = null;
        String id = null;
        String action = null;
        BgpNeighbor response = api.unSetPasswordOnBgpNeighbor(logicalRouterId, id, action);

        // TODO: test validations
    }
    /**
     * Update the Advertisement Rules on a Logical Router
     *
     * Modifies the advertisement rules on the specified logical router. The PUT request must include all the rules with the networks parameter. Modifiable parameters are networks, display_name, and description. Set the rules list to empty to delete/clear all rules. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAdvertiseRuleListTest() throws ApiException {
        AdvertiseRuleList body = null;
        String logicalRouterId = null;
        AdvertiseRuleList response = api.updateAdvertiseRuleList(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Update the Advertisement Configuration on a Logical Router
     *
     * Modifies the route advertisement configuration on the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAdvertisementConfigTest() throws ApiException {
        AdvertisementConfig body = null;
        String logicalRouterId = null;
        AdvertisementConfig response = api.updateAdvertisementConfig(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Update a specific BGP community list from a Logical Router
     *
     * Update a specific BGP community list from a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBGPCommunityListTest() throws ApiException {
        BGPCommunityList body = null;
        String logicalRouterId = null;
        String communityListId = null;
        BGPCommunityList response = api.updateBGPCommunityList(body, logicalRouterId, communityListId);

        // TODO: test validations
    }
    /**
     * Update a specific BGP community list from a Logical Router
     *
     * Update a specific BGP community list from a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBGPCommunityListOldTest() throws ApiException {
        BGPCommunityList body = null;
        String logicalRouterId = null;
        String communityListId = null;
        BGPCommunityList response = api.updateBGPCommunityListOld(body, logicalRouterId, communityListId);

        // TODO: test validations
    }
    /**
     * Update the BGP Configuration on a Logical Router
     *
     * Modifies the BGP configuration on a specified TIER0 logical router. Modifiable parameters include enabled, graceful_restart, as_number. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBgpConfigTest() throws ApiException {
        BgpConfig body = null;
        String logicalRouterId = null;
        BgpConfig response = api.updateBgpConfig(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Update a specific BGP Neighbor on a Logical Router
     *
     * Update a specific BGP Neighbor on a Logical Router 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBgpNeighborTest() throws ApiException {
        BgpNeighbor body = null;
        String logicalRouterId = null;
        String id = null;
        BgpNeighbor response = api.updateBgpNeighbor(body, logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Update DADProfile
     *
     * Update DADProfile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDADProfileTest() throws ApiException {
        DADProfile body = null;
        String dadProfileId = null;
        DADProfile response = api.updateDADProfile(body, dadProfileId);

        // TODO: test validations
    }
    /**
     * Update a specific IPPrefixList on a Logical Router
     *
     * Update a specific IPPrefixList on the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIPPrefixListTest() throws ApiException {
        IPPrefixList body = null;
        String logicalRouterId = null;
        String id = null;
        IPPrefixList response = api.updateIPPrefixList(body, logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Update NDRA Profile
     *
     * Update NDRAProfile 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNDRAProfileTest() throws ApiException {
        NDRAProfile body = null;
        String ndRaProfileId = null;
        NDRAProfile response = api.updateNDRAProfile(body, ndRaProfileId);

        // TODO: test validations
    }
    /**
     * Update the Redistribution Configuration on a Logical Router
     *
     * Modifies existing route redistribution rules for the specified TIER0 logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRedistributionConfigTest() throws ApiException {
        RedistributionConfig body = null;
        String logicalRouterId = null;
        RedistributionConfig response = api.updateRedistributionConfig(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Update All the Redistribution Rules on a Logical Router
     *
     * Modifies all route redistribution rules for the specified TIER0 logical router. Set the rules list to empty to delete/clear all rules. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRedistributionRuleListTest() throws ApiException {
        RedistributionRuleList body = null;
        String logicalRouterId = null;
        RedistributionRuleList response = api.updateRedistributionRuleList(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Update a specific RouteMap on a Logical Router
     *
     * Update a specific RouteMap on the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRouteMapTest() throws ApiException {
        RouteMap body = null;
        String logicalRouterId = null;
        String id = null;
        RouteMap response = api.updateRouteMap(body, logicalRouterId, id);

        // TODO: test validations
    }
    /**
     * Update the Routing Configuration
     *
     * Modifies the routing configuration for a specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRoutingConfigTest() throws ApiException {
        RoutingConfig body = null;
        String logicalRouterId = null;
        RoutingConfig response = api.updateRoutingConfig(body, logicalRouterId);

        // TODO: test validations
    }
    /**
     * Update a specific Static Route Rule on a Logical Router
     *
     * Update a specific static route on the specified logical router. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStaticRouteTest() throws ApiException {
        StaticRoute body = null;
        String logicalRouterId = null;
        String id = null;
        StaticRoute response = api.updateStaticRoute(body, logicalRouterId, id);

        // TODO: test validations
    }
}