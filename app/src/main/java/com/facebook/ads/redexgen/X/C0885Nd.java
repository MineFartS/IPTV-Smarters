package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0885Nd extends WebChromeClient {
    public static String[] A02;
    public final WeakReference<InterfaceC0884Nc> A00;
    public final WeakReference<NZ> A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"YcV2lPdb1GD", "n5DgX5QSw4FQX59vcvxBmCs4C4mD4", "EksZFw55Ld98qazTViJtw6pSuONG6", "FQxvmp8vruM", "8OOSEuFQ7OrFhHkYKSo1UtYVyasxVGnA", "3ltH6wFp1GB97FT9l8RHOrWs4kHkX0iG", "Qgk2ZsNAH7VHvpqjGWkwA7olVBMIpezg", "lYuGhUBeP576iz9ihjd4qaMvDoX6gejl"};
    }

    public C0885Nd(WeakReference<InterfaceC0884Nc> weakReference, WeakReference<NZ> weakReference2) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        if (!TextUtils.isEmpty(strMessage) && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.LOG) {
            NZ nz = this.A01.get();
            String[] strArr = A02;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "G67BWScyobP0YXfVqACryJUIpKzfHuOG";
            strArr2[5] = "G67BWScyobP0YXfVqACryJUIpKzfHuOG";
            if (nz != null) {
                this.A01.get().A05(strMessage);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
        if (this.A01.get() != null) {
            this.A01.get().A04();
        }
        if (this.A00.get() != null) {
            this.A00.get().AAf(i2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        if (this.A00.get() != null) {
            this.A00.get().AAk(str);
        }
    }
}
