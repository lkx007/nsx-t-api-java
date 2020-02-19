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
import io.swagger.client.model.IPSecVPNDPDProfile;
import io.swagger.client.model.IPSecVPNDPDProfileListResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiVpnIpsecDpdProfilesApi {
    private ApiClient apiClient;

    public ManagementPlaneApiVpnIpsecDpdProfilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiVpnIpsecDpdProfilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createIPSecVPNDPDProfile
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createIPSecVPNDPDProfileCall(IPSecVPNDPDProfile body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/vpn/ipsec/dpd-profiles";

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
    private com.squareup.okhttp.Call createIPSecVPNDPDProfileValidateBeforeCall(IPSecVPNDPDProfile body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createIPSecVPNDPDProfile(Async)");
        }
        
        com.squareup.okhttp.Call call = createIPSecVPNDPDProfileCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create dead peer detection (DPD) profile
     * Create dead peer detection (DPD) profile. Any change in profile affects all sessions consuming this profile.
     * @param body  (required)
     * @return IPSecVPNDPDProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IPSecVPNDPDProfile createIPSecVPNDPDProfile(IPSecVPNDPDProfile body) throws ApiException {
        ApiResponse<IPSecVPNDPDProfile> resp = createIPSecVPNDPDProfileWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create dead peer detection (DPD) profile
     * Create dead peer detection (DPD) profile. Any change in profile affects all sessions consuming this profile.
     * @param body  (required)
     * @return ApiResponse&lt;IPSecVPNDPDProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IPSecVPNDPDProfile> createIPSecVPNDPDProfileWithHttpInfo(IPSecVPNDPDProfile body) throws ApiException {
        com.squareup.okhttp.Call call = createIPSecVPNDPDProfileValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<IPSecVPNDPDProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create dead peer detection (DPD) profile (asynchronously)
     * Create dead peer detection (DPD) profile. Any change in profile affects all sessions consuming this profile.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createIPSecVPNDPDProfileAsync(IPSecVPNDPDProfile body, final ApiCallback<IPSecVPNDPDProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createIPSecVPNDPDProfileValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IPSecVPNDPDProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteIPSecVPNDPDProfile
     * @param ipsecVpnDpdProfileId  (required)
     * @param force Force delete the resource even if it is being used somewhere  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteIPSecVPNDPDProfileCall(String ipsecVpnDpdProfileId, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vpn/ipsec/dpd-profiles/{ipsec-vpn-dpd-profile-id}"
            .replaceAll("\\{" + "ipsec-vpn-dpd-profile-id" + "\\}", apiClient.escapeString(ipsecVpnDpdProfileId.toString()));

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
    private com.squareup.okhttp.Call deleteIPSecVPNDPDProfileValidateBeforeCall(String ipsecVpnDpdProfileId, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ipsecVpnDpdProfileId' is set
        if (ipsecVpnDpdProfileId == null) {
            throw new ApiException("Missing the required parameter 'ipsecVpnDpdProfileId' when calling deleteIPSecVPNDPDProfile(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteIPSecVPNDPDProfileCall(ipsecVpnDpdProfileId, force, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete dead peer detection (DPD) profile
     * Delete dead peer detection (DPD) profile.
     * @param ipsecVpnDpdProfileId  (required)
     * @param force Force delete the resource even if it is being used somewhere  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteIPSecVPNDPDProfile(String ipsecVpnDpdProfileId, Boolean force) throws ApiException {
        deleteIPSecVPNDPDProfileWithHttpInfo(ipsecVpnDpdProfileId, force);
    }

    /**
     * Delete dead peer detection (DPD) profile
     * Delete dead peer detection (DPD) profile.
     * @param ipsecVpnDpdProfileId  (required)
     * @param force Force delete the resource even if it is being used somewhere  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteIPSecVPNDPDProfileWithHttpInfo(String ipsecVpnDpdProfileId, Boolean force) throws ApiException {
        com.squareup.okhttp.Call call = deleteIPSecVPNDPDProfileValidateBeforeCall(ipsecVpnDpdProfileId, force, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete dead peer detection (DPD) profile (asynchronously)
     * Delete dead peer detection (DPD) profile.
     * @param ipsecVpnDpdProfileId  (required)
     * @param force Force delete the resource even if it is being used somewhere  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteIPSecVPNDPDProfileAsync(String ipsecVpnDpdProfileId, Boolean force, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteIPSecVPNDPDProfileValidateBeforeCall(ipsecVpnDpdProfileId, force, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getIPSecVPNDPDProfile
     * @param ipsecVpnDpdProfileId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getIPSecVPNDPDProfileCall(String ipsecVpnDpdProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vpn/ipsec/dpd-profiles/{ipsec-vpn-dpd-profile-id}"
            .replaceAll("\\{" + "ipsec-vpn-dpd-profile-id" + "\\}", apiClient.escapeString(ipsecVpnDpdProfileId.toString()));

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
    private com.squareup.okhttp.Call getIPSecVPNDPDProfileValidateBeforeCall(String ipsecVpnDpdProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ipsecVpnDpdProfileId' is set
        if (ipsecVpnDpdProfileId == null) {
            throw new ApiException("Missing the required parameter 'ipsecVpnDpdProfileId' when calling getIPSecVPNDPDProfile(Async)");
        }
        
        com.squareup.okhttp.Call call = getIPSecVPNDPDProfileCall(ipsecVpnDpdProfileId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get IPSec dead peer detection (DPD) profile
     * Get IPSec dead peer detection (DPD) profile.
     * @param ipsecVpnDpdProfileId  (required)
     * @return IPSecVPNDPDProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IPSecVPNDPDProfile getIPSecVPNDPDProfile(String ipsecVpnDpdProfileId) throws ApiException {
        ApiResponse<IPSecVPNDPDProfile> resp = getIPSecVPNDPDProfileWithHttpInfo(ipsecVpnDpdProfileId);
        return resp.getData();
    }

    /**
     * Get IPSec dead peer detection (DPD) profile
     * Get IPSec dead peer detection (DPD) profile.
     * @param ipsecVpnDpdProfileId  (required)
     * @return ApiResponse&lt;IPSecVPNDPDProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IPSecVPNDPDProfile> getIPSecVPNDPDProfileWithHttpInfo(String ipsecVpnDpdProfileId) throws ApiException {
        com.squareup.okhttp.Call call = getIPSecVPNDPDProfileValidateBeforeCall(ipsecVpnDpdProfileId, null, null);
        Type localVarReturnType = new TypeToken<IPSecVPNDPDProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get IPSec dead peer detection (DPD) profile (asynchronously)
     * Get IPSec dead peer detection (DPD) profile.
     * @param ipsecVpnDpdProfileId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIPSecVPNDPDProfileAsync(String ipsecVpnDpdProfileId, final ApiCallback<IPSecVPNDPDProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIPSecVPNDPDProfileValidateBeforeCall(ipsecVpnDpdProfileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IPSecVPNDPDProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listIPSecVPNDPDProfiles
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
    public com.squareup.okhttp.Call listIPSecVPNDPDProfilesCall(String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vpn/ipsec/dpd-profiles";

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
    private com.squareup.okhttp.Call listIPSecVPNDPDProfilesValidateBeforeCall(String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listIPSecVPNDPDProfilesCall(cursor, includedFields, pageSize, sortAscending, sortBy, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get IPSec dead peer detection (DPD)  profile list result
     * Get paginated list of all dead peer detection (DPD) profiles.
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return IPSecVPNDPDProfileListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IPSecVPNDPDProfileListResult listIPSecVPNDPDProfiles(String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy) throws ApiException {
        ApiResponse<IPSecVPNDPDProfileListResult> resp = listIPSecVPNDPDProfilesWithHttpInfo(cursor, includedFields, pageSize, sortAscending, sortBy);
        return resp.getData();
    }

    /**
     * Get IPSec dead peer detection (DPD)  profile list result
     * Get paginated list of all dead peer detection (DPD) profiles.
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return ApiResponse&lt;IPSecVPNDPDProfileListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IPSecVPNDPDProfileListResult> listIPSecVPNDPDProfilesWithHttpInfo(String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = listIPSecVPNDPDProfilesValidateBeforeCall(cursor, includedFields, pageSize, sortAscending, sortBy, null, null);
        Type localVarReturnType = new TypeToken<IPSecVPNDPDProfileListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get IPSec dead peer detection (DPD)  profile list result (asynchronously)
     * Get paginated list of all dead peer detection (DPD) profiles.
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listIPSecVPNDPDProfilesAsync(String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ApiCallback<IPSecVPNDPDProfileListResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listIPSecVPNDPDProfilesValidateBeforeCall(cursor, includedFields, pageSize, sortAscending, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IPSecVPNDPDProfileListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateIPSecVPNDPDProfile
     * @param body  (required)
     * @param ipsecVpnDpdProfileId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateIPSecVPNDPDProfileCall(IPSecVPNDPDProfile body, String ipsecVpnDpdProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/vpn/ipsec/dpd-profiles/{ipsec-vpn-dpd-profile-id}"
            .replaceAll("\\{" + "ipsec-vpn-dpd-profile-id" + "\\}", apiClient.escapeString(ipsecVpnDpdProfileId.toString()));

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
    private com.squareup.okhttp.Call updateIPSecVPNDPDProfileValidateBeforeCall(IPSecVPNDPDProfile body, String ipsecVpnDpdProfileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateIPSecVPNDPDProfile(Async)");
        }
        // verify the required parameter 'ipsecVpnDpdProfileId' is set
        if (ipsecVpnDpdProfileId == null) {
            throw new ApiException("Missing the required parameter 'ipsecVpnDpdProfileId' when calling updateIPSecVPNDPDProfile(Async)");
        }
        
        com.squareup.okhttp.Call call = updateIPSecVPNDPDProfileCall(body, ipsecVpnDpdProfileId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit IPSec dead peer detection (DPD) profile
     * Edit IPSec dead peer detection (DPD) profile.
     * @param body  (required)
     * @param ipsecVpnDpdProfileId  (required)
     * @return IPSecVPNDPDProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IPSecVPNDPDProfile updateIPSecVPNDPDProfile(IPSecVPNDPDProfile body, String ipsecVpnDpdProfileId) throws ApiException {
        ApiResponse<IPSecVPNDPDProfile> resp = updateIPSecVPNDPDProfileWithHttpInfo(body, ipsecVpnDpdProfileId);
        return resp.getData();
    }

    /**
     * Edit IPSec dead peer detection (DPD) profile
     * Edit IPSec dead peer detection (DPD) profile.
     * @param body  (required)
     * @param ipsecVpnDpdProfileId  (required)
     * @return ApiResponse&lt;IPSecVPNDPDProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IPSecVPNDPDProfile> updateIPSecVPNDPDProfileWithHttpInfo(IPSecVPNDPDProfile body, String ipsecVpnDpdProfileId) throws ApiException {
        com.squareup.okhttp.Call call = updateIPSecVPNDPDProfileValidateBeforeCall(body, ipsecVpnDpdProfileId, null, null);
        Type localVarReturnType = new TypeToken<IPSecVPNDPDProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit IPSec dead peer detection (DPD) profile (asynchronously)
     * Edit IPSec dead peer detection (DPD) profile.
     * @param body  (required)
     * @param ipsecVpnDpdProfileId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateIPSecVPNDPDProfileAsync(IPSecVPNDPDProfile body, String ipsecVpnDpdProfileId, final ApiCallback<IPSecVPNDPDProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateIPSecVPNDPDProfileValidateBeforeCall(body, ipsecVpnDpdProfileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IPSecVPNDPDProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}