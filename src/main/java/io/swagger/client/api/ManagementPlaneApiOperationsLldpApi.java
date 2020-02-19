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
import io.swagger.client.model.InterfaceNeighborProperties;
import io.swagger.client.model.InterfaceNeighborPropertyListResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiOperationsLldpApi {
    private ApiClient apiClient;

    public ManagementPlaneApiOperationsLldpApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiOperationsLldpApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listFabricNodeNeighborProperties
     * @param fabricNodeId ID of fabric node (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listFabricNodeNeighborPropertiesCall(String fabricNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/lldp/fabric-nodes/{fabric-node-id}/interfaces"
            .replaceAll("\\{" + "fabric-node-id" + "\\}", apiClient.escapeString(fabricNodeId.toString()));

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
    private com.squareup.okhttp.Call listFabricNodeNeighborPropertiesValidateBeforeCall(String fabricNodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'fabricNodeId' is set
        if (fabricNodeId == null) {
            throw new ApiException("Missing the required parameter 'fabricNodeId' when calling listFabricNodeNeighborProperties(Async)");
        }
        
        com.squareup.okhttp.Call call = listFabricNodeNeighborPropertiesCall(fabricNodeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List LLDP Neighbor Properties of Fabric Node
     * List LLDP Neighbor Properties for all interfaces of Fabric Node 
     * @param fabricNodeId ID of fabric node (required)
     * @return InterfaceNeighborPropertyListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InterfaceNeighborPropertyListResult listFabricNodeNeighborProperties(String fabricNodeId) throws ApiException {
        ApiResponse<InterfaceNeighborPropertyListResult> resp = listFabricNodeNeighborPropertiesWithHttpInfo(fabricNodeId);
        return resp.getData();
    }

    /**
     * List LLDP Neighbor Properties of Fabric Node
     * List LLDP Neighbor Properties for all interfaces of Fabric Node 
     * @param fabricNodeId ID of fabric node (required)
     * @return ApiResponse&lt;InterfaceNeighborPropertyListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InterfaceNeighborPropertyListResult> listFabricNodeNeighborPropertiesWithHttpInfo(String fabricNodeId) throws ApiException {
        com.squareup.okhttp.Call call = listFabricNodeNeighborPropertiesValidateBeforeCall(fabricNodeId, null, null);
        Type localVarReturnType = new TypeToken<InterfaceNeighborPropertyListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List LLDP Neighbor Properties of Fabric Node (asynchronously)
     * List LLDP Neighbor Properties for all interfaces of Fabric Node 
     * @param fabricNodeId ID of fabric node (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFabricNodeNeighborPropertiesAsync(String fabricNodeId, final ApiCallback<InterfaceNeighborPropertyListResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listFabricNodeNeighborPropertiesValidateBeforeCall(fabricNodeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InterfaceNeighborPropertyListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readFabricNodeNeighborProperties
     * @param fabricNodeId ID of fabric node (required)
     * @param interfaceName Interface name to read (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readFabricNodeNeighborPropertiesCall(String fabricNodeId, String interfaceName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/lldp/fabric-nodes/{fabric-node-id}/interfaces/{interface-name}"
            .replaceAll("\\{" + "fabric-node-id" + "\\}", apiClient.escapeString(fabricNodeId.toString()))
            .replaceAll("\\{" + "interface-name" + "\\}", apiClient.escapeString(interfaceName.toString()));

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
    private com.squareup.okhttp.Call readFabricNodeNeighborPropertiesValidateBeforeCall(String fabricNodeId, String interfaceName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'fabricNodeId' is set
        if (fabricNodeId == null) {
            throw new ApiException("Missing the required parameter 'fabricNodeId' when calling readFabricNodeNeighborProperties(Async)");
        }
        // verify the required parameter 'interfaceName' is set
        if (interfaceName == null) {
            throw new ApiException("Missing the required parameter 'interfaceName' when calling readFabricNodeNeighborProperties(Async)");
        }
        
        com.squareup.okhttp.Call call = readFabricNodeNeighborPropertiesCall(fabricNodeId, interfaceName, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Read LLDP Neighbor Properties of Fabric Node by Interface Name
     * Read LLDP Neighbor Properties for a specific interface of Fabric Node 
     * @param fabricNodeId ID of fabric node (required)
     * @param interfaceName Interface name to read (required)
     * @return InterfaceNeighborProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InterfaceNeighborProperties readFabricNodeNeighborProperties(String fabricNodeId, String interfaceName) throws ApiException {
        ApiResponse<InterfaceNeighborProperties> resp = readFabricNodeNeighborPropertiesWithHttpInfo(fabricNodeId, interfaceName);
        return resp.getData();
    }

    /**
     * Read LLDP Neighbor Properties of Fabric Node by Interface Name
     * Read LLDP Neighbor Properties for a specific interface of Fabric Node 
     * @param fabricNodeId ID of fabric node (required)
     * @param interfaceName Interface name to read (required)
     * @return ApiResponse&lt;InterfaceNeighborProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InterfaceNeighborProperties> readFabricNodeNeighborPropertiesWithHttpInfo(String fabricNodeId, String interfaceName) throws ApiException {
        com.squareup.okhttp.Call call = readFabricNodeNeighborPropertiesValidateBeforeCall(fabricNodeId, interfaceName, null, null);
        Type localVarReturnType = new TypeToken<InterfaceNeighborProperties>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read LLDP Neighbor Properties of Fabric Node by Interface Name (asynchronously)
     * Read LLDP Neighbor Properties for a specific interface of Fabric Node 
     * @param fabricNodeId ID of fabric node (required)
     * @param interfaceName Interface name to read (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readFabricNodeNeighborPropertiesAsync(String fabricNodeId, String interfaceName, final ApiCallback<InterfaceNeighborProperties> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readFabricNodeNeighborPropertiesValidateBeforeCall(fabricNodeId, interfaceName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InterfaceNeighborProperties>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}