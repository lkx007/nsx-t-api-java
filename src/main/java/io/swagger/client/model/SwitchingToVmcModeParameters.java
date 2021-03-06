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
import io.swagger.client.model.NodeMode;
import io.swagger.client.model.Oauth2Credentials;
import io.swagger.client.model.OrgInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Possible values of a mode in a \&quot;/config/nsx_appliance_mode\&quot; file
 */
@Schema(description = "Possible values of a mode in a \"/config/nsx_appliance_mode\" file")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class SwitchingToVmcModeParameters extends NodeMode {
  @SerializedName("sre_org")
  private OrgInfo sreOrg = null;

  @SerializedName("default_org_id")
  private String defaultOrgId = null;

  @SerializedName("ea_org")
  private OrgInfo eaOrg = null;

  @SerializedName("gss_org")
  private OrgInfo gssOrg = null;

  @SerializedName("proxy_host")
  private String proxyHost = null;

  @SerializedName("csp_time_drift")
  private Long cspTimeDrift = null;

  @SerializedName("sddc_id")
  private String sddcId = null;

  @SerializedName("basic_auth_whitelist_ips")
  private List<String> basicAuthWhitelistIps = null;

  @SerializedName("base_url")
  private String baseUrl = null;

  @SerializedName("proxy_port")
  private Long proxyPort = null;

  @SerializedName("csp_org_uri")
  private String cspOrgUri = null;

  @SerializedName("csp_client_credential")
  private Oauth2Credentials cspClientCredential = null;

  @SerializedName("auth_code")
  private Oauth2Credentials authCode = null;

  @SerializedName("mode_change_only")
  private Boolean modeChangeOnly = null;

  @SerializedName("csp_client_incoming_credentials")
  private List<String> cspClientIncomingCredentials = null;

  @SerializedName("service_definition_id")
  private String serviceDefinitionId = null;

  /**
   * Node Mode type
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    SWITCHINGTOVMCMODEPARAMETERS("SwitchingToVmcModeParameters");

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
  private ResourceTypeEnum resourceType = ResourceTypeEnum.SWITCHINGTOVMCMODEPARAMETERS;

  public SwitchingToVmcModeParameters sreOrg(OrgInfo sreOrg) {
    this.sreOrg = sreOrg;
    return this;
  }

   /**
   * Get sreOrg
   * @return sreOrg
  **/
  @Schema(description = "")
  public OrgInfo getSreOrg() {
    return sreOrg;
  }

  public void setSreOrg(OrgInfo sreOrg) {
    this.sreOrg = sreOrg;
  }

  public SwitchingToVmcModeParameters defaultOrgId(String defaultOrgId) {
    this.defaultOrgId = defaultOrgId;
    return this;
  }

   /**
   * Org ID of a Client - commonly UUID.
   * @return defaultOrgId
  **/
  @Schema(description = "Org ID of a Client - commonly UUID.")
  public String getDefaultOrgId() {
    return defaultOrgId;
  }

  public void setDefaultOrgId(String defaultOrgId) {
    this.defaultOrgId = defaultOrgId;
  }

  public SwitchingToVmcModeParameters eaOrg(OrgInfo eaOrg) {
    this.eaOrg = eaOrg;
    return this;
  }

   /**
   * Get eaOrg
   * @return eaOrg
  **/
  @Schema(description = "")
  public OrgInfo getEaOrg() {
    return eaOrg;
  }

  public void setEaOrg(OrgInfo eaOrg) {
    this.eaOrg = eaOrg;
  }

  public SwitchingToVmcModeParameters gssOrg(OrgInfo gssOrg) {
    this.gssOrg = gssOrg;
    return this;
  }

   /**
   * Get gssOrg
   * @return gssOrg
  **/
  @Schema(description = "")
  public OrgInfo getGssOrg() {
    return gssOrg;
  }

  public void setGssOrg(OrgInfo gssOrg) {
    this.gssOrg = gssOrg;
  }

  public SwitchingToVmcModeParameters proxyHost(String proxyHost) {
    this.proxyHost = proxyHost;
    return this;
  }

   /**
   * IP/host of PoP (Point-of-Presence) HTTP proxy server
   * @return proxyHost
  **/
  @Schema(description = "IP/host of PoP (Point-of-Presence) HTTP proxy server")
  public String getProxyHost() {
    return proxyHost;
  }

  public void setProxyHost(String proxyHost) {
    this.proxyHost = proxyHost;
  }

  public SwitchingToVmcModeParameters cspTimeDrift(Long cspTimeDrift) {
    this.cspTimeDrift = cspTimeDrift;
    return this;
  }

   /**
   * CSP time drift in milliseconds
   * @return cspTimeDrift
  **/
  @Schema(description = "CSP time drift in milliseconds")
  public Long getCspTimeDrift() {
    return cspTimeDrift;
  }

  public void setCspTimeDrift(Long cspTimeDrift) {
    this.cspTimeDrift = cspTimeDrift;
  }

  public SwitchingToVmcModeParameters sddcId(String sddcId) {
    this.sddcId = sddcId;
    return this;
  }

   /**
   * SDDC id
   * @return sddcId
  **/
  @Schema(description = "SDDC id")
  public String getSddcId() {
    return sddcId;
  }

  public void setSddcId(String sddcId) {
    this.sddcId = sddcId;
  }

  public SwitchingToVmcModeParameters basicAuthWhitelistIps(List<String> basicAuthWhitelistIps) {
    this.basicAuthWhitelistIps = basicAuthWhitelistIps;
    return this;
  }

  public SwitchingToVmcModeParameters addBasicAuthWhitelistIpsItem(String basicAuthWhitelistIpsItem) {
    if (this.basicAuthWhitelistIps == null) {
      this.basicAuthWhitelistIps = new ArrayList<String>();
    }
    this.basicAuthWhitelistIps.add(basicAuthWhitelistIpsItem);
    return this;
  }

   /**
   * List of whitelist IPs for basic auth
   * @return basicAuthWhitelistIps
  **/
  @Schema(description = "List of whitelist IPs for basic auth")
  public List<String> getBasicAuthWhitelistIps() {
    return basicAuthWhitelistIps;
  }

  public void setBasicAuthWhitelistIps(List<String> basicAuthWhitelistIps) {
    this.basicAuthWhitelistIps = basicAuthWhitelistIps;
  }

  public SwitchingToVmcModeParameters baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * Protocol and domain name (or IP address) of a CSP server, like \&quot;https://console-stg.cloud.vmware.com\&quot;.
   * @return baseUrl
  **/
  @Schema(description = "Protocol and domain name (or IP address) of a CSP server, like \"https://console-stg.cloud.vmware.com\".")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public SwitchingToVmcModeParameters proxyPort(Long proxyPort) {
    this.proxyPort = proxyPort;
    return this;
  }

   /**
   * Port of PoP (Point-of-Presence) Http proxy server
   * minimum: 1
   * maximum: 65535
   * @return proxyPort
  **/
  @Schema(description = "Port of PoP (Point-of-Presence) Http proxy server")
  public Long getProxyPort() {
    return proxyPort;
  }

  public void setProxyPort(Long proxyPort) {
    this.proxyPort = proxyPort;
  }

  public SwitchingToVmcModeParameters cspOrgUri(String cspOrgUri) {
    this.cspOrgUri = cspOrgUri;
    return this;
  }

   /**
   * Relative path on CSP server to the Org location. Can be \&quot;/csp/gateway/am/api/orgs/\&quot;.
   * @return cspOrgUri
  **/
  @Schema(description = "Relative path on CSP server to the Org location. Can be \"/csp/gateway/am/api/orgs/\".")
  public String getCspOrgUri() {
    return cspOrgUri;
  }

  public void setCspOrgUri(String cspOrgUri) {
    this.cspOrgUri = cspOrgUri;
  }

  public SwitchingToVmcModeParameters cspClientCredential(Oauth2Credentials cspClientCredential) {
    this.cspClientCredential = cspClientCredential;
    return this;
  }

   /**
   * Get cspClientCredential
   * @return cspClientCredential
  **/
  @Schema(description = "")
  public Oauth2Credentials getCspClientCredential() {
    return cspClientCredential;
  }

  public void setCspClientCredential(Oauth2Credentials cspClientCredential) {
    this.cspClientCredential = cspClientCredential;
  }

  public SwitchingToVmcModeParameters authCode(Oauth2Credentials authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * Get authCode
   * @return authCode
  **/
  @Schema(description = "")
  public Oauth2Credentials getAuthCode() {
    return authCode;
  }

  public void setAuthCode(Oauth2Credentials authCode) {
    this.authCode = authCode;
  }

  public SwitchingToVmcModeParameters modeChangeOnly(Boolean modeChangeOnly) {
    this.modeChangeOnly = modeChangeOnly;
    return this;
  }

   /**
   * When this parameter is set to true, only a change of the node mode happens without any update to the auth properties. When this param is not set to true i.e. set to false or not provided, mode change and update to the auth properties will both happen.
   * @return modeChangeOnly
  **/
  @Schema(description = "When this parameter is set to true, only a change of the node mode happens without any update to the auth properties. When this param is not set to true i.e. set to false or not provided, mode change and update to the auth properties will both happen.")
  public Boolean isModeChangeOnly() {
    return modeChangeOnly;
  }

  public void setModeChangeOnly(Boolean modeChangeOnly) {
    this.modeChangeOnly = modeChangeOnly;
  }

  public SwitchingToVmcModeParameters cspClientIncomingCredentials(List<String> cspClientIncomingCredentials) {
    this.cspClientIncomingCredentials = cspClientIncomingCredentials;
    return this;
  }

  public SwitchingToVmcModeParameters addCspClientIncomingCredentialsItem(String cspClientIncomingCredentialsItem) {
    if (this.cspClientIncomingCredentials == null) {
      this.cspClientIncomingCredentials = new ArrayList<String>();
    }
    this.cspClientIncomingCredentials.add(cspClientIncomingCredentialsItem);
    return this;
  }

   /**
   * List of incoming client IDs
   * @return cspClientIncomingCredentials
  **/
  @Schema(description = "List of incoming client IDs")
  public List<String> getCspClientIncomingCredentials() {
    return cspClientIncomingCredentials;
  }

  public void setCspClientIncomingCredentials(List<String> cspClientIncomingCredentials) {
    this.cspClientIncomingCredentials = cspClientIncomingCredentials;
  }

  public SwitchingToVmcModeParameters serviceDefinitionId(String serviceDefinitionId) {
    this.serviceDefinitionId = serviceDefinitionId;
    return this;
  }

   /**
   * Service definition id
   * @return serviceDefinitionId
  **/
  @Schema(description = "Service definition id")
  public String getServiceDefinitionId() {
    return serviceDefinitionId;
  }

  public void setServiceDefinitionId(String serviceDefinitionId) {
    this.serviceDefinitionId = serviceDefinitionId;
  }

  public SwitchingToVmcModeParameters resourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Node Mode type
   * @return resourceType
  **/
  @Schema(description = "Node Mode type")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchingToVmcModeParameters switchingToVmcModeParameters = (SwitchingToVmcModeParameters) o;
    return Objects.equals(this.sreOrg, switchingToVmcModeParameters.sreOrg) &&
        Objects.equals(this.defaultOrgId, switchingToVmcModeParameters.defaultOrgId) &&
        Objects.equals(this.eaOrg, switchingToVmcModeParameters.eaOrg) &&
        Objects.equals(this.gssOrg, switchingToVmcModeParameters.gssOrg) &&
        Objects.equals(this.proxyHost, switchingToVmcModeParameters.proxyHost) &&
        Objects.equals(this.cspTimeDrift, switchingToVmcModeParameters.cspTimeDrift) &&
        Objects.equals(this.sddcId, switchingToVmcModeParameters.sddcId) &&
        Objects.equals(this.basicAuthWhitelistIps, switchingToVmcModeParameters.basicAuthWhitelistIps) &&
        Objects.equals(this.baseUrl, switchingToVmcModeParameters.baseUrl) &&
        Objects.equals(this.proxyPort, switchingToVmcModeParameters.proxyPort) &&
        Objects.equals(this.cspOrgUri, switchingToVmcModeParameters.cspOrgUri) &&
        Objects.equals(this.cspClientCredential, switchingToVmcModeParameters.cspClientCredential) &&
        Objects.equals(this.authCode, switchingToVmcModeParameters.authCode) &&
        Objects.equals(this.modeChangeOnly, switchingToVmcModeParameters.modeChangeOnly) &&
        Objects.equals(this.cspClientIncomingCredentials, switchingToVmcModeParameters.cspClientIncomingCredentials) &&
        Objects.equals(this.serviceDefinitionId, switchingToVmcModeParameters.serviceDefinitionId) &&
        Objects.equals(this.resourceType, switchingToVmcModeParameters.resourceType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sreOrg, defaultOrgId, eaOrg, gssOrg, proxyHost, cspTimeDrift, sddcId, basicAuthWhitelistIps, baseUrl, proxyPort, cspOrgUri, cspClientCredential, authCode, modeChangeOnly, cspClientIncomingCredentials, serviceDefinitionId, resourceType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchingToVmcModeParameters {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sreOrg: ").append(toIndentedString(sreOrg)).append("\n");
    sb.append("    defaultOrgId: ").append(toIndentedString(defaultOrgId)).append("\n");
    sb.append("    eaOrg: ").append(toIndentedString(eaOrg)).append("\n");
    sb.append("    gssOrg: ").append(toIndentedString(gssOrg)).append("\n");
    sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
    sb.append("    cspTimeDrift: ").append(toIndentedString(cspTimeDrift)).append("\n");
    sb.append("    sddcId: ").append(toIndentedString(sddcId)).append("\n");
    sb.append("    basicAuthWhitelistIps: ").append(toIndentedString(basicAuthWhitelistIps)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
    sb.append("    cspOrgUri: ").append(toIndentedString(cspOrgUri)).append("\n");
    sb.append("    cspClientCredential: ").append(toIndentedString(cspClientCredential)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    modeChangeOnly: ").append(toIndentedString(modeChangeOnly)).append("\n");
    sb.append("    cspClientIncomingCredentials: ").append(toIndentedString(cspClientIncomingCredentials)).append("\n");
    sb.append("    serviceDefinitionId: ").append(toIndentedString(serviceDefinitionId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
