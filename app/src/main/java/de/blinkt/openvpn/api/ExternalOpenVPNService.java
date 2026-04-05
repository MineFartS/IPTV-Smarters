package de.blinkt.openvpn.api;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.VpnService;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.nst.iptvsmarterstvbox.R;
import d.a.a.c.d;
import d.a.a.d.c;
import d.a.a.d.f;
import d.a.a.d.i;
import d.a.a.d.v;
import d.a.a.d.y;
import d.a.a.d.z;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(15)
public class ExternalOpenVPNService extends Service implements z.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f30286b = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f30288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d.a.a.c.b f30289e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f30293i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemoteCallbackList<d.a.a.c.e> f30287c = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ServiceConnection f30290f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BroadcastReceiver f30291g = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d.a f30292h = new c();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ExternalOpenVPNService.this.f30288d = (i) iBinder;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ExternalOpenVPNService.this.f30288d = null;
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.UNINSTALL_PACKAGE".equals(intent.getAction())) {
                return;
            }
            d.a.a.a aVarI = v.i();
            if (v.l() && intent.getPackage().equals(aVarI.l0) && ExternalOpenVPNService.this.f30288d != null) {
                try {
                    ExternalOpenVPNService.this.f30288d.e(false);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public class c extends d.a {
        public c() {
        }

        @Override // d.a.a.c.d
        public void A0(String str) throws RemoteException {
            ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            d.a.a.a aVarC = v.c(ExternalOpenVPNService.this.getBaseContext(), str);
            if (aVarC.b(ExternalOpenVPNService.this.getApplicationContext()) == R.string.no_error_found) {
                J(aVarC);
            } else {
                ExternalOpenVPNService externalOpenVPNService = ExternalOpenVPNService.this;
                throw new RemoteException(externalOpenVPNService.getString(aVarC.b(externalOpenVPNService.getApplicationContext())));
            }
        }

        @Override // d.a.a.c.d
        public void D1(String str) {
            ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            v.g(ExternalOpenVPNService.this.getBaseContext()).n(ExternalOpenVPNService.this, v.c(ExternalOpenVPNService.this.getBaseContext(), str));
        }

        @Override // d.a.a.c.d
        public boolean G1(String str, String str2) {
            return w0(str, true, str2) != null;
        }

        @Override // d.a.a.c.d
        public Intent H2(String str) {
            if (new d.a.a.c.b(ExternalOpenVPNService.this).f(str)) {
                return null;
            }
            Intent intent = new Intent();
            intent.setClass(ExternalOpenVPNService.this, ConfirmDialog.class);
            return intent;
        }

        public final void J(d.a.a.a aVar) {
            Intent intentPrepare = VpnService.prepare(ExternalOpenVPNService.this);
            int iL = aVar.L(null, null);
            if (intentPrepare == null && iL == 0) {
                y.f(aVar, ExternalOpenVPNService.this.getBaseContext());
                return;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setClass(ExternalOpenVPNService.this.getBaseContext(), LaunchVPN.class);
            intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", aVar.F());
            intent.putExtra("de.blinkt.openvpn.showNoLogWindow", true);
            intent.addFlags(268435456);
            ExternalOpenVPNService.this.startActivity(intent);
        }

        @Override // d.a.a.c.d
        public void M(String str) throws RemoteException {
            n0(str, null);
        }

        @Override // d.a.a.c.d
        public void Q0(d.a.a.c.e eVar) {
            ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            if (eVar != null) {
                ExternalOpenVPNService.this.f30287c.unregister(eVar);
            }
        }

        @Override // d.a.a.c.d
        public void disconnect() {
            ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            if (ExternalOpenVPNService.this.f30288d != null) {
                ExternalOpenVPNService.this.f30288d.e(false);
            }
        }

        @Override // d.a.a.c.d
        public boolean g2(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
            ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            try {
                boolean zProtect = ExternalOpenVPNService.this.f30288d.protect(parcelFileDescriptor.getFd());
                parcelFileDescriptor.close();
                return zProtect;
            } catch (IOException e2) {
                throw new RemoteException(e2.getMessage());
            }
        }

        @Override // d.a.a.c.d
        public Intent j1() {
            ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            if (VpnService.prepare(ExternalOpenVPNService.this) == null) {
                return null;
            }
            return new Intent(ExternalOpenVPNService.this.getBaseContext(), (Class<?>) GrantPermissionsActivity.class);
        }

        @Override // d.a.a.c.d
        public void j2(d.a.a.c.e eVar) {
            ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            if (eVar != null) {
                eVar.p2(ExternalOpenVPNService.this.f30293i.f30301d, ExternalOpenVPNService.this.f30293i.f30298a, ExternalOpenVPNService.this.f30293i.f30299b, ExternalOpenVPNService.this.f30293i.f30300c.name());
                ExternalOpenVPNService.this.f30287c.register(eVar);
            }
        }

        @Override // d.a.a.c.d
        public void n0(String str, Bundle bundle) throws RemoteException {
            String strB = ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            d.a.a.d.c cVar = new d.a.a.d.c();
            try {
                cVar.n(new StringReader(str));
                d.a.a.a aVarF = cVar.f();
                aVarF.f30070f = "Remote APP VPN";
                if (aVarF.b(ExternalOpenVPNService.this.getApplicationContext()) != R.string.no_error_found) {
                    ExternalOpenVPNService externalOpenVPNService = ExternalOpenVPNService.this;
                    throw new RemoteException(externalOpenVPNService.getString(aVarF.b(externalOpenVPNService.getApplicationContext())));
                }
                aVarF.l0 = strB;
                if (bundle != null) {
                    aVarF.j0 = bundle.getBoolean("de.blinkt.openvpn.api.ALLOW_VPN_BYPASS", false);
                }
                v.t(ExternalOpenVPNService.this, aVarF);
                J(aVarF);
            } catch (c.a | IOException e2) {
                throw new RemoteException(e2.getMessage());
            }
        }

        @Override // d.a.a.c.d
        public void pause() {
            ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            if (ExternalOpenVPNService.this.f30288d != null) {
                ExternalOpenVPNService.this.f30288d.l2(true);
            }
        }

        @Override // d.a.a.c.d
        public List<d.a.a.c.a> r0() {
            ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            v vVarG = v.g(ExternalOpenVPNService.this.getBaseContext());
            LinkedList linkedList = new LinkedList();
            for (d.a.a.a aVar : vVarG.k()) {
                if (!aVar.f30068d) {
                    linkedList.add(new d.a.a.c.a(aVar.F(), aVar.f30070f, aVar.T, aVar.l0));
                }
            }
            return linkedList;
        }

        @Override // d.a.a.c.d
        public void resume() {
            ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            if (ExternalOpenVPNService.this.f30288d != null) {
                ExternalOpenVPNService.this.f30288d.l2(false);
            }
        }

        @Override // d.a.a.c.d
        public d.a.a.c.a w0(String str, boolean z, String str2) {
            String strB = ExternalOpenVPNService.this.f30289e.b(ExternalOpenVPNService.this.getPackageManager());
            d.a.a.d.c cVar = new d.a.a.d.c();
            try {
                cVar.n(new StringReader(str2));
                d.a.a.a aVarF = cVar.f();
                aVarF.f30070f = str;
                aVarF.l0 = strB;
                aVarF.T = z;
                v vVarG = v.g(ExternalOpenVPNService.this.getBaseContext());
                vVarG.a(aVarF);
                vVarG.o(ExternalOpenVPNService.this, aVarF);
                vVarG.q(ExternalOpenVPNService.this);
                return new d.a.a.c.a(aVarF.F(), aVarF.f30070f, aVarF.T, aVarF.l0);
            } catch (c.a e2) {
                z.r(e2);
                return null;
            } catch (IOException e3) {
                z.r(e3);
                return null;
            }
        }
    }

    public static class d extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<ExternalOpenVPNService> f30297a = null;

        public final void b(d.a.a.c.e eVar, e eVar2) {
            eVar.p2(eVar2.f30301d, eVar2.f30298a, eVar2.f30299b, eVar2.f30300c.name());
        }

        public final void c(ExternalOpenVPNService externalOpenVPNService) {
            this.f30297a = new WeakReference<>(externalOpenVPNService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<ExternalOpenVPNService> weakReference;
            if (message.what != 0 || (weakReference = this.f30297a) == null || weakReference.get() == null) {
                return;
            }
            RemoteCallbackList<d.a.a.c.e> remoteCallbackList = this.f30297a.get().f30287c;
            int iBeginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                try {
                    b((d.a.a.c.e) remoteCallbackList.getBroadcastItem(i2), (e) message.obj);
                } catch (RemoteException unused) {
                }
            }
            remoteCallbackList.finishBroadcast();
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f30300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f30301d;

        public e(String str, String str2, f fVar) {
            this.f30298a = str;
            this.f30299b = str2;
            this.f30300c = fVar;
        }
    }

    @Override // d.a.a.d.z.e
    public void I2(String str) {
    }

    @Override // d.a.a.d.z.e
    public void J(String str, String str2, int i2, f fVar, Intent intent) {
        this.f30293i = new e(str, str2, fVar);
        if (v.i() != null) {
            this.f30293i.f30301d = v.i().F();
        }
        f30286b.obtainMessage(0, this.f30293i).sendToTarget();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f30292h;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        z.c(this);
        this.f30289e = new d.a.a.c.b(this);
        Intent intent = new Intent(getBaseContext(), (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f30290f, 1);
        f30286b.c(this);
        registerReceiver(this.f30291g, new IntentFilter("android.intent.action.PACKAGE_REMOVED"));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f30287c.kill();
        unbindService(this.f30290f);
        z.E(this);
        unregisterReceiver(this.f30291g);
    }
}
