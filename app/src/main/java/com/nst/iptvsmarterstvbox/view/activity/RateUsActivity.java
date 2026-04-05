package minefarts.iptvsmarters.view.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.n.e;
import c.h.a.i.q.m;
import minefarts.iptvsmarters.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class RateUsActivity extends a.b.k.c {

    @BindView
    public Button btn_later;

    @BindView
    public Button btn_rateus;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f26144d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.h.a.k.d.a.a f26145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f26146f = null;

    @BindView
    public ImageView logo;

    @BindView
    public TextView time;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.b(RateUsActivity.this.f26144d);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = e.C(RateUsActivity.this.f26144d);
                String strQ = e.q(string);
                TextView textView = RateUsActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = RateUsActivity.this.date;
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
                    RateUsActivity.this.y0();
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
        this.f26144d = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f26144d);
        this.f26145e = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_rate_us_tv : R.layout.activity_rate_us);
        ButterKnife.a(this);
        Button button = this.btn_rateus;
        button.setOnFocusChangeListener(new e.j((View) button, this));
        this.btn_rateus.requestFocus();
        this.btn_rateus.requestFocusFromTouch();
        Button button2 = this.btn_later;
        button2.setOnFocusChangeListener(new e.j((View) button2, this));
        Thread thread = this.f26146f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f26146f = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new a());
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f26146f;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f26146f.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f26146f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f26146f = thread2;
            thread2.start();
        }
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @OnClick
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_later) {
            m.V(0, this.f26144d);
            onBackPressed();
            return;
        }
        if (id != R.id.btn_rateus) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName()));
            m.W(true, this.f26144d);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this.f26144d, getResources().getString(R.string.device_not_supported), 0).show();
        }
    }

    public void y0() {
        runOnUiThread(new b());
    }
}
