package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Xml;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTimeFieldType;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1258aj extends DefaultHandler implements I0<C1257ai> {
    public static byte[] A02;
    public static String[] A03;
    public static final Pattern A04;
    public static final Pattern A05;
    public static final Pattern A06;
    public final String A00;
    public final XmlPullParserFactory A01;

    public static String A0h(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0o() {
        A02 = new byte[]{-108, -57, -99, -103, -91, -55, -24, -57, -99, -103, -95, -55, -57, -100, -103, -91, -55, -24, -94, -57, -100, -103, -97, -55, -107, -87, -102, -106, 90, -114, -106, 93, 91, 90, 113, 108, 97, 90, -114, -106, 93, 91, 91, 113, -107, -106, -106, -106, -106, -106, -106, -106, -106, -109, -106, -106, -106, -106, -109, -106, -106, -106, -106, -109, -106, -106, -106, -106, -109, -106, -106, -106, -106, -106, -106, -106, -106, -106, -106, -106, -106, -106, -110, -110, -110, 123, -99, -99, -97, -83, -83, -93, -100, -93, -90, -93, -82, -77, -34, 1, -2, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, -2, DateTimeFieldType.HOUR_OF_DAY, 6, 12, 11, -16, 2, DateTimeFieldType.HOUR_OF_DAY, -117, -65, -82, -77, -71, -115, -78, -85, -72, -72, -81, -74, -115, -71, -72, -80, -77, -79, -65, -68, -85, -66, -77, -71, -72, -78, -47, -29, -43, -59, -62, -68, -98, -98, -125, -74, -116, -120, -113, -72, -124, -104, -119, -123, -111, -67, -68, -62, -77, -68, -62, -111, -67, -69, -66, -67, -68, -77, -68, -62, -16, 28, 27, 33, DateTimeFieldType.MINUTE_OF_DAY, 27, 33, -3, 31, 28, 33, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 33, DateTimeFieldType.MILLIS_OF_DAY, 28, 27, -127, -83, -77, -86, -94, -84, 101, -78, 94, -95, -80, -93, -97, -78, -93, 94, -106, -85, -86, -114, -77, -86, -86, -114, -97, -80, -79, -93, -80, -124, -97, -95, -78, -83, -80, -73, 94, -89, -84, -79, -78, -97, -84, -95, -93, -73, -24, -41, -32, -26, -108, -59, -76, -67, -61, -94, -61, -63, -76, -80, -68, -110, -95, -6, 31, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 31, DateTimeFieldType.SECOND_OF_MINUTE, -10, 39, DateTimeFieldType.MILLIS_OF_DAY, 31, 37, 4, 37, 35, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 30, -77, -40, -45, -34, -45, -53, -42, -45, -28, -53, -34, -45, -39, -40, -125, -90, -102, -104, -85, -96, -90, -91, -65, -62, -74, -21, DateTimeFieldType.HOUR_OF_HALFDAY, 2, -18, -1, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 3, DateTimeFieldType.CLOCKHOUR_OF_DAY, -15, DateTimeFieldType.MINUTE_OF_DAY, -61, DateTimeFieldType.MINUTE_OF_HOUR, 8, DateTimeFieldType.SECOND_OF_MINUTE, 12, DateTimeFieldType.MINUTE_OF_DAY, 7, DateTimeFieldType.MILLIS_OF_DAY, -61, 9, DateTimeFieldType.MINUTE_OF_DAY, 24, DateTimeFieldType.HOUR_OF_DAY, 7, -47, -14, 7, DateTimeFieldType.SECOND_OF_DAY, 11, DateTimeFieldType.HOUR_OF_DAY, 6, 0, DateTimeFieldType.MINUTE_OF_HOUR, 30, 32, DateTimeFieldType.MINUTE_OF_HOUR, 33, DateTimeFieldType.MINUTE_OF_HOUR, 28, 34, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 34, DateTimeFieldType.MILLIS_OF_SECOND, 29, 28, -34, -5, -8, -15, -12, -2, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 31, -19, 12, 30, DateTimeFieldType.CLOCKHOUR_OF_DAY, -29, -11, -9, -3, -11, -2, 4, -36, -7, 3, 4, -120, -102, -100, -94, -102, -93, -87, -119, -102, -94, -91, -95, -106, -87, -102, -113, -95, -93, -87, -95, -86, -80, -112, -91, -87, -95, -88, -91, -86, -95, -16, 2, 4, 10, 2, 11, DateTimeFieldType.HOUR_OF_DAY, -14, -17, -23, -5, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 24, 24, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -56, DateTimeFieldType.SECOND_OF_MINUTE, 9, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_SECOND, 26, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HALFDAY_OF_DAY, 12, -56, 11, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 11, -30, 24, 27, 27, DateTimeFieldType.CLOCKHOUR_OF_DAY, -56, 12, 9, 28, 9, -39, -5, -10, -10, -14, -21, -13, -21, -12, -6, -25, -14, -42, -8, -11, -10, -21, -8, -6, -1, -115, -116, 123, -116, -95, -91, -95, -90, -97, -73, -48, -61, -60, -50, -57, -126, -42, -47, -126, -58, -57, -42, -57, -44, -49, -53, -48, -57, -126, -58, -41, -44, -61, -42, -53, -47, -48, -126, -47, -56, -126, -43, -42, -61, -42, -53, -59, -126, -49, -61, -48, -53, -56, -57, -43, -42, -112, -60, -35, -48, -47, -37, -44, -113, -29, -34, -113, -45, -44, -29, -44, -31, -36, -40, -35, -44, -113, -30, -29, -48, -31, -29, -113, -34, -43, -113, -33, -44, -31, -40, -34, -45, -113, -6, DateTimeFieldType.MINUTE_OF_HOUR, 6, 7, DateTimeFieldType.HOUR_OF_DAY, 10, -59, 25, DateTimeFieldType.SECOND_OF_DAY, -59, DateTimeFieldType.SECOND_OF_MINUTE, 6, DateTimeFieldType.MILLIS_OF_SECOND, 24, 10, -59, -24, -22, -26, -46, -37, -43, -35, -59, 8, DateTimeFieldType.HALFDAY_OF_DAY, 6, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_HOUR, 10, DateTimeFieldType.HOUR_OF_DAY, -59, DateTimeFieldType.MINUTE_OF_HOUR, 26, DateTimeFieldType.MINUTE_OF_DAY, 7, 10, DateTimeFieldType.MILLIS_OF_SECOND, -59, 11, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, -33, -59, -85, -60, -73, -72, -62, -69, 118, -54, -59, 118, -58, -73, -56, -55, -69, 118, -103, -101, -105, -125, -115, -122, -114, 118, -55, -69, -56, -52, -65, -71, -69, 118, -72, -62, -59, -71, -63, 118, -60, -53, -61, -72, -69, -56, 118, -68, -56, -59, -61, -112, 118, -50, -27, -99, -11, -60, -60, -60, -58, -43, -43, -47, -50, -56, -58, -39, -50, -44, -45, -108, -56, -54, -58, -110, -101, -107, -99, -73, -58, -58, -62, -65, -71, -73, -54, -65, -59, -60, -123, -71, -69, -73, -125, -115, -122, -114, 9, 24, 24, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 11, 9, 28, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_DAY, -41, DateTimeFieldType.SECOND_OF_MINUTE, 24, -36, -33, -18, -18, -22, -25, -31, -33, -14, -25, -19, -20, -83, -14, -14, -21, -22, -87, -10, -21, -22, -51, -36, -36, -40, -43, -49, -51, -32, -43, -37, -38, -101, -28, -103, -39, -36, -96, -103, -30, -32, -32, -91, -76, -76, -80, -83, -89, -91, -72, -83, -77, -78, 115, -68, 113, -74, -91, -69, -89, -89, -51, -31, -48, -43, -37, -63, -43, -60, -55, -49, -113, -59, -63, -61, -109, -69, -49, -66, -61, -55, -119, -65, -69, -67, -115, -121, -60, -55, -67, -21, -1, -18, -13, -7, -35, -21, -9, -6, -10, -13, -8, -15, -36, -21, -2, -17, -66, -45, -66, -58, -55, -66, -65, -58, -55, -58, -47, -42, -80, -47, -66, -49, -47, -79, -58, -54, -62, -10, -11, 2, -8, 11, -3, -8, 8, -4, -31, -29, -33, -76, -82, -74, -32, -30, -34, -76, -83, -75, -94, -82, -93, -92, -94, -78, -25, -13, -14, -8, -23, -14, -8, -40, -3, -12, -23, 10, -36, -35, -34, -39, -19, -28, -20, -41, -61, -63, -68, -106, -89, -92, -109, -90, -101, -95, -96, -21, 0, -11, -24, -12, -16, -22, -15, -17, -73, -65, -84, -80, -88, 125, 119, 127, -52, -98, -106, -105, -94, -99, 108, 109, -77, -65, -82, -70, -78, -97, -82, -63, -78, -23, -26, -22, -24, -23, -11, -12, -17, -25, -20, -30, -29, -10, -48, -33, -20, -27, -29, -36, -31, -36, -25, -36, -44, -33, -36, -19, -44, -25, -36, -30, -31, -58, -53, -51, -46, -47, -80, -47, -49, -62, -66, -54, 125, -63, -52, -62, -48, 125, -53, -52, -47, 125, -64, -52, -53, -47, -66, -58, -53, 125, -66, 125, -45, -66, -55, -58, -63, 125, -54, -62, -63, -58, 
        -66, 125, -51, -49, -62, -48, -62, -53, -47, -66, -47, -58, -52, -53, 125, -63, -62, -48, -64, -49, -58, -51, -47, -58, -52, -53, -56, -67, -54, -61, -56, -59, -65, -63, -54, -49, -63, -79, -50, -56, -59, -71, -63, -58, -20, -28, -29, -24, -32, -42, -50, -51, -46, -54, -71, -37, -50, -36, -50, -41, -35, -54, -35, -46, -40, -41, -83, -34, -37, -54, -35, -46, -40, -41, -50, -58, -59, -54, -62, -77, -62, -49, -56, -58, -28, -32, -28, -36, -53, -16, -25, -36, -82, -86, -81, -125, -74, -89, -89, -90, -77, -107, -86, -82, -90, -34, -38, -33, -38, -34, -26, -34, -58, -31, -43, -46, -27, -42, -63, -42, -29, -38, -32, -43, -64, -58, -115, -65, -76, -56, -59, -65, 25, 31, 28, 30, -26, 28, 30, 27, DateTimeFieldType.MILLIS_OF_SECOND, 25, 12, 26, 12, DateTimeFieldType.SECOND_OF_MINUTE, 27, 8, 27, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, -5, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 12, -48, -46, -59, -45, -59, -50, -44, -63, -44, -55, -49, -50, -76, -55, -51, -59, -81, -58, -58, -45, -59, -44, -84, -81, -81, -92, 29, 34, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 25, DateTimeFieldType.MILLIS_OF_DAY, 32, DateTimeFieldType.SECOND_OF_MINUTE, 1, DateTimeFieldType.MILLIS_OF_DAY, 26, DateTimeFieldType.MINUTE_OF_DAY, 32, -32, -49, -36, -43, -45, 2, -1, -14, 5, 3, 4, -2, -11, 3, 3, -17, -4, -11, 6, -11, -4, -17, -33, -28, -31, -23, -31, -59, -32, -47, -18, -27, -45, -49, -43, -46, -61, -59, -75, -78, -84, -30, -29, -48, -31, -29, -82, -81, -100, -83, -81, -119, -80, -88, -99, -96, -83, -40, -39, -43, -43, 8, 10, -4, -4, -6, 8, 9, -6, -7, -27, 7, -6, 8, -6, 3, 9, -10, 9, -2, 4, 3, -39, -6, 1, -10, DateTimeFieldType.HOUR_OF_HALFDAY, -14, -36, -55, -49, -94, -52, -41, -44, -54, -31, -106, -53, -41, -43, -108, -102, -104, -103, -100, -94, -52, -55, -37, -48, -94, -84, -41, -44, -54, -31, -84, -47, -49, -47, -36, -55, -44, -72, -44, -35, -37, -83, -32, -36, -51, -42, -37, -47, -41, -42, -68, -31, -40, -51, -94, -102, -104, -103, -100, DateTimeFieldType.HOUR_OF_HALFDAY, -5, 1, -44, -2, 9, 6, -4, DateTimeFieldType.MINUTE_OF_HOUR, -56, -3, 9, 7, -58, -52, -54, -53, -50, -44, -2, -5, DateTimeFieldType.HALFDAY_OF_DAY, 2, -44, -5, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -2, 3, 9, -7, -3, 2, -5, 8, 8, -1, 6, -7, -3, 9, 8, 0, 3, 1, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 12, -5, DateTimeFieldType.HOUR_OF_HALFDAY, 3, 9, 8, -44, -52, -54, -53, -53, -24, -39, -20, -24, -3, -14, -10, -18, -36, -15, -14, -17, -3, -53, -2, -17, -17, -18, -5, -51, -18, -7, -3, -15, -76, -87, -83, -91, -77, -93, -95, -84, -91, -80, -75, -84, -95, 34, 31, 27, -25, 26, 29, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, -25, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 32, DateTimeFieldType.SECOND_OF_MINUTE, -25, -33, -32, -35, -35, -32, -25, -32, -25, DateTimeFieldType.HOUR_OF_HALFDAY, 34, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 28, 12, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_HALFDAY, 27, 27, DateTimeFieldType.MINUTE_OF_DAY, 25, 12, DateTimeFieldType.CLOCKHOUR_OF_DAY, 28, 27, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 34, 31, DateTimeFieldType.HOUR_OF_HALFDAY, 33, DateTimeFieldType.MILLIS_OF_DAY, 28, 27, -25, -33, -35, -34, -34, -45, -48, -52, -104, -53, -50, -61, -59, -104, -62, -65, -47, -58, -104, -53, -50, -110, -50, -48, -51, -46, -61, -63, -46, -57, -51, -52, -104, -112, -114, -113, -113, -12, -15, -19, -71, -20, -17, -28, -26, -71, -29, -32, -14, -25, -71, -15, -18, -21, -28, -71, -79, -81, -80, -80, 3, 0, -4, -56, 1, -15, 2, -13, -56, -14, -17, 1, -10, -56, -15, -15, -56, -15, -13, -17, -69, -60, -66, -58, -56, -64, -66, -65, -61, 10, 7, 3, -49, 8, -8, 9, -6, -49, -7, -10, 8, -3, -49, -8, -8, -49, -8, -6, -10, -62, -52, -59, -51, -49, -57, -59, -58, -54, -61, -64, -68, -120, -61, -61, -73, -78, -120, -121, -81, 126, -126, -76, 126, -123, -121, 123, -121, -122, -126, 126, 123, -126, -128, -122, -124, 123, -81, -80, -121, -128, 123, -77, -124, -125, -80, -77, 126, -122, -122, -125, -76, -121, -125, -39, -42, -46, -98, -39, -39, -51, -56, -98, -55, -56, -55, -54, -100, -58, -59, -99, -111, -101, -99, -56, -102, -111, -104, -59, -57, -55, -111, -59, -105, -57, -100, -111, -106, -101, -56, -57, -56, -103, -107, -56, -106, -107, -55, -56, 38, DateTimeFieldType.HOUR_OF_DAY, 28, 37, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_DAY, 4, -1, 0, 10, -81, -94, -99, -98, -88, 104, -90, -87, 109, -52, -66, -71, -70, -53, -66, -61, -70, -113, -63, -66, -72, -70, -61, -56, -70, 34, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 31, DateTimeFieldType.MINUTE_OF_HOUR, -48, -49, -51, -51};
    }

    public static void A0p() {
        A03 = new String[]{"wKwVfq0BRaCnwAeCUaABngINHqKhZo4m", "uY0fhAa4DchaVKKKIbRMX7UGxuM4xyTj", "4", "MT4OmbQoWg65xLbimDOzp3HwJWCrKcc", "HVaar4qLU0841DaL", "8U9DwFxSnU1HwP5TmSmzofPGpYuWo6xo", "hswj15pvf3NTuHVlPHvaS9SMJgLlba6d", "jLI7L8TsZrTsBCiYzLVROvKpi327L8ia"};
    }

    static {
        A0p();
        A0o();
        A06 = Pattern.compile(A0h(28, 16, 0));
        A04 = Pattern.compile(A0h(143, 12, 41));
        A05 = Pattern.compile(A0h(0, 28, 58));
    }

    public C1258aj() {
        this(null);
    }

    public C1258aj(String str) {
        this.A00 = str;
        try {
            this.A01 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException(A0h(188, 45, 12), e2);
        }
    }

    public static float A00(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, A0h(918, 9, 27));
        if (attributeValue != null) {
            Matcher matcher = A06.matcher(attributeValue);
            if (matcher.matches()) {
                int i2 = Integer.parseInt(matcher.group(1));
                if (!TextUtils.isEmpty(matcher.group(2))) {
                    return i2 / Integer.parseInt(r1);
                }
                return i2;
            }
            return f2;
        }
        return f2;
    }

    public static int A01(int i2, int i3) {
        if (i2 == -1) {
            return i3;
        }
        if (i3 == -1) {
            return i2;
        }
        IM.A04(i2 == i3);
        return i2;
    }

    private final int A02(Format format) {
        String str = format.A0O;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (C0761Ie.A0E(str)) {
            return 2;
        }
        if (C0761Ie.A0C(str)) {
            return 1;
        }
        return A0r(str) ? 3 : -1;
    }

    public static int A03(List<GK> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            GK gk = list.get(i2);
            if (A0h(1542, 29, 92).equals(gk.A01) && gk.A02 != null) {
                Matcher matcher = A04.matcher(gk.A02);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(A0h(293, 9, 108), A0h(552, 45, 115) + gk.A02);
            }
        }
        return -1;
    }

    public static int A04(List<GK> list) {
        int i2 = 0;
        while (true) {
            int size = list.size();
            if (A03[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "8paGsE4CihSteYYp";
            strArr[6] = "8paGsE4CihSteYYp";
            if (i2 < size) {
                GK gk = list.get(i2);
                if (A0h(1571, 29, 99).equals(gk.A01) && gk.A02 != null) {
                    Matcher matcher = A05.matcher(gk.A02);
                    if (matcher.matches()) {
                        return Integer.parseInt(matcher.group(1));
                    }
                    Log.w(A0h(293, 9, 108), A0h(597, 51, 36) + gk.A02);
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A05(org.xmlpull.v1.XmlPullParser r7) {
        /*
            r3 = 0
            r2 = 1690(0x69a, float:2.368E-42)
            r1 = 5
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r0 = A0h(r2, r1, r0)
            java.lang.String r0 = r7.getAttributeValue(r3, r0)
            java.lang.String r6 = com.facebook.ads.redexgen.X.J1.A0P(r0)
            r7 = -1
            if (r6 != 0) goto L16
            return r7
        L16:
            int r0 = r6.hashCode()
            r5 = 3
            r4 = 2
            r3 = 1
            switch(r0) {
                case 1596796: goto L2a;
                case 2937391: goto L3b;
                case 3094035: goto L4c;
                case 3133436: goto L5d;
                default: goto L20;
            }
        L20:
            r0 = -1
        L21:
            if (r0 == 0) goto L94
            if (r0 == r3) goto L93
            if (r0 == r4) goto L71
            if (r0 == r5) goto L6e
            return r7
        L2a:
            r2 = 81
            r1 = 4
            r0 = 48
            java.lang.String r0 = A0h(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L20
            r0 = 0
            goto L21
        L3b:
            r2 = 651(0x28b, float:9.12E-43)
            r1 = 4
            r0 = 98
            java.lang.String r0 = A0h(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L4c:
            r2 = 910(0x38e, float:1.275E-42)
            r1 = 4
            r0 = 52
            java.lang.String r0 = A0h(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L20
            r0 = 2
            goto L21
        L5d:
            r2 = 914(0x392, float:1.281E-42)
            r1 = 4
            r0 = 10
            java.lang.String r0 = A0h(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L20
            r0 = 3
            goto L21
        L6e:
            r0 = 8
            return r0
        L71:
            r3 = 6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1258aj.A03
            r0 = 0
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 66
            if (r1 == r0) goto L86
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L86:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1258aj.A03
            java.lang.String r1 = "nXjz4P"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "nXjz4P"
            r0 = 6
            r2[r0] = r1
            return r3
        L93:
            return r4
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1258aj.A05(org.xmlpull.v1.XmlPullParser):int");
    }

    private final int A06(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strA0m = A0m(xmlPullParser, A0h(1215, 11, 74), null);
        int iA05 = -1;
        if (A0h(1433, 54, 123).equals(strA0m)) {
            iA05 = A09(xmlPullParser, A0h(1690, 5, 126), -1);
        } else if (A0h(1340, 56, 104).equals(strA0m)) {
            iA05 = A05(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!J2.A05(xmlPullParser, A0h(111, 25, 24)));
        return iA05;
    }

    private final int A07(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, A0h(862, 11, 82));
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (A0h(768, 5, 58).equals(attributeValue)) {
            return 1;
        }
        if (A0h(1695, 5, 105).equals(attributeValue)) {
            return 2;
        }
        return A0h(1396, 4, 66).equals(attributeValue) ? 3 : -1;
    }

    private final int A08(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strA0m = A0m(xmlPullParser, A0h(1215, 11, 74), null);
        String strA0m2 = A0m(xmlPullParser, A0h(1690, 5, 126), null);
        do {
            xmlPullParser.next();
        } while (!J2.A05(xmlPullParser, A0h(339, 4, 90)));
        return (A0h(1519, 23, 77).equals(strA0m) && A0h(1040, 4, 38).equals(strA0m2)) ? 1 : 0;
    }

    public static int A09(XmlPullParser xmlPullParser, String str, int i2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i2 : Integer.parseInt(attributeValue);
    }

    public static long A0A(XmlPullParser xmlPullParser, String str, long j2) throws AI {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j2;
        }
        return J1.A0K(attributeValue);
    }

    public static long A0B(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j2;
        }
        long jA0L = J1.A0L(attributeValue);
        String value = A03[1];
        if (value.charAt(6) == 'U') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "HQVmgbyrJUxkUX8qS7NrtU2O4wmu9TG";
        strArr[3] = "HQVmgbyrJUxkUX8qS7NrtU2O4wmu9TG";
        return jA0L;
    }

    public static long A0C(XmlPullParser xmlPullParser, String str, long j2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j2 : Long.parseLong(attributeValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.util.Pair<java.lang.String, com.facebook.ads.internal.exoplayer2.drm.DrmInitData.SchemeData> A0D(org.xmlpull.v1.XmlPullParser r17) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1258aj.A0D(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    private final Pair<GM, Long> A0E(XmlPullParser xmlPullParser, String str, long j2) throws XmlPullParserException, IOException {
        String strA0l = str;
        String attributeValue = xmlPullParser.getAttributeValue(null, A0h(933, 2, 89));
        String id = A0h(1235, 5, 61);
        long jA0B = A0B(xmlPullParser, id, j2);
        String id2 = A0h(885, 8, 0);
        long jA0B2 = A0B(xmlPullParser, id2, -9223372036854775807L);
        GS gsA0a = null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        do {
            xmlPullParser.next();
            String strA0h = A0h(136, 7, 62);
            if (A03[1].charAt(6) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[2] = "r";
            strArr[4] = "ExeS163s0TPYAZYq";
            if (J2.A06(xmlPullParser, strA0h)) {
                if (!z) {
                    strA0l = A0l(xmlPullParser, strA0l);
                    z = true;
                }
            } else if (J2.A06(xmlPullParser, A0h(98, 13, 107))) {
                arrayList.add(A0J(xmlPullParser, strA0l, gsA0a));
            } else if (J2.A06(xmlPullParser, A0h(238, 11, 29))) {
                arrayList2.add(A0Q(xmlPullParser));
            } else if (J2.A06(xmlPullParser, A0h(344, 11, 121))) {
                gsA0a = A0d(xmlPullParser, null);
            } else if (J2.A06(xmlPullParser, A0h(355, 11, 94))) {
                gsA0a = A0Y(xmlPullParser, null);
            } else if (J2.A06(xmlPullParser, A0h(366, 15, 3))) {
                gsA0a = A0a(xmlPullParser, null);
            }
        } while (!J2.A05(xmlPullParser, A0h(319, 6, 112)));
        return Pair.create(A0R(attributeValue, jA0B, arrayList, arrayList2), Long.valueOf(jA0B2));
    }

    private final Format A0F(String str, String str2, int i2, int i3, float f2, int i4, int i5, int accessibilityChannel, String str3, int i6, List<GK> list, String sampleMimeType, List<GK> list2) {
        int iA04;
        String strA0j = A0j(str2, sampleMimeType);
        if (strA0j != null) {
            if (A0h(773, 10, 46).equals(strA0j)) {
                strA0j = A0k(list2);
            }
            if (C0761Ie.A0E(strA0j)) {
                return Format.A0C(str, str2, strA0j, sampleMimeType, accessibilityChannel, i2, i3, f2, null, i6);
            }
            if (C0761Ie.A0C(strA0j)) {
                return Format.A0D(str, str2, strA0j, sampleMimeType, accessibilityChannel, i4, i5, null, i6, str3);
            }
            if (A0r(strA0j)) {
                String strA0h = A0h(655, 19, 51);
                if (A03[3].length() != 31) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "uIL7Hz2343KhYB5HOMmFD9omiAt1joI";
                strArr[3] = "uIL7Hz2343KhYB5HOMmFD9omiAt1joI";
                if (strA0h.equals(strA0j)) {
                    iA04 = A03(list);
                } else if (A0h(674, 19, 36).equals(strA0j)) {
                    iA04 = A04(list);
                } else {
                    iA04 = -1;
                }
                return Format.A0F(str, str2, strA0j, sampleMimeType, accessibilityChannel, i6, str3, iA04);
            }
        }
        return Format.A0E(str, str2, strA0j, sampleMimeType, accessibilityChannel, i6, str3);
    }

    private final EventMessage A0G(String str, String str2, long j2, long j3, byte[] bArr, long j4) {
        return new EventMessage(str, str2, j3, j2, bArr, j4);
    }

    private final EventMessage A0H(XmlPullParser xmlPullParser, String str, String str2, long j2, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long id = A0C(xmlPullParser, A0h(933, 2, 89), 0L);
        long jA0C = A0C(xmlPullParser, A0h(885, 8, 0), -9223372036854775807L);
        long jA0C2 = A0C(xmlPullParser, A0h(1140, 16, 117), 0L);
        return A0G(str, str2, id, J1.A0G(jA0C, 1000L, j2), A0s(xmlPullParser, byteArrayOutputStream), J1.A0G(jA0C2, 1000000L, j2));
    }

    private final GI A0I(int i2, int i3, List<GP> list, List<GK> list2, List<GK> list3) {
        return new GI(i2, i3, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final GI A0J(XmlPullParser xmlPullParser, String str, GS gs) throws XmlPullParserException, IOException {
        String strA0l = str;
        GS gsA0a = gs;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int iA09 = A09(xmlPullParser2, A0h(933, 2, 89), -1);
        int iA07 = A07(xmlPullParser2);
        String codecs = xmlPullParser2.getAttributeValue(null, A0h(1084, 8, 69));
        String mimeType = A0h(856, 6, 13);
        String attributeValue = xmlPullParser2.getAttributeValue(null, mimeType);
        String mimeType2 = A0h(1725, 5, 121);
        int iA092 = A09(xmlPullParser2, mimeType2, -1);
        String mimeType3 = A0h(927, 6, 79);
        int iA093 = A09(xmlPullParser2, mimeType3, -1);
        float fA00 = A00(xmlPullParser2, -1.0f);
        int iA06 = -1;
        int iA094 = A09(xmlPullParser2, A0h(797, 17, 88), -1);
        String strA0h = A0h(1026, 4, 42);
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, strA0h);
        String baseUrl = null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int iA08 = 0;
        boolean z = false;
        while (true) {
            xmlPullParser2.next();
            if (J2.A06(xmlPullParser2, A0h(136, 7, 62))) {
                if (!z) {
                    strA0l = A0l(xmlPullParser2, strA0l);
                    z = true;
                } else {
                    String[] strArr = A03;
                    if (strArr[2].length() != strArr[4].length()) {
                        String[] strArr2 = A03;
                        strArr2[0] = "NUhbVBtB0EUVhvvvsMcOJ66SP1LfZLHd";
                        strArr2[0] = "NUhbVBtB0EUVhvvvsMcOJ66SP1LfZLHd";
                    }
                }
            } else if (J2.A06(xmlPullParser2, A0h(171, 17, 123))) {
                Pair<String, DrmInitData.SchemeData> pairA0D = A0D(xmlPullParser2);
                if (pairA0D.first != null) {
                    baseUrl = (String) pairA0D.first;
                }
                if (pairA0D.second != null) {
                    arrayList.add(pairA0D.second);
                }
            } else if (J2.A06(xmlPullParser2, A0h(155, 16, 28))) {
                attributeValue2 = A0i(attributeValue2, xmlPullParser2.getAttributeValue(null, strA0h));
                iA07 = A01(iA07, A07(xmlPullParser2));
            } else if (J2.A06(xmlPullParser2, A0h(339, 4, 90))) {
                iA08 |= A08(xmlPullParser2);
            } else if (J2.A06(xmlPullParser2, A0h(111, 25, 24))) {
                iA06 = A06(xmlPullParser2);
            } else {
                String strA0h2 = A0h(85, 13, 8);
                if (J2.A06(xmlPullParser2, strA0h2)) {
                    arrayList3.add(A0O(xmlPullParser2, strA0h2));
                } else {
                    String strA0h3 = A0h(439, 20, 84);
                    if (!J2.A06(xmlPullParser2, strA0h3)) {
                        if (A03[3].length() == 31) {
                            String[] strArr3 = A03;
                            strArr3[3] = "Oh4UdQnW2uXXSwGfizO0p1l6mbU3rWT";
                            strArr3[3] = "Oh4UdQnW2uXXSwGfizO0p1l6mbU3rWT";
                            if (!J2.A06(xmlPullParser2, A0h(325, 14, 124))) {
                                xmlPullParser2 = xmlPullParser2;
                                if (J2.A06(xmlPullParser2, A0h(344, 11, 121))) {
                                    gsA0a = A0d(xmlPullParser2, (C1262an) gsA0a);
                                } else if (J2.A06(xmlPullParser2, A0h(355, 11, 94))) {
                                    gsA0a = A0Y(xmlPullParser2, (BD) gsA0a);
                                } else if (J2.A06(xmlPullParser2, A0h(366, 15, 3))) {
                                    gsA0a = A0a(xmlPullParser2, (C0591Aw) gsA0a);
                                } else {
                                    String baseUrl2 = A0h(251, 17, 127);
                                    String[] strArr4 = A03;
                                    if (strArr4[2].length() == strArr4[4].length()) {
                                        break;
                                    }
                                    String[] strArr5 = A03;
                                    strArr5[3] = "TP4eHbiFjksHNmz1BWRqPEcOjmlo1Wp";
                                    strArr5[3] = "TP4eHbiFjksHNmz1BWRqPEcOjmlo1Wp";
                                    if (J2.A06(xmlPullParser2, baseUrl2)) {
                                        arrayList2.add(A0O(xmlPullParser2, baseUrl2));
                                    } else if (J2.A03(xmlPullParser2)) {
                                    }
                                }
                            } else {
                                GJ gjA0N = A0N(xmlPullParser2, strA0l, codecs, attributeValue, iA092, iA093, fA00, iA06, iA094, attributeValue2, iA08, arrayList3, gsA0a);
                                iA07 = A01(iA07, A02(gjA0N.A01));
                                arrayList5.add(gjA0N);
                                xmlPullParser2 = xmlPullParser2;
                            }
                        } else {
                            break;
                        }
                    } else {
                        arrayList4.add(A0O(xmlPullParser2, strA0h3));
                    }
                }
            }
            if (J2.A05(xmlPullParser2, A0h(98, 13, 107))) {
                int contentType = arrayList5.size();
                ArrayList arrayList6 = new ArrayList(contentType);
                int i2 = 0;
                while (true) {
                    int size = arrayList5.size();
                    if (A03[0].charAt(7) != 'B') {
                        break;
                    }
                    String[] strArr6 = A03;
                    strArr6[5] = "tkY0qfErHCpxHU4FMXUxAHAhuoWe64z3";
                    strArr6[7] = "n6YHsZRNN9GNUdvk073uuIImM353lxTZ";
                    if (i2 < size) {
                        arrayList6.add(A0W((GJ) arrayList5.get(i2), this.A00, baseUrl, arrayList, arrayList2));
                        i2++;
                    } else {
                        return A0I(iA09, iA07, arrayList6, arrayList3, arrayList4);
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    private final C1257ai A0K(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, GU gu, Uri uri, List<GM> list) {
        return new C1257ai(j2, j3, j4, z, j5, j6, j7, j8, gu, uri, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.I0
    /* JADX INFO: renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public final C1257ai ABZ(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.A01.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && A0h(290, 3, 64).equals(xmlPullParserNewPullParser.getName())) {
                return A0M(xmlPullParserNewPullParser, uri.toString());
            }
            throw new AI(A0h(959, 67, 43));
        } catch (XmlPullParserException e2) {
            throw new AI(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0165, code lost:
    
        if (com.facebook.ads.redexgen.X.J2.A06(r36, A0h(319, 6, 112)) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0167, code lost:
    
        if (r16 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0169, code lost:
    
        r6 = A0E(r36, r8, r0);
        r3 = (com.facebook.ads.redexgen.X.GM) r6.first;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017b, code lost:
    
        if (r3.A00 != (-9223372036854775807L)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017d, code lost:
    
        if (r23 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017f, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0199, code lost:
    
        if (com.facebook.ads.redexgen.X.J2.A06(r36, A0h(319, 6, 31)) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x019c, code lost:
    
        r5 = com.facebook.ads.redexgen.X.C1258aj.A03;
        r4 = r5[5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ae, code lost:
    
        if (r4.charAt(28) == r5[7].charAt(28)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b0, code lost:
    
        r5 = com.facebook.ads.redexgen.X.C1258aj.A03;
        r5[2] = "k";
        r5[4] = "GeLVGEUPchXWH5z4";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01be, code lost:
    
        r6 = ((java.lang.Long) r6.second).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01cd, code lost:
    
        if (r6 != (-9223372036854775807L)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01cf, code lost:
    
        r0 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d4, code lost:
    
        r9.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d9, code lost:
    
        r0 = r3.A00 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0233, code lost:
    
        throw new com.facebook.ads.redexgen.X.AI(A0h(516, 36, 61) + r9.size());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.C1257ai A0M(org.xmlpull.v1.XmlPullParser r36, java.lang.String r37) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1258aj.A0M(org.xmlpull.v1.XmlPullParser, java.lang.String):com.facebook.ads.redexgen.X.ai");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0121 A[PHI: r12
  0x0121: PHI (r12v3 com.facebook.ads.internal.exoplayer2.Format) = (r12v2 com.facebook.ads.internal.exoplayer2.Format), (r12v5 com.facebook.ads.internal.exoplayer2.Format) binds: [B:20:0x011e, B:16:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.GJ A0N(org.xmlpull.v1.XmlPullParser r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, int r32, float r33, int r34, int r35, java.lang.String r36, int r37, java.util.List<com.facebook.ads.redexgen.X.GK> r38, com.facebook.ads.redexgen.X.GS r39) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1258aj.A0N(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, int, java.util.List, com.facebook.ads.redexgen.X.GS):com.facebook.ads.redexgen.X.GJ");
    }

    public static GK A0O(XmlPullParser xmlPullParser, String id) throws XmlPullParserException, IOException {
        String strA0m = A0m(xmlPullParser, A0h(1215, 11, 74), A0h(0, 0, 62));
        String strA0m2 = A0m(xmlPullParser, A0h(1690, 5, 126), null);
        String strA0m3 = A0m(xmlPullParser, A0h(933, 2, 89), null);
        do {
            xmlPullParser.next();
        } while (!J2.A05(xmlPullParser, id));
        return new GK(strA0m, strA0m2, strA0m3);
    }

    private final GL A0P(String str, String str2, long j2, long[] jArr, EventMessage[] eventMessageArr) {
        return new GL(str, str2, j2, jArr, eventMessageArr);
    }

    private final GL A0Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strA0h = A0h(0, 0, 62);
        String strA0m = A0m(xmlPullParser, A0h(1215, 11, 74), strA0h);
        String schemeIdUri = A0h(1690, 5, 126);
        String value = A0m(xmlPullParser, schemeIdUri, strA0h);
        long jA0C = A0C(xmlPullParser, A0h(1420, 9, 14), 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        do {
            xmlPullParser.next();
            String[] strArr = A03;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "gSvZZuGUbZMRQ9N3VyTQ1DOpmqBA2Sje";
            strArr2[7] = "1kQLpTrvfGj6Xu06grpBcUVv32549uDB";
            if (J2.A06(xmlPullParser, A0h(233, 5, 64))) {
                arrayList.add(A0H(xmlPullParser, strA0m, value, jA0C, byteArrayOutputStream));
            }
        } while (!J2.A05(xmlPullParser, A0h(238, 11, 29)));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            EventMessage event = (EventMessage) arrayList.get(i2);
            jArr[i2] = event.A03;
            eventMessageArr[i2] = event;
        }
        return A0P(strA0m, value, jA0C, jArr, eventMessageArr);
    }

    private final GM A0R(String str, long j2, List<GI> list, List<GL> list2) {
        return new GM(str, j2, list, list2);
    }

    private final GN A0S(String str, long j2, long j3) {
        return new GN(str, j2, j3);
    }

    private final GN A0T(XmlPullParser xmlPullParser) {
        return A0V(xmlPullParser, A0h(1226, 9, 46), A0h(1194, 5, 60));
    }

    private final GN A0U(XmlPullParser xmlPullParser) {
        return A0V(xmlPullParser, A0h(1044, 5, 77), A0h(1074, 10, 47));
    }

    private final GN A0V(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        long j2 = 0;
        long rangeStart = -1;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split(A0h(44, 1, 54));
            j2 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                rangeStart = (Long.parseLong(strArrSplit[1]) - j2) + 1;
            }
        }
        return A0S(attributeValue, j2, rangeStart);
    }

    private final GP A0W(GJ gj, String drmSchemeType, String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<GK> arrayList2) {
        Format formatA0O = gj.A01;
        if (gj.A04 != null) {
            str = gj.A04;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = gj.A05;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            A0q(arrayList3);
            formatA0O = formatA0O.A0O(new DrmInitData(str, arrayList3));
        }
        ArrayList<GK> arrayList4 = gj.A06;
        arrayList4.addAll(arrayList2);
        return GP.A00(drmSchemeType, gj.A00, formatA0O, gj.A03, gj.A02, arrayList4);
    }

    private final BD A0X(GN gn, long j2, long j3, long j4, long j5, List<GR> list, List<GN> list2) {
        return new BD(gn, j2, j3, j4, j5, list, list2);
    }

    private final BD A0Y(XmlPullParser xmlPullParser, BD bd) throws XmlPullParserException, IOException {
        List<GR> listA0n;
        List<GN> arrayList;
        long j2 = bd != null ? ((GS) bd).A01 : 1L;
        if (A03[3].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[0] = "ydT33MhBb9ewYlivZAKgOjlJbCUXFoeo";
        strArr[0] = "ydT33MhBb9ewYlivZAKgOjlJbCUXFoeo";
        long jA0C = A0C(xmlPullParser, A0h(1420, 9, 14), j2);
        long jA0C2 = A0C(xmlPullParser, A0h(1156, 22, 46), bd != null ? ((GS) bd).A00 : 0L);
        long presentationTimeOffset = bd != null ? ((AbstractC1261am) bd).A00 : -9223372036854775807L;
        long jA0C3 = A0C(xmlPullParser, A0h(885, 8, 0), presentationTimeOffset);
        long jA0C4 = A0C(xmlPullParser, A0h(1240, 11, 9), bd != null ? ((AbstractC1261am) bd).A01 : 1L);
        GN gnA0T = null;
        if (A03[3].length() != 31) {
            String[] strArr2 = A03;
            strArr2[6] = "5RzWlJMlfTYPyAYdJv8AV";
            strArr2[6] = "5RzWlJMlfTYPyAYdJv8AV";
            listA0n = null;
            arrayList = null;
        } else {
            String[] strArr3 = A03;
            strArr3[2] = "z";
            strArr3[4] = "PYQFWWxArJEHeQg0";
            listA0n = null;
            arrayList = null;
        }
        do {
            xmlPullParser.next();
            if (J2.A06(xmlPullParser, A0h(268, 14, 56))) {
                gnA0T = A0T(xmlPullParser);
            } else if (J2.A06(xmlPullParser, A0h(381, 15, 10))) {
                listA0n = A0n(xmlPullParser);
            } else if (J2.A06(xmlPullParser, A0h(396, 10, 107))) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(A0U(xmlPullParser));
            }
        } while (!J2.A05(xmlPullParser, A0h(355, 11, 94)));
        if (bd != null) {
            if (gnA0T == null) {
                gnA0T = ((GS) bd).A02;
            }
            if (listA0n == null) {
                listA0n = ((AbstractC1261am) bd).A02;
            }
            if (arrayList == null) {
                arrayList = bd.A00;
            }
        }
        return A0X(gnA0T, jA0C, jA0C2, jA0C4, jA0C3, listA0n, arrayList);
    }

    private final C0591Aw A0Z(GN gn, long j2, long j3, long j4, long j5, List<GR> list, GT gt, GT gt2) {
        return new C0591Aw(gn, j2, j3, j4, j5, list, gt, gt2);
    }

    private final C0591Aw A0a(XmlPullParser xmlPullParser, C0591Aw c0591Aw) throws XmlPullParserException, IOException {
        long jA0C = A0C(xmlPullParser, A0h(1420, 9, 14), c0591Aw != null ? ((GS) c0591Aw).A01 : 1L);
        long timescale = c0591Aw != null ? ((GS) c0591Aw).A00 : 0L;
        long startNumber = A0C(xmlPullParser, A0h(1156, 22, 46), timescale);
        if (A03[3].length() == 31) {
            String[] strArr = A03;
            strArr[2] = "3";
            strArr[4] = "ZqbuNNwjAPHL3cdO";
            long timescale2 = c0591Aw != null ? ((AbstractC1261am) c0591Aw).A00 : -9223372036854775807L;
            long jA0C2 = A0C(xmlPullParser, A0h(885, 8, 0), timescale2);
            long jA0C3 = A0C(xmlPullParser, A0h(1240, 11, 9), c0591Aw != null ? ((AbstractC1261am) c0591Aw).A01 : 1L);
            GT gtA0e = A0e(xmlPullParser, A0h(1044, 5, 77), c0591Aw != null ? c0591Aw.A01 : null);
            GT gtA0e2 = A0e(xmlPullParser, A0h(945, 14, 65), c0591Aw != null ? c0591Aw.A00 : null);
            if (A03[0].charAt(7) != 'B') {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[2] = "p";
            strArr2[4] = "ul6fsJ4NoE6BmrgR";
            GN gnA0T = null;
            List<GR> listA0n = null;
            do {
                xmlPullParser.next();
                if (J2.A06(xmlPullParser, A0h(268, 14, 56))) {
                    gnA0T = A0T(xmlPullParser);
                } else if (J2.A06(xmlPullParser, A0h(381, 15, 10))) {
                    listA0n = A0n(xmlPullParser);
                }
            } while (!J2.A05(xmlPullParser, A0h(366, 15, 3)));
            if (c0591Aw != null) {
                if (gnA0T == null) {
                    gnA0T = ((GS) c0591Aw).A02;
                }
                if (listA0n == null) {
                    listA0n = ((AbstractC1261am) c0591Aw).A02;
                }
                String[] strArr3 = A03;
                if (strArr3[2].length() != strArr3[4].length()) {
                    String[] strArr4 = A03;
                    strArr4[6] = "BFtwPk";
                    strArr4[6] = "BFtwPk";
                }
            }
            return A0Z(gnA0T, jA0C, startNumber, jA0C3, jA0C2, listA0n, gtA0e2, gtA0e);
        }
        throw new RuntimeException();
    }

    private final GR A0b(long j2, long j3) {
        return new GR(j2, j3);
    }

    private final C1262an A0c(GN gn, long j2, long j3, long j4, long j5) {
        return new C1262an(gn, j2, j3, j4, j5);
    }

    private final C1262an A0d(XmlPullParser xmlPullParser, C1262an c1262an) throws XmlPullParserException, IOException {
        long jA0C = A0C(xmlPullParser, A0h(1420, 9, 14), c1262an != null ? ((GS) c1262an).A01 : 1L);
        long j2 = c1262an != null ? ((GS) c1262an).A00 : 0L;
        String strA0h = A0h(1156, 22, 46);
        if (A03[0].charAt(7) != 'B') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[5] = "QQYWJjbkBOL0LNvUpzlisqGaFjDA4I4g";
        strArr[7] = "744UkrvlbMLGnb1Ym0KhEyQ5rxbR3wA6";
        long jA0C2 = A0C(xmlPullParser, strA0h, j2);
        long presentationTimeOffset = c1262an != null ? c1262an.A01 : 0L;
        long j3 = c1262an != null ? c1262an.A00 : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, A0h(935, 10, 76));
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split(A0h(44, 1, 54));
            presentationTimeOffset = Long.parseLong(strArrSplit[0]);
            j3 = (Long.parseLong(strArrSplit[1]) - presentationTimeOffset) + 1;
        }
        GN gnA0T = c1262an != null ? c1262an.A02 : null;
        do {
            xmlPullParser.next();
            if (J2.A06(xmlPullParser, A0h(268, 14, 56))) {
                gnA0T = A0T(xmlPullParser);
            }
        } while (!J2.A05(xmlPullParser, A0h(344, 11, 121)));
        return A0c(gnA0T, jA0C, jA0C2, presentationTimeOffset, j3);
    }

    private final GT A0e(XmlPullParser xmlPullParser, String str, GT gt) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return GT.A01(attributeValue);
        }
        return gt;
    }

    private final GU A0f(String str, String str2) {
        return new GU(str, str2);
    }

    private final GU A0g(XmlPullParser xmlPullParser) {
        return A0f(xmlPullParser.getAttributeValue(null, A0h(1215, 11, 74)), xmlPullParser.getAttributeValue(null, A0h(1690, 5, 126)));
    }

    public static String A0i(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        IM.A04(str.equals(str2));
        if (A03[3].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[2] = "q";
        strArr[4] = "wyuPM3f7B4fRmMnH";
        return str;
    }

    public static String A0j(String str, String str2) {
        if (C0761Ie.A0C(str)) {
            return C0761Ie.A05(str2);
        }
        if (C0761Ie.A0E(str)) {
            return C0761Ie.A07(str2);
        }
        if (A0r(str)) {
            return str;
        }
        if (A0h(693, 15, 118).equals(str)) {
            if (A0h(1251, 4, 51).equals(str2)) {
                return A0h(708, 20, 76);
            }
            if (A0h(1730, 4, 39).equals(str2)) {
                return A0h(728, 21, 58);
            }
        } else {
            if (A0h(749, 19, 18).equals(str) && str2 != null) {
                if (str2.contains(A0h(850, 6, 75))) {
                    return A0h(674, 19, 36);
                }
                if (str2.contains(A0h(904, 6, 21)) || str2.contains(A0h(844, 6, 76))) {
                    return A0h(655, 19, 51);
                }
            }
            return null;
        }
        return null;
    }

    public static String A0k(List<GK> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            GK gk = list.get(i2);
            String str = gk.A01;
            String schemeIdUri = A0h(1282, 58, 54);
            if (schemeIdUri.equals(str)) {
                String str2 = gk.A02;
                String schemeIdUri2 = A0h(900, 4, 90);
                if (schemeIdUri2.equals(str2)) {
                    String schemeIdUri3 = A0h(783, 14, 40);
                    return schemeIdUri3;
                }
            }
        }
        return A0h(773, 10, 46);
    }

    public static String A0l(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        xmlPullParser.next();
        return C0782Iz.A02(str, xmlPullParser.getText());
    }

    public static String A0m(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private final List<GR> A0n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long duration = 0;
        do {
            xmlPullParser.next();
            if (A03[0].charAt(7) == 'B') {
                String[] strArr = A03;
                strArr[6] = "dp";
                strArr[6] = "dp";
                if (J2.A06(xmlPullParser, A0h(343, 1, 111))) {
                    duration = A0C(xmlPullParser, A0h(1281, 1, 76), duration);
                    long jA0C = A0C(xmlPullParser, A0h(873, 1, 116), -9223372036854775807L);
                    int iA09 = A09(xmlPullParser, A0h(1193, 1, 124), 0) + 1;
                    for (int i2 = 0; i2 < iA09; i2++) {
                        arrayList.add(A0b(duration, jA0C));
                        duration += jA0C;
                        int count = A03[6].length();
                        if (count != 12) {
                            String[] strArr2 = A03;
                            strArr2[0] = "eklzgZqBnYdG5PkvqEOXEdYaA9LK3zEE";
                            strArr2[0] = "eklzgZqBnYdG5PkvqEOXEdYaA9LK3zEE";
                        }
                    }
                }
            }
            throw new RuntimeException();
        } while (!J2.A05(xmlPullParser, A0h(381, 15, 10)));
        return arrayList;
    }

    public static void A0q(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int j2 = arrayList.size() - 1; j2 >= 0; j2--) {
            DrmInitData.SchemeData schemeData = arrayList.get(j2);
            if (!schemeData.A02()) {
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList.size()) {
                        DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
                        if (schemeData2.A03(schemeData)) {
                            arrayList.remove(j2);
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public static boolean A0r(String str) {
        if (!C0761Ie.A0D(str) && !A0h(708, 20, 76).equals(str) && !A0h(728, 21, 58).equals(str)) {
            boolean zEquals = A0h(674, 19, 36).equals(str);
            if (A03[1].charAt(6) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "LoT7hgJDsiOIiBRZdxaGjarYoXkmB79z";
            strArr[1] = "LoT7hgJDsiOIiBRZdxaGjarYoXkmB79z";
            if (!zEquals && !A0h(655, 19, 51).equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final byte[] A0s(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, null);
        xmlPullParser.nextToken();
        while (!J2.A05(xmlPullParser, A0h(233, 5, 64))) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, false);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeValue(i2));
                    }
                    break;
                case 3:
                    String namespace = xmlPullParser.getNamespace();
                    String name = xmlPullParser.getName();
                    if (A03[3].length() != 31) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[3] = "YIsJIkr93jZi3uRJQd8vYJxOjdZrw7L";
                    strArr[3] = "YIsJIkr93jZi3uRJQd8vYJxOjdZrw7L";
                    xmlSerializerNewSerializer.endTag(namespace, name);
                    break;
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    String text = xmlPullParser.getText();
                    if (A03[0].charAt(7) != 'B') {
                        String[] strArr2 = A03;
                        strArr2[2] = "C";
                        strArr2[4] = "ac3iHrTzEwyyc8YC";
                        xmlSerializerNewSerializer.cdsect(text);
                    } else {
                        String[] strArr3 = A03;
                        strArr3[2] = "a";
                        strArr3[4] = "VNFELN4aICmYgSrM";
                        xmlSerializerNewSerializer.cdsect(text);
                    }
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    String text2 = xmlPullParser.getText();
                    String[] strArr4 = A03;
                    if (strArr4[2].length() == strArr4[4].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A03;
                    strArr5[2] = "H";
                    strArr5[4] = "vibQP7TlwWqxC4xG";
                    xmlSerializerNewSerializer.docdecl(text2);
                    break;
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }
}
