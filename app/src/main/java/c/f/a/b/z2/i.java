package c.f.a.b.z2;

import c.f.a.b.j3.i0;
import c.f.a.b.k1;
import c.f.a.b.z2.a0;
import com.amazonaws.event.ProgressEvent;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10855a = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];

    @Override // c.f.a.b.z2.a0
    public int a(c.f.a.b.i3.l lVar, int i2, boolean z, int i3) throws EOFException {
        int iB = lVar.b(this.f10855a, 0, Math.min(this.f10855a.length, i2));
        if (iB != -1) {
            return iB;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c.f.a.b.z2.a0
    public /* synthetic */ int b(c.f.a.b.i3.l lVar, int i2, boolean z) {
        return z.a(this, lVar, i2, z);
    }

    @Override // c.f.a.b.z2.a0
    public /* synthetic */ void c(i0 i0Var, int i2) {
        z.b(this, i0Var, i2);
    }

    @Override // c.f.a.b.z2.a0
    public void d(long j2, int i2, int i3, int i4, a0.a aVar) {
    }

    @Override // c.f.a.b.z2.a0
    public void e(k1 k1Var) {
    }

    @Override // c.f.a.b.z2.a0
    public void f(i0 i0Var, int i2, int i3) {
        i0Var.Q(i2);
    }
}
