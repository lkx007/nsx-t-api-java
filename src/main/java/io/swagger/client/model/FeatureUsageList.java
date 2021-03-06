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
import io.swagger.client.model.FeatureUsage;
import io.swagger.client.model.Resource;
import io.swagger.client.model.ResourceLink;
import io.swagger.client.model.SelfResourceLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * list of feature usage items
 */
@Schema(description = "list of feature usage items")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class FeatureUsageList extends Resource {
  @SerializedName("feature_usage_info")
  private List<FeatureUsage> featureUsageInfo = null;

   /**
   * Feature Usage List
   * @return featureUsageInfo
  **/
  @Schema(description = "Feature Usage List")
  public List<FeatureUsage> getFeatureUsageInfo() {
    return featureUsageInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureUsageList featureUsageList = (FeatureUsageList) o;
    return Objects.equals(this.featureUsageInfo, featureUsageList.featureUsageInfo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureUsageInfo, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureUsageList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    featureUsageInfo: ").append(toIndentedString(featureUsageInfo)).append("\n");
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
