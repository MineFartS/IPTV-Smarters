package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OU extends WebChromeClient {
    public final /* synthetic */ R0 A00;

    public OU(R0 r0) {
        this.A00 = r0;
    }

    public /* synthetic */ OU(R0 r0, R5 r5) {
        this(r0);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            this.A00.A09.A03(EnumC0788Jf.A0N, null);
            this.A00.A0F.A05(C05228d.A0q, consoleMessage.message());
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
