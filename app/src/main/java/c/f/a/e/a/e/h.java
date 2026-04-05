package c.f.a.e.a.e;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f15718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f15719d;

    public h(j jVar, IBinder iBinder) {
        this.f15719d = jVar;
        this.f15718c = iBinder;
    }

    @Override // c.f.a.e.a.e.b
    public final void a() {
        k kVar = this.f15719d.f15721a;
        kVar.f15733l = (IInterface) kVar.f15729h.a(this.f15718c);
        k.j(this.f15719d.f15721a);
        this.f15719d.f15721a.f15727f = false;
        Iterator it = this.f15719d.f15721a.f15726e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f15719d.f15721a.f15726e.clear();
    }
}
