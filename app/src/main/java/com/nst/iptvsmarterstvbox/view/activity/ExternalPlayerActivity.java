package minefarts.iptvsmarters.view.activity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.adapter.ExternalPlayerAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ExternalPlayerActivity extends a.b.k.c implements ExternalPlayerAdapter.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<ApplicationInfo> f25597d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<ApplicationInfo> f25598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PackageManager f25599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f25600g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.d f25602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.k.d.a.a f25603j;

    @BindView
    public LinearLayout ll_no_data_found;

    @BindView
    public LinearLayout ll_progressbar;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView time;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AlertDialog f25601h = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Thread f25604k = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(ExternalPlayerActivity.this.f25600g);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(ExternalPlayerActivity.this.f25600g);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = ExternalPlayerActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = ExternalPlayerActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f25607b;

        public c(PopupWindow popupWindow) {
            this.f25607b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = this.f25607b;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f25607b.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f25609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f25610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f25611d;

        public d(String str, String str2, PopupWindow popupWindow) {
            this.f25609b = str;
            this.f25610c = str2;
            this.f25611d = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ExternalPlayerActivity.this.f25602i = new c.h.a.i.q.d(ExternalPlayerActivity.this.f25600g);
            if (ExternalPlayerActivity.this.f25602i.d(this.f25609b)) {
                c.h.a.h.n.e.l0(ExternalPlayerActivity.this.f25600g, "Already Added");
            } else {
                ExternalPlayerActivity.this.f25602i.i(this.f25609b, this.f25610c);
                c.h.a.h.n.e.l0(ExternalPlayerActivity.this.f25600g, this.f25609b + " " + ExternalPlayerActivity.this.getResources().getString(R.string.added_external_player));
                ExternalPlayerActivity.this.onBackPressed();
            }
            PopupWindow popupWindow = this.f25611d;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f25611d.dismiss();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ExternalPlayerActivity.this.E0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class f extends AsyncTask<Boolean, Void, Boolean> {
        public f() {
        }

        public /* synthetic */ f(ExternalPlayerActivity externalPlayerActivity, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return ExternalPlayerActivity.this.F0();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            List<ApplicationInfo> list;
            super.onPostExecute(bool);
            ExternalPlayerActivity.this.ll_progressbar.setVisibility(8);
            if (!bool.booleanValue() || (list = ExternalPlayerActivity.this.f25598e) == null || list.size() <= 0) {
                ExternalPlayerActivity.this.G0(Boolean.FALSE);
                return;
            }
            ExternalPlayerActivity.this.G0(Boolean.TRUE);
            ExternalPlayerActivity externalPlayerActivity = ExternalPlayerActivity.this;
            externalPlayerActivity.recyclerView.setLayoutManager(new LinearLayoutManager(externalPlayerActivity.f25600g, 1, false));
            ExternalPlayerActivity externalPlayerActivity2 = ExternalPlayerActivity.this;
            RecyclerView recyclerView = externalPlayerActivity2.recyclerView;
            Context context = externalPlayerActivity2.f25600g;
            ExternalPlayerActivity externalPlayerActivity3 = ExternalPlayerActivity.this;
            recyclerView.setAdapter(new ExternalPlayerAdapter(context, externalPlayerActivity3.f25598e, externalPlayerActivity3));
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            ExternalPlayerActivity.this.ll_no_data_found.setVisibility(8);
            ExternalPlayerActivity.this.recyclerView.setVisibility(8);
            ExternalPlayerActivity.this.ll_progressbar.setVisibility(0);
        }
    }

    public final void D0() {
        Window window = getWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            window.clearFlags(67108864);
        }
        if (i2 >= 21) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (i2 >= 21) {
            window.setStatusBarColor(a.i.i.b.d(this, R.color.colorPrimaryDark));
        }
    }

    public void E0() {
        runOnUiThread(new b());
    }

    public final Boolean F0() {
        this.f25597d = new ArrayList();
        this.f25598e = new ArrayList();
        PackageManager packageManager = this.f25600g.getPackageManager();
        this.f25599f = packageManager;
        this.f25597d = packageManager.getInstalledApplications(128);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.fromFile(new File("content://media/internal/video/media")), "video/*");
        Iterator<ResolveInfo> it = getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            try {
                this.f25598e.add(this.f25599f.getApplicationInfo(it.next().activityInfo.packageName, 128));
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        return Boolean.TRUE;
    }

    @Override // minefarts.iptvsmarters.view.adapter.ExternalPlayerAdapter.b
    public void G(View view, String str, String str2) {
        H0(str, str2);
    }

    public final void G0(Boolean bool) {
        if (bool.booleanValue()) {
            this.ll_no_data_found.setVisibility(8);
            this.recyclerView.setVisibility(0);
        } else {
            this.ll_no_data_found.setVisibility(0);
            this.recyclerView.setVisibility(8);
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public final void H0(String str, String str2) {
        try {
            View viewInflate = ((LayoutInflater) this.f25600g.getSystemService("layout_inflater")).inflate(R.layout.playera_add_alert_box, (RelativeLayout) findViewById(R.id.rl_outer));
            PopupWindow popupWindow = new PopupWindow(this.f25600g);
            popupWindow.setContentView(viewInflate);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setFocusable(true);
            popupWindow.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.btn_no);
            Button button2 = (Button) viewInflate.findViewById(R.id.btn_yes);
            ((TextView) viewInflate.findViewById(R.id.tv_description)).setText(getResources().getString(R.string.are_you_sure_you_want_add_player));
            button.setOnFocusChangeListener(new e.j(button, this));
            button2.setOnFocusChangeListener(new e.j(button2, this));
            button.setOnClickListener(new c(popupWindow));
            button2.setOnClickListener(new d(str, str2, popupWindow));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void I0() {
        new f(this, null).execute(new Boolean[0]);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25600g = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25600g);
        this.f25603j = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_external_player_tv : R.layout.activity_external_player);
        ButterKnife.a(this);
        getWindow().setFlags(1024, 1024);
        D0();
        Thread thread = this.f25604k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new e());
            this.f25604k = thread2;
            thread2.start();
        }
        I0();
        this.logo.setOnClickListener(new a());
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f25604k;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f25604k.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f25604k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new e());
            this.f25604k = thread2;
            thread2.start();
        }
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }
}
