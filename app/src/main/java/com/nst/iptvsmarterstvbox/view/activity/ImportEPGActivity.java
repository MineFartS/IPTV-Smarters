package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.c;
import a.i.i.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import c.h.a.i.q.f;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.utility.LoadingGearSpinner;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ImportEPGActivity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f25685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f25686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<XMLTVProgrammePojo> f25687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.k.d.a.a f25688h;

    @BindView
    public LoadingGearSpinner ivGearLoader;

    @BindView
    public ProgressBar progressBar;

    @BindView
    public RelativeLayout rlImportLayout;

    @BindView
    public RelativeLayout rlImportProcess;

    @BindView
    public TextView tvCountings;

    @BindView
    public TextView tvImportingEpg;

    @BindView
    public TextView tvPercentage;

    @BindView
    public TextView tvSettingStreams;

    @SuppressLint({"StaticFieldLeak"})
    public class a extends AsyncTask<Void, Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.h.a.k.h.c f25689a;

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ImportEPGActivity$a$a, reason: collision with other inner class name */
        @SuppressLint({"StaticFieldLeak"})
        public class AsyncTaskC0274a extends AsyncTask<String, Integer, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public volatile boolean f25691a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Context f25692b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f25693c;

            public AsyncTaskC0274a(Context context) {
                this.f25692b = null;
                this.f25693c = ImportEPGActivity.this.f25687g.size();
                this.f25692b = context;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                publishProgress(0);
                ImportEPGActivity importEPGActivity = ImportEPGActivity.this;
                f fVar = importEPGActivity.f25685e;
                if (fVar != null) {
                    fVar.p(importEPGActivity.f25687g);
                }
                return Boolean.TRUE;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                int size = ImportEPGActivity.this.f25687g.size();
                ImportEPGActivity importEPGActivity = ImportEPGActivity.this;
                importEPGActivity.f25686f = importEPGActivity.getSharedPreferences("loginPrefs", 0);
                ImportEPGActivity.this.f25686f.getString("skip", BuildConfig.FLAVOR);
                e.l0(ImportEPGActivity.this.f25684d, ImportEPGActivity.this.getResources().getString(R.string.epg_imported) + " (" + size + ")");
                ImportEPGActivity.this.f25685e.u2("epg", "1");
                if (ImportEPGActivity.this.f25684d != null) {
                    ImportEPGActivity.this.startActivity(new Intent(ImportEPGActivity.this.f25684d, (Class<?>) NewDashboardActivity.class));
                    ImportEPGActivity.this.finish();
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onCancelled() {
                this.f25691a = false;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public a() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            c.h.a.k.h.c cVar = new c.h.a.k.h.c();
            this.f25689a = cVar;
            cVar.a(ImportEPGActivity.this.f25684d);
            ImportEPGActivity.this.f25687g = this.f25689a.b();
            return (ImportEPGActivity.this.f25687g == null || ImportEPGActivity.this.f25687g.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            Intent intent;
            if (bool.booleanValue()) {
                try {
                    ImportEPGActivity importEPGActivity = ImportEPGActivity.this;
                    TextView textView = importEPGActivity.tvImportingEpg;
                    if (textView != null) {
                        textView.setText(importEPGActivity.getResources().getString(R.string.importing_epg));
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        new AsyncTaskC0274a(ImportEPGActivity.this.f25684d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                        return;
                    } else {
                        new AsyncTaskC0274a(ImportEPGActivity.this.f25684d).execute(new String[0]);
                        return;
                    }
                } catch (Exception unused) {
                    ImportEPGActivity.this.f25685e.u2("epg", "1");
                    if (ImportEPGActivity.this.f25684d == null) {
                        return;
                    } else {
                        intent = new Intent(ImportEPGActivity.this.f25684d, (Class<?>) NewDashboardActivity.class);
                    }
                }
            } else {
                ImportEPGActivity importEPGActivity2 = ImportEPGActivity.this;
                e.l0(importEPGActivity2.f25684d, importEPGActivity2.getResources().getString(R.string.no_epg_guide_found));
                ImportEPGActivity.this.f25685e.u2("epg", "0");
                if (ImportEPGActivity.this.f25684d == null) {
                    return;
                } else {
                    intent = new Intent(ImportEPGActivity.this.f25684d, (Class<?>) NewDashboardActivity.class);
                }
            }
            ImportEPGActivity.this.startActivity(intent);
            ImportEPGActivity.this.finish();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public final void C0() {
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

    public final void D0() {
        if (this.f25684d != null) {
            this.f25686f = getSharedPreferences("loginPrefs", 0);
            new a().execute(new Void[0]);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        finish();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_import_epg_new);
        ButterKnife.a(this);
        C0();
        this.f25684d = this;
        this.f25685e = new f(this.f25684d);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25684d);
        this.f25688h = aVar;
        if (aVar.c()) {
            e.j(this.f25684d);
        }
        D0();
        getWindow().setFlags(1024, 1024);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        e.g(this.f25684d);
        getWindow().setFlags(1024, 1024);
    }
}
