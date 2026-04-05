package a.b.m.a;

import a.b.m.a.b;
import a.b.m.a.e;
import a.b.q.k0;
import a.c0.a.a.h;
import a.f.j;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class a extends a.b.m.a.e implements a.i.j.l.b {
    public static final String p = a.class.getSimpleName();
    public c q;
    public g r;
    public int s;
    public int t;
    public boolean u;

    public static class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animatable f271a;

        public b(Animatable animatable) {
            super();
            this.f271a = animatable;
        }

        @Override // a.b.m.a.a.g
        public void c() {
            this.f271a.start();
        }

        @Override // a.b.m.a.a.g
        public void d() {
            this.f271a.stop();
        }
    }

    public static class c extends e.a {
        public a.f.f<Long> K;
        public j<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
            j<Integer> jVar;
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                jVar = cVar.L;
            } else {
                this.K = new a.f.f<>();
                jVar = new j<>();
            }
            this.L = jVar;
        }

        public static long D(int i2, int i3) {
            return ((long) i3) | (((long) i2) << 32);
        }

        public int B(int[] iArr, Drawable drawable, int i2) {
            int iZ = super.z(iArr, drawable);
            this.L.k(iZ, Integer.valueOf(i2));
            return iZ;
        }

        public int C(int i2, int i3, Drawable drawable, boolean z) {
            int iA = super.a(drawable);
            long jD = D(i2, i3);
            long j2 = z ? IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT : 0L;
            long j3 = iA;
            this.K.a(jD, Long.valueOf(j3 | j2));
            if (z) {
                this.K.a(D(i3, i2), Long.valueOf(IjkMediaMeta.AV_CH_WIDE_RIGHT | j3 | j2));
            }
            return iA;
        }

        public int E(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.g(i2, 0).intValue();
        }

        public int F(int[] iArr) {
            int iA = super.A(iArr);
            return iA >= 0 ? iA : super.A(StateSet.WILD_CARD);
        }

        public int G(int i2, int i3) {
            return (int) this.K.g(D(i2, i3), -1L).longValue();
        }

        public boolean H(int i2, int i3) {
            return (this.K.g(D(i2, i3), -1L).longValue() & IjkMediaMeta.AV_CH_WIDE_RIGHT) != 0;
        }

        public boolean I(int i2, int i3) {
            return (this.K.g(D(i2, i3), -1L).longValue() & IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) != 0;
        }

        @Override // a.b.m.a.e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // a.b.m.a.e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override // a.b.m.a.e.a, a.b.m.a.b.d
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    public static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.c0.a.a.b f272a;

        public d(a.c0.a.a.b bVar) {
            super();
            this.f272a = bVar;
        }

        @Override // a.b.m.a.a.g
        public void c() {
            this.f272a.start();
        }

        @Override // a.b.m.a.a.g
        public void d() {
            this.f272a.stop();
        }
    }

    public static class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f274b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z ? numberOfFrames - 1 : 0;
            int i3 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            if (Build.VERSION.SDK_INT >= 18) {
                objectAnimatorOfInt.setAutoCancel(true);
            }
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f274b = z2;
            this.f273a = objectAnimatorOfInt;
        }

        @Override // a.b.m.a.a.g
        public boolean a() {
            return this.f274b;
        }

        @Override // a.b.m.a.a.g
        public void b() {
            this.f273a.reverse();
        }

        @Override // a.b.m.a.a.g
        public void c() {
            this.f273a.start();
        }

        @Override // a.b.m.a.a.g
        public void d() {
            this.f273a.cancel();
        }
    }

    public static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f277c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        public int a() {
            return this.f277c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f276b = numberOfFrames;
            int[] iArr = this.f275a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f275a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f275a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f277c = i2;
            return i2;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.f277c) + 0.5f);
            int i3 = this.f276b;
            int[] iArr = this.f275a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.f277c : 0.0f);
        }
    }

    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public a(c cVar, Resources resources) {
        super(null);
        this.s = -1;
        this.t = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // a.b.m.a.e, a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // a.b.m.a.e, a.b.m.a.b
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.q = (c) dVar;
        }
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // a.b.m.a.e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.r;
        if (gVar != null) {
            gVar.d();
            this.r = null;
            g(this.s);
            this.s = -1;
            this.t = -1;
        }
    }

    @Override // a.b.m.a.e
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.q, this, null);
    }

    @Override // a.b.m.a.e, a.b.m.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.u && super.mutate() == this) {
            this.q.r();
            this.u = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = a.i.i.e.g.s(resources, theme, attributeSet, a.b.n.b.f324a);
        setVisible(typedArrayS.getBoolean(a.b.n.b.f326c, true), true);
        t(typedArrayS);
        i(resources);
        typedArrayS.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    public final void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i2) {
        return super.onLayoutDirectionChanged(i2);
    }

    @Override // a.b.m.a.e, a.b.m.a.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int iF = this.q.F(iArr);
        boolean z = iF != c() && (s(iF) || g(iF));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public final void p() {
        onStateChange(getState());
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = a.i.i.e.g.s(resources, theme, attributeSet, a.b.n.b.f331h);
        int resourceId = typedArrayS.getResourceId(a.b.n.b.f332i, 0);
        int resourceId2 = typedArrayS.getResourceId(a.b.n.b.f333j, -1);
        Drawable drawableJ = resourceId2 > 0 ? k0.h().j(context, resourceId2) : null;
        typedArrayS.recycle();
        int[] iArrK = k(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? h.c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (drawableJ != null) {
            return this.q.B(iArrK, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public final int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = a.i.i.e.g.s(resources, theme, attributeSet, a.b.n.b.f334k);
        int resourceId = typedArrayS.getResourceId(a.b.n.b.f337n, -1);
        int resourceId2 = typedArrayS.getResourceId(a.b.n.b.f336m, -1);
        int resourceId3 = typedArrayS.getResourceId(a.b.n.b.f335l, -1);
        Drawable drawableJ = resourceId3 > 0 ? k0.h().j(context, resourceId3) : null;
        boolean z = typedArrayS.getBoolean(a.b.n.b.f338o, false);
        typedArrayS.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? a.c0.a.a.b.a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.q.C(resourceId, resourceId2, drawableJ, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    public final boolean s(int i2) {
        int iC;
        int iG;
        g bVar;
        g gVar = this.r;
        if (gVar == null) {
            iC = c();
        } else {
            if (i2 == this.s) {
                return true;
            }
            if (i2 == this.t && gVar.a()) {
                gVar.b();
                this.s = this.t;
                this.t = i2;
                return true;
            }
            iC = this.s;
            gVar.d();
        }
        this.r = null;
        this.t = -1;
        this.s = -1;
        c cVar = this.q;
        int iE = cVar.E(iC);
        int iE2 = cVar.E(i2);
        if (iE2 == 0 || iE == 0 || (iG = cVar.G(iE, iE2)) < 0) {
            return false;
        }
        boolean zI = cVar.I(iE, iE2);
        g(iG);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(iE, iE2), zI);
        } else {
            if (!(current instanceof a.c0.a.a.b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((a.c0.a.a.b) current);
        }
        bVar.c();
        this.r = bVar;
        this.t = iC;
        this.s = i2;
        return true;
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        super.scheduleDrawable(drawable, runnable, j2);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i2) {
        super.setAlpha(i2);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable, a.i.j.l.b
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable, a.i.j.l.b
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.r;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public final void t(TypedArray typedArray) {
        c cVar = this.q;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f295d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(a.b.n.b.f327d, cVar.f300i));
        cVar.t(typedArray.getBoolean(a.b.n.b.f328e, cVar.f303l));
        cVar.u(typedArray.getInt(a.b.n.b.f329f, cVar.A));
        cVar.v(typedArray.getInt(a.b.n.b.f330g, cVar.B));
        setDither(typedArray.getBoolean(a.b.n.b.f325b, cVar.x));
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
