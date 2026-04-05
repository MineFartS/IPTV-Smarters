package c.f.c.q;

import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f16223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final Map<Pair<String, String>, c.f.a.c.o.i<q>> f16224b = new a.f.a();

    public interface a {
        c.f.a.c.o.i<q> start();
    }

    public w(Executor executor) {
        this.f16223a = executor;
    }

    public synchronized c.f.a.c.o.i<q> a(String str, String str2, a aVar) {
        final Pair<String, String> pair = new Pair<>(str, str2);
        c.f.a.c.o.i<q> iVar = this.f16224b.get(pair);
        if (iVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return iVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(strValueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        c.f.a.c.o.i iVarI = aVar.start().i(this.f16223a, new c.f.a.c.o.a(this, pair) { // from class: c.f.c.q.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final w f16221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Pair f16222b;

            {
                this.f16221a = this;
                this.f16222b = pair;
            }

            @Override // c.f.a.c.o.a
            public Object a(c.f.a.c.o.i iVar2) {
                this.f16221a.b(this.f16222b, iVar2);
                return iVar2;
            }
        });
        this.f16224b.put(pair, (c.f.a.c.o.i<q>) iVarI);
        return iVarI;
    }

    public final /* synthetic */ c.f.a.c.o.i b(Pair pair, c.f.a.c.o.i iVar) {
        synchronized (this) {
            this.f16224b.remove(pair);
        }
        return iVar;
    }
}
