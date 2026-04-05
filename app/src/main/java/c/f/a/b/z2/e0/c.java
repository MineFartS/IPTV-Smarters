package c.f.a.b.z2.e0;

import c.f.a.b.z2.b;
import c.f.a.b.z2.k;
import c.f.a.b.z2.p;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends c.f.a.b.z2.b {

    public static final class b implements b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlacStreamMetadata f10703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p.a f10705c;

        public b(FlacStreamMetadata flacStreamMetadata, int i2) {
            this.f10703a = flacStreamMetadata;
            this.f10704b = i2;
            this.f10705c = new p.a();
        }

        @Override // c.f.a.b.z2.b.f
        public /* synthetic */ void a() {
            c.f.a.b.z2.c.a(this);
        }

        @Override // c.f.a.b.z2.b.f
        public b.e b(k kVar, long j2) {
            long position = kVar.getPosition();
            long jC = c(kVar);
            long j3 = kVar.j();
            kVar.m(Math.max(6, this.f10703a.minFrameSize));
            long jC2 = c(kVar);
            return (jC > j2 || jC2 <= j2) ? jC2 <= j2 ? b.e.f(jC2, kVar.j()) : b.e.d(jC, position) : b.e.e(j3);
        }

        public final long c(k kVar) {
            while (kVar.j() < kVar.getLength() - 6 && !p.h(kVar, this.f10703a, this.f10704b, this.f10705c)) {
                kVar.m(1);
            }
            if (kVar.j() < kVar.getLength() - 6) {
                return this.f10705c.f11493a;
            }
            kVar.m((int) (kVar.getLength() - kVar.j()));
            return this.f10703a.totalSamples;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(final FlacStreamMetadata flacStreamMetadata, int i2, long j2, long j3) {
        super(new b.d() { // from class: c.f.a.b.z2.e0.b
            @Override // c.f.a.b.z2.b.d
            public final long a(long j4) {
                return flacStreamMetadata.getSampleNumber(j4);
            }
        }, new b(flacStreamMetadata, i2), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j2, j3, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        flacStreamMetadata.getClass();
    }
}
