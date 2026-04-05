package c.f.a.c.j.c;

import c.f.a.c.j.c.d9;
import c.f.a.c.j.c.f9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f9<MessageType extends d9<MessageType, BuilderType>, BuilderType extends f9<MessageType, BuilderType>> implements ac {
    public abstract BuilderType g(MessageType messagetype);

    @Override // c.f.a.c.j.c.ac
    public final /* synthetic */ ac t(bc bcVar) {
        if (e().getClass().isInstance(bcVar)) {
            return g((d9) bcVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
