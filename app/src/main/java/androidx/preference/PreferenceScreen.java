package androidx.preference;

import a.i.i.e.g;
import a.x.c;
import android.R;
import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean S;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, g.a(context, c.f3755f, R.attr.preferenceScreenStyle));
        this.S = true;
    }

    @Override // androidx.preference.Preference
    public void D() {
        if (o() == null && i() == null && Q() != 0) {
            t();
            throw null;
        }
    }
}
