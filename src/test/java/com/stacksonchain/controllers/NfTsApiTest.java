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

package com.stacksonchain.controllers;

import com.stacksonchain.model.NftContract;
import com.stacksonchain.model.NftHolding;
import com.stacksonchain.model.NftOwner;
import com.stacksonchain.model.NftPrice;
import com.stacksonchain.model.NftTransactions;
import com.stacksonchain.model.NftVolume;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for NfTsApi
 */
@Ignore
public class NfTsApiTest {

    private final NfTsApi api = new NfTsApi();

    /**
     * 
     *
     * NFT assets with corresponding transactions by recipient.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void assetsTest() throws Exception {
        String recipient = null;
        List<NftHolding> response = api.assets(recipient);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns a list of all NFT contracts.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void contractsTest() throws Exception {
        List<NftContract> response = api.contracts();

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns a list of all owner of given NFT contract.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ownersTest() throws Exception {
        String contract = null;
        List<NftOwner> response = api.owners(contract);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns average prices per time period for given NFT contract in the last 60 days.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pricesTest() throws Exception {
        String contract = null;
        String datepart = null;
        List<NftPrice> response = api.prices(contract, datepart);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns number of transactions per day for given NFT contract.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void transactionsTest() throws Exception {
        String contract = null;
        List<NftTransactions> response = api.transactions(contract);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns volumes per day for given NFT contract.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void volumesTest() throws Exception {
        String contract = null;
        List<NftVolume> response = api.volumes(contract);

        // TODO: test validations
    }
}