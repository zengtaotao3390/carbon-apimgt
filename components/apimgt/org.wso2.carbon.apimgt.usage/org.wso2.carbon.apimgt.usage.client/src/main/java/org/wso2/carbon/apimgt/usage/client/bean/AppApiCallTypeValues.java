/*
* Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*
*/
package org.wso2.carbon.apimgt.usage.client.bean;

import java.util.List;

/**
 * This class is used as a bean for represent API call type usage statistics result from the DAS REST API
 */
public class AppApiCallTypeValues {
    private String count;
    private List<String> key_api_method_path_facet;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<String> getColumnNames() {
        return key_api_method_path_facet;
    }

    public void setcolumnNames(List<String> columnNames) {
        this.key_api_method_path_facet = columnNames;
    }

    public AppApiCallTypeValues(String count, List<String> columnNames) {
        super();
        this.count = count;
        this.key_api_method_path_facet = columnNames;
    }
}
