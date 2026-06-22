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
}
