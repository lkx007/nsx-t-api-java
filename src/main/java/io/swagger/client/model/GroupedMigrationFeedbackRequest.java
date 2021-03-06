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
import io.swagger.client.model.SummaryMigrationFeedbackRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Detailed feedback requests from the migration tool where user input is required.
 */
@Schema(description = "Detailed feedback requests from the migration tool where user input is required.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class GroupedMigrationFeedbackRequest {
  @SerializedName("resolved")
  private Boolean resolved = null;

  @SerializedName("accepted_actions")
  private List<String> acceptedActions = null;

  @SerializedName("hash")
  private String hash = null;

  @SerializedName("vertical")
  private String vertical = null;

  @SerializedName("suggested_value")
  private String suggestedValue = null;

  @SerializedName("multi_value")
  private Boolean multiValue = null;

  @SerializedName("sub_vertical")
  private String subVertical = null;

  @SerializedName("objects")
  private List<SummaryMigrationFeedbackRequest> objects = new ArrayList<SummaryMigrationFeedbackRequest>();

  @SerializedName("accepted_values")
  private List<String> acceptedValues = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("accepted_value_type")
  private String acceptedValueType = null;

  @SerializedName("suggested_action")
  private String suggestedAction = null;

   /**
   * Indicates if a valid response already exist for all feedback requests in this group.
   * @return resolved
  **/
  @Schema(description = "Indicates if a valid response already exist for all feedback requests in this group.")
  public Boolean isResolved() {
    return resolved;
  }

   /**
   * List of acceptable actions for this feedback request.
   * @return acceptedActions
  **/
  @Schema(description = "List of acceptable actions for this feedback request.")
  public List<String> getAcceptedActions() {
    return acceptedActions;
  }

   /**
   * Identify a feedback request type across objects. This can be used to group together objects with similar feedback request and resolve them in one go.
   * @return hash
  **/
  @Schema(description = "Identify a feedback request type across objects. This can be used to group together objects with similar feedback request and resolve them in one go.")
  public String getHash() {
    return hash;
  }

   /**
   * Functional area that this query falls into.
   * @return vertical
  **/
  @Schema(description = "Functional area that this query falls into.")
  public String getVertical() {
    return vertical;
  }

   /**
   * The suggested value to resolve this feedback request.
   * @return suggestedValue
  **/
  @Schema(description = "The suggested value to resolve this feedback request.")
  public String getSuggestedValue() {
    return suggestedValue;
  }

   /**
   * Indicates if multiple values can be selected as response from the list of acceptable value.
   * @return multiValue
  **/
  @Schema(description = "Indicates if multiple values can be selected as response from the list of acceptable value.")
  public Boolean isMultiValue() {
    return multiValue;
  }

   /**
   * Functional sub-area that this query falls into.
   * @return subVertical
  **/
  @Schema(description = "Functional sub-area that this query falls into.")
  public String getSubVertical() {
    return subVertical;
  }

  public GroupedMigrationFeedbackRequest objects(List<SummaryMigrationFeedbackRequest> objects) {
    this.objects = objects;
    return this;
  }

  public GroupedMigrationFeedbackRequest addObjectsItem(SummaryMigrationFeedbackRequest objectsItem) {
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Collection of feedback requests of a given type
   * @return objects
  **/
  @Schema(required = true, description = "Collection of feedback requests of a given type")
  public List<SummaryMigrationFeedbackRequest> getObjects() {
    return objects;
  }

  public void setObjects(List<SummaryMigrationFeedbackRequest> objects) {
    this.objects = objects;
  }

  public GroupedMigrationFeedbackRequest acceptedValues(List<String> acceptedValues) {
    this.acceptedValues = acceptedValues;
    return this;
  }

  public GroupedMigrationFeedbackRequest addAcceptedValuesItem(String acceptedValuesItem) {
    if (this.acceptedValues == null) {
      this.acceptedValues = new ArrayList<String>();
    }
    this.acceptedValues.add(acceptedValuesItem);
    return this;
  }

   /**
   * List of acceptable values for this feedback request.
   * @return acceptedValues
  **/
  @Schema(description = "List of acceptable values for this feedback request.")
  public List<String> getAcceptedValues() {
    return acceptedValues;
  }

  public void setAcceptedValues(List<String> acceptedValues) {
    this.acceptedValues = acceptedValues;
  }

   /**
   * Detailed feedback request with options.
   * @return message
  **/
  @Schema(description = "Detailed feedback request with options.")
  public String getMessage() {
    return message;
  }

   /**
   * Data type of the items listed in acceptable values list.
   * @return acceptedValueType
  **/
  @Schema(description = "Data type of the items listed in acceptable values list.")
  public String getAcceptedValueType() {
    return acceptedValueType;
  }

   /**
   * The suggested action to resolve this feedback request.
   * @return suggestedAction
  **/
  @Schema(description = "The suggested action to resolve this feedback request.")
  public String getSuggestedAction() {
    return suggestedAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupedMigrationFeedbackRequest groupedMigrationFeedbackRequest = (GroupedMigrationFeedbackRequest) o;
    return Objects.equals(this.resolved, groupedMigrationFeedbackRequest.resolved) &&
        Objects.equals(this.acceptedActions, groupedMigrationFeedbackRequest.acceptedActions) &&
        Objects.equals(this.hash, groupedMigrationFeedbackRequest.hash) &&
        Objects.equals(this.vertical, groupedMigrationFeedbackRequest.vertical) &&
        Objects.equals(this.suggestedValue, groupedMigrationFeedbackRequest.suggestedValue) &&
        Objects.equals(this.multiValue, groupedMigrationFeedbackRequest.multiValue) &&
        Objects.equals(this.subVertical, groupedMigrationFeedbackRequest.subVertical) &&
        Objects.equals(this.objects, groupedMigrationFeedbackRequest.objects) &&
        Objects.equals(this.acceptedValues, groupedMigrationFeedbackRequest.acceptedValues) &&
        Objects.equals(this.message, groupedMigrationFeedbackRequest.message) &&
        Objects.equals(this.acceptedValueType, groupedMigrationFeedbackRequest.acceptedValueType) &&
        Objects.equals(this.suggestedAction, groupedMigrationFeedbackRequest.suggestedAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolved, acceptedActions, hash, vertical, suggestedValue, multiValue, subVertical, objects, acceptedValues, message, acceptedValueType, suggestedAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupedMigrationFeedbackRequest {\n");
    
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    acceptedActions: ").append(toIndentedString(acceptedActions)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
    sb.append("    suggestedValue: ").append(toIndentedString(suggestedValue)).append("\n");
    sb.append("    multiValue: ").append(toIndentedString(multiValue)).append("\n");
    sb.append("    subVertical: ").append(toIndentedString(subVertical)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    acceptedValues: ").append(toIndentedString(acceptedValues)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    acceptedValueType: ").append(toIndentedString(acceptedValueType)).append("\n");
    sb.append("    suggestedAction: ").append(toIndentedString(suggestedAction)).append("\n");
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
