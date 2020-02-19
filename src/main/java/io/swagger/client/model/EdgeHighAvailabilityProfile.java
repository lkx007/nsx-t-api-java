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
import io.swagger.client.model.StandbyRelocationConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Profile for BFD HA cluster setting
 */
@Schema(description = "Profile for BFD HA cluster setting")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class EdgeHighAvailabilityProfile extends ClusterProfile {
  @SerializedName("standby_relocation_config")
  private StandbyRelocationConfig standbyRelocationConfig = null;

  @SerializedName("bfd_declare_dead_multiple")
  private Long bfdDeclareDeadMultiple = 3l;

  @SerializedName("bfd_probe_interval")
  private Long bfdProbeInterval = 1000l;

  @SerializedName("bfd_allowed_hops")
  private Long bfdAllowedHops = 255l;

  public EdgeHighAvailabilityProfile standbyRelocationConfig(StandbyRelocationConfig standbyRelocationConfig) {
    this.standbyRelocationConfig = standbyRelocationConfig;
    return this;
  }

   /**
   * Get standbyRelocationConfig
   * @return standbyRelocationConfig
  **/
  @Schema(description = "")
  public StandbyRelocationConfig getStandbyRelocationConfig() {
    return standbyRelocationConfig;
  }

  public void setStandbyRelocationConfig(StandbyRelocationConfig standbyRelocationConfig) {
    this.standbyRelocationConfig = standbyRelocationConfig;
  }

  public EdgeHighAvailabilityProfile bfdDeclareDeadMultiple(Long bfdDeclareDeadMultiple) {
    this.bfdDeclareDeadMultiple = bfdDeclareDeadMultiple;
    return this;
  }

   /**
   * Number of times a packet is missed before BFD declares the neighbor down.
   * minimum: 2
   * maximum: 16
   * @return bfdDeclareDeadMultiple
  **/
  @Schema(description = "Number of times a packet is missed before BFD declares the neighbor down.")
  public Long getBfdDeclareDeadMultiple() {
    return bfdDeclareDeadMultiple;
  }

  public void setBfdDeclareDeadMultiple(Long bfdDeclareDeadMultiple) {
    this.bfdDeclareDeadMultiple = bfdDeclareDeadMultiple;
  }

  public EdgeHighAvailabilityProfile bfdProbeInterval(Long bfdProbeInterval) {
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

  public EdgeHighAvailabilityProfile bfdAllowedHops(Long bfdAllowedHops) {
    this.bfdAllowedHops = bfdAllowedHops;
    return this;
  }

   /**
   * BFD allowed hops
   * minimum: 1
   * maximum: 255
   * @return bfdAllowedHops
  **/
  @Schema(description = "BFD allowed hops")
  public Long getBfdAllowedHops() {
    return bfdAllowedHops;
  }

  public void setBfdAllowedHops(Long bfdAllowedHops) {
    this.bfdAllowedHops = bfdAllowedHops;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeHighAvailabilityProfile edgeHighAvailabilityProfile = (EdgeHighAvailabilityProfile) o;
    return Objects.equals(this.standbyRelocationConfig, edgeHighAvailabilityProfile.standbyRelocationConfig) &&
        Objects.equals(this.bfdDeclareDeadMultiple, edgeHighAvailabilityProfile.bfdDeclareDeadMultiple) &&
        Objects.equals(this.bfdProbeInterval, edgeHighAvailabilityProfile.bfdProbeInterval) &&
        Objects.equals(this.bfdAllowedHops, edgeHighAvailabilityProfile.bfdAllowedHops) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standbyRelocationConfig, bfdDeclareDeadMultiple, bfdProbeInterval, bfdAllowedHops, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeHighAvailabilityProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    standbyRelocationConfig: ").append(toIndentedString(standbyRelocationConfig)).append("\n");
    sb.append("    bfdDeclareDeadMultiple: ").append(toIndentedString(bfdDeclareDeadMultiple)).append("\n");
    sb.append("    bfdProbeInterval: ").append(toIndentedString(bfdProbeInterval)).append("\n");
    sb.append("    bfdAllowedHops: ").append(toIndentedString(bfdAllowedHops)).append("\n");
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