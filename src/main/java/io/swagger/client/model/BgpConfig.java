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
import io.swagger.client.model.BgpRouteAggregation;
import io.swagger.client.model.GracefulRestartConfig;
import io.swagger.client.model.InterSRRoutingConfig;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * BGP configuration for Tier0 logical router. We create BGP configuration while creation of Tier0 logical router. 
 */
@Schema(description = "BGP configuration for Tier0 logical router. We create BGP configuration while creation of Tier0 logical router. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class BgpConfig extends ManagedResource {
  @SerializedName("inter_sr_ibgp")
  private InterSRRoutingConfig interSrIbgp = null;

  @SerializedName("as_number")
  private Long asNumber = null;

  @SerializedName("route_aggregation")
  private List<BgpRouteAggregation> routeAggregation = null;

  @SerializedName("logical_router_id")
  private String logicalRouterId = null;

  @SerializedName("graceful_restart")
  private Boolean gracefulRestart = null;

  @SerializedName("as_num")
  private String asNum = null;

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("graceful_restart_config")
  private GracefulRestartConfig gracefulRestartConfig = null;

  @SerializedName("multipath_relax")
  private Boolean multipathRelax = true;

  @SerializedName("ecmp")
  private Boolean ecmp = true;

  public BgpConfig interSrIbgp(InterSRRoutingConfig interSrIbgp) {
    this.interSrIbgp = interSrIbgp;
    return this;
  }

   /**
   * Get interSrIbgp
   * @return interSrIbgp
  **/
  @Schema(description = "")
  public InterSRRoutingConfig getInterSrIbgp() {
    return interSrIbgp;
  }

  public void setInterSrIbgp(InterSRRoutingConfig interSrIbgp) {
    this.interSrIbgp = interSrIbgp;
  }

  public BgpConfig asNumber(Long asNumber) {
    this.asNumber = asNumber;
    return this;
  }

   /**
   * This is a deprecated property, Please use &#x27;as_num&#x27; instead.
   * minimum: 1
   * maximum: 4294967296
   * @return asNumber
  **/
  @Schema(description = "This is a deprecated property, Please use 'as_num' instead.")
  public Long getAsNumber() {
    return asNumber;
  }

  public void setAsNumber(Long asNumber) {
    this.asNumber = asNumber;
  }

  public BgpConfig routeAggregation(List<BgpRouteAggregation> routeAggregation) {
    this.routeAggregation = routeAggregation;
    return this;
  }

  public BgpConfig addRouteAggregationItem(BgpRouteAggregation routeAggregationItem) {
    if (this.routeAggregation == null) {
      this.routeAggregation = new ArrayList<BgpRouteAggregation>();
    }
    this.routeAggregation.add(routeAggregationItem);
    return this;
  }

   /**
   * List of routes to be aggregated
   * @return routeAggregation
  **/
  @Schema(description = "List of routes to be aggregated")
  public List<BgpRouteAggregation> getRouteAggregation() {
    return routeAggregation;
  }

  public void setRouteAggregation(List<BgpRouteAggregation> routeAggregation) {
    this.routeAggregation = routeAggregation;
  }

   /**
   * Logical router id
   * @return logicalRouterId
  **/
  @Schema(description = "Logical router id")
  public String getLogicalRouterId() {
    return logicalRouterId;
  }

  public BgpConfig gracefulRestart(Boolean gracefulRestart) {
    this.gracefulRestart = gracefulRestart;
    return this;
  }

   /**
   * Flag to enable graceful restart. This field is deprecated, kindly use graceful_restart_config parameter for graceful restart configuration. If both parameters are set and consistent with each other [i.e. graceful_restart&#x3D;false and graceful_restart_mode&#x3D;HELPER_ONLY OR graceful_restart&#x3D;true and graceful_restart_mode&#x3D;GR_AND_HELPER] then this is allowed, but if inconsistent with each other then this is not allowed and validation error will be thrown. 
   * @return gracefulRestart
  **/
  @Schema(description = "Flag to enable graceful restart. This field is deprecated, kindly use graceful_restart_config parameter for graceful restart configuration. If both parameters are set and consistent with each other [i.e. graceful_restart=false and graceful_restart_mode=HELPER_ONLY OR graceful_restart=true and graceful_restart_mode=GR_AND_HELPER] then this is allowed, but if inconsistent with each other then this is not allowed and validation error will be thrown. ")
  public Boolean isGracefulRestart() {
    return gracefulRestart;
  }

  public void setGracefulRestart(Boolean gracefulRestart) {
    this.gracefulRestart = gracefulRestart;
  }

  public BgpConfig asNum(String asNum) {
    this.asNum = asNum;
    return this;
  }

   /**
   * 4 Byte ASN in ASPLAIN/ASDOT Format
   * @return asNum
  **/
  @Schema(description = "4 Byte ASN in ASPLAIN/ASDOT Format")
  public String getAsNum() {
    return asNum;
  }

  public void setAsNum(String asNum) {
    this.asNum = asNum;
  }

  public BgpConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * While creation of BGP config this flag will be set to - true for Tier0 logical router with Active-Active high-availability mode - false for Tier0 logical router with Active-Standby high-availanility mode. User can change this value while updating the config. If this property is not specified in the payload, the default value will be considered as false irrespective of the high-availability mode. 
   * @return enabled
  **/
  @Schema(description = "While creation of BGP config this flag will be set to - true for Tier0 logical router with Active-Active high-availability mode - false for Tier0 logical router with Active-Standby high-availanility mode. User can change this value while updating the config. If this property is not specified in the payload, the default value will be considered as false irrespective of the high-availability mode. ")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public BgpConfig gracefulRestartConfig(GracefulRestartConfig gracefulRestartConfig) {
    this.gracefulRestartConfig = gracefulRestartConfig;
    return this;
  }

   /**
   * Get gracefulRestartConfig
   * @return gracefulRestartConfig
  **/
  @Schema(description = "")
  public GracefulRestartConfig getGracefulRestartConfig() {
    return gracefulRestartConfig;
  }

  public void setGracefulRestartConfig(GracefulRestartConfig gracefulRestartConfig) {
    this.gracefulRestartConfig = gracefulRestartConfig;
  }

  public BgpConfig multipathRelax(Boolean multipathRelax) {
    this.multipathRelax = multipathRelax;
    return this;
  }

   /**
   * Flag to enable BGP multipath relax option
   * @return multipathRelax
  **/
  @Schema(description = "Flag to enable BGP multipath relax option")
  public Boolean isMultipathRelax() {
    return multipathRelax;
  }

  public void setMultipathRelax(Boolean multipathRelax) {
    this.multipathRelax = multipathRelax;
  }

  public BgpConfig ecmp(Boolean ecmp) {
    this.ecmp = ecmp;
    return this;
  }

   /**
   * While creation of BGP config this flag will be set to - true for Tier0 logical router with Active-Active high-availability mode - false for Tier0 logical router with Active-Standby high-availability mode. User can change this value while updating BGP config. If this property is not specified in the payload, the default value will be considered as true irrespective of the high-availability mode. 
   * @return ecmp
  **/
  @Schema(description = "While creation of BGP config this flag will be set to - true for Tier0 logical router with Active-Active high-availability mode - false for Tier0 logical router with Active-Standby high-availability mode. User can change this value while updating BGP config. If this property is not specified in the payload, the default value will be considered as true irrespective of the high-availability mode. ")
  public Boolean isEcmp() {
    return ecmp;
  }

  public void setEcmp(Boolean ecmp) {
    this.ecmp = ecmp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpConfig bgpConfig = (BgpConfig) o;
    return Objects.equals(this.interSrIbgp, bgpConfig.interSrIbgp) &&
        Objects.equals(this.asNumber, bgpConfig.asNumber) &&
        Objects.equals(this.routeAggregation, bgpConfig.routeAggregation) &&
        Objects.equals(this.logicalRouterId, bgpConfig.logicalRouterId) &&
        Objects.equals(this.gracefulRestart, bgpConfig.gracefulRestart) &&
        Objects.equals(this.asNum, bgpConfig.asNum) &&
        Objects.equals(this.enabled, bgpConfig.enabled) &&
        Objects.equals(this.gracefulRestartConfig, bgpConfig.gracefulRestartConfig) &&
        Objects.equals(this.multipathRelax, bgpConfig.multipathRelax) &&
        Objects.equals(this.ecmp, bgpConfig.ecmp) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interSrIbgp, asNumber, routeAggregation, logicalRouterId, gracefulRestart, asNum, enabled, gracefulRestartConfig, multipathRelax, ecmp, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    interSrIbgp: ").append(toIndentedString(interSrIbgp)).append("\n");
    sb.append("    asNumber: ").append(toIndentedString(asNumber)).append("\n");
    sb.append("    routeAggregation: ").append(toIndentedString(routeAggregation)).append("\n");
    sb.append("    logicalRouterId: ").append(toIndentedString(logicalRouterId)).append("\n");
    sb.append("    gracefulRestart: ").append(toIndentedString(gracefulRestart)).append("\n");
    sb.append("    asNum: ").append(toIndentedString(asNum)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    gracefulRestartConfig: ").append(toIndentedString(gracefulRestartConfig)).append("\n");
    sb.append("    multipathRelax: ").append(toIndentedString(multipathRelax)).append("\n");
    sb.append("    ecmp: ").append(toIndentedString(ecmp)).append("\n");
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
