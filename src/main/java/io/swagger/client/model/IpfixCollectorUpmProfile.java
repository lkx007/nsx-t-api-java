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
import io.swagger.client.model.IpfixCollector;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The configuration for Internet protocol flow information export (IPFIX) collector. It should be referenced in other IPFIX profile as a collecor config. The IPFIX exporter will send records to these collectors. 
 */
@Schema(description = "The configuration for Internet protocol flow information export (IPFIX) collector. It should be referenced in other IPFIX profile as a collecor config. The IPFIX exporter will send records to these collectors. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IpfixCollectorUpmProfile extends ManagedResource {
  /**
   * All IPFIX collector profile types.
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    IPFIXCOLLECTORUPMPROFILE("IpfixCollectorUpmProfile");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResourceTypeEnum fromValue(String text) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ResourceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("resource_type")
  private ResourceTypeEnum resourceType = null;

  @SerializedName("collectors")
  private List<IpfixCollector> collectors = new ArrayList<IpfixCollector>();

  public IpfixCollectorUpmProfile resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * All IPFIX collector profile types.
   * @return resourceType
  **/
  @Schema(required = true, description = "All IPFIX collector profile types.")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }

  public IpfixCollectorUpmProfile collectors(List<IpfixCollector> collectors) {
    this.collectors = collectors;
    return this;
  }

  public IpfixCollectorUpmProfile addCollectorsItem(IpfixCollector collectorsItem) {
    this.collectors.add(collectorsItem);
    return this;
  }

   /**
   * IPFIX Collector Set
   * @return collectors
  **/
  @Schema(required = true, description = "IPFIX Collector Set")
  public List<IpfixCollector> getCollectors() {
    return collectors;
  }

  public void setCollectors(List<IpfixCollector> collectors) {
    this.collectors = collectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpfixCollectorUpmProfile ipfixCollectorUpmProfile = (IpfixCollectorUpmProfile) o;
    return Objects.equals(this.resourceType, ipfixCollectorUpmProfile.resourceType) &&
        Objects.equals(this.collectors, ipfixCollectorUpmProfile.collectors) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, collectors, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpfixCollectorUpmProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    collectors: ").append(toIndentedString(collectors)).append("\n");
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
