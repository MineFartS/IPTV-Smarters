package a.b.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static k0 f673b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakHashMap<Context, a.f.j<ColorStateList>> f675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a.f.i<String, e> f676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a.f.j<String> f677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WeakHashMap<Context, a.f.f<WeakReference<Drawable.ConstantState>>> f678g = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TypedValue f679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f681j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PorterDuff.Mode f672a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f674c = new c(6);

    public static class a implements e {
        @Override // a.b.q.k0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.b.m.a.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    public static class b implements e {
        @Override // a.b.q.k0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.c0.a.a.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    public static class c extends a.f.g<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }

        public static int m(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter n(int i2, PorterDuff.Mode mode) {
            return d(Integer.valueOf(m(i2, mode)));
        }

        public PorterDuffColorFilter o(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return f(Integer.valueOf(m(i2, mode)), porterDuffColorFilter);
        }
    }

    public static class d implements e {
        @Override // a.b.q.k0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e2) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                }
            }
            return null;
        }
    }

    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        boolean a(Context context, int i2, Drawable drawable);

        PorterDuff.Mode b(int i2);

        Drawable c(k0 k0Var, Context context, int i2);

        ColorStateList d(Context context, int i2);

        boolean e(Context context, int i2, Drawable drawable);
    }

    public static class g implements e {
        @Override // a.b.q.k0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.c0.a.a.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized k0 h() {
        if (f673b == null) {
            k0 k0Var = new k0();
            f673b = k0Var;
            p(k0Var);
        }
        return f673b;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterN;
        c cVar = f674c;
        porterDuffColorFilterN = cVar.n(i2, mode);
        if (porterDuffColorFilterN == null) {
            porterDuffColorFilterN = new PorterDuffColorFilter(i2, mode);
            cVar.o(i2, mode, porterDuffColorFilterN);
        }
        return porterDuffColorFilterN;
    }

    public static void p(k0 k0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            k0Var.a("vector", new g());
            k0Var.a("animated-vector", new b());
            k0Var.a("animated-selector", new a());
            k0Var.a("drawable", new d());
        }
    }

    public static boolean q(Drawable drawable) {
        return (drawable instanceof a.c0.a.a.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void w(Drawable drawable, s0 s0Var, int[] iArr) {
        if (b0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = s0Var.f753d;
        if (z || s0Var.f752c) {
            drawable.setColorFilter(g(z ? s0Var.f750a : null, s0Var.f752c ? s0Var.f751b : f672a, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final void a(String str, e eVar) {
        if (this.f676e == null) {
            this.f676e = new a.f.i<>();
        }
        this.f676e.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            a.f.f<WeakReference<Drawable.ConstantState>> fVar = this.f678g.get(context);
            if (fVar == null) {
                fVar = new a.f.f<>();
                this.f678g.put(context, fVar);
            }
            fVar.k(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.f675d == null) {
            this.f675d = new WeakHashMap<>();
        }
        a.f.j<ColorStateList> jVar = this.f675d.get(context);
        if (jVar == null) {
            jVar = new a.f.j<>();
            this.f675d.put(context, jVar);
        }
        jVar.a(i2, colorStateList);
    }

    public final void d(Context context) {
        if (this.f680i) {
            return;
        }
        this.f680i = true;
        Drawable drawableJ = j(context, a.b.n.a.f323a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f680i = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable f(Context context, int i2) {
        if (this.f679h == null) {
            this.f679h = new TypedValue();
        }
        TypedValue typedValue = this.f679h;
        context.getResources().getValue(i2, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        f fVar = this.f681j;
        Drawable drawableC = fVar == null ? null : fVar.c(this, context, i2);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableC);
        }
        return drawableC;
    }

    public final synchronized Drawable i(Context context, long j2) {
        a.f.f<WeakReference<Drawable.ConstantState>> fVar = this.f678g.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceF = fVar.f(j2);
        if (weakReferenceF != null) {
            Drawable.ConstantState constantState = weakReferenceF.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.l(j2);
        }
        return null;
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable drawableR;
        d(context);
        drawableR = r(context, i2);
        if (drawableR == null) {
            drawableR = f(context, i2);
        }
        if (drawableR == null) {
            drawableR = a.i.i.b.f(context, i2);
        }
        if (drawableR != null) {
            drawableR = v(context, i2, z, drawableR);
        }
        if (drawableR != null) {
            b0.b(drawableR);
        }
        return drawableR;
    }

    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i2);
        if (colorStateListN == null) {
            f fVar = this.f681j;
            colorStateListN = fVar == null ? null : fVar.d(context, i2);
            if (colorStateListN != null) {
                c(context, i2, colorStateListN);
            }
        }
        return colorStateListN;
    }

    public final ColorStateList n(Context context, int i2) {
        a.f.j<ColorStateList> jVar;
        WeakHashMap<Context, a.f.j<ColorStateList>> weakHashMap = this.f675d;
        if (weakHashMap == null || (jVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return jVar.f(i2);
    }

    public PorterDuff.Mode o(int i2) {
        f fVar = this.f681j;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i2);
    }

    public final Drawable r(Context context, int i2) {
        int next;
        a.f.i<String, e> iVar = this.f676e;
        if (iVar == null || iVar.isEmpty()) {
            return null;
        }
        a.f.j<String> jVar = this.f677f;
        if (jVar != null) {
            String strF = jVar.f(i2);
            if ("appcompat_skip_skip".equals(strF) || (strF != null && this.f676e.get(strF) == null)) {
                return null;
            }
        } else {
            this.f677f = new a.f.j<>();
        }
        if (this.f679h == null) {
            this.f679h = new TypedValue();
        }
        TypedValue typedValue = this.f679h;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f677f.a(i2, name);
                e eVar = this.f676e.get(name);
                if (eVar != null) {
                    drawableI = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableI == null) {
            this.f677f.a(i2, "appcompat_skip_skip");
        }
        return drawableI;
    }

    public synchronized void s(Context context) {
        a.f.f<WeakReference<Drawable.ConstantState>> fVar = this.f678g.get(context);
        if (fVar != null) {
            fVar.b();
        }
    }

    public synchronized Drawable t(Context context, z0 z0Var, int i2) {
        Drawable drawableR = r(context, i2);
        if (drawableR == null) {
            drawableR = z0Var.c(i2);
        }
        if (drawableR == null) {
            return null;
        }
        return v(context, i2, false, drawableR);
    }

    public synchronized void u(f fVar) {
        this.f681j = fVar;
    }

    public final Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList colorStateListM = m(context, i2);
        if (colorStateListM == null) {
            f fVar = this.f681j;
            if ((fVar == null || !fVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (b0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = a.i.j.l.a.r(drawable);
        a.i.j.l.a.o(drawableR, colorStateListM);
        PorterDuff.Mode modeO = o(i2);
        if (modeO == null) {
            return drawableR;
        }
        a.i.j.l.a.p(drawableR, modeO);
        return drawableR;
    }

    public boolean x(Context context, int i2, Drawable drawable) {
        f fVar = this.f681j;
        return fVar != null && fVar.a(context, i2, drawable);
    }
}
