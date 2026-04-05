package c.d.a.o;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<h> f5856a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5858c;

    @Override // c.d.a.o.g
    public void a(h hVar) {
        this.f5856a.add(hVar);
        if (this.f5858c) {
            hVar.onDestroy();
        } else if (this.f5857b) {
            hVar.onStart();
        } else {
            hVar.onStop();
        }
    }

    public void b() {
        this.f5858c = true;
        Iterator it = c.d.a.t.h.g(this.f5856a).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onDestroy();
        }
    }

    public void c() {
        this.f5857b = true;
        Iterator it = c.d.a.t.h.g(this.f5856a).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStart();
        }
    }

    public void d() {
        this.f5857b = false;
        Iterator it = c.d.a.t.h.g(this.f5856a).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStop();
        }
    }
}
