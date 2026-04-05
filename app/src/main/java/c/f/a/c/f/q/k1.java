package c.f.a.c.f.q;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f12621b;

    public /* synthetic */ k1(l1 l1Var, i1 i1Var) {
        this.f12621b = l1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f12621b.f12627d) {
                h1 h1Var = (h1) message.obj;
                j1 j1Var = (j1) this.f12621b.f12627d.get(h1Var);
                if (j1Var != null && j1Var.h()) {
                    if (j1Var.e()) {
                        j1Var.b("GmsClientSupervisor");
                    }
                    this.f12621b.f12627d.remove(h1Var);
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.f12621b.f12627d) {
            h1 h1Var2 = (h1) message.obj;
            j1 j1Var2 = (j1) this.f12621b.f12627d.get(h1Var2);
            if (j1Var2 != null && j1Var2.f() == 3) {
                String strValueOf = String.valueOf(h1Var2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(strValueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName componentNameJ = j1Var2.j();
                if (componentNameJ == null) {
                    componentNameJ = h1Var2.b();
                }
                if (componentNameJ == null) {
                    String strA = h1Var2.a();
                    o.i(strA);
                    componentNameJ = new ComponentName(strA, "unknown");
                }
                j1Var2.onServiceDisconnected(componentNameJ);
            }
        }
        return true;
    }
}
