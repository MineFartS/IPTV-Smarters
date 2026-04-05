package c.f.a.a.j.y.k;

import android.database.sqlite.SQLiteDatabase;
import c.f.a.a.j.y.k.b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6365a;

    public m(long j2) {
        this.f6365a = j2;
    }

    public static b0.b a(long j2) {
        return new m(j2);
    }

    @Override // c.f.a.a.j.y.k.b0.b
    public Object apply(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f6365a)}));
    }
}
