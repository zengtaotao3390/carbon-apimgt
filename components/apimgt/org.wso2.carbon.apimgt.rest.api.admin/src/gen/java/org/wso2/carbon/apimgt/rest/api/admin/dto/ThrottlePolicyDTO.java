package org.wso2.carbon.apimgt.rest.api.admin.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class ThrottlePolicyDTO  {
  
  
  
  private String policyId = null;
  
  @NotNull
  private String policyName = null;
  
  
  private String displayName = null;
  
  
  private String description = null;
  
  
  private Boolean isDeployed = false;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("policyId")
  public String getPolicyId() {
    return policyId;
  }
  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isDeployed")
  public Boolean getIsDeployed() {
    return isDeployed;
  }
  public void setIsDeployed(Boolean isDeployed) {
    this.isDeployed = isDeployed;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottlePolicyDTO {\n");
    
    sb.append("  policyId: ").append(policyId).append("\n");
    sb.append("  policyName: ").append(policyName).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  isDeployed: ").append(isDeployed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
