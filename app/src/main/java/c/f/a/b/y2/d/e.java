package c.f.a.b.y2.d;

import c.f.a.b.j3.x0;
import c.f.a.b.v2.h;
import c.f.a.b.w1;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.ext.flac.FlacDecoderJni;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends c.f.a.b.v2.i<c.f.a.b.v2.f, SimpleOutputBuffer, f> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FlacStreamMetadata f10516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final FlacDecoderJni f10517o;

    public e(int i2, int i3, int i4, List<byte[]> list) throws f {
        super(new c.f.a.b.v2.f[i2], new SimpleOutputBuffer[i3]);
        if (list.size() != 1) {
            throw new f("Initialization data must be of length 1");
        }
        FlacDecoderJni flacDecoderJni = new FlacDecoderJni();
        this.f10517o = flacDecoderJni;
        flacDecoderJni.setData(ByteBuffer.wrap(list.get(0)));
        try {
            FlacStreamMetadata flacStreamMetadataDecodeStreamMetadata = flacDecoderJni.decodeStreamMetadata();
            this.f10516n = flacStreamMetadataDecodeStreamMetadata;
            u(i4 == -1 ? flacStreamMetadataDecodeStreamMetadata.maxFrameSize : i4);
        } catch (w1 e2) {
            throw new f("Failed to decode StreamInfo", e2);
        } catch (IOException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // c.f.a.b.v2.i
    public c.f.a.b.v2.f g() {
        return new c.f.a.b.v2.f(1);
    }

    @Override // c.f.a.b.v2.c
    public String getName() {
        return "libflac";
    }

    @Override // c.f.a.b.v2.i, c.f.a.b.v2.c
    public void release() {
        super.release();
        this.f10517o.release();
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public SimpleOutputBuffer h() {
        return new SimpleOutputBuffer(new h.a() { // from class: c.f.a.b.y2.d.a
            @Override // c.f.a.b.v2.h.a
            public final void a(c.f.a.b.v2.h hVar) {
                this.f10508a.r((SimpleOutputBuffer) hVar);
            }
        });
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public f i(Throwable th) {
        return new f("Unexpected decode error", th);
    }

    @Override // c.f.a.b.v2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public f j(c.f.a.b.v2.f fVar, SimpleOutputBuffer simpleOutputBuffer, boolean z) {
        if (z) {
            this.f10517o.flush();
        }
        this.f10517o.setData((ByteBuffer) x0.i(fVar.f10276c));
        try {
            this.f10517o.decodeSample(simpleOutputBuffer.init(fVar.f10278e, this.f10516n.getMaxDecodedFrameSize()));
            return null;
        } catch (FlacDecoderJni.a e2) {
            return new f("Frame decoding failed", e2);
        } catch (IOException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public FlacStreamMetadata y() {
        return this.f10516n;
    }
}
