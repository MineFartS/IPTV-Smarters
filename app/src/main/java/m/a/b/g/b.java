package m.a.b.g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class b extends c {
    public b(i iVar, d dVar, long j2, int i2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f31146a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = j2 + ((long) (i2 * 16));
        this.f31144a = iVar.p(byteBufferAllocate, j3);
        this.f31145b = iVar.p(byteBufferAllocate, j3 + 8);
    }
}
