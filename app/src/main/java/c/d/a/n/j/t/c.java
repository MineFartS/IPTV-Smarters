package c.d.a.n.j.t;

import android.content.Context;
import android.net.Uri;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class c extends c.d.a.n.j.b<InputStream> implements l {

    public static class a implements m<File, InputStream> {
        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<File, InputStream> b(Context context, c.d.a.n.j.c cVar) {
            return new c(cVar.a(Uri.class, InputStream.class));
        }
    }

    public c(l<Uri, InputStream> lVar) {
        super(lVar);
    }
}
