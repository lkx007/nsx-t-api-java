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
 * Minimal description of feedback requests.
 */
@Schema(description = "Minimal description of feedback requests.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SummaryMigrationFeedbackRequest {
  @SerializedName("resolved")
  private Boolean resolved = null;

  @SerializedName("v_object_name")
  private String vObjectName = null;

  @SerializedName("rejected")
  private Boolean rejected = null;

  @SerializedName("v_object_id")
  private String vObjectId = null;

  @SerializedName("resolution")
  private String resolution = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("object_id")
  private String objectId = null;

  @SerializedName("details")
  private String details = null;

   /**
   * Indicates if a valid response already exist for this feedback request.
   * @return resolved
  **/
  @Schema(description = "Indicates if a valid response already exist for this feedback request.")
  public Boolean isResolved() {
    return resolved;
  }

   /**
   * Name of this object in the source NSX endpoint.
   * @return vObjectName
  **/
  @Schema(description = "Name of this object in the source NSX endpoint.")
  public String getVObjectName() {
    return vObjectName;
  }

   /**
   * Indicates if previous response was invalid. Please provide a valid response.
   * @return rejected
  **/
  @Schema(description = "Indicates if previous response was invalid. Please provide a valid response.")
  public Boolean isRejected() {
    return rejected;
  }

   /**
   * Identifier for this object in the source NSX endpoint.
   * @return vObjectId
  **/
  @Schema(description = "Identifier for this object in the source NSX endpoint.")
  public String getVObjectId() {
    return vObjectId;
  }

   /**
   * If the feedback request was resolved earlier, provides details about the previous resolution.
   * @return resolution
  **/
  @Schema(description = "If the feedback request was resolved earlier, provides details about the previous resolution.")
  public String getResolution() {
    return resolution;
  }

   /**
   * Identifier of the feedback request.
   * @return id
  **/
  @Schema(description = "Identifier of the feedback request.")
  public String getId() {
    return id;
  }

   /**
   * Identifier of the object for which feedback is requested.
   * @return objectId
  **/
  @Schema(description = "Identifier of the object for which feedback is requested.")
  public String getObjectId() {
    return objectId;
  }

   /**
   * Details about this specific feedback request.
   * @return details
  **/
  @Schema(description = "Details about this specific feedback request.")
  public String getDetails() {
    return details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryMigrationFeedbackRequest summaryMigrationFeedbackRequest = (SummaryMigrationFeedbackRequest) o;
    return Objects.equals(this.resolved, summaryMigrationFeedbackRequest.resolved) &&
        Objects.equals(this.vObjectName, summaryMigrationFeedbackRequest.vObjectName) &&
        Objects.equals(this.rejected, summaryMigrationFeedbackRequest.rejected) &&
        Objects.equals(this.vObjectId, summaryMigrationFeedbackRequest.vObjectId) &&
        Objects.equals(this.resolution, summaryMigrationFeedbackRequest.resolution) &&
        Objects.equals(this.id, summaryMigrationFeedbackRequest.id) &&
        Objects.equals(this.objectId, summaryMigrationFeedbackRequest.objectId) &&
        Objects.equals(this.details, summaryMigrationFeedbackRequest.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolved, vObjectName, rejected, vObjectId, resolution, id, objectId, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryMigrationFeedbackRequest {\n");
    
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    vObjectName: ").append(toIndentedString(vObjectName)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
    sb.append("    vObjectId: ").append(toIndentedString(vObjectId)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
