package com.learn;

import java.util.List;

public class HtmlParentElement extends HtmlTag{
    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;

    public HtmlParentElement(String tagName, String startTag, String endTag, List<HtmlTag> childrenTag) {
        this.tagName = tagName;
        this.startTag = startTag;
        this.endTag = endTag;
        this.childrenTag = childrenTag;
    }

    public HtmlParentElement(String tagName) {
        super();
    }

    @Override
    public String getTagName(){
        return tagName;
    }
    @Override
    public void setStartTag(String tag){
        this.startTag=tag;
    }

    @Override
    public void setEndTag(String tag){
        this.endTag=tag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag){
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag){
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag>getChildren(){
        return childrenTag;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);

    }


}
