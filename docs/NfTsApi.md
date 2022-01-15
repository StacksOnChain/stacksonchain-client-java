# NfTsApi

All URIs are relative to *https://api.stacksdata.info*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assets**](NfTsApi.md#assets) | **GET** /nft/assets/{recipient} | 
[**contracts**](NfTsApi.md#contracts) | **GET** /nft/contracts | 
[**owners**](NfTsApi.md#owners) | **GET** /nft/contracts/{contract}/owners | 
[**prices**](NfTsApi.md#prices) | **GET** /nft/contracts/{contract}/price | 
[**transactions**](NfTsApi.md#transactions) | **GET** /nft/contracts/{contract}/transactions | 
[**volumes**](NfTsApi.md#volumes) | **GET** /nft/contracts/{contract}/volume | 

<a name="assets"></a>
# **assets**
> List&lt;NftHolding&gt; assets(recipient)



NFT assets with corresponding transactions by recipient.

### Example
```java
// Import classes:
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.NfTsApi;


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

No authorization required

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
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.NfTsApi;


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

No authorization required

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
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.NfTsApi;


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

No authorization required

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
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.NfTsApi;


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

No authorization required

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
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.NfTsApi;


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

No authorization required

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
//import com.stacksonchain.ApiException;
//import com.stacksonchain.controllers.NfTsApi;


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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

