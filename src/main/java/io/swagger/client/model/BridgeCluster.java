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
import io.swagger.client.model.BridgeClusterNode;
import io.swagger.client.model.ClusterProfileTypeIdEntry;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Bridge Cluster
 */
@Schema(description = "Bridge Cluster")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class BridgeCluster extends ManagedResource {
  @SerializedName("cluster_profile_bindings")
  private List<ClusterProfileTypeIdEntry> clusterProfileBindings = null;

  @SerializedName("bridge_nodes")
  private List<BridgeClusterNode> bridgeNodes = null;

  public BridgeCluster clusterProfileBindings(List<ClusterProfileTypeIdEntry> clusterProfileBindings) {
    this.clusterProfileBindings = clusterProfileBindings;
    return this;
  }

  public BridgeCluster addClusterProfileBindingsItem(ClusterProfileTypeIdEntry clusterProfileBindingsItem) {
    if (this.clusterProfileBindings == null) {
      this.clusterProfileBindings = new ArrayList<ClusterProfileTypeIdEntry>();
    }
    this.clusterProfileBindings.add(clusterProfileBindingsItem);
    return this;
  }

   /**
   * Bridge cluster profile bindings
   * @return clusterProfileBindings
  **/
  @Schema(description = "Bridge cluster profile bindings")
  public List<ClusterProfileTypeIdEntry> getClusterProfileBindings() {
    return clusterProfileBindings;
  }

  public void setClusterProfileBindings(List<ClusterProfileTypeIdEntry> clusterProfileBindings) {
    this.clusterProfileBindings = clusterProfileBindings;
  }

  public BridgeCluster bridgeNodes(List<BridgeClusterNode> bridgeNodes) {
    this.bridgeNodes = bridgeNodes;
    return this;
  }

  public BridgeCluster addBridgeNodesItem(BridgeClusterNode bridgeNodesItem) {
    if (this.bridgeNodes == null) {
      this.bridgeNodes = new ArrayList<BridgeClusterNode>();
    }
    this.bridgeNodes.add(bridgeNodesItem);
    return this;
  }

   /**
   * Nodes used in bridging
   * @return bridgeNodes
  **/
  @Schema(description = "Nodes used in bridging")
  public List<BridgeClusterNode> getBridgeNodes() {
    return bridgeNodes;
  }

  public void setBridgeNodes(List<BridgeClusterNode> bridgeNodes) {
    this.bridgeNodes = bridgeNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BridgeCluster bridgeCluster = (BridgeCluster) o;
    return Objects.equals(this.clusterProfileBindings, bridgeCluster.clusterProfileBindings) &&
        Objects.equals(this.bridgeNodes, bridgeCluster.bridgeNodes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterProfileBindings, bridgeNodes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BridgeCluster {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clusterProfileBindings: ").append(toIndentedString(clusterProfileBindings)).append("\n");
    sb.append("    bridgeNodes: ").append(toIndentedString(bridgeNodes)).append("\n");
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