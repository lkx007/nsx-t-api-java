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
 * Parameters that affect how list results are processed
 */
@Schema(description = "Parameters that affect how list results are processed")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ListResultQueryParameters {
  @SerializedName("fields")
  private String fields = null;

  public ListResultQueryParameters fields(String fields) {
    this.fields = fields;
    return this;
  }

   /**
   * Comma-separated field names to include in query result
   * @return fields
  **/
  @Schema(description = "Comma-separated field names to include in query result")
  public String getFields() {
    return fields;
  }

  public void setFields(String fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResultQueryParameters listResultQueryParameters = (ListResultQueryParameters) o;
    return Objects.equals(this.fields, listResultQueryParameters.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResultQueryParameters {\n");
    
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
