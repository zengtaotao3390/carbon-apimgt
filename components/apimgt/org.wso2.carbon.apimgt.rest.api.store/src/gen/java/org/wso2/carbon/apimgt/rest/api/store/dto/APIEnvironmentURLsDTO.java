package org.wso2.carbon.apimgt.rest.api.store.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class APIEnvironmentURLsDTO  {
  
  
  
  private String https = null;
  
  
  private String http = null;

  
  /**
   * HTTPS environment URL
   **/
  @ApiModelProperty(value = "HTTPS environment URL")
  @JsonProperty("https")
  public String getHttps() {
    return https;
  }
  public void setHttps(String https) {
    this.https = https;
  }

  
  /**
   * HTTP environment URL
   **/
  @ApiModelProperty(value = "HTTP environment URL")
  @JsonProperty("http")
  public String getHttp() {
    return http;
  }
  public void setHttp(String http) {
    this.http = http;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEnvironmentURLsDTO {\n");
    
    sb.append("  https: ").append(https).append("\n");
    sb.append("  http: ").append(http).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
