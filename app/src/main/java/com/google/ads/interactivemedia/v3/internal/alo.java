package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class alo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList<alm> f20051a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f20052b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m(str)) {
            return 1;
        }
        if (p(str)) {
            return 2;
        }
        if (o(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f20051a.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = f20051a.get(i2).f20046a;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static int b(String str) {
        return a(f(str));
    }

    public static aln c(String str) {
        Matcher matcher = f20052b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        ajr.b(strGroup);
        String strGroup2 = matcher.group(2);
        try {
            return new aln(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : amn.af(str)) {
            String strF = f(str2);
            if (strF != null && m(strF)) {
                return strF;
            }
        }
        return null;
    }

    public static String e(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrAf = amn.af(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrAf) {
                if (str2.equals(f(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static String f(String str) {
        aln alnVarC;
        String strG = null;
        if (str == null) {
            return null;
        }
        String strB = arq.b(str.trim());
        if (strB.startsWith("avc1") || strB.startsWith("avc3")) {
            return "video/avc";
        }
        if (strB.startsWith("hev1") || strB.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strB.startsWith("dvav") || strB.startsWith("dva1") || strB.startsWith("dvhe") || strB.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strB.startsWith("av01")) {
            return "video/av01";
        }
        if (strB.startsWith("vp9") || strB.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strB.startsWith("vp8") || strB.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strB.startsWith("mp4a")) {
            if (strB.startsWith("mp4a.") && (alnVarC = c(strB)) != null) {
                strG = g(alnVarC.f20049a);
            }
            return strG == null ? "audio/mp4a-latm" : strG;
        }
        if (strB.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strB.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strB.startsWith("ac-3") || strB.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strB.startsWith("ec-3") || strB.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strB.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strB.startsWith("ac-4") || strB.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strB.startsWith("dtsc") || strB.startsWith("dtse")) {
            return "audio/vnd.dts";
        }
        if (strB.startsWith("dtsh") || strB.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strB.startsWith("opus")) {
            return "audio/opus";
        }
        if (strB.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strB.startsWith("flac")) {
            return "audio/flac";
        }
        if (strB.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strB.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strB.contains("cea708")) {
            return "application/cea-708";
        }
        if (strB.contains("eia608") || strB.contains("cea608")) {
            return "application/cea-608";
        }
        int size = f20051a.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = f20051a.get(i2).f20047b;
            if (strB.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    public static String g(int i2) {
        if (i2 == 32) {
            return "video/mp4v-es";
        }
        if (i2 == 33) {
            return "video/avc";
        }
        if (i2 == 35) {
            return "video/hevc";
        }
        if (i2 == 64) {
            return "audio/mp4a-latm";
        }
        if (i2 == 163) {
            return "video/wvc1";
        }
        if (i2 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i2 == 165) {
            return "audio/ac3";
        }
        if (i2 == 166) {
            return "audio/eac3";
        }
        switch (i2) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i2) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : amn.af(str)) {
            String strF = f(str2);
            if (strF != null && o(strF)) {
                return strF;
            }
        }
        return null;
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : amn.af(str)) {
            String strF = f(str2);
            if (strF != null && p(strF)) {
                return strF;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String j(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1007807498(0xffffffffc3ee13f6, float:-476.15594)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = -586683234(0xffffffffdd07ec9e, float:-6.1214856E17)
            if (r0 == r1) goto L20
            r1 = 187090231(0xb26c537, float:3.2118805E-32)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L34
            r0 = 1
            goto L35
        L20:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L34
            r0 = 2
            goto L35
        L2a:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L34
            r0 = 0
            goto L35
        L34:
            r0 = -1
        L35:
            if (r0 == 0) goto L42
            if (r0 == r3) goto L3f
            if (r0 == r2) goto L3c
            return r4
        L3c:
            java.lang.String r4 = "audio/wav"
            return r4
        L3f:
            java.lang.String r4 = "audio/mpeg"
            return r4
        L42:
            java.lang.String r4 = "audio/flac"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.alo.j(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean k(java.lang.String r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.alo.k(java.lang.String, java.lang.String):boolean");
    }

    public static boolean l(String str, String str2) {
        return e(str, str2) != null;
    }

    public static boolean m(String str) {
        return "audio".equals(q(str));
    }

    public static boolean n(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean o(String str) {
        return "text".equals(q(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean p(String str) {
        return "video".equals(q(str));
    }

    private static String q(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
