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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * X509Certificate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class X509Certificate {
  @SerializedName("ecdsa_ec_field_f2mks")
  private List<Long> ecdsaEcFieldF2mks = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("is_ca")
  private Boolean isCa = null;

  @SerializedName("signature_algorithm")
  private String signatureAlgorithm = null;

  @SerializedName("ecdsa_public_key_a")
  private String ecdsaPublicKeyA = null;

  @SerializedName("rsa_public_key_exponent")
  private String rsaPublicKeyExponent = null;

  @SerializedName("ecdsa_ec_field_f2mm")
  private Long ecdsaEcFieldF2mm = null;

  @SerializedName("issuer_cn")
  private String issuerCn = null;

  @SerializedName("subject_cn")
  private String subjectCn = null;

  @SerializedName("ecdsa_public_key_order")
  private String ecdsaPublicKeyOrder = null;

  @SerializedName("ecdsa_ec_field_f2mrp")
  private String ecdsaEcFieldF2mrp = null;

  @SerializedName("public_key_length")
  private Long publicKeyLength = null;

  @SerializedName("not_before")
  private Long notBefore = null;

  @SerializedName("ecdsa_ec_field_f2pp")
  private String ecdsaEcFieldF2pp = null;

  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("ecdsa_public_key_b")
  private String ecdsaPublicKeyB = null;

  @SerializedName("rsa_public_key_modulus")
  private String rsaPublicKeyModulus = null;

  @SerializedName("dsa_public_key_y")
  private String dsaPublicKeyY = null;

  @SerializedName("ecdsa_public_key_cofactor")
  private Long ecdsaPublicKeyCofactor = null;

  @SerializedName("not_after")
  private Long notAfter = null;

  @SerializedName("dsa_public_key_q")
  private String dsaPublicKeyQ = null;

  @SerializedName("dsa_public_key_p")
  private String dsaPublicKeyP = null;

  @SerializedName("ecdsa_public_key_generator_y")
  private String ecdsaPublicKeyGeneratorY = null;

  @SerializedName("ecdsa_public_key_generator_x")
  private String ecdsaPublicKeyGeneratorX = null;

  /**
   * Cryptographic algorithm used by the public key for data encryption.
   */
  @JsonAdapter(PublicKeyAlgoEnum.Adapter.class)
  public enum PublicKeyAlgoEnum {
    RSA("RSA"),
    DSA("DSA"),
    ECDSA("ECDSA");

    private String value;

    PublicKeyAlgoEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PublicKeyAlgoEnum fromValue(String text) {
      for (PublicKeyAlgoEnum b : PublicKeyAlgoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PublicKeyAlgoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PublicKeyAlgoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PublicKeyAlgoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PublicKeyAlgoEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("public_key_algo")
  private PublicKeyAlgoEnum publicKeyAlgo = null;

  @SerializedName("is_valid")
  private Boolean isValid = null;

  @SerializedName("ecdsa_public_key_seed")
  private List<String> ecdsaPublicKeySeed = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("serial_number")
  private String serialNumber = null;

  @SerializedName("dsa_public_key_g")
  private String dsaPublicKeyG = null;

  @SerializedName("subject")
  private String subject = null;

  /**
   * Represents an elliptic curve (EC) finite field in ECDSA.
   */
  @JsonAdapter(EcdsaEcFieldEnum.Adapter.class)
  public enum EcdsaEcFieldEnum {
    F2M("F2M"),
    FP("FP");

    private String value;

    EcdsaEcFieldEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EcdsaEcFieldEnum fromValue(String text) {
      for (EcdsaEcFieldEnum b : EcdsaEcFieldEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EcdsaEcFieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EcdsaEcFieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EcdsaEcFieldEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EcdsaEcFieldEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("ecdsa_ec_field")
  private EcdsaEcFieldEnum ecdsaEcField = null;

  @SerializedName("ecdsa_curve_name")
  private String ecdsaCurveName = null;

   /**
   * The order of the middle term(s) of the reduction polynomial in elliptic curve (EC) | characteristic 2 finite field.| Contents of this array are copied to protect against subsequent modification in ECDSA.
   * @return ecdsaEcFieldF2mks
  **/
  @Schema(description = "The order of the middle term(s) of the reduction polynomial in elliptic curve (EC) | characteristic 2 finite field.| Contents of this array are copied to protect against subsequent modification in ECDSA.")
  public List<Long> getEcdsaEcFieldF2mks() {
    return ecdsaEcFieldF2mks;
  }

   /**
   * Certificate version (default v1)
   * @return version
  **/
  @Schema(description = "Certificate version (default v1)")
  public String getVersion() {
    return version;
  }

   /**
   * True if this is a CA certificate.
   * @return isCa
  **/
  @Schema(description = "True if this is a CA certificate.")
  public Boolean isIsCa() {
    return isCa;
  }

   /**
   * the algorithm used by the Certificate Authority to sign the certificate
   * @return signatureAlgorithm
  **/
  @Schema(description = "the algorithm used by the Certificate Authority to sign the certificate")
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

   /**
   * The first coefficient of this elliptic curve in ECDSA.
   * @return ecdsaPublicKeyA
  **/
  @Schema(description = "The first coefficient of this elliptic curve in ECDSA.")
  public String getEcdsaPublicKeyA() {
    return ecdsaPublicKeyA;
  }

   /**
   * An RSA public key is made up of the modulus and the public exponent. Exponent is a power number
   * @return rsaPublicKeyExponent
  **/
  @Schema(description = "An RSA public key is made up of the modulus and the public exponent. Exponent is a power number")
  public String getRsaPublicKeyExponent() {
    return rsaPublicKeyExponent;
  }

   /**
   * The first coefficient of this elliptic curve in elliptic curve (EC) | characteristic 2 finite field for ECDSA.
   * @return ecdsaEcFieldF2mm
  **/
  @Schema(description = "The first coefficient of this elliptic curve in elliptic curve (EC) | characteristic 2 finite field for ECDSA.")
  public Long getEcdsaEcFieldF2mm() {
    return ecdsaEcFieldF2mm;
  }

   /**
   * the certificate issuer&#x27;s common name
   * @return issuerCn
  **/
  @Schema(description = "the certificate issuer's common name")
  public String getIssuerCn() {
    return issuerCn;
  }

   /**
   * the certificate owner&#x27;s common name
   * @return subjectCn
  **/
  @Schema(description = "the certificate owner's common name")
  public String getSubjectCn() {
    return subjectCn;
  }

   /**
   * The order of generator G in ECDSA.
   * @return ecdsaPublicKeyOrder
  **/
  @Schema(description = "The order of generator G in ECDSA.")
  public String getEcdsaPublicKeyOrder() {
    return ecdsaPublicKeyOrder;
  }

   /**
   * The value whose i-th bit corresponds to the i-th coefficient of the reduction polynomial | in elliptic curve (EC) characteristic 2 finite field for ECDSA.
   * @return ecdsaEcFieldF2mrp
  **/
  @Schema(description = "The value whose i-th bit corresponds to the i-th coefficient of the reduction polynomial | in elliptic curve (EC) characteristic 2 finite field for ECDSA.")
  public String getEcdsaEcFieldF2mrp() {
    return ecdsaEcFieldF2mrp;
  }

   /**
   * size measured in bits of the public/private keys used in a cryptographic algorithm
   * @return publicKeyLength
  **/
  @Schema(description = "size measured in bits of the public/private keys used in a cryptographic algorithm")
  public Long getPublicKeyLength() {
    return publicKeyLength;
  }

   /**
   * the time in epoch milliseconds at which the certificate becomes valid
   * @return notBefore
  **/
  @Schema(description = "the time in epoch milliseconds at which the certificate becomes valid")
  public Long getNotBefore() {
    return notBefore;
  }

   /**
   * The specified prime for the elliptic curve prime finite field in ECDSA.
   * @return ecdsaEcFieldF2pp
  **/
  @Schema(description = "The specified prime for the elliptic curve prime finite field in ECDSA.")
  public String getEcdsaEcFieldF2pp() {
    return ecdsaEcFieldF2pp;
  }

   /**
   * the certificate issuers complete distinguished name
   * @return issuer
  **/
  @Schema(description = "the certificate issuers complete distinguished name")
  public String getIssuer() {
    return issuer;
  }

   /**
   * The second coefficient of this elliptic curve in ECDSA.
   * @return ecdsaPublicKeyB
  **/
  @Schema(description = "The second coefficient of this elliptic curve in ECDSA.")
  public String getEcdsaPublicKeyB() {
    return ecdsaPublicKeyB;
  }

   /**
   * An RSA public key is made up of the modulus and the public exponent. Modulus is wrap around number
   * @return rsaPublicKeyModulus
  **/
  @Schema(description = "An RSA public key is made up of the modulus and the public exponent. Modulus is wrap around number")
  public String getRsaPublicKeyModulus() {
    return rsaPublicKeyModulus;
  }

   /**
   * One of the DSA cryptogaphic algorithm&#x27;s strength parameters
   * @return dsaPublicKeyY
  **/
  @Schema(description = "One of the DSA cryptogaphic algorithm's strength parameters")
  public String getDsaPublicKeyY() {
    return dsaPublicKeyY;
  }

   /**
   * The co-factor in ECDSA.
   * @return ecdsaPublicKeyCofactor
  **/
  @Schema(description = "The co-factor in ECDSA.")
  public Long getEcdsaPublicKeyCofactor() {
    return ecdsaPublicKeyCofactor;
  }

   /**
   * the time in epoch milliseconds at which the certificate becomes invalid
   * @return notAfter
  **/
  @Schema(description = "the time in epoch milliseconds at which the certificate becomes invalid")
  public Long getNotAfter() {
    return notAfter;
  }

   /**
   * One of the DSA cryptogaphic algorithm&#x27;s strength parameters, sub-prime
   * @return dsaPublicKeyQ
  **/
  @Schema(description = "One of the DSA cryptogaphic algorithm's strength parameters, sub-prime")
  public String getDsaPublicKeyQ() {
    return dsaPublicKeyQ;
  }

   /**
   * One of the DSA cryptogaphic algorithm&#x27;s strength parameters, prime
   * @return dsaPublicKeyP
  **/
  @Schema(description = "One of the DSA cryptogaphic algorithm's strength parameters, prime")
  public String getDsaPublicKeyP() {
    return dsaPublicKeyP;
  }

   /**
   * y co-ordinate of G (the generator which is also known as the base point) in ECDSA.
   * @return ecdsaPublicKeyGeneratorY
  **/
  @Schema(description = "y co-ordinate of G (the generator which is also known as the base point) in ECDSA.")
  public String getEcdsaPublicKeyGeneratorY() {
    return ecdsaPublicKeyGeneratorY;
  }

   /**
   * x co-ordinate of G (the generator which is also known as the base point) in ECDSA.
   * @return ecdsaPublicKeyGeneratorX
  **/
  @Schema(description = "x co-ordinate of G (the generator which is also known as the base point) in ECDSA.")
  public String getEcdsaPublicKeyGeneratorX() {
    return ecdsaPublicKeyGeneratorX;
  }

   /**
   * Cryptographic algorithm used by the public key for data encryption.
   * @return publicKeyAlgo
  **/
  @Schema(description = "Cryptographic algorithm used by the public key for data encryption.")
  public PublicKeyAlgoEnum getPublicKeyAlgo() {
    return publicKeyAlgo;
  }

   /**
   * True if this certificate is valid.
   * @return isValid
  **/
  @Schema(description = "True if this certificate is valid.")
  public Boolean isIsValid() {
    return isValid;
  }

   /**
   * The bytes used during curve generation for later validation in ECDSA.| Contents of this array are copied to protect against subsequent modification.
   * @return ecdsaPublicKeySeed
  **/
  @Schema(description = "The bytes used during curve generation for later validation in ECDSA.| Contents of this array are copied to protect against subsequent modification.")
  public List<String> getEcdsaPublicKeySeed() {
    return ecdsaPublicKeySeed;
  }

   /**
   * the signature value(the raw signature bits) used for signing and validate the cert
   * @return signature
  **/
  @Schema(description = "the signature value(the raw signature bits) used for signing and validate the cert")
  public String getSignature() {
    return signature;
  }

   /**
   * certificate&#x27;s serial number
   * @return serialNumber
  **/
  @Schema(description = "certificate's serial number")
  public String getSerialNumber() {
    return serialNumber;
  }

   /**
   * One of the DSA cryptogaphic algorithm&#x27;s strength parameters, base
   * @return dsaPublicKeyG
  **/
  @Schema(description = "One of the DSA cryptogaphic algorithm's strength parameters, base")
  public String getDsaPublicKeyG() {
    return dsaPublicKeyG;
  }

   /**
   * the certificate owners complete distinguished name
   * @return subject
  **/
  @Schema(description = "the certificate owners complete distinguished name")
  public String getSubject() {
    return subject;
  }

   /**
   * Represents an elliptic curve (EC) finite field in ECDSA.
   * @return ecdsaEcField
  **/
  @Schema(description = "Represents an elliptic curve (EC) finite field in ECDSA.")
  public EcdsaEcFieldEnum getEcdsaEcField() {
    return ecdsaEcField;
  }

   /**
   * The Curve name for the ECDSA certificate.
   * @return ecdsaCurveName
  **/
  @Schema(description = "The Curve name for the ECDSA certificate.")
  public String getEcdsaCurveName() {
    return ecdsaCurveName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    X509Certificate x509Certificate = (X509Certificate) o;
    return Objects.equals(this.ecdsaEcFieldF2mks, x509Certificate.ecdsaEcFieldF2mks) &&
        Objects.equals(this.version, x509Certificate.version) &&
        Objects.equals(this.isCa, x509Certificate.isCa) &&
        Objects.equals(this.signatureAlgorithm, x509Certificate.signatureAlgorithm) &&
        Objects.equals(this.ecdsaPublicKeyA, x509Certificate.ecdsaPublicKeyA) &&
        Objects.equals(this.rsaPublicKeyExponent, x509Certificate.rsaPublicKeyExponent) &&
        Objects.equals(this.ecdsaEcFieldF2mm, x509Certificate.ecdsaEcFieldF2mm) &&
        Objects.equals(this.issuerCn, x509Certificate.issuerCn) &&
        Objects.equals(this.subjectCn, x509Certificate.subjectCn) &&
        Objects.equals(this.ecdsaPublicKeyOrder, x509Certificate.ecdsaPublicKeyOrder) &&
        Objects.equals(this.ecdsaEcFieldF2mrp, x509Certificate.ecdsaEcFieldF2mrp) &&
        Objects.equals(this.publicKeyLength, x509Certificate.publicKeyLength) &&
        Objects.equals(this.notBefore, x509Certificate.notBefore) &&
        Objects.equals(this.ecdsaEcFieldF2pp, x509Certificate.ecdsaEcFieldF2pp) &&
        Objects.equals(this.issuer, x509Certificate.issuer) &&
        Objects.equals(this.ecdsaPublicKeyB, x509Certificate.ecdsaPublicKeyB) &&
        Objects.equals(this.rsaPublicKeyModulus, x509Certificate.rsaPublicKeyModulus) &&
        Objects.equals(this.dsaPublicKeyY, x509Certificate.dsaPublicKeyY) &&
        Objects.equals(this.ecdsaPublicKeyCofactor, x509Certificate.ecdsaPublicKeyCofactor) &&
        Objects.equals(this.notAfter, x509Certificate.notAfter) &&
        Objects.equals(this.dsaPublicKeyQ, x509Certificate.dsaPublicKeyQ) &&
        Objects.equals(this.dsaPublicKeyP, x509Certificate.dsaPublicKeyP) &&
        Objects.equals(this.ecdsaPublicKeyGeneratorY, x509Certificate.ecdsaPublicKeyGeneratorY) &&
        Objects.equals(this.ecdsaPublicKeyGeneratorX, x509Certificate.ecdsaPublicKeyGeneratorX) &&
        Objects.equals(this.publicKeyAlgo, x509Certificate.publicKeyAlgo) &&
        Objects.equals(this.isValid, x509Certificate.isValid) &&
        Objects.equals(this.ecdsaPublicKeySeed, x509Certificate.ecdsaPublicKeySeed) &&
        Objects.equals(this.signature, x509Certificate.signature) &&
        Objects.equals(this.serialNumber, x509Certificate.serialNumber) &&
        Objects.equals(this.dsaPublicKeyG, x509Certificate.dsaPublicKeyG) &&
        Objects.equals(this.subject, x509Certificate.subject) &&
        Objects.equals(this.ecdsaEcField, x509Certificate.ecdsaEcField) &&
        Objects.equals(this.ecdsaCurveName, x509Certificate.ecdsaCurveName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecdsaEcFieldF2mks, version, isCa, signatureAlgorithm, ecdsaPublicKeyA, rsaPublicKeyExponent, ecdsaEcFieldF2mm, issuerCn, subjectCn, ecdsaPublicKeyOrder, ecdsaEcFieldF2mrp, publicKeyLength, notBefore, ecdsaEcFieldF2pp, issuer, ecdsaPublicKeyB, rsaPublicKeyModulus, dsaPublicKeyY, ecdsaPublicKeyCofactor, notAfter, dsaPublicKeyQ, dsaPublicKeyP, ecdsaPublicKeyGeneratorY, ecdsaPublicKeyGeneratorX, publicKeyAlgo, isValid, ecdsaPublicKeySeed, signature, serialNumber, dsaPublicKeyG, subject, ecdsaEcField, ecdsaCurveName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class X509Certificate {\n");
    
    sb.append("    ecdsaEcFieldF2mks: ").append(toIndentedString(ecdsaEcFieldF2mks)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    isCa: ").append(toIndentedString(isCa)).append("\n");
    sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
    sb.append("    ecdsaPublicKeyA: ").append(toIndentedString(ecdsaPublicKeyA)).append("\n");
    sb.append("    rsaPublicKeyExponent: ").append(toIndentedString(rsaPublicKeyExponent)).append("\n");
    sb.append("    ecdsaEcFieldF2mm: ").append(toIndentedString(ecdsaEcFieldF2mm)).append("\n");
    sb.append("    issuerCn: ").append(toIndentedString(issuerCn)).append("\n");
    sb.append("    subjectCn: ").append(toIndentedString(subjectCn)).append("\n");
    sb.append("    ecdsaPublicKeyOrder: ").append(toIndentedString(ecdsaPublicKeyOrder)).append("\n");
    sb.append("    ecdsaEcFieldF2mrp: ").append(toIndentedString(ecdsaEcFieldF2mrp)).append("\n");
    sb.append("    publicKeyLength: ").append(toIndentedString(publicKeyLength)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    ecdsaEcFieldF2pp: ").append(toIndentedString(ecdsaEcFieldF2pp)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    ecdsaPublicKeyB: ").append(toIndentedString(ecdsaPublicKeyB)).append("\n");
    sb.append("    rsaPublicKeyModulus: ").append(toIndentedString(rsaPublicKeyModulus)).append("\n");
    sb.append("    dsaPublicKeyY: ").append(toIndentedString(dsaPublicKeyY)).append("\n");
    sb.append("    ecdsaPublicKeyCofactor: ").append(toIndentedString(ecdsaPublicKeyCofactor)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    dsaPublicKeyQ: ").append(toIndentedString(dsaPublicKeyQ)).append("\n");
    sb.append("    dsaPublicKeyP: ").append(toIndentedString(dsaPublicKeyP)).append("\n");
    sb.append("    ecdsaPublicKeyGeneratorY: ").append(toIndentedString(ecdsaPublicKeyGeneratorY)).append("\n");
    sb.append("    ecdsaPublicKeyGeneratorX: ").append(toIndentedString(ecdsaPublicKeyGeneratorX)).append("\n");
    sb.append("    publicKeyAlgo: ").append(toIndentedString(publicKeyAlgo)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    ecdsaPublicKeySeed: ").append(toIndentedString(ecdsaPublicKeySeed)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    dsaPublicKeyG: ").append(toIndentedString(dsaPublicKeyG)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    ecdsaEcField: ").append(toIndentedString(ecdsaEcField)).append("\n");
    sb.append("    ecdsaCurveName: ").append(toIndentedString(ecdsaCurveName)).append("\n");
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
