package c.f.a.c.j.c;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class vc extends bd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc f13120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(uc ucVar) {
        super(ucVar, null);
        this.f13120c = ucVar;
    }

    public /* synthetic */ vc(uc ucVar, tc tcVar) {
        this(ucVar);
    }

    @Override // c.f.a.c.j.c.bd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new wc(this.f13120c, null);
    }
}
