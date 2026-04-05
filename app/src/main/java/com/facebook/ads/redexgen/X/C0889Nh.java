package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0889Nh {
    public static String[] A07;
    public final String A00 = C0889Nh.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<C0S> A03;
    public final WeakReference<InterfaceC0890Ni> A04;
    public final WeakReference<Q2> A05;
    public final WeakReference<XL> A06;

    static {
        A01();
    }

    public static void A01() {
        A07 = new String[]{"FOFLIt4izaDLaQDOMIXk8qYNT283z5pM", "oiToeohcscvINDKXEsytRf9HFldaqPXB", "4ipPd9h88IiL3d99rWL92oIsRR1k6HBA", "hPx", "0GhefH5NzI2ypbPnqUG75Cq8VmhNX1", "2b6", "snO0JYp8WiAdMwbOevXppfTs6iFhTSIS", "awSLBYFe7Md8cHgboMT9P3Pgh1wlsZGE"};
    }

    public C0889Nh(XL xl, InterfaceC0890Ni interfaceC0890Ni, Q2 q2, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, X2 x2) {
        this.A06 = new WeakReference<>(xl);
        this.A04 = new WeakReference<>(interfaceC0890Ni);
        this.A05 = new WeakReference<>(q2);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(x2.A0A());
    }

    private C0S A00() {
        C0S c0s = this.A03.get();
        if (c0s == null) {
            return new RP();
        }
        return c0s;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return LY.A01(C05318m.A02());
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().ADl();
        if (this.A06.get() == null || this.A01.get() == null || this.A02.get() == null) {
            return;
        }
        boolean z = this.A02.get().get();
        String[] strArr = A07;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        strArr2[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        if (z) {
            this.A01.get().set(true);
            A00().ADm();
            if (this.A06.get().isShown()) {
                A00().ADn();
                new Handler(Looper.getMainLooper()).post(new C1150Xl(this.A05));
            }
            InterfaceC0890Ni interfaceC0890Ni = this.A04.get();
            if (interfaceC0890Ni != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0888Ng(this, interfaceC0890Ni));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        XL xl = this.A06.get();
        if (xl == null || xl.A03()) {
            A00().ADo(true);
            return;
        }
        InterfaceC0890Ni interfaceC0890Ni = this.A04.get();
        if (interfaceC0890Ni == null) {
            A00().ADo(true);
        } else {
            A00().ADo(false);
            interfaceC0890Ni.AAO();
        }
    }
}
