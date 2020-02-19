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
import io.swagger.client.model.BaseSwitchingProfile;
import io.swagger.client.model.MacLearningSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * MacManagementSwitchingProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class MacManagementSwitchingProfile extends BaseSwitchingProfile {
  @SerializedName("mac_learning")
  private MacLearningSpec macLearning = null;

  @SerializedName("mac_change_allowed")
  private Boolean macChangeAllowed = false;

  public MacManagementSwitchingProfile macLearning(MacLearningSpec macLearning) {
    this.macLearning = macLearning;
    return this;
  }

   /**
   * Get macLearning
   * @return macLearning
  **/
  @Schema(description = "")
  public MacLearningSpec getMacLearning() {
    return macLearning;
  }

  public void setMacLearning(MacLearningSpec macLearning) {
    this.macLearning = macLearning;
  }

  public MacManagementSwitchingProfile macChangeAllowed(Boolean macChangeAllowed) {
    this.macChangeAllowed = macChangeAllowed;
    return this;
  }

   /**
   * Allowing source MAC address change
   * @return macChangeAllowed
  **/
  @Schema(description = "Allowing source MAC address change")
  public Boolean isMacChangeAllowed() {
    return macChangeAllowed;
  }

  public void setMacChangeAllowed(Boolean macChangeAllowed) {
    this.macChangeAllowed = macChangeAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MacManagementSwitchingProfile macManagementSwitchingProfile = (MacManagementSwitchingProfile) o;
    return Objects.equals(this.macLearning, macManagementSwitchingProfile.macLearning) &&
        Objects.equals(this.macChangeAllowed, macManagementSwitchingProfile.macChangeAllowed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macLearning, macChangeAllowed, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MacManagementSwitchingProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    macLearning: ").append(toIndentedString(macLearning)).append("\n");
    sb.append("    macChangeAllowed: ").append(toIndentedString(macChangeAllowed)).append("\n");
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
