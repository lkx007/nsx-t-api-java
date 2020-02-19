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
import io.swagger.client.model.IntelligenceClusterNodeVMDeploymentRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Contains a list of NSX-Intelligence cluster node VM deployment requests and optionally a clustering configuration. 
 */
@Schema(description = "Contains a list of NSX-Intelligence cluster node VM deployment requests and optionally a clustering configuration. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class AddIntelligenceClusterNodeVMInfo {
  @SerializedName("deployment_requests")
  private List<IntelligenceClusterNodeVMDeploymentRequest> deploymentRequests = new ArrayList<IntelligenceClusterNodeVMDeploymentRequest>();

  public AddIntelligenceClusterNodeVMInfo deploymentRequests(List<IntelligenceClusterNodeVMDeploymentRequest> deploymentRequests) {
    this.deploymentRequests = deploymentRequests;
    return this;
  }

  public AddIntelligenceClusterNodeVMInfo addDeploymentRequestsItem(IntelligenceClusterNodeVMDeploymentRequest deploymentRequestsItem) {
    this.deploymentRequests.add(deploymentRequestsItem);
    return this;
  }

   /**
   * Intelligence Cluster node VM deployment requests to be deployed by NSX. 
   * @return deploymentRequests
  **/
  @Schema(required = true, description = "Intelligence Cluster node VM deployment requests to be deployed by NSX. ")
  public List<IntelligenceClusterNodeVMDeploymentRequest> getDeploymentRequests() {
    return deploymentRequests;
  }

  public void setDeploymentRequests(List<IntelligenceClusterNodeVMDeploymentRequest> deploymentRequests) {
    this.deploymentRequests = deploymentRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddIntelligenceClusterNodeVMInfo addIntelligenceClusterNodeVMInfo = (AddIntelligenceClusterNodeVMInfo) o;
    return Objects.equals(this.deploymentRequests, addIntelligenceClusterNodeVMInfo.deploymentRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentRequests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddIntelligenceClusterNodeVMInfo {\n");
    
    sb.append("    deploymentRequests: ").append(toIndentedString(deploymentRequests)).append("\n");
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