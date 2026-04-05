package c.f.a.b.y2.d;

import c.f.a.b.z2.b;
import c.f.a.b.z2.k;
import com.google.android.exoplayer2.ext.flac.FlacDecoderJni;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends c.f.a.b.z2.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlacDecoderJni f10511e;

    public static final class b implements b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlacDecoderJni f10512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f10513b;

        public b(FlacDecoderJni flacDecoderJni, c cVar) {
            this.f10512a = flacDecoderJni;
            this.f10513b = cVar;
        }

        @Override // c.f.a.b.z2.b.f
        public /* synthetic */ void a() {
            c.f.a.b.z2.c.a(this);
        }

        @Override // c.f.a.b.z2.b.f
        public b.e b(k kVar, long j2) throws IOException {
            ByteBuffer byteBuffer = this.f10513b.f10514a;
            long position = kVar.getPosition();
            this.f10512a.reset(position);
            try {
                this.f10512a.decodeSampleWithBacktrackPosition(byteBuffer, position);
                if (byteBuffer.limit() == 0) {
                    return b.e.f10649a;
                }
                long lastFrameFirstSampleIndex = this.f10512a.getLastFrameFirstSampleIndex();
                long nextFrameFirstSampleIndex = this.f10512a.getNextFrameFirstSampleIndex();
                long decodePosition = this.f10512a.getDecodePosition();
                if (!(lastFrameFirstSampleIndex <= j2 && nextFrameFirstSampleIndex > j2)) {
                    return nextFrameFirstSampleIndex <= j2 ? b.e.f(nextFrameFirstSampleIndex, decodePosition) : b.e.d(lastFrameFirstSampleIndex, position);
                }
                this.f10513b.f10515b = this.f10512a.getLastFrameTimestamp();
                return b.e.e(kVar.getPosition());
            } catch (FlacDecoderJni.a unused) {
                return b.e.f10649a;
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f10514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f10515b = 0;

        public c(ByteBuffer byteBuffer) {
            this.f10514a = byteBuffer;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(final FlacStreamMetadata flacStreamMetadata, long j2, long j3, FlacDecoderJni flacDecoderJni, c cVar) {
        super(new b.d() { // from class: c.f.a.b.y2.d.c
            @Override // c.f.a.b.z2.b.d
            public final long a(long j4) {
                return flacStreamMetadata.getSampleNumber(j4);
            }
        }, new b(flacDecoderJni, cVar), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j2, j3, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        flacStreamMetadata.getClass();
        this.f10511e = (FlacDecoderJni) c.f.a.b.j3.g.e(flacDecoderJni);
    }

    @Override // c.f.a.b.z2.b
    public void f(boolean z, long j2) {
        if (z) {
            return;
        }
        this.f10511e.reset(j2);
    }
}
