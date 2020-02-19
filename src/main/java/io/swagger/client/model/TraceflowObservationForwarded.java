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
import io.swagger.client.model.TraceflowObservation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TraceflowObservationForwarded
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class TraceflowObservationForwarded extends TraceflowObservation {
  @SerializedName("uplink_name")
  private String uplinkName = null;

  @SerializedName("vtep_label")
  private Long vtepLabel = null;

  @SerializedName("remote_ip_address")
  private String remoteIpAddress = null;

  @SerializedName("context")
  private Long context = null;

  @SerializedName("local_ip_address")
  private String localIpAddress = null;

  @SerializedName("dst_transport_node_id")
  private String dstTransportNodeId = null;

  @SerializedName("dst_transport_node_name")
  private String dstTransportNodeName = null;

  public TraceflowObservationForwarded uplinkName(String uplinkName) {
    this.uplinkName = uplinkName;
    return this;
  }

   /**
   * The name of the uplink the traceflow packet is forwarded on
   * @return uplinkName
  **/
  @Schema(description = "The name of the uplink the traceflow packet is forwarded on")
  public String getUplinkName() {
    return uplinkName;
  }

  public void setUplinkName(String uplinkName) {
    this.uplinkName = uplinkName;
  }

  public TraceflowObservationForwarded vtepLabel(Long vtepLabel) {
    this.vtepLabel = vtepLabel;
    return this;
  }

   /**
   * The virtual tunnel endpoint label
   * @return vtepLabel
  **/
  @Schema(description = "The virtual tunnel endpoint label")
  public Long getVtepLabel() {
    return vtepLabel;
  }

  public void setVtepLabel(Long vtepLabel) {
    this.vtepLabel = vtepLabel;
  }

  public TraceflowObservationForwarded remoteIpAddress(String remoteIpAddress) {
    this.remoteIpAddress = remoteIpAddress;
    return this;
  }

   /**
   * IP address of the destination end of the tunnel
   * @return remoteIpAddress
  **/
  @Schema(description = "IP address of the destination end of the tunnel")
  public String getRemoteIpAddress() {
    return remoteIpAddress;
  }

  public void setRemoteIpAddress(String remoteIpAddress) {
    this.remoteIpAddress = remoteIpAddress;
  }

  public TraceflowObservationForwarded context(Long context) {
    this.context = context;
    return this;
  }

   /**
   * The 64bit tunnel context carried on the wire
   * @return context
  **/
  @Schema(description = "The 64bit tunnel context carried on the wire")
  public Long getContext() {
    return context;
  }

  public void setContext(Long context) {
    this.context = context;
  }

  public TraceflowObservationForwarded localIpAddress(String localIpAddress) {
    this.localIpAddress = localIpAddress;
    return this;
  }

   /**
   * IP address of the source end of the tunnel
   * @return localIpAddress
  **/
  @Schema(description = "IP address of the source end of the tunnel")
  public String getLocalIpAddress() {
    return localIpAddress;
  }

  public void setLocalIpAddress(String localIpAddress) {
    this.localIpAddress = localIpAddress;
  }

   /**
   * This field will not be always available. Use remote_ip_address when this field is not set.
   * @return dstTransportNodeId
  **/
  @Schema(description = "This field will not be always available. Use remote_ip_address when this field is not set.")
  public String getDstTransportNodeId() {
    return dstTransportNodeId;
  }

   /**
   * The name of the transport node to which the traceflow packet is forwarded
   * @return dstTransportNodeName
  **/
  @Schema(description = "The name of the transport node to which the traceflow packet is forwarded")
  public String getDstTransportNodeName() {
    return dstTransportNodeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceflowObservationForwarded traceflowObservationForwarded = (TraceflowObservationForwarded) o;
    return Objects.equals(this.uplinkName, traceflowObservationForwarded.uplinkName) &&
        Objects.equals(this.vtepLabel, traceflowObservationForwarded.vtepLabel) &&
        Objects.equals(this.remoteIpAddress, traceflowObservationForwarded.remoteIpAddress) &&
        Objects.equals(this.context, traceflowObservationForwarded.context) &&
        Objects.equals(this.localIpAddress, traceflowObservationForwarded.localIpAddress) &&
        Objects.equals(this.dstTransportNodeId, traceflowObservationForwarded.dstTransportNodeId) &&
        Objects.equals(this.dstTransportNodeName, traceflowObservationForwarded.dstTransportNodeName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uplinkName, vtepLabel, remoteIpAddress, context, localIpAddress, dstTransportNodeId, dstTransportNodeName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceflowObservationForwarded {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    uplinkName: ").append(toIndentedString(uplinkName)).append("\n");
    sb.append("    vtepLabel: ").append(toIndentedString(vtepLabel)).append("\n");
    sb.append("    remoteIpAddress: ").append(toIndentedString(remoteIpAddress)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    localIpAddress: ").append(toIndentedString(localIpAddress)).append("\n");
    sb.append("    dstTransportNodeId: ").append(toIndentedString(dstTransportNodeId)).append("\n");
    sb.append("    dstTransportNodeName: ").append(toIndentedString(dstTransportNodeName)).append("\n");
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
