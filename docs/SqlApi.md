# SqlApi

All URIs are relative to *https://api.stacksdata.info*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runSql**](SqlApi.md#runSql) | **POST** /v1/sql | 
[**runSqlV2**](SqlApi.md#runSqlV2) | **POST** /v1/sql-v2 | 

<a name="runSql"></a>
# **runSql**
> Dataset runSql(body)



Executes a provided SQL. See SQL API guide for details. https://stacksdata.info/sql.html

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.SqlApi;


SqlApi apiInstance = new SqlApi();
String body = "body_example"; // String | SQL query
try {
    Dataset result = apiInstance.runSql(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#runSql");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| SQL query | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="runSqlV2"></a>
# **runSqlV2**
> Dataset runSqlV2(body)



Executes a provided SQL. See SQL API guide for details https://stacksdata.info/sql.html.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.SqlApi;


SqlApi apiInstance = new SqlApi();
RunSqlRequest body = new RunSqlRequest(); // RunSqlRequest | 
try {
    Dataset result = apiInstance.runSqlV2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#runSqlV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunSqlRequest**](RunSqlRequest.md)|  | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

