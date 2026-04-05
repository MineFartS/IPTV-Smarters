package a.l.d;

import a.p.w;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q extends a.p.v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w.b f2448c = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2452g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, Fragment> f2449d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, q> f2450e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, a.p.x> f2451f = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2453h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2454i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2455j = false;

    public class a implements w.b {
        @Override // a.p.w.b
        public <T extends a.p.v> T a(Class<T> cls) {
            return new q(true);
        }
    }

    public q(boolean z) {
        this.f2452g = z;
    }

    public static q j(a.p.x xVar) {
        return (q) new a.p.w(xVar, f2448c).a(q.class);
    }

    @Override // a.p.v
    public void d() {
        if (n.G0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2453h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f2449d.equals(qVar.f2449d) && this.f2450e.equals(qVar.f2450e) && this.f2451f.equals(qVar.f2451f);
    }

    public void f(Fragment fragment) {
        if (this.f2455j) {
            if (n.G0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2449d.containsKey(fragment.mWho)) {
                return;
            }
            this.f2449d.put(fragment.mWho, fragment);
            if (n.G0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public void g(Fragment fragment) {
        if (n.G0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.f2450e.get(fragment.mWho);
        if (qVar != null) {
            qVar.d();
            this.f2450e.remove(fragment.mWho);
        }
        a.p.x xVar = this.f2451f.get(fragment.mWho);
        if (xVar != null) {
            xVar.a();
            this.f2451f.remove(fragment.mWho);
        }
    }

    public Fragment h(String str) {
        return this.f2449d.get(str);
    }

    public int hashCode() {
        return (((this.f2449d.hashCode() * 31) + this.f2450e.hashCode()) * 31) + this.f2451f.hashCode();
    }

    public q i(Fragment fragment) {
        q qVar = this.f2450e.get(fragment.mWho);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f2452g);
        this.f2450e.put(fragment.mWho, qVar2);
        return qVar2;
    }

    public Collection<Fragment> k() {
        return new ArrayList(this.f2449d.values());
    }

    public a.p.x l(Fragment fragment) {
        a.p.x xVar = this.f2451f.get(fragment.mWho);
        if (xVar != null) {
            return xVar;
        }
        a.p.x xVar2 = new a.p.x();
        this.f2451f.put(fragment.mWho, xVar2);
        return xVar2;
    }

    public boolean m() {
        return this.f2453h;
    }

    public void n(Fragment fragment) {
        if (this.f2455j) {
            if (n.G0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f2449d.remove(fragment.mWho) != null) && n.G0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public void o(boolean z) {
        this.f2455j = z;
    }

    public boolean p(Fragment fragment) {
        if (this.f2449d.containsKey(fragment.mWho)) {
            return this.f2452g ? this.f2453h : !this.f2454i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2449d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2450e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2451f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
