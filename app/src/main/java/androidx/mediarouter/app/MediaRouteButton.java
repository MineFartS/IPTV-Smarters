package androidx.mediarouter.app;

import a.b.q.w0;
import a.l.d.d;
import a.l.d.e;
import a.l.d.n;
import a.t.h;
import a.t.j;
import a.t.k.c;
import a.t.k.i;
import a.t.l.f;
import a.t.l.g;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class MediaRouteButton extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray<Drawable.ConstantState> f4671b = new SparseArray<>(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f4672c = {R.attr.state_checked};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f4673d = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f4674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f4675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f4676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.t.k.g f4677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f4679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f4680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f4683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4684o;
    public int p;

    public final class a extends g.a {
        public a() {
        }

        @Override // a.t.l.g.a
        public void a(g gVar, g.e eVar) {
            MediaRouteButton.this.a();
        }

        @Override // a.t.l.g.a
        public void b(g gVar, g.e eVar) {
            MediaRouteButton.this.a();
        }

        @Override // a.t.l.g.a
        public void c(g gVar, g.e eVar) {
            MediaRouteButton.this.a();
        }

        @Override // a.t.l.g.a
        public void d(g gVar, g.C0076g c0076g) {
            MediaRouteButton.this.a();
        }

        @Override // a.t.l.g.a
        public void e(g gVar, g.C0076g c0076g) {
            MediaRouteButton.this.a();
        }

        @Override // a.t.l.g.a
        public void g(g gVar, g.C0076g c0076g) {
            MediaRouteButton.this.a();
        }

        @Override // a.t.l.g.a
        public void h(g gVar, g.C0076g c0076g) {
            MediaRouteButton.this.a();
        }

        @Override // a.t.l.g.a
        public void i(g gVar, g.C0076g c0076g) {
            MediaRouteButton.this.a();
        }
    }

    public final class b extends AsyncTask<Void, Void, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4686a;

        public b(int i2) {
            this.f4686a = i2;
        }

        public final void a(Drawable drawable) {
            if (drawable != null) {
                MediaRouteButton.f4671b.put(this.f4686a, drawable.getConstantState());
            }
            MediaRouteButton.this.f4679j = null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            return MediaRouteButton.this.getContext().getResources().getDrawable(this.f4686a);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Drawable drawable) {
            a(drawable);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            a(drawable);
            MediaRouteButton.this.setRemoteIndicatorDrawable(drawable);
        }
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.t.a.f3124a);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i2) {
        super(i.a(context), attributeSet, i2);
        this.f4676g = f.f3357a;
        this.f4677h = a.t.k.g.a();
        Context context2 = getContext();
        this.f4674e = g.f(context2);
        this.f4675f = new a();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j.C, i2, 0);
        this.f4683n = typedArrayObtainStyledAttributes.getColorStateList(j.G);
        this.f4684o = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.D, 0);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.E, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(j.F, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            Drawable.ConstantState constantState = f4671b.get(resourceId);
            if (constantState != null) {
                setRemoteIndicatorDrawable(constantState.newDrawable());
            } else {
                b bVar = new b(resourceId);
                this.f4679j = bVar;
                bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }
        c();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private n getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof e) {
            return ((e) activity).getSupportFragmentManager();
        }
        return null;
    }

    public void a() {
        g.C0076g c0076gI = this.f4674e.i();
        boolean z = false;
        boolean z2 = !c0076gI.t() && c0076gI.y(this.f4676g);
        boolean z3 = z2 && c0076gI.r();
        if (this.f4681l != z2) {
            this.f4681l = z2;
            z = true;
        }
        if (this.f4682m != z3) {
            this.f4682m = z3;
            z = true;
        }
        if (z) {
            c();
            refreshDrawableState();
        }
        if (this.f4678i) {
            setEnabled(this.f4674e.j(this.f4676g, 1));
        }
        Drawable drawable = this.f4680k;
        if (drawable == null || !(drawable.getCurrent() instanceof AnimationDrawable)) {
            return;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) this.f4680k.getCurrent();
        if (this.f4678i) {
            if ((z || z3) && !animationDrawable.isRunning()) {
                animationDrawable.start();
                return;
            }
            return;
        }
        if (!z2 || z3) {
            return;
        }
        if (animationDrawable.isRunning()) {
            animationDrawable.stop();
        }
        animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
    }

    public boolean b() {
        String str;
        String str2;
        d dVar;
        if (!this.f4678i) {
            return false;
        }
        n fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        g.C0076g c0076gI = this.f4674e.i();
        if (c0076gI.t() || !c0076gI.y(this.f4676g)) {
            str = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
            if (fragmentManager.i0("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                str2 = "showDialog(): Route chooser dialog already showing!";
                Log.w("MediaRouteButton", str2);
                return false;
            }
            c cVarB = this.f4677h.b();
            cVarB.R(this.f4676g);
            dVar = cVarB;
            dVar.J(fragmentManager, str);
            return true;
        }
        str = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
        if (fragmentManager.i0("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            str2 = "showDialog(): Route controller dialog already showing!";
            Log.w("MediaRouteButton", str2);
            return false;
        }
        a.t.k.e eVarC = this.f4677h.c();
        eVarC.Q(this.f4676g);
        dVar = eVarC;
        dVar.J(fragmentManager, str);
        return true;
    }

    public final void c() {
        setContentDescription(getContext().getString(this.f4682m ? h.f3175c : this.f4681l ? h.f3174b : h.f3176d));
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4680k != null) {
            this.f4680k.setState(getDrawableState());
            invalidate();
        }
    }

    public a.t.k.g getDialogFactory() {
        return this.f4677h;
    }

    public f getRouteSelector() {
        return this.f4676g;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        if (getBackground() != null) {
            a.i.j.l.a.i(getBackground());
        }
        Drawable drawable = this.f4680k;
        if (drawable != null) {
            a.i.j.l.a.i(drawable);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4678i = true;
        if (!this.f4676g.f()) {
            this.f4674e.a(this.f4676g, this.f4675f);
        }
        a();
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.f4682m) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4673d);
        } else if (this.f4681l) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4672c);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f4678i = false;
        if (!this.f4676g.f()) {
            this.f4674e.k(this.f4675f);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4680k != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.f4680k.getIntrinsicWidth();
            int intrinsicHeight = this.f4680k.getIntrinsicHeight();
            int i2 = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i3 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.f4680k.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.f4680k.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i4 = this.f4684o;
        Drawable drawable = this.f4680k;
        int iMax = Math.max(i4, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i5 = this.p;
        Drawable drawable2 = this.f4680k;
        int iMax2 = Math.max(i5, drawable2 != null ? drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return b() || zPerformClick;
    }

    public void setCheatSheetEnabled(boolean z) {
        w0.a(this, z ? getContext().getString(h.f3173a) : null);
    }

    public void setDialogFactory(a.t.k.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.f4677h = gVar;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        Drawable drawable2;
        b bVar = this.f4679j;
        if (bVar != null) {
            bVar.cancel(false);
        }
        Drawable drawable3 = this.f4680k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4680k);
        }
        if (drawable != null) {
            if (this.f4683n != null) {
                drawable = a.i.j.l.a.r(drawable.mutate());
                a.i.j.l.a.o(drawable, this.f4683n);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.f4680k = drawable;
        refreshDrawableState();
        if (this.f4678i && (drawable2 = this.f4680k) != null && (drawable2.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.f4680k.getCurrent();
            if (this.f4682m) {
                if (animationDrawable.isRunning()) {
                    return;
                }
                animationDrawable.start();
            } else if (this.f4681l) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    public void setRouteSelector(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f4676g.equals(fVar)) {
            return;
        }
        if (this.f4678i) {
            if (!this.f4676g.f()) {
                this.f4674e.k(this.f4675f);
            }
            if (!fVar.f()) {
                this.f4674e.a(fVar, this.f4675f);
            }
        }
        this.f4676g = fVar;
        a();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.f4680k;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4680k;
    }
}
