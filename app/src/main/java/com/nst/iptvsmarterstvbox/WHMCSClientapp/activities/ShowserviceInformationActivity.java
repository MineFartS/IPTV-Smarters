package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import minefarts.iptvsmarters.R;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ShowserviceInformationActivity extends a.b.k.c {

    @BindView
    public Button btn_back;

    @BindView
    public Button btn_service_home;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f24865d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f24866e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24867f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f24868g = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f24869h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f24870i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24871j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f24872k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f24873l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Thread f24874m = null;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_billing_cycle;

    @BindView
    public TextView tv_first_time_payment;

    @BindView
    public TextView tv_next_due_date;

    @BindView
    public TextView tv_payment_method;

    @BindView
    public TextView tv_product;

    @BindView
    public TextView tv_recurring_amount;

    @BindView
    public TextView tv_registration_date;

    @BindView
    public TextView tv_status;

    @BindView
    public TextView tv_title;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShowserviceInformationActivity.this.onBackPressed();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(ShowserviceInformationActivity.this, (Class<?>) ServicesDashboardActivity.class);
            intent.setFlags(67141632);
            ShowserviceInformationActivity.this.startActivity(intent);
            ShowserviceInformationActivity.this.finish();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = e.C(ShowserviceInformationActivity.this.f24865d);
                String strQ = e.q(string);
                TextView textView = ShowserviceInformationActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = ShowserviceInformationActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ShowserviceInformationActivity.this.y0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        TextView textView;
        String string;
        TextView textView2;
        String string2;
        TextView textView3;
        String string3;
        TextView textView4;
        String string4;
        TextView textView5;
        String string5;
        TextView textView6;
        String string6;
        TextView textView7;
        String string7;
        super.onCreate(bundle);
        setContentView(R.layout.activity_showservice_information);
        ButterKnife.a(this);
        this.f24865d = this;
        Thread thread = this.f24874m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f24874m = thread2;
            thread2.start();
        }
        Intent intent = getIntent();
        this.f24866e = intent.getStringExtra("product");
        this.f24867f = intent.getStringExtra("status");
        this.f24868g = intent.getStringExtra("Registration_date");
        this.f24869h = intent.getStringExtra("next_due_date");
        this.f24870i = intent.getStringExtra("recurring_amount");
        this.f24873l = intent.getStringExtra("billing_cycle");
        this.f24871j = intent.getStringExtra("payment_method");
        this.f24872k = intent.getStringExtra("first_time_payment");
        if (this.f24873l.equalsIgnoreCase("Free Account")) {
            string2 = "- - -";
            this.tv_next_due_date.setText("- - -");
            textView2 = this.tv_recurring_amount;
        } else {
            String str = this.f24869h;
            if (str == null || str.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                textView = this.tv_next_due_date;
                string = getResources().getString(R.string.N_A);
            } else {
                textView = this.tv_next_due_date;
                string = this.f24869h;
            }
            textView.setText(string);
            String str2 = this.f24870i;
            if (str2 == null || str2.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                textView2 = this.tv_recurring_amount;
                string2 = getResources().getString(R.string.N_A);
            } else {
                textView2 = this.tv_recurring_amount;
                string2 = c.h.a.e.b.a.c(this.f24865d) + this.f24870i + c.h.a.e.b.a.d(this.f24865d);
            }
        }
        textView2.setText(string2);
        String str3 = this.f24866e;
        if (str3 == null || str3.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            textView3 = this.tv_product;
            string3 = getResources().getString(R.string.N_A);
        } else {
            textView3 = this.tv_product;
            string3 = this.f24866e;
        }
        textView3.setText(string3);
        String str4 = this.f24867f;
        if (str4 == null || str4.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            this.tv_status.setText(getResources().getString(R.string.N_A));
            this.tv_title.setVisibility(8);
        } else {
            this.tv_status.setText(this.f24867f);
            this.tv_title.setText(this.f24867f + " Service Information");
        }
        String str5 = this.f24868g;
        if (str5 == null || str5.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            textView4 = this.tv_registration_date;
            string4 = getResources().getString(R.string.N_A);
        } else {
            textView4 = this.tv_registration_date;
            string4 = this.f24868g;
        }
        textView4.setText(string4);
        String str6 = this.f24873l;
        if (str6 == null || str6.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            textView5 = this.tv_billing_cycle;
            string5 = getResources().getString(R.string.N_A);
        } else {
            textView5 = this.tv_billing_cycle;
            string5 = this.f24873l;
        }
        textView5.setText(string5);
        String str7 = this.f24871j;
        if (str7 == null || str7.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            textView6 = this.tv_payment_method;
            string6 = getResources().getString(R.string.N_A);
        } else {
            textView6 = this.tv_payment_method;
            string6 = this.f24871j;
        }
        textView6.setText(string6);
        String str8 = this.f24872k;
        if (str8 == null || str8.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            textView7 = this.tv_first_time_payment;
            string7 = getResources().getString(R.string.N_A);
        } else {
            textView7 = this.tv_first_time_payment;
            string7 = c.h.a.e.b.a.c(this.f24865d) + this.f24872k + c.h.a.e.b.a.d(this.f24865d);
        }
        textView7.setText(string7);
        this.btn_back.setOnClickListener(new a());
        this.btn_service_home.setOnClickListener(new b());
        Button button = this.btn_service_home;
        button.setOnFocusChangeListener(new e.j(button, this));
        Button button2 = this.btn_back;
        button2.setOnFocusChangeListener(new e.j(button2, this));
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f24874m;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f24874m.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f24874m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f24874m = thread2;
            thread2.start();
        }
    }

    public void y0() {
        runOnUiThread(new c());
    }
}
