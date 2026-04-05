package c.f.a.b.j3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.amazonaws.services.s3.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f0 f9186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f9187b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<c>> f9188c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9189d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9190e = 0;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile boolean f9191a;
    }

    public interface c {
        void a(int i2);
    }

    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iF = f0.f(context);
            int i2 = x0.f9296a;
            if (i2 >= 29 && !b.f9191a && iF == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) g.e((TelephonyManager) context.getSystemService("phone"));
                    e eVar = new e();
                    if (i2 < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, Constants.MB);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            f0.this.k(iF);
        }
    }

    public class e extends PhoneStateListener {
        public e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            f0.this.k(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String string = serviceState == null ? BuildConfig.FLAVOR : serviceState.toString();
            f0.this.k(string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    public f0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized f0 c(Context context) {
        if (f9186a == null) {
            f9186a = new f0(context);
        }
        return f9186a;
    }

    public static int d(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return x0.f9296a >= 29 ? 9 : 0;
        }
    }

    public static int f(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i2 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i2 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return d(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h(c cVar) {
        cVar.a(e());
    }

    public int e() {
        int i2;
        synchronized (this.f9189d) {
            i2 = this.f9190e;
        }
        return i2;
    }

    public void i(final c cVar) {
        j();
        this.f9188c.add(new WeakReference<>(cVar));
        this.f9187b.post(new Runnable() { // from class: c.f.a.b.j3.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f9154b.h(cVar);
            }
        });
    }

    public final void j() {
        for (WeakReference<c> weakReference : this.f9188c) {
            if (weakReference.get() == null) {
                this.f9188c.remove(weakReference);
            }
        }
    }

    public final void k(int i2) {
        synchronized (this.f9189d) {
            if (this.f9190e == i2) {
                return;
            }
            this.f9190e = i2;
            for (WeakReference<c> weakReference : this.f9188c) {
                c cVar = weakReference.get();
                if (cVar != null) {
                    cVar.a(i2);
                } else {
                    this.f9188c.remove(weakReference);
                }
            }
        }
    }
}
