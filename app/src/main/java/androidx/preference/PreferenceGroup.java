package androidx.preference;

import a.f.i;
import a.x.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final i<String, Long> J;
    public final Handler K;
    public List<Preference> L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;
    public b Q;
    public final Runnable R;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.J.clear();
            }
        }
    }

    public interface b {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.J = new i<>();
        this.K = new Handler();
        this.M = true;
        this.N = 0;
        this.O = false;
        this.P = Integer.MAX_VALUE;
        this.Q = null;
        this.R = new a();
        this.L = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.e1, i2, i3);
        int i4 = g.g1;
        this.M = a.i.i.e.g.b(typedArrayObtainStyledAttributes, i4, i4, true);
        int i5 = g.f1;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            R(a.i.i.e.g.d(typedArrayObtainStyledAttributes, i5, i5, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void C(boolean z) {
        super.C(z);
        int iQ = Q();
        for (int i2 = 0; i2 < iQ; i2++) {
            P(i2).G(this, z);
        }
    }

    public Preference P(int i2) {
        return this.L.get(i2);
    }

    public int Q() {
        return this.L.size();
    }

    public void R(int i2) {
        if (i2 != Integer.MAX_VALUE && !x()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.P = i2;
    }
}
