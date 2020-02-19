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
import io.swagger.client.model.IPSecVPNSessionStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiVpnStatisticsIkeSessionsStatusApi
 */
@Ignore
public class ManagementPlaneApiVpnStatisticsIkeSessionsStatusApiTest {

    private final ManagementPlaneApiVpnStatisticsIkeSessionsStatusApi api = new ManagementPlaneApiVpnStatisticsIkeSessionsStatusApi();

    /**
     * Get IPSec VPN IKE session status
     *
     * List status of IPSec session. Query parameter source supports both realtime and cached mode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIPSecVPNIKESessionStatusTest() throws ApiException {
        String sessionId = null;
        String source = null;
        IPSecVPNSessionStatus response = api.getIPSecVPNIKESessionStatus(sessionId, source);

        // TODO: test validations
    }
}