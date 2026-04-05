package org.jsoup.parser;

import java.util.Arrays;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.Validate;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class CharacterReader {
    public static final char EOF = 65535;
    private static final int maxCacheLen = 12;
    private final char[] input;
    private final int length;
    private int pos = 0;
    private int mark = 0;
    private final String[] stringCache = new String[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED];

    public CharacterReader(String str) {
        Validate.notNull(str);
        char[] charArray = str.toCharArray();
        this.input = charArray;
        this.length = charArray.length;
    }

    private String cacheString(int i2, int i3) {
        char[] cArr = this.input;
        String[] strArr = this.stringCache;
        if (i3 > 12) {
            return new String(cArr, i2, i3);
        }
        int i4 = 0;
        int i5 = i2;
        int i6 = 0;
        while (i4 < i3) {
            i6 = (i6 * 31) + cArr[i5];
            i4++;
            i5++;
        }
        int length = (strArr.length - 1) & i6;
        String str = strArr[length];
        if (str != null) {
            return rangeEquals(i2, i3, str) ? str : new String(cArr, i2, i3);
        }
        String str2 = new String(cArr, i2, i3);
        strArr[length] = str2;
        return str2;
    }

    public void advance() {
        this.pos++;
    }

    public char consume() {
        int i2 = this.pos;
        char c2 = i2 >= this.length ? EOF : this.input[i2];
        this.pos = i2 + 1;
        return c2;
    }

    public String consumeAsString() {
        char[] cArr = this.input;
        int i2 = this.pos;
        this.pos = i2 + 1;
        return new String(cArr, i2, 1);
    }

    public String consumeData() {
        int i2;
        char c2;
        int i3 = this.pos;
        int i4 = this.length;
        char[] cArr = this.input;
        while (true) {
            i2 = this.pos;
            if (i2 >= i4 || (c2 = cArr[i2]) == '&' || c2 == '<' || c2 == 0) {
                break;
            }
            this.pos = i2 + 1;
        }
        return i2 > i3 ? cacheString(i3, i2 - i3) : BuildConfig.FLAVOR;
    }

    public String consumeDigitSequence() {
        int i2;
        char c2;
        int i3 = this.pos;
        while (true) {
            i2 = this.pos;
            if (i2 >= this.length || (c2 = this.input[i2]) < '0' || c2 > '9') {
                break;
            }
            this.pos = i2 + 1;
        }
        return cacheString(i3, i2 - i3);
    }

    public String consumeHexSequence() {
        int i2;
        char c2;
        int i3 = this.pos;
        while (true) {
            i2 = this.pos;
            if (i2 >= this.length || (((c2 = this.input[i2]) < '0' || c2 > '9') && ((c2 < 'A' || c2 > 'F') && (c2 < 'a' || c2 > 'f')))) {
                break;
            }
            this.pos = i2 + 1;
        }
        return cacheString(i3, i2 - i3);
    }

    public String consumeLetterSequence() {
        int i2;
        char c2;
        int i3 = this.pos;
        while (true) {
            i2 = this.pos;
            if (i2 >= this.length || (((c2 = this.input[i2]) < 'A' || c2 > 'Z') && (c2 < 'a' || c2 > 'z'))) {
                break;
            }
            this.pos = i2 + 1;
        }
        return cacheString(i3, i2 - i3);
    }

    public String consumeLetterThenDigitSequence() {
        char c2;
        int i2 = this.pos;
        while (true) {
            int i3 = this.pos;
            if (i3 >= this.length || (((c2 = this.input[i3]) < 'A' || c2 > 'Z') && (c2 < 'a' || c2 > 'z'))) {
                break;
            }
            this.pos = i3 + 1;
        }
        while (!isEmpty()) {
            char[] cArr = this.input;
            int i4 = this.pos;
            char c3 = cArr[i4];
            if (c3 < '0' || c3 > '9') {
                break;
            }
            this.pos = i4 + 1;
        }
        return cacheString(i2, this.pos - i2);
    }

    public String consumeTagName() {
        int i2;
        char c2;
        int i3 = this.pos;
        int i4 = this.length;
        char[] cArr = this.input;
        while (true) {
            i2 = this.pos;
            if (i2 >= i4 || (c2 = cArr[i2]) == '\t' || c2 == '\n' || c2 == '\r' || c2 == '\f' || c2 == ' ' || c2 == '/' || c2 == '>' || c2 == 0) {
                break;
            }
            this.pos = i2 + 1;
        }
        return i2 > i3 ? cacheString(i3, i2 - i3) : BuildConfig.FLAVOR;
    }

    public String consumeTo(char c2) {
        int iNextIndexOf = nextIndexOf(c2);
        if (iNextIndexOf == -1) {
            return consumeToEnd();
        }
        String strCacheString = cacheString(this.pos, iNextIndexOf);
        this.pos += iNextIndexOf;
        return strCacheString;
    }

    public String consumeTo(String str) {
        int iNextIndexOf = nextIndexOf(str);
        if (iNextIndexOf == -1) {
            return consumeToEnd();
        }
        String strCacheString = cacheString(this.pos, iNextIndexOf);
        this.pos += iNextIndexOf;
        return strCacheString;
    }

    public String consumeToAny(char... cArr) {
        int i2 = this.pos;
        int i3 = this.length;
        loop0: while (this.pos < i3) {
            for (char c2 : cArr) {
                if (this.input[this.pos] == c2) {
                    break loop0;
                }
            }
            this.pos++;
        }
        int i4 = this.pos;
        return i4 > i2 ? cacheString(i2, i4 - i2) : BuildConfig.FLAVOR;
    }

    public String consumeToAnySorted(char... cArr) {
        int i2 = this.pos;
        int i3 = this.length;
        char[] cArr2 = this.input;
        while (true) {
            int i4 = this.pos;
            if (i4 >= i3 || Arrays.binarySearch(cArr, cArr2[i4]) >= 0) {
                break;
            }
            this.pos++;
        }
        int i5 = this.pos;
        return i5 > i2 ? cacheString(i2, i5 - i2) : BuildConfig.FLAVOR;
    }

    public String consumeToEnd() {
        int i2 = this.pos;
        String strCacheString = cacheString(i2, this.length - i2);
        this.pos = this.length;
        return strCacheString;
    }

    public boolean containsIgnoreCase(String str) {
        Locale locale = Locale.ENGLISH;
        return nextIndexOf(str.toLowerCase(locale)) > -1 || nextIndexOf(str.toUpperCase(locale)) > -1;
    }

    public char current() {
        int i2 = this.pos;
        return i2 >= this.length ? EOF : this.input[i2];
    }

    public boolean isEmpty() {
        return this.pos >= this.length;
    }

    public void mark() {
        this.mark = this.pos;
    }

    public boolean matchConsume(String str) {
        if (!matches(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    public boolean matchConsumeIgnoreCase(String str) {
        if (!matchesIgnoreCase(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    public boolean matches(char c2) {
        return !isEmpty() && this.input[this.pos] == c2;
    }

    public boolean matches(String str) {
        int length = str.length();
        if (length > this.length - this.pos) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != this.input[this.pos + i2]) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        char c2 = this.input[this.pos];
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAnySorted(char[] cArr) {
        return !isEmpty() && Arrays.binarySearch(cArr, this.input[this.pos]) >= 0;
    }

    public boolean matchesDigit() {
        char c2;
        return !isEmpty() && (c2 = this.input[this.pos]) >= '0' && c2 <= '9';
    }

    public boolean matchesIgnoreCase(String str) {
        int length = str.length();
        if (length > this.length - this.pos) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (Character.toUpperCase(str.charAt(i2)) != Character.toUpperCase(this.input[this.pos + i2])) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesLetter() {
        if (isEmpty()) {
            return false;
        }
        char c2 = this.input[this.pos];
        return (c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z');
    }

    public int nextIndexOf(char c2) {
        for (int i2 = this.pos; i2 < this.length; i2++) {
            if (c2 == this.input[i2]) {
                return i2 - this.pos;
            }
        }
        return -1;
    }

    public int nextIndexOf(CharSequence charSequence) {
        char cCharAt = charSequence.charAt(0);
        int i2 = this.pos;
        while (i2 < this.length) {
            if (cCharAt != this.input[i2]) {
                do {
                    i2++;
                    if (i2 >= this.length) {
                        break;
                    }
                } while (cCharAt != this.input[i2]);
            }
            int i3 = i2 + 1;
            int length = (charSequence.length() + i3) - 1;
            int i4 = this.length;
            if (i2 < i4 && length <= i4) {
                int i5 = i3;
                for (int i6 = 1; i5 < length && charSequence.charAt(i6) == this.input[i5]; i6++) {
                    i5++;
                }
                if (i5 == length) {
                    return i2 - this.pos;
                }
            }
            i2 = i3;
        }
        return -1;
    }

    public int pos() {
        return this.pos;
    }

    public boolean rangeEquals(int i2, int i3, String str) {
        if (i3 != str.length()) {
            return false;
        }
        char[] cArr = this.input;
        int i4 = 0;
        while (true) {
            int i5 = i3 - 1;
            if (i3 == 0) {
                return true;
            }
            int i6 = i2 + 1;
            int i7 = i4 + 1;
            if (cArr[i2] != str.charAt(i4)) {
                return false;
            }
            i2 = i6;
            i3 = i5;
            i4 = i7;
        }
    }

    public void rewindToMark() {
        this.pos = this.mark;
    }

    public String toString() {
        char[] cArr = this.input;
        int i2 = this.pos;
        return new String(cArr, i2, this.length - i2);
    }

    public void unconsume() {
        this.pos--;
    }
}
