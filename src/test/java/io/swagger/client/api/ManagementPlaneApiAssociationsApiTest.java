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
import io.swagger.client.model.AssociationListResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManagementPlaneApiAssociationsApi
 */
@Ignore
public class ManagementPlaneApiAssociationsApiTest {

    private final ManagementPlaneApiAssociationsApi api = new ManagementPlaneApiAssociationsApi();

    /**
     * Get ResourceReference objects to which the given resource belongs to 
     *
     * Returns information about resources that are associated with the given resource. Id and type of the resource for which associated resources are to be fetched are to be specified as query parameter in the URI. Resource type of the associated resources must be specified as query parameter. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAssociationsTest() throws ApiException {
        String associatedResourceType = null;
        String resourceId = null;
        String resourceType = null;
        String cursor = null;
        Boolean fetchAncestors = null;
        String includedFields = null;
        Long pageSize = null;
        Boolean sortAscending = null;
        String sortBy = null;
        AssociationListResult response = api.getAssociations(associatedResourceType, resourceId, resourceType, cursor, fetchAncestors, includedFields, pageSize, sortAscending, sortBy);

        // TODO: test validations
    }
}