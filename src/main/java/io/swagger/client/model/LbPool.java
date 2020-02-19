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
import io.swagger.client.model.LbSnatTranslation;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.PoolMember;
import io.swagger.client.model.PoolMemberGroup;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LbPool
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LbPool extends ManagedResource {
  @SerializedName("member_group")
  private PoolMemberGroup memberGroup = null;

  @SerializedName("snat_translation")
  private LbSnatTranslation snatTranslation = null;

  /**
   * Load balancing algorithm, configurable per pool controls how the incoming connections are distributed among the members. 
   */
  @JsonAdapter(AlgorithmEnum.Adapter.class)
  public enum AlgorithmEnum {
    ROUND_ROBIN("ROUND_ROBIN"),
    WEIGHTED_ROUND_ROBIN("WEIGHTED_ROUND_ROBIN"),
    LEAST_CONNECTION("LEAST_CONNECTION"),
    WEIGHTED_LEAST_CONNECTION("WEIGHTED_LEAST_CONNECTION"),
    IP_HASH("IP_HASH");

    private String value;

    AlgorithmEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AlgorithmEnum fromValue(String text) {
      for (AlgorithmEnum b : AlgorithmEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlgorithmEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("algorithm")
  private AlgorithmEnum algorithm = AlgorithmEnum.ROUND_ROBIN;

  @SerializedName("members")
  private List<PoolMember> members = null;

  @SerializedName("passive_monitor_id")
  private String passiveMonitorId = null;

  @SerializedName("tcp_multiplexing_number")
  private Long tcpMultiplexingNumber = 6l;

  @SerializedName("active_monitor_ids")
  private List<String> activeMonitorIds = null;

  @SerializedName("tcp_multiplexing_enabled")
  private Boolean tcpMultiplexingEnabled = false;

  @SerializedName("min_active_members")
  private Long minActiveMembers = 1l;

  public LbPool memberGroup(PoolMemberGroup memberGroup) {
    this.memberGroup = memberGroup;
    return this;
  }

   /**
   * Get memberGroup
   * @return memberGroup
  **/
  @Schema(description = "")
  public PoolMemberGroup getMemberGroup() {
    return memberGroup;
  }

  public void setMemberGroup(PoolMemberGroup memberGroup) {
    this.memberGroup = memberGroup;
  }

  public LbPool snatTranslation(LbSnatTranslation snatTranslation) {
    this.snatTranslation = snatTranslation;
    return this;
  }

   /**
   * Get snatTranslation
   * @return snatTranslation
  **/
  @Schema(description = "")
  public LbSnatTranslation getSnatTranslation() {
    return snatTranslation;
  }

  public void setSnatTranslation(LbSnatTranslation snatTranslation) {
    this.snatTranslation = snatTranslation;
  }

  public LbPool algorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Load balancing algorithm, configurable per pool controls how the incoming connections are distributed among the members. 
   * @return algorithm
  **/
  @Schema(description = "Load balancing algorithm, configurable per pool controls how the incoming connections are distributed among the members. ")
  public AlgorithmEnum getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
  }

  public LbPool members(List<PoolMember> members) {
    this.members = members;
    return this;
  }

  public LbPool addMembersItem(PoolMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<PoolMember>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Server pool consists of one or more pool members. Each pool member is identified, typically, by an IP address and a port. 
   * @return members
  **/
  @Schema(description = "Server pool consists of one or more pool members. Each pool member is identified, typically, by an IP address and a port. ")
  public List<PoolMember> getMembers() {
    return members;
  }

  public void setMembers(List<PoolMember> members) {
    this.members = members;
  }

  public LbPool passiveMonitorId(String passiveMonitorId) {
    this.passiveMonitorId = passiveMonitorId;
    return this;
  }

   /**
   * Passive healthchecks are disabled by default and can be enabled by attaching a passive health monitor to a server pool. Each time a client connection to a pool member fails, its failed count is incremented. For pools bound to L7 virtual servers, a connection is considered to be failed and failed count is incremented if any TCP connection errors (e.g. TCP RST or failure to send data) or SSL handshake failures occur. For pools bound to L4 virtual servers, if no response is received to a TCP SYN sent to the pool member or if a TCP RST is received in response to a TCP SYN, then the pool member is considered to have failed and the failed count is incremented. 
   * @return passiveMonitorId
  **/
  @Schema(description = "Passive healthchecks are disabled by default and can be enabled by attaching a passive health monitor to a server pool. Each time a client connection to a pool member fails, its failed count is incremented. For pools bound to L7 virtual servers, a connection is considered to be failed and failed count is incremented if any TCP connection errors (e.g. TCP RST or failure to send data) or SSL handshake failures occur. For pools bound to L4 virtual servers, if no response is received to a TCP SYN sent to the pool member or if a TCP RST is received in response to a TCP SYN, then the pool member is considered to have failed and the failed count is incremented. ")
  public String getPassiveMonitorId() {
    return passiveMonitorId;
  }

  public void setPassiveMonitorId(String passiveMonitorId) {
    this.passiveMonitorId = passiveMonitorId;
  }

  public LbPool tcpMultiplexingNumber(Long tcpMultiplexingNumber) {
    this.tcpMultiplexingNumber = tcpMultiplexingNumber;
    return this;
  }

   /**
   * The maximum number of TCP connections per pool that are idly kept alive for sending future client requests. 
   * minimum: 0
   * maximum: 2147483647
   * @return tcpMultiplexingNumber
  **/
  @Schema(description = "The maximum number of TCP connections per pool that are idly kept alive for sending future client requests. ")
  public Long getTcpMultiplexingNumber() {
    return tcpMultiplexingNumber;
  }

  public void setTcpMultiplexingNumber(Long tcpMultiplexingNumber) {
    this.tcpMultiplexingNumber = tcpMultiplexingNumber;
  }

  public LbPool activeMonitorIds(List<String> activeMonitorIds) {
    this.activeMonitorIds = activeMonitorIds;
    return this;
  }

  public LbPool addActiveMonitorIdsItem(String activeMonitorIdsItem) {
    if (this.activeMonitorIds == null) {
      this.activeMonitorIds = new ArrayList<String>();
    }
    this.activeMonitorIds.add(activeMonitorIdsItem);
    return this;
  }

   /**
   * In case of active healthchecks, load balancer itself initiates new connections (or sends ICMP ping) to the servers periodically to check their health, completely independent of any data traffic. Active healthchecks are disabled by default and can be enabled for a server pool by binding a health monitor to the pool. Currently, only one active health monitor can be configured per server pool. 
   * @return activeMonitorIds
  **/
  @Schema(description = "In case of active healthchecks, load balancer itself initiates new connections (or sends ICMP ping) to the servers periodically to check their health, completely independent of any data traffic. Active healthchecks are disabled by default and can be enabled for a server pool by binding a health monitor to the pool. Currently, only one active health monitor can be configured per server pool. ")
  public List<String> getActiveMonitorIds() {
    return activeMonitorIds;
  }

  public void setActiveMonitorIds(List<String> activeMonitorIds) {
    this.activeMonitorIds = activeMonitorIds;
  }

  public LbPool tcpMultiplexingEnabled(Boolean tcpMultiplexingEnabled) {
    this.tcpMultiplexingEnabled = tcpMultiplexingEnabled;
    return this;
  }

   /**
   * TCP multiplexing allows the same TCP connection between load balancer and the backend server to be used for sending multiple client requests from different client TCP connections. 
   * @return tcpMultiplexingEnabled
  **/
  @Schema(description = "TCP multiplexing allows the same TCP connection between load balancer and the backend server to be used for sending multiple client requests from different client TCP connections. ")
  public Boolean isTcpMultiplexingEnabled() {
    return tcpMultiplexingEnabled;
  }

  public void setTcpMultiplexingEnabled(Boolean tcpMultiplexingEnabled) {
    this.tcpMultiplexingEnabled = tcpMultiplexingEnabled;
  }

  public LbPool minActiveMembers(Long minActiveMembers) {
    this.minActiveMembers = minActiveMembers;
    return this;
  }

   /**
   * A pool is considered active if there are at least certain minimum number of members. 
   * minimum: 1
   * maximum: 2147483647
   * @return minActiveMembers
  **/
  @Schema(description = "A pool is considered active if there are at least certain minimum number of members. ")
  public Long getMinActiveMembers() {
    return minActiveMembers;
  }

  public void setMinActiveMembers(Long minActiveMembers) {
    this.minActiveMembers = minActiveMembers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbPool lbPool = (LbPool) o;
    return Objects.equals(this.memberGroup, lbPool.memberGroup) &&
        Objects.equals(this.snatTranslation, lbPool.snatTranslation) &&
        Objects.equals(this.algorithm, lbPool.algorithm) &&
        Objects.equals(this.members, lbPool.members) &&
        Objects.equals(this.passiveMonitorId, lbPool.passiveMonitorId) &&
        Objects.equals(this.tcpMultiplexingNumber, lbPool.tcpMultiplexingNumber) &&
        Objects.equals(this.activeMonitorIds, lbPool.activeMonitorIds) &&
        Objects.equals(this.tcpMultiplexingEnabled, lbPool.tcpMultiplexingEnabled) &&
        Objects.equals(this.minActiveMembers, lbPool.minActiveMembers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberGroup, snatTranslation, algorithm, members, passiveMonitorId, tcpMultiplexingNumber, activeMonitorIds, tcpMultiplexingEnabled, minActiveMembers, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LbPool {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    memberGroup: ").append(toIndentedString(memberGroup)).append("\n");
    sb.append("    snatTranslation: ").append(toIndentedString(snatTranslation)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    passiveMonitorId: ").append(toIndentedString(passiveMonitorId)).append("\n");
    sb.append("    tcpMultiplexingNumber: ").append(toIndentedString(tcpMultiplexingNumber)).append("\n");
    sb.append("    activeMonitorIds: ").append(toIndentedString(activeMonitorIds)).append("\n");
    sb.append("    tcpMultiplexingEnabled: ").append(toIndentedString(tcpMultiplexingEnabled)).append("\n");
    sb.append("    minActiveMembers: ").append(toIndentedString(minActiveMembers)).append("\n");
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