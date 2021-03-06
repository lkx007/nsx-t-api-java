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
import io.swagger.client.model.NodeMode;
import io.swagger.client.model.NodeTime;
import io.swagger.client.model.SwitchingToVmcModeParameters;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiNsxComponentAdministrationApplianceApi
 */
@Ignore
public class ManagementPlaneApiNsxComponentAdministrationApplianceApiTest {

    private final ManagementPlaneApiNsxComponentAdministrationApplianceApi api = new ManagementPlaneApiNsxComponentAdministrationApplianceApi();

    /**
     * NodeMode
     *
     * Currently only a switch from \&quot;VMC_LOCAL\&quot; to \&quot;VMC\&quot; is supported. Returns a new Node Mode, if the request successfuly changed it. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeNodeModeTest() throws ApiException {
        SwitchingToVmcModeParameters body = null;
        NodeMode response = api.changeNodeMode(body);

        // TODO: test validations
    }
    /**
     * NodeMode
     *
     * Returns current Node Mode. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNodeModeTest() throws ApiException {
        NodeMode response = api.getNodeMode();

        // TODO: test validations
    }
    /**
     * Set the node system time
     *
     * Set the node system time to the given time in UTC in the RFC3339 format &#x27;yyyy-mm-ddThh:mm:ssZ&#x27;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setNodeTimeSetSystemTimeTest() throws ApiException {
        NodeTime body = null;
        api.setNodeTimeSetSystemTime(body);

        // TODO: test validations
    }
}
