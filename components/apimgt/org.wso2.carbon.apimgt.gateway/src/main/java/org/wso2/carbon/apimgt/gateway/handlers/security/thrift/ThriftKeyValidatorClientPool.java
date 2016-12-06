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
package org.wso2.carbon.apimgt.gateway.handlers.security.thrift;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.pool.BasePoolableObjectFactory;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.StackObjectPool;

public class ThriftKeyValidatorClientPool {

    private static final Log log = LogFactory.getLog(ThriftKeyValidatorClientPool.class);

    private static final ThriftKeyValidatorClientPool instance = new ThriftKeyValidatorClientPool();

    private final ObjectPool clientPool;

    private ThriftKeyValidatorClientPool() {
        log.debug("Initializing thrift key validator client pool");
        clientPool = new StackObjectPool(new BasePoolableObjectFactory() {
            @Override
            public Object makeObject() throws Exception {
                log.debug("Initializing new ThriftKeyValidatorClient instance");
                return new ThriftKeyValidatorClient();
            }
        }, 50, 20);
    }

    public static ThriftKeyValidatorClientPool getInstance() {
        return instance;
    }

    public ThriftKeyValidatorClient get() throws Exception {
        return (ThriftKeyValidatorClient) clientPool.borrowObject();
    }

    public void release(ThriftKeyValidatorClient client) throws Exception {
        clientPool.returnObject(client);
    }

    public void cleanup() {
        try {
            clientPool.close();
        } catch (Exception e) {
            log.warn("Error while cleaning up the object pool", e);
        }
    }
}
