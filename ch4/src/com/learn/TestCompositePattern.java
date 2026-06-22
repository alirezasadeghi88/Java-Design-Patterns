package com.learn;

public class TestCompositePattern {
    public static void main(String[] args) {
        HtmlTag parentTag=new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
    }
}
