package c.f.a.b.x2;

import c.f.a.b.x2.a0;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface y {

    public static class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10454b;

        public a(Throwable th, int i2) {
            super(th);
            this.f10454b = i2;
        }
    }

    void a(a0.a aVar);

    void b(a0.a aVar);

    UUID c();

    boolean d();

    Map<String, String> e();

    ExoMediaCrypto f();

    byte[] g();

    a getError();

    int getState();
}
