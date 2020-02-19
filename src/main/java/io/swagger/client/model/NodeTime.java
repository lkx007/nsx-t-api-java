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
 * Node system time in UTC
 */
@Schema(description = "Node system time in UTC")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class NodeTime {
  @SerializedName("system_datetime")
  private String systemDatetime = null;

  public NodeTime systemDatetime(String systemDatetime) {
    this.systemDatetime = systemDatetime;
    return this;
  }

   /**
   * Datetime string in UTC
   * @return systemDatetime
  **/
  @Schema(required = true, description = "Datetime string in UTC")
  public String getSystemDatetime() {
    return systemDatetime;
  }

  public void setSystemDatetime(String systemDatetime) {
    this.systemDatetime = systemDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeTime nodeTime = (NodeTime) o;
    return Objects.equals(this.systemDatetime, nodeTime.systemDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemDatetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeTime {\n");
    
    sb.append("    systemDatetime: ").append(toIndentedString(systemDatetime)).append("\n");
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
