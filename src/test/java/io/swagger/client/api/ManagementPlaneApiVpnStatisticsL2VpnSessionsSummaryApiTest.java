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
import io.swagger.client.model.L2VPNSessionSummary;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiVpnStatisticsL2VpnSessionsSummaryApi
 */
@Ignore
public class ManagementPlaneApiVpnStatisticsL2VpnSessionsSummaryApiTest {

    private final ManagementPlaneApiVpnStatisticsL2VpnSessionsSummaryApi api = new ManagementPlaneApiVpnStatisticsL2VpnSessionsSummaryApi();

    /**
     * Get status summary of all existing L2VPN sessions.
     *
     * Load all the existing L2VPN sessions and return the status summary of all L2VPN sessions. Query parameter source supports only cached mode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getL2VPNSessionSummaryTest() throws ApiException {
        String source = null;
        L2VPNSessionSummary response = api.getL2VPNSessionSummary(source);

        // TODO: test validations
    }
}
