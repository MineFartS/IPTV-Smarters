package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.90, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass90 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03;
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 60);
            i5++;
        }
    }

    public static void A04() {
        A02 = new byte[]{-58, -54, -53, -7, -7, -9, -8, -9, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, -3, 8, 5, DateTimeFieldType.MILLIS_OF_DAY, 1, -60, -59, -68, 10, 11, DateTimeFieldType.CLOCKHOUR_OF_DAY, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    public static void A05() {
        A03 = new String[]{"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    }

    static {
        A05();
        A04();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static InterfaceC0820Kn A00() {
        return new XQ();
    }

    public static L3 A01(X3 x3) {
        return new XR(x3);
    }

    public static void A06(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        ExecutorC0851Lu.A01.execute(new XP(initListener, initResult));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A08(X3 x3) {
        if (JU.A0Q(x3) && !A05.getAndSet(true)) {
            try {
                Thread.setDefaultUncaughtExceptionHandler(new C8T(Thread.getDefaultUncaughtExceptionHandler(), x3, new XT()));
            } catch (Exception e2) {
                x3.A04().A86(A02(181, 7, 62), C05228d.A1E, new C05238e(e2));
            }
        }
    }

    public static void A09(X3 x3) {
        A0H(x3, null, null, 3);
    }

    public static void A0A(X3 x3) {
        A0H(x3, null, null, 3);
    }

    public static void A0B(X3 x3) {
        if (JT.A1E(x3)) {
            A0G(x3, 0);
        }
        if (JT.A1H(x3)) {
            A0D(x3);
        }
    }

    public static void A0C(X3 x3) {
        if (JT.A1F(x3)) {
            A0I(x3, null, null, 3);
        }
    }

    public static void A0D(X3 x3) {
        M4.A06.execute(new XO(x3));
    }

    public static void A0E(X3 x3) {
        C8X.A0D(x3, new XU(x3), new XV(), BuildConfigApi.isDebug());
        C1331bu.A01(x3);
        C04675q.A05(x3, null);
    }

    public static void A0G(X3 x3, int i2) {
        C8B.A01(x3);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            KL.A02();
        }
        A08(x3);
        L0.A00(JT.A0h(x3), BuildConfigApi.isDebug(), A00(), A01(x3));
        C04605j.A04(JT.A02(x3));
        QP.A0A(new XS(x3));
        if (i2 == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            x3.A04().A8K(A02(178, 3, 33), C05228d.A0G, new C05238e(A02(198, 24, 96)));
        }
        LD.A04(x3);
        M4.A06(x3);
        C0792Jj.A03(x3);
        C03450u.A0D(x3);
    }

    public static void A0H(X3 x3, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i2) {
        KL.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        QP.A06();
        A0I(x3, multithreadedBundleWrapper, initListener, i2);
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A0I(X3 x3, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i2) {
        C8B.A01(x3);
        boolean z = false;
        synchronized (AnonymousClass90.class) {
            if (!A00) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3 && !A01) {
                        A01 = true;
                        z = true;
                    }
                } else {
                    A00 = true;
                    z = true;
                }
            }
        }
        if (z) {
            A0G(x3, i2);
            M4.A08.execute(new XN(x3, multithreadedBundleWrapper, initListener));
        } else {
            if (i2 != 1) {
                return;
            }
            String strA02 = A02(51, 38, 53);
            if (initListener != null) {
                A06(initListener, new C05438z(true, strA02));
            } else {
                Log.w(A02(8, 17, 60), strA02);
            }
        }
    }

    public static synchronized boolean A0J() {
        return A00;
    }
}
