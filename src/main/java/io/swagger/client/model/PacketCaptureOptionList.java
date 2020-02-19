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
import io.swagger.client.model.ListResult;
import io.swagger.client.model.PacketCaptureOption;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of packet capture options to filter data in capture process.
 */
@Schema(description = "List of packet capture options to filter data in capture process.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PacketCaptureOptionList extends ListResult {
  @SerializedName("values")
  private List<PacketCaptureOption> values = null;

  public PacketCaptureOptionList values(List<PacketCaptureOption> values) {
    this.values = values;
    return this;
  }

  public PacketCaptureOptionList addValuesItem(PacketCaptureOption valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<PacketCaptureOption>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Packet capture option collection
   * @return values
  **/
  @Schema(description = "Packet capture option collection")
  public List<PacketCaptureOption> getValues() {
    return values;
  }

  public void setValues(List<PacketCaptureOption> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PacketCaptureOptionList packetCaptureOptionList = (PacketCaptureOptionList) o;
    return Objects.equals(this.values, packetCaptureOptionList.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PacketCaptureOptionList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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