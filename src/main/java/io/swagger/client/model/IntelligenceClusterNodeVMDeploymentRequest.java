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
import io.swagger.client.model.IntelligenceClusterNodeVMDeploymentConfig;
import io.swagger.client.model.NodeUserSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Contains the deployment information for a NSX-Intelligence node VM. 
 */
@Schema(description = "Contains the deployment information for a NSX-Intelligence node VM. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IntelligenceClusterNodeVMDeploymentRequest {
  @SerializedName("deployment_config")
  private IntelligenceClusterNodeVMDeploymentConfig deploymentConfig = null;

  @SerializedName("vm_id")
  private String vmId = null;

  @SerializedName("user_settings")
  private NodeUserSettings userSettings = null;

  /**
   * Specifies the desired \&quot;size\&quot; of the VM 
   */
  @JsonAdapter(FormFactorEnum.Adapter.class)
  public enum FormFactorEnum {
    SMALL("SMALL"),
    LARGE("LARGE");

    private String value;

    FormFactorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FormFactorEnum fromValue(String text) {
      for (FormFactorEnum b : FormFactorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FormFactorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormFactorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormFactorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FormFactorEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("form_factor")
  private FormFactorEnum formFactor = FormFactorEnum.SMALL;

  public IntelligenceClusterNodeVMDeploymentRequest deploymentConfig(IntelligenceClusterNodeVMDeploymentConfig deploymentConfig) {
    this.deploymentConfig = deploymentConfig;
    return this;
  }

   /**
   * Get deploymentConfig
   * @return deploymentConfig
  **/
  @Schema(required = true, description = "")
  public IntelligenceClusterNodeVMDeploymentConfig getDeploymentConfig() {
    return deploymentConfig;
  }

  public void setDeploymentConfig(IntelligenceClusterNodeVMDeploymentConfig deploymentConfig) {
    this.deploymentConfig = deploymentConfig;
  }

   /**
   * ID of the VM maintained internally. Note: This is automatically generated and cannot be modified. 
   * @return vmId
  **/
  @Schema(description = "ID of the VM maintained internally. Note: This is automatically generated and cannot be modified. ")
  public String getVmId() {
    return vmId;
  }

  public IntelligenceClusterNodeVMDeploymentRequest userSettings(NodeUserSettings userSettings) {
    this.userSettings = userSettings;
    return this;
  }

   /**
   * Get userSettings
   * @return userSettings
  **/
  @Schema(description = "")
  public NodeUserSettings getUserSettings() {
    return userSettings;
  }

  public void setUserSettings(NodeUserSettings userSettings) {
    this.userSettings = userSettings;
  }

  public IntelligenceClusterNodeVMDeploymentRequest formFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
    return this;
  }

   /**
   * Specifies the desired \&quot;size\&quot; of the VM 
   * @return formFactor
  **/
  @Schema(description = "Specifies the desired \"size\" of the VM ")
  public FormFactorEnum getFormFactor() {
    return formFactor;
  }

  public void setFormFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntelligenceClusterNodeVMDeploymentRequest intelligenceClusterNodeVMDeploymentRequest = (IntelligenceClusterNodeVMDeploymentRequest) o;
    return Objects.equals(this.deploymentConfig, intelligenceClusterNodeVMDeploymentRequest.deploymentConfig) &&
        Objects.equals(this.vmId, intelligenceClusterNodeVMDeploymentRequest.vmId) &&
        Objects.equals(this.userSettings, intelligenceClusterNodeVMDeploymentRequest.userSettings) &&
        Objects.equals(this.formFactor, intelligenceClusterNodeVMDeploymentRequest.formFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentConfig, vmId, userSettings, formFactor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntelligenceClusterNodeVMDeploymentRequest {\n");
    
    sb.append("    deploymentConfig: ").append(toIndentedString(deploymentConfig)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
    sb.append("    userSettings: ").append(toIndentedString(userSettings)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
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
