package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UF implements InterfaceC04806d {
    public final /* synthetic */ US A00;

    public UF(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        Signature[] signatureArr = this.A00.A00.getPackageManager().getPackageInfo(this.A00.A00.getPackageName(), 64).signatures;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < signatureArr.length; i2++) {
            map.put(Integer.valueOf(i2), new UR(signatureArr[i2]));
        }
        return this.A00.A05((HashMap<Integer, UR>) map);
    }
}
