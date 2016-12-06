package org.wso2.carbon.apimgt.usage.client.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asiri on 3/23/14.
 */
public class AppCallTypeDTO {


    private String appName;
    List<ApiCallTypeArray> apiCallTypeArray=new ArrayList<ApiCallTypeArray>();

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public List<ApiCallTypeArray> getApiCallTypeArray() {
        return apiCallTypeArray;
    }

    public void addToApiCallTypeArray(String apiName, List<String> callType) {
        ApiCallTypeArray apiCallTypeArray = new ApiCallTypeArray();
        apiCallTypeArray.setApiName(apiName);
        apiCallTypeArray.setCallType(callType);
        this.apiCallTypeArray.add(apiCallTypeArray);
    }
}

class ApiCallTypeArray {
    String apiName;
    List<String> callType;

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public List<String> getCallType() {
        return callType;
    }

    public void setCallType(List<String> callType) {
        this.callType = callType;
    }
}