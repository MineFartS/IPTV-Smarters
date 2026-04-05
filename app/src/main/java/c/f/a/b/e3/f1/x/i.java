package c.f.a.b.e3.f1.x;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import c.f.a.b.e3.f1.x.f;
import c.f.a.b.e3.f1.x.g;
import c.f.a.b.i3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.w0;
import c.f.a.b.w1;
import c.f.a.b.x2.w;
import c.f.a.b.z2.j0.l;
import com.amazonaws.event.ProgressEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements i0.a<h> {
    public final f g0;
    public final g h0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7453b = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f7454c = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f7455d = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f7456e = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f7457f = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f7458g = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f7459h = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f7460i = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f7461j = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f7462k = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f7463l = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f7464m = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f7465n = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f7466o = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern p = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern q = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern r = c("CAN-SKIP-DATERANGES");
    public static final Pattern s = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern t = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern u = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern v = c("CAN-BLOCK-RELOAD");
    public static final Pattern w = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern x = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern y = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern z = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern A = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern B = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern D = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern E = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern G = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern H = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern I = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern L = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern M = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern N = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern O = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern P = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern Q = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern R = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern S = c("AUTOSELECT");
    public static final Pattern T = c("DEFAULT");
    public static final Pattern U = c("FORCED");
    public static final Pattern V = c("INDEPENDENT");
    public static final Pattern W = c("GAP");
    public static final Pattern X = c("PRECISE");
    public static final Pattern Y = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern Z = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern f0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class a extends IOException {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BufferedReader f7467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Queue<String> f7468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f7469c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f7468b = queue;
            this.f7467a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean a() throws IOException {
            String strTrim;
            if (this.f7469c != null) {
                return true;
            }
            if (!this.f7468b.isEmpty()) {
                this.f7469c = (String) c.f.a.b.j3.g.e(this.f7468b.poll());
                return true;
            }
            do {
                String line = this.f7467a.readLine();
                this.f7469c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f7469c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f7469c;
            this.f7469c = null;
            return str;
        }
    }

    public i() {
        this(f.f7394d, null);
    }

    public i(f fVar, g gVar) {
        this.g0 = fVar;
        this.h0 = gVar;
    }

    public static String A(String str, Map<String, String> map) {
        Matcher matcher = f0.matcher(str);
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

    public static int B(BufferedReader bufferedReader, boolean z2, int i2) throws IOException {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !x0.s0(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    public static boolean b(BufferedReader bufferedReader) throws IOException {
        int i2 = bufferedReader.read();
        if (i2 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i2 = bufferedReader.read();
        }
        int iB = B(bufferedReader, true, i2);
        for (int i3 = 0; i3 < 7; i3++) {
            if (iB != "#EXTM3U".charAt(i3)) {
                return false;
            }
            iB = bufferedReader.read();
        }
        return x0.s0(B(bufferedReader, false, iB));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    public static w d(String str, w.b[] bVarArr) {
        w.b[] bVarArr2 = new w.b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            bVarArr2[i2] = bVarArr[i2].c(null);
        }
        return new w(str, bVarArr2);
    }

    public static String e(long j2, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j2);
    }

    public static f.b f(ArrayList<f.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            f.b bVar = arrayList.get(i2);
            if (str.equals(bVar.f7412d)) {
                return bVar;
            }
        }
        return null;
    }

    public static f.b g(ArrayList<f.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            f.b bVar = arrayList.get(i2);
            if (str.equals(bVar.f7413e)) {
                return bVar;
            }
        }
        return null;
    }

    public static f.b h(ArrayList<f.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            f.b bVar = arrayList.get(i2);
            if (str.equals(bVar.f7411c)) {
                return bVar;
            }
        }
        return null;
    }

    public static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    public static w.b k(String str, String str2, Map<String, String> map) throws w1 {
        String strU = u(str, I, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strZ = z(str, J, map);
            return new w.b(w0.f10307d, "video/mp4", Base64.decode(strZ.substring(strZ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new w.b(w0.f10307d, "hls", x0.k0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strU)) {
            return null;
        }
        String strZ2 = z(str, J, map);
        byte[] bArrDecode = Base64.decode(strZ2.substring(strZ2.indexOf(44)), 0);
        UUID uuid = w0.f10308e;
        return new w.b(uuid, "video/mp4", l.a(uuid, bArrDecode));
    }

    public static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    public static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.e3.f1.x.f o(c.f.a.b.e3.f1.x.i.b r36, java.lang.String r37) throws c.f.a.b.w1 {
        /*
            Method dump skipped, instruction units count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.f1.x.i.o(c.f.a.b.e3.f1.x.i$b, java.lang.String):c.f.a.b.e3.f1.x.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0317 A[PHI: r79
  0x0317: PHI (r79v25 java.lang.String) = (r79v23 java.lang.String), (r79v1 java.lang.String) binds: [B:121:0x032b, B:113:0x030e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.e3.f1.x.g p(c.f.a.b.e3.f1.x.f r93, c.f.a.b.e3.f1.x.g r94, c.f.a.b.e3.f1.x.i.b r95, java.lang.String r96) throws c.f.a.b.w1, c.f.a.b.e3.f1.x.i.a {
        /*
            Method dump skipped, instruction units count: 1829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.f1.x.i.p(c.f.a.b.e3.f1.x.f, c.f.a.b.e3.f1.x.g, c.f.a.b.e3.f1.x.i$b, java.lang.String):c.f.a.b.e3.f1.x.g");
    }

    public static boolean q(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z2;
    }

    public static double r(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) c.f.a.b.j3.g.e(matcher.group(1))) : d2;
    }

    public static int s(String str, Pattern pattern, int i2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) c.f.a.b.j3.g.e(matcher.group(1))) : i2;
    }

    public static long t(String str, Pattern pattern, long j2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) c.f.a.b.j3.g.e(matcher.group(1))) : j2;
    }

    public static String u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) c.f.a.b.j3.g.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : A(str2, map);
    }

    public static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, null, map);
    }

    public static int w(String str, Map<String, String> map) {
        String strV = v(str, Q, map);
        if (TextUtils.isEmpty(strV)) {
            return 0;
        }
        String[] strArrU0 = x0.U0(strV, ",");
        int i2 = x0.t(strArrU0, "public.accessibility.describes-video") ? IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED : 0;
        if (x0.t(strArrU0, "public.accessibility.transcribes-spoken-dialog")) {
            i2 |= ProgressEvent.PART_FAILED_EVENT_CODE;
        }
        if (x0.t(strArrU0, "public.accessibility.describes-music-and-sound")) {
            i2 |= 1024;
        }
        return x0.t(strArrU0, "public.easy-to-read") ? i2 | 8192 : i2;
    }

    public static int x(String str) {
        int i2 = q(str, T, false) ? 1 : 0;
        if (q(str, U, false)) {
            i2 |= 2;
        }
        return q(str, S, false) ? i2 | 4 : i2;
    }

    public static g.f y(String str) {
        double dR = r(str, q, -9.223372036854776E18d);
        long j2 = dR == -9.223372036854776E18d ? -9223372036854775807L : (long) (dR * 1000000.0d);
        boolean zQ = q(str, r, false);
        double dR2 = r(str, t, -9.223372036854776E18d);
        long j3 = dR2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dR2 * 1000000.0d);
        double dR3 = r(str, u, -9.223372036854776E18d);
        return new g.f(j2, zQ, j3, dR3 != -9.223372036854776E18d ? (long) (dR3 * 1000000.0d) : -9223372036854775807L, q(str, v, false));
    }

    public static String z(String str, Pattern pattern, Map<String, String> map) throws w1 {
        String strV = v(str, pattern, map);
        if (strV != null) {
            return strV;
        }
        throw w1.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // c.f.a.b.i3.i0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public h a(Uri uri, InputStream inputStream) throws w1 {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw w1.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    x0.o(bufferedReader);
                    throw w1.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    } else {
                        arrayDeque.add(strTrim);
                        return o(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(strTrim);
            return p(this.g0, this.h0, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            x0.o(bufferedReader);
        }
    }
}
