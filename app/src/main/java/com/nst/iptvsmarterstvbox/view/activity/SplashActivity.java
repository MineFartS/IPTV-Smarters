package com.nst.iptvsmarterstvbox.view.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import c.h.a.i.q.m;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.miscelleneious.StopProcessingTasksService;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SplashActivity extends a.b.k.c implements c.h.a.k.f.f, c.h.a.f.c<String> {
    public SharedPreferences A;
    public SharedPreferences.Editor B;
    public SharedPreferences.Editor C;
    public SharedPreferences.Editor D;
    public SharedPreferences E;
    public SharedPreferences F;
    public SharedPreferences G;
    public SharedPreferences H;
    public SharedPreferences I;
    public SharedPreferences.Editor J;
    public SharedPreferences.Editor K;
    public SharedPreferences.Editor L;
    public SharedPreferences.Editor M;
    public SharedPreferences.Editor N;
    public SharedPreferences O;
    public SharedPreferences.Editor P;
    public c.h.a.i.q.f Q;
    public SharedPreferences R;
    public String T;
    public String U;
    public String V;
    public c.h.a.j.c X;
    public InputStream Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f26713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f26714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f26715f;
    public String f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.i.q.g f26716g;
    public LinearLayout g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences f26717h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f26720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f26721l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VideoView f26723n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.h.a.k.d.a.a f26724o;
    public String p;
    public String q;
    public String r;
    public int s;
    public String t;
    public String u;
    public Boolean y;
    public SharedPreferences z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f26718i = Boolean.FALSE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26719j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26722m = 0;
    public String v = BuildConfig.FLAVOR;
    public String w = BuildConfig.FLAVOR;
    public long x = -1;
    public ArrayList<String> S = new ArrayList<>();
    public int W = 1500;
    public final c.h.a.k.g.a Z = new c.h.a.k.g.a();

    public class a implements MediaPlayer.OnCompletionListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            SplashActivity.this.W = 0;
            SplashActivity.this.Q0();
        }
    }

    public class b implements MediaPlayer.OnPreparedListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            SplashActivity splashActivity = SplashActivity.this;
            splashActivity.f26723n.seekTo(splashActivity.f26722m);
            SplashActivity splashActivity2 = SplashActivity.this;
            int i2 = splashActivity2.f26722m;
            VideoView videoView = splashActivity2.f26723n;
            if (i2 == 0) {
                videoView.start();
            } else {
                videoView.pause();
                SplashActivity.this.Q0();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashActivity.this.R0();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashActivity.this.R0();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashActivity.this.R0();
        }
    }

    public class f extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f26730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f26731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f26732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f26733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f26734f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f26736b;

            public a(View view) {
                this.f26736b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f26736b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f26736b.getTag().equals("1")) {
                        View view3 = this.f26736b;
                        if (view3 == null || view3.getTag() == null || !this.f26736b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = f.this.f26734f;
                    }
                    linearLayout = f.this.f26733e;
                } else {
                    View view4 = this.f26736b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f26736b.getTag().equals("1")) {
                        View view5 = this.f26736b;
                        if (view5 == null || view5.getTag() == null || !this.f26736b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = f.this.f26734f;
                    }
                    linearLayout = f.this.f26733e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public f(Activity activity) {
            super(activity);
            this.f26730b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            try {
                if (id == R.id.btn_close) {
                    dismiss();
                    SplashActivity.this.finishAffinity();
                } else {
                    if (id != R.id.btn_try_again) {
                        return;
                    }
                    dismiss();
                    SplashActivity.this.new h().execute(new Void[0]);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(SplashActivity.this.f26724o.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_internet_not_working_layout_tv : R.layout.custom_internet_not_working_layout);
            this.f26731c = (TextView) findViewById(R.id.btn_try_again);
            this.f26732d = (TextView) findViewById(R.id.btn_close);
            this.f26733e = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f26734f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f26731c.setOnClickListener(this);
            this.f26732d.setOnClickListener(this);
            TextView textView = this.f26731c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f26732d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class g extends AsyncTask<String, String, Boolean> {
        public g() {
        }

        public /* synthetic */ g(SplashActivity splashActivity, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            File file;
            try {
                URL url = new URL(strArr[0]);
                SplashActivity.this.S0();
                if (Build.VERSION.SDK_INT >= 19) {
                    file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                } else {
                    file = new File(Environment.getExternalStorageDirectory() + "/Documents", "IPTVSmarters");
                }
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(SplashActivity.this.f26715f.getFilesDir() + "/data_temp.txt");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(SplashActivity.this.f26715f.getFilesDir() + "/data_temp.txt").toString())));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!(((!line.contains("http://") || line.contains("tvg-logo")) && (!line.contains("https://") || line.contains("tvg-logo"))) ? BuildConfig.FLAVOR : line).equals(BuildConfig.FLAVOR)) {
                        sb.append(line);
                        break;
                    }
                }
                bufferedWriter.write(sb.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
                return Boolean.TRUE;
            } catch (Exception e3) {
                Log.d("Google", "DownloadFileFromUrl " + e3.getMessage());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    SplashActivity.this.A0();
                    return;
                }
                Context context = SplashActivity.this.f26715f;
                c.h.a.h.n.e.l0(context, context.getResources().getString(R.string.file_url_not_valid));
                SplashActivity.this.startActivity(c.h.a.h.n.a.f17039c.booleanValue() ? new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class) : new Intent(SplashActivity.this, (Class<?>) RoutingActivity.class));
                SplashActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                SplashActivity.this.finish();
            } catch (Exception unused) {
                Context context2 = SplashActivity.this.f26715f;
                c.h.a.h.n.e.l0(context2, context2.getResources().getString(R.string.file_url_not_valid));
                SplashActivity.this.startActivity(c.h.a.h.n.a.f17039c.booleanValue() ? new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class) : new Intent(SplashActivity.this, (Class<?>) RoutingActivity.class));
                SplashActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                SplashActivity.this.finish();
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
    public class h extends AsyncTask<Void, Boolean, Boolean> {
        public h() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod("HEAD");
                httpURLConnection.setReadTimeout(1500);
                httpURLConnection.setConnectTimeout(1500);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e2) {
                Log.e("LOG_TAG", e2.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                SplashActivity.this.A0();
                return;
            }
            SplashActivity splashActivity = SplashActivity.this;
            f fVar = splashActivity.new f((Activity) splashActivity.f26715f);
            fVar.setCancelable(false);
            fVar.show();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class i extends AsyncTask<Void, Boolean, Boolean> {
        public i() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod("HEAD");
                httpURLConnection.setReadTimeout(1500);
                httpURLConnection.setConnectTimeout(1500);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e2) {
                Log.e("LOG_TAG", e2.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new j(SplashActivity.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, SplashActivity.this.V);
                return;
            }
            SplashActivity splashActivity = SplashActivity.this;
            f fVar = splashActivity.new f((Activity) splashActivity.f26715f);
            fVar.setCancelable(false);
            fVar.show();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class j extends AsyncTask<String, Void, Boolean> {
        public j() {
        }

        public /* synthetic */ j(SplashActivity splashActivity, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod(ClientConstants.HTTP_REQUEST_TYPE_POST);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                return Boolean.valueOf(responseCode == 200 || responseCode == 405 || responseCode == 404);
            } catch (Exception e2) {
                Log.e("Google", e2.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                new g(SplashActivity.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, SplashActivity.this.V);
                return;
            }
            Context context = SplashActivity.this.f26715f;
            c.h.a.h.n.e.l0(context, context.getResources().getString(R.string.file_url_not_valid));
            SplashActivity.this.startActivity(c.h.a.h.n.a.f17039c.booleanValue() ? new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class) : new Intent(SplashActivity.this, (Class<?>) RoutingActivity.class));
            SplashActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
            SplashActivity.this.finish();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class k extends AsyncTask<String, Void, String> {
        public k() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                SplashActivity.this.Y = new FileInputStream(new File(strArr[0]));
                SplashActivity splashActivity = SplashActivity.this;
                return splashActivity.Z.c(splashActivity.Y, SplashActivity.this.f26715f);
            } catch (Exception unused) {
                return BuildConfig.FLAVOR;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            SplashActivity splashActivity;
            super.onPostExecute(str);
            try {
                boolean z = true;
                if (str.equals(BuildConfig.FLAVOR)) {
                    Context context = SplashActivity.this.f26715f;
                    Toast.makeText(context, context.getResources().getString(R.string.unable_to_login), 1).show();
                    SplashActivity.this.startActivity(new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class));
                    SplashActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                    splashActivity = SplashActivity.this;
                } else {
                    SplashActivity.this.f0 = str;
                    if (c.h.a.h.n.a.f17040d.booleanValue()) {
                        SplashActivity splashActivity2 = SplashActivity.this;
                        splashActivity2.v = c.h.a.f.f.a(splashActivity2.f26715f);
                        String str2 = SplashActivity.this.v;
                        if (str2 != null && !str2.equals(BuildConfig.FLAVOR) && !SplashActivity.this.v.isEmpty()) {
                            SplashActivity.this.S = new ArrayList<>(Arrays.asList(SplashActivity.this.v.split(",")));
                        }
                        ArrayList<String> arrayList = SplashActivity.this.S;
                        if (arrayList == null || arrayList.size() < 1) {
                            Context context2 = SplashActivity.this.f26715f;
                            Toast.makeText(context2, context2.getResources().getString(R.string.please_check_portal), 0).show();
                            SplashActivity.this.startActivity(c.h.a.h.n.a.f17039c.booleanValue() ? new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class) : new Intent(SplashActivity.this, (Class<?>) RoutingActivity.class));
                            SplashActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                            splashActivity = SplashActivity.this;
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= SplashActivity.this.S.size()) {
                                    z = false;
                                    break;
                                } else {
                                    if (SplashActivity.this.f0 != null && SplashActivity.this.f0.contains(SplashActivity.this.S.get(i2))) {
                                        SplashActivity.this.J0();
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            if (z) {
                                return;
                            }
                            SplashActivity splashActivity3 = SplashActivity.this;
                            Toast.makeText(splashActivity3.f26715f, splashActivity3.getResources().getString(R.string.invalid_server_url), 0).show();
                            SplashActivity.this.startActivity(new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class));
                            SplashActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                            splashActivity = SplashActivity.this;
                        }
                    } else {
                        if (SplashActivity.this.f0.contains(c.h.a.f.f.a(SplashActivity.this.f26715f))) {
                            SplashActivity.this.J0();
                            return;
                        }
                        SplashActivity splashActivity4 = SplashActivity.this;
                        Toast.makeText(splashActivity4.f26715f, splashActivity4.getResources().getString(R.string.invalid_server_url), 0).show();
                        SplashActivity.this.startActivity(new Intent(SplashActivity.this, (Class<?>) RoutingActivity.class));
                        SplashActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                        splashActivity = SplashActivity.this;
                    }
                }
                splashActivity.finish();
            } catch (Exception unused) {
                Context context3 = SplashActivity.this.f26715f;
                Toast.makeText(context3, context3.getResources().getString(R.string.file_url_not_valid), 0).show();
                SplashActivity.this.startActivity(c.h.a.h.n.a.f17039c.booleanValue() ? new Intent(SplashActivity.this, (Class<?>) MultiUserActivity.class) : new Intent(SplashActivity.this, (Class<?>) RoutingActivity.class));
                SplashActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                SplashActivity.this.finish();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public static String L0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c2 : charArray) {
            if (z && Character.isLetter(c2)) {
                sb.append(Character.toUpperCase(c2));
                z = false;
            } else {
                if (Character.isWhitespace(c2)) {
                    z = true;
                }
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    public static String O0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return L0(str2);
        }
        return L0(str) + " " + str2;
    }

    public static String T0(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    public void A0() {
        StringBuilder sb;
        List<c.h.a.f.e> list;
        String str = "playlist";
        if (m.f(this.f26715f).equals("m3u")) {
            sb = new StringBuilder();
            sb.append(c.h.a.f.f.c(this));
            sb.append("*");
            sb.append(c.h.a.f.f.d(this));
            sb.append("-");
            sb.append("playlist");
        } else {
            sb = new StringBuilder();
            sb.append(c.h.a.f.f.c(this));
            sb.append("*");
            sb.append(c.h.a.f.f.d(this));
            sb.append("-");
            sb.append(this.t);
        }
        sb.append("-");
        sb.append(c.h.a.f.b.f16735b);
        sb.append("-");
        sb.append(this.r);
        sb.append("-unknown-");
        sb.append(O0());
        sb.append("-");
        sb.append(this.q);
        this.p = T0(sb.toString());
        ArrayList arrayList = new ArrayList();
        c.h.a.f.g.f16757a = arrayList;
        arrayList.add(c.h.a.f.g.a("m", "gu"));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("k", c.h.a.f.f.c(this)));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("sc", this.p));
        if (m.f(this.f26715f).equals("m3u")) {
            list = c.h.a.f.g.f16757a;
        } else {
            list = c.h.a.f.g.f16757a;
            str = this.t;
        }
        list.add(c.h.a.f.g.a("u", str));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("pw", "no_password"));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("r", c.h.a.f.b.f16735b));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("av", this.r));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("dt", "unknown"));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("d", O0()));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("do", this.q));
        c.h.a.f.g.f16758b.b(this);
    }

    @Override // c.h.a.k.f.f
    public void D(LoginCallback loginCallback, String str, ArrayList<String> arrayList) {
        Intent intent;
        try {
            if (loginCallback.b() == null || loginCallback.a() == null) {
                if (arrayList == null || arrayList.size() <= 0) {
                    intent = new Intent(this, (Class<?>) MultiUserActivity.class);
                    startActivity(intent);
                    finish();
                    c.h.a.h.n.e.l0(this.f26715f, "Your Account is invalid or has expired !");
                    return;
                }
                this.B.putString(c.h.a.h.n.a.t, arrayList.get(0).trim());
                this.B.apply();
                arrayList.remove(0);
                this.X.h(this.t, this.u, arrayList);
                return;
            }
            if (loginCallback.b() == null) {
                c(getResources().getString(R.string.invalid_server_response));
                return;
            }
            if (loginCallback.b().c().intValue() != 1) {
                if (str.equals("validateLogin")) {
                    Toast.makeText(this, getResources().getString(R.string.invalid_details), 0).show();
                    return;
                }
                return;
            }
            if (!loginCallback.b().i().equals("Active")) {
                if (arrayList == null || arrayList.size() <= 0) {
                    intent = new Intent(this, (Class<?>) MultiUserActivity.class);
                    startActivity(intent);
                    finish();
                    c.h.a.h.n.e.l0(this.f26715f, "Your Account is invalid or has expired !");
                    return;
                }
                this.B.putString(c.h.a.h.n.a.t, arrayList.get(0).trim());
                this.B.apply();
                arrayList.remove(0);
                this.X.h(this.t, this.u, arrayList);
                return;
            }
            String strJ = loginCallback.b().j();
            String strH = loginCallback.b().h();
            String strB = loginCallback.a().b();
            String strF = loginCallback.a().f();
            String strE = loginCallback.b().e();
            String strF2 = loginCallback.b().f();
            String strA = loginCallback.b().a();
            String strD = loginCallback.b().d();
            String strG = loginCallback.b().g();
            List<String> listB = loginCallback.b().b();
            String strD2 = loginCallback.a().d();
            String strA2 = loginCallback.a().a();
            String strC = loginCallback.a().c();
            String strE2 = loginCallback.a().e();
            if (listB.size() != 0) {
                listB.get(0);
            }
            this.f26715f.getSharedPreferences("loginPrefsserverurl", 0).getString(c.h.a.h.n.a.t, BuildConfig.FLAVOR).toLowerCase();
            SharedPreferences.Editor editorEdit = getSharedPreferences("loginPrefs", 0).edit();
            editorEdit.putString("username", strJ);
            editorEdit.putString("password", strH);
            editorEdit.putString("serverPort", strB);
            editorEdit.putString("serverUrl", strF);
            editorEdit.putString("expDate", strE);
            editorEdit.putString("isTrial", strF2);
            editorEdit.putString("activeCons", strA);
            editorEdit.putString("createdAt", strD);
            editorEdit.putString("maxConnections", strG);
            editorEdit.putString(c.h.a.h.n.a.t, strF + ":" + strB);
            editorEdit.putString("serverProtocol", strD2);
            editorEdit.putString("serverPortHttps", strA2);
            editorEdit.putString("serverPortRtmp", strC);
            editorEdit.putString("serverTimeZone", strE2);
            editorEdit.apply();
            this.E = this.f26715f.getSharedPreferences("allowedFormat", 0);
            this.F = this.f26715f.getSharedPreferences("timeFormat", 0);
            this.G = this.f26715f.getSharedPreferences("epgchannelupdate", 0);
            this.H = this.f26715f.getSharedPreferences("automation_channels", 0);
            this.I = this.f26715f.getSharedPreferences("automation_epg", 0);
            this.L = this.E.edit();
            this.J = this.F.edit();
            this.K = this.G.edit();
            this.M = this.H.edit();
            this.N = this.I.edit();
            SharedPreferences sharedPreferences = this.f26715f.getSharedPreferences("auto_start", 0);
            this.O = sharedPreferences;
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            this.P = editorEdit2;
            if (editorEdit2 != null) {
                editorEdit2.putBoolean("full_epg", true);
                this.P.apply();
            }
            if (this.H.getString("automation_channels", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                this.M.putString("automation_channels", "checked");
                this.M.apply();
            }
            if (this.I.getString("automation_epg", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                this.N.putString("automation_epg", "checked");
                this.N.apply();
            }
            c.h.a.h.n.a.K = Boolean.FALSE;
            if (this.E.getString("allowedFormat", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                this.L.putString("allowedFormat", "ts");
                this.L.apply();
            }
            if (this.F.getString("timeFormat", c.h.a.h.n.a.m0).equals(BuildConfig.FLAVOR)) {
                this.J.putString("timeFormat", c.h.a.h.n.a.m0);
                this.J.apply();
            }
            if (this.G.getString("epgchannelupdate", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                this.K.putString("epgchannelupdate", "all");
                this.K.apply();
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    @Override // c.h.a.k.f.f
    public void I(String str) {
    }

    public final void J0() {
        Activity activity;
        try {
            if (this.Q.C1("m3u") == 0) {
                ArrayList<c.h.a.i.q.e> arrayList = new ArrayList<>();
                c.h.a.i.q.e eVar = new c.h.a.i.q.e();
                eVar.l("all");
                eVar.j("0");
                eVar.g(BuildConfig.FLAVOR);
                arrayList.add(0, eVar);
                this.Q.b2(arrayList, "m3u");
            }
            c.h.a.i.q.e eVarY1 = this.Q.Y1("all");
            if (eVarY1 != null) {
                if ((eVarY1.d() == null || !eVarY1.d().equals("0")) && (eVarY1.d() == null || !eVarY1.d().equals("2"))) {
                    if (eVarY1.d() != null && eVarY1.d().equals("1")) {
                        long jR = c.h.a.h.n.e.r(new SimpleDateFormat("dd/MM/yyyy", Locale.US), eVarY1.a(), c.h.a.h.n.e.i());
                        if (!N0() || jR < this.f26724o.g()) {
                            this.f26715f.startActivity(new Intent(this.f26715f, (Class<?>) NewDashboardActivity.class));
                            activity = (Activity) this.f26715f;
                        } else {
                            this.f26715f.startActivity(new Intent(this.f26715f, (Class<?>) ImportM3uActivity.class));
                            activity = (Activity) this.f26715f;
                        }
                    } else {
                        if (eVarY1.d() == null || !eVarY1.d().equals("3")) {
                            return;
                        }
                        this.f26715f.startActivity(new Intent(this.f26715f, (Class<?>) ImportM3uActivity.class));
                        activity = (Activity) this.f26715f;
                    }
                } else {
                    if (this.f26715f == null) {
                        return;
                    }
                    this.f26715f.startActivity(new Intent(this.f26715f, (Class<?>) ImportM3uActivity.class));
                    activity = (Activity) this.f26715f;
                }
                activity.finish();
            }
        } catch (Exception unused) {
            Context context = this.f26715f;
            Toast.makeText(context, context.getResources().getString(R.string.file_url_not_valid), 0).show();
            startActivity(c.h.a.h.n.a.f17039c.booleanValue() ? new Intent(this, (Class<?>) MultiUserActivity.class) : new Intent(this, (Class<?>) RoutingActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
            finish();
        }
    }

    public void K0() {
        try {
            this.r = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public final void M0() {
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

    public boolean N0() {
        return this.f26715f.getSharedPreferences("automation_channels", 0).getString("automation_channels", BuildConfig.FLAVOR).equals("checked");
    }

    @Override // c.h.a.k.f.f
    public void O(ArrayList<String> arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
            finish();
            c.h.a.h.n.e.l0(this.f26715f, "Your Account is invalid or has expired !");
            return;
        }
        try {
            this.B.putString(c.h.a.h.n.a.t, arrayList.get(0).trim());
            this.B.apply();
            arrayList.remove(0);
            this.X.h(this.t, this.u, arrayList);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public void P0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public void Q0() {
        Handler handler;
        Runnable eVar;
        if (!c.h.a.h.n.a.M.booleanValue()) {
            if (m.f(this.f26715f).equals("m3u")) {
                SharedPreferences sharedPreferences = this.f26713d;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString("serverUrl", BuildConfig.FLAVOR);
                    this.V = string;
                    if (string == null || string.equals(BuildConfig.FLAVOR)) {
                        handler = new Handler();
                        eVar = new d();
                    }
                    R0();
                    return;
                }
                return;
            }
            SharedPreferences sharedPreferences2 = this.f26713d;
            if (sharedPreferences2 != null) {
                String string2 = sharedPreferences2.getString("username", BuildConfig.FLAVOR);
                String string3 = this.f26713d.getString("password", BuildConfig.FLAVOR);
                if (string2 == null || string3 == null || string2.equals(BuildConfig.FLAVOR) || string3.equals(BuildConfig.FLAVOR) || c.h.a.h.n.a.f17038b.booleanValue()) {
                    handler = new Handler();
                    eVar = new e();
                }
            }
            R0();
            return;
        }
        handler = new Handler();
        eVar = new c();
        handler.postDelayed(eVar, this.W);
    }

    public void R0() {
        Intent intent;
        c.h.a.k.d.a.a aVar = this.f26724o;
        if (aVar != null) {
            String strA = aVar.A();
            if (strA == null || strA.equals(BuildConfig.FLAVOR)) {
                startActivity(new Intent(this, (Class<?>) ScreenTypeActivity.class));
                finish();
            }
            if (c.h.a.h.n.a.M.booleanValue()) {
                SharedPreferences sharedPreferences = this.f26713d;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString("username", BuildConfig.FLAVOR);
                    if (string == null || string.equals(BuildConfig.FLAVOR)) {
                        String string2 = this.f26715f.getSharedPreferences("loginprefsmultiuser", 0).getString("username", BuildConfig.FLAVOR);
                        intent = (string2 == null || string2.equals(BuildConfig.FLAVOR)) ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) MultiUserActivity.class);
                    } else {
                        intent = new Intent(this, (Class<?>) NewDashboardActivity.class);
                    }
                } else {
                    intent = new Intent(this, (Class<?>) RoutingActivity.class);
                }
            } else {
                try {
                    if (m.f(this.f26715f).equals("m3u")) {
                        if (!c.h.a.h.n.a.f17041e.booleanValue()) {
                            return;
                        }
                        SharedPreferences sharedPreferences2 = this.f26713d;
                        if (sharedPreferences2 != null) {
                            String string3 = sharedPreferences2.getString("serverUrl", BuildConfig.FLAVOR);
                            this.V = string3;
                            if (string3 == null || string3.equals(BuildConfig.FLAVOR)) {
                                startActivity(c.h.a.h.n.a.f17039c.booleanValue() ? new Intent(this, (Class<?>) MultiUserActivity.class) : new Intent(this, (Class<?>) RoutingActivity.class));
                                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                            } else {
                                ArrayList<c.h.a.i.i> arrayListR = this.f26716g.r(m.z(this.f26715f));
                                if (arrayListR == null || arrayListR.size() <= 0) {
                                    Toast.makeText(this.f26715f, getResources().getString(R.string.user_not_found), 0).show();
                                    startActivity(c.h.a.h.n.a.f17039c.booleanValue() ? new Intent(this, (Class<?>) MultiUserActivity.class) : new Intent(this, (Class<?>) RoutingActivity.class));
                                    overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                                } else if (arrayListR.get(0).a().equals(TransferTable.COLUMN_FILE)) {
                                    this.U = TransferTable.COLUMN_FILE;
                                    if (new File(this.V).exists()) {
                                        new h().execute(new Void[0]);
                                        return;
                                    } else {
                                        Toast.makeText(this.f26715f, getResources().getString(R.string.m3u_file_not_found), 0).show();
                                        startActivity(c.h.a.h.n.a.f17039c.booleanValue() ? new Intent(this, (Class<?>) MultiUserActivity.class) : new Intent(this, (Class<?>) RoutingActivity.class));
                                        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                                    }
                                } else if (arrayListR.get(0).a().equals("url")) {
                                    this.U = "url";
                                    new i().execute(new Void[0]);
                                    return;
                                } else {
                                    startActivity(new Intent(this, (Class<?>) RoutingActivity.class));
                                    overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                                }
                            }
                        } else {
                            startActivity(new Intent(this, (Class<?>) RoutingActivity.class));
                            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                        }
                    } else if (c.h.a.h.n.a.f17040d.booleanValue()) {
                        SharedPreferences sharedPreferences3 = this.f26713d;
                        if (sharedPreferences3 != null) {
                            String string4 = sharedPreferences3.getString("username", BuildConfig.FLAVOR);
                            String string5 = this.f26713d.getString("password", BuildConfig.FLAVOR);
                            if (string4 == null || string5 == null || string4.equals(BuildConfig.FLAVOR) || string5.equals(BuildConfig.FLAVOR)) {
                                startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
                                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                            } else {
                                this.t = string4;
                                this.u = string5;
                                if (!c.h.a.h.n.a.f17038b.booleanValue()) {
                                    new h().execute(new Void[0]);
                                    return;
                                } else {
                                    startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                                    overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                                }
                            }
                        } else {
                            startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
                            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                        }
                    } else {
                        SharedPreferences sharedPreferences4 = this.f26713d;
                        if (sharedPreferences4 != null) {
                            String string6 = sharedPreferences4.getString("username", BuildConfig.FLAVOR);
                            String string7 = this.f26713d.getString("password", BuildConfig.FLAVOR);
                            if (string6 == null || string7 == null || string6.equals(BuildConfig.FLAVOR) || string7.equals(BuildConfig.FLAVOR)) {
                                startActivity(c.h.a.h.n.a.f17042f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
                                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                            } else {
                                this.t = string6;
                                this.u = string7;
                                if (!c.h.a.h.n.a.f17038b.booleanValue()) {
                                    new h().execute(new Void[0]);
                                    return;
                                } else {
                                    startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                                    overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                                }
                            }
                        } else {
                            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
                            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                        }
                    }
                    finish();
                    return;
                } catch (Exception unused) {
                    intent = c.h.a.h.n.a.f17042f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class);
                }
            }
        } else {
            intent = new Intent(this, (Class<?>) LoginActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        finish();
    }

    public boolean S0() {
        if (Build.VERSION.SDK_INT < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        a.i.h.a.q(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        return false;
    }

    @Override // c.h.a.f.c
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public void d0(String str, int i2, boolean z) {
        Intent intent;
        if (z) {
            try {
                if (i2 == 1) {
                    JSONObject jSONObject = new JSONObject(str);
                    c.h.a.f.b.f16734a = jSONObject;
                    if (jSONObject.getString("status").equalsIgnoreCase("true")) {
                        this.v = c.h.a.f.b.f16734a.getString("su");
                        this.w = c.h.a.f.b.f16734a.getString("ndd");
                        this.x = System.currentTimeMillis();
                        try {
                            c.h.a.f.f.e(this, c.h.a.f.b.f16734a.optString("su"));
                            this.T = T0(c.h.a.f.b.f16734a.optString("su") + "*" + c.h.a.f.f.d(this) + "*" + c.h.a.f.b.f16735b);
                            if (!c.h.a.f.b.f16734a.getString("sc").equalsIgnoreCase(this.T)) {
                                Toast.makeText(this, this.f26715f.getResources().getString(R.string.could_not_connect), 0).show();
                                startActivity(c.h.a.h.n.a.f17042f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
                                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                                finish();
                                return;
                            }
                            if (m.f(this.f26715f).equals("m3u")) {
                                String str2 = this.U;
                                if (str2 != null && str2.equals(TransferTable.COLUMN_FILE)) {
                                    new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.V);
                                    return;
                                }
                                String str3 = this.U;
                                if (str3 == null || !str3.equals("url")) {
                                    return;
                                }
                                new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f26715f.getFilesDir() + "/data_temp.txt");
                                return;
                            }
                            String string = this.f26713d.getString("username", BuildConfig.FLAVOR);
                            String string2 = this.f26713d.getString("password", BuildConfig.FLAVOR);
                            if (string != null && string2 != null && !string.equals(BuildConfig.FLAVOR) && !string2.equals(BuildConfig.FLAVOR)) {
                                this.t = string;
                                this.u = string2;
                            }
                            this.B.putString(c.h.a.h.n.a.t, c.h.a.f.f.a(this));
                            this.B.apply();
                            this.D.putString(c.h.a.h.n.a.t, c.h.a.f.f.a(this));
                            this.D.putString("username", this.t);
                            this.D.apply();
                            if (c.h.a.h.n.a.f17040d.booleanValue()) {
                                V0(this.v.toLowerCase());
                                return;
                            } else {
                                this.X.g(this.t, this.u);
                                return;
                            }
                        } catch (Exception unused) {
                            startActivity(c.h.a.h.n.a.f17042f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
                            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                        }
                    } else {
                        Toast.makeText(this, this.f26715f.getResources().getString(R.string.status_suspend), 0).show();
                        startActivity(c.h.a.h.n.a.f17042f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
                        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                    }
                } else {
                    startActivity(c.h.a.h.n.a.f17042f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
                    overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                }
                finish();
                return;
            } catch (Exception unused2) {
                intent = c.h.a.h.n.a.f17042f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class);
            }
        } else {
            Toast.makeText(this, this.f26715f.getResources().getString(R.string.could_not_connect), 0).show();
            intent = c.h.a.h.n.a.f17042f.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        finish();
    }

    public final void V0(String str) {
        if (str != null && !str.equals(BuildConfig.FLAVOR) && !str.isEmpty()) {
            this.S = new ArrayList<>(Arrays.asList(str.split(",")));
        }
        ArrayList<String> arrayList = this.S;
        if (arrayList == null || arrayList.size() < 1) {
            ArrayList<String> arrayList2 = this.S;
            if (arrayList2 == null || arrayList2.size() != 0) {
                return;
            }
            Toast.makeText(this, this.f26715f.getResources().getString(R.string.please_check_portal), 0).show();
            return;
        }
        try {
            this.B.putString(c.h.a.h.n.a.t, this.S.get(0).trim());
            this.B.commit();
            this.S.remove(0);
            this.X.h(this.t, this.u, this.S);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public void W0() {
        this.f26723n.setVisibility(8);
        this.f26721l.setVisibility(0);
        this.f26720k.setVisibility(0);
    }

    @Override // c.h.a.k.f.f
    public void X(String str) {
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        finish();
    }

    public void X0() {
        this.f26723n.setVisibility(0);
        this.f26721l.setVisibility(8);
        this.f26720k.setVisibility(8);
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
    }

    @Override // c.h.a.f.c
    public void n(int i2) {
        Context context = this.f26715f;
        if (context != null) {
            try {
                if (m.f(context).equals("m3u")) {
                    String str = this.U;
                    if (str == null || !str.equals(TransferTable.COLUMN_FILE)) {
                        String str2 = this.U;
                        if (str2 != null && str2.equals("url")) {
                            new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f26715f.getFilesDir() + "/data_temp.txt");
                        }
                    } else {
                        new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.V);
                    }
                } else {
                    this.X.g(this.t, this.u);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26715f = this;
        super.onCreate(bundle);
        try {
            startService(new Intent(getBaseContext(), (Class<?>) StopProcessingTasksService.class));
        } catch (Exception unused) {
        }
        P0();
        setContentView(R.layout.activity_splash);
        if (!c.h.a.h.n.a.M.booleanValue()) {
            K0();
            y0();
            O0();
            z0();
        }
        this.f26724o = new c.h.a.k.d.a.a(this.f26715f);
        c.h.a.f.g.f16758b = new c.h.a.f.g(this);
        this.f26723n = (VideoView) findViewById(R.id.video_splash);
        this.g0 = (LinearLayout) findViewById(R.id.ll_tagline);
        if (c.h.a.h.n.a.M.booleanValue()) {
            this.g0.setVisibility(0);
        } else {
            this.g0.setVisibility(8);
        }
        ((RelativeLayout) findViewById(R.id.main_layout)).setSystemUiVisibility(4871);
        this.f26720k = (ImageView) findViewById(R.id.iv_splash_bg);
        this.f26721l = (ImageView) findViewById(R.id.iv_logo);
        this.Q = new c.h.a.i.q.f(this.f26715f);
        SharedPreferences sharedPreferences = getSharedPreferences("sharedPreference", 0);
        this.R = sharedPreferences;
        this.D = sharedPreferences.edit();
        this.f26713d = getSharedPreferences("loginPrefs", 0);
        SharedPreferences sharedPreferences2 = getSharedPreferences("sharedprefremberme", 0);
        this.z = sharedPreferences2;
        this.y = Boolean.valueOf(sharedPreferences2.getBoolean("savelogin", true));
        SharedPreferences sharedPreferences3 = getSharedPreferences("loginPrefsserverurl", 0);
        this.A = sharedPreferences3;
        this.B = sharedPreferences3.edit();
        this.f26714e = getSharedPreferences("selected_language", 0);
        this.C = this.z.edit();
        String string = this.f26714e.getString("selected_language", BuildConfig.FLAVOR);
        if (!string.equals(BuildConfig.FLAVOR)) {
            c.h.a.h.n.e.f0(this.f26715f, string);
        }
        this.X = new c.h.a.j.c(this, this.f26715f);
        this.f26716g = new c.h.a.i.q.g(this.f26715f);
        if (m.G(this.f26715f)) {
            m.m0(true, this.f26715f);
        }
        if (c.h.a.h.n.a.p.booleanValue()) {
            try {
                X0();
            } catch (Exception unused2) {
                W0();
                this.W = 1500;
                Q0();
            }
            this.f26723n.setOnCompletionListener(new a());
            this.f26723n.setOnPreparedListener(new b());
        } else {
            W0();
            this.W = 1500;
            Q0();
        }
        M0();
        this.f26717h = this.f26715f.getSharedPreferences("update_version", 0);
        c.h.a.f.f.g(this, "Ka11484fbeedb2561981887ea65a38ac4");
        c.h.a.f.f.f(this, "Ka11484fbeedb2561981887ea65a38ac4");
        c.h.a.f.f.h(this, "NB!@#12ZKWd");
        this.f26714e = getSharedPreferences("selected_language", 0);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        String string = this.f26714e.getString("selected_language", BuildConfig.FLAVOR);
        if (string.equals(BuildConfig.FLAVOR)) {
            return;
        }
        c.h.a.h.n.e.f0(this.f26715f, string);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        P0();
    }

    @Override // c.h.a.k.f.f
    public void p(LoginCallback loginCallback, String str) {
        String string;
        if (this.f26715f != null) {
            if (loginCallback == null || loginCallback.b() == null) {
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                c(getResources().getString(R.string.invalid_server_response));
                return;
            }
            if (loginCallback.b().c().intValue() == 1) {
                String strI = loginCallback.b().i();
                if (strI.equals("Active")) {
                    String strJ = loginCallback.b().j();
                    String strH = loginCallback.b().h();
                    String strB = loginCallback.a().b();
                    String strF = loginCallback.a().f();
                    String strE = loginCallback.b().e();
                    String strF2 = loginCallback.b().f();
                    String strA = loginCallback.b().a();
                    String strD = loginCallback.b().d();
                    String strG = loginCallback.b().g();
                    List<String> listB = loginCallback.b().b();
                    String strD2 = loginCallback.a().d();
                    String strA2 = loginCallback.a().a();
                    String strC = loginCallback.a().c();
                    String strE2 = loginCallback.a().e();
                    if (listB.size() != 0) {
                        listB.get(0);
                    }
                    this.f26715f.getSharedPreferences("loginPrefsserverurl", 0).getString(c.h.a.h.n.a.t, BuildConfig.FLAVOR).toLowerCase();
                    SharedPreferences.Editor editorEdit = getSharedPreferences("loginPrefs", 0).edit();
                    editorEdit.putString("username", strJ);
                    editorEdit.putString("password", strH);
                    editorEdit.putString("serverPort", strB);
                    editorEdit.putString("serverUrl", strF);
                    editorEdit.putString("expDate", strE);
                    editorEdit.putString("isTrial", strF2);
                    editorEdit.putString("activeCons", strA);
                    editorEdit.putString("createdAt", strD);
                    editorEdit.putString("maxConnections", strG);
                    editorEdit.putString(c.h.a.h.n.a.t, strF + ":" + strB);
                    editorEdit.putString("serverProtocol", strD2);
                    editorEdit.putString("serverPortHttps", strA2);
                    editorEdit.putString("serverPortRtmp", strC);
                    editorEdit.putString("serverTimeZone", strE2);
                    editorEdit.apply();
                    this.E = this.f26715f.getSharedPreferences("allowedFormat", 0);
                    this.F = this.f26715f.getSharedPreferences("timeFormat", 0);
                    this.G = this.f26715f.getSharedPreferences("epgchannelupdate", 0);
                    this.H = this.f26715f.getSharedPreferences("automation_channels", 0);
                    this.I = this.f26715f.getSharedPreferences("automation_epg", 0);
                    this.L = this.E.edit();
                    this.J = this.F.edit();
                    this.K = this.G.edit();
                    this.M = this.H.edit();
                    this.N = this.I.edit();
                    SharedPreferences sharedPreferences = this.f26715f.getSharedPreferences("auto_start", 0);
                    this.O = sharedPreferences;
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    this.P = editorEdit2;
                    if (editorEdit2 != null) {
                        editorEdit2.putBoolean("full_epg", true);
                        this.P.apply();
                    }
                    if (this.H.getString("automation_channels", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                        this.M.putString("automation_channels", "checked");
                        this.M.apply();
                    }
                    if (this.I.getString("automation_epg", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                        this.N.putString("automation_epg", "checked");
                        this.N.apply();
                    }
                    c.h.a.h.n.a.K = Boolean.FALSE;
                    if (this.E.getString("allowedFormat", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                        this.L.putString("allowedFormat", "ts");
                        this.L.apply();
                    }
                    if (this.F.getString("timeFormat", c.h.a.h.n.a.m0).equals(BuildConfig.FLAVOR)) {
                        this.J.putString("timeFormat", c.h.a.h.n.a.m0);
                        this.J.apply();
                    }
                    if (this.G.getString("epgchannelupdate", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                        this.K.putString("epgchannelupdate", "all");
                        this.K.apply();
                    }
                    startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                    finish();
                    return;
                }
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                string = getResources().getString(R.string.invalid_status) + strI;
            } else {
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                finish();
                string = getResources().getString(R.string.invalid_details);
            }
            Toast.makeText(this, string, 0).show();
        }
    }

    @Override // c.h.a.k.f.f
    public void t(ArrayList<String> arrayList, String str) {
        if (arrayList == null || arrayList.size() <= 0) {
            startActivity(new Intent(this, (Class<?>) MultiUserActivity.class));
            finish();
            c.h.a.h.n.e.l0(this.f26715f, "Your Account is invalid or has expired !");
            return;
        }
        try {
            this.B.putString(c.h.a.h.n.a.t, arrayList.get(0).trim());
            this.B.apply();
            arrayList.remove(0);
            this.X.h(this.t, this.u, arrayList);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public void y0() {
        this.q = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    public void z0() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.s = iNextInt;
        c.h.a.f.b.f16735b = String.valueOf(iNextInt);
    }
}
