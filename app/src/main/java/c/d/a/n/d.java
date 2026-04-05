package c.d.a.n;

import c.d.a.n.i.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection<? extends g<T>> f5500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5501b;

    @SafeVarargs
    public d(g<T>... gVarArr) {
        if (gVarArr.length < 1) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f5500a = Arrays.asList(gVarArr);
    }

    @Override // c.d.a.n.g
    public l<T> a(l<T> lVar, int i2, int i3) {
        Iterator<? extends g<T>> it = this.f5500a.iterator();
        l<T> lVar2 = lVar;
        while (it.hasNext()) {
            l<T> lVarA = it.next().a(lVar2, i2, i3);
            if (lVar2 != null && !lVar2.equals(lVar) && !lVar2.equals(lVarA)) {
                lVar2.b();
            }
            lVar2 = lVarA;
        }
        return lVar2;
    }

    @Override // c.d.a.n.g
    public String getId() {
        if (this.f5501b == null) {
            StringBuilder sb = new StringBuilder();
            Iterator<? extends g<T>> it = this.f5500a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getId());
            }
            this.f5501b = sb.toString();
        }
        return this.f5501b;
    }
}
