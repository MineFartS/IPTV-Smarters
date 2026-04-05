package c.f.a.b.e3.f1;

import android.net.Uri;
import c.f.a.b.i3.n0;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class e implements c.f.a.b.i3.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.i3.p f7256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f7258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CipherInputStream f7259e;

    public e(c.f.a.b.i3.p pVar, byte[] bArr, byte[] bArr2) {
        this.f7256b = pVar;
        this.f7257c = bArr;
        this.f7258d = bArr2;
    }

    @Override // c.f.a.b.i3.p
    public final Uri a() {
        return this.f7256b.a();
    }

    @Override // c.f.a.b.i3.l
    public final int b(byte[] bArr, int i2, int i3) throws IOException {
        c.f.a.b.j3.g.e(this.f7259e);
        int i4 = this.f7259e.read(bArr, i2, i3);
        if (i4 < 0) {
            return -1;
        }
        return i4;
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        if (this.f7259e != null) {
            this.f7259e = null;
            this.f7256b.close();
        }
    }

    public Cipher f() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // c.f.a.b.i3.p
    public final long g(c.f.a.b.i3.s sVar) {
        try {
            Cipher cipherF = f();
            try {
                cipherF.init(2, new SecretKeySpec(this.f7257c, "AES"), new IvParameterSpec(this.f7258d));
                c.f.a.b.i3.r rVar = new c.f.a.b.i3.r(this.f7256b, sVar);
                this.f7259e = new CipherInputStream(rVar, cipherF);
                rVar.i();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // c.f.a.b.i3.p
    public final void h(n0 n0Var) {
        c.f.a.b.j3.g.e(n0Var);
        this.f7256b.h(n0Var);
    }

    @Override // c.f.a.b.i3.p
    public final Map<String, List<String>> q() {
        return this.f7256b.q();
    }
}
