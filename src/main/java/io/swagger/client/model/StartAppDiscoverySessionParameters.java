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
 * Parameters to start an application discovery session. It can have NSGroup Ids as well as the App Profile Ids. 
 */
@Schema(description = "Parameters to start an application discovery session. It can have NSGroup Ids as well as the App Profile Ids. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class StartAppDiscoverySessionParameters {
  @SerializedName("ns_group_ids")
  private List<String> nsGroupIds = new ArrayList<String>();

  @SerializedName("app_profile_ids")
  private List<String> appProfileIds = null;

  public StartAppDiscoverySessionParameters nsGroupIds(List<String> nsGroupIds) {
    this.nsGroupIds = nsGroupIds;
    return this;
  }

  public StartAppDiscoverySessionParameters addNsGroupIdsItem(String nsGroupIdsItem) {
    this.nsGroupIds.add(nsGroupIdsItem);
    return this;
  }

   /**
   * NSGroup Ids
   * @return nsGroupIds
  **/
  @Schema(required = true, description = "NSGroup Ids")
  public List<String> getNsGroupIds() {
    return nsGroupIds;
  }

  public void setNsGroupIds(List<String> nsGroupIds) {
    this.nsGroupIds = nsGroupIds;
  }

  public StartAppDiscoverySessionParameters appProfileIds(List<String> appProfileIds) {
    this.appProfileIds = appProfileIds;
    return this;
  }

  public StartAppDiscoverySessionParameters addAppProfileIdsItem(String appProfileIdsItem) {
    if (this.appProfileIds == null) {
      this.appProfileIds = new ArrayList<String>();
    }
    this.appProfileIds.add(appProfileIdsItem);
    return this;
  }

   /**
   * App Profile Ids
   * @return appProfileIds
  **/
  @Schema(description = "App Profile Ids")
  public List<String> getAppProfileIds() {
    return appProfileIds;
  }

  public void setAppProfileIds(List<String> appProfileIds) {
    this.appProfileIds = appProfileIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartAppDiscoverySessionParameters startAppDiscoverySessionParameters = (StartAppDiscoverySessionParameters) o;
    return Objects.equals(this.nsGroupIds, startAppDiscoverySessionParameters.nsGroupIds) &&
        Objects.equals(this.appProfileIds, startAppDiscoverySessionParameters.appProfileIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsGroupIds, appProfileIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartAppDiscoverySessionParameters {\n");
    
    sb.append("    nsGroupIds: ").append(toIndentedString(nsGroupIds)).append("\n");
    sb.append("    appProfileIds: ").append(toIndentedString(appProfileIds)).append("\n");
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
