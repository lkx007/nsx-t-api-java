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
 * HostedEntityInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class HostedEntityInfo {
  @SerializedName("entity_uuid")
  private String entityUuid = null;

  @SerializedName("entity_type")
  private String entityType = null;

   /**
   * Unique identifier of entity
   * @return entityUuid
  **/
  @Schema(description = "Unique identifier of entity")
  public String getEntityUuid() {
    return entityUuid;
  }

   /**
   * The type of entity hosted could be MP, CCP, VMC App etc.
   * @return entityType
  **/
  @Schema(description = "The type of entity hosted could be MP, CCP, VMC App etc.")
  public String getEntityType() {
    return entityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostedEntityInfo hostedEntityInfo = (HostedEntityInfo) o;
    return Objects.equals(this.entityUuid, hostedEntityInfo.entityUuid) &&
        Objects.equals(this.entityType, hostedEntityInfo.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityUuid, entityType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostedEntityInfo {\n");
    
    sb.append("    entityUuid: ").append(toIndentedString(entityUuid)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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
