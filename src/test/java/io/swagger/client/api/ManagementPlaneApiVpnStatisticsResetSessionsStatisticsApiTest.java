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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiVpnStatisticsResetSessionsStatisticsApi
 */
@Ignore
public class ManagementPlaneApiVpnStatisticsResetSessionsStatisticsApiTest {

    private final ManagementPlaneApiVpnStatisticsResetSessionsStatisticsApi api = new ManagementPlaneApiVpnStatisticsResetSessionsStatisticsApi();

    /**
     * Reset the statistics of the given VPN session
     *
     * Reset the statistics of the given VPN session.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetIPSecVPNSessionStatisticsResetTest() throws ApiException {
        String sessionId = null;
        api.resetIPSecVPNSessionStatisticsReset(sessionId);

        // TODO: test validations
    }
}
