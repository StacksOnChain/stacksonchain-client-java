/*
 * StacksData API
 * Stacksdata provides various information about Stacks blockchain through REST API. The data is as real-time as it appears on Stacks node. Finalized blocks, transactions and corresponding events are visible once the consensus is reached. This document describes what information is available and how to query it to produce various reports and dashboards.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@stacksdata.info
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.stacksonchain.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.stacksonchain.model.UserReport;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ApiResponseUserReport
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-26T14:22:33.844642602-07:00[America/Los_Angeles]")
public class ApiResponseUserReport {
  @SerializedName("status")
  private String status = null;

  @SerializedName("value")
  private UserReport value = null;

  public ApiResponseUserReport status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ApiResponseUserReport value(UserReport value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public UserReport getValue() {
    return value;
  }

  public void setValue(UserReport value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseUserReport apiResponseUserReport = (ApiResponseUserReport) o;
    return Objects.equals(this.status, apiResponseUserReport.status) &&
        Objects.equals(this.value, apiResponseUserReport.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseUserReport {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
