package com.nst.iptvsmarterstvbox.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.f.f;
import c.h.a.f.g;
import c.h.a.h.n.e;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.AnnouncementsResponsePojo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AnnouncementsActivity extends a.b.k.c implements c.h.a.f.c<String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25325d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView.p f25327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView.h f25328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f25329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Thread f25330i = null;

    @BindView
    public ImageView logo;

    @BindView
    public TextView noRecord;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView time;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.b(AnnouncementsActivity.this.f25329h);
        }
    }

    public class b extends c.f.b.g.b<List<AnnouncementsResponsePojo>> {
        public b() {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = e.C(AnnouncementsActivity.this.f25329h);
                String strQ = e.q(string);
                TextView textView = AnnouncementsActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = AnnouncementsActivity.this.date;
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
                    AnnouncementsActivity.this.z0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void A0() {
        this.f25326e = LoginActivity.T0(f.b(this) + "*" + f.d(this) + "-" + c.h.a.f.b.f16735b);
        ArrayList arrayList = new ArrayList();
        g.f16757a = arrayList;
        arrayList.add(g.a("action", "getAnnouncement"));
        g.f16757a.add(g.a("sc", this.f25326e));
        g.f16757a.add(g.a("apikey", f.b(this)));
        g.f16757a.add(g.a("rand_num", c.h.a.f.b.f16735b));
        g.f16758b.c(this);
    }

    public void B0(String str) {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.noRecord.setText(str);
        this.noRecord.setVisibility(0);
        this.recyclerView.setVisibility(8);
    }

    @Override // c.h.a.f.c
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public void d0(String str, int i2, boolean z) {
        String string;
        if (z) {
            if (i2 != 1) {
                return;
            }
            try {
                if (str.isEmpty() && str.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                    string = getResources().getString(R.string.no_record);
                } else {
                    c.h.a.f.b.f16734a = new JSONObject(str);
                    c.f.d.e eVar = new c.f.d.e();
                    if (!Boolean.valueOf(c.h.a.f.b.f16734a.getBoolean("status")).booleanValue()) {
                        return;
                    }
                    JSONArray jSONArray = c.h.a.f.b.f16734a.getJSONArray("response");
                    this.recyclerView.setHasFixedSize(true);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
                    this.f25327f = linearLayoutManager;
                    this.recyclerView.setLayoutManager(linearLayoutManager);
                    List list = (List) eVar.k(jSONArray.toString(), new b().b());
                    if (!list.isEmpty()) {
                        c.h.a.k.b.a aVar = new c.h.a.k.b.a(list, this);
                        this.f25328g = aVar;
                        this.recyclerView.setAdapter(aVar);
                        ProgressBar progressBar = this.pbLoader;
                        if (progressBar != null) {
                            progressBar.setVisibility(8);
                        }
                        this.noRecord.setVisibility(8);
                        return;
                    }
                    string = getResources().getString(R.string.no_record);
                }
                B0(string);
                return;
            } catch (Exception e2) {
                Log.e("Get Announcements", e2.getMessage());
            }
        }
        B0(getResources().getString(R.string.no_record));
    }

    @Override // c.h.a.f.c
    public void n(int i2) {
        B0(getResources().getString(R.string.internet_error));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_announcements);
        g.f16758b = new g(this);
        this.f25329h = this;
        ButterKnife.a(this);
        y0();
        A0();
        Thread thread = this.f25330i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f25330i = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new a());
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f25330i;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f25330i.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f25330i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f25330i = thread2;
            thread2.start();
        }
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    public void y0() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f25325d = iNextInt;
        c.h.a.f.b.f16735b = String.valueOf(iNextInt);
    }

    public void z0() {
        runOnUiThread(new c());
    }
}
