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
import io.swagger.client.model.DiscoveredResource;
import io.swagger.client.model.IpAddressInfo;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * VirtualNetworkInterface
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class VirtualNetworkInterface extends DiscoveredResource {
  @SerializedName("mac_address")
  private String macAddress = null;

  /**
   * Owner virtual machine type; Edge, Service VM or other.
   */
  @JsonAdapter(OwnerVmTypeEnum.Adapter.class)
  public enum OwnerVmTypeEnum {
    EDGE("EDGE"),
    SERVICE("SERVICE"),
    REGULAR("REGULAR");

    private String value;

    OwnerVmTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OwnerVmTypeEnum fromValue(String text) {
      for (OwnerVmTypeEnum b : OwnerVmTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OwnerVmTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OwnerVmTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OwnerVmTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OwnerVmTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("owner_vm_type")
  private OwnerVmTypeEnum ownerVmType = null;

  @SerializedName("device_key")
  private String deviceKey = null;

  @SerializedName("host_id")
  private String hostId = null;

  @SerializedName("owner_vm_id")
  private String ownerVmId = null;

  @SerializedName("vm_local_id_on_host")
  private String vmLocalIdOnHost = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("lport_attachment_id")
  private String lportAttachmentId = null;

  @SerializedName("ip_address_info")
  private List<IpAddressInfo> ipAddressInfo = null;

  @SerializedName("device_name")
  private String deviceName = null;

  public VirtualNetworkInterface macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * MAC address of the virtual network interface.
   * @return macAddress
  **/
  @Schema(required = true, description = "MAC address of the virtual network interface.")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

   /**
   * Owner virtual machine type; Edge, Service VM or other.
   * @return ownerVmType
  **/
  @Schema(description = "Owner virtual machine type; Edge, Service VM or other.")
  public OwnerVmTypeEnum getOwnerVmType() {
    return ownerVmType;
  }

  public VirtualNetworkInterface deviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
    return this;
  }

   /**
   * Device key of the virtual network interface.
   * @return deviceKey
  **/
  @Schema(required = true, description = "Device key of the virtual network interface.")
  public String getDeviceKey() {
    return deviceKey;
  }

  public void setDeviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
  }

  public VirtualNetworkInterface hostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

   /**
   * Id of the host on which the vm exists.
   * @return hostId
  **/
  @Schema(required = true, description = "Id of the host on which the vm exists.")
  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }

  public VirtualNetworkInterface ownerVmId(String ownerVmId) {
    this.ownerVmId = ownerVmId;
    return this;
  }

   /**
   * Id of the vm to which this virtual network interface belongs.
   * @return ownerVmId
  **/
  @Schema(required = true, description = "Id of the vm to which this virtual network interface belongs.")
  public String getOwnerVmId() {
    return ownerVmId;
  }

  public void setOwnerVmId(String ownerVmId) {
    this.ownerVmId = ownerVmId;
  }

  public VirtualNetworkInterface vmLocalIdOnHost(String vmLocalIdOnHost) {
    this.vmLocalIdOnHost = vmLocalIdOnHost;
    return this;
  }

   /**
   * Id of the vm unique within the host.
   * @return vmLocalIdOnHost
  **/
  @Schema(required = true, description = "Id of the vm unique within the host.")
  public String getVmLocalIdOnHost() {
    return vmLocalIdOnHost;
  }

  public void setVmLocalIdOnHost(String vmLocalIdOnHost) {
    this.vmLocalIdOnHost = vmLocalIdOnHost;
  }

  public VirtualNetworkInterface externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External Id of the virtual network inferface.
   * @return externalId
  **/
  @Schema(required = true, description = "External Id of the virtual network inferface.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public VirtualNetworkInterface lportAttachmentId(String lportAttachmentId) {
    this.lportAttachmentId = lportAttachmentId;
    return this;
  }

   /**
   * LPort Attachment Id of the virtual network interface.
   * @return lportAttachmentId
  **/
  @Schema(description = "LPort Attachment Id of the virtual network interface.")
  public String getLportAttachmentId() {
    return lportAttachmentId;
  }

  public void setLportAttachmentId(String lportAttachmentId) {
    this.lportAttachmentId = lportAttachmentId;
  }

  public VirtualNetworkInterface ipAddressInfo(List<IpAddressInfo> ipAddressInfo) {
    this.ipAddressInfo = ipAddressInfo;
    return this;
  }

  public VirtualNetworkInterface addIpAddressInfoItem(IpAddressInfo ipAddressInfoItem) {
    if (this.ipAddressInfo == null) {
      this.ipAddressInfo = new ArrayList<IpAddressInfo>();
    }
    this.ipAddressInfo.add(ipAddressInfoItem);
    return this;
  }

   /**
   * IP Addresses of the the virtual network interface, from various sources.
   * @return ipAddressInfo
  **/
  @Schema(description = "IP Addresses of the the virtual network interface, from various sources.")
  public List<IpAddressInfo> getIpAddressInfo() {
    return ipAddressInfo;
  }

  public void setIpAddressInfo(List<IpAddressInfo> ipAddressInfo) {
    this.ipAddressInfo = ipAddressInfo;
  }

  public VirtualNetworkInterface deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Device name of the virtual network interface.
   * @return deviceName
  **/
  @Schema(description = "Device name of the virtual network interface.")
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualNetworkInterface virtualNetworkInterface = (VirtualNetworkInterface) o;
    return Objects.equals(this.macAddress, virtualNetworkInterface.macAddress) &&
        Objects.equals(this.ownerVmType, virtualNetworkInterface.ownerVmType) &&
        Objects.equals(this.deviceKey, virtualNetworkInterface.deviceKey) &&
        Objects.equals(this.hostId, virtualNetworkInterface.hostId) &&
        Objects.equals(this.ownerVmId, virtualNetworkInterface.ownerVmId) &&
        Objects.equals(this.vmLocalIdOnHost, virtualNetworkInterface.vmLocalIdOnHost) &&
        Objects.equals(this.externalId, virtualNetworkInterface.externalId) &&
        Objects.equals(this.lportAttachmentId, virtualNetworkInterface.lportAttachmentId) &&
        Objects.equals(this.ipAddressInfo, virtualNetworkInterface.ipAddressInfo) &&
        Objects.equals(this.deviceName, virtualNetworkInterface.deviceName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macAddress, ownerVmType, deviceKey, hostId, ownerVmId, vmLocalIdOnHost, externalId, lportAttachmentId, ipAddressInfo, deviceName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualNetworkInterface {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    ownerVmType: ").append(toIndentedString(ownerVmType)).append("\n");
    sb.append("    deviceKey: ").append(toIndentedString(deviceKey)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    ownerVmId: ").append(toIndentedString(ownerVmId)).append("\n");
    sb.append("    vmLocalIdOnHost: ").append(toIndentedString(vmLocalIdOnHost)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lportAttachmentId: ").append(toIndentedString(lportAttachmentId)).append("\n");
    sb.append("    ipAddressInfo: ").append(toIndentedString(ipAddressInfo)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
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