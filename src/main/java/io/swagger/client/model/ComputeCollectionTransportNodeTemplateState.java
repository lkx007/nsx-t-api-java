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
import io.swagger.client.model.TransportNodeTemplateState;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
 */
@Schema(description = "Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ComputeCollectionTransportNodeTemplateState {
  @SerializedName("compute_collection_id")
  private String computeCollectionId = null;

  @SerializedName("template_states")
  private List<TransportNodeTemplateState> templateStates = null;

   /**
   * Associated compute collection id
   * @return computeCollectionId
  **/
  @Schema(description = "Associated compute collection id")
  public String getComputeCollectionId() {
    return computeCollectionId;
  }

   /**
   * Transport node template states in compute collection
   * @return templateStates
  **/
  @Schema(description = "Transport node template states in compute collection")
  public List<TransportNodeTemplateState> getTemplateStates() {
    return templateStates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeCollectionTransportNodeTemplateState computeCollectionTransportNodeTemplateState = (ComputeCollectionTransportNodeTemplateState) o;
    return Objects.equals(this.computeCollectionId, computeCollectionTransportNodeTemplateState.computeCollectionId) &&
        Objects.equals(this.templateStates, computeCollectionTransportNodeTemplateState.templateStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeCollectionId, templateStates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeCollectionTransportNodeTemplateState {\n");
    
    sb.append("    computeCollectionId: ").append(toIndentedString(computeCollectionId)).append("\n");
    sb.append("    templateStates: ").append(toIndentedString(templateStates)).append("\n");
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
