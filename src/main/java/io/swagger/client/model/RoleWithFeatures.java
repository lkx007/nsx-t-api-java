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
import io.swagger.client.model.FeaturePermission;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Role
 */
@Schema(description = "Role")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RoleWithFeatures {
  @SerializedName("role")
  private String role = null;

  @SerializedName("features")
  private List<FeaturePermission> features = new ArrayList<FeaturePermission>();

   /**
   * Role name
   * @return role
  **/
  @Schema(description = "Role name")
  public String getRole() {
    return role;
  }

  public RoleWithFeatures features(List<FeaturePermission> features) {
    this.features = features;
    return this;
  }

  public RoleWithFeatures addFeaturesItem(FeaturePermission featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Features
   * @return features
  **/
  @Schema(required = true, description = "Features")
  public List<FeaturePermission> getFeatures() {
    return features;
  }

  public void setFeatures(List<FeaturePermission> features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleWithFeatures roleWithFeatures = (RoleWithFeatures) o;
    return Objects.equals(this.role, roleWithFeatures.role) &&
        Objects.equals(this.features, roleWithFeatures.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleWithFeatures {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
