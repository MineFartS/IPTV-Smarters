package c.k.b;

import android.content.Context;
import c.k.b.t;
import c.k.b.y;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class g extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18697a;

    public g(Context context) {
        this.f18697a = context;
    }

    @Override // c.k.b.y
    public boolean c(w wVar) {
        return "content".equals(wVar.f18787e.getScheme());
    }

    @Override // c.k.b.y
    public y.a f(w wVar, int i2) {
        return new y.a(j(wVar), t.e.DISK);
    }

    public InputStream j(w wVar) {
        return this.f18697a.getContentResolver().openInputStream(wVar.f18787e);
    }
}
