package c.f.a.a.j.y.k;

import android.database.sqlite.SQLiteDatabase;
import c.f.a.a.j.y.k.b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.m f6361b;

    public j(long j2, c.f.a.a.j.m mVar) {
        this.f6360a = j2;
        this.f6361b = mVar;
    }

    public static b0.b a(long j2, c.f.a.a.j.m mVar) {
        return new j(j2, mVar);
    }

    @Override // c.f.a.a.j.y.k.b0.b
    public Object apply(Object obj) {
        return b0.D0(this.f6360a, this.f6361b, (SQLiteDatabase) obj);
    }
}
