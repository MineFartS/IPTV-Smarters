package c.f.a.c.f.o.n;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<BasePendingResult<?>, Boolean> f12503a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<c.f.a.c.o.j<?>, Boolean> f12504b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(BasePendingResult<? extends c.f.a.c.f.o.j> basePendingResult, boolean z) {
        this.f12503a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.b(new r1(this, basePendingResult));
    }

    public final <TResult> void b(c.f.a.c.o.j<TResult> jVar, boolean z) {
        this.f12504b.put(jVar, Boolean.valueOf(z));
        jVar.a().b(new s1(this, jVar));
    }

    public final boolean c() {
        return (this.f12503a.isEmpty() && this.f12504b.isEmpty()) ? false : true;
    }

    public final void d() {
        h(false, g.f12396b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L10
            java.lang.String r4 = " due to service disconnection."
        Lc:
            r0.append(r4)
            goto L16
        L10:
            r2 = 3
            if (r4 != r2) goto L16
            java.lang.String r4 = " due to dead object exception."
            goto Lc
        L16:
            if (r5 == 0) goto L20
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L20:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>(r5, r0)
            r3.h(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.f.o.n.t.e(int, java.lang.String):void");
    }

    public final void h(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f12503a) {
            map = new HashMap(this.f12503a);
        }
        synchronized (this.f12504b) {
            map2 = new HashMap(this.f12504b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).f(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((c.f.a.c.o.j) entry2.getKey()).d(new c.f.a.c.f.o.b(status));
            }
        }
    }
}
