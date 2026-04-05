package m.a.b.g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class j extends e {
    public j(i iVar, d dVar, long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(dVar.f31146a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = dVar.f31148c + (j2 * ((long) dVar.f31150e));
        this.f31155a = iVar.r(byteBufferAllocate, j3);
        this.f31156b = iVar.r(byteBufferAllocate, 4 + j3);
        this.f31157c = iVar.r(byteBufferAllocate, 8 + j3);
        this.f31158d = iVar.r(byteBufferAllocate, j3 + 20);
    }
}
