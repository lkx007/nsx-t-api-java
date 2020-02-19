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
import io.swagger.client.model.IntelligenceHostConfigurationInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NsxIntelligenceHostApi
 */
@Ignore
public class NsxIntelligenceHostApiTest {

    private final NsxIntelligenceHostApi api = new NsxIntelligenceHostApi();

    /**
     * Get NSX-Intelligence host configuration
     *
     * Get the current NSX-Intelligence host configuration. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaceHostConfigurationTest() throws ApiException {
        IntelligenceHostConfigurationInfo response = api.getPaceHostConfiguration();

        // TODO: test validations
    }
    /**
     * Patch NSX-Intelligence host configuration
     *
     * Patch the current NSX-Intelligence host configuration. Return error if NSX-Intelligence is not registered with NSX. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPaceHostConfigurationTest() throws ApiException {
        IntelligenceHostConfigurationInfo body = null;
        IntelligenceHostConfigurationInfo response = api.patchPaceHostConfiguration(body);

        // TODO: test validations
    }
    /**
     * Reset NSX-Intelligence host configuration
     *
     * Reset NSX-Intelligence host configuration to the default setting. Clear NSX-Intelligence host configuration if NSX-Intelligence is not registered with NSX. Return the NSX-Intelligence host configuration after reset operation. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetPaceHostConfigurationResetTest() throws ApiException {
        IntelligenceHostConfigurationInfo response = api.resetPaceHostConfigurationReset();

        // TODO: test validations
    }
}
