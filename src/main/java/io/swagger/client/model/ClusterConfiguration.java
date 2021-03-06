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
import io.swagger.client.model.ClusterNode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The configuration of the NSX cluster. The cluster configuration consists of a list of cluster node attributes.
 */
@Schema(description = "The configuration of the NSX cluster. The cluster configuration consists of a list of cluster node attributes.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ClusterConfiguration {
  @SerializedName("config_version")
  private Long configVersion = null;

  @SerializedName("nodes")
  private List<ClusterNode> nodes = null;

  @SerializedName("cluster_id")
  private String clusterId = null;

   /**
   * Cluster configuration version
   * @return configVersion
  **/
  @Schema(description = "Cluster configuration version")
  public Long getConfigVersion() {
    return configVersion;
  }

   /**
   * Nodes in the cluster configuration
   * @return nodes
  **/
  @Schema(description = "Nodes in the cluster configuration")
  public List<ClusterNode> getNodes() {
    return nodes;
  }

   /**
   * UUID of the cluster
   * @return clusterId
  **/
  @Schema(description = "UUID of the cluster")
  public String getClusterId() {
    return clusterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterConfiguration clusterConfiguration = (ClusterConfiguration) o;
    return Objects.equals(this.configVersion, clusterConfiguration.configVersion) &&
        Objects.equals(this.nodes, clusterConfiguration.nodes) &&
        Objects.equals(this.clusterId, clusterConfiguration.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configVersion, nodes, clusterId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterConfiguration {\n");
    
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
