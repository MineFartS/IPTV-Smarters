package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.options.StorageDownloadFileOptions;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageListResult;
import com.amplifyframework.storage.result.StorageRemoveResult;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class BackupAndRestoreActivity extends a.b.k.c implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25381d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.h.a.k.d.a.a f25382e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PopupWindow f25384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f25385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f25386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.k f25387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.l f25388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.f f25389l;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.a f25390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f25391n;
    public Handler t;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f25383f = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f25392o = BuildConfig.FLAVOR;
    public String p = BuildConfig.FLAVOR;
    public String q = BuildConfig.FLAVOR;
    public String r = BuildConfig.FLAVOR;
    public String s = BuildConfig.FLAVOR;
    public boolean u = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                BackupAndRestoreActivity backupAndRestoreActivity = BackupAndRestoreActivity.this;
                backupAndRestoreActivity.new i((Activity) backupAndRestoreActivity.f25381d).show();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(BackupAndRestoreActivity.this.f25381d);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(BackupAndRestoreActivity.this.f25381d);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = BackupAndRestoreActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = BackupAndRestoreActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BackupAndRestoreActivity.this.f25384g.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f25397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BackupAndRestoreActivity f25398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f25399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditText f25400e;

        public e(String str, BackupAndRestoreActivity backupAndRestoreActivity, String[] strArr, EditText editText) {
            this.f25397b = str;
            this.f25398c = backupAndRestoreActivity;
            this.f25399d = strArr;
            this.f25400e = editText;
        }

        public final void a(StorageDownloadFileResult storageDownloadFileResult) {
            BackupAndRestoreActivity.this.new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, storageDownloadFileResult.getFile().getParent());
        }

        public final void b(StorageException storageException) {
            BackupAndRestoreActivity.this.r = "405";
            c.h.a.h.n.e.I();
            try {
                BackupAndRestoreActivity.this.t.obtainMessage(1, BackupAndRestoreActivity.this.r).sendToTarget();
            } catch (Exception unused) {
            }
        }

        public final boolean c() {
            this.f25399d[0] = String.valueOf(this.f25400e.getText());
            String[] strArr = this.f25399d;
            if (strArr != null && strArr[0].equals(BuildConfig.FLAVOR)) {
                Toast.makeText(this.f25398c, BackupAndRestoreActivity.this.getResources().getString(R.string.enter_your_pin), 1).show();
                return false;
            }
            BackupAndRestoreActivity.this.s = this.f25399d[0];
            return true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c()) {
                BackupAndRestoreActivity.this.f25384g.dismiss();
                if (this.f25397b.equals("backup")) {
                    BackupAndRestoreActivity.this.new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                    return;
                }
                if (this.f25397b.equals("download")) {
                    Log.e("honey", "download backup started");
                    c.h.a.h.n.e.i0(this.f25398c);
                    String string = BackupAndRestoreActivity.this.f25391n.getString("username", BuildConfig.FLAVOR);
                    String string2 = BackupAndRestoreActivity.this.f25391n.getString("serverUrl", BuildConfig.FLAVOR);
                    String strP = c.h.a.h.n.e.P(string + "-" + string2);
                    String strP2 = c.h.a.h.n.e.P(string + "-" + string2 + "-" + BackupAndRestoreActivity.this.s + "*NB!@#12ZKWd");
                    try {
                        Amplify.Storage.downloadFile(strP + "/" + strP2 + ".zip", new File(BackupAndRestoreActivity.this.getApplicationContext().getFilesDir().getParent() + "/download.zip"), StorageDownloadFileOptions.defaultInstance(), new Consumer() { // from class: c.h.a.k.a.a
                            @Override // com.amplifyframework.core.Consumer
                            public final void accept(Object obj) {
                                Log.i("MyAmplifyApp", "Fraction completed: " + ((StorageTransferProgress) obj).getFractionCompleted());
                            }
                        }, new Consumer() { // from class: c.h.a.k.a.c
                            @Override // com.amplifyframework.core.Consumer
                            public final void accept(Object obj) {
                                this.f17357a.a((StorageDownloadFileResult) obj);
                            }
                        }, new Consumer() { // from class: c.h.a.k.a.b
                            @Override // com.amplifyframework.core.Consumer
                            public final void accept(Object obj) {
                                this.f17356a.b((StorageException) obj);
                            }
                        });
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BackupAndRestoreActivity.this.f25384g.dismiss();
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f25403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EditText f25404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f25405d;

        public g(String[] strArr, EditText editText, Activity activity) {
            this.f25403b = strArr;
            this.f25404c = editText;
            this.f25405d = activity;
        }

        public final boolean a() {
            this.f25403b[0] = String.valueOf(this.f25404c.getText());
            String[] strArr = this.f25403b;
            if (strArr != null && strArr[0].equals(BuildConfig.FLAVOR)) {
                Toast.makeText(this.f25405d, BackupAndRestoreActivity.this.getResources().getString(R.string.enter_your_pin), 1).show();
                return false;
            }
            BackupAndRestoreActivity.this.s = this.f25403b[0];
            return true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a()) {
                BackupAndRestoreActivity.this.f25384g.dismiss();
                BackupAndRestoreActivity.this.u = true;
                BackupAndRestoreActivity.this.new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    BackupAndRestoreActivity.this.R0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class i extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f25411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ImageView f25412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f25413g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f25414h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25416b;

            public a(View view) {
                this.f25416b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25416b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25416b.getTag().equals("1")) {
                        View view3 = this.f25416b;
                        if (view3 == null || view3.getTag() == null || !this.f25416b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = i.this.f25414h;
                    }
                    linearLayout = i.this.f25413g;
                } else {
                    View view4 = this.f25416b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25416b.getTag().equals("1")) {
                        View view5 = this.f25416b;
                        if (view5 == null || view5.getTag() == null || !this.f25416b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = i.this.f25414h;
                    }
                    linearLayout = i.this.f25413g;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public i(Activity activity) {
            super(activity);
            this.f25408b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            try {
                if (id == R.id.btn_forgot_pin) {
                    dismiss();
                    BackupAndRestoreActivity backupAndRestoreActivity = BackupAndRestoreActivity.this;
                    backupAndRestoreActivity.e1((BackupAndRestoreActivity) backupAndRestoreActivity.f25381d);
                } else if (id != R.id.btn_ok) {
                } else {
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        @SuppressLint({"SetTextI18n"})
        public void onCreate(Bundle bundle) {
            TextView textView;
            StringBuilder sb;
            Resources resources;
            int i2;
            String string;
            Resources resources2;
            int i3;
            super.onCreate(bundle);
            setContentView(BackupAndRestoreActivity.this.f25382e.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_s3_response_layout_tv : R.layout.custom_s3_response_layout);
            this.f25409c = (TextView) findViewById(R.id.btn_ok);
            this.f25410d = (TextView) findViewById(R.id.btn_forgot_pin);
            this.f25413g = (LinearLayout) findViewById(R.id.ll_forgot_pin_button_main_layout);
            this.f25414h = (LinearLayout) findViewById(R.id.ll_ok_button_main_layout);
            this.f25411e = (TextView) findViewById(R.id.tv_title);
            this.f25412f = (ImageView) findViewById(R.id.iv_image);
            String str = BackupAndRestoreActivity.this.r;
            int i4 = R.drawable.green_tick;
            if (str != null && BackupAndRestoreActivity.this.r.equals("uploaded")) {
                this.f25413g.setVisibility(8);
                textView = this.f25411e;
                resources2 = BackupAndRestoreActivity.this.getResources();
                i3 = R.string.backup_uploaded_successfully;
            } else {
                if (BackupAndRestoreActivity.this.r != null && BackupAndRestoreActivity.this.r.equals("downloaded")) {
                    try {
                        Log.e("honey", "restart your application");
                        this.f25413g.setVisibility(8);
                        this.f25411e.setText(BackupAndRestoreActivity.this.getResources().getString(R.string.backup_downloaded_successfully));
                        this.f25412f.setImageResource(R.drawable.green_tick);
                    } catch (Exception unused) {
                    }
                    this.f25409c.setOnClickListener(this);
                    this.f25410d.setOnClickListener(this);
                    TextView textView2 = this.f25409c;
                    textView2.setOnFocusChangeListener(new a(textView2));
                    TextView textView3 = this.f25410d;
                    textView3.setOnFocusChangeListener(new a(textView3));
                }
                String str2 = BackupAndRestoreActivity.this.r;
                i4 = R.drawable.warning_icon;
                if (str2 == null || !BackupAndRestoreActivity.this.r.equals("error3")) {
                    if (BackupAndRestoreActivity.this.r == null || !BackupAndRestoreActivity.this.r.equals("405")) {
                        this.f25413g.setVisibility(8);
                        textView = this.f25411e;
                        sb = new StringBuilder();
                        resources = BackupAndRestoreActivity.this.getResources();
                        i2 = R.string.error_uploading_backup;
                    } else {
                        this.f25413g.setVisibility(8);
                        textView = this.f25411e;
                        sb = new StringBuilder();
                        resources = BackupAndRestoreActivity.this.getResources();
                        i2 = R.string.backup_pin_incorrect_while_downloading;
                    }
                    sb.append(resources.getString(i2));
                    sb.append(" ");
                    sb.append(BackupAndRestoreActivity.this.r);
                    string = sb.toString();
                    textView.setText(string);
                    this.f25412f.setImageResource(i4);
                    this.f25409c.setOnClickListener(this);
                    this.f25410d.setOnClickListener(this);
                    TextView textView22 = this.f25409c;
                    textView22.setOnFocusChangeListener(new a(textView22));
                    TextView textView32 = this.f25410d;
                    textView32.setOnFocusChangeListener(new a(textView32));
                }
                this.f25413g.setVisibility(0);
                textView = this.f25411e;
                resources2 = BackupAndRestoreActivity.this.getResources();
                i3 = R.string.backup_pin_incorrect;
            }
            string = resources2.getString(i3);
            textView.setText(string);
            this.f25412f.setImageResource(i4);
            this.f25409c.setOnClickListener(this);
            this.f25410d.setOnClickListener(this);
            TextView textView222 = this.f25409c;
            textView222.setOnFocusChangeListener(new a(textView222));
            TextView textView322 = this.f25410d;
            textView322.setOnFocusChangeListener(new a(textView322));
        }
    }

    public static class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25418b;

        public j(View view) {
            this.f25418b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25418b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25418b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            View view3;
            View view4;
            View view5;
            View view6;
            View view7;
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(f2);
                b(f2);
                View view8 = this.f25418b;
                if ((view8 == null || view8.getTag() == null || !this.f25418b.getTag().equals("1")) && (((view2 = this.f25418b) == null || view2.getTag() == null || !this.f25418b.getTag().equals("8")) && (((view3 = this.f25418b) == null || view3.getTag() == null || !this.f25418b.getTag().equals("2")) && ((view4 = this.f25418b) == null || view4.getTag() == null || !this.f25418b.getTag().equals("9"))))) {
                    return;
                }
                this.f25418b.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            f2 = z ? 1.05f : 1.0f;
            View view9 = this.f25418b;
            if ((view9 == null || view9.getTag() == null || !this.f25418b.getTag().equals("1")) && ((view5 = this.f25418b) == null || view5.getTag() == null || !this.f25418b.getTag().equals("8"))) {
                View view10 = this.f25418b;
                if ((view10 == null || view10.getTag() == null || !this.f25418b.getTag().equals("2")) && ((view6 = this.f25418b) == null || view6.getTag() == null || !this.f25418b.getTag().equals("9"))) {
                    return;
                }
                a(f2);
                b(f2);
                view7 = this.f25418b;
                i2 = R.drawable.logout_btn_effect;
            } else {
                a(f2);
                b(f2);
                view7 = this.f25418b;
                i2 = R.drawable.blue_btn_effect;
            }
            view7.setBackgroundResource(i2);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class k extends AsyncTask<String, Void, Boolean> {
        public k() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(BackupAndRestoreActivity.this.f1());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                BackupAndRestoreActivity.this.j1();
            } else {
                c.h.a.h.n.e.I();
                Toast.makeText(BackupAndRestoreActivity.this.f25381d, "Error while uploading backup.", 0).show();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            c.h.a.h.n.e.j0(BackupAndRestoreActivity.this.f25381d);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class l extends AsyncTask<String, Void, Boolean> {
        public l() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return BackupAndRestoreActivity.this.g1(strArr[0]);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            try {
                File file = new File(BackupAndRestoreActivity.this.getFilesDir().getParent() + "/file.json");
                if (file.exists()) {
                    c.h.a.h.n.e.l(file);
                }
            } catch (Exception unused) {
            }
            Log.e("honey", "download backup done");
            BackupAndRestoreActivity.this.r = "downloaded";
            c.h.a.h.n.e.I();
            try {
                BackupAndRestoreActivity.this.t.obtainMessage(1, BackupAndRestoreActivity.this.r).sendToTarget();
            } catch (Exception unused2) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public final void M0(StorageException storageException) {
        this.r = "401";
        c.h.a.h.n.e.I();
        try {
            this.t.obtainMessage(1, this.r).sendToTarget();
        } catch (Exception unused) {
        }
    }

    public final void N0() {
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(com.amplifyframework.storage.result.StorageListResult r12) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.BackupAndRestoreActivity.O0(com.amplifyframework.storage.result.StorageListResult):void");
    }

    public final void P0(StorageException storageException) {
        try {
            File file = new File(getFilesDir().getParent() + "/backup_database.zip");
            if (file.exists()) {
                c.h.a.h.n.e.l(file);
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = new File(getFilesDir().getParent() + "/file.json");
            if (file2.exists()) {
                c.h.a.h.n.e.l(file2);
            }
        } catch (Exception unused2) {
        }
        Log.e("honey", "backup error");
        this.r = "404";
        c.h.a.h.n.e.I();
        try {
            this.t.obtainMessage(1, this.r).sendToTarget();
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final void Y0(StorageRemoveResult storageRemoveResult, String str) {
        File file = new File(getFilesDir().getParent() + "/backup_database.zip");
        if (file.exists()) {
            Amplify.Storage.uploadFile(this.q + "/" + str, file, new c.h.a.k.a.e(this), new c.h.a.k.a.i(this));
        }
    }

    public void R0() {
        runOnUiThread(new c());
    }

    public final void S0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new j(button));
            this.btSaveChanges.requestFocus();
            this.btSaveChanges.requestFocusFromTouch();
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new j(button2));
        }
    }

    public String T0(String str) {
        String[] strArrSplit = str.split("/");
        return strArrSplit.length == 0 ? BuildConfig.FLAVOR : strArrSplit[strArrSplit.length - 1];
    }

    public final void U0() {
        this.f25390m = new c.h.a.i.q.a(this.f25381d);
        this.f25389l = new c.h.a.i.q.f(this.f25381d);
        this.f25387j = new c.h.a.i.q.k(this.f25381d);
        this.f25388k = new c.h.a.i.q.l(this.f25381d);
        this.f25391n = getSharedPreferences("loginPrefs", 0);
    }

    @SuppressLint({"SetTextI18n"})
    public final void d1(BackupAndRestoreActivity backupAndRestoreActivity, String str) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) backupAndRestoreActivity.findViewById(R.id.rl_password_prompt);
            LayoutInflater layoutInflater = (LayoutInflater) backupAndRestoreActivity.getSystemService("layout_inflater");
            View viewInflate = this.f25382e.A().equals(c.h.a.h.n.a.s0) ? layoutInflater.inflate(R.layout.view_backup_pin_prompt_tv, relativeLayout) : layoutInflater.inflate(R.layout.view_backup_pin_prompt, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(backupAndRestoreActivity);
            this.f25384g = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f25384g.setWidth(-1);
            this.f25384g.setHeight(-1);
            this.f25384g.setFocusable(true);
            this.f25384g.showAtLocation(viewInflate, 17, 0, 0);
            this.f25385h = (Button) viewInflate.findViewById(R.id.bt_save_pin);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_pin_desc);
            if (str.equals("backup")) {
                ((TextView) viewInflate.findViewById(R.id.tv_backup_pin)).setText(getResources().getString(R.string.set_pin));
                textView.setVisibility(0);
                textView.setText(getResources().getString(R.string.backup_will_be_encrypted));
            } else if (str.equals("download")) {
                ((TextView) viewInflate.findViewById(R.id.tv_backup_pin)).setText(getResources().getString(R.string.download_backup));
                textView.setVisibility(8);
            }
            this.f25386i = (Button) viewInflate.findViewById(R.id.bt_close);
            Button button = this.f25385h;
            if (button != null) {
                button.setOnFocusChangeListener(new j(button));
            }
            Button button2 = this.f25386i;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new j(button2));
            }
            EditText editText = (EditText) viewInflate.findViewById(R.id.et_pin);
            if (backupAndRestoreActivity.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
            }
            this.f25386i.setOnClickListener(new d());
            this.f25385h.setOnClickListener(new e(str, backupAndRestoreActivity, new String[1], editText));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void e1(Activity activity) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.rl_password_prompt);
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            View viewInflate = this.f25382e.A().equals(c.h.a.h.n.a.s0) ? layoutInflater.inflate(R.layout.view_backup_pin_prompt_tv, relativeLayout) : layoutInflater.inflate(R.layout.view_backup_pin_prompt, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f25384g = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f25384g.setWidth(-1);
            this.f25384g.setHeight(-1);
            this.f25384g.setFocusable(true);
            this.f25384g.showAtLocation(viewInflate, 17, 0, 0);
            EditText editText = (EditText) viewInflate.findViewById(R.id.et_pin);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_pin_desc);
            textView.setText(getResources().getString(R.string.updating_new_pin_delete_pre_back));
            textView.setTextColor(getResources().getColor(R.color.red));
            editText.setHint(getResources().getString(R.string.enter_your_new_pin));
            this.f25385h = (Button) viewInflate.findViewById(R.id.bt_save_pin);
            this.f25386i = (Button) viewInflate.findViewById(R.id.bt_close);
            Button button = this.f25385h;
            if (button != null) {
                button.setOnFocusChangeListener(new j(button));
            }
            Button button2 = this.f25386i;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new j(button2));
            }
            if (activity.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
            }
            this.f25386i.setOnClickListener(new f());
            this.f25385h.setOnClickListener(new g(new String[1], editText, activity));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final boolean f1() {
        boolean z;
        boolean z2;
        Log.e("honey", "backup started");
        this.r = BuildConfig.FLAVOR;
        try {
            ArrayList<c.h.a.i.b> arrayListQ = this.f25390m.q();
            ArrayList<c.h.a.i.b> arrayListY0 = this.f25389l.Y0();
            ArrayList<c.h.a.i.f> arrayListT = this.f25387j.t();
            ArrayList<GetEpisdoeDetailsCallback> arrayListQ2 = this.f25388k.q();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("favourites_live", BuildConfig.FLAVOR);
            } catch (Exception unused) {
            }
            try {
                jSONObject.put("favourites_movies", BuildConfig.FLAVOR);
            } catch (Exception unused2) {
            }
            try {
                jSONObject.put("favourites_series", BuildConfig.FLAVOR);
            } catch (Exception unused3) {
            }
            try {
                jSONObject.put("channels_history", BuildConfig.FLAVOR);
            } catch (Exception unused4) {
            }
            try {
                jSONObject.put("movies_continue_watching", BuildConfig.FLAVOR);
            } catch (Exception unused5) {
            }
            try {
                jSONObject.put("series_continue_watching", BuildConfig.FLAVOR);
            } catch (Exception unused6) {
            }
            try {
                jSONObject.put("getRecentlyAddedLimit", String.valueOf(this.f25382e.y()));
            } catch (Exception unused7) {
            }
            try {
                jSONObject.put("getAutoClearCache", String.valueOf(this.f25382e.c()));
            } catch (Exception unused8) {
            }
            try {
                jSONObject.put("getShowEPGInChannelsList", String.valueOf(this.f25382e.B()));
            } catch (Exception unused9) {
            }
            try {
                jSONObject.put("getAutoplayChannelInLive", String.valueOf(this.f25382e.i()));
            } catch (Exception unused10) {
            }
            try {
                jSONObject.put("getRecentlyWatchedLimitLive", String.valueOf(this.f25382e.z()));
            } catch (Exception unused11) {
            }
            try {
                jSONObject.put("getAutoPlayEpisode", this.f25382e.d());
            } catch (Exception unused12) {
            }
            try {
                jSONObject.put("getAutoStartOnBoot", String.valueOf(this.f25382e.f().booleanValue()));
            } catch (Exception unused13) {
            }
            try {
                jSONObject.put("getfullEPG", String.valueOf(this.f25382e.H().booleanValue()));
            } catch (Exception unused14) {
            }
            try {
                jSONObject.put("getActiveSubtitle", String.valueOf(this.f25382e.b().booleanValue()));
            } catch (Exception unused15) {
            }
            try {
                jSONObject.put("getAutoPlayNextEpisode", String.valueOf(this.f25382e.e().booleanValue()));
            } catch (Exception unused16) {
            }
            if (arrayListQ != null && arrayListQ.size() > 0) {
                for (int i2 = 0; i2 < arrayListQ.size(); i2++) {
                    if (arrayListQ.get(i2).f() != null && arrayListQ.get(i2).f().equals("live")) {
                        try {
                            jSONObject.put("favourites_live", arrayListQ.get(i2).b());
                        } catch (Exception unused17) {
                        }
                    } else if (arrayListQ.get(i2).f() != null && arrayListQ.get(i2).f().equals("vod")) {
                        jSONObject.put("favourites_movies", arrayListQ.get(i2).b());
                    } else if (arrayListQ.get(i2).f() != null && arrayListQ.get(i2).f().equals("series")) {
                        jSONObject.put("favourites_series", arrayListQ.get(i2).b());
                    }
                }
            }
            if (arrayListY0 != null && arrayListY0.size() > 0) {
                for (int i3 = 0; i3 < arrayListY0.size(); i3++) {
                    if (arrayListY0.get(i3).f() != null && arrayListY0.get(i3).f().equals("api")) {
                        try {
                            jSONObject.put("channels_history", arrayListY0.get(i3).b());
                        } catch (Exception unused18) {
                        }
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            if (arrayListT == null || arrayListT.size() <= 0) {
                z = false;
            } else {
                int i4 = 0;
                z = false;
                while (i4 < arrayListT.size()) {
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("stream_id", arrayListT.get(i4).Y());
                    } catch (Exception unused19) {
                    }
                    try {
                        jSONObject3.put("movie_elapsed_time", arrayListT.get(i4).O());
                    } catch (Exception unused20) {
                    }
                    try {
                        jSONObject3.put("movie_duration", arrayListT.get(i4).N());
                    } catch (Exception unused21) {
                    }
                    try {
                        jSONObject3.put("is_watched", arrayListT.get(i4).L());
                    } catch (Exception unused22) {
                    }
                    try {
                        jSONObject2.put(String.valueOf(i4), jSONObject3);
                    } catch (Exception unused23) {
                    }
                    i4++;
                    z = true;
                }
            }
            if (z) {
                try {
                    jSONObject.put("movies_continue_watching", jSONObject2);
                } catch (Exception unused24) {
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            if (arrayListQ2 == null || arrayListQ2.size() <= 0) {
                z2 = false;
            } else {
                z2 = false;
                for (int i5 = 0; i5 < arrayListQ2.size(); i5++) {
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("episode_id", arrayListQ2.get(i5).j());
                        jSONObject5.put("episode_name", arrayListQ2.get(i5).u());
                        jSONObject5.put("container_extension", arrayListQ2.get(i5).c());
                        jSONObject5.put("added", arrayListQ2.get(i5).a());
                        jSONObject5.put("elapsed_time", arrayListQ2.get(i5).g());
                        jSONObject5.put("image", arrayListQ2.get(i5).n());
                        jSONObject5.put("series_main_image", arrayListQ2.get(i5).m());
                        jSONObject5.put("is_recent_watched", arrayListQ2.get(i5).l());
                        jSONObject5.put("season_num", arrayListQ2.get(i5).p());
                        jSONObject5.put("episode_num", arrayListQ2.get(i5).h());
                        jSONObject5.put("episode_duration_sec", arrayListQ2.get(i5).f());
                        jSONObject5.put("series_id", arrayListQ2.get(i5).r());
                        try {
                            jSONObject4.put(String.valueOf(i5), jSONObject5);
                        } catch (Exception unused25) {
                        }
                        z2 = true;
                    } catch (Exception unused26) {
                    }
                }
            }
            if (z2) {
                try {
                    jSONObject.put("series_continue_watching", jSONObject4);
                } catch (Exception unused27) {
                }
            }
            try {
                File file = new File(getFilesDir().getParent() + "/file.json");
                if (file.exists()) {
                    c.h.a.h.n.e.l(file);
                }
            } catch (Exception unused28) {
            }
            try {
                FileWriter fileWriter = new FileWriter(new File(getFilesDir().getParent(), "file.json"));
                fileWriter.write(jSONObject.toString());
                fileWriter.close();
            } catch (Exception unused29) {
            }
            try {
                File file2 = new File(getFilesDir().getParent() + "/backup_database.zip");
                if (file2.exists()) {
                    c.h.a.h.n.e.l(file2);
                }
            } catch (Exception unused30) {
            }
            String str = this.f25381d.getApplicationInfo().dataDir;
            StringBuilder sb = new StringBuilder();
            sb.append(getFilesDir().getParent());
            sb.append("/backup_database.zip");
            return l1(str, sb.toString());
        } catch (Exception unused31) {
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:0|2|411|3|(1:5)|419|6|(3:361|7|(1:9))|10|(4:370|11|(2:13|(1:(1:21))(1:17))|369)|(3:392|22|(2:24|(1:(1:32))(1:28)))|(3:350|33|(2:35|(1:(1:43))(1:39)))|(3:386|44|(1:46))|(3:382|47|(1:49))|(3:384|50|(3:52|(1:(1:61))(1:56)|57))|403|63|(3:65|(1:(1:74))(1:69)|70)|(3:342|76|(3:78|(1:(1:87))(1:82)|83))|(3:393|89|(3:91|(1:(1:100))(1:95)|96))|102|(1:(1:124)(1:123))(1:116)|125|(1:127)|128|(1:132)|133|(1:138)|(1:(21:(1:154)|155|(1:157)|158|(1:167)|168|(1:170)|395|171|(5:175|(2:177|423)(2:178|422)|179|172|173)|421|180|(2:182|(3:184|(3:188|(4:191|(7:380|193|344|194|415|195|425)(1:426)|196|189)|424)|(1:200)))|201|(1:203)|204|(7:205|206|(4:399|208|(2:210|429)(2:211|428)|212)(1:427)|339|308|310|311)|213|(5:215|216|401|217|(4:219|(3:223|(4:226|(2:227|(1:(2:435|299)(56:397|232|363|235|353|238|239|346|240|407|244|245|388|246|374|250|251|365|252|357|256|257|348|258|409|262|263|390|264|376|268|269|367|270|359|274|275|351|276|413|280|281|405|282|378|286|287|372|288|340|292|293|355|294|298|432))(3:433|300|431))|301|224)|430)|302|(3:304|417|305)(1:308))(1:307))(0)|310|311)(1:150))(1:145)|146|155|(0)|158|(4:161|163|165|167)|168|(0)|395|171|(2:172|173)|421|180|(0)|201|(0)|204|(8:205|206|(0)(0)|339|308|310|311|212)|213|(0)(0)|310|311) */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c8 A[Catch: Exception -> 0x0802, TryCatch #40 {Exception -> 0x0802, blocks: (B:6:0x0047, B:104:0x021c, B:107:0x0224, B:125:0x0260, B:127:0x0264, B:128:0x026f, B:130:0x0274, B:132:0x027a, B:133:0x0280, B:136:0x0287, B:138:0x028d, B:140:0x0295, B:143:0x029d, B:145:0x02a3, B:146:0x02a8, B:155:0x02c4, B:157:0x02c8, B:158:0x02cb, B:161:0x02d1, B:163:0x02d7, B:165:0x02df, B:167:0x02e5, B:168:0x02ea, B:170:0x02ee, B:201:0x0415, B:203:0x0419, B:204:0x041c, B:205:0x0435, B:148:0x02ae, B:150:0x02b4, B:152:0x02b9, B:154:0x02bf, B:111:0x022d, B:114:0x0235, B:118:0x023e, B:121:0x0246, B:123:0x024c), top: B:419:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ee A[Catch: Exception -> 0x0802, TRY_LEAVE, TryCatch #40 {Exception -> 0x0802, blocks: (B:6:0x0047, B:104:0x021c, B:107:0x0224, B:125:0x0260, B:127:0x0264, B:128:0x026f, B:130:0x0274, B:132:0x027a, B:133:0x0280, B:136:0x0287, B:138:0x028d, B:140:0x0295, B:143:0x029d, B:145:0x02a3, B:146:0x02a8, B:155:0x02c4, B:157:0x02c8, B:158:0x02cb, B:161:0x02d1, B:163:0x02d7, B:165:0x02df, B:167:0x02e5, B:168:0x02ea, B:170:0x02ee, B:201:0x0415, B:203:0x0419, B:204:0x041c, B:205:0x0435, B:148:0x02ae, B:150:0x02b4, B:152:0x02b9, B:154:0x02bf, B:111:0x022d, B:114:0x0235, B:118:0x023e, B:121:0x0246, B:123:0x024c), top: B:419:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x031e A[Catch: Exception -> 0x0415, TRY_ENTER, TryCatch #28 {Exception -> 0x0415, blocks: (B:171:0x02f9, B:172:0x0312, B:175:0x031e, B:177:0x0331, B:180:0x0396, B:182:0x039c, B:184:0x03ab, B:186:0x03b1, B:189:0x03b8, B:191:0x03be, B:198:0x040a, B:200:0x0410), top: B:395:0x02f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x039c A[Catch: Exception -> 0x0415, TryCatch #28 {Exception -> 0x0415, blocks: (B:171:0x02f9, B:172:0x0312, B:175:0x031e, B:177:0x0331, B:180:0x0396, B:182:0x039c, B:184:0x03ab, B:186:0x03b1, B:189:0x03b8, B:191:0x03be, B:198:0x040a, B:200:0x0410), top: B:395:0x02f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0419 A[Catch: Exception -> 0x0802, TryCatch #40 {Exception -> 0x0802, blocks: (B:6:0x0047, B:104:0x021c, B:107:0x0224, B:125:0x0260, B:127:0x0264, B:128:0x026f, B:130:0x0274, B:132:0x027a, B:133:0x0280, B:136:0x0287, B:138:0x028d, B:140:0x0295, B:143:0x029d, B:145:0x02a3, B:146:0x02a8, B:155:0x02c4, B:157:0x02c8, B:158:0x02cb, B:161:0x02d1, B:163:0x02d7, B:165:0x02df, B:167:0x02e5, B:168:0x02ea, B:170:0x02ee, B:201:0x0415, B:203:0x0419, B:204:0x041c, B:205:0x0435, B:148:0x02ae, B:150:0x02b4, B:152:0x02b9, B:154:0x02bf, B:111:0x022d, B:114:0x0235, B:118:0x023e, B:121:0x0246, B:123:0x024c), top: B:419:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x059b A[Catch: Exception -> 0x07ff, TRY_LEAVE, TryCatch #30 {Exception -> 0x07ff, blocks: (B:208:0x0459, B:210:0x0472, B:213:0x058b, B:215:0x059b, B:221:0x05bf, B:223:0x05c5, B:224:0x05cd, B:226:0x05d3, B:227:0x05ec, B:230:0x05f4, B:298:0x06f4, B:299:0x0775, B:302:0x07ee), top: B:399:0x0459 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0459 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x058b A[EDGE_INSN: B:427:0x058b->B:213:0x058b BREAK  A[LOOP:2: B:205:0x0435->B:212:0x057e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean g1(java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 2054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.BackupAndRestoreActivity.g1(java.lang.String):java.lang.Boolean");
    }

    public final void h1(StorageException storageException) {
        try {
            File file = new File(getFilesDir().getParent() + "/backup_database.zip");
            if (file.exists()) {
                c.h.a.h.n.e.l(file);
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = new File(getFilesDir().getParent() + "/file.json");
            if (file2.exists()) {
                c.h.a.h.n.e.l(file2);
            }
        } catch (Exception unused2) {
        }
        Log.e("honey", "backup error");
        this.r = "403";
        c.h.a.h.n.e.I();
        try {
            this.t.obtainMessage(1, this.r).sendToTarget();
        } catch (Exception unused3) {
        }
    }

    public final boolean i1(String str, String str2) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str + str2)));
            byte[] bArr = new byte[1024];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return true;
                }
                String name = nextEntry.getName();
                if (name.contains("/com.nst.iptvsmarterstvbox/")) {
                    name = name.replaceAll("/com.nst.iptvsmarterstvbox/", BuildConfig.FLAVOR);
                }
                if (nextEntry.isDirectory()) {
                    new File(str + name).mkdirs();
                } else {
                    FileOutputStream fileOutputStream = new FileOutputStream(str + name);
                    while (true) {
                        int i2 = zipInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i2);
                    }
                    fileOutputStream.close();
                    zipInputStream.closeEntry();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void j1() {
        try {
            this.f25392o = this.f25391n.getString("username", BuildConfig.FLAVOR);
            this.p = this.f25391n.getString("serverUrl", BuildConfig.FLAVOR);
            String strP = c.h.a.h.n.e.P(this.f25392o + "-" + this.p);
            this.q = strP;
            Amplify.Storage.list(strP, new Consumer() { // from class: c.h.a.k.a.h
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    this.f17363a.O0((StorageListResult) obj);
                }
            }, new Consumer() { // from class: c.h.a.k.a.g
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    this.f17362a.M0((StorageException) obj);
                }
            });
        } catch (Exception e2) {
            Log.e("Exception", "Upload failed", e2);
            try {
                File file = new File(getFilesDir().getParent() + "/backup_database.zip");
                if (file.exists()) {
                    c.h.a.h.n.e.l(file);
                }
            } catch (Exception unused) {
            }
            try {
                File file2 = new File(getFilesDir().getParent() + "/file.json");
                if (file2.exists()) {
                    c.h.a.h.n.e.l(file2);
                }
            } catch (Exception unused2) {
            }
            this.r = "402";
            c.h.a.h.n.e.I();
            try {
                this.t.obtainMessage(1, this.r).sendToTarget();
            } catch (Exception unused3) {
            }
        }
    }

    public final void k1(StorageUploadFileResult storageUploadFileResult) {
        try {
            File file = new File(getFilesDir().getParent() + "/backup_database.zip");
            if (file.exists()) {
                c.h.a.h.n.e.l(file);
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = new File(getFilesDir().getParent() + "/file.json");
            if (file2.exists()) {
                c.h.a.h.n.e.l(file2);
            }
        } catch (Exception unused2) {
        }
        Log.e("honey", "backup finished");
        this.r = "uploaded";
        c.h.a.h.n.e.I();
        try {
            this.t.obtainMessage(1, this.r).sendToTarget();
        } catch (Exception unused3) {
        }
    }

    public boolean l1(String str, String str2) {
        File file = new File(str);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str2)));
            if (!file.isDirectory()) {
                byte[] bArr = new byte[2048];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str), 2048);
                ZipEntry zipEntry = new ZipEntry(T0(str));
                zipEntry.setTime(file.lastModified());
                zipOutputStream.putNextEntry(zipEntry);
                while (true) {
                    int i2 = bufferedInputStream.read(bArr, 0, 2048);
                    if (i2 == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, i2);
                }
            } else {
                m1(zipOutputStream, file, file.getParent().length());
            }
            zipOutputStream.close();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void m1(ZipOutputStream zipOutputStream, File file, int i2) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory() && file2.getName().equals("shared_prefs")) {
                if (file2.isDirectory()) {
                    m1(zipOutputStream, file2, i2);
                }
            } else if (!file2.isDirectory() && !file2.getName().equals("backup_database.zip") && (file2.getName().equals("Accept_clicked.xml") || file2.getName().equals("allowedFormat.xml") || file2.getName().equals("automation_channels.xml") || file2.getName().equals("automation_epg.xml") || file2.getName().equals("cacheClearCount.xml") || file2.getName().equals("epgchannelupdate.xml") || file2.getName().equals("pref.using_infbuf.xml") || file2.getName().equals("pref.using_media_codec.xml") || file2.getName().equals("pref.using_opengl.xml") || file2.getName().equals("pref.using_opensl_es.xml") || file2.getName().equals("pref.using_buffer_size") || file2.getName().equals("timeFormat.xml") || file2.getName().equals("showPopup.xml") || file2.getName().equals("file.json"))) {
                try {
                    byte[] bArr = new byte[2048];
                    String path = file2.getPath();
                    String strSubstring = path.substring(i2);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path), 2048);
                    ZipEntry zipEntry = new ZipEntry(strSubstring);
                    zipEntry.setTime(file2.lastModified());
                    zipOutputStream.putNextEntry(zipEntry);
                    while (true) {
                        int i3 = bufferedInputStream.read(bArr, 0, 2048);
                        if (i3 == -1) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, i3);
                        }
                    }
                    bufferedInputStream.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_header_title) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25381d = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25381d);
        this.f25382e = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_backup_and_restore_tv : R.layout.activity_backup_and_restore);
        ButterKnife.a(this);
        U0();
        S0();
        try {
            this.t = new a(Looper.getMainLooper());
        } catch (Exception unused) {
        }
        N0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        Thread thread = this.f25383f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new h());
            this.f25383f = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new b());
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f25383f;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f25383f.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f25383f;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new h());
            this.f25383f = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f25381d);
    }

    @OnClick
    public void onViewClicked(View view) {
        String str;
        int id = view.getId();
        if (id == R.id.bt_backup_now) {
            str = "backup";
        } else if (id != R.id.bt_restore_from_cloud) {
            return;
        } else {
            str = "download";
        }
        d1(this, str);
    }
}
