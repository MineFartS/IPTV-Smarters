package com.nst.iptvsmarterstvbox.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import com.nst.iptvsmarterstvbox.R;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class AnnouncementAlertActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f25316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f25317c;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AnnouncementAlertActivity f25320f;

    @BindView
    public ImageView logo;

    @BindView
    public TextView time;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25318d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25319e = BuildConfig.FLAVOR;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.b(AnnouncementAlertActivity.this.f25320f);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = e.C(AnnouncementAlertActivity.this.f25320f);
                String strQ = e.q(string);
                TextView textView = AnnouncementAlertActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = AnnouncementAlertActivity.this.date;
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
                    AnnouncementAlertActivity.this.a();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void a() {
        runOnUiThread(new b());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_announcement_alert);
        this.f25320f = this;
        ButterKnife.a(this);
        this.f25317c = (TextView) findViewById(R.id.tv_announcement_description);
        this.f25316b = (TextView) findViewById(R.id.tv_announcement_title);
        Intent intent = getIntent();
        this.f25318d = intent.getStringExtra("Title");
        this.f25319e = intent.getStringExtra("Description");
        this.f25316b.setText(this.f25318d);
        this.f25317c.setText(this.f25319e);
        this.logo.setOnClickListener(new a());
        new Thread(new c()).start();
    }
}
