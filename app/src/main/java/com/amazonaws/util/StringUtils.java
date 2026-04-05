package com.amazonaws.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class StringUtils {
    private static final String DEFAULT_ENCODING = "UTF-8";
    public static final Charset UTF8 = Charset.forName("UTF-8");

    public static String fromBigDecimal(BigDecimal bigDecimal) {
        return bigDecimal.toString();
    }

    public static String fromBigInteger(BigInteger bigInteger) {
        return bigInteger.toString();
    }

    public static String fromBoolean(Boolean bool) {
        return Boolean.toString(bool.booleanValue());
    }

    public static String fromByte(Byte b2) {
        return Byte.toString(b2.byteValue());
    }

    public static String fromByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return Base64.encodeAsString(byteBuffer.array());
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return Base64.encodeAsString(bArr);
    }

    public static String fromDate(Date date) {
        return DateUtils.formatISO8601Date(date);
    }

    public static String fromDouble(Double d2) {
        return Double.toString(d2.doubleValue());
    }

    public static String fromFloat(Float f2) {
        return Float.toString(f2.floatValue());
    }

    public static String fromInteger(Integer num) {
        return Integer.toString(num.intValue());
    }

    public static String fromLong(Long l2) {
        return Long.toString(l2.longValue());
    }

    public static String fromString(String str) {
        return str;
    }

    public static boolean isBlank(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i2 = 0; i2 < length; i2++) {
                if (!Character.isWhitespace(charSequence.charAt(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String join(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            sb.append(strArr[i2]);
            if (i2 < strArr.length - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? BuildConfig.FLAVOR : str.toLowerCase(Locale.ENGLISH);
    }

    public static String replace(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer(str.length());
        stringBuffer.append(str);
        while (true) {
            int iIndexOf = stringBuffer.indexOf(str2);
            if (iIndexOf == -1) {
                return stringBuffer.toString();
            }
            stringBuffer = stringBuffer.replace(iIndexOf, str2.length() + iIndexOf, str3);
        }
    }

    public static BigDecimal toBigDecimal(String str) {
        return new BigDecimal(str);
    }

    public static BigInteger toBigInteger(String str) {
        return new BigInteger(str);
    }

    public static Boolean toBoolean(StringBuilder sb) {
        return Boolean.valueOf(Boolean.getBoolean(sb.toString()));
    }

    public static Integer toInteger(StringBuilder sb) {
        return Integer.valueOf(Integer.parseInt(sb.toString()));
    }

    public static String toString(StringBuilder sb) {
        return sb.toString();
    }

    public static String upperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? BuildConfig.FLAVOR : str.toUpperCase(Locale.ENGLISH);
    }
}
