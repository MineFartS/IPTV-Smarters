package com.google.firebase.iid;

import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import c.f.a.c.f.q.o;
import c.f.a.c.f.t.q.a;
import c.f.a.c.o.d;
import c.f.a.c.o.l;
import c.f.c.c;
import c.f.c.p.f;
import c.f.c.q.h;
import c.f.c.q.j;
import c.f.c.q.p;
import c.f.c.q.q;
import c.f.c.q.r;
import c.f.c.q.s;
import c.f.c.q.w;
import c.f.c.q.y;
import c.f.c.q.z;
import c.f.c.r.b;
import c.f.c.s.g;
import c.f.c.v.i;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.GuardedBy;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FirebaseInstanceId {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static y f24655b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("FirebaseInstanceId.class")
    public static ScheduledExecutorService f24657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f24658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f24659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f24660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f24661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f24662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f24663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f24664k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f24654a = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f24656c = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId(c cVar, s sVar, Executor executor, Executor executor2, b<i> bVar, b<f> bVar2, g gVar) {
        this.f24664k = false;
        if (s.c(cVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f24655b == null) {
                f24655b = new y(cVar.g());
            }
        }
        this.f24659f = cVar;
        this.f24660g = sVar;
        this.f24661h = new p(cVar, sVar, bVar, bVar2, gVar);
        this.f24658e = executor2;
        this.f24662i = new w(executor);
        this.f24663j = gVar;
    }

    public FirebaseInstanceId(c cVar, b<i> bVar, b<f> bVar2, g gVar) {
        this(cVar, new s(cVar.g()), h.b(), h.b(), bVar, bVar2, gVar);
    }

    public static <T> T b(c.f.a.c.o.i<T> iVar) throws InterruptedException {
        o.j(iVar, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        iVar.c(j.f16195a, new d(countDownLatch) { // from class: c.f.c.q.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CountDownLatch f16196a;

            {
                this.f16196a = countDownLatch;
            }

            @Override // c.f.a.c.o.d
            public void a(c.f.a.c.o.i iVar2) {
                this.f16196a.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        return (T) k(iVar);
    }

    public static void d(c cVar) {
        o.f(cVar.j().e(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        o.f(cVar.j().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        o.f(cVar.j().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        o.b(t(cVar.j().c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.b(s(cVar.j().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(c cVar) {
        d(cVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) cVar.f(FirebaseInstanceId.class);
        o.j(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static <T> T k(c.f.a.c.o.i<T> iVar) {
        if (iVar.o()) {
            return iVar.k();
        }
        if (iVar.m()) {
            throw new CancellationException("Task is already canceled");
        }
        if (iVar.n()) {
            throw new IllegalStateException(iVar.j());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    public static boolean q() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    public static boolean s(@Nonnull String str) {
        return f24656c.matcher(str).matches();
    }

    public static boolean t(@Nonnull String str) {
        return str.contains(":");
    }

    public static String y(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    public synchronized void A(boolean z) {
        this.f24664k = z;
    }

    public synchronized void B() {
        if (this.f24664k) {
            return;
        }
        D(0L);
    }

    public final void C() {
        if (E(o())) {
            B();
        }
    }

    public synchronized void D(long j2) {
        e(new z(this, Math.min(Math.max(30L, j2 + j2), f24654a)), j2);
        this.f24664k = true;
    }

    public boolean E(y.a aVar) {
        return aVar == null || aVar.c(this.f24660g.a());
    }

    public final <T> T a(c.f.a.c.o.i<T> iVar) throws IOException {
        try {
            return (T) l.b(iVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    z();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e2);
        }
    }

    public String c() {
        return n(s.c(this.f24659f), "*");
    }

    public void e(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (f24657d == null) {
                f24657d = new ScheduledThreadPoolExecutor(1, new a("FirebaseInstanceId"));
            }
            f24657d.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public c f() {
        return this.f24659f;
    }

    @Deprecated
    public String g() {
        d(this.f24659f);
        C();
        return h();
    }

    public String h() {
        try {
            f24655b.i(this.f24659f.k());
            return (String) b(this.f24663j.getId());
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    public c.f.a.c.o.i<q> i() {
        d(this.f24659f);
        return j(s.c(this.f24659f), "*");
    }

    public final c.f.a.c.o.i<q> j(final String str, String str2) {
        final String strY = y(str2);
        return l.e(null).i(this.f24658e, new c.f.a.c.o.a(this, str, strY) { // from class: c.f.c.q.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FirebaseInstanceId f16192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f16193b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f16194c;

            {
                this.f16192a = this;
                this.f16193b = str;
                this.f16194c = strY;
            }

            @Override // c.f.a.c.o.a
            public Object a(c.f.a.c.o.i iVar) {
                return this.f16192a.x(this.f16193b, this.f16194c, iVar);
            }
        });
    }

    public final String l() {
        return "[DEFAULT]".equals(this.f24659f.i()) ? BuildConfig.FLAVOR : this.f24659f.k();
    }

    @Deprecated
    public String m() {
        d(this.f24659f);
        y.a aVarO = o();
        if (E(aVarO)) {
            B();
        }
        return y.a.b(aVarO);
    }

    @Deprecated
    public String n(String str, String str2) throws IOException {
        d(this.f24659f);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((q) a(j(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    public y.a o() {
        return p(s.c(this.f24659f), "*");
    }

    public y.a p(String str, String str2) {
        return f24655b.f(l(), str, str2);
    }

    public boolean r() {
        return this.f24660g.g();
    }

    public final /* synthetic */ c.f.a.c.o.i v(String str, String str2, String str3, String str4) {
        f24655b.h(l(), str, str2, str4, this.f24660g.a());
        return l.e(new r(str3, str4));
    }

    public final /* synthetic */ c.f.a.c.o.i w(final String str, final String str2, final String str3) {
        return this.f24661h.d(str, str2, str3).p(this.f24658e, new c.f.a.c.o.h(this, str2, str3, str) { // from class: c.f.c.q.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FirebaseInstanceId f16201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f16202b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f16203c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f16204d;

            {
                this.f16201a = this;
                this.f16202b = str2;
                this.f16203c = str3;
                this.f16204d = str;
            }

            @Override // c.f.a.c.o.h
            public c.f.a.c.o.i a(Object obj) {
                return this.f16201a.v(this.f16202b, this.f16203c, this.f16204d, (String) obj);
            }
        });
    }

    public final /* synthetic */ c.f.a.c.o.i x(final String str, final String str2, c.f.a.c.o.i iVar) {
        final String strH = h();
        y.a aVarP = p(str, str2);
        return !E(aVarP) ? l.e(new r(strH, aVarP.f16234b)) : this.f24662i.a(str, str2, new w.a(this, strH, str, str2) { // from class: c.f.c.q.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FirebaseInstanceId f16197a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f16198b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f16199c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f16200d;

            {
                this.f16197a = this;
                this.f16198b = strH;
                this.f16199c = str;
                this.f16200d = str2;
            }

            @Override // c.f.c.q.w.a
            public c.f.a.c.o.i start() {
                return this.f16197a.w(this.f16198b, this.f16199c, this.f16200d);
            }
        });
    }

    public synchronized void z() {
        f24655b.d();
    }
}
