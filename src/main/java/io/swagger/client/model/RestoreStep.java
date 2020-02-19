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
import io.swagger.client.model.PerStepRestoreStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Restore step info
 */
@Schema(description = "Restore step info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RestoreStep {
  @SerializedName("status")
  private PerStepRestoreStatus status = null;

  @SerializedName("step_number")
  private Long stepNumber = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("value")
  private String value = null;

  public RestoreStep status(PerStepRestoreStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public PerStepRestoreStatus getStatus() {
    return status;
  }

  public void setStatus(PerStepRestoreStatus status) {
    this.status = status;
  }

   /**
   * Restore step number
   * @return stepNumber
  **/
  @Schema(description = "Restore step number")
  public Long getStepNumber() {
    return stepNumber;
  }

   /**
   * Restore step description
   * @return description
  **/
  @Schema(description = "Restore step description")
  public String getDescription() {
    return description;
  }

   /**
   * Restore step value
   * @return value
  **/
  @Schema(description = "Restore step value")
  public String getValue() {
    return value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreStep restoreStep = (RestoreStep) o;
    return Objects.equals(this.status, restoreStep.status) &&
        Objects.equals(this.stepNumber, restoreStep.stepNumber) &&
        Objects.equals(this.description, restoreStep.description) &&
        Objects.equals(this.value, restoreStep.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, stepNumber, description, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreStep {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
