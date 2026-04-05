package androidx.preference;

import a.i.i.e.g;
import a.x.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence J;
    public CharSequence K;
    public Drawable L;
    public CharSequence M;
    public CharSequence N;
    public int O;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a(context, c.f3751b, R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.x.g.C, i2, i3);
        String strO = g.o(typedArrayObtainStyledAttributes, a.x.g.M, a.x.g.D);
        this.J = strO;
        if (strO == null) {
            this.J = w();
        }
        this.K = g.o(typedArrayObtainStyledAttributes, a.x.g.L, a.x.g.E);
        this.L = g.c(typedArrayObtainStyledAttributes, a.x.g.J, a.x.g.F);
        this.M = g.o(typedArrayObtainStyledAttributes, a.x.g.O, a.x.g.G);
        this.N = g.o(typedArrayObtainStyledAttributes, a.x.g.N, a.x.g.H);
        this.O = g.n(typedArrayObtainStyledAttributes, a.x.g.K, a.x.g.I, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void D() {
        t();
        throw null;
    }
}
