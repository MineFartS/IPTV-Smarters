package com.nst.iptvsmarterstvbox.WHMCSClientapp.fragment;

import android.view.View;
import android.webkit.WebView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class InvoiceFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InvoiceFragment f24925b;

    public InvoiceFragment_ViewBinding(InvoiceFragment invoiceFragment, View view) {
        this.f24925b = invoiceFragment;
        invoiceFragment.webView = (WebView) c.c(view, R.id.webview, "field 'webView'", WebView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        InvoiceFragment invoiceFragment = this.f24925b;
        if (invoiceFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24925b = null;
        invoiceFragment.webView = null;
    }
}
