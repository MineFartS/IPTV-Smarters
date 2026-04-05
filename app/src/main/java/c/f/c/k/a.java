package c.f.c.k;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements e {
    @Override // c.f.c.k.e
    public <T> T a(Class<T> cls) {
        c.f.c.r.b<T> bVarB = b(cls);
        if (bVarB == null) {
            return null;
        }
        return bVarB.get();
    }

    @Override // c.f.c.k.e
    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
