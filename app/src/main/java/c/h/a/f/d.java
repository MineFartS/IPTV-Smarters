package c.h.a.f;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class d extends AsyncTask<String, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.h.a.f.a f16737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.h.a.f.c<String> f16738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16740d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f16741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<e> f16744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f16745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Dialog f16746j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.d(dVar.f16741e, "Loading data...");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public d(Context context, String str, int i2, c.h.a.f.c<String> cVar, String str2, List<e> list, Boolean bool) {
        this.f16741e = context;
        this.f16742f = str;
        this.f16739c = i2;
        this.f16738b = cVar;
        this.f16743g = str2;
        this.f16744h = list;
        this.f16745i = bool;
    }

    public void a() {
        try {
            Dialog dialog = this.f16746j;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            this.f16746j.cancel();
        } catch (Exception unused) {
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        String strA = null;
        try {
            strA = c.h.a.f.a.a(this.f16741e, this.f16742f, this.f16739c, this.f16743g, this.f16744h);
            if (strA != null) {
                this.f16740d = true;
            } else {
                new Handler(Looper.getMainLooper()).post(new b());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return strA;
    }

    @Override // android.os.AsyncTask
    @TargetApi(11)
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        try {
            if (this.f16740d) {
                if (str == null) {
                    new Handler(Looper.getMainLooper()).post(new c());
                }
                this.f16738b.d0(str, this.f16739c, this.f16740d);
            } else {
                this.f16738b.n(this.f16739c);
            }
        } catch (Exception unused) {
        }
        if (this.f16745i.booleanValue()) {
            try {
                a();
            } catch (Exception unused2) {
            }
        }
    }

    public void d(Context context, String str) {
        Dialog dialog = new Dialog(context, R.style.Theme.Translucent.NoTitleBar);
        this.f16746j = dialog;
        dialog.setContentView(minefarts.iptvsmarters.R.layout.layout_progress_bar);
        this.f16746j.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f16746j.setCancelable(false);
        ((TextView) this.f16746j.findViewById(minefarts.iptvsmarters.R.id.message)).setText(str);
        try {
            if (((Activity) this.f16741e).isFinishing()) {
                Log.e("FINISHED", "FINISHED");
            } else {
                this.f16746j.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        this.f16737a = new c.h.a.f.a();
        if (this.f16745i.booleanValue()) {
            try {
                Dialog dialog = this.f16746j;
                if (dialog != null && dialog.isShowing()) {
                    a();
                }
                new Handler(Looper.getMainLooper()).post(new a());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
