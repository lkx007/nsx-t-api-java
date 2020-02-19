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
import io.swagger.client.model.BaseServiceInstance;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ByodServiceInstance is a custom instance to be used when NSX is not handling the lifecycles of appliance/s. User will manage their own appliance (BYOD) to connect with NSX.
 */
@Schema(description = "ByodServiceInstance is a custom instance to be used when NSX is not handling the lifecycles of appliance/s. User will manage their own appliance (BYOD) to connect with NSX.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ByodServiceInstance extends BaseServiceInstance {
  /**
   * Deployment mode specifies where the partner appliance will be deployed in HA or non-HA i.e standalone mode.
   */
  @JsonAdapter(DeploymentModeEnum.Adapter.class)
  public enum DeploymentModeEnum {
    STAND_ALONE("STAND_ALONE"),
    ACTIVE_STANDBY("ACTIVE_STANDBY");

    private String value;

    DeploymentModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DeploymentModeEnum fromValue(String text) {
      for (DeploymentModeEnum b : DeploymentModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DeploymentModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeploymentModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeploymentModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeploymentModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("deployment_mode")
  private DeploymentModeEnum deploymentMode = DeploymentModeEnum.ACTIVE_STANDBY;

  public ByodServiceInstance deploymentMode(DeploymentModeEnum deploymentMode) {
    this.deploymentMode = deploymentMode;
    return this;
  }

   /**
   * Deployment mode specifies where the partner appliance will be deployed in HA or non-HA i.e standalone mode.
   * @return deploymentMode
  **/
  @Schema(required = true, description = "Deployment mode specifies where the partner appliance will be deployed in HA or non-HA i.e standalone mode.")
  public DeploymentModeEnum getDeploymentMode() {
    return deploymentMode;
  }

  public void setDeploymentMode(DeploymentModeEnum deploymentMode) {
    this.deploymentMode = deploymentMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ByodServiceInstance byodServiceInstance = (ByodServiceInstance) o;
    return Objects.equals(this.deploymentMode, byodServiceInstance.deploymentMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ByodServiceInstance {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    deploymentMode: ").append(toIndentedString(deploymentMode)).append("\n");
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