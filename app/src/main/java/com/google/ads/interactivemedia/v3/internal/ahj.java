package com.google.ads.interactivemedia.v3.internal;

import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ahj implements akl<ahg> {
    private final agz aa;
    private final ahf ab;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f19723a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f19724b = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f19725c = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f19726d = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f19727e = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f19728f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f19729g = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f19730h = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f19731i = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f19732j = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f19733k = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f19734l = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f19735m = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f19736n = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f19737o = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern p = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern q = p("CAN-SKIP-DATERANGES");
    private static final Pattern r = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern s = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern t = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern u = p("CAN-BLOCK-RELOAD");
    private static final Pattern v = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern w = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern x = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern y = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern z = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern A = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern B = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern C = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern D = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern E = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern F = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern G = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern H = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern I = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern K = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern L = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern M = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern N = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern O = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern P = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern Q = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern R = p("AUTOSELECT");
    private static final Pattern S = p("DEFAULT");
    private static final Pattern T = p("FORCED");
    private static final Pattern U = p("INDEPENDENT");
    private static final Pattern V = p("GAP");
    private static final Pattern W = p("PRECISE");
    private static final Pattern X = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern Y = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern Z = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public ahj() {
        agz agzVar = agz.f19668a;
        throw null;
    }

    public ahj(agz agzVar, ahf ahfVar) {
        this.aa = agzVar;
        this.ab = ahfVar;
    }

    private static double b(String str, Pattern pattern) {
        return Double.parseDouble(n(str, pattern, Collections.emptyMap()));
    }

    private static int c(String str, Pattern pattern) {
        return Integer.parseInt(n(str, pattern, Collections.emptyMap()));
    }

    private static int d(String str, Pattern pattern, int i2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return i2;
        }
        String strGroup = matcher.group(1);
        ajr.b(strGroup);
        return Integer.parseInt(strGroup);
    }

    private static int e(BufferedReader bufferedReader, boolean z2, int i2) throws IOException {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !amn.S(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    private static long f(String str, Pattern pattern, long j2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return j2;
        }
        String strGroup = matcher.group(1);
        ajr.b(strGroup);
        return Long.parseLong(strGroup);
    }

    private static qf g(String str, String str2, Map<String, String> map) throws lb {
        String strM = m(str, H, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strN = n(str, I, map);
            return new qf(iw.f21998d, "video/mp4", Base64.decode(strN.substring(strN.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new qf(iw.f21998d, "hls", amn.W(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM)) {
            return null;
        }
        String strN2 = n(str, I, map);
        byte[] bArrDecode = Base64.decode(strN2.substring(strN2.indexOf(44)), 0);
        UUID uuid = iw.f21999e;
        return new qf(uuid, "video/mp4", us.b(uuid, bArrDecode));
    }

    private static qg h(String str, qf[] qfVarArr) {
        qf[] qfVarArr2 = new qf[qfVarArr.length];
        for (int i2 = 0; i2 < qfVarArr.length; i2++) {
            qfVarArr2[i2] = qfVarArr[i2].a(null);
        }
        return new qg(str, qfVarArr2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03a9  */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.ads.interactivemedia.v3.internal.agz i(com.google.ads.interactivemedia.v3.internal.ahi r36, java.lang.String r37) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 1416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ahj.i(com.google.ads.interactivemedia.v3.internal.ahi, java.lang.String):com.google.ads.interactivemedia.v3.internal.agz");
    }

    private static String j(long j2, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j2);
    }

    private static String k(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static String l(String str, Pattern pattern, Map<String, String> map) {
        return m(str, pattern, null, map);
    }

    private static String m(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            ajr.b(str2);
        }
        return (map.isEmpty() || str2 == null) ? str2 : o(str2, map);
    }

    private static String n(String str, Pattern pattern, Map<String, String> map) throws lb {
        String strL = l(str, pattern, map);
        if (strL != null) {
            return strL;
        }
        String strPattern = pattern.pattern();
        StringBuilder sb = new StringBuilder(String.valueOf(strPattern).length() + 19 + String.valueOf(str).length());
        sb.append("Couldn't match ");
        sb.append(strPattern);
        sb.append(" in ");
        sb.append(str);
        throw new lb(sb.toString());
    }

    private static String o(String str, Map<String, String> map) {
        Matcher matcher = Z.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static Pattern p(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append(str);
        sb.append("=(NO|YES)");
        return Pattern.compile(sb.toString());
    }

    private static boolean q(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    private static double r(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        ajr.b(strGroup);
        return Double.parseDouble(strGroup);
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.ads.interactivemedia.v3.internal.akl
    public final /* bridge */ /* synthetic */ com.google.ads.interactivemedia.v3.internal.ahg a(android.net.Uri r114, java.io.InputStream r115) {
        /*
            Method dump skipped, instruction units count: 2773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ahj.a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }
}
