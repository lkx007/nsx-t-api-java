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
 * Type of issue and detailed description of the issue in case of deployment failure.
 */
@Schema(description = "Type of issue and detailed description of the issue in case of deployment failure.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ServiceDeploymentIssue {
  @SerializedName("issue_description")
  private String issueDescription = null;

  @SerializedName("issue_timestamp")
  private String issueTimestamp = null;

  @SerializedName("issue_type")
  private String issueType = null;

  public ServiceDeploymentIssue issueDescription(String issueDescription) {
    this.issueDescription = issueDescription;
    return this;
  }

   /**
   * Description of issue encountered while service deployment.
   * @return issueDescription
  **/
  @Schema(description = "Description of issue encountered while service deployment.")
  public String getIssueDescription() {
    return issueDescription;
  }

  public void setIssueDescription(String issueDescription) {
    this.issueDescription = issueDescription;
  }

  public ServiceDeploymentIssue issueTimestamp(String issueTimestamp) {
    this.issueTimestamp = issueTimestamp;
    return this;
  }

   /**
   * Timestamp when issue was issue encountered while service deployment.
   * @return issueTimestamp
  **/
  @Schema(description = "Timestamp when issue was issue encountered while service deployment.")
  public String getIssueTimestamp() {
    return issueTimestamp;
  }

  public void setIssueTimestamp(String issueTimestamp) {
    this.issueTimestamp = issueTimestamp;
  }

  public ServiceDeploymentIssue issueType(String issueType) {
    this.issueType = issueType;
    return this;
  }

   /**
   * Type of issue encountered while service deployment.
   * @return issueType
  **/
  @Schema(required = true, description = "Type of issue encountered while service deployment.")
  public String getIssueType() {
    return issueType;
  }

  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDeploymentIssue serviceDeploymentIssue = (ServiceDeploymentIssue) o;
    return Objects.equals(this.issueDescription, serviceDeploymentIssue.issueDescription) &&
        Objects.equals(this.issueTimestamp, serviceDeploymentIssue.issueTimestamp) &&
        Objects.equals(this.issueType, serviceDeploymentIssue.issueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueDescription, issueTimestamp, issueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDeploymentIssue {\n");
    
    sb.append("    issueDescription: ").append(toIndentedString(issueDescription)).append("\n");
    sb.append("    issueTimestamp: ").append(toIndentedString(issueTimestamp)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
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