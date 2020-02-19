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
 * DhcpRelayService
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DhcpRelayService extends ManagedResource {
  @SerializedName("dhcp_relay_profile_id")
  private String dhcpRelayProfileId = null;

  public DhcpRelayService dhcpRelayProfileId(String dhcpRelayProfileId) {
    this.dhcpRelayProfileId = dhcpRelayProfileId;
    return this;
  }

   /**
   * dhcp relay profile referenced by the dhcp relay service
   * @return dhcpRelayProfileId
  **/
  @Schema(required = true, description = "dhcp relay profile referenced by the dhcp relay service")
  public String getDhcpRelayProfileId() {
    return dhcpRelayProfileId;
  }

  public void setDhcpRelayProfileId(String dhcpRelayProfileId) {
    this.dhcpRelayProfileId = dhcpRelayProfileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DhcpRelayService dhcpRelayService = (DhcpRelayService) o;
    return Objects.equals(this.dhcpRelayProfileId, dhcpRelayService.dhcpRelayProfileId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dhcpRelayProfileId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DhcpRelayService {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dhcpRelayProfileId: ").append(toIndentedString(dhcpRelayProfileId)).append("\n");
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
