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
 * Arbitrage
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-26T14:22:33.844642602-07:00[America/Los_Angeles]")
public class Arbitrage {
  @SerializedName("blockHeight")
  private Integer blockHeight = null;

  @SerializedName("arbitrage")
  private Double arbitrage = null;

  public Arbitrage blockHeight(Integer blockHeight) {
    this.blockHeight = blockHeight;
    return this;
  }

   /**
   * Get blockHeight
   * @return blockHeight
  **/
  @Schema(description = "")
  public Integer getBlockHeight() {
    return blockHeight;
  }

  public void setBlockHeight(Integer blockHeight) {
    this.blockHeight = blockHeight;
  }

  public Arbitrage arbitrage(Double arbitrage) {
    this.arbitrage = arbitrage;
    return this;
  }

   /**
   * Get arbitrage
   * @return arbitrage
  **/
  @Schema(description = "")
  public Double getArbitrage() {
    return arbitrage;
  }

  public void setArbitrage(Double arbitrage) {
    this.arbitrage = arbitrage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Arbitrage arbitrage = (Arbitrage) o;
    return Objects.equals(this.blockHeight, arbitrage.blockHeight) &&
        Objects.equals(this.arbitrage, arbitrage.arbitrage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockHeight, arbitrage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Arbitrage {\n");
    
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    arbitrage: ").append(toIndentedString(arbitrage)).append("\n");
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
