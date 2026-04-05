package c.d.a.n.j.t;

import android.content.Context;
import android.net.Uri;
import c.d.a.n.h.h;
import c.d.a.n.h.i;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import c.d.a.n.j.q;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class f extends q<InputStream> implements l {

    public static class a implements m<Uri, InputStream> {
        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<Uri, InputStream> b(Context context, c.d.a.n.j.c cVar) {
            return new f(context, cVar.a(c.d.a.n.j.d.class, InputStream.class));
        }
    }

    public f(Context context, l<c.d.a.n.j.d, InputStream> lVar) {
        super(context, lVar);
    }

    @Override // c.d.a.n.j.q
    public c.d.a.n.h.c<InputStream> b(Context context, String str) {
        return new h(context.getApplicationContext().getAssets(), str);
    }

    @Override // c.d.a.n.j.q
    public c.d.a.n.h.c<InputStream> c(Context context, Uri uri) {
        return new i(context, uri);
    }
}
