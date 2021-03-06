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
import io.swagger.client.model.DeploymentTemplate;
import io.swagger.client.model.InstanceDeploymentConfig;
import io.swagger.client.model.ResourceReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The deployment of a registered service. Service instance is instantiation of service. It is the most used type of instance. It is a default instance to be used when NSX handles lifecycle of appliance. Deployment and appliance related all the information is necessary.
 */
@Schema(description = "The deployment of a registered service. Service instance is instantiation of service. It is the most used type of instance. It is a default instance to be used when NSX handles lifecycle of appliance. Deployment and appliance related all the information is necessary.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ServiceInstance extends BaseServiceInstance {
  @SerializedName("deployment_spec_name")
  private String deploymentSpecName = null;

  @SerializedName("instance_deployment_template")
  private DeploymentTemplate instanceDeploymentTemplate = null;

  /**
   * Implementation to be used by this service instance for deploying the Service-VM.
   */
  @JsonAdapter(ImplementationTypeEnum.Adapter.class)
  public enum ImplementationTypeEnum {
    NORTH_SOUTH("NORTH_SOUTH"),
    EAST_WEST("EAST_WEST");

    private String value;

    ImplementationTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ImplementationTypeEnum fromValue(String text) {
      for (ImplementationTypeEnum b : ImplementationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ImplementationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImplementationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImplementationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImplementationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("implementation_type")
  private ImplementationTypeEnum implementationType = null;

  /**
   * Attachment point to be used by this service instance for deploying the Service-VM.
   */
  @JsonAdapter(AttachmentPointEnum.Adapter.class)
  public enum AttachmentPointEnum {
    TIER0_LR("TIER0_LR"),
    TIER1_LR("TIER1_LR"),
    SERVICE_PLANE("SERVICE_PLANE"),
    HOST("HOST");

    private String value;

    AttachmentPointEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AttachmentPointEnum fromValue(String text) {
      for (AttachmentPointEnum b : AttachmentPointEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AttachmentPointEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttachmentPointEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttachmentPointEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AttachmentPointEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("attachment_point")
  private AttachmentPointEnum attachmentPoint = null;

  @SerializedName("instance_deployment_config")
  private InstanceDeploymentConfig instanceDeploymentConfig = null;

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

  @SerializedName("deployed_to")
  private List<ResourceReference> deployedTo = new ArrayList<ResourceReference>();

  @SerializedName("service_deployment_id")
  private String serviceDeploymentId = null;

  public ServiceInstance deploymentSpecName(String deploymentSpecName) {
    this.deploymentSpecName = deploymentSpecName;
    return this;
  }

   /**
   * Name of the deployment spec to be used by this service instance.
   * @return deploymentSpecName
  **/
  @Schema(required = true, description = "Name of the deployment spec to be used by this service instance.")
  public String getDeploymentSpecName() {
    return deploymentSpecName;
  }

  public void setDeploymentSpecName(String deploymentSpecName) {
    this.deploymentSpecName = deploymentSpecName;
  }

  public ServiceInstance instanceDeploymentTemplate(DeploymentTemplate instanceDeploymentTemplate) {
    this.instanceDeploymentTemplate = instanceDeploymentTemplate;
    return this;
  }

   /**
   * Get instanceDeploymentTemplate
   * @return instanceDeploymentTemplate
  **/
  @Schema(required = true, description = "")
  public DeploymentTemplate getInstanceDeploymentTemplate() {
    return instanceDeploymentTemplate;
  }

  public void setInstanceDeploymentTemplate(DeploymentTemplate instanceDeploymentTemplate) {
    this.instanceDeploymentTemplate = instanceDeploymentTemplate;
  }

  public ServiceInstance implementationType(ImplementationTypeEnum implementationType) {
    this.implementationType = implementationType;
    return this;
  }

   /**
   * Implementation to be used by this service instance for deploying the Service-VM.
   * @return implementationType
  **/
  @Schema(required = true, description = "Implementation to be used by this service instance for deploying the Service-VM.")
  public ImplementationTypeEnum getImplementationType() {
    return implementationType;
  }

  public void setImplementationType(ImplementationTypeEnum implementationType) {
    this.implementationType = implementationType;
  }

  public ServiceInstance attachmentPoint(AttachmentPointEnum attachmentPoint) {
    this.attachmentPoint = attachmentPoint;
    return this;
  }

   /**
   * Attachment point to be used by this service instance for deploying the Service-VM.
   * @return attachmentPoint
  **/
  @Schema(required = true, description = "Attachment point to be used by this service instance for deploying the Service-VM.")
  public AttachmentPointEnum getAttachmentPoint() {
    return attachmentPoint;
  }

  public void setAttachmentPoint(AttachmentPointEnum attachmentPoint) {
    this.attachmentPoint = attachmentPoint;
  }

  public ServiceInstance instanceDeploymentConfig(InstanceDeploymentConfig instanceDeploymentConfig) {
    this.instanceDeploymentConfig = instanceDeploymentConfig;
    return this;
  }

   /**
   * Get instanceDeploymentConfig
   * @return instanceDeploymentConfig
  **/
  @Schema(description = "")
  public InstanceDeploymentConfig getInstanceDeploymentConfig() {
    return instanceDeploymentConfig;
  }

  public void setInstanceDeploymentConfig(InstanceDeploymentConfig instanceDeploymentConfig) {
    this.instanceDeploymentConfig = instanceDeploymentConfig;
  }

  public ServiceInstance deploymentMode(DeploymentModeEnum deploymentMode) {
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

  public ServiceInstance deployedTo(List<ResourceReference> deployedTo) {
    this.deployedTo = deployedTo;
    return this;
  }

  public ServiceInstance addDeployedToItem(ResourceReference deployedToItem) {
    this.deployedTo.add(deployedToItem);
    return this;
  }

   /**
   * List of resource references where service instance be deployed. Ex. Tier 0 Logical Router in case of N-S ServiceInsertion.
   * @return deployedTo
  **/
  @Schema(required = true, description = "List of resource references where service instance be deployed. Ex. Tier 0 Logical Router in case of N-S ServiceInsertion.")
  public List<ResourceReference> getDeployedTo() {
    return deployedTo;
  }

  public void setDeployedTo(List<ResourceReference> deployedTo) {
    this.deployedTo = deployedTo;
  }

   /**
   * Id of the Service Deployment using which the instances were deployed. Its available only for instances that were deployed using service deployment API.
   * @return serviceDeploymentId
  **/
  @Schema(description = "Id of the Service Deployment using which the instances were deployed. Its available only for instances that were deployed using service deployment API.")
  public String getServiceDeploymentId() {
    return serviceDeploymentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstance serviceInstance = (ServiceInstance) o;
    return Objects.equals(this.deploymentSpecName, serviceInstance.deploymentSpecName) &&
        Objects.equals(this.instanceDeploymentTemplate, serviceInstance.instanceDeploymentTemplate) &&
        Objects.equals(this.implementationType, serviceInstance.implementationType) &&
        Objects.equals(this.attachmentPoint, serviceInstance.attachmentPoint) &&
        Objects.equals(this.instanceDeploymentConfig, serviceInstance.instanceDeploymentConfig) &&
        Objects.equals(this.deploymentMode, serviceInstance.deploymentMode) &&
        Objects.equals(this.deployedTo, serviceInstance.deployedTo) &&
        Objects.equals(this.serviceDeploymentId, serviceInstance.serviceDeploymentId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentSpecName, instanceDeploymentTemplate, implementationType, attachmentPoint, instanceDeploymentConfig, deploymentMode, deployedTo, serviceDeploymentId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstance {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    deploymentSpecName: ").append(toIndentedString(deploymentSpecName)).append("\n");
    sb.append("    instanceDeploymentTemplate: ").append(toIndentedString(instanceDeploymentTemplate)).append("\n");
    sb.append("    implementationType: ").append(toIndentedString(implementationType)).append("\n");
    sb.append("    attachmentPoint: ").append(toIndentedString(attachmentPoint)).append("\n");
    sb.append("    instanceDeploymentConfig: ").append(toIndentedString(instanceDeploymentConfig)).append("\n");
    sb.append("    deploymentMode: ").append(toIndentedString(deploymentMode)).append("\n");
    sb.append("    deployedTo: ").append(toIndentedString(deployedTo)).append("\n");
    sb.append("    serviceDeploymentId: ").append(toIndentedString(serviceDeploymentId)).append("\n");
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
