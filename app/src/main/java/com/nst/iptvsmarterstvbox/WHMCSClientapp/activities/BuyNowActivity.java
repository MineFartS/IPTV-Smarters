package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import com.nst.iptvsmarterstvbox.R;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class BuyNowActivity extends a.b.k.c {

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressDialog f24688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f24689g;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_title;

    @BindView
    public WebView webview;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24686d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f24687e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f24690h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f24691i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24692j = BuildConfig.FLAVOR;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            BuyNowActivity.this.f24688f.dismiss();
            BuyNowActivity.this.webview.setVisibility(0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = e.C(BuyNowActivity.this.f24689g);
                String strQ = e.q(string);
                TextView textView = BuyNowActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = BuyNowActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    BuyNowActivity.this.A0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void A0() {
        runOnUiThread(new b());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this, (Class<?>) ServicesDashboardActivity.class);
        intent.setFlags(67141632);
        intent.setAction("check_buy_now");
        startActivity(intent);
        finish();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_buy_now);
        ButterKnife.a(this);
        this.tv_title.setText(getResources().getString(R.string.Service_Buy_Now));
        Intent intent = getIntent();
        this.f24690h = intent.getAction();
        new Thread(new c()).start();
        this.f24689g = this;
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f24688f = progressDialog;
        progressDialog.setMessage(this.f24689g.getResources().getString(R.string.please_wait_invoice));
        this.f24688f.show();
        this.f24688f.setCancelable(false);
        Context context = this.f24689g;
        if (context != null) {
            this.f24688f.setMessage(context.getResources().getString(R.string.please_wait_invoice));
        }
        this.webview.getSettings().setJavaScriptEnabled(true);
        this.webview.getSettings().setLoadWithOverviewMode(true);
        this.webview.getSettings().setUseWideViewPort(true);
        this.webview.setWebViewClient(new a());
        String str = this.f24690h;
        if (str == null || !str.equalsIgnoreCase("Invoice_action")) {
            this.f24687e = intent.getStringExtra("service_id");
            z0();
        } else {
            this.f24692j = intent.getStringExtra("status");
            this.f24691i = intent.getStringExtra("invoice_id");
            y0();
        }
    }

    public final void y0() {
        if (this.f24691i != null) {
            this.webview.loadUrl("https://cms.alldrama.tv/viewinvoice.php?id=" + this.f24691i + "&loginemail=" + c.h.a.e.b.a.b(this.f24689g) + "&api_username=OUBQqC6334OcxjS&gotourl=viewinvoice.php?id=" + this.f24691i);
        }
    }

    public final void z0() {
        this.webview.loadUrl("http://51.75.16.104/upgrade.php?type=package&id=" + this.f24687e + "&loginemail=" + c.h.a.e.b.a.b(this) + "&api_username=OUBQqC6334OcxjS&gotourl=upgrade.php");
    }
}
