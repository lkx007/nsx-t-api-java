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
 * Software module details
 */
@Schema(description = "Software module details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SoftwareModule {
  @SerializedName("module_name")
  private String moduleName = null;

  @SerializedName("module_version")
  private String moduleVersion = null;

  public SoftwareModule moduleName(String moduleName) {
    this.moduleName = moduleName;
    return this;
  }

   /**
   * Name of the module in the node
   * @return moduleName
  **/
  @Schema(required = true, description = "Name of the module in the node")
  public String getModuleName() {
    return moduleName;
  }

  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }

  public SoftwareModule moduleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
    return this;
  }

   /**
   * Version of the module in the node
   * @return moduleVersion
  **/
  @Schema(required = true, description = "Version of the module in the node")
  public String getModuleVersion() {
    return moduleVersion;
  }

  public void setModuleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareModule softwareModule = (SoftwareModule) o;
    return Objects.equals(this.moduleName, softwareModule.moduleName) &&
        Objects.equals(this.moduleVersion, softwareModule.moduleVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleName, moduleVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareModule {\n");
    
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    moduleVersion: ").append(toIndentedString(moduleVersion)).append("\n");
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