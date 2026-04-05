package d.a.a.d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import d.a.a.d.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f30097b = {"config", "tls-server"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f30098c = {"tls-client", "allow-recursive-routing", "askpass", "auth-nocache", "up", "down", "route-up", "ipchange", "route-pre-down", "auth-user-pass-verify", "block-outside-dns", "client-cert-not-required", "dhcp-release", "dhcp-renew", "dh", "group", "ip-win32", "ifconfig-nowarn", "management-hold", "management", "management-client", "management-query-remote", "management-query-passwords", "management-query-proxy", "management-external-key", "management-forget-disconnect", "management-signal", "management-log-cache", "management-up-down", "management-client-user", "management-client-group", "pause-exit", "preresolve", "plugin", "machine-readable-output", "persist-key", "push", "register-dns", "route-delay", "route-gateway", "route-metric", "route-method", "status", "script-security", "show-net-up", "suppress-timestamps", "tap-sleep", "tmp-dir", "tun-ipv6", "topology", "user", "win-sys"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[][] f30099d = {new String[]{"setenv", "IV_GUI_VER"}, new String[]{"setenv", "IV_SSO"}, new String[]{"setenv", "IV_PLAT_VER"}, new String[]{"setenv", "IV_OPENVPN_GUI_VERSION"}, new String[]{"engine", "dynamic"}, new String[]{"setenv", "CLIENT_CERT"}, new String[]{"resolv-retry", "60"}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f30100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashSet<String> f30101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap<String, Vector<Vector<String>>> f30102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap<String, Vector<String>> f30103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f30104i;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public enum b {
        initial,
        readin_single_quote,
        reading_quoted,
        reading_unquoted,
        done
    }

    public c() {
        String[] strArr = {"local", "remote", "float", IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, "connect-retry", "connect-timeout", "connect-retry-max", "link-mtu", "tun-mtu", "tun-mtu-extra", "fragment", "mtu-disc", "local-port", "remote-port", "bind", "nobind", "proto", "http-proxy", "http-proxy-retry", "http-proxy-timeout", "http-proxy-option", "socks-proxy", "socks-proxy-retry", "http-proxy-user-pass", "explicit-exit-notify"};
        this.f30100e = strArr;
        this.f30101f = new HashSet<>(Arrays.asList(strArr));
        this.f30102g = new HashMap<>();
        this.f30103h = new HashMap<>();
    }

    public static void u(e eVar, String str) {
        String[] strArrSplit = d.a.a.a.m(str).split("\n");
        if (strArrSplit.length >= 2) {
            eVar.f30116m = strArrSplit[0];
            eVar.f30117n = strArrSplit[1];
            eVar.f30115l = true;
        }
    }

    public static void v(d.a.a.a aVar, String str) {
        String[] strArrSplit = d.a.a.a.m(str).split("\n");
        if (strArrSplit.length >= 2) {
            aVar.D = strArrSplit[0];
            aVar.C = strArrSplit[1];
        }
    }

    public final void a(String str, Vector<String> vector) {
        String strTrim = vector.get(0).trim();
        String strTrim2 = vector.get(1).trim();
        File file = new File(str);
        try {
            if (file.exists()) {
                strTrim.substring(1, strTrim.length() - 1);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String strSubstring = BuildConfig.FLAVOR;
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    strSubstring = (strSubstring + line) + "\n";
                }
                if (strSubstring.endsWith("\n")) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                }
                vector.clear();
                vector.add("ca");
                vector.add("[[NAME]]" + strTrim2 + "[[INLINE]]" + strSubstring);
            }
        } catch (Exception e2) {
            Log.d(BuildConfig.FLAVOR, BuildConfig.FLAVOR + e2);
        }
    }

    public final void b(d.a.a.a aVar) throws a {
        boolean z = false;
        for (String str : this.f30097b) {
            if (this.f30102g.containsKey(str)) {
                throw new a(String.format("Unsupported Option %s encountered in config file. Aborting", str));
            }
        }
        for (String str2 : this.f30098c) {
            this.f30102g.remove(str2);
        }
        Iterator<Vector<Vector<String>>> it = this.f30102g.values().iterator();
        while (it.hasNext()) {
            Iterator<Vector<String>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (!k(it2.next())) {
                    z = true;
                }
            }
        }
        if (z) {
            aVar.I = "# These options found in the config file do not map to config settings:\n" + aVar.I;
            Iterator<Vector<Vector<String>>> it3 = this.f30102g.values().iterator();
            while (it3.hasNext()) {
                aVar.I += j(it3.next());
            }
            aVar.H = true;
        }
    }

    public final void c(d.a.a.a aVar, Vector<Vector<String>> vector, boolean z) {
        boolean z2 = false;
        if (z) {
            boolean z3 = false;
            for (Vector<String> vector2 : vector) {
                for (int i2 = 1; i2 < vector2.size(); i2++) {
                    if (vector2.get(i2).equals("block-local")) {
                        aVar.X = false;
                    } else if (vector2.get(i2).equals("unblock-local")) {
                        aVar.X = true;
                    } else if (vector2.get(i2).equals("!ipv4")) {
                        z3 = true;
                    } else if (vector2.get(i2).equals("ipv6")) {
                        aVar.M = true;
                    }
                }
            }
            z2 = z3;
        }
        if (!z || z2) {
            return;
        }
        aVar.w = true;
    }

    public final void d(Vector<String> vector, BufferedReader bufferedReader) throws IOException, a {
        String strTrim = vector.get(0).trim();
        if (!strTrim.startsWith("<") || !strTrim.endsWith(">")) {
            return;
        }
        String strSubstring = strTrim.substring(1, strTrim.length() - 1);
        String str = String.format("</%s>", strSubstring);
        String strSubstring2 = "[[INLINE]]";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                throw new a(String.format("No endtag </%s> for starttag <%s> found", strSubstring, strSubstring));
            }
            if (line.trim().equals(str)) {
                if (strSubstring2.endsWith("\n")) {
                    strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1);
                }
                vector.clear();
                vector.add(strSubstring);
                vector.add(strSubstring2);
                return;
            }
            strSubstring2 = (strSubstring2 + line) + "\n";
        }
    }

    public final void e(Vector<String> vector, BufferedReader bufferedReader, String str, String str2) throws IOException, a {
        String strTrim = vector.get(0).trim();
        if (!strTrim.startsWith("<") || !strTrim.endsWith(">")) {
            if (strTrim.equals("ca")) {
                String strTrim2 = vector.get(1).trim();
                a(strTrim2 != null ? str.replaceAll(str2, strTrim2) : BuildConfig.FLAVOR, vector);
                return;
            }
            return;
        }
        String strSubstring = strTrim.substring(1, strTrim.length() - 1);
        String str3 = String.format("</%s>", strSubstring);
        String strSubstring2 = "[[INLINE]]";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                throw new a(String.format("No endtag </%s> for starttag <%s> found", strSubstring, strSubstring));
            }
            if (line.trim().equals(str3)) {
                if (strSubstring2.endsWith("\n")) {
                    strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1);
                }
                vector.clear();
                vector.add(strSubstring);
                vector.add(strSubstring2);
                return;
            }
            strSubstring2 = (strSubstring2 + line) + "\n";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x04a0 A[PHI: r13
  0x04a0: PHI (r13v9 int) = (r13v8 int), (r13v10 int) binds: [B:202:0x049e, B:199:0x049a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d.a.a.a f() throws d.a.a.d.c.a {
        /*
            Method dump skipped, instruction units count: 1919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.d.c.f():d.a.a.a");
    }

    public final void g(d.a.a.a aVar) {
        if (aVar.B.equals(aVar.s0)) {
            aVar.B = BuildConfig.FLAVOR;
        }
    }

    public final Vector<Vector<String>> h(String str, int i2, int i3) throws a {
        Vector<Vector<String>> vector = this.f30102g.get(str);
        if (vector == null) {
            return null;
        }
        for (Vector<String> vector2 : vector) {
            if (vector2.size() < i2 + 1 || vector2.size() > i3 + 1) {
                throw new a(String.format(Locale.getDefault(), "Option %s has %d parameters, expected between %d and %d", str, Integer.valueOf(vector2.size() - 1), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
        }
        this.f30102g.remove(str);
        return vector;
    }

    public final Vector<String> i(String str, int i2, int i3) throws a {
        Vector<Vector<String>> vectorH = h(str, i2, i3);
        if (vectorH == null) {
            return null;
        }
        return vectorH.lastElement();
    }

    public final String j(Vector<Vector<String>> vector) {
        String str = BuildConfig.FLAVOR;
        for (Vector<String> vector2 : vector) {
            if (!k(vector2)) {
                if (vector2.size() == 2 && "extra-certs".equals(vector2.get(0))) {
                    str = str + d.a.a.a.H(vector2.get(0), vector2.get(1));
                } else {
                    Iterator<String> it = vector2.iterator();
                    while (it.hasNext()) {
                        str = str + d.a.a.a.M(it.next()) + " ";
                    }
                    str = str + "\n";
                }
            }
        }
        return str;
    }

    public boolean k(Vector<String> vector) {
        for (String[] strArr : this.f30099d) {
            if (vector.size() >= strArr.length) {
                boolean z = true;
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (!strArr[i2].equals(vector.get(i2))) {
                        z = false;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean l(String str) throws a {
        if (str.equals("udp") || str.equals("udp4") || str.equals("udp6")) {
            return true;
        }
        if (str.equals("tcp-client") || str.equals("tcp") || str.equals("tcp4") || str.endsWith("tcp4-client") || str.equals("tcp6") || str.endsWith("tcp6-client")) {
            return false;
        }
        throw new a("Unsupported option to --proto " + str);
    }

    public final String m(String str, Vector<String> vector) {
        return Build.VERSION.SDK_INT > 26 ? d.a(str, vector) : TextUtils.join(str, vector);
    }

    public void n(Reader reader) throws IOException, a {
        HashMap map = new HashMap();
        map.put("server-poll-timeout", "timeout-connect");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i2 = 0;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                i2++;
                if (line == null) {
                    return;
                }
                if (i2 == 1) {
                    if (line.startsWith("PK\u0003\u0004") || line.startsWith("PK\u0007\u00008")) {
                        break;
                    } else if (line.startsWith("\ufeff")) {
                        line = line.substring(1);
                    }
                }
                if (line.startsWith("# OVPN_ACCESS_SERVER_")) {
                    Vector<String> vectorS = s(line);
                    this.f30103h.put(vectorS.get(0), vectorS);
                } else {
                    Vector<String> vectorR = r(line);
                    if (vectorR.size() != 0) {
                        if (vectorR.get(0).startsWith("--")) {
                            vectorR.set(0, vectorR.get(0).substring(2));
                        }
                        d(vectorR, bufferedReader);
                        String str = vectorR.get(0);
                        if (map.get(str) != null) {
                            str = (String) map.get(str);
                        }
                        if (!this.f30102g.containsKey(str)) {
                            this.f30102g.put(str, new Vector<>());
                        }
                        this.f30102g.get(str).add(vectorR);
                    }
                }
            } catch (OutOfMemoryError e2) {
                throw new a("File too large to parse: " + e2.getLocalizedMessage());
            }
        }
        throw new a("Input looks like a ZIP Archive. Import is only possible for OpenVPN config files (.ovpn/.conf)");
    }

    public void o(Reader reader, String str, String str2, Context context) throws IOException, a {
        this.f30096a = context;
        HashMap map = new HashMap();
        map.put("server-poll-timeout", "timeout-connect");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i2 = 0;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                i2++;
                if (line == null) {
                    return;
                }
                if (i2 == 1) {
                    if (line.startsWith("PK\u0003\u0004") || line.startsWith("PK\u0007\u00008")) {
                        break;
                    } else if (line.startsWith("\ufeff")) {
                        line = line.substring(1);
                    }
                }
                if (line.startsWith("# OVPN_ACCESS_SERVER_")) {
                    Vector<String> vectorS = s(line);
                    this.f30103h.put(vectorS.get(0), vectorS);
                } else {
                    Vector<String> vectorR = r(line);
                    if (vectorR.size() != 0) {
                        if (vectorR.get(0).startsWith("--")) {
                            vectorR.set(0, vectorR.get(0).substring(2));
                        }
                        e(vectorR, bufferedReader, str, str2);
                        String str3 = vectorR.get(0);
                        if (map.get(str3) != null) {
                            str3 = (String) map.get(str3);
                        }
                        if (!this.f30102g.containsKey(str3)) {
                            this.f30102g.put(str3, new Vector<>());
                        }
                        this.f30102g.get(str3).add(vectorR);
                    }
                }
            } catch (OutOfMemoryError e2) {
                throw new a("File too large to parse: " + e2.getLocalizedMessage());
            }
        }
        throw new a("Input looks like a ZIP Archive. Import is only possible for OpenVPN config files (.ovpn/.conf)");
    }

    public final a.i.q.e<e, e[]> p(String str, e eVar) throws IOException, a {
        c cVar = new c();
        cVar.n(new StringReader(str.substring(10)));
        return cVar.q(eVar);
    }

    public final a.i.q.e<e, e[]> q(e eVar) throws a {
        e eVarClone;
        if (eVar != null) {
            try {
                eVarClone = eVar.clone();
            } catch (CloneNotSupportedException e2) {
                e2.printStackTrace();
                return null;
            }
        } else {
            eVarClone = new e();
        }
        Vector<String> vectorI = i(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, 1, 1);
        if (vectorI != null) {
            eVarClone.f30106c = vectorI.get(1);
        }
        Vector<String> vectorI2 = i("rport", 1, 1);
        if (vectorI2 != null) {
            eVarClone.f30106c = vectorI2.get(1);
        }
        Vector<String> vectorI3 = i("proto", 1, 1);
        if (vectorI3 != null) {
            eVarClone.f30107d = l(vectorI3.get(1));
        }
        Vector<String> vectorI4 = i("connect-timeout", 1, 1);
        int i2 = 0;
        if (vectorI4 != null) {
            try {
                eVarClone.f30111h = Integer.parseInt(vectorI4.get(1));
            } catch (NumberFormatException e3) {
                throw new a(String.format("Argument to connect-timeout (%s) must to be an integer: %s", vectorI4.get(1), e3.getLocalizedMessage()));
            }
        }
        Vector<String> vectorI5 = i("socks-proxy", 1, 2);
        if (vectorI5 == null) {
            vectorI5 = i("http-proxy", 2, 2);
        }
        if (vectorI5 != null) {
            if (vectorI5.get(0).equals("socks-proxy")) {
                eVarClone.f30112i = e.a.SOCKS5;
                eVarClone.f30114k = "1080";
            } else {
                eVarClone.f30112i = e.a.HTTP;
            }
            eVarClone.f30113j = vectorI5.get(1);
            if (vectorI5.size() >= 3) {
                eVarClone.f30114k = vectorI5.get(2);
            }
        }
        Vector<String> vectorI6 = i("http-proxy-user-pass", 1, 1);
        if (vectorI6 != null) {
            u(eVarClone, vectorI6.get(1));
        }
        Vector<Vector<String>> vectorH = h("remote", 1, 3);
        Vector vector = new Vector();
        for (Map.Entry<String, Vector<Vector<String>>> entry : this.f30102g.entrySet()) {
            if (eVar != null || this.f30101f.contains(entry.getKey())) {
                eVarClone.f30108e += j(entry.getValue());
                vector.add(entry.getKey());
            }
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            this.f30102g.remove((String) it.next());
        }
        String str = eVarClone.f30108e;
        if (str != null && !BuildConfig.FLAVOR.equals(str.trim())) {
            eVarClone.f30109f = true;
        }
        if (vectorH == null) {
            vectorH = new Vector<>();
        }
        e[] eVarArr = new e[vectorH.size()];
        for (Vector<String> vector2 : vectorH) {
            try {
                eVarArr[i2] = eVarClone.clone();
            } catch (CloneNotSupportedException e4) {
                e4.printStackTrace();
            }
            int size = vector2.size();
            if (size == 2) {
                eVarArr[i2].f30105b = vector2.get(1);
            } else {
                if (size != 3) {
                    if (size == 4) {
                        eVarArr[i2].f30107d = l(vector2.get(3));
                    }
                }
                eVarArr[i2].f30106c = vector2.get(2);
                eVarArr[i2].f30105b = vector2.get(1);
            }
            i2++;
        }
        return a.i.q.e.a(eVarClone, eVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[PHI: r1
  0x0076: PHI (r1v7 d.a.a.d.c$b) = (r1v2 d.a.a.d.c$b), (r1v2 d.a.a.d.c$b), (r1v2 d.a.a.d.c$b), (r1v2 d.a.a.d.c$b), (r1v2 d.a.a.d.c$b), (r1v10 d.a.a.d.c$b) binds: [B:45:0x0073, B:40:0x006a, B:41:0x006c, B:34:0x005b, B:36:0x0061, B:31:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Vector<java.lang.String> r(java.lang.String r15) throws d.a.a.d.c.a {
        /*
            r14 = this;
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            int r1 = r15.length()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            d.a.a.d.c$b r1 = d.a.a.d.c.b.initial
            java.lang.String r2 = ""
            r3 = 0
            r7 = r2
            r4 = 0
            r5 = 0
            r6 = 0
        L15:
            int r8 = r15.length()
            if (r4 >= r8) goto L20
            char r8 = r15.charAt(r4)
            goto L21
        L20:
            r8 = 0
        L21:
            r9 = 92
            if (r5 != 0) goto L2e
            if (r8 != r9) goto L2e
            d.a.a.d.c$b r10 = d.a.a.d.c.b.readin_single_quote
            if (r1 == r10) goto L2e
            r5 = 1
            goto L9b
        L2e:
            d.a.a.d.c$b r10 = d.a.a.d.c.b.initial
            r11 = 39
            r12 = 34
            if (r1 != r10) goto L57
            boolean r13 = r14.t(r8)
            if (r13 != 0) goto L77
            r1 = 59
            if (r8 == r1) goto Lb4
            r1 = 35
            if (r8 != r1) goto L46
            goto Lb4
        L46:
            if (r5 != 0) goto L4d
            if (r8 != r12) goto L4d
            d.a.a.d.c$b r1 = d.a.a.d.c.b.reading_quoted
            goto L77
        L4d:
            if (r5 != 0) goto L54
            if (r8 != r11) goto L54
            d.a.a.d.c$b r1 = d.a.a.d.c.b.readin_single_quote
            goto L77
        L54:
            d.a.a.d.c$b r1 = d.a.a.d.c.b.reading_unquoted
            goto L76
        L57:
            d.a.a.d.c$b r13 = d.a.a.d.c.b.reading_unquoted
            if (r1 != r13) goto L66
            if (r5 != 0) goto L76
            boolean r11 = r14.t(r8)
            if (r11 == 0) goto L76
        L63:
            d.a.a.d.c$b r1 = d.a.a.d.c.b.done
            goto L77
        L66:
            d.a.a.d.c$b r13 = d.a.a.d.c.b.reading_quoted
            if (r1 != r13) goto L6f
            if (r5 != 0) goto L76
            if (r8 != r12) goto L76
            goto L63
        L6f:
            d.a.a.d.c$b r13 = d.a.a.d.c.b.readin_single_quote
            if (r1 != r13) goto L77
            if (r8 != r11) goto L76
            goto L63
        L76:
            r6 = r8
        L77:
            d.a.a.d.c$b r8 = d.a.a.d.c.b.done
            if (r1 != r8) goto L81
            r0.add(r7)
            r7 = r2
            r6 = 0
            goto L82
        L81:
            r10 = r1
        L82:
            if (r5 == 0) goto L99
            if (r6 == 0) goto L99
            if (r6 == r9) goto L99
            if (r6 == r12) goto L99
            boolean r1 = r14.t(r6)
            if (r1 == 0) goto L91
            goto L99
        L91:
            d.a.a.d.c$a r15 = new d.a.a.d.c$a
            java.lang.String r0 = "Options warning: Bad backslash ('\\') usage"
            r15.<init>(r0)
            throw r15
        L99:
            r1 = r10
            r5 = 0
        L9b:
            if (r6 == 0) goto Lac
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r6)
            java.lang.String r7 = r8.toString()
        Lac:
            int r8 = r4 + 1
            int r9 = r15.length()
            if (r4 < r9) goto Lb5
        Lb4:
            return r0
        Lb5:
            r4 = r8
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.d.c.r(java.lang.String):java.util.Vector");
    }

    public final Vector<String> s(String str) {
        String[] strArrSplit = str.split("#\\sOVPN_ACCESS_SERVER_", 2)[1].split("=", 2);
        Vector<String> vector = new Vector<>();
        Collections.addAll(vector, strArrSplit);
        return vector;
    }

    public final boolean t(char c2) {
        return Character.isWhitespace(c2) || c2 == 0;
    }
}
