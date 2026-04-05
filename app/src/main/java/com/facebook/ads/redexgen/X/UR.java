package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UR implements InterfaceC04876k<Integer> {
    public static byte[] A02;
    public final String A00;
    public final String A01;

    static {
        A03();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-38, -80, -73, -78, -69, -77, 113, 12, -53};
    }

    public UR(Signature signature) throws NoSuchAlgorithmException, CertificateException {
        this.A00 = A01(signature, AnonymousClass70.A05);
        this.A01 = A01(signature, AnonymousClass70.A06);
    }

    public static String A01(Signature signature, AnonymousClass70 anonymousClass70) throws NoSuchAlgorithmException, CertificateException {
        return AnonymousClass71.A08(((X509Certificate) CertificateFactory.getInstance(A00(0, 5, 93)).generateCertificate(new ByteArrayInputStream(signature.toByteArray()))).getEncoded(), anonymousClass70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04876k
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final JSONObject ADZ(Integer num, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A00(5, 2, 27), this.A00);
        jSONObject2.put(A00(7, 2, 116), this.A01);
        jSONObject.put(Integer.toString(num.intValue()), jSONObject2);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04876k
    public final boolean A7f(Object obj) {
        String str;
        UR ur = (UR) obj;
        String str2 = this.A00;
        return str2 != null && str2.equals(ur.A00) && (str = this.A01) != null && str.equals(ur.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04876k
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final int ADF() {
        String str = this.A01;
        int length = str != null ? str.length() : 0;
        String str2 = this.A00;
        return length + (str2 != null ? str2.length() : 0);
    }
}
