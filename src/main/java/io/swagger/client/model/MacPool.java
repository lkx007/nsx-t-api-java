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
import io.swagger.client.model.MacRange;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A collection of ranges of MAC addresses
 */
@Schema(description = "A collection of ranges of MAC addresses")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class MacPool extends ManagedResource {
  @SerializedName("ranges")
  private List<MacRange> ranges = new ArrayList<MacRange>();

  public MacPool ranges(List<MacRange> ranges) {
    this.ranges = ranges;
    return this;
  }

  public MacPool addRangesItem(MacRange rangesItem) {
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * Array of ranges for MAC addresses
   * @return ranges
  **/
  @Schema(required = true, description = "Array of ranges for MAC addresses")
  public List<MacRange> getRanges() {
    return ranges;
  }

  public void setRanges(List<MacRange> ranges) {
    this.ranges = ranges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MacPool macPool = (MacPool) o;
    return Objects.equals(this.ranges, macPool.ranges) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranges, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MacPool {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
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