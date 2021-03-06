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
import io.swagger.client.model.FailureDomain;
import io.swagger.client.model.FailureDomainListResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiNetworkTransportFailureDomainsApi {
    private ApiClient apiClient;

    public ManagementPlaneApiNetworkTransportFailureDomainsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiNetworkTransportFailureDomainsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createFailureDomain
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFailureDomainCall(FailureDomain body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/failure-domains";

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
    private com.squareup.okhttp.Call createFailureDomainValidateBeforeCall(FailureDomain body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createFailureDomain(Async)");
        }
        
        com.squareup.okhttp.Call call = createFailureDomainCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Failure Domain
     * Creates a new failure domain. 
     * @param body  (required)
     * @return FailureDomain
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FailureDomain createFailureDomain(FailureDomain body) throws ApiException {
        ApiResponse<FailureDomain> resp = createFailureDomainWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Failure Domain
     * Creates a new failure domain. 
     * @param body  (required)
     * @return ApiResponse&lt;FailureDomain&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FailureDomain> createFailureDomainWithHttpInfo(FailureDomain body) throws ApiException {
        com.squareup.okhttp.Call call = createFailureDomainValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<FailureDomain>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Failure Domain (asynchronously)
     * Creates a new failure domain. 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFailureDomainAsync(FailureDomain body, final ApiCallback<FailureDomain> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createFailureDomainValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FailureDomain>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteFailureDomain
     * @param failureDomainId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFailureDomainCall(String failureDomainId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/failure-domains/{failure-domain-id}"
            .replaceAll("\\{" + "failure-domain-id" + "\\}", apiClient.escapeString(failureDomainId.toString()));

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
    private com.squareup.okhttp.Call deleteFailureDomainValidateBeforeCall(String failureDomainId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'failureDomainId' is set
        if (failureDomainId == null) {
            throw new ApiException("Missing the required parameter 'failureDomainId' when calling deleteFailureDomain(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteFailureDomainCall(failureDomainId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Failure Domain
     * Deletes an existing failure domain. You can not delete system generated default failure domain. 
     * @param failureDomainId  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFailureDomain(String failureDomainId) throws ApiException {
        deleteFailureDomainWithHttpInfo(failureDomainId);
    }

    /**
     * Delete Failure Domain
     * Deletes an existing failure domain. You can not delete system generated default failure domain. 
     * @param failureDomainId  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFailureDomainWithHttpInfo(String failureDomainId) throws ApiException {
        com.squareup.okhttp.Call call = deleteFailureDomainValidateBeforeCall(failureDomainId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Failure Domain (asynchronously)
     * Deletes an existing failure domain. You can not delete system generated default failure domain. 
     * @param failureDomainId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFailureDomainAsync(String failureDomainId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFailureDomainValidateBeforeCall(failureDomainId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getFailureDomain
     * @param failureDomainId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFailureDomainCall(String failureDomainId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/failure-domains/{failure-domain-id}"
            .replaceAll("\\{" + "failure-domain-id" + "\\}", apiClient.escapeString(failureDomainId.toString()));

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
    private com.squareup.okhttp.Call getFailureDomainValidateBeforeCall(String failureDomainId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'failureDomainId' is set
        if (failureDomainId == null) {
            throw new ApiException("Missing the required parameter 'failureDomainId' when calling getFailureDomain(Async)");
        }
        
        com.squareup.okhttp.Call call = getFailureDomainCall(failureDomainId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a Failure Domain
     * Returns information about a single failure domain.
     * @param failureDomainId  (required)
     * @return FailureDomain
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FailureDomain getFailureDomain(String failureDomainId) throws ApiException {
        ApiResponse<FailureDomain> resp = getFailureDomainWithHttpInfo(failureDomainId);
        return resp.getData();
    }

    /**
     * Get a Failure Domain
     * Returns information about a single failure domain.
     * @param failureDomainId  (required)
     * @return ApiResponse&lt;FailureDomain&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FailureDomain> getFailureDomainWithHttpInfo(String failureDomainId) throws ApiException {
        com.squareup.okhttp.Call call = getFailureDomainValidateBeforeCall(failureDomainId, null, null);
        Type localVarReturnType = new TypeToken<FailureDomain>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Failure Domain (asynchronously)
     * Returns information about a single failure domain.
     * @param failureDomainId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFailureDomainAsync(String failureDomainId, final ApiCallback<FailureDomain> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFailureDomainValidateBeforeCall(failureDomainId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FailureDomain>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listFailureDomains
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listFailureDomainsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/failure-domains";

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
    private com.squareup.okhttp.Call listFailureDomainsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listFailureDomainsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Failure Domains
     * Returns information about configured failure domains.
     * @return FailureDomainListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FailureDomainListResult listFailureDomains() throws ApiException {
        ApiResponse<FailureDomainListResult> resp = listFailureDomainsWithHttpInfo();
        return resp.getData();
    }

    /**
     * List Failure Domains
     * Returns information about configured failure domains.
     * @return ApiResponse&lt;FailureDomainListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FailureDomainListResult> listFailureDomainsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = listFailureDomainsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<FailureDomainListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Failure Domains (asynchronously)
     * Returns information about configured failure domains.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFailureDomainsAsync(final ApiCallback<FailureDomainListResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listFailureDomainsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FailureDomainListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateFailureDomain
     * @param body  (required)
     * @param failureDomainId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateFailureDomainCall(FailureDomain body, String failureDomainId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/failure-domains/{failure-domain-id}"
            .replaceAll("\\{" + "failure-domain-id" + "\\}", apiClient.escapeString(failureDomainId.toString()));

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
    private com.squareup.okhttp.Call updateFailureDomainValidateBeforeCall(FailureDomain body, String failureDomainId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateFailureDomain(Async)");
        }
        // verify the required parameter 'failureDomainId' is set
        if (failureDomainId == null) {
            throw new ApiException("Missing the required parameter 'failureDomainId' when calling updateFailureDomain(Async)");
        }
        
        com.squareup.okhttp.Call call = updateFailureDomainCall(body, failureDomainId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Failure Domain
     * Updates an existing failure domain. Modifiable parameters are display_name, preferred_active_edge_services flag. 
     * @param body  (required)
     * @param failureDomainId  (required)
     * @return FailureDomain
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FailureDomain updateFailureDomain(FailureDomain body, String failureDomainId) throws ApiException {
        ApiResponse<FailureDomain> resp = updateFailureDomainWithHttpInfo(body, failureDomainId);
        return resp.getData();
    }

    /**
     * Update Failure Domain
     * Updates an existing failure domain. Modifiable parameters are display_name, preferred_active_edge_services flag. 
     * @param body  (required)
     * @param failureDomainId  (required)
     * @return ApiResponse&lt;FailureDomain&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FailureDomain> updateFailureDomainWithHttpInfo(FailureDomain body, String failureDomainId) throws ApiException {
        com.squareup.okhttp.Call call = updateFailureDomainValidateBeforeCall(body, failureDomainId, null, null);
        Type localVarReturnType = new TypeToken<FailureDomain>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Failure Domain (asynchronously)
     * Updates an existing failure domain. Modifiable parameters are display_name, preferred_active_edge_services flag. 
     * @param body  (required)
     * @param failureDomainId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateFailureDomainAsync(FailureDomain body, String failureDomainId, final ApiCallback<FailureDomain> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateFailureDomainValidateBeforeCall(body, failureDomainId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FailureDomain>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
