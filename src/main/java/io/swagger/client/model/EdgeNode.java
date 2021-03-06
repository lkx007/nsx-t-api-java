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
import io.swagger.client.model.EdgeNodeDeploymentConfig;
import io.swagger.client.model.EdgeNodeSettings;
import io.swagger.client.model.Node;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EdgeNode
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class EdgeNode extends Node {
  @SerializedName("node_settings")
  private EdgeNodeSettings nodeSettings = null;

  @SerializedName("deployment_config")
  private EdgeNodeDeploymentConfig deploymentConfig = null;

  @SerializedName("allocation_list")
  private List<String> allocationList = null;

  /**
   * Supported edge deployment type.
   */
  @JsonAdapter(DeploymentTypeEnum.Adapter.class)
  public enum DeploymentTypeEnum {
    VIRTUAL_MACHINE("VIRTUAL_MACHINE"),
    PHYSICAL_MACHINE("PHYSICAL_MACHINE"),
    UNKNOWN("UNKNOWN");

    private String value;

    DeploymentTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DeploymentTypeEnum fromValue(String text) {
      for (DeploymentTypeEnum b : DeploymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DeploymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeploymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeploymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeploymentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("deployment_type")
  private DeploymentTypeEnum deploymentType = null;

  public EdgeNode nodeSettings(EdgeNodeSettings nodeSettings) {
    this.nodeSettings = nodeSettings;
    return this;
  }

   /**
   * Get nodeSettings
   * @return nodeSettings
  **/
  @Schema(description = "")
  public EdgeNodeSettings getNodeSettings() {
    return nodeSettings;
  }

  public void setNodeSettings(EdgeNodeSettings nodeSettings) {
    this.nodeSettings = nodeSettings;
  }

  public EdgeNode deploymentConfig(EdgeNodeDeploymentConfig deploymentConfig) {
    this.deploymentConfig = deploymentConfig;
    return this;
  }

   /**
   * Get deploymentConfig
   * @return deploymentConfig
  **/
  @Schema(description = "")
  public EdgeNodeDeploymentConfig getDeploymentConfig() {
    return deploymentConfig;
  }

  public void setDeploymentConfig(EdgeNodeDeploymentConfig deploymentConfig) {
    this.deploymentConfig = deploymentConfig;
  }

   /**
   * List of logical router ids to which this edge node is allocated.
   * @return allocationList
  **/
  @Schema(description = "List of logical router ids to which this edge node is allocated.")
  public List<String> getAllocationList() {
    return allocationList;
  }

   /**
   * Supported edge deployment type.
   * @return deploymentType
  **/
  @Schema(description = "Supported edge deployment type.")
  public DeploymentTypeEnum getDeploymentType() {
    return deploymentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeNode edgeNode = (EdgeNode) o;
    return Objects.equals(this.nodeSettings, edgeNode.nodeSettings) &&
        Objects.equals(this.deploymentConfig, edgeNode.deploymentConfig) &&
        Objects.equals(this.allocationList, edgeNode.allocationList) &&
        Objects.equals(this.deploymentType, edgeNode.deploymentType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeSettings, deploymentConfig, allocationList, deploymentType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeNode {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nodeSettings: ").append(toIndentedString(nodeSettings)).append("\n");
    sb.append("    deploymentConfig: ").append(toIndentedString(deploymentConfig)).append("\n");
    sb.append("    allocationList: ").append(toIndentedString(allocationList)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
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
