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
 * File system properties
 */
@Schema(description = "File system properties")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class NodeFileSystemProperties {
  @SerializedName("mount")
  private String mount = null;

  @SerializedName("total")
  private Long total = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("file_system")
  private String fileSystem = null;

  @SerializedName("used")
  private Long used = null;

   /**
   * File system mount
   * @return mount
  **/
  @Schema(description = "File system mount")
  public String getMount() {
    return mount;
  }

   /**
   * File system size in kilobytes
   * @return total
  **/
  @Schema(description = "File system size in kilobytes")
  public Long getTotal() {
    return total;
  }

   /**
   * File system type
   * @return type
  **/
  @Schema(description = "File system type")
  public String getType() {
    return type;
  }

   /**
   * File system id
   * @return fileSystem
  **/
  @Schema(description = "File system id")
  public String getFileSystem() {
    return fileSystem;
  }

   /**
   * Amount of file system used in kilobytes
   * @return used
  **/
  @Schema(description = "Amount of file system used in kilobytes")
  public Long getUsed() {
    return used;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeFileSystemProperties nodeFileSystemProperties = (NodeFileSystemProperties) o;
    return Objects.equals(this.mount, nodeFileSystemProperties.mount) &&
        Objects.equals(this.total, nodeFileSystemProperties.total) &&
        Objects.equals(this.type, nodeFileSystemProperties.type) &&
        Objects.equals(this.fileSystem, nodeFileSystemProperties.fileSystem) &&
        Objects.equals(this.used, nodeFileSystemProperties.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mount, total, type, fileSystem, used);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeFileSystemProperties {\n");
    
    sb.append("    mount: ").append(toIndentedString(mount)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fileSystem: ").append(toIndentedString(fileSystem)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
