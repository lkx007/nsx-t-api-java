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
import io.swagger.client.model.ClientTypeCollectionConfiguration;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * HPM feature stack data collection frequency configuration
 */
@Schema(description = "HPM feature stack data collection frequency configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class FeatureStackCollectionConfiguration extends ManagedResource {
  @SerializedName("feature_stack_name")
  private String featureStackName = null;

  @SerializedName("client_type_collection_configurations")
  private List<ClientTypeCollectionConfiguration> clientTypeCollectionConfigurations = null;

  public FeatureStackCollectionConfiguration featureStackName(String featureStackName) {
    this.featureStackName = featureStackName;
    return this;
  }

   /**
   * The name of the feature stack
   * @return featureStackName
  **/
  @Schema(required = true, description = "The name of the feature stack")
  public String getFeatureStackName() {
    return featureStackName;
  }

  public void setFeatureStackName(String featureStackName) {
    this.featureStackName = featureStackName;
  }

  public FeatureStackCollectionConfiguration clientTypeCollectionConfigurations(List<ClientTypeCollectionConfiguration> clientTypeCollectionConfigurations) {
    this.clientTypeCollectionConfigurations = clientTypeCollectionConfigurations;
    return this;
  }

  public FeatureStackCollectionConfiguration addClientTypeCollectionConfigurationsItem(ClientTypeCollectionConfiguration clientTypeCollectionConfigurationsItem) {
    if (this.clientTypeCollectionConfigurations == null) {
      this.clientTypeCollectionConfigurations = new ArrayList<ClientTypeCollectionConfiguration>();
    }
    this.clientTypeCollectionConfigurations.add(clientTypeCollectionConfigurationsItem);
    return this;
  }

   /**
   * The set of client type data collection configurations
   * @return clientTypeCollectionConfigurations
  **/
  @Schema(description = "The set of client type data collection configurations")
  public List<ClientTypeCollectionConfiguration> getClientTypeCollectionConfigurations() {
    return clientTypeCollectionConfigurations;
  }

  public void setClientTypeCollectionConfigurations(List<ClientTypeCollectionConfiguration> clientTypeCollectionConfigurations) {
    this.clientTypeCollectionConfigurations = clientTypeCollectionConfigurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureStackCollectionConfiguration featureStackCollectionConfiguration = (FeatureStackCollectionConfiguration) o;
    return Objects.equals(this.featureStackName, featureStackCollectionConfiguration.featureStackName) &&
        Objects.equals(this.clientTypeCollectionConfigurations, featureStackCollectionConfiguration.clientTypeCollectionConfigurations) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureStackName, clientTypeCollectionConfigurations, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureStackCollectionConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    featureStackName: ").append(toIndentedString(featureStackName)).append("\n");
    sb.append("    clientTypeCollectionConfigurations: ").append(toIndentedString(clientTypeCollectionConfigurations)).append("\n");
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
