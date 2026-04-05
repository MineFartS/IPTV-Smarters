package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class azz implements bec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private bbi f20748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bas f20749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bbq f20751f;

    public azz(bcw bcwVar) throws GeneralSecurityException {
        String strG = bcwVar.g();
        this.f20746a = strG;
        if (strG.equals(axz.f20709b)) {
            try {
                bbk bbkVarE = bbk.e(bcwVar.f(), bkm.a());
                this.f20748c = (bbi) axx.c(bcwVar);
                this.f20747b = bbkVarE.a();
                return;
            } catch (blf e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        }
        if (strG.equals(axz.f20708a)) {
            try {
                bau bauVarD = bau.d(bcwVar.f(), bkm.a());
                this.f20749d = (bas) axx.c(bcwVar);
                this.f20750e = bauVarD.e().a();
                this.f20747b = this.f20750e + bauVarD.f().a();
                return;
            } catch (blf e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        }
        if (!strG.equals(azk.f20740a)) {
            String strValueOf = String.valueOf(strG);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(strValueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            bbs bbsVarE = bbs.e(bcwVar.f(), bkm.a());
            this.f20751f = (bbq) axx.c(bcwVar);
            this.f20747b = bbsVarE.a();
        } catch (blf e4) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e4);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bec
    public final int a() {
        return this.f20747b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bec
    public final baa b(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.f20747b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f20746a.equals(axz.f20709b)) {
            bbh bbhVarC = bbi.c();
            bbhVarC.ah(this.f20748c);
            bbhVarC.a(bkd.p(bArr, 0, this.f20747b));
            return new baa((awu) axx.f(this.f20746a, bbhVarC.ac(), awu.class));
        }
        if (!this.f20746a.equals(axz.f20708a)) {
            if (!this.f20746a.equals(azk.f20740a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            bbp bbpVarC = bbq.c();
            bbpVarC.ah(this.f20751f);
            bbpVarC.a(bkd.p(bArr, 0, this.f20747b));
            return new baa((awx) axx.f(this.f20746a, bbpVarC.ac(), awx.class));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.f20750e);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.f20750e, this.f20747b);
        bav bavVarC = baw.c();
        bavVarC.ah(this.f20749d.f());
        bavVarC.a(bkd.o(bArrCopyOfRange));
        baw bawVarAc = bavVarC.ac();
        bcl bclVarC = bcm.c();
        bclVarC.ah(this.f20749d.g());
        bclVarC.a(bkd.o(bArrCopyOfRange2));
        bcm bcmVarAc = bclVarC.ac();
        bar barVarC = bas.c();
        barVarC.c(this.f20749d.a());
        barVarC.a(bawVarAc);
        barVarC.b(bcmVarAc);
        return new baa((awu) axx.f(this.f20746a, barVarC.ac(), awu.class));
    }
}
