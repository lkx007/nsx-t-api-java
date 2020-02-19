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
import io.swagger.client.model.ExtraConfig;
import io.swagger.client.model.ManagedResource;
import io.swagger.client.model.PacketAddressClassifier;
import io.swagger.client.model.SwitchingProfileTypeIdEntry;
import io.swagger.client.model.Tag;
import io.swagger.client.model.VlanTrunkSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * LogicalSwitch
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class LogicalSwitch extends ManagedResource {
  /**
   * This field indicates purpose of a LogicalSwitch. It is set by manager internally or user can provide this field. If not set, DEFAULT type is assigned. NSX components can use this field to create LogicalSwitch that provides component specific functionality. DEFAULT type LogicalSwitches are created for basic L2 connectivity by API users. SERVICE_PLANE type LogicalSwitches are system created service plane LogicalSwitches for Service Insertion service. User can not create SERVICE_PLANE type of LogicalSwitch. DHCP_RELAY type LogicalSwitches are created by external user like Policy with special permissions or by system and will be treated as internal LogicalSwitches. Such LogicalSwitch will not be exposed to vSphere user. 
   */
  @JsonAdapter(SwitchTypeEnum.Adapter.class)
  public enum SwitchTypeEnum {
    DEFAULT("DEFAULT"),
    SERVICE_PLANE("SERVICE_PLANE"),
    DHCP_RELAY("DHCP_RELAY");

    private String value;

    SwitchTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SwitchTypeEnum fromValue(String text) {
      for (SwitchTypeEnum b : SwitchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SwitchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SwitchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SwitchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SwitchTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("switch_type")
  private SwitchTypeEnum switchType = null;

  /**
   * Replication mode of the Logical Switch
   */
  @JsonAdapter(ReplicationModeEnum.Adapter.class)
  public enum ReplicationModeEnum {
    MTEP("MTEP"),
    SOURCE("SOURCE");

    private String value;

    ReplicationModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ReplicationModeEnum fromValue(String text) {
      for (ReplicationModeEnum b : ReplicationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ReplicationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReplicationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReplicationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReplicationModeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("replication_mode")
  private ReplicationModeEnum replicationMode = null;

  @SerializedName("extra_configs")
  private List<ExtraConfig> extraConfigs = null;

  @SerializedName("uplink_teaming_policy_name")
  private String uplinkTeamingPolicyName = null;

  @SerializedName("transport_zone_id")
  private String transportZoneId = null;

  @SerializedName("ip_pool_id")
  private String ipPoolId = null;

  @SerializedName("vlan")
  private Long vlan = null;

  @SerializedName("hybrid")
  private Boolean hybrid = false;

  @SerializedName("mac_pool_id")
  private String macPoolId = null;

  @SerializedName("vni")
  private Integer vni = null;

  @SerializedName("vlan_trunk_spec")
  private VlanTrunkSpec vlanTrunkSpec = null;

  /**
   * Represents Desired state of the Logical Switch
   */
  @JsonAdapter(AdminStateEnum.Adapter.class)
  public enum AdminStateEnum {
    UP("UP"),
    DOWN("DOWN");

    private String value;

    AdminStateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AdminStateEnum fromValue(String text) {
      for (AdminStateEnum b : AdminStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AdminStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AdminStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AdminStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AdminStateEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("admin_state")
  private AdminStateEnum adminState = null;

  @SerializedName("address_bindings")
  private List<PacketAddressClassifier> addressBindings = null;

  @SerializedName("switching_profile_ids")
  private List<SwitchingProfileTypeIdEntry> switchingProfileIds = null;

  public LogicalSwitch switchType(SwitchTypeEnum switchType) {
    this.switchType = switchType;
    return this;
  }

   /**
   * This field indicates purpose of a LogicalSwitch. It is set by manager internally or user can provide this field. If not set, DEFAULT type is assigned. NSX components can use this field to create LogicalSwitch that provides component specific functionality. DEFAULT type LogicalSwitches are created for basic L2 connectivity by API users. SERVICE_PLANE type LogicalSwitches are system created service plane LogicalSwitches for Service Insertion service. User can not create SERVICE_PLANE type of LogicalSwitch. DHCP_RELAY type LogicalSwitches are created by external user like Policy with special permissions or by system and will be treated as internal LogicalSwitches. Such LogicalSwitch will not be exposed to vSphere user. 
   * @return switchType
  **/
  @Schema(description = "This field indicates purpose of a LogicalSwitch. It is set by manager internally or user can provide this field. If not set, DEFAULT type is assigned. NSX components can use this field to create LogicalSwitch that provides component specific functionality. DEFAULT type LogicalSwitches are created for basic L2 connectivity by API users. SERVICE_PLANE type LogicalSwitches are system created service plane LogicalSwitches for Service Insertion service. User can not create SERVICE_PLANE type of LogicalSwitch. DHCP_RELAY type LogicalSwitches are created by external user like Policy with special permissions or by system and will be treated as internal LogicalSwitches. Such LogicalSwitch will not be exposed to vSphere user. ")
  public SwitchTypeEnum getSwitchType() {
    return switchType;
  }

  public void setSwitchType(SwitchTypeEnum switchType) {
    this.switchType = switchType;
  }

  public LogicalSwitch replicationMode(ReplicationModeEnum replicationMode) {
    this.replicationMode = replicationMode;
    return this;
  }

   /**
   * Replication mode of the Logical Switch
   * @return replicationMode
  **/
  @Schema(description = "Replication mode of the Logical Switch")
  public ReplicationModeEnum getReplicationMode() {
    return replicationMode;
  }

  public void setReplicationMode(ReplicationModeEnum replicationMode) {
    this.replicationMode = replicationMode;
  }

  public LogicalSwitch extraConfigs(List<ExtraConfig> extraConfigs) {
    this.extraConfigs = extraConfigs;
    return this;
  }

  public LogicalSwitch addExtraConfigsItem(ExtraConfig extraConfigsItem) {
    if (this.extraConfigs == null) {
      this.extraConfigs = new ArrayList<ExtraConfig>();
    }
    this.extraConfigs.add(extraConfigsItem);
    return this;
  }

   /**
   * This property could be used for vendor specific configuration in key value string pairs, the setting in extra_configs will be automatically inheritted by logical ports in the logical switch. 
   * @return extraConfigs
  **/
  @Schema(description = "This property could be used for vendor specific configuration in key value string pairs, the setting in extra_configs will be automatically inheritted by logical ports in the logical switch. ")
  public List<ExtraConfig> getExtraConfigs() {
    return extraConfigs;
  }

  public void setExtraConfigs(List<ExtraConfig> extraConfigs) {
    this.extraConfigs = extraConfigs;
  }

  public LogicalSwitch uplinkTeamingPolicyName(String uplinkTeamingPolicyName) {
    this.uplinkTeamingPolicyName = uplinkTeamingPolicyName;
    return this;
  }

   /**
   * This name has to be one of the switching uplink teaming policy names listed inside the logical switch&#x27;s TransportZone. If this field is not specified, the logical switch will not have a teaming policy associated with it and the host switch&#x27;s default teaming policy will be used.
   * @return uplinkTeamingPolicyName
  **/
  @Schema(description = "This name has to be one of the switching uplink teaming policy names listed inside the logical switch's TransportZone. If this field is not specified, the logical switch will not have a teaming policy associated with it and the host switch's default teaming policy will be used.")
  public String getUplinkTeamingPolicyName() {
    return uplinkTeamingPolicyName;
  }

  public void setUplinkTeamingPolicyName(String uplinkTeamingPolicyName) {
    this.uplinkTeamingPolicyName = uplinkTeamingPolicyName;
  }

  public LogicalSwitch transportZoneId(String transportZoneId) {
    this.transportZoneId = transportZoneId;
    return this;
  }

   /**
   * Id of the TransportZone to which this LogicalSwitch is associated
   * @return transportZoneId
  **/
  @Schema(required = true, description = "Id of the TransportZone to which this LogicalSwitch is associated")
  public String getTransportZoneId() {
    return transportZoneId;
  }

  public void setTransportZoneId(String transportZoneId) {
    this.transportZoneId = transportZoneId;
  }

  public LogicalSwitch ipPoolId(String ipPoolId) {
    this.ipPoolId = ipPoolId;
    return this;
  }

   /**
   * IP pool id that associated with a LogicalSwitch.
   * @return ipPoolId
  **/
  @Schema(description = "IP pool id that associated with a LogicalSwitch.")
  public String getIpPoolId() {
    return ipPoolId;
  }

  public void setIpPoolId(String ipPoolId) {
    this.ipPoolId = ipPoolId;
  }

  public LogicalSwitch vlan(Long vlan) {
    this.vlan = vlan;
    return this;
  }

   /**
   * This property is dedicated to VLAN based network, to set VLAN of logical network. It is mutually exclusive with &#x27;vlan_trunk_spec&#x27;. 
   * @return vlan
  **/
  @Schema(description = "This property is dedicated to VLAN based network, to set VLAN of logical network. It is mutually exclusive with 'vlan_trunk_spec'. ")
  public Long getVlan() {
    return vlan;
  }

  public void setVlan(Long vlan) {
    this.vlan = vlan;
  }

  public LogicalSwitch hybrid(Boolean hybrid) {
    this.hybrid = hybrid;
    return this;
  }

   /**
   * If this flag is set to true, then all the logical switch ports attached to this logical switch will behave in a hybrid fashion. The hybrid logical switch port indicates to NSX that the VM intends to operate in underlay mode, but retains the ability to forward egress traffic to the NSX overlay network. This flag can be enabled only for the logical switches in the overlay type transport zone which has host switch mode as STANDARD and also has either CrossCloud or CloudScope tag scopes. Only the NSX public cloud gateway (PCG) uses this flag, other host agents like ESX, KVM and Edge will ignore it. This property cannot be modified once the logical switch is created. 
   * @return hybrid
  **/
  @Schema(description = "If this flag is set to true, then all the logical switch ports attached to this logical switch will behave in a hybrid fashion. The hybrid logical switch port indicates to NSX that the VM intends to operate in underlay mode, but retains the ability to forward egress traffic to the NSX overlay network. This flag can be enabled only for the logical switches in the overlay type transport zone which has host switch mode as STANDARD and also has either CrossCloud or CloudScope tag scopes. Only the NSX public cloud gateway (PCG) uses this flag, other host agents like ESX, KVM and Edge will ignore it. This property cannot be modified once the logical switch is created. ")
  public Boolean isHybrid() {
    return hybrid;
  }

  public void setHybrid(Boolean hybrid) {
    this.hybrid = hybrid;
  }

  public LogicalSwitch macPoolId(String macPoolId) {
    this.macPoolId = macPoolId;
    return this;
  }

   /**
   * Mac pool id that associated with a LogicalSwitch.
   * @return macPoolId
  **/
  @Schema(description = "Mac pool id that associated with a LogicalSwitch.")
  public String getMacPoolId() {
    return macPoolId;
  }

  public void setMacPoolId(String macPoolId) {
    this.macPoolId = macPoolId;
  }

  public LogicalSwitch vni(Integer vni) {
    this.vni = vni;
    return this;
  }

   /**
   * Only for OVERLAY network. A VNI will be auto-allocated from the default VNI pool if not given; otherwise the given VNI has to be inside the default pool and not used by any other LogicalSwitch. 
   * @return vni
  **/
  @Schema(description = "Only for OVERLAY network. A VNI will be auto-allocated from the default VNI pool if not given; otherwise the given VNI has to be inside the default pool and not used by any other LogicalSwitch. ")
  public Integer getVni() {
    return vni;
  }

  public void setVni(Integer vni) {
    this.vni = vni;
  }

  public LogicalSwitch vlanTrunkSpec(VlanTrunkSpec vlanTrunkSpec) {
    this.vlanTrunkSpec = vlanTrunkSpec;
    return this;
  }

   /**
   * Get vlanTrunkSpec
   * @return vlanTrunkSpec
  **/
  @Schema(description = "")
  public VlanTrunkSpec getVlanTrunkSpec() {
    return vlanTrunkSpec;
  }

  public void setVlanTrunkSpec(VlanTrunkSpec vlanTrunkSpec) {
    this.vlanTrunkSpec = vlanTrunkSpec;
  }

  public LogicalSwitch adminState(AdminStateEnum adminState) {
    this.adminState = adminState;
    return this;
  }

   /**
   * Represents Desired state of the Logical Switch
   * @return adminState
  **/
  @Schema(required = true, description = "Represents Desired state of the Logical Switch")
  public AdminStateEnum getAdminState() {
    return adminState;
  }

  public void setAdminState(AdminStateEnum adminState) {
    this.adminState = adminState;
  }

  public LogicalSwitch addressBindings(List<PacketAddressClassifier> addressBindings) {
    this.addressBindings = addressBindings;
    return this;
  }

  public LogicalSwitch addAddressBindingsItem(PacketAddressClassifier addressBindingsItem) {
    if (this.addressBindings == null) {
      this.addressBindings = new ArrayList<PacketAddressClassifier>();
    }
    this.addressBindings.add(addressBindingsItem);
    return this;
  }

   /**
   * Address bindings for the Logical switch
   * @return addressBindings
  **/
  @Schema(description = "Address bindings for the Logical switch")
  public List<PacketAddressClassifier> getAddressBindings() {
    return addressBindings;
  }

  public void setAddressBindings(List<PacketAddressClassifier> addressBindings) {
    this.addressBindings = addressBindings;
  }

  public LogicalSwitch switchingProfileIds(List<SwitchingProfileTypeIdEntry> switchingProfileIds) {
    this.switchingProfileIds = switchingProfileIds;
    return this;
  }

  public LogicalSwitch addSwitchingProfileIdsItem(SwitchingProfileTypeIdEntry switchingProfileIdsItem) {
    if (this.switchingProfileIds == null) {
      this.switchingProfileIds = new ArrayList<SwitchingProfileTypeIdEntry>();
    }
    this.switchingProfileIds.add(switchingProfileIdsItem);
    return this;
  }

   /**
   * Get switchingProfileIds
   * @return switchingProfileIds
  **/
  @Schema(description = "")
  public List<SwitchingProfileTypeIdEntry> getSwitchingProfileIds() {
    return switchingProfileIds;
  }

  public void setSwitchingProfileIds(List<SwitchingProfileTypeIdEntry> switchingProfileIds) {
    this.switchingProfileIds = switchingProfileIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalSwitch logicalSwitch = (LogicalSwitch) o;
    return Objects.equals(this.switchType, logicalSwitch.switchType) &&
        Objects.equals(this.replicationMode, logicalSwitch.replicationMode) &&
        Objects.equals(this.extraConfigs, logicalSwitch.extraConfigs) &&
        Objects.equals(this.uplinkTeamingPolicyName, logicalSwitch.uplinkTeamingPolicyName) &&
        Objects.equals(this.transportZoneId, logicalSwitch.transportZoneId) &&
        Objects.equals(this.ipPoolId, logicalSwitch.ipPoolId) &&
        Objects.equals(this.vlan, logicalSwitch.vlan) &&
        Objects.equals(this.hybrid, logicalSwitch.hybrid) &&
        Objects.equals(this.macPoolId, logicalSwitch.macPoolId) &&
        Objects.equals(this.vni, logicalSwitch.vni) &&
        Objects.equals(this.vlanTrunkSpec, logicalSwitch.vlanTrunkSpec) &&
        Objects.equals(this.adminState, logicalSwitch.adminState) &&
        Objects.equals(this.addressBindings, logicalSwitch.addressBindings) &&
        Objects.equals(this.switchingProfileIds, logicalSwitch.switchingProfileIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switchType, replicationMode, extraConfigs, uplinkTeamingPolicyName, transportZoneId, ipPoolId, vlan, hybrid, macPoolId, vni, vlanTrunkSpec, adminState, addressBindings, switchingProfileIds, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalSwitch {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    switchType: ").append(toIndentedString(switchType)).append("\n");
    sb.append("    replicationMode: ").append(toIndentedString(replicationMode)).append("\n");
    sb.append("    extraConfigs: ").append(toIndentedString(extraConfigs)).append("\n");
    sb.append("    uplinkTeamingPolicyName: ").append(toIndentedString(uplinkTeamingPolicyName)).append("\n");
    sb.append("    transportZoneId: ").append(toIndentedString(transportZoneId)).append("\n");
    sb.append("    ipPoolId: ").append(toIndentedString(ipPoolId)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    hybrid: ").append(toIndentedString(hybrid)).append("\n");
    sb.append("    macPoolId: ").append(toIndentedString(macPoolId)).append("\n");
    sb.append("    vni: ").append(toIndentedString(vni)).append("\n");
    sb.append("    vlanTrunkSpec: ").append(toIndentedString(vlanTrunkSpec)).append("\n");
    sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
    sb.append("    addressBindings: ").append(toIndentedString(addressBindings)).append("\n");
    sb.append("    switchingProfileIds: ").append(toIndentedString(switchingProfileIds)).append("\n");
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