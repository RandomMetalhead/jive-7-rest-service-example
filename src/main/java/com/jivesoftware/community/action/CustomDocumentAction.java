/*
 * Copyright(C) 2016 RandomMetalhead
 *
 * This software is the proprietary information of Jive Software. Use is subject to license terms.
 */

package com.jivesoftware.community.action;

import com.jivesoftware.community.content.discussion.action.CreateDiscussionAction;

/**
 * Used to apply a document against the presenter for its document type.
 */


public class CustomDocumentAction extends CreateDiscussionAction {


    private String testString;

    @Override
    public String input() {
        return super.input();
    }

    public String execute() {

        this.setTestString("Das ist ein Teststring");
        return super.execute();
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

}
