package c.f.a.b.z2.k0;

import c.f.a.b.j3.i0;
import c.f.a.b.k1;
import c.f.a.b.z2.k0.i;
import com.amazonaws.services.s3.internal.Constants;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f11074n = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11075o;

    public static boolean o(i0 i0Var) {
        int iA = i0Var.a();
        byte[] bArr = f11074n;
        if (iA < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        i0Var.j(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // c.f.a.b.z2.k0.i
    public long f(i0 i0Var) {
        return c(n(i0Var.d()));
    }

    @Override // c.f.a.b.z2.k0.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean i(i0 i0Var, long j2, i.b bVar) {
        if (this.f11075o) {
            c.f.a.b.j3.g.e(bVar.f11089a);
            boolean z = i0Var.n() == 1332770163;
            i0Var.P(0);
            return z;
        }
        byte[] bArrCopyOf = Arrays.copyOf(i0Var.d(), i0Var.f());
        bVar.f11089a = new k1.b().e0("audio/opus").H(c.f.a.b.t2.i0.c(bArrCopyOf)).f0(48000).T(c.f.a.b.t2.i0.a(bArrCopyOf)).E();
        this.f11075o = true;
        return true;
    }

    @Override // c.f.a.b.z2.k0.i
    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.f11075o = false;
        }
    }

    public final long n(byte[] bArr) {
        int i2 = bArr[0] & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = bArr[1] & 63;
        }
        int i5 = i2 >> 3;
        int i6 = i5 & 3;
        return ((long) i4) * ((long) (i5 >= 16 ? 2500 << i6 : i5 >= 12 ? Constants.MAXIMUM_UPLOAD_PARTS << (i6 & 1) : i6 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : Constants.MAXIMUM_UPLOAD_PARTS << i6));
    }
}
