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
import io.swagger.client.model.DiscoveredResource;
import io.swagger.client.model.KeyValuePair;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ComputeCollection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ComputeCollection extends DiscoveredResource {
  @SerializedName("origin_id")
  private String originId = null;

  @SerializedName("origin_properties")
  private List<KeyValuePair> originProperties = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("owner_id")
  private String ownerId = null;

  @SerializedName("origin_type")
  private String originType = null;

  @SerializedName("cm_local_id")
  private String cmLocalId = null;

   /**
   * Id of the compute manager from where this Compute Collection was discovered
   * @return originId
  **/
  @Schema(description = "Id of the compute manager from where this Compute Collection was discovered")
  public String getOriginId() {
    return originId;
  }

   /**
   * Key-Value map of additional specific properties of compute collection in the Compute Manager 
   * @return originProperties
  **/
  @Schema(description = "Key-Value map of additional specific properties of compute collection in the Compute Manager ")
  public List<KeyValuePair> getOriginProperties() {
    return originProperties;
  }

   /**
   * External ID of the ComputeCollection in the source Compute manager, e.g. mo-ref in VC 
   * @return externalId
  **/
  @Schema(description = "External ID of the ComputeCollection in the source Compute manager, e.g. mo-ref in VC ")
  public String getExternalId() {
    return externalId;
  }

   /**
   * Id of the owner of compute collection in the Compute Manager
   * @return ownerId
  **/
  @Schema(description = "Id of the owner of compute collection in the Compute Manager")
  public String getOwnerId() {
    return ownerId;
  }

   /**
   * ComputeCollection type like VC_Cluster. Here the Compute Manager type prefix would help in differentiating similar named Compute Collection types from different Compute Managers 
   * @return originType
  **/
  @Schema(description = "ComputeCollection type like VC_Cluster. Here the Compute Manager type prefix would help in differentiating similar named Compute Collection types from different Compute Managers ")
  public String getOriginType() {
    return originType;
  }

   /**
   * Local Id of the compute collection in the Compute Manager
   * @return cmLocalId
  **/
  @Schema(description = "Local Id of the compute collection in the Compute Manager")
  public String getCmLocalId() {
    return cmLocalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeCollection computeCollection = (ComputeCollection) o;
    return Objects.equals(this.originId, computeCollection.originId) &&
        Objects.equals(this.originProperties, computeCollection.originProperties) &&
        Objects.equals(this.externalId, computeCollection.externalId) &&
        Objects.equals(this.ownerId, computeCollection.ownerId) &&
        Objects.equals(this.originType, computeCollection.originType) &&
        Objects.equals(this.cmLocalId, computeCollection.cmLocalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originId, originProperties, externalId, ownerId, originType, cmLocalId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
    sb.append("    originProperties: ").append(toIndentedString(originProperties)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
    sb.append("    cmLocalId: ").append(toIndentedString(cmLocalId)).append("\n");
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