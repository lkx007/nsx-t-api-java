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
import io.swagger.client.model.L2VpnService;
import io.swagger.client.model.L2VpnServiceListResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiVpnL2VpnServicesApi {
    private ApiClient apiClient;

    public ManagementPlaneApiVpnL2VpnServicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiVpnL2VpnServicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createL2VpnService
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createL2VpnServiceCall(L2VpnService body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/vpn/l2vpn/services";

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
    private com.squareup.okhttp.Call createL2VpnServiceValidateBeforeCall(L2VpnService body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createL2VpnService(Async)");
        }
        
        com.squareup.okhttp.Call call = createL2VpnServiceCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create L2VPN service
     * Create L2VPN service for a given logical router
     * @param body  (required)
     * @return L2VpnService
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public L2VpnService createL2VpnService(L2VpnService body) throws ApiException {
        ApiResponse<L2VpnService> resp = createL2VpnServiceWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create L2VPN service
     * Create L2VPN service for a given logical router
     * @param body  (required)
     * @return ApiResponse&lt;L2VpnService&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<L2VpnService> createL2VpnServiceWithHttpInfo(L2VpnService body) throws ApiException {
        com.squareup.okhttp.Call call = createL2VpnServiceValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<L2VpnService>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create L2VPN service (asynchronously)
     * Create L2VPN service for a given logical router
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createL2VpnServiceAsync(L2VpnService body, final ApiCallback<L2VpnService> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createL2VpnServiceValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<L2VpnService>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteL2VpnService
     * @param l2vpnServiceId  (required)
     * @param force Force delete the resource even if it is being used somewhere  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteL2VpnServiceCall(String l2vpnServiceId, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vpn/l2vpn/services/{l2vpn-service-id}"
            .replaceAll("\\{" + "l2vpn-service-id" + "\\}", apiClient.escapeString(l2vpnServiceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (force != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("force", force));

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
    private com.squareup.okhttp.Call deleteL2VpnServiceValidateBeforeCall(String l2vpnServiceId, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'l2vpnServiceId' is set
        if (l2vpnServiceId == null) {
            throw new ApiException("Missing the required parameter 'l2vpnServiceId' when calling deleteL2VpnService(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteL2VpnServiceCall(l2vpnServiceId, force, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a L2VPN service
     * Delete a specific L2VPN service. If there are any L2VpnSessions on this L2VpnService, those needs to be deleted first.
     * @param l2vpnServiceId  (required)
     * @param force Force delete the resource even if it is being used somewhere  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteL2VpnService(String l2vpnServiceId, Boolean force) throws ApiException {
        deleteL2VpnServiceWithHttpInfo(l2vpnServiceId, force);
    }

    /**
     * Delete a L2VPN service
     * Delete a specific L2VPN service. If there are any L2VpnSessions on this L2VpnService, those needs to be deleted first.
     * @param l2vpnServiceId  (required)
     * @param force Force delete the resource even if it is being used somewhere  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteL2VpnServiceWithHttpInfo(String l2vpnServiceId, Boolean force) throws ApiException {
        com.squareup.okhttp.Call call = deleteL2VpnServiceValidateBeforeCall(l2vpnServiceId, force, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a L2VPN service (asynchronously)
     * Delete a specific L2VPN service. If there are any L2VpnSessions on this L2VpnService, those needs to be deleted first.
     * @param l2vpnServiceId  (required)
     * @param force Force delete the resource even if it is being used somewhere  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteL2VpnServiceAsync(String l2vpnServiceId, Boolean force, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteL2VpnServiceValidateBeforeCall(l2vpnServiceId, force, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getL2VpnService
     * @param l2vpnServiceId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getL2VpnServiceCall(String l2vpnServiceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vpn/l2vpn/services/{l2vpn-service-id}"
            .replaceAll("\\{" + "l2vpn-service-id" + "\\}", apiClient.escapeString(l2vpnServiceId.toString()));

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
    private com.squareup.okhttp.Call getL2VpnServiceValidateBeforeCall(String l2vpnServiceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'l2vpnServiceId' is set
        if (l2vpnServiceId == null) {
            throw new ApiException("Missing the required parameter 'l2vpnServiceId' when calling getL2VpnService(Async)");
        }
        
        com.squareup.okhttp.Call call = getL2VpnServiceCall(l2vpnServiceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get L2VPN service
     * Get a specific L2VPN service
     * @param l2vpnServiceId  (required)
     * @return L2VpnService
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public L2VpnService getL2VpnService(String l2vpnServiceId) throws ApiException {
        ApiResponse<L2VpnService> resp = getL2VpnServiceWithHttpInfo(l2vpnServiceId);
        return resp.getData();
    }

    /**
     * Get L2VPN service
     * Get a specific L2VPN service
     * @param l2vpnServiceId  (required)
     * @return ApiResponse&lt;L2VpnService&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<L2VpnService> getL2VpnServiceWithHttpInfo(String l2vpnServiceId) throws ApiException {
        com.squareup.okhttp.Call call = getL2VpnServiceValidateBeforeCall(l2vpnServiceId, null, null);
        Type localVarReturnType = new TypeToken<L2VpnService>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get L2VPN service (asynchronously)
     * Get a specific L2VPN service
     * @param l2vpnServiceId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getL2VpnServiceAsync(String l2vpnServiceId, final ApiCallback<L2VpnService> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getL2VpnServiceValidateBeforeCall(l2vpnServiceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<L2VpnService>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listL2VpnServices
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
    public com.squareup.okhttp.Call listL2VpnServicesCall(String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vpn/l2vpn/services";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (includedFields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("included_fields", includedFields));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
    private com.squareup.okhttp.Call listL2VpnServicesValidateBeforeCall(String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listL2VpnServicesCall(cursor, includedFields, pageSize, sortAscending, sortBy, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all L2VPN services
     * Get paginated list of all L2VPN services
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return L2VpnServiceListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public L2VpnServiceListResult listL2VpnServices(String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy) throws ApiException {
        ApiResponse<L2VpnServiceListResult> resp = listL2VpnServicesWithHttpInfo(cursor, includedFields, pageSize, sortAscending, sortBy);
        return resp.getData();
    }

    /**
     * Get all L2VPN services
     * Get paginated list of all L2VPN services
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return ApiResponse&lt;L2VpnServiceListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<L2VpnServiceListResult> listL2VpnServicesWithHttpInfo(String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = listL2VpnServicesValidateBeforeCall(cursor, includedFields, pageSize, sortAscending, sortBy, null, null);
        Type localVarReturnType = new TypeToken<L2VpnServiceListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all L2VPN services (asynchronously)
     * Get paginated list of all L2VPN services
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listL2VpnServicesAsync(String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ApiCallback<L2VpnServiceListResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listL2VpnServicesValidateBeforeCall(cursor, includedFields, pageSize, sortAscending, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<L2VpnServiceListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateL2VpnService
     * @param body  (required)
     * @param l2vpnServiceId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateL2VpnServiceCall(L2VpnService body, String l2vpnServiceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/vpn/l2vpn/services/{l2vpn-service-id}"
            .replaceAll("\\{" + "l2vpn-service-id" + "\\}", apiClient.escapeString(l2vpnServiceId.toString()));

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
    private com.squareup.okhttp.Call updateL2VpnServiceValidateBeforeCall(L2VpnService body, String l2vpnServiceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateL2VpnService(Async)");
        }
        // verify the required parameter 'l2vpnServiceId' is set
        if (l2vpnServiceId == null) {
            throw new ApiException("Missing the required parameter 'l2vpnServiceId' when calling updateL2VpnService(Async)");
        }
        
        com.squareup.okhttp.Call call = updateL2VpnServiceCall(body, l2vpnServiceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit a L2VPN service
     * Edit a specific L2VPN service
     * @param body  (required)
     * @param l2vpnServiceId  (required)
     * @return L2VpnService
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public L2VpnService updateL2VpnService(L2VpnService body, String l2vpnServiceId) throws ApiException {
        ApiResponse<L2VpnService> resp = updateL2VpnServiceWithHttpInfo(body, l2vpnServiceId);
        return resp.getData();
    }

    /**
     * Edit a L2VPN service
     * Edit a specific L2VPN service
     * @param body  (required)
     * @param l2vpnServiceId  (required)
     * @return ApiResponse&lt;L2VpnService&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<L2VpnService> updateL2VpnServiceWithHttpInfo(L2VpnService body, String l2vpnServiceId) throws ApiException {
        com.squareup.okhttp.Call call = updateL2VpnServiceValidateBeforeCall(body, l2vpnServiceId, null, null);
        Type localVarReturnType = new TypeToken<L2VpnService>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit a L2VPN service (asynchronously)
     * Edit a specific L2VPN service
     * @param body  (required)
     * @param l2vpnServiceId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateL2VpnServiceAsync(L2VpnService body, String l2vpnServiceId, final ApiCallback<L2VpnService> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateL2VpnServiceValidateBeforeCall(body, l2vpnServiceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<L2VpnService>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
