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
/**
 * Each revoked certificate is identified in a CRL by its certificate serial number.
 */
@Schema(description = "Each revoked certificate is identified in a CRL by its certificate serial number.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-19T07:44:41.574+08:00[Asia/Shanghai]")
public class X509CrlEntry {
  @SerializedName("revocation_date")
  private String revocationDate = null;

  @SerializedName("serial_number")
  private String serialNumber = null;

   /**
   * Revocation date
   * @return revocationDate
  **/
  @Schema(description = "Revocation date")
  public String getRevocationDate() {
    return revocationDate;
  }

   /**
   * the revoked certificate&#x27;s serial number
   * @return serialNumber
  **/
  @Schema(description = "the revoked certificate's serial number")
  public String getSerialNumber() {
    return serialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    X509CrlEntry x509CrlEntry = (X509CrlEntry) o;
    return Objects.equals(this.revocationDate, x509CrlEntry.revocationDate) &&
        Objects.equals(this.serialNumber, x509CrlEntry.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revocationDate, serialNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class X509CrlEntry {\n");
    
    sb.append("    revocationDate: ").append(toIndentedString(revocationDate)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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
