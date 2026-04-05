package minefarts.iptvsmarters.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import c.h.a.i.i;
import c.h.a.i.q.f;
import c.h.a.i.q.g;
import c.h.a.i.q.m;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.utility.LoadingGearSpinner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ImportM3uActivity extends a.b.k.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f25697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f25698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f25699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.h.a.k.g.a f25700h = new c.h.a.k.g.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f25701i;

    @BindView
    public LoadingGearSpinner ivGearLoader;

    @BindView
    public ProgressBar progressBar;

    @BindView
    public RelativeLayout rlImportLayout;

    @BindView
    public LinearLayout rlImportProcess;

    @BindView
    public TextView tvCountings;

    @BindView
    public TextView tvImportingStreams;

    @BindView
    public TextView tvPercentage;

    @BindView
    public TextView tvSettingStreams;

    @SuppressLint({"StaticFieldLeak"})
    public class b extends AsyncTask<String, String, Boolean> {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            File file;
            try {
                URL url = new URL(strArr[0]);
                ImportM3uActivity.this.C0();
                if (Build.VERSION.SDK_INT >= 19) {
                    file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                } else {
                    file = new File(Environment.getExternalStorageDirectory() + "/Documents", "IPTVSmarters");
                }
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(ImportM3uActivity.this.f25696d.getFilesDir() + "/data_temp.txt");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(ImportM3uActivity.this.f25696d.getFilesDir() + "/data_temp.txt").toString())));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedWriter.write(sb.toString());
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        return Boolean.TRUE;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
            } catch (Exception e3) {
                Log.d("Google", "DownloadFileFromUrl " + e3.getMessage());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (!bool.booleanValue()) {
                    e.l0(ImportM3uActivity.this.f25696d, "Incorrect File/URL");
                    ImportM3uActivity.this.onBackPressed();
                    return;
                }
                ImportM3uActivity importM3uActivity = ImportM3uActivity.this;
                TextView textView = importM3uActivity.tvImportingStreams;
                if (textView != null) {
                    textView.setText(importM3uActivity.getResources().getString(R.string.importign_all_channels));
                }
                ImportM3uActivity.this.new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ImportM3uActivity.this.f25696d.getFilesDir() + "/data_temp.txt");
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(String... strArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class c extends AsyncTask<String, Void, Boolean> {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                ImportM3uActivity.this.f25699g = new FileInputStream(new File(strArr[0]));
                ImportM3uActivity importM3uActivity = ImportM3uActivity.this;
                if (importM3uActivity.f25700h.d(importM3uActivity.f25699g, importM3uActivity.f25696d)) {
                    ImportM3uActivity.this.f25697e.E0();
                    ImportM3uActivity.this.f25697e.H0();
                }
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            } catch (OutOfMemoryError unused2) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            Intent intent;
            super.onPostExecute(bool);
            try {
                File file = new File(ImportM3uActivity.this.f25696d.getFilesDir() + "/data_temp.txt");
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            if (bool.booleanValue()) {
                f fVar = ImportM3uActivity.this.f25697e;
                if (fVar != null) {
                    fVar.u2("all", "1");
                }
                SharedPreferences sharedPreferences = ImportM3uActivity.this.getSharedPreferences("loginPrefs", 0);
                sharedPreferences.getString("username", BuildConfig.FLAVOR);
                sharedPreferences.getString("password", BuildConfig.FLAVOR);
                String string = sharedPreferences.getString("serverUrl", BuildConfig.FLAVOR);
                sharedPreferences.getString("serverM3UUrl", BuildConfig.FLAVOR);
                sharedPreferences.getString("anyName", "M3ULine");
                if (!string.startsWith("http://") && !string.startsWith("https://")) {
                    String str = "http://" + string;
                }
                m.N("m3u", ImportM3uActivity.this.f25696d);
                ImportM3uActivity.this.f25701i = new g(ImportM3uActivity.this.f25696d);
                if (ImportM3uActivity.this.f25696d == null) {
                    return;
                } else {
                    intent = new Intent(ImportM3uActivity.this.f25696d, (Class<?>) NewDashboardActivity.class);
                }
            } else {
                f fVar2 = ImportM3uActivity.this.f25697e;
                if (fVar2 != null) {
                    fVar2.u2("all", "2");
                }
                if (ImportM3uActivity.this.f25696d == null) {
                    return;
                } else {
                    intent = new Intent(ImportM3uActivity.this.f25696d, (Class<?>) NewDashboardActivity.class);
                }
            }
            ImportM3uActivity.this.startActivity(intent);
            ImportM3uActivity.this.finish();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            f fVar = ImportM3uActivity.this.f25697e;
            if (fVar != null) {
                fVar.u2("all", "3");
            }
        }
    }

    public void A0() {
        f fVar = this.f25697e;
        if (fVar != null) {
            fVar.e2();
        }
    }

    public final void B0() {
        Intent intent;
        File file;
        if (this.f25696d != null) {
            this.f25698f = getSharedPreferences("loginPrefs", 0);
            ArrayList<i> arrayListR = this.f25701i.r(m.z(this.f25696d));
            if (arrayListR == null || arrayListR.size() <= 0) {
                Context context = this.f25696d;
                e.l0(context, context.getResources().getString(R.string.user_not_found));
                intent = new Intent(this.f25696d, (Class<?>) NewDashboardActivity.class);
            } else {
                String strB = arrayListR.get(0).b();
                if (Build.VERSION.SDK_INT >= 19) {
                    file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                } else {
                    file = new File(Environment.getExternalStorageDirectory() + "/Documents", "IPTVSmarters");
                }
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (arrayListR.get(0).a().equals(TransferTable.COLUMN_FILE)) {
                    if (!strB.equals(BuildConfig.FLAVOR)) {
                        TextView textView = this.tvImportingStreams;
                        if (textView != null) {
                            textView.setText(getResources().getString(R.string.importign_all_channels));
                        }
                        new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, strB);
                        return;
                    }
                    Context context2 = this.f25696d;
                    e.l0(context2, context2.getResources().getString(R.string.m3u_file_not_found));
                    intent = new Intent(this.f25696d, (Class<?>) NewDashboardActivity.class);
                } else if (!strB.equals(BuildConfig.FLAVOR)) {
                    new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, strB);
                    return;
                } else {
                    Context context3 = this.f25696d;
                    e.l0(context3, context3.getResources().getString(R.string.m3u_line_not_found));
                    intent = new Intent(this.f25696d, (Class<?>) NewDashboardActivity.class);
                }
            }
            startActivity(intent);
            finish();
        }
    }

    public void C0() {
        if (Build.VERSION.SDK_INT < 23 || a.i.i.b.a(this, "android.permission.READ_EXTERNAL_STORAGEandroid.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
        } else {
            Log.v("TAG", "Permission is revoked");
            a.i.h.a.q(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_import_m3u);
        ButterKnife.a(this);
        z0();
        getWindow().setFlags(1024, 1024);
        this.f25696d = this;
        this.f25697e = new f(this.f25696d);
        this.f25701i = new g(this.f25696d);
        if (this.f25697e.C1("m3u") == 0) {
            ArrayList<c.h.a.i.q.e> arrayList = new ArrayList<>();
            c.h.a.i.q.e eVar = new c.h.a.i.q.e();
            eVar.l("all");
            eVar.j("0");
            eVar.g(BuildConfig.FLAVOR);
            arrayList.add(0, eVar);
            this.f25697e.b2(arrayList, "m3u");
        }
        A0();
        B0();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        e.g(this.f25696d);
        getWindow().setFlags(1024, 1024);
    }

    public final void z0() {
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
}
