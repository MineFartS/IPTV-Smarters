package c.f.a.a.j.y.k;

import android.database.sqlite.SQLiteDatabase;
import c.f.a.a.j.y.k.b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements b0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f6371a;

    public q(SQLiteDatabase sQLiteDatabase) {
        this.f6371a = sQLiteDatabase;
    }

    public static b0.d b(SQLiteDatabase sQLiteDatabase) {
        return new q(sQLiteDatabase);
    }

    @Override // c.f.a.a.j.y.k.b0.d
    public Object a() {
        return b0.u(this.f6371a);
    }
}
