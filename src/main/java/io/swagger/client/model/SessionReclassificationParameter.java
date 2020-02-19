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
 * SessionReclassificationParameter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SessionReclassificationParameter {
  @SerializedName("app_profile_ids")
  private List<String> appProfileIds = null;

  public SessionReclassificationParameter appProfileIds(List<String> appProfileIds) {
    this.appProfileIds = appProfileIds;
    return this;
  }

  public SessionReclassificationParameter addAppProfileIdsItem(String appProfileIdsItem) {
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
    SessionReclassificationParameter sessionReclassificationParameter = (SessionReclassificationParameter) o;
    return Objects.equals(this.appProfileIds, sessionReclassificationParameter.appProfileIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appProfileIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionReclassificationParameter {\n");
    
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