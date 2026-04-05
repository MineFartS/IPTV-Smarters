package c.f.a.b.j3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n<E> implements Iterable<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9222b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<E, Integer> f9223c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set<E> f9224d = Collections.emptySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<E> f9225e = Collections.emptyList();

    public void a(E e2) {
        synchronized (this.f9222b) {
            ArrayList arrayList = new ArrayList(this.f9225e);
            arrayList.add(e2);
            this.f9225e = Collections.unmodifiableList(arrayList);
            Integer num = this.f9223c.get(e2);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f9224d);
                hashSet.add(e2);
                this.f9224d = Collections.unmodifiableSet(hashSet);
            }
            this.f9223c.put(e2, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public int b(E e2) {
        int iIntValue;
        synchronized (this.f9222b) {
            iIntValue = this.f9223c.containsKey(e2) ? this.f9223c.get(e2).intValue() : 0;
        }
        return iIntValue;
    }

    public void d(E e2) {
        synchronized (this.f9222b) {
            Integer num = this.f9223c.get(e2);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f9225e);
            arrayList.remove(e2);
            this.f9225e = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f9223c.remove(e2);
                HashSet hashSet = new HashSet(this.f9224d);
                hashSet.remove(e2);
                this.f9224d = Collections.unmodifiableSet(hashSet);
            } else {
                this.f9223c.put(e2, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f9222b) {
            it = this.f9225e.iterator();
        }
        return it;
    }

    public Set<E> q() {
        Set<E> set;
        synchronized (this.f9222b) {
            set = this.f9224d;
        }
        return set;
    }
}
