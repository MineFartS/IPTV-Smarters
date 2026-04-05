package c.f.a.a.j.y.k;

import android.database.sqlite.SQLiteDatabase;
import c.f.a.a.j.y.k.b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f6377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.m f6378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.a.j.h f6379c;

    public w(b0 b0Var, c.f.a.a.j.m mVar, c.f.a.a.j.h hVar) {
        this.f6377a = b0Var;
        this.f6378b = mVar;
        this.f6379c = hVar;
    }

    public static b0.b a(b0 b0Var, c.f.a.a.j.m mVar, c.f.a.a.j.h hVar) {
        return new w(b0Var, mVar, hVar);
    }

    @Override // c.f.a.a.j.y.k.b0.b
    public Object apply(Object obj) {
        return b0.A0(this.f6377a, this.f6378b, this.f6379c, (SQLiteDatabase) obj);
    }
}
