/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ai.skymind.skil.model;

import ai.skymind.skil.model.FileUpload;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class FileUploadList implements Serializable {
  
  @SerializedName("fileUploadResponseList")
  private List<FileUpload> fileUploadResponseList = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<FileUpload> getFileUploadResponseList() {
    return fileUploadResponseList;
  }
  public void setFileUploadResponseList(List<FileUpload> fileUploadResponseList) {
    this.fileUploadResponseList = fileUploadResponseList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadList fileUploadList = (FileUploadList) o;
    return (this.fileUploadResponseList == null ? fileUploadList.fileUploadResponseList == null : this.fileUploadResponseList.equals(fileUploadList.fileUploadResponseList));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fileUploadResponseList == null ? 0: this.fileUploadResponseList.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadList {\n");
    
    sb.append("  fileUploadResponseList: ").append(fileUploadResponseList).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}