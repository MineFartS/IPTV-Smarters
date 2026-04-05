package c.f.a.b.v2;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public class f extends c.f.a.b.v2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f10275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f10276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f10279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10281h;

    public static final class a extends IllegalStateException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10283c;

        public a(int i2, int i3) {
            super("Buffer too small (" + i2 + " < " + i3 + ")");
            this.f10282b = i2;
            this.f10283c = i3;
        }
    }

    public f(int i2) {
        this(i2, 0);
    }

    public f(int i2, int i3) {
        this.f10275b = new b();
        this.f10280g = i2;
        this.f10281h = i3;
    }

    public static f q() {
        return new f(0);
    }

    @Override // c.f.a.b.v2.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.f10276c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f10279f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f10277d = false;
    }

    public final ByteBuffer g(int i2) {
        int i3 = this.f10280g;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.f10276c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i2);
    }

    @EnsuresNonNull({"data"})
    public void i(int i2) {
        int i3 = i2 + this.f10281h;
        ByteBuffer byteBuffer = this.f10276c;
        if (byteBuffer == null) {
            this.f10276c = g(i3);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i4 = i3 + iPosition;
        if (iCapacity >= i4) {
            this.f10276c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferG = g(i4);
        byteBufferG.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferG.put(byteBuffer);
        }
        this.f10276c = byteBufferG;
    }

    public final void o() {
        ByteBuffer byteBuffer = this.f10276c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f10279f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean p() {
        return getFlag(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    public void r(int i2) {
        ByteBuffer byteBuffer = this.f10279f;
        if (byteBuffer == null || byteBuffer.capacity() < i2) {
            this.f10279f = ByteBuffer.allocate(i2);
        } else {
            this.f10279f.clear();
        }
    }
}
