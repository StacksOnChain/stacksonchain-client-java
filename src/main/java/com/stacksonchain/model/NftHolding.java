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
 * NftHolding
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-26T14:22:33.844642602-07:00[America/Los_Angeles]")
public class NftHolding {
  @SerializedName("assetIdentifier")
  private String assetIdentifier = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("txHash")
  private String txHash = null;

  @SerializedName("blockHeight")
  private Integer blockHeight = null;

  public NftHolding assetIdentifier(String assetIdentifier) {
    this.assetIdentifier = assetIdentifier;
    return this;
  }

   /**
   * Get assetIdentifier
   * @return assetIdentifier
  **/
  @Schema(description = "")
  public String getAssetIdentifier() {
    return assetIdentifier;
  }

  public void setAssetIdentifier(String assetIdentifier) {
    this.assetIdentifier = assetIdentifier;
  }

  public NftHolding value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public NftHolding txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * Get txHash
   * @return txHash
  **/
  @Schema(description = "")
  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public NftHolding blockHeight(Integer blockHeight) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NftHolding nftHolding = (NftHolding) o;
    return Objects.equals(this.assetIdentifier, nftHolding.assetIdentifier) &&
        Objects.equals(this.value, nftHolding.value) &&
        Objects.equals(this.txHash, nftHolding.txHash) &&
        Objects.equals(this.blockHeight, nftHolding.blockHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIdentifier, value, txHash, blockHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NftHolding {\n");
    
    sb.append("    assetIdentifier: ").append(toIndentedString(assetIdentifier)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
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
