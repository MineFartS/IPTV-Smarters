package c.f.a.c.f.q;

import android.content.Context;
import android.util.SparseIntArray;
import c.f.a.c.f.o.a;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f12602a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.f.a.c.f.f f12603b;

    public h0(c.f.a.c.f.f fVar) {
        o.i(fVar);
        this.f12603b = fVar;
    }

    public final int a(Context context, a.f fVar) {
        o.i(context);
        o.i(fVar);
        int i2 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int iB = b(context, minApkVersion);
        if (iB == -1) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f12602a.size()) {
                    i2 = -1;
                    break;
                }
                int iKeyAt = this.f12602a.keyAt(i3);
                if (iKeyAt > minApkVersion && this.f12602a.get(iKeyAt) == 0) {
                    break;
                }
                i3++;
            }
            iB = i2 == -1 ? this.f12603b.h(context, minApkVersion) : i2;
            this.f12602a.put(minApkVersion, iB);
        }
        return iB;
    }

    public final int b(Context context, int i2) {
        return this.f12602a.get(i2, -1);
    }

    public final void c() {
        this.f12602a.clear();
    }
}
