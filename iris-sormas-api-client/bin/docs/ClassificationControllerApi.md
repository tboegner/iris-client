# ClassificationControllerApi

All URIs are relative to */sormas-rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAll1**](ClassificationControllerApi.md#getAll1) | **GET** /classification/all/{since} | 

<a name="getAll1"></a>
# **getAll1**
> List&lt;DiseaseClassificationCriteriaDto&gt; getAll1(since)



### Example
```java
// Import classes:
//import iris.sormas.client.invoker.ApiClient;
//import iris.sormas.client.invoker.ApiException;
//import iris.sormas.client.invoker.Configuration;
//import iris.sormas.client.invoker.auth.*;
//import iris.sormas.client.api.ClassificationControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClassificationControllerApi apiInstance = new ClassificationControllerApi();
Long since = 789L; // Long | 
try {
    List<DiseaseClassificationCriteriaDto> result = apiInstance.getAll1(since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassificationControllerApi#getAll1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **Long**|  |

### Return type

[**List&lt;DiseaseClassificationCriteriaDto&gt;**](DiseaseClassificationCriteriaDto.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=UTF-8

