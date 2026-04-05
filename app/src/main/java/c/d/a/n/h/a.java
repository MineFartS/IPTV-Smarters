package c.d.a.n.h;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager f5503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f5504c;

    public a(AssetManager assetManager, String str) {
        this.f5503b = assetManager;
        this.f5502a = str;
    }

    @Override // c.d.a.n.h.c
    public void a() {
        T t = this.f5504c;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetUriFetcher", 2)) {
                Log.v("AssetUriFetcher", "Failed to close data", e2);
            }
        }
    }

    @Override // c.d.a.n.h.c
    public T b(c.d.a.i iVar) {
        T tD = d(this.f5503b, this.f5502a);
        this.f5504c = tD;
        return tD;
    }

    public abstract void c(T t);

    @Override // c.d.a.n.h.c
    public void cancel() {
    }

    public abstract T d(AssetManager assetManager, String str);

    @Override // c.d.a.n.h.c
    public String getId() {
        return this.f5502a;
    }
}
