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
import io.swagger.client.model.HostSwitchSpec;
import io.swagger.client.model.PreconfiguredHostSwitch;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Preconfigured host switch specification is used for manually configured transport node. It is user&#x27;s responsibility to ensure correct configuration is provided to NSX. This type is only valid for supported KVM fabric nodes.
 */
@Schema(description = "Preconfigured host switch specification is used for manually configured transport node. It is user's responsibility to ensure correct configuration is provided to NSX. This type is only valid for supported KVM fabric nodes.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PreconfiguredHostSwitchSpec extends HostSwitchSpec {
  @SerializedName("host_switches")
  private List<PreconfiguredHostSwitch> hostSwitches = new ArrayList<PreconfiguredHostSwitch>();

  public PreconfiguredHostSwitchSpec hostSwitches(List<PreconfiguredHostSwitch> hostSwitches) {
    this.hostSwitches = hostSwitches;
    return this;
  }

  public PreconfiguredHostSwitchSpec addHostSwitchesItem(PreconfiguredHostSwitch hostSwitchesItem) {
    this.hostSwitches.add(hostSwitchesItem);
    return this;
  }

   /**
   * Preconfigured Transport Node host switches
   * @return hostSwitches
  **/
  @Schema(required = true, description = "Preconfigured Transport Node host switches")
  public List<PreconfiguredHostSwitch> getHostSwitches() {
    return hostSwitches;
  }

  public void setHostSwitches(List<PreconfiguredHostSwitch> hostSwitches) {
    this.hostSwitches = hostSwitches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreconfiguredHostSwitchSpec preconfiguredHostSwitchSpec = (PreconfiguredHostSwitchSpec) o;
    return Objects.equals(this.hostSwitches, preconfiguredHostSwitchSpec.hostSwitches) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostSwitches, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreconfiguredHostSwitchSpec {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hostSwitches: ").append(toIndentedString(hostSwitches)).append("\n");
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
