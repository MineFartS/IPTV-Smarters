package c.f.a.d.n0;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import c.f.a.d.j;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public class i extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextWatcher f15164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextInputLayout.f f15165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextInputLayout.g f15166f;

    public class a extends c.f.a.d.d0.i {
        public a() {
        }

        @Override // c.f.a.d.d0.i, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            i.this.f15139c.setChecked(!r1.g());
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            i.this.f15139c.setChecked(!r4.g());
            editText.removeTextChangedListener(i.this.f15164d);
            editText.addTextChangedListener(i.this.f15164d);
        }
    }

    public class c implements TextInputLayout.g {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditText f15170b;

            public a(EditText editText) {
                this.f15170b = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f15170b.removeTextChangedListener(i.this.f15164d);
            }
        }

        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = i.this.f15137a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(i.this.g() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            i.this.f15137a.V();
        }
    }

    public i(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f15164d = new a();
        this.f15165e = new b();
        this.f15166f = new c();
    }

    public static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // c.f.a.d.n0.e
    public void a() {
        this.f15137a.setEndIconDrawable(a.b.l.a.a.d(this.f15138b, c.f.a.d.e.f14775a));
        TextInputLayout textInputLayout = this.f15137a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.t));
        this.f15137a.setEndIconOnClickListener(new d());
        this.f15137a.e(this.f15165e);
        this.f15137a.f(this.f15166f);
        EditText editText = this.f15137a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean g() {
        EditText editText = this.f15137a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
