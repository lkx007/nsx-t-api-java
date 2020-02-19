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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BgpRouteAggregation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class BgpRouteAggregation {
  @SerializedName("summary_only")
  private Boolean summaryOnly = true;

  @SerializedName("prefix")
  private String prefix = null;

  public BgpRouteAggregation summaryOnly(Boolean summaryOnly) {
    this.summaryOnly = summaryOnly;
    return this;
  }

   /**
   * Flag to send only summarized route
   * @return summaryOnly
  **/
  @Schema(description = "Flag to send only summarized route")
  public Boolean isSummaryOnly() {
    return summaryOnly;
  }

  public void setSummaryOnly(Boolean summaryOnly) {
    this.summaryOnly = summaryOnly;
  }

  public BgpRouteAggregation prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * cidr of the aggregate address
   * @return prefix
  **/
  @Schema(required = true, description = "cidr of the aggregate address")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpRouteAggregation bgpRouteAggregation = (BgpRouteAggregation) o;
    return Objects.equals(this.summaryOnly, bgpRouteAggregation.summaryOnly) &&
        Objects.equals(this.prefix, bgpRouteAggregation.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaryOnly, prefix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpRouteAggregation {\n");
    
    sb.append("    summaryOnly: ").append(toIndentedString(summaryOnly)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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