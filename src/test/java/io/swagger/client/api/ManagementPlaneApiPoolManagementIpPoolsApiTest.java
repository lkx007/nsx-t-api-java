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
import io.swagger.client.model.AllocationIpAddress;
import io.swagger.client.model.AllocationIpAddressListResult;
import io.swagger.client.model.ApiError;
import io.swagger.client.model.IpPool;
import io.swagger.client.model.IpPoolListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiPoolManagementIpPoolsApi
 */
@Ignore
public class ManagementPlaneApiPoolManagementIpPoolsApiTest {

    private final ManagementPlaneApiPoolManagementIpPoolsApi api = new ManagementPlaneApiPoolManagementIpPoolsApi();

    /**
     * Allocate or Release an IP Address from a Pool
     *
     * Allocates or releases an IP address from the specified IP pool. To allocate an address, include ?action&#x3D;ALLOCATE in the request and \&quot;allocation_id\&quot;:null in the request body. When the request is successful, the response is \&quot;allocation_id\&quot;: \&quot;&lt;ip-address&gt;\&quot;, where &lt;ip-address&gt; is an IP address from the specified pool. To release an IP address (return it back to the pool), include ?action&#x3D;RELEASE in the request and \&quot;allocation_id\&quot;:&lt;ip-address&gt; in the request body, where &lt;ip-address&gt; is the address to be released. When the request is successful, the response is NULL. Tags, display_name and description attributes are not supported for AllocationIpAddress in this release. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allocateOrReleaseFromIpPoolTest() throws ApiException {
        AllocationIpAddress body = null;
        String action = null;
        String poolId = null;
        AllocationIpAddress response = api.allocateOrReleaseFromIpPool(body, action, poolId);

        // TODO: test validations
    }
    /**
     * Create an IP Pool
     *
     * Creates a new IPv4 or IPv6 address pool. Required parameters are allocation_ranges and cidr. Optional parameters are display_name, description, dns_nameservers, dns_suffix, and gateway_ip. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIpPoolTest() throws ApiException {
        IpPool body = null;
        IpPool response = api.createIpPool(body);

        // TODO: test validations
    }
    /**
     * Delete an IP Pool
     *
     * Deletes the specified IP address pool. By default, if the IpPool is used in other configurations (such as transport node template), it won&#x27;t be deleted. In such situations, pass \&quot;force&#x3D;true\&quot; as query param to force delete the IpPool
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIpPoolTest() throws ApiException {
        String poolId = null;
        Boolean force = null;
        api.deleteIpPool(poolId, force);

        // TODO: test validations
    }
    /**
     * List IP Pool Allocations
     *
     * Returns information about which addresses have been allocated from a specified IP address pool. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIpPoolAllocationsTest() throws ApiException {
        String poolId = null;
        AllocationIpAddressListResult response = api.listIpPoolAllocations(poolId);

        // TODO: test validations
    }
    /**
     * List IP Pools
     *
     * Returns information about the configured IP address pools. Information includes the display name and description of the pool and the details of each of the subnets in the pool, including the DNS servers, allocation ranges, gateway, and CIDR subnet address. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIpPoolsTest() throws ApiException {
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        IpPoolListResult response = api.listIpPools(cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Read IP Pool
     *
     * Returns information about the specified IP address pool.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readIpPoolTest() throws ApiException {
        String poolId = null;
        IpPool response = api.readIpPool(poolId);

        // TODO: test validations
    }
    /**
     * Update an IP Pool
     *
     * Modifies the specified IP address pool. Modifiable parameters include the description, display_name, and all subnet information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIpPoolTest() throws ApiException {
        IpPool body = null;
        String poolId = null;
        IpPool response = api.updateIpPool(body, poolId);

        // TODO: test validations
    }
}