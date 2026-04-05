package c.f.a.d.n0;

import a.i.r.x;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import c.f.a.d.j0.k;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public class d extends c.f.a.d.n0.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f15110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextWatcher f15111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnFocusChangeListener f15112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextInputLayout.e f15113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout.f f15114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.g f15115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f15118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public StateListDrawable f15119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.f.a.d.j0.g f15120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AccessibilityManager f15121o;
    public ValueAnimator p;
    public ValueAnimator q;

    public class a extends c.f.a.d.d0.i {

        /* JADX INFO: renamed from: c.f.a.d.n0.d$a$a, reason: collision with other inner class name */
        public class RunnableC0172a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f15123b;

            public RunnableC0172a(AutoCompleteTextView autoCompleteTextView) {
                this.f15123b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f15123b.isPopupShowing();
                d.this.E(zIsPopupShowing);
                d.this.f15116j = zIsPopupShowing;
            }
        }

        public a() {
        }

        @Override // c.f.a.d.d0.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewY = d.y(d.this.f15137a.getEditText());
            if (d.this.f15121o.isTouchExplorationEnabled() && d.D(autoCompleteTextViewY) && !d.this.f15139c.hasFocus()) {
                autoCompleteTextViewY.dismissDropDown();
            }
            autoCompleteTextViewY.post(new RunnableC0172a(autoCompleteTextViewY));
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f15139c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d.this.f15137a.setEndIconActivated(z);
            if (z) {
                return;
            }
            d.this.E(false);
            d.this.f15116j = false;
        }
    }

    /* JADX INFO: renamed from: c.f.a.d.n0.d$d, reason: collision with other inner class name */
    public class C0173d extends TextInputLayout.e {
        public C0173d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, a.i.r.a
        public void g(View view, a.i.r.g0.c cVar) {
            super.g(view, cVar);
            if (!d.D(d.this.f15137a.getEditText())) {
                cVar.X(Spinner.class.getName());
            }
            if (cVar.J()) {
                cVar.h0(null);
            }
        }

        @Override // a.i.r.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewY = d.y(d.this.f15137a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.f15121o.isTouchExplorationEnabled() && !d.D(d.this.f15137a.getEditText())) {
                d.this.H(autoCompleteTextViewY);
            }
        }
    }

    public class e implements TextInputLayout.f {
        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewY = d.y(textInputLayout.getEditText());
            d.this.F(autoCompleteTextViewY);
            d.this.v(autoCompleteTextViewY);
            d.this.G(autoCompleteTextViewY);
            autoCompleteTextViewY.setThreshold(0);
            autoCompleteTextViewY.removeTextChangedListener(d.this.f15111e);
            autoCompleteTextViewY.addTextChangedListener(d.this.f15111e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.D(autoCompleteTextViewY)) {
                x.y0(d.this.f15139c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f15113g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class f implements TextInputLayout.g {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f15130b;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f15130b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f15130b.removeTextChangedListener(d.this.f15111e);
            }
        }

        public f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i2 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f15112f) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (d.f15110d) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.f15137a.getEditText());
        }
    }

    public class h implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AutoCompleteTextView f15133b;

        public h(AutoCompleteTextView autoCompleteTextView) {
            this.f15133b = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    d.this.f15116j = false;
                }
                d.this.H(this.f15133b);
            }
            return false;
        }
    }

    public class i implements AutoCompleteTextView.OnDismissListener {
        public i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.f15116j = true;
            d.this.f15118l = System.currentTimeMillis();
            d.this.E(false);
        }
    }

    public class j extends AnimatorListenerAdapter {
        public j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f15139c.setChecked(dVar.f15117k);
            d.this.q.start();
        }
    }

    static {
        f15110d = Build.VERSION.SDK_INT >= 21;
    }

    public d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f15111e = new a();
        this.f15112f = new c();
        this.f15113g = new C0173d(this.f15137a);
        this.f15114h = new e();
        this.f15115i = new f();
        this.f15116j = false;
        this.f15117k = false;
        this.f15118l = Long.MAX_VALUE;
    }

    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final c.f.a.d.j0.g A(float f2, float f3, float f4, int i2) {
        k kVarM = k.a().A(f2).E(f2).s(f3).w(f3).m();
        c.f.a.d.j0.g gVarM = c.f.a.d.j0.g.m(this.f15138b, f4);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.Z(0, i2, 0, i2);
        return gVarM;
    }

    public final void B() {
        this.q = z(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorZ = z(50, 1.0f, 0.0f);
        this.p = valueAnimatorZ;
        valueAnimatorZ.addListener(new j());
    }

    public final boolean C() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f15118l;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final void E(boolean z) {
        if (this.f15117k != z) {
            this.f15117k = z;
            this.q.cancel();
            this.p.start();
        }
    }

    public final void F(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f15110d) {
            int boxBackgroundMode = this.f15137a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f15120n;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.f15119m;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f15112f);
        if (f15110d) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    public final void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.f15116j = false;
        }
        if (this.f15116j) {
            this.f15116j = false;
            return;
        }
        if (f15110d) {
            E(!this.f15117k);
        } else {
            this.f15117k = !this.f15117k;
            this.f15139c.toggle();
        }
        if (!this.f15117k) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    @Override // c.f.a.d.n0.e
    public void a() {
        float dimensionPixelOffset = this.f15138b.getResources().getDimensionPixelOffset(c.f.a.d.d.T);
        float dimensionPixelOffset2 = this.f15138b.getResources().getDimensionPixelOffset(c.f.a.d.d.P);
        int dimensionPixelOffset3 = this.f15138b.getResources().getDimensionPixelOffset(c.f.a.d.d.Q);
        c.f.a.d.j0.g gVarA = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        c.f.a.d.j0.g gVarA2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f15120n = gVarA;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f15119m = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, gVarA);
        this.f15119m.addState(new int[0], gVarA2);
        this.f15137a.setEndIconDrawable(a.b.l.a.a.d(this.f15138b, f15110d ? c.f.a.d.e.f14778d : c.f.a.d.e.f14779e));
        TextInputLayout textInputLayout = this.f15137a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(c.f.a.d.j.f14876g));
        this.f15137a.setEndIconOnClickListener(new g());
        this.f15137a.e(this.f15114h);
        this.f15137a.f(this.f15115i);
        B();
        this.f15121o = (AccessibilityManager) this.f15138b.getSystemService("accessibility");
    }

    @Override // c.f.a.d.n0.e
    public boolean b(int i2) {
        return i2 != 0;
    }

    @Override // c.f.a.d.n0.e
    public boolean d() {
        return true;
    }

    public final void v(AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f15137a.getBoxBackgroundMode();
        c.f.a.d.j0.g boxBackground = this.f15137a.getBoxBackground();
        int iC = c.f.a.d.w.a.c(autoCompleteTextView, c.f.a.d.b.f14632i);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            x(autoCompleteTextView, iC, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            w(autoCompleteTextView, iC, iArr, boxBackground);
        }
    }

    public final void w(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, c.f.a.d.j0.g gVar) {
        int boxBackgroundColor = this.f15137a.getBoxBackgroundColor();
        int[] iArr2 = {c.f.a.d.w.a.f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f15110d) {
            x.s0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        c.f.a.d.j0.g gVar2 = new c.f.a.d.j0.g(gVar.C());
        gVar2.X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int I = x.I(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iH = x.H(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        x.s0(autoCompleteTextView, layerDrawable);
        x.B0(autoCompleteTextView, I, paddingTop, iH, paddingBottom);
    }

    public final void x(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, c.f.a.d.j0.g gVar) {
        LayerDrawable layerDrawable;
        int iC = c.f.a.d.w.a.c(autoCompleteTextView, c.f.a.d.b.f14636m);
        c.f.a.d.j0.g gVar2 = new c.f.a.d.j0.g(gVar.C());
        int iF = c.f.a.d.w.a.f(i2, iC, 0.1f);
        gVar2.X(new ColorStateList(iArr, new int[]{iF, 0}));
        if (f15110d) {
            gVar2.setTint(iC);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iF, iC});
            c.f.a.d.j0.g gVar3 = new c.f.a.d.j0.g(gVar.C());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        x.s0(autoCompleteTextView, layerDrawable);
    }

    public final ValueAnimator z(int i2, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(c.f.a.d.m.a.f15042a);
        valueAnimatorOfFloat.setDuration(i2);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }
}
