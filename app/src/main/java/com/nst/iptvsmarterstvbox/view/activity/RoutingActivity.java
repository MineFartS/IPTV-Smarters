package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.d;
import c.h.a.h.n.e;
import c.h.a.i.q.m;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.R;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class RoutingActivity extends a.b.k.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c.h.a.k.d.a.a f26189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f26190e = this;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Dialog f26191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f26193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f26194i;

    @BindView
    public ImageView iv_list_users;

    @BindView
    public ImageView iv_list_users_arrow;

    @BindView
    public ImageView iv_login_with_m3u;

    @BindView
    public ImageView iv_login_with_m3u_arrow;

    @BindView
    public ImageView iv_login_with_xtream_codes_api;

    @BindView
    public ImageView iv_login_with_xtream_codes_api_arrow;

    @BindView
    public ImageView iv_play_from_device;

    @BindView
    public ImageView iv_play_from_device_arrow;

    @BindView
    public ImageView iv_play_single_stream;

    @BindView
    public ImageView iv_play_single_stream_arrow;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RelativeLayout f26195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f26196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a.b.k.b f26197l;

    @BindView
    public RelativeLayout rl_list_users;

    @BindView
    public RelativeLayout rl_login_with_m3u;

    @BindView
    public RelativeLayout rl_login_with_xtream_codes_api;

    @BindView
    public RelativeLayout rl_play_from_device;

    @BindView
    public RelativeLayout rl_play_single_stream;

    @BindView
    public TextView tv_link2;

    @BindView
    public TextView tv_list_users;

    @BindView
    public TextView tv_login_with_m3u;

    @BindView
    public TextView tv_login_with_xtream_codes_api;

    @BindView
    public TextView tv_play_from_device;

    @BindView
    public TextView tv_play_single_stream;

    public class a implements TextView.OnEditorActionListener {
        public a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (i2 != 6) {
                return false;
            }
            ((InputMethodManager) textView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            return true;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://www.iptvsmarters.com/terms-and-conditions/"));
                RoutingActivity.this.startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(RoutingActivity.this.getApplicationContext(), "Your Device Not Supported !!", 1).show();
            }
        }
    }

    public class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            RoutingActivity.this.f26193h.setVisibility(0);
            RoutingActivity.this.f26194i.setVisibility(0);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"ApplySharedPref"})
        public void onClick(View view) {
            RoutingActivity.this.getSharedPreferences("Accept_clicked", 0).edit().putString("Accept_clicked", "true").apply();
            RoutingActivity.this.f26191f.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        @SuppressLint({"ApplySharedPref"})
        public void onClick(View view) {
            RoutingActivity.this.finishAffinity();
        }
    }

    public class f implements DialogInterface.OnDismissListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class g implements d.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f26204a;

        public g(String[] strArr) {
            this.f26204a = strArr;
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", RoutingActivity.this.getPackageName(), null));
                RoutingActivity.this.startActivityForResult(intent, 101);
                Toast.makeText(RoutingActivity.this.f26190e, RoutingActivity.this.f26190e.getResources().getString(R.string.grant_the_permission), 1).show();
            } catch (Exception unused) {
            }
            RoutingActivity.this.f26197l.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RoutingActivity.this.f26197l.dismiss();
        }
    }

    public class j implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditText f26208b;

        public j(EditText editText) {
            this.f26208b = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context applicationContext;
            Resources resources;
            int i2;
            Intent intent;
            String strTrim = this.f26208b.getText().toString().trim();
            String strSubstring = strTrim.substring(strTrim.lastIndexOf("/") + 1);
            if (TextUtils.isEmpty(strTrim)) {
                applicationContext = RoutingActivity.this.getApplicationContext();
                resources = RoutingActivity.this.getResources();
                i2 = R.string.please_enter_url;
            } else if (!strTrim.contains(ClientConstants.DOMAIN_SCHEME) && (!strTrim.contains("http") || !strTrim.contains("//") || !strTrim.contains(InstructionFileId.DOT) || !strTrim.contains("/") || !strTrim.contains(":") || !strSubstring.contains(InstructionFileId.DOT))) {
                applicationContext = RoutingActivity.this.getApplicationContext();
                resources = RoutingActivity.this.getResources();
                i2 = R.string.please_enter_correct_url_format;
            } else {
                if (!strTrim.endsWith(".com") && (strTrim.startsWith(ClientConstants.DOMAIN_SCHEME) || strTrim.startsWith("http"))) {
                    if (RoutingActivity.this.f26190e != null) {
                        c.h.a.k.d.a.a unused = RoutingActivity.f26189d = new c.h.a.k.d.a.a(RoutingActivity.this.f26190e);
                        if (RoutingActivity.f26189d.x() == 3) {
                            RoutingActivity.f26189d.U(RoutingActivity.this.f26190e.getResources().getString(R.string.hardware_decoder));
                            intent = new Intent(RoutingActivity.this.f26190e, (Class<?>) HoneyPlayer.class);
                        } else {
                            intent = new Intent(RoutingActivity.this.f26190e, (Class<?>) HoneyPlayer.class);
                        }
                        intent.putExtra("type", "loadurl");
                        intent.putExtra("VIDEO_NUM", 0);
                        intent.putExtra("VIDEO_PATH", strTrim);
                        RoutingActivity.this.f26190e.startActivity(intent);
                        return;
                    }
                    return;
                }
                applicationContext = RoutingActivity.this.getApplicationContext();
                resources = RoutingActivity.this.getResources();
                i2 = R.string.can_not_play;
            }
            Toast.makeText(applicationContext, resources.getString(i2), 1).show();
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26210b;

        public k(View view) {
            this.f26210b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26210b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26210b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26210b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            RelativeLayout relativeLayout;
            ImageView imageView;
            RelativeLayout relativeLayout2;
            ImageView imageView2;
            if (z) {
                try {
                    View view2 = this.f26210b;
                    if (view2 == null || view2.getTag() == null || !this.f26210b.getTag().equals("rl_login_with_m3u")) {
                        View view3 = this.f26210b;
                        if (view3 == null || view3.getTag() == null || !this.f26210b.getTag().equals("rl_login_with_xtream_codes_api")) {
                            View view4 = this.f26210b;
                            if (view4 == null || view4.getTag() == null || !this.f26210b.getTag().equals("rl_play_from_device")) {
                                View view5 = this.f26210b;
                                if (view5 == null || view5.getTag() == null || !this.f26210b.getTag().equals("rl_play_single_stream")) {
                                    View view6 = this.f26210b;
                                    if (view6 == null || view6.getTag() == null || !this.f26210b.getTag().equals("rl_list_users")) {
                                        View view7 = this.f26210b;
                                        if (view7 == null || view7.getTag() == null || !this.f26210b.getTag().equals("rl_accept")) {
                                            View view8 = this.f26210b;
                                            if (view8 == null || view8.getTag() == null || !this.f26210b.getTag().equals("rl_cancel")) {
                                                View view9 = this.f26210b;
                                                if (view9 == null || view9.getTag() == null || !this.f26210b.getTag().equals("rl_play")) {
                                                    return;
                                                }
                                                RoutingActivity.this.f26195j.setBackgroundResource(R.drawable.login_btn_focused);
                                                RoutingActivity.this.f26196k.setTextColor(RoutingActivity.this.f26190e.getResources().getColor(R.color.white));
                                                return;
                                            }
                                            relativeLayout = RoutingActivity.this.f26194i;
                                        } else {
                                            relativeLayout = RoutingActivity.this.f26193h;
                                        }
                                        relativeLayout.setBackgroundResource(R.drawable.box_focused);
                                        return;
                                    }
                                    RoutingActivity.this.rl_list_users.setBackgroundResource(R.drawable.box_focused);
                                    RoutingActivity.this.iv_list_users.setImageResource(R.drawable.login_icon2_focused);
                                    RoutingActivity routingActivity = RoutingActivity.this;
                                    routingActivity.tv_list_users.setTextColor(routingActivity.f26190e.getResources().getColor(R.color.white));
                                    imageView = RoutingActivity.this.iv_list_users_arrow;
                                } else {
                                    RoutingActivity.this.rl_play_single_stream.setBackgroundResource(R.drawable.box_focused);
                                    RoutingActivity.this.iv_play_single_stream.setImageResource(R.drawable.icon4_focused);
                                    RoutingActivity routingActivity2 = RoutingActivity.this;
                                    routingActivity2.tv_play_single_stream.setTextColor(routingActivity2.f26190e.getResources().getColor(R.color.white));
                                    imageView = RoutingActivity.this.iv_play_single_stream_arrow;
                                }
                            } else {
                                RoutingActivity.this.rl_play_from_device.setBackgroundResource(R.drawable.box_focused);
                                RoutingActivity.this.iv_play_from_device.setImageResource(R.drawable.icon2_focused);
                                RoutingActivity routingActivity3 = RoutingActivity.this;
                                routingActivity3.tv_play_from_device.setTextColor(routingActivity3.f26190e.getResources().getColor(R.color.white));
                                imageView = RoutingActivity.this.iv_play_from_device_arrow;
                            }
                        } else {
                            RoutingActivity.this.rl_login_with_xtream_codes_api.setBackgroundResource(R.drawable.box_focused);
                            RoutingActivity.this.iv_login_with_xtream_codes_api.setImageResource(R.drawable.icon3_focused);
                            RoutingActivity routingActivity4 = RoutingActivity.this;
                            routingActivity4.tv_login_with_xtream_codes_api.setTextColor(routingActivity4.f26190e.getResources().getColor(R.color.white));
                            imageView = RoutingActivity.this.iv_login_with_xtream_codes_api_arrow;
                        }
                    } else {
                        RoutingActivity.this.rl_login_with_m3u.setBackgroundResource(R.drawable.box_focused);
                        RoutingActivity.this.iv_login_with_m3u.setImageResource(R.drawable.icon1_focused);
                        RoutingActivity routingActivity5 = RoutingActivity.this;
                        routingActivity5.tv_login_with_m3u.setTextColor(routingActivity5.f26190e.getResources().getColor(R.color.white));
                        imageView = RoutingActivity.this.iv_login_with_m3u_arrow;
                    }
                    imageView.setImageResource(R.drawable.white_arrow_right);
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            if (z) {
                return;
            }
            float f2 = z ? 1.09f : 1.0f;
            b(f2);
            c(f2);
            a(z);
            View view10 = this.f26210b;
            if (view10 == null || view10.getTag() == null || !this.f26210b.getTag().equals("rl_login_with_m3u")) {
                View view11 = this.f26210b;
                if (view11 == null || view11.getTag() == null || !this.f26210b.getTag().equals("rl_login_with_xtream_codes_api")) {
                    View view12 = this.f26210b;
                    if (view12 == null || view12.getTag() == null || !this.f26210b.getTag().equals("rl_play_from_device")) {
                        View view13 = this.f26210b;
                        if (view13 == null || view13.getTag() == null || !this.f26210b.getTag().equals("rl_play_single_stream")) {
                            View view14 = this.f26210b;
                            if (view14 == null || view14.getTag() == null || !this.f26210b.getTag().equals("rl_list_users")) {
                                View view15 = this.f26210b;
                                if (view15 == null || view15.getTag() == null || !this.f26210b.getTag().equals("rl_accept")) {
                                    View view16 = this.f26210b;
                                    if (view16 == null || view16.getTag() == null || !this.f26210b.getTag().equals("rl_cancel")) {
                                        View view17 = this.f26210b;
                                        if (view17 == null || view17.getTag() == null || !this.f26210b.getTag().equals("rl_play")) {
                                            return;
                                        }
                                        RoutingActivity.this.f26195j.setBackgroundResource(R.drawable.login_btn_unfocused);
                                        RoutingActivity.this.f26196k.setTextColor(RoutingActivity.this.f26190e.getResources().getColor(R.color.black));
                                        return;
                                    }
                                    relativeLayout2 = RoutingActivity.this.f26194i;
                                } else {
                                    relativeLayout2 = RoutingActivity.this.f26193h;
                                }
                                relativeLayout2.setBackgroundResource(R.drawable.black_button_dark);
                                return;
                            }
                            RoutingActivity.this.rl_list_users.setBackgroundResource(R.drawable.box_unfocused);
                            RoutingActivity.this.iv_list_users.setImageResource(R.drawable.login_icon2_unfocused);
                            RoutingActivity routingActivity6 = RoutingActivity.this;
                            routingActivity6.tv_list_users.setTextColor(routingActivity6.f26190e.getResources().getColor(R.color.black));
                            imageView2 = RoutingActivity.this.iv_list_users_arrow;
                        } else {
                            RoutingActivity.this.rl_play_single_stream.setBackgroundResource(R.drawable.box_unfocused);
                            RoutingActivity.this.iv_play_single_stream.setImageResource(R.drawable.icon4_unfocused);
                            RoutingActivity routingActivity7 = RoutingActivity.this;
                            routingActivity7.tv_play_single_stream.setTextColor(routingActivity7.f26190e.getResources().getColor(R.color.black));
                            imageView2 = RoutingActivity.this.iv_play_single_stream_arrow;
                        }
                    } else {
                        RoutingActivity.this.rl_play_from_device.setBackgroundResource(R.drawable.box_unfocused);
                        RoutingActivity.this.iv_play_from_device.setImageResource(R.drawable.icon2_unfocused);
                        RoutingActivity routingActivity8 = RoutingActivity.this;
                        routingActivity8.tv_play_from_device.setTextColor(routingActivity8.f26190e.getResources().getColor(R.color.black));
                        imageView2 = RoutingActivity.this.iv_play_from_device_arrow;
                    }
                } else {
                    RoutingActivity.this.rl_login_with_xtream_codes_api.setBackgroundResource(R.drawable.box_unfocused);
                    RoutingActivity.this.iv_login_with_xtream_codes_api.setImageResource(R.drawable.icon3_unfocused);
                    RoutingActivity routingActivity9 = RoutingActivity.this;
                    routingActivity9.tv_login_with_xtream_codes_api.setTextColor(routingActivity9.f26190e.getResources().getColor(R.color.black));
                    imageView2 = RoutingActivity.this.iv_login_with_xtream_codes_api_arrow;
                }
            } else {
                RoutingActivity.this.rl_login_with_m3u.setBackgroundResource(R.drawable.box_unfocused);
                RoutingActivity.this.iv_login_with_m3u.setImageResource(R.drawable.icon1_unfocused);
                RoutingActivity routingActivity10 = RoutingActivity.this;
                routingActivity10.tv_login_with_m3u.setTextColor(routingActivity10.f26190e.getResources().getColor(R.color.black));
                imageView2 = RoutingActivity.this.iv_login_with_m3u_arrow;
            }
            imageView2.setImageResource(R.drawable.black_arrow_right);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void H0() {
        Dialog dialog;
        int i2;
        this.f26191f = new Dialog(this, android.R.style.Theme.Translucent.NoTitleBar);
        if (f26189d.A().equals(c.h.a.h.n.a.s0)) {
            dialog = this.f26191f;
            i2 = R.layout.activity_terms_condition_page_tv;
        } else {
            dialog = this.f26191f;
            i2 = R.layout.activity_terms_condition_page;
        }
        dialog.setContentView(i2);
        this.f26191f.setCancelable(false);
        Window window = this.f26191f.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        window.setAttributes(attributes);
        this.f26191f.getWindow().setLayout(-1, -1);
        this.f26191f.show();
        this.f26191f.setCanceledOnTouchOutside(false);
        this.f26193h = (RelativeLayout) this.f26191f.findViewById(R.id.rl_accept);
        this.f26194i = (RelativeLayout) this.f26191f.findViewById(R.id.rl_cancel);
        RelativeLayout relativeLayout = this.f26193h;
        relativeLayout.setOnFocusChangeListener(new k(relativeLayout));
        RelativeLayout relativeLayout2 = this.f26194i;
        relativeLayout2.setOnFocusChangeListener(new k(relativeLayout2));
        WebView webView = (WebView) this.f26191f.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/terms.html");
        webView.setWebViewClient(new c());
        this.f26193h.setOnClickListener(new d());
        this.f26194i.setOnClickListener(new e());
        this.f26191f.setOnDismissListener(new f());
        this.f26191f.show();
    }

    public void I0() {
        ((ConstraintLayout) findViewById(R.id.main_layout)).setSystemUiVisibility(4871);
    }

    public void J0() {
        RelativeLayout relativeLayout = this.rl_login_with_m3u;
        relativeLayout.setOnFocusChangeListener(new k(relativeLayout));
        RelativeLayout relativeLayout2 = this.rl_login_with_xtream_codes_api;
        relativeLayout2.setOnFocusChangeListener(new k(relativeLayout2));
        RelativeLayout relativeLayout3 = this.rl_play_from_device;
        relativeLayout3.setOnFocusChangeListener(new k(relativeLayout3));
        RelativeLayout relativeLayout4 = this.rl_play_single_stream;
        relativeLayout4.setOnFocusChangeListener(new k(relativeLayout4));
        RelativeLayout relativeLayout5 = this.rl_list_users;
        relativeLayout5.setOnFocusChangeListener(new k(relativeLayout5));
    }

    public boolean K0() {
        if (Build.VERSION.SDK_INT < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        a.i.h.a.q(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 101);
        return false;
    }

    public void L0() {
        c.h.a.h.d dVar = new c.h.a.h.d(this.f26190e, new g(new String[]{BuildConfig.FLAVOR}));
        if (Build.VERSION.SDK_INT >= 30) {
            dVar.w(BuildConfig.FLAVOR);
        } else {
            dVar.v(BuildConfig.FLAVOR);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0005. Please report as an issue. */
    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 101) {
            switch (i2) {
            }
        } else {
            K0();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f26192g + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
            finish();
        } else {
            try {
                Toast.makeText(getBaseContext(), getResources().getString(R.string.press_back_to_exit), 0).show();
            } catch (Exception unused) {
            }
        }
        this.f26192g = System.currentTimeMillis();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26190e = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f26190e);
        f26189d = aVar;
        String strA = aVar.A();
        setContentView(c.h.a.h.n.a.M.booleanValue() ? strA.equals(c.h.a.h.n.a.s0) ? R.layout.activity_routing_p_tv : R.layout.activity_routing_p : strA.equals(c.h.a.h.n.a.s0) ? R.layout.activity_routing_tv : R.layout.activity_routing);
        ButterKnife.a(this);
        if (c.h.a.h.n.a.M.booleanValue() && !getSharedPreferences("Accept_clicked", 0).getString("Accept_clicked", BuildConfig.FLAVOR).equals("true")) {
            H0();
        }
        I0();
        J0();
        try {
            this.tv_link2.setOnClickListener(new b());
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0) {
                J0();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                Toast.makeText(this, this.f26190e.getResources().getString(R.string.access_denied), 0).show();
            } else {
                b.a aVar = new b.a(this, R.style.AlertDialogCustom);
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.permission_alertbox, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(R.id.btn_grant);
                Button button2 = (Button) viewInflate.findViewById(R.id.btn_cancel);
                button.setOnFocusChangeListener(new e.j(button, this));
                button2.setOnFocusChangeListener(new e.j(button2, this));
                button.requestFocus();
                button.setOnClickListener(new h());
                button2.setOnClickListener(new i());
                aVar.setView(viewInflate);
                this.f26197l = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f26197l.getWindow();
                window.getClass();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f26197l.show();
                this.f26197l.getWindow().setAttributes(layoutParams);
                this.f26197l.setCancelable(false);
                this.f26197l.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        I0();
    }

    @OnClick
    public void onViewClicked(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.rl_list_users /* 2131428956 */:
                on_click_list(view);
                return;
            case R.id.rl_login_with_m3u /* 2131428957 */:
                m.N("m3u", this.f26190e);
                intent = new Intent(this, (Class<?>) LoginM3uActivity.class);
                break;
            case R.id.rl_login_with_xtream_codes_api /* 2131428958 */:
                m.N("api", this.f26190e);
                intent = new Intent(this, (Class<?>) LoginActivity.class);
                break;
            case R.id.rl_play_from_device /* 2131428982 */:
                try {
                    if (f26189d.A().equals(c.h.a.h.n.a.s0)) {
                        if (!K0()) {
                            return;
                        } else {
                            L0();
                        }
                    } else {
                        if (!K0()) {
                            return;
                        }
                        Intent intent2 = new Intent(this, (Class<?>) Local_media_Activity.class);
                        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                        startActivity(intent2);
                        finish();
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case R.id.rl_play_single_stream /* 2131428983 */:
                single_stream_click(view);
                return;
            default:
                return;
        }
        startActivity(intent);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    public void on_click_list(View view) {
        startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
    }

    public void single_stream_click(View view) {
        try {
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
            View viewInflate = f26189d.A().equals(c.h.a.h.n.a.s0) ? layoutInflater.inflate(R.layout.single_stream_pop_up_window_tv, (ViewGroup) null) : layoutInflater.inflate(R.layout.single_stream_pop_up_window, (ViewGroup) null);
            PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -1, true);
            popupWindow.showAtLocation(viewInflate, 16, 0, 0);
            popupWindow.setTouchable(true);
            popupWindow.setFocusable(true);
            EditText editText = (EditText) viewInflate.findViewById(R.id.et_link);
            this.f26195j = (RelativeLayout) viewInflate.findViewById(R.id.rl_play);
            this.f26196k = (TextView) viewInflate.findViewById(R.id.tv_play);
            RelativeLayout relativeLayout = this.f26195j;
            relativeLayout.setOnFocusChangeListener(new k(relativeLayout));
            TextView textView = this.f26196k;
            textView.setOnFocusChangeListener(new k(textView));
            this.f26195j.setOnClickListener(new j(editText));
            editText.setOnEditorActionListener(new a());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
