package androidx.preference;

import a.i.i.e.g;
import a.x.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public CharSequence[] P;
    public CharSequence[] Q;
    public Set<String> R;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a(context, c.f3751b, R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.R = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.x.g.k0, i2, i3);
        this.P = g.q(typedArrayObtainStyledAttributes, a.x.g.n0, a.x.g.l0);
        this.Q = g.q(typedArrayObtainStyledAttributes, a.x.g.o0, a.x.g.m0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object F(TypedArray typedArray, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
