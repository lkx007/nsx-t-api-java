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
import io.swagger.client.model.BaseServiceProfile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * GI Specific service profile
 */
@Schema(description = "GI Specific service profile")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class GiServiceProfile extends BaseServiceProfile {
  @SerializedName("vendor_template_key")
  private String vendorTemplateKey = null;

  @SerializedName("service_id")
  private String serviceId = null;

  @SerializedName("vendor_template_id")
  private String vendorTemplateId = null;

   /**
   * Different VMs in data center can have Different protection levels as specified by administrator in the policy. The identifier for the policy with which the partner appliance identifies this policy. This identifier will be passed to the partner appliance at runtime to specify which protection level is applicable for the VM being protected.
   * @return vendorTemplateKey
  **/
  @Schema(description = "Different VMs in data center can have Different protection levels as specified by administrator in the policy. The identifier for the policy with which the partner appliance identifies this policy. This identifier will be passed to the partner appliance at runtime to specify which protection level is applicable for the VM being protected.")
  public String getVendorTemplateKey() {
    return vendorTemplateKey;
  }

   /**
   * The service to which the service profile belongs.
   * @return serviceId
  **/
  @Schema(description = "The service to which the service profile belongs.")
  public String getServiceId() {
    return serviceId;
  }

  public GiServiceProfile vendorTemplateId(String vendorTemplateId) {
    this.vendorTemplateId = vendorTemplateId;
    return this;
  }

   /**
   * ID of the vendor template, created by partner while registering the service.
   * @return vendorTemplateId
  **/
  @Schema(required = true, description = "ID of the vendor template, created by partner while registering the service.")
  public String getVendorTemplateId() {
    return vendorTemplateId;
  }

  public void setVendorTemplateId(String vendorTemplateId) {
    this.vendorTemplateId = vendorTemplateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiServiceProfile giServiceProfile = (GiServiceProfile) o;
    return Objects.equals(this.vendorTemplateKey, giServiceProfile.vendorTemplateKey) &&
        Objects.equals(this.serviceId, giServiceProfile.serviceId) &&
        Objects.equals(this.vendorTemplateId, giServiceProfile.vendorTemplateId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorTemplateKey, serviceId, vendorTemplateId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiServiceProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vendorTemplateKey: ").append(toIndentedString(vendorTemplateKey)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    vendorTemplateId: ").append(toIndentedString(vendorTemplateId)).append("\n");
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