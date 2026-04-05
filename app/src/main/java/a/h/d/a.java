package a.h.d;

import a.f.i;
import a.i.q.f;
import a.i.q.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f<ArrayList<T>> f1616a = new g(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i<T, ArrayList<T>> f1617b = new i<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<T> f1618c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet<T> f1619d = new HashSet<>();

    public void a(T t, T t2) {
        if (!this.f1617b.containsKey(t) || !this.f1617b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f1617b.get(t);
        if (arrayListF == null) {
            arrayListF = f();
            this.f1617b.put(t, arrayListF);
        }
        arrayListF.add(t2);
    }

    public void b(T t) {
        if (this.f1617b.containsKey(t)) {
            return;
        }
        this.f1617b.put(t, null);
    }

    public void c() {
        int size = this.f1617b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListN = this.f1617b.n(i2);
            if (arrayListN != null) {
                k(arrayListN);
            }
        }
        this.f1617b.clear();
    }

    public boolean d(T t) {
        return this.f1617b.containsKey(t);
    }

    public final void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f1617b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                e(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    public final ArrayList<T> f() {
        ArrayList<T> arrayListB = this.f1616a.b();
        return arrayListB == null ? new ArrayList<>() : arrayListB;
    }

    public List g(T t) {
        return this.f1617b.get(t);
    }

    public List<T> h(T t) {
        int size = this.f1617b.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListN = this.f1617b.n(i2);
            if (arrayListN != null && arrayListN.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1617b.j(i2));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f1618c.clear();
        this.f1619d.clear();
        int size = this.f1617b.size();
        for (int i2 = 0; i2 < size; i2++) {
            e(this.f1617b.j(i2), this.f1618c, this.f1619d);
        }
        return this.f1618c;
    }

    public boolean j(T t) {
        int size = this.f1617b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListN = this.f1617b.n(i2);
            if (arrayListN != null && arrayListN.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1616a.a(arrayList);
    }
}
