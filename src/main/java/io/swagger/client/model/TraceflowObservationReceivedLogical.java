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
import io.swagger.client.model.TraceflowObservation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TraceflowObservationReceivedLogical
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class TraceflowObservationReceivedLogical extends TraceflowObservation {
  @SerializedName("src_component_id")
  private String srcComponentId = null;

  @SerializedName("component_id")
  private String componentId = null;

  @SerializedName("lport_id")
  private String lportId = null;

  /**
   * The type of the source component from which the traceflow packet was received.
   */
  @JsonAdapter(SrcComponentTypeEnum.Adapter.class)
  public enum SrcComponentTypeEnum {
    PHYSICAL("PHYSICAL"),
    LR("LR"),
    LS("LS"),
    DFW("DFW"),
    BRIDGE("BRIDGE"),
    EDGE_TUNNEL("EDGE_TUNNEL"),
    EDGE_HOSTSWITCH("EDGE_HOSTSWITCH"),
    FW_BRIDGE("FW_BRIDGE"),
    LOAD_BALANCER("LOAD_BALANCER"),
    NAT("NAT"),
    IPSEC("IPSEC"),
    SERVICE_INSERTION("SERVICE_INSERTION"),
    VMC("VMC"),
    EDGE_FW("EDGE_FW"),
    UNKNOWN("UNKNOWN");

    private String value;

    SrcComponentTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SrcComponentTypeEnum fromValue(String text) {
      for (SrcComponentTypeEnum b : SrcComponentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SrcComponentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SrcComponentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SrcComponentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SrcComponentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("src_component_type")
  private SrcComponentTypeEnum srcComponentType = null;

  @SerializedName("lport_name")
  private String lportName = null;

  @SerializedName("src_component_name")
  private String srcComponentName = null;

  @SerializedName("vni")
  private Integer vni = null;

   /**
   * The id of the source component from which the traceflow packet was received.
   * @return srcComponentId
  **/
  @Schema(description = "The id of the source component from which the traceflow packet was received.")
  public String getSrcComponentId() {
    return srcComponentId;
  }

   /**
   * The id of the component that received the traceflow packet.
   * @return componentId
  **/
  @Schema(description = "The id of the component that received the traceflow packet.")
  public String getComponentId() {
    return componentId;
  }

   /**
   * The id of the logical port at which the traceflow packet was received
   * @return lportId
  **/
  @Schema(description = "The id of the logical port at which the traceflow packet was received")
  public String getLportId() {
    return lportId;
  }

   /**
   * The type of the source component from which the traceflow packet was received.
   * @return srcComponentType
  **/
  @Schema(description = "The type of the source component from which the traceflow packet was received.")
  public SrcComponentTypeEnum getSrcComponentType() {
    return srcComponentType;
  }

   /**
   * The name of the logical port at which the traceflow packet was received
   * @return lportName
  **/
  @Schema(description = "The name of the logical port at which the traceflow packet was received")
  public String getLportName() {
    return lportName;
  }

   /**
   * The name of source component from which the traceflow packet was received.
   * @return srcComponentName
  **/
  @Schema(description = "The name of source component from which the traceflow packet was received.")
  public String getSrcComponentName() {
    return srcComponentName;
  }

   /**
   * VNI for the logical network on which the traceflow packet was received.
   * @return vni
  **/
  @Schema(description = "VNI for the logical network on which the traceflow packet was received.")
  public Integer getVni() {
    return vni;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceflowObservationReceivedLogical traceflowObservationReceivedLogical = (TraceflowObservationReceivedLogical) o;
    return Objects.equals(this.srcComponentId, traceflowObservationReceivedLogical.srcComponentId) &&
        Objects.equals(this.componentId, traceflowObservationReceivedLogical.componentId) &&
        Objects.equals(this.lportId, traceflowObservationReceivedLogical.lportId) &&
        Objects.equals(this.srcComponentType, traceflowObservationReceivedLogical.srcComponentType) &&
        Objects.equals(this.lportName, traceflowObservationReceivedLogical.lportName) &&
        Objects.equals(this.srcComponentName, traceflowObservationReceivedLogical.srcComponentName) &&
        Objects.equals(this.vni, traceflowObservationReceivedLogical.vni) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcComponentId, componentId, lportId, srcComponentType, lportName, srcComponentName, vni, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceflowObservationReceivedLogical {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    srcComponentId: ").append(toIndentedString(srcComponentId)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    lportId: ").append(toIndentedString(lportId)).append("\n");
    sb.append("    srcComponentType: ").append(toIndentedString(srcComponentType)).append("\n");
    sb.append("    lportName: ").append(toIndentedString(lportName)).append("\n");
    sb.append("    srcComponentName: ").append(toIndentedString(srcComponentName)).append("\n");
    sb.append("    vni: ").append(toIndentedString(vni)).append("\n");
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