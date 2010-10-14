/*
 * Copyright 2005-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ws.mock.client;

import java.io.IOException;
import java.net.URI;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.WebServiceMessageFactory;

/**
 * Implementation of {@link ResponseCreator} that holds an error message.
 *
 * @author Arjen Poutsma
 * @author Lukas Krecan
 * @since 2.0
 */
class ErrorResponseCreator implements ResponseCreator<WebServiceMessage> {

    private final String errorMessage;

    ErrorResponseCreator(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public WebServiceMessage createResponse(URI uri,
                                            WebServiceMessage request,
                                            WebServiceMessageFactory<? extends WebServiceMessage> factory) throws IOException {
        // Do nothing
        return null;
    }

    String getErrorMessage() {
        return errorMessage;
    }
}