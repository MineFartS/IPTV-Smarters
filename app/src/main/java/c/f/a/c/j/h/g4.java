package c.f.a.c.j.h;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class g4<T> implements Serializable, f4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f4<T> f13334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient boolean f13335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NullableDecl
    public transient T f13336d;

    public g4(f4<T> f4Var) {
        f4Var.getClass();
        this.f13334b = f4Var;
    }

    public final String toString() {
        Object string;
        if (this.f13335c) {
            String strValueOf = String.valueOf(this.f13336d);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f13334b;
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
        if (!this.f13335c) {
            synchronized (this) {
                if (!this.f13335c) {
                    T tZza = this.f13334b.zza();
                    this.f13336d = tZza;
                    this.f13335c = true;
                    return tZza;
                }
            }
        }
        return this.f13336d;
    }
}
