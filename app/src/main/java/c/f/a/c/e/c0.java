package c.f.a.c.e;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends c.f.a.c.j.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f12244a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d dVar, Looper looper) {
        super(looper);
        this.f12244a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f12244a.g(message);
    }
}
