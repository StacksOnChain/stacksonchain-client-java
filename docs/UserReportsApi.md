# UserReportsApi

All URIs are relative to *https://api.stacksdata.info*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserReport**](UserReportsApi.md#createUserReport) | **POST** /cp-v1/user-report | 
[**dropUser**](UserReportsApi.md#dropUser) | **DELETE** /cp-v1/user | 
[**getUserReport**](UserReportsApi.md#getUserReport) | **GET** /cp-v1/user-report/{name} | 
[**listUserReports**](UserReportsApi.md#listUserReports) | **GET** /cp-v1/user-report | 
[**listUsers**](UserReportsApi.md#listUsers) | **GET** /cp-v1/user | 
[**registerUser**](UserReportsApi.md#registerUser) | **POST** /cp-v1/user | 
[**runUserReport**](UserReportsApi.md#runUserReport) | **POST** /cp-v1/run-user-report/{name} | 

<a name="createUserReport"></a>
# **createUserReport**
> UserReport createUserReport(body)



### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.UserReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

UserReportsApi apiInstance = new UserReportsApi();
UserReportRequest body = new UserReportRequest(); // UserReportRequest | 
try {
    UserReport result = apiInstance.createUserReport(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserReportsApi#createUserReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserReportRequest**](UserReportRequest.md)|  | [optional]

### Return type

[**UserReport**](UserReport.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dropUser"></a>
# **dropUser**
> User dropUser(body)



### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.UserReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

UserReportsApi apiInstance = new UserReportsApi();
DropUserRequest body = new DropUserRequest(); // DropUserRequest | 
try {
    User result = apiInstance.dropUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserReportsApi#dropUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DropUserRequest**](DropUserRequest.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserReport"></a>
# **getUserReport**
> UserReport getUserReport(name)



### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.UserReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

UserReportsApi apiInstance = new UserReportsApi();
String name = "name_example"; // String | 
try {
    UserReport result = apiInstance.getUserReport(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserReportsApi#getUserReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**UserReport**](UserReport.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUserReports"></a>
# **listUserReports**
> List&lt;UserReport&gt; listUserReports()



### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.UserReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

UserReportsApi apiInstance = new UserReportsApi();
try {
    List<UserReport> result = apiInstance.listUserReports();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserReportsApi#listUserReports");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserReport&gt;**](UserReport.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> List&lt;User&gt; listUsers()



### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.UserReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

UserReportsApi apiInstance = new UserReportsApi();
try {
    List<User> result = apiInstance.listUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserReportsApi#listUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerUser"></a>
# **registerUser**
> User registerUser(body)



### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.UserReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

UserReportsApi apiInstance = new UserReportsApi();
RegisterUserRequest body = new RegisterUserRequest(); // RegisterUserRequest | 
try {
    User result = apiInstance.registerUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserReportsApi#registerUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegisterUserRequest**](RegisterUserRequest.md)|  | [optional]

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runUserReport"></a>
# **runUserReport**
> ApiResponseUserReport runUserReport(name)



### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.UserReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

UserReportsApi apiInstance = new UserReportsApi();
String name = "name_example"; // String | 
try {
    ApiResponseUserReport result = apiInstance.runUserReport(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserReportsApi#runUserReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**ApiResponseUserReport**](ApiResponseUserReport.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

