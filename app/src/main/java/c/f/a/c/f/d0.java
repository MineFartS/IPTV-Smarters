package c.f.a.c.f;

import android.os.RemoteException;
import android.util.Log;
import c.f.a.c.f.q.o;
import c.f.a.c.f.q.r1;
import c.f.a.c.f.q.s1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 extends r1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12309b;

    public d0(byte[] bArr) {
        o.a(bArr.length == 25);
        this.f12309b = Arrays.hashCode(bArr);
    }

    public static byte[] K2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract byte[] I2();

    @Override // c.f.a.c.f.q.s1
    public final c.f.a.c.g.a b() {
        return c.f.a.c.g.b.K2(I2());
    }

    @Override // c.f.a.c.f.q.s1
    public final int d() {
        return this.f12309b;
    }

    public final boolean equals(Object obj) {
        c.f.a.c.g.a aVarB;
        if (obj != null && (obj instanceof s1)) {
            try {
                s1 s1Var = (s1) obj;
                if (s1Var.d() == this.f12309b && (aVarB = s1Var.b()) != null) {
                    return Arrays.equals(I2(), (byte[]) c.f.a.c.g.b.I2(aVarB));
                }
                return false;
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12309b;
    }
}
