package c.f.a.c.f.o.n;

import android.os.Looper;
import android.os.Message;
import c.f.a.c.f.o.n.j;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends c.f.a.c.j.b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12431a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j jVar, Looper looper) {
        super(looper);
        this.f12431a = jVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.f.a.c.f.q.o.a(message.what == 1);
        this.f12431a.c((j.b) message.obj);
    }
}
