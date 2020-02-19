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
import io.swagger.client.model.ComponentUpgradeChecksInfoListResult;
import io.swagger.client.model.UpgradeCheckCsvListResult;
import io.swagger.client.model.UpgradePlanSettings;
import io.swagger.client.model.UpgradeUnitList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiUpgradePlanApi
 */
@Ignore
public class ManagementPlaneApiUpgradePlanApiTest {

    private final ManagementPlaneApiUpgradePlanApi api = new ManagementPlaneApiUpgradePlanApi();

    /**
     * Abort pre-upgrade checks
     *
     * Aborts execution of pre-upgrade checks if already in progress. Halts the execution of checks awaiting execution at this point and makes best-effort attempts to stop checks already in execution. Returns without action if execution of pre-upgrade checks is not in progress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void abortPreUpgradeChecksAbortPreUpgradeChecksTest() throws ApiException {
        api.abortPreUpgradeChecksAbortPreUpgradeChecks();

        // TODO: test validations
    }
    /**
     * Continue upgrade
     *
     * Continue the upgrade. Resumes the upgrade from the point where it was paused. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void continueUpgradeContinueTest() throws ApiException {
        String componentType = null;
        Boolean skip = null;
        api.continueUpgradeContinue(componentType, skip);

        // TODO: test validations
    }
    /**
     * Execute post-upgrade checks
     *
     * Run pre-defined checks to identify issues after upgrade of a component. The results of the checks are added to the respective upgrade units aggregate-info. The progress and status of post-upgrade checks is part of aggregate-info of individual upgrade unit groups. Returns HTTP status 500 with error code 30953 if execution of post-upgrade checks is already in progress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executePostUpgradeChecksExecutePostUpgradeChecksTest() throws ApiException {
        String componentType = null;
        api.executePostUpgradeChecksExecutePostUpgradeChecks(componentType);

        // TODO: test validations
    }
    /**
     * Execute pre-upgrade checks
     *
     * Run pre-defined checks to identify potential issues which can be encountered during an upgrade or can cause an upgrade to fail. The results of the checks are added to the respective upgrade units aggregate-info. The progress and status of operation is part of upgrade status summary of individual components. Returns HTTP status 500 with error code 30953 if execution of pre-upgrade checks is already in progress. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executePreUpgradeChecksExecutePreUpgradeChecksTest() throws ApiException {
        String componentType = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        api.executePreUpgradeChecksExecutePreUpgradeChecks(componentType, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Returns pre-upgrade checks in csv format
     *
     * Returns pre-upgrade checks in csv format 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllPreUpgradeChecksInCsvFormatCsvTest() throws ApiException {
        UpgradeCheckCsvListResult response = api.getAllPreUpgradeChecksInCsvFormatCsv();

        // TODO: test validations
    }
    /**
     * Returns information about upgrade checks
     *
     * Returns information of pre-upgrade and post-upgrade checks. If request parameter component type is specified, then returns information about all pre-upgrade and post-upgrade for the component. Otherwise returns information of checks across all component types. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUpgradeChecksInfoTest() throws ApiException {
        String componentType = null;
        String cursor = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        ComponentUpgradeChecksInfoListResult response = api.getUpgradeChecksInfo(componentType, cursor, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
    /**
     * Get upgrade plan settings for the component
     *
     * Get the upgrade plan settings for the component. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUpgradePlanSettingsTest() throws ApiException {
        String componentType = null;
        UpgradePlanSettings response = api.getUpgradePlanSettings(componentType);

        // TODO: test validations
    }
    /**
     * Pause upgrade
     *
     * Pause the upgrade. Upgrade will be paused after upgrade of all the nodes currently in progress is completed either successfully or with failure. User can make changes in the upgrade plan when the upgrade is paused. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pauseUpgradePauseTest() throws ApiException {
        api.pauseUpgradePause();

        // TODO: test validations
    }
    /**
     * Reset upgrade plan to default plan
     *
     * Reset the upgrade plan to default plan. User has an option to change the default plan. But if after making changes, user wants to go back to the default plan, this is the way to do so. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetUpgradePlanResetTest() throws ApiException {
        String componentType = null;
        api.resetUpgradePlanReset(componentType);

        // TODO: test validations
    }
    /**
     * Start upgrade
     *
     * Start the upgrade. Upgrade will start as per the upgrade plan. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startUpgradeStartTest() throws ApiException {
        api.startUpgradeStart();

        // TODO: test validations
    }
    /**
     * Update upgrade plan settings for the component
     *
     * Update the upgrade plan settings for the component. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUpgradePlanSettingsTest() throws ApiException {
        UpgradePlanSettings body = null;
        String componentType = null;
        UpgradePlanSettings response = api.updateUpgradePlanSettings(body, componentType);

        // TODO: test validations
    }
    /**
     * Upgrade selected units
     *
     * Upgrades, Resumes the upgrade of a selected set of units. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upgradeSelectedUnitsUpgradeSelectedUnitsTest() throws ApiException {
        UpgradeUnitList body = null;
        api.upgradeSelectedUnitsUpgradeSelectedUnits(body);

        // TODO: test validations
    }
}
