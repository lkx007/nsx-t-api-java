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
import io.swagger.client.model.IPSecVPNPolicyRule;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Create and manage IPSec VPN service for given logical router.
 */
@Schema(description = "Create and manage IPSec VPN service for given logical router.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPSecVPNService extends ManagedResource {
  /**
   * Log level for internet key exchange (IKE).
   */
  @JsonAdapter(IkeLogLevelEnum.Adapter.class)
  public enum IkeLogLevelEnum {
    DEBUG("DEBUG"),
    INFO("INFO"),
    WARN("WARN"),
    ERROR("ERROR"),
    EMERGENCY("EMERGENCY");

    private String value;

    IkeLogLevelEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IkeLogLevelEnum fromValue(String text) {
      for (IkeLogLevelEnum b : IkeLogLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IkeLogLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IkeLogLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IkeLogLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IkeLogLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("ike_log_level")
  private IkeLogLevelEnum ikeLogLevel = IkeLogLevelEnum.INFO;

  @SerializedName("logical_router_id")
  private String logicalRouterId = null;

  @SerializedName("bypass_rules")
  private List<IPSecVPNPolicyRule> bypassRules = null;

  @SerializedName("enabled")
  private Boolean enabled = true;

  public IPSecVPNService ikeLogLevel(IkeLogLevelEnum ikeLogLevel) {
    this.ikeLogLevel = ikeLogLevel;
    return this;
  }

   /**
   * Log level for internet key exchange (IKE).
   * @return ikeLogLevel
  **/
  @Schema(description = "Log level for internet key exchange (IKE).")
  public IkeLogLevelEnum getIkeLogLevel() {
    return ikeLogLevel;
  }

  public void setIkeLogLevel(IkeLogLevelEnum ikeLogLevel) {
    this.ikeLogLevel = ikeLogLevel;
  }

  public IPSecVPNService logicalRouterId(String logicalRouterId) {
    this.logicalRouterId = logicalRouterId;
    return this;
  }

   /**
   * Logical router id.
   * @return logicalRouterId
  **/
  @Schema(required = true, description = "Logical router id.")
  public String getLogicalRouterId() {
    return logicalRouterId;
  }

  public void setLogicalRouterId(String logicalRouterId) {
    this.logicalRouterId = logicalRouterId;
  }

  public IPSecVPNService bypassRules(List<IPSecVPNPolicyRule> bypassRules) {
    this.bypassRules = bypassRules;
    return this;
  }

  public IPSecVPNService addBypassRulesItem(IPSecVPNPolicyRule bypassRulesItem) {
    if (this.bypassRules == null) {
      this.bypassRules = new ArrayList<IPSecVPNPolicyRule>();
    }
    this.bypassRules.add(bypassRulesItem);
    return this;
  }

   /**
   * Bypass policy rules are configured using VPN service. Bypass rules always have higher priority over protect rules and they affect all policy based vpn sessions associated with the IPSec VPN service. Protect rules are defined per policy based vpn session. 
   * @return bypassRules
  **/
  @Schema(description = "Bypass policy rules are configured using VPN service. Bypass rules always have higher priority over protect rules and they affect all policy based vpn sessions associated with the IPSec VPN service. Protect rules are defined per policy based vpn session. ")
  public List<IPSecVPNPolicyRule> getBypassRules() {
    return bypassRules;
  }

  public void setBypassRules(List<IPSecVPNPolicyRule> bypassRules) {
    this.bypassRules = bypassRules;
  }

  public IPSecVPNService enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * If true, enable VPN services for given logical router.
   * @return enabled
  **/
  @Schema(description = "If true, enable VPN services for given logical router.")
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
    IPSecVPNService ipSecVPNService = (IPSecVPNService) o;
    return Objects.equals(this.ikeLogLevel, ipSecVPNService.ikeLogLevel) &&
        Objects.equals(this.logicalRouterId, ipSecVPNService.logicalRouterId) &&
        Objects.equals(this.bypassRules, ipSecVPNService.bypassRules) &&
        Objects.equals(this.enabled, ipSecVPNService.enabled) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ikeLogLevel, logicalRouterId, bypassRules, enabled, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSecVPNService {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ikeLogLevel: ").append(toIndentedString(ikeLogLevel)).append("\n");
    sb.append("    logicalRouterId: ").append(toIndentedString(logicalRouterId)).append("\n");
    sb.append("    bypassRules: ").append(toIndentedString(bypassRules)).append("\n");
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
