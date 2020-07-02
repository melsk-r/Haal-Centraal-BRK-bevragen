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
import io.swagger.client.model.DatumOnvolledig;
import io.swagger.client.model.Naam;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Partnerschap is een groep gegevens over de huwelijkse- of partnerschapstatus van een persoon.
 */
@Schema(description = "Partnerschap is een groep gegevens over de huwelijkse- of partnerschapstatus van een persoon.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:29:42.896+02:00[Europe/Amsterdam]")
public class HeeftPartnerschap {
  @SerializedName("datumOntbinding")
  private DatumOnvolledig datumOntbinding = null;

  @SerializedName("datumSluiting")
  private DatumOnvolledig datumSluiting = null;

  @SerializedName("naam")
  private Naam naam = null;

  public HeeftPartnerschap datumOntbinding(DatumOnvolledig datumOntbinding) {
    this.datumOntbinding = datumOntbinding;
    return this;
  }

   /**
   * Get datumOntbinding
   * @return datumOntbinding
  **/
  @Schema(description = "")
  public DatumOnvolledig getDatumOntbinding() {
    return datumOntbinding;
  }

  public void setDatumOntbinding(DatumOnvolledig datumOntbinding) {
    this.datumOntbinding = datumOntbinding;
  }

  public HeeftPartnerschap datumSluiting(DatumOnvolledig datumSluiting) {
    this.datumSluiting = datumSluiting;
    return this;
  }

   /**
   * Get datumSluiting
   * @return datumSluiting
  **/
  @Schema(description = "")
  public DatumOnvolledig getDatumSluiting() {
    return datumSluiting;
  }

  public void setDatumSluiting(DatumOnvolledig datumSluiting) {
    this.datumSluiting = datumSluiting;
  }

  public HeeftPartnerschap naam(Naam naam) {
    this.naam = naam;
    return this;
  }

   /**
   * Get naam
   * @return naam
  **/
  @Schema(description = "")
  public Naam getNaam() {
    return naam;
  }

  public void setNaam(Naam naam) {
    this.naam = naam;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeeftPartnerschap heeftPartnerschap = (HeeftPartnerschap) o;
    return Objects.equals(this.datumOntbinding, heeftPartnerschap.datumOntbinding) &&
        Objects.equals(this.datumSluiting, heeftPartnerschap.datumSluiting) &&
        Objects.equals(this.naam, heeftPartnerschap.naam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datumOntbinding, datumSluiting, naam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeeftPartnerschap {\n");
    
    sb.append("    datumOntbinding: ").append(toIndentedString(datumOntbinding)).append("\n");
    sb.append("    datumSluiting: ").append(toIndentedString(datumSluiting)).append("\n");
    sb.append("    naam: ").append(toIndentedString(naam)).append("\n");
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
