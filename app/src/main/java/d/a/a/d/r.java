package d.a.a.d;

import android.content.Context;
import android.content.Intent;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.R;
import d.a.a.d.e;
import d.a.a.d.p;
import d.a.a.d.s;
import de.blinkt.openvpn.core.NativeUtils;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class r implements Runnable, p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Vector<r> f30167b = new Vector<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f30168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LocalSocket f30169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d.a.a.a f30170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OpenVPNService f30171f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LocalServerSocket f30173h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LocalSocket f30176k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p.a f30178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30179n;
    public transient e r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinkedList<FileDescriptor> f30172g = new LinkedList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30174i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f30175j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p.b f30177l = p.b.noNetwork;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Runnable f30180o = new Runnable() { // from class: d.a.a.d.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f30093b.n();
        }
    };
    public Runnable p = new a();
    public s.b q = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.E(e.a.SOCKS5, "127.0.0.1", Integer.toString(9050), false);
            s.d(r.this.f30171f).f(r.this.q);
        }
    }

    public class b implements s.b {
        public b() {
        }

        @Override // d.a.a.d.s.b
        public void a(Intent intent, String str, int i2) {
            r.this.f30168c.removeCallbacks(r.this.p);
            r.this.E(e.a.SOCKS5, str, Integer.toString(i2), false);
            s.d(r.this.f30171f).f(this);
        }

        @Override // d.a.a.d.s.b
        public void b() {
            z.m("Orbot not yet installed");
        }

        @Override // d.a.a.d.s.b
        public void c(Intent intent) {
            z.z("Orbot integration for external applications is disabled. Waiting %ds before connecting to the default port. Enable external app integration in Orbot or use Socks v5 config instead of Orbot to avoid this delay.");
        }

        @Override // d.a.a.d.s.b
        public void d(Intent intent) {
            StringBuilder sb = new StringBuilder();
            for (String str : intent.getExtras().keySet()) {
                Object obj = intent.getExtras().get(str);
                Locale locale = Locale.ENGLISH;
                Object[] objArr = new Object[2];
                objArr[0] = str;
                objArr[1] = obj == null ? Constants.NULL_VERSION_ID : obj.toString();
                sb.append(String.format(locale, "%s - '%s'", objArr));
            }
            z.m("Got Orbot status: " + ((Object) sb));
        }
    }

    public r(d.a.a.a aVar, OpenVPNService openVPNService) {
        this.f30170e = aVar;
        this.f30171f = openVPNService;
        this.f30168c = new Handler(openVPNService.getMainLooper());
    }

    public static boolean I() {
        boolean z;
        Vector<r> vector = f30167b;
        synchronized (vector) {
            z = false;
            for (r rVar : vector) {
                boolean zO = rVar.o("signal SIGINT\n");
                try {
                    LocalSocket localSocket = rVar.f30169d;
                    if (localSocket != null) {
                        localSocket.close();
                    }
                } catch (IOException unused) {
                }
                z = zO;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n() {
        if (G()) {
            D();
        }
    }

    public final void A(String str) {
        String[] strArrSplit = str.split(",", 3);
        z.I(strArrSplit[1], strArrSplit[2].equals(",,") ? BuildConfig.FLAVOR : strArrSplit[2]);
    }

    public final void B(FileDescriptor fileDescriptor) {
        try {
            int iIntValue = ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", new Class[0]).invoke(fileDescriptor, new Object[0])).intValue();
            if (!this.f30171f.protect(iIntValue)) {
                z.z("Could not protect VPN socket");
            }
            if (Build.VERSION.SDK_INT >= 21) {
                k(fileDescriptor);
            } else {
                NativeUtils.jniclose(iIntValue);
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException e2) {
            z.s("Failed to retrieve fd from socket (" + fileDescriptor + ")", e2);
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve fd from socket: ");
            sb.append(fileDescriptor);
            Log.d("Openvpn", sb.toString());
        }
    }

    public void C() {
        if (this.f30174i) {
            D();
        }
    }

    public final void D() {
        this.f30168c.removeCallbacks(this.f30180o);
        if (System.currentTimeMillis() - this.f30175j < 5000) {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException unused) {
            }
        }
        this.f30174i = false;
        this.f30175j = System.currentTimeMillis();
        o("hold release\n");
        o("bytecount 2\n");
        o("state on\n");
    }

    public final void E(e.a aVar, String str, String str2, boolean z) {
        String str3;
        if (aVar == e.a.NONE || str == null) {
            str3 = "proxy NONE\n";
        } else {
            z.t(R.string.using_proxy, str, str);
            String str4 = z ? " auto" : BuildConfig.FLAVOR;
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[4];
            objArr[0] = aVar == e.a.HTTP ? "HTTP" : "SOCKS";
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = str4;
            str3 = String.format(locale, "proxy %s %s %s%s\n", objArr);
        }
        o(str3);
    }

    public final boolean F(String str, String str2) {
        if (!str2.equals("tun")) {
            z.p(String.format("Device type %s requested, but only tun is possible with the Android API, sorry!", str2));
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptorN3 = this.f30171f.n3();
        if (parcelFileDescriptorN3 == null) {
            return false;
        }
        int fd = parcelFileDescriptorN3.getFd();
        try {
            Method declaredMethod = FileDescriptor.class.getDeclaredMethod("setInt$", Integer.TYPE);
            FileDescriptor fileDescriptor = new FileDescriptor();
            declaredMethod.invoke(fileDescriptor, Integer.valueOf(fd));
            this.f30169d.setFileDescriptorsForSend(new FileDescriptor[]{fileDescriptor});
            o(String.format("needok '%s' %s\n", str, "ok"));
            this.f30169d.setFileDescriptorsForSend(null);
            parcelFileDescriptorN3.close();
            return true;
        } catch (IOException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
            z.s("Could not send fd over socket", e2);
            return false;
        }
    }

    public boolean G() {
        p.a aVar = this.f30178m;
        if (aVar == null) {
            return false;
        }
        return aVar.a();
    }

    public void H() {
        this.f30168c.removeCallbacks(this.f30180o);
        if (this.f30174i) {
            z.H(this.f30177l);
        } else {
            o("signal SIGUSR1\n");
        }
    }

    @Override // d.a.a.d.p
    public void a(p.b bVar) {
        this.f30177l = bVar;
        H();
    }

    @Override // d.a.a.d.p
    public void b(boolean z) {
        if (this.f30174i) {
            C();
        } else {
            o(z ? "network-change samenetwork\n" : "network-change\n");
        }
    }

    @Override // d.a.a.d.p
    public void c(p.a aVar) {
        this.f30178m = aVar;
    }

    @Override // d.a.a.d.p
    public void d(String str) {
        o("cr-response " + str + "\n");
    }

    @Override // d.a.a.d.p
    public boolean e(boolean z) {
        boolean zI = I();
        if (zI) {
            this.f30179n = true;
        }
        return zI;
    }

    public final void k(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception e2) {
            z.s("Failed to close fd (" + fileDescriptor + ")", e2);
        }
    }

    public final void l(String str) {
        this.f30174i = true;
        int i2 = Integer.parseInt(str.split(":")[1]);
        if (!G()) {
            z.H(this.f30177l);
            return;
        }
        if (i2 > 1) {
            z.J("CONNECTRETRY", String.valueOf(i2), R.string.state_waitconnectretry, f.LEVEL_CONNECTING_NO_SERVER_REPLY_YET);
        }
        this.f30168c.postDelayed(this.f30180o, i2 * 1000);
        Object[] objArr = new Object[1];
        if (i2 > 5) {
            objArr[0] = String.valueOf(i2);
            z.t(R.string.state_waitconnectretry, objArr);
        } else {
            objArr[0] = String.valueOf(i2);
            z.l(R.string.state_waitconnectretry, objArr);
        }
    }

    public boolean o(String str) {
        try {
            LocalSocket localSocket = this.f30169d;
            if (localSocket == null || localSocket.getOutputStream() == null) {
                return false;
            }
            this.f30169d.getOutputStream().write(str.getBytes());
            this.f30169d.getOutputStream().flush();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean p(Context context) {
        String str = context.getCacheDir().getAbsolutePath() + "/mgmtsocket";
        this.f30176k = new LocalSocket();
        for (int i2 = 8; i2 > 0 && !this.f30176k.isBound(); i2--) {
            try {
                this.f30176k.bind(new LocalSocketAddress(str, LocalSocketAddress.Namespace.FILESYSTEM));
            } catch (IOException unused) {
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException unused2) {
                }
            }
        }
        try {
            this.f30173h = new LocalServerSocket(this.f30176k.getFileDescriptor());
            return true;
        } catch (IOException e2) {
            z.r(e2);
            return false;
        }
    }

    public final void q(String str, String str2) {
        z.J("AUTH_FAILED", str + str2, R.string.state_auth_failed, f.LEVEL_AUTH_FAILED);
    }

    public final void r(String str) {
        int iIndexOf = str.indexOf(44);
        z.G(Long.parseLong(str.substring(0, iIndexOf)), Long.parseLong(str.substring(iIndexOf + 1)));
    }

    @Override // d.a.a.d.p
    public void resume() {
        C();
        this.f30177l = p.b.noNetwork;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr = new byte[2048];
        String strU = BuildConfig.FLAVOR;
        Vector<r> vector = f30167b;
        synchronized (vector) {
            vector.add(this);
        }
        try {
            LocalSocket localSocketAccept = this.f30173h.accept();
            this.f30169d = localSocketAccept;
            InputStream inputStream = localSocketAccept.getInputStream();
            try {
                this.f30173h.close();
            } catch (IOException e2) {
                z.r(e2);
            }
            o("version 3\n");
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    return;
                }
                FileDescriptor[] ancillaryFileDescriptors = null;
                try {
                    ancillaryFileDescriptors = this.f30169d.getAncillaryFileDescriptors();
                } catch (IOException e3) {
                    z.s("Error reading fds from socket", e3);
                }
                if (ancillaryFileDescriptors != null) {
                    Collections.addAll(this.f30172g, ancillaryFileDescriptors);
                }
                strU = u(strU + new String(bArr, 0, i2, "UTF-8"));
            }
        } catch (IOException e4) {
            if (!e4.getMessage().equals("socket closed") && !e4.getMessage().equals("Connection reset by peer")) {
                z.r(e4);
            }
            Vector<r> vector2 = f30167b;
            synchronized (vector2) {
                vector2.remove(this);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.d.r.s(java.lang.String):void");
    }

    public final void t(String str) {
        if (str.startsWith("OPEN_URL:") || str.startsWith("CR_TEXT:") || str.startsWith("WEB_AUTH:")) {
            this.f30171f.B3(str);
            return;
        }
        z.m("Info message from server:" + str);
    }

    public final String u(String str) {
        while (str.contains("\n")) {
            String[] strArrSplit = str.split("\\r?\\n", 2);
            s(strArrSplit[0]);
            str = strArrSplit.length == 1 ? BuildConfig.FLAVOR : strArrSplit[1];
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = ","
            r1 = 4
            java.lang.String[] r0 = r8.split(r0, r1)
            java.lang.String r2 = "OpenVPN"
            android.util.Log.d(r2, r8)
            r8 = 1
            r2 = r0[r8]
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 2
            r6 = -1
            switch(r3) {
                case 68: goto L3d;
                case 70: goto L34;
                case 73: goto L29;
                case 87: goto L1e;
                default: goto L1c;
            }
        L1c:
            r8 = -1
            goto L47
        L1e:
            java.lang.String r8 = "W"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L27
            goto L1c
        L27:
            r8 = 3
            goto L47
        L29:
            java.lang.String r8 = "I"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L32
            goto L1c
        L32:
            r8 = 2
            goto L47
        L34:
            java.lang.String r3 = "F"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L47
            goto L1c
        L3d:
            java.lang.String r8 = "D"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L46
            goto L1c
        L46:
            r8 = 0
        L47:
            switch(r8) {
                case 0: goto L54;
                case 1: goto L51;
                case 2: goto L4e;
                case 3: goto L4b;
                default: goto L4a;
            }
        L4a:
            goto L4e
        L4b:
            d.a.a.d.z$c r8 = d.a.a.d.z.c.WARNING
            goto L56
        L4e:
            d.a.a.d.z$c r8 = d.a.a.d.z.c.INFO
            goto L56
        L51:
            d.a.a.d.z$c r8 = d.a.a.d.z.c.ERROR
            goto L56
        L54:
            d.a.a.d.z$c r8 = d.a.a.d.z.c.VERBOSE
        L56:
            r2 = r0[r5]
            int r2 = java.lang.Integer.parseInt(r2)
            r2 = r2 & 15
            r0 = r0[r4]
            java.lang.String r3 = "MANAGEMENT: CMD"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L6c
            int r2 = java.lang.Math.max(r1, r2)
        L6c:
            d.a.a.d.z.x(r8, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.d.r.v(java.lang.String):void");
    }

    public final void w(String str) {
        String strSubstring;
        String str2;
        StringBuilder sb;
        String string;
        String strG3;
        int iIndexOf = str.indexOf(39) + 1;
        strSubstring = str.substring(iIndexOf, str.indexOf(39, iIndexOf));
        str2 = str.split(":", 2)[1];
        strSubstring.hashCode();
        switch (strSubstring) {
            case "PROTECTFD":
                B(this.f30172g.pollFirst());
                strG3 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strG3));
                break;
            case "IFCONFIG":
                String[] strArrSplit = str2.split(" ");
                this.f30171f.v3(strArrSplit[0], strArrSplit[1], Integer.parseInt(strArrSplit[2]), strArrSplit[3]);
                strG3 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strG3));
                break;
            case "ROUTE6":
                String[] strArrSplit2 = str2.split(" ");
                this.f30171f.V2(strArrSplit2[0], strArrSplit2[1]);
                strG3 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strG3));
                break;
            case "DNSDOMAIN":
                this.f30171f.t3(str2);
                strG3 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strG3));
                break;
            case "HTTPPROXY":
                String[] strArrSplit3 = str2.split(" ");
                if (strArrSplit3.length != 2) {
                    sb = new StringBuilder();
                    sb.append("Unrecognized HTTPPROXY cmd: ");
                    string = Arrays.toString(strArrSplit3);
                    sb.append(string);
                    sb.append(" | ");
                    sb.append(str);
                    z.p(sb.toString());
                    strG3 = "ok";
                    o(String.format("needok '%s' %s\n", strSubstring, strG3));
                    break;
                } else {
                    this.f30171f.R2(strArrSplit3[0], Integer.parseInt(strArrSplit3[1]));
                    strG3 = "ok";
                    o(String.format("needok '%s' %s\n", strSubstring, strG3));
                    break;
                }
                break;
            case "DNSSERVER":
            case "DNS6SERVER":
                this.f30171f.Q2(str2);
                strG3 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strG3));
                break;
            case "OPENTUN":
                if (!F(strSubstring, str2)) {
                    strG3 = "cancel";
                    o(String.format("needok '%s' %s\n", strSubstring, strG3));
                    break;
                }
                break;
            case "ROUTE":
                String[] strArrSplit4 = str2.split(" ");
                if (strArrSplit4.length == 5) {
                    this.f30171f.U2(strArrSplit4[0], strArrSplit4[1], strArrSplit4[2], strArrSplit4[4]);
                } else if (strArrSplit4.length >= 3) {
                    this.f30171f.U2(strArrSplit4[0], strArrSplit4[1], strArrSplit4[2], null);
                } else {
                    sb = new StringBuilder();
                    sb.append("Unrecognized ROUTE cmd:");
                    string = Arrays.toString(strArrSplit4);
                    sb.append(string);
                    sb.append(" | ");
                    sb.append(str);
                    z.p(sb.toString());
                }
                strG3 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strG3));
                break;
            case "IFCONFIG6":
                String[] strArrSplit5 = str2.split(" ");
                this.f30171f.x3(Integer.parseInt(strArrSplit5[1]));
                this.f30171f.w3(strArrSplit5[0]);
                strG3 = "ok";
                o(String.format("needok '%s' %s\n", strSubstring, strG3));
                break;
            case "PERSIST_TUN_ACTION":
                strG3 = this.f30171f.g3();
                o(String.format("needok '%s' %s\n", strSubstring, strG3));
                break;
            default:
                Log.e("openvpn", "Unknown needok command " + str);
                break;
        }
    }

    public final void x(String str) {
        String str2;
        e eVar;
        try {
            if (str.startsWith("Auth-Token:")) {
                return;
            }
            int iIndexOf = str.indexOf(39) + 1;
            int iIndexOf2 = str.indexOf(39, iIndexOf);
            String strSubstring = str.substring(iIndexOf, iIndexOf2);
            if (str.startsWith("Verification Failed")) {
                q(strSubstring, str.substring(iIndexOf2 + 1));
                return;
            }
            String strZ = null;
            if (strSubstring.equals("Private Key")) {
                strZ = this.f30170e.A();
                str2 = null;
            } else if (strSubstring.equals(AWSMobileClient.AUTH_KEY)) {
                strZ = this.f30170e.z();
                str2 = this.f30170e.D;
            } else if (!strSubstring.equals("HTTP Proxy") || (eVar = this.r) == null) {
                str2 = null;
            } else {
                strZ = eVar.f30117n;
                str2 = eVar.f30116m;
            }
            if (strZ == null) {
                this.f30171f.q3(R.string.password, strSubstring);
                z.p(String.format("Openvpn requires Authentication type '%s' but no password/key information available", strSubstring));
            } else {
                if (str2 != null) {
                    o(String.format("username '%s' %s\n", strSubstring, d.a.a.a.M(str2)));
                }
                o(String.format("password '%s' %s\n", strSubstring, d.a.a.a.M(strZ)));
            }
        } catch (StringIndexOutOfBoundsException unused) {
            z.p("Could not parse management Password command: " + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = ","
            r1 = 3
            java.lang.String[] r10 = r10.split(r0, r1)
            d.a.a.d.e$a r0 = d.a.a.d.e.a.NONE
            r1 = 0
            r2 = r10[r1]
            int r2 = java.lang.Integer.parseInt(r2)
            r3 = 1
            int r2 = r2 - r3
            d.a.a.a r4 = r9.f30170e
            d.a.a.d.e[] r4 = r4.f0
            int r5 = r4.length
            r6 = 0
            if (r5 <= r2) goto L27
            r2 = r4[r2]
            d.a.a.d.e$a r4 = r2.f30112i
            java.lang.String r5 = r2.f30113j
            java.lang.String r7 = r2.f30114k
            boolean r8 = r2.f30115l
            r9.r = r2
            goto L3e
        L27:
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r1] = r2
            java.lang.String r2 = "OpenVPN is asking for a proxy of an unknown connection entry (%d)"
            java.lang.String r2 = java.lang.String.format(r4, r2, r5)
            d.a.a.d.z.p(r2)
            r4 = r0
            r5 = r6
            r7 = r5
            r8 = 0
        L3e:
            if (r4 != r0) goto L5b
            d.a.a.a r0 = r9.f30170e
            java.net.SocketAddress r0 = d.a.a.d.w.a(r0)
            boolean r2 = r0 instanceof java.net.InetSocketAddress
            if (r2 == 0) goto L5b
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            d.a.a.d.e$a r4 = d.a.a.d.e.a.HTTP
            java.lang.String r5 = r0.getHostName()
            int r0 = r0.getPort()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            goto L5c
        L5b:
            r1 = r8
        L5c:
            int r0 = r10.length
            r2 = 2
            if (r0 < r2) goto L74
            d.a.a.d.e$a r0 = d.a.a.d.e.a.HTTP
            if (r4 != r0) goto L74
            r10 = r10[r3]
            java.lang.String r0 = "UDP"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L74
            java.lang.String r10 = "Not using an HTTP proxy since the connection uses UDP"
            d.a.a.d.z.u(r10)
            goto L75
        L74:
            r6 = r5
        L75:
            d.a.a.d.e$a r10 = d.a.a.d.e.a.ORBOT
            if (r4 != r10) goto Lac
            r10 = 2132018589(0x7f14059d, float:1.9675489E38)
            d.a.a.d.f r0 = d.a.a.d.f.LEVEL_CONNECTING_NO_SERVER_REPLY_YET
            java.lang.String r1 = "WAIT_ORBOT"
            java.lang.String r2 = "Waiting for Orbot to start"
            d.a.a.d.z.J(r1, r2, r10, r0)
            de.blinkt.openvpn.core.OpenVPNService r10 = r9.f30171f
            d.a.a.d.s r10 = d.a.a.d.s.d(r10)
            de.blinkt.openvpn.core.OpenVPNService r0 = r9.f30171f
            boolean r0 = d.a.a.d.s.c(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "Orbot does not seem to be installed!"
            d.a.a.d.z.p(r0)
        L98:
            android.os.Handler r0 = r9.f30168c
            java.lang.Runnable r1 = r9.p
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.postDelayed(r1, r2)
            de.blinkt.openvpn.core.OpenVPNService r0 = r9.f30171f
            d.a.a.d.s$b r1 = r9.q
            r10.b(r0, r1)
            r10.g()
            goto Laf
        Lac:
            r9.E(r4, r6, r7, r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.d.r.y(java.lang.String):void");
    }

    public final void z(String str) {
        String[] strArrSplit = str.split(",");
        String strC = this.f30170e.C(this.f30171f, strArrSplit[0], strArrSplit[1].equals("RSA_PKCS1_PADDING"));
        o("pk-sig\n");
        if (strC == null) {
            o("\nEND\n");
            I();
        } else {
            o(strC);
            o("\nEND\n");
        }
    }
}
