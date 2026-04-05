package c.f.a.b.y2.d;

import android.net.Uri;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.y2.d.d;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.j;
import c.f.a.b.z2.k;
import c.f.a.b.z2.l;
import c.f.a.b.z2.n;
import c.f.a.b.z2.o;
import c.f.a.b.z2.q;
import c.f.a.b.z2.w;
import c.f.a.b.z2.x;
import c.f.a.b.z2.y;
import com.google.android.exoplayer2.ext.flac.FlacDecoderJni;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f10518a = new o() { // from class: c.f.a.b.y2.d.b
        @Override // c.f.a.b.z2.o
        public final j[] a() {
            return g.h();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ j[] b(Uri uri, Map map) {
            return n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f10519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FlacDecoderJni f10521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f10522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f10523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FlacStreamMetadata f10525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d.c f10526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.b.b3.a f10527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f10528k;

    public static final class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FlacDecoderJni f10530b;

        public a(long j2, FlacDecoderJni flacDecoderJni) {
            this.f10529a = j2;
            this.f10530b = flacDecoderJni;
        }

        @Override // c.f.a.b.z2.x
        public boolean f() {
            return true;
        }

        @Override // c.f.a.b.z2.x
        public x.a h(long j2) {
            x.a seekPoints = this.f10530b.getSeekPoints(j2);
            return seekPoints == null ? new x.a(y.f11511a) : seekPoints;
        }

        @Override // c.f.a.b.z2.x
        public long i() {
            return this.f10529a;
        }
    }

    public g() {
        this(0);
    }

    public g(int i2) {
        this.f10519b = new i0();
        this.f10520c = (i2 & 1) != 0;
    }

    public static /* synthetic */ j[] h() {
        return new j[]{new g()};
    }

    public static void i(FlacStreamMetadata flacStreamMetadata, c.f.a.b.b3.a aVar, a0 a0Var) {
        a0Var.e(new k1.b().e0("audio/raw").G(flacStreamMetadata.getDecodedBitrate()).Z(flacStreamMetadata.getDecodedBitrate()).W(flacStreamMetadata.getMaxDecodedFrameSize()).H(flacStreamMetadata.channels).f0(flacStreamMetadata.sampleRate).Y(x0.a0(flacStreamMetadata.bitsPerSample)).X(aVar).E());
    }

    public static void j(i0 i0Var, int i2, long j2, a0 a0Var) {
        i0Var.P(0);
        a0Var.c(i0Var, i2);
        a0Var.d(j2, 1, i2, 0, null);
    }

    public static d k(FlacDecoderJni flacDecoderJni, FlacStreamMetadata flacStreamMetadata, long j2, l lVar, d.c cVar) {
        x bVar;
        d dVar = null;
        if (flacDecoderJni.getSeekPoints(0L) != null) {
            bVar = new a(flacStreamMetadata.getDurationUs(), flacDecoderJni);
        } else if (j2 == -1 || flacStreamMetadata.totalSamples <= 0) {
            bVar = new x.b(flacStreamMetadata.getDurationUs());
        } else {
            d dVar2 = new d(flacStreamMetadata, flacDecoderJni.getDecodePosition(), j2, flacDecoderJni, cVar);
            bVar = dVar2.b();
            dVar = dVar2;
        }
        lVar.i(bVar);
        return dVar;
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        if (j2 == 0) {
            this.f10524g = false;
        }
        FlacDecoderJni flacDecoderJni = this.f10521d;
        if (flacDecoderJni != null) {
            flacDecoderJni.reset(j2);
        }
        d dVar = this.f10528k;
        if (dVar != null) {
            dVar.h(j3);
        }
    }

    @EnsuresNonNull({"streamMetadata", "outputFrameHolder"})
    @RequiresNonNull({"decoderJni", "extractorOutput", "trackOutput"})
    public final void b(k kVar) throws IOException {
        if (this.f10524g) {
            return;
        }
        FlacDecoderJni flacDecoderJni = this.f10521d;
        try {
            FlacStreamMetadata flacStreamMetadataDecodeStreamMetadata = flacDecoderJni.decodeStreamMetadata();
            this.f10524g = true;
            if (this.f10525h == null) {
                this.f10525h = flacStreamMetadataDecodeStreamMetadata;
                this.f10519b.L(flacStreamMetadataDecodeStreamMetadata.getMaxDecodedFrameSize());
                this.f10526i = new d.c(ByteBuffer.wrap(this.f10519b.d()));
                this.f10528k = k(flacDecoderJni, flacStreamMetadataDecodeStreamMetadata, kVar.getLength(), this.f10522e, this.f10526i);
                i(flacStreamMetadataDecodeStreamMetadata, flacStreamMetadataDecodeStreamMetadata.getMetadataCopyWithAppendedEntriesFrom(this.f10527j), this.f10523f);
            }
        } catch (IOException e2) {
            flacDecoderJni.reset(0L);
            kVar.o(0L, e2);
            throw e2;
        }
    }

    @Override // c.f.a.b.z2.j
    public void c(l lVar) {
        this.f10522e = lVar;
        this.f10523f = lVar.e(0, 1);
        this.f10522e.p();
        try {
            this.f10521d = new FlacDecoderJni();
        } catch (f e2) {
            throw new RuntimeException(e2);
        }
    }

    @RequiresNonNull({"binarySearchSeeker"})
    public final int d(k kVar, w wVar, i0 i0Var, d.c cVar, a0 a0Var) {
        int iC = this.f10528k.c(kVar, wVar);
        ByteBuffer byteBuffer = cVar.f10514a;
        if (iC == 0 && byteBuffer.limit() > 0) {
            j(i0Var, byteBuffer.limit(), cVar.f10515b, a0Var);
        }
        return iC;
    }

    @Override // c.f.a.b.z2.j
    public boolean e(k kVar) {
        this.f10527j = q.c(kVar, !this.f10520c);
        return q.a(kVar);
    }

    @EnsuresNonNull({"decoderJni", "extractorOutput", "trackOutput"})
    public final FlacDecoderJni f(k kVar) {
        FlacDecoderJni flacDecoderJni = (FlacDecoderJni) c.f.a.b.j3.g.e(this.f10521d);
        flacDecoderJni.setData(kVar);
        return flacDecoderJni;
    }

    @Override // c.f.a.b.z2.j
    public int g(k kVar, w wVar) {
        if (kVar.getPosition() == 0 && !this.f10520c && this.f10527j == null) {
            this.f10527j = q.c(kVar, true);
        }
        FlacDecoderJni flacDecoderJniF = f(kVar);
        try {
            b(kVar);
            d dVar = this.f10528k;
            if (dVar != null && dVar.d()) {
                return d(kVar, wVar, this.f10519b, this.f10526i, this.f10523f);
            }
            ByteBuffer byteBuffer = this.f10526i.f10514a;
            long decodePosition = flacDecoderJniF.getDecodePosition();
            try {
                flacDecoderJniF.decodeSampleWithBacktrackPosition(byteBuffer, decodePosition);
                int iLimit = byteBuffer.limit();
                if (iLimit == 0) {
                    return -1;
                }
                j(this.f10519b, iLimit, flacDecoderJniF.getLastFrameTimestamp(), this.f10523f);
                return flacDecoderJniF.isEndOfData() ? -1 : 0;
            } catch (FlacDecoderJni.a e2) {
                throw new IOException("Cannot read frame at position " + decodePosition, e2);
            }
        } finally {
            flacDecoderJniF.clearData();
        }
    }

    @Override // c.f.a.b.z2.j
    public void release() {
        this.f10528k = null;
        FlacDecoderJni flacDecoderJni = this.f10521d;
        if (flacDecoderJni != null) {
            flacDecoderJni.release();
            this.f10521d = null;
        }
    }
}
