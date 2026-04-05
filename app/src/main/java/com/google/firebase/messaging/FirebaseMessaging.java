package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Keep;
import c.f.a.a.g;
import c.f.a.c.f.q.o;
import c.f.a.c.o.i;
import c.f.c.c;
import c.f.c.o.b;
import c.f.c.o.d;
import c.f.c.p.f;
import c.f.c.q.s;
import c.f.c.u.c0;
import c.f.c.u.h;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"FirebaseUnknownNullness"})
    public static g f24666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f24667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f24668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseInstanceId f24669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f24670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f24671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i<c0> f24672g;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f24673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @GuardedBy("this")
        public boolean f24674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @GuardedBy("this")
        public b<c.f.c.a> f24675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @GuardedBy("this")
        public Boolean f24676d;

        public a(d dVar) {
            this.f24673a = dVar;
        }

        public synchronized void a() {
            if (this.f24674b) {
                return;
            }
            Boolean boolE = e();
            this.f24676d = boolE;
            if (boolE == null) {
                b<c.f.c.a> bVar = new b(this) { // from class: c.f.c.u.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FirebaseMessaging.a f16386a;

                    {
                        this.f16386a = this;
                    }

                    @Override // c.f.c.o.b
                    public void a(c.f.c.o.a aVar) {
                        this.f16386a.d(aVar);
                    }
                };
                this.f24675c = bVar;
                this.f24673a.a(c.f.c.a.class, bVar);
            }
            this.f24674b = true;
        }

        public synchronized boolean b() {
            Boolean bool;
            a();
            bool = this.f24676d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f24668c.p();
        }

        public final /* synthetic */ void c() {
            FirebaseMessaging.this.f24669d.m();
        }

        public final /* synthetic */ void d(c.f.c.o.a aVar) {
            if (b()) {
                FirebaseMessaging.this.f24671f.execute(new Runnable(this) { // from class: c.f.c.u.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final FirebaseMessaging.a f16387b;

                    {
                        this.f16387b = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.f16387b.c();
                    }
                });
            }
        }

        public final Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextG = FirebaseMessaging.this.f24668c.g();
            SharedPreferences sharedPreferences = contextG.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextG.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextG.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(c cVar, final FirebaseInstanceId firebaseInstanceId, c.f.c.r.b<c.f.c.v.i> bVar, c.f.c.r.b<f> bVar2, c.f.c.s.g gVar, g gVar2, d dVar) {
        try {
            Class.forName("com.google.firebase.iid.FirebaseInstanceIdReceiver");
            f24666a = gVar2;
            this.f24668c = cVar;
            this.f24669d = firebaseInstanceId;
            this.f24670e = new a(dVar);
            Context contextG = cVar.g();
            this.f24667b = contextG;
            ScheduledExecutorService scheduledExecutorServiceB = h.b();
            this.f24671f = scheduledExecutorServiceB;
            scheduledExecutorServiceB.execute(new Runnable(this, firebaseInstanceId) { // from class: c.f.c.u.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final FirebaseMessaging f16383b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final FirebaseInstanceId f16384c;

                {
                    this.f16383b = this;
                    this.f16384c = firebaseInstanceId;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f16383b.f(this.f16384c);
                }
            });
            i<c0> iVarD = c0.d(cVar, firebaseInstanceId, new s(contextG), bVar, bVar2, gVar, contextG, h.e());
            this.f24672g = iVarD;
            iVarD.g(h.f(), new c.f.a.c.o.f(this) { // from class: c.f.c.u.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FirebaseMessaging f16385a;

                {
                    this.f16385a = this;
                }

                @Override // c.f.a.c.o.f
                public void a(Object obj) {
                    this.f16385a.g((c0) obj);
                }
            });
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("FirebaseMessaging and FirebaseInstanceId versions not compatible. Update to latest version of firebase-messaging.");
        }
    }

    public static g d() {
        return f24666a;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(c cVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) cVar.f(FirebaseMessaging.class);
        o.j(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public boolean e() {
        return this.f24670e.b();
    }

    public final /* synthetic */ void f(FirebaseInstanceId firebaseInstanceId) {
        if (this.f24670e.b()) {
            firebaseInstanceId.m();
        }
    }

    public final /* synthetic */ void g(c0 c0Var) {
        if (e()) {
            c0Var.o();
        }
    }
}
