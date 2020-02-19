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
import io.swagger.client.model.AdvertiseRule;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AdvertiseRuleList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class AdvertiseRuleList extends ManagedResource {
  @SerializedName("rules")
  private List<AdvertiseRule> rules = null;

  @SerializedName("logical_router_id")
  private String logicalRouterId = null;

  public AdvertiseRuleList rules(List<AdvertiseRule> rules) {
    this.rules = rules;
    return this;
  }

  public AdvertiseRuleList addRulesItem(AdvertiseRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<AdvertiseRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * List of advertisement rules
   * @return rules
  **/
  @Schema(description = "List of advertisement rules")
  public List<AdvertiseRule> getRules() {
    return rules;
  }

  public void setRules(List<AdvertiseRule> rules) {
    this.rules = rules;
  }

   /**
   * Logical router id
   * @return logicalRouterId
  **/
  @Schema(description = "Logical router id")
  public String getLogicalRouterId() {
    return logicalRouterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiseRuleList advertiseRuleList = (AdvertiseRuleList) o;
    return Objects.equals(this.rules, advertiseRuleList.rules) &&
        Objects.equals(this.logicalRouterId, advertiseRuleList.logicalRouterId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, logicalRouterId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiseRuleList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    logicalRouterId: ").append(toIndentedString(logicalRouterId)).append("\n");
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