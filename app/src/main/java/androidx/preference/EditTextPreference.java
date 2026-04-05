package androidx.preference;

import a.i.i.e.g;
import a.x.c;
import a.x.f;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String P;

    public static final class a implements Preference.e<EditTextPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f4744a;

        public static a b() {
            if (f4744a == null) {
                f4744a = new a();
            }
            return f4744a;
        }

        @Override // androidx.preference.Preference.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.P()) ? editTextPreference.d().getString(f.f3762a) : editTextPreference.P();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a(context, c.f3753d, R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.x.g.Q, i2, i3);
        int i4 = a.x.g.R;
        if (g.b(typedArrayObtainStyledAttributes, i4, i4, false)) {
            M(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object F(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    @Override // androidx.preference.Preference
    public boolean N() {
        return TextUtils.isEmpty(this.P) || super.N();
    }

    public String P() {
        return this.P;
    }
}
