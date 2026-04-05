package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ThreadSafe
public final class C04675q {
    public static byte[] A00;
    public static String[] A01;
    public static final AtomicReference<C04725v> A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[4].charAt(15) != 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "ewynTuX5etTUvRbKneAORAXWy6m3gfja";
            strArr[0] = "MEXbvG7De7lT0m7kyXT3Vo2bJU5t0LAQ";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 28);
            i5++;
        }
    }

    public static void A01() {
        A00 = new byte[]{60, 40, 57, 52, 56, 51, 62, 56, 2, 51, 56, 41, 42, 50, 47, 54, 115, 57, 56, 37, 45, 47, 36, 47, 56, 35, 41};
    }

    public static void A02() {
        A01 = new String[]{"r7c1s5U0efOStYGowMowhUbuYlQTG1Tt", "4N5luf2P5Kce0fziMzoENYJ9JUsEy4RG", "Zwxj", "L2KmiKnie6D54jPyz7fJn9CofNiJStjg", "Reipc3PbxUqE4G7HYurM4m8tamMVkuwI", "qFHCxa5Kyhox8u", "zslT757DGHQcDkpTRw1DlpZ4hqoBSQOy", "oFLB5GUqllb2V05SIM"};
    }

    static {
        A02();
        A01();
        A02 = new AtomicReference<>();
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A03(@Nullable Activity activity, MotionEvent motionEvent) {
        C04725v c04725v;
        try {
            if (C04685r.A0Q(activity) && (c04725v = A02.get()) != null) {
                c04725v.A06(motionEvent);
            }
        } catch (Throwable th) {
            X3 x3A00 = C8B.A00();
            if (x3A00 != null) {
                x3A00.A04().A86(A00(20, 7, 86), C05228d.A0z, new C05238e(th));
            }
        }
    }

    public static void A04(Context context) {
        if (!(context instanceof Application)) {
            return;
        }
        LD.A05(new C1049To());
    }

    public static void A05(X3 x3, @Nullable String str) {
        M4.A06.execute(new C1046Tl(x3, str));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A06(X3 x3, String str) {
        if (!C04685r.A0Q(x3)) {
            return;
        }
        if (A02.get() == null && AnonymousClass71.A0F(AnonymousClass71.A03(str))) {
            A05(x3, str);
            return;
        }
        C04725v c04725v = A02.get();
        if (c04725v != null) {
            M4.A06.execute(new C1047Tm(c04725v, str, x3));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.ads.redexgen.X.5t] */
    @SuppressLint({"CatchGeneralException"})
    public static synchronized void A08(X3 x3, @Nullable String str) {
        try {
            if (A02.get() != null) {
                return;
            }
            if (C04685r.A0Q(x3)) {
                C1051Tq c1051Tq = new C1051Tq(x3);
                C1050Tp c1050Tp = new C1050Tp(x3);
                C04715u c04715uA0J = new Object() { // from class: com.facebook.ads.redexgen.X.5t
                    public double A00;
                    public float A01;
                    public int A02;
                    public int A03;
                    public int A04;
                    public int A05;
                    public int A06;
                    public long A07;
                    public long A08;
                    public long A09;
                    public AnonymousClass63 A0A;
                    public AnonymousClass64 A0B;
                    public AnonymousClass65 A0C;
                    public EnumC04846h A0D;
                    public InterfaceC04966t A0E;
                    public InterfaceC04976u A0F;
                    public Class A0G;

                    @Nullable
                    public String A0H;

                    @Nullable
                    public String A0I;
                    public String A0J;
                    public HashMap<Integer, Integer> A0K;
                    public Map<Integer, String> A0L;
                    public ScheduledExecutorService A0M;
                    public boolean A0N;

                    public final C04705t A00(double d2) {
                        this.A00 = d2;
                        return this;
                    }

                    public final C04705t A01(float f2) {
                        this.A01 = f2;
                        return this;
                    }

                    public final C04705t A02(int i2) {
                        this.A02 = i2;
                        return this;
                    }

                    public final C04705t A03(int i2) {
                        this.A03 = i2;
                        return this;
                    }

                    public final C04705t A04(int i2) {
                        this.A04 = i2;
                        return this;
                    }

                    public final C04705t A05(int i2) {
                        this.A05 = i2;
                        return this;
                    }

                    public final C04705t A06(int i2) {
                        this.A06 = i2;
                        return this;
                    }

                    public final C04705t A07(long j2) {
                        this.A07 = j2;
                        return this;
                    }

                    public final C04705t A08(long j2) {
                        this.A08 = j2;
                        return this;
                    }

                    public final C04705t A09(AnonymousClass63 anonymousClass63) {
                        this.A0A = anonymousClass63;
                        return this;
                    }

                    public final C04705t A0A(AnonymousClass64 anonymousClass64) {
                        this.A0B = anonymousClass64;
                        return this;
                    }

                    public final C04705t A0B(AnonymousClass65 anonymousClass65) {
                        this.A0C = anonymousClass65;
                        return this;
                    }

                    public final C04705t A0C(EnumC04846h enumC04846h) {
                        this.A0D = enumC04846h;
                        return this;
                    }

                    public final C04705t A0D(Class cls) {
                        this.A0G = cls;
                        return this;
                    }

                    public final C04705t A0E(@Nullable String str2) {
                        this.A0I = str2;
                        return this;
                    }

                    public final C04705t A0F(String str2) {
                        this.A0J = str2;
                        return this;
                    }

                    public final C04705t A0G(HashMap<Integer, Integer> circularBufferLengthMap) {
                        this.A0K = circularBufferLengthMap;
                        return this;
                    }

                    public final C04705t A0H(Map map) {
                        this.A0L = map;
                        return this;
                    }

                    public final C04705t A0I(boolean z) {
                        this.A0N = z;
                        return this;
                    }

                    public final C04715u A0J() {
                        C04715u c04715u = new C04715u();
                        c04715u.A0J = this.A0N;
                        c04715u.A02 = this.A04;
                        c04715u.A0G = this.A0K;
                        c04715u.A01 = this.A03;
                        c04715u.A00 = this.A02;
                        c04715u.A04 = this.A06;
                        c04715u.A0F = this.A0J;
                        c04715u.A07 = this.A0B;
                        c04715u.A06 = this.A0A;
                        double unused = C04715u.A0K = this.A00;
                        c04715u.A09 = this.A0D;
                        c04715u.A0H = this.A0L;
                        c04715u.A03 = this.A05;
                        c04715u.A0C = this.A0G;
                        c04715u.A08 = this.A0C;
                        float unused2 = C04715u.A0L = this.A01;
                        long unused3 = C04715u.A0N = this.A08;
                        long unused4 = C04715u.A0M = this.A07;
                        c04715u.A05 = this.A09;
                        c04715u.A0B = this.A0F;
                        c04715u.A0A = this.A0E;
                        c04715u.A0I = this.A0M;
                        c04715u.A0D = this.A0H;
                        c04715u.A0E = this.A0I;
                        return c04715u;
                    }
                }.A0I(true).A04(C04685r.A05(x3)).A02(C04685r.A03(x3)).A03(C04685r.A04(x3)).A06(C04685r.A07(x3)).A0G(C04685r.A0M()).A0A(c1051Tq).A09(c1050Tp.A01()).A00(C04685r.A01(x3)).A0C(EnumC04846h.A0G).A0F(C04685r.A0D(x3)).A0H(C04685r.A0N(x3)).A05(C04685r.A06(x3)).A0D(Build.class).A01(C04685r.A02(x3)).A08(C04685r.A09(x3)).A07(C04685r.A08(x3)).A0B(c1050Tp).A0E(A00(0, 20, 65)).A0J();
                if (C04685r.A0R(x3)) {
                    A04(x3.getApplicationContext());
                }
                C04725v c04725v = new C04725v(x3, c04715uA0J, C04685r.A0A(x3));
                if (str != null) {
                    c04725v.A07(str);
                }
                A02.set(c04725v);
            }
        } finally {
        }
    }
}
