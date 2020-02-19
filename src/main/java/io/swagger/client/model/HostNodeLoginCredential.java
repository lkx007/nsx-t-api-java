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
 * The credentials to login into the host node
 */
@Schema(description = "The credentials to login into the host node")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class HostNodeLoginCredential {
  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("thumbprint")
  private String thumbprint = null;

  public HostNodeLoginCredential username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username of the account on the host node
   * @return username
  **/
  @Schema(description = "The username of the account on the host node")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public HostNodeLoginCredential password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The authentication password of the host node
   * @return password
  **/
  @Schema(description = "The authentication password of the host node")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public HostNodeLoginCredential thumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
    return this;
  }

   /**
   * For ESXi hosts, the thumbprint of the ESXi management service. For KVM hosts, the SSH key fingerprint. If thumbprint is not provided then connection to host may not be established and API call will fail. 
   * @return thumbprint
  **/
  @Schema(description = "For ESXi hosts, the thumbprint of the ESXi management service. For KVM hosts, the SSH key fingerprint. If thumbprint is not provided then connection to host may not be established and API call will fail. ")
  public String getThumbprint() {
    return thumbprint;
  }

  public void setThumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostNodeLoginCredential hostNodeLoginCredential = (HostNodeLoginCredential) o;
    return Objects.equals(this.username, hostNodeLoginCredential.username) &&
        Objects.equals(this.password, hostNodeLoginCredential.password) &&
        Objects.equals(this.thumbprint, hostNodeLoginCredential.thumbprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, thumbprint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostNodeLoginCredential {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
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