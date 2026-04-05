package c.f.a.b.z2;

import c.f.a.b.j3.x0;
import c.f.a.b.z2.x;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlacStreamMetadata f11495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11496b;

    public r(FlacStreamMetadata flacStreamMetadata, long j2) {
        this.f11495a = flacStreamMetadata;
        this.f11496b = j2;
    }

    public final y a(long j2, long j3) {
        return new y((j2 * 1000000) / ((long) this.f11495a.sampleRate), this.f11496b + j3);
    }

    @Override // c.f.a.b.z2.x
    public boolean f() {
        return true;
    }

    @Override // c.f.a.b.z2.x
    public x.a h(long j2) {
        c.f.a.b.j3.g.i(this.f11495a.seekTable);
        FlacStreamMetadata flacStreamMetadata = this.f11495a;
        FlacStreamMetadata.a aVar = flacStreamMetadata.seekTable;
        long[] jArr = aVar.f23915a;
        long[] jArr2 = aVar.f23916b;
        int iH = x0.h(jArr, flacStreamMetadata.getSampleNumber(j2), true, false);
        y yVarA = a(iH == -1 ? 0L : jArr[iH], iH != -1 ? jArr2[iH] : 0L);
        if (yVarA.f11512b == j2 || iH == jArr.length - 1) {
            return new x.a(yVarA);
        }
        int i2 = iH + 1;
        return new x.a(yVarA, a(jArr[i2], jArr2[i2]));
    }

    @Override // c.f.a.b.z2.x
    public long i() {
        return this.f11495a.getDurationUs();
    }
}
