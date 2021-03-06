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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SecurityCertificate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SecurityCertificate {
  @SerializedName("text")
  private String text = null;

  @SerializedName("valid_from")
  private String validFrom = null;

  @SerializedName("ssh_public_key")
  private String sshPublicKey = null;

  @SerializedName("valid_to")
  private String validTo = null;

  @SerializedName("pem_encoded")
  private String pemEncoded = null;

   /**
   * X.509 certificate in text form
   * @return text
  **/
  @Schema(description = "X.509 certificate in text form")
  public String getText() {
    return text;
  }

   /**
   * The time when the certificate starts being valid
   * @return validFrom
  **/
  @Schema(description = "The time when the certificate starts being valid")
  public String getValidFrom() {
    return validFrom;
  }

   /**
   * Get sshPublicKey
   * @return sshPublicKey
  **/
  @Schema(description = "")
  public String getSshPublicKey() {
    return sshPublicKey;
  }

   /**
   * The time when the certificate stops being valid
   * @return validTo
  **/
  @Schema(description = "The time when the certificate stops being valid")
  public String getValidTo() {
    return validTo;
  }

  public SecurityCertificate pemEncoded(String pemEncoded) {
    this.pemEncoded = pemEncoded;
    return this;
  }

   /**
   * The certificate must include the enclosing \&quot;-----BEGIN CERTIFICATE-----\&quot; and \&quot;-----END CERTIFICATE-----\&quot;
   * @return pemEncoded
  **/
  @Schema(required = true, description = "The certificate must include the enclosing \"-----BEGIN CERTIFICATE-----\" and \"-----END CERTIFICATE-----\"")
  public String getPemEncoded() {
    return pemEncoded;
  }

  public void setPemEncoded(String pemEncoded) {
    this.pemEncoded = pemEncoded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityCertificate securityCertificate = (SecurityCertificate) o;
    return Objects.equals(this.text, securityCertificate.text) &&
        Objects.equals(this.validFrom, securityCertificate.validFrom) &&
        Objects.equals(this.sshPublicKey, securityCertificate.sshPublicKey) &&
        Objects.equals(this.validTo, securityCertificate.validTo) &&
        Objects.equals(this.pemEncoded, securityCertificate.pemEncoded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, validFrom, sshPublicKey, validTo, pemEncoded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityCertificate {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    sshPublicKey: ").append(toIndentedString(sshPublicKey)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    pemEncoded: ").append(toIndentedString(pemEncoded)).append("\n");
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
