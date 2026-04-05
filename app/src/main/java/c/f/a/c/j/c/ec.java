package c.f.a.c.j.c;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ec<T> implements pc<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc f12805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd<?, ?> f12806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final da<?> f12808d;

    public ec(hd<?, ?> hdVar, da<?> daVar, bc bcVar) {
        this.f12806b = hdVar;
        this.f12807c = daVar.d(bcVar);
        this.f12808d = daVar;
        this.f12805a = bcVar;
    }

    public static <T> ec<T> h(hd<?, ?> hdVar, da<?> daVar, bc bcVar) {
        return new ec<>(hdVar, daVar, bcVar);
    }

    @Override // c.f.a.c.j.c.pc
    public final void a(T t, T t2) {
        rc.f(this.f12806b, t, t2);
        if (this.f12807c) {
            rc.d(this.f12808d, t, t2);
        }
    }

    @Override // c.f.a.c.j.c.pc
    public final boolean b(T t) {
        return this.f12808d.c(t).c();
    }

    @Override // c.f.a.c.j.c.pc
    public final void c(T t, ce ceVar) {
        Iterator itD = this.f12808d.c(t).d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            ka kaVar = (ka) entry.getKey();
            if (kaVar.h() != de.MESSAGE || kaVar.j() || kaVar.m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            ceVar.g(kaVar.zzgj(), entry instanceof db ? ((db) entry).a().c() : entry.getValue());
        }
        hd<?, ?> hdVar = this.f12806b;
        hdVar.b(hdVar.g(t), ceVar);
    }

    @Override // c.f.a.c.j.c.pc
    public final boolean d(T t, T t2) {
        if (!this.f12806b.g(t).equals(this.f12806b.g(t2))) {
            return false;
        }
        if (this.f12807c) {
            return this.f12808d.c(t).equals(this.f12808d.c(t2));
        }
        return true;
    }

    @Override // c.f.a.c.j.c.pc
    public final void e(T t) {
        this.f12806b.e(t);
        this.f12808d.f(t);
    }

    @Override // c.f.a.c.j.c.pc
    public final int f(T t) {
        hd<?, ?> hdVar = this.f12806b;
        int iH = hdVar.h(hdVar.g(t)) + 0;
        return this.f12807c ? iH + this.f12808d.c(t).r() : iH;
    }

    @Override // c.f.a.c.j.c.pc
    public final int g(T t) {
        int iHashCode = this.f12806b.g(t).hashCode();
        return this.f12807c ? (iHashCode * 53) + this.f12808d.c(t).hashCode() : iHashCode;
    }
}
