package com.learn;

public class HtmlElement extends HtmlTag{
    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String tagName){
        this.tagName=tagName;
        this.tagBody="";
        this.startTag="";
        this.endTag="";
    }

}
