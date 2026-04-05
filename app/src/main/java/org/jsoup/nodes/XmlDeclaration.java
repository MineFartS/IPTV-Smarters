package org.jsoup.nodes;

import org.jsoup.nodes.Document;

/* JADX INFO: loaded from: classes2.dex */
public class XmlDeclaration extends Node {
    public static final String DECL_KEY = "declaration";
    private final boolean isProcessingInstruction;

    public XmlDeclaration(String str, String str2, boolean z) {
        super(str2);
        this.attributes.put(DECL_KEY, str);
        this.isProcessingInstruction = z;
    }

    public String getWholeDeclaration() {
        String str = this.attributes.get(DECL_KEY);
        if (!str.equals("xml") || this.attributes.size() <= 1) {
            return this.attributes.get(DECL_KEY);
        }
        StringBuilder sb = new StringBuilder(str);
        String str2 = this.attributes.get("version");
        if (str2 != null) {
            sb.append(" version=\"");
            sb.append(str2);
            sb.append("\"");
        }
        String str3 = this.attributes.get("encoding");
        if (str3 != null) {
            sb.append(" encoding=\"");
            sb.append(str3);
            sb.append("\"");
        }
        return sb.toString();
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#declaration";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(StringBuilder sb, int i2, Document.OutputSettings outputSettings) {
        sb.append("<");
        sb.append(this.isProcessingInstruction ? "!" : "?");
        sb.append(getWholeDeclaration());
        sb.append(">");
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(StringBuilder sb, int i2, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }
}
