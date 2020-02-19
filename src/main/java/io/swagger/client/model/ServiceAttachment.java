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
import io.swagger.client.model.IPInfo;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.ResourceReference;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A ServiceAttachment represents a point on NSX entity (Example - Edge Router) to which ServiceInstance can be connected through an InstanceEndpoint. Example - In VMWare Hybric Cloud Extention (HCX) use case, HCX appliances connect to this Service Attachment Point. We do not handle the lifecycle of these appliance/s.
 */
@Schema(description = "A ServiceAttachment represents a point on NSX entity (Example - Edge Router) to which ServiceInstance can be connected through an InstanceEndpoint. Example - In VMWare Hybric Cloud Extention (HCX) use case, HCX appliances connect to this Service Attachment Point. We do not handle the lifecycle of these appliance/s.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ServiceAttachment extends ManagedResource {
  /**
   * UP - A Service Attachment will have its Service Port - UP and with a configured IP address. DOWN - An Inactive ServiceAttachment has its Service Port - DOWN. It can be used to connect set of appliances that do not need to exchange traffic to/from/through the Edge node.
   */
  @JsonAdapter(AttachmentStatusEnum.Adapter.class)
  public enum AttachmentStatusEnum {
    UP("UP"),
    DOWN("DOWN");

    private String value;

    AttachmentStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AttachmentStatusEnum fromValue(String text) {
      for (AttachmentStatusEnum b : AttachmentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AttachmentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttachmentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttachmentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AttachmentStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("attachment_status")
  private AttachmentStatusEnum attachmentStatus = AttachmentStatusEnum.UP;

  @SerializedName("service_port")
  private ResourceReference servicePort = null;

  @SerializedName("deployed_to")
  private ResourceReference deployedTo = null;

  @SerializedName("logical_switch")
  private ResourceReference logicalSwitch = null;

  @SerializedName("local_ips")
  private List<IPInfo> localIps = null;

  public ServiceAttachment attachmentStatus(AttachmentStatusEnum attachmentStatus) {
    this.attachmentStatus = attachmentStatus;
    return this;
  }

   /**
   * UP - A Service Attachment will have its Service Port - UP and with a configured IP address. DOWN - An Inactive ServiceAttachment has its Service Port - DOWN. It can be used to connect set of appliances that do not need to exchange traffic to/from/through the Edge node.
   * @return attachmentStatus
  **/
  @Schema(description = "UP - A Service Attachment will have its Service Port - UP and with a configured IP address. DOWN - An Inactive ServiceAttachment has its Service Port - DOWN. It can be used to connect set of appliances that do not need to exchange traffic to/from/through the Edge node.")
  public AttachmentStatusEnum getAttachmentStatus() {
    return attachmentStatus;
  }

  public void setAttachmentStatus(AttachmentStatusEnum attachmentStatus) {
    this.attachmentStatus = attachmentStatus;
  }

  public ServiceAttachment servicePort(ResourceReference servicePort) {
    this.servicePort = servicePort;
    return this;
  }

   /**
   * Get servicePort
   * @return servicePort
  **/
  @Schema(description = "")
  public ResourceReference getServicePort() {
    return servicePort;
  }

  public void setServicePort(ResourceReference servicePort) {
    this.servicePort = servicePort;
  }

  public ServiceAttachment deployedTo(ResourceReference deployedTo) {
    this.deployedTo = deployedTo;
    return this;
  }

   /**
   * Get deployedTo
   * @return deployedTo
  **/
  @Schema(required = true, description = "")
  public ResourceReference getDeployedTo() {
    return deployedTo;
  }

  public void setDeployedTo(ResourceReference deployedTo) {
    this.deployedTo = deployedTo;
  }

  public ServiceAttachment logicalSwitch(ResourceReference logicalSwitch) {
    this.logicalSwitch = logicalSwitch;
    return this;
  }

   /**
   * Get logicalSwitch
   * @return logicalSwitch
  **/
  @Schema(description = "")
  public ResourceReference getLogicalSwitch() {
    return logicalSwitch;
  }

  public void setLogicalSwitch(ResourceReference logicalSwitch) {
    this.logicalSwitch = logicalSwitch;
  }

  public ServiceAttachment localIps(List<IPInfo> localIps) {
    this.localIps = localIps;
    return this;
  }

  public ServiceAttachment addLocalIpsItem(IPInfo localIpsItem) {
    if (this.localIps == null) {
      this.localIps = new ArrayList<IPInfo>();
    }
    this.localIps.add(localIpsItem);
    return this;
  }

   /**
   * Local IPs associated with this Service Attachment.
   * @return localIps
  **/
  @Schema(description = "Local IPs associated with this Service Attachment.")
  public List<IPInfo> getLocalIps() {
    return localIps;
  }

  public void setLocalIps(List<IPInfo> localIps) {
    this.localIps = localIps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAttachment serviceAttachment = (ServiceAttachment) o;
    return Objects.equals(this.attachmentStatus, serviceAttachment.attachmentStatus) &&
        Objects.equals(this.servicePort, serviceAttachment.servicePort) &&
        Objects.equals(this.deployedTo, serviceAttachment.deployedTo) &&
        Objects.equals(this.logicalSwitch, serviceAttachment.logicalSwitch) &&
        Objects.equals(this.localIps, serviceAttachment.localIps) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentStatus, servicePort, deployedTo, logicalSwitch, localIps, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAttachment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attachmentStatus: ").append(toIndentedString(attachmentStatus)).append("\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
    sb.append("    deployedTo: ").append(toIndentedString(deployedTo)).append("\n");
    sb.append("    logicalSwitch: ").append(toIndentedString(logicalSwitch)).append("\n");
    sb.append("    localIps: ").append(toIndentedString(localIps)).append("\n");
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
