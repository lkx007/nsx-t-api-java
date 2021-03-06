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
import io.swagger.client.model.NodeIdServicesMap;
import io.swagger.client.model.Tag;
import io.swagger.client.model.X509Certificate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Certificate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class Certificate extends ManagedResource {
  @SerializedName("used_by")
  private List<NodeIdServicesMap> usedBy = null;

  @SerializedName("details")
  private List<X509Certificate> details = null;

  @SerializedName("pem_encoded")
  private String pemEncoded = null;

   /**
   * list of node IDs with services, that are using this certificate
   * @return usedBy
  **/
  @Schema(description = "list of node IDs with services, that are using this certificate")
  public List<NodeIdServicesMap> getUsedBy() {
    return usedBy;
  }

   /**
   * list of X509Certificates
   * @return details
  **/
  @Schema(description = "list of X509Certificates")
  public List<X509Certificate> getDetails() {
    return details;
  }

  public Certificate pemEncoded(String pemEncoded) {
    this.pemEncoded = pemEncoded;
    return this;
  }

   /**
   * pem encoded certificate data
   * @return pemEncoded
  **/
  @Schema(required = true, description = "pem encoded certificate data")
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
    Certificate certificate = (Certificate) o;
    return Objects.equals(this.usedBy, certificate.usedBy) &&
        Objects.equals(this.details, certificate.details) &&
        Objects.equals(this.pemEncoded, certificate.pemEncoded) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usedBy, details, pemEncoded, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Certificate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
