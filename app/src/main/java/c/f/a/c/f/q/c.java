package c.f.a.c.f.q;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @RecentlyNonNull
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @RecentlyNonNull
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private c.f.a.c.f.b zzB;
    private boolean zzC;
    private volatile d1 zzD;
    public o1 zza;
    public final Handler zzb;

    @RecentlyNonNull
    public InterfaceC0159c zzc;

    @RecentlyNonNull
    public AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final h zzn;
    private final c.f.a.c.f.f zzo;
    private final Object zzp;
    private final Object zzq;

    @GuardedBy("mServiceBrokerLock")
    private l zzr;

    @GuardedBy("mLock")
    private T zzs;
    private final ArrayList<x0<?>> zzt;

    @GuardedBy("mLock")
    private z0 zzu;

    @GuardedBy("mLock")
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final c.f.a.c.f.d[] zze = new c.f.a.c.f.d[0];

    @RecentlyNonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i2);
    }

    public interface b {
        void onConnectionFailed(@RecentlyNonNull c.f.a.c.f.b bVar);
    }

    /* JADX INFO: renamed from: c.f.a.c.f.q.c$c, reason: collision with other inner class name */
    public interface InterfaceC0159c {
        void a(@RecentlyNonNull c.f.a.c.f.b bVar);
    }

    public class d implements InterfaceC0159c {
        public d() {
        }

        @Override // c.f.a.c.f.q.c.InterfaceC0159c
        public final void a(@RecentlyNonNull c.f.a.c.f.b bVar) {
            if (bVar.M()) {
                c cVar = c.this;
                cVar.getRemoteService(null, cVar.getScopes());
            } else if (c.this.zzx != null) {
                c.this.zzx.onConnectionFailed(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    public c(@RecentlyNonNull Context context, @RecentlyNonNull Handler handler, @RecentlyNonNull h hVar, @RecentlyNonNull c.f.a.c.f.f fVar, int i2, a aVar, b bVar) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        o.j(context, "Context must not be null");
        this.zzl = context;
        o.j(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        o.j(hVar, "Supervisor must not be null");
        this.zzn = hVar;
        o.j(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzy = i2;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i2, a aVar, b bVar, String str) {
        h hVarB = h.b(context);
        c.f.a.c.f.f fVarF = c.f.a.c.f.f.f();
        o.i(aVar);
        o.i(bVar);
        this(context, looper, hVarB, fVarF, i2, aVar, bVar, str);
    }

    public c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull h hVar, @RecentlyNonNull c.f.a.c.f.f fVar, int i2, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        o.j(context, "Context must not be null");
        this.zzl = context;
        o.j(looper, "Looper must not be null");
        this.zzm = looper;
        o.j(hVar, "Supervisor must not be null");
        this.zzn = hVar;
        o.j(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new w0(this, looper);
        this.zzy = i2;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public static /* synthetic */ void zzc(c cVar, int i2) {
        int i3;
        int i4;
        synchronized (cVar.zzp) {
            i3 = cVar.zzv;
        }
        if (i3 == 3) {
            cVar.zzC = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        Handler handler = cVar.zzb;
        handler.sendMessage(handler.obtainMessage(i4, cVar.zzd.get(), 16));
    }

    public static /* synthetic */ boolean zzg(c cVar) {
        if (cVar.zzC || TextUtils.isEmpty(cVar.getServiceDescriptor()) || TextUtils.isEmpty(cVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(cVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean zzl(c cVar, int i2, int i3, IInterface iInterface) {
        synchronized (cVar.zzp) {
            if (cVar.zzv != i2) {
                return false;
            }
            cVar.zzp(i3, iInterface);
            return true;
        }
    }

    public static /* synthetic */ void zzo(c cVar, d1 d1Var) {
        cVar.zzD = d1Var;
        if (cVar.usesClientTelemetry()) {
            c.f.a.c.f.q.e eVar = d1Var.f12576e;
            p.b().c(eVar == null ? null : eVar.N());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(int i2, T t) {
        o1 o1Var;
        o.a((i2 == 4) == (t != null));
        synchronized (this.zzp) {
            this.zzv = i2;
            this.zzs = t;
            if (i2 == 1) {
                z0 z0Var = this.zzu;
                if (z0Var != null) {
                    h hVar = this.zzn;
                    String strA = this.zza.a();
                    o.i(strA);
                    hVar.c(strA, this.zza.b(), this.zza.c(), z0Var, zza(), this.zza.d());
                    this.zzu = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                z0 z0Var2 = this.zzu;
                if (z0Var2 != null && (o1Var = this.zza) != null) {
                    String strA2 = o1Var.a();
                    String strB = this.zza.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(strA2).length() + 70 + String.valueOf(strB).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(strA2);
                    sb.append(" on ");
                    sb.append(strB);
                    Log.e("GmsClient", sb.toString());
                    h hVar2 = this.zzn;
                    String strA3 = this.zza.a();
                    o.i(strA3);
                    hVar2.c(strA3, this.zza.b(), this.zza.c(), z0Var2, zza(), this.zza.d());
                    this.zzd.incrementAndGet();
                }
                z0 z0Var3 = new z0(this, this.zzd.get());
                this.zzu = z0Var3;
                o1 o1Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new o1(getStartServicePackage(), getStartServiceAction(), false, h.a(), getUseDynamicLookup()) : new o1(getContext().getPackageName(), getLocalStartServiceAction(), true, h.a(), false);
                this.zza = o1Var2;
                if (o1Var2.d() && getMinApkVersion() < 17895000) {
                    String strValueOf = String.valueOf(this.zza.a());
                    throw new IllegalStateException(strValueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(strValueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                h hVar3 = this.zzn;
                String strA4 = this.zza.a();
                o.i(strA4);
                if (!hVar3.d(new h1(strA4, this.zza.b(), this.zza.c(), this.zza.d()), z0Var3, zza())) {
                    String strA5 = this.zza.a();
                    String strB2 = this.zza.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strA5).length() + 34 + String.valueOf(strB2).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(strA5);
                    sb2.append(" on ");
                    sb2.append(strB2);
                    Log.e("GmsClient", sb2.toString());
                    zzb(16, null, this.zzd.get());
                }
            } else if (i2 == 4) {
                o.i(t);
                onConnectedLocked(t);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iH = this.zzo.h(this.zzl, getMinApkVersion());
        if (iH == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), iH, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(@RecentlyNonNull InterfaceC0159c interfaceC0159c) {
        o.j(interfaceC0159c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0159c;
        zzp(2, null);
    }

    @RecentlyNullable
    public abstract T createServiceInterface(@RecentlyNonNull IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.zzt.get(i2).e();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void disconnect(@RecentlyNonNull String str) {
        this.zzk = str;
        disconnect();
    }

    public void dump(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
        int i2;
        T t;
        l lVar;
        synchronized (this.zzp) {
            i2 = this.zzv;
            t = this.zzs;
        }
        synchronized (this.zzq) {
            lVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append(Constants.NULL_VERSION_ID);
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (lVar == null) {
            printWriter.println(Constants.NULL_VERSION_ID);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(lVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.zzh;
            String str2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.zzf;
            printWriter.append((CharSequence) (i3 != 1 ? i3 != 2 ? i3 != 3 ? String.valueOf(i3) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.zzg;
            String str3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) c.f.a.c.f.o.d.a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j4 = this.zzj;
            String str4 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    @RecentlyNullable
    public Account getAccount() {
        return null;
    }

    @RecentlyNonNull
    public c.f.a.c.f.d[] getApiFeatures() {
        return zze;
    }

    @RecentlyNullable
    public final c.f.a.c.f.d[] getAvailableFeatures() {
        d1 d1Var = this.zzD;
        if (d1Var == null) {
            return null;
        }
        return d1Var.f12574c;
    }

    @RecentlyNullable
    public Bundle getConnectionHint() {
        return null;
    }

    @RecentlyNonNull
    public final Context getContext() {
        return this.zzl;
    }

    @RecentlyNonNull
    public String getEndpointPackageName() {
        o1 o1Var;
        if (!isConnected() || (o1Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return o1Var.b();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    @RecentlyNonNull
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @RecentlyNullable
    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    @RecentlyNullable
    public String getLocalStartServiceAction() {
        return null;
    }

    @RecentlyNonNull
    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return c.f.a.c.f.f.f12315a;
    }

    public void getRemoteService(i iVar, @RecentlyNonNull Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        f fVar = new f(this.zzy, this.zzA);
        fVar.f12586e = this.zzl.getPackageName();
        fVar.f12589h = getServiceRequestExtraArgs;
        if (set != null) {
            fVar.f12588g = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            fVar.f12590i = account;
            if (iVar != null) {
                fVar.f12587f = iVar.asBinder();
            }
        } else if (requiresAccount()) {
            fVar.f12590i = getAccount();
        }
        fVar.f12591j = zze;
        fVar.f12592k = getApiFeatures();
        if (usesClientTelemetry()) {
            fVar.f12595n = true;
        }
        try {
            synchronized (this.zzq) {
                l lVar = this.zzr;
                if (lVar != null) {
                    lVar.a0(new y0(this, this.zzd.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            triggerConnectionSuspended(3);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    @RecentlyNonNull
    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    public final T getService() {
        T t;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t = this.zzs;
            o.j(t, "Client is connected but service is null");
        }
        return t;
    }

    @RecentlyNullable
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            l lVar = this.zzr;
            if (lVar == null) {
                return null;
            }
            return lVar.asBinder();
        }
    }

    public abstract String getServiceDescriptor();

    @RecentlyNonNull
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    @RecentlyNonNull
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    @RecentlyNullable
    public c.f.a.c.f.q.e getTelemetryConfiguration() {
        d1 d1Var = this.zzD;
        if (d1Var == null) {
            return null;
        }
        return d1Var.f12576e;
    }

    public boolean getUseDynamicLookup() {
        return false;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i2 = this.zzv;
            z = true;
            if (i2 != 2 && i2 != 3) {
                z = false;
            }
        }
        return z;
    }

    public void onConnectedLocked(@RecentlyNonNull T t) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(@RecentlyNonNull c.f.a.c.f.b bVar) {
        this.zzi = bVar.I();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i2) {
        this.zzf = i2;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new a1(this, i2, iBinder, bundle)));
    }

    public void onUserSignOut(@RecentlyNonNull e eVar) {
        eVar.a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(@RecentlyNonNull String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i2) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i2));
    }

    public void triggerNotAvailable(@RecentlyNonNull InterfaceC0159c interfaceC0159c, int i2, PendingIntent pendingIntent) {
        o.j(interfaceC0159c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0159c;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i2, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    @RecentlyNonNull
    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i2, Bundle bundle, int i3) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new b1(this, i2, null)));
    }
}
