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
import io.swagger.client.model.ResourceReference;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Local endpoint represents a logical router on which tunnel needs to be terminated.
 */
@Schema(description = "Local endpoint represents a logical router on which tunnel needs to be terminated.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPSecVPNLocalEndpoint extends ManagedResource {
  @SerializedName("ipsec_vpn_service_id")
  private ResourceReference ipsecVpnServiceId = null;

  @SerializedName("trust_ca_ids")
  private List<String> trustCaIds = null;

  @SerializedName("local_id")
  private String localId = null;

  @SerializedName("local_address")
  private String localAddress = null;

  @SerializedName("certificate_id")
  private String certificateId = null;

  @SerializedName("trust_crl_ids")
  private List<String> trustCrlIds = null;

  public IPSecVPNLocalEndpoint ipsecVpnServiceId(ResourceReference ipsecVpnServiceId) {
    this.ipsecVpnServiceId = ipsecVpnServiceId;
    return this;
  }

   /**
   * Get ipsecVpnServiceId
   * @return ipsecVpnServiceId
  **/
  @Schema(required = true, description = "")
  public ResourceReference getIpsecVpnServiceId() {
    return ipsecVpnServiceId;
  }

  public void setIpsecVpnServiceId(ResourceReference ipsecVpnServiceId) {
    this.ipsecVpnServiceId = ipsecVpnServiceId;
  }

  public IPSecVPNLocalEndpoint trustCaIds(List<String> trustCaIds) {
    this.trustCaIds = trustCaIds;
    return this;
  }

  public IPSecVPNLocalEndpoint addTrustCaIdsItem(String trustCaIdsItem) {
    if (this.trustCaIds == null) {
      this.trustCaIds = new ArrayList<String>();
    }
    this.trustCaIds.add(trustCaIdsItem);
    return this;
  }

   /**
   * Certificate authority (CA) identifier list to verify peer certificates.
   * @return trustCaIds
  **/
  @Schema(description = "Certificate authority (CA) identifier list to verify peer certificates.")
  public List<String> getTrustCaIds() {
    return trustCaIds;
  }

  public void setTrustCaIds(List<String> trustCaIds) {
    this.trustCaIds = trustCaIds;
  }

  public IPSecVPNLocalEndpoint localId(String localId) {
    this.localId = localId;
    return this;
  }

   /**
   * Local identifier.
   * @return localId
  **/
  @Schema(description = "Local identifier.")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public IPSecVPNLocalEndpoint localAddress(String localAddress) {
    this.localAddress = localAddress;
    return this;
  }

   /**
   * IPV4 Address for local endpoint.
   * @return localAddress
  **/
  @Schema(required = true, description = "IPV4 Address for local endpoint.")
  public String getLocalAddress() {
    return localAddress;
  }

  public void setLocalAddress(String localAddress) {
    this.localAddress = localAddress;
  }

  public IPSecVPNLocalEndpoint certificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

   /**
   * Site certificate identifier.
   * @return certificateId
  **/
  @Schema(description = "Site certificate identifier.")
  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public IPSecVPNLocalEndpoint trustCrlIds(List<String> trustCrlIds) {
    this.trustCrlIds = trustCrlIds;
    return this;
  }

  public IPSecVPNLocalEndpoint addTrustCrlIdsItem(String trustCrlIdsItem) {
    if (this.trustCrlIds == null) {
      this.trustCrlIds = new ArrayList<String>();
    }
    this.trustCrlIds.add(trustCrlIdsItem);
    return this;
  }

   /**
   * Certificate revocation list (CRL) identifier list of peer certificates.
   * @return trustCrlIds
  **/
  @Schema(description = "Certificate revocation list (CRL) identifier list of peer certificates.")
  public List<String> getTrustCrlIds() {
    return trustCrlIds;
  }

  public void setTrustCrlIds(List<String> trustCrlIds) {
    this.trustCrlIds = trustCrlIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPSecVPNLocalEndpoint ipSecVPNLocalEndpoint = (IPSecVPNLocalEndpoint) o;
    return Objects.equals(this.ipsecVpnServiceId, ipSecVPNLocalEndpoint.ipsecVpnServiceId) &&
        Objects.equals(this.trustCaIds, ipSecVPNLocalEndpoint.trustCaIds) &&
        Objects.equals(this.localId, ipSecVPNLocalEndpoint.localId) &&
        Objects.equals(this.localAddress, ipSecVPNLocalEndpoint.localAddress) &&
        Objects.equals(this.certificateId, ipSecVPNLocalEndpoint.certificateId) &&
        Objects.equals(this.trustCrlIds, ipSecVPNLocalEndpoint.trustCrlIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipsecVpnServiceId, trustCaIds, localId, localAddress, certificateId, trustCrlIds, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSecVPNLocalEndpoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ipsecVpnServiceId: ").append(toIndentedString(ipsecVpnServiceId)).append("\n");
    sb.append("    trustCaIds: ").append(toIndentedString(trustCaIds)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    localAddress: ").append(toIndentedString(localAddress)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    trustCrlIds: ").append(toIndentedString(trustCrlIds)).append("\n");
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
