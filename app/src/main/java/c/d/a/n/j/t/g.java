package c.d.a.n.j.t;

import android.content.Context;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import c.d.a.n.j.r;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class g extends r<InputStream> {

    public static class a implements m<URL, InputStream> {
        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<URL, InputStream> b(Context context, c.d.a.n.j.c cVar) {
            return new g(cVar.a(c.d.a.n.j.d.class, InputStream.class));
        }
    }

    public g(l<c.d.a.n.j.d, InputStream> lVar) {
        super(lVar);
    }
}
