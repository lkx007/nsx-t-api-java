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
 * A list of fields to include in query results
 */
@Schema(description = "A list of fields to include in query results")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IncludedFieldsParameters {
  @SerializedName("included_fields")
  private String includedFields = null;

  public IncludedFieldsParameters includedFields(String includedFields) {
    this.includedFields = includedFields;
    return this;
  }

   /**
   * Comma separated list of fields that should be included in query result
   * @return includedFields
  **/
  @Schema(description = "Comma separated list of fields that should be included in query result")
  public String getIncludedFields() {
    return includedFields;
  }

  public void setIncludedFields(String includedFields) {
    this.includedFields = includedFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludedFieldsParameters includedFieldsParameters = (IncludedFieldsParameters) o;
    return Objects.equals(this.includedFields, includedFieldsParameters.includedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includedFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludedFieldsParameters {\n");
    
    sb.append("    includedFields: ").append(toIndentedString(includedFields)).append("\n");
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
