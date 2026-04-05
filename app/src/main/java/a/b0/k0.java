package a.b0;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f957a;

    public k0(IBinder iBinder) {
        this.f957a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f957a.equals(this.f957a);
    }

    public int hashCode() {
        return this.f957a.hashCode();
    }
}
