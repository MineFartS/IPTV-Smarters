package com.google.ads.interactivemedia.v3.internal;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f21811a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static MessageDigest f21813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f21814d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f21815e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CountDownLatch f21812b = new CountDownLatch(1);

    public static u a(o oVar) {
        k kVarA = u.a();
        kVarA.B(oVar.a());
        return kVarA.ac();
    }

    public static String b(u uVar, String str) throws GeneralSecurityException {
        byte[] bArrH;
        ah ahVarAc;
        byte[] bArrAi = uVar.ai();
        if (aoo.f20311n.f().booleanValue()) {
            Vector<byte[]> vectorG = g(bArrAi);
            if (vectorG == null || vectorG.size() == 0) {
                bArrH = h(a(o.PSN_ENCODE_SIZE_FAIL).ai(), str, true);
                return hd.b(bArrH, true);
            }
            ag agVarA = ah.a();
            int size = vectorG.size();
            for (int i2 = 0; i2 < size; i2++) {
                agVarA.a(bkd.o(h(vectorG.get(i2), str, false)));
            }
            agVarA.c(bkd.o(d(bArrAi)));
            ahVarAc = agVarA.ac();
        } else {
            if (hd.f21907a == null) {
                throw new GeneralSecurityException();
            }
            byte[] bArrA = hd.f21907a.a(bArrAi, str != null ? str.getBytes() : new byte[0]);
            ag agVarA2 = ah.a();
            agVarA2.a(bkd.o(bArrA));
            agVarA2.b(aa.TINK_HYBRID);
            ahVarAc = agVarA2.ac();
        }
        bArrH = ahVarAc.ai();
        return hd.b(bArrH, true);
    }

    public static void c() {
        synchronized (f21815e) {
            if (!f21811a) {
                f21811a = true;
                new Thread(new ft(null)).start();
            }
        }
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f21814d) {
            c();
            MessageDigest messageDigest2 = null;
            try {
                if (f21812b.await(2L, TimeUnit.SECONDS) && (messageDigest = f21813c) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = f21813c.digest();
        }
        return bArrDigest;
    }

    public static byte[] f(String str, String str2) {
        w wVarA = x.a();
        try {
            wVarA.b(bkd.o(str.length() < 3 ? str.getBytes("ISO-8859-1") : hd.c(str, true)));
            wVarA.a(bkd.o(str2.length() < 3 ? str2.getBytes("ISO-8859-1") : hd.c(str2, true)));
            return wVarA.ac().ai();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    public static Vector<byte[]> g(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static byte[] h(byte[] bArr, String str, boolean z) {
        ByteBuffer byteBufferPut;
        int i2 = true != z ? 255 : 239;
        if (bArr.length > i2) {
            bArr = a(o.PSN_ENCODE_SIZE_FAIL).ai();
        }
        int length = bArr.length;
        if (length < i2) {
            byte[] bArr2 = new byte[i2 - length];
            new SecureRandom().nextBytes(bArr2);
            byteBufferPut = ByteBuffer.allocate(i2 + 1).put((byte) length).put(bArr).put(bArr2);
        } else {
            byteBufferPut = ByteBuffer.allocate(i2 + 1).put((byte) length).put(bArr);
        }
        byte[] bArrArray = byteBufferPut.array();
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(d(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        fv[] fvVarArr = new gi().cN;
        int length2 = fvVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            fvVarArr[i3].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new bjn(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
