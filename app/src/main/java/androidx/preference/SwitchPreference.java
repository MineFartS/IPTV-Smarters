package androidx.preference;

import a.i.i.e.g;
import a.x.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final a O;
    public CharSequence P;
    public CharSequence Q;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreference.this.a(Boolean.valueOf(z))) {
                SwitchPreference.this.Q(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a(context, c.f3759j, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.O = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.x.g.z1, i2, i3);
        T(g.o(typedArrayObtainStyledAttributes, a.x.g.H1, a.x.g.A1));
        S(g.o(typedArrayObtainStyledAttributes, a.x.g.G1, a.x.g.B1));
        W(g.o(typedArrayObtainStyledAttributes, a.x.g.J1, a.x.g.D1));
        V(g.o(typedArrayObtainStyledAttributes, a.x.g.I1, a.x.g.E1));
        R(g.b(typedArrayObtainStyledAttributes, a.x.g.F1, a.x.g.C1, false));
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
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.J);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.P);
            r4.setTextOff(this.Q);
            r4.setOnCheckedChangeListener(this.O);
        }
    }

    public final void Y(View view) {
        if (((AccessibilityManager) d().getSystemService("accessibility")).isEnabled()) {
            X(view.findViewById(R.id.switch_widget));
            U(view.findViewById(R.id.summary));
        }
    }
}
