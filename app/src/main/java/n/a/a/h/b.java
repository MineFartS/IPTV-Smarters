package n.a.a.h;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class b extends c<Object> {
    public b(Object obj) {
        super(obj);
    }

    @Override // n.a.a.h.c
    public Context a() {
        return null;
    }

    @Override // n.a.a.h.c
    public void e(String str, int i2, int i3, int i4, String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    @Override // n.a.a.h.c
    public boolean g(String str) {
        return false;
    }
}
