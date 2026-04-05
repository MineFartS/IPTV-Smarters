package org.simpleframework.xml.core;

import org.simpleframework.xml.filter.Filter;

/* JADX INFO: loaded from: classes2.dex */
public class TemplateEngine {
    private Filter filter;
    private int off;
    private Template source = new Template();
    private Template name = new Template();
    private Template text = new Template();

    public TemplateEngine(Filter filter) {
        this.filter = filter;
    }

    private void name() {
        while (true) {
            int i2 = this.off;
            Template template = this.source;
            if (i2 >= template.count) {
                break;
            }
            char[] cArr = template.buf;
            this.off = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '}') {
                replace();
                break;
            }
            this.name.append(c2);
        }
        if (this.name.length() > 0) {
            this.text.append("${");
            this.text.append(this.name);
        }
    }

    private void parse() {
        while (true) {
            int i2 = this.off;
            Template template = this.source;
            int i3 = template.count;
            if (i2 >= i3) {
                return;
            }
            char[] cArr = template.buf;
            int i4 = i2 + 1;
            this.off = i4;
            char c2 = cArr[i2];
            if (c2 == '$' && i4 < i3) {
                int i5 = i4 + 1;
                this.off = i5;
                if (cArr[i4] == '{') {
                    name();
                } else {
                    this.off = i5 - 1;
                }
            }
            this.text.append(c2);
        }
    }

    private void replace() {
        if (this.name.length() > 0) {
            replace(this.name);
        }
        this.name.clear();
    }

    private void replace(String str) {
        Template template;
        String strReplace = this.filter.replace(str);
        if (strReplace == null) {
            this.text.append("${");
            this.text.append(str);
            template = this.text;
            strReplace = "}";
        } else {
            template = this.text;
        }
        template.append(strReplace);
    }

    private void replace(Template template) {
        replace(template.toString());
    }

    public void clear() {
        this.name.clear();
        this.text.clear();
        this.source.clear();
        this.off = 0;
    }

    public String process(String str) {
        if (str.indexOf(36) < 0) {
            return str;
        }
        try {
            this.source.append(str);
            parse();
            return this.text.toString();
        } finally {
            clear();
        }
    }
}
