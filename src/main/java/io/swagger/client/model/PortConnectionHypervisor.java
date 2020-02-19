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
import io.swagger.client.model.BaseHostSwitchProfile;
import io.swagger.client.model.InterfaceNeighborProperties;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.NodeInterfaceProperties;
import io.swagger.client.model.Pnic;
import io.swagger.client.model.PortConnectionEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Port Connection Hypervisor/Transport Node Entity
 */
@Schema(description = "Port Connection Hypervisor/Transport Node Entity")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class PortConnectionHypervisor extends PortConnectionEntity {
  @SerializedName("pnics")
  private List<Pnic> pnics = null;

  @SerializedName("pnics_list")
  private List<NodeInterfaceProperties> pnicsList = null;

  @SerializedName("neighbors_list")
  private List<InterfaceNeighborProperties> neighborsList = null;

  @SerializedName("profiles")
  private List<BaseHostSwitchProfile> profiles = null;

  public PortConnectionHypervisor pnics(List<Pnic> pnics) {
    this.pnics = pnics;
    return this;
  }

  public PortConnectionHypervisor addPnicsItem(Pnic pnicsItem) {
    if (this.pnics == null) {
      this.pnics = new ArrayList<Pnic>();
    }
    this.pnics.add(pnicsItem);
    return this;
  }

   /**
   * Get pnics
   * @return pnics
  **/
  @Schema(description = "")
  public List<Pnic> getPnics() {
    return pnics;
  }

  public void setPnics(List<Pnic> pnics) {
    this.pnics = pnics;
  }

  public PortConnectionHypervisor pnicsList(List<NodeInterfaceProperties> pnicsList) {
    this.pnicsList = pnicsList;
    return this;
  }

  public PortConnectionHypervisor addPnicsListItem(NodeInterfaceProperties pnicsListItem) {
    if (this.pnicsList == null) {
      this.pnicsList = new ArrayList<NodeInterfaceProperties>();
    }
    this.pnicsList.add(pnicsListItem);
    return this;
  }

   /**
   * Get pnicsList
   * @return pnicsList
  **/
  @Schema(description = "")
  public List<NodeInterfaceProperties> getPnicsList() {
    return pnicsList;
  }

  public void setPnicsList(List<NodeInterfaceProperties> pnicsList) {
    this.pnicsList = pnicsList;
  }

  public PortConnectionHypervisor neighborsList(List<InterfaceNeighborProperties> neighborsList) {
    this.neighborsList = neighborsList;
    return this;
  }

  public PortConnectionHypervisor addNeighborsListItem(InterfaceNeighborProperties neighborsListItem) {
    if (this.neighborsList == null) {
      this.neighborsList = new ArrayList<InterfaceNeighborProperties>();
    }
    this.neighborsList.add(neighborsListItem);
    return this;
  }

   /**
   * Get neighborsList
   * @return neighborsList
  **/
  @Schema(description = "")
  public List<InterfaceNeighborProperties> getNeighborsList() {
    return neighborsList;
  }

  public void setNeighborsList(List<InterfaceNeighborProperties> neighborsList) {
    this.neighborsList = neighborsList;
  }

  public PortConnectionHypervisor profiles(List<BaseHostSwitchProfile> profiles) {
    this.profiles = profiles;
    return this;
  }

  public PortConnectionHypervisor addProfilesItem(BaseHostSwitchProfile profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<BaseHostSwitchProfile>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @Schema(description = "")
  public List<BaseHostSwitchProfile> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<BaseHostSwitchProfile> profiles) {
    this.profiles = profiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortConnectionHypervisor portConnectionHypervisor = (PortConnectionHypervisor) o;
    return Objects.equals(this.pnics, portConnectionHypervisor.pnics) &&
        Objects.equals(this.pnicsList, portConnectionHypervisor.pnicsList) &&
        Objects.equals(this.neighborsList, portConnectionHypervisor.neighborsList) &&
        Objects.equals(this.profiles, portConnectionHypervisor.profiles) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnics, pnicsList, neighborsList, profiles, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortConnectionHypervisor {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pnics: ").append(toIndentedString(pnics)).append("\n");
    sb.append("    pnicsList: ").append(toIndentedString(pnicsList)).append("\n");
    sb.append("    neighborsList: ").append(toIndentedString(neighborsList)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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