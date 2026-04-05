package m.a.b.g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class g extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f31160j;

    public g(boolean z, i iVar) {
        this.f31146a = z;
        this.f31160j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f31147b = iVar.o(byteBufferAllocate, 16L);
        this.f31148c = iVar.r(byteBufferAllocate, 28L);
        this.f31149d = iVar.r(byteBufferAllocate, 32L);
        this.f31150e = iVar.o(byteBufferAllocate, 42L);
        this.f31151f = iVar.o(byteBufferAllocate, 44L);
        this.f31152g = iVar.o(byteBufferAllocate, 46L);
        this.f31153h = iVar.o(byteBufferAllocate, 48L);
        this.f31154i = iVar.o(byteBufferAllocate, 50L);
    }

    @Override // m.a.b.g.d
    public c a(long j2, int i2) {
        return new a(this.f31160j, this, j2, i2);
    }

    @Override // m.a.b.g.d
    public e b(long j2) {
        return new j(this.f31160j, this, j2);
    }

    @Override // m.a.b.g.d
    public f c(int i2) {
        return new l(this.f31160j, this, i2);
    }
}
