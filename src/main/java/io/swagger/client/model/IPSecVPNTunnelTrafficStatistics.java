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
 * IPSec VPN tunnel traffic statistics.
 */
@Schema(description = "IPSec VPN tunnel traffic statistics.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPSecVPNTunnelTrafficStatistics {
  @SerializedName("packets_sent_other_error")
  private Long packetsSentOtherError = null;

  @SerializedName("packets_out")
  private Long packetsOut = null;

  @SerializedName("dropped_packets_out")
  private Long droppedPacketsOut = null;

  @SerializedName("integrity_failures")
  private Long integrityFailures = null;

  @SerializedName("nomatching_policy_errors")
  private Long nomatchingPolicyErrors = null;

  @SerializedName("sa_mismatch_errors_in")
  private Long saMismatchErrorsIn = null;

  @SerializedName("peer_subnet")
  private String peerSubnet = null;

  @SerializedName("replay_errors")
  private Long replayErrors = null;

  @SerializedName("bytes_out")
  private Long bytesOut = null;

  @SerializedName("local_subnet")
  private String localSubnet = null;

  @SerializedName("dropped_packets_in")
  private Long droppedPacketsIn = null;

  @SerializedName("encryption_failures")
  private Long encryptionFailures = null;

  @SerializedName("sa_mismatch_errors_out")
  private Long saMismatchErrorsOut = null;

  @SerializedName("tunnel_down_reason")
  private String tunnelDownReason = null;

  @SerializedName("packets_receive_other_error")
  private Long packetsReceiveOtherError = null;

  @SerializedName("bytes_in")
  private Long bytesIn = null;

  @SerializedName("decryption_failures")
  private Long decryptionFailures = null;

  @SerializedName("seq_number_overflow_error")
  private Long seqNumberOverflowError = null;

  @SerializedName("packets_in")
  private Long packetsIn = null;

  /**
   * Specifies the status of tunnel. If all the SA (Security association) are negotiated then tunnels status will be UP. If negotiation fails for the SAs status will be DOWN, if SAs are in negotiating phase tunnels status will be NEGOTIATING.
   */
  @JsonAdapter(TunnelStatusEnum.Adapter.class)
  public enum TunnelStatusEnum {
    UP("UP"),
    DOWN("DOWN"),
    NEGOTIATING("NEGOTIATING");

    private String value;

    TunnelStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TunnelStatusEnum fromValue(String text) {
      for (TunnelStatusEnum b : TunnelStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TunnelStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TunnelStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TunnelStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TunnelStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("tunnel_status")
  private TunnelStatusEnum tunnelStatus = null;

   /**
   * Total number of packets dropped while sending for any reason.
   * @return packetsSentOtherError
  **/
  @Schema(description = "Total number of packets dropped while sending for any reason.")
  public Long getPacketsSentOtherError() {
    return packetsSentOtherError;
  }

   /**
   * Total number of outgoing packets on outbound Security association (SA).
   * @return packetsOut
  **/
  @Schema(description = "Total number of outgoing packets on outbound Security association (SA).")
  public Long getPacketsOut() {
    return packetsOut;
  }

   /**
   * Total number of outgoing packets dropped on outbound security association.
   * @return droppedPacketsOut
  **/
  @Schema(description = "Total number of outgoing packets dropped on outbound security association.")
  public Long getDroppedPacketsOut() {
    return droppedPacketsOut;
  }

   /**
   * Total number of packets dropped due to integrity failures.
   * @return integrityFailures
  **/
  @Schema(description = "Total number of packets dropped due to integrity failures.")
  public Long getIntegrityFailures() {
    return integrityFailures;
  }

   /**
   * Number of packets dropped because of no matching policy is available.
   * @return nomatchingPolicyErrors
  **/
  @Schema(description = "Number of packets dropped because of no matching policy is available.")
  public Long getNomatchingPolicyErrors() {
    return nomatchingPolicyErrors;
  }

   /**
   * Totoal number of security association (SA) mismatch errors on incoming packets.
   * @return saMismatchErrorsIn
  **/
  @Schema(description = "Totoal number of security association (SA) mismatch errors on incoming packets.")
  public Long getSaMismatchErrorsIn() {
    return saMismatchErrorsIn;
  }

   /**
   * Peer subnet to which a tunnel belongs.
   * @return peerSubnet
  **/
  @Schema(description = "Peer subnet to which a tunnel belongs.")
  public String getPeerSubnet() {
    return peerSubnet;
  }

   /**
   * Total number of packets dropped due to replay check on that Security association (SA).
   * @return replayErrors
  **/
  @Schema(description = "Total number of packets dropped due to replay check on that Security association (SA).")
  public Long getReplayErrors() {
    return replayErrors;
  }

   /**
   * Total number of outgoing bytes on outbound Security association (SA).
   * @return bytesOut
  **/
  @Schema(description = "Total number of outgoing bytes on outbound Security association (SA).")
  public Long getBytesOut() {
    return bytesOut;
  }

   /**
   * Local subnet to which a tunnel belongs.
   * @return localSubnet
  **/
  @Schema(description = "Local subnet to which a tunnel belongs.")
  public String getLocalSubnet() {
    return localSubnet;
  }

   /**
   * Total number of incoming packets dropped on inbound security association.
   * @return droppedPacketsIn
  **/
  @Schema(description = "Total number of incoming packets dropped on inbound security association.")
  public Long getDroppedPacketsIn() {
    return droppedPacketsIn;
  }

   /**
   * Total number of packets dropped because of failure in encryption.
   * @return encryptionFailures
  **/
  @Schema(description = "Total number of packets dropped because of failure in encryption.")
  public Long getEncryptionFailures() {
    return encryptionFailures;
  }

   /**
   * Totoal number of security association (SA) mismatch errors on outgoing packets.
   * @return saMismatchErrorsOut
  **/
  @Schema(description = "Totoal number of security association (SA) mismatch errors on outgoing packets.")
  public Long getSaMismatchErrorsOut() {
    return saMismatchErrorsOut;
  }

   /**
   * Gives the detailed reason about the tunnel when it is down. If tunnel is UP tunnel down reason will be empty.
   * @return tunnelDownReason
  **/
  @Schema(description = "Gives the detailed reason about the tunnel when it is down. If tunnel is UP tunnel down reason will be empty.")
  public String getTunnelDownReason() {
    return tunnelDownReason;
  }

   /**
   * Total number of incoming packets dropped on inbound Security association (SA)(misc).
   * @return packetsReceiveOtherError
  **/
  @Schema(description = "Total number of incoming packets dropped on inbound Security association (SA)(misc).")
  public Long getPacketsReceiveOtherError() {
    return packetsReceiveOtherError;
  }

   /**
   * Total number of incoming bytes on inbound Security association (SA).
   * @return bytesIn
  **/
  @Schema(description = "Total number of incoming bytes on inbound Security association (SA).")
  public Long getBytesIn() {
    return bytesIn;
  }

   /**
   * Total number of packets dropped due to decryption failures.
   * @return decryptionFailures
  **/
  @Schema(description = "Total number of packets dropped due to decryption failures.")
  public Long getDecryptionFailures() {
    return decryptionFailures;
  }

   /**
   * Total number of packets dropped while sending due to overflow in sequence number.
   * @return seqNumberOverflowError
  **/
  @Schema(description = "Total number of packets dropped while sending due to overflow in sequence number.")
  public Long getSeqNumberOverflowError() {
    return seqNumberOverflowError;
  }

   /**
   * Total number of incoming packets on inbound Security association (SA).
   * @return packetsIn
  **/
  @Schema(description = "Total number of incoming packets on inbound Security association (SA).")
  public Long getPacketsIn() {
    return packetsIn;
  }

   /**
   * Specifies the status of tunnel. If all the SA (Security association) are negotiated then tunnels status will be UP. If negotiation fails for the SAs status will be DOWN, if SAs are in negotiating phase tunnels status will be NEGOTIATING.
   * @return tunnelStatus
  **/
  @Schema(description = "Specifies the status of tunnel. If all the SA (Security association) are negotiated then tunnels status will be UP. If negotiation fails for the SAs status will be DOWN, if SAs are in negotiating phase tunnels status will be NEGOTIATING.")
  public TunnelStatusEnum getTunnelStatus() {
    return tunnelStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPSecVPNTunnelTrafficStatistics ipSecVPNTunnelTrafficStatistics = (IPSecVPNTunnelTrafficStatistics) o;
    return Objects.equals(this.packetsSentOtherError, ipSecVPNTunnelTrafficStatistics.packetsSentOtherError) &&
        Objects.equals(this.packetsOut, ipSecVPNTunnelTrafficStatistics.packetsOut) &&
        Objects.equals(this.droppedPacketsOut, ipSecVPNTunnelTrafficStatistics.droppedPacketsOut) &&
        Objects.equals(this.integrityFailures, ipSecVPNTunnelTrafficStatistics.integrityFailures) &&
        Objects.equals(this.nomatchingPolicyErrors, ipSecVPNTunnelTrafficStatistics.nomatchingPolicyErrors) &&
        Objects.equals(this.saMismatchErrorsIn, ipSecVPNTunnelTrafficStatistics.saMismatchErrorsIn) &&
        Objects.equals(this.peerSubnet, ipSecVPNTunnelTrafficStatistics.peerSubnet) &&
        Objects.equals(this.replayErrors, ipSecVPNTunnelTrafficStatistics.replayErrors) &&
        Objects.equals(this.bytesOut, ipSecVPNTunnelTrafficStatistics.bytesOut) &&
        Objects.equals(this.localSubnet, ipSecVPNTunnelTrafficStatistics.localSubnet) &&
        Objects.equals(this.droppedPacketsIn, ipSecVPNTunnelTrafficStatistics.droppedPacketsIn) &&
        Objects.equals(this.encryptionFailures, ipSecVPNTunnelTrafficStatistics.encryptionFailures) &&
        Objects.equals(this.saMismatchErrorsOut, ipSecVPNTunnelTrafficStatistics.saMismatchErrorsOut) &&
        Objects.equals(this.tunnelDownReason, ipSecVPNTunnelTrafficStatistics.tunnelDownReason) &&
        Objects.equals(this.packetsReceiveOtherError, ipSecVPNTunnelTrafficStatistics.packetsReceiveOtherError) &&
        Objects.equals(this.bytesIn, ipSecVPNTunnelTrafficStatistics.bytesIn) &&
        Objects.equals(this.decryptionFailures, ipSecVPNTunnelTrafficStatistics.decryptionFailures) &&
        Objects.equals(this.seqNumberOverflowError, ipSecVPNTunnelTrafficStatistics.seqNumberOverflowError) &&
        Objects.equals(this.packetsIn, ipSecVPNTunnelTrafficStatistics.packetsIn) &&
        Objects.equals(this.tunnelStatus, ipSecVPNTunnelTrafficStatistics.tunnelStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packetsSentOtherError, packetsOut, droppedPacketsOut, integrityFailures, nomatchingPolicyErrors, saMismatchErrorsIn, peerSubnet, replayErrors, bytesOut, localSubnet, droppedPacketsIn, encryptionFailures, saMismatchErrorsOut, tunnelDownReason, packetsReceiveOtherError, bytesIn, decryptionFailures, seqNumberOverflowError, packetsIn, tunnelStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSecVPNTunnelTrafficStatistics {\n");
    
    sb.append("    packetsSentOtherError: ").append(toIndentedString(packetsSentOtherError)).append("\n");
    sb.append("    packetsOut: ").append(toIndentedString(packetsOut)).append("\n");
    sb.append("    droppedPacketsOut: ").append(toIndentedString(droppedPacketsOut)).append("\n");
    sb.append("    integrityFailures: ").append(toIndentedString(integrityFailures)).append("\n");
    sb.append("    nomatchingPolicyErrors: ").append(toIndentedString(nomatchingPolicyErrors)).append("\n");
    sb.append("    saMismatchErrorsIn: ").append(toIndentedString(saMismatchErrorsIn)).append("\n");
    sb.append("    peerSubnet: ").append(toIndentedString(peerSubnet)).append("\n");
    sb.append("    replayErrors: ").append(toIndentedString(replayErrors)).append("\n");
    sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
    sb.append("    localSubnet: ").append(toIndentedString(localSubnet)).append("\n");
    sb.append("    droppedPacketsIn: ").append(toIndentedString(droppedPacketsIn)).append("\n");
    sb.append("    encryptionFailures: ").append(toIndentedString(encryptionFailures)).append("\n");
    sb.append("    saMismatchErrorsOut: ").append(toIndentedString(saMismatchErrorsOut)).append("\n");
    sb.append("    tunnelDownReason: ").append(toIndentedString(tunnelDownReason)).append("\n");
    sb.append("    packetsReceiveOtherError: ").append(toIndentedString(packetsReceiveOtherError)).append("\n");
    sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
    sb.append("    decryptionFailures: ").append(toIndentedString(decryptionFailures)).append("\n");
    sb.append("    seqNumberOverflowError: ").append(toIndentedString(seqNumberOverflowError)).append("\n");
    sb.append("    packetsIn: ").append(toIndentedString(packetsIn)).append("\n");
    sb.append("    tunnelStatus: ").append(toIndentedString(tunnelStatus)).append("\n");
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
