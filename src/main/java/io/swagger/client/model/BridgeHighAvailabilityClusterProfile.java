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
import io.swagger.client.model.ClusterProfile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Profile for BFD HA cluster setting
 */
@Schema(description = "Profile for BFD HA cluster setting")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class BridgeHighAvailabilityClusterProfile extends ClusterProfile {
  @SerializedName("enable")
  private Boolean enable = true;

  @SerializedName("bfd_probe_interval")
  private Long bfdProbeInterval = 1000l;

  public BridgeHighAvailabilityClusterProfile enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * whether the heartbeat is enabled
   * @return enable
  **/
  @Schema(description = "whether the heartbeat is enabled")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public BridgeHighAvailabilityClusterProfile bfdProbeInterval(Long bfdProbeInterval) {
    this.bfdProbeInterval = bfdProbeInterval;
    return this;
  }

   /**
   * the time interval (in millisec) between probe packets for heartbeat purpose
   * minimum: 300
   * maximum: 60000
   * @return bfdProbeInterval
  **/
  @Schema(description = "the time interval (in millisec) between probe packets for heartbeat purpose")
  public Long getBfdProbeInterval() {
    return bfdProbeInterval;
  }

  public void setBfdProbeInterval(Long bfdProbeInterval) {
    this.bfdProbeInterval = bfdProbeInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BridgeHighAvailabilityClusterProfile bridgeHighAvailabilityClusterProfile = (BridgeHighAvailabilityClusterProfile) o;
    return Objects.equals(this.enable, bridgeHighAvailabilityClusterProfile.enable) &&
        Objects.equals(this.bfdProbeInterval, bridgeHighAvailabilityClusterProfile.bfdProbeInterval) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, bfdProbeInterval, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BridgeHighAvailabilityClusterProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    bfdProbeInterval: ").append(toIndentedString(bfdProbeInterval)).append("\n");
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