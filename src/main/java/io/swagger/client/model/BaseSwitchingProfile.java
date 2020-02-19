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
import java.util.ArrayList;
import java.util.List;
/**
 * BaseSwitchingProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")

public class BaseSwitchingProfile extends ManagedResource {
  @SerializedName("required_capabilities")
  private List<String> requiredCapabilities = null;

  @SerializedName("resource_type")
  private String resourceType = null;

  public BaseSwitchingProfile() {
    this.resource_type = this.getClass().getSimpleName();
  }
   /**
   * Get requiredCapabilities
   * @return requiredCapabilities
  **/
  @Schema(description = "")
  public List<String> getRequiredCapabilities() {
    return requiredCapabilities;
  }

  public BaseSwitchingProfile resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(required = true, description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseSwitchingProfile baseSwitchingProfile = (BaseSwitchingProfile) o;
    return Objects.equals(this.requiredCapabilities, baseSwitchingProfile.requiredCapabilities) &&
        Objects.equals(this.resourceType, baseSwitchingProfile.resourceType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredCapabilities, resourceType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseSwitchingProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    requiredCapabilities: ").append(toIndentedString(requiredCapabilities)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
