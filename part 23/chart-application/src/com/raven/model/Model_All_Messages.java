package com.raven.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Model_All_Messages {

    public int getFromUserID() {
        return fromUserID;
    }

    public void setFromUserID(int fromUserID) {
        this.fromUserID = fromUserID;
    }

    public int getToUserID() {
        return toUserID;
    }

    public void setToUserID(int toUserID) {
        this.toUserID = toUserID;
    }

    public Model_All_Messages(Object json) {
        JSONObject obj = (JSONObject) json;
        try {
            fromUserID = obj.getInt("fromUserID");
            toUserID = obj.getInt("toUserID");
        } catch (JSONException e) {
            System.err.println(e);
        }
    }

    public Model_All_Messages(int fromUserID, int toUserID) {
        this.fromUserID = fromUserID;
        this.toUserID = toUserID;
    }

    private int fromUserID;
    private int toUserID;

    public JSONObject toJsonObject() {
        try {
            JSONObject json = new JSONObject();
            json.put("fromUserID", fromUserID);
            json.put("toUserID", toUserID);
            return json;
        } catch (JSONException e) {
            return null;
        }
    }
}
