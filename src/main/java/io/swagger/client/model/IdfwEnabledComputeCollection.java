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
 * Compute collection enabled for Identity Firewall where login events will be collected. 
 */
@Schema(description = "Compute collection enabled for Identity Firewall where login events will be collected. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IdfwEnabledComputeCollection extends ManagedResource {
  @SerializedName("compute_collection_name")
  private String computeCollectionName = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("compute_collection_id")
  private String computeCollectionId = null;

  public IdfwEnabledComputeCollection computeCollectionName(String computeCollectionName) {
    this.computeCollectionName = computeCollectionName;
    return this;
  }

   /**
   * Compute collection name.
   * @return computeCollectionName
  **/
  @Schema(description = "Compute collection name.")
  public String getComputeCollectionName() {
    return computeCollectionName;
  }

  public void setComputeCollectionName(String computeCollectionName) {
    this.computeCollectionName = computeCollectionName;
  }

  public IdfwEnabledComputeCollection enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Compute collection enabled status (true&#x3D;Enabled / false&#x3D;Disabled).
   * @return enabled
  **/
  @Schema(required = true, description = "Compute collection enabled status (true=Enabled / false=Disabled).")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public IdfwEnabledComputeCollection computeCollectionId(String computeCollectionId) {
    this.computeCollectionId = computeCollectionId;
    return this;
  }

   /**
   * Compute collection ID.
   * @return computeCollectionId
  **/
  @Schema(required = true, description = "Compute collection ID.")
  public String getComputeCollectionId() {
    return computeCollectionId;
  }

  public void setComputeCollectionId(String computeCollectionId) {
    this.computeCollectionId = computeCollectionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdfwEnabledComputeCollection idfwEnabledComputeCollection = (IdfwEnabledComputeCollection) o;
    return Objects.equals(this.computeCollectionName, idfwEnabledComputeCollection.computeCollectionName) &&
        Objects.equals(this.enabled, idfwEnabledComputeCollection.enabled) &&
        Objects.equals(this.computeCollectionId, idfwEnabledComputeCollection.computeCollectionId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeCollectionName, enabled, computeCollectionId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdfwEnabledComputeCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    computeCollectionName: ").append(toIndentedString(computeCollectionName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    computeCollectionId: ").append(toIndentedString(computeCollectionId)).append("\n");
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