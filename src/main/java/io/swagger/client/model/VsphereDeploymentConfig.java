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
import io.swagger.client.model.DeploymentConfig;
import io.swagger.client.model.IPSubnet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The Vsphere deployment configuration determines where to deploy the edge node. It contains settings that are applied during install time. If using DHCP, you must leave the following fields unset: search_domains, management_port_subnets, dns_servers and default_gateway_addresses. Use EdgeNodeSettings to specify host name, SSH, NTP and DNS settings for both deployment and consequent update. These settings are editable for manually deployed edge nodes as well. EdgeNodeSettings reports current values configured on the edge node. The following fields are deprecated Hostname, SSH, NTP and DNS settings. 
 */
@Schema(description = "The Vsphere deployment configuration determines where to deploy the edge node. It contains settings that are applied during install time. If using DHCP, you must leave the following fields unset: search_domains, management_port_subnets, dns_servers and default_gateway_addresses. Use EdgeNodeSettings to specify host name, SSH, NTP and DNS settings for both deployment and consequent update. These settings are editable for manually deployed edge nodes as well. EdgeNodeSettings reports current values configured on the edge node. The following fields are deprecated Hostname, SSH, NTP and DNS settings. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class VsphereDeploymentConfig extends DeploymentConfig {
  @SerializedName("data_network_ids")
  private List<String> dataNetworkIds = new ArrayList<String>();

  @SerializedName("dns_servers")
  private List<String> dnsServers = null;

  @SerializedName("ntp_servers")
  private List<String> ntpServers = null;

  @SerializedName("management_network_id")
  private String managementNetworkId = null;

  @SerializedName("enable_ssh")
  private Boolean enableSsh = false;

  @SerializedName("allow_ssh_root_login")
  private Boolean allowSshRootLogin = false;

  @SerializedName("compute_id")
  private String computeId = null;

  @SerializedName("search_domains")
  private List<String> searchDomains = null;

  @SerializedName("vc_id")
  private String vcId = null;

  @SerializedName("storage_id")
  private String storageId = null;

  @SerializedName("default_gateway_addresses")
  private List<String> defaultGatewayAddresses = null;

  @SerializedName("management_port_subnets")
  private List<IPSubnet> managementPortSubnets = null;

  @SerializedName("host_id")
  private String hostId = null;

  @SerializedName("hostname")
  private String hostname = null;

  public VsphereDeploymentConfig dataNetworkIds(List<String> dataNetworkIds) {
    this.dataNetworkIds = dataNetworkIds;
    return this;
  }

  public VsphereDeploymentConfig addDataNetworkIdsItem(String dataNetworkIdsItem) {
    this.dataNetworkIds.add(dataNetworkIdsItem);
    return this;
  }

   /**
   * List of distributed portgroup or VLAN logical identifiers to which the datapath serving vnics of edge node vm will be connected. 
   * @return dataNetworkIds
  **/
  @Schema(required = true, description = "List of distributed portgroup or VLAN logical identifiers to which the datapath serving vnics of edge node vm will be connected. ")
  public List<String> getDataNetworkIds() {
    return dataNetworkIds;
  }

  public void setDataNetworkIds(List<String> dataNetworkIds) {
    this.dataNetworkIds = dataNetworkIds;
  }

  public VsphereDeploymentConfig dnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
    return this;
  }

  public VsphereDeploymentConfig addDnsServersItem(String dnsServersItem) {
    if (this.dnsServers == null) {
      this.dnsServers = new ArrayList<String>();
    }
    this.dnsServers.add(dnsServersItem);
    return this;
  }

   /**
   * List of DNS servers. This field is deprecated. Use dns_servers property in EdgeNodeSettings section when creating or updating transport nodes. 
   * @return dnsServers
  **/
  @Schema(description = "List of DNS servers. This field is deprecated. Use dns_servers property in EdgeNodeSettings section when creating or updating transport nodes. ")
  public List<String> getDnsServers() {
    return dnsServers;
  }

  public void setDnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
  }

  public VsphereDeploymentConfig ntpServers(List<String> ntpServers) {
    this.ntpServers = ntpServers;
    return this;
  }

  public VsphereDeploymentConfig addNtpServersItem(String ntpServersItem) {
    if (this.ntpServers == null) {
      this.ntpServers = new ArrayList<String>();
    }
    this.ntpServers.add(ntpServersItem);
    return this;
  }

   /**
   * List of NTP servers. This field is deprecated. Use ntp_servers property in EdgeNodeSettings section when creating or updating transport nodes. 
   * @return ntpServers
  **/
  @Schema(description = "List of NTP servers. This field is deprecated. Use ntp_servers property in EdgeNodeSettings section when creating or updating transport nodes. ")
  public List<String> getNtpServers() {
    return ntpServers;
  }

  public void setNtpServers(List<String> ntpServers) {
    this.ntpServers = ntpServers;
  }

  public VsphereDeploymentConfig managementNetworkId(String managementNetworkId) {
    this.managementNetworkId = managementNetworkId;
    return this;
  }

   /**
   * Distributed portgroup identifier to which the management vnic of edge node vm will be connected. This portgroup must have connectivity with MP and CCP. A VLAN logical switch identifier may also be specified. 
   * @return managementNetworkId
  **/
  @Schema(required = true, description = "Distributed portgroup identifier to which the management vnic of edge node vm will be connected. This portgroup must have connectivity with MP and CCP. A VLAN logical switch identifier may also be specified. ")
  public String getManagementNetworkId() {
    return managementNetworkId;
  }

  public void setManagementNetworkId(String managementNetworkId) {
    this.managementNetworkId = managementNetworkId;
  }

  public VsphereDeploymentConfig enableSsh(Boolean enableSsh) {
    this.enableSsh = enableSsh;
    return this;
  }

   /**
   * Enabling SSH service is not recommended for security reasons. This field is deprecated. Use enable_ssh property in EdgeNodeSettings section when creating or updating transport nodes. 
   * @return enableSsh
  **/
  @Schema(description = "Enabling SSH service is not recommended for security reasons. This field is deprecated. Use enable_ssh property in EdgeNodeSettings section when creating or updating transport nodes. ")
  public Boolean isEnableSsh() {
    return enableSsh;
  }

  public void setEnableSsh(Boolean enableSsh) {
    this.enableSsh = enableSsh;
  }

  public VsphereDeploymentConfig allowSshRootLogin(Boolean allowSshRootLogin) {
    this.allowSshRootLogin = allowSshRootLogin;
    return this;
  }

   /**
   * Allowing root SSH logins is not recommended for security reasons. This field is deprecated. Use allow_ssh_root_login property in EdgeNodeSettings section when creating transport nodes. 
   * @return allowSshRootLogin
  **/
  @Schema(description = "Allowing root SSH logins is not recommended for security reasons. This field is deprecated. Use allow_ssh_root_login property in EdgeNodeSettings section when creating transport nodes. ")
  public Boolean isAllowSshRootLogin() {
    return allowSshRootLogin;
  }

  public void setAllowSshRootLogin(Boolean allowSshRootLogin) {
    this.allowSshRootLogin = allowSshRootLogin;
  }

  public VsphereDeploymentConfig computeId(String computeId) {
    this.computeId = computeId;
    return this;
  }

   /**
   * The edge node vm will be deployed on the specified cluster or resourcepool. Note - all the hosts must have nsx fabric prepared in the specified cluster. 
   * @return computeId
  **/
  @Schema(required = true, description = "The edge node vm will be deployed on the specified cluster or resourcepool. Note - all the hosts must have nsx fabric prepared in the specified cluster. ")
  public String getComputeId() {
    return computeId;
  }

  public void setComputeId(String computeId) {
    this.computeId = computeId;
  }

  public VsphereDeploymentConfig searchDomains(List<String> searchDomains) {
    this.searchDomains = searchDomains;
    return this;
  }

  public VsphereDeploymentConfig addSearchDomainsItem(String searchDomainsItem) {
    if (this.searchDomains == null) {
      this.searchDomains = new ArrayList<String>();
    }
    this.searchDomains.add(searchDomainsItem);
    return this;
  }

   /**
   * List of domain names that are used to complete unqualified host names. This field is deprecated. Use search_domains property in EdgeNodeSettings section when creating or updating transport nodes. 
   * @return searchDomains
  **/
  @Schema(description = "List of domain names that are used to complete unqualified host names. This field is deprecated. Use search_domains property in EdgeNodeSettings section when creating or updating transport nodes. ")
  public List<String> getSearchDomains() {
    return searchDomains;
  }

  public void setSearchDomains(List<String> searchDomains) {
    this.searchDomains = searchDomains;
  }

  public VsphereDeploymentConfig vcId(String vcId) {
    this.vcId = vcId;
    return this;
  }

   /**
   * The vc specific identifiers will be resolved on this VC. So all other identifiers specified here must belong to this vcenter server. 
   * @return vcId
  **/
  @Schema(required = true, description = "The vc specific identifiers will be resolved on this VC. So all other identifiers specified here must belong to this vcenter server. ")
  public String getVcId() {
    return vcId;
  }

  public void setVcId(String vcId) {
    this.vcId = vcId;
  }

  public VsphereDeploymentConfig storageId(String storageId) {
    this.storageId = storageId;
    return this;
  }

   /**
   * The edge node vm will be deployed on the specified datastore. User must ensure that storage is accessible by the specified cluster/host. 
   * @return storageId
  **/
  @Schema(required = true, description = "The edge node vm will be deployed on the specified datastore. User must ensure that storage is accessible by the specified cluster/host. ")
  public String getStorageId() {
    return storageId;
  }

  public void setStorageId(String storageId) {
    this.storageId = storageId;
  }

  public VsphereDeploymentConfig defaultGatewayAddresses(List<String> defaultGatewayAddresses) {
    this.defaultGatewayAddresses = defaultGatewayAddresses;
    return this;
  }

  public VsphereDeploymentConfig addDefaultGatewayAddressesItem(String defaultGatewayAddressesItem) {
    if (this.defaultGatewayAddresses == null) {
      this.defaultGatewayAddresses = new ArrayList<String>();
    }
    this.defaultGatewayAddresses.add(defaultGatewayAddressesItem);
    return this;
  }

   /**
   * The default gateway for edge node must be specified if all the nodes it communicates with are not in the same subnet. Note: Only single IPv4 default gateway address is supported and it must belong to management network. 
   * @return defaultGatewayAddresses
  **/
  @Schema(description = "The default gateway for edge node must be specified if all the nodes it communicates with are not in the same subnet. Note: Only single IPv4 default gateway address is supported and it must belong to management network. ")
  public List<String> getDefaultGatewayAddresses() {
    return defaultGatewayAddresses;
  }

  public void setDefaultGatewayAddresses(List<String> defaultGatewayAddresses) {
    this.defaultGatewayAddresses = defaultGatewayAddresses;
  }

  public VsphereDeploymentConfig managementPortSubnets(List<IPSubnet> managementPortSubnets) {
    this.managementPortSubnets = managementPortSubnets;
    return this;
  }

  public VsphereDeploymentConfig addManagementPortSubnetsItem(IPSubnet managementPortSubnetsItem) {
    if (this.managementPortSubnets == null) {
      this.managementPortSubnets = new ArrayList<IPSubnet>();
    }
    this.managementPortSubnets.add(managementPortSubnetsItem);
    return this;
  }

   /**
   * IP Address and subnet configuration for the management port. Note: only one IPv4 address is supported for the management port. 
   * @return managementPortSubnets
  **/
  @Schema(description = "IP Address and subnet configuration for the management port. Note: only one IPv4 address is supported for the management port. ")
  public List<IPSubnet> getManagementPortSubnets() {
    return managementPortSubnets;
  }

  public void setManagementPortSubnets(List<IPSubnet> managementPortSubnets) {
    this.managementPortSubnets = managementPortSubnets;
  }

  public VsphereDeploymentConfig hostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

   /**
   * The edge node vm will be deployed on the specified Host within the cluster if host_id is specified. Note - User must ensure that storage and specified networks are accessible by this host. 
   * @return hostId
  **/
  @Schema(description = "The edge node vm will be deployed on the specified Host within the cluster if host_id is specified. Note - User must ensure that storage and specified networks are accessible by this host. ")
  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }

  public VsphereDeploymentConfig hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Host name or FQDN for edge node.
   * @return hostname
  **/
  @Schema(description = "Host name or FQDN for edge node.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VsphereDeploymentConfig vsphereDeploymentConfig = (VsphereDeploymentConfig) o;
    return Objects.equals(this.dataNetworkIds, vsphereDeploymentConfig.dataNetworkIds) &&
        Objects.equals(this.dnsServers, vsphereDeploymentConfig.dnsServers) &&
        Objects.equals(this.ntpServers, vsphereDeploymentConfig.ntpServers) &&
        Objects.equals(this.managementNetworkId, vsphereDeploymentConfig.managementNetworkId) &&
        Objects.equals(this.enableSsh, vsphereDeploymentConfig.enableSsh) &&
        Objects.equals(this.allowSshRootLogin, vsphereDeploymentConfig.allowSshRootLogin) &&
        Objects.equals(this.computeId, vsphereDeploymentConfig.computeId) &&
        Objects.equals(this.searchDomains, vsphereDeploymentConfig.searchDomains) &&
        Objects.equals(this.vcId, vsphereDeploymentConfig.vcId) &&
        Objects.equals(this.storageId, vsphereDeploymentConfig.storageId) &&
        Objects.equals(this.defaultGatewayAddresses, vsphereDeploymentConfig.defaultGatewayAddresses) &&
        Objects.equals(this.managementPortSubnets, vsphereDeploymentConfig.managementPortSubnets) &&
        Objects.equals(this.hostId, vsphereDeploymentConfig.hostId) &&
        Objects.equals(this.hostname, vsphereDeploymentConfig.hostname) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataNetworkIds, dnsServers, ntpServers, managementNetworkId, enableSsh, allowSshRootLogin, computeId, searchDomains, vcId, storageId, defaultGatewayAddresses, managementPortSubnets, hostId, hostname, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsphereDeploymentConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataNetworkIds: ").append(toIndentedString(dataNetworkIds)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
    sb.append("    managementNetworkId: ").append(toIndentedString(managementNetworkId)).append("\n");
    sb.append("    enableSsh: ").append(toIndentedString(enableSsh)).append("\n");
    sb.append("    allowSshRootLogin: ").append(toIndentedString(allowSshRootLogin)).append("\n");
    sb.append("    computeId: ").append(toIndentedString(computeId)).append("\n");
    sb.append("    searchDomains: ").append(toIndentedString(searchDomains)).append("\n");
    sb.append("    vcId: ").append(toIndentedString(vcId)).append("\n");
    sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
    sb.append("    defaultGatewayAddresses: ").append(toIndentedString(defaultGatewayAddresses)).append("\n");
    sb.append("    managementPortSubnets: ").append(toIndentedString(managementPortSubnets)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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
