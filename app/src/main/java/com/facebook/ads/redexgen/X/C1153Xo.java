package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(19)
public final class C1153Xo extends AbstractC0887Nf {
    public static byte[] A07;
    public static final String A08;
    public static final Set<String> A09;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public NZ A04;
    public InterfaceC0884Nc A05;
    public final X2 A06;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{83, 79, 79, 75, 49, 45, 45, 41, 42, 6, DateTimeFieldType.HALFDAY_OF_DAY, 26, DateTimeFieldType.HALFDAY_OF_DAY, 31, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, 5, 28, 24, 86};
    }

    static {
        A06();
        A08 = C1153Xo.class.getSimpleName();
        A09 = new HashSet(2);
        A09.add(A02(0, 4, 102));
        A09.add(A02(4, 5, 4));
    }

    public C1153Xo(X2 x2, InterfaceC0884Nc interfaceC0884Nc) {
        super(x2);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        this.A05 = interfaceC0884Nc;
        this.A06 = x2;
        setWebChromeClient(A0A());
        setWebViewClient(A0B());
        A05();
    }

    private void A04() {
        if (this.A00 > -1 && this.A03 > -1 && this.A01 > -1) {
            this.A04.A06(false);
        }
    }

    private void A05() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        this.A04 = new NZ(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0887Nf
    public final WebChromeClient A0A() {
        return new C0885Nd(new WeakReference(this.A05), new WeakReference(this.A04));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0887Nf
    public final WebViewClient A0B() {
        return new C0886Ne(new WeakReference(this.A05), new WeakReference(this.A06));
    }

    public final void A0C(long j2) {
        if (this.A00 < 0) {
            this.A00 = j2;
        }
        A04();
    }

    public final void A0D(long j2) {
        if (this.A01 < 0) {
            this.A01 = j2;
        }
        A04();
    }

    public final void A0E(long j2) {
        if (this.A02 < 0) {
            this.A02 = j2;
        }
    }

    public final void A0F(String str) {
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            loadUrl(A02(9, 11, 49) + str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0887Nf, android.webkit.WebView
    public final void destroy() {
        this.A05 = null;
        C0893Nl.A04(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        if (webBackForwardListCopyBackForwardList.getSize() > 0) {
            return webBackForwardListCopyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
            A04();
        }
    }
}
