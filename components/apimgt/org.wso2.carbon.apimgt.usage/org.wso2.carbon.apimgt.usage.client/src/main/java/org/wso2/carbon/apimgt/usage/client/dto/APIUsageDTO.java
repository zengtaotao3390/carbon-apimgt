/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.apimgt.usage.client.dto;

public class APIUsageDTO {

    private String appName;
    private String apiName;
    private String consumerKey;
    private long count;

    public String getconsumerKey() {return consumerKey; }

    public void setconsumerKey(String consumerKey) { this.consumerKey = consumerKey;}

    public String getappName() {return appName; }

    public void setappName(String appName) { this.appName = appName;}

    public String getApiName() {return apiName; }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }


}
