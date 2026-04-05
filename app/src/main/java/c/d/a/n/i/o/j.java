package c.d.a.n.i.o;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.d.a.t.e<c.d.a.n.c, String> f5649a = new c.d.a.t.e<>(1000);

    public String a(c.d.a.n.c cVar) {
        String strG;
        synchronized (this.f5649a) {
            strG = this.f5649a.g(cVar);
        }
        if (strG == null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                cVar.a(messageDigest);
                strG = c.d.a.t.h.l(messageDigest.digest());
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            } catch (NoSuchAlgorithmException e3) {
                e3.printStackTrace();
            }
            synchronized (this.f5649a) {
                this.f5649a.k(cVar, strG);
            }
        }
        return strG;
    }
}
