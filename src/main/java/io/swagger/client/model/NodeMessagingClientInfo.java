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
import io.swagger.client.model.MessagingClientInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * NodeMessagingClientInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class NodeMessagingClientInfo {
  @SerializedName("clients")
  private List<MessagingClientInfo> clients = null;

  /**
   * Entity type of this messaging client
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    HTTP("HTTP"),
    DATASTORE("DATASTORE"),
    MANAGER("MANAGER"),
    POLICY("POLICY"),
    CONTROLLER("CONTROLLER");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EntityTypeEnum fromValue(String text) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EntityTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("entity_type")
  private EntityTypeEnum entityType = null;

  public NodeMessagingClientInfo clients(List<MessagingClientInfo> clients) {
    this.clients = clients;
    return this;
  }

  public NodeMessagingClientInfo addClientsItem(MessagingClientInfo clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<MessagingClientInfo>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * A list of messaging clients owned by this entity
   * @return clients
  **/
  @Schema(description = "A list of messaging clients owned by this entity")
  public List<MessagingClientInfo> getClients() {
    return clients;
  }

  public void setClients(List<MessagingClientInfo> clients) {
    this.clients = clients;
  }

  public NodeMessagingClientInfo entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Entity type of this messaging client
   * @return entityType
  **/
  @Schema(description = "Entity type of this messaging client")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeMessagingClientInfo nodeMessagingClientInfo = (NodeMessagingClientInfo) o;
    return Objects.equals(this.clients, nodeMessagingClientInfo.clients) &&
        Objects.equals(this.entityType, nodeMessagingClientInfo.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients, entityType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeMessagingClientInfo {\n");
    
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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
