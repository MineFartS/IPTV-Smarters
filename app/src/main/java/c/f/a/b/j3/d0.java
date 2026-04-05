package c.f.a.b.j3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f9157a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f9158b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f9160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9161c;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9163b;

        public b(int i2, int i3) {
            this.f9162a = i2;
            this.f9163b = i3;
        }
    }

    public static boolean a(String str, String str2) {
        b bVarI;
        int iD;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (bVarI = i(str2)) != null && (iD = c.f.a.b.t2.m.d(bVarI.f9163b)) != 0 && iD != 16) {
                }
                break;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x0.W0(str)) {
            String strG = g(str2);
            if (strG != null && p(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrW0 = x0.W0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrW0) {
            if (str2.equals(g(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String e(String str) {
        int size = f9157a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = f9157a.get(i2);
            if (str.startsWith(aVar.f9160b)) {
                return aVar.f9159a;
            }
        }
        return null;
    }

    public static int f(String str, String str2) {
        b bVarI;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarI = i(str2)) == null) {
                    return 0;
                }
                return c.f.a.b.t2.m.d(bVarI.f9163b);
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        b bVarI;
        String strH = null;
        if (str == null) {
            return null;
        }
        String strE = c.f.b.a.b.e(str.trim());
        if (strE.startsWith("avc1") || strE.startsWith("avc3")) {
            return "video/avc";
        }
        if (strE.startsWith("hev1") || strE.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strE.startsWith("dvav") || strE.startsWith("dva1") || strE.startsWith("dvhe") || strE.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strE.startsWith("av01")) {
            return "video/av01";
        }
        if (strE.startsWith("vp9") || strE.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strE.startsWith("vp8") || strE.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!strE.startsWith("mp4a")) {
            return strE.startsWith("mha1") ? "audio/mha1" : strE.startsWith("mhm1") ? "audio/mhm1" : (strE.startsWith("ac-3") || strE.startsWith("dac3")) ? "audio/ac3" : (strE.startsWith("ec-3") || strE.startsWith("dec3")) ? "audio/eac3" : strE.startsWith("ec+3") ? "audio/eac3-joc" : (strE.startsWith("ac-4") || strE.startsWith("dac4")) ? "audio/ac4" : strE.startsWith("dtsc") ? "audio/vnd.dts" : strE.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (strE.startsWith("dtsh") || strE.startsWith("dtsl")) ? "audio/vnd.dts.hd" : strE.startsWith("dtsx") ? "audio/vnd.dts.uhd" : strE.startsWith("opus") ? "audio/opus" : strE.startsWith("vorbis") ? "audio/vorbis" : strE.startsWith("flac") ? "audio/flac" : strE.startsWith("stpp") ? "application/ttml+xml" : strE.startsWith("wvtt") ? "text/vtt" : strE.contains("cea708") ? "application/cea-708" : (strE.contains("eia608") || strE.contains("cea608")) ? "application/cea-608" : e(strE);
        }
        if (strE.startsWith("mp4a.") && (bVarI = i(strE)) != null) {
            strH = h(bVarI.f9162a);
        }
        return strH == null ? "audio/mp4a-latm" : strH;
    }

    public static String h(int i2) {
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

    public static b i(String str) {
        Matcher matcher = f9158b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) g.e(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x0.W0(str)) {
            String strG = g(str2);
            if (strG != null && r(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static String k(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (p(str)) {
            return 1;
        }
        if (s(str)) {
            return 2;
        }
        if (r(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m(str);
    }

    public static int m(String str) {
        int size = f9157a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = f9157a.get(i2);
            if (str.equals(aVar.f9159a)) {
                return aVar.f9161c;
            }
        }
        return -1;
    }

    public static int n(String str) {
        return l(g(str));
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x0.W0(str)) {
            String strG = g(str2);
            if (strG != null && s(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static boolean p(String str) {
        return "audio".equals(k(str));
    }

    public static boolean q(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean r(String str) {
        return "text".equals(k(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean s(String str) {
        return "video".equals(k(str));
    }

    public static String t(String str) {
        str.hashCode();
        switch (str) {
            case "audio/x-flac":
                return "audio/flac";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
