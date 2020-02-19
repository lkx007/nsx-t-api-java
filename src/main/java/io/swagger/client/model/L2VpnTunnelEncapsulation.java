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
 * L2VPN tunnel encapsulation config
 */
@Schema(description = "L2VPN tunnel encapsulation config")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class L2VpnTunnelEncapsulation {
  @SerializedName("local_endpoint_ip")
  private String localEndpointIp = null;

  /**
   * Encapsulation protocol used by the tunnel
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    GRE("GRE");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProtocolEnum fromValue(String text) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProtocolEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("protocol")
  private ProtocolEnum protocol = ProtocolEnum.GRE;

  @SerializedName("peer_endpoint_ip")
  private String peerEndpointIp = null;

  public L2VpnTunnelEncapsulation localEndpointIp(String localEndpointIp) {
    this.localEndpointIp = localEndpointIp;
    return this;
  }

   /**
   * IP Address of the tunnel port. For hub, the IP is allocated from L2VpnService logical_tap_ip_pool. All sessions on same L2VpnService get the same local_endpoint_ip. For spoke, the IP must be provided.
   * @return localEndpointIp
  **/
  @Schema(description = "IP Address of the tunnel port. For hub, the IP is allocated from L2VpnService logical_tap_ip_pool. All sessions on same L2VpnService get the same local_endpoint_ip. For spoke, the IP must be provided.")
  public String getLocalEndpointIp() {
    return localEndpointIp;
  }

  public void setLocalEndpointIp(String localEndpointIp) {
    this.localEndpointIp = localEndpointIp;
  }

  public L2VpnTunnelEncapsulation protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Encapsulation protocol used by the tunnel
   * @return protocol
  **/
  @Schema(description = "Encapsulation protocol used by the tunnel")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public L2VpnTunnelEncapsulation peerEndpointIp(String peerEndpointIp) {
    this.peerEndpointIp = peerEndpointIp;
    return this;
  }

   /**
   * IP Address of the peer tunnel port. For hub, the IP is allocated from L2VpnService logical_tap_ip_pool. For spoke, the IP must be provided.
   * @return peerEndpointIp
  **/
  @Schema(description = "IP Address of the peer tunnel port. For hub, the IP is allocated from L2VpnService logical_tap_ip_pool. For spoke, the IP must be provided.")
  public String getPeerEndpointIp() {
    return peerEndpointIp;
  }

  public void setPeerEndpointIp(String peerEndpointIp) {
    this.peerEndpointIp = peerEndpointIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L2VpnTunnelEncapsulation l2VpnTunnelEncapsulation = (L2VpnTunnelEncapsulation) o;
    return Objects.equals(this.localEndpointIp, l2VpnTunnelEncapsulation.localEndpointIp) &&
        Objects.equals(this.protocol, l2VpnTunnelEncapsulation.protocol) &&
        Objects.equals(this.peerEndpointIp, l2VpnTunnelEncapsulation.peerEndpointIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localEndpointIp, protocol, peerEndpointIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L2VpnTunnelEncapsulation {\n");
    
    sb.append("    localEndpointIp: ").append(toIndentedString(localEndpointIp)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    peerEndpointIp: ").append(toIndentedString(peerEndpointIp)).append("\n");
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