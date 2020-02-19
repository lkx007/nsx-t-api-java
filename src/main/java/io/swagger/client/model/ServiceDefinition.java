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
import io.swagger.client.model.ServiceCapability;
import io.swagger.client.model.ServiceDeploymentSpec;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Registering a Service is the first step in the ServiceInsertion mechanism. A ServiceDefinition is used to create a service.
 */
@Schema(description = "Registering a Service is the first step in the ServiceInsertion mechanism. A ServiceDefinition is used to create a service.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ServiceDefinition extends ManagedResource {
  @SerializedName("service_deployment_spec")
  private ServiceDeploymentSpec serviceDeploymentSpec = null;

  @SerializedName("service_capability")
  private ServiceCapability serviceCapability = null;

  /**
   * Gets or Sets functionalities
   */
  @JsonAdapter(FunctionalitiesEnum.Adapter.class)
  public enum FunctionalitiesEnum {
    NG_FW("NG_FW"),
    IDS_IPS("IDS_IPS"),
    NET_MON("NET_MON"),
    HCX("HCX"),
    BYOD("BYOD"),
    EPP("EPP");

    private String value;

    FunctionalitiesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FunctionalitiesEnum fromValue(String text) {
      for (FunctionalitiesEnum b : FunctionalitiesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FunctionalitiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FunctionalitiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FunctionalitiesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FunctionalitiesEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("functionalities")
  private List<FunctionalitiesEnum> functionalities = new ArrayList<FunctionalitiesEnum>();

  /**
   * Gets or Sets attachmentPoint
   */
  @JsonAdapter(AttachmentPointEnum.Adapter.class)
  public enum AttachmentPointEnum {
    TIER0_LR("TIER0_LR"),
    TIER1_LR("TIER1_LR"),
    SERVICE_PLANE("SERVICE_PLANE");

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
  private List<AttachmentPointEnum> attachmentPoint = null;

  @SerializedName("service_manager_id")
  private String serviceManagerId = null;

  @SerializedName("vendor_id")
  private String vendorId = null;

  /**
   * Failure policy for the service tells datapath, the action to take i.e to Allow or Block traffic during failure scenarios. For north-south ServiceInsertion, failure policy in the service instance takes precedence. For east-west ServiceInsertion, failure policy in the service chain takes precedence. BLOCK is not supported for Endpoint protection (EPP) functionality.
   */
  @JsonAdapter(OnFailurePolicyEnum.Adapter.class)
  public enum OnFailurePolicyEnum {
    ALLOW("ALLOW"),
    BLOCK("BLOCK");

    private String value;

    OnFailurePolicyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OnFailurePolicyEnum fromValue(String text) {
      for (OnFailurePolicyEnum b : OnFailurePolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OnFailurePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OnFailurePolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OnFailurePolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OnFailurePolicyEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("on_failure_policy")
  private OnFailurePolicyEnum onFailurePolicy = OnFailurePolicyEnum.ALLOW;

  /**
   * Gets or Sets transports
   */
  @JsonAdapter(TransportsEnum.Adapter.class)
  public enum TransportsEnum {
    L2_BRIDGE("L2_BRIDGE"),
    L3_ROUTED("L3_ROUTED"),
    NSH("NSH");

    private String value;

    TransportsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TransportsEnum fromValue(String text) {
      for (TransportsEnum b : TransportsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TransportsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransportsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransportsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransportsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("transports")
  private List<TransportsEnum> transports = null;

  /**
   * Gets or Sets implementations
   */
  @JsonAdapter(ImplementationsEnum.Adapter.class)
  public enum ImplementationsEnum {
    NORTH_SOUTH("NORTH_SOUTH"),
    EAST_WEST("EAST_WEST");

    private String value;

    ImplementationsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ImplementationsEnum fromValue(String text) {
      for (ImplementationsEnum b : ImplementationsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ImplementationsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImplementationsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImplementationsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImplementationsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("implementations")
  private List<ImplementationsEnum> implementations = new ArrayList<ImplementationsEnum>();

  public ServiceDefinition serviceDeploymentSpec(ServiceDeploymentSpec serviceDeploymentSpec) {
    this.serviceDeploymentSpec = serviceDeploymentSpec;
    return this;
  }

   /**
   * Get serviceDeploymentSpec
   * @return serviceDeploymentSpec
  **/
  @Schema(description = "")
  public ServiceDeploymentSpec getServiceDeploymentSpec() {
    return serviceDeploymentSpec;
  }

  public void setServiceDeploymentSpec(ServiceDeploymentSpec serviceDeploymentSpec) {
    this.serviceDeploymentSpec = serviceDeploymentSpec;
  }

  public ServiceDefinition serviceCapability(ServiceCapability serviceCapability) {
    this.serviceCapability = serviceCapability;
    return this;
  }

   /**
   * Get serviceCapability
   * @return serviceCapability
  **/
  @Schema(description = "")
  public ServiceCapability getServiceCapability() {
    return serviceCapability;
  }

  public void setServiceCapability(ServiceCapability serviceCapability) {
    this.serviceCapability = serviceCapability;
  }

  public ServiceDefinition functionalities(List<FunctionalitiesEnum> functionalities) {
    this.functionalities = functionalities;
    return this;
  }

  public ServiceDefinition addFunctionalitiesItem(FunctionalitiesEnum functionalitiesItem) {
    this.functionalities.add(functionalitiesItem);
    return this;
  }

   /**
   * The capabilities provided by the services. Needs to be one or more of the following | NG_FW - Next Generation Firewall | IDS_IPS - Intrusion detection System / Intrusion Prevention System | NET_MON - Network Monitoring | HCX - Hybrid Cloud Exchange | BYOD - Bring Your Own Device | EPP - Endpoint Protection.(Third party AntiVirus partners using NXGI should use this functionality for the service)
   * @return functionalities
  **/
  @Schema(required = true, description = "The capabilities provided by the services. Needs to be one or more of the following | NG_FW - Next Generation Firewall | IDS_IPS - Intrusion detection System / Intrusion Prevention System | NET_MON - Network Monitoring | HCX - Hybrid Cloud Exchange | BYOD - Bring Your Own Device | EPP - Endpoint Protection.(Third party AntiVirus partners using NXGI should use this functionality for the service)")
  public List<FunctionalitiesEnum> getFunctionalities() {
    return functionalities;
  }

  public void setFunctionalities(List<FunctionalitiesEnum> functionalities) {
    this.functionalities = functionalities;
  }

  public ServiceDefinition attachmentPoint(List<AttachmentPointEnum> attachmentPoint) {
    this.attachmentPoint = attachmentPoint;
    return this;
  }

  public ServiceDefinition addAttachmentPointItem(AttachmentPointEnum attachmentPointItem) {
    if (this.attachmentPoint == null) {
      this.attachmentPoint = new ArrayList<AttachmentPointEnum>();
    }
    this.attachmentPoint.add(attachmentPointItem);
    return this;
  }

   /**
   * The point at which the service is deployed/attached for redirecting the traffic to the the partner appliance. Attachment Point is required if Service caters to any functionality other than EPP.
   * @return attachmentPoint
  **/
  @Schema(description = "The point at which the service is deployed/attached for redirecting the traffic to the the partner appliance. Attachment Point is required if Service caters to any functionality other than EPP.")
  public List<AttachmentPointEnum> getAttachmentPoint() {
    return attachmentPoint;
  }

  public void setAttachmentPoint(List<AttachmentPointEnum> attachmentPoint) {
    this.attachmentPoint = attachmentPoint;
  }

   /**
   * ID of the service manager to which this service is attached with. This field is not set during creation of service. This field will be set explicitly when Service Manager is created successfully using this service. 
   * @return serviceManagerId
  **/
  @Schema(description = "ID of the service manager to which this service is attached with. This field is not set during creation of service. This field will be set explicitly when Service Manager is created successfully using this service. ")
  public String getServiceManagerId() {
    return serviceManagerId;
  }

  public ServiceDefinition vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Id which is unique to a vendor or partner for which the service is created.
   * @return vendorId
  **/
  @Schema(required = true, description = "Id which is unique to a vendor or partner for which the service is created.")
  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public ServiceDefinition onFailurePolicy(OnFailurePolicyEnum onFailurePolicy) {
    this.onFailurePolicy = onFailurePolicy;
    return this;
  }

   /**
   * Failure policy for the service tells datapath, the action to take i.e to Allow or Block traffic during failure scenarios. For north-south ServiceInsertion, failure policy in the service instance takes precedence. For east-west ServiceInsertion, failure policy in the service chain takes precedence. BLOCK is not supported for Endpoint protection (EPP) functionality.
   * @return onFailurePolicy
  **/
  @Schema(description = "Failure policy for the service tells datapath, the action to take i.e to Allow or Block traffic during failure scenarios. For north-south ServiceInsertion, failure policy in the service instance takes precedence. For east-west ServiceInsertion, failure policy in the service chain takes precedence. BLOCK is not supported for Endpoint protection (EPP) functionality.")
  public OnFailurePolicyEnum getOnFailurePolicy() {
    return onFailurePolicy;
  }

  public void setOnFailurePolicy(OnFailurePolicyEnum onFailurePolicy) {
    this.onFailurePolicy = onFailurePolicy;
  }

  public ServiceDefinition transports(List<TransportsEnum> transports) {
    this.transports = transports;
    return this;
  }

  public ServiceDefinition addTransportsItem(TransportsEnum transportsItem) {
    if (this.transports == null) {
      this.transports = new ArrayList<TransportsEnum>();
    }
    this.transports.add(transportsItem);
    return this;
  }

   /**
   * Transport Type of the service, which is the mechanism of redirecting the traffic to the the partner appliance. Transport type is required if Service caters to any functionality other than EPP.
   * @return transports
  **/
  @Schema(description = "Transport Type of the service, which is the mechanism of redirecting the traffic to the the partner appliance. Transport type is required if Service caters to any functionality other than EPP.")
  public List<TransportsEnum> getTransports() {
    return transports;
  }

  public void setTransports(List<TransportsEnum> transports) {
    this.transports = transports;
  }

  public ServiceDefinition implementations(List<ImplementationsEnum> implementations) {
    this.implementations = implementations;
    return this;
  }

  public ServiceDefinition addImplementationsItem(ImplementationsEnum implementationsItem) {
    this.implementations.add(implementationsItem);
    return this;
  }

   /**
   * This indicates the insertion point of the service i.e whether the service will be used to protect North-South or East-West traffic in the datacenter.
   * @return implementations
  **/
  @Schema(required = true, description = "This indicates the insertion point of the service i.e whether the service will be used to protect North-South or East-West traffic in the datacenter.")
  public List<ImplementationsEnum> getImplementations() {
    return implementations;
  }

  public void setImplementations(List<ImplementationsEnum> implementations) {
    this.implementations = implementations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinition serviceDefinition = (ServiceDefinition) o;
    return Objects.equals(this.serviceDeploymentSpec, serviceDefinition.serviceDeploymentSpec) &&
        Objects.equals(this.serviceCapability, serviceDefinition.serviceCapability) &&
        Objects.equals(this.functionalities, serviceDefinition.functionalities) &&
        Objects.equals(this.attachmentPoint, serviceDefinition.attachmentPoint) &&
        Objects.equals(this.serviceManagerId, serviceDefinition.serviceManagerId) &&
        Objects.equals(this.vendorId, serviceDefinition.vendorId) &&
        Objects.equals(this.onFailurePolicy, serviceDefinition.onFailurePolicy) &&
        Objects.equals(this.transports, serviceDefinition.transports) &&
        Objects.equals(this.implementations, serviceDefinition.implementations) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDeploymentSpec, serviceCapability, functionalities, attachmentPoint, serviceManagerId, vendorId, onFailurePolicy, transports, implementations, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    serviceDeploymentSpec: ").append(toIndentedString(serviceDeploymentSpec)).append("\n");
    sb.append("    serviceCapability: ").append(toIndentedString(serviceCapability)).append("\n");
    sb.append("    functionalities: ").append(toIndentedString(functionalities)).append("\n");
    sb.append("    attachmentPoint: ").append(toIndentedString(attachmentPoint)).append("\n");
    sb.append("    serviceManagerId: ").append(toIndentedString(serviceManagerId)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    onFailurePolicy: ").append(toIndentedString(onFailurePolicy)).append("\n");
    sb.append("    transports: ").append(toIndentedString(transports)).append("\n");
    sb.append("    implementations: ").append(toIndentedString(implementations)).append("\n");
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