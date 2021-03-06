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
import io.swagger.client.model.ConditionalForwarderZone;
import io.swagger.client.model.ForwarderZone;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DnsForwarder
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DnsForwarder extends ManagedResource {
  @SerializedName("conditional_forwarders")
  private List<ConditionalForwarderZone> conditionalForwarders = null;

  @SerializedName("logical_router_id")
  private String logicalRouterId = null;

  @SerializedName("cache_size")
  private Integer cacheSize = 1024;

  @SerializedName("default_forwarder")
  private ForwarderZone defaultForwarder = null;

  /**
   * Log level of the DNS forwarder
   */
  @JsonAdapter(LogLevelEnum.Adapter.class)
  public enum LogLevelEnum {
    DEBUG("DEBUG"),
    INFO("INFO"),
    WARNING("WARNING"),
    ERROR("ERROR"),
    FATAL("FATAL");

    private String value;

    LogLevelEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LogLevelEnum fromValue(String text) {
      for (LogLevelEnum b : LogLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LogLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LogLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LogLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LogLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("log_level")
  private LogLevelEnum logLevel = LogLevelEnum.INFO;

  @SerializedName("enabled")
  private Boolean enabled = true;

  @SerializedName("listener_ip")
  private String listenerIp = null;

  public DnsForwarder conditionalForwarders(List<ConditionalForwarderZone> conditionalForwarders) {
    this.conditionalForwarders = conditionalForwarders;
    return this;
  }

  public DnsForwarder addConditionalForwardersItem(ConditionalForwarderZone conditionalForwardersItem) {
    if (this.conditionalForwarders == null) {
      this.conditionalForwarders = new ArrayList<ConditionalForwarderZone>();
    }
    this.conditionalForwarders.add(conditionalForwardersItem);
    return this;
  }

   /**
   * The conditional zone forwarders. During matching a zone forwarder, the DNS forwarder will use the conditional fowarder with the longest domain name that matches the query. 
   * @return conditionalForwarders
  **/
  @Schema(description = "The conditional zone forwarders. During matching a zone forwarder, the DNS forwarder will use the conditional fowarder with the longest domain name that matches the query. ")
  public List<ConditionalForwarderZone> getConditionalForwarders() {
    return conditionalForwarders;
  }

  public void setConditionalForwarders(List<ConditionalForwarderZone> conditionalForwarders) {
    this.conditionalForwarders = conditionalForwarders;
  }

  public DnsForwarder logicalRouterId(String logicalRouterId) {
    this.logicalRouterId = logicalRouterId;
    return this;
  }

   /**
   * Specify the LogicalRouter where the DnsForwarder runs. The HA mode of the hosting LogicalRouter must be Active/Standby. 
   * @return logicalRouterId
  **/
  @Schema(required = true, description = "Specify the LogicalRouter where the DnsForwarder runs. The HA mode of the hosting LogicalRouter must be Active/Standby. ")
  public String getLogicalRouterId() {
    return logicalRouterId;
  }

  public void setLogicalRouterId(String logicalRouterId) {
    this.logicalRouterId = logicalRouterId;
  }

  public DnsForwarder cacheSize(Integer cacheSize) {
    this.cacheSize = cacheSize;
    return this;
  }

   /**
   * One DNS answer cache entry will consume ~120 bytes. Hence 1 KB cache size can cache ~8 DNS answer entries, and the default 1024 KB cache size can hold ~8k DNS answer entries. 
   * minimum: 1
   * maximum: 16777216
   * @return cacheSize
  **/
  @Schema(description = "One DNS answer cache entry will consume ~120 bytes. Hence 1 KB cache size can cache ~8 DNS answer entries, and the default 1024 KB cache size can hold ~8k DNS answer entries. ")
  public Integer getCacheSize() {
    return cacheSize;
  }

  public void setCacheSize(Integer cacheSize) {
    this.cacheSize = cacheSize;
  }

  public DnsForwarder defaultForwarder(ForwarderZone defaultForwarder) {
    this.defaultForwarder = defaultForwarder;
    return this;
  }

   /**
   * Get defaultForwarder
   * @return defaultForwarder
  **/
  @Schema(required = true, description = "")
  public ForwarderZone getDefaultForwarder() {
    return defaultForwarder;
  }

  public void setDefaultForwarder(ForwarderZone defaultForwarder) {
    this.defaultForwarder = defaultForwarder;
  }

  public DnsForwarder logLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * Log level of the DNS forwarder
   * @return logLevel
  **/
  @Schema(description = "Log level of the DNS forwarder")
  public LogLevelEnum getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(LogLevelEnum logLevel) {
    this.logLevel = logLevel;
  }

  public DnsForwarder enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Flag to enable/disable the forwarder
   * @return enabled
  **/
  @Schema(description = "Flag to enable/disable the forwarder")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public DnsForwarder listenerIp(String listenerIp) {
    this.listenerIp = listenerIp;
    return this;
  }

   /**
   * The ip address the DNS forwarder listens on. It can be an ip address already owned by the logical-router uplink port or router-link, or a loopback port ip address. But it can not be a downlink port address. User needs to ensure the address is reachable via router or NAT from both client VMs and upstream servers. User will need to create Firewall rules if needed to allow such traffic on a Tier-1 or Tier-0. 
   * @return listenerIp
  **/
  @Schema(required = true, description = "The ip address the DNS forwarder listens on. It can be an ip address already owned by the logical-router uplink port or router-link, or a loopback port ip address. But it can not be a downlink port address. User needs to ensure the address is reachable via router or NAT from both client VMs and upstream servers. User will need to create Firewall rules if needed to allow such traffic on a Tier-1 or Tier-0. ")
  public String getListenerIp() {
    return listenerIp;
  }

  public void setListenerIp(String listenerIp) {
    this.listenerIp = listenerIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsForwarder dnsForwarder = (DnsForwarder) o;
    return Objects.equals(this.conditionalForwarders, dnsForwarder.conditionalForwarders) &&
        Objects.equals(this.logicalRouterId, dnsForwarder.logicalRouterId) &&
        Objects.equals(this.cacheSize, dnsForwarder.cacheSize) &&
        Objects.equals(this.defaultForwarder, dnsForwarder.defaultForwarder) &&
        Objects.equals(this.logLevel, dnsForwarder.logLevel) &&
        Objects.equals(this.enabled, dnsForwarder.enabled) &&
        Objects.equals(this.listenerIp, dnsForwarder.listenerIp) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionalForwarders, logicalRouterId, cacheSize, defaultForwarder, logLevel, enabled, listenerIp, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsForwarder {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    conditionalForwarders: ").append(toIndentedString(conditionalForwarders)).append("\n");
    sb.append("    logicalRouterId: ").append(toIndentedString(logicalRouterId)).append("\n");
    sb.append("    cacheSize: ").append(toIndentedString(cacheSize)).append("\n");
    sb.append("    defaultForwarder: ").append(toIndentedString(defaultForwarder)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    listenerIp: ").append(toIndentedString(listenerIp)).append("\n");
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
