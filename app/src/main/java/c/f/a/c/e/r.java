package c.f.a.c.e;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends u<Void> {
    public r(int i2, int i3, Bundle bundle) {
        super(i2, 2, bundle);
    }

    @Override // c.f.a.c.e.u
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            c(null);
        } else {
            b(new t(4, "Invalid response to one way request"));
        }
    }

    @Override // c.f.a.c.e.u
    public final boolean d() {
        return true;
    }
}
