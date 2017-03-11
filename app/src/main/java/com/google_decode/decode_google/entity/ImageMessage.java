package com.google_decode.decode_google.entity;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ImageMessage {

    private String from;
    private String to;
    private String fromId;
    private String toId;
    private String uri;
    private String timestamp;
    private  boolean status;
    private int width;
    private int height;
    private String index;
    public ImageMessage(String from, String fromId, String to, String toId, String uri, int width, int height){
        this.from = from;
        this.fromId = fromId;
        this.to = to;
        this.toId = toId;
        this.uri = uri;
        this.timestamp =  DateFormat.getDateTimeInstance().format(new Date());
        this.status = false;
        this.height = height;
        this.width = width;
    }

    public String getFrom(){
        return this.from;
    }

    public String getToId(){
        return this.toId;
    }
    public String getFromId(){
        return this.fromId;
    }

    public String getUri(){
        return this.uri;
    }
    public String getIndex(){
        return index;
    }
    public void setIndex(String index){
        this.index = index;
    }
    public Map<String,Object> create(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("from", from);
        result.put("fromId", fromId);
        result.put("to", to);
        result.put("toId", toId);
        result.put("uri", uri);
        result.put("timestamp", timestamp);
        result.put("status", status);
        result.put("index", index);
        result.put("height", height);
        result.put("width", width);

        return result;

    }
}