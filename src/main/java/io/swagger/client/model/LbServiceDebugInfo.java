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
import io.swagger.client.model.LbAppProfile;
import io.swagger.client.model.LbClientSslProfile;
import io.swagger.client.model.LbMonitor;
import io.swagger.client.model.LbPersistenceProfile;
import io.swagger.client.model.LbPool;
import io.swagger.client.model.LbRule;
import io.swagger.client.model.LbServerSslProfile;
import io.swagger.client.model.LbService;
import io.swagger.client.model.LbTcpProfile;
import io.swagger.client.model.LbVirtualServer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The information for a given load balancer service could be used for debugging and troubleshooting. It includes load balancer service, associated virtual servers, associated pools, associated profiles such as persistence, SSL, application, associated monitors and associated rules. 
 */
@Schema(description = "The information for a given load balancer service could be used for debugging and troubleshooting. It includes load balancer service, associated virtual servers, associated pools, associated profiles such as persistence, SSL, application, associated monitors and associated rules. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbServiceDebugInfo {
  @SerializedName("pools")
  private List<LbPool> pools = null;

  @SerializedName("tcp_profiles")
  private List<LbTcpProfile> tcpProfiles = null;

  @SerializedName("virtual_servers")
  private List<LbVirtualServer> virtualServers = null;

  @SerializedName("client_ssl_profiles")
  private List<LbClientSslProfile> clientSslProfiles = null;

  @SerializedName("server_ssl_profiles")
  private List<LbServerSslProfile> serverSslProfiles = null;

  @SerializedName("service")
  private LbService service = null;

  @SerializedName("rules")
  private List<LbRule> rules = null;

  @SerializedName("application_profiles")
  private List<LbAppProfile> applicationProfiles = null;

  @SerializedName("persistence_profiles")
  private List<LbPersistenceProfile> persistenceProfiles = null;

  @SerializedName("monitors")
  private List<LbMonitor> monitors = null;

   /**
   * The pools which are associated to the given load balancer service would be included. The pools could be defined in virtual server default pool, sorry pool or load balancer rule action. 
   * @return pools
  **/
  @Schema(description = "The pools which are associated to the given load balancer service would be included. The pools could be defined in virtual server default pool, sorry pool or load balancer rule action. ")
  public List<LbPool> getPools() {
    return pools;
  }

   /**
   * The TCP profiles are associated to virtual servers 
   * @return tcpProfiles
  **/
  @Schema(description = "The TCP profiles are associated to virtual servers ")
  public List<LbTcpProfile> getTcpProfiles() {
    return tcpProfiles;
  }

   /**
   * The virtual servers which are associated to the given load balancer service would be included. 
   * @return virtualServers
  **/
  @Schema(description = "The virtual servers which are associated to the given load balancer service would be included. ")
  public List<LbVirtualServer> getVirtualServers() {
    return virtualServers;
  }

   /**
   * The client SSL profiles are associated to virtual servers 
   * @return clientSslProfiles
  **/
  @Schema(description = "The client SSL profiles are associated to virtual servers ")
  public List<LbClientSslProfile> getClientSslProfiles() {
    return clientSslProfiles;
  }

   /**
   * The server SSL profiles are associated to virtual servers 
   * @return serverSslProfiles
  **/
  @Schema(description = "The server SSL profiles are associated to virtual servers ")
  public List<LbServerSslProfile> getServerSslProfiles() {
    return serverSslProfiles;
  }

  public LbServiceDebugInfo service(LbService service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @Schema(description = "")
  public LbService getService() {
    return service;
  }

  public void setService(LbService service) {
    this.service = service;
  }

   /**
   * The load balancer rules are associated to virtual servers 
   * @return rules
  **/
  @Schema(description = "The load balancer rules are associated to virtual servers ")
  public List<LbRule> getRules() {
    return rules;
  }

   /**
   * The application profiles are associated to virtual servers 
   * @return applicationProfiles
  **/
  @Schema(description = "The application profiles are associated to virtual servers ")
  public List<LbAppProfile> getApplicationProfiles() {
    return applicationProfiles;
  }

   /**
   * The persistence profiles are associated to virtual servers 
   * @return persistenceProfiles
  **/
  @Schema(description = "The persistence profiles are associated to virtual servers ")
  public List<LbPersistenceProfile> getPersistenceProfiles() {
    return persistenceProfiles;
  }

   /**
   * The load balancer monitors are associated to pools. 
   * @return monitors
  **/
  @Schema(description = "The load balancer monitors are associated to pools. ")
  public List<LbMonitor> getMonitors() {
    return monitors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbServiceDebugInfo lbServiceDebugInfo = (LbServiceDebugInfo) o;
    return Objects.equals(this.pools, lbServiceDebugInfo.pools) &&
        Objects.equals(this.tcpProfiles, lbServiceDebugInfo.tcpProfiles) &&
        Objects.equals(this.virtualServers, lbServiceDebugInfo.virtualServers) &&
        Objects.equals(this.clientSslProfiles, lbServiceDebugInfo.clientSslProfiles) &&
        Objects.equals(this.serverSslProfiles, lbServiceDebugInfo.serverSslProfiles) &&
        Objects.equals(this.service, lbServiceDebugInfo.service) &&
        Objects.equals(this.rules, lbServiceDebugInfo.rules) &&
        Objects.equals(this.applicationProfiles, lbServiceDebugInfo.applicationProfiles) &&
        Objects.equals(this.persistenceProfiles, lbServiceDebugInfo.persistenceProfiles) &&
        Objects.equals(this.monitors, lbServiceDebugInfo.monitors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pools, tcpProfiles, virtualServers, clientSslProfiles, serverSslProfiles, service, rules, applicationProfiles, persistenceProfiles, monitors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbServiceDebugInfo {\n");
    
    sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
    sb.append("    tcpProfiles: ").append(toIndentedString(tcpProfiles)).append("\n");
    sb.append("    virtualServers: ").append(toIndentedString(virtualServers)).append("\n");
    sb.append("    clientSslProfiles: ").append(toIndentedString(clientSslProfiles)).append("\n");
    sb.append("    serverSslProfiles: ").append(toIndentedString(serverSslProfiles)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    applicationProfiles: ").append(toIndentedString(applicationProfiles)).append("\n");
    sb.append("    persistenceProfiles: ").append(toIndentedString(persistenceProfiles)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
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
