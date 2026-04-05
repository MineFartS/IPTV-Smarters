package m.a.b.g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class m extends f {
    public m(i iVar, d dVar, int i2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f31146a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f31159a = iVar.r(byteBufferAllocate, dVar.f31149d + ((long) (i2 * dVar.f31152g)) + 44);
    }
}
