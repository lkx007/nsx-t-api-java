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
import io.swagger.client.model.NodeSummaryList;
import io.swagger.client.model.UpgradeChecksExecutionStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * ComponentUpgradeStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ComponentUpgradeStatus {
  /**
   * Upgrade status of component
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    FAILED("FAILED"),
    IN_PROGRESS("IN_PROGRESS"),
    NOT_STARTED("NOT_STARTED"),
    PAUSING("PAUSING"),
    PAUSED("PAUSED");

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

  @SerializedName("pre_upgrade_status")
  private UpgradeChecksExecutionStatus preUpgradeStatus = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("component_type")
  private String componentType = null;

  @SerializedName("node_count_at_target_version")
  private Integer nodeCountAtTargetVersion = null;

  @SerializedName("target_component_version")
  private String targetComponentVersion = null;

  @SerializedName("percent_complete")
  private BigDecimal percentComplete = null;

  @SerializedName("can_skip")
  private Boolean canSkip = null;

  @SerializedName("current_version_node_summary")
  private NodeSummaryList currentVersionNodeSummary = null;

   /**
   * Upgrade status of component
   * @return status
  **/
  @Schema(description = "Upgrade status of component")
  public StatusEnum getStatus() {
    return status;
  }

  public ComponentUpgradeStatus preUpgradeStatus(UpgradeChecksExecutionStatus preUpgradeStatus) {
    this.preUpgradeStatus = preUpgradeStatus;
    return this;
  }

   /**
   * Get preUpgradeStatus
   * @return preUpgradeStatus
  **/
  @Schema(description = "")
  public UpgradeChecksExecutionStatus getPreUpgradeStatus() {
    return preUpgradeStatus;
  }

  public void setPreUpgradeStatus(UpgradeChecksExecutionStatus preUpgradeStatus) {
    this.preUpgradeStatus = preUpgradeStatus;
  }

   /**
   * Details about the upgrade status
   * @return details
  **/
  @Schema(description = "Details about the upgrade status")
  public String getDetails() {
    return details;
  }

   /**
   * Component type for the upgrade status
   * @return componentType
  **/
  @Schema(description = "Component type for the upgrade status")
  public String getComponentType() {
    return componentType;
  }

   /**
   * Number of nodes of the type and at the component version
   * @return nodeCountAtTargetVersion
  **/
  @Schema(description = "Number of nodes of the type and at the component version")
  public Integer getNodeCountAtTargetVersion() {
    return nodeCountAtTargetVersion;
  }

   /**
   * Target component version
   * @return targetComponentVersion
  **/
  @Schema(description = "Target component version")
  public String getTargetComponentVersion() {
    return targetComponentVersion;
  }

   /**
   * Indicator of upgrade progress in percentage
   * @return percentComplete
  **/
  @Schema(description = "Indicator of upgrade progress in percentage")
  public BigDecimal getPercentComplete() {
    return percentComplete;
  }

   /**
   * Can the upgrade of the remaining units in this component be skipped
   * @return canSkip
  **/
  @Schema(description = "Can the upgrade of the remaining units in this component be skipped")
  public Boolean isCanSkip() {
    return canSkip;
  }

  public ComponentUpgradeStatus currentVersionNodeSummary(NodeSummaryList currentVersionNodeSummary) {
    this.currentVersionNodeSummary = currentVersionNodeSummary;
    return this;
  }

   /**
   * Get currentVersionNodeSummary
   * @return currentVersionNodeSummary
  **/
  @Schema(description = "")
  public NodeSummaryList getCurrentVersionNodeSummary() {
    return currentVersionNodeSummary;
  }

  public void setCurrentVersionNodeSummary(NodeSummaryList currentVersionNodeSummary) {
    this.currentVersionNodeSummary = currentVersionNodeSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentUpgradeStatus componentUpgradeStatus = (ComponentUpgradeStatus) o;
    return Objects.equals(this.status, componentUpgradeStatus.status) &&
        Objects.equals(this.preUpgradeStatus, componentUpgradeStatus.preUpgradeStatus) &&
        Objects.equals(this.details, componentUpgradeStatus.details) &&
        Objects.equals(this.componentType, componentUpgradeStatus.componentType) &&
        Objects.equals(this.nodeCountAtTargetVersion, componentUpgradeStatus.nodeCountAtTargetVersion) &&
        Objects.equals(this.targetComponentVersion, componentUpgradeStatus.targetComponentVersion) &&
        Objects.equals(this.percentComplete, componentUpgradeStatus.percentComplete) &&
        Objects.equals(this.canSkip, componentUpgradeStatus.canSkip) &&
        Objects.equals(this.currentVersionNodeSummary, componentUpgradeStatus.currentVersionNodeSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, preUpgradeStatus, details, componentType, nodeCountAtTargetVersion, targetComponentVersion, percentComplete, canSkip, currentVersionNodeSummary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentUpgradeStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    preUpgradeStatus: ").append(toIndentedString(preUpgradeStatus)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    nodeCountAtTargetVersion: ").append(toIndentedString(nodeCountAtTargetVersion)).append("\n");
    sb.append("    targetComponentVersion: ").append(toIndentedString(targetComponentVersion)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    canSkip: ").append(toIndentedString(canSkip)).append("\n");
    sb.append("    currentVersionNodeSummary: ").append(toIndentedString(currentVersionNodeSummary)).append("\n");
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
