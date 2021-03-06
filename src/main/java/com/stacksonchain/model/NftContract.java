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
 * NftContract
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-26T14:22:33.844642602-07:00[America/Los_Angeles]")
public class NftContract {
  @SerializedName("contractName")
  private String contractName = null;

  @SerializedName("deploymentTime")
  private String deploymentTime = null;

  public NftContract contractName(String contractName) {
    this.contractName = contractName;
    return this;
  }

   /**
   * Get contractName
   * @return contractName
  **/
  @Schema(description = "")
  public String getContractName() {
    return contractName;
  }

  public void setContractName(String contractName) {
    this.contractName = contractName;
  }

  public NftContract deploymentTime(String deploymentTime) {
    this.deploymentTime = deploymentTime;
    return this;
  }

   /**
   * Get deploymentTime
   * @return deploymentTime
  **/
  @Schema(description = "")
  public String getDeploymentTime() {
    return deploymentTime;
  }

  public void setDeploymentTime(String deploymentTime) {
    this.deploymentTime = deploymentTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NftContract nftContract = (NftContract) o;
    return Objects.equals(this.contractName, nftContract.contractName) &&
        Objects.equals(this.deploymentTime, nftContract.deploymentTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractName, deploymentTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NftContract {\n");
    
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    deploymentTime: ").append(toIndentedString(deploymentTime)).append("\n");
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
