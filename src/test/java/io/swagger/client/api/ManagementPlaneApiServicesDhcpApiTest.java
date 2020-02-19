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
import io.swagger.client.model.ConfigurationState;
import io.swagger.client.model.DhcpIpPool;
import io.swagger.client.model.DhcpIpPoolListResult;
import io.swagger.client.model.DhcpLeases;
import io.swagger.client.model.DhcpProfile;
import io.swagger.client.model.DhcpProfileListResult;
import io.swagger.client.model.DhcpServerStatus;
import io.swagger.client.model.DhcpStaticBinding;
import io.swagger.client.model.DhcpStaticBindingListResult;
import io.swagger.client.model.DhcpStatistics;
import io.swagger.client.model.LogicalDhcpServer;
import io.swagger.client.model.LogicalDhcpServerListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiServicesDhcpApi
 */
@Ignore
public class ManagementPlaneApiServicesDhcpApiTest {

    private final ManagementPlaneApiServicesDhcpApi api = new ManagementPlaneApiServicesDhcpApi();

    /**
     * Create an ip pool for a DHCP server
     *
     * Create an ip pool for a local DHCP server
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDhcpIpPoolTest() throws ApiException {
        DhcpIpPool body = null;
        String serverId = null;
        DhcpIpPool response = api.createDhcpIpPool(body, serverId);

        // TODO: test validations
    }
    /**
     * Create a DHCP server profile
     *
     * Create a DHCP server profile. If no edge member is specified, edge members to run the dhcp servers will be auto-allocated from the edge cluster. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDhcpProfileTest() throws ApiException {
        DhcpProfile body = null;
        DhcpProfile response = api.createDhcpProfile(body);

        // TODO: test validations
    }
    /**
     * Create a DHCP server
     *
     * Create a logical DHCP server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDhcpServerTest() throws ApiException {
        LogicalDhcpServer body = null;
        LogicalDhcpServer response = api.createDhcpServer(body);

        // TODO: test validations
    }
    /**
     * Create a static binding for a DHCP server
     *
     * Create a static binding for a logical DHCP server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDhcpStaticBindingTest() throws ApiException {
        DhcpStaticBinding body = null;
        String serverId = null;
        DhcpStaticBinding response = api.createDhcpStaticBinding(body, serverId);

        // TODO: test validations
    }
    /**
     * Delete a single DHCP lease entry specified by ip and mac.
     *
     * Delete a single DHCP lease entry specified by ip and mac.  The DHCP server matches the DHCP lease with the given ip address and the mac address. The matched lease entry will be deleted. If no lease matches, the request is ignored.  The DHCP lease to be deleted will be removed by the system from both active and standby node. The system will report error if the DHCP lease could not be removed from both nodes. If the DHCP lease could not be removed on either node, please check the DHCP server status. Once the DHCP server status is UP, please invoke the deletion API again to ensure the lease gets deleted from both nodes. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteADhcpLeaseTest() throws ApiException {
        String serverId = null;
        String ip = null;
        String mac = null;
        api.deleteADhcpLease(serverId, ip, mac);

        // TODO: test validations
    }
    /**
     * Delete a DHCP server&#x27;s IP pool
     *
     * Delete a specific ip pool of a given logical DHCP server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDhcpIpPoolTest() throws ApiException {
        String serverId = null;
        String poolId = null;
        api.deleteDhcpIpPool(serverId, poolId);

        // TODO: test validations
    }
    /**
     * Delete a DHCP server profile
     *
     * Delete a DHCP server profile specified by the profile id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDhcpProfileTest() throws ApiException {
        String profileId = null;
        api.deleteDhcpProfile(profileId);

        // TODO: test validations
    }
    /**
     * Delete a DHCP server
     *
     * Delete a logical DHCP server specified by server id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDhcpServerTest() throws ApiException {
        String serverId = null;
        api.deleteDhcpServer(serverId);

        // TODO: test validations
    }
    /**
     * Delete a static binding
     *
     * Delete a specific static binding of a given logical DHCP server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDhcpStaticBindingTest() throws ApiException {
        String serverId = null;
        String bindingId = null;
        api.deleteDhcpStaticBinding(serverId, bindingId);

        // TODO: test validations
    }
    /**
     * Get the realized state of a dhcp ip pool
     *
     * Return realized state information of a dhcp ip pool. After a dhcp ip pool is created or updated, you can invoke this API to get the realization information of the ip pool. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDhcpIpPoolStateTest() throws ApiException {
        String serverId = null;
        String poolId = null;
        Long barrierId = null;
        String requestId = null;
        ConfigurationState response = api.getDhcpIpPoolState(serverId, poolId, barrierId, requestId);

        // TODO: test validations
    }
    /**
     * Get specific leases of a given dhcp server
     *
     * Get specific leases of a given dhcp server. As a dhcp server could manage millions of leases, the API has to limit the number of the returned leases via two mutually-excluded request parameters, i.e. \&quot;pool_id\&quot; and \&quot;address\&quot;. Either a \&quot;pool_id\&quot; or an \&quot;address\&quot; can be provided, but not both in a same call.  If a \&quot;pool_id\&quot; is specified, the leases of the specific pool are returned. If an \&quot;address\&quot; is specified, only the lease(s) represented y this address is(are) returned. The \&quot;address\&quot; can be a single IP, an ip-range, or a mac address. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDhcpLeaseInfoTest() throws ApiException {
        String serverId = null;
        String address = null;
        String poolId = null;
        String source = null;
        DhcpLeases response = api.getDhcpLeaseInfo(serverId, address, poolId, source);

        // TODO: test validations
    }
    /**
     * Get the realized state of a dhcp server
     *
     * Return realized state information of a dhcp server. After a dhcp server is created or updated, you can invoke this API to get the realization information of the server. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDhcpServerStateTest() throws ApiException {
        String serverId = null;
        Long barrierId = null;
        String requestId = null;
        ConfigurationState response = api.getDhcpServerState(serverId, barrierId, requestId);

        // TODO: test validations
    }
    /**
     * Get the realized state of a dhcp static binding
     *
     * Return realized state information of a dhcp static binding. After a dhcp static binding is created or updated, you can invoke this API to get the realization information of the static binding. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDhcpStaticBindingStateTest() throws ApiException {
        String serverId = null;
        String bindingId = null;
        Long barrierId = null;
        String requestId = null;
        ConfigurationState response = api.getDhcpStaticBindingState(serverId, bindingId, barrierId, requestId);

        // TODO: test validations
    }
    /**
     * Get DHCP statistics with given dhcp server id
     *
     * Returns the statistics of the given dhcp server. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDhcpStatisticsTest() throws ApiException {
        String serverId = null;
        DhcpStatistics response = api.getDhcpStatistics(serverId);

        // TODO: test validations
    }
    /**
     * Get DHCP service status with given dhcp server id
     *
     * Returns the service status of the given dhcp server. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDhcpStatusTest() throws ApiException {
        String serverId = null;
        DhcpServerStatus response = api.getDhcpStatus(serverId);

        // TODO: test validations
    }
    /**
     * Get a paginated list of a DHCP server&#x27;s IP pools
     *
     * List the ip pools of a logical DHCP server with pagination support. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDhcpIpPoolsTest() throws ApiException {
        String serverId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        DhcpIpPoolListResult response = api.listDhcpIpPools(serverId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get a paginated list of DHCP server profiles
     *
     * Get a paginated list of DHCP server profiles.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDhcpProfilesTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        DhcpProfileListResult response = api.listDhcpProfiles(cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get a paginated list of DHCP servers
     *
     * List logical DHCP servers with pagination support.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDhcpServersTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        LogicalDhcpServerListResult response = api.listDhcpServers(cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get a paginated list of a DHCP server&#x27;s static bindings
     *
     * Return a paginated list of a static bindings of a given logical DHCP server. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDhcpStaticBindingsTest() throws ApiException {
        String serverId = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        DhcpStaticBindingListResult response = api.listDhcpStaticBindings(serverId, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get a DHCP server&#x27;s IP pool with the specified pool ID
     *
     * Return a specific ip pool of a given logical DHCP server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readDhcpIpPoolTest() throws ApiException {
        String serverId = null;
        String poolId = null;
        DhcpIpPool response = api.readDhcpIpPool(serverId, poolId);

        // TODO: test validations
    }
    /**
     * Get a DHCP server profile
     *
     * Return the DHCP profile specified by the profile id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readDhcpProfileTest() throws ApiException {
        String profileId = null;
        DhcpProfile response = api.readDhcpProfile(profileId);

        // TODO: test validations
    }
    /**
     * Get a DHCP server
     *
     * Retrieve a logical DHCP server specified by server id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readDhcpServerTest() throws ApiException {
        String serverId = null;
        LogicalDhcpServer response = api.readDhcpServer(serverId);

        // TODO: test validations
    }
    /**
     * Get a DHCP server&#x27;s static binding with the specified binding ID
     *
     * Return a specific static binding of a given logical DHCP server. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readDhcpStaticBindingTest() throws ApiException {
        String serverId = null;
        String bindingId = null;
        DhcpStaticBinding response = api.readDhcpStaticBinding(serverId, bindingId);

        // TODO: test validations
    }
    /**
     * Reallocate edge cluster and members of given DHCP profile.
     *
     * As changing edge-cluster-id of a DhcpProfile by a PUT is disallowed, this re-allocate API is used to modify the edge-cluster-id and members of a given DhcpProfile.  Only the edge-cluster-id and the edge-cluster-member-indexes fields will be picked up by this re-allication API. The othere fields in the payload will be ignored.  If the edge-cluster-id in the payload DhcpProfile is different from the current edge-cluster-id of the profile, the referencing DHCP server(s) will be re-allocated to the new edge cluster. If the edge-cluster-id is not changed, the referencing DHCP server(s) will be re-allocated to the given edge members in the edge cluster. In this case, this REST API will act same as that of updating a DhcpProfile.  If the edge cluster member indexes are provided, they should exist in the given edge cluster. If the indexes are not specified in the DhcpProfile, edge members will be auto-allocated from the given edge cluster.  Please note that re-allocating edge-cluster will cause lose of all exisitng DHCP lease information. This API is used only when loosing DHCP leases is not a real problem, e.g. cross-site migration or failover and all client hosts will be reboot and get new IP addresses. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reallocateDhcpProfileEdgeClusterReallocateTest() throws ApiException {
        DhcpProfile body = null;
        String serverProfileId = null;
        DhcpProfile response = api.reallocateDhcpProfileEdgeClusterReallocate(body, serverProfileId);

        // TODO: test validations
    }
    /**
     * Update a DHCP server&#x27;s IP pool
     *
     * Update a specific ip pool of a given logical DHCP server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDhcpIpPoolTest() throws ApiException {
        DhcpIpPool body = null;
        String serverId = null;
        String poolId = null;
        DhcpIpPool response = api.updateDhcpIpPool(body, serverId, poolId);

        // TODO: test validations
    }
    /**
     * Update a DHCP server profile
     *
     * Please note, the edge_cluster_id in DhcpProfile can NOT be changed by this PUT operation because all existing DHCP leases will lost. If loosing leases is not a problem, a dedicated re-allocation API is suggested to modify the edge-cluster-id.  If both the edge_cluster_member_indexes in the DhcpProfile are changed in a same PUT API, e.g. change from [a,b] to [x,y], the current DHCP server leases will be lost, which could cause the network crash due to ip conflicts. Hence the suggestion is to change only one member index in one single update, e.g. from [a, b] to [a,y]. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDhcpProfileTest() throws ApiException {
        DhcpProfile body = null;
        String profileId = null;
        DhcpProfile response = api.updateDhcpProfile(body, profileId);

        // TODO: test validations
    }
    /**
     * Update a DHCP server
     *
     * Update a logical DHCP server with new configurations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDhcpServerTest() throws ApiException {
        LogicalDhcpServer body = null;
        String serverId = null;
        LogicalDhcpServer response = api.updateDhcpServer(body, serverId);

        // TODO: test validations
    }
    /**
     * Update a DHCP server&#x27;s static binding
     *
     * Update a specific static binding of a given local DHCP server.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDhcpStaticBindingTest() throws ApiException {
        DhcpStaticBinding body = null;
        String serverId = null;
        String bindingId = null;
        DhcpStaticBinding response = api.updateDhcpStaticBinding(body, serverId, bindingId);

        // TODO: test validations
    }
}