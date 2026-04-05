package c.d.a.n.j;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class n<T> implements l<Integer, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<Uri, T> f5697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f5698b;

    public n(Context context, l<Uri, T> lVar) {
        this(context.getResources(), lVar);
    }

    public n(Resources resources, l<Uri, T> lVar) {
        this.f5698b = resources;
        this.f5697a = lVar;
    }

    @Override // c.d.a.n.j.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.n.h.c<T> a(Integer num, int i2, int i3) {
        Uri uri;
        try {
            uri = Uri.parse("android.resource://" + this.f5698b.getResourcePackageName(num.intValue()) + '/' + this.f5698b.getResourceTypeName(num.intValue()) + '/' + this.f5698b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e2);
            }
            uri = null;
        }
        if (uri != null) {
            return this.f5697a.a(uri, i2, i3);
        }
        return null;
    }
}
