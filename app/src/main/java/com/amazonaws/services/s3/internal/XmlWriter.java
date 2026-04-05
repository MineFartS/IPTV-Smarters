package com.amazonaws.services.s3.internal;

import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class XmlWriter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public List<String> tags = new ArrayList();
    public StringBuilder sb = new StringBuilder();

    private void appendEscapedString(String str, StringBuilder sb) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            String str2 = cCharAt != '\t' ? cCharAt != '\n' ? cCharAt != '\r' ? cCharAt != '\"' ? cCharAt != '&' ? cCharAt != '<' ? cCharAt != '>' ? null : "&gt;" : "&lt;" : "&amp;" : "&quot;" : "&#13;" : "&#10;" : "&#9;";
            if (str2 != null) {
                if (i3 < i2) {
                    sb.append((CharSequence) str, i3, i2);
                }
                this.sb.append(str2);
                i3 = i2 + 1;
            }
            i2++;
        }
        if (i3 < i2) {
            this.sb.append((CharSequence) str, i3, i2);
        }
    }

    private void writeAttr(String str, String str2) {
        StringBuilder sb = this.sb;
        sb.append(' ');
        sb.append(str);
        sb.append("=\"");
        appendEscapedString(str2, this.sb);
        this.sb.append("\"");
    }

    public XmlWriter end() {
        String strRemove = this.tags.remove(r0.size() - 1);
        StringBuilder sb = this.sb;
        sb.append("</");
        sb.append(strRemove);
        sb.append(">");
        return this;
    }

    public byte[] getBytes() {
        return toString().getBytes(StringUtils.UTF8);
    }

    public XmlWriter start(String str) {
        StringBuilder sb = this.sb;
        sb.append("<");
        sb.append(str);
        sb.append(">");
        this.tags.add(str);
        return this;
    }

    public XmlWriter start(String str, String str2, String str3) {
        StringBuilder sb = this.sb;
        sb.append("<");
        sb.append(str);
        writeAttr(str2, str3);
        this.sb.append(">");
        this.tags.add(str);
        return this;
    }

    public XmlWriter start(String str, String[] strArr, String[] strArr2) {
        StringBuilder sb = this.sb;
        sb.append("<");
        sb.append(str);
        for (int i2 = 0; i2 < Math.min(strArr.length, strArr2.length); i2++) {
            writeAttr(strArr[i2], strArr2[i2]);
        }
        this.sb.append(">");
        this.tags.add(str);
        return this;
    }

    public String toString() {
        return this.sb.toString();
    }

    public XmlWriter value(String str) {
        appendEscapedString(str, this.sb);
        return this;
    }
}
