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
import io.swagger.client.model.IPSecVPNSessionSummary;
import io.swagger.client.model.IPSecVPNSessionTrafficSummary;
import io.swagger.client.model.IPSecVPNTrafficCounters;
import io.swagger.client.model.IPsecVPNIKESessionSummary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * Summarized view of all IPSec VPN sessions for a specified service.
 */
@Schema(description = "Summarized view of all IPSec VPN sessions for a specified service.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPSecVPNIKEServiceSummary extends IPSecVPNSessionSummary {
  @SerializedName("ipsec_vpn_service_id")
  private String ipsecVpnServiceId = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("logical_router_id")
  private String logicalRouterId = null;

   /**
   * UUID for a vpn service.
   * @return ipsecVpnServiceId
  **/
  @Schema(description = "UUID for a vpn service.")
  public String getIpsecVpnServiceId() {
    return ipsecVpnServiceId;
  }

   /**
   * VPN service display name.
   * @return displayName
  **/
  @Schema(description = "VPN service display name.")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Logical router identifier associated with vpn service.
   * @return logicalRouterId
  **/
  @Schema(description = "Logical router identifier associated with vpn service.")
  public String getLogicalRouterId() {
    return logicalRouterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPSecVPNIKEServiceSummary ipSecVPNIKEServiceSummary = (IPSecVPNIKEServiceSummary) o;
    return Objects.equals(this.ipsecVpnServiceId, ipSecVPNIKEServiceSummary.ipsecVpnServiceId) &&
        Objects.equals(this.displayName, ipSecVPNIKEServiceSummary.displayName) &&
        Objects.equals(this.logicalRouterId, ipSecVPNIKEServiceSummary.logicalRouterId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipsecVpnServiceId, displayName, logicalRouterId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSecVPNIKEServiceSummary {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ipsecVpnServiceId: ").append(toIndentedString(ipsecVpnServiceId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    logicalRouterId: ").append(toIndentedString(logicalRouterId)).append("\n");
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