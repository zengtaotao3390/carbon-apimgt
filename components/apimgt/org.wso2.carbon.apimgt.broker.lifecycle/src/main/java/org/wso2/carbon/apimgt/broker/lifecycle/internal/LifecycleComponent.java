/*
 *
 *   Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 * /
 */

package org.wso2.carbon.apimgt.broker.lifecycle.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.andes.listeners.BrokerLifecycleListener;
import org.wso2.carbon.andes.service.QpidService;
import org.wso2.carbon.apimgt.jms.listener.JMSListenerShutDownService;


/**
 * This components registers a Broker Lifecycle Listener. This component will only get activated when andes bundle is
 * present.
 */

/**
 * @scr.component name="org.wso2.apimgt.broker.lifecycle" immediate="true"
 * @scr.reference name="shutdown.listener"
 * interface="org.wso2.carbon.apimgt.jms.listener.JMSListenerShutDownService" cardinality="1..1"
 * policy="dynamic" bind="setShutDownService" unbind="unsetShutDownService"
 * @scr.reference name="QpidService"
 * interface="org.wso2.carbon.andes.service.QpidService" cardinality="1..1"
 * policy="dynamic" bind="setQpidService" unbind="unsetQpidService"
 */

public class LifecycleComponent {

    private static final Log log = LogFactory.getLog(LifecycleComponent.class);

    protected void activate(ComponentContext context) {
        log.debug("Activating component...");

        return;
    }

    public void setQpidService(QpidService qpidService){
        log.debug("Setting QpidService...");
        ServiceReferenceHolder.getInstance().setQpidService(qpidService);
        if(qpidService != null){
            qpidService.registerBrokerLifecycleListener(new BrokerLifecycleListener() {
                @Override
                public void onShuttingdown() {
                    if(ServiceReferenceHolder.getInstance().getListenerShutdownService() == null){
                        return;
                    }

                    log.debug("Triggering a Shutdown of the Listener...");
                    ServiceReferenceHolder.getInstance().getListenerShutdownService().shutDownListener();

                }

                @Override
                public void onShutdown() {

                }
            });
        }
    }

    public void unsetQpidService(QpidService qpidService){
        log.debug("Un Setting QpidService...");
        ServiceReferenceHolder.getInstance().setQpidService(null);
    }

    public void setShutDownService(JMSListenerShutDownService shutDownService){
        log.debug("Setting JMS Listener Shutdown Service");
        ServiceReferenceHolder.getInstance().setListenerShutdownService(shutDownService);
    }

    public void unsetShutDownService(JMSListenerShutDownService shutDownService){
        log.debug("Setting JMS Listener Shutdown Service");
        ServiceReferenceHolder.getInstance().setListenerShutdownService(null);
    }

}
