package c.f.a.b.a3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import c.f.a.b.a3.w;
import c.f.a.b.k1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface q {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f6470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f6471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k1 f6472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f6473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f6474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6475f;

        public a(s sVar, MediaFormat mediaFormat, k1 k1Var, Surface surface, MediaCrypto mediaCrypto, int i2) {
            this.f6470a = sVar;
            this.f6471b = mediaFormat;
            this.f6472c = k1Var;
            this.f6473d = surface;
            this.f6474e = mediaCrypto;
            this.f6475f = i2;
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6476a = new w.b();

        q a(a aVar);
    }

    public interface c {
        void a(q qVar, long j2, long j3);
    }

    boolean a();

    void b(int i2, int i3, c.f.a.b.v2.b bVar, long j2, int i4);

    MediaFormat c();

    void d(Bundle bundle);

    void e(int i2, long j2);

    int f();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    void h(c cVar, Handler handler);

    void i(int i2, boolean z);

    void j(int i2);

    ByteBuffer k(int i2);

    void l(Surface surface);

    void m(int i2, int i3, int i4, long j2, int i5);

    ByteBuffer n(int i2);

    void release();
}
