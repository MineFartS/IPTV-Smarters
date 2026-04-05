package c.d.a.n.h;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f5513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f5515c;

    public g(Context context, Uri uri) {
        this.f5514b = context.getApplicationContext();
        this.f5513a = uri;
    }

    @Override // c.d.a.n.h.c
    public void a() {
        T t = this.f5515c;
        if (t != null) {
            try {
                c(t);
            } catch (IOException e2) {
                if (Log.isLoggable("LocalUriFetcher", 2)) {
                    Log.v("LocalUriFetcher", "failed to close data", e2);
                }
            }
        }
    }

    @Override // c.d.a.n.h.c
    public final T b(c.d.a.i iVar) {
        T tD = d(this.f5513a, this.f5514b.getContentResolver());
        this.f5515c = tD;
        return tD;
    }

    public abstract void c(T t);

    @Override // c.d.a.n.h.c
    public void cancel() {
    }

    public abstract T d(Uri uri, ContentResolver contentResolver);

    @Override // c.d.a.n.h.c
    public String getId() {
        return this.f5513a.toString();
    }
}
