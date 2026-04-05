package c.f.a.c.f.o;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.a.d;
import c.f.a.c.f.o.f;
import c.f.a.c.f.o.n.d0;
import c.f.a.c.f.o.n.h0;
import c.f.a.c.f.o.n.j;
import c.f.a.c.f.o.n.n;
import c.f.a.c.f.o.n.s;
import c.f.a.c.f.o.n.u;
import c.f.a.c.f.o.n.z0;
import c.f.a.c.f.q.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e<O extends a.d> {

    @RecentlyNonNull
    public final c.f.a.c.f.o.n.g zaa;
    private final Context zab;
    private final String zac;
    private final c.f.a.c.f.o.a<O> zad;
    private final O zae;
    private final c.f.a.c.f.o.n.b<O> zaf;
    private final Looper zag;
    private final int zah;

    @NotOnlyInitialized
    private final f zai;
    private final c.f.a.c.f.o.n.q zaj;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public static final a f12357a = new C0158a().a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public final c.f.a.c.f.o.n.q f12358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public final Looper f12359c;

        /* JADX INFO: renamed from: c.f.a.c.f.o.e$a$a, reason: collision with other inner class name */
        public static class C0158a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public c.f.a.c.f.o.n.q f12360a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Looper f12361b;

            @RecentlyNonNull
            public a a() {
                if (this.f12360a == null) {
                    this.f12360a = new c.f.a.c.f.o.n.a();
                }
                if (this.f12361b == null) {
                    this.f12361b = Looper.getMainLooper();
                }
                return new a(this.f12360a, this.f12361b);
            }

            @RecentlyNonNull
            public C0158a b(@RecentlyNonNull Looper looper) {
                c.f.a.c.f.q.o.j(looper, "Looper must not be null.");
                this.f12361b = looper;
                return this;
            }

            @RecentlyNonNull
            public C0158a c(@RecentlyNonNull c.f.a.c.f.o.n.q qVar) {
                c.f.a.c.f.q.o.j(qVar, "StatusExceptionMapper must not be null.");
                this.f12360a = qVar;
                return this;
            }
        }

        public a(c.f.a.c.f.o.n.q qVar, Account account, Looper looper) {
            this.f12358b = qVar;
            this.f12359c = looper;
        }
    }

    public e(@RecentlyNonNull Activity activity, @RecentlyNonNull c.f.a.c.f.o.a<O> aVar, @RecentlyNonNull O o2, @RecentlyNonNull a aVar2) {
        c.f.a.c.f.q.o.j(activity, "Null activity is not permitted.");
        c.f.a.c.f.q.o.j(aVar, "Api must not be null.");
        c.f.a.c.f.q.o.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = activity.getApplicationContext();
        this.zab = applicationContext;
        String strZaf = zaf(activity);
        this.zac = strZaf;
        this.zad = aVar;
        this.zae = o2;
        this.zag = aVar2.f12359c;
        c.f.a.c.f.o.n.b<O> bVarA = c.f.a.c.f.o.n.b.a(aVar, o2, strZaf);
        this.zaf = bVarA;
        this.zai = new h0(this);
        c.f.a.c.f.o.n.g gVarM = c.f.a.c.f.o.n.g.m(applicationContext);
        this.zaa = gVarM;
        this.zah = gVarM.n();
        this.zaj = aVar2.f12358b;
        if (!(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            u.t(activity, gVarM, bVarA);
        }
        gVarM.o(this);
    }

    @Deprecated
    public e(@RecentlyNonNull Activity activity, @RecentlyNonNull c.f.a.c.f.o.a<O> aVar, @RecentlyNonNull O o2, @RecentlyNonNull c.f.a.c.f.o.n.q qVar) {
        a.C0158a c0158a = new a.C0158a();
        c0158a.c(qVar);
        c0158a.b(activity.getMainLooper());
        this(activity, (c.f.a.c.f.o.a) aVar, (a.d) o2, c0158a.a());
    }

    @Deprecated
    public e(@RecentlyNonNull Context context, @RecentlyNonNull c.f.a.c.f.o.a<O> aVar, @RecentlyNonNull O o2, @RecentlyNonNull Looper looper, @RecentlyNonNull c.f.a.c.f.o.n.q qVar) {
        a.C0158a c0158a = new a.C0158a();
        c0158a.b(looper);
        c0158a.c(qVar);
        this(context, aVar, o2, c0158a.a());
    }

    public e(@RecentlyNonNull Context context, @RecentlyNonNull c.f.a.c.f.o.a<O> aVar, @RecentlyNonNull O o2, @RecentlyNonNull a aVar2) {
        c.f.a.c.f.q.o.j(context, "Null context is not permitted.");
        c.f.a.c.f.q.o.j(aVar, "Api must not be null.");
        c.f.a.c.f.q.o.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.zab = applicationContext;
        String strZaf = zaf(context);
        this.zac = strZaf;
        this.zad = aVar;
        this.zae = o2;
        this.zag = aVar2.f12359c;
        this.zaf = c.f.a.c.f.o.n.b.a(aVar, o2, strZaf);
        this.zai = new h0(this);
        c.f.a.c.f.o.n.g gVarM = c.f.a.c.f.o.n.g.m(applicationContext);
        this.zaa = gVarM;
        this.zah = gVarM.n();
        this.zaj = aVar2.f12358b;
        gVarM.o(this);
    }

    @Deprecated
    public e(@RecentlyNonNull Context context, @RecentlyNonNull c.f.a.c.f.o.a<O> aVar, @RecentlyNonNull O o2, @RecentlyNonNull c.f.a.c.f.o.n.q qVar) {
        a.C0158a c0158a = new a.C0158a();
        c0158a.c(qVar);
        this(context, aVar, o2, c0158a.a());
    }

    private final <A extends a.b, T extends c.f.a.c.f.o.n.d<? extends j, A>> T zad(int i2, T t) {
        t.l();
        this.zaa.u(this, i2, t);
        return t;
    }

    private final <TResult, A extends a.b> c.f.a.c.o.i<TResult> zae(int i2, c.f.a.c.f.o.n.r<A, TResult> rVar) {
        c.f.a.c.o.j jVar = new c.f.a.c.o.j();
        this.zaa.v(this, i2, rVar, jVar, this.zaj);
        return jVar.a();
    }

    private static String zaf(Object obj) {
        if (!c.f.a.c.f.t.l.l()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @RecentlyNonNull
    public f asGoogleApiClient() {
        return this.zai;
    }

    @RecentlyNonNull
    public d.a createClientSettingsBuilder() {
        Account accountB;
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        d.a aVar = new d.a();
        O o2 = this.zae;
        if (!(o2 instanceof a.d.b) || (googleSignInAccountA2 = ((a.d.b) o2).a()) == null) {
            O o3 = this.zae;
            accountB = o3 instanceof a.d.InterfaceC0157a ? ((a.d.InterfaceC0157a) o3).b() : null;
        } else {
            accountB = googleSignInAccountA2.I();
        }
        aVar.c(accountB);
        O o4 = this.zae;
        aVar.d((!(o4 instanceof a.d.b) || (googleSignInAccountA = ((a.d.b) o4).a()) == null) ? Collections.emptySet() : googleSignInAccountA.Q());
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    @RecentlyNonNull
    public c.f.a.c.o.i<Boolean> disconnectService() {
        return this.zaa.t(this);
    }

    @RecentlyNonNull
    public <A extends a.b, T extends c.f.a.c.f.o.n.d<? extends j, A>> T doBestEffortWrite(@RecentlyNonNull T t) {
        zad(2, t);
        return t;
    }

    @RecentlyNonNull
    public <TResult, A extends a.b> c.f.a.c.o.i<TResult> doBestEffortWrite(@RecentlyNonNull c.f.a.c.f.o.n.r<A, TResult> rVar) {
        return zae(2, rVar);
    }

    @RecentlyNonNull
    public <A extends a.b, T extends c.f.a.c.f.o.n.d<? extends j, A>> T doRead(@RecentlyNonNull T t) {
        zad(0, t);
        return t;
    }

    @RecentlyNonNull
    public <TResult, A extends a.b> c.f.a.c.o.i<TResult> doRead(@RecentlyNonNull c.f.a.c.f.o.n.r<A, TResult> rVar) {
        return zae(0, rVar);
    }

    @RecentlyNonNull
    @Deprecated
    public <A extends a.b, T extends n<A, ?>, U extends s<A, ?>> c.f.a.c.o.i<Void> doRegisterEventListener(@RecentlyNonNull T t, @RecentlyNonNull U u) {
        c.f.a.c.f.q.o.i(t);
        c.f.a.c.f.q.o.i(u);
        c.f.a.c.f.q.o.j(t.b(), "Listener has already been released.");
        c.f.a.c.f.q.o.j(u.a(), "Listener has already been released.");
        c.f.a.c.f.q.o.b(c.f.a.c.f.q.n.a(t.b(), u.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.x(this, t, u, o.f12541b);
    }

    @RecentlyNonNull
    public <A extends a.b> c.f.a.c.o.i<Void> doRegisterEventListener(@RecentlyNonNull c.f.a.c.f.o.n.o<A, ?> oVar) {
        c.f.a.c.f.q.o.i(oVar);
        c.f.a.c.f.q.o.j(oVar.f12469a.b(), "Listener has already been released.");
        c.f.a.c.f.q.o.j(oVar.f12470b.a(), "Listener has already been released.");
        return this.zaa.x(this, oVar.f12469a, oVar.f12470b, oVar.f12471c);
    }

    @RecentlyNonNull
    public c.f.a.c.o.i<Boolean> doUnregisterEventListener(@RecentlyNonNull j.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    @RecentlyNonNull
    public c.f.a.c.o.i<Boolean> doUnregisterEventListener(@RecentlyNonNull j.a<?> aVar, int i2) {
        c.f.a.c.f.q.o.j(aVar, "Listener key cannot be null.");
        return this.zaa.y(this, aVar, i2);
    }

    @RecentlyNonNull
    public <A extends a.b, T extends c.f.a.c.f.o.n.d<? extends j, A>> T doWrite(@RecentlyNonNull T t) {
        zad(1, t);
        return t;
    }

    @RecentlyNonNull
    public <TResult, A extends a.b> c.f.a.c.o.i<TResult> doWrite(@RecentlyNonNull c.f.a.c.f.o.n.r<A, TResult> rVar) {
        return zae(1, rVar);
    }

    @RecentlyNonNull
    public final c.f.a.c.f.o.n.b<O> getApiKey() {
        return this.zaf;
    }

    @RecentlyNonNull
    public O getApiOptions() {
        return this.zae;
    }

    @RecentlyNonNull
    public Context getApplicationContext() {
        return this.zab;
    }

    @RecentlyNullable
    public String getContextAttributionTag() {
        return this.zac;
    }

    @RecentlyNullable
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @RecentlyNonNull
    public Looper getLooper() {
        return this.zag;
    }

    @RecentlyNonNull
    public <L> c.f.a.c.f.o.n.j<L> registerListener(@RecentlyNonNull L l2, @RecentlyNonNull String str) {
        return c.f.a.c.f.o.n.k.a(l2, this.zag, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f zaa(Looper looper, d0<O> d0Var) {
        a.f fVarBuildClient = ((a.AbstractC0156a) c.f.a.c.f.q.o.i(this.zad.a())).buildClient(this.zab, looper, createClientSettingsBuilder().a(), this.zae, (f.a) d0Var, (f.b) d0Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (fVarBuildClient instanceof c.f.a.c.f.q.c)) {
            ((c.f.a.c.f.q.c) fVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (fVarBuildClient instanceof c.f.a.c.f.o.n.l)) {
            ((c.f.a.c.f.o.n.l) fVarBuildClient).a(contextAttributionTag);
        }
        return fVarBuildClient;
    }

    public final int zab() {
        return this.zah;
    }

    public final z0 zac(Context context, Handler handler) {
        return new z0(context, handler, createClientSettingsBuilder().a());
    }
}
