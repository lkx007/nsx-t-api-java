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
import io.swagger.client.model.HostedEntityInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ServiceEndpoint
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ServiceEndpoint {
  @SerializedName("certificate_sha256_thumbprint")
  private String certificateSha256Thumbprint = null;

  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("entities_hosted")
  private List<HostedEntityInfo> entitiesHosted = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("fqdn")
  private String fqdn = null;

  @SerializedName("service_endpoint_uuid")
  private String serviceEndpointUuid = null;

  @SerializedName("port")
  private Long port = null;

   /**
   * Get certificateSha256Thumbprint
   * @return certificateSha256Thumbprint
  **/
  @Schema(description = "")
  public String getCertificateSha256Thumbprint() {
    return certificateSha256Thumbprint;
  }

  public ServiceEndpoint certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Certificate or certificate chain
   * @return certificate
  **/
  @Schema(description = "Certificate or certificate chain")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

   /**
   * List of entities hosted on accessible through the service endpoint
   * @return entitiesHosted
  **/
  @Schema(description = "List of entities hosted on accessible through the service endpoint")
  public List<HostedEntityInfo> getEntitiesHosted() {
    return entitiesHosted;
  }

  public ServiceEndpoint ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IPv4 or IPv6 address
   * @return ipAddress
  **/
  @Schema(required = true, description = "IPv4 or IPv6 address")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

   /**
   * Get fqdn
   * @return fqdn
  **/
  @Schema(description = "")
  public String getFqdn() {
    return fqdn;
  }

   /**
   * Unique identifier of this service endpoint
   * @return serviceEndpointUuid
  **/
  @Schema(description = "Unique identifier of this service endpoint")
  public String getServiceEndpointUuid() {
    return serviceEndpointUuid;
  }

  public ServiceEndpoint port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * minimum: 0
   * maximum: 65535
   * @return port
  **/
  @Schema(required = true, description = "")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceEndpoint serviceEndpoint = (ServiceEndpoint) o;
    return Objects.equals(this.certificateSha256Thumbprint, serviceEndpoint.certificateSha256Thumbprint) &&
        Objects.equals(this.certificate, serviceEndpoint.certificate) &&
        Objects.equals(this.entitiesHosted, serviceEndpoint.entitiesHosted) &&
        Objects.equals(this.ipAddress, serviceEndpoint.ipAddress) &&
        Objects.equals(this.fqdn, serviceEndpoint.fqdn) &&
        Objects.equals(this.serviceEndpointUuid, serviceEndpoint.serviceEndpointUuid) &&
        Objects.equals(this.port, serviceEndpoint.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateSha256Thumbprint, certificate, entitiesHosted, ipAddress, fqdn, serviceEndpointUuid, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceEndpoint {\n");
    
    sb.append("    certificateSha256Thumbprint: ").append(toIndentedString(certificateSha256Thumbprint)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    entitiesHosted: ").append(toIndentedString(entitiesHosted)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
    sb.append("    serviceEndpointUuid: ").append(toIndentedString(serviceEndpointUuid)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
