/* 
 * Kadaster - BRK-Bevragen API
 *
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Waardelijsten in deze component :   [koppelingswijze](http://www.kadaster.nl/schemas/waardelijsten/Koppelingswijze) en [land](http://www.kadaster.nl/schemas/waardelijsten/BRPLand/) 
    /// </summary>
    [DataContract]
    public partial class LocatieKadastraalObject :  IEquatable<LocatieKadastraalObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LocatieKadastraalObject" /> class.
        /// </summary>
        /// <param name="straat">Een naam die door de gemeente aan een openbare ruimte is gegeven..</param>
        /// <param name="huisnummer">Een nummer dat door de gemeente aan een adresseerbaar object is gegeven..</param>
        /// <param name="huisletter">Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven..</param>
        /// <param name="huisnummertoevoeging">Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven..</param>
        /// <param name="postcode">De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort..</param>
        /// <param name="woonplaats">Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam..</param>
        /// <param name="nummeraanduidingIdentificatie">Identificatie van het adres in het geval dit adres in BAG geregistreerd is. .</param>
        /// <param name="adresregel1">Het eerste deel van een adres is een combinatie van de straat en huisnummer. .</param>
        /// <param name="adresregel2">Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode. .</param>
        /// <param name="adresregel3">Het derde deel van een adres is optioneel een of meer geografische gebieden van het adres in het buitenland. .</param>
        /// <param name="land">land.</param>
        /// <param name="koppelingswijze">koppelingswijze.</param>
        public LocatieKadastraalObject(string straat = default(string), int huisnummer = default(int), string huisletter = default(string), string huisnummertoevoeging = default(string), string postcode = default(string), string woonplaats = default(string), string nummeraanduidingIdentificatie = default(string), string adresregel1 = default(string), string adresregel2 = default(string), string adresregel3 = default(string), Waardelijst land = default(Waardelijst), Waardelijst koppelingswijze = default(Waardelijst))
        {
            this.Straat = straat;
            this.Huisnummer = huisnummer;
            this.Huisletter = huisletter;
            this.Huisnummertoevoeging = huisnummertoevoeging;
            this.Postcode = postcode;
            this.Woonplaats = woonplaats;
            this.NummeraanduidingIdentificatie = nummeraanduidingIdentificatie;
            this.Adresregel1 = adresregel1;
            this.Adresregel2 = adresregel2;
            this.Adresregel3 = adresregel3;
            this.Land = land;
            this.Koppelingswijze = koppelingswijze;
        }
        
        /// <summary>
        /// Een naam die door de gemeente aan een openbare ruimte is gegeven.
        /// </summary>
        /// <value>Een naam die door de gemeente aan een openbare ruimte is gegeven.</value>
        [DataMember(Name="straat", EmitDefaultValue=false)]
        public string Straat { get; set; }

        /// <summary>
        /// Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.
        /// </summary>
        /// <value>Een nummer dat door de gemeente aan een adresseerbaar object is gegeven.</value>
        [DataMember(Name="huisnummer", EmitDefaultValue=false)]
        public int Huisnummer { get; set; }

        /// <summary>
        /// Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.
        /// </summary>
        /// <value>Een toevoeging aan een huisnummer in de vorm van een letter die door de gemeente aan een adresseerbaar object is gegeven.</value>
        [DataMember(Name="huisletter", EmitDefaultValue=false)]
        public string Huisletter { get; set; }

        /// <summary>
        /// Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.
        /// </summary>
        /// <value>Een toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter die door de gemeente aan een adresseerbaar object is gegeven.</value>
        [DataMember(Name="huisnummertoevoeging", EmitDefaultValue=false)]
        public string Huisnummertoevoeging { get; set; }

        /// <summary>
        /// De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.
        /// </summary>
        /// <value>De door PostNL vastgestelde code die bij een bepaalde combinatie van een straatnaam en een huisnummer hoort.</value>
        [DataMember(Name="postcode", EmitDefaultValue=false)]
        public string Postcode { get; set; }

        /// <summary>
        /// Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.
        /// </summary>
        /// <value>Een woonplaats is een gedeelte van het grondgebied van de gemeente met een naam.</value>
        [DataMember(Name="woonplaats", EmitDefaultValue=false)]
        public string Woonplaats { get; set; }

        /// <summary>
        /// Identificatie van het adres in het geval dit adres in BAG geregistreerd is. 
        /// </summary>
        /// <value>Identificatie van het adres in het geval dit adres in BAG geregistreerd is. </value>
        [DataMember(Name="nummeraanduidingIdentificatie", EmitDefaultValue=false)]
        public string NummeraanduidingIdentificatie { get; set; }

        /// <summary>
        /// Het eerste deel van een adres is een combinatie van de straat en huisnummer. 
        /// </summary>
        /// <value>Het eerste deel van een adres is een combinatie van de straat en huisnummer. </value>
        [DataMember(Name="adresregel1", EmitDefaultValue=false)]
        public string Adresregel1 { get; set; }

        /// <summary>
        /// Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode. 
        /// </summary>
        /// <value>Het tweede deel van een adres is een combinatie van woonplaats eventueel in combinatie met de postcode. </value>
        [DataMember(Name="adresregel2", EmitDefaultValue=false)]
        public string Adresregel2 { get; set; }

        /// <summary>
        /// Het derde deel van een adres is optioneel een of meer geografische gebieden van het adres in het buitenland. 
        /// </summary>
        /// <value>Het derde deel van een adres is optioneel een of meer geografische gebieden van het adres in het buitenland. </value>
        [DataMember(Name="adresregel3", EmitDefaultValue=false)]
        public string Adresregel3 { get; set; }

        /// <summary>
        /// Gets or Sets Land
        /// </summary>
        [DataMember(Name="land", EmitDefaultValue=false)]
        public Waardelijst Land { get; set; }

        /// <summary>
        /// Gets or Sets Koppelingswijze
        /// </summary>
        [DataMember(Name="koppelingswijze", EmitDefaultValue=false)]
        public Waardelijst Koppelingswijze { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LocatieKadastraalObject {\n");
            sb.Append("  Straat: ").Append(Straat).Append("\n");
            sb.Append("  Huisnummer: ").Append(Huisnummer).Append("\n");
            sb.Append("  Huisletter: ").Append(Huisletter).Append("\n");
            sb.Append("  Huisnummertoevoeging: ").Append(Huisnummertoevoeging).Append("\n");
            sb.Append("  Postcode: ").Append(Postcode).Append("\n");
            sb.Append("  Woonplaats: ").Append(Woonplaats).Append("\n");
            sb.Append("  NummeraanduidingIdentificatie: ").Append(NummeraanduidingIdentificatie).Append("\n");
            sb.Append("  Adresregel1: ").Append(Adresregel1).Append("\n");
            sb.Append("  Adresregel2: ").Append(Adresregel2).Append("\n");
            sb.Append("  Adresregel3: ").Append(Adresregel3).Append("\n");
            sb.Append("  Land: ").Append(Land).Append("\n");
            sb.Append("  Koppelingswijze: ").Append(Koppelingswijze).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as LocatieKadastraalObject);
        }

        /// <summary>
        /// Returns true if LocatieKadastraalObject instances are equal
        /// </summary>
        /// <param name="input">Instance of LocatieKadastraalObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LocatieKadastraalObject input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Straat == input.Straat ||
                    (this.Straat != null &&
                    this.Straat.Equals(input.Straat))
                ) && 
                (
                    this.Huisnummer == input.Huisnummer ||
                    (this.Huisnummer != null &&
                    this.Huisnummer.Equals(input.Huisnummer))
                ) && 
                (
                    this.Huisletter == input.Huisletter ||
                    (this.Huisletter != null &&
                    this.Huisletter.Equals(input.Huisletter))
                ) && 
                (
                    this.Huisnummertoevoeging == input.Huisnummertoevoeging ||
                    (this.Huisnummertoevoeging != null &&
                    this.Huisnummertoevoeging.Equals(input.Huisnummertoevoeging))
                ) && 
                (
                    this.Postcode == input.Postcode ||
                    (this.Postcode != null &&
                    this.Postcode.Equals(input.Postcode))
                ) && 
                (
                    this.Woonplaats == input.Woonplaats ||
                    (this.Woonplaats != null &&
                    this.Woonplaats.Equals(input.Woonplaats))
                ) && 
                (
                    this.NummeraanduidingIdentificatie == input.NummeraanduidingIdentificatie ||
                    (this.NummeraanduidingIdentificatie != null &&
                    this.NummeraanduidingIdentificatie.Equals(input.NummeraanduidingIdentificatie))
                ) && 
                (
                    this.Adresregel1 == input.Adresregel1 ||
                    (this.Adresregel1 != null &&
                    this.Adresregel1.Equals(input.Adresregel1))
                ) && 
                (
                    this.Adresregel2 == input.Adresregel2 ||
                    (this.Adresregel2 != null &&
                    this.Adresregel2.Equals(input.Adresregel2))
                ) && 
                (
                    this.Adresregel3 == input.Adresregel3 ||
                    (this.Adresregel3 != null &&
                    this.Adresregel3.Equals(input.Adresregel3))
                ) && 
                (
                    this.Land == input.Land ||
                    (this.Land != null &&
                    this.Land.Equals(input.Land))
                ) && 
                (
                    this.Koppelingswijze == input.Koppelingswijze ||
                    (this.Koppelingswijze != null &&
                    this.Koppelingswijze.Equals(input.Koppelingswijze))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Straat != null)
                    hashCode = hashCode * 59 + this.Straat.GetHashCode();
                if (this.Huisnummer != null)
                    hashCode = hashCode * 59 + this.Huisnummer.GetHashCode();
                if (this.Huisletter != null)
                    hashCode = hashCode * 59 + this.Huisletter.GetHashCode();
                if (this.Huisnummertoevoeging != null)
                    hashCode = hashCode * 59 + this.Huisnummertoevoeging.GetHashCode();
                if (this.Postcode != null)
                    hashCode = hashCode * 59 + this.Postcode.GetHashCode();
                if (this.Woonplaats != null)
                    hashCode = hashCode * 59 + this.Woonplaats.GetHashCode();
                if (this.NummeraanduidingIdentificatie != null)
                    hashCode = hashCode * 59 + this.NummeraanduidingIdentificatie.GetHashCode();
                if (this.Adresregel1 != null)
                    hashCode = hashCode * 59 + this.Adresregel1.GetHashCode();
                if (this.Adresregel2 != null)
                    hashCode = hashCode * 59 + this.Adresregel2.GetHashCode();
                if (this.Adresregel3 != null)
                    hashCode = hashCode * 59 + this.Adresregel3.GetHashCode();
                if (this.Land != null)
                    hashCode = hashCode * 59 + this.Land.GetHashCode();
                if (this.Koppelingswijze != null)
                    hashCode = hashCode * 59 + this.Koppelingswijze.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
