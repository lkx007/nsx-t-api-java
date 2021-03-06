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
import io.swagger.client.model.ForwarderZone;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ConditionalForwarderZone
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ConditionalForwarderZone extends ForwarderZone {
  @SerializedName("domain_names")
  private List<String> domainNames = new ArrayList<String>();

  public ConditionalForwarderZone domainNames(List<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public ConditionalForwarderZone addDomainNamesItem(String domainNamesItem) {
    this.domainNames.add(domainNamesItem);
    return this;
  }

   /**
   * A forwarder domain name should be a valid FQDN. If reverse lookup is needed for this zone, reverse lookup domain name like X.in-addr.arpa can be defined. Here the X represents a subnet. 
   * @return domainNames
  **/
  @Schema(required = true, description = "A forwarder domain name should be a valid FQDN. If reverse lookup is needed for this zone, reverse lookup domain name like X.in-addr.arpa can be defined. Here the X represents a subnet. ")
  public List<String> getDomainNames() {
    return domainNames;
  }

  public void setDomainNames(List<String> domainNames) {
    this.domainNames = domainNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalForwarderZone conditionalForwarderZone = (ConditionalForwarderZone) o;
    return Objects.equals(this.domainNames, conditionalForwarderZone.domainNames) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainNames, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalForwarderZone {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
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
