package c.d.a.n.j.t;

import android.content.Context;
import android.net.Uri;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import c.d.a.n.j.p;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class e extends p<InputStream> implements l {

    public static class a implements m<String, InputStream> {
        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<String, InputStream> b(Context context, c.d.a.n.j.c cVar) {
            return new e(cVar.a(Uri.class, InputStream.class));
        }
    }

    public e(l<Uri, InputStream> lVar) {
        super(lVar);
    }
}
