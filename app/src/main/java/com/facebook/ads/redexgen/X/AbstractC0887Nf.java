package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0887Nf extends WebView {
    public static byte[] A02;
    public static final String A03;
    public boolean A00;
    public final X2 A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{87, 112, 120, 125, 116, 117, 49, 101, 126, 49, 120, 127, 120, 101, 120, 112, 125, 120, 107, 116, 49, 82, 126, 126, 122, 120, 116, 92, 112, 127, 112, 118, 116, 99, 63};
    }

    static {
        A02();
        A03 = AbstractC0887Nf.class.getSimpleName();
    }

    public AbstractC0887Nf(X2 x2) {
        super(x2);
        this.A01 = x2;
        A01();
    }

    private void A01() {
        setWebChromeClient(A0A());
        setWebViewClient(A0B());
        C0893Nl.A05(this);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        if (BuildConfigApi.isDebug() && Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            } catch (Exception unused) {
                Log.w(A03, A00(0, 35, 120));
            }
        }
    }

    public final boolean A03() {
        return this.A00;
    }

    public WebChromeClient A0A() {
        return new WebChromeClient();
    }

    public WebViewClient A0B() {
        return new WebViewClient();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.A00 = true;
        super.destroy();
    }

    public X2 getAdContextWrapper() {
        return this.A01;
    }
}
