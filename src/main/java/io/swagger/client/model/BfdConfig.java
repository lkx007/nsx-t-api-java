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
import java.util.List;
/**
 * BFD configuration for LogicalRouter
 */
@Schema(description = "BFD configuration for LogicalRouter")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class BfdConfig extends ManagedResource {
  @SerializedName("receive_interval")
  private Long receiveInterval = 1000l;

  @SerializedName("declare_dead_multiple")
  private Long declareDeadMultiple = 3l;

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("logical_router_id")
  private String logicalRouterId = null;

  @SerializedName("transmit_interval")
  private Long transmitInterval = 1000l;

  public BfdConfig receiveInterval(Long receiveInterval) {
    this.receiveInterval = receiveInterval;
    return this;
  }

   /**
   * the time interval (in milliseconds) between heartbeat packets for BFD when receiving heartbeats.
   * minimum: 100
   * maximum: 60000
   * @return receiveInterval
  **/
  @Schema(description = "the time interval (in milliseconds) between heartbeat packets for BFD when receiving heartbeats.")
  public Long getReceiveInterval() {
    return receiveInterval;
  }

  public void setReceiveInterval(Long receiveInterval) {
    this.receiveInterval = receiveInterval;
  }

  public BfdConfig declareDeadMultiple(Long declareDeadMultiple) {
    this.declareDeadMultiple = declareDeadMultiple;
    return this;
  }

   /**
   * Number of times a packet is missed before BFD declares the neighbor down.
   * minimum: 2
   * maximum: 16
   * @return declareDeadMultiple
  **/
  @Schema(description = "Number of times a packet is missed before BFD declares the neighbor down.")
  public Long getDeclareDeadMultiple() {
    return declareDeadMultiple;
  }

  public void setDeclareDeadMultiple(Long declareDeadMultiple) {
    this.declareDeadMultiple = declareDeadMultiple;
  }

  public BfdConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Flag to enable BFD for this LogicalRouter
   * @return enabled
  **/
  @Schema(description = "Flag to enable BFD for this LogicalRouter")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

   /**
   * Logical router id
   * @return logicalRouterId
  **/
  @Schema(description = "Logical router id")
  public String getLogicalRouterId() {
    return logicalRouterId;
  }

  public BfdConfig transmitInterval(Long transmitInterval) {
    this.transmitInterval = transmitInterval;
    return this;
  }

   /**
   * the time interval (in milliseconds) between heartbeat packets for BFD when sending heartbeats.
   * minimum: 100
   * maximum: 60000
   * @return transmitInterval
  **/
  @Schema(description = "the time interval (in milliseconds) between heartbeat packets for BFD when sending heartbeats.")
  public Long getTransmitInterval() {
    return transmitInterval;
  }

  public void setTransmitInterval(Long transmitInterval) {
    this.transmitInterval = transmitInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BfdConfig bfdConfig = (BfdConfig) o;
    return Objects.equals(this.receiveInterval, bfdConfig.receiveInterval) &&
        Objects.equals(this.declareDeadMultiple, bfdConfig.declareDeadMultiple) &&
        Objects.equals(this.enabled, bfdConfig.enabled) &&
        Objects.equals(this.logicalRouterId, bfdConfig.logicalRouterId) &&
        Objects.equals(this.transmitInterval, bfdConfig.transmitInterval) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiveInterval, declareDeadMultiple, enabled, logicalRouterId, transmitInterval, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BfdConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    receiveInterval: ").append(toIndentedString(receiveInterval)).append("\n");
    sb.append("    declareDeadMultiple: ").append(toIndentedString(declareDeadMultiple)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    logicalRouterId: ").append(toIndentedString(logicalRouterId)).append("\n");
    sb.append("    transmitInterval: ").append(toIndentedString(transmitInterval)).append("\n");
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