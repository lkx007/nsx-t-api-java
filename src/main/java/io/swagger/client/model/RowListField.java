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
 * Root of the api result set for forming rows.
 */
@Schema(description = "Root of the api result set for forming rows.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RowListField {
  @SerializedName("alias")
  private String alias = null;

  @SerializedName("path")
  private String path = null;

  public RowListField alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Short name or alias of row list field, if any. If unspecified, the row list field can be referenced by its index in the array of row list fields as $&lt;index&gt; (for example, $0).
   * @return alias
  **/
  @Schema(description = "Short name or alias of row list field, if any. If unspecified, the row list field can be referenced by its index in the array of row list fields as $<index> (for example, $0).")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public RowListField path(String path) {
    this.path = path;
    return this;
  }

   /**
   * JSON path to the root of the api result set for forming rows.
   * @return path
  **/
  @Schema(required = true, description = "JSON path to the root of the api result set for forming rows.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowListField rowListField = (RowListField) o;
    return Objects.equals(this.alias, rowListField.alias) &&
        Objects.equals(this.path, rowListField.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowListField {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
