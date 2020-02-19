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
import io.swagger.client.model.LbPoolMemberStatistics;
import io.swagger.client.model.LbStatisticsCounter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LbPoolStatistics
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbPoolStatistics {
  @SerializedName("last_update_timestamp")
  private Long lastUpdateTimestamp = null;

  @SerializedName("statistics")
  private LbStatisticsCounter statistics = null;

  @SerializedName("pool_id")
  private String poolId = null;

  @SerializedName("members")
  private List<LbPoolMemberStatistics> members = null;

  public LbPoolStatistics lastUpdateTimestamp(Long lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
    return this;
  }

   /**
   * Timestamp when the data was last updated
   * @return lastUpdateTimestamp
  **/
  @Schema(description = "Timestamp when the data was last updated")
  public Long getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

  public void setLastUpdateTimestamp(Long lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
  }

  public LbPoolStatistics statistics(LbStatisticsCounter statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @Schema(required = true, description = "")
  public LbStatisticsCounter getStatistics() {
    return statistics;
  }

  public void setStatistics(LbStatisticsCounter statistics) {
    this.statistics = statistics;
  }

  public LbPoolStatistics poolId(String poolId) {
    this.poolId = poolId;
    return this;
  }

   /**
   * Load balancer pool identifier
   * @return poolId
  **/
  @Schema(required = true, description = "Load balancer pool identifier")
  public String getPoolId() {
    return poolId;
  }

  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  public LbPoolStatistics members(List<LbPoolMemberStatistics> members) {
    this.members = members;
    return this;
  }

  public LbPoolStatistics addMembersItem(LbPoolMemberStatistics membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<LbPoolMemberStatistics>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Statistics of load balancer pool members
   * @return members
  **/
  @Schema(description = "Statistics of load balancer pool members")
  public List<LbPoolMemberStatistics> getMembers() {
    return members;
  }

  public void setMembers(List<LbPoolMemberStatistics> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbPoolStatistics lbPoolStatistics = (LbPoolStatistics) o;
    return Objects.equals(this.lastUpdateTimestamp, lbPoolStatistics.lastUpdateTimestamp) &&
        Objects.equals(this.statistics, lbPoolStatistics.statistics) &&
        Objects.equals(this.poolId, lbPoolStatistics.poolId) &&
        Objects.equals(this.members, lbPoolStatistics.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTimestamp, statistics, poolId, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbPoolStatistics {\n");
    
    sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
