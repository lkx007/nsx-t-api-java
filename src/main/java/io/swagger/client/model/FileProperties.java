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
import io.swagger.client.model.Resource;
import io.swagger.client.model.ResourceLink;
import io.swagger.client.model.SelfResourceLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * File properties
 */
@Schema(description = "File properties")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class FileProperties extends Resource {
  @SerializedName("created_epoch_ms")
  private Long createdEpochMs = null;

  @SerializedName("modified_epoch_ms")
  private Long modifiedEpochMs = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("size")
  private Long size = null;

  public FileProperties createdEpochMs(Long createdEpochMs) {
    this.createdEpochMs = createdEpochMs;
    return this;
  }

   /**
   * File creation time in epoch milliseconds
   * @return createdEpochMs
  **/
  @Schema(required = true, description = "File creation time in epoch milliseconds")
  public Long getCreatedEpochMs() {
    return createdEpochMs;
  }

  public void setCreatedEpochMs(Long createdEpochMs) {
    this.createdEpochMs = createdEpochMs;
  }

  public FileProperties modifiedEpochMs(Long modifiedEpochMs) {
    this.modifiedEpochMs = modifiedEpochMs;
    return this;
  }

   /**
   * File modification time in epoch milliseconds
   * @return modifiedEpochMs
  **/
  @Schema(required = true, description = "File modification time in epoch milliseconds")
  public Long getModifiedEpochMs() {
    return modifiedEpochMs;
  }

  public void setModifiedEpochMs(Long modifiedEpochMs) {
    this.modifiedEpochMs = modifiedEpochMs;
  }

  public FileProperties name(String name) {
    this.name = name;
    return this;
  }

   /**
   * File name
   * @return name
  **/
  @Schema(required = true, description = "File name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileProperties size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Size of the file in bytes
   * @return size
  **/
  @Schema(required = true, description = "Size of the file in bytes")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileProperties fileProperties = (FileProperties) o;
    return Objects.equals(this.createdEpochMs, fileProperties.createdEpochMs) &&
        Objects.equals(this.modifiedEpochMs, fileProperties.modifiedEpochMs) &&
        Objects.equals(this.name, fileProperties.name) &&
        Objects.equals(this.size, fileProperties.size) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdEpochMs, modifiedEpochMs, name, size, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createdEpochMs: ").append(toIndentedString(createdEpochMs)).append("\n");
    sb.append("    modifiedEpochMs: ").append(toIndentedString(modifiedEpochMs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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