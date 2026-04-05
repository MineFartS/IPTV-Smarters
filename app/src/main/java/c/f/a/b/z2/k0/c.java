package c.f.a.b.z2.k0;

import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.z2.k;
import c.f.a.b.z2.k0.i;
import c.f.a.b.z2.p;
import c.f.a.b.z2.q;
import c.f.a.b.z2.r;
import c.f.a.b.z2.x;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FlacStreamMetadata f11048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f11049o;

    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FlacStreamMetadata f11050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FlacStreamMetadata.a f11051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f11052c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f11053d = -1;

        public a(FlacStreamMetadata flacStreamMetadata, FlacStreamMetadata.a aVar) {
            this.f11050a = flacStreamMetadata;
            this.f11051b = aVar;
        }

        @Override // c.f.a.b.z2.k0.g
        public long a(k kVar) {
            long j2 = this.f11053d;
            if (j2 < 0) {
                return -1L;
            }
            long j3 = -(j2 + 2);
            this.f11053d = -1L;
            return j3;
        }

        @Override // c.f.a.b.z2.k0.g
        public x b() {
            c.f.a.b.j3.g.g(this.f11052c != -1);
            return new r(this.f11050a, this.f11052c);
        }

        @Override // c.f.a.b.z2.k0.g
        public void c(long j2) {
            long[] jArr = this.f11051b.f23915a;
            this.f11053d = jArr[x0.h(jArr, j2, true, true)];
        }

        public void d(long j2) {
            this.f11052c = j2;
        }
    }

    public static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(i0 i0Var) {
        return i0Var.a() >= 5 && i0Var.D() == 127 && i0Var.F() == 1179402563;
    }

    @Override // c.f.a.b.z2.k0.i
    public long f(i0 i0Var) {
        if (o(i0Var.d())) {
            return n(i0Var);
        }
        return -1L;
    }

    @Override // c.f.a.b.z2.k0.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean i(i0 i0Var, long j2, i.b bVar) {
        byte[] bArrD = i0Var.d();
        FlacStreamMetadata flacStreamMetadata = this.f11048n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArrD, 17);
            this.f11048n = flacStreamMetadata2;
            bVar.f11089a = flacStreamMetadata2.getFormat(Arrays.copyOfRange(bArrD, 9, i0Var.f()), null);
            return true;
        }
        if ((bArrD[0] & 127) == 3) {
            FlacStreamMetadata.a aVarH = q.h(i0Var);
            FlacStreamMetadata flacStreamMetadataCopyWithSeekTable = flacStreamMetadata.copyWithSeekTable(aVarH);
            this.f11048n = flacStreamMetadataCopyWithSeekTable;
            this.f11049o = new a(flacStreamMetadataCopyWithSeekTable, aVarH);
            return true;
        }
        if (!o(bArrD)) {
            return true;
        }
        a aVar = this.f11049o;
        if (aVar != null) {
            aVar.d(j2);
            bVar.f11090b = this.f11049o;
        }
        c.f.a.b.j3.g.e(bVar.f11089a);
        return false;
    }

    @Override // c.f.a.b.z2.k0.i
    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.f11048n = null;
            this.f11049o = null;
        }
    }

    public final int n(i0 i0Var) {
        int i2 = (i0Var.d()[2] & 255) >> 4;
        if (i2 == 6 || i2 == 7) {
            i0Var.Q(4);
            i0Var.K();
        }
        int iJ = p.j(i0Var, i2);
        i0Var.P(0);
        return iJ;
    }
}
