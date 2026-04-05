package c.f.a.a.j.y.k;

import android.database.Cursor;
import c.f.a.a.j.y.k.b0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements b0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6370a;

    public p(Map map) {
        this.f6370a = map;
    }

    public static b0.b a(Map map) {
        return new p(map);
    }

    @Override // c.f.a.a.j.y.k.b0.b
    public Object apply(Object obj) {
        return b0.w0(this.f6370a, (Cursor) obj);
    }
}
