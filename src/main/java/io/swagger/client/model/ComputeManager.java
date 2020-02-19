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
import io.swagger.client.model.KeyValuePair;
import io.swagger.client.model.LoginCredential;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ComputeManager
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ComputeManager extends ManagedResource {
  @SerializedName("credential")
  private LoginCredential credential = null;

  @SerializedName("origin_properties")
  private List<KeyValuePair> originProperties = null;

  @SerializedName("origin_type")
  private String originType = null;

  @SerializedName("server")
  private String server = null;

  public ComputeManager credential(LoginCredential credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @Schema(description = "")
  public LoginCredential getCredential() {
    return credential;
  }

  public void setCredential(LoginCredential credential) {
    this.credential = credential;
  }

   /**
   * Key-Value map of additional specific properties of compute manager
   * @return originProperties
  **/
  @Schema(description = "Key-Value map of additional specific properties of compute manager")
  public List<KeyValuePair> getOriginProperties() {
    return originProperties;
  }

  public ComputeManager originType(String originType) {
    this.originType = originType;
    return this;
  }

   /**
   * Compute manager type like vCenter
   * @return originType
  **/
  @Schema(required = true, description = "Compute manager type like vCenter")
  public String getOriginType() {
    return originType;
  }

  public void setOriginType(String originType) {
    this.originType = originType;
  }

  public ComputeManager server(String server) {
    this.server = server;
    return this;
  }

   /**
   * IP address or hostname of compute manager
   * @return server
  **/
  @Schema(required = true, description = "IP address or hostname of compute manager")
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeManager computeManager = (ComputeManager) o;
    return Objects.equals(this.credential, computeManager.credential) &&
        Objects.equals(this.originProperties, computeManager.originProperties) &&
        Objects.equals(this.originType, computeManager.originType) &&
        Objects.equals(this.server, computeManager.server) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, originProperties, originType, server, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeManager {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    originProperties: ").append(toIndentedString(originProperties)).append("\n");
    sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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