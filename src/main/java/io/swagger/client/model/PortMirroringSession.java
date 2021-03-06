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
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.MirrorDestination;
import io.swagger.client.model.MirrorSource;
import io.swagger.client.model.PortMirroringFilter;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PortMirroringSession
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PortMirroringSession extends ManagedResource {
  /**
   * Port mirroring session direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    INGRESS("INGRESS"),
    EGRESS("EGRESS"),
    BIDIRECTIONAL("BIDIRECTIONAL");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("direction")
  private DirectionEnum direction = null;

  @SerializedName("mirror_sources")
  private List<MirrorSource> mirrorSources = new ArrayList<MirrorSource>();

  @SerializedName("encapsulation_vlan_id")
  private Long encapsulationVlanId = null;

  /**
   * If this property is unset, this session will be treated as LocalPortMirrorSession. 
   */
  @JsonAdapter(SessionTypeEnum.Adapter.class)
  public enum SessionTypeEnum {
    LOGICALPORTMIRRORSESSION("LogicalPortMirrorSession"),
    UPLINKPORTMIRRORSESSION("UplinkPortMirrorSession"),
    RSPANSRCMIRRORSESSION("RspanSrcMirrorSession"),
    RSPANDSTMIRRORSESSION("RspanDstMirrorSession"),
    LOCALPORTMIRRORSESSION("LocalPortMirrorSession"),
    LOGICALLOCALPORTMIRRORSESSION("LogicalLocalPortMirrorSession"),
    L3PORTMIRRORSESSION("L3PortMirrorSession");

    private String value;

    SessionTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SessionTypeEnum fromValue(String text) {
      for (SessionTypeEnum b : SessionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SessionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SessionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SessionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SessionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("session_type")
  private SessionTypeEnum sessionType = SessionTypeEnum.LOCALPORTMIRRORSESSION;

  @SerializedName("snap_length")
  private Long snapLength = null;

  @SerializedName("port_mirroring_filters")
  private List<PortMirroringFilter> portMirroringFilters = null;

  @SerializedName("preserve_original_vlan")
  private Boolean preserveOriginalVlan = false;

  @SerializedName("mirror_destination")
  private MirrorDestination mirrorDestination = null;

  public PortMirroringSession direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Port mirroring session direction
   * @return direction
  **/
  @Schema(required = true, description = "Port mirroring session direction")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public PortMirroringSession mirrorSources(List<MirrorSource> mirrorSources) {
    this.mirrorSources = mirrorSources;
    return this;
  }

  public PortMirroringSession addMirrorSourcesItem(MirrorSource mirrorSourcesItem) {
    this.mirrorSources.add(mirrorSourcesItem);
    return this;
  }

   /**
   * Mirror sources
   * @return mirrorSources
  **/
  @Schema(required = true, description = "Mirror sources")
  public List<MirrorSource> getMirrorSources() {
    return mirrorSources;
  }

  public void setMirrorSources(List<MirrorSource> mirrorSources) {
    this.mirrorSources = mirrorSources;
  }

  public PortMirroringSession encapsulationVlanId(Long encapsulationVlanId) {
    this.encapsulationVlanId = encapsulationVlanId;
    return this;
  }

   /**
   * Only for Remote SPAN Port Mirror.
   * @return encapsulationVlanId
  **/
  @Schema(description = "Only for Remote SPAN Port Mirror.")
  public Long getEncapsulationVlanId() {
    return encapsulationVlanId;
  }

  public void setEncapsulationVlanId(Long encapsulationVlanId) {
    this.encapsulationVlanId = encapsulationVlanId;
  }

  public PortMirroringSession sessionType(SessionTypeEnum sessionType) {
    this.sessionType = sessionType;
    return this;
  }

   /**
   * If this property is unset, this session will be treated as LocalPortMirrorSession. 
   * @return sessionType
  **/
  @Schema(description = "If this property is unset, this session will be treated as LocalPortMirrorSession. ")
  public SessionTypeEnum getSessionType() {
    return sessionType;
  }

  public void setSessionType(SessionTypeEnum sessionType) {
    this.sessionType = sessionType;
  }

  public PortMirroringSession snapLength(Long snapLength) {
    this.snapLength = snapLength;
    return this;
  }

   /**
   * If this property is set, the packet will be truncated to the provided length. If this property is unset, entire packet will be mirrored. 
   * minimum: 60
   * maximum: 65535
   * @return snapLength
  **/
  @Schema(description = "If this property is set, the packet will be truncated to the provided length. If this property is unset, entire packet will be mirrored. ")
  public Long getSnapLength() {
    return snapLength;
  }

  public void setSnapLength(Long snapLength) {
    this.snapLength = snapLength;
  }

  public PortMirroringSession portMirroringFilters(List<PortMirroringFilter> portMirroringFilters) {
    this.portMirroringFilters = portMirroringFilters;
    return this;
  }

  public PortMirroringSession addPortMirroringFiltersItem(PortMirroringFilter portMirroringFiltersItem) {
    if (this.portMirroringFilters == null) {
      this.portMirroringFilters = new ArrayList<PortMirroringFilter>();
    }
    this.portMirroringFilters.add(portMirroringFiltersItem);
    return this;
  }

   /**
   * An array of 5-tuples used to filter packets for the mirror session, if not provided, all the packets will be mirrored.
   * @return portMirroringFilters
  **/
  @Schema(description = "An array of 5-tuples used to filter packets for the mirror session, if not provided, all the packets will be mirrored.")
  public List<PortMirroringFilter> getPortMirroringFilters() {
    return portMirroringFilters;
  }

  public void setPortMirroringFilters(List<PortMirroringFilter> portMirroringFilters) {
    this.portMirroringFilters = portMirroringFilters;
  }

  public PortMirroringSession preserveOriginalVlan(Boolean preserveOriginalVlan) {
    this.preserveOriginalVlan = preserveOriginalVlan;
    return this;
  }

   /**
   * Only for Remote SPAN Port Mirror. Whether to preserve original VLAN.
   * @return preserveOriginalVlan
  **/
  @Schema(description = "Only for Remote SPAN Port Mirror. Whether to preserve original VLAN.")
  public Boolean isPreserveOriginalVlan() {
    return preserveOriginalVlan;
  }

  public void setPreserveOriginalVlan(Boolean preserveOriginalVlan) {
    this.preserveOriginalVlan = preserveOriginalVlan;
  }

  public PortMirroringSession mirrorDestination(MirrorDestination mirrorDestination) {
    this.mirrorDestination = mirrorDestination;
    return this;
  }

   /**
   * Get mirrorDestination
   * @return mirrorDestination
  **/
  @Schema(required = true, description = "")
  public MirrorDestination getMirrorDestination() {
    return mirrorDestination;
  }

  public void setMirrorDestination(MirrorDestination mirrorDestination) {
    this.mirrorDestination = mirrorDestination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortMirroringSession portMirroringSession = (PortMirroringSession) o;
    return Objects.equals(this.direction, portMirroringSession.direction) &&
        Objects.equals(this.mirrorSources, portMirroringSession.mirrorSources) &&
        Objects.equals(this.encapsulationVlanId, portMirroringSession.encapsulationVlanId) &&
        Objects.equals(this.sessionType, portMirroringSession.sessionType) &&
        Objects.equals(this.snapLength, portMirroringSession.snapLength) &&
        Objects.equals(this.portMirroringFilters, portMirroringSession.portMirroringFilters) &&
        Objects.equals(this.preserveOriginalVlan, portMirroringSession.preserveOriginalVlan) &&
        Objects.equals(this.mirrorDestination, portMirroringSession.mirrorDestination) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, mirrorSources, encapsulationVlanId, sessionType, snapLength, portMirroringFilters, preserveOriginalVlan, mirrorDestination, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortMirroringSession {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    mirrorSources: ").append(toIndentedString(mirrorSources)).append("\n");
    sb.append("    encapsulationVlanId: ").append(toIndentedString(encapsulationVlanId)).append("\n");
    sb.append("    sessionType: ").append(toIndentedString(sessionType)).append("\n");
    sb.append("    snapLength: ").append(toIndentedString(snapLength)).append("\n");
    sb.append("    portMirroringFilters: ").append(toIndentedString(portMirroringFilters)).append("\n");
    sb.append("    preserveOriginalVlan: ").append(toIndentedString(preserveOriginalVlan)).append("\n");
    sb.append("    mirrorDestination: ").append(toIndentedString(mirrorDestination)).append("\n");
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
