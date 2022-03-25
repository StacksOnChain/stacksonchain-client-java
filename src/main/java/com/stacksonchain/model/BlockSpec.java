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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BlockSpec
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-25T15:36:22.741800281-07:00[America/Los_Angeles]")
public class BlockSpec {
  @SerializedName("maxBlockHeight")
  private Long maxBlockHeight = null;

  public BlockSpec maxBlockHeight(Long maxBlockHeight) {
    this.maxBlockHeight = maxBlockHeight;
    return this;
  }

   /**
   * Get maxBlockHeight
   * @return maxBlockHeight
  **/
  @Schema(description = "")
  public Long getMaxBlockHeight() {
    return maxBlockHeight;
  }

  public void setMaxBlockHeight(Long maxBlockHeight) {
    this.maxBlockHeight = maxBlockHeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockSpec blockSpec = (BlockSpec) o;
    return Objects.equals(this.maxBlockHeight, blockSpec.maxBlockHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxBlockHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockSpec {\n");
    
    sb.append("    maxBlockHeight: ").append(toIndentedString(maxBlockHeight)).append("\n");
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
