package c.d.a.n.j.t;

import android.content.Context;
import android.net.Uri;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import c.d.a.n.j.n;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class d extends n<InputStream> implements l {

    public static class a implements m<Integer, InputStream> {
        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<Integer, InputStream> b(Context context, c.d.a.n.j.c cVar) {
            return new d(context, cVar.a(Uri.class, InputStream.class));
        }
    }

    public d(Context context, l<Uri, InputStream> lVar) {
        super(context, lVar);
    }
}
