package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LR {
    public static byte[] A00;
    public static final String A01;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{115, -73, -67, -73, -72, -87, -79, 115, -91, -76, -76, 115, -105, -71, -76, -87, -74, -71, -73, -87, -74, 114, -91, -76, -81, -65, -108, -75, -90, -71, -83, 0, 29, 29, 34, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, -50, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 25, -50, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_SECOND, 26, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, -52, -63, -70, -86, -89, 125, -124, 127, -120, -93, -91, 6, -9, 5, 6, -65, -3, -9, 11, 5};
    }

    static {
        A05();
        A01 = LR.class.getSimpleName();
    }

    public static LQ A00() {
        try {
            boolean isRooted = A07() || A06() || A08(A01(59, 2, 1));
            if (isRooted) {
                return LQ.A04;
            }
            return LQ.A06;
        } catch (Throwable th) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A01, A01(31, 19, 127), th);
            }
            return LQ.A05;
        }
    }

    @Nullable
    public static String A02(Context context) {
        try {
            return A03(context);
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static String A03(Context context) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        StringBuilder sb = new StringBuilder();
        for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
            sb.append(LW.A03(MessageDigest.getInstance(A01(50, 4, 74)).digest(A04(signature).getEncoded())));
            sb.append(A01(26, 1, 42));
        }
        return sb.toString();
    }

    public static PublicKey A04(Signature signature) throws CertificateException {
        return CertificateFactory.getInstance(A01(54, 5, 32)).generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getPublicKey();
    }

    public static boolean A06() {
        String buildTags = Build.TAGS;
        return buildTags != null && buildTags.contains(A01(61, 9, 99));
    }

    public static boolean A07() {
        File superUserApk = new File(A01(0, 25, 21));
        return superUserApk.exists();
    }

    public static boolean A08(String str) {
        File[] fileArrListFiles;
        for (String path : System.getenv(A01(27, 4, 54)).split(A01(25, 1, 86))) {
            File file = new File(path);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File fileInPath : fileArrListFiles) {
                    if (fileInPath.getName().equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
