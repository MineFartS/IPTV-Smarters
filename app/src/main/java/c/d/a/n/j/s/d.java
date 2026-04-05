package c.d.a.n.j.s;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c.d.a.n.h.e;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import c.d.a.n.j.q;

/* JADX INFO: loaded from: classes.dex */
public class d extends q<ParcelFileDescriptor> implements l {

    public static class a implements m<Uri, ParcelFileDescriptor> {
        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<Uri, ParcelFileDescriptor> b(Context context, c.d.a.n.j.c cVar) {
            return new d(context, cVar.a(c.d.a.n.j.d.class, ParcelFileDescriptor.class));
        }
    }

    public d(Context context, l<c.d.a.n.j.d, ParcelFileDescriptor> lVar) {
        super(context, lVar);
    }

    @Override // c.d.a.n.j.q
    public c.d.a.n.h.c<ParcelFileDescriptor> b(Context context, String str) {
        return new c.d.a.n.h.d(context.getApplicationContext().getAssets(), str);
    }

    @Override // c.d.a.n.j.q
    public c.d.a.n.h.c<ParcelFileDescriptor> c(Context context, Uri uri) {
        return new e(context, uri);
    }
}
