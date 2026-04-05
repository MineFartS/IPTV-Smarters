package c.f.a.c.j.h;

import android.content.Context;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a3 extends w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f4<d4<l3>> f13194b;

    public a3(Context context, @Nullable f4<d4<l3>> f4Var) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f13193a = context;
        this.f13194b = f4Var;
    }

    @Override // c.f.a.c.j.h.w3
    public final Context a() {
        return this.f13193a;
    }

    @Override // c.f.a.c.j.h.w3
    @Nullable
    public final f4<d4<l3>> b() {
        return this.f13194b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w3) {
            w3 w3Var = (w3) obj;
            if (this.f13193a.equals(w3Var.a())) {
                f4<d4<l3>> f4Var = this.f13194b;
                f4<d4<l3>> f4VarB = w3Var.b();
                if (f4Var != null ? f4Var.equals(f4VarB) : f4VarB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13193a.hashCode() ^ 1000003) * 1000003;
        f4<d4<l3>> f4Var = this.f13194b;
        return iHashCode ^ (f4Var == null ? 0 : f4Var.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13193a);
        String strValueOf2 = String.valueOf(this.f13194b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 46 + strValueOf2.length());
        sb.append("FlagsContext{context=");
        sb.append(strValueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
