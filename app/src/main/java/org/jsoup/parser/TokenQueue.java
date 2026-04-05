package org.jsoup.parser;

import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;

/* JADX INFO: loaded from: classes2.dex */
public class TokenQueue {
    private static final char ESC = '\\';
    private int pos = 0;
    private String queue;

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.queue = str;
    }

    private int remainingLength() {
        return this.queue.length() - this.pos;
    }

    public static String unescape(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = 0;
        char c2 = 0;
        while (i2 < length) {
            char c3 = charArray[i2];
            if (c3 != '\\' || (c2 != 0 && c2 == '\\')) {
                sb.append(c3);
            }
            i2++;
            c2 = c3;
        }
        return sb.toString();
    }

    public void addFirst(Character ch) {
        addFirst(ch.toString());
    }

    public void addFirst(String str) {
        this.queue = str + this.queue.substring(this.pos);
        this.pos = 0;
    }

    public void advance() {
        if (isEmpty()) {
            return;
        }
        this.pos++;
    }

    public String chompBalanced(char c2, char c3) {
        char cCharValue = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (!isEmpty()) {
            Character chValueOf = Character.valueOf(consume());
            if (cCharValue == 0 || cCharValue != '\\') {
                if (chValueOf.equals(Character.valueOf(c2))) {
                    i2++;
                    if (i3 == -1) {
                        i3 = this.pos;
                    }
                } else if (chValueOf.equals(Character.valueOf(c3))) {
                    i2--;
                }
            }
            if (i2 > 0 && cCharValue != 0) {
                i4 = this.pos;
            }
            cCharValue = chValueOf.charValue();
            if (i2 <= 0) {
                break;
            }
        }
        return i4 >= 0 ? this.queue.substring(i3, i4) : BuildConfig.FLAVOR;
    }

    public String chompTo(String str) {
        String strConsumeTo = consumeTo(str);
        matchChomp(str);
        return strConsumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String strConsumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return strConsumeToIgnoreCase;
    }

    public char consume() {
        String str = this.queue;
        int i2 = this.pos;
        this.pos = i2 + 1;
        return str.charAt(i2);
    }

    public void consume(String str) {
        if (!matches(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > remainingLength()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.pos += length;
    }

    public String consumeAttributeKey() {
        int i2 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_', ':'))) {
            this.pos++;
        }
        return this.queue.substring(i2, this.pos);
    }

    public String consumeCssIdentifier() {
        int i2 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_'))) {
            this.pos++;
        }
        return this.queue.substring(i2, this.pos);
    }

    public String consumeElementSelector() {
        int i2 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('|', '_', '-'))) {
            this.pos++;
        }
        return this.queue.substring(i2, this.pos);
    }

    public String consumeTagName() {
        int i2 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny(':', '_', '-'))) {
            this.pos++;
        }
        return this.queue.substring(i2, this.pos);
    }

    public String consumeTo(String str) {
        int iIndexOf = this.queue.indexOf(str, this.pos);
        if (iIndexOf == -1) {
            return remainder();
        }
        String strSubstring = this.queue.substring(this.pos, iIndexOf);
        this.pos += strSubstring.length();
        return strSubstring;
    }

    public String consumeToAny(String... strArr) {
        int i2 = this.pos;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.pos++;
        }
        return this.queue.substring(i2, this.pos);
    }

    public String consumeToIgnoreCase(String str) {
        int length;
        int i2;
        int i3 = this.pos;
        String strSubstring = str.substring(0, 1);
        boolean zEquals = strSubstring.toLowerCase().equals(strSubstring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            if (zEquals) {
                int iIndexOf = this.queue.indexOf(strSubstring, this.pos);
                int i4 = this.pos;
                int i5 = iIndexOf - i4;
                if (i5 == 0) {
                    i2 = i4 + 1;
                } else if (i5 < 0) {
                    length = this.queue.length();
                } else {
                    i2 = i4 + i5;
                }
                this.pos = i2;
            } else {
                length = this.pos + 1;
            }
            this.pos = length;
        }
        return this.queue.substring(i3, this.pos);
    }

    public boolean consumeWhitespace() {
        boolean z = false;
        while (matchesWhitespace()) {
            this.pos++;
            z = true;
        }
        return z;
    }

    public String consumeWord() {
        int i2 = this.pos;
        while (matchesWord()) {
            this.pos++;
        }
        return this.queue.substring(i2, this.pos);
    }

    public boolean isEmpty() {
        return remainingLength() == 0;
    }

    public boolean matchChomp(String str) {
        if (!matches(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    public boolean matches(String str) {
        return this.queue.regionMatches(true, this.pos, str, 0, str.length());
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c2 : cArr) {
            if (this.queue.charAt(this.pos) == c2) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAny(String... strArr) {
        for (String str : strArr) {
            if (matches(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesCS(String str) {
        return this.queue.startsWith(str, this.pos);
    }

    public boolean matchesStartTag() {
        return remainingLength() >= 2 && this.queue.charAt(this.pos) == '<' && Character.isLetter(this.queue.charAt(this.pos + 1));
    }

    public boolean matchesWhitespace() {
        return !isEmpty() && StringUtil.isWhitespace(this.queue.charAt(this.pos));
    }

    public boolean matchesWord() {
        return !isEmpty() && Character.isLetterOrDigit(this.queue.charAt(this.pos));
    }

    public char peek() {
        if (isEmpty()) {
            return (char) 0;
        }
        return this.queue.charAt(this.pos);
    }

    public String remainder() {
        String str = this.queue;
        String strSubstring = str.substring(this.pos, str.length());
        this.pos = this.queue.length();
        return strSubstring;
    }

    public String toString() {
        return this.queue.substring(this.pos);
    }
}
