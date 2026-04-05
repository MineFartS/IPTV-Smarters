package c.d.a.n.j;

import android.content.Context;
import android.net.Uri;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* JADX INFO: loaded from: classes.dex */
public abstract class q<T> implements l<Uri, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<d, T> f5701b;

    public q(Context context, l<d, T> lVar) {
        this.f5700a = context;
        this.f5701b = lVar;
    }

    public static boolean e(String str) {
        return TransferTable.COLUMN_FILE.equals(str) || "content".equals(str) || "android.resource".equals(str);
    }

    public abstract c.d.a.n.h.c<T> b(Context context, String str);

    public abstract c.d.a.n.h.c<T> c(Context context, Uri uri);

    @Override // c.d.a.n.j.l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final c.d.a.n.h.c<T> a(Uri uri, int i2, int i3) {
        String scheme = uri.getScheme();
        if (e(scheme)) {
            if (!a.a(uri)) {
                return c(this.f5700a, uri);
            }
            return b(this.f5700a, a.b(uri));
        }
        if (this.f5701b == null || !("http".equals(scheme) || ClientConstants.DOMAIN_SCHEME.equals(scheme))) {
            return null;
        }
        return this.f5701b.a(new d(uri.toString()), i2, i3);
    }
}
