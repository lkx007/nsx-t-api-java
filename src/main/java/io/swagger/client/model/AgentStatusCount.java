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
import io.swagger.client.model.AgentStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AgentStatusCount
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class AgentStatusCount {
  /**
   * Roll-up agent status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UP("UP"),
    DOWN("DOWN"),
    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("down_count")
  private Integer downCount = null;

  @SerializedName("agents")
  private List<AgentStatus> agents = null;

  @SerializedName("up_count")
  private Integer upCount = null;

  public AgentStatusCount status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Roll-up agent status
   * @return status
  **/
  @Schema(description = "Roll-up agent status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AgentStatusCount downCount(Integer downCount) {
    this.downCount = downCount;
    return this;
  }

   /**
   * Down count
   * @return downCount
  **/
  @Schema(description = "Down count")
  public Integer getDownCount() {
    return downCount;
  }

  public void setDownCount(Integer downCount) {
    this.downCount = downCount;
  }

  public AgentStatusCount agents(List<AgentStatus> agents) {
    this.agents = agents;
    return this;
  }

  public AgentStatusCount addAgentsItem(AgentStatus agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<AgentStatus>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * List of agent statuses belonging to the transport node
   * @return agents
  **/
  @Schema(description = "List of agent statuses belonging to the transport node")
  public List<AgentStatus> getAgents() {
    return agents;
  }

  public void setAgents(List<AgentStatus> agents) {
    this.agents = agents;
  }

  public AgentStatusCount upCount(Integer upCount) {
    this.upCount = upCount;
    return this;
  }

   /**
   * Up count
   * @return upCount
  **/
  @Schema(description = "Up count")
  public Integer getUpCount() {
    return upCount;
  }

  public void setUpCount(Integer upCount) {
    this.upCount = upCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStatusCount agentStatusCount = (AgentStatusCount) o;
    return Objects.equals(this.status, agentStatusCount.status) &&
        Objects.equals(this.downCount, agentStatusCount.downCount) &&
        Objects.equals(this.agents, agentStatusCount.agents) &&
        Objects.equals(this.upCount, agentStatusCount.upCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, downCount, agents, upCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStatusCount {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    downCount: ").append(toIndentedString(downCount)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    upCount: ").append(toIndentedString(upCount)).append("\n");
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
