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
import io.swagger.client.model.ClusterProfile;
import io.swagger.client.model.ClusterProfileListResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiNetworkTransportClusterProfilesApi {
    private ApiClient apiClient;

    public ManagementPlaneApiNetworkTransportClusterProfilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiNetworkTransportClusterProfilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createClusterProfile
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createClusterProfileCall(ClusterProfile body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/cluster-profiles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createClusterProfileValidateBeforeCall(ClusterProfile body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createClusterProfile(Async)");
        }
        
        com.squareup.okhttp.Call call = createClusterProfileCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a Cluster Profile
     * Create a cluster profile. The resource_type is required. 
     * @param body  (required)
     * @return ClusterProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ClusterProfile createClusterProfile(ClusterProfile body) throws ApiException {
        ApiResponse<ClusterProfile> resp = createClusterProfileWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create a Cluster Profile
     * Create a cluster profile. The resource_type is required. 
     * @param body  (required)
     * @return ApiResponse&lt;ClusterProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ClusterProfile> createClusterProfileWithHttpInfo(ClusterProfile body) throws ApiException {
        com.squareup.okhttp.Call call = createClusterProfileValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ClusterProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Cluster Profile (asynchronously)
     * Create a cluster profile. The resource_type is required. 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createClusterProfileAsync(ClusterProfile body, final ApiCallback<ClusterProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createClusterProfileValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ClusterProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteClusterProfile
     * @param clusterProfileId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteClusterProfileCall(String clusterProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cluster-profiles/{cluster-profile-id}"
            .replaceAll("\\{" + "cluster-profile-id" + "\\}", apiClient.escapeString(clusterProfileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteClusterProfileValidateBeforeCall(String clusterProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'clusterProfileId' is set
        if (clusterProfileId == null) {
            throw new ApiException("Missing the required parameter 'clusterProfileId' when calling deleteClusterProfile(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteClusterProfileCall(clusterProfileId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a cluster profile
     * Delete a specified cluster profile.
     * @param clusterProfileId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteClusterProfile(String clusterProfileId) throws ApiException {
        deleteClusterProfileWithHttpInfo(clusterProfileId);
    }

    /**
     * Delete a cluster profile
     * Delete a specified cluster profile.
     * @param clusterProfileId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteClusterProfileWithHttpInfo(String clusterProfileId) throws ApiException {
        com.squareup.okhttp.Call call = deleteClusterProfileValidateBeforeCall(clusterProfileId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a cluster profile (asynchronously)
     * Delete a specified cluster profile.
     * @param clusterProfileId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteClusterProfileAsync(String clusterProfileId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteClusterProfileValidateBeforeCall(clusterProfileId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getClusterProfile
     * @param clusterProfileId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getClusterProfileCall(String clusterProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cluster-profiles/{cluster-profile-id}"
            .replaceAll("\\{" + "cluster-profile-id" + "\\}", apiClient.escapeString(clusterProfileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call getClusterProfileValidateBeforeCall(String clusterProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'clusterProfileId' is set
        if (clusterProfileId == null) {
            throw new ApiException("Missing the required parameter 'clusterProfileId' when calling getClusterProfile(Async)");
        }
        
        com.squareup.okhttp.Call call = getClusterProfileCall(clusterProfileId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get cluster profile by Id
     * Returns information about a specified cluster profile.
     * @param clusterProfileId  (required)
     * @return ClusterProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ClusterProfile getClusterProfile(String clusterProfileId) throws ApiException {
        ApiResponse<ClusterProfile> resp = getClusterProfileWithHttpInfo(clusterProfileId);
        return resp.getData();
    }

    /**
     * Get cluster profile by Id
     * Returns information about a specified cluster profile.
     * @param clusterProfileId  (required)
     * @return ApiResponse&lt;ClusterProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ClusterProfile> getClusterProfileWithHttpInfo(String clusterProfileId) throws ApiException {
        com.squareup.okhttp.Call call = getClusterProfileValidateBeforeCall(clusterProfileId, null, null);
        Type localVarReturnType = new TypeToken<ClusterProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get cluster profile by Id (asynchronously)
     * Returns information about a specified cluster profile.
     * @param clusterProfileId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getClusterProfileAsync(String clusterProfileId, final ApiCallback<ClusterProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getClusterProfileValidateBeforeCall(clusterProfileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ClusterProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listClusterProfiles
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includeSystemOwned Whether the list result contains system resources (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param resourceType Supported cluster profiles. (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listClusterProfilesCall(String cursor, Boolean includeSystemOwned, String includedFields, Long pageSize, String resourceType, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/cluster-profiles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (includeSystemOwned != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("include_system_owned", includeSystemOwned));
        if (includedFields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("included_fields", includedFields));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
    private com.squareup.okhttp.Call listClusterProfilesValidateBeforeCall(String cursor, Boolean includeSystemOwned, String includedFields, Long pageSize, String resourceType, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listClusterProfilesCall(cursor, includeSystemOwned, includedFields, pageSize, resourceType, sortAscending, sortBy, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Cluster Profiles
     * Returns paginated list of cluster profiles Cluster profiles define policies for edge cluster and bridge cluster. 
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includeSystemOwned Whether the list result contains system resources (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param resourceType Supported cluster profiles. (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return ClusterProfileListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ClusterProfileListResult listClusterProfiles(String cursor, Boolean includeSystemOwned, String includedFields, Long pageSize, String resourceType, Boolean sortAscending, String sortBy) throws ApiException {
        ApiResponse<ClusterProfileListResult> resp = listClusterProfilesWithHttpInfo(cursor, includeSystemOwned, includedFields, pageSize, resourceType, sortAscending, sortBy);
        return resp.getData();
    }

    /**
     * List Cluster Profiles
     * Returns paginated list of cluster profiles Cluster profiles define policies for edge cluster and bridge cluster. 
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includeSystemOwned Whether the list result contains system resources (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param resourceType Supported cluster profiles. (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return ApiResponse&lt;ClusterProfileListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ClusterProfileListResult> listClusterProfilesWithHttpInfo(String cursor, Boolean includeSystemOwned, String includedFields, Long pageSize, String resourceType, Boolean sortAscending, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = listClusterProfilesValidateBeforeCall(cursor, includeSystemOwned, includedFields, pageSize, resourceType, sortAscending, sortBy, null, null);
        Type localVarReturnType = new TypeToken<ClusterProfileListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Cluster Profiles (asynchronously)
     * Returns paginated list of cluster profiles Cluster profiles define policies for edge cluster and bridge cluster. 
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includeSystemOwned Whether the list result contains system resources (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param resourceType Supported cluster profiles. (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listClusterProfilesAsync(String cursor, Boolean includeSystemOwned, String includedFields, Long pageSize, String resourceType, Boolean sortAscending, String sortBy, final ApiCallback<ClusterProfileListResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listClusterProfilesValidateBeforeCall(cursor, includeSystemOwned, includedFields, pageSize, resourceType, sortAscending, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ClusterProfileListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateClusterProfile
     * @param body  (required)
     * @param clusterProfileId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateClusterProfileCall(ClusterProfile body, String clusterProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/cluster-profiles/{cluster-profile-id}"
            .replaceAll("\\{" + "cluster-profile-id" + "\\}", apiClient.escapeString(clusterProfileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateClusterProfileValidateBeforeCall(ClusterProfile body, String clusterProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateClusterProfile(Async)");
        }
        // verify the required parameter 'clusterProfileId' is set
        if (clusterProfileId == null) {
            throw new ApiException("Missing the required parameter 'clusterProfileId' when calling updateClusterProfile(Async)");
        }
        
        com.squareup.okhttp.Call call = updateClusterProfileCall(body, clusterProfileId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a cluster profile
     * Modifie a specified cluster profile. The body of the PUT request must include the resource_type. 
     * @param body  (required)
     * @param clusterProfileId  (required)
     * @return ClusterProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ClusterProfile updateClusterProfile(ClusterProfile body, String clusterProfileId) throws ApiException {
        ApiResponse<ClusterProfile> resp = updateClusterProfileWithHttpInfo(body, clusterProfileId);
        return resp.getData();
    }

    /**
     * Update a cluster profile
     * Modifie a specified cluster profile. The body of the PUT request must include the resource_type. 
     * @param body  (required)
     * @param clusterProfileId  (required)
     * @return ApiResponse&lt;ClusterProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ClusterProfile> updateClusterProfileWithHttpInfo(ClusterProfile body, String clusterProfileId) throws ApiException {
        com.squareup.okhttp.Call call = updateClusterProfileValidateBeforeCall(body, clusterProfileId, null, null);
        Type localVarReturnType = new TypeToken<ClusterProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a cluster profile (asynchronously)
     * Modifie a specified cluster profile. The body of the PUT request must include the resource_type. 
     * @param body  (required)
     * @param clusterProfileId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateClusterProfileAsync(ClusterProfile body, String clusterProfileId, final ApiCallback<ClusterProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateClusterProfileValidateBeforeCall(body, clusterProfileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ClusterProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
