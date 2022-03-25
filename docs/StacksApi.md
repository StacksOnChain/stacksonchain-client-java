# StacksApi

All URIs are relative to *https://api.stacksdata.info*

Method | HTTP request | Description
------------- | ------------- | -------------
[**arbitrageMia**](StacksApi.md#arbitrageMia) | **GET** /v1/mia-arb | 
[**arbitrageNyc**](StacksApi.md#arbitrageNyc) | **GET** /v1/nyc-arb | 
[**arkadikoVaults**](StacksApi.md#arkadikoVaults) | **GET** /v1/owner/{address}/arkadiko-vaults | 
[**block**](StacksApi.md#block) | **GET** /v1/block | 
[**coins**](StacksApi.md#coins) | **GET** /v1/coins | 
[**deserialize**](StacksApi.md#deserialize) | **GET** /v1/deserialize/{value} | 
[**price**](StacksApi.md#price) | **GET** /v1/price | 
[**run**](StacksApi.md#run) | **POST** /v1/run | 
[**ts**](StacksApi.md#ts) | **POST** /v1/ts | 

<a name="arbitrageMia"></a>
# **arbitrageMia**
> List&lt;Arbitrage&gt; arbitrageMia()



MIA citycoin mining arbitrage.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.StacksApi;


StacksApi apiInstance = new StacksApi();
try {
    List<Arbitrage> result = apiInstance.arbitrageMia();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#arbitrageMia");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Arbitrage&gt;**](Arbitrage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="arbitrageNyc"></a>
# **arbitrageNyc**
> List&lt;Arbitrage&gt; arbitrageNyc()



NYC citycoin mining arbitrage.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.StacksApi;


StacksApi apiInstance = new StacksApi();
try {
    List<Arbitrage> result = apiInstance.arbitrageNyc();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#arbitrageNyc");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Arbitrage&gt;**](Arbitrage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="arkadikoVaults"></a>
# **arkadikoVaults**
> arkadikoVaults(address)



Deserialize serialized Clarity values

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.StacksApi;


StacksApi apiInstance = new StacksApi();
String address = "address_example"; // String | 
try {
    apiInstance.arkadikoVaults(address);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#arkadikoVaults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="block"></a>
# **block**
> BlockSpec block()



Returns the latest block number.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.StacksApi;


StacksApi apiInstance = new StacksApi();
try {
    BlockSpec result = apiInstance.block();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#block");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BlockSpec**](BlockSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coins"></a>
# **coins**
> List&lt;CoinInfo&gt; coins()



Coin contracts holders and supply.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.StacksApi;


StacksApi apiInstance = new StacksApi();
try {
    List<CoinInfo> result = apiInstance.coins();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#coins");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CoinInfo&gt;**](CoinInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deserialize"></a>
# **deserialize**
> deserialize(value)



Deserialize serialized Clarity values

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.StacksApi;


StacksApi apiInstance = new StacksApi();
String value = "value_example"; // String | 
try {
    apiInstance.deserialize(value);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#deserialize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="price"></a>
# **price**
> List&lt;PriceSpec&gt; price(symbol, from, to)



Fetched latest prices for corresponding symbol.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.StacksApi;


StacksApi apiInstance = new StacksApi();
String symbol = "symbol_example"; // String | Can be STX-USD, MIA-USD, or BTC-USD
String from = "from_example"; // String | 
String to = "to_example"; // String | 
try {
    List<PriceSpec> result = apiInstance.price(symbol, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#price");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Can be STX-USD, MIA-USD, or BTC-USD | [optional]
 **from** | **String**|  | [optional]
 **to** | **String**|  | [optional]

### Return type

[**List&lt;PriceSpec&gt;**](PriceSpec.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="run"></a>
# **run**
> Dataset run(body)



Runs a predefined report, the report might use provided blockHeight. If blockHeight is not specified the latest one is assumed.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.StacksApi;


StacksApi apiInstance = new StacksApi();
RunRequest body = new RunRequest(); // RunRequest | reportName must be one of active_contracts, active_recent_contracts, smart_contracts, smart_contracts_total, pools, wallets, wallets_dist, whales, nft_contracts.
try {
    Dataset result = apiInstance.run(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#run");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunRequest**](RunRequest.md)| reportName must be one of active_contracts, active_recent_contracts, smart_contracts, smart_contracts_total, pools, wallets, wallets_dist, whales, nft_contracts. | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ts"></a>
# **ts**
> Dataset ts(body)



Runs a predefined time-series report (e.g. price feed).

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.StacksApi;


StacksApi apiInstance = new StacksApi();
RunRequest body = new RunRequest(); // RunRequest | 
try {
    Dataset result = apiInstance.ts(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StacksApi#ts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunRequest**](RunRequest.md)|  | [optional]

### Return type

[**Dataset**](Dataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

