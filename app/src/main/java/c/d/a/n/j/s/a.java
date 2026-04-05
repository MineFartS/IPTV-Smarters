package c.d.a.n.j.s;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class a extends c.d.a.n.j.b<ParcelFileDescriptor> implements l {

    /* JADX INFO: renamed from: c.d.a.n.j.s.a$a, reason: collision with other inner class name */
    public static class C0109a implements m<File, ParcelFileDescriptor> {
        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<File, ParcelFileDescriptor> b(Context context, c.d.a.n.j.c cVar) {
            return new a(cVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public a(l<Uri, ParcelFileDescriptor> lVar) {
        super(lVar);
    }
}
