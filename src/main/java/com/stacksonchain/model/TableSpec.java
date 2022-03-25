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
import com.stacksonchain.model.Column;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * TableSpec
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-25T15:36:22.741800281-07:00[America/Los_Angeles]")
public class TableSpec {
  @SerializedName("version")
  private Integer version = null;

  @SerializedName("schema")
  private List<Column> schema = new ArrayList<Column>();

  public TableSpec version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(required = true, description = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public TableSpec schema(List<Column> schema) {
    this.schema = schema;
    return this;
  }

  public TableSpec addSchemaItem(Column schemaItem) {
    this.schema.add(schemaItem);
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @Schema(required = true, description = "")
  public List<Column> getSchema() {
    return schema;
  }

  public void setSchema(List<Column> schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableSpec tableSpec = (TableSpec) o;
    return Objects.equals(this.version, tableSpec.version) &&
        Objects.equals(this.schema, tableSpec.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableSpec {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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