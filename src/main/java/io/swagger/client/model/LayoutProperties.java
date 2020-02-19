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
 * Properties of the layout of a container or widget
 */
@Schema(description = "Properties of the layout of a container or widget")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LayoutProperties {
  @SerializedName("num_rows")
  private Integer numRows = null;

  @SerializedName("num_columns")
  private Integer numColumns = null;

  public LayoutProperties numRows(Integer numRows) {
    this.numRows = numRows;
    return this;
  }

   /**
   * Describes the number of rows of grid layout of a container or widget. This property is applicable for grid layout only.
   * @return numRows
  **/
  @Schema(description = "Describes the number of rows of grid layout of a container or widget. This property is applicable for grid layout only.")
  public Integer getNumRows() {
    return numRows;
  }

  public void setNumRows(Integer numRows) {
    this.numRows = numRows;
  }

  public LayoutProperties numColumns(Integer numColumns) {
    this.numColumns = numColumns;
    return this;
  }

   /**
   * Describes the number of columns of grid layout of a container or widget. This property is applicable for grid layout only.
   * @return numColumns
  **/
  @Schema(description = "Describes the number of columns of grid layout of a container or widget. This property is applicable for grid layout only.")
  public Integer getNumColumns() {
    return numColumns;
  }

  public void setNumColumns(Integer numColumns) {
    this.numColumns = numColumns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayoutProperties layoutProperties = (LayoutProperties) o;
    return Objects.equals(this.numRows, layoutProperties.numRows) &&
        Objects.equals(this.numColumns, layoutProperties.numColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numRows, numColumns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayoutProperties {\n");
    
    sb.append("    numRows: ").append(toIndentedString(numRows)).append("\n");
    sb.append("    numColumns: ").append(toIndentedString(numColumns)).append("\n");
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
