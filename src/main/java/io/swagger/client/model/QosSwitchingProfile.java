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
import io.swagger.client.model.BaseSwitchingProfile;
import io.swagger.client.model.Dscp;
import io.swagger.client.model.QosBaseRateShaper;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * QosSwitchingProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class QosSwitchingProfile extends BaseSwitchingProfile {
  @SerializedName("shaper_configuration")
  private List<QosBaseRateShaper> shaperConfiguration = null;

  @SerializedName("class_of_service")
  private Integer classOfService = 0;

  @SerializedName("dscp")
  private Dscp dscp = null;

  public QosSwitchingProfile shaperConfiguration(List<QosBaseRateShaper> shaperConfiguration) {
    this.shaperConfiguration = shaperConfiguration;
    return this;
  }

  public QosSwitchingProfile addShaperConfigurationItem(QosBaseRateShaper shaperConfigurationItem) {
    if (this.shaperConfiguration == null) {
      this.shaperConfiguration = new ArrayList<QosBaseRateShaper>();
    }
    this.shaperConfiguration.add(shaperConfigurationItem);
    return this;
  }

   /**
   * Get shaperConfiguration
   * @return shaperConfiguration
  **/
  @Schema(description = "")
  public List<QosBaseRateShaper> getShaperConfiguration() {
    return shaperConfiguration;
  }

  public void setShaperConfiguration(List<QosBaseRateShaper> shaperConfiguration) {
    this.shaperConfiguration = shaperConfiguration;
  }

  public QosSwitchingProfile classOfService(Integer classOfService) {
    this.classOfService = classOfService;
    return this;
  }

   /**
   * Class of service
   * minimum: 0
   * maximum: 7
   * @return classOfService
  **/
  @Schema(description = "Class of service")
  public Integer getClassOfService() {
    return classOfService;
  }

  public void setClassOfService(Integer classOfService) {
    this.classOfService = classOfService;
  }

  public QosSwitchingProfile dscp(Dscp dscp) {
    this.dscp = dscp;
    return this;
  }

   /**
   * Get dscp
   * @return dscp
  **/
  @Schema(description = "")
  public Dscp getDscp() {
    return dscp;
  }

  public void setDscp(Dscp dscp) {
    this.dscp = dscp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QosSwitchingProfile qosSwitchingProfile = (QosSwitchingProfile) o;
    return Objects.equals(this.shaperConfiguration, qosSwitchingProfile.shaperConfiguration) &&
        Objects.equals(this.classOfService, qosSwitchingProfile.classOfService) &&
        Objects.equals(this.dscp, qosSwitchingProfile.dscp) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shaperConfiguration, classOfService, dscp, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QosSwitchingProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    shaperConfiguration: ").append(toIndentedString(shaperConfiguration)).append("\n");
    sb.append("    classOfService: ").append(toIndentedString(classOfService)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
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