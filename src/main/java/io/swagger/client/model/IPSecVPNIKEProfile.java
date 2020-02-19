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
import java.util.ArrayList;
import java.util.List;
/**
 * IKE Profile is a reusable profile that captures IKE phase one negotiation parameters. Any changes affects all IPSec VPN sessions consuming this profile.
 */
@Schema(description = "IKE Profile is a reusable profile that captures IKE phase one negotiation parameters. Any changes affects all IPSec VPN sessions consuming this profile.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class IPSecVPNIKEProfile extends ManagedResource {
  /**
   * The IKEDigestAlgorithms are used to verify message integrity during IKE negotiation. SHA1 produces 160 bits hash and SHA2_XXX produces XXX bit hash. 
   */
  @JsonAdapter(DigestAlgorithmsEnum.Adapter.class)
  public enum DigestAlgorithmsEnum {
    SHA1("SHA1"),
    SHA2_256("SHA2_256"),
    SHA2_384("SHA2_384"),
    SHA2_512("SHA2_512");

    private String value;

    DigestAlgorithmsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DigestAlgorithmsEnum fromValue(String text) {
      for (DigestAlgorithmsEnum b : DigestAlgorithmsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DigestAlgorithmsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DigestAlgorithmsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DigestAlgorithmsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DigestAlgorithmsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("digest_algorithms")
  private List<DigestAlgorithmsEnum> digestAlgorithms = null;

  /**
   * IKEEncryption algorithms are used to ensure confidentiality of the messages exchanged during IKE negotiations. AES stands for Advanced Encryption Standards. AES_128 uses 128-bit keys whereas AES_256 uses 256-bit keys for encryption and decryption. AES_GCM stands for Advanced Encryption Standard(AES) in Galois/Counter Mode(GCM) and is used to provide both confidentiality and data origin authentication. AES_GCM composed of two separate functions one for encryption(AES) and one for authentication(GMAC). AES_GCM algorithms will be available with IKE_V2 version only. AES_GCM_128 uses 128-bit keys. AES_GCM_192 uses 192-bit keys. AES_GCM_256 uses 256-bit keys. 
   */
  @JsonAdapter(EncryptionAlgorithmsEnum.Adapter.class)
  public enum EncryptionAlgorithmsEnum {
    _128("AES_128"),
    _256("AES_256"),
    GCM_128("AES_GCM_128"),
    GCM_192("AES_GCM_192"),
    GCM_256("AES_GCM_256");

    private String value;

    EncryptionAlgorithmsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EncryptionAlgorithmsEnum fromValue(String text) {
      for (EncryptionAlgorithmsEnum b : EncryptionAlgorithmsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EncryptionAlgorithmsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncryptionAlgorithmsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncryptionAlgorithmsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EncryptionAlgorithmsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("encryption_algorithms")
  private List<EncryptionAlgorithmsEnum> encryptionAlgorithms = null;

  /**
   * Diffie-Hellman groups represent algorithm used to derive shared keys between IPSec VPN initiator and responder over an unsecured network. GROUP2 uses 1024-bit Modular Exponentiation (MODP) group. GROUP5 uses 1536-bit MODP group. GROUP14 uses 2048-bit MODP group. GROUP15 uses 3072-bit MODP group. GROUP16 uses 4096-bit MODP group. GROUP19 uses 256-bit random Elliptic Curve (ECP) group. GROUP20 uses 384-bit random ECP group. GROUP21 uses 521-bit random ECP group. 
   */
  @JsonAdapter(DhGroupsEnum.Adapter.class)
  public enum DhGroupsEnum {
    GROUP2("GROUP2"),
    GROUP5("GROUP5"),
    GROUP14("GROUP14"),
    GROUP15("GROUP15"),
    GROUP16("GROUP16"),
    GROUP19("GROUP19"),
    GROUP20("GROUP20"),
    GROUP21("GROUP21");

    private String value;

    DhGroupsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DhGroupsEnum fromValue(String text) {
      for (DhGroupsEnum b : DhGroupsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DhGroupsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DhGroupsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DhGroupsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DhGroupsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("dh_groups")
  private List<DhGroupsEnum> dhGroups = null;

  @SerializedName("sa_life_time")
  private Long saLifeTime = 86400l;

  /**
   * IKE protocol version to be used. IKE-Flex will initiate IKE-V2 and responds to both IKE-V1 and IKE-V2.
   */
  @JsonAdapter(IkeVersionEnum.Adapter.class)
  public enum IkeVersionEnum {
    V1("IKE_V1"),
    V2("IKE_V2"),
    FLEX("IKE_FLEX");

    private String value;

    IkeVersionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IkeVersionEnum fromValue(String text) {
      for (IkeVersionEnum b : IkeVersionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IkeVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IkeVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IkeVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IkeVersionEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("ike_version")
  private IkeVersionEnum ikeVersion = IkeVersionEnum.V2;

  public IPSecVPNIKEProfile digestAlgorithms(List<DigestAlgorithmsEnum> digestAlgorithms) {
    this.digestAlgorithms = digestAlgorithms;
    return this;
  }

  public IPSecVPNIKEProfile addDigestAlgorithmsItem(DigestAlgorithmsEnum digestAlgorithmsItem) {
    if (this.digestAlgorithms == null) {
      this.digestAlgorithms = new ArrayList<DigestAlgorithmsEnum>();
    }
    this.digestAlgorithms.add(digestAlgorithmsItem);
    return this;
  }

   /**
   * Algorithm to be used for message digest during Internet Key Exchange(IKE) negotiation. Default is SHA2_256.
   * @return digestAlgorithms
  **/
  @Schema(description = "Algorithm to be used for message digest during Internet Key Exchange(IKE) negotiation. Default is SHA2_256.")
  public List<DigestAlgorithmsEnum> getDigestAlgorithms() {
    return digestAlgorithms;
  }

  public void setDigestAlgorithms(List<DigestAlgorithmsEnum> digestAlgorithms) {
    this.digestAlgorithms = digestAlgorithms;
  }

  public IPSecVPNIKEProfile encryptionAlgorithms(List<EncryptionAlgorithmsEnum> encryptionAlgorithms) {
    this.encryptionAlgorithms = encryptionAlgorithms;
    return this;
  }

  public IPSecVPNIKEProfile addEncryptionAlgorithmsItem(EncryptionAlgorithmsEnum encryptionAlgorithmsItem) {
    if (this.encryptionAlgorithms == null) {
      this.encryptionAlgorithms = new ArrayList<EncryptionAlgorithmsEnum>();
    }
    this.encryptionAlgorithms.add(encryptionAlgorithmsItem);
    return this;
  }

   /**
   * Encryption algorithm is used during Internet Key Exchange(IKE) negotiation. Default is AES_128.
   * @return encryptionAlgorithms
  **/
  @Schema(description = "Encryption algorithm is used during Internet Key Exchange(IKE) negotiation. Default is AES_128.")
  public List<EncryptionAlgorithmsEnum> getEncryptionAlgorithms() {
    return encryptionAlgorithms;
  }

  public void setEncryptionAlgorithms(List<EncryptionAlgorithmsEnum> encryptionAlgorithms) {
    this.encryptionAlgorithms = encryptionAlgorithms;
  }

  public IPSecVPNIKEProfile dhGroups(List<DhGroupsEnum> dhGroups) {
    this.dhGroups = dhGroups;
    return this;
  }

  public IPSecVPNIKEProfile addDhGroupsItem(DhGroupsEnum dhGroupsItem) {
    if (this.dhGroups == null) {
      this.dhGroups = new ArrayList<DhGroupsEnum>();
    }
    this.dhGroups.add(dhGroupsItem);
    return this;
  }

   /**
   * Diffie-Hellman group to be used if PFS is enabled. Default is GROUP14.
   * @return dhGroups
  **/
  @Schema(description = "Diffie-Hellman group to be used if PFS is enabled. Default is GROUP14.")
  public List<DhGroupsEnum> getDhGroups() {
    return dhGroups;
  }

  public void setDhGroups(List<DhGroupsEnum> dhGroups) {
    this.dhGroups = dhGroups;
  }

  public IPSecVPNIKEProfile saLifeTime(Long saLifeTime) {
    this.saLifeTime = saLifeTime;
    return this;
  }

   /**
   * Life time for security association. Default is 86400 seconds (1 day).
   * minimum: 21600
   * maximum: 31536000
   * @return saLifeTime
  **/
  @Schema(description = "Life time for security association. Default is 86400 seconds (1 day).")
  public Long getSaLifeTime() {
    return saLifeTime;
  }

  public void setSaLifeTime(Long saLifeTime) {
    this.saLifeTime = saLifeTime;
  }

  public IPSecVPNIKEProfile ikeVersion(IkeVersionEnum ikeVersion) {
    this.ikeVersion = ikeVersion;
    return this;
  }

   /**
   * IKE protocol version to be used. IKE-Flex will initiate IKE-V2 and responds to both IKE-V1 and IKE-V2.
   * @return ikeVersion
  **/
  @Schema(description = "IKE protocol version to be used. IKE-Flex will initiate IKE-V2 and responds to both IKE-V1 and IKE-V2.")
  public IkeVersionEnum getIkeVersion() {
    return ikeVersion;
  }

  public void setIkeVersion(IkeVersionEnum ikeVersion) {
    this.ikeVersion = ikeVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPSecVPNIKEProfile ipSecVPNIKEProfile = (IPSecVPNIKEProfile) o;
    return Objects.equals(this.digestAlgorithms, ipSecVPNIKEProfile.digestAlgorithms) &&
        Objects.equals(this.encryptionAlgorithms, ipSecVPNIKEProfile.encryptionAlgorithms) &&
        Objects.equals(this.dhGroups, ipSecVPNIKEProfile.dhGroups) &&
        Objects.equals(this.saLifeTime, ipSecVPNIKEProfile.saLifeTime) &&
        Objects.equals(this.ikeVersion, ipSecVPNIKEProfile.ikeVersion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digestAlgorithms, encryptionAlgorithms, dhGroups, saLifeTime, ikeVersion, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSecVPNIKEProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    digestAlgorithms: ").append(toIndentedString(digestAlgorithms)).append("\n");
    sb.append("    encryptionAlgorithms: ").append(toIndentedString(encryptionAlgorithms)).append("\n");
    sb.append("    dhGroups: ").append(toIndentedString(dhGroups)).append("\n");
    sb.append("    saLifeTime: ").append(toIndentedString(saLifeTime)).append("\n");
    sb.append("    ikeVersion: ").append(toIndentedString(ikeVersion)).append("\n");
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