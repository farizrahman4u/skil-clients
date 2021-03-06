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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ModelEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-07T17:24:59.081+05:00")
public class ModelEntity {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("updated")
  private Long updated = null;

  /**
   * Gets or Sets modelType
   */
  @JsonAdapter(ModelTypeEnum.Adapter.class)
  public enum ModelTypeEnum {
    TRANSFORM("transform"),
    
    MODEL("model"),
    
    KNN("knn");

    private String value;

    ModelTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModelTypeEnum fromValue(String text) {
      for (ModelTypeEnum b : ModelTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModelTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModelTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModelTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModelTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("modelType")
  private ModelTypeEnum modelType = null;

  @SerializedName("deploymentId")
  private Long deploymentId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("scale")
  private BigDecimal scale = null;

  @SerializedName("fileLocation")
  private String fileLocation = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    CREATED("created"),
    
    STARTING("starting"),
    
    STARTED("started"),
    
    STOPPING("stopping"),
    
    STOPPED("stopped"),
    
    UNHEALTHY("unhealthy"),
    
    FAILED("failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("jvmArgs")
  private String jvmArgs = null;

  @SerializedName("subType")
  private String subType = null;

  @SerializedName("labelsFileLocation")
  private String labelsFileLocation = null;

  @SerializedName("extraArgs")
  private String extraArgs = null;

  @SerializedName("launchPolicy")
  private Object launchPolicy = null;

  /**
   * Gets or Sets modelState
   */
  @JsonAdapter(ModelStateEnum.Adapter.class)
  public enum ModelStateEnum {
    CREATED("CREATED"),
    
    STARTING("STARTING"),
    
    STARTED("STARTED"),
    
    STOPPING("STOPPING"),
    
    STOPPED("STOPPED"),
    
    UNHEALTHY("UNHEALTHY"),
    
    FAILED("FAILED");

    private String value;

    ModelStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModelStateEnum fromValue(String text) {
      for (ModelStateEnum b : ModelStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModelStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModelStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModelStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModelStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("modelState")
  private ModelStateEnum modelState = null;

  public ModelEntity id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ModelEntity created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ModelEntity updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(value = "")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public ModelEntity modelType(ModelTypeEnum modelType) {
    this.modelType = modelType;
    return this;
  }

   /**
   * Get modelType
   * @return modelType
  **/
  @ApiModelProperty(value = "")
  public ModelTypeEnum getModelType() {
    return modelType;
  }

  public void setModelType(ModelTypeEnum modelType) {
    this.modelType = modelType;
  }

  public ModelEntity deploymentId(Long deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * Get deploymentId
   * @return deploymentId
  **/
  @ApiModelProperty(value = "")
  public Long getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(Long deploymentId) {
    this.deploymentId = deploymentId;
  }

  public ModelEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelEntity scale(BigDecimal scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getScale() {
    return scale;
  }

  public void setScale(BigDecimal scale) {
    this.scale = scale;
  }

  public ModelEntity fileLocation(String fileLocation) {
    this.fileLocation = fileLocation;
    return this;
  }

   /**
   * Get fileLocation
   * @return fileLocation
  **/
  @ApiModelProperty(value = "")
  public String getFileLocation() {
    return fileLocation;
  }

  public void setFileLocation(String fileLocation) {
    this.fileLocation = fileLocation;
  }

  public ModelEntity state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ModelEntity jvmArgs(String jvmArgs) {
    this.jvmArgs = jvmArgs;
    return this;
  }

   /**
   * Get jvmArgs
   * @return jvmArgs
  **/
  @ApiModelProperty(value = "")
  public String getJvmArgs() {
    return jvmArgs;
  }

  public void setJvmArgs(String jvmArgs) {
    this.jvmArgs = jvmArgs;
  }

  public ModelEntity subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @ApiModelProperty(value = "")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public ModelEntity labelsFileLocation(String labelsFileLocation) {
    this.labelsFileLocation = labelsFileLocation;
    return this;
  }

   /**
   * Get labelsFileLocation
   * @return labelsFileLocation
  **/
  @ApiModelProperty(value = "")
  public String getLabelsFileLocation() {
    return labelsFileLocation;
  }

  public void setLabelsFileLocation(String labelsFileLocation) {
    this.labelsFileLocation = labelsFileLocation;
  }

  public ModelEntity extraArgs(String extraArgs) {
    this.extraArgs = extraArgs;
    return this;
  }

   /**
   * Get extraArgs
   * @return extraArgs
  **/
  @ApiModelProperty(value = "")
  public String getExtraArgs() {
    return extraArgs;
  }

  public void setExtraArgs(String extraArgs) {
    this.extraArgs = extraArgs;
  }

  public ModelEntity launchPolicy(Object launchPolicy) {
    this.launchPolicy = launchPolicy;
    return this;
  }

   /**
   * Get launchPolicy
   * @return launchPolicy
  **/
  @ApiModelProperty(value = "")
  public Object getLaunchPolicy() {
    return launchPolicy;
  }

  public void setLaunchPolicy(Object launchPolicy) {
    this.launchPolicy = launchPolicy;
  }

  public ModelEntity modelState(ModelStateEnum modelState) {
    this.modelState = modelState;
    return this;
  }

   /**
   * Get modelState
   * @return modelState
  **/
  @ApiModelProperty(value = "")
  public ModelStateEnum getModelState() {
    return modelState;
  }

  public void setModelState(ModelStateEnum modelState) {
    this.modelState = modelState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEntity modelEntity = (ModelEntity) o;
    return Objects.equals(this.id, modelEntity.id) &&
        Objects.equals(this.created, modelEntity.created) &&
        Objects.equals(this.updated, modelEntity.updated) &&
        Objects.equals(this.modelType, modelEntity.modelType) &&
        Objects.equals(this.deploymentId, modelEntity.deploymentId) &&
        Objects.equals(this.name, modelEntity.name) &&
        Objects.equals(this.scale, modelEntity.scale) &&
        Objects.equals(this.fileLocation, modelEntity.fileLocation) &&
        Objects.equals(this.state, modelEntity.state) &&
        Objects.equals(this.jvmArgs, modelEntity.jvmArgs) &&
        Objects.equals(this.subType, modelEntity.subType) &&
        Objects.equals(this.labelsFileLocation, modelEntity.labelsFileLocation) &&
        Objects.equals(this.extraArgs, modelEntity.extraArgs) &&
        Objects.equals(this.launchPolicy, modelEntity.launchPolicy) &&
        Objects.equals(this.modelState, modelEntity.modelState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, modelType, deploymentId, name, scale, fileLocation, state, jvmArgs, subType, labelsFileLocation, extraArgs, launchPolicy, modelState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    jvmArgs: ").append(toIndentedString(jvmArgs)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    labelsFileLocation: ").append(toIndentedString(labelsFileLocation)).append("\n");
    sb.append("    extraArgs: ").append(toIndentedString(extraArgs)).append("\n");
    sb.append("    launchPolicy: ").append(toIndentedString(launchPolicy)).append("\n");
    sb.append("    modelState: ").append(toIndentedString(modelState)).append("\n");
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

