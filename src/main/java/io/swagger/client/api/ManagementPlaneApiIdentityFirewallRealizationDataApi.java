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
import io.swagger.client.model.IdfwNsgroupVmDetailListResult;
import io.swagger.client.model.IdfwSystemStats;
import io.swagger.client.model.IdfwUserSessionDataAndMappings;
import io.swagger.client.model.IdfwUserStats;
import io.swagger.client.model.IdfwVmStats;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiIdentityFirewallRealizationDataApi {
    private ApiClient apiClient;

    public ManagementPlaneApiIdentityFirewallRealizationDataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiIdentityFirewallRealizationDataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getNsgroupVmDetails
     * @param groupId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNsgroupVmDetailsCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/idfw/nsgroup-vm-details/{group-id}"
            .replaceAll("\\{" + "group-id" + "\\}", apiClient.escapeString(groupId.toString()));

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
    private com.squareup.okhttp.Call getNsgroupVmDetailsValidateBeforeCall(String groupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException("Missing the required parameter 'groupId' when calling getNsgroupVmDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = getNsgroupVmDetailsCall(groupId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all IDFW NSGroup VM details for a given NSGroup
     * Get all Identity Firewall NSGroup VM details for a given NSGroup.
     * @param groupId  (required)
     * @return IdfwNsgroupVmDetailListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdfwNsgroupVmDetailListResult getNsgroupVmDetails(String groupId) throws ApiException {
        ApiResponse<IdfwNsgroupVmDetailListResult> resp = getNsgroupVmDetailsWithHttpInfo(groupId);
        return resp.getData();
    }

    /**
     * Get all IDFW NSGroup VM details for a given NSGroup
     * Get all Identity Firewall NSGroup VM details for a given NSGroup.
     * @param groupId  (required)
     * @return ApiResponse&lt;IdfwNsgroupVmDetailListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdfwNsgroupVmDetailListResult> getNsgroupVmDetailsWithHttpInfo(String groupId) throws ApiException {
        com.squareup.okhttp.Call call = getNsgroupVmDetailsValidateBeforeCall(groupId, null, null);
        Type localVarReturnType = new TypeToken<IdfwNsgroupVmDetailListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all IDFW NSGroup VM details for a given NSGroup (asynchronously)
     * Get all Identity Firewall NSGroup VM details for a given NSGroup.
     * @param groupId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNsgroupVmDetailsAsync(String groupId, final ApiCallback<IdfwNsgroupVmDetailListResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNsgroupVmDetailsValidateBeforeCall(groupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdfwNsgroupVmDetailListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSystemStats
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSystemStatsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/idfw/system-stats";

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
    private com.squareup.okhttp.Call getSystemStatsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getSystemStatsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get IDFW system statistics data
     * Get IDFW system statistics data.
     * @return IdfwSystemStats
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdfwSystemStats getSystemStats() throws ApiException {
        ApiResponse<IdfwSystemStats> resp = getSystemStatsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get IDFW system statistics data
     * Get IDFW system statistics data.
     * @return ApiResponse&lt;IdfwSystemStats&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdfwSystemStats> getSystemStatsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getSystemStatsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<IdfwSystemStats>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get IDFW system statistics data (asynchronously)
     * Get IDFW system statistics data.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSystemStatsAsync(final ApiCallback<IdfwSystemStats> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSystemStatsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdfwSystemStats>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserStats
     * @param userId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserStatsCall(String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/idfw/user-stats/{user-id}"
            .replaceAll("\\{" + "user-id" + "\\}", apiClient.escapeString(userId.toString()));

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
    private com.squareup.okhttp.Call getUserStatsValidateBeforeCall(String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUserStats(Async)");
        }
        
        com.squareup.okhttp.Call call = getUserStatsCall(userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get IDFW user login events for a given user
     * Get IDFW user login events for a given user (all active plus up to 5 most recent archived entries). 
     * @param userId  (required)
     * @return IdfwUserStats
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdfwUserStats getUserStats(String userId) throws ApiException {
        ApiResponse<IdfwUserStats> resp = getUserStatsWithHttpInfo(userId);
        return resp.getData();
    }

    /**
     * Get IDFW user login events for a given user
     * Get IDFW user login events for a given user (all active plus up to 5 most recent archived entries). 
     * @param userId  (required)
     * @return ApiResponse&lt;IdfwUserStats&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdfwUserStats> getUserStatsWithHttpInfo(String userId) throws ApiException {
        com.squareup.okhttp.Call call = getUserStatsValidateBeforeCall(userId, null, null);
        Type localVarReturnType = new TypeToken<IdfwUserStats>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get IDFW user login events for a given user (asynchronously)
     * Get IDFW user login events for a given user (all active plus up to 5 most recent archived entries). 
     * @param userId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserStatsAsync(String userId, final ApiCallback<IdfwUserStats> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserStatsValidateBeforeCall(userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdfwUserStats>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getVmStats
     * @param vmExtId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVmStatsCall(String vmExtId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/idfw/vm-stats/{vm-ext-id}"
            .replaceAll("\\{" + "vm-ext-id" + "\\}", apiClient.escapeString(vmExtId.toString()));

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
    private com.squareup.okhttp.Call getVmStatsValidateBeforeCall(String vmExtId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'vmExtId' is set
        if (vmExtId == null) {
            throw new ApiException("Missing the required parameter 'vmExtId' when calling getVmStats(Async)");
        }
        
        com.squareup.okhttp.Call call = getVmStatsCall(vmExtId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get IDFW user login events for a given VM
     * Get IDFW user login events for a given VM (all active plus up to 5 most recent archived entries). 
     * @param vmExtId  (required)
     * @return IdfwVmStats
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdfwVmStats getVmStats(String vmExtId) throws ApiException {
        ApiResponse<IdfwVmStats> resp = getVmStatsWithHttpInfo(vmExtId);
        return resp.getData();
    }

    /**
     * Get IDFW user login events for a given VM
     * Get IDFW user login events for a given VM (all active plus up to 5 most recent archived entries). 
     * @param vmExtId  (required)
     * @return ApiResponse&lt;IdfwVmStats&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdfwVmStats> getVmStatsWithHttpInfo(String vmExtId) throws ApiException {
        com.squareup.okhttp.Call call = getVmStatsValidateBeforeCall(vmExtId, null, null);
        Type localVarReturnType = new TypeToken<IdfwVmStats>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get IDFW user login events for a given VM (asynchronously)
     * Get IDFW user login events for a given VM (all active plus up to 5 most recent archived entries). 
     * @param vmExtId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVmStatsAsync(String vmExtId, final ApiCallback<IdfwVmStats> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVmStatsValidateBeforeCall(vmExtId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdfwVmStats>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listUserSessions
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listUserSessionsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/idfw/user-session-data";

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
    private com.squareup.okhttp.Call listUserSessionsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listUserSessionsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get user session data
     * Get user session data.
     * @return IdfwUserSessionDataAndMappings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdfwUserSessionDataAndMappings listUserSessions() throws ApiException {
        ApiResponse<IdfwUserSessionDataAndMappings> resp = listUserSessionsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get user session data
     * Get user session data.
     * @return ApiResponse&lt;IdfwUserSessionDataAndMappings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdfwUserSessionDataAndMappings> listUserSessionsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = listUserSessionsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<IdfwUserSessionDataAndMappings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get user session data (asynchronously)
     * Get user session data.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listUserSessionsAsync(final ApiCallback<IdfwUserSessionDataAndMappings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listUserSessionsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdfwUserSessionDataAndMappings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
