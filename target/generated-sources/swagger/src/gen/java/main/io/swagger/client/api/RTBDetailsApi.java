package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Error;
import io.swagger.client.model.RTBDetails;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-05T20:25:02.561+05:30")
public class RTBDetailsApi {
  private ApiClient apiClient;

  public RTBDetailsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RTBDetailsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Loads all the input parameters that corresponds to the RTB details
   * Process the given request and returns the all required parameters in json string format to invoke a request to the RTB server.
   * @param adParams Extracts the input parameters from the client request such as device information,site information and user information.
   * @return RTBDetails
   */
  public RTBDetails rtbInputParamsGet(String adParams) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'adParams' is set
     if (adParams == null) {
        throw new ApiException(400, "Missing the required parameter 'adParams' when calling rtbInputParamsGet");
     }
     
    // create path and map variables
    String path = "/rtbInputParams".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "adParams", adParams));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<RTBDetails> returnType = new GenericType<RTBDetails>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
