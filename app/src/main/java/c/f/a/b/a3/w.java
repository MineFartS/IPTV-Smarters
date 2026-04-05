package c.f.a.b.a3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import c.f.a.b.a3.q;
import c.f.a.b.j3.v0;
import c.f.a.b.j3.x0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class w implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f6506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f6507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f6508c;

    public static class b implements q.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [c.f.a.b.a3.w$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // c.f.a.b.a3.q.b
        public q a(q.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecB = b(aVar);
                try {
                    v0.a("configureCodec");
                    mediaCodecB.configure(aVar.f6471b, aVar.f6473d, aVar.f6474e, aVar.f6475f);
                    v0.c();
                    v0.a("startCodec");
                    mediaCodecB.start();
                    v0.c();
                    return new w(mediaCodecB);
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                    mediaCodec = mediaCodecB;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        }

        public MediaCodec b(q.a aVar) throws IOException {
            c.f.a.b.j3.g.e(aVar.f6470a);
            String str = aVar.f6470a.f6479a;
            v0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            v0.c();
            return mediaCodecCreateByCodecName;
        }
    }

    public w(MediaCodec mediaCodec) {
        this.f6506a = mediaCodec;
        if (x0.f9296a < 21) {
            this.f6507b = mediaCodec.getInputBuffers();
            this.f6508c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void p(q.c cVar, MediaCodec mediaCodec, long j2, long j3) {
        cVar.a(this, j2, j3);
    }

    @Override // c.f.a.b.a3.q
    public boolean a() {
        return false;
    }

    @Override // c.f.a.b.a3.q
    public void b(int i2, int i3, c.f.a.b.v2.b bVar, long j2, int i4) {
        this.f6506a.queueSecureInputBuffer(i2, i3, bVar.a(), j2, i4);
    }

    @Override // c.f.a.b.a3.q
    public MediaFormat c() {
        return this.f6506a.getOutputFormat();
    }

    @Override // c.f.a.b.a3.q
    public void d(Bundle bundle) {
        this.f6506a.setParameters(bundle);
    }

    @Override // c.f.a.b.a3.q
    public void e(int i2, long j2) {
        this.f6506a.releaseOutputBuffer(i2, j2);
    }

    @Override // c.f.a.b.a3.q
    public int f() {
        return this.f6506a.dequeueInputBuffer(0L);
    }

    @Override // c.f.a.b.a3.q
    public void flush() {
        this.f6506a.flush();
    }

    @Override // c.f.a.b.a3.q
    public int g(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f6506a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && x0.f9296a < 21) {
                this.f6508c = this.f6506a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // c.f.a.b.a3.q
    public void h(final q.c cVar, Handler handler) {
        this.f6506a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: c.f.a.b.a3.i
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
                this.f6421a.p(cVar, mediaCodec, j2, j3);
            }
        }, handler);
    }

    @Override // c.f.a.b.a3.q
    public void i(int i2, boolean z) {
        this.f6506a.releaseOutputBuffer(i2, z);
    }

    @Override // c.f.a.b.a3.q
    public void j(int i2) {
        this.f6506a.setVideoScalingMode(i2);
    }

    @Override // c.f.a.b.a3.q
    public ByteBuffer k(int i2) {
        return x0.f9296a >= 21 ? this.f6506a.getInputBuffer(i2) : ((ByteBuffer[]) x0.i(this.f6507b))[i2];
    }

    @Override // c.f.a.b.a3.q
    public void l(Surface surface) {
        this.f6506a.setOutputSurface(surface);
    }

    @Override // c.f.a.b.a3.q
    public void m(int i2, int i3, int i4, long j2, int i5) {
        this.f6506a.queueInputBuffer(i2, i3, i4, j2, i5);
    }

    @Override // c.f.a.b.a3.q
    public ByteBuffer n(int i2) {
        return x0.f9296a >= 21 ? this.f6506a.getOutputBuffer(i2) : ((ByteBuffer[]) x0.i(this.f6508c))[i2];
    }

    @Override // c.f.a.b.a3.q
    public void release() {
        this.f6507b = null;
        this.f6508c = null;
        this.f6506a.release();
    }
}
