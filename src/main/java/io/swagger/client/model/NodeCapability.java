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
 * Capability of a fabric node
 */
@Schema(description = "Capability of a fabric node")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class NodeCapability {
  @SerializedName("value")
  private String value = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("provider")
  private String provider = null;

   /**
   * Value of this capability
   * @return value
  **/
  @Schema(description = "Value of this capability")
  public String getValue() {
    return value;
  }

   /**
   * Version of the capability
   * @return version
  **/
  @Schema(description = "Version of the capability")
  public Integer getVersion() {
    return version;
  }

   /**
   * Description of this capability that can be displayed in UI
   * @return description
  **/
  @Schema(description = "Description of this capability that can be displayed in UI")
  public String getDescription() {
    return description;
  }

   /**
   * String that identifies the base capability for all nodes
   * @return key
  **/
  @Schema(description = "String that identifies the base capability for all nodes")
  public String getKey() {
    return key;
  }

   /**
   * Provider of this capability for the node
   * @return provider
  **/
  @Schema(description = "Provider of this capability for the node")
  public String getProvider() {
    return provider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeCapability nodeCapability = (NodeCapability) o;
    return Objects.equals(this.value, nodeCapability.value) &&
        Objects.equals(this.version, nodeCapability.version) &&
        Objects.equals(this.description, nodeCapability.description) &&
        Objects.equals(this.key, nodeCapability.key) &&
        Objects.equals(this.provider, nodeCapability.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, version, description, key, provider);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeCapability {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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