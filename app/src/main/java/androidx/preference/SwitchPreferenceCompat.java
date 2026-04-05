package androidx.preference;

import a.x.c;
import a.x.d;
import a.x.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final a O;
    public CharSequence P;
    public CharSequence Q;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreferenceCompat.this.a(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.Q(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f3758i);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.O = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.K1, i2, i3);
        T(a.i.i.e.g.o(typedArrayObtainStyledAttributes, g.S1, g.L1));
        S(a.i.i.e.g.o(typedArrayObtainStyledAttributes, g.R1, g.M1));
        W(a.i.i.e.g.o(typedArrayObtainStyledAttributes, g.U1, g.O1));
        V(a.i.i.e.g.o(typedArrayObtainStyledAttributes, g.T1, g.P1));
        R(a.i.i.e.g.b(typedArrayObtainStyledAttributes, g.Q1, g.N1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void I(View view) {
        super.I(view);
        Y(view);
    }

    public void V(CharSequence charSequence) {
        this.Q = charSequence;
        B();
    }

    public void W(CharSequence charSequence) {
        this.P = charSequence;
        B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.J);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.P);
            switchCompat.setTextOff(this.Q);
            switchCompat.setOnCheckedChangeListener(this.O);
        }
    }

    public final void Y(View view) {
        if (((AccessibilityManager) d().getSystemService("accessibility")).isEnabled()) {
            X(view.findViewById(d.f3760a));
            U(view.findViewById(R.id.summary));
        }
    }
}
