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
import io.swagger.client.model.BasicAuthenticationScheme;
import io.swagger.client.model.Protocol;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * HttpsProtocol
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class HttpsProtocol extends Protocol {
  @SerializedName("sha256_thumbprint")
  private String sha256Thumbprint = null;

  @SerializedName("authentication_scheme")
  private BasicAuthenticationScheme authenticationScheme = null;

  public HttpsProtocol sha256Thumbprint(String sha256Thumbprint) {
    this.sha256Thumbprint = sha256Thumbprint;
    return this;
  }

   /**
   * SSL thumbprint of server
   * @return sha256Thumbprint
  **/
  @Schema(required = true, description = "SSL thumbprint of server")
  public String getSha256Thumbprint() {
    return sha256Thumbprint;
  }

  public void setSha256Thumbprint(String sha256Thumbprint) {
    this.sha256Thumbprint = sha256Thumbprint;
  }

  public HttpsProtocol authenticationScheme(BasicAuthenticationScheme authenticationScheme) {
    this.authenticationScheme = authenticationScheme;
    return this;
  }

   /**
   * Get authenticationScheme
   * @return authenticationScheme
  **/
  @Schema(description = "")
  public BasicAuthenticationScheme getAuthenticationScheme() {
    return authenticationScheme;
  }

  public void setAuthenticationScheme(BasicAuthenticationScheme authenticationScheme) {
    this.authenticationScheme = authenticationScheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpsProtocol httpsProtocol = (HttpsProtocol) o;
    return Objects.equals(this.sha256Thumbprint, httpsProtocol.sha256Thumbprint) &&
        Objects.equals(this.authenticationScheme, httpsProtocol.authenticationScheme) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha256Thumbprint, authenticationScheme, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpsProtocol {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sha256Thumbprint: ").append(toIndentedString(sha256Thumbprint)).append("\n");
    sb.append("    authenticationScheme: ").append(toIndentedString(authenticationScheme)).append("\n");
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
