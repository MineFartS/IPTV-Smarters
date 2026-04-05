package c.d.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c.d.a.o.m;

/* JADX INFO: loaded from: classes.dex */
public class e<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {
    public boolean A;
    public boolean B;
    public Drawable C;
    public int D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<ModelType> f5322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f5324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class<TranscodeType> f5325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f5326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.d.a.o.g f5327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.d.a.q.a<ModelType, DataType, ResourceType, TranscodeType> f5328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelType f5329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.d.a.n.c f5330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.d.a.r.d<? super ModelType, TranscodeType> f5334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f5335o;
    public e<?, ?, ?, TranscodeType> p;
    public Float q;
    public Drawable r;
    public Drawable s;
    public i t;
    public boolean u;
    public c.d.a.r.g.d<TranscodeType> v;
    public int w;
    public int x;
    public c.d.a.n.i.b y;
    public c.d.a.n.g<ResourceType> z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5336a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f5336a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5336a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5336a[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5336a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public e(Context context, Class<ModelType> cls, c.d.a.q.f<ModelType, DataType, ResourceType, TranscodeType> fVar, Class<TranscodeType> cls2, g gVar, m mVar, c.d.a.o.g gVar2) {
        this.f5330j = c.d.a.s.a.b();
        this.q = Float.valueOf(1.0f);
        this.t = null;
        this.u = true;
        this.v = c.d.a.r.g.e.d();
        this.w = -1;
        this.x = -1;
        this.y = c.d.a.n.i.b.RESULT;
        this.z = c.d.a.n.k.d.b();
        this.f5323c = context;
        this.f5322b = cls;
        this.f5325e = cls2;
        this.f5324d = gVar;
        this.f5326f = mVar;
        this.f5327g = gVar2;
        this.f5328h = fVar != null ? new c.d.a.q.a<>(fVar) : null;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        }
        if (cls != null && fVar == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    public e(c.d.a.q.f<ModelType, DataType, ResourceType, TranscodeType> fVar, Class<TranscodeType> cls, e<ModelType, ?, ?, ?> eVar) {
        this(eVar.f5323c, eVar.f5322b, fVar, cls, eVar.f5324d, eVar.f5326f, eVar.f5327g);
        this.f5329i = eVar.f5329i;
        this.f5331k = eVar.f5331k;
        this.f5330j = eVar.f5330j;
        this.y = eVar.y;
        this.u = eVar.u;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> a(c.d.a.r.g.d<TranscodeType> dVar) {
        if (dVar == null) {
            throw new NullPointerException("Animation factory must not be null!");
        }
        this.v = dVar;
        return this;
    }

    public void b() {
    }

    public void c() {
    }

    public final c.d.a.r.b e(c.d.a.r.h.j<TranscodeType> jVar) {
        if (this.t == null) {
            this.t = i.NORMAL;
        }
        return f(jVar, null);
    }

    public final c.d.a.r.b f(c.d.a.r.h.j<TranscodeType> jVar, c.d.a.r.f fVar) {
        c.d.a.r.f fVar2;
        c.d.a.r.b bVarO;
        c.d.a.r.b bVarO2;
        e<?, ?, ?, TranscodeType> eVar = this.p;
        if (eVar != null) {
            if (this.B) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (eVar.v.equals(c.d.a.r.g.e.d())) {
                this.p.v = this.v;
            }
            e<?, ?, ?, TranscodeType> eVar2 = this.p;
            if (eVar2.t == null) {
                eVar2.t = k();
            }
            if (c.d.a.t.h.k(this.x, this.w)) {
                e<?, ?, ?, TranscodeType> eVar3 = this.p;
                if (!c.d.a.t.h.k(eVar3.x, eVar3.w)) {
                    this.p.p(this.x, this.w);
                }
            }
            fVar2 = new c.d.a.r.f(fVar);
            bVarO = o(jVar, this.q.floatValue(), this.t, fVar2);
            this.B = true;
            bVarO2 = this.p.f(jVar, fVar2);
            this.B = false;
        } else {
            if (this.f5335o == null) {
                return o(jVar, this.q.floatValue(), this.t, fVar);
            }
            fVar2 = new c.d.a.r.f(fVar);
            bVarO = o(jVar, this.q.floatValue(), this.t, fVar2);
            bVarO2 = o(jVar, this.f5335o.floatValue(), k(), fVar2);
        }
        fVar2.l(bVarO, bVarO2);
        return fVar2;
    }

    @Override // 
    public e<ModelType, DataType, ResourceType, TranscodeType> g() {
        try {
            e<ModelType, DataType, ResourceType, TranscodeType> eVar = (e) super.clone();
            c.d.a.q.a<ModelType, DataType, ResourceType, TranscodeType> aVar = this.f5328h;
            eVar.f5328h = aVar != null ? aVar.clone() : null;
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> h(c.d.a.n.e<DataType, ResourceType> eVar) {
        c.d.a.q.a<ModelType, DataType, ResourceType, TranscodeType> aVar = this.f5328h;
        if (aVar != null) {
            aVar.j(eVar);
        }
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> j(c.d.a.n.i.b bVar) {
        this.y = bVar;
        return this;
    }

    public final i k() {
        i iVar = this.t;
        return iVar == i.LOW ? i.NORMAL : iVar == i.NORMAL ? i.HIGH : i.IMMEDIATE;
    }

    public c.d.a.r.h.j<TranscodeType> l(ImageView imageView) {
        c.d.a.t.h.a();
        if (imageView == null) {
            throw new IllegalArgumentException("You must pass in a non null View");
        }
        if (!this.A && imageView.getScaleType() != null) {
            int i2 = a.f5336a[imageView.getScaleType().ordinal()];
            if (i2 == 1) {
                b();
            } else if (i2 == 2 || i2 == 3 || i2 == 4) {
                c();
            }
        }
        return m(this.f5324d.c(imageView, this.f5325e));
    }

    public <Y extends c.d.a.r.h.j<TranscodeType>> Y m(Y y) {
        c.d.a.t.h.a();
        if (y == null) {
            throw new IllegalArgumentException("You must pass in a non null Target");
        }
        if (!this.f5331k) {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
        c.d.a.r.b bVarG = y.g();
        if (bVarG != null) {
            bVarG.clear();
            this.f5326f.c(bVarG);
            bVarG.b();
        }
        c.d.a.r.b bVarE = e(y);
        y.a(bVarE);
        this.f5327g.a(y);
        this.f5326f.f(bVarE);
        return y;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> n(ModelType modeltype) {
        this.f5329i = modeltype;
        this.f5331k = true;
        return this;
    }

    public final c.d.a.r.b o(c.d.a.r.h.j<TranscodeType> jVar, float f2, i iVar, c.d.a.r.c cVar) {
        return c.d.a.r.a.u(this.f5328h, this.f5329i, this.f5330j, this.f5323c, iVar, jVar, f2, this.r, this.f5332l, this.s, this.f5333m, this.C, this.D, this.f5334n, cVar, this.f5324d.p(), this.z, this.f5325e, this.u, this.v, this.x, this.w, this.y);
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> p(int i2, int i3) {
        if (!c.d.a.t.h.k(i2, i3)) {
            throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
        }
        this.x = i2;
        this.w = i3;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> q(c.d.a.n.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f5330j = cVar;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> r(boolean z) {
        this.u = !z;
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> u(c.d.a.n.b<DataType> bVar) {
        c.d.a.q.a<ModelType, DataType, ResourceType, TranscodeType> aVar = this.f5328h;
        if (aVar != null) {
            aVar.k(bVar);
        }
        return this;
    }

    public e<ModelType, DataType, ResourceType, TranscodeType> w(c.d.a.n.g<ResourceType>... gVarArr) {
        this.A = true;
        if (gVarArr.length == 1) {
            this.z = gVarArr[0];
        } else {
            this.z = new c.d.a.n.d(gVarArr);
        }
        return this;
    }
}
