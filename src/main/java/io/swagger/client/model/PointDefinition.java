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
import io.swagger.client.model.Tooltip;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Defines the point of a graph.
 */
@Schema(description = "Defines the point of a graph.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PointDefinition {
  @SerializedName("y_value")
  private String yValue = null;

  @SerializedName("field")
  private String field = null;

  @SerializedName("drilldown_id")
  private String drilldownId = null;

  @SerializedName("x_value")
  private String xValue = null;

  @SerializedName("navigation")
  private String navigation = null;

  @SerializedName("tooltip")
  private List<Tooltip> tooltip = null;

  public PointDefinition yValue(String yValue) {
    this.yValue = yValue;
    return this;
  }

   /**
   * Represents the variable for the Y value of points that are plotted on the graph.
   * @return yValue
  **/
  @Schema(required = true, description = "Represents the variable for the Y value of points that are plotted on the graph.")
  public String getYValue() {
    return yValue;
  }

  public void setYValue(String yValue) {
    this.yValue = yValue;
  }

  public PointDefinition field(String field) {
    this.field = field;
    return this;
  }

   /**
   * An expression that represents the points of the graph
   * @return field
  **/
  @Schema(required = true, description = "An expression that represents the points of the graph")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public PointDefinition drilldownId(String drilldownId) {
    this.drilldownId = drilldownId;
    return this;
  }

   /**
   * Id of drilldown widget, if any. Id should be a valid id of an existing widget. A widget is considered as drilldown widget when it is associated with any other widget and provides more detailed information about any data item from the parent widget.
   * @return drilldownId
  **/
  @Schema(description = "Id of drilldown widget, if any. Id should be a valid id of an existing widget. A widget is considered as drilldown widget when it is associated with any other widget and provides more detailed information about any data item from the parent widget.")
  public String getDrilldownId() {
    return drilldownId;
  }

  public void setDrilldownId(String drilldownId) {
    this.drilldownId = drilldownId;
  }

  public PointDefinition xValue(String xValue) {
    this.xValue = xValue;
    return this;
  }

   /**
   * Represents the variable for the X value of points that are plotted on the graph.
   * @return xValue
  **/
  @Schema(required = true, description = "Represents the variable for the X value of points that are plotted on the graph.")
  public String getXValue() {
    return xValue;
  }

  public void setXValue(String xValue) {
    this.xValue = xValue;
  }

  public PointDefinition navigation(String navigation) {
    this.navigation = navigation;
    return this;
  }

   /**
   * Hyperlink of the specified UI page that provides details.
   * @return navigation
  **/
  @Schema(description = "Hyperlink of the specified UI page that provides details.")
  public String getNavigation() {
    return navigation;
  }

  public void setNavigation(String navigation) {
    this.navigation = navigation;
  }

  public PointDefinition tooltip(List<Tooltip> tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  public PointDefinition addTooltipItem(Tooltip tooltipItem) {
    if (this.tooltip == null) {
      this.tooltip = new ArrayList<Tooltip>();
    }
    this.tooltip.add(tooltipItem);
    return this;
  }

   /**
   * Multi-line text to be shown on tooltip while hovering over the point of a graph.
   * @return tooltip
  **/
  @Schema(description = "Multi-line text to be shown on tooltip while hovering over the point of a graph.")
  public List<Tooltip> getTooltip() {
    return tooltip;
  }

  public void setTooltip(List<Tooltip> tooltip) {
    this.tooltip = tooltip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointDefinition pointDefinition = (PointDefinition) o;
    return Objects.equals(this.yValue, pointDefinition.yValue) &&
        Objects.equals(this.field, pointDefinition.field) &&
        Objects.equals(this.drilldownId, pointDefinition.drilldownId) &&
        Objects.equals(this.xValue, pointDefinition.xValue) &&
        Objects.equals(this.navigation, pointDefinition.navigation) &&
        Objects.equals(this.tooltip, pointDefinition.tooltip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yValue, field, drilldownId, xValue, navigation, tooltip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointDefinition {\n");
    
    sb.append("    yValue: ").append(toIndentedString(yValue)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    drilldownId: ").append(toIndentedString(drilldownId)).append("\n");
    sb.append("    xValue: ").append(toIndentedString(xValue)).append("\n");
    sb.append("    navigation: ").append(toIndentedString(navigation)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
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
