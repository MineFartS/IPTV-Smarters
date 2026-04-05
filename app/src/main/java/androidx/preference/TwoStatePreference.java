package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean J;
    public CharSequence K;
    public CharSequence L;
    public boolean M;
    public boolean N;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.preference.Preference
    public void D() {
        super.D();
        boolean z = !P();
        if (a(Boolean.valueOf(z))) {
            Q(z);
        }
    }

    @Override // androidx.preference.Preference
    public Object F(TypedArray typedArray, int i2) {
        return Boolean.valueOf(typedArray.getBoolean(i2, false));
    }

    @Override // androidx.preference.Preference
    public boolean N() {
        return (this.N ? this.J : !this.J) || super.N();
    }

    public boolean P() {
        return this.J;
    }

    public void Q(boolean z) {
        boolean z2 = this.J != z;
        if (z2 || !this.M) {
            this.J = z;
            this.M = true;
            J(z);
            if (z2) {
                C(N());
                B();
            }
        }
    }

    public void R(boolean z) {
        this.N = z;
    }

    public void S(CharSequence charSequence) {
        this.L = charSequence;
        if (P()) {
            return;
        }
        B();
    }

    public void T(CharSequence charSequence) {
        this.K = charSequence;
        if (P()) {
            B();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void U(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.J
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.K
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.K
        L17:
            r5.setText(r0)
            r0 = 0
            goto L2b
        L1c:
            boolean r1 = r4.J
            if (r1 != 0) goto L2b
            java.lang.CharSequence r1 = r4.L
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2b
            java.lang.CharSequence r0 = r4.L
            goto L17
        L2b:
            if (r0 == 0) goto L3b
            java.lang.CharSequence r1 = r4.u()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3b
            r5.setText(r1)
            r0 = 0
        L3b:
            r1 = 8
            if (r0 != 0) goto L40
            goto L42
        L40:
            r2 = 8
        L42:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4b
            r5.setVisibility(r2)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.U(android.view.View):void");
    }
}
