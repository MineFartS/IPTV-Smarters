package a.v;

import a.p.w;
import a.p.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class g extends a.p.v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w.b f3547c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<UUID, x> f3548d = new HashMap<>();

    public class a implements w.b {
        @Override // a.p.w.b
        public <T extends a.p.v> T a(Class<T> cls) {
            return new g();
        }
    }

    public static g g(x xVar) {
        return (g) new w(xVar, f3547c).a(g.class);
    }

    @Override // a.p.v
    public void d() {
        Iterator<x> it = this.f3548d.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f3548d.clear();
    }

    public void f(UUID uuid) {
        x xVarRemove = this.f3548d.remove(uuid);
        if (xVarRemove != null) {
            xVarRemove.a();
        }
    }

    public x h(UUID uuid) {
        x xVar = this.f3548d.get(uuid);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x();
        this.f3548d.put(uuid, xVar2);
        return xVar2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f3548d.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
