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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ApiError;
import io.swagger.client.model.NormalizedResourceListResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiNormalizationApi {
    private ApiClient apiClient;

    public ManagementPlaneApiNormalizationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiNormalizationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getNormalizations
     * @param preferredNormalizationType Resource type valid for use as target in normalization API. (required)
     * @param resourceId Identifier of the resource on which normalization is to be performed (required)
     * @param resourceType Resource type valid for use as source in normalization API. (required)
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNormalizationsCall(String preferredNormalizationType, String resourceId, String resourceType, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/normalizations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (includedFields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("included_fields", includedFields));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (preferredNormalizationType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("preferred_normalization_type", preferredNormalizationType));
        if (resourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resource_id", resourceId));
        if (resourceType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resource_type", resourceType));
        if (sortAscending != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_ascending", sortAscending));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_by", sortBy));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getNormalizationsValidateBeforeCall(String preferredNormalizationType, String resourceId, String resourceType, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'preferredNormalizationType' is set
        if (preferredNormalizationType == null) {
            throw new ApiException("Missing the required parameter 'preferredNormalizationType' when calling getNormalizations(Async)");
        }
        // verify the required parameter 'resourceId' is set
        if (resourceId == null) {
            throw new ApiException("Missing the required parameter 'resourceId' when calling getNormalizations(Async)");
        }
        // verify the required parameter 'resourceType' is set
        if (resourceType == null) {
            throw new ApiException("Missing the required parameter 'resourceType' when calling getNormalizations(Async)");
        }
        
        com.squareup.okhttp.Call call = getNormalizationsCall(preferredNormalizationType, resourceId, resourceType, cursor, includedFields, pageSize, sortAscending, sortBy, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get normalizations based on the query parameters
     * Returns the list of normalized resources based on the query parameters. Id and Type of the resource on which the normalizations is to be performed, are to be specified as query parameters in the URI. The target resource types to which normalization is to be done should also be specified as query parameter. 
     * @param preferredNormalizationType Resource type valid for use as target in normalization API. (required)
     * @param resourceId Identifier of the resource on which normalization is to be performed (required)
     * @param resourceType Resource type valid for use as source in normalization API. (required)
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return NormalizedResourceListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NormalizedResourceListResult getNormalizations(String preferredNormalizationType, String resourceId, String resourceType, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy) throws ApiException {
        ApiResponse<NormalizedResourceListResult> resp = getNormalizationsWithHttpInfo(preferredNormalizationType, resourceId, resourceType, cursor, includedFields, pageSize, sortAscending, sortBy);
        return resp.getData();
    }

    /**
     * Get normalizations based on the query parameters
     * Returns the list of normalized resources based on the query parameters. Id and Type of the resource on which the normalizations is to be performed, are to be specified as query parameters in the URI. The target resource types to which normalization is to be done should also be specified as query parameter. 
     * @param preferredNormalizationType Resource type valid for use as target in normalization API. (required)
     * @param resourceId Identifier of the resource on which normalization is to be performed (required)
     * @param resourceType Resource type valid for use as source in normalization API. (required)
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return ApiResponse&lt;NormalizedResourceListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NormalizedResourceListResult> getNormalizationsWithHttpInfo(String preferredNormalizationType, String resourceId, String resourceType, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = getNormalizationsValidateBeforeCall(preferredNormalizationType, resourceId, resourceType, cursor, includedFields, pageSize, sortAscending, sortBy, null, null);
        Type localVarReturnType = new TypeToken<NormalizedResourceListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get normalizations based on the query parameters (asynchronously)
     * Returns the list of normalized resources based on the query parameters. Id and Type of the resource on which the normalizations is to be performed, are to be specified as query parameters in the URI. The target resource types to which normalization is to be done should also be specified as query parameter. 
     * @param preferredNormalizationType Resource type valid for use as target in normalization API. (required)
     * @param resourceId Identifier of the resource on which normalization is to be performed (required)
     * @param resourceType Resource type valid for use as source in normalization API. (required)
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNormalizationsAsync(String preferredNormalizationType, String resourceId, String resourceType, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ApiCallback<NormalizedResourceListResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNormalizationsValidateBeforeCall(preferredNormalizationType, resourceId, resourceType, cursor, includedFields, pageSize, sortAscending, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NormalizedResourceListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}