package com.google.android.material.textfield;

import a.b.q.b0;
import a.b.q.u0;
import a.i.r.i;
import a.i.r.x;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import c.f.a.d.d0.j;
import c.f.a.d.j0.k;
import c.f.a.d.k;
import c.f.a.d.l;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24561b = k.f15002j;
    public boolean A;
    public int A0;
    public CharSequence B;
    public int B0;
    public boolean C;
    public int C0;
    public c.f.a.d.j0.g D;
    public ColorStateList D0;
    public c.f.a.d.j0.g E;
    public int E0;
    public c.f.a.d.j0.k F;
    public int F0;
    public final int G;
    public int G0;
    public int H;
    public int H0;
    public int I;
    public int I0;
    public int J;
    public boolean J0;
    public int K;
    public final c.f.a.d.d0.a K0;
    public int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public ValueAnimator N0;
    public final Rect O;
    public boolean O0;
    public final Rect P;
    public boolean P0;
    public final RectF Q;
    public Typeface R;
    public final CheckableImageButton S;
    public ColorStateList T;
    public boolean U;
    public PorterDuff.Mode V;
    public boolean W;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f24562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f24563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f24564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f24565f;
    public Drawable f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f24566g;
    public int g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f24567h;
    public View.OnLongClickListener h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.f.a.d.n0.f f24568i;
    public final LinkedHashSet<f> i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24569j;
    public int j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24570k;
    public final SparseArray<c.f.a.d.n0.e> k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24571l;
    public final CheckableImageButton l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f24572m;
    public final LinkedHashSet<g> m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24573n;
    public ColorStateList n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24574o;
    public boolean o0;
    public CharSequence p;
    public PorterDuff.Mode p0;
    public boolean q;
    public boolean q0;
    public TextView r;
    public Drawable r0;
    public ColorStateList s;
    public int s0;
    public int t;
    public Drawable t0;
    public ColorStateList u;
    public View.OnLongClickListener u0;
    public ColorStateList v;
    public View.OnLongClickListener v0;
    public CharSequence w;
    public final CheckableImageButton w0;
    public final TextView x;
    public ColorStateList x0;
    public CharSequence y;
    public ColorStateList y0;
    public final TextView z;
    public ColorStateList z0;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.u0(!r0.P0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f24569j) {
                textInputLayout.n0(editable.length());
            }
            if (TextInputLayout.this.q) {
                TextInputLayout.this.y0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.l0.performClick();
            TextInputLayout.this.l0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f24566g.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.K0.V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends a.i.r.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextInputLayout f24579d;

        public e(TextInputLayout textInputLayout) {
            this.f24579d = textInputLayout;
        }

        @Override // a.i.r.a
        public void g(View view, a.i.r.g0.c cVar) {
            super.g(view, cVar);
            EditText editText = this.f24579d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f24579d.getHint();
            CharSequence error = this.f24579d.getError();
            CharSequence placeholderText = this.f24579d.getPlaceholderText();
            int counterMaxLength = this.f24579d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f24579d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f24579d.N();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : BuildConfig.FLAVOR;
            if (z) {
                cVar.t0(text);
            } else if (!TextUtils.isEmpty(string)) {
                cVar.t0(string);
                if (z3 && placeholderText != null) {
                    placeholderText = string + ", " + ((Object) placeholderText);
                    cVar.t0(placeholderText);
                }
            } else if (placeholderText != null) {
                cVar.t0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.h0(string);
                } else {
                    if (z) {
                        string = ((Object) text) + ", " + string;
                    }
                    cVar.t0(string);
                }
                cVar.q0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.i0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.d0(error);
            }
            if (Build.VERSION.SDK_INT < 17 || editText == null) {
                return;
            }
            editText.setLabelFor(c.f.a.d.f.M);
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i2);
    }

    public static class h extends a.k.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f24580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f24582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CharSequence f24583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f24584h;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i2) {
                return new h[i2];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24580d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f24581e = parcel.readInt() == 1;
            this.f24582f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f24583g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f24584h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f24580d) + " hint=" + ((Object) this.f24582f) + " helperText=" + ((Object) this.f24583g) + " placeholderText=" + ((Object) this.f24584h) + "}";
        }

        @Override // a.k.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            TextUtils.writeToParcel(this.f24580d, parcel, i2);
            parcel.writeInt(this.f24581e ? 1 : 0);
            TextUtils.writeToParcel(this.f24582f, parcel, i2);
            TextUtils.writeToParcel(this.f24583g, parcel, i2);
            TextUtils.writeToParcel(this.f24584h, parcel, i2);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f.a.d.b.G);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) {
        int i3;
        int i4;
        int colorForState;
        int i5 = f24561b;
        super(c.f.a.d.o0.a.a.c(context, attributeSet, i2, i5), attributeSet, i2);
        this.f24568i = new c.f.a.d.n0.f(this);
        this.O = new Rect();
        this.P = new Rect();
        this.Q = new RectF();
        this.i0 = new LinkedHashSet<>();
        this.j0 = 0;
        this.k0 = new SparseArray<>();
        this.m0 = new LinkedHashSet<>();
        c.f.a.d.d0.a aVar = new c.f.a.d.d0.a(this);
        this.K0 = aVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f24562c = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f24563d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f24564e = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f24565f = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = c.f.a.d.m.a.f15042a;
        aVar.a0(timeInterpolator);
        aVar.X(timeInterpolator);
        aVar.L(8388659);
        int[] iArr = l.y5;
        int i6 = l.R5;
        int i7 = l.P5;
        int i8 = l.e6;
        int i9 = l.j6;
        int i10 = l.n6;
        u0 u0VarI = j.i(context2, attributeSet, iArr, i2, i5, i6, i7, i8, i9, i10);
        this.A = u0VarI.a(l.m6, true);
        setHint(u0VarI.p(l.B5));
        this.M0 = u0VarI.a(l.l6, true);
        this.L0 = u0VarI.a(l.g6, true);
        this.F = c.f.a.d.j0.k.e(context2, attributeSet, i2, i5).m();
        this.G = context2.getResources().getDimensionPixelOffset(c.f.a.d.d.V);
        this.I = u0VarI.e(l.E5, 0);
        this.K = u0VarI.f(l.L5, context2.getResources().getDimensionPixelSize(c.f.a.d.d.W));
        this.L = u0VarI.f(l.M5, context2.getResources().getDimensionPixelSize(c.f.a.d.d.X));
        this.J = this.K;
        float fD = u0VarI.d(l.I5, -1.0f);
        float fD2 = u0VarI.d(l.H5, -1.0f);
        float fD3 = u0VarI.d(l.F5, -1.0f);
        float fD4 = u0VarI.d(l.G5, -1.0f);
        k.b bVarV = this.F.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.F = bVarV.m();
        ColorStateList colorStateListB = c.f.a.d.g0.c.b(context2, u0VarI, l.C5);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.E0 = defaultColor;
            this.N = defaultColor;
            if (colorStateListB.isStateful()) {
                this.F0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                i3 = 2;
                this.G0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                colorForState = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                i3 = 2;
                this.G0 = this.E0;
                ColorStateList colorStateListC = a.b.l.a.a.c(context2, c.f.a.d.c.f14648g);
                this.F0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            this.H0 = colorForState;
        } else {
            i3 = 2;
            this.N = 0;
            this.E0 = 0;
            this.F0 = 0;
            this.G0 = 0;
            this.H0 = 0;
        }
        int i11 = l.A5;
        if (u0VarI.s(i11)) {
            ColorStateList colorStateListC2 = u0VarI.c(i11);
            this.z0 = colorStateListC2;
            this.y0 = colorStateListC2;
        }
        int i12 = l.J5;
        ColorStateList colorStateListB2 = c.f.a.d.g0.c.b(context2, u0VarI, i12);
        this.C0 = u0VarI.b(i12, 0);
        this.A0 = a.i.i.b.d(context2, c.f.a.d.c.f14649h);
        this.I0 = a.i.i.b.d(context2, c.f.a.d.c.f14650i);
        this.B0 = a.i.i.b.d(context2, c.f.a.d.c.f14651j);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i13 = l.K5;
        if (u0VarI.s(i13)) {
            setBoxStrokeErrorColor(c.f.a.d.g0.c.b(context2, u0VarI, i13));
        }
        if (u0VarI.n(i10, -1) != -1) {
            setHintTextAppearance(u0VarI.n(i10, 0));
        }
        int iN = u0VarI.n(i8, 0);
        CharSequence charSequenceP = u0VarI.p(l.Z5);
        boolean zA = u0VarI.a(l.a6, false);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i14 = c.f.a.d.h.f14830d;
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(i14, (ViewGroup) linearLayout2, false);
        this.w0 = checkableImageButton;
        checkableImageButton.setId(c.f.a.d.f.J);
        checkableImageButton.setVisibility(8);
        if (c.f.a.d.g0.c.g(context2)) {
            i.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        int i15 = l.b6;
        if (u0VarI.s(i15)) {
            setErrorIconDrawable(u0VarI.g(i15));
        }
        int i16 = l.c6;
        if (u0VarI.s(i16)) {
            setErrorIconTintList(c.f.a.d.g0.c.b(context2, u0VarI, i16));
        }
        int i17 = l.d6;
        if (u0VarI.s(i17)) {
            setErrorIconTintMode(c.f.a.d.d0.k.e(u0VarI.k(i17, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(c.f.a.d.j.f14875f));
        x.y0(checkableImageButton, i3);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iN2 = u0VarI.n(i9, 0);
        boolean zA2 = u0VarI.a(l.i6, false);
        CharSequence charSequenceP2 = u0VarI.p(l.h6);
        int iN3 = u0VarI.n(l.v6, 0);
        CharSequence charSequenceP3 = u0VarI.p(l.u6);
        int iN4 = u0VarI.n(l.y6, 0);
        CharSequence charSequenceP4 = u0VarI.p(l.x6);
        int iN5 = u0VarI.n(l.G6, 0);
        CharSequence charSequenceP5 = u0VarI.p(l.F6);
        boolean zA3 = u0VarI.a(l.N5, false);
        setCounterMaxLength(u0VarI.k(l.O5, -1));
        this.f24574o = u0VarI.n(i6, 0);
        this.f24573n = u0VarI.n(i7, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(c.f.a.d.h.f14831e, (ViewGroup) this.f24563d, false);
        this.S = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (c.f.a.d.g0.c.g(context2)) {
            i.c((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i18 = l.C6;
        if (u0VarI.s(i18)) {
            setStartIconDrawable(u0VarI.g(i18));
            int i19 = l.B6;
            if (u0VarI.s(i19)) {
                setStartIconContentDescription(u0VarI.p(i19));
            }
            setStartIconCheckable(u0VarI.a(l.A6, true));
        }
        int i20 = l.D6;
        if (u0VarI.s(i20)) {
            setStartIconTintList(c.f.a.d.g0.c.b(context2, u0VarI, i20));
        }
        int i21 = l.E6;
        if (u0VarI.s(i21)) {
            setStartIconTintMode(c.f.a.d.d0.k.e(u0VarI.k(i21, -1), null));
        }
        setBoxBackgroundMode(u0VarI.k(l.D5, 0));
        this.l0 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(i14, (ViewGroup) this.f24565f, false);
        this.f24565f.addView(this.l0);
        this.l0.setVisibility(8);
        if (c.f.a.d.g0.c.g(context2)) {
            i4 = 0;
            i.d((ViewGroup.MarginLayoutParams) this.l0.getLayoutParams(), 0);
        } else {
            i4 = 0;
        }
        this.k0.append(-1, new c.f.a.d.n0.b(this));
        this.k0.append(i4, new c.f.a.d.n0.h(this));
        this.k0.append(1, new c.f.a.d.n0.i(this));
        this.k0.append(2, new c.f.a.d.n0.a(this));
        this.k0.append(3, new c.f.a.d.n0.d(this));
        int i22 = l.W5;
        if (u0VarI.s(i22)) {
            setEndIconMode(u0VarI.k(i22, 0));
            int i23 = l.V5;
            if (u0VarI.s(i23)) {
                setEndIconDrawable(u0VarI.g(i23));
            }
            int i24 = l.U5;
            if (u0VarI.s(i24)) {
                setEndIconContentDescription(u0VarI.p(i24));
            }
            setEndIconCheckable(u0VarI.a(l.T5, true));
        } else {
            int i25 = l.r6;
            if (u0VarI.s(i25)) {
                setEndIconMode(u0VarI.a(i25, false) ? 1 : 0);
                setEndIconDrawable(u0VarI.g(l.q6));
                setEndIconContentDescription(u0VarI.p(l.p6));
                int i26 = l.s6;
                if (u0VarI.s(i26)) {
                    setEndIconTintList(c.f.a.d.g0.c.b(context2, u0VarI, i26));
                }
                int i27 = l.t6;
                if (u0VarI.s(i27)) {
                    setEndIconTintMode(c.f.a.d.d0.k.e(u0VarI.k(i27, -1), null));
                }
            }
        }
        if (!u0VarI.s(l.r6)) {
            int i28 = l.X5;
            if (u0VarI.s(i28)) {
                setEndIconTintList(c.f.a.d.g0.c.b(context2, u0VarI, i28));
            }
            int i29 = l.Y5;
            if (u0VarI.s(i29)) {
                setEndIconTintMode(c.f.a.d.d0.k.e(u0VarI.k(i29, -1), null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.x = appCompatTextView;
        appCompatTextView.setId(c.f.a.d.f.O);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        x.r0(appCompatTextView, 1);
        this.f24563d.addView(this.S);
        this.f24563d.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.z = appCompatTextView2;
        appCompatTextView2.setId(c.f.a.d.f.P);
        appCompatTextView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        x.r0(appCompatTextView2, 1);
        this.f24564e.addView(appCompatTextView2);
        this.f24564e.addView(this.w0);
        this.f24564e.addView(this.f24565f);
        setHelperTextEnabled(zA2);
        setHelperText(charSequenceP2);
        setHelperTextTextAppearance(iN2);
        setErrorEnabled(zA);
        setErrorTextAppearance(iN);
        setErrorContentDescription(charSequenceP);
        setCounterTextAppearance(this.f24574o);
        setCounterOverflowTextAppearance(this.f24573n);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        setPrefixText(charSequenceP4);
        setPrefixTextAppearance(iN4);
        setSuffixText(charSequenceP5);
        setSuffixTextAppearance(iN5);
        int i30 = l.f6;
        if (u0VarI.s(i30)) {
            setErrorTextColor(u0VarI.c(i30));
        }
        int i31 = l.k6;
        if (u0VarI.s(i31)) {
            setHelperTextColor(u0VarI.c(i31));
        }
        int i32 = l.o6;
        if (u0VarI.s(i32)) {
            setHintTextColor(u0VarI.c(i32));
        }
        int i33 = l.S5;
        if (u0VarI.s(i33)) {
            setCounterTextColor(u0VarI.c(i33));
        }
        int i34 = l.Q5;
        if (u0VarI.s(i34)) {
            setCounterOverflowTextColor(u0VarI.c(i34));
        }
        int i35 = l.w6;
        if (u0VarI.s(i35)) {
            setPlaceholderTextColor(u0VarI.c(i35));
        }
        int i36 = l.z6;
        if (u0VarI.s(i36)) {
            setPrefixTextColor(u0VarI.c(i36));
        }
        int i37 = l.H6;
        if (u0VarI.s(i37)) {
            setSuffixTextColor(u0VarI.c(i37));
        }
        setCounterEnabled(zA3);
        setEnabled(u0VarI.a(l.z5, true));
        u0VarI.w();
        x.y0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            x.z0(this, 1);
        }
    }

    public static void U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, z);
            }
        }
    }

    public static void b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zP = x.P(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zP || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zP);
        checkableImageButton.setPressable(zP);
        checkableImageButton.setLongClickable(z);
        x.y0(checkableImageButton, z2 ? 1 : 2);
    }

    public static void c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    public static void d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    private c.f.a.d.n0.e getEndIconDelegate() {
        c.f.a.d.n0.e eVar = this.k0.get(this.j0);
        return eVar != null ? eVar : this.k0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.w0.getVisibility() == 0) {
            return this.w0;
        }
        if (I() && K()) {
            return this.l0;
        }
        return null;
    }

    public static void o0(Context context, TextView textView, int i2, int i3, boolean z) {
        textView.setContentDescription(context.getString(z ? c.f.a.d.j.f14872c : c.f.a.d.j.f14871b, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private void setEditText(EditText editText) {
        if (this.f24566g != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.j0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f24566g = editText;
        S();
        setTextInputAccessibilityDelegate(new e(this));
        this.K0.b0(this.f24566g.getTypeface());
        this.K0.T(this.f24566g.getTextSize());
        int gravity = this.f24566g.getGravity();
        this.K0.L((gravity & (-113)) | 48);
        this.K0.S(gravity);
        this.f24566g.addTextChangedListener(new a());
        if (this.y0 == null) {
            this.y0 = this.f24566g.getHintTextColors();
        }
        if (this.A) {
            if (TextUtils.isEmpty(this.B)) {
                CharSequence hint = this.f24566g.getHint();
                this.f24567h = hint;
                setHint(hint);
                this.f24566g.setHint((CharSequence) null);
            }
            this.C = true;
        }
        if (this.f24572m != null) {
            n0(this.f24566g.getText().length());
        }
        r0();
        this.f24568i.e();
        this.f24563d.bringToFront();
        this.f24564e.bringToFront();
        this.f24565f.bringToFront();
        this.w0.bringToFront();
        B();
        z0();
        C0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.w0.setVisibility(z ? 0 : 8);
        this.f24565f.setVisibility(z ? 8 : 0);
        C0();
        if (I()) {
            return;
        }
        q0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.B)) {
            return;
        }
        this.B = charSequence;
        this.K0.Z(charSequence);
        if (this.J0) {
            return;
        }
        T();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.q == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.r = appCompatTextView;
            appCompatTextView.setId(c.f.a.d.f.N);
            x.r0(this.r, 1);
            setPlaceholderTextAppearance(this.t);
            setPlaceholderTextColor(this.s);
            g();
        } else {
            Z();
            this.r = null;
        }
        this.q = z;
    }

    public final boolean A() {
        return this.A && !TextUtils.isEmpty(this.B) && (this.D instanceof c.f.a.d.n0.c);
    }

    public final void A0() {
        this.x.setVisibility((this.w == null || N()) ? 8 : 0);
        q0();
    }

    public final void B() {
        Iterator<f> it = this.i0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void B0(boolean z, boolean z2) {
        int defaultColor = this.D0.getDefaultColor();
        int colorForState = this.D0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.D0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.M = colorForState2;
        } else if (z2) {
            this.M = colorForState;
        } else {
            this.M = defaultColor;
        }
    }

    public final void C(int i2) {
        Iterator<g> it = this.m0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
    }

    public final void C0() {
        if (this.f24566g == null) {
            return;
        }
        x.B0(this.z, getContext().getResources().getDimensionPixelSize(c.f.a.d.d.w), this.f24566g.getPaddingTop(), (K() || L()) ? 0 : x.H(this.f24566g), this.f24566g.getPaddingBottom());
    }

    public final void D(Canvas canvas) {
        c.f.a.d.j0.g gVar = this.E;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.J;
            this.E.draw(canvas);
        }
    }

    public final void D0() {
        int visibility = this.z.getVisibility();
        boolean z = (this.y == null || N()) ? false : true;
        this.z.setVisibility(z ? 0 : 8);
        if (visibility != this.z.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        q0();
    }

    public final void E(Canvas canvas) {
        if (this.A) {
            this.K0.j(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E0() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.E0():void");
    }

    public final void F(boolean z) {
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.N0.cancel();
        }
        if (z && this.M0) {
            i(0.0f);
        } else {
            this.K0.V(0.0f);
        }
        if (A() && ((c.f.a.d.n0.c) this.D).k0()) {
            y();
        }
        this.J0 = true;
        J();
        A0();
        D0();
    }

    public final int G(int i2, boolean z) {
        int compoundPaddingLeft = i2 + this.f24566g.getCompoundPaddingLeft();
        return (this.w == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.x.getMeasuredWidth()) + this.x.getPaddingLeft();
    }

    public final int H(int i2, boolean z) {
        int compoundPaddingRight = i2 - this.f24566g.getCompoundPaddingRight();
        return (this.w == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.x.getMeasuredWidth() - this.x.getPaddingRight());
    }

    public final boolean I() {
        return this.j0 != 0;
    }

    public final void J() {
        TextView textView = this.r;
        if (textView == null || !this.q) {
            return;
        }
        textView.setText((CharSequence) null);
        this.r.setVisibility(4);
    }

    public boolean K() {
        return this.f24565f.getVisibility() == 0 && this.l0.getVisibility() == 0;
    }

    public final boolean L() {
        return this.w0.getVisibility() == 0;
    }

    public boolean M() {
        return this.f24568i.y();
    }

    public final boolean N() {
        return this.J0;
    }

    public boolean O() {
        return this.C;
    }

    public final boolean P() {
        return this.H == 1 && (Build.VERSION.SDK_INT < 16 || this.f24566g.getMinLines() <= 1);
    }

    public boolean Q() {
        return this.S.getVisibility() == 0;
    }

    public final int[] R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    public final void S() {
        p();
        a0();
        E0();
        k0();
        h();
        if (this.H != 0) {
            t0();
        }
    }

    public final void T() {
        if (A()) {
            RectF rectF = this.Q;
            this.K0.m(rectF, this.f24566g.getWidth(), this.f24566g.getGravity());
            l(rectF);
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            ((c.f.a.d.n0.c) this.D).q0(rectF);
        }
    }

    public void V() {
        X(this.l0, this.n0);
    }

    public void W() {
        X(this.w0, this.x0);
    }

    public final void X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(R(checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = a.i.j.l.a.r(drawable).mutate();
        a.i.j.l.a.o(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public void Y() {
        X(this.S, this.T);
    }

    public final void Z() {
        TextView textView = this.r;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void a0() {
        if (h0()) {
            x.s0(this.f24566g, this.D);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f24562c.addView(view, layoutParams2);
        this.f24562c.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f24566g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f24567h != null) {
            boolean z = this.C;
            this.C = false;
            CharSequence hint = editText.getHint();
            this.f24566g.setHint(this.f24567h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f24566g.setHint(hint);
                this.C = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        viewStructure.setChildCount(this.f24562c.getChildCount());
        for (int i3 = 0; i3 < this.f24562c.getChildCount(); i3++) {
            View childAt = this.f24562c.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.f24566g) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.P0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.P0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.O0) {
            return;
        }
        this.O0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        c.f.a.d.d0.a aVar = this.K0;
        boolean zY = aVar != null ? aVar.Y(drawableState) | false : false;
        if (this.f24566g != null) {
            u0(x.U(this) && isEnabled());
        }
        r0();
        E0();
        if (zY) {
            invalidate();
        }
        this.O0 = false;
    }

    public void e(f fVar) {
        this.i0.add(fVar);
        if (this.f24566g != null) {
            fVar.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e0(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            a.i.s.i.q(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = c.f.a.d.k.f14993a
            a.i.s.i.q(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = c.f.a.d.c.f14642a
            int r4 = a.i.i.b.d(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e0(android.widget.TextView, int):void");
    }

    public void f(g gVar) {
        this.m0.add(gVar);
    }

    public final boolean f0() {
        return (this.w0.getVisibility() == 0 || ((I() && K()) || this.y != null)) && this.f24564e.getMeasuredWidth() > 0;
    }

    public final void g() {
        TextView textView = this.r;
        if (textView != null) {
            this.f24562c.addView(textView);
            this.r.setVisibility(0);
        }
    }

    public final boolean g0() {
        return !(getStartIconDrawable() == null && this.w == null) && this.f24563d.getMeasuredWidth() > 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f24566g;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    public c.f.a.d.j0.g getBoxBackground() {
        int i2 = this.H;
        if (i2 == 1 || i2 == 2) {
            return this.D;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.N;
    }

    public int getBoxBackgroundMode() {
        return this.H;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.D.s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.D.t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.D.G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.D.F();
    }

    public int getBoxStrokeColor() {
        return this.C0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.D0;
    }

    public int getBoxStrokeWidth() {
        return this.K;
    }

    public int getBoxStrokeWidthFocused() {
        return this.L;
    }

    public int getCounterMaxLength() {
        return this.f24570k;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f24569j && this.f24571l && (textView = this.f24572m) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.u;
    }

    public ColorStateList getCounterTextColor() {
        return this.u;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.y0;
    }

    public EditText getEditText() {
        return this.f24566g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.l0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.l0.getDrawable();
    }

    public int getEndIconMode() {
        return this.j0;
    }

    public CheckableImageButton getEndIconView() {
        return this.l0;
    }

    public CharSequence getError() {
        if (this.f24568i.x()) {
            return this.f24568i.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f24568i.m();
    }

    public int getErrorCurrentTextColors() {
        return this.f24568i.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.w0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f24568i.o();
    }

    public CharSequence getHelperText() {
        if (this.f24568i.y()) {
            return this.f24568i.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f24568i.r();
    }

    public CharSequence getHint() {
        if (this.A) {
            return this.B;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.K0.o();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.K0.r();
    }

    public ColorStateList getHintTextColor() {
        return this.z0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.l0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.l0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.q) {
            return this.p;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.t;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.s;
    }

    public CharSequence getPrefixText() {
        return this.w;
    }

    public ColorStateList getPrefixTextColor() {
        return this.x.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.x;
    }

    public CharSequence getStartIconContentDescription() {
        return this.S.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.S.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.y;
    }

    public ColorStateList getSuffixTextColor() {
        return this.z.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.z;
    }

    public Typeface getTypeface() {
        return this.R;
    }

    public final void h() {
        EditText editText;
        int I;
        int dimensionPixelSize;
        int iH;
        Resources resources;
        int i2;
        if (this.f24566g == null || this.H != 1) {
            return;
        }
        if (c.f.a.d.g0.c.h(getContext())) {
            editText = this.f24566g;
            I = x.I(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(c.f.a.d.d.q);
            iH = x.H(this.f24566g);
            resources = getResources();
            i2 = c.f.a.d.d.p;
        } else {
            if (!c.f.a.d.g0.c.g(getContext())) {
                return;
            }
            editText = this.f24566g;
            I = x.I(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(c.f.a.d.d.f14716o);
            iH = x.H(this.f24566g);
            resources = getResources();
            i2 = c.f.a.d.d.f14715n;
        }
        x.B0(editText, I, dimensionPixelSize, iH, resources.getDimensionPixelSize(i2));
    }

    public final boolean h0() {
        EditText editText = this.f24566g;
        return (editText == null || this.D == null || editText.getBackground() != null || this.H == 0) ? false : true;
    }

    public void i(float f2) {
        if (this.K0.v() == f2) {
            return;
        }
        if (this.N0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.N0 = valueAnimator;
            valueAnimator.setInterpolator(c.f.a.d.m.a.f15043b);
            this.N0.setDuration(167L);
            this.N0.addUpdateListener(new d());
        }
        this.N0.setFloatValues(this.K0.v(), f2);
        this.N0.start();
    }

    public final void i0() {
        TextView textView = this.r;
        if (textView == null || !this.q) {
            return;
        }
        textView.setText(this.p);
        this.r.setVisibility(0);
        this.r.bringToFront();
    }

    public final void j() {
        c.f.a.d.j0.g gVar = this.D;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.F);
        if (w()) {
            this.D.d0(this.J, this.M);
        }
        int iQ = q();
        this.N = iQ;
        this.D.X(ColorStateList.valueOf(iQ));
        if (this.j0 == 3) {
            this.f24566g.getBackground().invalidateSelf();
        }
        k();
        invalidate();
    }

    public final void j0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m();
            return;
        }
        Drawable drawableMutate = a.i.j.l.a.r(getEndIconDrawable()).mutate();
        a.i.j.l.a.n(drawableMutate, this.f24568i.o());
        this.l0.setImageDrawable(drawableMutate);
    }

    public final void k() {
        if (this.E == null) {
            return;
        }
        if (x()) {
            this.E.X(ColorStateList.valueOf(this.M));
        }
        invalidate();
    }

    public final void k0() {
        Resources resources;
        int i2;
        if (this.H == 1) {
            if (c.f.a.d.g0.c.h(getContext())) {
                resources = getResources();
                i2 = c.f.a.d.d.s;
            } else {
                if (!c.f.a.d.g0.c.g(getContext())) {
                    return;
                }
                resources = getResources();
                i2 = c.f.a.d.d.r;
            }
            this.I = resources.getDimensionPixelSize(i2);
        }
    }

    public final void l(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.G;
        rectF.left = f2 - i2;
        rectF.top -= i2;
        rectF.right += i2;
        rectF.bottom += i2;
    }

    public final void l0(Rect rect) {
        c.f.a.d.j0.g gVar = this.E;
        if (gVar != null) {
            int i2 = rect.bottom;
            gVar.setBounds(rect.left, i2 - this.L, rect.right, i2);
        }
    }

    public final void m() {
        n(this.l0, this.o0, this.n0, this.q0, this.p0);
    }

    public final void m0() {
        if (this.f24572m != null) {
            EditText editText = this.f24566g;
            n0(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = a.i.j.l.a.r(drawable).mutate();
            if (z) {
                a.i.j.l.a.o(drawable, colorStateList);
            }
            if (z2) {
                a.i.j.l.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void n0(int i2) {
        boolean z = this.f24571l;
        int i3 = this.f24570k;
        if (i3 == -1) {
            this.f24572m.setText(String.valueOf(i2));
            this.f24572m.setContentDescription(null);
            this.f24571l = false;
        } else {
            this.f24571l = i2 > i3;
            o0(getContext(), this.f24572m, i2, this.f24570k, this.f24571l);
            if (z != this.f24571l) {
                p0();
            }
            this.f24572m.setText(a.i.p.a.c().j(getContext().getString(c.f.a.d.j.f14873d, Integer.valueOf(i2), Integer.valueOf(this.f24570k))));
        }
        if (this.f24566g == null || z == this.f24571l) {
            return;
        }
        u0(false);
        E0();
        r0();
    }

    public final void o() {
        n(this.S, this.U, this.T, this.W, this.V);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.f24566g;
        if (editText != null) {
            Rect rect = this.O;
            c.f.a.d.d0.b.a(this, editText, rect);
            l0(rect);
            if (this.A) {
                this.K0.T(this.f24566g.getTextSize());
                int gravity = this.f24566g.getGravity();
                this.K0.L((gravity & (-113)) | 48);
                this.K0.S(gravity);
                this.K0.H(r(rect));
                this.K0.P(u(rect));
                this.K0.E();
                if (!A() || this.J0) {
                    return;
                }
                T();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        boolean zS0 = s0();
        boolean zQ0 = q0();
        if (zS0 || zQ0) {
            this.f24566g.post(new c());
        }
        w0();
        z0();
        C0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.b());
        setError(hVar.f24580d);
        if (hVar.f24581e) {
            this.l0.post(new b());
        }
        setHint(hVar.f24582f);
        setHelperText(hVar.f24583g);
        setPlaceholderText(hVar.f24584h);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f24568i.k()) {
            hVar.f24580d = getError();
        }
        hVar.f24581e = I() && this.l0.isChecked();
        hVar.f24582f = getHint();
        hVar.f24583g = getHelperText();
        hVar.f24584h = getPlaceholderText();
        return hVar;
    }

    public final void p() {
        int i2 = this.H;
        if (i2 == 0) {
            this.D = null;
        } else if (i2 == 1) {
            this.D = new c.f.a.d.j0.g(this.F);
            this.E = new c.f.a.d.j0.g();
            return;
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.H + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.D = (!this.A || (this.D instanceof c.f.a.d.n0.c)) ? new c.f.a.d.j0.g(this.F) : new c.f.a.d.n0.c(this.F);
        }
        this.E = null;
    }

    public final void p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f24572m;
        if (textView != null) {
            e0(textView, this.f24571l ? this.f24573n : this.f24574o);
            if (!this.f24571l && (colorStateList2 = this.u) != null) {
                this.f24572m.setTextColor(colorStateList2);
            }
            if (!this.f24571l || (colorStateList = this.v) == null) {
                return;
            }
            this.f24572m.setTextColor(colorStateList);
        }
    }

    public final int q() {
        return this.H == 1 ? c.f.a.d.w.a.e(c.f.a.d.w.a.d(this, c.f.a.d.b.f14636m, 0), this.N) : this.N;
    }

    public final boolean q0() {
        boolean z;
        if (this.f24566g == null) {
            return false;
        }
        boolean z2 = true;
        if (g0()) {
            int measuredWidth = this.f24563d.getMeasuredWidth() - this.f24566g.getPaddingLeft();
            if (this.f0 == null || this.g0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f0 = colorDrawable;
                this.g0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = a.i.s.i.a(this.f24566g);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.f0;
            if (drawable != drawable2) {
                a.i.s.i.l(this.f24566g, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f0 != null) {
                Drawable[] drawableArrA2 = a.i.s.i.a(this.f24566g);
                a.i.s.i.l(this.f24566g, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f0 = null;
                z = true;
            }
            z = false;
        }
        if (f0()) {
            int measuredWidth2 = this.z.getMeasuredWidth() - this.f24566g.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + i.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrA3 = a.i.s.i.a(this.f24566g);
            Drawable drawable3 = this.r0;
            if (drawable3 == null || this.s0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.r0 = colorDrawable2;
                    this.s0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrA3[2];
                Drawable drawable5 = this.r0;
                if (drawable4 != drawable5) {
                    this.t0 = drawableArrA3[2];
                    a.i.s.i.l(this.f24566g, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.s0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                a.i.s.i.l(this.f24566g, drawableArrA3[0], drawableArrA3[1], this.r0, drawableArrA3[3]);
            }
        } else {
            if (this.r0 == null) {
                return z;
            }
            Drawable[] drawableArrA4 = a.i.s.i.a(this.f24566g);
            if (drawableArrA4[2] == this.r0) {
                a.i.s.i.l(this.f24566g, drawableArrA4[0], drawableArrA4[1], this.t0, drawableArrA4[3]);
            } else {
                z2 = z;
            }
            this.r0 = null;
        }
        return z2;
    }

    public final Rect r(Rect rect) {
        int paddingTop;
        int iH;
        if (this.f24566g == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.P;
        boolean z = x.C(this) == 1;
        rect2.bottom = rect.bottom;
        int i2 = this.H;
        if (i2 == 1) {
            rect2.left = G(rect.left, z);
            paddingTop = rect.top + this.I;
        } else {
            if (i2 == 2) {
                rect2.left = rect.left + this.f24566g.getPaddingLeft();
                rect2.top = rect.top - v();
                iH = rect.right - this.f24566g.getPaddingRight();
                rect2.right = iH;
                return rect2;
            }
            rect2.left = G(rect.left, z);
            paddingTop = getPaddingTop();
        }
        rect2.top = paddingTop;
        iH = H(rect.right, z);
        rect2.right = iH;
        return rect2;
    }

    public void r0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f24566g;
        if (editText == null || this.H != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (b0.a(background)) {
            background = background.mutate();
        }
        if (this.f24568i.k()) {
            currentTextColor = this.f24568i.o();
        } else {
            if (!this.f24571l || (textView = this.f24572m) == null) {
                a.i.j.l.a.c(background);
                this.f24566g.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(a.b.q.i.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final int s(Rect rect, Rect rect2, float f2) {
        return P() ? (int) (rect2.top + f2) : rect.bottom - this.f24566g.getCompoundPaddingBottom();
    }

    public final boolean s0() {
        int iMax;
        if (this.f24566g == null || this.f24566g.getMeasuredHeight() >= (iMax = Math.max(this.f24564e.getMeasuredHeight(), this.f24563d.getMeasuredHeight()))) {
            return false;
        }
        this.f24566g.setMinimumHeight(iMax);
        return true;
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.N != i2) {
            this.N = i2;
            this.E0 = i2;
            this.G0 = i2;
            this.H0 = i2;
            j();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(a.i.i.b.d(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.E0 = defaultColor;
        this.N = defaultColor;
        this.F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.G0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.H0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        j();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.H) {
            return;
        }
        this.H = i2;
        if (this.f24566g != null) {
            S();
        }
    }

    public void setBoxStrokeColor(int i2) {
        if (this.C0 != i2) {
            this.C0 = i2;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.C0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            E0();
        } else {
            this.A0 = colorStateList.getDefaultColor();
            this.I0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.B0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.C0 = defaultColor;
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.K = i2;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.L = i2;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f24569j != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f24572m = appCompatTextView;
                appCompatTextView.setId(c.f.a.d.f.K);
                Typeface typeface = this.R;
                if (typeface != null) {
                    this.f24572m.setTypeface(typeface);
                }
                this.f24572m.setMaxLines(1);
                this.f24568i.d(this.f24572m, 2);
                i.d((ViewGroup.MarginLayoutParams) this.f24572m.getLayoutParams(), getResources().getDimensionPixelOffset(c.f.a.d.d.Y));
                p0();
                m0();
            } else {
                this.f24568i.z(this.f24572m, 2);
                this.f24572m = null;
            }
            this.f24569j = z;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f24570k != i2) {
            if (i2 <= 0) {
                i2 = -1;
            }
            this.f24570k = i2;
            if (this.f24569j) {
                m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f24573n != i2) {
            this.f24573n = i2;
            p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            p0();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f24574o != i2) {
            this.f24574o = i2;
            p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.y0 = colorStateList;
        this.z0 = colorStateList;
        if (this.f24566g != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.l0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.l0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.l0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? a.b.l.a.a.d(getContext(), i2) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.l0.setImageDrawable(drawable);
        V();
    }

    public void setEndIconMode(int i2) {
        int i3 = this.j0;
        this.j0 = i2;
        C(i3);
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().b(this.H)) {
            getEndIconDelegate().a();
            m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.H + " is not supported by the end icon mode " + i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.l0, onClickListener, this.u0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.u0 = onLongClickListener;
        d0(this.l0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.n0 != colorStateList) {
            this.n0 = colorStateList;
            this.o0 = true;
            m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.p0 != mode) {
            this.p0 = mode;
            this.q0 = true;
            m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (K() != z) {
            this.l0.setVisibility(z ? 0 : 8);
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f24568i.x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f24568i.t();
        } else {
            this.f24568i.M(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f24568i.B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f24568i.C(z);
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? a.b.l.a.a.d(getContext(), i2) : null);
        W();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.w0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f24568i.x());
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.w0, onClickListener, this.v0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.v0 = onLongClickListener;
        d0(this.w0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.x0 = colorStateList;
        Drawable drawable = this.w0.getDrawable();
        if (drawable != null) {
            drawable = a.i.j.l.a.r(drawable).mutate();
            a.i.j.l.a.o(drawable, colorStateList);
        }
        if (this.w0.getDrawable() != drawable) {
            this.w0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.w0.getDrawable();
        if (drawable != null) {
            drawable = a.i.j.l.a.r(drawable).mutate();
            a.i.j.l.a.p(drawable, mode);
        }
        if (this.w0.getDrawable() != drawable) {
            this.w0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        this.f24568i.D(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f24568i.E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.L0 != z) {
            this.L0 = z;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.f24568i.N(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f24568i.H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f24568i.G(z);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.f24568i.F(i2);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.M0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.A) {
            this.A = z;
            if (z) {
                CharSequence hint = this.f24566g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.B)) {
                        setHint(hint);
                    }
                    this.f24566g.setHint((CharSequence) null);
                }
                this.C = true;
            } else {
                this.C = false;
                if (!TextUtils.isEmpty(this.B) && TextUtils.isEmpty(this.f24566g.getHint())) {
                    this.f24566g.setHint(this.B);
                }
                setHintInternal(null);
            }
            if (this.f24566g != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        this.K0.I(i2);
        this.z0 = this.K0.n();
        if (this.f24566g != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            if (this.y0 == null) {
                this.K0.K(colorStateList);
            }
            this.z0 = colorStateList;
            if (this.f24566g != null) {
                u0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.l0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? a.b.l.a.a.d(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.l0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.j0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.n0 = colorStateList;
        this.o0 = true;
        m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.p0 = mode;
        this.q0 = true;
        m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.q && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.q) {
                setPlaceholderTextEnabled(true);
            }
            this.p = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.t = i2;
        TextView textView = this.r;
        if (textView != null) {
            a.i.s.i.q(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.s != colorStateList) {
            this.s = colorStateList;
            TextView textView = this.r;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.w = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.x.setText(charSequence);
        A0();
    }

    public void setPrefixTextAppearance(int i2) {
        a.i.s.i.q(this.x, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.x.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.S.setCheckable(z);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.S.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? a.b.l.a.a.d(getContext(), i2) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.S.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            Y();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.S, onClickListener, this.h0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.h0 = onLongClickListener;
        d0(this.S, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            this.U = true;
            o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.V != mode) {
            this.V = mode;
            this.W = true;
            o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (Q() != z) {
            this.S.setVisibility(z ? 0 : 8);
            z0();
            q0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.z.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i2) {
        a.i.s.i.q(this.z, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f24566g;
        if (editText != null) {
            x.p0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.R) {
            this.R = typeface;
            this.K0.b0(typeface);
            this.f24568i.J(typeface);
            TextView textView = this.f24572m;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(Rect rect, float f2) {
        return P() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.f24566g.getCompoundPaddingTop();
    }

    public final void t0() {
        if (this.H != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24562c.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f24562c.requestLayout();
            }
        }
    }

    public final Rect u(Rect rect) {
        if (this.f24566g == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.P;
        float fU = this.K0.u();
        rect2.left = rect.left + this.f24566g.getCompoundPaddingLeft();
        rect2.top = t(rect, fU);
        rect2.right = rect.right - this.f24566g.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fU);
        return rect2;
    }

    public void u0(boolean z) {
        v0(z, false);
    }

    public final int v() {
        float fO;
        if (!this.A) {
            return 0;
        }
        int i2 = this.H;
        if (i2 == 0 || i2 == 1) {
            fO = this.K0.o();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fO = this.K0.o() / 2.0f;
        }
        return (int) fO;
    }

    public final void v0(boolean z, boolean z2) {
        ColorStateList textColors;
        c.f.a.d.d0.a aVar;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f24566g;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f24566g;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zK = this.f24568i.k();
        ColorStateList colorStateList = this.y0;
        if (colorStateList != null) {
            this.K0.K(colorStateList);
            this.K0.R(this.y0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList2 = this.y0;
            int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(new int[]{-16842910}, this.I0) : this.I0;
            this.K0.K(ColorStateList.valueOf(colorForState));
            this.K0.R(ColorStateList.valueOf(colorForState));
        } else if (zK) {
            this.K0.K(this.f24568i.p());
        } else {
            if (this.f24571l && (textView = this.f24572m) != null) {
                aVar = this.K0;
                textColors = textView.getTextColors();
            } else if (z4 && (textColors = this.z0) != null) {
                aVar = this.K0;
            }
            aVar.K(textColors);
        }
        if (z3 || !this.L0 || (isEnabled() && z4)) {
            if (z2 || this.J0) {
                z(z);
                return;
            }
            return;
        }
        if (z2 || !this.J0) {
            F(z);
        }
    }

    public final boolean w() {
        return this.H == 2 && x();
    }

    public final void w0() {
        EditText editText;
        if (this.r == null || (editText = this.f24566g) == null) {
            return;
        }
        this.r.setGravity(editText.getGravity());
        this.r.setPadding(this.f24566g.getCompoundPaddingLeft(), this.f24566g.getCompoundPaddingTop(), this.f24566g.getCompoundPaddingRight(), this.f24566g.getCompoundPaddingBottom());
    }

    public final boolean x() {
        return this.J > -1 && this.M != 0;
    }

    public final void x0() {
        EditText editText = this.f24566g;
        y0(editText == null ? 0 : editText.getText().length());
    }

    public final void y() {
        if (A()) {
            ((c.f.a.d.n0.c) this.D).n0();
        }
    }

    public final void y0(int i2) {
        if (i2 != 0 || this.J0) {
            J();
        } else {
            i0();
        }
    }

    public final void z(boolean z) {
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.N0.cancel();
        }
        if (z && this.M0) {
            i(1.0f);
        } else {
            this.K0.V(1.0f);
        }
        this.J0 = false;
        if (A()) {
            T();
        }
        x0();
        A0();
        D0();
    }

    public final void z0() {
        if (this.f24566g == null) {
            return;
        }
        x.B0(this.x, Q() ? 0 : x.I(this.f24566g), this.f24566g.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(c.f.a.d.d.w), this.f24566g.getCompoundPaddingBottom());
    }
}
