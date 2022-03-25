# NfTsApi

All URIs are relative to *https://api.stacksdata.info*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressHistory**](NfTsApi.md#addressHistory) | **GET** /nft/address/{address}/history | 
[**assets**](NfTsApi.md#assets) | **GET** /nft/assets/{recipient} | 
[**contracts**](NfTsApi.md#contracts) | **GET** /nft/contracts | 
[**floor**](NfTsApi.md#floor) | **GET** /nft/contracts/{contract}/floor | 
[**owners**](NfTsApi.md#owners) | **GET** /nft/contracts/{contract}/owners | 
[**prices**](NfTsApi.md#prices) | **GET** /nft/contracts/{contract}/price | 
[**tokens**](NfTsApi.md#tokens) | **GET** /nft/contracts/{contract}/tokens | 
[**totalVolumes**](NfTsApi.md#totalVolumes) | **GET** /nft/volume | 
[**transactions**](NfTsApi.md#transactions) | **GET** /nft/contracts/{contract}/transactions | 
[**volumes**](NfTsApi.md#volumes) | **GET** /nft/contracts/{contract}/volume | 

<a name="addressHistory"></a>
# **addressHistory**
> List&lt;NftHistory&gt; addressHistory(address)



NFT events history for a specific address

### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.NfTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

NfTsApi apiInstance = new NfTsApi();
String address = "address_example"; // String | 
try {
    List<NftHistory> result = apiInstance.addressHistory(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfTsApi#addressHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**|  |

### Return type

[**List&lt;NftHistory&gt;**](NftHistory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assets"></a>
# **assets**
> List&lt;NftHolding&gt; assets(recipient)



NFT assets with corresponding transactions by recipient.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.NfTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

NfTsApi apiInstance = new NfTsApi();
String recipient = "recipient_example"; // String | 
try {
    List<NftHolding> result = apiInstance.assets(recipient);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfTsApi#assets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recipient** | **String**|  |

### Return type

[**List&lt;NftHolding&gt;**](NftHolding.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contracts"></a>
# **contracts**
> List&lt;NftContract&gt; contracts()



Returns a list of all NFT contracts.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.NfTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

NfTsApi apiInstance = new NfTsApi();
try {
    List<NftContract> result = apiInstance.contracts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfTsApi#contracts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;NftContract&gt;**](NftContract.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="floor"></a>
# **floor**
> List&lt;NftFloor&gt; floor(contract, timeframe)



Floor price for given contract grouped by timeframe (1h, 15m)

### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.NfTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

NfTsApi apiInstance = new NfTsApi();
String contract = "contract_example"; // String | 
String timeframe = "timeframe_example"; // String | 
try {
    List<NftFloor> result = apiInstance.floor(contract, timeframe);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfTsApi#floor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**|  |
 **timeframe** | **String**|  | [optional]

### Return type

[**List&lt;NftFloor&gt;**](NftFloor.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="owners"></a>
# **owners**
> List&lt;NftOwner&gt; owners(contract)



Returns a list of all owner of given NFT contract.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.NfTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

NfTsApi apiInstance = new NfTsApi();
String contract = "contract_example"; // String | 
try {
    List<NftOwner> result = apiInstance.owners(contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfTsApi#owners");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**|  |

### Return type

[**List&lt;NftOwner&gt;**](NftOwner.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="prices"></a>
# **prices**
> List&lt;NftPrice&gt; prices(contract, datepart)



Returns average prices per time period for given NFT contract in the last 60 days.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.NfTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

NfTsApi apiInstance = new NfTsApi();
String contract = "contract_example"; // String | 
String datepart = "datepart_example"; // String | Can be hour, day, or week
try {
    List<NftPrice> result = apiInstance.prices(contract, datepart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfTsApi#prices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**|  |
 **datepart** | **String**| Can be hour, day, or week |

### Return type

[**List&lt;NftPrice&gt;**](NftPrice.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tokens"></a>
# **tokens**
> List&lt;NftToken&gt; tokens(contract)



Returns a list of all tokens of given NFT contract.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.NfTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

NfTsApi apiInstance = new NfTsApi();
String contract = "contract_example"; // String | 
try {
    List<NftToken> result = apiInstance.tokens(contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfTsApi#tokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**|  |

### Return type

[**List&lt;NftToken&gt;**](NftToken.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="totalVolumes"></a>
# **totalVolumes**
> List&lt;NftVolume&gt; totalVolumes(days)



Returns volumes per day for all NFT contracts.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.NfTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

NfTsApi apiInstance = new NfTsApi();
Integer days = 56; // Integer | 
try {
    List<NftVolume> result = apiInstance.totalVolumes(days);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfTsApi#totalVolumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **days** | **Integer**|  | [optional]

### Return type

[**List&lt;NftVolume&gt;**](NftVolume.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transactions"></a>
# **transactions**
> List&lt;NftTransactions&gt; transactions(contract)



Returns number of transactions per day for given NFT contract.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.NfTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

NfTsApi apiInstance = new NfTsApi();
String contract = "contract_example"; // String | 
try {
    List<NftTransactions> result = apiInstance.transactions(contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfTsApi#transactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**|  |

### Return type

[**List&lt;NftTransactions&gt;**](NftTransactions.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="volumes"></a>
# **volumes**
> List&lt;NftVolume&gt; volumes(contract)



Returns volumes per day for given NFT contract.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiClient;
//import com.stacksonchain.ApiException;
//import com.stacksonchain.Configuration;
//import com.stacksonchain.auth.*;
//import com.stacksonchain.controllers.NfTsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearerAuth
ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
bearerAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearerAuth.setApiKeyPrefix("Token");

NfTsApi apiInstance = new NfTsApi();
String contract = "contract_example"; // String | 
try {
    List<NftVolume> result = apiInstance.volumes(contract);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfTsApi#volumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contract** | **String**|  |

### Return type

[**List&lt;NftVolume&gt;**](NftVolume.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

