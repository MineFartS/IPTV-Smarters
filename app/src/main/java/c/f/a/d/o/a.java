package c.f.a.d.o;

import a.i.r.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c.f.a.d.d0.h;
import c.f.a.d.f;
import c.f.a.d.g0.c;
import c.f.a.d.g0.d;
import c.f.a.d.i;
import c.f.a.d.j;
import c.f.a.d.j0.g;
import c.f.a.d.k;
import c.f.a.d.l;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable implements h.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15173b = k.f15003k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15174c = c.f.a.d.b.f14626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<Context> f15175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f15176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f15177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f15178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f15180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f15181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f15182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f15184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f15186o;
    public float p;
    public float q;
    public WeakReference<View> r;
    public WeakReference<FrameLayout> s;

    /* JADX INFO: renamed from: c.f.a.d.o.a$a, reason: collision with other inner class name */
    public class RunnableC0174a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f15187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f15188c;

        public RunnableC0174a(View view, FrameLayout frameLayout) {
            this.f15187b = view;
            this.f15188c = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.y(this.f15187b, this.f15188c);
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C0175a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15192d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15194f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CharSequence f15195g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15196h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15197i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15198j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f15199k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f15200l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f15201m;

        /* JADX INFO: renamed from: c.f.a.d.o.a$b$a, reason: collision with other inner class name */
        public static class C0175a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(Context context) {
            this.f15192d = 255;
            this.f15193e = -1;
            this.f15191c = new d(context, k.f14995c).f14806a.getDefaultColor();
            this.f15195g = context.getString(j.f14878i);
            this.f15196h = i.f14857a;
            this.f15197i = j.f14880k;
            this.f15199k = true;
        }

        public b(Parcel parcel) {
            this.f15192d = 255;
            this.f15193e = -1;
            this.f15190b = parcel.readInt();
            this.f15191c = parcel.readInt();
            this.f15192d = parcel.readInt();
            this.f15193e = parcel.readInt();
            this.f15194f = parcel.readInt();
            this.f15195g = parcel.readString();
            this.f15196h = parcel.readInt();
            this.f15198j = parcel.readInt();
            this.f15200l = parcel.readInt();
            this.f15201m = parcel.readInt();
            this.f15199k = parcel.readInt() != 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f15190b);
            parcel.writeInt(this.f15191c);
            parcel.writeInt(this.f15192d);
            parcel.writeInt(this.f15193e);
            parcel.writeInt(this.f15194f);
            parcel.writeString(this.f15195g.toString());
            parcel.writeInt(this.f15196h);
            parcel.writeInt(this.f15198j);
            parcel.writeInt(this.f15200l);
            parcel.writeInt(this.f15201m);
            parcel.writeInt(this.f15199k ? 1 : 0);
        }
    }

    public a(Context context) {
        this.f15175d = new WeakReference<>(context);
        c.f.a.d.d0.j.c(context);
        Resources resources = context.getResources();
        this.f15178g = new Rect();
        this.f15176e = new g();
        this.f15179h = resources.getDimensionPixelSize(c.f.a.d.d.z);
        this.f15181j = resources.getDimensionPixelSize(c.f.a.d.d.y);
        this.f15180i = resources.getDimensionPixelSize(c.f.a.d.d.B);
        h hVar = new h(this);
        this.f15177f = hVar;
        hVar.e().setTextAlign(Paint.Align.CENTER);
        this.f15182k = new b(context);
        u(k.f14995c);
    }

    public static a c(Context context) {
        return d(context, null, f15174c, f15173b);
    }

    public static a d(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a(context);
        aVar.l(context, attributeSet, i2, i3);
        return aVar;
    }

    public static int m(Context context, TypedArray typedArray, int i2) {
        return c.a(context, typedArray, i2).getDefaultColor();
    }

    public static void x(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public final void A() {
        Double.isNaN(i());
        this.f15185n = ((int) Math.pow(10.0d, r0 - 1.0d)) - 1;
    }

    @Override // c.f.a.d.d0.h.b
    public void a() {
        invalidateSelf();
    }

    public final void b(Context context, Rect rect, View view) {
        float f2;
        int i2 = this.f15182k.f15198j;
        this.f15184m = (i2 == 8388691 || i2 == 8388693) ? rect.bottom - this.f15182k.f15201m : rect.top + this.f15182k.f15201m;
        if (j() <= 9) {
            f2 = !k() ? this.f15179h : this.f15180i;
            this.f15186o = f2;
            this.q = f2;
        } else {
            float f3 = this.f15180i;
            this.f15186o = f3;
            this.q = f3;
            f2 = (this.f15177f.f(f()) / 2.0f) + this.f15181j;
        }
        this.p = f2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(k() ? c.f.a.d.d.A : c.f.a.d.d.x);
        int i3 = this.f15182k.f15198j;
        this.f15183l = (i3 == 8388659 || i3 == 8388691 ? x.C(view) != 0 : x.C(view) == 0) ? ((rect.right + this.p) - dimensionPixelSize) - this.f15182k.f15200l : (rect.left - this.p) + dimensionPixelSize + this.f15182k.f15200l;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f15176e.draw(canvas);
        if (k()) {
            e(canvas);
        }
    }

    public final void e(Canvas canvas) {
        Rect rect = new Rect();
        String strF = f();
        this.f15177f.e().getTextBounds(strF, 0, strF.length(), rect);
        canvas.drawText(strF, this.f15183l, this.f15184m + (rect.height() / 2), this.f15177f.e());
    }

    public final String f() {
        if (j() <= this.f15185n) {
            return NumberFormat.getInstance().format(j());
        }
        Context context = this.f15175d.get();
        return context == null ? BuildConfig.FLAVOR : context.getString(j.f14881l, Integer.valueOf(this.f15185n), "+");
    }

    public CharSequence g() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!k()) {
            return this.f15182k.f15195g;
        }
        if (this.f15182k.f15196h <= 0 || (context = this.f15175d.get()) == null) {
            return null;
        }
        return j() <= this.f15185n ? context.getResources().getQuantityString(this.f15182k.f15196h, j(), Integer.valueOf(j())) : context.getString(this.f15182k.f15197i, Integer.valueOf(this.f15185n));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15182k.f15192d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15178g.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f15178g.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public FrameLayout h() {
        WeakReference<FrameLayout> weakReference = this.s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int i() {
        return this.f15182k.f15194f;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public int j() {
        if (k()) {
            return this.f15182k.f15193e;
        }
        return 0;
    }

    public boolean k() {
        return this.f15182k.f15193e != -1;
    }

    public final void l(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayH = c.f.a.d.d0.j.h(context, attributeSet, l.C, i2, i3, new int[0]);
        r(typedArrayH.getInt(l.H, 4));
        int i4 = l.I;
        if (typedArrayH.hasValue(i4)) {
            s(typedArrayH.getInt(i4, 0));
        }
        n(m(context, typedArrayH, l.D));
        int i5 = l.F;
        if (typedArrayH.hasValue(i5)) {
            p(m(context, typedArrayH, i5));
        }
        o(typedArrayH.getInt(l.E, 8388661));
        q(typedArrayH.getDimensionPixelOffset(l.G, 0));
        v(typedArrayH.getDimensionPixelOffset(l.J, 0));
        typedArrayH.recycle();
    }

    public void n(int i2) {
        this.f15182k.f15190b = i2;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
        if (this.f15176e.x() != colorStateListValueOf) {
            this.f15176e.X(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public void o(int i2) {
        if (this.f15182k.f15198j != i2) {
            this.f15182k.f15198j = i2;
            WeakReference<View> weakReference = this.r;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.r.get();
            WeakReference<FrameLayout> weakReference2 = this.s;
            y(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    @Override // android.graphics.drawable.Drawable, c.f.a.d.d0.h.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i2) {
        this.f15182k.f15191c = i2;
        if (this.f15177f.e().getColor() != i2) {
            this.f15177f.e().setColor(i2);
            invalidateSelf();
        }
    }

    public void q(int i2) {
        this.f15182k.f15200l = i2;
        z();
    }

    public void r(int i2) {
        if (this.f15182k.f15194f != i2) {
            this.f15182k.f15194f = i2;
            A();
            this.f15177f.i(true);
            z();
            invalidateSelf();
        }
    }

    public void s(int i2) {
        int iMax = Math.max(0, i2);
        if (this.f15182k.f15193e != iMax) {
            this.f15182k.f15193e = iMax;
            this.f15177f.i(true);
            z();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f15182k.f15192d = i2;
        this.f15177f.e().setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void t(d dVar) {
        Context context;
        if (this.f15177f.d() == dVar || (context = this.f15175d.get()) == null) {
            return;
        }
        this.f15177f.h(dVar, context);
        z();
    }

    public final void u(int i2) {
        Context context = this.f15175d.get();
        if (context == null) {
            return;
        }
        t(new d(context, i2));
    }

    public void v(int i2) {
        this.f15182k.f15201m = i2;
        z();
    }

    public final void w(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != f.t) {
            WeakReference<FrameLayout> weakReference = this.s;
            if (weakReference == null || weakReference.get() != viewGroup) {
                x(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(f.t);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.s = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC0174a(view, frameLayout));
            }
        }
    }

    public void y(View view, FrameLayout frameLayout) {
        this.r = new WeakReference<>(view);
        boolean z = c.f.a.d.o.b.f15202a;
        if (z && frameLayout == null) {
            w(view);
        } else {
            this.s = new WeakReference<>(frameLayout);
        }
        if (!z) {
            x(view);
        }
        z();
        invalidateSelf();
    }

    public final void z() {
        Context context = this.f15175d.get();
        WeakReference<View> weakReference = this.r;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f15178g);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.s;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || c.f.a.d.o.b.f15202a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        c.f.a.d.o.b.d(this.f15178g, this.f15183l, this.f15184m, this.p, this.q);
        this.f15176e.U(this.f15186o);
        if (rect.equals(this.f15178g)) {
            return;
        }
        this.f15176e.setBounds(this.f15178g);
    }
}
