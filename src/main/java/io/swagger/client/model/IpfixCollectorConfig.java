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
import io.swagger.client.model.IpfixCollector;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This managed entity contains a set of IPFIX collectors. 
 */
@Schema(description = "This managed entity contains a set of IPFIX collectors. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IpfixCollectorConfig extends ManagedResource {
  @SerializedName("collectors")
  private List<IpfixCollector> collectors = new ArrayList<IpfixCollector>();

  public IpfixCollectorConfig collectors(List<IpfixCollector> collectors) {
    this.collectors = collectors;
    return this;
  }

  public IpfixCollectorConfig addCollectorsItem(IpfixCollector collectorsItem) {
    this.collectors.add(collectorsItem);
    return this;
  }

   /**
   * IPFIX Collectors
   * @return collectors
  **/
  @Schema(required = true, description = "IPFIX Collectors")
  public List<IpfixCollector> getCollectors() {
    return collectors;
  }

  public void setCollectors(List<IpfixCollector> collectors) {
    this.collectors = collectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpfixCollectorConfig ipfixCollectorConfig = (IpfixCollectorConfig) o;
    return Objects.equals(this.collectors, ipfixCollectorConfig.collectors) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectors, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpfixCollectorConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    collectors: ").append(toIndentedString(collectors)).append("\n");
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
