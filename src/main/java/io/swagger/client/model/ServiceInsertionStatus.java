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
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * It represents global status of Service Insertion for a particular context type. It shows whether a service insertion is enabled or not for a type.
 */
@Schema(description = "It represents global status of Service Insertion for a particular context type. It shows whether a service insertion is enabled or not for a type.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ServiceInsertionStatus extends ManagedResource {
  /**
   * service insertion status for a context type (e.g. east_west traffic).
   */
  @JsonAdapter(GlobalStatusEnum.Adapter.class)
  public enum GlobalStatusEnum {
    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    GlobalStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GlobalStatusEnum fromValue(String text) {
      for (GlobalStatusEnum b : GlobalStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GlobalStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GlobalStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GlobalStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GlobalStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("global_status")
  private GlobalStatusEnum globalStatus = null;

  /**
   * Type of service insertion contexts.
   */
  @JsonAdapter(ContextEnum.Adapter.class)
  public enum ContextEnum {
    EAST_WEST("east_west"),
    NORTH_SOUTH("north_south");

    private String value;

    ContextEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ContextEnum fromValue(String text) {
      for (ContextEnum b : ContextEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ContextEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContextEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContextEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContextEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("context")
  private ContextEnum context = null;

  public ServiceInsertionStatus globalStatus(GlobalStatusEnum globalStatus) {
    this.globalStatus = globalStatus;
    return this;
  }

   /**
   * service insertion status for a context type (e.g. east_west traffic).
   * @return globalStatus
  **/
  @Schema(required = true, description = "service insertion status for a context type (e.g. east_west traffic).")
  public GlobalStatusEnum getGlobalStatus() {
    return globalStatus;
  }

  public void setGlobalStatus(GlobalStatusEnum globalStatus) {
    this.globalStatus = globalStatus;
  }

  public ServiceInsertionStatus context(ContextEnum context) {
    this.context = context;
    return this;
  }

   /**
   * Type of service insertion contexts.
   * @return context
  **/
  @Schema(required = true, description = "Type of service insertion contexts.")
  public ContextEnum getContext() {
    return context;
  }

  public void setContext(ContextEnum context) {
    this.context = context;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInsertionStatus serviceInsertionStatus = (ServiceInsertionStatus) o;
    return Objects.equals(this.globalStatus, serviceInsertionStatus.globalStatus) &&
        Objects.equals(this.context, serviceInsertionStatus.context) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalStatus, context, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInsertionStatus {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    globalStatus: ").append(toIndentedString(globalStatus)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
