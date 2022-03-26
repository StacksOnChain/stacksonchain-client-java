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
import com.stacksonchain.model.TableSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UserReport
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-26T14:22:33.844642602-07:00[America/Los_Angeles]")
public class UserReport {
  @SerializedName("name")
  private String name = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("table")
  private String table = null;

  @SerializedName("spec")
  private TableSpec spec = null;

  public UserReport name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserReport query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @Schema(description = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public UserReport table(String table) {
    this.table = table;
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @Schema(description = "")
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public UserReport spec(TableSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(description = "")
  public TableSpec getSpec() {
    return spec;
  }

  public void setSpec(TableSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserReport userReport = (UserReport) o;
    return Objects.equals(this.name, userReport.name) &&
        Objects.equals(this.query, userReport.query) &&
        Objects.equals(this.table, userReport.table) &&
        Objects.equals(this.spec, userReport.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, query, table, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserReport {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
