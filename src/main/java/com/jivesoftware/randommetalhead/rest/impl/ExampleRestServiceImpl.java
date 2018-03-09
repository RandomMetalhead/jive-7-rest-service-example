/*
 * Copyright(C) 2016 RandomMetalhead
 *
 * This software is the proprietary information of Jive Software. Use is subject to license terms.
 */

package com.jivesoftware.randommetalhead.rest.impl;

import com.jivesoftware.community.JiveGlobals;
import com.jivesoftware.community.dwr.RemoteSupport;
import com.jivesoftware.randommetalhead.rest.ExampleRestService;
import org.apache.log4j.Logger;


public class ExampleRestServiceImpl extends RemoteSupport implements ExampleRestService {

    private static final Logger log = Logger.getLogger(ExampleRestServiceImpl.class);

    public ExampleRestServiceImpl() {
    }

    @Override
    public String getTeststring(String testString) {
        if (JiveGlobals.getCurrentUser().isAnonymous()) {
            return buildError("unauthorized");
        }

        return buildResponse(testString, "get");
    }

    @Override
    public String postTeststring(String testString) {
        if (JiveGlobals.getCurrentUser().isAnonymous()) {
            return buildError("unauthorized");
        }
        return buildResponse(testString, "post");
    }

    @Override
    public String deleteTeststring(String testString) {
        if (JiveGlobals.getCurrentUser().isAnonymous()) {
            return buildError("unauthorized");
        }
        return buildResponse(testString, "delete");
    }

    private String buildResponse(String testString, String type) {
        StringBuilder builder = new StringBuilder();

        builder.append("{");
        builder.append("\"string\":\"" + testString + "\",");
        builder.append("\"type\":\"" + type + "\"");
        builder.append("}");

        return builder.toString();

    }

    private String buildError(String string) {
        StringBuilder builder = new StringBuilder();

        builder.append("{");
        builder.append("\"error\":\"" + string + "\"");
        builder.append("}");

        return builder.toString();

    }


}
