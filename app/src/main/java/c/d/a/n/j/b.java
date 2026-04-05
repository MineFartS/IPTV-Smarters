package c.d.a.n.j;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b<T> implements l<File, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<Uri, T> f5661a;

    public b(l<Uri, T> lVar) {
        this.f5661a = lVar;
    }

    @Override // c.d.a.n.j.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.n.h.c<T> a(File file, int i2, int i3) {
        return this.f5661a.a(Uri.fromFile(file), i2, i3);
    }
}
