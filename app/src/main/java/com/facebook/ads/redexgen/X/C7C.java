package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7C {
    public static AnonymousClass00 A0A;
    public static byte[] A0B;
    public static String[] A0C;
    public static final String A0D;
    public static final Map<String, AnonymousClass06> A0E;
    public long A00;
    public C0789Jg A01;
    public final C7D A03;
    public final C8C A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0B = new byte[]{-68, -71, -22, -71, -65, -69, -64, -68, 125, -127, -83, -83, 125, 127, 124, -81, 107, 103, 106, 103, 105, -101, 106, 109, 96, 126, -128, -123, -126, 61, -112, -111, 126, -113, -111, -126, -127, 75, -119, -89, -87, -82, -81, -76, -83, 102, -87, -75, -77, -74, -78, -85, -70, -85, -113, -83, -81, -76, -75, -70, -77, 108, -78, -83, -75, -72, -79, -80, 127, -99, -97, -92, -91, -86, -93, 92, -81, -80, -99, -82, -80, -95, -96, 106, 106, 106, 102, -103, -124, -122, -111, -107, -118, -112, -113, 65, -104, -119, -118, -115, -122, 65, -122, -103, -122, -124, -106, -107, -118, -113, -120, 65, -124, -126, -124, -119, -122, 65, -123, -112, -104, -113, -115, -112, -126, -123, -108, 79, -86, -88, -86, -81, -84, -118, -74, -76, -73, -77, -84, -69, -80, -74, -75, -113, -74, -74, -78, -79, -81, -79, -74, -77, -108, -81, -73, -70, -61, -64, -77, -106, -67, -67, -71, 122, -115, 122, 120, -118, -119, 122, -113, -110, -124, -121, -24, -21, -35, -32, -37, -16, -27, -23, -31, -37, -23, -17, -20, -31, -24, -16};
    }

    public static void A0E() {
        A0C = new String[]{"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    }

    static {
        A0E();
        A0D();
        A0D = C7C.class.getSimpleName();
        A0E = Collections.synchronizedMap(new HashMap());
    }

    public C7C(C8C c8c) {
        this.A04 = c8c;
        this.A03 = C7D.A06(c8c.A00());
        this.A08 = JT.A1Y(c8c);
        this.A09 = C0945Pm.A04() && JT.A1b(c8c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static AnonymousClass00 A02(X3 x3) {
        if (A0A == null) {
            A0A = AnonymousClass01.A00(x3, new Object() { // from class: com.facebook.ads.redexgen.X.07
                public int A00;
                public int A01;
                public boolean A02;
                public boolean A03;
                public boolean A04;

                public final AnonymousClass07 A00(int i2) {
                    this.A00 = i2;
                    return this;
                }

                public final AnonymousClass07 A01(int i2) {
                    this.A01 = i2;
                    return this;
                }

                public final AnonymousClass07 A02(boolean z) {
                    this.A02 = z;
                    return this;
                }

                public final AnonymousClass07 A03(boolean z) {
                    this.A03 = z;
                    return this;
                }

                public final AnonymousClass07 A04(boolean z) {
                    this.A04 = z;
                    return this;
                }

                public final AnonymousClass08 A05() {
                    return new AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                }
            }.A00(JT.A04(x3)).A02(x3.A03().A7c()).A01(-1).A03(JT.A0g(x3)).A04(JT.A1f(x3)).A05(), A05(x3));
        }
        return A0A;
    }

    public static AnonymousClass06 A04(C8C c8c, String str) {
        AnonymousClass06 anonymousClass06 = A0E.get(str);
        if (C7F.A06(c8c) && anonymousClass06 != null) {
            return new AnonymousClass06(anonymousClass06);
        }
        return new AnonymousClass06(str);
    }

    public static C0M A05(X3 x3) {
        return new C1138Wz(x3);
    }

    public static AtomicBoolean A0B(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0C;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[5] = BuildConfig.FLAVOR;
            strArr2[5] = BuildConfig.FLAVOR;
            if (zHasNext) {
                arrayList2.add(M4.A02().submit(it.next()));
            } else {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        atomicBoolean.set(atomicBoolean.get() && ((Boolean) ((Future) it2.next()).get()).booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    Log.e(A0D, A08(86, 42, 23), e2);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(EnumC0788Jf enumC0788Jf) {
        if (this.A01 == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A08(174, 12, 114), C0848Lr.A04(this.A00));
        this.A01.A03(enumC0788Jf, map);
    }

    @Nullable
    public final Bitmap A0I(String str) {
        return this.A07.get(str);
    }

    @Nullable
    public final Bitmap A0J(String str, int i2, int i3) {
        if (this.A08) {
            AnonymousClass06 anonymousClass06A04 = A04(this.A04, str);
            anonymousClass06A04.A03 = A08(186, 4, 111);
            anonymousClass06A04.A01 = i3;
            anonymousClass06A04.A00 = i2;
            return A02(this.A04.A00()).ACa(anonymousClass06A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i2, i3, A08(170, 4, 25));
    }

    public final String A0K(String cachedUrl) {
        if (this.A08) {
            AnonymousClass06 anonymousClass06A04 = A04(this.A04, cachedUrl);
            anonymousClass06A04.A03 = A08(186, 4, 111);
            String strACc = A02(this.A04.A00()).ACc(anonymousClass06A04);
            return strACc != null ? strACc : cachedUrl;
        }
        return this.A03.A0F(cachedUrl);
    }

    public final String A0L(String cachedUrl) {
        AnonymousClass06 anonymousClass06A04 = A04(this.A04, cachedUrl);
        anonymousClass06A04.A03 = A08(186, 4, 111);
        String strACc = A02(this.A04.A00()).ACc(anonymousClass06A04);
        return strACc != null ? strACc : cachedUrl;
    }

    public final String A0M(String cachedUrl) {
        if (this.A09) {
            return cachedUrl;
        }
        AnonymousClass06 anonymousClass06A04 = A04(this.A04, cachedUrl);
        anonymousClass06A04.A03 = A08(186, 4, 111);
        String strACc = A02(this.A04.A00()).ACc(anonymousClass06A04);
        return strACc != null ? strACc : cachedUrl;
    }

    public final void A0N() {
        KL.A05(A08(128, 19, 61), A08(38, 16, 60), A08(0, 8, 127));
    }

    public final void A0O() {
        KL.A05(A08(147, 16, 68), A08(54, 14, 66), A08(16, 8, 44));
    }

    public final void A0P() {
        this.A07.clear();
    }

    public final void A0Q(@Nullable AnonymousClass74 anonymousClass74, AnonymousClass75 anonymousClass75) {
        KL.A05(A08(163, 7, 11), A08(68, 18, 50), A08(8, 8, 64));
        this.A00 = System.currentTimeMillis();
        C7F.A02(this.A04, anonymousClass75, C7F.A07, A08(24, 14, 19), -1L);
        M4.A03().execute(new C1137Wy(this, new ArrayList(this.A05), anonymousClass74, anonymousClass75, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0R(final AnonymousClass79 anonymousClass79) {
        Callable<Boolean> callable = new Callable<Boolean>(anonymousClass79) { // from class: com.facebook.ads.redexgen.X.7A
            public static byte[] A02;
            public static String[] A03;
            public final AnonymousClass79 A00;

            static {
                A03();
                A02();
            }

            public static String A01(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                int i5 = 0;
                while (true) {
                    int length = bArrCopyOfRange.length;
                    if (A03[1].length() == 32) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[3] = BuildConfig.FLAVOR;
                    strArr[3] = BuildConfig.FLAVOR;
                    if (i5 >= length) {
                        return new String(bArrCopyOfRange);
                    }
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 48);
                    i5++;
                }
            }

            public static void A02() {
                A02 = new byte[]{-20, -16, -28, -22, -24};
            }

            public static void A03() {
                A03 = new String[]{"jwTNBF52XqMGgcVEiQTwvXvSBsl43Bcu", "zl9XISU", "9LwyCiCzMXmNgkxTRjX8XUqiNT4UlidW", "Jar4Zz8ck96tLH67JFbLbWmYESMeU49V", "Yd8bjyjazIom6Oxe2tnjIAJyfdSlHwWG", "VgUZ5KaBAYbzt3oMIew8EQ4BA2c", "hXTgBapwd4emagenALPcDOSBW5zmdf3H", "17k"};
            }

            {
                this.A00 = anonymousClass79;
            }

            private final Boolean A00() throws Throwable {
                if (C0822Kp.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 83), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    if (C7F.A06(this.A01.A04)) {
                        C7C.A0E.put(this.A00.A07, anonymousClass06);
                    }
                    boolean z = this.A01.A08;
                    boolean zA01 = false;
                    if (A03[3].length() != 5) {
                        String[] strArr = A03;
                        strArr[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        strArr[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        if (z) {
                            zA01 = C7C.A02(this.A01.A04.A00()).ACa(anonymousClass06, false).A01();
                        } else if (this.A01.A03.A0D(this.A00) != null) {
                            zA01 = true;
                        }
                        C7H c7h = this.A00.A00;
                        if (c7h != null && c7h.A02()) {
                            int iA00 = c7h.A00();
                            int iA01 = c7h.A01();
                            if (iA00 <= 0 || iA01 <= 0) {
                                if (this.A01.A08) {
                                    A05(this.A00.A07, anonymousClass06);
                                } else {
                                    int i2 = this.A00.A03;
                                    int width = this.A00.A04;
                                    A04(i2, width);
                                }
                            } else if (this.A01.A08) {
                                anonymousClass06.A00 = iA00;
                                anonymousClass06.A01 = iA01;
                                A05(this.A00.A07, anonymousClass06);
                            } else {
                                A04(iA00, iA01);
                            }
                        }
                        return Boolean.valueOf(zA01);
                    }
                    throw new RuntimeException();
                } catch (Throwable th) {
                    C0822Kp.A00(th, this);
                    return null;
                }
            }

            private void A04(int i2, int i3) {
                Bitmap bitmapA0E = this.A01.A03.A0E(this.A01.A04, this.A00.A07, i2, i3, this.A00.A01);
                if (bitmapA0E == null) {
                    return;
                }
                this.A01.A07.put(this.A00.A07, bitmapA0E);
            }

            private void A05(String str, AnonymousClass06 anonymousClass06) {
                Bitmap bitmapA00 = C7C.A02(this.A01.A04.A00()).ACa(anonymousClass06, true).A00();
                if (bitmapA00 == null) {
                    return;
                }
                this.A01.A07.put(str, bitmapA00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (C0822Kp.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    C0822Kp.A00(th, this);
                    return null;
                }
            }
        };
        if (!anonymousClass79.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0S(AnonymousClass79 anonymousClass79) {
        anonymousClass79.A02 = true;
        A0R(anonymousClass79);
    }

    public final void A0T(C7B c7b) {
        this.A05.add(new AnonymousClass78(this, c7b));
    }

    public final void A0U(C7B c7b) {
        c7b.A05 = true;
        this.A06.add(new AnonymousClass78(this, c7b));
    }

    public final void A0V(C7B c7b) {
        c7b.A05 = true;
        if (this.A09) {
            this.A06.add(new AnonymousClass77(this, c7b));
        } else {
            this.A06.add(new AnonymousClass78(this, c7b));
        }
    }

    public final void A0W(C7B c7b) {
        if (this.A09) {
            this.A05.add(new AnonymousClass77(this, c7b));
        } else {
            this.A05.add(new AnonymousClass78(this, c7b));
        }
    }

    public final void A0X(C0789Jg c0789Jg) {
        this.A01 = c0789Jg;
    }

    public final boolean A0Y(String str) {
        AnonymousClass06 anonymousClass06A04 = A04(this.A04, str);
        anonymousClass06A04.A03 = A08(186, 4, 111);
        return A02(this.A04.A00()).ACc(anonymousClass06A04) != null;
    }
}
