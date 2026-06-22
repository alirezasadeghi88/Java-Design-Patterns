package com.learn;

public class TestCompositePattern {
    public static void main(String[] args) {
        HtmlTag parentTag=new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");

        HtmlTag p1=new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");

        parentTag.addChildTag(p1);

        HtmlTag child1=new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testinghtmltaglibrary");
        p1.addChildTag(child1);
    }
}
