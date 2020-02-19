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
import io.swagger.client.model.ManagementPlaneBrokerProperties;
import io.swagger.client.model.Resource;
import io.swagger.client.model.ResourceLink;
import io.swagger.client.model.SelfResourceLink;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Information about the management plane this controller is communciating with
 */
@Schema(description = "Information about the management plane this controller is communciating with")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class ManagementPlaneProperties extends Resource {
  @SerializedName("account")
  private Object account = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("brokers")
  private List<ManagementPlaneBrokerProperties> brokers = null;

  public ManagementPlaneProperties account(Object account) {
    this.account = account;
    return this;
  }

   /**
   * The account name to use when authenticating to the management plane&#x27;s message bus.
   * @return account
  **/
  @Schema(description = "The account name to use when authenticating to the management plane's message bus.")
  public Object getAccount() {
    return account;
  }

  public void setAccount(Object account) {
    this.account = account;
  }

  public ManagementPlaneProperties secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * The shared secret to use when autnenticating to the management plane&#x27;s message bus. Not returned in REST responses.
   * @return secret
  **/
  @Schema(description = "The shared secret to use when autnenticating to the management plane's message bus. Not returned in REST responses.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public ManagementPlaneProperties brokers(List<ManagementPlaneBrokerProperties> brokers) {
    this.brokers = brokers;
    return this;
  }

  public ManagementPlaneProperties addBrokersItem(ManagementPlaneBrokerProperties brokersItem) {
    if (this.brokers == null) {
      this.brokers = new ArrayList<ManagementPlaneBrokerProperties>();
    }
    this.brokers.add(brokersItem);
    return this;
  }

   /**
   * The list of messaging brokers this controller is configured with.
   * @return brokers
  **/
  @Schema(description = "The list of messaging brokers this controller is configured with.")
  public List<ManagementPlaneBrokerProperties> getBrokers() {
    return brokers;
  }

  public void setBrokers(List<ManagementPlaneBrokerProperties> brokers) {
    this.brokers = brokers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementPlaneProperties managementPlaneProperties = (ManagementPlaneProperties) o;
    return Objects.equals(this.account, managementPlaneProperties.account) &&
        Objects.equals(this.secret, managementPlaneProperties.secret) &&
        Objects.equals(this.brokers, managementPlaneProperties.brokers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, secret, brokers, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementPlaneProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
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
