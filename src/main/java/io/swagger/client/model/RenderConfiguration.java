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
import io.swagger.client.model.Icon;
import io.swagger.client.model.Tooltip;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Render configuration to be applied to the widget.
 */
@Schema(description = "Render configuration to be applied to the widget.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RenderConfiguration {
  /**
   * The color to use when rendering an entity. For example, set color as &#x27;RED&#x27; to render a portion of donut in red.
   */
  @JsonAdapter(ColorEnum.Adapter.class)
  public enum ColorEnum {
    GREY("GREY"),
    DARK_GREY("DARK_GREY"),
    LIGHT_GREY("LIGHT_GREY"),
    SKY_BLUE("SKY_BLUE"),
    BLUE("BLUE"),
    GREEN("GREEN"),
    YELLOW("YELLOW"),
    RED("RED"),
    DARK_RED("DARK_RED");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ColorEnum fromValue(String text) {
      for (ColorEnum b : ColorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ColorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("color")
  private ColorEnum color = null;

  @SerializedName("condition")
  private String condition = null;

  @SerializedName("display_value")
  private String displayValue = null;

  @SerializedName("tooltip")
  private List<Tooltip> tooltip = null;

  @SerializedName("icons")
  private List<Icon> icons = null;

  public RenderConfiguration color(ColorEnum color) {
    this.color = color;
    return this;
  }

   /**
   * The color to use when rendering an entity. For example, set color as &#x27;RED&#x27; to render a portion of donut in red.
   * @return color
  **/
  @Schema(description = "The color to use when rendering an entity. For example, set color as 'RED' to render a portion of donut in red.")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public RenderConfiguration condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * If the condition is met then the rendering specified for the condition will be applied. Examples of expression syntax are provided under &#x27;example_request&#x27; section of &#x27;CreateWidgetConfiguration&#x27; API.
   * @return condition
  **/
  @Schema(description = "If the condition is met then the rendering specified for the condition will be applied. Examples of expression syntax are provided under 'example_request' section of 'CreateWidgetConfiguration' API.")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public RenderConfiguration displayValue(String displayValue) {
    this.displayValue = displayValue;
    return this;
  }

   /**
   * If specified, overrides the field value. This can be used to display a meaningful value in situations where field value is not available or not configured.
   * @return displayValue
  **/
  @Schema(description = "If specified, overrides the field value. This can be used to display a meaningful value in situations where field value is not available or not configured.")
  public String getDisplayValue() {
    return displayValue;
  }

  public void setDisplayValue(String displayValue) {
    this.displayValue = displayValue;
  }

  public RenderConfiguration tooltip(List<Tooltip> tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  public RenderConfiguration addTooltipItem(Tooltip tooltipItem) {
    if (this.tooltip == null) {
      this.tooltip = new ArrayList<Tooltip>();
    }
    this.tooltip.add(tooltipItem);
    return this;
  }

   /**
   * Multi-line text to be shown on tooltip while hovering over the UI element if the condition is met.
   * @return tooltip
  **/
  @Schema(description = "Multi-line text to be shown on tooltip while hovering over the UI element if the condition is met.")
  public List<Tooltip> getTooltip() {
    return tooltip;
  }

  public void setTooltip(List<Tooltip> tooltip) {
    this.tooltip = tooltip;
  }

  public RenderConfiguration icons(List<Icon> icons) {
    this.icons = icons;
    return this;
  }

  public RenderConfiguration addIconsItem(Icon iconsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderConfiguration renderConfiguration = (RenderConfiguration) o;
    return Objects.equals(this.color, renderConfiguration.color) &&
        Objects.equals(this.condition, renderConfiguration.condition) &&
        Objects.equals(this.displayValue, renderConfiguration.displayValue) &&
        Objects.equals(this.tooltip, renderConfiguration.tooltip) &&
        Objects.equals(this.icons, renderConfiguration.icons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, condition, displayValue, tooltip, icons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderConfiguration {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    icons: ").append(toIndentedString(icons)).append("\n");
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
