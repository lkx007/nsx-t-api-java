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
import io.swagger.client.model.IPSecVPNSession;
import io.swagger.client.model.TcpMssClamping;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A Policy Based VPN requires to define protect rules that match local and peer subnets. IPSec security associations is negotiated for each pair of local and peer subnet.
 */
@Schema(description = "A Policy Based VPN requires to define protect rules that match local and peer subnets. IPSec security associations is negotiated for each pair of local and peer subnet.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PolicyBasedIPSecVPNSession extends IPSecVPNSession {
  @SerializedName("policy_rules")
  private List<IPSecVPNPolicyRule> policyRules = new ArrayList<IPSecVPNPolicyRule>();

  public PolicyBasedIPSecVPNSession policyRules(List<IPSecVPNPolicyRule> policyRules) {
    this.policyRules = policyRules;
    return this;
  }

  public PolicyBasedIPSecVPNSession addPolicyRulesItem(IPSecVPNPolicyRule policyRulesItem) {
    this.policyRules.add(policyRulesItem);
    return this;
  }

   /**
   * Policy rules
   * @return policyRules
  **/
  @Schema(required = true, description = "Policy rules")
  public List<IPSecVPNPolicyRule> getPolicyRules() {
    return policyRules;
  }

  public void setPolicyRules(List<IPSecVPNPolicyRule> policyRules) {
    this.policyRules = policyRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyBasedIPSecVPNSession policyBasedIPSecVPNSession = (PolicyBasedIPSecVPNSession) o;
    return Objects.equals(this.policyRules, policyBasedIPSecVPNSession.policyRules) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyRules, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyBasedIPSecVPNSession {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    policyRules: ").append(toIndentedString(policyRules)).append("\n");
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
