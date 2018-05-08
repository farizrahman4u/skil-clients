/**
 * Predict
 * Endpoints API for classification and other prediction services in SKIL
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ai.skymind.skil.model;

import ai.skymind.skil.model.INDArray;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class JsonArrayResponse implements Serializable {
  
  @SerializedName("array")
  private INDArray array = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public INDArray getArray() {
    return array;
  }
  public void setArray(INDArray array) {
    this.array = array;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonArrayResponse jsonArrayResponse = (JsonArrayResponse) o;
    return (this.array == null ? jsonArrayResponse.array == null : this.array.equals(jsonArrayResponse.array));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.array == null ? 0: this.array.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonArrayResponse {\n");
    
    sb.append("  array: ").append(array).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
