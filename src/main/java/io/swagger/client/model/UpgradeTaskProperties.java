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
 * Task properties
 */
@Schema(description = "Task properties")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class UpgradeTaskProperties {
  @SerializedName("bundle_name")
  private String bundleName = null;

  @SerializedName("step")
  private String step = null;

  @SerializedName("parameters")
  private Object parameters = null;

  public UpgradeTaskProperties bundleName(String bundleName) {
    this.bundleName = bundleName;
    return this;
  }

   /**
   * Name of Bundle
   * @return bundleName
  **/
  @Schema(required = true, description = "Name of Bundle")
  public String getBundleName() {
    return bundleName;
  }

  public void setBundleName(String bundleName) {
    this.bundleName = bundleName;
  }

  public UpgradeTaskProperties step(String step) {
    this.step = step;
    return this;
  }

   /**
   * Step name
   * @return step
  **/
  @Schema(description = "Step name")
  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }

   /**
   * Bundle arguments
   * @return parameters
  **/
  @Schema(description = "Bundle arguments")
  public Object getParameters() {
    return parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeTaskProperties upgradeTaskProperties = (UpgradeTaskProperties) o;
    return Objects.equals(this.bundleName, upgradeTaskProperties.bundleName) &&
        Objects.equals(this.step, upgradeTaskProperties.step) &&
        Objects.equals(this.parameters, upgradeTaskProperties.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleName, step, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeTaskProperties {\n");
    
    sb.append("    bundleName: ").append(toIndentedString(bundleName)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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