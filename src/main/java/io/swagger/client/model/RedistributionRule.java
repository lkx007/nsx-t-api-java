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
import java.util.ArrayList;
import java.util.List;
/**
 * RedistributionRule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RedistributionRule {
  /**
   * Types of route to redistribute over routing protocols. STATIC type is deprecated, use T0_STATIC instead. T0_STATIC type should be used to redistribute user added static routes. NSX_CONNECTED type is deprecated, use T0_CONNECTED instead. For backward compatibility when NSX_CONNECTED is selected, we will redistribute downlink port subnets for TIER0 LR. T0_CONNECTED type should be used to redistribute all port subnets including uplink, downlink, CSP and loopback for TIER0 LR. NSX_STATIC type is deprecated, use T1_STATIC instead. For backward compatibility when NSX_STATIC is selected, we will redistribute static, CSP and downlink port subnets advertised by TIER1 LR. T1_STATIC type should be used to redistribute static subnets advertised by TIER1 LR. T0_UPLINK type should be used to redistribute uplink port subnets on TIER0 LR. T0_DOWNLINK type should be used to redistribute downlink port subnets on TIER0 LR. T0_ROUTER_LINK type should be used to redistribute router link port subnets on TIER0 LR T0_CSP type should be used to redistribute centralised service port subnets on TIER0 LR. T0_LOOPBACK type should be used to redistribute loopback port subnets on TIER0 LR. T0_DNS_FORWARDER_IP type should be used to redistribute DNS forwarder subnets on TIER0 LR. T0_IPSEC_LOCAL_IP type should be used to redistribute IPSec subnets on TIER0 LR. TIER0_NAT type is deprecated, use T0_NAT instead. T0_NAT type should be used to redistribute NAT IPs owned by TIER0 logical router. TIER1_NAT type is deprecated, use T1_NAT instead. T1_NAT type should be used to redistribute NAT IP subnets advertised by TIER1 LR. TIER1_LB_VIP type is deprecated,use T1_LB_VIP instead. T1_LB_VIP type should be used to redistribute LB VIP IP subnets advertised by TIER1 LR. TIER1_LB_SNAT type is deprecated, use T1_NAT instead. T1_LB_SNAT type should be used to redistribute LB SNAT IP subnets advertised by TIER1 LR. T1_DNS_FORWARDER_IP type should be used to redistribute DNS forwarder subnets advertised by TIER1 LR. T1_CONNECTED type should be used to redistribute downlink and CSP port subnets advertised by TIER1 LR. T1_DOWNLINK type should be used to redistribute downlink port subnets advertised by TIER1 LR. T1_CSP type should be used to redistribute centralised service port subnets advertised by TIER1 LR. BGP type should be used to redistribute routes learned via BGP. T1_IPSEC_LOCAL_IP type should be used to redistribute IPSec VPN local endpoint subnets advertised by TIER1 LR. 
   */
  @JsonAdapter(SourcesEnum.Adapter.class)
  public enum SourcesEnum {
    STATIC("STATIC"),
    T0_STATIC("T0_STATIC"),
    NSX_CONNECTED("NSX_CONNECTED"),
    T0_CONNECTED("T0_CONNECTED"),
    NSX_STATIC("NSX_STATIC"),
    T1_STATIC("T1_STATIC"),
    T0_UPLINK("T0_UPLINK"),
    T0_DOWNLINK("T0_DOWNLINK"),
    T0_ROUTER_LINK("T0_ROUTER_LINK"),
    T0_CSP("T0_CSP"),
    T0_LOOPBACK("T0_LOOPBACK"),
    T0_DNS_FORWARDER_IP("T0_DNS_FORWARDER_IP"),
    T0_IPSEC_LOCAL_IP("T0_IPSEC_LOCAL_IP"),
    TIER0_NAT("TIER0_NAT"),
    T0_NAT("T0_NAT"),
    TIER1_NAT("TIER1_NAT"),
    T1_NAT("T1_NAT"),
    TIER1_LB_VIP("TIER1_LB_VIP"),
    T1_LB_VIP("T1_LB_VIP"),
    TIER1_LB_SNAT("TIER1_LB_SNAT"),
    T1_LB_SNAT("T1_LB_SNAT"),
    T1_DNS_FORWARDER_IP("T1_DNS_FORWARDER_IP"),
    T1_CONNECTED("T1_CONNECTED"),
    T1_DOWNLINK("T1_DOWNLINK"),
    T1_CSP("T1_CSP"),
    BGP("BGP"),
    T1_IPSEC_LOCAL_IP("T1_IPSEC_LOCAL_IP");

    private String value;

    SourcesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SourcesEnum fromValue(String text) {
      for (SourcesEnum b : SourcesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SourcesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourcesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourcesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourcesEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("sources")
  private List<SourcesEnum> sources = new ArrayList<SourcesEnum>();

  @SerializedName("route_map_id")
  private String routeMapId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("display_name")
  private String displayName = null;

  /**
   * Destination redistribution protocol
   */
  @JsonAdapter(DestinationEnum.Adapter.class)
  public enum DestinationEnum {
    STATIC("STATIC"),
    T0_STATIC("T0_STATIC"),
    NSX_CONNECTED("NSX_CONNECTED"),
    T0_CONNECTED("T0_CONNECTED"),
    NSX_STATIC("NSX_STATIC"),
    T1_STATIC("T1_STATIC"),
    T0_UPLINK("T0_UPLINK"),
    T0_DOWNLINK("T0_DOWNLINK"),
    T0_ROUTER_LINK("T0_ROUTER_LINK"),
    T0_CSP("T0_CSP"),
    T0_LOOPBACK("T0_LOOPBACK"),
    T0_DNS_FORWARDER_IP("T0_DNS_FORWARDER_IP"),
    T0_IPSEC_LOCAL_IP("T0_IPSEC_LOCAL_IP"),
    TIER0_NAT("TIER0_NAT"),
    T0_NAT("T0_NAT"),
    TIER1_NAT("TIER1_NAT"),
    T1_NAT("T1_NAT"),
    TIER1_LB_VIP("TIER1_LB_VIP"),
    T1_LB_VIP("T1_LB_VIP"),
    TIER1_LB_SNAT("TIER1_LB_SNAT"),
    T1_LB_SNAT("T1_LB_SNAT"),
    T1_DNS_FORWARDER_IP("T1_DNS_FORWARDER_IP"),
    T1_CONNECTED("T1_CONNECTED"),
    T1_DOWNLINK("T1_DOWNLINK"),
    T1_CSP("T1_CSP"),
    BGP("BGP"),
    T1_IPSEC_LOCAL_IP("T1_IPSEC_LOCAL_IP");

    private String value;

    DestinationEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DestinationEnum fromValue(String text) {
      for (DestinationEnum b : DestinationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DestinationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DestinationEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("destination")
  private DestinationEnum destination = null;

  /**
   * Address family for Route Redistribution
   */
  @JsonAdapter(AddressFamilyEnum.Adapter.class)
  public enum AddressFamilyEnum {
    IPV4("IPV4"),
    IPV6("IPV6"),
    IPV4_AND_IPV6("IPV4_AND_IPV6");

    private String value;

    AddressFamilyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AddressFamilyEnum fromValue(String text) {
      for (AddressFamilyEnum b : AddressFamilyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AddressFamilyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressFamilyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressFamilyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AddressFamilyEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("address_family")
  private AddressFamilyEnum addressFamily = AddressFamilyEnum.IPV4_AND_IPV6;

  public RedistributionRule sources(List<SourcesEnum> sources) {
    this.sources = sources;
    return this;
  }

  public RedistributionRule addSourcesItem(SourcesEnum sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Array of redistribution protocols
   * @return sources
  **/
  @Schema(required = true, description = "Array of redistribution protocols")
  public List<SourcesEnum> getSources() {
    return sources;
  }

  public void setSources(List<SourcesEnum> sources) {
    this.sources = sources;
  }

  public RedistributionRule routeMapId(String routeMapId) {
    this.routeMapId = routeMapId;
    return this;
  }

   /**
   * RouteMap Id for the filter
   * @return routeMapId
  **/
  @Schema(description = "RouteMap Id for the filter")
  public String getRouteMapId() {
    return routeMapId;
  }

  public void setRouteMapId(String routeMapId) {
    this.routeMapId = routeMapId;
  }

  public RedistributionRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @Schema(description = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RedistributionRule displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name
   * @return displayName
  **/
  @Schema(description = "Display name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public RedistributionRule destination(DestinationEnum destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Destination redistribution protocol
   * @return destination
  **/
  @Schema(required = true, description = "Destination redistribution protocol")
  public DestinationEnum getDestination() {
    return destination;
  }

  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }

   /**
   * Address family for Route Redistribution
   * @return addressFamily
  **/
  @Schema(description = "Address family for Route Redistribution")
  public AddressFamilyEnum getAddressFamily() {
    return addressFamily;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedistributionRule redistributionRule = (RedistributionRule) o;
    return Objects.equals(this.sources, redistributionRule.sources) &&
        Objects.equals(this.routeMapId, redistributionRule.routeMapId) &&
        Objects.equals(this.description, redistributionRule.description) &&
        Objects.equals(this.displayName, redistributionRule.displayName) &&
        Objects.equals(this.destination, redistributionRule.destination) &&
        Objects.equals(this.addressFamily, redistributionRule.addressFamily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sources, routeMapId, description, displayName, destination, addressFamily);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedistributionRule {\n");
    
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    routeMapId: ").append(toIndentedString(routeMapId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    addressFamily: ").append(toIndentedString(addressFamily)).append("\n");
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
