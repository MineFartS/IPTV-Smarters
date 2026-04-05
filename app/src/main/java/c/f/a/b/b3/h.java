package c.f.a.b.b3;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements c {
    @Override // c.f.a.b.b3.c
    public final a a(e eVar) {
        ByteBuffer byteBuffer = (ByteBuffer) c.f.a.b.j3.g.e(eVar.f10276c);
        c.f.a.b.j3.g.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.isDecodeOnly()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract a b(e eVar, ByteBuffer byteBuffer);
}
