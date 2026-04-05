package c.k.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import c.k.b.t;
import c.k.b.y;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
public class z extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18830a;

    public z(Context context) {
        this.f18830a = context;
    }

    public static Bitmap j(Resources resources, int i2, w wVar) {
        BitmapFactory.Options optionsD = y.d(wVar);
        if (y.g(optionsD)) {
            BitmapFactory.decodeResource(resources, i2, optionsD);
            y.b(wVar.f18791i, wVar.f18792j, optionsD, wVar);
        }
        return BitmapFactory.decodeResource(resources, i2, optionsD);
    }

    @Override // c.k.b.y
    public boolean c(w wVar) {
        if (wVar.f18788f != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f18787e.getScheme());
    }

    @Override // c.k.b.y
    public y.a f(w wVar, int i2) throws FileNotFoundException {
        Resources resourcesO = g0.o(this.f18830a, wVar);
        return new y.a(j(resourcesO, g0.n(resourcesO, wVar), wVar), t.e.DISK);
    }
}
