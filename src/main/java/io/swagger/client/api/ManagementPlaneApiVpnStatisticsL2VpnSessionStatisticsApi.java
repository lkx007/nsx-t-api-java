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
import io.swagger.client.model.L2VPNSessionStatistics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiVpnStatisticsL2VpnSessionStatisticsApi {
    private ApiClient apiClient;

    public ManagementPlaneApiVpnStatisticsL2VpnSessionStatisticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiVpnStatisticsL2VpnSessionStatisticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getL2VPNSessionStatistics
     * @param sessionId  (required)
     * @param source Data source type. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getL2VPNSessionStatisticsCall(String sessionId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vpn/l2vpn/sessions/{session-id}/statistics"
            .replaceAll("\\{" + "session-id" + "\\}", apiClient.escapeString(sessionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));

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
    private com.squareup.okhttp.Call getL2VPNSessionStatisticsValidateBeforeCall(String sessionId, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new ApiException("Missing the required parameter 'sessionId' when calling getL2VPNSessionStatistics(Async)");
        }
        
        com.squareup.okhttp.Call call = getL2VPNSessionStatisticsCall(sessionId, source, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get L2VPN session statistics
     * Get statistics of a L2VPN session. Query parameter source&#x3D;realtime is the only supported source.
     * @param sessionId  (required)
     * @param source Data source type. (optional)
     * @return L2VPNSessionStatistics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public L2VPNSessionStatistics getL2VPNSessionStatistics(String sessionId, String source) throws ApiException {
        ApiResponse<L2VPNSessionStatistics> resp = getL2VPNSessionStatisticsWithHttpInfo(sessionId, source);
        return resp.getData();
    }

    /**
     * Get L2VPN session statistics
     * Get statistics of a L2VPN session. Query parameter source&#x3D;realtime is the only supported source.
     * @param sessionId  (required)
     * @param source Data source type. (optional)
     * @return ApiResponse&lt;L2VPNSessionStatistics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<L2VPNSessionStatistics> getL2VPNSessionStatisticsWithHttpInfo(String sessionId, String source) throws ApiException {
        com.squareup.okhttp.Call call = getL2VPNSessionStatisticsValidateBeforeCall(sessionId, source, null, null);
        Type localVarReturnType = new TypeToken<L2VPNSessionStatistics>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get L2VPN session statistics (asynchronously)
     * Get statistics of a L2VPN session. Query parameter source&#x3D;realtime is the only supported source.
     * @param sessionId  (required)
     * @param source Data source type. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getL2VPNSessionStatisticsAsync(String sessionId, String source, final ApiCallback<L2VPNSessionStatistics> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getL2VPNSessionStatisticsValidateBeforeCall(sessionId, source, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<L2VPNSessionStatistics>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}