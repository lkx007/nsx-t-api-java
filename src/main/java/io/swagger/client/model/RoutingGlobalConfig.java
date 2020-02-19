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
import io.swagger.client.model.GlobalConfigs;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NSX global configs for Routing
 */
@Schema(description = "NSX global configs for Routing")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RoutingGlobalConfig extends GlobalConfigs {
  @SerializedName("logical_uplink_mtu")
  private Integer logicalUplinkMtu = 1500;

  /**
   * This setting does not restrict configuration as per other modes. But the forwarding will only work as per the mode set here.
   */
  @JsonAdapter(L3ForwardingModeEnum.Adapter.class)
  public enum L3ForwardingModeEnum {
    ONLY("IPV4_ONLY"),
    AND_IPV6("IPV4_AND_IPV6");

    private String value;

    L3ForwardingModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static L3ForwardingModeEnum fromValue(String text) {
      for (L3ForwardingModeEnum b : L3ForwardingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<L3ForwardingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final L3ForwardingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public L3ForwardingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return L3ForwardingModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("l3_forwarding_mode")
  private L3ForwardingModeEnum l3ForwardingMode = L3ForwardingModeEnum.ONLY;

  public RoutingGlobalConfig logicalUplinkMtu(Integer logicalUplinkMtu) {
    this.logicalUplinkMtu = logicalUplinkMtu;
    return this;
  }

   /**
   * This is the global default MTU for all the logical uplinks in a NSX domain. Currently logical uplink MTU can only be set globally and applies to the entire NSX domain. There is no option to override this value at transport zone level or transport node level. If this value is not set, the default value of 1500 will be used.
   * @return logicalUplinkMtu
  **/
  @Schema(description = "This is the global default MTU for all the logical uplinks in a NSX domain. Currently logical uplink MTU can only be set globally and applies to the entire NSX domain. There is no option to override this value at transport zone level or transport node level. If this value is not set, the default value of 1500 will be used.")
  public Integer getLogicalUplinkMtu() {
    return logicalUplinkMtu;
  }

  public void setLogicalUplinkMtu(Integer logicalUplinkMtu) {
    this.logicalUplinkMtu = logicalUplinkMtu;
  }

  public RoutingGlobalConfig l3ForwardingMode(L3ForwardingModeEnum l3ForwardingMode) {
    this.l3ForwardingMode = l3ForwardingMode;
    return this;
  }

   /**
   * This setting does not restrict configuration as per other modes. But the forwarding will only work as per the mode set here.
   * @return l3ForwardingMode
  **/
  @Schema(required = true, description = "This setting does not restrict configuration as per other modes. But the forwarding will only work as per the mode set here.")
  public L3ForwardingModeEnum getL3ForwardingMode() {
    return l3ForwardingMode;
  }

  public void setL3ForwardingMode(L3ForwardingModeEnum l3ForwardingMode) {
    this.l3ForwardingMode = l3ForwardingMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingGlobalConfig routingGlobalConfig = (RoutingGlobalConfig) o;
    return Objects.equals(this.logicalUplinkMtu, routingGlobalConfig.logicalUplinkMtu) &&
        Objects.equals(this.l3ForwardingMode, routingGlobalConfig.l3ForwardingMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalUplinkMtu, l3ForwardingMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingGlobalConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    logicalUplinkMtu: ").append(toIndentedString(logicalUplinkMtu)).append("\n");
    sb.append("    l3ForwardingMode: ").append(toIndentedString(l3ForwardingMode)).append("\n");
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