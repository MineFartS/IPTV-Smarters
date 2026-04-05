package c.f.a.a.j.y.k;

import android.database.Cursor;
import c.f.a.a.j.y.k.b0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f6366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.a.j.m f6368c;

    public n(b0 b0Var, List list, c.f.a.a.j.m mVar) {
        this.f6366a = b0Var;
        this.f6367b = list;
        this.f6368c = mVar;
    }

    public static b0.b a(b0 b0Var, List list, c.f.a.a.j.m mVar) {
        return new n(b0Var, list, mVar);
    }

    @Override // c.f.a.a.j.y.k.b0.b
    public Object apply(Object obj) {
        return b0.s0(this.f6366a, this.f6367b, this.f6368c, (Cursor) obj);
    }
}
