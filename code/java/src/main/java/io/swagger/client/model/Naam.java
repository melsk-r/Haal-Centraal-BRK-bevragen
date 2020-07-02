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
 * Naam is een groep gegevens met de geslachtsnaam, voorletters en voornamen die men wil gebruiken bij aanschrijving.
 */
@Schema(description = "Naam is een groep gegevens met de geslachtsnaam, voorletters en voornamen die men wil gebruiken bij aanschrijving.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:29:42.896+02:00[Europe/Amsterdam]")
public class Naam {
  @SerializedName("geslachtsnaam")
  private String geslachtsnaam = null;

  @SerializedName("voornamen")
  private String voornamen = null;

  @SerializedName("voorvoegsel")
  private String voorvoegsel = null;

  public Naam geslachtsnaam(String geslachtsnaam) {
    this.geslachtsnaam = geslachtsnaam;
    return this;
  }

   /**
   * De geslachtsnaam is de (achter)naam waarvan eventuele voorvoegsels en adellijke titel zijn afgesplitst.
   * @return geslachtsnaam
  **/
  @Schema(description = "De geslachtsnaam is de (achter)naam waarvan eventuele voorvoegsels en adellijke titel zijn afgesplitst.")
  public String getGeslachtsnaam() {
    return geslachtsnaam;
  }

  public void setGeslachtsnaam(String geslachtsnaam) {
    this.geslachtsnaam = geslachtsnaam;
  }

  public Naam voornamen(String voornamen) {
    this.voornamen = voornamen;
    return this;
  }

   /**
   * De voornamen zijn de verzameling namen die, gescheiden door spaties, aan de geslachtsnaam voorafgaat. Indien aanwezig, wordt het predikaat afgesplitst.
   * @return voornamen
  **/
  @Schema(description = "De voornamen zijn de verzameling namen die, gescheiden door spaties, aan de geslachtsnaam voorafgaat. Indien aanwezig, wordt het predikaat afgesplitst.")
  public String getVoornamen() {
    return voornamen;
  }

  public void setVoornamen(String voornamen) {
    this.voornamen = voornamen;
  }

  public Naam voorvoegsel(String voorvoegsel) {
    this.voorvoegsel = voorvoegsel;
    return this;
  }

   /**
   * Voorvoegselsgeslachtsnaam is het deel van de geslachtsnaam dat, gescheiden door een spatie, vooraf gaat aan de rest van de geslachtsnaam.
   * @return voorvoegsel
  **/
  @Schema(description = "Voorvoegselsgeslachtsnaam is het deel van de geslachtsnaam dat, gescheiden door een spatie, vooraf gaat aan de rest van de geslachtsnaam.")
  public String getVoorvoegsel() {
    return voorvoegsel;
  }

  public void setVoorvoegsel(String voorvoegsel) {
    this.voorvoegsel = voorvoegsel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Naam naam = (Naam) o;
    return Objects.equals(this.geslachtsnaam, naam.geslachtsnaam) &&
        Objects.equals(this.voornamen, naam.voornamen) &&
        Objects.equals(this.voorvoegsel, naam.voorvoegsel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geslachtsnaam, voornamen, voorvoegsel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Naam {\n");
    
    sb.append("    geslachtsnaam: ").append(toIndentedString(geslachtsnaam)).append("\n");
    sb.append("    voornamen: ").append(toIndentedString(voornamen)).append("\n");
    sb.append("    voorvoegsel: ").append(toIndentedString(voorvoegsel)).append("\n");
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
