package c.f.a.b.x2;

import c.f.a.b.x2.w;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface i0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f10343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10345c;

        public a(byte[] bArr, String str, int i2) {
            this.f10343a = bArr;
            this.f10344b = str;
            this.f10345c = i2;
        }

        public byte[] a() {
            return this.f10343a;
        }

        public String b() {
            return this.f10344b;
        }
    }

    public interface b {
        void a(i0 i0Var, byte[] bArr, int i2, int i3, byte[] bArr2);
    }

    public interface c {
        i0 a(UUID uuid);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f10346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10347b;

        public d(byte[] bArr, String str) {
            this.f10346a = bArr;
            this.f10347b = str;
        }

        public byte[] a() {
            return this.f10346a;
        }

        public String b() {
            return this.f10347b;
        }
    }

    Class<? extends ExoMediaCrypto> a();

    Map<String, String> b(byte[] bArr);

    ExoMediaCrypto c(byte[] bArr);

    d d();

    byte[] e();

    void f(byte[] bArr, byte[] bArr2);

    void g(byte[] bArr);

    void h(b bVar);

    byte[] i(byte[] bArr, byte[] bArr2);

    void j(byte[] bArr);

    a k(byte[] bArr, List<w.b> list, int i2, HashMap<String, String> map);

    void release();
}
