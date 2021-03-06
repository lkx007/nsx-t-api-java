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
import io.swagger.client.model.ContainerApplication;
import io.swagger.client.model.ContainerApplicationInstance;
import io.swagger.client.model.ContainerApplicationInstanceListResult;
import io.swagger.client.model.ContainerApplicationListResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiFabricContainerApplicationsApi {
    private ApiClient apiClient;

    public ManagementPlaneApiFabricContainerApplicationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiFabricContainerApplicationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getContainerApplication
     * @param containerApplicationId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getContainerApplicationCall(String containerApplicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/fabric/container-applications/{container-application-id}"
            .replaceAll("\\{" + "container-application-id" + "\\}", apiClient.escapeString(containerApplicationId.toString()));

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
    private com.squareup.okhttp.Call getContainerApplicationValidateBeforeCall(String containerApplicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'containerApplicationId' is set
        if (containerApplicationId == null) {
            throw new ApiException("Missing the required parameter 'containerApplicationId' when calling getContainerApplication(Async)");
        }
        
        com.squareup.okhttp.Call call = getContainerApplicationCall(containerApplicationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Return a Container Application within a container project
     * Returns information about a specific Container Application within a project.
     * @param containerApplicationId  (required)
     * @return ContainerApplication
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContainerApplication getContainerApplication(String containerApplicationId) throws ApiException {
        ApiResponse<ContainerApplication> resp = getContainerApplicationWithHttpInfo(containerApplicationId);
        return resp.getData();
    }

    /**
     * Return a Container Application within a container project
     * Returns information about a specific Container Application within a project.
     * @param containerApplicationId  (required)
     * @return ApiResponse&lt;ContainerApplication&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContainerApplication> getContainerApplicationWithHttpInfo(String containerApplicationId) throws ApiException {
        com.squareup.okhttp.Call call = getContainerApplicationValidateBeforeCall(containerApplicationId, null, null);
        Type localVarReturnType = new TypeToken<ContainerApplication>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a Container Application within a container project (asynchronously)
     * Returns information about a specific Container Application within a project.
     * @param containerApplicationId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContainerApplicationAsync(String containerApplicationId, final ApiCallback<ContainerApplication> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getContainerApplicationValidateBeforeCall(containerApplicationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContainerApplication>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getContainerApplicationInstance
     * @param containerApplicationInstanceId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getContainerApplicationInstanceCall(String containerApplicationInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/fabric/container-application-instances/{container-application-instance-id}"
            .replaceAll("\\{" + "container-application-instance-id" + "\\}", apiClient.escapeString(containerApplicationInstanceId.toString()));

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
    private com.squareup.okhttp.Call getContainerApplicationInstanceValidateBeforeCall(String containerApplicationInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'containerApplicationInstanceId' is set
        if (containerApplicationInstanceId == null) {
            throw new ApiException("Missing the required parameter 'containerApplicationInstanceId' when calling getContainerApplicationInstance(Async)");
        }
        
        com.squareup.okhttp.Call call = getContainerApplicationInstanceCall(containerApplicationInstanceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Return a container application instance
     * Returns information about a specific container application instance.
     * @param containerApplicationInstanceId  (required)
     * @return ContainerApplicationInstance
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContainerApplicationInstance getContainerApplicationInstance(String containerApplicationInstanceId) throws ApiException {
        ApiResponse<ContainerApplicationInstance> resp = getContainerApplicationInstanceWithHttpInfo(containerApplicationInstanceId);
        return resp.getData();
    }

    /**
     * Return a container application instance
     * Returns information about a specific container application instance.
     * @param containerApplicationInstanceId  (required)
     * @return ApiResponse&lt;ContainerApplicationInstance&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContainerApplicationInstance> getContainerApplicationInstanceWithHttpInfo(String containerApplicationInstanceId) throws ApiException {
        com.squareup.okhttp.Call call = getContainerApplicationInstanceValidateBeforeCall(containerApplicationInstanceId, null, null);
        Type localVarReturnType = new TypeToken<ContainerApplicationInstance>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a container application instance (asynchronously)
     * Returns information about a specific container application instance.
     * @param containerApplicationInstanceId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContainerApplicationInstanceAsync(String containerApplicationInstanceId, final ApiCallback<ContainerApplicationInstance> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getContainerApplicationInstanceValidateBeforeCall(containerApplicationInstanceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContainerApplicationInstance>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listContainerApplicationInstances
     * @param containerApplicationId Identifier of the container application (optional)
     * @param containerClusterId Identifier of the container cluster (optional)
     * @param containerProjectId Identifier of the container project (optional)
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
    public com.squareup.okhttp.Call listContainerApplicationInstancesCall(String containerApplicationId, String containerClusterId, String containerProjectId, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/fabric/container-application-instances";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (containerApplicationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("container_application_id", containerApplicationId));
        if (containerClusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("container_cluster_id", containerClusterId));
        if (containerProjectId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("container_project_id", containerProjectId));
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
    private com.squareup.okhttp.Call listContainerApplicationInstancesValidateBeforeCall(String containerApplicationId, String containerClusterId, String containerProjectId, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listContainerApplicationInstancesCall(containerApplicationId, containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Return the list of container application instance
     * Returns information about all container application instance.
     * @param containerApplicationId Identifier of the container application (optional)
     * @param containerClusterId Identifier of the container cluster (optional)
     * @param containerProjectId Identifier of the container project (optional)
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return ContainerApplicationInstanceListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContainerApplicationInstanceListResult listContainerApplicationInstances(String containerApplicationId, String containerClusterId, String containerProjectId, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy) throws ApiException {
        ApiResponse<ContainerApplicationInstanceListResult> resp = listContainerApplicationInstancesWithHttpInfo(containerApplicationId, containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy);
        return resp.getData();
    }

    /**
     * Return the list of container application instance
     * Returns information about all container application instance.
     * @param containerApplicationId Identifier of the container application (optional)
     * @param containerClusterId Identifier of the container cluster (optional)
     * @param containerProjectId Identifier of the container project (optional)
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return ApiResponse&lt;ContainerApplicationInstanceListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContainerApplicationInstanceListResult> listContainerApplicationInstancesWithHttpInfo(String containerApplicationId, String containerClusterId, String containerProjectId, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = listContainerApplicationInstancesValidateBeforeCall(containerApplicationId, containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy, null, null);
        Type localVarReturnType = new TypeToken<ContainerApplicationInstanceListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return the list of container application instance (asynchronously)
     * Returns information about all container application instance.
     * @param containerApplicationId Identifier of the container application (optional)
     * @param containerClusterId Identifier of the container cluster (optional)
     * @param containerProjectId Identifier of the container project (optional)
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listContainerApplicationInstancesAsync(String containerApplicationId, String containerClusterId, String containerProjectId, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ApiCallback<ContainerApplicationInstanceListResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listContainerApplicationInstancesValidateBeforeCall(containerApplicationId, containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContainerApplicationInstanceListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listContainerApplications
     * @param containerClusterId Identifier of the container cluster (optional)
     * @param containerProjectId Identifier of the container project (optional)
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
    public com.squareup.okhttp.Call listContainerApplicationsCall(String containerClusterId, String containerProjectId, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/fabric/container-applications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (containerClusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("container_cluster_id", containerClusterId));
        if (containerProjectId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("container_project_id", containerProjectId));
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
    private com.squareup.okhttp.Call listContainerApplicationsValidateBeforeCall(String containerClusterId, String containerProjectId, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listContainerApplicationsCall(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Return the List of Container Applications
     * Returns information about all Container Applications.
     * @param containerClusterId Identifier of the container cluster (optional)
     * @param containerProjectId Identifier of the container project (optional)
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return ContainerApplicationListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContainerApplicationListResult listContainerApplications(String containerClusterId, String containerProjectId, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy) throws ApiException {
        ApiResponse<ContainerApplicationListResult> resp = listContainerApplicationsWithHttpInfo(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy);
        return resp.getData();
    }

    /**
     * Return the List of Container Applications
     * Returns information about all Container Applications.
     * @param containerClusterId Identifier of the container cluster (optional)
     * @param containerProjectId Identifier of the container project (optional)
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @return ApiResponse&lt;ContainerApplicationListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContainerApplicationListResult> listContainerApplicationsWithHttpInfo(String containerClusterId, String containerProjectId, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy) throws ApiException {
        com.squareup.okhttp.Call call = listContainerApplicationsValidateBeforeCall(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy, null, null);
        Type localVarReturnType = new TypeToken<ContainerApplicationListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return the List of Container Applications (asynchronously)
     * Returns information about all Container Applications.
     * @param containerClusterId Identifier of the container cluster (optional)
     * @param containerProjectId Identifier of the container project (optional)
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listContainerApplicationsAsync(String containerClusterId, String containerProjectId, String cursor, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, final ApiCallback<ContainerApplicationListResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listContainerApplicationsValidateBeforeCall(containerClusterId, containerProjectId, cursor, includedFields, pageSize, sortAscending, sortBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContainerApplicationListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
