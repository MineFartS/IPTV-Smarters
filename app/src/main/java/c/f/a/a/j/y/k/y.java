package c.f.a.a.j.y.k;

import android.database.sqlite.SQLiteDatabase;
import c.f.a.a.j.y.k.b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6381a;

    public y(String str) {
        this.f6381a = str;
    }

    public static b0.b a(String str) {
        return new y(str);
    }

    @Override // c.f.a.a.j.y.k.b0.b
    public Object apply(Object obj) {
        return b0.C0(this.f6381a, (SQLiteDatabase) obj);
    }
}
