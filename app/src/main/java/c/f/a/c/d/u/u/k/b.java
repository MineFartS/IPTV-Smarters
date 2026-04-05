package c.f.a.c.d.u.u.k;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.c.d.u.u.b f12031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f12032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f12033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f12034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f12035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f12037h;

    public b(Context context) {
        this(context, new c.f.a.c.d.u.u.b(-1, 0, 0));
    }

    public b(Context context, c.f.a.c.d.u.u.b bVar) {
        this.f12030a = context;
        this.f12031b = bVar;
        this.f12034e = new e();
        c();
    }

    @Override // c.f.a.c.d.u.u.k.f
    public final void a(Bitmap bitmap) {
        this.f12035f = bitmap;
        this.f12036g = true;
        a aVar = this.f12037h;
        if (aVar != null) {
            aVar.a(bitmap);
        }
        this.f12033d = null;
    }

    public final void b() {
        c();
        this.f12037h = null;
    }

    public final void c() {
        d dVar = this.f12033d;
        if (dVar != null) {
            dVar.cancel(true);
            this.f12033d = null;
        }
        this.f12032c = null;
        this.f12035f = null;
        this.f12036g = false;
    }

    public final void d(a aVar) {
        this.f12037h = aVar;
    }

    public final boolean e(Uri uri) {
        if (uri == null) {
            c();
            return true;
        }
        if (uri.equals(this.f12032c)) {
            return this.f12036g;
        }
        c();
        this.f12032c = uri;
        if (this.f12031b.K() == 0 || this.f12031b.I() == 0) {
            this.f12033d = new d(this.f12030a, this);
        } else {
            this.f12033d = new d(this.f12030a, this.f12031b.K(), this.f12031b.I(), false, this);
        }
        this.f12033d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f12032c);
        return false;
    }
}
