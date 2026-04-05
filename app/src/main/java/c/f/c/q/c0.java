package c.f.c.q;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import c.f.c.q.f0;

/* JADX INFO: loaded from: classes2.dex */
public class c0 extends Binder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16173b;

    public interface a {
        c.f.a.c.o.i<Void> a(Intent intent);
    }

    public c0(a aVar) {
        this.f16173b = aVar;
    }

    public void b(final f0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        this.f16173b.a(aVar.f16188a).c(h.a(), new c.f.a.c.o.d(aVar) { // from class: c.f.c.q.b0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f0.a f16170a;

            {
                this.f16170a = aVar;
            }

            @Override // c.f.a.c.o.d
            public void a(c.f.a.c.o.i iVar) {
                this.f16170a.b();
            }
        });
    }
}
