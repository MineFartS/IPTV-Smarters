package minefarts.iptvsmarters.view.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.n.e;
import c.h.a.i.q.m;
import minefarts.iptvsmarters.R;
import java.io.IOException;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.Jsoup;

/* JADX INFO: loaded from: classes2.dex */
public class CheckAppupdateActivity extends a.b.k.c {

    @BindView
    public Button btn_later;

    @BindView
    public Button btn_update;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f25431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.k.d.a.a f25432g;

    @BindView
    public LinearLayout ll_marginLayout;

    @BindView
    public ImageView logo;

    @BindView
    public TextView message;

    @BindView
    public NestedScrollView nested_checkupdate;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public TextView time;

    @BindView
    public TextView title;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25429d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25430e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f25433h = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.b(CheckAppupdateActivity.this.f25431f);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = e.C(CheckAppupdateActivity.this.f25431f);
                String strQ = e.q(string);
                TextView textView = CheckAppupdateActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = CheckAppupdateActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c extends AsyncTask<Void, String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f25436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f25437b;

        public c(Context context, String str) {
            this.f25437b = BuildConfig.FLAVOR;
            this.f25436a = context;
            this.f25437b = str;
        }

        public String a(String str) {
            return str.replaceAll("[\\-\\+\\.\\^:,]", BuildConfig.FLAVOR);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            try {
                return Jsoup.connect("https://play.google.com/store/apps/details?id=minefarts.iptvsmarters&hl=en").timeout(5000).userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6").referrer("http://www.google.com").get().select(" div.hAyfc:nth-child(4) > span:nth-child(2) >div:nth-child(1) > span:nth-child(1)").first().ownText();
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            int i2;
            int i3;
            super.onPostExecute(str);
            CheckAppupdateActivity.this.b();
            if (str != null && !str.isEmpty()) {
                m.P(true, this.f25436a);
                if (str.matches("\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d\\.\\d")) {
                    String strA = a(str);
                    String strA2 = a(this.f25437b);
                    if (strA.length() > strA2.length()) {
                        int length = strA.length() - strA2.length();
                        StringBuffer stringBuffer = new StringBuffer(strA2);
                        for (int i4 = 0; i4 < length; i4++) {
                            stringBuffer.append(0);
                        }
                        strA2 = stringBuffer.toString();
                    } else if (strA.length() < strA2.length()) {
                        int length2 = strA2.length() - strA.length();
                        StringBuffer stringBuffer2 = new StringBuffer(strA);
                        for (int i5 = 0; i5 < length2; i5++) {
                            stringBuffer2.append(0);
                        }
                        strA = stringBuffer2.toString();
                    }
                    try {
                        i2 = Integer.parseInt(strA);
                        i3 = Integer.parseInt(strA2);
                    } catch (NumberFormatException unused) {
                        i2 = 1;
                        i3 = 1;
                    }
                    if (i2 > i3) {
                        CheckAppupdateActivity.this.z0(true);
                        return;
                    }
                }
            }
            CheckAppupdateActivity.this.z0(false);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            CheckAppupdateActivity.this.a();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    CheckAppupdateActivity.this.y0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.nested_checkupdate.setVisibility(8);
    }

    public void b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.nested_checkupdate.setVisibility(0);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 101) {
            try {
                this.f25429d = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
            new c(this, this.f25429d).execute(new Void[0]);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25431f = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25431f);
        this.f25432g = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_check_appupdate_tv : R.layout.activity_check_appupdate);
        ButterKnife.a(this);
        Thread thread = this.f25433h;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f25433h = thread2;
            thread2.start();
        }
        try {
            this.f25429d = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        Button button = this.btn_update;
        button.setOnFocusChangeListener(new e.j((View) button, this));
        this.btn_update.requestFocus();
        this.btn_update.requestFocusFromTouch();
        Button button2 = this.btn_later;
        button2.setOnFocusChangeListener(new e.j((View) button2, this));
        new c(this, this.f25429d).execute(new Void[0]);
        this.logo.setOnClickListener(new a());
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f25433h;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f25433h.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f25433h;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f25433h = thread2;
            thread2.start();
        }
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @OnClick
    public void onclickView(View view) {
        int id = view.getId();
        if (id == R.id.btn_later) {
            onBackPressed();
            return;
        }
        if (id != R.id.btn_update) {
            return;
        }
        try {
            startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName())), 101);
        } catch (Exception unused) {
            Toast.makeText(this.f25431f, getResources().getString(R.string.device_not_supported), 0).show();
        }
    }

    public void y0() {
        runOnUiThread(new b());
    }

    public void z0(boolean z) {
        if (z) {
            this.nested_checkupdate.setVisibility(0);
            return;
        }
        this.message.setText(getResources().getString(R.string.up_to_date) + this.f25429d + " " + getResources().getString(R.string.up_to_date2));
        this.title.setText(getResources().getString(R.string.no_update));
        this.btn_update.setVisibility(8);
        this.btn_later.setText(getResources().getString(R.string.back_button));
        this.ll_marginLayout.setVisibility(8);
        this.btn_later.requestFocus();
        this.btn_later.requestFocusFromTouch();
    }
}
