package c.f.a.c.d.u.u;

import android.util.LruCache;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends LruCache<Integer, c.f.a.c.d.o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f12117a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(d dVar, int i2) {
        super(i2);
        this.f12117a = dVar;
    }

    @Override // android.util.LruCache
    public final /* synthetic */ void entryRemoved(boolean z, Integer num, c.f.a.c.d.o oVar, c.f.a.c.d.o oVar2) {
        Integer num2 = num;
        if (z) {
            this.f12117a.f11954g.add(num2);
        }
    }
}
