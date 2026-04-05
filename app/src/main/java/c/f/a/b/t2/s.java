package c.f.a.b.t2;

import c.f.a.b.j3.x0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f10170a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10171a = new a(-1, -1, -1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10175e;

        public a(int i2, int i3, int i4) {
            this.f10172b = i2;
            this.f10173c = i3;
            this.f10174d = i4;
            this.f10175e = x0.r0(i4) ? x0.c0(i4, i3) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f10172b + ", channelCount=" + this.f10173c + ", encoding=" + this.f10174d + ']';
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    ByteBuffer a();

    boolean b();

    void c(ByteBuffer byteBuffer);

    a d(a aVar);

    void e();

    void flush();

    boolean isActive();

    void reset();
}
