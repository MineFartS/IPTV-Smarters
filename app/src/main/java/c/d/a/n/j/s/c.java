package c.d.a.n.j.s;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import c.d.a.n.j.p;

/* JADX INFO: loaded from: classes.dex */
public class c extends p<ParcelFileDescriptor> implements l {

    public static class a implements m<String, ParcelFileDescriptor> {
        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<String, ParcelFileDescriptor> b(Context context, c.d.a.n.j.c cVar) {
            return new c(cVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public c(l<Uri, ParcelFileDescriptor> lVar) {
        super(lVar);
    }
}
