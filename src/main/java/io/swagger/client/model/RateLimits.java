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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Enables traffic limit for incoming/outgoing broadcast and multicast packets. Use 0 to disable rate limiting for a specific traffic type
 */
@Schema(description = "Enables traffic limit for incoming/outgoing broadcast and multicast packets. Use 0 to disable rate limiting for a specific traffic type")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RateLimits {
  @SerializedName("rx_multicast")
  private Integer rxMulticast = 0;

  @SerializedName("tx_multicast")
  private Integer txMulticast = 0;

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("tx_broadcast")
  private Integer txBroadcast = 0;

  @SerializedName("rx_broadcast")
  private Integer rxBroadcast = 0;

  public RateLimits rxMulticast(Integer rxMulticast) {
    this.rxMulticast = rxMulticast;
    return this;
  }

   /**
   * Incoming multicast traffic limit in packets per second
   * minimum: 0
   * @return rxMulticast
  **/
  @Schema(description = "Incoming multicast traffic limit in packets per second")
  public Integer getRxMulticast() {
    return rxMulticast;
  }

  public void setRxMulticast(Integer rxMulticast) {
    this.rxMulticast = rxMulticast;
  }

  public RateLimits txMulticast(Integer txMulticast) {
    this.txMulticast = txMulticast;
    return this;
  }

   /**
   * Outgoing multicast traffic limit in packets per second
   * minimum: 0
   * @return txMulticast
  **/
  @Schema(description = "Outgoing multicast traffic limit in packets per second")
  public Integer getTxMulticast() {
    return txMulticast;
  }

  public void setTxMulticast(Integer txMulticast) {
    this.txMulticast = txMulticast;
  }

  public RateLimits enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether rate limiting is enabled
   * @return enabled
  **/
  @Schema(description = "Whether rate limiting is enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public RateLimits txBroadcast(Integer txBroadcast) {
    this.txBroadcast = txBroadcast;
    return this;
  }

   /**
   * Outgoing broadcast traffic limit in packets per second
   * minimum: 0
   * @return txBroadcast
  **/
  @Schema(description = "Outgoing broadcast traffic limit in packets per second")
  public Integer getTxBroadcast() {
    return txBroadcast;
  }

  public void setTxBroadcast(Integer txBroadcast) {
    this.txBroadcast = txBroadcast;
  }

  public RateLimits rxBroadcast(Integer rxBroadcast) {
    this.rxBroadcast = rxBroadcast;
    return this;
  }

   /**
   * Incoming broadcast traffic limit in packets per second
   * minimum: 0
   * @return rxBroadcast
  **/
  @Schema(description = "Incoming broadcast traffic limit in packets per second")
  public Integer getRxBroadcast() {
    return rxBroadcast;
  }

  public void setRxBroadcast(Integer rxBroadcast) {
    this.rxBroadcast = rxBroadcast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimits rateLimits = (RateLimits) o;
    return Objects.equals(this.rxMulticast, rateLimits.rxMulticast) &&
        Objects.equals(this.txMulticast, rateLimits.txMulticast) &&
        Objects.equals(this.enabled, rateLimits.enabled) &&
        Objects.equals(this.txBroadcast, rateLimits.txBroadcast) &&
        Objects.equals(this.rxBroadcast, rateLimits.rxBroadcast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rxMulticast, txMulticast, enabled, txBroadcast, rxBroadcast);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimits {\n");
    
    sb.append("    rxMulticast: ").append(toIndentedString(rxMulticast)).append("\n");
    sb.append("    txMulticast: ").append(toIndentedString(txMulticast)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    txBroadcast: ").append(toIndentedString(txBroadcast)).append("\n");
    sb.append("    rxBroadcast: ").append(toIndentedString(rxBroadcast)).append("\n");
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