package a.l.d;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.amazonaws.services.s3.internal.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Fragment> f2489a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, v> f2490b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f2491c;

    public void a(Fragment fragment) {
        if (this.f2489a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2489a) {
            this.f2489a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void b() {
        this.f2490b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f2490b.get(str) != null;
    }

    public void d(int i2) {
        for (v vVar : this.f2490b.values()) {
            if (vVar != null) {
                vVar.u(i2);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2490b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (v vVar : this.f2490b.values()) {
                printWriter.print(str);
                if (vVar != null) {
                    Fragment fragmentK = vVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(Constants.NULL_VERSION_ID);
                }
            }
        }
        int size = this.f2489a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f2489a.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    public Fragment f(String str) {
        v vVar = this.f2490b.get(str);
        if (vVar != null) {
            return vVar.k();
        }
        return null;
    }

    public Fragment g(int i2) {
        for (int size = this.f2489a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2489a.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (v vVar : this.f2490b.values()) {
            if (vVar != null) {
                Fragment fragmentK = vVar.k();
                if (fragmentK.mFragmentId == i2) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f2489a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2489a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (v vVar : this.f2490b.values()) {
            if (vVar != null) {
                Fragment fragmentK = vVar.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (v vVar : this.f2490b.values()) {
            if (vVar != null && (fragmentFindFragmentByWho = vVar.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f2489a.indexOf(fragment);
        for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
            Fragment fragment2 = this.f2489a.get(i2);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f2489a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f2489a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List<v> k() {
        ArrayList arrayList = new ArrayList();
        for (v vVar : this.f2490b.values()) {
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return arrayList;
    }

    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<v> it = this.f2490b.values().iterator();
        while (it.hasNext()) {
            v next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    public v m(String str) {
        return this.f2490b.get(str);
    }

    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.f2489a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2489a) {
            arrayList = new ArrayList(this.f2489a);
        }
        return arrayList;
    }

    public q o() {
        return this.f2491c;
    }

    public void p(v vVar) {
        Fragment fragmentK = vVar.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f2490b.put(fragmentK.mWho, vVar);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.f2491c.f(fragmentK);
            } else {
                this.f2491c.n(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (n.G0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    public void q(v vVar) {
        Fragment fragmentK = vVar.k();
        if (fragmentK.mRetainInstance) {
            this.f2491c.n(fragmentK);
        }
        if (this.f2490b.put(fragmentK.mWho, null) != null && n.G0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    public void r() {
        Iterator<Fragment> it = this.f2489a.iterator();
        while (it.hasNext()) {
            v vVar = this.f2490b.get(it.next().mWho);
            if (vVar != null) {
                vVar.m();
            }
        }
        for (v vVar2 : this.f2490b.values()) {
            if (vVar2 != null) {
                vVar2.m();
                Fragment fragmentK = vVar2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    q(vVar2);
                }
            }
        }
    }

    public void s(Fragment fragment) {
        synchronized (this.f2489a) {
            this.f2489a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void t() {
        this.f2490b.clear();
    }

    public void u(List<String> list) {
        this.f2489a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (n.G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    public ArrayList<u> v() {
        ArrayList<u> arrayList = new ArrayList<>(this.f2490b.size());
        for (v vVar : this.f2490b.values()) {
            if (vVar != null) {
                Fragment fragmentK = vVar.k();
                u uVarS = vVar.s();
                arrayList.add(uVarS);
                if (n.G0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + uVarS.f2473n);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> w() {
        synchronized (this.f2489a) {
            if (this.f2489a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f2489a.size());
            for (Fragment fragment : this.f2489a) {
                arrayList.add(fragment.mWho);
                if (n.G0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                }
            }
            return arrayList;
        }
    }

    public void x(q qVar) {
        this.f2491c = qVar;
    }
}
