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
import ai.skymind.skil.model.SingleCSVRecord;
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
 * BatchCSVRecord
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-17T18:26:36.552+05:00")
public class BatchCSVRecord {
  @SerializedName("records")
  private List<SingleCSVRecord> records = new ArrayList<SingleCSVRecord>();

  public BatchCSVRecord records(List<SingleCSVRecord> records) {
    this.records = records;
    return this;
  }

  public BatchCSVRecord addRecordsItem(SingleCSVRecord recordsItem) {
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SingleCSVRecord> getRecords() {
    return records;
  }

  public void setRecords(List<SingleCSVRecord> records) {
    this.records = records;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchCSVRecord batchCSVRecord = (BatchCSVRecord) o;
    return Objects.equals(this.records, batchCSVRecord.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchCSVRecord {\n");
    
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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

