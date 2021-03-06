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
import io.swagger.client.model.MirrorDestination;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * IPMirrorDestination
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPMirrorDestination extends MirrorDestination {
  @SerializedName("destination_ips")
  private List<String> destinationIps = new ArrayList<String>();

  /**
   * You can choose GRE, ERSPAN II or ERSPAN III.
   */
  @JsonAdapter(EncapsulationTypeEnum.Adapter.class)
  public enum EncapsulationTypeEnum {
    GRE("GRE"),
    ERSPAN_TWO("ERSPAN_TWO"),
    ERSPAN_THREE("ERSPAN_THREE");

    private String value;

    EncapsulationTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EncapsulationTypeEnum fromValue(String text) {
      for (EncapsulationTypeEnum b : EncapsulationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EncapsulationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncapsulationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncapsulationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EncapsulationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("encapsulation_type")
  private EncapsulationTypeEnum encapsulationType = EncapsulationTypeEnum.GRE;

  @SerializedName("erspan_id")
  private Integer erspanId = null;

  @SerializedName("gre_key")
  private Integer greKey = null;

  public IPMirrorDestination destinationIps(List<String> destinationIps) {
    this.destinationIps = destinationIps;
    return this;
  }

  public IPMirrorDestination addDestinationIpsItem(String destinationIpsItem) {
    this.destinationIps.add(destinationIpsItem);
    return this;
  }

   /**
   * The destination IPs of the mirror packet will be sent to.
   * @return destinationIps
  **/
  @Schema(required = true, description = "The destination IPs of the mirror packet will be sent to.")
  public List<String> getDestinationIps() {
    return destinationIps;
  }

  public void setDestinationIps(List<String> destinationIps) {
    this.destinationIps = destinationIps;
  }

  public IPMirrorDestination encapsulationType(EncapsulationTypeEnum encapsulationType) {
    this.encapsulationType = encapsulationType;
    return this;
  }

   /**
   * You can choose GRE, ERSPAN II or ERSPAN III.
   * @return encapsulationType
  **/
  @Schema(required = true, description = "You can choose GRE, ERSPAN II or ERSPAN III.")
  public EncapsulationTypeEnum getEncapsulationType() {
    return encapsulationType;
  }

  public void setEncapsulationType(EncapsulationTypeEnum encapsulationType) {
    this.encapsulationType = encapsulationType;
  }

  public IPMirrorDestination erspanId(Integer erspanId) {
    this.erspanId = erspanId;
    return this;
  }

   /**
   * Used by physical switch for the mirror traffic forwarding. Must be provided and only effective when encapsulation type is ERSPAN type II or type III. 
   * minimum: 0
   * maximum: 1023
   * @return erspanId
  **/
  @Schema(description = "Used by physical switch for the mirror traffic forwarding. Must be provided and only effective when encapsulation type is ERSPAN type II or type III. ")
  public Integer getErspanId() {
    return erspanId;
  }

  public void setErspanId(Integer erspanId) {
    this.erspanId = erspanId;
  }

  public IPMirrorDestination greKey(Integer greKey) {
    this.greKey = greKey;
    return this;
  }

   /**
   * User-configurable 32-bit key only for GRE
   * @return greKey
  **/
  @Schema(description = "User-configurable 32-bit key only for GRE")
  public Integer getGreKey() {
    return greKey;
  }

  public void setGreKey(Integer greKey) {
    this.greKey = greKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPMirrorDestination ipMirrorDestination = (IPMirrorDestination) o;
    return Objects.equals(this.destinationIps, ipMirrorDestination.destinationIps) &&
        Objects.equals(this.encapsulationType, ipMirrorDestination.encapsulationType) &&
        Objects.equals(this.erspanId, ipMirrorDestination.erspanId) &&
        Objects.equals(this.greKey, ipMirrorDestination.greKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationIps, encapsulationType, erspanId, greKey, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPMirrorDestination {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    destinationIps: ").append(toIndentedString(destinationIps)).append("\n");
    sb.append("    encapsulationType: ").append(toIndentedString(encapsulationType)).append("\n");
    sb.append("    erspanId: ").append(toIndentedString(erspanId)).append("\n");
    sb.append("    greKey: ").append(toIndentedString(greKey)).append("\n");
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
