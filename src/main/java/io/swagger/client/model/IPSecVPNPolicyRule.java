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
import io.swagger.client.model.EmbeddedResource;
import io.swagger.client.model.IPSecVPNPolicySubnet;
import io.swagger.client.model.OwnerResourceLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * For policy-based IPsec VPNs, a security policy specifies as its action the VPN tunnel to be used for transit traffic that meets the policy&#x27;s match criteria.
 */
@Schema(description = "For policy-based IPsec VPNs, a security policy specifies as its action the VPN tunnel to be used for transit traffic that meets the policy's match criteria.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPSecVPNPolicyRule extends EmbeddedResource {
  @SerializedName("sources")
  private List<IPSecVPNPolicySubnet> sources = null;

  /**
   * PROTECT - Protect rules are defined per policy based IPSec VPN session. BYPASS - Bypass rules are defined per IPSec VPN service and affects all policy based IPSec VPN sessions. Bypass rules are prioritized over protect rules. 
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    PROTECT("PROTECT"),
    BYPASS("BYPASS");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("action")
  private ActionEnum action = ActionEnum.PROTECT;

  @SerializedName("enabled")
  private Boolean enabled = true;

  @SerializedName("logged")
  private Boolean logged = false;

  @SerializedName("id")
  private String id = null;

  @SerializedName("destinations")
  private List<IPSecVPNPolicySubnet> destinations = null;

  public IPSecVPNPolicyRule sources(List<IPSecVPNPolicySubnet> sources) {
    this.sources = sources;
    return this;
  }

  public IPSecVPNPolicyRule addSourcesItem(IPSecVPNPolicySubnet sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<IPSecVPNPolicySubnet>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * List of local subnets.
   * @return sources
  **/
  @Schema(description = "List of local subnets.")
  public List<IPSecVPNPolicySubnet> getSources() {
    return sources;
  }

  public void setSources(List<IPSecVPNPolicySubnet> sources) {
    this.sources = sources;
  }

   /**
   * PROTECT - Protect rules are defined per policy based IPSec VPN session. BYPASS - Bypass rules are defined per IPSec VPN service and affects all policy based IPSec VPN sessions. Bypass rules are prioritized over protect rules. 
   * @return action
  **/
  @Schema(description = "PROTECT - Protect rules are defined per policy based IPSec VPN session. BYPASS - Bypass rules are defined per IPSec VPN service and affects all policy based IPSec VPN sessions. Bypass rules are prioritized over protect rules. ")
  public ActionEnum getAction() {
    return action;
  }

  public IPSecVPNPolicyRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * A flag to enable/disable the policy rule.
   * @return enabled
  **/
  @Schema(description = "A flag to enable/disable the policy rule.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public IPSecVPNPolicyRule logged(Boolean logged) {
    this.logged = logged;
    return this;
  }

   /**
   * A flag to enable/disable the logging for the policy rule.
   * @return logged
  **/
  @Schema(description = "A flag to enable/disable the logging for the policy rule.")
  public Boolean isLogged() {
    return logged;
  }

  public void setLogged(Boolean logged) {
    this.logged = logged;
  }

  public IPSecVPNPolicyRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique policy id.
   * @return id
  **/
  @Schema(description = "Unique policy id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IPSecVPNPolicyRule destinations(List<IPSecVPNPolicySubnet> destinations) {
    this.destinations = destinations;
    return this;
  }

  public IPSecVPNPolicyRule addDestinationsItem(IPSecVPNPolicySubnet destinationsItem) {
    if (this.destinations == null) {
      this.destinations = new ArrayList<IPSecVPNPolicySubnet>();
    }
    this.destinations.add(destinationsItem);
    return this;
  }

   /**
   * List of peer subnets.
   * @return destinations
  **/
  @Schema(description = "List of peer subnets.")
  public List<IPSecVPNPolicySubnet> getDestinations() {
    return destinations;
  }

  public void setDestinations(List<IPSecVPNPolicySubnet> destinations) {
    this.destinations = destinations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPSecVPNPolicyRule ipSecVPNPolicyRule = (IPSecVPNPolicyRule) o;
    return Objects.equals(this.sources, ipSecVPNPolicyRule.sources) &&
        Objects.equals(this.action, ipSecVPNPolicyRule.action) &&
        Objects.equals(this.enabled, ipSecVPNPolicyRule.enabled) &&
        Objects.equals(this.logged, ipSecVPNPolicyRule.logged) &&
        Objects.equals(this.id, ipSecVPNPolicyRule.id) &&
        Objects.equals(this.destinations, ipSecVPNPolicyRule.destinations) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sources, action, enabled, logged, id, destinations, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSecVPNPolicyRule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    logged: ").append(toIndentedString(logged)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
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