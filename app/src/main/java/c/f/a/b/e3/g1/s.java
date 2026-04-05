package c.f.a.b.e3.g1;

import android.net.Uri;
import android.util.Base64;
import c.f.a.b.e3.g1.a0;
import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7668d;

    public s(int i2, String str, String str2, String str3) {
        this.f7665a = i2;
        this.f7666b = str;
        this.f7667c = str2;
        this.f7668d = str3;
    }

    public String a(a0.a aVar, Uri uri, int i2) throws w1 {
        int i3 = this.f7665a;
        if (i3 == 1) {
            return b(aVar);
        }
        if (i3 == 2) {
            return c(aVar, uri, i2);
        }
        throw w1.d(null, new UnsupportedOperationException());
    }

    public final String b(a0.a aVar) {
        return Base64.encodeToString(a0.b(aVar.f7490a + ":" + aVar.f7491b), 0);
    }

    public final String c(a0.a aVar, Uri uri, int i2) throws w1 {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String strO = a0.o(i2);
            String strB1 = x0.b1(messageDigest.digest(a0.b(aVar.f7490a + ":" + this.f7666b + ":" + aVar.f7491b)));
            StringBuilder sb = new StringBuilder();
            sb.append(strO);
            sb.append(":");
            sb.append(uri);
            String strB12 = x0.b1(messageDigest.digest(a0.b(strB1 + ":" + this.f7667c + ":" + x0.b1(messageDigest.digest(a0.b(sb.toString()))))));
            return this.f7668d.isEmpty() ? x0.D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f7490a, this.f7666b, this.f7667c, uri, strB12) : x0.D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f7490a, this.f7666b, this.f7667c, uri, strB12, this.f7668d);
        } catch (NoSuchAlgorithmException e2) {
            throw w1.d(null, e2);
        }
    }
}
