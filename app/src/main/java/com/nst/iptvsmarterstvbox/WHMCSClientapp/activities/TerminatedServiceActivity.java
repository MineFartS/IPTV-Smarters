package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a.b.k.c;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import com.github.ybq.android.spinkit.SpinKitView;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TerminatedServiceActivity extends c implements c.h.a.e.a.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f24885d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f24886e = null;

    @BindView
    public SpinKitView progress;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_no_active_services;

    @BindView
    public TextView tv_title;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = e.C(TerminatedServiceActivity.this.f24885d);
                String strQ = e.q(string);
                TextView textView = TerminatedServiceActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = TerminatedServiceActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    TerminatedServiceActivity.this.y0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void b() {
        this.progress.setVisibility(8);
        this.recyclerView.setVisibility(0);
        this.tv_no_active_services.setVisibility(8);
    }

    @Override // c.h.a.e.a.a
    public void k(ArrayList<c.h.a.e.e.a> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            this.recyclerView.setVisibility(8);
            this.tv_no_active_services.setVisibility(0);
            this.progress.setVisibility(8);
        } else {
            b();
            this.recyclerView.setAdapter(new c.h.a.e.c.a(this.f24885d, arrayList));
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_terminated_service);
        ButterKnife.a(this);
        this.tv_title.setText(getResources().getString(R.string.my_series_my_terminated_service));
        this.f24885d = this;
        Thread thread = this.f24886e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new b());
            this.f24886e = thread2;
            thread2.start();
        }
        this.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        new c.h.a.e.d.c(this, this.f24885d, "Terminated").a();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f24886e;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f24886e.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f24886e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new b());
            this.f24886e = thread2;
            thread2.start();
        }
    }

    @Override // c.h.a.e.a.a
    public void w(String str) {
        Toast.makeText(this.f24885d, BuildConfig.FLAVOR + str, 0).show();
        this.progress.setVisibility(8);
        this.recyclerView.setVisibility(0);
        this.tv_no_active_services.setVisibility(0);
    }

    public void y0() {
        runOnUiThread(new a());
    }
}
