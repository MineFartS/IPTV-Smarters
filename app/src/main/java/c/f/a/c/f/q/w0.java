package c.f.a.c.f.q;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends c.f.a.c.j.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f12672a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(c cVar, Looper looper) {
        super(looper);
        this.f12672a = cVar;
    }

    public static final void a(Message message) {
        x0 x0Var = (x0) message.obj;
        x0Var.a();
        x0Var.d();
    }

    public static final boolean b(Message message) {
        int i2 = message.what;
        return i2 == 2 || i2 == 1 || i2 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f12672a.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || ((i2 == 4 && !this.f12672a.enableLocalFallback()) || message.what == 5)) && !this.f12672a.isConnecting()) {
            a(message);
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            this.f12672a.zzB = new c.f.a.c.f.b(message.arg2);
            if (c.zzg(this.f12672a) && !this.f12672a.zzC) {
                this.f12672a.zzp(3, null);
                return;
            }
            c.f.a.c.f.b bVar = this.f12672a.zzB != null ? this.f12672a.zzB : new c.f.a.c.f.b(8);
            this.f12672a.zzc.a(bVar);
            this.f12672a.onConnectionFailed(bVar);
            return;
        }
        if (i3 == 5) {
            c.f.a.c.f.b bVar2 = this.f12672a.zzB != null ? this.f12672a.zzB : new c.f.a.c.f.b(8);
            this.f12672a.zzc.a(bVar2);
            this.f12672a.onConnectionFailed(bVar2);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            c.f.a.c.f.b bVar3 = new c.f.a.c.f.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f12672a.zzc.a(bVar3);
            this.f12672a.onConnectionFailed(bVar3);
            return;
        }
        if (i3 == 6) {
            this.f12672a.zzp(5, null);
            if (this.f12672a.zzw != null) {
                this.f12672a.zzw.onConnectionSuspended(message.arg2);
            }
            this.f12672a.onConnectionSuspended(message.arg2);
            c.zzl(this.f12672a, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.f12672a.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((x0) message.obj).c();
            return;
        }
        int i4 = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i4);
        Log.wtf("GmsClient", sb.toString(), new Exception());
    }
}
