package c.f.a.c.j.h;

import c.f.a.c.j.h.s4;
import c.f.a.c.j.h.t4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s4<MessageType extends t4<MessageType, BuilderType>, BuilderType extends s4<MessageType, BuilderType>> implements p7 {
    @Override // c.f.a.c.j.h.p7
    public final /* bridge */ /* synthetic */ p7 U(q7 q7Var) {
        if (g().getClass().isInstance(q7Var)) {
            return k((t4) q7Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType h(byte[] bArr, int i2, int i3);

    public abstract BuilderType j(byte[] bArr, int i2, int i3, y5 y5Var);

    public abstract BuilderType k(MessageType messagetype);

    @Override // c.f.a.c.j.h.p7
    public final /* bridge */ /* synthetic */ p7 s0(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    @Override // c.f.a.c.j.h.p7
    public final /* bridge */ /* synthetic */ p7 w0(byte[] bArr, y5 y5Var) {
        return j(bArr, 0, bArr.length, y5Var);
    }
}
