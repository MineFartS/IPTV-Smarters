package m.a.b.g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class k extends e {
    public k(i iVar, d dVar, long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f31146a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = dVar.f31148c + (j2 * ((long) dVar.f31150e));
        this.f31155a = iVar.r(byteBufferAllocate, j3);
        this.f31156b = iVar.p(byteBufferAllocate, 8 + j3);
        this.f31157c = iVar.p(byteBufferAllocate, 16 + j3);
        this.f31158d = iVar.p(byteBufferAllocate, j3 + 40);
    }
}
