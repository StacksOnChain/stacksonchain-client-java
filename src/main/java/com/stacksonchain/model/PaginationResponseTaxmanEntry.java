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
import com.stacksonchain.model.Pagination;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PaginationResponseTaxmanEntry
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-25T15:36:22.741800281-07:00[America/Los_Angeles]")
public class PaginationResponseTaxmanEntry {
  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("records")
  private Object records = null;

  public PaginationResponseTaxmanEntry pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @Schema(description = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public PaginationResponseTaxmanEntry records(Object records) {
    this.records = records;
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @Schema(description = "")
  public Object getRecords() {
    return records;
  }

  public void setRecords(Object records) {
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
    PaginationResponseTaxmanEntry paginationResponseTaxmanEntry = (PaginationResponseTaxmanEntry) o;
    return Objects.equals(this.pagination, paginationResponseTaxmanEntry.pagination) &&
        Objects.equals(this.records, paginationResponseTaxmanEntry.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, records);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationResponseTaxmanEntry {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
