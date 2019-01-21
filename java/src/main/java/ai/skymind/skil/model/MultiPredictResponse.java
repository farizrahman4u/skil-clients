/*
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ai.skymind.skil.model;

import java.util.Objects;
import java.util.Arrays;
import ai.skymind.skil.model.INDArray;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MultiPredictResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T16:19:29.200+05:00")
public class MultiPredictResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("needsPreProcessing")
  private Boolean needsPreProcessing = null;

  @SerializedName("outputs")
  private List<INDArray> outputs = null;

  public MultiPredictResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MultiPredictResponse needsPreProcessing(Boolean needsPreProcessing) {
    this.needsPreProcessing = needsPreProcessing;
    return this;
  }

   /**
   * Get needsPreProcessing
   * @return needsPreProcessing
  **/
  @ApiModelProperty(value = "")
  public Boolean isNeedsPreProcessing() {
    return needsPreProcessing;
  }

  public void setNeedsPreProcessing(Boolean needsPreProcessing) {
    this.needsPreProcessing = needsPreProcessing;
  }

  public MultiPredictResponse outputs(List<INDArray> outputs) {
    this.outputs = outputs;
    return this;
  }

  public MultiPredictResponse addOutputsItem(INDArray outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<INDArray>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "")
  public List<INDArray> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<INDArray> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiPredictResponse multiPredictResponse = (MultiPredictResponse) o;
    return Objects.equals(this.id, multiPredictResponse.id) &&
        Objects.equals(this.needsPreProcessing, multiPredictResponse.needsPreProcessing) &&
        Objects.equals(this.outputs, multiPredictResponse.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, needsPreProcessing, outputs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiPredictResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    needsPreProcessing: ").append(toIndentedString(needsPreProcessing)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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

