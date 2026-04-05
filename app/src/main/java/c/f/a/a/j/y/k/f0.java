package c.f.a.a.j.y.k;

import android.database.sqlite.SQLiteDatabase;
import c.f.a.a.j.y.k.h0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements h0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f6345a = new f0();

    public static h0.a b() {
        return f6345a;
    }

    @Override // c.f.a.a.j.y.k.h0.a
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
