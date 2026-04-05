package c.d.a.n.j.s;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import c.d.a.n.j.n;

/* JADX INFO: loaded from: classes.dex */
public class b extends n<ParcelFileDescriptor> implements l {

    public static class a implements m<Integer, ParcelFileDescriptor> {
        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<Integer, ParcelFileDescriptor> b(Context context, c.d.a.n.j.c cVar) {
            return new b(context, cVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public b(Context context, l<Uri, ParcelFileDescriptor> lVar) {
        super(context, lVar);
    }
}
