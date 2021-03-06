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
 * RouteMapSequenceSet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class RouteMapSequenceSet {
  @SerializedName("local_preference")
  private Long localPreference = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("large_community")
  private String largeCommunity = null;

  @SerializedName("as_path_prepend")
  private String asPathPrepend = null;

  @SerializedName("community")
  private String community = null;

  @SerializedName("multi_exit_discriminator")
  private Long multiExitDiscriminator = null;

  public RouteMapSequenceSet localPreference(Long localPreference) {
    this.localPreference = localPreference;
    return this;
  }

   /**
   * Local preference indicates the degree of preference for one BGP route over other BGP routes. The path/route with highest local preference value is preferred/selected. If local preference value is not specified then it will be considered as 100 by default. 
   * minimum: 0
   * maximum: 4294967295
   * @return localPreference
  **/
  @Schema(description = "Local preference indicates the degree of preference for one BGP route over other BGP routes. The path/route with highest local preference value is preferred/selected. If local preference value is not specified then it will be considered as 100 by default. ")
  public Long getLocalPreference() {
    return localPreference;
  }

  public void setLocalPreference(Long localPreference) {
    this.localPreference = localPreference;
  }

  public RouteMapSequenceSet weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight used to select certain path
   * minimum: 0
   * maximum: 65535
   * @return weight
  **/
  @Schema(description = "Weight used to select certain path")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public RouteMapSequenceSet largeCommunity(String largeCommunity) {
    this.largeCommunity = largeCommunity;
    return this;
  }

   /**
   * Set large BGP community, community value shoud be in aa:bb:nn format where aa, bb, nn are unsigned integers with range [1-4294967295].
   * @return largeCommunity
  **/
  @Schema(description = "Set large BGP community, community value shoud be in aa:bb:nn format where aa, bb, nn are unsigned integers with range [1-4294967295].")
  public String getLargeCommunity() {
    return largeCommunity;
  }

  public void setLargeCommunity(String largeCommunity) {
    this.largeCommunity = largeCommunity;
  }

  public RouteMapSequenceSet asPathPrepend(String asPathPrepend) {
    this.asPathPrepend = asPathPrepend;
    return this;
  }

   /**
   * As Path Prepending to influence path selection
   * @return asPathPrepend
  **/
  @Schema(description = "As Path Prepending to influence path selection")
  public String getAsPathPrepend() {
    return asPathPrepend;
  }

  public void setAsPathPrepend(String asPathPrepend) {
    this.asPathPrepend = asPathPrepend;
  }

  public RouteMapSequenceSet community(String community) {
    this.community = community;
    return this;
  }

   /**
   * Set normal BGP community either well-known community name or community value in aa:nn(2byte:2byte) format. 
   * @return community
  **/
  @Schema(description = "Set normal BGP community either well-known community name or community value in aa:nn(2byte:2byte) format. ")
  public String getCommunity() {
    return community;
  }

  public void setCommunity(String community) {
    this.community = community;
  }

  public RouteMapSequenceSet multiExitDiscriminator(Long multiExitDiscriminator) {
    this.multiExitDiscriminator = multiExitDiscriminator;
    return this;
  }

   /**
   * Multi Exit Discriminator (MED)
   * minimum: 0
   * maximum: 4294967295
   * @return multiExitDiscriminator
  **/
  @Schema(description = "Multi Exit Discriminator (MED)")
  public Long getMultiExitDiscriminator() {
    return multiExitDiscriminator;
  }

  public void setMultiExitDiscriminator(Long multiExitDiscriminator) {
    this.multiExitDiscriminator = multiExitDiscriminator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteMapSequenceSet routeMapSequenceSet = (RouteMapSequenceSet) o;
    return Objects.equals(this.localPreference, routeMapSequenceSet.localPreference) &&
        Objects.equals(this.weight, routeMapSequenceSet.weight) &&
        Objects.equals(this.largeCommunity, routeMapSequenceSet.largeCommunity) &&
        Objects.equals(this.asPathPrepend, routeMapSequenceSet.asPathPrepend) &&
        Objects.equals(this.community, routeMapSequenceSet.community) &&
        Objects.equals(this.multiExitDiscriminator, routeMapSequenceSet.multiExitDiscriminator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localPreference, weight, largeCommunity, asPathPrepend, community, multiExitDiscriminator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteMapSequenceSet {\n");
    
    sb.append("    localPreference: ").append(toIndentedString(localPreference)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    largeCommunity: ").append(toIndentedString(largeCommunity)).append("\n");
    sb.append("    asPathPrepend: ").append(toIndentedString(asPathPrepend)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    multiExitDiscriminator: ").append(toIndentedString(multiExitDiscriminator)).append("\n");
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
