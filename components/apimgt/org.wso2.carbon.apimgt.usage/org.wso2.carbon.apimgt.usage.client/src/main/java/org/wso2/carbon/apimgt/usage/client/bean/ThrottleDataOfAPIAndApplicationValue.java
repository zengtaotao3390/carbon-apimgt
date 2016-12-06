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

import java.util.Calendar;
import java.util.List;

/**
 * This class is used as a bean for represent API,Application throttle out usage statistics result from the DAS REST API
 */
public class ThrottleDataOfAPIAndApplicationValue {
    private int success_request_count;
    private int throttle_out_count;
    private List<String> api_year_month_week_day_facet;
    private long max_request_time;
    private int year;
    private int month;
    private int week;
    private int day;

    public int getSuccess_request_count() {
        return success_request_count;
    }

    public void setSuccess_request_count(int success_request_count) {
        this.success_request_count = success_request_count;
    }

    public int getThrottle_out_count() {
        return throttle_out_count;
    }

    public void setThrottle_out_count(int throttle_out_count) {
        this.throttle_out_count = throttle_out_count;
    }

    public List<String> getColumnNames() {
        return api_year_month_week_day_facet;
    }

    public void setApi_year_month_week_day_facet(List<String> api_year_month_week_day_facet) {
        this.api_year_month_week_day_facet = api_year_month_week_day_facet;
    }

    public long getMax_request_time() {

        int year=Integer.parseInt(getColumnNames().get(1));
        int month=Integer.parseInt(getColumnNames().get(2));
        int day=Integer.parseInt(getColumnNames().get(4));

        Calendar calender = Calendar.getInstance();
        calender.set(Calendar.HOUR, 0);
        calender.set(Calendar.MINUTE, 0);
        calender.set(Calendar.SECOND, 0);
        calender.set(Calendar.DATE, day);
        calender.set(Calendar.MONTH, month-1);
        calender.set(Calendar.YEAR, year);
        long time= calender.getTimeInMillis();
        return time;
    }

    public void setMax_request_time(long max_request_time) {
        this.max_request_time = max_request_time;
    }
}
