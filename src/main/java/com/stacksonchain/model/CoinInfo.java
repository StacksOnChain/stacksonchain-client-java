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
import java.math.BigDecimal;
/**
 * CoinInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-26T14:22:33.844642602-07:00[America/Los_Angeles]")
public class CoinInfo {
  @SerializedName("contract")
  private String contract = null;

  @SerializedName("holders")
  private BigDecimal holders = null;

  @SerializedName("supply")
  private String supply = null;

  public CoinInfo contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @Schema(description = "")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public CoinInfo holders(BigDecimal holders) {
    this.holders = holders;
    return this;
  }

   /**
   * Get holders
   * @return holders
  **/
  @Schema(description = "")
  public BigDecimal getHolders() {
    return holders;
  }

  public void setHolders(BigDecimal holders) {
    this.holders = holders;
  }

  public CoinInfo supply(String supply) {
    this.supply = supply;
    return this;
  }

   /**
   * Get supply
   * @return supply
  **/
  @Schema(description = "")
  public String getSupply() {
    return supply;
  }

  public void setSupply(String supply) {
    this.supply = supply;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinInfo coinInfo = (CoinInfo) o;
    return Objects.equals(this.contract, coinInfo.contract) &&
        Objects.equals(this.holders, coinInfo.holders) &&
        Objects.equals(this.supply, coinInfo.supply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, holders, supply);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinInfo {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    holders: ").append(toIndentedString(holders)).append("\n");
    sb.append("    supply: ").append(toIndentedString(supply)).append("\n");
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
