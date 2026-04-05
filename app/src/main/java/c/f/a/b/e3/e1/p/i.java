package c.f.a.b.e3.e1.p;

import android.net.Uri;
import c.f.a.b.j3.w0;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7202d;

    public i(String str, long j2, long j3) {
        this.f7201c = str == null ? BuildConfig.FLAVOR : str;
        this.f7199a = j2;
        this.f7200b = j3;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j2 = this.f7200b;
            if (j2 != -1) {
                long j3 = this.f7199a;
                if (j3 + j2 == iVar.f7199a) {
                    long j4 = iVar.f7200b;
                    return new i(strC, j3, j4 != -1 ? j2 + j4 : -1L);
                }
            }
            long j5 = iVar.f7200b;
            if (j5 != -1) {
                long j6 = iVar.f7199a;
                if (j6 + j5 == this.f7199a) {
                    return new i(strC, j6, j2 != -1 ? j5 + j2 : -1L);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return w0.e(str, this.f7201c);
    }

    public String c(String str) {
        return w0.d(str, this.f7201c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f7199a == iVar.f7199a && this.f7200b == iVar.f7200b && this.f7201c.equals(iVar.f7201c);
    }

    public int hashCode() {
        if (this.f7202d == 0) {
            this.f7202d = ((((527 + ((int) this.f7199a)) * 31) + ((int) this.f7200b)) * 31) + this.f7201c.hashCode();
        }
        return this.f7202d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f7201c + ", start=" + this.f7199a + ", length=" + this.f7200b + ")";
    }
}
