package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0886Ne extends WebViewClient {
    public static byte[] A02;
    public final WeakReference<X2> A00;
    public final WeakReference<InterfaceC0884Nc> A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-67, -33, -16, -27, -14, -27, -16, -11, -100, -22, -21, -16, -100, -30, -21, -15, -22, -32, -100, -16, -21, -100, -28, -35, -22, -32, -24, -31, -100, -47, -50, -59, -86, 42, 67, 64, 67, 68, 76, 67, -11, 58, 77, 56, 58, 69, 73, 62, 68, 67, -11, 68, 56, 56, 74, 71, 71, 58, 57, -11, 76, 61, 58, 67, -11, 73, 71, 78, 62, 67, 60, -11, 73, 68, -11, 61, 54, 67, 57, 65, 58, -11, 42, 39, 30, 3, 39, 52, 42, 56, 53, 47, 42, -12, 47, 52, 58, 43, 52, 58, -12, 39, 41, 58, 47, 53, 52, -12, 28, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 11, 29, 73, 55, 52, 49, 72, 59, 55, 73};
    }

    public C0886Ne(WeakReference<InterfaceC0884Nc> weakReference, WeakReference<X2> weakReference2) {
        this.A01 = weakReference;
        this.A00 = weakReference2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.A01.get() != null) {
            this.A01.get().AAN(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.A01.get() != null) {
            this.A01.get().AAP(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        if (!C1153Xo.A09.contains(uri.getScheme()) && this.A00.get() != null) {
            try {
                return LB.A0C(this.A00.get(), new Intent(A00(86, 26, 101), uri));
            } catch (Exception e2) {
                if (e2 instanceof ActivityNotFoundException) {
                    Log.w(C1153Xo.A08, A00(0, 33, 27), e2);
                } else {
                    Log.e(C1153Xo.A08, A00(33, 53, 116), e2);
                }
                X2 x2 = this.A00.get();
                if (x2 != null) {
                    x2.A04().A87(A00(112, 8, 113), C05228d.A2B, new C05238e(e2));
                    return false;
                }
                return false;
            }
        }
        return false;
    }
}
