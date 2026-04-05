package m.a.b.g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c {
    public a(i iVar, d dVar, long j2, int i2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(dVar.f31146a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = j2 + ((long) (i2 * 8));
        this.f31144a = iVar.r(byteBufferAllocate, j3);
        this.f31145b = iVar.r(byteBufferAllocate, j3 + 4);
    }
}
