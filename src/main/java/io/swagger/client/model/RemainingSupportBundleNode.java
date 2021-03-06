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
 * RemainingSupportBundleNode
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RemainingSupportBundleNode {
  /**
   * Status of node
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("PENDING"),
    PROCESSING("PROCESSING");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("node_display_name")
  private String nodeDisplayName = null;

  @SerializedName("node_id")
  private String nodeId = null;

   /**
   * Status of node
   * @return status
  **/
  @Schema(description = "Status of node")
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * Display name of node
   * @return nodeDisplayName
  **/
  @Schema(description = "Display name of node")
  public String getNodeDisplayName() {
    return nodeDisplayName;
  }

   /**
   * UUID of node
   * @return nodeId
  **/
  @Schema(description = "UUID of node")
  public String getNodeId() {
    return nodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemainingSupportBundleNode remainingSupportBundleNode = (RemainingSupportBundleNode) o;
    return Objects.equals(this.status, remainingSupportBundleNode.status) &&
        Objects.equals(this.nodeDisplayName, remainingSupportBundleNode.nodeDisplayName) &&
        Objects.equals(this.nodeId, remainingSupportBundleNode.nodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, nodeDisplayName, nodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemainingSupportBundleNode {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nodeDisplayName: ").append(toIndentedString(nodeDisplayName)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
