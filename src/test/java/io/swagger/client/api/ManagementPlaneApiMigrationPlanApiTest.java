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
import io.swagger.client.model.MigrationPlanSettings;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiMigrationPlanApi
 */
@Ignore
public class ManagementPlaneApiMigrationPlanApiTest {

    private final ManagementPlaneApiMigrationPlanApi api = new ManagementPlaneApiMigrationPlanApi();

    /**
     * Abort migration
     *
     * Resets all migration steps done so far, so that migration can be restarted with new setup details. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void abortMigrationAbortTest() throws ApiException {
        api.abortMigrationAbort();

        // TODO: test validations
    }
    /**
     * Continue migration
     *
     * Continue the migration. Resumes the migration from the point where it was paused. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void continueMigrationContinueTest() throws ApiException {
        Boolean skip = null;
        api.continueMigrationContinue(skip);

        // TODO: test validations
    }
    /**
     * Mark completion of a migration cycle
     *
     * This API marks the completion of one execution of migration workflow. This API resets internal  execution state and hence needs to be invoked before starting subsequent workflow run. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void finishMigrationFinishTest() throws ApiException {
        api.finishMigrationFinish();

        // TODO: test validations
    }
    /**
     * Get migration plan settings for the component
     *
     * Get the migration plan settings for the component. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMigrationPlanSettingsTest() throws ApiException {
        String componentType = null;
        MigrationPlanSettings response = api.getMigrationPlanSettings(componentType);

        // TODO: test validations
    }
    /**
     * Pause migration
     *
     * Pause the migration. Migration will be paused after migration of all the nodes currently in progress is completed either successfully or with failure. User can make changes in the migration plan when the migration is paused. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pauseMigrationPauseTest() throws ApiException {
        api.pauseMigrationPause();

        // TODO: test validations
    }
    /**
     * Reset migration plan to default plan
     *
     * Reset the migration plan to default plan. User has an option to change the default plan. But if after making changes, user wants to go back to the default plan, this is the way to do so. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetMigrationPlanResetTest() throws ApiException {
        String componentType = null;
        api.resetMigrationPlanReset(componentType);

        // TODO: test validations
    }
    /**
     * Start migration
     *
     * Start the migration. Migration will start as per the migration plan. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startMigrationStartTest() throws ApiException {
        api.startMigrationStart();

        // TODO: test validations
    }
    /**
     * Rollbabck migration
     *
     * Roll back the migration. Changes applied to target NSX will be reverted. Use the migration status API to monitor progress of roll back. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startRollbackMigrationRollbackTest() throws ApiException {
        api.startRollbackMigrationRollback();

        // TODO: test validations
    }
    /**
     * Update migration plan settings for the component
     *
     * Update the migration plan settings for the component. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMigrationPlanSettingsTest() throws ApiException {
        MigrationPlanSettings body = null;
        String componentType = null;
        MigrationPlanSettings response = api.updateMigrationPlanSettings(body, componentType);

        // TODO: test validations
    }
}
