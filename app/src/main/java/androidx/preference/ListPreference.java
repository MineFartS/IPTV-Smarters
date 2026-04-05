package androidx.preference;

import a.i.i.e.g;
import a.x.c;
import a.x.f;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] P;
    public CharSequence[] Q;
    public String R;
    public String S;
    public boolean T;

    public static final class a implements Preference.e<ListPreference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f4745a;

        public static a b() {
            if (f4745a == null) {
                f4745a = new a();
            }
            return f4745a;
        }

        @Override // androidx.preference.Preference.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.R()) ? listPreference.d().getString(f.f3762a) : listPreference.R();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a(context, c.f3751b, R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.x.g.b0, i2, i3);
        this.P = g.q(typedArrayObtainStyledAttributes, a.x.g.e0, a.x.g.c0);
        this.Q = g.q(typedArrayObtainStyledAttributes, a.x.g.f0, a.x.g.d0);
        int i4 = a.x.g.g0;
        if (g.b(typedArrayObtainStyledAttributes, i4, i4, false)) {
            M(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.x.g.r0, i2, i3);
        this.S = g.o(typedArrayObtainStyledAttributes2, a.x.g.Z0, a.x.g.z0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public Object F(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public int P(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.Q) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.Q[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] Q() {
        return this.P;
    }

    public CharSequence R() {
        CharSequence[] charSequenceArr;
        int iU = U();
        if (iU < 0 || (charSequenceArr = this.P) == null) {
            return null;
        }
        return charSequenceArr[iU];
    }

    public CharSequence[] S() {
        return this.Q;
    }

    public String T() {
        return this.R;
    }

    public final int U() {
        return P(this.R);
    }

    public void V(String str) {
        boolean z = !TextUtils.equals(this.R, str);
        if (z || !this.T) {
            this.R = str;
            this.T = true;
            L(str);
            if (z) {
                B();
            }
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence u() {
        if (v() != null) {
            return v().a(this);
        }
        CharSequence charSequenceR = R();
        CharSequence charSequenceU = super.u();
        String str = this.S;
        if (str == null) {
            return charSequenceU;
        }
        Object[] objArr = new Object[1];
        if (charSequenceR == null) {
            charSequenceR = BuildConfig.FLAVOR;
        }
        objArr[0] = charSequenceR;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceU)) {
            return charSequenceU;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }
}
