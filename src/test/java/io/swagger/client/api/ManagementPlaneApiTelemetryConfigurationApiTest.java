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
import io.swagger.client.model.TelemetryAgreement;
import io.swagger.client.model.TelemetryConfig;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiTelemetryConfigurationApi
 */
@Ignore
public class ManagementPlaneApiTelemetryConfigurationApiTest {

    private final ManagementPlaneApiTelemetryConfigurationApi api = new ManagementPlaneApiTelemetryConfigurationApi();

    /**
     * Returns telemetry agreement information
     *
     * Returns telemetry agreement information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTelemetryAgreementTest() throws ApiException {
        TelemetryAgreement response = api.getTelemetryAgreement();

        // TODO: test validations
    }
    /**
     * Returns the telemetry configuration
     *
     * Returns the telemetry configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTelemetryConfigTest() throws ApiException {
        TelemetryConfig response = api.getTelemetryConfig();

        // TODO: test validations
    }
    /**
     * Set telemetry agreement information
     *
     * Set telemetry agreement information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTelemetryAgreementTest() throws ApiException {
        TelemetryAgreement body = null;
        TelemetryAgreement response = api.updateTelemetryAgreement(body);

        // TODO: test validations
    }
    /**
     * Creates or updates the telemetry configuration
     *
     * Updates or creates the telemetry configuration, and returns the new configuration. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTelemetryConfigTest() throws ApiException {
        TelemetryConfig body = null;
        TelemetryConfig response = api.updateTelemetryConfig(body);

        // TODO: test validations
    }
}
