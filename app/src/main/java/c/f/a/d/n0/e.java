package c.f.a.d.n0;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextInputLayout f15137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f15138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckableImageButton f15139c;

    public e(TextInputLayout textInputLayout) {
        this.f15137a = textInputLayout;
        this.f15138b = textInputLayout.getContext();
        this.f15139c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i2) {
        return true;
    }

    public void c(boolean z) {
    }

    public boolean d() {
        return false;
    }
}
