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
import java.util.ArrayList;
import java.util.List;
/**
 * BPDU filter configuration
 */
@Schema(description = "BPDU filter configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class BpduFilter {
  @SerializedName("white_list")
  private List<String> whiteList = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  public BpduFilter whiteList(List<String> whiteList) {
    this.whiteList = whiteList;
    return this;
  }

  public BpduFilter addWhiteListItem(String whiteListItem) {
    if (this.whiteList == null) {
      this.whiteList = new ArrayList<String>();
    }
    this.whiteList.add(whiteListItem);
    return this;
  }

   /**
   * Pre-defined list of allowed MAC addresses to be excluded from BPDU filtering
   * @return whiteList
  **/
  @Schema(description = "Pre-defined list of allowed MAC addresses to be excluded from BPDU filtering")
  public List<String> getWhiteList() {
    return whiteList;
  }

  public void setWhiteList(List<String> whiteList) {
    this.whiteList = whiteList;
  }

  public BpduFilter enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether BPDU filter is enabled
   * @return enabled
  **/
  @Schema(required = true, description = "Indicates whether BPDU filter is enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BpduFilter bpduFilter = (BpduFilter) o;
    return Objects.equals(this.whiteList, bpduFilter.whiteList) &&
        Objects.equals(this.enabled, bpduFilter.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whiteList, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BpduFilter {\n");
    
    sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
