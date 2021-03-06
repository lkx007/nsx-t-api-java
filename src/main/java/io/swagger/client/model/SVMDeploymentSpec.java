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
 * Deployment Specs holds information required to deploy the Service-VMs.i.e. OVF url where the partner Service-VM OVF is hosted. The host type on which the OVF(Open Virtualization Format) can be deployed, Form factor to name a few.
 */
@Schema(description = "Deployment Specs holds information required to deploy the Service-VMs.i.e. OVF url where the partner Service-VM OVF is hosted. The host type on which the OVF(Open Virtualization Format) can be deployed, Form factor to name a few.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SVMDeploymentSpec {
  @SerializedName("min_host_version")
  private String minHostVersion = "6.5";

  @SerializedName("ovf_url")
  private String ovfUrl = null;

  /**
   * Supported ServiceInsertion Form Factor for the OVF deployment. The default FormFactor is Medium.
   */
  @JsonAdapter(ServiceFormFactorEnum.Adapter.class)
  public enum ServiceFormFactorEnum {
    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE");

    private String value;

    ServiceFormFactorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ServiceFormFactorEnum fromValue(String text) {
      for (ServiceFormFactorEnum b : ServiceFormFactorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ServiceFormFactorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceFormFactorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceFormFactorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceFormFactorEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("service_form_factor")
  private ServiceFormFactorEnum serviceFormFactor = ServiceFormFactorEnum.MEDIUM;

  /**
   * Host Type on which the specified OVF can be deployed.
   */
  @JsonAdapter(HostTypeEnum.Adapter.class)
  public enum HostTypeEnum {
    ESXI("ESXI"),
    RHELKVM("RHELKVM"),
    UBUNTUKVM("UBUNTUKVM");

    private String value;

    HostTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HostTypeEnum fromValue(String text) {
      for (HostTypeEnum b : HostTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HostTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HostTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HostTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HostTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("host_type")
  private HostTypeEnum hostType = null;

  @SerializedName("name")
  private String name = null;

  public SVMDeploymentSpec minHostVersion(String minHostVersion) {
    this.minHostVersion = minHostVersion;
    return this;
  }

   /**
   * Minimum host version supported by this ovf. If a host in the deployment cluster is having version less than this, then service deployment will not happen on that host.
   * @return minHostVersion
  **/
  @Schema(description = "Minimum host version supported by this ovf. If a host in the deployment cluster is having version less than this, then service deployment will not happen on that host.")
  public String getMinHostVersion() {
    return minHostVersion;
  }

  public void setMinHostVersion(String minHostVersion) {
    this.minHostVersion = minHostVersion;
  }

  public SVMDeploymentSpec ovfUrl(String ovfUrl) {
    this.ovfUrl = ovfUrl;
    return this;
  }

   /**
   * Location of the partner VM OVF to be deployed.
   * @return ovfUrl
  **/
  @Schema(required = true, description = "Location of the partner VM OVF to be deployed.")
  public String getOvfUrl() {
    return ovfUrl;
  }

  public void setOvfUrl(String ovfUrl) {
    this.ovfUrl = ovfUrl;
  }

  public SVMDeploymentSpec serviceFormFactor(ServiceFormFactorEnum serviceFormFactor) {
    this.serviceFormFactor = serviceFormFactor;
    return this;
  }

   /**
   * Supported ServiceInsertion Form Factor for the OVF deployment. The default FormFactor is Medium.
   * @return serviceFormFactor
  **/
  @Schema(description = "Supported ServiceInsertion Form Factor for the OVF deployment. The default FormFactor is Medium.")
  public ServiceFormFactorEnum getServiceFormFactor() {
    return serviceFormFactor;
  }

  public void setServiceFormFactor(ServiceFormFactorEnum serviceFormFactor) {
    this.serviceFormFactor = serviceFormFactor;
  }

  public SVMDeploymentSpec hostType(HostTypeEnum hostType) {
    this.hostType = hostType;
    return this;
  }

   /**
   * Host Type on which the specified OVF can be deployed.
   * @return hostType
  **/
  @Schema(required = true, description = "Host Type on which the specified OVF can be deployed.")
  public HostTypeEnum getHostType() {
    return hostType;
  }

  public void setHostType(HostTypeEnum hostType) {
    this.hostType = hostType;
  }

  public SVMDeploymentSpec name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Deployment Spec name for ease of use, since multiple DeploymentSpec can be specified.
   * @return name
  **/
  @Schema(description = "Deployment Spec name for ease of use, since multiple DeploymentSpec can be specified.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SVMDeploymentSpec svMDeploymentSpec = (SVMDeploymentSpec) o;
    return Objects.equals(this.minHostVersion, svMDeploymentSpec.minHostVersion) &&
        Objects.equals(this.ovfUrl, svMDeploymentSpec.ovfUrl) &&
        Objects.equals(this.serviceFormFactor, svMDeploymentSpec.serviceFormFactor) &&
        Objects.equals(this.hostType, svMDeploymentSpec.hostType) &&
        Objects.equals(this.name, svMDeploymentSpec.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minHostVersion, ovfUrl, serviceFormFactor, hostType, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SVMDeploymentSpec {\n");
    
    sb.append("    minHostVersion: ").append(toIndentedString(minHostVersion)).append("\n");
    sb.append("    ovfUrl: ").append(toIndentedString(ovfUrl)).append("\n");
    sb.append("    serviceFormFactor: ").append(toIndentedString(serviceFormFactor)).append("\n");
    sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
