package c.f.a.c.f.o.n;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<?> f12390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.c.f.d f12391b;

    public /* synthetic */ e0(b bVar, c.f.a.c.f.d dVar, y yVar) {
        this.f12390a = bVar;
        this.f12391b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e0)) {
            e0 e0Var = (e0) obj;
            if (c.f.a.c.f.q.n.a(this.f12390a, e0Var.f12390a) && c.f.a.c.f.q.n.a(this.f12391b, e0Var.f12391b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c.f.a.c.f.q.n.b(this.f12390a, this.f12391b);
    }

    public final String toString() {
        return c.f.a.c.f.q.n.c(this).a(TransferTable.COLUMN_KEY, this.f12390a).a("feature", this.f12391b).toString();
    }
}
