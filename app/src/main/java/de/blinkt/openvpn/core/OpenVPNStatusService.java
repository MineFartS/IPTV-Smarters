package de.blinkt.openvpn.core;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Pair;
import d.a.a.d.f;
import d.a.a.d.j;
import d.a.a.d.k;
import d.a.a.d.m;
import d.a.a.d.t;
import d.a.a.d.x;
import d.a.a.d.z;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class OpenVPNStatusService extends Service implements z.d, z.b, z.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f30330d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RemoteCallbackList<k> f30328b = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j.a f30329c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f30331e = new b(null);

    public static class a extends j.a {

        /* JADX INFO: renamed from: de.blinkt.openvpn.core.OpenVPNStatusService$a$a, reason: collision with other inner class name */
        public class C0305a extends Thread {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ParcelFileDescriptor[] f30332b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m[] f30333c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0305a(String str, ParcelFileDescriptor[] parcelFileDescriptorArr, m[] mVarArr) {
                super(str);
                this.f30332b = parcelFileDescriptorArr;
                this.f30333c = mVarArr;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DataOutputStream dataOutputStream = new DataOutputStream(new ParcelFileDescriptor.AutoCloseOutputStream(this.f30332b[1]));
                try {
                    Object obj = z.f30218k;
                    synchronized (obj) {
                        if (!z.f30217j) {
                            obj.wait();
                        }
                    }
                } catch (InterruptedException e2) {
                    z.r(e2);
                }
                try {
                    for (m mVar : this.f30333c) {
                        byte[] bArrC = mVar.c();
                        dataOutputStream.writeShort(bArrC.length);
                        dataOutputStream.write(bArrC);
                    }
                    dataOutputStream.writeShort(32767);
                    dataOutputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        }

        @Override // d.a.a.d.j
        public void B1(k kVar) {
            OpenVPNStatusService.f30328b.unregister(kVar);
        }

        @Override // d.a.a.d.j
        public ParcelFileDescriptor E1(k kVar) throws RemoteException {
            m[] mVarArrJ = z.j();
            c cVar = OpenVPNStatusService.f30330d;
            if (cVar != null) {
                OpenVPNStatusService.c(kVar, cVar);
            }
            OpenVPNStatusService.f30328b.register(kVar);
            try {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                new C0305a("pushLogs", parcelFileDescriptorArrCreatePipe, mVarArrJ).start();
                return parcelFileDescriptorArrCreatePipe[0];
            } catch (IOException e2) {
                e2.printStackTrace();
                if (Build.VERSION.SDK_INT < 15) {
                    return null;
                }
                throw new RemoteException(e2.getMessage());
            }
        }

        @Override // d.a.a.d.j
        public void W(String str, int i2, String str2) {
            t.d(str, i2, str2);
        }

        @Override // d.a.a.d.j
        public x d2() {
            return z.f30219l;
        }

        @Override // d.a.a.d.j
        public String r1() {
            return z.g();
        }
    }

    public static class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<OpenVPNStatusService> f30335a;

        public b() {
            this.f30335a = null;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public final void b(OpenVPNStatusService openVPNStatusService) {
            this.f30335a = new WeakReference<>(openVPNStatusService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            k kVar;
            WeakReference<OpenVPNStatusService> weakReference = this.f30335a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f30335a.get();
            RemoteCallbackList<k> remoteCallbackList = OpenVPNStatusService.f30328b;
            int iBeginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                try {
                    kVar = (k) remoteCallbackList.getBroadcastItem(i2);
                } catch (RemoteException unused) {
                }
                switch (message.what) {
                    case 100:
                        kVar.h2((m) message.obj);
                        continue;
                        break;
                    case 101:
                        OpenVPNStatusService.c(kVar, (c) message.obj);
                        continue;
                        break;
                    case 102:
                        Pair pair = (Pair) message.obj;
                        kVar.d0(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
                        continue;
                        break;
                    case 103:
                        kVar.R0((String) message.obj);
                        continue;
                        break;
                    default:
                        continue;
                        break;
                }
            }
            remoteCallbackList.finishBroadcast();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f30338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Intent f30339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f30340e;

        public c(String str, String str2, int i2, f fVar, Intent intent) {
            this.f30336a = str;
            this.f30340e = i2;
            this.f30337b = str2;
            this.f30338c = fVar;
            this.f30339d = intent;
        }
    }

    public static void c(k kVar, c cVar) {
        kVar.x0(cVar.f30336a, cVar.f30337b, cVar.f30340e, cVar.f30338c, cVar.f30339d);
    }

    @Override // d.a.a.d.z.e
    public void I2(String str) {
        f30331e.obtainMessage(103, str).sendToTarget();
    }

    @Override // d.a.a.d.z.e
    public void J(String str, String str2, int i2, f fVar, Intent intent) {
        c cVar = new c(str, str2, i2, fVar, intent);
        f30330d = cVar;
        f30331e.obtainMessage(101, cVar).sendToTarget();
    }

    @Override // d.a.a.d.z.d
    public void a(m mVar) {
        f30331e.obtainMessage(100, mVar).sendToTarget();
    }

    @Override // d.a.a.d.z.b
    public void c1(long j2, long j3, long j4, long j5) {
        f30331e.obtainMessage(102, Pair.create(Long.valueOf(j2), Long.valueOf(j3))).sendToTarget();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return f30329c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        z.b(this);
        z.a(this);
        z.c(this);
        f30331e.b(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        z.D(this);
        z.C(this);
        z.E(this);
        f30328b.kill();
    }
}
