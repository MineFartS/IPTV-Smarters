package c.f.a.a.j.y;

import android.content.Context;
import android.os.Build;
import c.f.a.a.j.y.j.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static s a(Context context, c.f.a.a.j.y.k.c cVar, c.f.a.a.j.y.j.g gVar, c.f.a.a.j.a0.a aVar) {
        return Build.VERSION.SDK_INT >= 21 ? new c.f.a.a.j.y.j.e(context, cVar, gVar) : new c.f.a.a.j.y.j.a(context, cVar, aVar, gVar);
    }
}
