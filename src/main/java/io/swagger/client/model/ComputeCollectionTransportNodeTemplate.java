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
import io.swagger.client.model.HostSwitchSpec;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.NetworkMigrationSpecTypeIdEntry;
import io.swagger.client.model.Tag;
import io.swagger.client.model.TransportZoneEndPoint;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.
 */
@Schema(description = "Note- transport node templates APIs are deprecated and user is recommended to use transport node profiles APIs instead.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ComputeCollectionTransportNodeTemplate extends ManagedResource {
  @SerializedName("host_switch_spec")
  private HostSwitchSpec hostSwitchSpec = null;

  @SerializedName("transport_zone_endpoints")
  private List<TransportZoneEndPoint> transportZoneEndpoints = null;

  @SerializedName("network_migration_spec_ids")
  private List<NetworkMigrationSpecTypeIdEntry> networkMigrationSpecIds = null;

  @SerializedName("compute_collection_ids")
  private List<String> computeCollectionIds = new ArrayList<String>();

  public ComputeCollectionTransportNodeTemplate hostSwitchSpec(HostSwitchSpec hostSwitchSpec) {
    this.hostSwitchSpec = hostSwitchSpec;
    return this;
  }

   /**
   * Get hostSwitchSpec
   * @return hostSwitchSpec
  **/
  @Schema(description = "")
  public HostSwitchSpec getHostSwitchSpec() {
    return hostSwitchSpec;
  }

  public void setHostSwitchSpec(HostSwitchSpec hostSwitchSpec) {
    this.hostSwitchSpec = hostSwitchSpec;
  }

  public ComputeCollectionTransportNodeTemplate transportZoneEndpoints(List<TransportZoneEndPoint> transportZoneEndpoints) {
    this.transportZoneEndpoints = transportZoneEndpoints;
    return this;
  }

  public ComputeCollectionTransportNodeTemplate addTransportZoneEndpointsItem(TransportZoneEndPoint transportZoneEndpointsItem) {
    if (this.transportZoneEndpoints == null) {
      this.transportZoneEndpoints = new ArrayList<TransportZoneEndPoint>();
    }
    this.transportZoneEndpoints.add(transportZoneEndpointsItem);
    return this;
  }

   /**
   * Transport zone endpoints
   * @return transportZoneEndpoints
  **/
  @Schema(description = "Transport zone endpoints")
  public List<TransportZoneEndPoint> getTransportZoneEndpoints() {
    return transportZoneEndpoints;
  }

  public void setTransportZoneEndpoints(List<TransportZoneEndPoint> transportZoneEndpoints) {
    this.transportZoneEndpoints = transportZoneEndpoints;
  }

  public ComputeCollectionTransportNodeTemplate networkMigrationSpecIds(List<NetworkMigrationSpecTypeIdEntry> networkMigrationSpecIds) {
    this.networkMigrationSpecIds = networkMigrationSpecIds;
    return this;
  }

  public ComputeCollectionTransportNodeTemplate addNetworkMigrationSpecIdsItem(NetworkMigrationSpecTypeIdEntry networkMigrationSpecIdsItem) {
    if (this.networkMigrationSpecIds == null) {
      this.networkMigrationSpecIds = new ArrayList<NetworkMigrationSpecTypeIdEntry>();
    }
    this.networkMigrationSpecIds.add(networkMigrationSpecIdsItem);
    return this;
  }

   /**
   * Property &#x27;network_migration_spec_ids&#x27; should only be used for compute collections which are clusters in VMware vCenter. Currently only HostProfileNetworkMigrationSpec type is supported. This specification will only apply to Stateless ESX hosts which are under this vCenter cluster.
   * @return networkMigrationSpecIds
  **/
  @Schema(description = "Property 'network_migration_spec_ids' should only be used for compute collections which are clusters in VMware vCenter. Currently only HostProfileNetworkMigrationSpec type is supported. This specification will only apply to Stateless ESX hosts which are under this vCenter cluster.")
  public List<NetworkMigrationSpecTypeIdEntry> getNetworkMigrationSpecIds() {
    return networkMigrationSpecIds;
  }

  public void setNetworkMigrationSpecIds(List<NetworkMigrationSpecTypeIdEntry> networkMigrationSpecIds) {
    this.networkMigrationSpecIds = networkMigrationSpecIds;
  }

  public ComputeCollectionTransportNodeTemplate computeCollectionIds(List<String> computeCollectionIds) {
    this.computeCollectionIds = computeCollectionIds;
    return this;
  }

  public ComputeCollectionTransportNodeTemplate addComputeCollectionIdsItem(String computeCollectionIdsItem) {
    this.computeCollectionIds.add(computeCollectionIdsItem);
    return this;
  }

   /**
   * Associated compute collection ids
   * @return computeCollectionIds
  **/
  @Schema(required = true, description = "Associated compute collection ids")
  public List<String> getComputeCollectionIds() {
    return computeCollectionIds;
  }

  public void setComputeCollectionIds(List<String> computeCollectionIds) {
    this.computeCollectionIds = computeCollectionIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeCollectionTransportNodeTemplate computeCollectionTransportNodeTemplate = (ComputeCollectionTransportNodeTemplate) o;
    return Objects.equals(this.hostSwitchSpec, computeCollectionTransportNodeTemplate.hostSwitchSpec) &&
        Objects.equals(this.transportZoneEndpoints, computeCollectionTransportNodeTemplate.transportZoneEndpoints) &&
        Objects.equals(this.networkMigrationSpecIds, computeCollectionTransportNodeTemplate.networkMigrationSpecIds) &&
        Objects.equals(this.computeCollectionIds, computeCollectionTransportNodeTemplate.computeCollectionIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostSwitchSpec, transportZoneEndpoints, networkMigrationSpecIds, computeCollectionIds, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeCollectionTransportNodeTemplate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hostSwitchSpec: ").append(toIndentedString(hostSwitchSpec)).append("\n");
    sb.append("    transportZoneEndpoints: ").append(toIndentedString(transportZoneEndpoints)).append("\n");
    sb.append("    networkMigrationSpecIds: ").append(toIndentedString(networkMigrationSpecIds)).append("\n");
    sb.append("    computeCollectionIds: ").append(toIndentedString(computeCollectionIds)).append("\n");
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
