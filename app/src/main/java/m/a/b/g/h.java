package m.a.b.g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class h extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f31161j;

    public h(boolean z, i iVar) {
        this.f31146a = z;
        this.f31161j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f31147b = iVar.o(byteBufferAllocate, 16L);
        this.f31148c = iVar.p(byteBufferAllocate, 32L);
        this.f31149d = iVar.p(byteBufferAllocate, 40L);
        this.f31150e = iVar.o(byteBufferAllocate, 54L);
        this.f31151f = iVar.o(byteBufferAllocate, 56L);
        this.f31152g = iVar.o(byteBufferAllocate, 58L);
        this.f31153h = iVar.o(byteBufferAllocate, 60L);
        this.f31154i = iVar.o(byteBufferAllocate, 62L);
    }

    @Override // m.a.b.g.d
    public c a(long j2, int i2) {
        return new b(this.f31161j, this, j2, i2);
    }

    @Override // m.a.b.g.d
    public e b(long j2) {
        return new k(this.f31161j, this, j2);
    }

    @Override // m.a.b.g.d
    public f c(int i2) {
        return new m(this.f31161j, this, i2);
    }
}
