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
import io.swagger.client.model.ResourceReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Remote MAC addresses for logical switch.
 */
@Schema(description = "Remote MAC addresses for logical switch.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class L2VPNSessionRemoteMacsForLS {
  @SerializedName("remote_mac_addresses")
  private List<String> remoteMacAddresses = null;

  @SerializedName("logical_switch")
  private ResourceReference logicalSwitch = null;

   /**
   * Mac addresses.
   * @return remoteMacAddresses
  **/
  @Schema(description = "Mac addresses.")
  public List<String> getRemoteMacAddresses() {
    return remoteMacAddresses;
  }

  public L2VPNSessionRemoteMacsForLS logicalSwitch(ResourceReference logicalSwitch) {
    this.logicalSwitch = logicalSwitch;
    return this;
  }

   /**
   * Get logicalSwitch
   * @return logicalSwitch
  **/
  @Schema(description = "")
  public ResourceReference getLogicalSwitch() {
    return logicalSwitch;
  }

  public void setLogicalSwitch(ResourceReference logicalSwitch) {
    this.logicalSwitch = logicalSwitch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L2VPNSessionRemoteMacsForLS l2VPNSessionRemoteMacsForLS = (L2VPNSessionRemoteMacsForLS) o;
    return Objects.equals(this.remoteMacAddresses, l2VPNSessionRemoteMacsForLS.remoteMacAddresses) &&
        Objects.equals(this.logicalSwitch, l2VPNSessionRemoteMacsForLS.logicalSwitch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteMacAddresses, logicalSwitch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L2VPNSessionRemoteMacsForLS {\n");
    
    sb.append("    remoteMacAddresses: ").append(toIndentedString(remoteMacAddresses)).append("\n");
    sb.append("    logicalSwitch: ").append(toIndentedString(logicalSwitch)).append("\n");
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
