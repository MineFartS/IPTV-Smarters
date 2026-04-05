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

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final a O;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (CheckBoxPreference.this.a(Boolean.valueOf(z))) {
                CheckBoxPreference.this.Q(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a(context, c.f3750a, R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.O = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.x.g.r, i2, i3);
        T(g.o(typedArrayObtainStyledAttributes, a.x.g.x, a.x.g.s));
        S(g.o(typedArrayObtainStyledAttributes, a.x.g.w, a.x.g.t));
        R(g.b(typedArrayObtainStyledAttributes, a.x.g.v, a.x.g.u, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void I(View view) {
        super.I(view);
        W(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.J);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.O);
        }
    }

    public final void W(View view) {
        if (((AccessibilityManager) d().getSystemService("accessibility")).isEnabled()) {
            V(view.findViewById(R.id.checkbox));
            U(view.findViewById(R.id.summary));
        }
    }
}
