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
import io.swagger.client.model.ResourceReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Resources to take action on
 */
@Schema(description = "Resources to take action on")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SelectableResourceReference extends ResourceReference {
  @SerializedName("selected")
  private Boolean selected = null;

  public SelectableResourceReference selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Set to true if this resource has been selected to be acted upon
   * @return selected
  **/
  @Schema(required = true, description = "Set to true if this resource has been selected to be acted upon")
  public Boolean isSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectableResourceReference selectableResourceReference = (SelectableResourceReference) o;
    return Objects.equals(this.selected, selectableResourceReference.selected) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selected, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectableResourceReference {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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
