package c.f.a.a.j.y.k;

import android.database.Cursor;
import c.f.a.a.j.y.k.b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f6382a = new z();

    public static b0.b a() {
        return f6382a;
    }

    @Override // c.f.a.a.j.y.k.b0.b
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }
}
