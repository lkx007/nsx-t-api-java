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
import io.swagger.client.model.NSService;
import io.swagger.client.model.NSServiceListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiGroupingObjectsNsServicesApi
 */
@Ignore
public class ManagementPlaneApiGroupingObjectsNsServicesApiTest {

    private final ManagementPlaneApiGroupingObjectsNsServicesApi api = new ManagementPlaneApiGroupingObjectsNsServicesApi();

    /**
     * Create NSService
     *
     * Creates a new NSService which allows users to specify characteristics to use for matching network traffic. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNSServiceTest() throws ApiException {
        NSService body = null;
        NSService response = api.createNSService(body);

        // TODO: test validations
    }
    /**
     * Delete NSService
     *
     * Deletes the specified NSService. By default, if the NSService is being referred in an NSServiceGroup, it can&#x27;t be deleted. In such situations, pass \&quot;force&#x3D;true\&quot; as a parameter to force delete the NSService. System defined NSServices can&#x27;t be deleted using \&quot;force\&quot; flag. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNSServiceTest() throws ApiException {
        String nsServiceId = null;
        Boolean force = null;
        api.deleteNSService(nsServiceId, force);

        // TODO: test validations
    }
    /**
     * List all NSServices
     *
     * Returns paginated list of NSServices 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNSServicesTest() throws ApiException {
        String cursor = null;
        Boolean defaultService = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        NSServiceListResult response = api.listNSServices(cursor, defaultService, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Read NSService
     *
     * Returns information about the specified NSService 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNSServiceTest() throws ApiException {
        String nsServiceId = null;
        NSService response = api.readNSService(nsServiceId);

        // TODO: test validations
    }
    /**
     * Update NSService
     *
     * Updates the specified NSService. Modifiable parameters include the description, display_name and the NSService element. The system defined NSServices can&#x27;t be modified 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNSServiceTest() throws ApiException {
        NSService body = null;
        String nsServiceId = null;
        NSService response = api.updateNSService(body, nsServiceId);

        // TODO: test validations
    }
}