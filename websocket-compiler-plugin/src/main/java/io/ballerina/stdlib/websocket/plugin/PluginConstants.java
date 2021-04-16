/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package io.ballerina.stdlib.websocket.plugin;

/**
 * WebSocket compiler plugin constants.
 */
public class PluginConstants {

    public static final String COLON = ":";
    public static final String SERVICE = "Service";
    public static final String PIPE = "|";
    public static final String UPGRADE_ERROR = "UpgradeError";
    static final String CODE = "WS_110";
    static final String ON_ERROR = "onError";
    static final String ON_OPEN = "onOpen";
    static final String ON_CLOSE = "onClose";
    static final String ON_IDLE_TIMEOUT = "onIdleTimeout";
    static final String ON_TEXT_MESSAGE = "onTextMessage";
    static final String ON_BINARY_MESSAGE = "onBinaryMessage";
    static final String REMOTE_KEY_WORD = "remote";
    static final String RESOURCE_KEY_WORD = "resource";
    static final String HTTP_REQUEST = "http:Request";

    /**
     * Compilation Errors of WebSocket module.
     */
    public enum CompilationErrors {
        INVALID_INPUT_PARAM_FOR_ON_CLOSE("Invalid parameters `{0}` provided for onClose remote function",
                "WS_202"),
        INVALID_INPUT_FOR_ONCLOSE_WITH_ONE_PARAMS("Invalid parameters `{0}` provided for onClose remote "
                + "function. `string` is the mandatory parameter", "WS_203"),
        INVALID_INPUT_PARAMS_FOR_ON_OPEN("Invalid parameters provided for onOpen remote function. "
                + "Only `{0}`:Caller is allowed as the parameter", "WS_204"),
        INVALID_RETURN_TYPES("Invalid return types provided for `{0}` remote function, return type should be "
                + "either `error?` or `{1}` ", "WS_205"),
        INVALID_INPUT_PARAMS_FOR_ON_CLOSE("Invalid parameters provided for onClose remote function",
                "WS_206"),
        INVALID_INPUT_FOR_ON_ERROR_WITH_ONE_PARAMS("Invalid parameters `{0}` provided for onError remote function."
                + " `error` is the mandatory parameter", "WS_207"),
        INVALID_INPUT_FOR_ON_ERROR("Invalid parameters `{0}` provided for onError remote function",
                "WS_208"),
        INVALID_INPUT_PARAMS_FOR_ON_IDLE_TIMEOUT("Invalid parameters provided for OnIdleTimeout remote function. "
                + "Only `{0}`:Caller is allowed as the parameter", "WS_209"),
        INVALID_INPUT_PARAM_FOR_ON_IDLE_TIMEOUT("Invalid parameters `{0}` provided for onIdleTimeout remote "
                + "function", "WS_210"),
        INVALID_INPUT_FOR_ON_TEXT_WITH_ONE_PARAMS("Invalid parameters `{0}` provided for onTextMessage remote "
                + "function. `string` is the mandatory parameter", "WS_211"),
        INVALID_INPUT_FOR_ON_TEXT("Invalid parameters `{0}` provided for onTextMessage remote function",
                "WS_212"),
        INVALID_RETURN_TYPES_ON_DATA("Invalid return type `{0}` provided for `{1}` remote function",
                "WS_213"),
        INVALID_INPUT_FOR_ON_BINARY_WITH_ONE_PARAMS("Invalid parameters `{0}` provided for onBinaryMessage "
                + "remote function. `byte[]` is the mandatory parameter", "WS_214"),
        INVALID_INPUT_FOR_ON_BINARY("Invalid parameters `{0}` provided for onBinaryMessage remote function",
                "WS_215"),
        INVALID_RESOURCE_ERROR("There should be only one `get` resource for the service", "WS_101"),
        MORE_THAN_ONE_RESOURCE_PARAM_ERROR("There should be only http:Request as a parameter", "WS_102"),
        INVALID_RESOURCE_PARAMETER_ERROR("Invalid parameter `{0}` provided for `{1}`", "WS_103"),
        INVALID_RETURN_TYPES_IN_RESOURCE("Invalid return type `{0}` provided for function `{1}`, return type "
                + "should be a subtype of `{2}`", "WS_104"),
        FUNCTION_NOT_ACCEPTED_BY_THE_SERVICE("Function `{0}` not accepted by the service", "WS_105");

        private final String error;
        private final String errorCode;

        CompilationErrors(String error, String errorCode) {
            this.error = error;
            this.errorCode = errorCode;
        }

        public String getError() {
            return error;
        }

        public String getErrorCode() {
            return errorCode;
        }
    }

    private PluginConstants() {}
}
