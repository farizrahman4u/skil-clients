/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
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
    /// MinibatchEntity
    /// </summary>
    [DataContract]
    public partial class MinibatchEntity :  IEquatable<MinibatchEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MinibatchEntity" /> class.
        /// </summary>
        /// <param name="miniBatchId">GUID of mini batch.</param>
        /// <param name="evalId">GUID of the evaluation.</param>
        /// <param name="evalVersion">Eval version.</param>
        /// <param name="batchVersion">Batch version.</param>
        public MinibatchEntity(string miniBatchId = default(string), string evalId = default(string), int? evalVersion = default(int?), int? batchVersion = default(int?))
        {
            this.MiniBatchId = miniBatchId;
            this.EvalId = evalId;
            this.EvalVersion = evalVersion;
            this.BatchVersion = batchVersion;
        }
        
        /// <summary>
        /// GUID of mini batch
        /// </summary>
        /// <value>GUID of mini batch</value>
        [DataMember(Name="miniBatchId", EmitDefaultValue=false)]
        public string MiniBatchId { get; set; }

        /// <summary>
        /// GUID of the evaluation
        /// </summary>
        /// <value>GUID of the evaluation</value>
        [DataMember(Name="evalId", EmitDefaultValue=false)]
        public string EvalId { get; set; }

        /// <summary>
        /// Eval version
        /// </summary>
        /// <value>Eval version</value>
        [DataMember(Name="evalVersion", EmitDefaultValue=false)]
        public int? EvalVersion { get; set; }

        /// <summary>
        /// Batch version
        /// </summary>
        /// <value>Batch version</value>
        [DataMember(Name="batchVersion", EmitDefaultValue=false)]
        public int? BatchVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MinibatchEntity {\n");
            sb.Append("  MiniBatchId: ").Append(MiniBatchId).Append("\n");
            sb.Append("  EvalId: ").Append(EvalId).Append("\n");
            sb.Append("  EvalVersion: ").Append(EvalVersion).Append("\n");
            sb.Append("  BatchVersion: ").Append(BatchVersion).Append("\n");
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
            return this.Equals(input as MinibatchEntity);
        }

        /// <summary>
        /// Returns true if MinibatchEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of MinibatchEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MinibatchEntity input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MiniBatchId == input.MiniBatchId ||
                    (this.MiniBatchId != null &&
                    this.MiniBatchId.Equals(input.MiniBatchId))
                ) && 
                (
                    this.EvalId == input.EvalId ||
                    (this.EvalId != null &&
                    this.EvalId.Equals(input.EvalId))
                ) && 
                (
                    this.EvalVersion == input.EvalVersion ||
                    (this.EvalVersion != null &&
                    this.EvalVersion.Equals(input.EvalVersion))
                ) && 
                (
                    this.BatchVersion == input.BatchVersion ||
                    (this.BatchVersion != null &&
                    this.BatchVersion.Equals(input.BatchVersion))
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
                if (this.MiniBatchId != null)
                    hashCode = hashCode * 59 + this.MiniBatchId.GetHashCode();
                if (this.EvalId != null)
                    hashCode = hashCode * 59 + this.EvalId.GetHashCode();
                if (this.EvalVersion != null)
                    hashCode = hashCode * 59 + this.EvalVersion.GetHashCode();
                if (this.BatchVersion != null)
                    hashCode = hashCode * 59 + this.BatchVersion.GetHashCode();
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
