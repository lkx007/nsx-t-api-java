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
import io.swagger.client.model.Resource;
import io.swagger.client.model.ResourceLink;
import io.swagger.client.model.SelfResourceLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * Base class for list results from collections
 */
@Schema(description = "Base class for list results from collections")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ListResult extends Resource {
  @SerializedName("cursor")
  private String cursor = null;

  @SerializedName("sort_ascending")
  private Boolean sortAscending = null;

  @SerializedName("sort_by")
  private String sortBy = null;

  @SerializedName("result_count")
  private Long resultCount = null;

   /**
   * Opaque cursor to be used for getting next page of records (supplied by current result page)
   * @return cursor
  **/
  @Schema(description = "Opaque cursor to be used for getting next page of records (supplied by current result page)")
  public String getCursor() {
    return cursor;
  }

   /**
   * If true, results are sorted in ascending order
   * @return sortAscending
  **/
  @Schema(description = "If true, results are sorted in ascending order")
  public Boolean isSortAscending() {
    return sortAscending;
  }

   /**
   * Field by which records are sorted
   * @return sortBy
  **/
  @Schema(description = "Field by which records are sorted")
  public String getSortBy() {
    return sortBy;
  }

   /**
   * Count of results found (across all pages), set only on first page
   * @return resultCount
  **/
  @Schema(description = "Count of results found (across all pages), set only on first page")
  public Long getResultCount() {
    return resultCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResult listResult = (ListResult) o;
    return Objects.equals(this.cursor, listResult.cursor) &&
        Objects.equals(this.sortAscending, listResult.sortAscending) &&
        Objects.equals(this.sortBy, listResult.sortBy) &&
        Objects.equals(this.resultCount, listResult.resultCount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, sortAscending, sortBy, resultCount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    sortAscending: ").append(toIndentedString(sortAscending)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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
