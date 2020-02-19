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
import io.swagger.client.model.BaseSwitchingProfile;
import io.swagger.client.model.DuplicateIPDetection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * IpDiscoverySwitchingProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IpDiscoverySwitchingProfile extends BaseSwitchingProfile {
  @SerializedName("arp_snooping_enabled")
  private Boolean arpSnoopingEnabled = true;

  @SerializedName("arp_bindings_limit")
  private Integer arpBindingsLimit = 1;

  @SerializedName("dhcpv6_snooping_enabled")
  private Boolean dhcpv6SnoopingEnabled = false;

  @SerializedName("nd_snooping_enabled")
  private Boolean ndSnoopingEnabled = false;

  @SerializedName("vm_tools_v6_enabled")
  private Boolean vmToolsV6Enabled = false;

  @SerializedName("dhcp_snooping_enabled")
  private Boolean dhcpSnoopingEnabled = true;

  @SerializedName("arp_nd_binding_timeout")
  private Integer arpNdBindingTimeout = 10;

  @SerializedName("vm_tools_enabled")
  private Boolean vmToolsEnabled = true;

  @SerializedName("trust_on_first_use_enabled")
  private Boolean trustOnFirstUseEnabled = true;

  @SerializedName("nd_bindings_limit")
  private Integer ndBindingsLimit = 3;

  @SerializedName("duplicate_ip_detection")
  private DuplicateIPDetection duplicateIpDetection = null;

  public IpDiscoverySwitchingProfile arpSnoopingEnabled(Boolean arpSnoopingEnabled) {
    this.arpSnoopingEnabled = arpSnoopingEnabled;
    return this;
  }

   /**
   * Indicates whether ARP snooping is enabled
   * @return arpSnoopingEnabled
  **/
  @Schema(description = "Indicates whether ARP snooping is enabled")
  public Boolean isArpSnoopingEnabled() {
    return arpSnoopingEnabled;
  }

  public void setArpSnoopingEnabled(Boolean arpSnoopingEnabled) {
    this.arpSnoopingEnabled = arpSnoopingEnabled;
  }

  public IpDiscoverySwitchingProfile arpBindingsLimit(Integer arpBindingsLimit) {
    this.arpBindingsLimit = arpBindingsLimit;
    return this;
  }

   /**
   * Indicates the number of arp snooped IP addresses to be remembered per LogicalPort. Decreasing this value, will retain the latest bindings from the existing list of address bindings. Increasing this value will retain existing bindings and also learn any new address bindings discovered on the port until the new limit is reached. This limit only applies to IPv4 addresses and is independent of the nd_bindings_limit used for IPv6 snooping.
   * minimum: 1
   * maximum: 256
   * @return arpBindingsLimit
  **/
  @Schema(description = "Indicates the number of arp snooped IP addresses to be remembered per LogicalPort. Decreasing this value, will retain the latest bindings from the existing list of address bindings. Increasing this value will retain existing bindings and also learn any new address bindings discovered on the port until the new limit is reached. This limit only applies to IPv4 addresses and is independent of the nd_bindings_limit used for IPv6 snooping.")
  public Integer getArpBindingsLimit() {
    return arpBindingsLimit;
  }

  public void setArpBindingsLimit(Integer arpBindingsLimit) {
    this.arpBindingsLimit = arpBindingsLimit;
  }

  public IpDiscoverySwitchingProfile dhcpv6SnoopingEnabled(Boolean dhcpv6SnoopingEnabled) {
    this.dhcpv6SnoopingEnabled = dhcpv6SnoopingEnabled;
    return this;
  }

   /**
   * This option is the IPv6 equivalent of DHCP snooping.
   * @return dhcpv6SnoopingEnabled
  **/
  @Schema(description = "This option is the IPv6 equivalent of DHCP snooping.")
  public Boolean isDhcpv6SnoopingEnabled() {
    return dhcpv6SnoopingEnabled;
  }

  public void setDhcpv6SnoopingEnabled(Boolean dhcpv6SnoopingEnabled) {
    this.dhcpv6SnoopingEnabled = dhcpv6SnoopingEnabled;
  }

  public IpDiscoverySwitchingProfile ndSnoopingEnabled(Boolean ndSnoopingEnabled) {
    this.ndSnoopingEnabled = ndSnoopingEnabled;
    return this;
  }

   /**
   * This option is the IPv6 equivalent of ARP snooping.
   * @return ndSnoopingEnabled
  **/
  @Schema(description = "This option is the IPv6 equivalent of ARP snooping.")
  public Boolean isNdSnoopingEnabled() {
    return ndSnoopingEnabled;
  }

  public void setNdSnoopingEnabled(Boolean ndSnoopingEnabled) {
    this.ndSnoopingEnabled = ndSnoopingEnabled;
  }

  public IpDiscoverySwitchingProfile vmToolsV6Enabled(Boolean vmToolsV6Enabled) {
    this.vmToolsV6Enabled = vmToolsV6Enabled;
    return this;
  }

   /**
   * This option is only supported on ESX where vm-tools is installed.
   * @return vmToolsV6Enabled
  **/
  @Schema(description = "This option is only supported on ESX where vm-tools is installed.")
  public Boolean isVmToolsV6Enabled() {
    return vmToolsV6Enabled;
  }

  public void setVmToolsV6Enabled(Boolean vmToolsV6Enabled) {
    this.vmToolsV6Enabled = vmToolsV6Enabled;
  }

  public IpDiscoverySwitchingProfile dhcpSnoopingEnabled(Boolean dhcpSnoopingEnabled) {
    this.dhcpSnoopingEnabled = dhcpSnoopingEnabled;
    return this;
  }

   /**
   * Indicates whether DHCP snooping is enabled
   * @return dhcpSnoopingEnabled
  **/
  @Schema(description = "Indicates whether DHCP snooping is enabled")
  public Boolean isDhcpSnoopingEnabled() {
    return dhcpSnoopingEnabled;
  }

  public void setDhcpSnoopingEnabled(Boolean dhcpSnoopingEnabled) {
    this.dhcpSnoopingEnabled = dhcpSnoopingEnabled;
  }

  public IpDiscoverySwitchingProfile arpNdBindingTimeout(Integer arpNdBindingTimeout) {
    this.arpNdBindingTimeout = arpNdBindingTimeout;
    return this;
  }

   /**
   * This property controls the ARP and ND cache timeout period.It is recommended that this property be greater than the ARP/ND cache timeout on the VM. 
   * minimum: 5
   * maximum: 120
   * @return arpNdBindingTimeout
  **/
  @Schema(description = "This property controls the ARP and ND cache timeout period.It is recommended that this property be greater than the ARP/ND cache timeout on the VM. ")
  public Integer getArpNdBindingTimeout() {
    return arpNdBindingTimeout;
  }

  public void setArpNdBindingTimeout(Integer arpNdBindingTimeout) {
    this.arpNdBindingTimeout = arpNdBindingTimeout;
  }

  public IpDiscoverySwitchingProfile vmToolsEnabled(Boolean vmToolsEnabled) {
    this.vmToolsEnabled = vmToolsEnabled;
    return this;
  }

   /**
   * This option is only supported on ESX where vm-tools is installed.
   * @return vmToolsEnabled
  **/
  @Schema(description = "This option is only supported on ESX where vm-tools is installed.")
  public Boolean isVmToolsEnabled() {
    return vmToolsEnabled;
  }

  public void setVmToolsEnabled(Boolean vmToolsEnabled) {
    this.vmToolsEnabled = vmToolsEnabled;
  }

  public IpDiscoverySwitchingProfile trustOnFirstUseEnabled(Boolean trustOnFirstUseEnabled) {
    this.trustOnFirstUseEnabled = trustOnFirstUseEnabled;
    return this;
  }

   /**
   * ARP snooping being inherently susceptible to ARP spoofing, uses a turst-on-fisrt-use (TOFU) paradigm where only the first IP address discovered via ARP snooping is trusted. The remaining are ignored. In order to allow for more flexibility, we allow the user to configure how many ARP snooped address bindings should be trusted for the lifetime of the logical port. This is controlled by the arp_bindings_limit property in the IP Discovery profile. We refer to this extension of TOFU as N-TOFU. However, if TOFU is disabled, then N ARP snooped IP addresses will be trusted until they are timed out, where N is configured by arp_bindings_limit. 
   * @return trustOnFirstUseEnabled
  **/
  @Schema(description = "ARP snooping being inherently susceptible to ARP spoofing, uses a turst-on-fisrt-use (TOFU) paradigm where only the first IP address discovered via ARP snooping is trusted. The remaining are ignored. In order to allow for more flexibility, we allow the user to configure how many ARP snooped address bindings should be trusted for the lifetime of the logical port. This is controlled by the arp_bindings_limit property in the IP Discovery profile. We refer to this extension of TOFU as N-TOFU. However, if TOFU is disabled, then N ARP snooped IP addresses will be trusted until they are timed out, where N is configured by arp_bindings_limit. ")
  public Boolean isTrustOnFirstUseEnabled() {
    return trustOnFirstUseEnabled;
  }

  public void setTrustOnFirstUseEnabled(Boolean trustOnFirstUseEnabled) {
    this.trustOnFirstUseEnabled = trustOnFirstUseEnabled;
  }

  public IpDiscoverySwitchingProfile ndBindingsLimit(Integer ndBindingsLimit) {
    this.ndBindingsLimit = ndBindingsLimit;
    return this;
  }

   /**
   * Indicates the number of neighbor-discovery snooped IP addresses to be remembered per LogicalPort. Decreasing this value, will retain the latest bindings from the existing list of address bindings. Increasing this value will retain existing bindings and also learn any new address bindings discovered on the port until the new limit is reached. This limit only applies to IPv6 addresses and is independent of the arp_bindings_limit used for IPv4 snooping.
   * minimum: 2
   * maximum: 15
   * @return ndBindingsLimit
  **/
  @Schema(description = "Indicates the number of neighbor-discovery snooped IP addresses to be remembered per LogicalPort. Decreasing this value, will retain the latest bindings from the existing list of address bindings. Increasing this value will retain existing bindings and also learn any new address bindings discovered on the port until the new limit is reached. This limit only applies to IPv6 addresses and is independent of the arp_bindings_limit used for IPv4 snooping.")
  public Integer getNdBindingsLimit() {
    return ndBindingsLimit;
  }

  public void setNdBindingsLimit(Integer ndBindingsLimit) {
    this.ndBindingsLimit = ndBindingsLimit;
  }

  public IpDiscoverySwitchingProfile duplicateIpDetection(DuplicateIPDetection duplicateIpDetection) {
    this.duplicateIpDetection = duplicateIpDetection;
    return this;
  }

   /**
   * Get duplicateIpDetection
   * @return duplicateIpDetection
  **/
  @Schema(description = "")
  public DuplicateIPDetection getDuplicateIpDetection() {
    return duplicateIpDetection;
  }

  public void setDuplicateIpDetection(DuplicateIPDetection duplicateIpDetection) {
    this.duplicateIpDetection = duplicateIpDetection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpDiscoverySwitchingProfile ipDiscoverySwitchingProfile = (IpDiscoverySwitchingProfile) o;
    return Objects.equals(this.arpSnoopingEnabled, ipDiscoverySwitchingProfile.arpSnoopingEnabled) &&
        Objects.equals(this.arpBindingsLimit, ipDiscoverySwitchingProfile.arpBindingsLimit) &&
        Objects.equals(this.dhcpv6SnoopingEnabled, ipDiscoverySwitchingProfile.dhcpv6SnoopingEnabled) &&
        Objects.equals(this.ndSnoopingEnabled, ipDiscoverySwitchingProfile.ndSnoopingEnabled) &&
        Objects.equals(this.vmToolsV6Enabled, ipDiscoverySwitchingProfile.vmToolsV6Enabled) &&
        Objects.equals(this.dhcpSnoopingEnabled, ipDiscoverySwitchingProfile.dhcpSnoopingEnabled) &&
        Objects.equals(this.arpNdBindingTimeout, ipDiscoverySwitchingProfile.arpNdBindingTimeout) &&
        Objects.equals(this.vmToolsEnabled, ipDiscoverySwitchingProfile.vmToolsEnabled) &&
        Objects.equals(this.trustOnFirstUseEnabled, ipDiscoverySwitchingProfile.trustOnFirstUseEnabled) &&
        Objects.equals(this.ndBindingsLimit, ipDiscoverySwitchingProfile.ndBindingsLimit) &&
        Objects.equals(this.duplicateIpDetection, ipDiscoverySwitchingProfile.duplicateIpDetection) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arpSnoopingEnabled, arpBindingsLimit, dhcpv6SnoopingEnabled, ndSnoopingEnabled, vmToolsV6Enabled, dhcpSnoopingEnabled, arpNdBindingTimeout, vmToolsEnabled, trustOnFirstUseEnabled, ndBindingsLimit, duplicateIpDetection, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpDiscoverySwitchingProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    arpSnoopingEnabled: ").append(toIndentedString(arpSnoopingEnabled)).append("\n");
    sb.append("    arpBindingsLimit: ").append(toIndentedString(arpBindingsLimit)).append("\n");
    sb.append("    dhcpv6SnoopingEnabled: ").append(toIndentedString(dhcpv6SnoopingEnabled)).append("\n");
    sb.append("    ndSnoopingEnabled: ").append(toIndentedString(ndSnoopingEnabled)).append("\n");
    sb.append("    vmToolsV6Enabled: ").append(toIndentedString(vmToolsV6Enabled)).append("\n");
    sb.append("    dhcpSnoopingEnabled: ").append(toIndentedString(dhcpSnoopingEnabled)).append("\n");
    sb.append("    arpNdBindingTimeout: ").append(toIndentedString(arpNdBindingTimeout)).append("\n");
    sb.append("    vmToolsEnabled: ").append(toIndentedString(vmToolsEnabled)).append("\n");
    sb.append("    trustOnFirstUseEnabled: ").append(toIndentedString(trustOnFirstUseEnabled)).append("\n");
    sb.append("    ndBindingsLimit: ").append(toIndentedString(ndBindingsLimit)).append("\n");
    sb.append("    duplicateIpDetection: ").append(toIndentedString(duplicateIpDetection)).append("\n");
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