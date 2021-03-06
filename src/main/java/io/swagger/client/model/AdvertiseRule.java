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
import io.swagger.client.model.AdvertisementRuleFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AdvertiseRule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class AdvertiseRule {
  /**
   * ALLOW action enables the advertisment and DENY action disables the advertisement of a filtered routes to the connected TIER0 router.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    DENY("DENY"),
    ALLOW("ALLOW");

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
  private ActionEnum action = ActionEnum.ALLOW;

  @SerializedName("rule_filter")
  private AdvertisementRuleFilter ruleFilter = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("networks")
  private List<String> networks = new ArrayList<String>();

  @SerializedName("description")
  private String description = null;

  public AdvertiseRule action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * ALLOW action enables the advertisment and DENY action disables the advertisement of a filtered routes to the connected TIER0 router.
   * @return action
  **/
  @Schema(description = "ALLOW action enables the advertisment and DENY action disables the advertisement of a filtered routes to the connected TIER0 router.")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public AdvertiseRule ruleFilter(AdvertisementRuleFilter ruleFilter) {
    this.ruleFilter = ruleFilter;
    return this;
  }

   /**
   * Get ruleFilter
   * @return ruleFilter
  **/
  @Schema(description = "")
  public AdvertisementRuleFilter getRuleFilter() {
    return ruleFilter;
  }

  public void setRuleFilter(AdvertisementRuleFilter ruleFilter) {
    this.ruleFilter = ruleFilter;
  }

  public AdvertiseRule displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name
   * @return displayName
  **/
  @Schema(description = "Display name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AdvertiseRule networks(List<String> networks) {
    this.networks = networks;
    return this;
  }

  public AdvertiseRule addNetworksItem(String networksItem) {
    this.networks.add(networksItem);
    return this;
  }

   /**
   * network(CIDR) to be routed
   * @return networks
  **/
  @Schema(required = true, description = "network(CIDR) to be routed")
  public List<String> getNetworks() {
    return networks;
  }

  public void setNetworks(List<String> networks) {
    this.networks = networks;
  }

  public AdvertiseRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @Schema(description = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiseRule advertiseRule = (AdvertiseRule) o;
    return Objects.equals(this.action, advertiseRule.action) &&
        Objects.equals(this.ruleFilter, advertiseRule.ruleFilter) &&
        Objects.equals(this.displayName, advertiseRule.displayName) &&
        Objects.equals(this.networks, advertiseRule.networks) &&
        Objects.equals(this.description, advertiseRule.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, ruleFilter, displayName, networks, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiseRule {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    ruleFilter: ").append(toIndentedString(ruleFilter)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
