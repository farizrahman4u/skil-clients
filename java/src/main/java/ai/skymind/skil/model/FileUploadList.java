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
import ai.skymind.skil.model.FileUpload;
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
 * FileUploadList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-07T17:24:59.081+05:00")
public class FileUploadList {
  @SerializedName("fileUploadResponseList")
  private List<FileUpload> fileUploadResponseList = null;

  public FileUploadList fileUploadResponseList(List<FileUpload> fileUploadResponseList) {
    this.fileUploadResponseList = fileUploadResponseList;
    return this;
  }

  public FileUploadList addFileUploadResponseListItem(FileUpload fileUploadResponseListItem) {
    if (this.fileUploadResponseList == null) {
      this.fileUploadResponseList = new ArrayList<FileUpload>();
    }
    this.fileUploadResponseList.add(fileUploadResponseListItem);
    return this;
  }

   /**
   * Get fileUploadResponseList
   * @return fileUploadResponseList
  **/
  @ApiModelProperty(value = "")
  public List<FileUpload> getFileUploadResponseList() {
    return fileUploadResponseList;
  }

  public void setFileUploadResponseList(List<FileUpload> fileUploadResponseList) {
    this.fileUploadResponseList = fileUploadResponseList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadList fileUploadList = (FileUploadList) o;
    return Objects.equals(this.fileUploadResponseList, fileUploadList.fileUploadResponseList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileUploadResponseList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadList {\n");
    
    sb.append("    fileUploadResponseList: ").append(toIndentedString(fileUploadResponseList)).append("\n");
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

