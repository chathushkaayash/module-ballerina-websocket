/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

module io.ballerina.stdlib.websocket {
    requires io.ballerina.runtime;
    requires io.ballerina.tools.api;
    requires io.ballerina.lang;
    requires io.ballerina.lang.value;
    requires io.ballerina.logging;
    requires io.ballerina.config;
    requires io.ballerina.stdlib.mime;
    requires io.ballerina.stdlib.io;
    requires org.bouncycastle.provider;
    requires org.bouncycastle.pkix;
    requires java.xml.bind;
    requires java.management;
    requires org.slf4j;
    requires io.ballerina.stdlib.http;
    requires io.netty.handler;
    requires io.netty.codec.http;
    requires io.netty.transport;
    requires io.netty.codec;
    requires io.netty.common;
    requires io.netty.buffer;
    requires org.apache.commons.lang3;
    exports org.ballerinalang.net.websocket.server;
}
