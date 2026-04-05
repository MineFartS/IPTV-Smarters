package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.n.e;
import c.h.a.i.q.m;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.activity.AnnouncementsActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.ArrayList;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import o.l;

/* JADX INFO: loaded from: classes2.dex */
public class ServicesDashboardActivity extends a.b.k.c implements c.h.a.e.a.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static PopupWindow f24822d;

    @BindView
    public ImageView account_info;

    @BindView
    public Button btn_buy_now;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f24823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f24824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f24825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f24826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f24827i;

    @BindView
    public ImageView ivSwitchUser;

    @BindView
    public ImageView iv_notification;

    @BindView
    public ImageView iv_settings;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CountDownTimer f24830l;

    @BindView
    public LinearLayout ll_buy_now;

    @BindView
    public LinearLayout ll_invoices;

    @BindView
    public LinearLayout ll_services;

    @BindView
    public LinearLayout ll_tickets;

    @BindView
    public AVLoadingIndicatorView pb_loader_invoice;

    @BindView
    public AVLoadingIndicatorView pb_loader_service;

    @BindView
    public AVLoadingIndicatorView pb_loader_ticket;

    @BindView
    public TextView time;

    @BindView
    public TextView tvAccountinfoButton;

    @BindView
    public TextView tvSettingsButton;

    @BindView
    public TextView tvSwitchUserButton;

    @BindView
    public TextView tv_free_trial_title;

    @BindView
    public TextView tv_freetrai_time;

    @BindView
    public TextView tv_invoice_count;

    @BindView
    public TextView tv_notification;

    @BindView
    public TextView tv_service_count;

    @BindView
    public TextView tv_ticket_count;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24828j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f24829k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Thread f24831m = null;

    public class a implements o.d<c.h.a.e.e.d> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<c.h.a.e.e.d> bVar, Throwable th) {
            c.h.a.h.n.e.I();
            ServicesDashboardActivity servicesDashboardActivity = ServicesDashboardActivity.this;
            Toast.makeText(servicesDashboardActivity.f24823e, servicesDashboardActivity.getResources().getString(R.string.something_wrong), 0).show();
        }

        @Override // o.d
        public void b(o.b<c.h.a.e.e.d> bVar, l<c.h.a.e.e.d> lVar) {
            Toast toastMakeText;
            if (!lVar.d()) {
                toastMakeText = Toast.makeText(ServicesDashboardActivity.this.f24823e, BuildConfig.FLAVOR, 0);
            } else {
                if (lVar.a() != null && lVar.a().c() != null && lVar.a().c().equalsIgnoreCase("success")) {
                    lVar.a().a();
                    throw null;
                }
                toastMakeText = Toast.makeText(ServicesDashboardActivity.this.f24823e, BuildConfig.FLAVOR + lVar.a().b(), 0);
            }
            toastMakeText.show();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(ServicesDashboardActivity.this.f24823e);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = ServicesDashboardActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = ServicesDashboardActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements o.d<c.h.a.e.e.f> {
        public c() {
        }

        @Override // o.d
        public void a(o.b<c.h.a.e.e.f> bVar, Throwable th) {
        }

        @Override // o.d
        public void b(o.b<c.h.a.e.e.f> bVar, l<c.h.a.e.e.f> lVar) {
            Context context;
            String str;
            if (!lVar.d() || lVar.a() == null) {
                context = ServicesDashboardActivity.this.f24823e;
                str = BuildConfig.FLAVOR + lVar.b() + " | Error";
            } else {
                if (lVar.a().b().equalsIgnoreCase("success")) {
                    lVar.a().a();
                    throw null;
                }
                context = ServicesDashboardActivity.this.f24823e;
                str = "Failed";
            }
            Toast.makeText(context, str, 0).show();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ServicesDashboardActivity.f24822d.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ServicesDashboardActivity.this.finish();
            c.h.a.h.n.e.O(ServicesDashboardActivity.this.f24823e);
            ServicesDashboardActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ServicesDashboardActivity.this.B0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class g implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f24838b;

        public g(View view) {
            this.f24838b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24838b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24838b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24838b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0184  */
        @Override // android.view.View.OnFocusChangeListener
        @android.annotation.SuppressLint({"ResourceType"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onFocusChange(android.view.View r12, boolean r13) {
            /*
                Method dump skipped, instruction units count: 569
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.ServicesDashboardActivity.g.onFocusChange(android.view.View, boolean):void");
        }
    }

    public void B0() {
        runOnUiThread(new b());
    }

    public void C0() {
        ((c.h.a.e.d.a) c.h.a.e.d.b.a().d(c.h.a.e.d.a.class)).f("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "sitcount", "yes", c.h.a.e.b.a.a(this.f24823e)).x(new c());
    }

    public void D0() {
        if (this.f24823e != null) {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.delete_recording_popup, (RelativeLayout) findViewById(R.id.rl_password_verification));
            PopupWindow popupWindow = new PopupWindow(this);
            f24822d = popupWindow;
            popupWindow.setContentView(viewInflate);
            f24822d.setWidth(-1);
            f24822d.setHeight(-1);
            f24822d.setFocusable(true);
            f24822d.showAtLocation(viewInflate, 17, 0, 0);
            this.f24824f = (TextView) viewInflate.findViewById(R.id.tv_parental_password);
            this.f24825g = (TextView) viewInflate.findViewById(R.id.tv_delete_recording);
            this.f24826h = (Button) viewInflate.findViewById(R.id.bt_start_recording);
            this.f24827i = (Button) viewInflate.findViewById(R.id.bt_close);
            TextView textView = this.f24824f;
            if (textView != null) {
                textView.setText(getResources().getString(R.string.logout_title));
            }
            TextView textView2 = this.f24825g;
            if (textView2 != null) {
                textView2.setText(getResources().getString(R.string.logout_message));
            }
            Button button = this.f24826h;
            if (button != null) {
                button.setOnFocusChangeListener(new e.j(button, this));
            }
            Button button2 = this.f24827i;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new e.j(button2, this));
            }
            this.f24827i.setOnClickListener(new d());
            Button button3 = this.f24826h;
            if (button3 != null) {
                button3.setOnClickListener(new e());
            }
        }
    }

    @Override // c.h.a.e.a.a
    public void k(ArrayList<c.h.a.e.e.a> arrayList) {
        c.h.a.h.n.e.I();
        if (arrayList == null || arrayList.size() <= 0 || arrayList.get(0) == null) {
            return;
        }
        this.f24829k = arrayList.get(0).c();
        try {
            Intent intent = new Intent(this, (Class<?>) BuyNowActivity.class);
            intent.putExtra("service_id", this.f24829k);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_services_dashboard);
        ButterKnife.a(this);
        this.f24823e = this;
        Thread thread = this.f24831m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.f24831m = thread2;
            thread2.start();
        }
        Button button = this.btn_buy_now;
        button.setOnFocusChangeListener(new g(button));
        ImageView imageView = this.account_info;
        imageView.setOnFocusChangeListener(new g(imageView));
        ImageView imageView2 = this.iv_settings;
        imageView2.setOnFocusChangeListener(new g(imageView2));
        ImageView imageView3 = this.ivSwitchUser;
        imageView3.setOnFocusChangeListener(new g(imageView3));
        LinearLayout linearLayout = this.ll_tickets;
        linearLayout.setOnFocusChangeListener(new g(linearLayout));
        ImageView imageView4 = this.iv_notification;
        imageView4.setOnFocusChangeListener(new g(imageView4));
        LinearLayout linearLayout2 = this.ll_invoices;
        linearLayout2.setOnFocusChangeListener(new g(linearLayout2));
        LinearLayout linearLayout3 = this.ll_services;
        linearLayout3.setOnFocusChangeListener(new g(linearLayout3));
        this.ll_services.requestFocus();
        if (c.h.a.h.n.a.f17039c.booleanValue()) {
            return;
        }
        this.ivSwitchUser.setImageResource(R.drawable.logout_user);
        this.tvSwitchUserButton.setText(getResources().getString(R.string.menu_logout));
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            CountDownTimer countDownTimer = this.f24830l;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        } catch (Exception unused) {
        }
        try {
            Thread thread = this.f24831m;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f24831m.interrupt();
        } catch (Exception unused2) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        C0();
        this.f24828j = getIntent().getAction();
        Thread thread = this.f24831m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.f24831m = thread2;
            thread2.start();
        }
        y0();
    }

    @OnClick
    public void onclick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.account_info /* 2131427397 */:
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                return;
            case R.id.btn_buy_now /* 2131427634 */:
                z0();
                return;
            case R.id.iv_notification /* 2131428171 */:
                intent = new Intent(this, (Class<?>) AnnouncementsActivity.class);
                break;
            case R.id.iv_settings /* 2131428195 */:
                intent = new Intent(this, (Class<?>) SettingsActivity.class);
                break;
            case R.id.ll_invoices /* 2131428387 */:
                intent = new Intent(this, (Class<?>) MyInvoiceActivity.class);
                break;
            case R.id.ll_services /* 2131428470 */:
                intent = new Intent(this, (Class<?>) MySerivcesActiviy.class);
                break;
            case R.id.ll_tickets /* 2131428489 */:
                intent = new Intent(this, (Class<?>) MyTicketActivity.class);
                break;
            case R.id.switch_user /* 2131429185 */:
                if ((!c.h.a.h.n.a.f17039c.booleanValue() || !m.f(this.f24823e).equals("api")) && (!c.h.a.h.n.a.f17041e.booleanValue() || !m.f(this.f24823e).equals("m3u"))) {
                    D0();
                    return;
                }
                finish();
                c.h.a.h.n.a.J = Boolean.TRUE;
                c.h.a.h.n.e.O(this.f24823e);
                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                return;
            default:
                return;
        }
        startActivity(intent);
    }

    @Override // c.h.a.e.a.a
    public void w(String str) {
        try {
            c.h.a.h.n.e.I();
        } catch (Exception unused) {
            c.h.a.h.n.e.l0(this.f24823e, str);
        }
    }

    public final void y0() {
        c.h.a.h.n.e.i0(this);
        ((c.h.a.e.d.a) c.h.a.e.d.b.a().d(c.h.a.e.d.a.class)).j("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "validateCustomLogin", "yes", m.A(this.f24823e), m.B(this.f24823e)).x(new a());
    }

    public final void z0() {
        c.h.a.h.n.e.i0(this);
        new c.h.a.e.d.c(this, this.f24823e, "Active").a();
    }
}
