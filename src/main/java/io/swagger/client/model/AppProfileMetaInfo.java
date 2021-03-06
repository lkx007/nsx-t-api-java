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
 * Contains the metadata of an App Profile 
 */
@Schema(description = "Contains the metadata of an App Profile ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class AppProfileMetaInfo extends ManagedResource {
  @SerializedName("app_profile_category")
  private String appProfileCategory = null;

  @SerializedName("app_profile_id")
  private String appProfileId = null;

  @SerializedName("app_profile_name")
  private String appProfileName = null;

  public AppProfileMetaInfo appProfileCategory(String appProfileCategory) {
    this.appProfileCategory = appProfileCategory;
    return this;
  }

   /**
   * Categories of the app profile
   * @return appProfileCategory
  **/
  @Schema(description = "Categories of the app profile")
  public String getAppProfileCategory() {
    return appProfileCategory;
  }

  public void setAppProfileCategory(String appProfileCategory) {
    this.appProfileCategory = appProfileCategory;
  }

  public AppProfileMetaInfo appProfileId(String appProfileId) {
    this.appProfileId = appProfileId;
    return this;
  }

   /**
   * ID of the App Profile
   * @return appProfileId
  **/
  @Schema(description = "ID of the App Profile")
  public String getAppProfileId() {
    return appProfileId;
  }

  public void setAppProfileId(String appProfileId) {
    this.appProfileId = appProfileId;
  }

  public AppProfileMetaInfo appProfileName(String appProfileName) {
    this.appProfileName = appProfileName;
    return this;
  }

   /**
   * Name of the App Profile
   * @return appProfileName
  **/
  @Schema(description = "Name of the App Profile")
  public String getAppProfileName() {
    return appProfileName;
  }

  public void setAppProfileName(String appProfileName) {
    this.appProfileName = appProfileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppProfileMetaInfo appProfileMetaInfo = (AppProfileMetaInfo) o;
    return Objects.equals(this.appProfileCategory, appProfileMetaInfo.appProfileCategory) &&
        Objects.equals(this.appProfileId, appProfileMetaInfo.appProfileId) &&
        Objects.equals(this.appProfileName, appProfileMetaInfo.appProfileName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appProfileCategory, appProfileId, appProfileName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppProfileMetaInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    appProfileCategory: ").append(toIndentedString(appProfileCategory)).append("\n");
    sb.append("    appProfileId: ").append(toIndentedString(appProfileId)).append("\n");
    sb.append("    appProfileName: ").append(toIndentedString(appProfileName)).append("\n");
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
