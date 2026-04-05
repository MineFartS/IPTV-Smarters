package c.f.a.c.f.o.n;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.a.b;
import c.f.a.c.f.o.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d<R extends c.f.a.c.f.o.j, A extends a.b> extends BasePendingResult<R> implements e<R> {
    @Override // c.f.a.c.f.o.n.e
    public /* bridge */ /* synthetic */ void a(@RecentlyNonNull Object obj) {
        super.i((c.f.a.c.f.o.j) obj);
    }

    public abstract void o(@RecentlyNonNull A a2);

    public void p(@RecentlyNonNull R r) {
    }

    public final void q(@RecentlyNonNull A a2) throws DeadObjectException {
        try {
            o(a2);
        } catch (DeadObjectException e2) {
            r(e2);
            throw e2;
        } catch (RemoteException e3) {
            r(e3);
        }
    }

    public final void r(RemoteException remoteException) {
        s(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public final void s(@RecentlyNonNull Status status) {
        c.f.a.c.f.q.o.b(!status.M(), "Failed result must not be success");
        R rE = e(status);
        i(rE);
        p(rE);
    }
}
