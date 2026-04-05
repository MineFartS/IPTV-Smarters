package de.blinkt.openvpn.core;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.net.ProxyInfo;
import android.net.VpnService;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.nst.iptvsmarterstvbox.R;
import d.a.a.d.e;
import d.a.a.d.f;
import d.a.a.d.g;
import d.a.a.d.i;
import d.a.a.d.n;
import d.a.a.d.o;
import d.a.a.d.p;
import d.a.a.d.q;
import d.a.a.d.r;
import d.a.a.d.v;
import d.a.a.d.y;
import d.a.a.d.z;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class OpenVPNService extends VpnService implements z.e, Handler.Callback, z.b, i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f30308b = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f30313g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d.a.a.a f30315i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30318l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f30320n;
    public long q;
    public p r;
    public String t;
    public String u;
    public Handler v;
    public Toast w;
    public Runnable x;
    public ProxyInfo y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Vector<String> f30309c = new Vector<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f30310d = new n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f30311e = new n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f30312f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f30314h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f30316j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d.a.a.d.b f30317k = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f30319m = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30321o = false;
    public boolean p = false;
    public final IBinder s = new a();

    public class a extends i.a {
        public a() {
        }

        @Override // d.a.a.d.i
        public void O1(String str) {
            OpenVPNService.this.O1(str);
        }

        @Override // d.a.a.d.i
        public void Z1(String str) {
            OpenVPNService.this.Z1(str);
        }

        @Override // d.a.a.d.i
        public boolean e(boolean z) {
            return OpenVPNService.this.e(z);
        }

        @Override // d.a.a.d.i
        public boolean h0(String str) {
            return OpenVPNService.this.h0(str);
        }

        @Override // d.a.a.d.i
        public void l2(boolean z) {
            OpenVPNService.this.l2(z);
        }

        @Override // d.a.a.d.i
        public boolean protect(int i2) {
            return OpenVPNService.this.protect(i2);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30323b;

        public b(String str) {
            this.f30323b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OpenVPNService.this.w != null) {
                OpenVPNService.this.w.cancel();
            }
            String str = String.format(Locale.getDefault(), "%s - %s", OpenVPNService.this.f30315i.f30070f, this.f30323b);
            OpenVPNService openVPNService = OpenVPNService.this;
            openVPNService.w = Toast.makeText(openVPNService.getBaseContext(), str, 0);
            OpenVPNService.this.w.show();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenVPNService.this.z3();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OpenVPNService.this.f30320n != null) {
                OpenVPNService.this.C3();
            }
            OpenVPNService openVPNService = OpenVPNService.this;
            openVPNService.p3(openVPNService.r);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30327a = new int[f.values().length];
    }

    @SuppressLint({"StringFormatInvalid"})
    public static String h3(long j2, boolean z, Resources resources) {
        if (z) {
            j2 *= 8;
        }
        double d2 = j2;
        double d3 = z ? 1000 : 1024;
        int iMax = Math.max(0, Math.min((int) (Math.log(d2) / Math.log(d3)), 3));
        double dPow = Math.pow(d3, iMax);
        Double.isNaN(d2);
        float f2 = (float) (d2 / dPow);
        return z ? iMax != 0 ? iMax != 1 ? iMax != 2 ? resources.getString(R.string.gbits_per_second, Float.valueOf(f2)) : resources.getString(R.string.mbits_per_second, Float.valueOf(f2)) : resources.getString(R.string.kbits_per_second, Float.valueOf(f2)) : resources.getString(R.string.bits_per_second, Float.valueOf(f2)) : iMax != 0 ? iMax != 1 ? iMax != 2 ? resources.getString(R.string.volume_gbyte, Float.valueOf(f2)) : resources.getString(R.string.volume_mbyte, Float.valueOf(f2)) : resources.getString(R.string.volume_kbyte, Float.valueOf(f2)) : resources.getString(R.string.volume_byte, Float.valueOf(f2));
    }

    public final void A3() {
        if (this.r != null) {
            Runnable runnable = this.x;
            if (runnable != null) {
                ((q) runnable).b();
            }
            if (this.r.e(true)) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
            }
        }
        b3();
    }

    public void B3(String str) {
        String str2 = str.split(":", 2)[0];
        NotificationManager notificationManager = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        Notification.Builder builder = new Notification.Builder(this);
        builder.setAutoCancel(true);
        builder.setSmallIcon(android.R.drawable.ic_dialog_info);
        str2.hashCode();
        if (!str2.equals("CR_TEXT")) {
            z.p("Unknown SSO method found: " + str2);
            return;
        }
        String str3 = str.split(":", 2)[1];
        builder.setContentTitle(getString(R.string.crtext_requested));
        builder.setContentText(str3);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, getPackageName() + ".activities.CredentialsPopup"));
        intent.putExtra("de.blinkt.openvpn.core.CR_TEXT_CHALLENGE", str3);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        z.K("USER_INPUT", "waiting for user input", R.string.crtext_requested, f.LEVEL_WAITING_FOR_USER_INPUT, intent);
        builder.setContentIntent(activity);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16) {
            l3(2, builder);
        }
        if (i2 >= 21) {
            m3(builder, "status");
        }
        if (i2 >= 26) {
            builder.setChannelId("openvpn_userreq");
        }
        notificationManager.notify(-370124770, builder.getNotification());
    }

    public synchronized void C3() {
        g gVar = this.f30320n;
        if (gVar != null) {
            try {
                z.C(gVar);
                unregisterReceiver(this.f30320n);
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
            this.f30320n = null;
        } else {
            this.f30320n = null;
        }
    }

    public final void D3(d.a.a.a aVar) {
        if (aVar == null) {
            return;
        }
        ((ShortcutManager) getSystemService(ShortcutManager.class)).reportShortcutUsed(aVar.F());
    }

    @Override // d.a.a.d.z.e
    public void I2(String str) {
    }

    @Override // d.a.a.d.z.e
    public void J(String str, String str2, int i2, f fVar, Intent intent) {
        Z2(str, fVar);
        if (this.f30314h != null || f30308b) {
            if (fVar == f.LEVEL_CONNECTED) {
                this.f30321o = true;
                this.q = System.currentTimeMillis();
                String str3 = r3() ? "openvpn_newstat" : "openvpn_bg";
                y3(z.f(this), z.f(this), str3, 0L, fVar, intent);
            }
            this.f30321o = false;
            y3(z.f(this), z.f(this), str3, 0L, fVar, intent);
        }
    }

    @Override // d.a.a.d.i
    public void O1(String str) {
        new d.a.a.c.b(this).a(str);
    }

    public void Q2(String str) {
        this.f30309c.add(str);
    }

    public boolean R2(String str, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        try {
            this.y = ProxyInfo.buildDirectProxy(str, i2);
            return true;
        } catch (Exception e2) {
            z.p("Could not set proxy" + e2.getLocalizedMessage());
            return false;
        }
    }

    public final void S2() {
        Iterator<String> it = o.a(this, false).iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split("/");
            String str = strArrSplit[0];
            int i2 = Integer.parseInt(strArrSplit[1]);
            if (!str.equals(this.f30317k.f30094a)) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 19 && !this.f30315i.X) {
                    this.f30310d.b(new d.a.a.d.b(str, i2), true);
                } else if (i3 >= 19 && this.f30315i.X) {
                    this.f30310d.a(new d.a.a.d.b(str, i2), false);
                }
            }
        }
        if (this.f30315i.X) {
            Iterator<String> it2 = o.a(this, true).iterator();
            while (it2.hasNext()) {
                W2(it2.next(), false);
            }
        }
    }

    public void T2(d.a.a.d.b bVar, boolean z) {
        this.f30310d.a(bVar, z);
    }

    public void U2(String str, String str2, String str3, String str4) {
        d.a.a.d.b bVar = new d.a.a.d.b(str, str2);
        boolean zJ3 = j3(str4);
        n.a aVar = new n.a(new d.a.a.d.b(str3, 32), false);
        d.a.a.d.b bVar2 = this.f30317k;
        if (bVar2 == null) {
            z.p("Local IP address unset and received. Neither pushed server config nor local config specifies an IP addresses. Opening tun device is most likely going to fail.");
            return;
        }
        if (new n.a(bVar2, true).c(aVar)) {
            zJ3 = true;
        }
        if (str3 != null && (str3.equals("255.255.255.255") || str3.equals(this.u))) {
            zJ3 = true;
        }
        if (bVar.f30095b == 32 && !str2.equals("255.255.255.255")) {
            z.y(R.string.route_not_cidr, str, str2);
        }
        if (bVar.d()) {
            z.y(R.string.route_not_netip, str, Integer.valueOf(bVar.f30095b), bVar.f30094a);
        }
        this.f30310d.a(bVar, zJ3);
    }

    public void V2(String str, String str2) {
        W2(str, j3(str2));
    }

    public void W2(String str, boolean z) {
        String[] strArrSplit = str.split("/");
        try {
            this.f30311e.c((Inet6Address) InetAddress.getAllByName(strArrSplit[0])[0], Integer.parseInt(strArrSplit[1]), z);
        } catch (UnknownHostException e2) {
            z.r(e2);
        }
    }

    public final void X2(Notification.Builder builder) {
        PendingIntent service;
        int i2;
        int i3;
        Intent intent = new Intent(this, (Class<?>) d.a.a.b.a.class);
        intent.setAction("de.blinkt.openvpn.DISCONNECT_VPN");
        builder.addAction(R.drawable.ic_cancel, getString(R.string.cancel_connection), PendingIntent.getActivity(this, 0, intent, 67108864));
        Intent intent2 = new Intent(this, (Class<?>) OpenVPNService.class);
        g gVar = this.f30320n;
        if (gVar == null || !gVar.h()) {
            intent2.setAction("de.blinkt.openvpn.PAUSE_VPN");
            service = PendingIntent.getService(this, 0, intent2, 67108864);
            i2 = R.drawable.lb_ic_pause;
            i3 = R.string.pauseVPN;
        } else {
            intent2.setAction("de.blinkt.openvpn.RESUME_VPN");
            service = PendingIntent.getService(this, 0, intent2, 67108864);
            i2 = R.drawable.lb_ic_play;
            i3 = R.string.resumevpn;
        }
        builder.addAction(i2, getString(i3), service);
    }

    @TargetApi(21)
    public final void Y2(VpnService.Builder builder) {
        builder.allowFamily(OsConstants.AF_INET);
        builder.allowFamily(OsConstants.AF_INET6);
    }

    @Override // d.a.a.d.i
    public void Z1(String str) {
        if (this.r != null) {
            this.r.d(Base64.encodeToString(str.getBytes(Charset.forName("UTF-8")), 0));
        }
    }

    public final void Z2(String str, f fVar) {
        Intent intent = new Intent();
        intent.setAction("de.blinkt.openvpn.VPN_STATUS");
        intent.putExtra("status", fVar.toString());
        intent.putExtra("detailstatus", str);
        sendBroadcast(intent, "android.permission.ACCESS_NETWORK_STATE");
    }

    public final void a3() {
        synchronized (this.f30312f) {
            this.f30314h = null;
        }
        z.C(this);
        C3();
        v.s(this);
        this.x = null;
        if (this.p) {
            return;
        }
        stopForeground(!f30308b);
        if (f30308b) {
            return;
        }
        stopSelf();
        z.E(this);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.s;
    }

    public void b3() {
        synchronized (this.f30312f) {
            Thread thread = this.f30314h;
            if (thread != null) {
                thread.interrupt();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Override // d.a.a.d.z.b
    public void c1(long j2, long j3, long j4, long j5) {
        if (this.f30321o) {
            y3(String.format(getString(R.string.statusline_bytecount), h3(j2, false, getResources()), h3(j4 / 2, true, getResources()), h3(j3, false, getResources()), h3(j5 / 2, true, getResources())), null, "openvpn_bg", this.q, f.LEVEL_CONNECTED, null);
        }
    }

    public PendingIntent c3() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, getPackageName() + ".activities.MainActivity"));
        intent.putExtra("PAGE", "graph");
        intent.addFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        intent.addFlags(131072);
        return activity;
    }

    public final int d3(f fVar) {
        int i2 = e.f30327a[fVar.ordinal()];
        return R.mipmap.ic_launcher;
    }

    @Override // d.a.a.d.i
    public boolean e(boolean z) {
        if (e3() != null) {
            return e3().e(z);
        }
        return false;
    }

    public p e3() {
        return this.r;
    }

    public final String f3() {
        String str = "TUNCFG UNQIUE STRING ips:";
        if (this.f30317k != null) {
            str = "TUNCFG UNQIUE STRING ips:" + this.f30317k.toString();
        }
        if (this.f30319m != null) {
            str = str + this.f30319m;
        }
        return (((((str + "routes: " + TextUtils.join("|", this.f30310d.f(true)) + TextUtils.join("|", this.f30311e.f(true))) + "excl. routes:" + TextUtils.join("|", this.f30310d.f(false)) + TextUtils.join("|", this.f30311e.f(false))) + "dns: " + TextUtils.join("|", this.f30309c)) + "domain: " + this.f30316j) + "mtu: " + this.f30318l) + "proxyInfo: " + this.y;
    }

    public String g3() {
        if (f3().equals(this.t)) {
            return "NOACTION";
        }
        String str = Build.VERSION.RELEASE;
        return (Build.VERSION.SDK_INT != 19 || str.startsWith("4.4.3") || str.startsWith("4.4.4") || str.startsWith("4.4.5") || str.startsWith("4.4.6")) ? "OPEN_BEFORE_CLOSE" : "OPEN_AFTER_CLOSE";
    }

    @Override // d.a.a.d.i
    public boolean h0(String str) {
        return new d.a.a.c.b(this).c(this, str);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Runnable callback = message.getCallback();
        if (callback == null) {
            return false;
        }
        callback.run();
        return true;
    }

    public final p i3() {
        try {
            return (p) Class.forName("de.blinkt.openvpn.core.OpenVPNThreadv3").getConstructor(OpenVPNService.class, d.a.a.a.class).newInstance(this, this.f30315i);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final boolean j3(String str) {
        return str != null && (str.startsWith("tun") || "(null)".equals(str) || "vpnservice-tun".equals(str));
    }

    public final boolean k3() {
        if (Build.VERSION.SDK_INT >= 29) {
            return isLockdownEnabled();
        }
        return false;
    }

    @Override // d.a.a.d.i
    public void l2(boolean z) {
        g gVar = this.f30320n;
        if (gVar != null) {
            gVar.k(z);
        }
    }

    @TargetApi(16)
    public final void l3(int i2, Notification.Builder builder) {
        if (i2 != 0) {
            try {
                builder.getClass().getMethod("setPriority", Integer.TYPE).invoke(builder, Integer.valueOf(i2));
                builder.getClass().getMethod("setUsesChronometer", Boolean.TYPE).invoke(builder, Boolean.TRUE);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
                z.r(e2);
            }
        }
    }

    @TargetApi(21)
    public final void m3(Notification.Builder builder, String str) {
        builder.setCategory(str);
        builder.setLocalOnly(true);
    }

    public ParcelFileDescriptor n3() {
        int i2;
        String str;
        int i3;
        VpnService.Builder builder = new VpnService.Builder(this);
        z.t(R.string.last_openvpn_tun_config, new Object[0]);
        boolean z = Build.VERSION.SDK_INT >= 21 && !this.f30315i.A0;
        if (z) {
            Y2(builder);
        }
        d.a.a.d.b bVar = this.f30317k;
        if (bVar == null && this.f30319m == null) {
            z.p(getString(R.string.opentun_no_ipaddr));
            return null;
        }
        if (bVar != null) {
            if (!d.a.a.a.h(this)) {
                S2();
            }
            try {
                d.a.a.d.b bVar2 = this.f30317k;
                builder.addAddress(bVar2.f30094a, bVar2.f30095b);
            } catch (IllegalArgumentException e2) {
                z.o(R.string.dns_add_error, this.f30317k, e2.getLocalizedMessage());
                return null;
            }
        }
        String str2 = this.f30319m;
        if (str2 != null) {
            String[] strArrSplit = str2.split("/");
            try {
                builder.addAddress(strArrSplit[0], Integer.parseInt(strArrSplit[1]));
            } catch (IllegalArgumentException e3) {
                z.o(R.string.ip_add_error, this.f30319m, e3.getLocalizedMessage());
                return null;
            }
        }
        for (String str3 : this.f30309c) {
            try {
                builder.addDnsServer(str3);
            } catch (IllegalArgumentException e4) {
                z.o(R.string.dns_add_error, str3, e4.getLocalizedMessage());
            }
        }
        String str4 = Build.VERSION.RELEASE;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 != 19 || str4.startsWith("4.4.3") || str4.startsWith("4.4.4") || str4.startsWith("4.4.5") || str4.startsWith("4.4.6") || (i3 = this.f30318l) >= 1280) {
            builder.setMtu(this.f30318l);
        } else {
            z.u(String.format(Locale.US, "Forcing MTU to 1280 instead of %d to workaround Android Bug #70916", Integer.valueOf(i3)));
            builder.setMtu(1280);
        }
        Collection<n.a> collectionG = this.f30310d.g();
        Collection<n.a> collectionG2 = this.f30311e.g();
        if ("samsung".equals(Build.BRAND) && i4 >= 21 && this.f30309c.size() >= 1) {
            try {
                n.a aVar = new n.a(new d.a.a.d.b(this.f30309c.get(0), 32), true);
                Iterator<n.a> it = collectionG.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    if (it.next().c(aVar)) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    z.z(String.format("Warning Samsung Android 5.0+ devices ignore DNS servers outside the VPN range. To enable DNS resolution a route to your DNS Server (%s) has been added.", this.f30309c.get(0)));
                    collectionG.add(aVar);
                }
            } catch (Exception unused) {
                if (!this.f30309c.get(0).contains(":")) {
                    z.p("Error parsing DNS Server IP: " + this.f30309c.get(0));
                }
            }
        }
        n.a aVar2 = new n.a(new d.a.a.d.b("224.0.0.0", 3), true);
        for (n.a aVar3 : collectionG) {
            try {
                if (aVar2.c(aVar3)) {
                    z.l(R.string.ignore_multicast_route, aVar3.toString());
                } else {
                    builder.addRoute(aVar3.g(), aVar3.f30153c);
                }
            } catch (IllegalArgumentException e5) {
                z.p(getString(R.string.route_rejected) + aVar3 + " " + e5.getLocalizedMessage());
            }
        }
        for (n.a aVar4 : collectionG2) {
            try {
                builder.addRoute(aVar4.i(), aVar4.f30153c);
            } catch (IllegalArgumentException e6) {
                z.p(getString(R.string.route_rejected) + aVar4 + " " + e6.getLocalizedMessage());
            }
        }
        String str5 = this.f30316j;
        if (str5 != null) {
            builder.addSearchDomain(str5);
        }
        String str6 = "(not set, allowed)";
        String str7 = "(not set)";
        if (z) {
            str7 = "(not set, allowed)";
        } else {
            str6 = "(not set)";
        }
        d.a.a.d.b bVar3 = this.f30317k;
        if (bVar3 != null) {
            int i5 = bVar3.f30095b;
            String str8 = bVar3.f30094a;
            i2 = i5;
            str6 = str8;
        } else {
            i2 = -1;
        }
        String str9 = this.f30319m;
        if (str9 != null) {
            str7 = str9;
        }
        if ((!this.f30310d.f(false).isEmpty() || !this.f30311e.f(false).isEmpty()) && k3()) {
            z.u("VPN lockdown enabled (do not allow apps to bypass VPN) enabled. Route exclusion will not allow apps to bypass VPN (e.g. bypass VPN for local networks)");
        }
        z.t(R.string.local_ip_info, str6, Integer.valueOf(i2), str7, Integer.valueOf(this.f30318l));
        z.t(R.string.dns_server_info, TextUtils.join(", ", this.f30309c), this.f30316j);
        z.t(R.string.routes_info_incl, TextUtils.join(", ", this.f30310d.f(true)), TextUtils.join(", ", this.f30311e.f(true)));
        z.t(R.string.routes_info_excl, TextUtils.join(", ", this.f30310d.f(false)), TextUtils.join(", ", this.f30311e.f(false)));
        ProxyInfo proxyInfo = this.y;
        if (proxyInfo != null && Build.VERSION.SDK_INT >= 21) {
            z.t(R.string.proxy_info, proxyInfo.getHost(), Integer.valueOf(this.y.getPort()));
        }
        z.l(R.string.routes_debug, TextUtils.join(", ", collectionG), TextUtils.join(", ", collectionG2));
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 21) {
            s3(builder);
        }
        if (i6 >= 22) {
            builder.setUnderlyingNetworks(null);
        }
        if (i6 >= 29) {
            builder.setMetered(false);
        }
        String str10 = this.f30315i.f30070f;
        d.a.a.d.b bVar4 = this.f30317k;
        builder.setSession((bVar4 == null || (str = this.f30319m) == null) ? bVar4 != null ? getString(R.string.session_ipv4string, new Object[]{str10, bVar4}) : getString(R.string.session_ipv4string, new Object[]{str10, this.f30319m}) : getString(R.string.session_ipv6string, new Object[]{str10, bVar4, str}));
        if (this.f30309c.size() == 0) {
            z.t(R.string.warn_no_dns, new Object[0]);
        }
        u3(builder);
        this.t = f3();
        this.f30309c.clear();
        this.f30310d.d();
        this.f30311e.d();
        this.f30317k = null;
        this.f30319m = null;
        this.f30316j = null;
        this.y = null;
        builder.setConfigureIntent(c3());
        try {
            ParcelFileDescriptor parcelFileDescriptorEstablish = builder.establish();
            if (parcelFileDescriptorEstablish != null) {
                return parcelFileDescriptorEstablish;
            }
            throw new NullPointerException("Android establish() method returned null (Really broken network configuration?)");
        } catch (Exception e7) {
            z.n(R.string.tun_open_error);
            z.p(getString(R.string.error) + e7.getLocalizedMessage());
            if (Build.VERSION.SDK_INT > 17) {
                return null;
            }
            z.n(R.string.tun_error_helpful);
            return null;
        }
    }

    public void o3() {
        a3();
    }

    @Override // android.net.VpnService, android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        return (action == null || !action.equals("de.blinkt.openvpn.START_SERVICE")) ? super.onBind(intent) : this.s;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.f30312f) {
            if (this.f30314h != null) {
                this.r.e(true);
            }
        }
        g gVar = this.f30320n;
        if (gVar != null) {
            unregisterReceiver(gVar);
        }
        z.E(this);
        z.e();
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        z.n(R.string.permission_revoked);
        this.r.e(false);
        a3();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int onStartCommand(android.content.Intent r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.OpenVPNService.onStartCommand(android.content.Intent, int, int):int");
    }

    public synchronized void p3(p pVar) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        g gVar = new g(pVar);
        this.f30320n = gVar;
        gVar.i(this);
        registerReceiver(this.f30320n, intentFilter);
        z.a(this.f30320n);
    }

    public void q3(int i2, String str) {
        f fVar = f.LEVEL_WAITING_FOR_USER_INPUT;
        z.J("NEED", "need " + str, i2, fVar);
        y3(getString(i2), getString(i2), "openvpn_newstat", 0L, fVar, null);
    }

    public final boolean r3() {
        return ((UiModeManager) getSystemService("uimode")).getCurrentModeType() == 4;
    }

    @TargetApi(21)
    public final void s3(VpnService.Builder builder) {
        boolean z = false;
        for (d.a.a.d.e eVar : this.f30315i.f0) {
            if (eVar.f30112i == e.a.ORBOT) {
                z = true;
            }
        }
        if (z) {
            z.m("VPN Profile uses at least one server entry with Orbot. Setting up VPN so that OrBot is not redirected over VPN.");
        }
        if (this.f30315i.i0 && z) {
            try {
                builder.addDisallowedApplication("org.torproject.android");
            } catch (PackageManager.NameNotFoundException unused) {
                z.m("Orbot not installed?");
            }
        }
        try {
            builder.addAllowedApplication(getPackageName());
        } catch (PackageManager.NameNotFoundException e2) {
            z.p("This should not happen: " + e2.getLocalizedMessage());
        }
        d.a.a.a aVar = this.f30315i;
        if (aVar.i0) {
            z.l(R.string.disallowed_vpn_apps_info, TextUtils.join(", ", aVar.h0));
        } else {
            z.l(R.string.allowed_vpn_apps_info, TextUtils.join(", ", aVar.h0));
        }
        if (this.f30315i.j0) {
            builder.allowBypass();
            z.m("Apps may bypass VPN");
        }
    }

    public void t3(String str) {
        if (this.f30316j == null) {
            this.f30316j = str;
        }
    }

    public final void u3(VpnService.Builder builder) {
        ProxyInfo proxyInfo = this.y;
        if (proxyInfo != null && Build.VERSION.SDK_INT >= 29) {
            builder.setHttpProxy(proxyInfo);
        } else if (proxyInfo != null) {
            z.z("HTTP Proxy needs Android 10 or later.");
        }
    }

    public void v3(String str, String str2, int i2, String str3) {
        long j2;
        int i3;
        this.f30317k = new d.a.a.d.b(str, str2);
        this.f30318l = i2;
        this.u = null;
        long jC = d.a.a.d.b.c(str2);
        if (this.f30317k.f30095b == 32 && !str2.equals("255.255.255.255")) {
            if ("net30".equals(str3)) {
                j2 = -4;
                i3 = 30;
            } else {
                j2 = -2;
                i3 = 31;
            }
            long j3 = jC & j2;
            long jB = this.f30317k.b() & j2;
            d.a.a.d.b bVar = this.f30317k;
            if (j3 == jB) {
                bVar.f30095b = i3;
            } else {
                bVar.f30095b = 32;
                if (!"p2p".equals(str3)) {
                    z.y(R.string.ip_not_cidr, str, str2, str3);
                }
            }
        }
        if (("p2p".equals(str3) && this.f30317k.f30095b < 32) || ("net30".equals(str3) && this.f30317k.f30095b < 30)) {
            z.y(R.string.ip_looks_like_subnet, str, str2, str3);
        }
        d.a.a.d.b bVar2 = this.f30317k;
        int i4 = bVar2.f30095b;
        if (i4 <= 31 && Build.VERSION.SDK_INT >= 21) {
            d.a.a.d.b bVar3 = new d.a.a.d.b(bVar2.f30094a, i4);
            bVar3.d();
            T2(bVar3, true);
        }
        this.u = str2;
    }

    public void w3(String str) {
        this.f30319m = str;
    }

    public void x3(int i2) {
        this.f30318l = i2;
    }

    public final void y3(String str, String str2, String str3, long j2, f fVar, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        int iD3 = d3(fVar);
        Notification.Builder builder = new Notification.Builder(this);
        int i2 = str3.equals("openvpn_bg") ? -2 : str3.equals("openvpn_userreq") ? 2 : 0;
        d.a.a.a aVar = this.f30315i;
        builder.setContentTitle(aVar != null ? getString(R.string.notifcation_title, new Object[]{aVar.f30070f}) : getString(R.string.notifcation_title_notconnect));
        builder.setContentText(str);
        builder.setOnlyAlertOnce(true);
        builder.setOngoing(true);
        builder.setSmallIcon(iD3);
        builder.setContentIntent(fVar == f.LEVEL_WAITING_FOR_USER_INPUT ? PendingIntent.getActivity(this, 0, intent, 0) : c3());
        if (j2 != 0) {
            builder.setWhen(j2);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 16) {
            l3(i2, builder);
            X2(builder);
        }
        if (i3 >= 21) {
            m3(builder, "service");
        }
        if (i3 >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel(str3, str3, 3));
            builder.setChannelId(str3);
            d.a.a.a aVar2 = this.f30315i;
            if (aVar2 != null) {
                builder.setShortcutId(aVar2.F());
            }
        }
        if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
            builder.setTicker(str2);
        }
        Notification notification = builder.getNotification();
        int iHashCode = str3.hashCode();
        notificationManager.notify(iHashCode, notification);
        startForeground(iHashCode, notification);
        String str4 = this.f30313g;
        if (str4 != null && !str3.equals(str4)) {
            notificationManager.cancel(this.f30313g.hashCode());
        }
        if (!r3() || i2 < 0) {
            return;
        }
        this.v.post(new b(str));
    }

    public final void z3() {
        String canonicalPath;
        Runnable runnable;
        try {
            this.f30315i.T(this);
            String str = getApplicationInfo().nativeLibraryDir;
            try {
                canonicalPath = getApplication().getCacheDir().getCanonicalPath();
            } catch (IOException e2) {
                e2.printStackTrace();
                canonicalPath = "/tmp";
            }
            String[] strArrA = y.a(this);
            this.p = true;
            A3();
            this.p = false;
            boolean zH = d.a.a.a.h(this);
            if (!zH) {
                r rVar = new r(this.f30315i, this);
                if (!rVar.p(this)) {
                    a3();
                    return;
                } else {
                    new Thread(rVar, "OpenVPNManagementThread").start();
                    this.r = rVar;
                    z.u("started Socket Thread");
                }
            }
            if (zH) {
                p pVarI3 = i3();
                runnable = (Runnable) pVarI3;
                this.r = pVarI3;
            } else {
                q qVar = new q(this, strArrA, str, canonicalPath);
                this.x = qVar;
                runnable = qVar;
            }
            synchronized (this.f30312f) {
                Thread thread = new Thread(runnable, "OpenVPNProcessThread");
                this.f30314h = thread;
                thread.start();
            }
            new Handler(getMainLooper()).post(new d());
        } catch (IOException e3) {
            z.s("Error writing config file", e3);
            a3();
        }
    }
}
