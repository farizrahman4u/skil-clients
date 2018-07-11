/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
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
using SwaggerDateConverter = Skymind.SKIL.Client.SwaggerDateConverter;

namespace Skymind.SKIL.Model
{
    /// <summary>
    /// BatchImageRecord
    /// </summary>
    [DataContract]
    public partial class BatchImageRecord :  IEquatable<BatchImageRecord>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BatchImageRecord" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BatchImageRecord() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BatchImageRecord" /> class.
        /// </summary>
        /// <param name="records">records (required).</param>
        public BatchImageRecord(List<SingleImageRecord> records = default(List<SingleImageRecord>))
        {
            // to ensure "records" is required (not null)
            if (records == null)
            {
                throw new InvalidDataException("records is a required property for BatchImageRecord and cannot be null");
            }
            else
            {
                this.Records = records;
            }
        }
        
        /// <summary>
        /// Gets or Sets Records
        /// </summary>
        [DataMember(Name="records", EmitDefaultValue=false)]
        public List<SingleImageRecord> Records { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BatchImageRecord {\n");
            sb.Append("  Records: ").Append(Records).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as BatchImageRecord);
        }

        /// <summary>
        /// Returns true if BatchImageRecord instances are equal
        /// </summary>
        /// <param name="input">Instance of BatchImageRecord to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BatchImageRecord input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Records == input.Records ||
                    this.Records != null &&
                    this.Records.SequenceEqual(input.Records)
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
                if (this.Records != null)
                    hashCode = hashCode * 59 + this.Records.GetHashCode();
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
