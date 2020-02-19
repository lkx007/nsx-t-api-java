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
 * SwitchingProfileStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SwitchingProfileStatus {
  @SerializedName("num_logical_ports")
  private Long numLogicalPorts = null;

  @SerializedName("switching_profile_id")
  private String switchingProfileId = null;

  @SerializedName("num_logical_switches")
  private Long numLogicalSwitches = null;

   /**
   * Number of logical ports using a switching profile
   * @return numLogicalPorts
  **/
  @Schema(description = "Number of logical ports using a switching profile")
  public Long getNumLogicalPorts() {
    return numLogicalPorts;
  }

  public SwitchingProfileStatus switchingProfileId(String switchingProfileId) {
    this.switchingProfileId = switchingProfileId;
    return this;
  }

   /**
   * Identifier for the switching profile
   * @return switchingProfileId
  **/
  @Schema(description = "Identifier for the switching profile")
  public String getSwitchingProfileId() {
    return switchingProfileId;
  }

  public void setSwitchingProfileId(String switchingProfileId) {
    this.switchingProfileId = switchingProfileId;
  }

   /**
   * Number of logical switches using a switching profile
   * @return numLogicalSwitches
  **/
  @Schema(description = "Number of logical switches using a switching profile")
  public Long getNumLogicalSwitches() {
    return numLogicalSwitches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchingProfileStatus switchingProfileStatus = (SwitchingProfileStatus) o;
    return Objects.equals(this.numLogicalPorts, switchingProfileStatus.numLogicalPorts) &&
        Objects.equals(this.switchingProfileId, switchingProfileStatus.switchingProfileId) &&
        Objects.equals(this.numLogicalSwitches, switchingProfileStatus.numLogicalSwitches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numLogicalPorts, switchingProfileId, numLogicalSwitches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchingProfileStatus {\n");
    
    sb.append("    numLogicalPorts: ").append(toIndentedString(numLogicalPorts)).append("\n");
    sb.append("    switchingProfileId: ").append(toIndentedString(switchingProfileId)).append("\n");
    sb.append("    numLogicalSwitches: ").append(toIndentedString(numLogicalSwitches)).append("\n");
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
