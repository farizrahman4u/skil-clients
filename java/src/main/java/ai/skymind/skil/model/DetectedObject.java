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
import java.util.ArrayList;
import java.util.List;

/**
 * DetectedObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-17T18:26:36.552+05:00")
public class DetectedObject {
  @SerializedName("centerX")
  private Float centerX = null;

  @SerializedName("centerY")
  private Float centerY = null;

  @SerializedName("width")
  private Float width = null;

  @SerializedName("height")
  private Float height = null;

  @SerializedName("predictedClasses")
  private List<String> predictedClasses = null;

  @SerializedName("confidences")
  private List<Float> confidences = null;

  public DetectedObject centerX(Float centerX) {
    this.centerX = centerX;
    return this;
  }

   /**
   * Get centerX
   * @return centerX
  **/
  @ApiModelProperty(value = "")
  public Float getCenterX() {
    return centerX;
  }

  public void setCenterX(Float centerX) {
    this.centerX = centerX;
  }

  public DetectedObject centerY(Float centerY) {
    this.centerY = centerY;
    return this;
  }

   /**
   * Get centerY
   * @return centerY
  **/
  @ApiModelProperty(value = "")
  public Float getCenterY() {
    return centerY;
  }

  public void setCenterY(Float centerY) {
    this.centerY = centerY;
  }

  public DetectedObject width(Float width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Float getWidth() {
    return width;
  }

  public void setWidth(Float width) {
    this.width = width;
  }

  public DetectedObject height(Float height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Float getHeight() {
    return height;
  }

  public void setHeight(Float height) {
    this.height = height;
  }

  public DetectedObject predictedClasses(List<String> predictedClasses) {
    this.predictedClasses = predictedClasses;
    return this;
  }

  public DetectedObject addPredictedClassesItem(String predictedClassesItem) {
    if (this.predictedClasses == null) {
      this.predictedClasses = new ArrayList<String>();
    }
    this.predictedClasses.add(predictedClassesItem);
    return this;
  }

   /**
   * Get predictedClasses
   * @return predictedClasses
  **/
  @ApiModelProperty(value = "")
  public List<String> getPredictedClasses() {
    return predictedClasses;
  }

  public void setPredictedClasses(List<String> predictedClasses) {
    this.predictedClasses = predictedClasses;
  }

  public DetectedObject confidences(List<Float> confidences) {
    this.confidences = confidences;
    return this;
  }

  public DetectedObject addConfidencesItem(Float confidencesItem) {
    if (this.confidences == null) {
      this.confidences = new ArrayList<Float>();
    }
    this.confidences.add(confidencesItem);
    return this;
  }

   /**
   * Get confidences
   * @return confidences
  **/
  @ApiModelProperty(value = "")
  public List<Float> getConfidences() {
    return confidences;
  }

  public void setConfidences(List<Float> confidences) {
    this.confidences = confidences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedObject detectedObject = (DetectedObject) o;
    return Objects.equals(this.centerX, detectedObject.centerX) &&
        Objects.equals(this.centerY, detectedObject.centerY) &&
        Objects.equals(this.width, detectedObject.width) &&
        Objects.equals(this.height, detectedObject.height) &&
        Objects.equals(this.predictedClasses, detectedObject.predictedClasses) &&
        Objects.equals(this.confidences, detectedObject.confidences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centerX, centerY, width, height, predictedClasses, confidences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedObject {\n");
    
    sb.append("    centerX: ").append(toIndentedString(centerX)).append("\n");
    sb.append("    centerY: ").append(toIndentedString(centerY)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    predictedClasses: ").append(toIndentedString(predictedClasses)).append("\n");
    sb.append("    confidences: ").append(toIndentedString(confidences)).append("\n");
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

