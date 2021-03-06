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
import io.swagger.client.model.DSRuleState;
import io.swagger.client.model.PendingChange;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * RuleState
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RuleState extends DSRuleState {
  @SerializedName("pending_change_list")
  private List<PendingChange> pendingChangeList = null;

  public RuleState pendingChangeList(List<PendingChange> pendingChangeList) {
    this.pendingChangeList = pendingChangeList;
    return this;
  }

  public RuleState addPendingChangeListItem(PendingChange pendingChangeListItem) {
    if (this.pendingChangeList == null) {
      this.pendingChangeList = new ArrayList<PendingChange>();
    }
    this.pendingChangeList.add(pendingChangeListItem);
    return this;
  }

   /**
   * Pending changes to be realized.
   * @return pendingChangeList
  **/
  @Schema(description = "Pending changes to be realized.")
  public List<PendingChange> getPendingChangeList() {
    return pendingChangeList;
  }

  public void setPendingChangeList(List<PendingChange> pendingChangeList) {
    this.pendingChangeList = pendingChangeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleState ruleState = (RuleState) o;
    return Objects.equals(this.pendingChangeList, ruleState.pendingChangeList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendingChangeList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleState {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pendingChangeList: ").append(toIndentedString(pendingChangeList)).append("\n");
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
