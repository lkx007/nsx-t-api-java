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
import io.swagger.client.model.GlobalRestoreStatus;
import io.swagger.client.model.InstructionInfo;
import io.swagger.client.model.ResourceLink;
import io.swagger.client.model.RestoreStep;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster restore status
 */
@Schema(description = "Cluster restore status")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ClusterRestoreStatus {
  @SerializedName("status")
  private GlobalRestoreStatus status = null;

  @SerializedName("step")
  private RestoreStep step = null;

  @SerializedName("endpoints")
  private List<ResourceLink> endpoints = null;

  @SerializedName("total_steps")
  private Long totalSteps = null;

  @SerializedName("restore_start_time")
  private Long restoreStartTime = null;

  @SerializedName("restore_end_time")
  private Long restoreEndTime = null;

  @SerializedName("backup_timestamp")
  private Long backupTimestamp = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("instructions")
  private List<InstructionInfo> instructions = null;

  public ClusterRestoreStatus status(GlobalRestoreStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public GlobalRestoreStatus getStatus() {
    return status;
  }

  public void setStatus(GlobalRestoreStatus status) {
    this.status = status;
  }

  public ClusterRestoreStatus step(RestoreStep step) {
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @Schema(description = "")
  public RestoreStep getStep() {
    return step;
  }

  public void setStep(RestoreStep step) {
    this.step = step;
  }

   /**
   * The list of allowed endpoints, based on the current state of the restore process 
   * @return endpoints
  **/
  @Schema(description = "The list of allowed endpoints, based on the current state of the restore process ")
  public List<ResourceLink> getEndpoints() {
    return endpoints;
  }

   /**
   * Total number of steps in the entire restore process
   * @return totalSteps
  **/
  @Schema(description = "Total number of steps in the entire restore process")
  public Long getTotalSteps() {
    return totalSteps;
  }

   /**
   * Timestamp when restore was started in epoch millisecond
   * @return restoreStartTime
  **/
  @Schema(description = "Timestamp when restore was started in epoch millisecond")
  public Long getRestoreStartTime() {
    return restoreStartTime;
  }

   /**
   * Timestamp when restore was completed in epoch millisecond
   * @return restoreEndTime
  **/
  @Schema(description = "Timestamp when restore was completed in epoch millisecond")
  public Long getRestoreEndTime() {
    return restoreEndTime;
  }

   /**
   * Timestamp when backup was initiated in epoch millisecond
   * @return backupTimestamp
  **/
  @Schema(description = "Timestamp when backup was initiated in epoch millisecond")
  public Long getBackupTimestamp() {
    return backupTimestamp;
  }

   /**
   * Unique id for backup request
   * @return id
  **/
  @Schema(description = "Unique id for backup request")
  public String getId() {
    return id;
  }

   /**
   * Instructions for users to reconcile Restore operations
   * @return instructions
  **/
  @Schema(description = "Instructions for users to reconcile Restore operations")
  public List<InstructionInfo> getInstructions() {
    return instructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterRestoreStatus clusterRestoreStatus = (ClusterRestoreStatus) o;
    return Objects.equals(this.status, clusterRestoreStatus.status) &&
        Objects.equals(this.step, clusterRestoreStatus.step) &&
        Objects.equals(this.endpoints, clusterRestoreStatus.endpoints) &&
        Objects.equals(this.totalSteps, clusterRestoreStatus.totalSteps) &&
        Objects.equals(this.restoreStartTime, clusterRestoreStatus.restoreStartTime) &&
        Objects.equals(this.restoreEndTime, clusterRestoreStatus.restoreEndTime) &&
        Objects.equals(this.backupTimestamp, clusterRestoreStatus.backupTimestamp) &&
        Objects.equals(this.id, clusterRestoreStatus.id) &&
        Objects.equals(this.instructions, clusterRestoreStatus.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, step, endpoints, totalSteps, restoreStartTime, restoreEndTime, backupTimestamp, id, instructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterRestoreStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    totalSteps: ").append(toIndentedString(totalSteps)).append("\n");
    sb.append("    restoreStartTime: ").append(toIndentedString(restoreStartTime)).append("\n");
    sb.append("    restoreEndTime: ").append(toIndentedString(restoreEndTime)).append("\n");
    sb.append("    backupTimestamp: ").append(toIndentedString(backupTimestamp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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
