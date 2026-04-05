package c.f.a.d.j0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.d.j0.c f14923a = new i(0.5f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f14924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f14925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f14926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f14927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.f.a.d.j0.c f14928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.a.d.j0.c f14929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.f.a.d.j0.c f14930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.f.a.d.j0.c f14931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f14932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f14933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f14934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f14935m;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f14936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f14937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f14938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f14939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c.f.a.d.j0.c f14940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c.f.a.d.j0.c f14941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c.f.a.d.j0.c f14942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c.f.a.d.j0.c f14943h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f f14944i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public f f14945j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public f f14946k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public f f14947l;

        public b() {
            this.f14936a = h.b();
            this.f14937b = h.b();
            this.f14938c = h.b();
            this.f14939d = h.b();
            this.f14940e = new c.f.a.d.j0.a(0.0f);
            this.f14941f = new c.f.a.d.j0.a(0.0f);
            this.f14942g = new c.f.a.d.j0.a(0.0f);
            this.f14943h = new c.f.a.d.j0.a(0.0f);
            this.f14944i = h.c();
            this.f14945j = h.c();
            this.f14946k = h.c();
            this.f14947l = h.c();
        }

        public b(k kVar) {
            this.f14936a = h.b();
            this.f14937b = h.b();
            this.f14938c = h.b();
            this.f14939d = h.b();
            this.f14940e = new c.f.a.d.j0.a(0.0f);
            this.f14941f = new c.f.a.d.j0.a(0.0f);
            this.f14942g = new c.f.a.d.j0.a(0.0f);
            this.f14943h = new c.f.a.d.j0.a(0.0f);
            this.f14944i = h.c();
            this.f14945j = h.c();
            this.f14946k = h.c();
            this.f14947l = h.c();
            this.f14936a = kVar.f14924b;
            this.f14937b = kVar.f14925c;
            this.f14938c = kVar.f14926d;
            this.f14939d = kVar.f14927e;
            this.f14940e = kVar.f14928f;
            this.f14941f = kVar.f14929g;
            this.f14942g = kVar.f14930h;
            this.f14943h = kVar.f14931i;
            this.f14944i = kVar.f14932j;
            this.f14945j = kVar.f14933k;
            this.f14946k = kVar.f14934l;
            this.f14947l = kVar.f14935m;
        }

        public static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f14922a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f14888a;
            }
            return -1.0f;
        }

        public b A(float f2) {
            this.f14940e = new c.f.a.d.j0.a(f2);
            return this;
        }

        public b B(c.f.a.d.j0.c cVar) {
            this.f14940e = cVar;
            return this;
        }

        public b C(int i2, c.f.a.d.j0.c cVar) {
            return D(h.a(i2)).F(cVar);
        }

        public b D(d dVar) {
            this.f14937b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f2) {
            this.f14941f = new c.f.a.d.j0.a(f2);
            return this;
        }

        public b F(c.f.a.d.j0.c cVar) {
            this.f14941f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f2) {
            return A(f2).E(f2).w(f2).s(f2);
        }

        public b p(c.f.a.d.j0.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i2, c.f.a.d.j0.c cVar) {
            return r(h.a(i2)).t(cVar);
        }

        public b r(d dVar) {
            this.f14939d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f2) {
            this.f14943h = new c.f.a.d.j0.a(f2);
            return this;
        }

        public b t(c.f.a.d.j0.c cVar) {
            this.f14943h = cVar;
            return this;
        }

        public b u(int i2, c.f.a.d.j0.c cVar) {
            return v(h.a(i2)).x(cVar);
        }

        public b v(d dVar) {
            this.f14938c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f2) {
            this.f14942g = new c.f.a.d.j0.a(f2);
            return this;
        }

        public b x(c.f.a.d.j0.c cVar) {
            this.f14942g = cVar;
            return this;
        }

        public b y(int i2, c.f.a.d.j0.c cVar) {
            return z(h.a(i2)).B(cVar);
        }

        public b z(d dVar) {
            this.f14936a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }
    }

    public interface c {
        c.f.a.d.j0.c a(c.f.a.d.j0.c cVar);
    }

    public k() {
        this.f14924b = h.b();
        this.f14925c = h.b();
        this.f14926d = h.b();
        this.f14927e = h.b();
        this.f14928f = new c.f.a.d.j0.a(0.0f);
        this.f14929g = new c.f.a.d.j0.a(0.0f);
        this.f14930h = new c.f.a.d.j0.a(0.0f);
        this.f14931i = new c.f.a.d.j0.a(0.0f);
        this.f14932j = h.c();
        this.f14933k = h.c();
        this.f14934l = h.c();
        this.f14935m = h.c();
    }

    public k(b bVar) {
        this.f14924b = bVar.f14936a;
        this.f14925c = bVar.f14937b;
        this.f14926d = bVar.f14938c;
        this.f14927e = bVar.f14939d;
        this.f14928f = bVar.f14940e;
        this.f14929g = bVar.f14941f;
        this.f14930h = bVar.f14942g;
        this.f14931i = bVar.f14943h;
        this.f14932j = bVar.f14944i;
        this.f14933k = bVar.f14945j;
        this.f14934l = bVar.f14946k;
        this.f14935m = bVar.f14947l;
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i2, int i3) {
        return c(context, i2, i3, 0);
    }

    public static b c(Context context, int i2, int i3, int i4) {
        return d(context, i2, i3, new c.f.a.d.j0.a(i4));
    }

    public static b d(Context context, int i2, int i3, c.f.a.d.j0.c cVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, c.f.a.d.l.c4);
        try {
            int i4 = typedArrayObtainStyledAttributes.getInt(c.f.a.d.l.d4, 0);
            int i5 = typedArrayObtainStyledAttributes.getInt(c.f.a.d.l.g4, i4);
            int i6 = typedArrayObtainStyledAttributes.getInt(c.f.a.d.l.h4, i4);
            int i7 = typedArrayObtainStyledAttributes.getInt(c.f.a.d.l.f4, i4);
            int i8 = typedArrayObtainStyledAttributes.getInt(c.f.a.d.l.e4, i4);
            c.f.a.d.j0.c cVarM = m(typedArrayObtainStyledAttributes, c.f.a.d.l.i4, cVar);
            c.f.a.d.j0.c cVarM2 = m(typedArrayObtainStyledAttributes, c.f.a.d.l.l4, cVarM);
            c.f.a.d.j0.c cVarM3 = m(typedArrayObtainStyledAttributes, c.f.a.d.l.m4, cVarM);
            c.f.a.d.j0.c cVarM4 = m(typedArrayObtainStyledAttributes, c.f.a.d.l.k4, cVarM);
            return new b().y(i5, cVarM2).C(i6, cVarM3).u(i7, cVarM4).q(i8, m(typedArrayObtainStyledAttributes, c.f.a.d.l.j4, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i2, int i3) {
        return f(context, attributeSet, i2, i3, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        return g(context, attributeSet, i2, i3, new c.f.a.d.j0.a(i4));
    }

    public static b g(Context context, AttributeSet attributeSet, int i2, int i3, c.f.a.d.j0.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f.a.d.l.q3, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.r3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(c.f.a.d.l.s3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    public static c.f.a.d.j0.c m(TypedArray typedArray, int i2, c.f.a.d.j0.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i3 = typedValuePeekValue.type;
        return i3 == 5 ? new c.f.a.d.j0.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f14934l;
    }

    public d i() {
        return this.f14927e;
    }

    public c.f.a.d.j0.c j() {
        return this.f14931i;
    }

    public d k() {
        return this.f14926d;
    }

    public c.f.a.d.j0.c l() {
        return this.f14930h;
    }

    public f n() {
        return this.f14935m;
    }

    public f o() {
        return this.f14933k;
    }

    public f p() {
        return this.f14932j;
    }

    public d q() {
        return this.f14924b;
    }

    public c.f.a.d.j0.c r() {
        return this.f14928f;
    }

    public d s() {
        return this.f14925c;
    }

    public c.f.a.d.j0.c t() {
        return this.f14929g;
    }

    public boolean u(RectF rectF) {
        boolean z = this.f14935m.getClass().equals(f.class) && this.f14933k.getClass().equals(f.class) && this.f14932j.getClass().equals(f.class) && this.f14934l.getClass().equals(f.class);
        float fA = this.f14928f.a(rectF);
        return z && ((this.f14929g.a(rectF) > fA ? 1 : (this.f14929g.a(rectF) == fA ? 0 : -1)) == 0 && (this.f14931i.a(rectF) > fA ? 1 : (this.f14931i.a(rectF) == fA ? 0 : -1)) == 0 && (this.f14930h.a(rectF) > fA ? 1 : (this.f14930h.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f14925c instanceof j) && (this.f14924b instanceof j) && (this.f14926d instanceof j) && (this.f14927e instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f2) {
        return v().o(f2).m();
    }

    public k x(c.f.a.d.j0.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }
}
