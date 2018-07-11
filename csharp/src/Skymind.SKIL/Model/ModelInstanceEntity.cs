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
    /// ModelInstanceEntity
    /// </summary>
    [DataContract]
    public partial class ModelInstanceEntity :  IEquatable<ModelInstanceEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelInstanceEntity" /> class.
        /// </summary>
        /// <param name="uri">The model URI.</param>
        /// <param name="etlJson">The json string for the ETL (Extract, Transform and Load).</param>
        /// <param name="modelId">GUID of the model..</param>
        /// <param name="modelLabels">Comma-separated labels string for the model.</param>
        /// <param name="inputFormats">Format for the model input.</param>
        /// <param name="created">When the model was created.</param>
        /// <param name="notebookJson">JSON string of the associated Zeppelin Notebook.</param>
        /// <param name="evalId">GUID for the model evaluation.</param>
        /// <param name="modelName">Model&#39;s name.</param>
        /// <param name="originalModelId">Original GUID of the model (used for maintaining revisions of a particular model).</param>
        /// <param name="modelVersion">Model version.</param>
        /// <param name="experimentId">GUID of the Experiment which is associated with the model..</param>
        public ModelInstanceEntity(string uri = default(string), string etlJson = default(string), string modelId = default(string), string modelLabels = default(string), string inputFormats = default(string), long? created = default(long?), string notebookJson = default(string), string evalId = default(string), string modelName = default(string), string originalModelId = default(string), string modelVersion = default(string), string experimentId = default(string))
        {
            this.Uri = uri;
            this.EtlJson = etlJson;
            this.ModelId = modelId;
            this.ModelLabels = modelLabels;
            this.InputFormats = inputFormats;
            this.Created = created;
            this.NotebookJson = notebookJson;
            this.EvalId = evalId;
            this.ModelName = modelName;
            this.OriginalModelId = originalModelId;
            this.ModelVersion = modelVersion;
            this.ExperimentId = experimentId;
        }
        
        /// <summary>
        /// The model URI
        /// </summary>
        /// <value>The model URI</value>
        [DataMember(Name="uri", EmitDefaultValue=false)]
        public string Uri { get; set; }

        /// <summary>
        /// The json string for the ETL (Extract, Transform and Load)
        /// </summary>
        /// <value>The json string for the ETL (Extract, Transform and Load)</value>
        [DataMember(Name="etlJson", EmitDefaultValue=false)]
        public string EtlJson { get; set; }

        /// <summary>
        /// GUID of the model.
        /// </summary>
        /// <value>GUID of the model.</value>
        [DataMember(Name="modelId", EmitDefaultValue=false)]
        public string ModelId { get; set; }

        /// <summary>
        /// Comma-separated labels string for the model
        /// </summary>
        /// <value>Comma-separated labels string for the model</value>
        [DataMember(Name="modelLabels", EmitDefaultValue=false)]
        public string ModelLabels { get; set; }

        /// <summary>
        /// Format for the model input
        /// </summary>
        /// <value>Format for the model input</value>
        [DataMember(Name="inputFormats", EmitDefaultValue=false)]
        public string InputFormats { get; set; }

        /// <summary>
        /// When the model was created
        /// </summary>
        /// <value>When the model was created</value>
        [DataMember(Name="created", EmitDefaultValue=false)]
        public long? Created { get; set; }

        /// <summary>
        /// JSON string of the associated Zeppelin Notebook
        /// </summary>
        /// <value>JSON string of the associated Zeppelin Notebook</value>
        [DataMember(Name="notebookJson", EmitDefaultValue=false)]
        public string NotebookJson { get; set; }

        /// <summary>
        /// GUID for the model evaluation
        /// </summary>
        /// <value>GUID for the model evaluation</value>
        [DataMember(Name="evalId", EmitDefaultValue=false)]
        public string EvalId { get; set; }

        /// <summary>
        /// Model&#39;s name
        /// </summary>
        /// <value>Model&#39;s name</value>
        [DataMember(Name="modelName", EmitDefaultValue=false)]
        public string ModelName { get; set; }

        /// <summary>
        /// Original GUID of the model (used for maintaining revisions of a particular model)
        /// </summary>
        /// <value>Original GUID of the model (used for maintaining revisions of a particular model)</value>
        [DataMember(Name="originalModelId", EmitDefaultValue=false)]
        public string OriginalModelId { get; set; }

        /// <summary>
        /// Model version
        /// </summary>
        /// <value>Model version</value>
        [DataMember(Name="modelVersion", EmitDefaultValue=false)]
        public string ModelVersion { get; set; }

        /// <summary>
        /// GUID of the Experiment which is associated with the model.
        /// </summary>
        /// <value>GUID of the Experiment which is associated with the model.</value>
        [DataMember(Name="experimentId", EmitDefaultValue=false)]
        public string ExperimentId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ModelInstanceEntity {\n");
            sb.Append("  Uri: ").Append(Uri).Append("\n");
            sb.Append("  EtlJson: ").Append(EtlJson).Append("\n");
            sb.Append("  ModelId: ").Append(ModelId).Append("\n");
            sb.Append("  ModelLabels: ").Append(ModelLabels).Append("\n");
            sb.Append("  InputFormats: ").Append(InputFormats).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  NotebookJson: ").Append(NotebookJson).Append("\n");
            sb.Append("  EvalId: ").Append(EvalId).Append("\n");
            sb.Append("  ModelName: ").Append(ModelName).Append("\n");
            sb.Append("  OriginalModelId: ").Append(OriginalModelId).Append("\n");
            sb.Append("  ModelVersion: ").Append(ModelVersion).Append("\n");
            sb.Append("  ExperimentId: ").Append(ExperimentId).Append("\n");
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
            return this.Equals(input as ModelInstanceEntity);
        }

        /// <summary>
        /// Returns true if ModelInstanceEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of ModelInstanceEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelInstanceEntity input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Uri == input.Uri ||
                    (this.Uri != null &&
                    this.Uri.Equals(input.Uri))
                ) && 
                (
                    this.EtlJson == input.EtlJson ||
                    (this.EtlJson != null &&
                    this.EtlJson.Equals(input.EtlJson))
                ) && 
                (
                    this.ModelId == input.ModelId ||
                    (this.ModelId != null &&
                    this.ModelId.Equals(input.ModelId))
                ) && 
                (
                    this.ModelLabels == input.ModelLabels ||
                    (this.ModelLabels != null &&
                    this.ModelLabels.Equals(input.ModelLabels))
                ) && 
                (
                    this.InputFormats == input.InputFormats ||
                    (this.InputFormats != null &&
                    this.InputFormats.Equals(input.InputFormats))
                ) && 
                (
                    this.Created == input.Created ||
                    (this.Created != null &&
                    this.Created.Equals(input.Created))
                ) && 
                (
                    this.NotebookJson == input.NotebookJson ||
                    (this.NotebookJson != null &&
                    this.NotebookJson.Equals(input.NotebookJson))
                ) && 
                (
                    this.EvalId == input.EvalId ||
                    (this.EvalId != null &&
                    this.EvalId.Equals(input.EvalId))
                ) && 
                (
                    this.ModelName == input.ModelName ||
                    (this.ModelName != null &&
                    this.ModelName.Equals(input.ModelName))
                ) && 
                (
                    this.OriginalModelId == input.OriginalModelId ||
                    (this.OriginalModelId != null &&
                    this.OriginalModelId.Equals(input.OriginalModelId))
                ) && 
                (
                    this.ModelVersion == input.ModelVersion ||
                    (this.ModelVersion != null &&
                    this.ModelVersion.Equals(input.ModelVersion))
                ) && 
                (
                    this.ExperimentId == input.ExperimentId ||
                    (this.ExperimentId != null &&
                    this.ExperimentId.Equals(input.ExperimentId))
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
                if (this.Uri != null)
                    hashCode = hashCode * 59 + this.Uri.GetHashCode();
                if (this.EtlJson != null)
                    hashCode = hashCode * 59 + this.EtlJson.GetHashCode();
                if (this.ModelId != null)
                    hashCode = hashCode * 59 + this.ModelId.GetHashCode();
                if (this.ModelLabels != null)
                    hashCode = hashCode * 59 + this.ModelLabels.GetHashCode();
                if (this.InputFormats != null)
                    hashCode = hashCode * 59 + this.InputFormats.GetHashCode();
                if (this.Created != null)
                    hashCode = hashCode * 59 + this.Created.GetHashCode();
                if (this.NotebookJson != null)
                    hashCode = hashCode * 59 + this.NotebookJson.GetHashCode();
                if (this.EvalId != null)
                    hashCode = hashCode * 59 + this.EvalId.GetHashCode();
                if (this.ModelName != null)
                    hashCode = hashCode * 59 + this.ModelName.GetHashCode();
                if (this.OriginalModelId != null)
                    hashCode = hashCode * 59 + this.OriginalModelId.GetHashCode();
                if (this.ModelVersion != null)
                    hashCode = hashCode * 59 + this.ModelVersion.GetHashCode();
                if (this.ExperimentId != null)
                    hashCode = hashCode * 59 + this.ExperimentId.GetHashCode();
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
