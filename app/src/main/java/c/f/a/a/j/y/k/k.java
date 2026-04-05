package c.f.a.a.j.y.k;

import android.database.sqlite.SQLiteDatabase;
import c.f.a.a.j.y.k.b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f6362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.m f6363b;

    public k(b0 b0Var, c.f.a.a.j.m mVar) {
        this.f6362a = b0Var;
        this.f6363b = mVar;
    }

    public static b0.b a(b0 b0Var, c.f.a.a.j.m mVar) {
        return new k(b0Var, mVar);
    }

    @Override // c.f.a.a.j.y.k.b0.b
    public Object apply(Object obj) {
        return b0.c0(this.f6362a, this.f6363b, (SQLiteDatabase) obj);
    }
}
