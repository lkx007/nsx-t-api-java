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
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * Request to update the certificate of a principal identity with a new certificate 
 */
@Schema(description = "Request to update the certificate of a principal identity with a new certificate ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class UpdatePrincipalIdentityCertificateRequest extends ManagedResource {
  @SerializedName("principal_identity_id")
  private String principalIdentityId = null;

  @SerializedName("certificate_id")
  private String certificateId = null;

  public UpdatePrincipalIdentityCertificateRequest principalIdentityId(String principalIdentityId) {
    this.principalIdentityId = principalIdentityId;
    return this;
  }

   /**
   * Unique ID of the principal
   * @return principalIdentityId
  **/
  @Schema(required = true, description = "Unique ID of the principal")
  public String getPrincipalIdentityId() {
    return principalIdentityId;
  }

  public void setPrincipalIdentityId(String principalIdentityId) {
    this.principalIdentityId = principalIdentityId;
  }

  public UpdatePrincipalIdentityCertificateRequest certificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

   /**
   * Id of the stored certificate
   * @return certificateId
  **/
  @Schema(required = true, description = "Id of the stored certificate")
  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePrincipalIdentityCertificateRequest updatePrincipalIdentityCertificateRequest = (UpdatePrincipalIdentityCertificateRequest) o;
    return Objects.equals(this.principalIdentityId, updatePrincipalIdentityCertificateRequest.principalIdentityId) &&
        Objects.equals(this.certificateId, updatePrincipalIdentityCertificateRequest.certificateId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalIdentityId, certificateId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePrincipalIdentityCertificateRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    principalIdentityId: ").append(toIndentedString(principalIdentityId)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
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
