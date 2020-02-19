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
import io.swagger.client.model.DhcpOption121;
import io.swagger.client.model.GenericDhcpOption;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Define DHCP options of the DHCP service.
 */
@Schema(description = "Define DHCP options of the DHCP service.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class DhcpOptions {
  @SerializedName("option121")
  private DhcpOption121 option121 = null;

  @SerializedName("others")
  private List<GenericDhcpOption> others = null;

  public DhcpOptions option121(DhcpOption121 option121) {
    this.option121 = option121;
    return this;
  }

   /**
   * Get option121
   * @return option121
  **/
  @Schema(description = "")
  public DhcpOption121 getOption121() {
    return option121;
  }

  public void setOption121(DhcpOption121 option121) {
    this.option121 = option121;
  }

  public DhcpOptions others(List<GenericDhcpOption> others) {
    this.others = others;
    return this;
  }

  public DhcpOptions addOthersItem(GenericDhcpOption othersItem) {
    if (this.others == null) {
      this.others = new ArrayList<GenericDhcpOption>();
    }
    this.others.add(othersItem);
    return this;
  }

   /**
   * To define DHCP options other than option 121 in generic format.
   * @return others
  **/
  @Schema(description = "To define DHCP options other than option 121 in generic format.")
  public List<GenericDhcpOption> getOthers() {
    return others;
  }

  public void setOthers(List<GenericDhcpOption> others) {
    this.others = others;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DhcpOptions dhcpOptions = (DhcpOptions) o;
    return Objects.equals(this.option121, dhcpOptions.option121) &&
        Objects.equals(this.others, dhcpOptions.others);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option121, others);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DhcpOptions {\n");
    
    sb.append("    option121: ").append(toIndentedString(option121)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
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