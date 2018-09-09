/*
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ai.skymind.skil.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ModelHistoryEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-07T17:05:04.781+05:00")
public class ModelHistoryEntity {
  @SerializedName("created")
  private Long created = null;

  @SerializedName("modelHistoryId")
  private String modelHistoryId = null;

  @SerializedName("modelName")
  private String modelName = null;

  @SerializedName("modelLabels")
  private String modelLabels = null;

  public ModelHistoryEntity created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * When the model history / workspace was created
   * @return created
  **/
  @ApiModelProperty(value = "When the model history / workspace was created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ModelHistoryEntity modelHistoryId(String modelHistoryId) {
    this.modelHistoryId = modelHistoryId;
    return this;
  }

   /**
   * The GUID of the model history / workspace
   * @return modelHistoryId
  **/
  @ApiModelProperty(value = "The GUID of the model history / workspace")
  public String getModelHistoryId() {
    return modelHistoryId;
  }

  public void setModelHistoryId(String modelHistoryId) {
    this.modelHistoryId = modelHistoryId;
  }

  public ModelHistoryEntity modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * Name of the model history / workspace
   * @return modelName
  **/
  @ApiModelProperty(value = "Name of the model history / workspace")
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public ModelHistoryEntity modelLabels(String modelLabels) {
    this.modelLabels = modelLabels;
    return this;
  }

   /**
   * Model history / workspace labels
   * @return modelLabels
  **/
  @ApiModelProperty(value = "Model history / workspace labels")
  public String getModelLabels() {
    return modelLabels;
  }

  public void setModelLabels(String modelLabels) {
    this.modelLabels = modelLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelHistoryEntity modelHistoryEntity = (ModelHistoryEntity) o;
    return Objects.equals(this.created, modelHistoryEntity.created) &&
        Objects.equals(this.modelHistoryId, modelHistoryEntity.modelHistoryId) &&
        Objects.equals(this.modelName, modelHistoryEntity.modelName) &&
        Objects.equals(this.modelLabels, modelHistoryEntity.modelLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, modelHistoryId, modelName, modelLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelHistoryEntity {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modelHistoryId: ").append(toIndentedString(modelHistoryId)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelLabels: ").append(toIndentedString(modelLabels)).append("\n");
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

