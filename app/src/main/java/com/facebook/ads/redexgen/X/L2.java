package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class L2 {
    public static String[] A01;
    public static final ThreadLocal<L2> A02;
    public final C0818Kl A00 = new C0818Kl();

    public static void A03() {
        A01 = new String[]{"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    }

    static {
        A03();
        A02 = new ThreadLocal<>();
    }

    public static C0818Kl A00() {
        return A02().A00;
    }

    public static C0818Kl A01(L1 l1) {
        C0818Kl c0818Kl = new C0818Kl(A00());
        c0818Kl.add(l1);
        return c0818Kl;
    }

    public static L2 A02() {
        L2 l2 = A02.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) == strArr[2].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
        strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
        if (l2 == null) {
            L2 l22 = new L2();
            A02.set(l22);
            return l22;
        }
        return l2;
    }

    public static void A04(AbstractRunnableC0829Kx abstractRunnableC0829Kx) {
        C0818Kl createRunnableAsyncStackTrace = abstractRunnableC0829Kx.A06();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.addAll(createRunnableAsyncStackTrace);
        }
    }

    public static void A05(AbstractRunnableC0829Kx abstractRunnableC0829Kx) {
        C0818Kl createRunnableAsyncStackTrace = abstractRunnableC0829Kx.A06();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.removeAll(createRunnableAsyncStackTrace);
        }
    }
}
