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
import io.swagger.client.model.MigrationSetupInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiMigrationSetupApi {
    private ApiClient apiClient;

    public ManagementPlaneApiMigrationSetupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiMigrationSetupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getNsxvSetupDetails
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNsxvSetupDetailsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/migration/setup";

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
    private com.squareup.okhttp.Call getNsxvSetupDetailsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getNsxvSetupDetailsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * NSX-V setup details
     * Get setup details of NSX-V to be migrated. 
     * @return MigrationSetupInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MigrationSetupInfo getNsxvSetupDetails() throws ApiException {
        ApiResponse<MigrationSetupInfo> resp = getNsxvSetupDetailsWithHttpInfo();
        return resp.getData();
    }

    /**
     * NSX-V setup details
     * Get setup details of NSX-V to be migrated. 
     * @return ApiResponse&lt;MigrationSetupInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MigrationSetupInfo> getNsxvSetupDetailsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getNsxvSetupDetailsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<MigrationSetupInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * NSX-V setup details (asynchronously)
     * Get setup details of NSX-V to be migrated. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNsxvSetupDetailsAsync(final ApiCallback<MigrationSetupInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNsxvSetupDetailsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MigrationSetupInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateNsxvSetupDetails
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateNsxvSetupDetailsCall(MigrationSetupInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/migration/setup";

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
    private com.squareup.okhttp.Call updateNsxvSetupDetailsValidateBeforeCall(MigrationSetupInfo body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateNsxvSetupDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = updateNsxvSetupDetailsCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * NSX-V setup details
     * Provide setup details of NSX-V to be migrated. 
     * @param body  (required)
     * @return MigrationSetupInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MigrationSetupInfo updateNsxvSetupDetails(MigrationSetupInfo body) throws ApiException {
        ApiResponse<MigrationSetupInfo> resp = updateNsxvSetupDetailsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * NSX-V setup details
     * Provide setup details of NSX-V to be migrated. 
     * @param body  (required)
     * @return ApiResponse&lt;MigrationSetupInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MigrationSetupInfo> updateNsxvSetupDetailsWithHttpInfo(MigrationSetupInfo body) throws ApiException {
        com.squareup.okhttp.Call call = updateNsxvSetupDetailsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<MigrationSetupInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * NSX-V setup details (asynchronously)
     * Provide setup details of NSX-V to be migrated. 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateNsxvSetupDetailsAsync(MigrationSetupInfo body, final ApiCallback<MigrationSetupInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateNsxvSetupDetailsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MigrationSetupInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}