package c.k.b;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import c.k.b.j;
import c.k.b.t;
import c.k.b.y;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class r extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f18742b;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public r(j jVar, a0 a0Var) {
        this.f18741a = jVar;
        this.f18742b = a0Var;
    }

    @Override // c.k.b.y
    public boolean c(w wVar) {
        String scheme = wVar.f18787e.getScheme();
        return "http".equals(scheme) || ClientConstants.DOMAIN_SCHEME.equals(scheme);
    }

    @Override // c.k.b.y
    public int e() {
        return 2;
    }

    @Override // c.k.b.y
    public y.a f(w wVar, int i2) throws a {
        j.a aVarA = this.f18741a.a(wVar.f18787e, wVar.f18786d);
        if (aVarA == null) {
            return null;
        }
        t.e eVar = aVarA.f18723c ? t.e.DISK : t.e.NETWORK;
        Bitmap bitmapA = aVarA.a();
        if (bitmapA != null) {
            return new y.a(bitmapA, eVar);
        }
        InputStream inputStreamC = aVarA.c();
        if (inputStreamC == null) {
            return null;
        }
        if (eVar == t.e.DISK && aVarA.b() == 0) {
            g0.e(inputStreamC);
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == t.e.NETWORK && aVarA.b() > 0) {
            this.f18742b.f(aVarA.b());
        }
        return new y.a(inputStreamC, eVar);
    }

    @Override // c.k.b.y
    public boolean h(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // c.k.b.y
    public boolean i() {
        return true;
    }
}
