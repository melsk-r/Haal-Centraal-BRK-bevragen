/*
 * Kadastraal onroerende zaken
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.
 *
 * OpenAPI spec version: 1.0.0
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
 * TypeKoopsom
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:29:42.896+02:00[Europe/Amsterdam]")
public class TypeKoopsom {
  @SerializedName("koopsom")
  private Integer koopsom = null;

  @SerializedName("koopjaar")
  private Integer koopjaar = null;

  @SerializedName("indicatieMetMeerObjectenVerkregen")
  private Boolean indicatieMetMeerObjectenVerkregen = null;

  public TypeKoopsom koopsom(Integer koopsom) {
    this.koopsom = koopsom;
    return this;
  }

   /**
   * Get koopsom
   * @return koopsom
  **/
  @Schema(description = "")
  public Integer getKoopsom() {
    return koopsom;
  }

  public void setKoopsom(Integer koopsom) {
    this.koopsom = koopsom;
  }

  public TypeKoopsom koopjaar(Integer koopjaar) {
    this.koopjaar = koopjaar;
    return this;
  }

   /**
   * Get koopjaar
   * @return koopjaar
  **/
  @Schema(description = "")
  public Integer getKoopjaar() {
    return koopjaar;
  }

  public void setKoopjaar(Integer koopjaar) {
    this.koopjaar = koopjaar;
  }

  public TypeKoopsom indicatieMetMeerObjectenVerkregen(Boolean indicatieMetMeerObjectenVerkregen) {
    this.indicatieMetMeerObjectenVerkregen = indicatieMetMeerObjectenVerkregen;
    return this;
  }

   /**
   * Get indicatieMetMeerObjectenVerkregen
   * @return indicatieMetMeerObjectenVerkregen
  **/
  @Schema(description = "")
  public Boolean isIndicatieMetMeerObjectenVerkregen() {
    return indicatieMetMeerObjectenVerkregen;
  }

  public void setIndicatieMetMeerObjectenVerkregen(Boolean indicatieMetMeerObjectenVerkregen) {
    this.indicatieMetMeerObjectenVerkregen = indicatieMetMeerObjectenVerkregen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeKoopsom typeKoopsom = (TypeKoopsom) o;
    return Objects.equals(this.koopsom, typeKoopsom.koopsom) &&
        Objects.equals(this.koopjaar, typeKoopsom.koopjaar) &&
        Objects.equals(this.indicatieMetMeerObjectenVerkregen, typeKoopsom.indicatieMetMeerObjectenVerkregen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(koopsom, koopjaar, indicatieMetMeerObjectenVerkregen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeKoopsom {\n");
    
    sb.append("    koopsom: ").append(toIndentedString(koopsom)).append("\n");
    sb.append("    koopjaar: ").append(toIndentedString(koopjaar)).append("\n");
    sb.append("    indicatieMetMeerObjectenVerkregen: ").append(toIndentedString(indicatieMetMeerObjectenVerkregen)).append("\n");
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
