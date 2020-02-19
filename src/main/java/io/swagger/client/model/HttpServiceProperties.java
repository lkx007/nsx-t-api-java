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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Certificate;
import io.swagger.client.model.CipherSuite;
import io.swagger.client.model.ProtocolVersion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * HTTP Service properties
 */
@Schema(description = "HTTP Service properties")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class HttpServiceProperties {
  @SerializedName("global_api_concurrency_limit")
  private Long globalApiConcurrencyLimit = 100l;

  @SerializedName("client_api_concurrency_limit")
  private Long clientApiConcurrencyLimit = 40l;

  @SerializedName("session_timeout")
  private Long sessionTimeout = null;

  @SerializedName("client_api_rate_limit")
  private Long clientApiRateLimit = 100l;

  @SerializedName("certificate")
  private Certificate certificate = null;

  @SerializedName("redirect_host")
  private String redirectHost = "";

  @SerializedName("protocol_versions")
  private List<ProtocolVersion> protocolVersions = null;

  @SerializedName("cipher_suites")
  private List<CipherSuite> cipherSuites = null;

  @SerializedName("connection_timeout")
  private Long connectionTimeout = null;

  public HttpServiceProperties globalApiConcurrencyLimit(Long globalApiConcurrencyLimit) {
    this.globalApiConcurrencyLimit = globalApiConcurrencyLimit;
    return this;
  }

   /**
   * The maximum number of concurrent API requests that will be serviced. If the number of API requests being processed exceeds this limit, new API requests will be refused and a 503 Service Unavailable response will be returned to the client.  To disable API concurrency limiting, set this value to 0.
   * minimum: 0
   * @return globalApiConcurrencyLimit
  **/
  @Schema(description = "The maximum number of concurrent API requests that will be serviced. If the number of API requests being processed exceeds this limit, new API requests will be refused and a 503 Service Unavailable response will be returned to the client.  To disable API concurrency limiting, set this value to 0.")
  public Long getGlobalApiConcurrencyLimit() {
    return globalApiConcurrencyLimit;
  }

  public void setGlobalApiConcurrencyLimit(Long globalApiConcurrencyLimit) {
    this.globalApiConcurrencyLimit = globalApiConcurrencyLimit;
  }

  public HttpServiceProperties clientApiConcurrencyLimit(Long clientApiConcurrencyLimit) {
    this.clientApiConcurrencyLimit = clientApiConcurrencyLimit;
    return this;
  }

   /**
   * The maximum number of concurrent API requests that will be serviced for a given authenticated client.  If the number of API requests being processed exceeds this limit, new API requests will be refused and a 503 Service Unavailable response will be returned to the client. To disable API concurrency limiting, set this value to 0.
   * minimum: 0
   * @return clientApiConcurrencyLimit
  **/
  @Schema(description = "The maximum number of concurrent API requests that will be serviced for a given authenticated client.  If the number of API requests being processed exceeds this limit, new API requests will be refused and a 503 Service Unavailable response will be returned to the client. To disable API concurrency limiting, set this value to 0.")
  public Long getClientApiConcurrencyLimit() {
    return clientApiConcurrencyLimit;
  }

  public void setClientApiConcurrencyLimit(Long clientApiConcurrencyLimit) {
    this.clientApiConcurrencyLimit = clientApiConcurrencyLimit;
  }

  public HttpServiceProperties sessionTimeout(Long sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
    return this;
  }

   /**
   * NSX session inactivity timeout, set to 0 to configure no timeout
   * minimum: 0
   * maximum: 2147483647
   * @return sessionTimeout
  **/
  @Schema(description = "NSX session inactivity timeout, set to 0 to configure no timeout")
  public Long getSessionTimeout() {
    return sessionTimeout;
  }

  public void setSessionTimeout(Long sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  public HttpServiceProperties clientApiRateLimit(Long clientApiRateLimit) {
    this.clientApiRateLimit = clientApiRateLimit;
    return this;
  }

   /**
   * The maximum number of API requests that will be serviced per second for a given authenticated client.  If more API requests are received than can be serviced, a 429 Too Many Requests HTTP response will be returned. To disable API rate limiting, set this value to 0.
   * minimum: 0
   * @return clientApiRateLimit
  **/
  @Schema(description = "The maximum number of API requests that will be serviced per second for a given authenticated client.  If more API requests are received than can be serviced, a 429 Too Many Requests HTTP response will be returned. To disable API rate limiting, set this value to 0.")
  public Long getClientApiRateLimit() {
    return clientApiRateLimit;
  }

  public void setClientApiRateLimit(Long clientApiRateLimit) {
    this.clientApiRateLimit = clientApiRateLimit;
  }

  public HttpServiceProperties certificate(Certificate certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @Schema(description = "")
  public Certificate getCertificate() {
    return certificate;
  }

  public void setCertificate(Certificate certificate) {
    this.certificate = certificate;
  }

  public HttpServiceProperties redirectHost(String redirectHost) {
    this.redirectHost = redirectHost;
    return this;
  }

   /**
   * Host name or IP address to use for redirect location headers, or empty string to derive from current request
   * @return redirectHost
  **/
  @Schema(description = "Host name or IP address to use for redirect location headers, or empty string to derive from current request")
  public String getRedirectHost() {
    return redirectHost;
  }

  public void setRedirectHost(String redirectHost) {
    this.redirectHost = redirectHost;
  }

  public HttpServiceProperties protocolVersions(List<ProtocolVersion> protocolVersions) {
    this.protocolVersions = protocolVersions;
    return this;
  }

  public HttpServiceProperties addProtocolVersionsItem(ProtocolVersion protocolVersionsItem) {
    if (this.protocolVersions == null) {
      this.protocolVersions = new ArrayList<ProtocolVersion>();
    }
    this.protocolVersions.add(protocolVersionsItem);
    return this;
  }

   /**
   * TLS protocol versions
   * @return protocolVersions
  **/
  @Schema(description = "TLS protocol versions")
  public List<ProtocolVersion> getProtocolVersions() {
    return protocolVersions;
  }

  public void setProtocolVersions(List<ProtocolVersion> protocolVersions) {
    this.protocolVersions = protocolVersions;
  }

  public HttpServiceProperties cipherSuites(List<CipherSuite> cipherSuites) {
    this.cipherSuites = cipherSuites;
    return this;
  }

  public HttpServiceProperties addCipherSuitesItem(CipherSuite cipherSuitesItem) {
    if (this.cipherSuites == null) {
      this.cipherSuites = new ArrayList<CipherSuite>();
    }
    this.cipherSuites.add(cipherSuitesItem);
    return this;
  }

   /**
   * Cipher suites used to secure contents of connection
   * @return cipherSuites
  **/
  @Schema(description = "Cipher suites used to secure contents of connection")
  public List<CipherSuite> getCipherSuites() {
    return cipherSuites;
  }

  public void setCipherSuites(List<CipherSuite> cipherSuites) {
    this.cipherSuites = cipherSuites;
  }

  public HttpServiceProperties connectionTimeout(Long connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

   /**
   * NSX connection timeout, set to 0 to configure no timeout
   * minimum: 0
   * maximum: 2147483647
   * @return connectionTimeout
  **/
  @Schema(description = "NSX connection timeout, set to 0 to configure no timeout")
  public Long getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(Long connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpServiceProperties httpServiceProperties = (HttpServiceProperties) o;
    return Objects.equals(this.globalApiConcurrencyLimit, httpServiceProperties.globalApiConcurrencyLimit) &&
        Objects.equals(this.clientApiConcurrencyLimit, httpServiceProperties.clientApiConcurrencyLimit) &&
        Objects.equals(this.sessionTimeout, httpServiceProperties.sessionTimeout) &&
        Objects.equals(this.clientApiRateLimit, httpServiceProperties.clientApiRateLimit) &&
        Objects.equals(this.certificate, httpServiceProperties.certificate) &&
        Objects.equals(this.redirectHost, httpServiceProperties.redirectHost) &&
        Objects.equals(this.protocolVersions, httpServiceProperties.protocolVersions) &&
        Objects.equals(this.cipherSuites, httpServiceProperties.cipherSuites) &&
        Objects.equals(this.connectionTimeout, httpServiceProperties.connectionTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalApiConcurrencyLimit, clientApiConcurrencyLimit, sessionTimeout, clientApiRateLimit, certificate, redirectHost, protocolVersions, cipherSuites, connectionTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpServiceProperties {\n");
    
    sb.append("    globalApiConcurrencyLimit: ").append(toIndentedString(globalApiConcurrencyLimit)).append("\n");
    sb.append("    clientApiConcurrencyLimit: ").append(toIndentedString(clientApiConcurrencyLimit)).append("\n");
    sb.append("    sessionTimeout: ").append(toIndentedString(sessionTimeout)).append("\n");
    sb.append("    clientApiRateLimit: ").append(toIndentedString(clientApiRateLimit)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    redirectHost: ").append(toIndentedString(redirectHost)).append("\n");
    sb.append("    protocolVersions: ").append(toIndentedString(protocolVersions)).append("\n");
    sb.append("    cipherSuites: ").append(toIndentedString(cipherSuites)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
