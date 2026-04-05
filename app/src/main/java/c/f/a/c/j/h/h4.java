package c.f.a.c.j.h;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class h4<T> implements f4<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile f4<T> f13347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f13348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NullableDecl
    public T f13349d;

    public h4(f4<T> f4Var) {
        f4Var.getClass();
        this.f13347b = f4Var;
    }

    public final String toString() {
        Object string = this.f13347b;
        if (string == null) {
            String strValueOf = String.valueOf(this.f13349d);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // c.f.a.c.j.h.f4
    public final T zza() {
        if (!this.f13348c) {
            synchronized (this) {
                if (!this.f13348c) {
                    T tZza = this.f13347b.zza();
                    this.f13349d = tZza;
                    this.f13348c = true;
                    this.f13347b = null;
                    return tZza;
                }
            }
        }
        return this.f13349d;
    }
}
