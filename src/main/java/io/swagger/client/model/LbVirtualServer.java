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
import io.swagger.client.model.ClientSslProfileBinding;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.ServerSslProfileBinding;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LbVirtualServer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbVirtualServer extends ManagedResource {
  /**
   * Assigned Internet Protocol in IP header, TCP, UDP are supported. 
   */
  @JsonAdapter(IpProtocolEnum.Adapter.class)
  public enum IpProtocolEnum {
    TCP("TCP"),
    UDP("UDP");

    private String value;

    IpProtocolEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IpProtocolEnum fromValue(String text) {
      for (IpProtocolEnum b : IpProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IpProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IpProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IpProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IpProtocolEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("ip_protocol")
  private IpProtocolEnum ipProtocol = IpProtocolEnum.TCP;

  @SerializedName("server_tcp_profile_id")
  private String serverTcpProfileId = null;

  @SerializedName("sorry_pool_id")
  private String sorryPoolId = null;

  @SerializedName("port")
  private String port = null;

  @SerializedName("server_ssl_profile_binding")
  private ServerSslProfileBinding serverSslProfileBinding = null;

  @SerializedName("pool_id")
  private String poolId = null;

  @SerializedName("client_tcp_profile_id")
  private String clientTcpProfileId = null;

  @SerializedName("default_pool_member_port")
  private String defaultPoolMemberPort = null;

  @SerializedName("access_log_enabled")
  private Boolean accessLogEnabled = false;

  @SerializedName("application_profile_id")
  private String applicationProfileId = null;

  @SerializedName("max_concurrent_connections")
  private Long maxConcurrentConnections = null;

  @SerializedName("rule_ids")
  private List<String> ruleIds = null;

  @SerializedName("max_new_connection_rate")
  private Long maxNewConnectionRate = null;

  @SerializedName("persistence_profile_id")
  private String persistenceProfileId = null;

  @SerializedName("client_ssl_profile_binding")
  private ClientSslProfileBinding clientSslProfileBinding = null;

  @SerializedName("default_pool_member_ports")
  private List<String> defaultPoolMemberPorts = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("ports")
  private List<String> ports = null;

  @SerializedName("enabled")
  private Boolean enabled = true;

  public LbVirtualServer ipProtocol(IpProtocolEnum ipProtocol) {
    this.ipProtocol = ipProtocol;
    return this;
  }

   /**
   * Assigned Internet Protocol in IP header, TCP, UDP are supported. 
   * @return ipProtocol
  **/
  @Schema(description = "Assigned Internet Protocol in IP header, TCP, UDP are supported. ")
  public IpProtocolEnum getIpProtocol() {
    return ipProtocol;
  }

  public void setIpProtocol(IpProtocolEnum ipProtocol) {
    this.ipProtocol = ipProtocol;
  }

  public LbVirtualServer serverTcpProfileId(String serverTcpProfileId) {
    this.serverTcpProfileId = serverTcpProfileId;
    return this;
  }

   /**
   * Only L7 virtual server could be configured with customized server side TCP profile. 
   * @return serverTcpProfileId
  **/
  @Schema(description = "Only L7 virtual server could be configured with customized server side TCP profile. ")
  public String getServerTcpProfileId() {
    return serverTcpProfileId;
  }

  public void setServerTcpProfileId(String serverTcpProfileId) {
    this.serverTcpProfileId = serverTcpProfileId;
  }

  public LbVirtualServer sorryPoolId(String sorryPoolId) {
    this.sorryPoolId = sorryPoolId;
    return this;
  }

   /**
   * When load balancer can not select a backend server to serve the request in default pool or pool in rules, the request would be served by sorry server pool. 
   * @return sorryPoolId
  **/
  @Schema(description = "When load balancer can not select a backend server to serve the request in default pool or pool in rules, the request would be served by sorry server pool. ")
  public String getSorryPoolId() {
    return sorryPoolId;
  }

  public void setSorryPoolId(String sorryPoolId) {
    this.sorryPoolId = sorryPoolId;
  }

  public LbVirtualServer port(String port) {
    this.port = port;
    return this;
  }

   /**
   * This is a deprecated property, please use &#x27;ports&#x27; instead. Port setting could be single port for both L7 mode and L4 mode. For L4 mode, a single port range is also supported. The port setting could be a single port or port range such as \&quot;80\&quot;, \&quot;1234-1236\&quot;. If port is configured and ports are not specified, both port and ports in response payload would return the same port value. If both port and ports are configured, ports setting would take effect with higher priority. 
   * @return port
  **/
  @Schema(description = "This is a deprecated property, please use 'ports' instead. Port setting could be single port for both L7 mode and L4 mode. For L4 mode, a single port range is also supported. The port setting could be a single port or port range such as \"80\", \"1234-1236\". If port is configured and ports are not specified, both port and ports in response payload would return the same port value. If both port and ports are configured, ports setting would take effect with higher priority. ")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public LbVirtualServer serverSslProfileBinding(ServerSslProfileBinding serverSslProfileBinding) {
    this.serverSslProfileBinding = serverSslProfileBinding;
    return this;
  }

   /**
   * Get serverSslProfileBinding
   * @return serverSslProfileBinding
  **/
  @Schema(description = "")
  public ServerSslProfileBinding getServerSslProfileBinding() {
    return serverSslProfileBinding;
  }

  public void setServerSslProfileBinding(ServerSslProfileBinding serverSslProfileBinding) {
    this.serverSslProfileBinding = serverSslProfileBinding;
  }

  public LbVirtualServer poolId(String poolId) {
    this.poolId = poolId;
    return this;
  }

   /**
   * The server pool(LbPool) contains backend servers. Server pool consists of one or more servers, also referred to as pool members, that are similarly configured and are running the same application. 
   * @return poolId
  **/
  @Schema(description = "The server pool(LbPool) contains backend servers. Server pool consists of one or more servers, also referred to as pool members, that are similarly configured and are running the same application. ")
  public String getPoolId() {
    return poolId;
  }

  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  public LbVirtualServer clientTcpProfileId(String clientTcpProfileId) {
    this.clientTcpProfileId = clientTcpProfileId;
    return this;
  }

   /**
   * Only L7 virtual server could be configured with customized client side TCP profile. 
   * @return clientTcpProfileId
  **/
  @Schema(description = "Only L7 virtual server could be configured with customized client side TCP profile. ")
  public String getClientTcpProfileId() {
    return clientTcpProfileId;
  }

  public void setClientTcpProfileId(String clientTcpProfileId) {
    this.clientTcpProfileId = clientTcpProfileId;
  }

  public LbVirtualServer defaultPoolMemberPort(String defaultPoolMemberPort) {
    this.defaultPoolMemberPort = defaultPoolMemberPort;
    return this;
  }

   /**
   * This is a deprecated property, please use &#x27;default_pool_member_ports&#x27; instead. If default_pool_member_port is configured and default_pool_member_ports are not specified, both default_pool_member_port and default_pool_member_ports in response payload would return the same port value. If both are specified, default_pool_member_ports setting would take effect with higher priority. 
   * @return defaultPoolMemberPort
  **/
  @Schema(description = "This is a deprecated property, please use 'default_pool_member_ports' instead. If default_pool_member_port is configured and default_pool_member_ports are not specified, both default_pool_member_port and default_pool_member_ports in response payload would return the same port value. If both are specified, default_pool_member_ports setting would take effect with higher priority. ")
  public String getDefaultPoolMemberPort() {
    return defaultPoolMemberPort;
  }

  public void setDefaultPoolMemberPort(String defaultPoolMemberPort) {
    this.defaultPoolMemberPort = defaultPoolMemberPort;
  }

  public LbVirtualServer accessLogEnabled(Boolean accessLogEnabled) {
    this.accessLogEnabled = accessLogEnabled;
    return this;
  }

   /**
   * Whether access log is enabled
   * @return accessLogEnabled
  **/
  @Schema(description = "Whether access log is enabled")
  public Boolean isAccessLogEnabled() {
    return accessLogEnabled;
  }

  public void setAccessLogEnabled(Boolean accessLogEnabled) {
    this.accessLogEnabled = accessLogEnabled;
  }

  public LbVirtualServer applicationProfileId(String applicationProfileId) {
    this.applicationProfileId = applicationProfileId;
    return this;
  }

   /**
   * The application profile defines the application protocol characteristics. It is used to influence how load balancing is performed. Currently, LbFastTCPProfile, LbFastUDPProfile and LbHttpProfile, etc are supported. 
   * @return applicationProfileId
  **/
  @Schema(required = true, description = "The application profile defines the application protocol characteristics. It is used to influence how load balancing is performed. Currently, LbFastTCPProfile, LbFastUDPProfile and LbHttpProfile, etc are supported. ")
  public String getApplicationProfileId() {
    return applicationProfileId;
  }

  public void setApplicationProfileId(String applicationProfileId) {
    this.applicationProfileId = applicationProfileId;
  }

  public LbVirtualServer maxConcurrentConnections(Long maxConcurrentConnections) {
    this.maxConcurrentConnections = maxConcurrentConnections;
    return this;
  }

   /**
   * To ensure one virtual server does not over consume resources, affecting other applications hosted on the same LBS, connections to a virtual server can be capped. If it is not specified, it means that connections are unlimited. 
   * minimum: 1
   * maximum: 2147483647
   * @return maxConcurrentConnections
  **/
  @Schema(description = "To ensure one virtual server does not over consume resources, affecting other applications hosted on the same LBS, connections to a virtual server can be capped. If it is not specified, it means that connections are unlimited. ")
  public Long getMaxConcurrentConnections() {
    return maxConcurrentConnections;
  }

  public void setMaxConcurrentConnections(Long maxConcurrentConnections) {
    this.maxConcurrentConnections = maxConcurrentConnections;
  }

  public LbVirtualServer ruleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public LbVirtualServer addRuleIdsItem(String ruleIdsItem) {
    if (this.ruleIds == null) {
      this.ruleIds = new ArrayList<String>();
    }
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

   /**
   * Load balancer rules allow customization of load balancing behavior using match/action rules. Currently, load balancer rules are supported for only layer 7 virtual servers with LbHttpProfile. 
   * @return ruleIds
  **/
  @Schema(description = "Load balancer rules allow customization of load balancing behavior using match/action rules. Currently, load balancer rules are supported for only layer 7 virtual servers with LbHttpProfile. ")
  public List<String> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
  }

  public LbVirtualServer maxNewConnectionRate(Long maxNewConnectionRate) {
    this.maxNewConnectionRate = maxNewConnectionRate;
    return this;
  }

   /**
   * To ensure one virtual server does not over consume resources, connections to a member can be rate limited. If it is not specified, it means that connection rate is unlimited. 
   * minimum: 1
   * maximum: 2147483647
   * @return maxNewConnectionRate
  **/
  @Schema(description = "To ensure one virtual server does not over consume resources, connections to a member can be rate limited. If it is not specified, it means that connection rate is unlimited. ")
  public Long getMaxNewConnectionRate() {
    return maxNewConnectionRate;
  }

  public void setMaxNewConnectionRate(Long maxNewConnectionRate) {
    this.maxNewConnectionRate = maxNewConnectionRate;
  }

  public LbVirtualServer persistenceProfileId(String persistenceProfileId) {
    this.persistenceProfileId = persistenceProfileId;
    return this;
  }

   /**
   * Persistence profile is used to allow related client connections to be sent to the same backend server. 
   * @return persistenceProfileId
  **/
  @Schema(description = "Persistence profile is used to allow related client connections to be sent to the same backend server. ")
  public String getPersistenceProfileId() {
    return persistenceProfileId;
  }

  public void setPersistenceProfileId(String persistenceProfileId) {
    this.persistenceProfileId = persistenceProfileId;
  }

  public LbVirtualServer clientSslProfileBinding(ClientSslProfileBinding clientSslProfileBinding) {
    this.clientSslProfileBinding = clientSslProfileBinding;
    return this;
  }

   /**
   * Get clientSslProfileBinding
   * @return clientSslProfileBinding
  **/
  @Schema(description = "")
  public ClientSslProfileBinding getClientSslProfileBinding() {
    return clientSslProfileBinding;
  }

  public void setClientSslProfileBinding(ClientSslProfileBinding clientSslProfileBinding) {
    this.clientSslProfileBinding = clientSslProfileBinding;
  }

  public LbVirtualServer defaultPoolMemberPorts(List<String> defaultPoolMemberPorts) {
    this.defaultPoolMemberPorts = defaultPoolMemberPorts;
    return this;
  }

  public LbVirtualServer addDefaultPoolMemberPortsItem(String defaultPoolMemberPortsItem) {
    if (this.defaultPoolMemberPorts == null) {
      this.defaultPoolMemberPorts = new ArrayList<String>();
    }
    this.defaultPoolMemberPorts.add(defaultPoolMemberPortsItem);
    return this;
  }

   /**
   * If default_pool_member_ports are configured, both default_pool_member_port and default_pool_member_ports in the response payload would include port settings, notice that the value of default_pool_member_port is the first element of default_pool_member_ports. 
   * @return defaultPoolMemberPorts
  **/
  @Schema(description = "If default_pool_member_ports are configured, both default_pool_member_port and default_pool_member_ports in the response payload would include port settings, notice that the value of default_pool_member_port is the first element of default_pool_member_ports. ")
  public List<String> getDefaultPoolMemberPorts() {
    return defaultPoolMemberPorts;
  }

  public void setDefaultPoolMemberPorts(List<String> defaultPoolMemberPorts) {
    this.defaultPoolMemberPorts = defaultPoolMemberPorts;
  }

  public LbVirtualServer ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * virtual server IP address
   * @return ipAddress
  **/
  @Schema(required = true, description = "virtual server IP address")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public LbVirtualServer ports(List<String> ports) {
    this.ports = ports;
    return this;
  }

  public LbVirtualServer addPortsItem(String portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<String>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Port setting could be a single port for both L7 mode and L4 mode. For L4 mode, multiple ports or port ranges are also supported such as \&quot;80\&quot;, \&quot;443\&quot;, \&quot;1234-1236\&quot;. If ports is configured, both port and ports in the response payload would include port settings, notice that the port field value is the first element of ports. 
   * @return ports
  **/
  @Schema(description = "Port setting could be a single port for both L7 mode and L4 mode. For L4 mode, multiple ports or port ranges are also supported such as \"80\", \"443\", \"1234-1236\". If ports is configured, both port and ports in the response payload would include port settings, notice that the port field value is the first element of ports. ")
  public List<String> getPorts() {
    return ports;
  }

  public void setPorts(List<String> ports) {
    this.ports = ports;
  }

  public LbVirtualServer enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * whether the virtual server is enabled
   * @return enabled
  **/
  @Schema(description = "whether the virtual server is enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbVirtualServer lbVirtualServer = (LbVirtualServer) o;
    return Objects.equals(this.ipProtocol, lbVirtualServer.ipProtocol) &&
        Objects.equals(this.serverTcpProfileId, lbVirtualServer.serverTcpProfileId) &&
        Objects.equals(this.sorryPoolId, lbVirtualServer.sorryPoolId) &&
        Objects.equals(this.port, lbVirtualServer.port) &&
        Objects.equals(this.serverSslProfileBinding, lbVirtualServer.serverSslProfileBinding) &&
        Objects.equals(this.poolId, lbVirtualServer.poolId) &&
        Objects.equals(this.clientTcpProfileId, lbVirtualServer.clientTcpProfileId) &&
        Objects.equals(this.defaultPoolMemberPort, lbVirtualServer.defaultPoolMemberPort) &&
        Objects.equals(this.accessLogEnabled, lbVirtualServer.accessLogEnabled) &&
        Objects.equals(this.applicationProfileId, lbVirtualServer.applicationProfileId) &&
        Objects.equals(this.maxConcurrentConnections, lbVirtualServer.maxConcurrentConnections) &&
        Objects.equals(this.ruleIds, lbVirtualServer.ruleIds) &&
        Objects.equals(this.maxNewConnectionRate, lbVirtualServer.maxNewConnectionRate) &&
        Objects.equals(this.persistenceProfileId, lbVirtualServer.persistenceProfileId) &&
        Objects.equals(this.clientSslProfileBinding, lbVirtualServer.clientSslProfileBinding) &&
        Objects.equals(this.defaultPoolMemberPorts, lbVirtualServer.defaultPoolMemberPorts) &&
        Objects.equals(this.ipAddress, lbVirtualServer.ipAddress) &&
        Objects.equals(this.ports, lbVirtualServer.ports) &&
        Objects.equals(this.enabled, lbVirtualServer.enabled) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipProtocol, serverTcpProfileId, sorryPoolId, port, serverSslProfileBinding, poolId, clientTcpProfileId, defaultPoolMemberPort, accessLogEnabled, applicationProfileId, maxConcurrentConnections, ruleIds, maxNewConnectionRate, persistenceProfileId, clientSslProfileBinding, defaultPoolMemberPorts, ipAddress, ports, enabled, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbVirtualServer {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ipProtocol: ").append(toIndentedString(ipProtocol)).append("\n");
    sb.append("    serverTcpProfileId: ").append(toIndentedString(serverTcpProfileId)).append("\n");
    sb.append("    sorryPoolId: ").append(toIndentedString(sorryPoolId)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serverSslProfileBinding: ").append(toIndentedString(serverSslProfileBinding)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    clientTcpProfileId: ").append(toIndentedString(clientTcpProfileId)).append("\n");
    sb.append("    defaultPoolMemberPort: ").append(toIndentedString(defaultPoolMemberPort)).append("\n");
    sb.append("    accessLogEnabled: ").append(toIndentedString(accessLogEnabled)).append("\n");
    sb.append("    applicationProfileId: ").append(toIndentedString(applicationProfileId)).append("\n");
    sb.append("    maxConcurrentConnections: ").append(toIndentedString(maxConcurrentConnections)).append("\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
    sb.append("    maxNewConnectionRate: ").append(toIndentedString(maxNewConnectionRate)).append("\n");
    sb.append("    persistenceProfileId: ").append(toIndentedString(persistenceProfileId)).append("\n");
    sb.append("    clientSslProfileBinding: ").append(toIndentedString(clientSslProfileBinding)).append("\n");
    sb.append("    defaultPoolMemberPorts: ").append(toIndentedString(defaultPoolMemberPorts)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
