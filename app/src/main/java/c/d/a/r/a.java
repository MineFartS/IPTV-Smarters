package c.d.a.r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import c.d.a.i;
import c.d.a.n.g;
import c.d.a.n.i.c;
import c.d.a.n.i.l;
import c.d.a.r.h.h;
import c.d.a.r.h.j;
import java.util.Queue;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class a<A, T, Z, R> implements b, h, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Queue<a<?, ?, ?, ?>> f5898a = c.d.a.t.h.c(0);
    public l<?> A;
    public c.C0102c B;
    public long C;
    public EnumC0111a D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5899b = String.valueOf(hashCode());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.d.a.n.c f5900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f5901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f5905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g<Z> f5906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.d.a.q.f<A, T, Z, R> f5907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f5908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public A f5909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Class<R> f5910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f5912o;
    public j<R> p;
    public d<? super A, R> q;
    public float r;
    public c.d.a.n.i.c s;
    public c.d.a.r.g.d<R> t;
    public int u;
    public int v;
    public c.d.a.n.i.b w;
    public Drawable x;
    public Drawable y;
    public boolean z;

    /* JADX INFO: renamed from: c.d.a.r.a$a, reason: collision with other inner class name */
    public enum EnumC0111a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    public static void l(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(" must not be null");
            if (str2 != null) {
                sb.append(", ");
                sb.append(str2);
            }
            throw new NullPointerException(sb.toString());
        }
    }

    public static <A, T, Z, R> a<A, T, Z, R> u(c.d.a.q.f<A, T, Z, R> fVar, A a2, c.d.a.n.c cVar, Context context, i iVar, j<R> jVar, float f2, Drawable drawable, int i2, Drawable drawable2, int i3, Drawable drawable3, int i4, d<? super A, R> dVar, c cVar2, c.d.a.n.i.c cVar3, g<Z> gVar, Class<R> cls, boolean z, c.d.a.r.g.d<R> dVar2, int i5, int i6, c.d.a.n.i.b bVar) {
        a<A, T, Z, R> aVar = (a) f5898a.poll();
        if (aVar == null) {
            aVar = new a<>();
        }
        aVar.p(fVar, a2, cVar, context, iVar, jVar, f2, drawable, i2, drawable2, i3, drawable3, i4, dVar, cVar2, cVar3, gVar, cls, z, dVar2, i5, i6, bVar);
        return aVar;
    }

    @Override // c.d.a.r.e
    public void a(Exception exc) {
        if (Log.isLoggable("GenericRequest", 3)) {
            Log.d("GenericRequest", "load failed", exc);
        }
        this.D = EnumC0111a.FAILED;
        d<? super A, R> dVar = this.q;
        if (dVar == null || !dVar.a(exc, this.f5909l, this.p, r())) {
            x(exc);
        }
    }

    @Override // c.d.a.r.b
    public void b() {
        this.f5907j = null;
        this.f5909l = null;
        this.f5905h = null;
        this.p = null;
        this.x = null;
        this.y = null;
        this.f5901d = null;
        this.q = null;
        this.f5908k = null;
        this.f5906i = null;
        this.t = null;
        this.z = false;
        this.B = null;
        f5898a.offer(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.d.a.r.e
    public void c(l<?> lVar) {
        if (lVar == null) {
            a(new Exception("Expected to receive a Resource<R> with an object of " + this.f5910m + " inside, but instead got null."));
            return;
        }
        Object obj = lVar.get();
        if (obj != null && this.f5910m.isAssignableFrom(obj.getClass())) {
            if (j()) {
                v(lVar, obj);
                return;
            } else {
                w(lVar);
                this.D = EnumC0111a.COMPLETE;
                return;
            }
        }
        w(lVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.f5910m);
        sb.append(" but instead got ");
        String str = BuildConfig.FLAVOR;
        sb.append(obj != null ? obj.getClass() : BuildConfig.FLAVOR);
        sb.append("{");
        sb.append(obj);
        sb.append("}");
        sb.append(" inside Resource{");
        sb.append(lVar);
        sb.append("}.");
        if (obj == null) {
            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
        }
        sb.append(str);
        a(new Exception(sb.toString()));
    }

    @Override // c.d.a.r.b
    public void clear() {
        c.d.a.t.h.a();
        EnumC0111a enumC0111a = this.D;
        EnumC0111a enumC0111a2 = EnumC0111a.CLEARED;
        if (enumC0111a == enumC0111a2) {
            return;
        }
        k();
        l<?> lVar = this.A;
        if (lVar != null) {
            w(lVar);
        }
        if (i()) {
            this.p.h(o());
        }
        this.D = enumC0111a2;
    }

    @Override // c.d.a.r.b
    public boolean d() {
        return h();
    }

    @Override // c.d.a.r.h.h
    public void e(int i2, int i3) {
        if (Log.isLoggable("GenericRequest", 2)) {
            s("Got onSizeReady in " + c.d.a.t.d.a(this.C));
        }
        if (this.D != EnumC0111a.WAITING_FOR_SIZE) {
            return;
        }
        this.D = EnumC0111a.RUNNING;
        int iRound = Math.round(this.r * i2);
        int iRound2 = Math.round(this.r * i3);
        c.d.a.n.h.c<T> cVarA = this.f5907j.g().a(this.f5909l, iRound, iRound2);
        if (cVarA == null) {
            a(new Exception("Failed to load model: '" + this.f5909l + "'"));
            return;
        }
        c.d.a.n.k.j.c<Z, R> cVarB = this.f5907j.b();
        if (Log.isLoggable("GenericRequest", 2)) {
            s("finished setup for calling load in " + c.d.a.t.d.a(this.C));
        }
        this.z = true;
        this.B = this.s.g(this.f5900c, iRound, iRound2, cVarA, this.f5907j, this.f5906i, cVarB, this.f5912o, this.f5911n, this.w, this);
        this.z = this.A != null;
        if (Log.isLoggable("GenericRequest", 2)) {
            s("finished onSizeReady in " + c.d.a.t.d.a(this.C));
        }
    }

    @Override // c.d.a.r.b
    public void g() {
        this.C = c.d.a.t.d.b();
        if (this.f5909l == null) {
            a(null);
            return;
        }
        this.D = EnumC0111a.WAITING_FOR_SIZE;
        if (c.d.a.t.h.k(this.u, this.v)) {
            e(this.u, this.v);
        } else {
            this.p.i(this);
        }
        if (!h() && !q() && i()) {
            this.p.f(o());
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            s("finished run method in " + c.d.a.t.d.a(this.C));
        }
    }

    @Override // c.d.a.r.b
    public boolean h() {
        return this.D == EnumC0111a.COMPLETE;
    }

    public final boolean i() {
        c cVar = this.f5908k;
        return cVar == null || cVar.c(this);
    }

    @Override // c.d.a.r.b
    public boolean isCancelled() {
        EnumC0111a enumC0111a = this.D;
        return enumC0111a == EnumC0111a.CANCELLED || enumC0111a == EnumC0111a.CLEARED;
    }

    @Override // c.d.a.r.b
    public boolean isRunning() {
        EnumC0111a enumC0111a = this.D;
        return enumC0111a == EnumC0111a.RUNNING || enumC0111a == EnumC0111a.WAITING_FOR_SIZE;
    }

    public final boolean j() {
        c cVar = this.f5908k;
        return cVar == null || cVar.e(this);
    }

    public void k() {
        this.D = EnumC0111a.CANCELLED;
        c.C0102c c0102c = this.B;
        if (c0102c != null) {
            c0102c.a();
            this.B = null;
        }
    }

    public final Drawable m() {
        if (this.y == null && this.f5904g > 0) {
            this.y = this.f5905h.getResources().getDrawable(this.f5904g);
        }
        return this.y;
    }

    public final Drawable n() {
        if (this.f5901d == null && this.f5902e > 0) {
            this.f5901d = this.f5905h.getResources().getDrawable(this.f5902e);
        }
        return this.f5901d;
    }

    public final Drawable o() {
        if (this.x == null && this.f5903f > 0) {
            this.x = this.f5905h.getResources().getDrawable(this.f5903f);
        }
        return this.x;
    }

    public final void p(c.d.a.q.f<A, T, Z, R> fVar, A a2, c.d.a.n.c cVar, Context context, i iVar, j<R> jVar, float f2, Drawable drawable, int i2, Drawable drawable2, int i3, Drawable drawable3, int i4, d<? super A, R> dVar, c cVar2, c.d.a.n.i.c cVar3, g<Z> gVar, Class<R> cls, boolean z, c.d.a.r.g.d<R> dVar2, int i5, int i6, c.d.a.n.i.b bVar) {
        Object objE;
        String str;
        String str2;
        this.f5907j = fVar;
        this.f5909l = a2;
        this.f5900c = cVar;
        this.f5901d = drawable3;
        this.f5902e = i4;
        this.f5905h = context.getApplicationContext();
        this.f5912o = iVar;
        this.p = jVar;
        this.r = f2;
        this.x = drawable;
        this.f5903f = i2;
        this.y = drawable2;
        this.f5904g = i3;
        this.q = dVar;
        this.f5908k = cVar2;
        this.s = cVar3;
        this.f5906i = gVar;
        this.f5910m = cls;
        this.f5911n = z;
        this.t = dVar2;
        this.u = i5;
        this.v = i6;
        this.w = bVar;
        this.D = EnumC0111a.PENDING;
        if (a2 != null) {
            l("ModelLoader", fVar.g(), "try .using(ModelLoader)");
            l("Transcoder", fVar.b(), "try .as*(Class).transcode(ResourceTranscoder)");
            l("Transformation", gVar, "try .transform(UnitTransformation.get())");
            if (bVar.cacheSource()) {
                objE = fVar.a();
                str = "SourceEncoder";
                str2 = "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)";
            } else {
                objE = fVar.e();
                str = "SourceDecoder";
                str2 = "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)";
            }
            l(str, objE, str2);
            if (bVar.cacheSource() || bVar.cacheResult()) {
                l("CacheDecoder", fVar.f(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (bVar.cacheResult()) {
                l("Encoder", fVar.c(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    @Override // c.d.a.r.b
    public void pause() {
        clear();
        this.D = EnumC0111a.PAUSED;
    }

    public boolean q() {
        return this.D == EnumC0111a.FAILED;
    }

    public final boolean r() {
        c cVar = this.f5908k;
        return cVar == null || !cVar.a();
    }

    public final void s(String str) {
        Log.v("GenericRequest", str + " this: " + this.f5899b);
    }

    public final void t() {
        c cVar = this.f5908k;
        if (cVar != null) {
            cVar.f(this);
        }
    }

    public final void v(l<?> lVar, R r) {
        boolean zR = r();
        this.D = EnumC0111a.COMPLETE;
        this.A = lVar;
        d<? super A, R> dVar = this.q;
        if (dVar == null || !dVar.b(r, this.f5909l, this.p, this.z, zR)) {
            this.p.b(r, this.t.a(this.z, zR));
        }
        t();
        if (Log.isLoggable("GenericRequest", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resource ready in ");
            sb.append(c.d.a.t.d.a(this.C));
            sb.append(" size: ");
            double size = lVar.getSize();
            Double.isNaN(size);
            sb.append(size * 9.5367431640625E-7d);
            sb.append(" fromCache: ");
            sb.append(this.z);
            s(sb.toString());
        }
    }

    public final void w(l lVar) {
        this.s.k(lVar);
        this.A = null;
    }

    public final void x(Exception exc) {
        if (i()) {
            Drawable drawableN = this.f5909l == null ? n() : null;
            if (drawableN == null) {
                drawableN = m();
            }
            if (drawableN == null) {
                drawableN = o();
            }
            this.p.d(exc, drawableN);
        }
    }
}
