package com.nst.iptvsmarterstvbox.view.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import com.amazonaws.services.s3.internal.Constants;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.BillingCheckGPACallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingGetDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingLoginClientCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingUpdateDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.RegisterClientCallback;
import com.nst.iptvsmarterstvbox.model.pojo.BillingDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class APPInPurchaseActivity extends Activity implements View.OnClickListener, c.h.a.k.f.d, c.c.a.a.i, c.c.a.a.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static PopupWindow f25206b;

    @BindView
    public Button bt_cancel;

    @BindView
    public Button bt_list_devices;

    @BindView
    public Button bt_login;

    @BindView
    public Button bt_pay_from_website;

    @BindView
    public Button bt_pay_from_website_1;

    @BindView
    public Button bt_proceed;

    @BindView
    public Button bt_sign_up;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f25207c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.h.a.j.b f25209e;

    @BindView
    public EditText et_sign_in_email;

    @BindView
    public EditText et_signin_password;

    @BindView
    public EditText et_signup_confirm_password;

    @BindView
    public EditText et_signup_email;

    @BindView
    public EditText et_signup_password;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.k.d.a.a f25213i;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f25216l;

    @BindView
    public LinearLayout ll_buy_premium_version;

    @BindView
    public LinearLayout ll_forgot_pass_link;

    @BindView
    public LinearLayout ll_gpa_found_not_registered;

    @BindView
    public LinearLayout ll_gpa_found_registered;

    @BindView
    public LinearLayout ll_max_connection;

    @BindView
    public LinearLayout ll_sign_in_link;

    @BindView
    public LinearLayout ll_sign_in_link_1;

    @BindView
    public LinearLayout ll_sign_in_link_2;

    @BindView
    public LinearLayout ll_sign_up_link;

    @BindView
    public LinearLayout ll_signin;

    @BindView
    public LinearLayout ll_signup;

    @BindView
    public LinearLayout ll_signup_website;

    @BindView
    public LinearLayout ll_thanks_for_purchasing;

    @BindView
    public LinearLayout ll_unlock_features;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f25217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f25218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f25219o;

    @BindView
    public Button purchaseButton;
    public c.c.a.a.c r;

    @BindView
    public RelativeLayout rl_id_logged_in;
    public SkuDetails s;
    public Handler t;

    @BindView
    public TextView tv_app_purchased;

    @BindView
    public TextView tv_email_address_logged_in;

    @BindView
    public TextView tv_logout;

    @BindView
    public TextView tv_price_currency;

    @BindView
    public TextView tv_price_currency_1;

    @BindView
    public TextView tv_price_currency_2;
    public c.c.a.a.b u;
    public ProgressBar v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25208d = false;
    public String p = BuildConfig.FLAVOR;
    public String q = BuildConfig.FLAVOR;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                c.h.a.h.n.e.j0(APPInPurchaseActivity.this.f25207c);
            }
        }
    }

    public class b implements c.c.a.a.b {
        public b() {
        }

        @Override // c.c.a.a.b
        public void a(c.c.a.a.g gVar) {
            if (gVar.b() == 0) {
                Log.e("honey", "onAcknowledgePurchaseResponse:1");
            }
            Log.e("honey", "onAcknowledgePurchaseResponse:2");
        }
    }

    public class c implements c.c.a.a.e {

        public class a implements c.c.a.a.h {
            public a() {
            }

            @Override // c.c.a.a.h
            public void a(c.c.a.a.g gVar, List<Purchase> list) {
                if (gVar.b() == 0 && list != null) {
                    Iterator<Purchase> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Purchase next = it.next();
                        if (next.f().contains("com.nst.iptvsmarterstvbox.billing") && APPInPurchaseActivity.this.f25213i.k() != null && APPInPurchaseActivity.this.f25213i.n() != null && APPInPurchaseActivity.this.f25213i.l() == 0 && APPInPurchaseActivity.this.f25213i.k().equals(BuildConfig.FLAVOR) && APPInPurchaseActivity.this.f25213i.n().equals(BuildConfig.FLAVOR)) {
                            APPInPurchaseActivity.this.g();
                            String strA = next.a();
                            String strP = c.h.a.h.n.e.P(strA + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + c.h.a.f.b.f16735b + "-");
                            try {
                                APPInPurchaseActivity.this.t.obtainMessage(1, BuildConfig.FLAVOR).sendToTarget();
                            } catch (Exception unused) {
                            }
                            APPInPurchaseActivity.this.f25209e.d(strP, strA);
                            break;
                        }
                    }
                }
                Log.e("honey", "onQueryPurchasesResponse");
            }
        }

        public c() {
        }

        @Override // c.c.a.a.e
        public void a(c.c.a.a.g gVar) {
            if (gVar.b() == 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("com.nst.iptvsmarterstvbox.billing");
                APPInPurchaseActivity.this.r.g(c.c.a.a.j.c().c("inapp").b(arrayList).a(), APPInPurchaseActivity.this);
                APPInPurchaseActivity.this.r.f("inapp", new a());
            } else {
                APPInPurchaseActivity.this.f25208d = false;
                Button button = APPInPurchaseActivity.this.purchaseButton;
                if (button != null) {
                    button.setVisibility(8);
                }
                Button button2 = APPInPurchaseActivity.this.bt_pay_from_website_1;
                if (button2 != null) {
                    button2.setVisibility(0);
                }
            }
            Log.e("honey", "onBillingSetupFinished");
        }

        @Override // c.c.a.a.e
        public void b() {
            Log.e("honey", "onBillingServiceDisconnected");
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            APPInPurchaseActivity.f25206b.dismiss();
        }
    }

    public class e implements c.c.a.a.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean[] f25225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f25226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f25227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RegisterClientCallback f25228d;

        public e(boolean[] zArr, String[] strArr, String str, RegisterClientCallback registerClientCallback) {
            this.f25225a = zArr;
            this.f25226b = strArr;
            this.f25227c = str;
            this.f25228d = registerClientCallback;
        }

        @Override // c.c.a.a.h
        public void a(c.c.a.a.g gVar, List<Purchase> list) {
            if (gVar.b() == 0 && list != null) {
                Iterator<Purchase> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Purchase next = it.next();
                    if (next.f().contains("com.nst.iptvsmarterstvbox.billing")) {
                        this.f25225a[0] = true;
                        this.f25226b[0] = next.a();
                        break;
                    }
                }
            }
            if (this.f25225a[0]) {
                APPInPurchaseActivity.this.f25209e.e(APPInPurchaseActivity.this.f25214j, APPInPurchaseActivity.this.f25215k, APPInPurchaseActivity.this.f25211g, APPInPurchaseActivity.this.f25210f, this.f25227c, this.f25228d.a().a().intValue(), "true", this.f25226b[0]);
            } else {
                APPInPurchaseActivity.this.f25209e.e(APPInPurchaseActivity.this.f25214j, APPInPurchaseActivity.this.f25215k, APPInPurchaseActivity.this.f25211g, APPInPurchaseActivity.this.f25210f, this.f25227c, this.f25228d.a().a().intValue(), "false", BuildConfig.FLAVOR);
            }
            Log.e("honey", "onQueryPurchasesResponse");
        }
    }

    public class f extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LinearLayout f25232d;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25234b;

            public a(View view) {
                this.f25234b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                LinearLayout linearLayout;
                int i2;
                if (z) {
                    View view2 = this.f25234b;
                    if (view2 == null || view2.getTag() == null || !this.f25234b.getTag().equals("2")) {
                        return;
                    }
                    linearLayout = f.this.f25232d;
                    i2 = R.drawable.blue_btn_effect;
                } else {
                    View view3 = this.f25234b;
                    if (view3 == null || view3.getTag() == null || !this.f25234b.getTag().equals("2")) {
                        return;
                    }
                    linearLayout = f.this.f25232d;
                    i2 = R.drawable.black_button_dark;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public f(Activity activity) {
            super(activity);
            this.f25230b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() != R.id.btn_yes) {
                return;
            }
            try {
                dismiss();
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(APPInPurchaseActivity.this.f25213i.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_forgot_password_tv : R.layout.custom_forgot_password);
            this.f25231c = (TextView) findViewById(R.id.btn_yes);
            this.f25232d = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25231c.setOnClickListener(this);
            TextView textView = this.f25231c;
            textView.setOnFocusChangeListener(new a(textView));
        }
    }

    public class g extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LinearLayout f25238d;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25240b;

            public a(View view) {
                this.f25240b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                LinearLayout linearLayout;
                int i2;
                if (z) {
                    View view2 = this.f25240b;
                    if (view2 == null || view2.getTag() == null || !this.f25240b.getTag().equals("2")) {
                        return;
                    }
                    linearLayout = g.this.f25238d;
                    i2 = R.drawable.blue_btn_effect;
                } else {
                    View view3 = this.f25240b;
                    if (view3 == null || view3.getTag() == null || !this.f25240b.getTag().equals("2")) {
                        return;
                    }
                    linearLayout = g.this.f25238d;
                    i2 = R.drawable.black_button_dark;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public g(Activity activity) {
            super(activity);
            this.f25236b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() != R.id.btn_yes) {
                return;
            }
            try {
                dismiss();
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(APPInPurchaseActivity.this.f25213i.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_browser_not_supported_tv : R.layout.custom_browser_not_supported);
            this.f25237c = (TextView) findViewById(R.id.btn_yes);
            this.f25238d = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25237c.setOnClickListener(this);
            TextView textView = this.f25237c;
            textView.setOnFocusChangeListener(new a(textView));
        }
    }

    public class h extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<BillingDeviceInfo> f25242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f25243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Activity f25244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f25245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f25246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TextView f25247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f25248h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LinearLayout f25249i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public RecyclerView f25250j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public c.h.a.k.b.d f25251k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayoutManager f25252l;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25254b;

            public a(View view) {
                this.f25254b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25254b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25254b.getTag().equals("1")) {
                        View view3 = this.f25254b;
                        if (view3 == null || view3.getTag() == null || !this.f25254b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = h.this.f25249i;
                    }
                    linearLayout = h.this.f25248h;
                } else {
                    View view4 = this.f25254b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25254b.getTag().equals("1")) {
                        View view5 = this.f25254b;
                        if (view5 == null || view5.getTag() == null || !this.f25254b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = h.this.f25249i;
                    }
                    linearLayout = h.this.f25248h;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public h(Activity activity, List<BillingDeviceInfo> list, Context context) {
            super(activity);
            this.f25244d = activity;
            this.f25243c = context;
            this.f25242b = list;
            this.f25252l = new LinearLayoutManager(context);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            try {
                if (id != R.id.btn_activate) {
                    if (id != R.id.btn_close) {
                    } else {
                        dismiss();
                    }
                } else if (APPInPurchaseActivity.this.f25219o.equals(BuildConfig.FLAVOR) && APPInPurchaseActivity.this.f25218n.equals(BuildConfig.FLAVOR)) {
                    APPInPurchaseActivity.this.P("Please select any device to activate.");
                } else {
                    dismiss();
                    if (APPInPurchaseActivity.this.f25213i.k() != null && APPInPurchaseActivity.this.f25213i.n() != null && APPInPurchaseActivity.this.f25213i.l() != 0 && !APPInPurchaseActivity.this.f25213i.k().equals(BuildConfig.FLAVOR) && !APPInPurchaseActivity.this.f25213i.n().equals(BuildConfig.FLAVOR)) {
                        APPInPurchaseActivity.this.g();
                        APPInPurchaseActivity.this.f25209e.i(APPInPurchaseActivity.this.f25213i.k(), c.h.a.h.n.e.P(APPInPurchaseActivity.this.f25213i.k() + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + c.h.a.f.b.f16735b + "-"), APPInPurchaseActivity.this.f25213i.l(), APPInPurchaseActivity.this.f25218n, APPInPurchaseActivity.this.f25210f, APPInPurchaseActivity.this.f25211g);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(APPInPurchaseActivity.this.f25213i.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_list_devices_layout_tv : R.layout.custom_list_devices_layout);
            this.f25246f = (TextView) findViewById(R.id.btn_activate);
            this.f25247g = (TextView) findViewById(R.id.btn_close);
            this.f25248h = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f25249i = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25250j = (RecyclerView) findViewById(R.id.recycler_view_devices);
            TextView textView = (TextView) findViewById(R.id.tv_title);
            this.f25245e = textView;
            textView.setText("Devices List");
            this.f25245e.setTypeface(null, 1);
            c.h.a.k.b.d dVar = new c.h.a.k.b.d(this.f25243c, this.f25242b);
            this.f25251k = dVar;
            this.f25250j.setAdapter(dVar);
            this.f25250j.setLayoutManager(this.f25252l);
            this.f25246f.setOnClickListener(this);
            this.f25247g.setOnClickListener(this);
            TextView textView2 = this.f25246f;
            textView2.setOnFocusChangeListener(new a(textView2));
            TextView textView3 = this.f25247g;
            textView3.setOnFocusChangeListener(new a(textView3));
        }
    }

    public class i extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f25259e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f25260f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f25261g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f25262h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25264b;

            public a(View view) {
                this.f25264b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25264b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25264b.getTag().equals("1")) {
                        View view3 = this.f25264b;
                        if (view3 == null || view3.getTag() == null || !this.f25264b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = i.this.f25262h;
                    }
                    linearLayout = i.this.f25261g;
                } else {
                    View view4 = this.f25264b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25264b.getTag().equals("1")) {
                        View view5 = this.f25264b;
                        if (view5 == null || view5.getTag() == null || !this.f25264b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = i.this.f25262h;
                    }
                    linearLayout = i.this.f25261g;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public i(Activity activity) {
            super(activity);
            this.f25256b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            try {
                if (id == R.id.btn_no) {
                    dismiss();
                } else {
                    if (id != R.id.btn_yes) {
                        return;
                    }
                    dismiss();
                    APPInPurchaseActivity.this.f25213i.a();
                    APPInPurchaseActivity aPPInPurchaseActivity = APPInPurchaseActivity.this;
                    aPPInPurchaseActivity.P(aPPInPurchaseActivity.getResources().getString(R.string.logged_out));
                    APPInPurchaseActivity.this.F(false);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(APPInPurchaseActivity.this.f25213i.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_dashboard_not_downloaded_layout_tv : R.layout.custom_dashboard_not_downloaded_layout);
            this.f25257c = (TextView) findViewById(R.id.btn_yes);
            this.f25258d = (TextView) findViewById(R.id.btn_no);
            this.f25261g = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f25262h = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25260f = (TextView) findViewById(R.id.tv_title);
            this.f25259e = (TextView) findViewById(R.id.txt_dia);
            this.f25260f.setText("Logout?");
            this.f25260f.setTypeface(null, 1);
            this.f25259e.setText(APPInPurchaseActivity.this.getResources().getString(R.string.logout_message));
            this.f25261g.setVisibility(0);
            this.f25257c.setOnClickListener(this);
            this.f25258d.setOnClickListener(this);
            TextView textView = this.f25257c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f25258d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class j extends WebViewClient {
        public j() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (APPInPurchaseActivity.this.v == null || APPInPurchaseActivity.this.v.getVisibility() != 0) {
                return;
            }
            APPInPurchaseActivity.this.v.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            Log.e("honey", "shouldOverrideUrlLoading");
            if (APPInPurchaseActivity.this.v == null || APPInPurchaseActivity.this.v.getVisibility() != 8) {
                return true;
            }
            APPInPurchaseActivity.this.v.setVisibility(0);
            return true;
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25267b;

        public k(View view) {
            this.f25267b = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            View view2;
            View view3;
            int i2;
            if (z) {
                View view4 = this.f25267b;
                if (view4 == null || view4.getTag() == null || !this.f25267b.getTag().equals("2")) {
                    return;
                }
                view3 = this.f25267b;
                i2 = R.drawable.logout_btn_effect;
            } else {
                if (z || (view2 = this.f25267b) == null || view2.getTag() == null || !this.f25267b.getTag().equals("2")) {
                    return;
                }
                view3 = this.f25267b;
                i2 = R.drawable.black_button_dark;
            }
            view3.setBackgroundResource(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:4:0x0005, B:6:0x000e, B:8:0x001a, B:10:0x0020, B:12:0x0041, B:14:0x0047, B:16:0x0052, B:18:0x0062, B:19:0x0086, B:20:0x0091, B:21:0x0095, B:22:0x0099, B:23:0x009d, B:24:0x00a2, B:25:0x00a7, B:27:0x00ad, B:29:0x00b9, B:31:0x00bf, B:32:0x00c4, B:33:0x00c9), top: B:38:0x0005 }] */
    @Override // c.h.a.k.f.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E(com.nst.iptvsmarterstvbox.model.callback.BillingAddOrderCallback r4) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.APPInPurchaseActivity.E(com.nst.iptvsmarterstvbox.model.callback.BillingAddOrderCallback):void");
    }

    public final void F(boolean z) {
        LinearLayout linearLayout;
        TextView textView;
        Resources resources;
        int i2;
        if (this.f25213i.k() == null || this.f25213i.n() == null || this.f25213i.l() == 0 || this.f25213i.k().equals(BuildConfig.FLAVOR) || this.f25213i.n().equals(BuildConfig.FLAVOR)) {
            this.ll_buy_premium_version.setVisibility(8);
            this.ll_max_connection.setVisibility(8);
            this.ll_signup.setVisibility(8);
            this.ll_signup_website.setVisibility(8);
            this.ll_unlock_features.setVisibility(0);
            this.ll_thanks_for_purchasing.setVisibility(8);
            this.rl_id_logged_in.setVisibility(8);
            return;
        }
        this.tv_email_address_logged_in.setText(this.f25213i.k());
        this.rl_id_logged_in.setVisibility(0);
        this.ll_signin.setVisibility(8);
        this.ll_signup.setVisibility(8);
        this.ll_signup_website.setVisibility(8);
        this.ll_unlock_features.setVisibility(8);
        this.ll_buy_premium_version.setVisibility(8);
        if (this.f25213i.u().booleanValue()) {
            linearLayout = this.ll_max_connection;
        } else {
            this.ll_max_connection.setVisibility(8);
            if (this.f25213i.m() != null && this.f25213i.m().equals(Boolean.TRUE)) {
                this.ll_thanks_for_purchasing.setVisibility(0);
                if (z) {
                    textView = this.tv_app_purchased;
                    resources = getResources();
                    i2 = R.string.thank_you_sign_up;
                } else {
                    textView = this.tv_app_purchased;
                    resources = getResources();
                    i2 = R.string.thank_you_sign_in;
                }
                textView.setText(resources.getString(i2));
                return;
            }
            linearLayout = this.ll_buy_premium_version;
        }
        linearLayout.setVisibility(0);
        this.ll_thanks_for_purchasing.setVisibility(8);
    }

    public final boolean G() {
        String str;
        EditText editText = this.et_sign_in_email;
        if (editText == null || this.et_signin_password == null) {
            return false;
        }
        this.f25216l = editText.getText().toString().trim();
        this.f25217m = this.et_signin_password.getText().toString().trim();
        if (this.f25216l.length() == 0) {
            str = "Please enter your email.";
        } else {
            if (this.f25217m.length() != 0) {
                return true;
            }
            str = "Please enter your password.";
        }
        P(str);
        return false;
    }

    public final boolean I() {
        String str;
        EditText editText = this.et_signup_email;
        if (editText == null || this.et_signup_password == null || this.et_signup_confirm_password == null) {
            return false;
        }
        this.f25214j = editText.getText().toString().trim();
        this.f25215k = this.et_signup_password.getText().toString().trim();
        String strTrim = this.et_signup_confirm_password.getText().toString().trim();
        if (this.f25214j.length() == 0) {
            str = "Please enter any email.";
        } else if (this.f25215k.length() == 0) {
            str = "Please enter any password.";
        } else if (strTrim.length() == 0) {
            str = "Please enter confirm password.";
        } else {
            if (this.f25215k.equals(strTrim)) {
                return true;
            }
            str = "Please make sure your passwords match.";
        }
        P(str);
        return false;
    }

    public final void J() {
        this.ll_sign_up_link.setOnClickListener(this);
        this.bt_proceed.setOnClickListener(this);
        this.bt_cancel.setOnClickListener(this);
        this.ll_sign_in_link.setOnClickListener(this);
        this.ll_sign_in_link_1.setOnClickListener(this);
        this.ll_sign_in_link_2.setOnClickListener(this);
        this.bt_login.setOnClickListener(this);
        this.bt_sign_up.setOnClickListener(this);
        this.tv_logout.setOnClickListener(this);
        this.iv_back_button.setOnClickListener(this);
        this.bt_list_devices.setOnClickListener(this);
        this.bt_pay_from_website.setOnClickListener(this);
        this.bt_pay_from_website_1.setOnClickListener(this);
        this.ll_forgot_pass_link.setOnClickListener(this);
    }

    public final void L() {
        Button button = this.purchaseButton;
        button.setOnFocusChangeListener(new k(button));
        Button button2 = this.bt_pay_from_website_1;
        button2.setOnFocusChangeListener(new k(button2));
        Button button3 = this.bt_sign_up;
        button3.setOnFocusChangeListener(new k(button3));
        Button button4 = this.bt_login;
        button4.setOnFocusChangeListener(new k(button4));
        Button button5 = this.bt_list_devices;
        button5.setOnFocusChangeListener(new k(button5));
        Button button6 = this.bt_pay_from_website;
        button6.setOnFocusChangeListener(new k(button6));
        LinearLayout linearLayout = this.ll_forgot_pass_link;
        linearLayout.setOnFocusChangeListener(new k(linearLayout));
        Button button7 = this.bt_proceed;
        button7.setOnFocusChangeListener(new k(button7));
        Button button8 = this.bt_cancel;
        button8.setOnFocusChangeListener(new k(button8));
    }

    public final void M() {
        try {
            c.c.a.a.c cVar = this.r;
            if (cVar == null || this.s == null) {
                return;
            }
            cVar.d(this, c.c.a.a.f.b().b(this.s).a());
        } catch (Exception unused) {
        }
    }

    public void N(String str, String str2) {
        this.f25219o = str;
        this.f25218n = str2;
    }

    public final void O() {
        c.h.a.k.d.a.a aVar = this.f25213i;
        if (aVar == null || aVar.k() == null || this.f25213i.n() == null || this.f25213i.l() == 0 || this.f25213i.k().equals(BuildConfig.FLAVOR) || this.f25213i.n().equals(BuildConfig.FLAVOR)) {
            return;
        }
        g();
        this.f25209e.f(this.f25213i.k(), this.f25213i.n(), c.h.a.h.n.e.P(this.f25213i.k() + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + c.h.a.f.b.f16735b + "-"), this.f25213i.l());
    }

    public final void P(String str) {
        Toast.makeText(this, str, 0).show();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void Q() {
        if (this.f25207c != null) {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.webview_popup, (RelativeLayout) findViewById(R.id.rl_password_verification));
            PopupWindow popupWindow = new PopupWindow(this);
            f25206b = popupWindow;
            popupWindow.setContentView(viewInflate);
            f25206b.setWidth(-1);
            f25206b.setHeight(-1);
            f25206b.setFocusable(true);
            f25206b.showAtLocation(viewInflate, 17, 0, 0);
            WebView webView = (WebView) viewInflate.findViewById(R.id.webview);
            this.v = (ProgressBar) viewInflate.findViewById(R.id.prg);
            Button button = (Button) viewInflate.findViewById(R.id.close_webview);
            this.v.setVisibility(0);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new j());
            webView.loadUrl("https://users.iptvsmarters.com/cart.php?a=add&pid=1");
            if (button != null) {
                button.setOnFocusChangeListener(new e.j(button, this));
            }
            button.setOnClickListener(new d());
        }
    }

    @Override // c.h.a.k.f.d
    public void S(RegisterClientCallback registerClientCallback) {
        Resources resources;
        String strB;
        c.h.a.h.n.e.I();
        if (registerClientCallback != null) {
            try {
                if (registerClientCallback.c() == null || !registerClientCallback.c().equals("success")) {
                    if (registerClientCallback.c() == null || !registerClientCallback.c().equals("error") || registerClientCallback.b() == null) {
                        resources = getResources();
                    } else {
                        strB = registerClientCallback.b();
                        P(strB);
                    }
                } else if (registerClientCallback.d() != null) {
                    if (!registerClientCallback.d().equalsIgnoreCase(c.h.a.h.n.e.P("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + c.h.a.f.b.f16735b)) || registerClientCallback.a() == null) {
                        resources = getResources();
                    } else {
                        this.f25213i.O(this.f25214j, this.f25215k, registerClientCallback.a().a().intValue());
                        P(getResources().getString(R.string.account_created));
                        if (this.f25214j != null && this.f25215k != null && registerClientCallback.a().a().intValue() != 0 && !this.f25214j.equals(BuildConfig.FLAVOR) && !this.f25215k.equals(BuildConfig.FLAVOR)) {
                            g();
                            String strP = c.h.a.h.n.e.P(this.f25214j + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + c.h.a.f.b.f16735b + "-");
                            this.f25213i.Q(Boolean.FALSE);
                            this.r.f("inapp", new e(new boolean[]{false}, new String[]{BuildConfig.FLAVOR}, strP, registerClientCallback));
                        }
                        F(false);
                    }
                } else {
                    resources = getResources();
                }
                strB = resources.getString(R.string.something_wrong);
                P(strB);
            } catch (Exception unused) {
            }
        }
        Log.e("honey", "registerClientResponse:");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:4:0x0005, B:6:0x000e, B:8:0x001a, B:10:0x0020, B:12:0x0041, B:14:0x0047, B:16:0x0052, B:18:0x0062, B:24:0x00a0, B:19:0x0082, B:21:0x008f, B:22:0x0093, B:23:0x0097, B:25:0x00a4, B:26:0x00a8, B:27:0x00ac, B:28:0x00b0, B:29:0x00b5, B:30:0x00ba, B:32:0x00c0, B:34:0x00cc, B:36:0x00d2, B:37:0x00d7, B:38:0x00dc), top: B:43:0x0005 }] */
    @Override // c.h.a.k.f.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V(com.nst.iptvsmarterstvbox.model.callback.BillingIsPurchasedCallback r5) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.APPInPurchaseActivity.V(com.nst.iptvsmarterstvbox.model.callback.BillingIsPurchasedCallback):void");
    }

    @Override // c.h.a.k.f.c
    public void a() {
        c.h.a.h.n.e.i0(this);
    }

    @Override // c.h.a.k.f.c
    public void c(String str) {
        c.h.a.h.n.e.I();
        P(str);
    }

    @Override // c.h.a.k.f.d
    public void d(BillingGetDevicesCallback billingGetDevicesCallback) {
        Resources resources;
        String strB;
        c.h.a.h.n.e.I();
        if (billingGetDevicesCallback != null) {
            try {
                if (billingGetDevicesCallback.c() != null && billingGetDevicesCallback.c().equals("success")) {
                    if (billingGetDevicesCallback.d() != null) {
                        if (!billingGetDevicesCallback.d().equalsIgnoreCase(c.h.a.h.n.e.P("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + c.h.a.f.b.f16735b))) {
                            resources = getResources();
                        } else if (billingGetDevicesCallback.a() == null || billingGetDevicesCallback.a().a() == null) {
                            strB = "No Device Found";
                            P(strB);
                        } else {
                            this.f25219o = BuildConfig.FLAVOR;
                            this.f25218n = BuildConfig.FLAVOR;
                            new h(this, billingGetDevicesCallback.a().a(), this.f25207c).show();
                        }
                    } else {
                        resources = getResources();
                    }
                    strB = resources.getString(R.string.something_wrong);
                    P(strB);
                } else if (billingGetDevicesCallback.c() == null || !billingGetDevicesCallback.c().equals("error") || billingGetDevicesCallback.b() == null) {
                    resources = getResources();
                    strB = resources.getString(R.string.something_wrong);
                    P(strB);
                } else {
                    strB = billingGetDevicesCallback.b();
                    P(strB);
                }
            } catch (Exception unused) {
            }
        }
        Log.e("honey", "BillingGetDevicesCallback:");
    }

    @Override // c.c.a.a.k
    public void e(c.c.a.a.g gVar, List<SkuDetails> list) {
        StringBuilder sb;
        String string;
        Log.e("honey", "onSkuDetailsResponse");
        int iB = gVar.b();
        String strA = gVar.a();
        switch (iB) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.f25208d = false;
                sb = new StringBuilder();
                break;
            case 0:
                this.f25208d = true;
                Log.i("honey", "onSkuDetailsResponse: " + iB + " " + strA);
                if (list == null || list.isEmpty()) {
                    string = "onSkuDetailsResponse: Found null or empty SkuDetails. Check to see if the SKUs you requested are correctly published in the Google Play Console.";
                    Log.e("honey", string);
                }
                SkuDetails skuDetails = list.get(0);
                this.s = skuDetails;
                if (skuDetails != null) {
                    try {
                        this.p = skuDetails.b();
                        this.q = this.s.c();
                        TextView textView = this.tv_price_currency;
                        if (textView != null) {
                            textView.setText("One-time payment " + this.p + " " + this.q);
                        }
                        TextView textView2 = this.tv_price_currency_1;
                        if (textView2 != null) {
                            textView2.setText("One-time payment " + this.p + " " + this.q);
                        }
                        TextView textView3 = this.tv_price_currency_2;
                        if (textView3 != null) {
                            textView3.setText("One-time payment " + this.p + " " + this.q);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                this.f25208d = false;
                sb = new StringBuilder();
                break;
            default:
                sb = new StringBuilder();
                break;
        }
        sb.append("onSkuDetailsResponse: ");
        sb.append(iB);
        sb.append(" ");
        sb.append(strA);
        string = sb.toString();
        Log.e("honey", string);
    }

    @Override // c.h.a.k.f.d
    public void e0(BillingLoginClientCallback billingLoginClientCallback) {
        Resources resources;
        String strB;
        c.h.a.h.n.e.I();
        if (billingLoginClientCallback != null) {
            try {
                if (billingLoginClientCallback.c() == null || !billingLoginClientCallback.c().equals("success")) {
                    if (billingLoginClientCallback.c() == null || !billingLoginClientCallback.c().equals("error") || billingLoginClientCallback.b() == null) {
                        resources = getResources();
                    } else {
                        strB = billingLoginClientCallback.b();
                        P(strB);
                    }
                } else if (billingLoginClientCallback.d() != null) {
                    if (!billingLoginClientCallback.d().equalsIgnoreCase(c.h.a.h.n.e.P("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + c.h.a.f.b.f16735b)) || billingLoginClientCallback.a() == null) {
                        resources = getResources();
                    } else {
                        this.f25213i.O(this.f25216l, this.f25217m, billingLoginClientCallback.a().a().intValue());
                        if (billingLoginClientCallback.b() == null || billingLoginClientCallback.b().equals("Max Connection Reached")) {
                            this.f25213i.Q(Boolean.FALSE);
                            this.f25213i.T(Boolean.TRUE);
                        } else {
                            g();
                            String strP = c.h.a.h.n.e.P(this.f25216l + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + c.h.a.f.b.f16735b + "-");
                            this.f25213i.Q(Boolean.FALSE);
                            this.f25209e.e(this.f25216l, this.f25217m, this.f25211g, this.f25210f, strP, billingLoginClientCallback.a().a().intValue(), "false", BuildConfig.FLAVOR);
                        }
                        P(getResources().getString(R.string.logged_in));
                        F(false);
                    }
                } else {
                    resources = getResources();
                }
                strB = resources.getString(R.string.something_wrong);
                P(strB);
            } catch (Exception unused) {
            }
        }
        Log.e("honey", "loginClientResponse:");
    }

    @Override // c.c.a.a.i
    public void f(c.c.a.a.g gVar, List<Purchase> list) {
        if (gVar.b() == 0 && list != null) {
            Iterator<Purchase> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Purchase next = it.next();
                if (next.c() == 1) {
                    String strA = next.a();
                    if (next.f().contains("com.nst.iptvsmarterstvbox.billing")) {
                        this.f25213i.Q(Boolean.FALSE);
                        if (this.f25213i.k() != null && this.f25213i.n() != null && this.f25213i.l() != 0 && !this.f25213i.k().equals(BuildConfig.FLAVOR) && !this.f25213i.n().equals(BuildConfig.FLAVOR)) {
                            g();
                            this.f25209e.c(this.f25213i.k(), this.f25213i.n(), this.f25211g, this.f25210f, c.h.a.h.n.e.P(this.f25213i.k() + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + c.h.a.f.b.f16735b + "-"), this.f25213i.l(), "true", strA, "new");
                        }
                    }
                    Log.e("honey", "purchased");
                    if (!next.g()) {
                        this.r.a(c.c.a.a.a.b().b(next.d()).a(), this.u);
                    }
                }
            }
        }
        Log.e("honey", "onPurchasesUpdated");
    }

    public void g() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f25212h = iNextInt;
        c.h.a.f.b.f16735b = String.valueOf(iNextInt);
    }

    @Override // c.h.a.k.f.d
    public void g0(BillingUpdateDevicesCallback billingUpdateDevicesCallback) {
        Resources resources;
        String strA;
        c.h.a.h.n.e.I();
        if (billingUpdateDevicesCallback != null) {
            try {
                if (billingUpdateDevicesCallback.b() != null && billingUpdateDevicesCallback.b().equals("success")) {
                    c.h.a.k.d.a.a aVar = this.f25213i;
                    Boolean bool = Boolean.FALSE;
                    aVar.T(bool);
                    if (billingUpdateDevicesCallback.c() != null) {
                        if (billingUpdateDevicesCallback.c().equalsIgnoreCase(c.h.a.h.n.e.P("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + c.h.a.f.b.f16735b))) {
                            if (this.f25213i.k() != null && this.f25213i.n() != null && this.f25213i.l() != 0 && !this.f25213i.k().equals(BuildConfig.FLAVOR) && !this.f25213i.n().equals(BuildConfig.FLAVOR)) {
                                g();
                                String strP = c.h.a.h.n.e.P(this.f25213i.k() + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + c.h.a.f.b.f16735b + "-");
                                this.f25213i.Q(bool);
                                this.f25209e.e(this.f25213i.k(), this.f25213i.n(), this.f25211g, this.f25210f, strP, this.f25213i.l(), "false", BuildConfig.FLAVOR);
                            }
                            F(false);
                        } else {
                            resources = getResources();
                        }
                    } else {
                        resources = getResources();
                    }
                } else if (billingUpdateDevicesCallback.b() == null || !billingUpdateDevicesCallback.b().equals("error") || billingUpdateDevicesCallback.a() == null) {
                    resources = getResources();
                } else {
                    strA = billingUpdateDevicesCallback.a();
                    P(strA);
                }
                strA = resources.getString(R.string.something_wrong);
                P(strA);
            } catch (Exception unused) {
            }
        }
        Log.e("honey", "BillingUpdateDevicesCallback:");
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Dialog fVar;
        EditText editText;
        EditText editText2;
        int id = view.getId();
        switch (id) {
            case R.id.bt_cancel /* 2131427600 */:
            case R.id.iv_back_button /* 2131428111 */:
                onBackPressed();
                return;
            case R.id.bt_sign_up /* 2131427624 */:
                if (!I() || (editText = this.et_signup_email) == null || this.et_signup_password == null) {
                    return;
                }
                this.f25214j = editText.getText().toString().trim();
                this.f25215k = this.et_signup_password.getText().toString().trim();
                g();
                this.f25209e.h(this.f25214j, this.f25215k, this.f25211g, this.f25210f, c.h.a.h.n.e.P(this.f25214j + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + c.h.a.f.b.f16735b + "-"));
                return;
            case R.id.ll_forgot_pass_link /* 2131428372 */:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse("https://users.iptvsmarters.com/password/reset"));
                    startActivity(intent);
                    return;
                } catch (Exception unused) {
                    fVar = new f(this);
                }
                break;
            case R.id.tv_logout /* 2131429433 */:
                fVar = new i(this);
                break;
            default:
                switch (id) {
                    case R.id.bt_list_devices /* 2131427609 */:
                        O();
                        return;
                    case R.id.bt_login /* 2131427610 */:
                        if (!G() || (editText2 = this.et_sign_in_email) == null || this.et_signin_password == null) {
                            return;
                        }
                        this.f25216l = editText2.getText().toString().trim();
                        this.f25217m = this.et_signin_password.getText().toString().trim();
                        g();
                        this.f25209e.g(this.f25216l, this.f25217m, this.f25211g, this.f25210f, c.h.a.h.n.e.P(this.f25216l + "*Njh0&$@ZH098GP-Vu6HilnbLo63-" + c.h.a.f.b.f16735b + "-"));
                        return;
                    case R.id.bt_pay_from_website /* 2131427611 */:
                    case R.id.bt_pay_from_website_1 /* 2131427612 */:
                        try {
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(Uri.parse("https://users.iptvsmarters.com/cart.php?a=add&pid=1&currency=2"));
                            startActivity(intent2);
                            return;
                        } catch (Exception unused2) {
                            fVar = new g(this);
                        }
                        break;
                    case R.id.bt_proceed /* 2131427613 */:
                        this.ll_unlock_features.setVisibility(8);
                        this.ll_signin.setVisibility(0);
                        this.ll_signup.setVisibility(8);
                        this.ll_signup_website.setVisibility(8);
                        return;
                    default:
                        switch (id) {
                            case R.id.ll_sign_in_link /* 2131428472 */:
                            case R.id.ll_sign_in_link_1 /* 2131428473 */:
                            case R.id.ll_sign_in_link_2 /* 2131428474 */:
                                this.ll_unlock_features.setVisibility(8);
                                this.ll_signup.setVisibility(8);
                                this.ll_signup_website.setVisibility(8);
                                this.ll_signin.setVisibility(0);
                                break;
                            case R.id.ll_sign_up_link /* 2131428475 */:
                                Q();
                                break;
                        }
                        return;
                }
                break;
        }
        fVar.show();
    }

    public void onClickButton(View view) {
        if (!this.f25208d) {
            P("You can purchase it from your mobile and then logged in with that details here.");
        } else {
            if (view.getId() != R.id.purchaseButton) {
                return;
            }
            M();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25207c = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25207c);
        this.f25213i = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_app_in_purchase_tv : R.layout.activity_app_in_purchase);
        ButterKnife.a(this);
        this.f25210f = c.h.a.h.n.e.v(this.f25207c);
        this.f25211g = c.h.a.h.n.e.s();
        try {
            this.t = new a(Looper.getMainLooper());
        } catch (Exception unused) {
        }
        this.u = new b();
        c.c.a.a.c cVarA = c.c.a.a.c.e(this.f25207c).b().c(this).a();
        this.r = cVarA;
        cVarA.h(new c());
        this.f25209e = new c.h.a.j.b(this.f25207c, this);
        F(false);
        J();
        L();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        c.c.a.a.c cVar = this.r;
        if (cVar != null && cVar.c()) {
            this.r.b();
            this.r = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // c.h.a.k.f.d
    public void z(BillingCheckGPACallback billingCheckGPACallback) {
        Resources resources;
        c.h.a.h.n.e.I();
        if (billingCheckGPACallback != null) {
            try {
                if (billingCheckGPACallback.c() != null && billingCheckGPACallback.c().equals("success")) {
                    if (billingCheckGPACallback.d() != null) {
                        if (!billingCheckGPACallback.d().equalsIgnoreCase(c.h.a.h.n.e.P("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + c.h.a.f.b.f16735b)) || billingCheckGPACallback.a() == null || billingCheckGPACallback.a().a() == null) {
                            resources = getResources();
                        } else {
                            this.ll_unlock_features.setVisibility(8);
                            this.ll_signup.setVisibility(8);
                            this.ll_signup_website.setVisibility(8);
                            this.ll_signin.setVisibility(0);
                        }
                    } else {
                        resources = getResources();
                    }
                    P(resources.getString(R.string.something_wrong));
                } else if (billingCheckGPACallback.c() == null || !billingCheckGPACallback.c().equals("error") || billingCheckGPACallback.b() == null || !billingCheckGPACallback.b().equals("Order ID Not Found")) {
                    resources = getResources();
                    P(resources.getString(R.string.something_wrong));
                } else {
                    this.ll_unlock_features.setVisibility(8);
                    (!this.f25208d ? this.ll_signup_website : this.ll_signup).setVisibility(0);
                    this.ll_signin.setVisibility(8);
                    this.ll_gpa_found_not_registered.setVisibility(0);
                    this.ll_gpa_found_registered.setVisibility(8);
                }
            } catch (Exception unused) {
            }
        }
        Log.e("honey", "BillingClearDevicesCallback:");
    }
}
