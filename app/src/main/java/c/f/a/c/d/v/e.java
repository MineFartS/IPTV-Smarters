package c.f.a.c.d.v;

import android.os.Bundle;
import android.os.Parcel;
import c.f.a.c.j.c.v0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends c.f.a.c.j.c.a implements f {
    public e() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // c.f.a.c.j.c.a
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        w2((Bundle) v0.b(parcel, Bundle.CREATOR));
        return true;
    }
}
