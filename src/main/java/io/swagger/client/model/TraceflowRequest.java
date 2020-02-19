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
import io.swagger.client.model.PacketData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TraceflowRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class TraceflowRequest {
  @SerializedName("packet")
  private PacketData packet = null;

  @SerializedName("timeout")
  private Long timeout = 10000l;

  @SerializedName("lport_id")
  private String lportId = null;

  public TraceflowRequest packet(PacketData packet) {
    this.packet = packet;
    return this;
  }

   /**
   * Get packet
   * @return packet
  **/
  @Schema(required = true, description = "")
  public PacketData getPacket() {
    return packet;
  }

  public void setPacket(PacketData packet) {
    this.packet = packet;
  }

  public TraceflowRequest timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Maximum time (in ms) the management plane will wait for observation result list to be sent by controller plane.
   * minimum: 5000
   * maximum: 15000
   * @return timeout
  **/
  @Schema(description = "Maximum time (in ms) the management plane will wait for observation result list to be sent by controller plane.")
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }

  public TraceflowRequest lportId(String lportId) {
    this.lportId = lportId;
    return this;
  }

   /**
   * id of the source logical port to inject the traceflow packet into
   * @return lportId
  **/
  @Schema(required = true, description = "id of the source logical port to inject the traceflow packet into")
  public String getLportId() {
    return lportId;
  }

  public void setLportId(String lportId) {
    this.lportId = lportId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceflowRequest traceflowRequest = (TraceflowRequest) o;
    return Objects.equals(this.packet, traceflowRequest.packet) &&
        Objects.equals(this.timeout, traceflowRequest.timeout) &&
        Objects.equals(this.lportId, traceflowRequest.lportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packet, timeout, lportId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceflowRequest {\n");
    
    sb.append("    packet: ").append(toIndentedString(packet)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    lportId: ").append(toIndentedString(lportId)).append("\n");
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
