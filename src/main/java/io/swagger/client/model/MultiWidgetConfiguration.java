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
import io.swagger.client.model.Datasource;
import io.swagger.client.model.Footer;
import io.swagger.client.model.Icon;
import io.swagger.client.model.Legend;
import io.swagger.client.model.WidgetConfiguration;
import io.swagger.client.model.WidgetItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Combines two or more widgetconfigurations into a multi-widget
 */
@Schema(description = "Combines two or more widgetconfigurations into a multi-widget")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class MultiWidgetConfiguration extends WidgetConfiguration {
  @SerializedName("widgets")
  private List<WidgetItem> widgets = new ArrayList<WidgetItem>();

  @SerializedName("navigation")
  private String navigation = null;

  public MultiWidgetConfiguration widgets(List<WidgetItem> widgets) {
    this.widgets = widgets;
    return this;
  }

  public MultiWidgetConfiguration addWidgetsItem(WidgetItem widgetsItem) {
    this.widgets.add(widgetsItem);
    return this;
  }

   /**
   * Array of widgets that are part of the multi-widget.
   * @return widgets
  **/
  @Schema(required = true, description = "Array of widgets that are part of the multi-widget.")
  public List<WidgetItem> getWidgets() {
    return widgets;
  }

  public void setWidgets(List<WidgetItem> widgets) {
    this.widgets = widgets;
  }

  public MultiWidgetConfiguration navigation(String navigation) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiWidgetConfiguration multiWidgetConfiguration = (MultiWidgetConfiguration) o;
    return Objects.equals(this.widgets, multiWidgetConfiguration.widgets) &&
        Objects.equals(this.navigation, multiWidgetConfiguration.navigation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(widgets, navigation, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiWidgetConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
    sb.append("    navigation: ").append(toIndentedString(navigation)).append("\n");
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
