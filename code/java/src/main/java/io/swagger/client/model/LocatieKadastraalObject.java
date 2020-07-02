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
import io.swagger.client.model.Waardelijst;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Waardelijst in deze component : [koppelingswijze](http://www.kadaster.nl/schemas/waardelijsten/Koppelingswijze)
 */
@Schema(description = "Waardelijst in deze component : [koppelingswijze](http://www.kadaster.nl/schemas/waardelijsten/Koppelingswijze)")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-02T13:29:42.896+02:00[Europe/Amsterdam]")
public class LocatieKadastraalObject {
  @SerializedName("nummeraanduidingIdentificatie")
  private String nummeraanduidingIdentificatie = null;

  @SerializedName("koppelingswijze")
  private Waardelijst koppelingswijze = null;

  public LocatieKadastraalObject nummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
    return this;
  }

   /**
   * Get nummeraanduidingIdentificatie
   * @return nummeraanduidingIdentificatie
  **/
  @Schema(description = "")
  public String getNummeraanduidingIdentificatie() {
    return nummeraanduidingIdentificatie;
  }

  public void setNummeraanduidingIdentificatie(String nummeraanduidingIdentificatie) {
    this.nummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
  }

  public LocatieKadastraalObject koppelingswijze(Waardelijst koppelingswijze) {
    this.koppelingswijze = koppelingswijze;
    return this;
  }

   /**
   * Get koppelingswijze
   * @return koppelingswijze
  **/
  @Schema(description = "")
  public Waardelijst getKoppelingswijze() {
    return koppelingswijze;
  }

  public void setKoppelingswijze(Waardelijst koppelingswijze) {
    this.koppelingswijze = koppelingswijze;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocatieKadastraalObject locatieKadastraalObject = (LocatieKadastraalObject) o;
    return Objects.equals(this.nummeraanduidingIdentificatie, locatieKadastraalObject.nummeraanduidingIdentificatie) &&
        Objects.equals(this.koppelingswijze, locatieKadastraalObject.koppelingswijze);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nummeraanduidingIdentificatie, koppelingswijze);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocatieKadastraalObject {\n");
    
    sb.append("    nummeraanduidingIdentificatie: ").append(toIndentedString(nummeraanduidingIdentificatie)).append("\n");
    sb.append("    koppelingswijze: ").append(toIndentedString(koppelingswijze)).append("\n");
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
