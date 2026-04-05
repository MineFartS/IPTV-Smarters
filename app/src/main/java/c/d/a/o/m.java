package c.d.a.o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<c.d.a.r.b> f5876a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c.d.a.r.b> f5877b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5878c;

    public void a() {
        Iterator it = c.d.a.t.h.g(this.f5876a).iterator();
        while (it.hasNext()) {
            ((c.d.a.r.b) it.next()).clear();
        }
        this.f5877b.clear();
    }

    public void b() {
        this.f5878c = true;
        for (c.d.a.r.b bVar : c.d.a.t.h.g(this.f5876a)) {
            if (bVar.isRunning()) {
                bVar.pause();
                this.f5877b.add(bVar);
            }
        }
    }

    public void c(c.d.a.r.b bVar) {
        this.f5876a.remove(bVar);
        this.f5877b.remove(bVar);
    }

    public void d() {
        for (c.d.a.r.b bVar : c.d.a.t.h.g(this.f5876a)) {
            if (!bVar.h() && !bVar.isCancelled()) {
                bVar.pause();
                if (this.f5878c) {
                    this.f5877b.add(bVar);
                } else {
                    bVar.g();
                }
            }
        }
    }

    public void e() {
        this.f5878c = false;
        for (c.d.a.r.b bVar : c.d.a.t.h.g(this.f5876a)) {
            if (!bVar.h() && !bVar.isCancelled() && !bVar.isRunning()) {
                bVar.g();
            }
        }
        this.f5877b.clear();
    }

    public void f(c.d.a.r.b bVar) {
        this.f5876a.add(bVar);
        if (this.f5878c) {
            this.f5877b.add(bVar);
        } else {
            bVar.g();
        }
    }
}
