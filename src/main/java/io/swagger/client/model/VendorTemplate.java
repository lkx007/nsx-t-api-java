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
import io.swagger.client.model.Attribute;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Vendor Templates are registered by the partner service manager to be used in the service profile. They contain named (k-v) pairs.
 */
@Schema(description = "Vendor Templates are registered by the partner service manager to be used in the service profile. They contain named (k-v) pairs.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class VendorTemplate extends ManagedResource {
  @SerializedName("vendor_template_key")
  private String vendorTemplateKey = null;

  @SerializedName("attributes")
  private List<Attribute> attributes = null;

  /**
   * The redirection action represents if the packet is exclusively redirected to the service, or if a copy is forwarded to the service. Service profile inherits the redirection action specified at the vendor template and cannot override the action specified at the vendor template. Redirection action is not applicable to guest introspection service.
   */
  @JsonAdapter(RedirectionActionEnum.Adapter.class)
  public enum RedirectionActionEnum {
    PUNT("PUNT"),
    COPY("COPY");

    private String value;

    RedirectionActionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RedirectionActionEnum fromValue(String text) {
      for (RedirectionActionEnum b : RedirectionActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RedirectionActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RedirectionActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RedirectionActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RedirectionActionEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("redirection_action")
  private RedirectionActionEnum redirectionAction = RedirectionActionEnum.PUNT;

  /**
   * The capabilities provided by the services. Needs to be one of the following | NG_FW - Next Generation Firewall | IDS_IPS - Intrusion detection System / Intrusion Prevention System | NET_MON - Network Monitoring | HCX - Hybrid Cloud Exchange | BYOD - Bring Your Own Device | EPP - Endpoint Protection.(Third party AntiVirus partners using NXGI should use this functionality for the service)
   */
  @JsonAdapter(FunctionalityEnum.Adapter.class)
  public enum FunctionalityEnum {
    NG_FW("NG_FW"),
    IDS_IPS("IDS_IPS"),
    NET_MON("NET_MON"),
    HCX("HCX"),
    BYOD("BYOD"),
    EPP("EPP");

    private String value;

    FunctionalityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FunctionalityEnum fromValue(String text) {
      for (FunctionalityEnum b : FunctionalityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FunctionalityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FunctionalityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FunctionalityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FunctionalityEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("functionality")
  private FunctionalityEnum functionality = null;

  @SerializedName("service_id")
  private String serviceId = null;

  public VendorTemplate vendorTemplateKey(String vendorTemplateKey) {
    this.vendorTemplateKey = vendorTemplateKey;
    return this;
  }

   /**
   * Different VMs in data center can have Different protection levels as specified by administrator in the policy. The identifier for the policy with which the partner appliance identifies this policy. This identifier will be passed to the partner appliance at runtime to specify which protection level is applicable for the VM being protected.
   * @return vendorTemplateKey
  **/
  @Schema(description = "Different VMs in data center can have Different protection levels as specified by administrator in the policy. The identifier for the policy with which the partner appliance identifies this policy. This identifier will be passed to the partner appliance at runtime to specify which protection level is applicable for the VM being protected.")
  public String getVendorTemplateKey() {
    return vendorTemplateKey;
  }

  public void setVendorTemplateKey(String vendorTemplateKey) {
    this.vendorTemplateKey = vendorTemplateKey;
  }

  public VendorTemplate attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public VendorTemplate addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<Attribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * List of attributes specific to a partner for which the vendor template is created. There attributes are passed on to the partner appliance and is opaque to the NSX Manager. Attributes are not supported by guest introspection service.
   * @return attributes
  **/
  @Schema(description = "List of attributes specific to a partner for which the vendor template is created. There attributes are passed on to the partner appliance and is opaque to the NSX Manager. Attributes are not supported by guest introspection service.")
  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  public VendorTemplate redirectionAction(RedirectionActionEnum redirectionAction) {
    this.redirectionAction = redirectionAction;
    return this;
  }

   /**
   * The redirection action represents if the packet is exclusively redirected to the service, or if a copy is forwarded to the service. Service profile inherits the redirection action specified at the vendor template and cannot override the action specified at the vendor template. Redirection action is not applicable to guest introspection service.
   * @return redirectionAction
  **/
  @Schema(description = "The redirection action represents if the packet is exclusively redirected to the service, or if a copy is forwarded to the service. Service profile inherits the redirection action specified at the vendor template and cannot override the action specified at the vendor template. Redirection action is not applicable to guest introspection service.")
  public RedirectionActionEnum getRedirectionAction() {
    return redirectionAction;
  }

  public void setRedirectionAction(RedirectionActionEnum redirectionAction) {
    this.redirectionAction = redirectionAction;
  }

  public VendorTemplate functionality(FunctionalityEnum functionality) {
    this.functionality = functionality;
    return this;
  }

   /**
   * The capabilities provided by the services. Needs to be one of the following | NG_FW - Next Generation Firewall | IDS_IPS - Intrusion detection System / Intrusion Prevention System | NET_MON - Network Monitoring | HCX - Hybrid Cloud Exchange | BYOD - Bring Your Own Device | EPP - Endpoint Protection.(Third party AntiVirus partners using NXGI should use this functionality for the service)
   * @return functionality
  **/
  @Schema(description = "The capabilities provided by the services. Needs to be one of the following | NG_FW - Next Generation Firewall | IDS_IPS - Intrusion detection System / Intrusion Prevention System | NET_MON - Network Monitoring | HCX - Hybrid Cloud Exchange | BYOD - Bring Your Own Device | EPP - Endpoint Protection.(Third party AntiVirus partners using NXGI should use this functionality for the service)")
  public FunctionalityEnum getFunctionality() {
    return functionality;
  }

  public void setFunctionality(FunctionalityEnum functionality) {
    this.functionality = functionality;
  }

   /**
   * The service to which the vendor template belongs.
   * @return serviceId
  **/
  @Schema(description = "The service to which the vendor template belongs.")
  public String getServiceId() {
    return serviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorTemplate vendorTemplate = (VendorTemplate) o;
    return Objects.equals(this.vendorTemplateKey, vendorTemplate.vendorTemplateKey) &&
        Objects.equals(this.attributes, vendorTemplate.attributes) &&
        Objects.equals(this.redirectionAction, vendorTemplate.redirectionAction) &&
        Objects.equals(this.functionality, vendorTemplate.functionality) &&
        Objects.equals(this.serviceId, vendorTemplate.serviceId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorTemplateKey, attributes, redirectionAction, functionality, serviceId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorTemplate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vendorTemplateKey: ").append(toIndentedString(vendorTemplateKey)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    redirectionAction: ").append(toIndentedString(redirectionAction)).append("\n");
    sb.append("    functionality: ").append(toIndentedString(functionality)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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
