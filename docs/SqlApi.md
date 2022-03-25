# SqlApi

All URIs are relative to *https://api.stacksdata.info*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runPortfolioTxHistory**](SqlApi.md#runPortfolioTxHistory) | **GET** /v1/owner/{address}/portfolio | 
[**runSql**](SqlApi.md#runSql) | **POST** /v1/sql | 
[**runSqlV2**](SqlApi.md#runSqlV2) | **POST** /v1/sql-v2 | 
[**runTxHistory**](SqlApi.md#runTxHistory) | **GET** /v1/owner/{address}/history | 

<a name="runPortfolioTxHistory"></a>
# **runPortfolioTxHistory**
> PaginationResponsePortfolioEntry runPortfolioTxHistory(address, next, limit)



Portfolio history for owner in reverse order

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.SqlApi;


SqlApi apiInstance = new SqlApi();
String address = "address_example"; // String | 
String next = "next_example"; // String | 
Integer limit = 56; // Integer | 
try {
    PaginationResponsePortfolioEntry result = apiInstance.runPortfolioTxHistory(address, next, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#runPortfolioTxHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**|  |
 **next** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**PaginationResponsePortfolioEntry**](PaginationResponsePortfolioEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

<a name="runTxHistory"></a>
# **runTxHistory**
> PaginationResponseTaxmanEntry runTxHistory(address, next, limit)



Transaction history for owner

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.SqlApi;


SqlApi apiInstance = new SqlApi();
String address = "address_example"; // String | 
String next = "next_example"; // String | 
Integer limit = 56; // Integer | 
try {
    PaginationResponseTaxmanEntry result = apiInstance.runTxHistory(address, next, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlApi#runTxHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**|  |
 **next** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**PaginationResponseTaxmanEntry**](PaginationResponseTaxmanEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

