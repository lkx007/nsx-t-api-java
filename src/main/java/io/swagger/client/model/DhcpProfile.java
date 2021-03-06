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
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DHCP profile to specify edge cluster and members on which the dhcp server will run. A DhcpProfile can be referenced by different logical DHCP servers. 
 */
@Schema(description = "DHCP profile to specify edge cluster and members on which the dhcp server will run. A DhcpProfile can be referenced by different logical DHCP servers. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DhcpProfile extends ManagedResource {
  @SerializedName("edge_cluster_member_indexes")
  private List<Long> edgeClusterMemberIndexes = null;

  @SerializedName("enable_standby_relocation")
  private Boolean enableStandbyRelocation = false;

  @SerializedName("edge_cluster_id")
  private String edgeClusterId = null;

  public DhcpProfile edgeClusterMemberIndexes(List<Long> edgeClusterMemberIndexes) {
    this.edgeClusterMemberIndexes = edgeClusterMemberIndexes;
    return this;
  }

  public DhcpProfile addEdgeClusterMemberIndexesItem(Long edgeClusterMemberIndexesItem) {
    if (this.edgeClusterMemberIndexes == null) {
      this.edgeClusterMemberIndexes = new ArrayList<Long>();
    }
    this.edgeClusterMemberIndexes.add(edgeClusterMemberIndexesItem);
    return this;
  }

   /**
   * The Edge nodes on which the DHCP servers run. If none is provided, the NSX will auto-select two edge-nodes from the given edge cluster. If only one edge node is provided, the DHCP servers will run without HA support. 
   * @return edgeClusterMemberIndexes
  **/
  @Schema(description = "The Edge nodes on which the DHCP servers run. If none is provided, the NSX will auto-select two edge-nodes from the given edge cluster. If only one edge node is provided, the DHCP servers will run without HA support. ")
  public List<Long> getEdgeClusterMemberIndexes() {
    return edgeClusterMemberIndexes;
  }

  public void setEdgeClusterMemberIndexes(List<Long> edgeClusterMemberIndexes) {
    this.edgeClusterMemberIndexes = edgeClusterMemberIndexes;
  }

  public DhcpProfile enableStandbyRelocation(Boolean enableStandbyRelocation) {
    this.enableStandbyRelocation = enableStandbyRelocation;
    return this;
  }

   /**
   * Flag to enable the auto-relocation of standby DHCP Service in case of edge node failure. Only tier 1 and auto placed DHCP servers are considered for the relocation. 
   * @return enableStandbyRelocation
  **/
  @Schema(description = "Flag to enable the auto-relocation of standby DHCP Service in case of edge node failure. Only tier 1 and auto placed DHCP servers are considered for the relocation. ")
  public Boolean isEnableStandbyRelocation() {
    return enableStandbyRelocation;
  }

  public void setEnableStandbyRelocation(Boolean enableStandbyRelocation) {
    this.enableStandbyRelocation = enableStandbyRelocation;
  }

  public DhcpProfile edgeClusterId(String edgeClusterId) {
    this.edgeClusterId = edgeClusterId;
    return this;
  }

   /**
   * Edge cluster uuid on which the referencing logical DHCP server runs. 
   * @return edgeClusterId
  **/
  @Schema(required = true, description = "Edge cluster uuid on which the referencing logical DHCP server runs. ")
  public String getEdgeClusterId() {
    return edgeClusterId;
  }

  public void setEdgeClusterId(String edgeClusterId) {
    this.edgeClusterId = edgeClusterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DhcpProfile dhcpProfile = (DhcpProfile) o;
    return Objects.equals(this.edgeClusterMemberIndexes, dhcpProfile.edgeClusterMemberIndexes) &&
        Objects.equals(this.enableStandbyRelocation, dhcpProfile.enableStandbyRelocation) &&
        Objects.equals(this.edgeClusterId, dhcpProfile.edgeClusterId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edgeClusterMemberIndexes, enableStandbyRelocation, edgeClusterId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DhcpProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    edgeClusterMemberIndexes: ").append(toIndentedString(edgeClusterMemberIndexes)).append("\n");
    sb.append("    enableStandbyRelocation: ").append(toIndentedString(enableStandbyRelocation)).append("\n");
    sb.append("    edgeClusterId: ").append(toIndentedString(edgeClusterId)).append("\n");
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
