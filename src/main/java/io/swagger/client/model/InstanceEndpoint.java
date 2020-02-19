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
import io.swagger.client.model.IPInfo;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.ResourceReference;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * An InstanceEndpoint belongs to one ServiceInstance and represents a redirection target for a Rule. For Example - It can be an L3 Destination. Service Attachments is required for a InstanceEndpoint of type LOGICAL, and deployed_to if its a VIRTUAL InstanceEndpoint.
 */
@Schema(description = "An InstanceEndpoint belongs to one ServiceInstance and represents a redirection target for a Rule. For Example - It can be an L3 Destination. Service Attachments is required for a InstanceEndpoint of type LOGICAL, and deployed_to if its a VIRTUAL InstanceEndpoint.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class InstanceEndpoint extends ManagedResource {
  @SerializedName("service_attachments")
  private List<ResourceReference> serviceAttachments = null;

  @SerializedName("target_ips")
  private List<IPInfo> targetIps = new ArrayList<IPInfo>();

  /**
   * LOGICAL - It must be created with a ServiceAttachment and identifies a destination connected to the Service Port of the ServiceAttachment, through the ServiceAttachment&#x27;s Logical Switch. VIRTUAL - It represents a L3 destination the router can route to but does not provide any further information about its location in the network. Virtual InstanceEndpoints are used for redirection targets that are not connected to Service Ports, such as the next-hop routers on the Edge uplinks.
   */
  @JsonAdapter(EndpointTypeEnum.Adapter.class)
  public enum EndpointTypeEnum {
    LOGICAL("LOGICAL"),
    VIRTUAL("VIRTUAL");

    private String value;

    EndpointTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EndpointTypeEnum fromValue(String text) {
      for (EndpointTypeEnum b : EndpointTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EndpointTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EndpointTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EndpointTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EndpointTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("endpoint_type")
  private EndpointTypeEnum endpointType = EndpointTypeEnum.LOGICAL;

  @SerializedName("service_instance_id")
  private String serviceInstanceId = null;

  @SerializedName("link_ids")
  private List<ResourceReference> linkIds = null;

  public InstanceEndpoint serviceAttachments(List<ResourceReference> serviceAttachments) {
    this.serviceAttachments = serviceAttachments;
    return this;
  }

  public InstanceEndpoint addServiceAttachmentsItem(ResourceReference serviceAttachmentsItem) {
    if (this.serviceAttachments == null) {
      this.serviceAttachments = new ArrayList<ResourceReference>();
    }
    this.serviceAttachments.add(serviceAttachmentsItem);
    return this;
  }

   /**
   * Id(s) of the Service Attachment where this enndpoint is connected to. Service Attachment is mandatory for LOGICAL Instance Endpoint.
   * @return serviceAttachments
  **/
  @Schema(description = "Id(s) of the Service Attachment where this enndpoint is connected to. Service Attachment is mandatory for LOGICAL Instance Endpoint.")
  public List<ResourceReference> getServiceAttachments() {
    return serviceAttachments;
  }

  public void setServiceAttachments(List<ResourceReference> serviceAttachments) {
    this.serviceAttachments = serviceAttachments;
  }

  public InstanceEndpoint targetIps(List<IPInfo> targetIps) {
    this.targetIps = targetIps;
    return this;
  }

  public InstanceEndpoint addTargetIpsItem(IPInfo targetIpsItem) {
    this.targetIps.add(targetIpsItem);
    return this;
  }

   /**
   * Target IPs on an interface of the Service Instance.
   * @return targetIps
  **/
  @Schema(required = true, description = "Target IPs on an interface of the Service Instance.")
  public List<IPInfo> getTargetIps() {
    return targetIps;
  }

  public void setTargetIps(List<IPInfo> targetIps) {
    this.targetIps = targetIps;
  }

  public InstanceEndpoint endpointType(EndpointTypeEnum endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * LOGICAL - It must be created with a ServiceAttachment and identifies a destination connected to the Service Port of the ServiceAttachment, through the ServiceAttachment&#x27;s Logical Switch. VIRTUAL - It represents a L3 destination the router can route to but does not provide any further information about its location in the network. Virtual InstanceEndpoints are used for redirection targets that are not connected to Service Ports, such as the next-hop routers on the Edge uplinks.
   * @return endpointType
  **/
  @Schema(description = "LOGICAL - It must be created with a ServiceAttachment and identifies a destination connected to the Service Port of the ServiceAttachment, through the ServiceAttachment's Logical Switch. VIRTUAL - It represents a L3 destination the router can route to but does not provide any further information about its location in the network. Virtual InstanceEndpoints are used for redirection targets that are not connected to Service Ports, such as the next-hop routers on the Edge uplinks.")
  public EndpointTypeEnum getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(EndpointTypeEnum endpointType) {
    this.endpointType = endpointType;
  }

   /**
   * The Service instancee with which the instance endpoint is associated.
   * @return serviceInstanceId
  **/
  @Schema(description = "The Service instancee with which the instance endpoint is associated.")
  public String getServiceInstanceId() {
    return serviceInstanceId;
  }

  public InstanceEndpoint linkIds(List<ResourceReference> linkIds) {
    this.linkIds = linkIds;
    return this;
  }

  public InstanceEndpoint addLinkIdsItem(ResourceReference linkIdsItem) {
    if (this.linkIds == null) {
      this.linkIds = new ArrayList<ResourceReference>();
    }
    this.linkIds.add(linkIdsItem);
    return this;
  }

   /**
   * Link Ids are mandatory for VIRTUAL Instance Endpoint. Even though VIRTUAL, the Instance Endpoint should be connected/accessible through an NSX object. The link id is this NSX object id. Example - For North-South Service Insertion, this is the LogicalRouter Id through which the targetIp/L3 destination accessible.
   * @return linkIds
  **/
  @Schema(description = "Link Ids are mandatory for VIRTUAL Instance Endpoint. Even though VIRTUAL, the Instance Endpoint should be connected/accessible through an NSX object. The link id is this NSX object id. Example - For North-South Service Insertion, this is the LogicalRouter Id through which the targetIp/L3 destination accessible.")
  public List<ResourceReference> getLinkIds() {
    return linkIds;
  }

  public void setLinkIds(List<ResourceReference> linkIds) {
    this.linkIds = linkIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceEndpoint instanceEndpoint = (InstanceEndpoint) o;
    return Objects.equals(this.serviceAttachments, instanceEndpoint.serviceAttachments) &&
        Objects.equals(this.targetIps, instanceEndpoint.targetIps) &&
        Objects.equals(this.endpointType, instanceEndpoint.endpointType) &&
        Objects.equals(this.serviceInstanceId, instanceEndpoint.serviceInstanceId) &&
        Objects.equals(this.linkIds, instanceEndpoint.linkIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAttachments, targetIps, endpointType, serviceInstanceId, linkIds, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceEndpoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    serviceAttachments: ").append(toIndentedString(serviceAttachments)).append("\n");
    sb.append("    targetIps: ").append(toIndentedString(targetIps)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    serviceInstanceId: ").append(toIndentedString(serviceInstanceId)).append("\n");
    sb.append("    linkIds: ").append(toIndentedString(linkIds)).append("\n");
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