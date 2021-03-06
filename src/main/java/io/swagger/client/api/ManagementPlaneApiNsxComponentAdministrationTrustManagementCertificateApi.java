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
import io.swagger.client.model.Certificate;
import io.swagger.client.model.CertificateList;
import io.swagger.client.model.TrustObjectData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi {
    private ApiClient apiClient;

    public ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ManagementPlaneApiNsxComponentAdministrationTrustManagementCertificateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addCertificateImport
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addCertificateImportCall(TrustObjectData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/trust-management/certificates?action=import";

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
    private com.squareup.okhttp.Call addCertificateImportValidateBeforeCall(TrustObjectData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addCertificateImport(Async)");
        }
        
        com.squareup.okhttp.Call call = addCertificateImportCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add a New Certificate
     * Adds a new private-public certificate or a chain of certificates (CAs) and, optionally, a private key that can be applied to one of the user-facing components (appliance management or edge). The certificate and the key should be stored in PEM format. If no private key is provided, the certificate is used as a client certificate in the trust store. 
     * @param body  (required)
     * @return CertificateList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CertificateList addCertificateImport(TrustObjectData body) throws ApiException {
        ApiResponse<CertificateList> resp = addCertificateImportWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Add a New Certificate
     * Adds a new private-public certificate or a chain of certificates (CAs) and, optionally, a private key that can be applied to one of the user-facing components (appliance management or edge). The certificate and the key should be stored in PEM format. If no private key is provided, the certificate is used as a client certificate in the trust store. 
     * @param body  (required)
     * @return ApiResponse&lt;CertificateList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CertificateList> addCertificateImportWithHttpInfo(TrustObjectData body) throws ApiException {
        com.squareup.okhttp.Call call = addCertificateImportValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CertificateList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a New Certificate (asynchronously)
     * Adds a new private-public certificate or a chain of certificates (CAs) and, optionally, a private key that can be applied to one of the user-facing components (appliance management or edge). The certificate and the key should be stored in PEM format. If no private key is provided, the certificate is used as a client certificate in the trust store. 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addCertificateImportAsync(TrustObjectData body, final ApiCallback<CertificateList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addCertificateImportValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CertificateList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteCertificate
     * @param certId ID of certificate to delete (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCertificateCall(String certId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/trust-management/certificates/{cert-id}"
            .replaceAll("\\{" + "cert-id" + "\\}", apiClient.escapeString(certId.toString()));

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
    private com.squareup.okhttp.Call deleteCertificateValidateBeforeCall(String certId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'certId' is set
        if (certId == null) {
            throw new ApiException("Missing the required parameter 'certId' when calling deleteCertificate(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteCertificateCall(certId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Certificate for the Given Certificate ID
     * Removes the specified certificate. The private key associated with the certificate is also deleted. 
     * @param certId ID of certificate to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCertificate(String certId) throws ApiException {
        deleteCertificateWithHttpInfo(certId);
    }

    /**
     * Delete Certificate for the Given Certificate ID
     * Removes the specified certificate. The private key associated with the certificate is also deleted. 
     * @param certId ID of certificate to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCertificateWithHttpInfo(String certId) throws ApiException {
        com.squareup.okhttp.Call call = deleteCertificateValidateBeforeCall(certId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Certificate for the Given Certificate ID (asynchronously)
     * Removes the specified certificate. The private key associated with the certificate is also deleted. 
     * @param certId ID of certificate to delete (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCertificateAsync(String certId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCertificateValidateBeforeCall(certId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getCertificate
     * @param certId ID of certificate to read (required)
     * @param details whether to expand the pem data and show all its details (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCertificateCall(String certId, Boolean details, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/trust-management/certificates/{cert-id}"
            .replaceAll("\\{" + "cert-id" + "\\}", apiClient.escapeString(certId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (details != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("details", details));

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
    private com.squareup.okhttp.Call getCertificateValidateBeforeCall(String certId, Boolean details, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'certId' is set
        if (certId == null) {
            throw new ApiException("Missing the required parameter 'certId' when calling getCertificate(Async)");
        }
        
        com.squareup.okhttp.Call call = getCertificateCall(certId, details, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Show Certificate Data for the Given Certificate ID
     * Returns information for the specified certificate ID, including the certificate&#x27;s UUID; resource_type (for example, certificate_self_signed, certificate_ca, or certificate_signed); pem_encoded data; and history of the certificate (who created or modified it and when). For additional information, include the ?details&#x3D;true modifier at the end of the request URI. 
     * @param certId ID of certificate to read (required)
     * @param details whether to expand the pem data and show all its details (optional)
     * @return Certificate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Certificate getCertificate(String certId, Boolean details) throws ApiException {
        ApiResponse<Certificate> resp = getCertificateWithHttpInfo(certId, details);
        return resp.getData();
    }

    /**
     * Show Certificate Data for the Given Certificate ID
     * Returns information for the specified certificate ID, including the certificate&#x27;s UUID; resource_type (for example, certificate_self_signed, certificate_ca, or certificate_signed); pem_encoded data; and history of the certificate (who created or modified it and when). For additional information, include the ?details&#x3D;true modifier at the end of the request URI. 
     * @param certId ID of certificate to read (required)
     * @param details whether to expand the pem data and show all its details (optional)
     * @return ApiResponse&lt;Certificate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Certificate> getCertificateWithHttpInfo(String certId, Boolean details) throws ApiException {
        com.squareup.okhttp.Call call = getCertificateValidateBeforeCall(certId, details, null, null);
        Type localVarReturnType = new TypeToken<Certificate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show Certificate Data for the Given Certificate ID (asynchronously)
     * Returns information for the specified certificate ID, including the certificate&#x27;s UUID; resource_type (for example, certificate_self_signed, certificate_ca, or certificate_signed); pem_encoded data; and history of the certificate (who created or modified it and when). For additional information, include the ?details&#x3D;true modifier at the end of the request URI. 
     * @param certId ID of certificate to read (required)
     * @param details whether to expand the pem data and show all its details (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCertificateAsync(String certId, Boolean details, final ApiCallback<Certificate> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCertificateValidateBeforeCall(certId, details, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Certificate>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCertificates
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param details whether to expand the pem data and show all its details (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param type Type of certificate to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCertificatesCall(String cursor, Boolean details, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/trust-management/certificates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (details != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("details", details));
        if (includedFields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("included_fields", includedFields));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (sortAscending != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_ascending", sortAscending));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_by", sortBy));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));

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
    private com.squareup.okhttp.Call getCertificatesValidateBeforeCall(String cursor, Boolean details, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getCertificatesCall(cursor, details, includedFields, pageSize, sortAscending, sortBy, type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Return All the User-Facing Components&#x27; Certificates
     * Returns all certificate information viewable by the user, including each certificate&#x27;s UUID; resource_type (for example, certificate_self_signed, certificate_ca, or certificate_signed); pem_encoded data; and history of the certificate (who created or modified it and when). For additional information, include the ?details&#x3D;true modifier at the end of the request URI. 
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param details whether to expand the pem data and show all its details (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param type Type of certificate to return (optional)
     * @return CertificateList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CertificateList getCertificates(String cursor, Boolean details, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, String type) throws ApiException {
        ApiResponse<CertificateList> resp = getCertificatesWithHttpInfo(cursor, details, includedFields, pageSize, sortAscending, sortBy, type);
        return resp.getData();
    }

    /**
     * Return All the User-Facing Components&#x27; Certificates
     * Returns all certificate information viewable by the user, including each certificate&#x27;s UUID; resource_type (for example, certificate_self_signed, certificate_ca, or certificate_signed); pem_encoded data; and history of the certificate (who created or modified it and when). For additional information, include the ?details&#x3D;true modifier at the end of the request URI. 
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param details whether to expand the pem data and show all its details (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param type Type of certificate to return (optional)
     * @return ApiResponse&lt;CertificateList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CertificateList> getCertificatesWithHttpInfo(String cursor, Boolean details, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, String type) throws ApiException {
        com.squareup.okhttp.Call call = getCertificatesValidateBeforeCall(cursor, details, includedFields, pageSize, sortAscending, sortBy, type, null, null);
        Type localVarReturnType = new TypeToken<CertificateList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return All the User-Facing Components&#x27; Certificates (asynchronously)
     * Returns all certificate information viewable by the user, including each certificate&#x27;s UUID; resource_type (for example, certificate_self_signed, certificate_ca, or certificate_signed); pem_encoded data; and history of the certificate (who created or modified it and when). For additional information, include the ?details&#x3D;true modifier at the end of the request URI. 
     * @param cursor Opaque cursor to be used for getting next page of records (supplied by current result page) (optional)
     * @param details whether to expand the pem data and show all its details (optional)
     * @param includedFields Comma separated list of fields that should be included in query result (optional)
     * @param pageSize Maximum number of results to return in this page (server may return fewer) (optional)
     * @param sortAscending  (optional)
     * @param sortBy Field by which records are sorted (optional)
     * @param type Type of certificate to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCertificatesAsync(String cursor, Boolean details, String includedFields, Long pageSize, Boolean sortAscending, String sortBy, String type, final ApiCallback<CertificateList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCertificatesValidateBeforeCall(cursor, details, includedFields, pageSize, sortAscending, sortBy, type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CertificateList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
