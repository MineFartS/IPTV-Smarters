package a.p;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, v> f3033a = new HashMap<>();

    public final void a() {
        Iterator<v> it = this.f3033a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f3033a.clear();
    }

    public final v b(String str) {
        return this.f3033a.get(str);
    }

    public Set<String> c() {
        return new HashSet(this.f3033a.keySet());
    }

    public final void d(String str, v vVar) {
        v vVarPut = this.f3033a.put(str, vVar);
        if (vVarPut != null) {
            vVarPut.d();
        }
    }
}
