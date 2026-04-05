package c.f.a.d.n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import c.f.a.d.j;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c.f.a.d.n0.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextWatcher f15093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View.OnFocusChangeListener f15094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextInputLayout.f f15095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextInputLayout.g f15096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AnimatorSet f15097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ValueAnimator f15098i;

    /* JADX INFO: renamed from: c.f.a.d.n0.a$a, reason: collision with other inner class name */
    public class C0170a implements TextWatcher {
        public C0170a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f15137a.getSuffixText() != null) {
                return;
            }
            a.this.i(a.l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            a.this.i((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z);
        }
    }

    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && a.l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.f15094e);
            editText.removeTextChangedListener(a.this.f15093d);
            editText.addTextChangedListener(a.this.f15093d);
        }
    }

    public class d implements TextInputLayout.g {

        /* JADX INFO: renamed from: c.f.a.d.n0.a$d$a, reason: collision with other inner class name */
        public class RunnableC0171a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditText f15103b;

            public RunnableC0171a(EditText editText) {
                this.f15103b = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f15103b.removeTextChangedListener(a.this.f15093d);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 2) {
                return;
            }
            editText.post(new RunnableC0171a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f15094e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f15137a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f15137a.V();
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f15137a.setEndIconVisible(true);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f15137a.setEndIconVisible(false);
        }
    }

    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f15139c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f15139c.setScaleX(fFloatValue);
            a.this.f15139c.setScaleY(fFloatValue);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f15093d = new C0170a();
        this.f15094e = new b();
        this.f15095f = new c();
        this.f15096g = new d();
    }

    public static boolean l(Editable editable) {
        return editable.length() > 0;
    }

    @Override // c.f.a.d.n0.e
    public void a() {
        this.f15137a.setEndIconDrawable(a.b.l.a.a.d(this.f15138b, c.f.a.d.e.f14780f));
        TextInputLayout textInputLayout = this.f15137a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.f14874e));
        this.f15137a.setEndIconOnClickListener(new e());
        this.f15137a.e(this.f15095f);
        this.f15137a.f(this.f15096g);
        m();
    }

    @Override // c.f.a.d.n0.e
    public void c(boolean z) {
        if (this.f15137a.getSuffixText() == null) {
            return;
        }
        i(z);
    }

    public final void i(boolean z) {
        boolean z2 = this.f15137a.K() == z;
        if (z && !this.f15097h.isRunning()) {
            this.f15098i.cancel();
            this.f15097h.start();
            if (z2) {
                this.f15097h.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f15097h.cancel();
        this.f15098i.start();
        if (z2) {
            this.f15098i.end();
        }
    }

    public final ValueAnimator j(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(c.f.a.d.m.a.f15042a);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new h());
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(c.f.a.d.m.a.f15045d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new i());
        return valueAnimatorOfFloat;
    }

    public final void m() {
        ValueAnimator valueAnimatorK = k();
        ValueAnimator valueAnimatorJ = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15097h = animatorSet;
        animatorSet.playTogether(valueAnimatorK, valueAnimatorJ);
        this.f15097h.addListener(new f());
        ValueAnimator valueAnimatorJ2 = j(1.0f, 0.0f);
        this.f15098i = valueAnimatorJ2;
        valueAnimatorJ2.addListener(new g());
    }
}
