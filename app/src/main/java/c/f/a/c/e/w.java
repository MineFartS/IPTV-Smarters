package c.f.a.c.e;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends u<Bundle> {
    public w(int i2, int i3, Bundle bundle) {
        super(i2, 1, bundle);
    }

    @Override // c.f.a.c.e.u
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        c(bundle2);
    }

    @Override // c.f.a.c.e.u
    public final boolean d() {
        return false;
    }
}
