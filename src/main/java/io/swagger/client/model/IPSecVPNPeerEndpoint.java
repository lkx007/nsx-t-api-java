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
 * IPSec VPN Peer Endpoint covers configuration to be applied locally to establish a session with remote endpoint on peer site.
 */
@Schema(description = "IPSec VPN Peer Endpoint covers configuration to be applied locally to establish a session with remote endpoint on peer site.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPSecVPNPeerEndpoint extends ManagedResource {
  @SerializedName("psk")
  private String psk = null;

  @SerializedName("peer_id")
  private String peerId = null;

  @SerializedName("ipsec_tunnel_profile_id")
  private String ipsecTunnelProfileId = null;

  /**
   * Authentication mode used for the peer authentication. For PSK (Pre Shared Key) authentication mode, &#x27;psk&#x27; property is mandatory and for the CERTIFICATE authentication mode, &#x27;peer_id&#x27; property is mandatory.
   */
  @JsonAdapter(AuthenticationModeEnum.Adapter.class)
  public enum AuthenticationModeEnum {
    PSK("PSK"),
    CERTIFICATE("CERTIFICATE");

    private String value;

    AuthenticationModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AuthenticationModeEnum fromValue(String text) {
      for (AuthenticationModeEnum b : AuthenticationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AuthenticationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthenticationModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("authentication_mode")
  private AuthenticationModeEnum authenticationMode = AuthenticationModeEnum.PSK;

  @SerializedName("peer_address")
  private String peerAddress = null;

  /**
   * Connection initiation mode used by local endpoint to establish ike connection with peer endpoint. INITIATOR - In this mode local endpoint initiates tunnel setup and will also respond to incoming tunnel setup requests from peer gateway. RESPOND_ONLY - In this mode, local endpoint shall only respond to incoming tunnel setup requests. It shall not initiate the tunnel setup. ON_DEMAND - In this mode local endpoint will initiate tunnel creation once first packet matching the policy rule is received and will also respond to incoming initiation request. 
   */
  @JsonAdapter(ConnectionInitiationModeEnum.Adapter.class)
  public enum ConnectionInitiationModeEnum {
    INITIATOR("INITIATOR"),
    RESPOND_ONLY("RESPOND_ONLY"),
    ON_DEMAND("ON_DEMAND");

    private String value;

    ConnectionInitiationModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ConnectionInitiationModeEnum fromValue(String text) {
      for (ConnectionInitiationModeEnum b : ConnectionInitiationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ConnectionInitiationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConnectionInitiationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConnectionInitiationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConnectionInitiationModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("connection_initiation_mode")
  private ConnectionInitiationModeEnum connectionInitiationMode = ConnectionInitiationModeEnum.INITIATOR;

  @SerializedName("dpd_profile_id")
  private String dpdProfileId = null;

  @SerializedName("ike_profile_id")
  private String ikeProfileId = null;

  public IPSecVPNPeerEndpoint psk(String psk) {
    this.psk = psk;
    return this;
  }

   /**
   * IPSec Pre-shared key. Maximum length of this field is 128 characters.
   * @return psk
  **/
  @Schema(description = "IPSec Pre-shared key. Maximum length of this field is 128 characters.")
  public String getPsk() {
    return psk;
  }

  public void setPsk(String psk) {
    this.psk = psk;
  }

  public IPSecVPNPeerEndpoint peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }

   /**
   * Peer identifier.
   * @return peerId
  **/
  @Schema(required = true, description = "Peer identifier.")
  public String getPeerId() {
    return peerId;
  }

  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  public IPSecVPNPeerEndpoint ipsecTunnelProfileId(String ipsecTunnelProfileId) {
    this.ipsecTunnelProfileId = ipsecTunnelProfileId;
    return this;
  }

   /**
   * Tunnel profile id to be used. By default it will point to system default profile.
   * @return ipsecTunnelProfileId
  **/
  @Schema(description = "Tunnel profile id to be used. By default it will point to system default profile.")
  public String getIpsecTunnelProfileId() {
    return ipsecTunnelProfileId;
  }

  public void setIpsecTunnelProfileId(String ipsecTunnelProfileId) {
    this.ipsecTunnelProfileId = ipsecTunnelProfileId;
  }

  public IPSecVPNPeerEndpoint authenticationMode(AuthenticationModeEnum authenticationMode) {
    this.authenticationMode = authenticationMode;
    return this;
  }

   /**
   * Authentication mode used for the peer authentication. For PSK (Pre Shared Key) authentication mode, &#x27;psk&#x27; property is mandatory and for the CERTIFICATE authentication mode, &#x27;peer_id&#x27; property is mandatory.
   * @return authenticationMode
  **/
  @Schema(description = "Authentication mode used for the peer authentication. For PSK (Pre Shared Key) authentication mode, 'psk' property is mandatory and for the CERTIFICATE authentication mode, 'peer_id' property is mandatory.")
  public AuthenticationModeEnum getAuthenticationMode() {
    return authenticationMode;
  }

  public void setAuthenticationMode(AuthenticationModeEnum authenticationMode) {
    this.authenticationMode = authenticationMode;
  }

  public IPSecVPNPeerEndpoint peerAddress(String peerAddress) {
    this.peerAddress = peerAddress;
    return this;
  }

   /**
   * IPV4 address of peer endpoint on remote site.
   * @return peerAddress
  **/
  @Schema(required = true, description = "IPV4 address of peer endpoint on remote site.")
  public String getPeerAddress() {
    return peerAddress;
  }

  public void setPeerAddress(String peerAddress) {
    this.peerAddress = peerAddress;
  }

  public IPSecVPNPeerEndpoint connectionInitiationMode(ConnectionInitiationModeEnum connectionInitiationMode) {
    this.connectionInitiationMode = connectionInitiationMode;
    return this;
  }

   /**
   * Connection initiation mode used by local endpoint to establish ike connection with peer endpoint. INITIATOR - In this mode local endpoint initiates tunnel setup and will also respond to incoming tunnel setup requests from peer gateway. RESPOND_ONLY - In this mode, local endpoint shall only respond to incoming tunnel setup requests. It shall not initiate the tunnel setup. ON_DEMAND - In this mode local endpoint will initiate tunnel creation once first packet matching the policy rule is received and will also respond to incoming initiation request. 
   * @return connectionInitiationMode
  **/
  @Schema(description = "Connection initiation mode used by local endpoint to establish ike connection with peer endpoint. INITIATOR - In this mode local endpoint initiates tunnel setup and will also respond to incoming tunnel setup requests from peer gateway. RESPOND_ONLY - In this mode, local endpoint shall only respond to incoming tunnel setup requests. It shall not initiate the tunnel setup. ON_DEMAND - In this mode local endpoint will initiate tunnel creation once first packet matching the policy rule is received and will also respond to incoming initiation request. ")
  public ConnectionInitiationModeEnum getConnectionInitiationMode() {
    return connectionInitiationMode;
  }

  public void setConnectionInitiationMode(ConnectionInitiationModeEnum connectionInitiationMode) {
    this.connectionInitiationMode = connectionInitiationMode;
  }

  public IPSecVPNPeerEndpoint dpdProfileId(String dpdProfileId) {
    this.dpdProfileId = dpdProfileId;
    return this;
  }

   /**
   * Dead peer detection (DPD) profile id. Default will be set according to system default policy.
   * @return dpdProfileId
  **/
  @Schema(description = "Dead peer detection (DPD) profile id. Default will be set according to system default policy.")
  public String getDpdProfileId() {
    return dpdProfileId;
  }

  public void setDpdProfileId(String dpdProfileId) {
    this.dpdProfileId = dpdProfileId;
  }

  public IPSecVPNPeerEndpoint ikeProfileId(String ikeProfileId) {
    this.ikeProfileId = ikeProfileId;
    return this;
  }

   /**
   * IKE profile id to be used. Default will be set according to system default policy.
   * @return ikeProfileId
  **/
  @Schema(description = "IKE profile id to be used. Default will be set according to system default policy.")
  public String getIkeProfileId() {
    return ikeProfileId;
  }

  public void setIkeProfileId(String ikeProfileId) {
    this.ikeProfileId = ikeProfileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPSecVPNPeerEndpoint ipSecVPNPeerEndpoint = (IPSecVPNPeerEndpoint) o;
    return Objects.equals(this.psk, ipSecVPNPeerEndpoint.psk) &&
        Objects.equals(this.peerId, ipSecVPNPeerEndpoint.peerId) &&
        Objects.equals(this.ipsecTunnelProfileId, ipSecVPNPeerEndpoint.ipsecTunnelProfileId) &&
        Objects.equals(this.authenticationMode, ipSecVPNPeerEndpoint.authenticationMode) &&
        Objects.equals(this.peerAddress, ipSecVPNPeerEndpoint.peerAddress) &&
        Objects.equals(this.connectionInitiationMode, ipSecVPNPeerEndpoint.connectionInitiationMode) &&
        Objects.equals(this.dpdProfileId, ipSecVPNPeerEndpoint.dpdProfileId) &&
        Objects.equals(this.ikeProfileId, ipSecVPNPeerEndpoint.ikeProfileId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(psk, peerId, ipsecTunnelProfileId, authenticationMode, peerAddress, connectionInitiationMode, dpdProfileId, ikeProfileId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSecVPNPeerEndpoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    ipsecTunnelProfileId: ").append(toIndentedString(ipsecTunnelProfileId)).append("\n");
    sb.append("    authenticationMode: ").append(toIndentedString(authenticationMode)).append("\n");
    sb.append("    peerAddress: ").append(toIndentedString(peerAddress)).append("\n");
    sb.append("    connectionInitiationMode: ").append(toIndentedString(connectionInitiationMode)).append("\n");
    sb.append("    dpdProfileId: ").append(toIndentedString(dpdProfileId)).append("\n");
    sb.append("    ikeProfileId: ").append(toIndentedString(ikeProfileId)).append("\n");
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
