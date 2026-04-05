package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0892Nk extends WebViewClient {
    public static byte[] A0A;
    public Date A00;
    public boolean A01 = false;
    public final X2 A02;
    public final WeakReference<XL> A03;
    public final WeakReference<InterfaceC0890Ni> A04;
    public final WeakReference<AtomicBoolean> A05;
    public final WeakReference<C0849Ls> A06;
    public final WeakReference<Q2> A07;
    public final AtomicInteger A08;
    public final AtomicReference<String> A09;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{61, 51, 63, 61, 123, 122, 108, 124, 109, 118, 111, 107, 118, 112, 113, 61, 63, 37, 63, 61, 53, 59, 55, 53, 98, 101, 123, 53, 55, 45, 55, 53, 80, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 71, 122, 118, 112, 99, 34, 102, 99, 118, 99, 56, 34, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 34, 30, DateTimeFieldType.MINUTE_OF_DAY, 25, 24, 5, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, 63, 4, 5, DateTimeFieldType.MINUTE_OF_HOUR, 3, DateTimeFieldType.MINUTE_OF_DAY, 9, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 59, DateTimeFieldType.MINUTE_OF_HOUR, 1, 6, 59, DateTimeFieldType.MILLIS_OF_DAY, 1, DateTimeFieldType.MILLIS_OF_SECOND, 11, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 7, 1, 59, 1, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.MILLIS_OF_DAY, 106, 105, 103, 98, 111, 104, 97, 89, 114, 111, 107, 99, 89, 111, 104, 89, 107, 111, 106, 106, 111, 117, 42, 33, 48, 126, 126, 1, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 27, 1, 9, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 29, 27, DateTimeFieldType.MILLIS_OF_DAY, 1, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_DAY, 11, 10, DateTimeFieldType.MILLIS_OF_SECOND, 1, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 4, 0, DateTimeFieldType.CLOCKHOUR_OF_DAY, 6, 1, 42, 28, DateTimeFieldType.HOUR_OF_DAY, 57, 43, 44, DateTimeFieldType.HOUR_OF_DAY, 56, 39, 43, 57, 99, 58, 123, 119, 124, 125, 58, 56, 34, 56, 58};
    }

    public C0892Nk(X2 x2, WeakReference<InterfaceC0890Ni> weakReference, WeakReference<Q2> weakReference2, WeakReference<C0849Ls> weakReference3, WeakReference<AtomicBoolean> weakReference4, WeakReference<XL> weakReference5, AtomicInteger atomicInteger, AtomicReference<String> atomicReference) {
        this.A02 = x2;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = weakReference4;
        this.A03 = weakReference5;
        this.A08 = atomicInteger;
        this.A09 = atomicReference;
    }

    @VisibleForTesting
    public static String A01(int i2, String str, String str2) {
        return A00(157, 11, 82) + i2 + A00(0, 20, 85) + str + A00(20, 12, 93) + str2 + A00(32, 2, 56);
    }

    private void A03(int i2, CharSequence charSequence, long j2) {
        JSONObject jSONObject = new JSONObject();
        boolean z = charSequence != null;
        try {
            jSONObject.put(A00(46, 10, 55), i2);
            jSONObject.put(A00(56, 17, 42), charSequence);
            jSONObject.put(A00(73, 21, 46), z);
            jSONObject.put(A00(94, 22, 76), j2);
            jSONObject.put(A00(139, 10, 63), this.A09.get());
        } catch (JSONException unused) {
        }
        this.A02.A04().A86(A00(149, 8, 4), C05228d.A2C, new C05238e(AdErrorType.WEB_VIEW_FAILED_TO_LOAD.getDefaultErrorMessage(), A00(34, 12, 72) + jSONObject.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i2, @Nullable String str) {
        if (A00(116, 23, 14).equals(str)) {
            this.A02.A0A().ADq();
            return;
        }
        this.A02.A0A().ADr(i2, str);
        A03(i2, str, new Date().getTime() - this.A00.getTime());
        if (this.A04.get() != null) {
            this.A04.get().A9f(i2, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A02.A0A().ADs(this.A03.get() != null);
        if (this.A03.get() != null && this.A05.get() != null && !this.A05.get().get()) {
            this.A03.get().A04();
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0A().ADt();
        this.A00 = new Date();
        new Handler().postDelayed(new XM(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.A01 = true;
        A04(i2, str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean zA0l = JT.A0l(this.A02);
        String strA00 = A00(0, 0, 49);
        if (zA0l) {
            this.A01 = true;
            A04(webResourceError.getErrorCode(), strA00 + ((Object) webResourceError.getDescription()));
            return;
        }
        this.A02.A0A().ADu(A01(webResourceError.getErrorCode(), strA00 + ((Object) webResourceError.getDescription()), strA00 + webResourceRequest.getUrl()));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A02.A0A().ADv();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.A04.get() != null) {
            this.A04.get().A9D(str, new C0897Np().A04(this.A07.get()).A03(this.A06.get()).A06());
            return true;
        }
        return true;
    }
}
