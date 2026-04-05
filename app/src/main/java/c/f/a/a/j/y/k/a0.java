package c.f.a.a.j.y.k;

import android.database.sqlite.SQLiteDatabase;
import c.f.a.a.j.y.k.b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f6325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.m f6326b;

    public a0(b0 b0Var, c.f.a.a.j.m mVar) {
        this.f6325a = b0Var;
        this.f6326b = mVar;
    }

    public static b0.b a(b0 b0Var, c.f.a.a.j.m mVar) {
        return new a0(b0Var, mVar);
    }

    @Override // c.f.a.a.j.y.k.b0.b
    public Object apply(Object obj) {
        return b0.Q(this.f6325a, this.f6326b, (SQLiteDatabase) obj);
    }
}
