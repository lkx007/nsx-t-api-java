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
import io.swagger.client.model.CapacityThresholdList;
import io.swagger.client.model.CapacityUsageResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiCapacityDashboardApi
 */
@Ignore
public class ManagementPlaneApiCapacityDashboardApiTest {

    private final ManagementPlaneApiCapacityDashboardApi api = new ManagementPlaneApiCapacityDashboardApi();

    /**
     * Returns warning threshold(s) set for NSX Objects.
     *
     * Returns warning threshold(s) set for NSX Objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCapacityThresholdsTest() throws ApiException {
        CapacityThresholdList response = api.getCapacityThresholds();

        // TODO: test validations
    }
    /**
     * Returns capacity usage data for NSX objects
     *
     * Returns capacity usage data for NSX objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCapacityUsageTest() throws ApiException {
        String category = null;
        String cursor = null;
        Boolean force = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        CapacityUsageResponse response = api.getCapacityUsage(category, cursor, force, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Updates the warning threshold(s) for NSX Objects.
     *
     * Updates the warning threshold(s) for NSX Objects specified, and returns new threshold(s). Threshold list in the request must contain value for GLOBAL_DEFAULT threshold_type which represents global thresholds. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCapacityThresholdsTest() throws ApiException {
        CapacityThresholdList body = null;
        CapacityThresholdList response = api.updateCapacityThresholds(body);

        // TODO: test validations
    }
}
