package c.f.a.c.f.o.n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.o.a;
import c.f.a.c.f.q.c;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements a.f, ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12437a = l.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f12440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f12441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f12442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f12443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f12444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IBinder f12445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f12447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f12448l;

    public final void a(String str) {
        this.f12448l = str;
    }

    public final void b() {
        if (Thread.currentThread() != this.f12443g.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // c.f.a.c.f.o.a.f
    public final void connect(@RecentlyNonNull c.InterfaceC0159c interfaceC0159c) {
        b();
        f("Connect started.");
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f12440d;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f12438b).setAction(this.f12439c);
            }
            boolean zBindService = this.f12441e.bindService(intent, this, c.f.a.c.f.q.h.a());
            this.f12446j = zBindService;
            if (!zBindService) {
                this.f12445i = null;
                this.f12444h.onConnectionFailed(new c.f.a.c.f.b(16));
            }
            f("Finished connect.");
        } catch (SecurityException e2) {
            this.f12446j = false;
            this.f12445i = null;
            throw e2;
        }
    }

    public final /* synthetic */ void d() {
        this.f12446j = false;
        this.f12445i = null;
        f("Disconnected.");
        this.f12442f.onConnectionSuspended(1);
    }

    @Override // c.f.a.c.f.o.a.f
    public final void disconnect() {
        b();
        f("Disconnect called.");
        try {
            this.f12441e.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f12446j = false;
        this.f12445i = null;
    }

    @Override // c.f.a.c.f.o.a.f
    public final void disconnect(@RecentlyNonNull String str) {
        b();
        this.f12447k = str;
        disconnect();
    }

    public final /* synthetic */ void e(IBinder iBinder) {
        this.f12446j = false;
        this.f12445i = iBinder;
        f("Connected.");
        this.f12442f.onConnected(new Bundle());
    }

    public final void f(String str) {
        String strValueOf = String.valueOf(this.f12445i);
        str.length();
        strValueOf.length();
    }

    @Override // c.f.a.c.f.o.a.f
    @RecentlyNonNull
    public final c.f.a.c.f.d[] getAvailableFeatures() {
        return new c.f.a.c.f.d[0];
    }

    @Override // c.f.a.c.f.o.a.f
    @RecentlyNonNull
    public final String getEndpointPackageName() {
        String str = this.f12438b;
        if (str != null) {
            return str;
        }
        c.f.a.c.f.q.o.i(this.f12440d);
        return this.f12440d.getPackageName();
    }

    @Override // c.f.a.c.f.o.a.f
    @RecentlyNullable
    public final String getLastDisconnectMessage() {
        return this.f12447k;
    }

    @Override // c.f.a.c.f.o.a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // c.f.a.c.f.o.a.f
    public final void getRemoteService(c.f.a.c.f.q.i iVar, Set<Scope> set) {
    }

    @Override // c.f.a.c.f.o.a.f
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override // c.f.a.c.f.o.a.f
    public final boolean isConnected() {
        b();
        return this.f12445i != null;
    }

    @Override // c.f.a.c.f.o.a.f
    public final boolean isConnecting() {
        b();
        return this.f12446j;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull final IBinder iBinder) {
        this.f12443g.post(new Runnable(this, iBinder) { // from class: c.f.a.c.f.o.n.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final l f12465b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final IBinder f12466c;

            {
                this.f12465b = this;
                this.f12466c = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12465b.e(this.f12466c);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
        this.f12443g.post(new Runnable(this) { // from class: c.f.a.c.f.o.n.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final l f12483b;

            {
                this.f12483b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12483b.d();
            }
        });
    }

    @Override // c.f.a.c.f.o.a.f
    public final void onUserSignOut(@RecentlyNonNull c.e eVar) {
    }

    @Override // c.f.a.c.f.o.a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // c.f.a.c.f.o.a.f
    public final boolean requiresSignIn() {
        return false;
    }
}
