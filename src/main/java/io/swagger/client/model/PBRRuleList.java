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
import io.swagger.client.model.PBRRule;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PBRRuleList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PBRRuleList {
  @SerializedName("rules")
  private List<PBRRule> rules = new ArrayList<PBRRule>();

  public PBRRuleList rules(List<PBRRule> rules) {
    this.rules = rules;
    return this;
  }

  public PBRRuleList addRulesItem(PBRRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * List of PBR rules in the section.
   * @return rules
  **/
  @Schema(required = true, description = "List of PBR rules in the section.")
  public List<PBRRule> getRules() {
    return rules;
  }

  public void setRules(List<PBRRule> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PBRRuleList pbRRuleList = (PBRRuleList) o;
    return Objects.equals(this.rules, pbRRuleList.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PBRRuleList {\n");
    
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
