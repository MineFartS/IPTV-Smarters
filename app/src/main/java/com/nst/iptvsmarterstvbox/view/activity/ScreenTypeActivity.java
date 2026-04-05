package minefarts.iptvsmarters.view.activity;

import a.b.k.c;
import a.i.i.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenTypeActivity extends c implements View.OnClickListener {

    @BindView
    public TextView btn_save;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f26228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.h.a.k.d.a.a f26229e;

    @BindView
    public LinearLayout ll_yes_button_main_layout;

    @BindView
    public RadioButton rb_mobile;

    @BindView
    public RadioButton rb_tv;

    @BindView
    public RadioGroup rg_mobile_tv;

    @BindView
    public TextView tv_device_type_is;

    public class a implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26230b;

        public a(View view) {
            this.f26230b = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            View view2;
            TextView textView;
            Resources resources;
            int i2;
            View view3;
            int i3;
            if (z) {
                View view4 = this.f26230b;
                if (view4 == null || view4.getTag() == null || !this.f26230b.getTag().equals("1")) {
                    View view5 = this.f26230b;
                    if (view5 == null || view5.getTag() == null || !this.f26230b.getTag().equals("2")) {
                        View view6 = this.f26230b;
                        if (view6 == null || view6.getTag() == null || !this.f26230b.getTag().equals("3")) {
                            View view7 = this.f26230b;
                            if (view7 == null || view7.getTag() == null) {
                                return;
                            }
                            this.f26230b.setBackground(ScreenTypeActivity.this.getResources().getDrawable(R.drawable.selector_tracks_layout));
                            return;
                        }
                        this.f26230b.setBackgroundResource(R.drawable.login_btn_focused);
                        ScreenTypeActivity screenTypeActivity = ScreenTypeActivity.this;
                        textView = screenTypeActivity.btn_save;
                        resources = screenTypeActivity.f26228d.getResources();
                        i2 = R.color.white;
                    } else {
                        view3 = this.f26230b;
                        i3 = R.drawable.logout_btn_effect;
                    }
                } else {
                    view3 = this.f26230b;
                    i3 = R.drawable.back_btn_effect;
                }
                view3.setBackgroundResource(i3);
                return;
            }
            if (z) {
                return;
            }
            View view8 = this.f26230b;
            if ((view8 != null && view8.getTag() != null && this.f26230b.getTag().equals("1")) || ((view2 = this.f26230b) != null && view2.getTag() != null && this.f26230b.getTag().equals("2"))) {
                this.f26230b.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            View view9 = this.f26230b;
            if (view9 == null || view9.getTag() == null || !this.f26230b.getTag().equals("3")) {
                return;
            }
            this.f26230b.setBackgroundResource(R.drawable.login_btn_unfocused);
            ScreenTypeActivity screenTypeActivity2 = ScreenTypeActivity.this;
            textView = screenTypeActivity2.btn_save;
            resources = screenTypeActivity2.f26228d.getResources();
            i2 = R.color.black;
            textView.setTextColor(resources.getColor(i2));
        }
    }

    public final void A0() {
        this.rb_mobile.setOnClickListener(this);
        this.rb_tv.setOnClickListener(this);
        this.ll_yes_button_main_layout.setOnClickListener(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r4) {
        /*
            r3 = this;
            int r4 = r4.getId()
            r0 = 2131428506(0x7f0b049a, float:1.8478658E38)
            if (r4 == r0) goto La
            goto L72
        La:
            android.widget.RadioGroup r4 = r3.rg_mobile_tv
            int r4 = r4.getCheckedRadioButtonId()
            android.view.View r4 = r3.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            java.lang.Object r0 = r4.getTag()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Mobile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            c.h.a.k.d.a.a r4 = r3.f26229e
            java.lang.String r0 = c.h.a.h.n.a.t0
        L2a:
            r4.X(r0)
            goto L43
        L2e:
            java.lang.Object r4 = r4.getTag()
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "TV"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L43
            c.h.a.k.d.a.a r4 = r3.f26229e
            java.lang.String r0 = c.h.a.h.n.a.s0
            goto L2a
        L43:
            java.lang.Boolean r4 = c.h.a.h.n.a.f17041e
            boolean r4 = r4.booleanValue()
            r0 = 2130772000(0x7f010020, float:1.7147106E38)
            r1 = 2130772003(0x7f010023, float:1.7147112E38)
            if (r4 != 0) goto L62
            java.lang.Boolean r4 = c.h.a.h.n.a.f17042f
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L5a
            goto L62
        L5a:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<minefarts.iptvsmarters.view.activity.LoginActivity> r2 = minefarts.iptvsmarters.view.activity.LoginActivity.class
            r4.<init>(r3, r2)
            goto L69
        L62:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<minefarts.iptvsmarters.view.activity.RoutingActivity> r2 = minefarts.iptvsmarters.view.activity.RoutingActivity.class
            r4.<init>(r3, r2)
        L69:
            r3.startActivity(r4)
            r3.overridePendingTransition(r1, r0)
            r3.finish()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ScreenTypeActivity.onClick(android.view.View):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(3:4|(1:6)(1:7)|8)|9|(1:11)(6:13|(1:15)|20|16|17|18)|12|20|16|17|18) */
    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r4.f26228d = r4
            super.onCreate(r5)
            r4.z0()
            r5 = 2131624143(0x7f0e00cf, float:1.8875457E38)
            r4.setContentView(r5)
            butterknife.ButterKnife.a(r4)
            c.h.a.k.d.a.a r5 = new c.h.a.k.d.a.a
            android.content.Context r0 = r4.f26228d
            r5.<init>(r0)
            r4.f26229e = r5
            java.lang.String r5 = r5.A()
            java.lang.String r0 = ""
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f26228d
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.screenLayout
            r5 = r5 & 15
            r0 = 3
            if (r5 != r0) goto L3c
            c.h.a.k.d.a.a r5 = r4.f26229e
            java.lang.String r0 = c.h.a.h.n.a.s0
            goto L40
        L3c:
            c.h.a.k.d.a.a r5 = r4.f26229e
            java.lang.String r0 = c.h.a.h.n.a.t0
        L40:
            r5.X(r0)
        L43:
            c.h.a.k.d.a.a r5 = r4.f26229e
            java.lang.String r5 = r5.A()
            java.lang.String r0 = c.h.a.h.n.a.t0
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 == 0) goto L58
            android.widget.RadioButton r0 = r4.rb_mobile
        L54:
            r0.setChecked(r1)
            goto L63
        L58:
            java.lang.String r0 = c.h.a.h.n.a.s0
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L63
            android.widget.RadioButton r0 = r4.rb_tv
            goto L54
        L63:
            android.content.res.Resources r0 = r4.getResources()     // Catch: java.lang.Exception -> L78
            r2 = 2132017562(0x7f14019a, float:1.9673406E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L78
            r3 = 0
            r1[r3] = r5     // Catch: java.lang.Exception -> L78
            java.lang.String r5 = r0.getString(r2, r1)     // Catch: java.lang.Exception -> L78
            android.widget.TextView r0 = r4.tv_device_type_is     // Catch: java.lang.Exception -> L78
            r0.setText(r5)     // Catch: java.lang.Exception -> L78
        L78:
            r4.A0()
            android.widget.RadioButton r5 = r4.rb_mobile
            minefarts.iptvsmarters.view.activity.ScreenTypeActivity$a r0 = new minefarts.iptvsmarters.view.activity.ScreenTypeActivity$a
            r0.<init>(r5)
            r5.setOnFocusChangeListener(r0)
            android.widget.RadioButton r5 = r4.rb_tv
            minefarts.iptvsmarters.view.activity.ScreenTypeActivity$a r0 = new minefarts.iptvsmarters.view.activity.ScreenTypeActivity$a
            r0.<init>(r5)
            r5.setOnFocusChangeListener(r0)
            android.widget.LinearLayout r5 = r4.ll_yes_button_main_layout
            minefarts.iptvsmarters.view.activity.ScreenTypeActivity$a r0 = new minefarts.iptvsmarters.view.activity.ScreenTypeActivity$a
            r0.<init>(r5)
            r5.setOnFocusChangeListener(r0)
            r4.y0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.ScreenTypeActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        z0();
    }

    public final void y0() {
        Window window = getWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            window.clearFlags(67108864);
        }
        if (i2 >= 21) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (i2 >= 21) {
            window.setStatusBarColor(b.d(this, R.color.colorPrimaryDark));
        }
    }

    public void z0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }
}
