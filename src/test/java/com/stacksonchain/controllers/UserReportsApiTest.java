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

import com.stacksonchain.model.ApiResponseUserReport;
import com.stacksonchain.model.DropUserRequest;
import com.stacksonchain.model.RegisterUserRequest;
import com.stacksonchain.model.User;
import com.stacksonchain.model.UserReport;
import com.stacksonchain.model.UserReportRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserReportsApi
 */
@Ignore
public class UserReportsApiTest {

    private final UserReportsApi api = new UserReportsApi();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createUserReportTest() throws Exception {
        UserReportRequest body = null;
        UserReport response = api.createUserReport(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void dropUserTest() throws Exception {
        DropUserRequest body = null;
        User response = api.dropUser(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserReportTest() throws Exception {
        String name = null;
        UserReport response = api.getUserReport(name);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listUserReportsTest() throws Exception {
        List<UserReport> response = api.listUserReports();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listUsersTest() throws Exception {
        List<User> response = api.listUsers();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void registerUserTest() throws Exception {
        RegisterUserRequest body = null;
        User response = api.registerUser(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void runUserReportTest() throws Exception {
        String name = null;
        ApiResponseUserReport response = api.runUserReport(name);

        // TODO: test validations
    }
}
