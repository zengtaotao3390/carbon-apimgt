package org.wso2.carbon.apimgt.rest.api.admin.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;




@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = org.wso2.carbon.apimgt.rest.api.admin.dto.RequestCountLimitDTO.class, name = "RequestCountLimit"),
    @JsonSubTypes.Type(value = org.wso2.carbon.apimgt.rest.api.admin.dto.BandwidthLimitDTO.class, name = "BandwidthLimit"),
})
@ApiModel(description = "")
public class ThrottleLimitDTO  {
  
  
  public enum TypeEnum {
     RequestCountLimit,  BandwidthLimit, 
  };
  @NotNull
  private TypeEnum type = null;
  
  @NotNull
  private String timeUnit = null;
  
  @NotNull
  private Integer unitTime = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timeUnit")
  public String getTimeUnit() {
    return timeUnit;
  }
  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("unitTime")
  public Integer getUnitTime() {
    return unitTime;
  }
  public void setUnitTime(Integer unitTime) {
    this.unitTime = unitTime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottleLimitDTO {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  timeUnit: ").append(timeUnit).append("\n");
    sb.append("  unitTime: ").append(unitTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
