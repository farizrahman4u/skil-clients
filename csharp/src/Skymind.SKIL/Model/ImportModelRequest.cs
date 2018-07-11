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
    /// ImportModelRequest
    /// </summary>
    [DataContract]
    public partial class ImportModelRequest :  IEquatable<ImportModelRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ImportModelRequest" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="scale">scale.</param>
        /// <param name="uri">uri.</param>
        /// <param name="modelType">modelType.</param>
        /// <param name="fileLocation">fileLocation.</param>
        /// <param name="jvmArgs">jvmArgs.</param>
        /// <param name="subType">subType.</param>
        /// <param name="labelsFileLocation">labelsFileLocation.</param>
        /// <param name="extraArgs">extraArgs.</param>
        /// <param name="etlJson">etlJson.</param>
        /// <param name="inputNames">inputNames.</param>
        /// <param name="outputNames">outputNames.</param>
        public ImportModelRequest(string name = default(string), int? scale = default(int?), List<string> uri = default(List<string>), string modelType = default(string), string fileLocation = default(string), string jvmArgs = default(string), string subType = default(string), string labelsFileLocation = default(string), string extraArgs = default(string), string etlJson = default(string), List<string> inputNames = default(List<string>), List<string> outputNames = default(List<string>))
        {
            this.Name = name;
            this.Scale = scale;
            this.Uri = uri;
            this.ModelType = modelType;
            this.FileLocation = fileLocation;
            this.JvmArgs = jvmArgs;
            this.SubType = subType;
            this.LabelsFileLocation = labelsFileLocation;
            this.ExtraArgs = extraArgs;
            this.EtlJson = etlJson;
            this.InputNames = inputNames;
            this.OutputNames = outputNames;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Scale
        /// </summary>
        [DataMember(Name="scale", EmitDefaultValue=false)]
        public int? Scale { get; set; }

        /// <summary>
        /// Gets or Sets Uri
        /// </summary>
        [DataMember(Name="uri", EmitDefaultValue=false)]
        public List<string> Uri { get; set; }

        /// <summary>
        /// Gets or Sets ModelType
        /// </summary>
        [DataMember(Name="modelType", EmitDefaultValue=false)]
        public string ModelType { get; set; }

        /// <summary>
        /// Gets or Sets FileLocation
        /// </summary>
        [DataMember(Name="fileLocation", EmitDefaultValue=false)]
        public string FileLocation { get; set; }

        /// <summary>
        /// Gets or Sets JvmArgs
        /// </summary>
        [DataMember(Name="jvmArgs", EmitDefaultValue=false)]
        public string JvmArgs { get; set; }

        /// <summary>
        /// Gets or Sets SubType
        /// </summary>
        [DataMember(Name="subType", EmitDefaultValue=false)]
        public string SubType { get; set; }

        /// <summary>
        /// Gets or Sets LabelsFileLocation
        /// </summary>
        [DataMember(Name="labelsFileLocation", EmitDefaultValue=false)]
        public string LabelsFileLocation { get; set; }

        /// <summary>
        /// Gets or Sets ExtraArgs
        /// </summary>
        [DataMember(Name="extraArgs", EmitDefaultValue=false)]
        public string ExtraArgs { get; set; }

        /// <summary>
        /// Gets or Sets EtlJson
        /// </summary>
        [DataMember(Name="etlJson", EmitDefaultValue=false)]
        public string EtlJson { get; set; }

        /// <summary>
        /// Gets or Sets InputNames
        /// </summary>
        [DataMember(Name="inputNames", EmitDefaultValue=false)]
        public List<string> InputNames { get; set; }

        /// <summary>
        /// Gets or Sets OutputNames
        /// </summary>
        [DataMember(Name="outputNames", EmitDefaultValue=false)]
        public List<string> OutputNames { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ImportModelRequest {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Scale: ").Append(Scale).Append("\n");
            sb.Append("  Uri: ").Append(Uri).Append("\n");
            sb.Append("  ModelType: ").Append(ModelType).Append("\n");
            sb.Append("  FileLocation: ").Append(FileLocation).Append("\n");
            sb.Append("  JvmArgs: ").Append(JvmArgs).Append("\n");
            sb.Append("  SubType: ").Append(SubType).Append("\n");
            sb.Append("  LabelsFileLocation: ").Append(LabelsFileLocation).Append("\n");
            sb.Append("  ExtraArgs: ").Append(ExtraArgs).Append("\n");
            sb.Append("  EtlJson: ").Append(EtlJson).Append("\n");
            sb.Append("  InputNames: ").Append(InputNames).Append("\n");
            sb.Append("  OutputNames: ").Append(OutputNames).Append("\n");
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
            return this.Equals(input as ImportModelRequest);
        }

        /// <summary>
        /// Returns true if ImportModelRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of ImportModelRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ImportModelRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Scale == input.Scale ||
                    (this.Scale != null &&
                    this.Scale.Equals(input.Scale))
                ) && 
                (
                    this.Uri == input.Uri ||
                    this.Uri != null &&
                    this.Uri.SequenceEqual(input.Uri)
                ) && 
                (
                    this.ModelType == input.ModelType ||
                    (this.ModelType != null &&
                    this.ModelType.Equals(input.ModelType))
                ) && 
                (
                    this.FileLocation == input.FileLocation ||
                    (this.FileLocation != null &&
                    this.FileLocation.Equals(input.FileLocation))
                ) && 
                (
                    this.JvmArgs == input.JvmArgs ||
                    (this.JvmArgs != null &&
                    this.JvmArgs.Equals(input.JvmArgs))
                ) && 
                (
                    this.SubType == input.SubType ||
                    (this.SubType != null &&
                    this.SubType.Equals(input.SubType))
                ) && 
                (
                    this.LabelsFileLocation == input.LabelsFileLocation ||
                    (this.LabelsFileLocation != null &&
                    this.LabelsFileLocation.Equals(input.LabelsFileLocation))
                ) && 
                (
                    this.ExtraArgs == input.ExtraArgs ||
                    (this.ExtraArgs != null &&
                    this.ExtraArgs.Equals(input.ExtraArgs))
                ) && 
                (
                    this.EtlJson == input.EtlJson ||
                    (this.EtlJson != null &&
                    this.EtlJson.Equals(input.EtlJson))
                ) && 
                (
                    this.InputNames == input.InputNames ||
                    this.InputNames != null &&
                    this.InputNames.SequenceEqual(input.InputNames)
                ) && 
                (
                    this.OutputNames == input.OutputNames ||
                    this.OutputNames != null &&
                    this.OutputNames.SequenceEqual(input.OutputNames)
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Scale != null)
                    hashCode = hashCode * 59 + this.Scale.GetHashCode();
                if (this.Uri != null)
                    hashCode = hashCode * 59 + this.Uri.GetHashCode();
                if (this.ModelType != null)
                    hashCode = hashCode * 59 + this.ModelType.GetHashCode();
                if (this.FileLocation != null)
                    hashCode = hashCode * 59 + this.FileLocation.GetHashCode();
                if (this.JvmArgs != null)
                    hashCode = hashCode * 59 + this.JvmArgs.GetHashCode();
                if (this.SubType != null)
                    hashCode = hashCode * 59 + this.SubType.GetHashCode();
                if (this.LabelsFileLocation != null)
                    hashCode = hashCode * 59 + this.LabelsFileLocation.GetHashCode();
                if (this.ExtraArgs != null)
                    hashCode = hashCode * 59 + this.ExtraArgs.GetHashCode();
                if (this.EtlJson != null)
                    hashCode = hashCode * 59 + this.EtlJson.GetHashCode();
                if (this.InputNames != null)
                    hashCode = hashCode * 59 + this.InputNames.GetHashCode();
                if (this.OutputNames != null)
                    hashCode = hashCode * 59 + this.OutputNames.GetHashCode();
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
