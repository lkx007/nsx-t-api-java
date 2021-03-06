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
 * ReorderMigrationRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ReorderMigrationRequest {
  @SerializedName("is_before")
  private Boolean isBefore = true;

  @SerializedName("id")
  private String id = null;

  public ReorderMigrationRequest isBefore(Boolean isBefore) {
    this.isBefore = isBefore;
    return this;
  }

   /**
   * flag indicating whether the migration unit group/migration unit is to be placed before or after the specified migration unit group/migration unit
   * @return isBefore
  **/
  @Schema(description = "flag indicating whether the migration unit group/migration unit is to be placed before or after the specified migration unit group/migration unit")
  public Boolean isIsBefore() {
    return isBefore;
  }

  public void setIsBefore(Boolean isBefore) {
    this.isBefore = isBefore;
  }

  public ReorderMigrationRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * id of the migration unit group/migration unit before/after which the migration unit group/migration unit is to be placed
   * @return id
  **/
  @Schema(required = true, description = "id of the migration unit group/migration unit before/after which the migration unit group/migration unit is to be placed")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReorderMigrationRequest reorderMigrationRequest = (ReorderMigrationRequest) o;
    return Objects.equals(this.isBefore, reorderMigrationRequest.isBefore) &&
        Objects.equals(this.id, reorderMigrationRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBefore, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReorderMigrationRequest {\n");
    
    sb.append("    isBefore: ").append(toIndentedString(isBefore)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
