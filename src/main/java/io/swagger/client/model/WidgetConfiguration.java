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
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Describes the configuration of a widget to be displayed on the dashboard. WidgetConfiguration is a base type that provides attributes of a widget in-general.
 */
@Schema(description = "Describes the configuration of a widget to be displayed on the dashboard. WidgetConfiguration is a base type that provides attributes of a widget in-general.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")

public class WidgetConfiguration extends ManagedResource {
  /**
   * Supported visualization types are LabelValueConfiguration, DonutConfiguration, GridConfiguration, StatsConfiguration, MultiWidgetConfiguration, GraphConfiguration and ContainerConfiguration.
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    LABELVALUECONFIGURATION("LabelValueConfiguration"),
    DONUTCONFIGURATION("DonutConfiguration"),
    MULTIWIDGETCONFIGURATION("MultiWidgetConfiguration"),
    CONTAINERCONFIGURATION("ContainerConfiguration"),
    STATSCONFIGURATION("StatsConfiguration"),
    GRIDCONFIGURATION("GridConfiguration"),
    GRAPHCONFIGURATION("GraphConfiguration");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceTypeEnum fromValue(String text) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResourceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("resource_type")
  private ResourceTypeEnum resourceType = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("datasources")
  private List<Datasource> datasources = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("icons")
  private List<Icon> icons = null;

  @SerializedName("shared")
  private Boolean shared = null;

  @SerializedName("footer")
  private Footer footer = null;

  @SerializedName("drilldown_id")
  private String drilldownId = null;

  @SerializedName("is_drilldown")
  private Boolean isDrilldown = false;

  @SerializedName("legend")
  private Legend legend = null;

  public WidgetConfiguration() {
    this.resource_type = this.getClass().getSimpleName();
  }
   /**
   * Supported visualization types are LabelValueConfiguration, DonutConfiguration, GridConfiguration, StatsConfiguration, MultiWidgetConfiguration, GraphConfiguration and ContainerConfiguration.
   * @return resourceType
  **/
  @Schema(required = true, description = "Supported visualization types are LabelValueConfiguration, DonutConfiguration, GridConfiguration, StatsConfiguration, MultiWidgetConfiguration, GraphConfiguration and ContainerConfiguration.")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public WidgetConfiguration displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Title of the widget. If display_name is omitted, the widget will be shown without a title.
   * @return displayName
  **/
  @Schema(description = "Title of the widget. If display_name is omitted, the widget will be shown without a title.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public WidgetConfiguration datasources(List<Datasource> datasources) {
    this.datasources = datasources;
    return this;
  }

  public WidgetConfiguration addDatasourcesItem(Datasource datasourcesItem) {
    if (this.datasources == null) {
      this.datasources = new ArrayList<Datasource>();
    }
    this.datasources.add(datasourcesItem);
    return this;
  }

   /**
   * The &#x27;datasources&#x27; represent the sources from which data will be fetched. Currently, only NSX-API is supported as a &#x27;default&#x27; datasource. An example of specifying &#x27;default&#x27; datasource along with the urls to fetch data from is given at &#x27;example_request&#x27; section of &#x27;CreateWidgetConfiguration&#x27; API.
   * @return datasources
  **/
  @Schema(description = "The 'datasources' represent the sources from which data will be fetched. Currently, only NSX-API is supported as a 'default' datasource. An example of specifying 'default' datasource along with the urls to fetch data from is given at 'example_request' section of 'CreateWidgetConfiguration' API.")
  public List<Datasource> getDatasources() {
    return datasources;
  }

  public void setDatasources(List<Datasource> datasources) {
    this.datasources = datasources;
  }

  public WidgetConfiguration weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Specify relavite weight in WidgetItem for placement in a view. Please see WidgetItem for details.
   * @return weight
  **/
  @Schema(description = "Specify relavite weight in WidgetItem for placement in a view. Please see WidgetItem for details.")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public WidgetConfiguration icons(List<Icon> icons) {
    this.icons = icons;
    return this;
  }

  public WidgetConfiguration addIconsItem(Icon iconsItem) {
    if (this.icons == null) {
      this.icons = new ArrayList<Icon>();
    }
    this.icons.add(iconsItem);
    return this;
  }

   /**
   * Icons to be applied at dashboard for widgets and UI elements.
   * @return icons
  **/
  @Schema(description = "Icons to be applied at dashboard for widgets and UI elements.")
  public List<Icon> getIcons() {
    return icons;
  }

  public void setIcons(List<Icon> icons) {
    this.icons = icons;
  }

  public WidgetConfiguration shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * Please use the property &#x27;shared&#x27; of View instead of this. The widgets of a shared view are visible to other users.
   * @return shared
  **/
  @Schema(description = "Please use the property 'shared' of View instead of this. The widgets of a shared view are visible to other users.")
  public Boolean isShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public WidgetConfiguration footer(Footer footer) {
    this.footer = footer;
    return this;
  }

   /**
   * Get footer
   * @return footer
  **/
  @Schema(description = "")
  public Footer getFooter() {
    return footer;
  }

  public void setFooter(Footer footer) {
    this.footer = footer;
  }

  public WidgetConfiguration drilldownId(String drilldownId) {
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

  public WidgetConfiguration isDrilldown(Boolean isDrilldown) {
    this.isDrilldown = isDrilldown;
    return this;
  }

   /**
   * Set to true if this widget should be used as a drilldown.
   * @return isDrilldown
  **/
  @Schema(description = "Set to true if this widget should be used as a drilldown.")
  public Boolean isIsDrilldown() {
    return isDrilldown;
  }

  public void setIsDrilldown(Boolean isDrilldown) {
    this.isDrilldown = isDrilldown;
  }

  public WidgetConfiguration legend(Legend legend) {
    this.legend = legend;
    return this;
  }

   /**
   * Get legend
   * @return legend
  **/
  @Schema(description = "")
  public Legend getLegend() {
    return legend;
  }

  public void setLegend(Legend legend) {
    this.legend = legend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetConfiguration widgetConfiguration = (WidgetConfiguration) o;
    return Objects.equals(this.resourceType, widgetConfiguration.resourceType) &&
        Objects.equals(this.displayName, widgetConfiguration.displayName) &&
        Objects.equals(this.datasources, widgetConfiguration.datasources) &&
        Objects.equals(this.weight, widgetConfiguration.weight) &&
        Objects.equals(this.icons, widgetConfiguration.icons) &&
        Objects.equals(this.shared, widgetConfiguration.shared) &&
        Objects.equals(this.footer, widgetConfiguration.footer) &&
        Objects.equals(this.drilldownId, widgetConfiguration.drilldownId) &&
        Objects.equals(this.isDrilldown, widgetConfiguration.isDrilldown) &&
        Objects.equals(this.legend, widgetConfiguration.legend) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, displayName, datasources, weight, icons, shared, footer, drilldownId, isDrilldown, legend, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    icons: ").append(toIndentedString(icons)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    drilldownId: ").append(toIndentedString(drilldownId)).append("\n");
    sb.append("    isDrilldown: ").append(toIndentedString(isDrilldown)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
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
