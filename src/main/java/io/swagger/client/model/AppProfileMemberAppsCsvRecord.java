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
import io.swagger.client.model.CsvRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AppProfileMemberAppsCsvRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class AppProfileMemberAppsCsvRecord extends CsvRecord {
  @SerializedName("app_profile_category")
  private String appProfileCategory = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("member_apps")
  private String memberApps = null;

  @SerializedName("app_profile_criteria")
  private String appProfileCriteria = null;

   /**
   * Category of the app profile, value could be any string that describes the profile
   * @return appProfileCategory
  **/
  @Schema(description = "Category of the app profile, value could be any string that describes the profile")
  public String getAppProfileCategory() {
    return appProfileCategory;
  }

   /**
   * Name of the app profile
   * @return displayName
  **/
  @Schema(description = "Name of the app profile")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Description of the app profile
   * @return description
  **/
  @Schema(description = "Description of the app profile")
  public String getDescription() {
    return description;
  }

   /**
   * Applications that are member of this app profile
   * @return memberApps
  **/
  @Schema(description = "Applications that are member of this app profile")
  public String getMemberApps() {
    return memberApps;
  }

   /**
   * Criteria of the app profile, value could be any string or \&quot;*\&quot; (match any string)
   * @return appProfileCriteria
  **/
  @Schema(description = "Criteria of the app profile, value could be any string or \"*\" (match any string)")
  public String getAppProfileCriteria() {
    return appProfileCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppProfileMemberAppsCsvRecord appProfileMemberAppsCsvRecord = (AppProfileMemberAppsCsvRecord) o;
    return Objects.equals(this.appProfileCategory, appProfileMemberAppsCsvRecord.appProfileCategory) &&
        Objects.equals(this.displayName, appProfileMemberAppsCsvRecord.displayName) &&
        Objects.equals(this.description, appProfileMemberAppsCsvRecord.description) &&
        Objects.equals(this.memberApps, appProfileMemberAppsCsvRecord.memberApps) &&
        Objects.equals(this.appProfileCriteria, appProfileMemberAppsCsvRecord.appProfileCriteria) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appProfileCategory, displayName, description, memberApps, appProfileCriteria, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppProfileMemberAppsCsvRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    appProfileCategory: ").append(toIndentedString(appProfileCategory)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    memberApps: ").append(toIndentedString(memberApps)).append("\n");
    sb.append("    appProfileCriteria: ").append(toIndentedString(appProfileCriteria)).append("\n");
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
