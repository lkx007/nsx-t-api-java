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
 * Bridge Endpoint Profile
 */
@Schema(description = "Bridge Endpoint Profile")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class BridgeEndpointProfile extends ManagedResource {
  /**
   * Faileover mode can be preemmptive or non-preemptive
   */
  @JsonAdapter(FailoverModeEnum.Adapter.class)
  public enum FailoverModeEnum {
    PREEMPTIVE("PREEMPTIVE"),
    NON_PREEMPTIVE("NON_PREEMPTIVE");

    private String value;

    FailoverModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FailoverModeEnum fromValue(String text) {
      for (FailoverModeEnum b : FailoverModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FailoverModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FailoverModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FailoverModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FailoverModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("failover_mode")
  private FailoverModeEnum failoverMode = FailoverModeEnum.PREEMPTIVE;

  @SerializedName("edge_cluster_member_indexes")
  private List<Integer> edgeClusterMemberIndexes = null;

  /**
   * High avaialability mode can be active-active or active-standby
   */
  @JsonAdapter(HighAvailabilityModeEnum.Adapter.class)
  public enum HighAvailabilityModeEnum {
    STANDBY("ACTIVE_STANDBY");

    private String value;

    HighAvailabilityModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HighAvailabilityModeEnum fromValue(String text) {
      for (HighAvailabilityModeEnum b : HighAvailabilityModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HighAvailabilityModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HighAvailabilityModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HighAvailabilityModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HighAvailabilityModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("high_availability_mode")
  private HighAvailabilityModeEnum highAvailabilityMode = HighAvailabilityModeEnum.STANDBY;

  @SerializedName("edge_cluster_id")
  private String edgeClusterId = null;

  public BridgeEndpointProfile failoverMode(FailoverModeEnum failoverMode) {
    this.failoverMode = failoverMode;
    return this;
  }

   /**
   * Faileover mode can be preemmptive or non-preemptive
   * @return failoverMode
  **/
  @Schema(description = "Faileover mode can be preemmptive or non-preemptive")
  public FailoverModeEnum getFailoverMode() {
    return failoverMode;
  }

  public void setFailoverMode(FailoverModeEnum failoverMode) {
    this.failoverMode = failoverMode;
  }

  public BridgeEndpointProfile edgeClusterMemberIndexes(List<Integer> edgeClusterMemberIndexes) {
    this.edgeClusterMemberIndexes = edgeClusterMemberIndexes;
    return this;
  }

  public BridgeEndpointProfile addEdgeClusterMemberIndexesItem(Integer edgeClusterMemberIndexesItem) {
    if (this.edgeClusterMemberIndexes == null) {
      this.edgeClusterMemberIndexes = new ArrayList<Integer>();
    }
    this.edgeClusterMemberIndexes.add(edgeClusterMemberIndexesItem);
    return this;
  }

   /**
   * First index will be used as the preferred member
   * @return edgeClusterMemberIndexes
  **/
  @Schema(description = "First index will be used as the preferred member")
  public List<Integer> getEdgeClusterMemberIndexes() {
    return edgeClusterMemberIndexes;
  }

  public void setEdgeClusterMemberIndexes(List<Integer> edgeClusterMemberIndexes) {
    this.edgeClusterMemberIndexes = edgeClusterMemberIndexes;
  }

  public BridgeEndpointProfile highAvailabilityMode(HighAvailabilityModeEnum highAvailabilityMode) {
    this.highAvailabilityMode = highAvailabilityMode;
    return this;
  }

   /**
   * High avaialability mode can be active-active or active-standby
   * @return highAvailabilityMode
  **/
  @Schema(description = "High avaialability mode can be active-active or active-standby")
  public HighAvailabilityModeEnum getHighAvailabilityMode() {
    return highAvailabilityMode;
  }

  public void setHighAvailabilityMode(HighAvailabilityModeEnum highAvailabilityMode) {
    this.highAvailabilityMode = highAvailabilityMode;
  }

  public BridgeEndpointProfile edgeClusterId(String edgeClusterId) {
    this.edgeClusterId = edgeClusterId;
    return this;
  }

   /**
   * UUID of the edge cluster for this bridge endpoint
   * @return edgeClusterId
  **/
  @Schema(required = true, description = "UUID of the edge cluster for this bridge endpoint")
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
    BridgeEndpointProfile bridgeEndpointProfile = (BridgeEndpointProfile) o;
    return Objects.equals(this.failoverMode, bridgeEndpointProfile.failoverMode) &&
        Objects.equals(this.edgeClusterMemberIndexes, bridgeEndpointProfile.edgeClusterMemberIndexes) &&
        Objects.equals(this.highAvailabilityMode, bridgeEndpointProfile.highAvailabilityMode) &&
        Objects.equals(this.edgeClusterId, bridgeEndpointProfile.edgeClusterId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failoverMode, edgeClusterMemberIndexes, highAvailabilityMode, edgeClusterId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BridgeEndpointProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    failoverMode: ").append(toIndentedString(failoverMode)).append("\n");
    sb.append("    edgeClusterMemberIndexes: ").append(toIndentedString(edgeClusterMemberIndexes)).append("\n");
    sb.append("    highAvailabilityMode: ").append(toIndentedString(highAvailabilityMode)).append("\n");
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