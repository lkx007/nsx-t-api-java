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
import io.swagger.client.model.AttachmentContext;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VifAttachmentContext
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class VifAttachmentContext extends AttachmentContext {
  /**
   * Type of the VIF attached to logical port
   */
  @JsonAdapter(VifTypeEnum.Adapter.class)
  public enum VifTypeEnum {
    PARENT("PARENT"),
    CHILD("CHILD"),
    INDEPENDENT("INDEPENDENT");

    private String value;

    VifTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static VifTypeEnum fromValue(String text) {
      for (VifTypeEnum b : VifTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<VifTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VifTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VifTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VifTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("vif_type")
  private VifTypeEnum vifType = null;

  @SerializedName("parent_vif_id")
  private String parentVifId = null;

  @SerializedName("app_id")
  private String appId = null;

  @SerializedName("traffic_tag")
  private Integer trafficTag = null;

  @SerializedName("transport_node_uuid")
  private String transportNodeUuid = null;

  public VifAttachmentContext vifType(VifTypeEnum vifType) {
    this.vifType = vifType;
    return this;
  }

   /**
   * Type of the VIF attached to logical port
   * @return vifType
  **/
  @Schema(required = true, description = "Type of the VIF attached to logical port")
  public VifTypeEnum getVifType() {
    return vifType;
  }

  public void setVifType(VifTypeEnum vifType) {
    this.vifType = vifType;
  }

  public VifAttachmentContext parentVifId(String parentVifId) {
    this.parentVifId = parentVifId;
    return this;
  }

   /**
   * VIF ID of the parent VIF if vif_type is CHILD
   * @return parentVifId
  **/
  @Schema(description = "VIF ID of the parent VIF if vif_type is CHILD")
  public String getParentVifId() {
    return parentVifId;
  }

  public void setParentVifId(String parentVifId) {
    this.parentVifId = parentVifId;
  }

  public VifAttachmentContext appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * An application ID used to identify / look up a child VIF behind a parent VIF. Only effective when vif_type is CHILD. 
   * @return appId
  **/
  @Schema(description = "An application ID used to identify / look up a child VIF behind a parent VIF. Only effective when vif_type is CHILD. ")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public VifAttachmentContext trafficTag(Integer trafficTag) {
    this.trafficTag = trafficTag;
    return this;
  }

   /**
   * Current we use VLAN id as the traffic tag. Only effective when vif_type is CHILD. Each logical port inside a container must have a unique traffic tag. If the traffic_tag is not unique, no error is generated, but traffic will not be delivered to any port with a non-unique tag. 
   * @return trafficTag
  **/
  @Schema(description = "Current we use VLAN id as the traffic tag. Only effective when vif_type is CHILD. Each logical port inside a container must have a unique traffic tag. If the traffic_tag is not unique, no error is generated, but traffic will not be delivered to any port with a non-unique tag. ")
  public Integer getTrafficTag() {
    return trafficTag;
  }

  public void setTrafficTag(Integer trafficTag) {
    this.trafficTag = trafficTag;
  }

  public VifAttachmentContext transportNodeUuid(String transportNodeUuid) {
    this.transportNodeUuid = transportNodeUuid;
    return this;
  }

   /**
   * Only effective when vif_type is INDEPENDENT. Each logical port inside a bare metal server or container must have a transport node UUID. We use transport node ID as transport node UUID. 
   * @return transportNodeUuid
  **/
  @Schema(description = "Only effective when vif_type is INDEPENDENT. Each logical port inside a bare metal server or container must have a transport node UUID. We use transport node ID as transport node UUID. ")
  public String getTransportNodeUuid() {
    return transportNodeUuid;
  }

  public void setTransportNodeUuid(String transportNodeUuid) {
    this.transportNodeUuid = transportNodeUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VifAttachmentContext vifAttachmentContext = (VifAttachmentContext) o;
    return Objects.equals(this.vifType, vifAttachmentContext.vifType) &&
        Objects.equals(this.parentVifId, vifAttachmentContext.parentVifId) &&
        Objects.equals(this.appId, vifAttachmentContext.appId) &&
        Objects.equals(this.trafficTag, vifAttachmentContext.trafficTag) &&
        Objects.equals(this.transportNodeUuid, vifAttachmentContext.transportNodeUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vifType, parentVifId, appId, trafficTag, transportNodeUuid, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VifAttachmentContext {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vifType: ").append(toIndentedString(vifType)).append("\n");
    sb.append("    parentVifId: ").append(toIndentedString(parentVifId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    trafficTag: ").append(toIndentedString(trafficTag)).append("\n");
    sb.append("    transportNodeUuid: ").append(toIndentedString(transportNodeUuid)).append("\n");
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
