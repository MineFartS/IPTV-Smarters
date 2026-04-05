package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class azy {
    public static String a(bck bckVar) throws NoSuchAlgorithmException {
        bbw bbwVar = bbw.UNKNOWN_FORMAT;
        bcj bcjVar = bcj.UNKNOWN_CURVE;
        bck bckVar2 = bck.UNKNOWN_HASH;
        int iOrdinal = bckVar.ordinal();
        if (iOrdinal == 1) {
            return "HmacSha1";
        }
        if (iOrdinal == 2) {
            return "HmacSha384";
        }
        if (iOrdinal == 3) {
            return "HmacSha256";
        }
        if (iOrdinal == 4) {
            return "HmacSha512";
        }
        if (iOrdinal == 5) {
            return "HmacSha224";
        }
        String strValueOf = String.valueOf(bckVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(strValueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static void b(bcc bccVar) throws GeneralSecurityException {
        bet.h(c(bccVar.g().e()));
        a(bccVar.g().f());
        if (bccVar.a() == bbw.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        axx.l(bccVar.c().e());
    }

    public static int c(bcj bcjVar) throws GeneralSecurityException {
        bbw bbwVar = bbw.UNKNOWN_FORMAT;
        bcj bcjVar2 = bcj.UNKNOWN_CURVE;
        bck bckVar = bck.UNKNOWN_HASH;
        int iOrdinal = bcjVar.ordinal();
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                String strValueOf = String.valueOf(bcjVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
                sb.append("unknown curve type: ");
                sb.append(strValueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i2;
    }

    public static int d(bbw bbwVar) throws GeneralSecurityException {
        bbw bbwVar2 = bbw.UNKNOWN_FORMAT;
        bcj bcjVar = bcj.UNKNOWN_CURVE;
        bck bckVar = bck.UNKNOWN_HASH;
        int iOrdinal = bbwVar.ordinal();
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                String strValueOf = String.valueOf(bbwVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
                sb.append("unknown point format: ");
                sb.append(strValueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i2;
    }
}
