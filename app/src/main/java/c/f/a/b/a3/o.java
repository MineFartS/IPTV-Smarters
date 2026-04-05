package c.f.a.b.a3;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends c.f.a.b.v2.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6466k;

    public o() {
        super(2);
        this.f6466k = 32;
    }

    @Override // c.f.a.b.v2.f, c.f.a.b.v2.a
    public void clear() {
        super.clear();
        this.f6465j = 0;
    }

    public boolean s(c.f.a.b.v2.f fVar) {
        c.f.a.b.j3.g.a(!fVar.p());
        c.f.a.b.j3.g.a(!fVar.hasSupplementalData());
        c.f.a.b.j3.g.a(!fVar.isEndOfStream());
        if (!t(fVar)) {
            return false;
        }
        int i2 = this.f6465j;
        this.f6465j = i2 + 1;
        if (i2 == 0) {
            this.f10278e = fVar.f10278e;
            if (fVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (fVar.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = fVar.f10276c;
        if (byteBuffer != null) {
            i(byteBuffer.remaining());
            this.f10276c.put(byteBuffer);
        }
        this.f6464i = fVar.f10278e;
        return true;
    }

    public final boolean t(c.f.a.b.v2.f fVar) {
        ByteBuffer byteBuffer;
        if (!x()) {
            return true;
        }
        if (this.f6465j >= this.f6466k || fVar.isDecodeOnly() != isDecodeOnly()) {
            return false;
        }
        ByteBuffer byteBuffer2 = fVar.f10276c;
        return byteBuffer2 == null || (byteBuffer = this.f10276c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long u() {
        return this.f10278e;
    }

    public long v() {
        return this.f6464i;
    }

    public int w() {
        return this.f6465j;
    }

    public boolean x() {
        return this.f6465j > 0;
    }

    public void y(int i2) {
        c.f.a.b.j3.g.a(i2 > 0);
        this.f6466k = i2;
    }
}
