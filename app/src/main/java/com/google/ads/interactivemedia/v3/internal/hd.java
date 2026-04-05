package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import android.util.Base64;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static awz f21907a;

    public static void a(hc hcVar) throws GeneralSecurityException {
        Method methodH;
        if (f21907a != null) {
            return;
        }
        String strF = aoo.f20310m.f();
        if (strF == null || strF.length() == 0) {
            strF = null;
            if (hcVar != null && (methodH = hcVar.h("gRg4fCi0LCTpnQrV3PsNLy90ZesL/QRa6YWri3+gAi7rRcznZqsXWOYXHOmcY7vO", "3pkKTVgLDXVJJ5N8zGXuZSULCDRtq3PN/ITUaJE7BOs=")) != null) {
                strF = (String) methodH.invoke(null, new Object[0]);
            }
            if (strF == null) {
                return;
            }
        }
        try {
            axi axiVarA = axm.a(c(strF, true));
            for (bcy bcyVar : azs.f20744a.d()) {
                if (bcyVar.f().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (bcyVar.e().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (bcyVar.d().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!bcyVar.d().equals("TinkAead") && !bcyVar.d().equals("TinkMac") && !bcyVar.d().equals("TinkHybridDecrypt") && !bcyVar.d().equals("TinkHybridEncrypt") && !bcyVar.d().equals("TinkPublicKeySign") && !bcyVar.d().equals("TinkPublicKeyVerify") && !bcyVar.d().equals("TinkStreamingAead") && !bcyVar.d().equals("TinkDeterministicAead")) {
                    awv<?> awvVarA = axx.a(bcyVar.d());
                    axx.k(awvVarA.a());
                    bcyVar.f();
                    bcyVar.e();
                    bcyVar.a();
                    axx.j(awvVarA.b(), bcyVar.g());
                }
            }
            f21907a = azv.a(axiVarA);
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
    }

    public static String b(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    public static byte[] c(String str, boolean z) {
        byte[] bArrDecode = Base64.decode(str, true != z ? 2 : 11);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
