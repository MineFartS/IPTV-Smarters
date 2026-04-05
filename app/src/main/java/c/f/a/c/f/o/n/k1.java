package c.f.a.c.f.o.n;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.f.a<b<?>, c.f.a.c.f.b> f12432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.f.a<b<?>, String> f12433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.c.o.j<Map<b<?>, String>> f12434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12436e;

    public final Set<b<?>> a() {
        return this.f12432a.keySet();
    }

    public final void b(b<?> bVar, c.f.a.c.f.b bVar2, String str) {
        this.f12432a.put(bVar, bVar2);
        this.f12433b.put(bVar, str);
        this.f12435d--;
        if (!bVar2.M()) {
            this.f12436e = true;
        }
        if (this.f12435d == 0) {
            if (!this.f12436e) {
                this.f12434c.c(this.f12433b);
            } else {
                this.f12434c.b(new c.f.a.c.f.o.c(this.f12432a));
            }
        }
    }
}
