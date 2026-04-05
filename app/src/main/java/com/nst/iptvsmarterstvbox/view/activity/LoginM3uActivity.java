package minefarts.iptvsmarters.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.g;
import c.h.a.h.n.e;
import c.h.a.i.q.m;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.vpn.activities.ProfileActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import java.util.Locale;
import java.util.Random;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LoginM3uActivity extends a.b.k.c implements c.h.a.f.c<String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final File f25811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final File f25812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c.h.a.k.d.a.a f25813f;
    public SharedPreferences A;
    public SharedPreferences.Editor B;
    public String C;
    public String D;
    public String E;
    public int F;
    public String J;
    public SharedPreferences K;
    public SharedPreferences.Editor L;
    public SharedPreferences.Editor M;
    public SharedPreferences N;
    public SharedPreferences O;
    public String S;
    public a.b.k.b T;
    public Uri U;

    @BindView
    public Button bt_browse;

    @BindView
    public EditText etM3uLine;

    @BindView
    public EditText etM3uLineFile;

    @BindView
    public EditText etName;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f25814g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25816i;

    @BindView
    public ImageView iv_add_user;

    @BindView
    public ImageView iv_list_users;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.f f25819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.g f25820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.q.a f25821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f25822o;
    public SharedPreferences.Editor p;
    public SharedPreferences q;
    public SharedPreferences r;

    @BindView
    public RadioButton rbFile;

    @BindView
    public RadioButton rbM3U;

    @BindView
    public RelativeLayout rl_add_user;

    @BindView
    public RelativeLayout rl_list_users;

    @BindView
    public RelativeLayout rl_playlist_name;
    public SharedPreferences s;
    public SharedPreferences t;

    @BindView
    public TextView tv_add_user;

    @BindView
    public TextView tv_browse_error;

    @BindView
    public TextView tv_file_path;

    @BindView
    public TextView tv_list_users;
    public SharedPreferences.Editor u;
    public SharedPreferences.Editor v;

    @BindView
    public Button vpn_button;
    public SharedPreferences.Editor w;
    public SharedPreferences.Editor x;
    public RadioGroup y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f25815h = this;
    public final c.h.a.k.g.a z = new c.h.a.k.g.a();
    public String G = BuildConfig.FLAVOR;
    public String H = BuildConfig.FLAVOR;
    public long I = -1;
    public String P = BuildConfig.FLAVOR;
    public ArrayList<String> Q = new ArrayList<>();
    public String R = TransferTable.COLUMN_FILE;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.a.f17037a = true;
            m.e0("login", LoginM3uActivity.this.f25815h);
            Intent intent = new Intent(LoginM3uActivity.this.f25815h, (Class<?>) ProfileActivity.class);
            intent.putExtra("typeid", "login");
            LoginM3uActivity.this.startActivity(intent);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(LoginM3uActivity.this.f25815h, (Class<?>) MultiUserActivity.class);
            m.N("m3u", LoginM3uActivity.this.f25815h);
            LoginM3uActivity.this.startActivity(intent);
            LoginM3uActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
            LoginM3uActivity.this.finish();
        }
    }

    public class c implements g.InterfaceC0215g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f25825a;

        public c(String[] strArr) {
            this.f25825a = strArr;
        }

        @Override // c.h.a.h.g.InterfaceC0215g
        public void a(String str) {
            this.f25825a[0] = str;
            LoginM3uActivity.this.etM3uLineFile.setText(str);
            LoginM3uActivity.this.tv_browse_error.setVisibility(8);
            LoginM3uActivity.this.tv_file_path.setVisibility(0);
            LoginM3uActivity.this.tv_file_path.setText(str);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", LoginM3uActivity.this.getPackageName(), null));
                LoginM3uActivity.this.startActivityForResult(intent, 101);
                Toast.makeText(LoginM3uActivity.this.f25815h, LoginM3uActivity.this.f25815h.getResources().getString(R.string.grant_the_permission), 1).show();
            } catch (Exception unused) {
            }
            LoginM3uActivity.this.T.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginM3uActivity.this.T.dismiss();
            LoginM3uActivity.this.onBackPressed();
        }
    }

    public class f extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f25832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f25833f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25835b;

            public a(View view) {
                this.f25835b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25835b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25835b.getTag().equals("1")) {
                        View view3 = this.f25835b;
                        if (view3 == null || view3.getTag() == null || !this.f25835b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = f.this.f25833f;
                    }
                    linearLayout = f.this.f25832e;
                } else {
                    View view4 = this.f25835b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25835b.getTag().equals("1")) {
                        View view5 = this.f25835b;
                        if (view5 == null || view5.getTag() == null || !this.f25835b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = f.this.f25833f;
                    }
                    linearLayout = f.this.f25832e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public f(Activity activity) {
            super(activity);
            this.f25829b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            try {
                if (id == R.id.btn_close) {
                    dismiss();
                    return;
                }
                if (id != R.id.btn_try_again) {
                    return;
                }
                dismiss();
                int checkedRadioButtonId = LoginM3uActivity.this.y.getCheckedRadioButtonId();
                if (checkedRadioButtonId == R.id.rb_file && LoginM3uActivity.this.T0()) {
                    LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
                    loginM3uActivity.f25818k = loginM3uActivity.etName.getText().toString().trim();
                    LoginM3uActivity loginM3uActivity2 = LoginM3uActivity.this;
                    loginM3uActivity2.f25817j = loginM3uActivity2.etM3uLineFile.getText().toString().trim();
                    LoginM3uActivity.this.R = TransferTable.COLUMN_FILE;
                    LoginM3uActivity.this.new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f25817j);
                }
                if (checkedRadioButtonId == R.id.rb_m3u && LoginM3uActivity.this.U0()) {
                    LoginM3uActivity loginM3uActivity3 = LoginM3uActivity.this;
                    loginM3uActivity3.f25816i = loginM3uActivity3.etM3uLine.getText().toString().trim();
                    LoginM3uActivity loginM3uActivity4 = LoginM3uActivity.this;
                    loginM3uActivity4.f25818k = loginM3uActivity4.etName.getText().toString().trim();
                    LoginM3uActivity.this.R = "url";
                    LoginM3uActivity.this.new i().execute(new Void[0]);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(LoginM3uActivity.f25813f.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_internet_not_working_layout_tv : R.layout.custom_internet_not_working_layout);
            this.f25830c = (TextView) findViewById(R.id.btn_try_again);
            this.f25831d = (TextView) findViewById(R.id.btn_close);
            this.f25832e = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25833f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f25830c.setOnClickListener(this);
            this.f25831d.setOnClickListener(this);
            TextView textView = this.f25830c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f25831d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class g extends AsyncTask<String, String, Boolean> {
        public g() {
        }

        public /* synthetic */ g(LoginM3uActivity loginM3uActivity, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            File file;
            try {
                URL url = new URL(strArr[0]);
                if (Build.VERSION.SDK_INT >= 19) {
                    file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                } else {
                    file = new File(Environment.getExternalStorageDirectory() + "/Documents", "IPTVSmarters");
                }
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(LoginM3uActivity.this.f25815h.getFilesDir() + "/data_temp.txt");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(LoginM3uActivity.this.f25815h.getFilesDir() + "/data_temp.txt").toString())));
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
                    LoginM3uActivity.this.new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f25815h.getFilesDir() + "/data_temp.txt");
                } else {
                    c.h.a.h.n.e.I();
                    c.h.a.h.n.e.l0(LoginM3uActivity.this.f25815h, "Incorrect File/URL");
                }
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
                LoginM3uActivity.this.A0();
                return;
            }
            c.h.a.h.n.e.I();
            LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
            f fVar = loginM3uActivity.new f((Activity) loginM3uActivity.f25815h);
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
                new k(LoginM3uActivity.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f25816i);
                return;
            }
            c.h.a.h.n.e.I();
            LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
            f fVar = loginM3uActivity.new f((Activity) loginM3uActivity.f25815h);
            fVar.setCancelable(false);
            fVar.show();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            c.h.a.h.n.e.i0(LoginM3uActivity.this);
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25840b;

        public j(View view) {
            this.f25840b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25840b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25840b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25840b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            LoginM3uActivity loginM3uActivity;
            TextView textView;
            TextView textView2;
            int color;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                View view2 = this.f25840b;
                if (view2 != null && view2.getTag() != null && this.f25840b.getTag().equals("3")) {
                    view.setBackgroundResource(R.drawable.logout_btn);
                    return;
                }
                View view3 = this.f25840b;
                if (view3 == null || view3.getTag() == null || !this.f25840b.getTag().equals("rl_add_user")) {
                    View view4 = this.f25840b;
                    if (view4 == null || view4.getTag() == null || !this.f25840b.getTag().equals("rl_list_users")) {
                        return;
                    }
                    LoginM3uActivity.this.rl_list_users.setBackgroundResource(R.drawable.login_btn_unfocused);
                    LoginM3uActivity.this.iv_list_users.setImageResource(R.drawable.login_icon2_unfocused);
                    loginM3uActivity = LoginM3uActivity.this;
                    textView = loginM3uActivity.tv_list_users;
                } else {
                    LoginM3uActivity.this.rl_add_user.setBackgroundResource(R.drawable.login_btn_unfocused);
                    LoginM3uActivity.this.iv_add_user.setImageResource(R.drawable.add_user_black);
                    loginM3uActivity = LoginM3uActivity.this;
                    textView = loginM3uActivity.tv_add_user;
                }
                textView.setTextColor(loginM3uActivity.f25815h.getResources().getColor(R.color.black));
                return;
            }
            f2 = z ? 1.1f : 1.0f;
            try {
                b(f2);
                c(f2);
                View view5 = this.f25840b;
                if (view5 != null && view5.getTag() != null && this.f25840b.getTag().equals("3")) {
                    b(f2);
                    c(f2);
                    view.setBackgroundResource(R.drawable.blue_btn_effect);
                    return;
                }
                View view6 = this.f25840b;
                if (view6 == null || view6.getTag() == null || !this.f25840b.getTag().equals("rl_add_user")) {
                    View view7 = this.f25840b;
                    if (view7 == null || view7.getTag() == null || !this.f25840b.getTag().equals("rl_list_users")) {
                        return;
                    }
                    LoginM3uActivity.this.rl_list_users.setBackgroundResource(R.drawable.login_btn_focused);
                    LoginM3uActivity.this.iv_list_users.setImageResource(R.drawable.login_icon2_focused);
                    LoginM3uActivity loginM3uActivity2 = LoginM3uActivity.this;
                    textView2 = loginM3uActivity2.tv_list_users;
                    color = loginM3uActivity2.f25815h.getResources().getColor(R.color.white);
                } else {
                    LoginM3uActivity.this.rl_add_user.setBackgroundResource(R.drawable.login_btn_focused);
                    LoginM3uActivity.this.iv_add_user.setImageResource(R.drawable.add_user_white);
                    LoginM3uActivity loginM3uActivity3 = LoginM3uActivity.this;
                    textView2 = loginM3uActivity3.tv_add_user;
                    color = loginM3uActivity3.f25815h.getResources().getColor(R.color.white);
                }
                textView2.setTextColor(color);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class k extends AsyncTask<String, Void, Boolean> {
        public k() {
        }

        public /* synthetic */ k(LoginM3uActivity loginM3uActivity, a aVar) {
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
                new g(LoginM3uActivity.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, LoginM3uActivity.this.f25816i);
            } else {
                c.h.a.h.n.e.I();
                c.h.a.h.n.e.l0(LoginM3uActivity.this.f25815h, LoginM3uActivity.this.f25815h.getResources().getString(R.string.file_url_not_valid));
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class l extends AsyncTask<String, Void, String> {
        public l() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                LoginM3uActivity.this.f25814g = new FileInputStream(new File(strArr[0]));
                LoginM3uActivity loginM3uActivity = LoginM3uActivity.this;
                return loginM3uActivity.z.c(loginM3uActivity.f25814g, loginM3uActivity.f25815h);
            } catch (Exception unused) {
                return BuildConfig.FLAVOR;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (str.equals(BuildConfig.FLAVOR)) {
                    c.h.a.h.n.e.I();
                    Toast.makeText(LoginM3uActivity.this.f25815h, LoginM3uActivity.this.f25815h.getResources().getString(R.string.unable_to_add_user), 1).show();
                } else {
                    LoginM3uActivity.this.P = str;
                    if (c.h.a.h.n.a.M.booleanValue()) {
                        LoginM3uActivity.this.O0();
                    } else if (LoginM3uActivity.this.R == null || !LoginM3uActivity.this.R.equals("url")) {
                        LoginM3uActivity.this.new h().execute(new Void[0]);
                    } else {
                        LoginM3uActivity.this.A0();
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (LoginM3uActivity.this.R == null || !LoginM3uActivity.this.R.equals("url")) {
                c.h.a.h.n.e.i0(LoginM3uActivity.this);
            }
        }
    }

    static {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        f25811d = externalStorageDirectory;
        f25812e = new File(externalStorageDirectory.getPath() + "/IPTVSmartersM3u");
    }

    public static String Q0(String str) {
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

    public static String W0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return Q0(str2);
        }
        return Q0(str) + " " + str2;
    }

    public static String Z0(String str) {
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
        this.C = Z0(c.h.a.f.f.c(this) + "*" + c.h.a.f.f.d(this) + "-playlist-" + c.h.a.f.b.f16735b + "-" + this.E + "-unknown-" + W0() + "-" + this.D);
        ArrayList arrayList = new ArrayList();
        c.h.a.f.g.f16757a = arrayList;
        arrayList.add(c.h.a.f.g.a("m", "gu"));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("k", c.h.a.f.f.c(this)));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("sc", this.C));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("u", "playlist"));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("pw", "no_password"));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("r", c.h.a.f.b.f16735b));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("av", this.E));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("dt", "unknown"));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("d", W0()));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("do", this.D));
        c.h.a.f.g.f16758b.b(this);
    }

    public final void O0() {
        String str;
        int iQ;
        Context context;
        try {
            SharedPreferences.Editor editorEdit = getSharedPreferences("loginPrefs", 0).edit();
            editorEdit.putString("username", "playlist");
            editorEdit.putString("password", "playlist");
            editorEdit.putString("serverPort", BuildConfig.FLAVOR);
            String str2 = this.R;
            if (str2 == null || !str2.equals("url")) {
                editorEdit.putString("serverUrl", this.f25817j);
                str = this.f25817j;
            } else {
                editorEdit.putString("serverUrl", this.f25816i);
                str = this.f25816i;
            }
            editorEdit.putString("serverM3UUrl", str);
            editorEdit.putString("anyName", this.f25818k);
            editorEdit.apply();
            this.f25822o = this.f25815h.getSharedPreferences("allowedFormat", 0);
            this.q = this.f25815h.getSharedPreferences("timeFormat", 0);
            this.r = this.f25815h.getSharedPreferences("epgchannelupdate", 0);
            this.s = this.f25815h.getSharedPreferences("automation_channels", 0);
            this.t = this.f25815h.getSharedPreferences("automation_epg", 0);
            this.p = this.f25822o.edit();
            this.u = this.q.edit();
            this.v = this.r.edit();
            this.w = this.s.edit();
            this.x = this.t.edit();
            SharedPreferences sharedPreferences = this.f25815h.getSharedPreferences("auto_start", 0);
            this.A = sharedPreferences;
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            this.B = editorEdit2;
            if (editorEdit2 != null) {
                editorEdit2.putBoolean("full_epg", true);
                this.B.apply();
            }
            String string = this.f25822o.getString("allowedFormat", BuildConfig.FLAVOR);
            if (string != null && string.equals(BuildConfig.FLAVOR)) {
                this.p.putString("allowedFormat", "ts");
                this.p.apply();
            }
            if (this.s.getString("automation_channels", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                this.w.putString("automation_channels", "checked");
                this.w.apply();
            }
            if (this.t.getString("automation_epg", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                this.x.putString("automation_epg", "checked");
                this.x.apply();
            }
            if (this.q.getString("timeFormat", c.h.a.h.n.a.m0).equals(BuildConfig.FLAVOR)) {
                this.u.putString("timeFormat", c.h.a.h.n.a.m0);
                this.u.apply();
            }
            if (this.r.getString("epgchannelupdate", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                this.v.putString("epgchannelupdate", "all");
                this.v.apply();
            }
            c.h.a.h.n.a.L = Boolean.TRUE;
            m.N("m3u", this.f25815h);
            String str3 = this.R;
            if (str3 == null || !str3.equals("url")) {
                if (!this.f25820m.l(this.f25818k, "playlist", "playlist", this.f25817j, "m3u", BuildConfig.FLAVOR)) {
                    this.f25820m.i(this.f25818k, "playlist", "playlist", this.f25817j, TransferTable.COLUMN_FILE);
                    Toast.makeText(this.f25815h, getResources().getString(R.string.user_added), 0).show();
                }
                SharedPreferences.Editor editorEdit3 = this.f25815h.getSharedPreferences("loginprefsmultiuser", 0).edit();
                editorEdit3.putString("name", this.f25818k);
                editorEdit3.putString("username", "playlist");
                editorEdit3.putString("password", "playlist");
                editorEdit3.putString(c.h.a.h.n.a.t, this.f25817j);
                editorEdit3.apply();
                if (this.f25815h != null) {
                    c.h.a.i.q.g gVar = new c.h.a.i.q.g(this.f25815h);
                    this.f25820m = gVar;
                    iQ = gVar.q(this.f25818k, "playlist", "playlist", this.f25817j, "m3u", BuildConfig.FLAVOR);
                    m.f0(iQ, this.f25815h);
                }
            } else {
                if (!this.f25820m.l(this.f25818k, "playlist", "playlist", this.f25816i, "m3u", BuildConfig.FLAVOR)) {
                    this.f25820m.i(this.f25818k, "playlist", "playlist", this.f25816i, "url");
                    Toast.makeText(this.f25815h, getResources().getString(R.string.user_added), 0).show();
                }
                SharedPreferences.Editor editorEdit4 = this.f25815h.getSharedPreferences("loginprefsmultiuser", 0).edit();
                editorEdit4.putString("name", this.f25818k);
                editorEdit4.putString("username", "playlist");
                editorEdit4.putString("password", "playlist");
                editorEdit4.putString(c.h.a.h.n.a.t, this.f25816i);
                editorEdit4.apply();
                if (this.f25815h != null) {
                    c.h.a.i.q.g gVar2 = new c.h.a.i.q.g(this.f25815h);
                    this.f25820m = gVar2;
                    iQ = gVar2.q(this.f25818k, "playlist", "playlist", this.f25816i, "m3u", BuildConfig.FLAVOR);
                    m.f0(iQ, this.f25815h);
                }
            }
            c.h.a.h.n.e.I();
            if (this.f25819l.C1("m3u") == 0) {
                ArrayList<c.h.a.i.q.e> arrayList = new ArrayList<>();
                c.h.a.i.q.e eVar = new c.h.a.i.q.e();
                eVar.l("all");
                eVar.j("0");
                eVar.g(BuildConfig.FLAVOR);
                arrayList.add(0, eVar);
                this.f25819l.b2(arrayList, "m3u");
            }
            c.h.a.i.q.e eVarY1 = this.f25819l.Y1("all");
            if (eVarY1 != null) {
                if ((eVarY1.d() == null || !eVarY1.d().equals("0")) && (eVarY1.d() == null || !eVarY1.d().equals("2"))) {
                    if (eVarY1.d() != null && eVarY1.d().equals("1")) {
                        long jR = c.h.a.h.n.e.r(new SimpleDateFormat("dd/MM/yyyy", Locale.US), eVarY1.a(), c.h.a.h.n.e.i());
                        if (!S0() || jR < f25813f.g()) {
                            this.f25815h.startActivity(new Intent(this.f25815h, (Class<?>) NewDashboardActivity.class));
                            context = this.f25815h;
                        } else {
                            this.f25815h.startActivity(new Intent(this.f25815h, (Class<?>) ImportM3uActivity.class));
                            context = this.f25815h;
                        }
                    } else {
                        if (eVarY1.d() == null || !eVarY1.d().equals("3")) {
                            return;
                        }
                        this.f25815h.startActivity(new Intent(this.f25815h, (Class<?>) ImportM3uActivity.class));
                        context = this.f25815h;
                    }
                } else {
                    if (this.f25815h == null) {
                        return;
                    }
                    this.f25815h.startActivity(new Intent(this.f25815h, (Class<?>) ImportM3uActivity.class));
                    context = this.f25815h;
                }
                ((Activity) context).finish();
            }
        } catch (Exception unused) {
        }
    }

    public void P0() {
        try {
            this.E = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public final void R0() {
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

    public boolean S0() {
        return this.f25815h.getSharedPreferences("automation_channels", 0).getString("automation_channels", BuildConfig.FLAVOR).equals("checked");
    }

    public boolean T0() {
        if (!c.h.a.h.n.a.f17040d.booleanValue()) {
            if (this.etM3uLineFile.getText().toString().trim().length() != 0) {
                return true;
            }
            this.tv_browse_error.setVisibility(0);
            this.tv_browse_error.requestFocus();
            this.tv_browse_error.setError(this.f25815h.getResources().getString(R.string.choose_any_playlist_file));
            return false;
        }
        if (this.etName.getText().toString().trim().length() == 0) {
            this.etName.requestFocus();
            this.etName.setError(getResources().getString(R.string.enter_any_name));
            return false;
        }
        if (this.etM3uLineFile.getText().toString().trim().length() != 0) {
            return true;
        }
        this.tv_browse_error.setVisibility(0);
        this.tv_browse_error.requestFocus();
        this.tv_browse_error.setError(this.f25815h.getResources().getString(R.string.choose_any_playlist_file));
        return false;
    }

    public boolean U0() {
        EditText editText;
        String string;
        if (c.h.a.h.n.a.f17040d.booleanValue()) {
            if (this.etName.getText().toString().trim().length() == 0) {
                this.etName.requestFocus();
                editText = this.etName;
                string = getResources().getString(R.string.enter_any_name);
                editText.setError(string);
                return false;
            }
            if (this.etM3uLine.getText().toString().trim().length() != 0) {
                return true;
            }
        } else if (this.etM3uLine.getText().toString().trim().length() != 0) {
            return true;
        }
        this.etM3uLine.requestFocus();
        editText = this.etM3uLine;
        string = getResources().getString(R.string.enter_m3u_error);
        editText.setError(string);
        return false;
    }

    public void V0() {
        c.h.a.h.g gVar = new c.h.a.h.g(this.f25815h, new c(new String[]{BuildConfig.FLAVOR}));
        if (Build.VERSION.SDK_INT >= 30) {
            gVar.u(BuildConfig.FLAVOR);
        } else {
            gVar.t(BuildConfig.FLAVOR);
        }
    }

    public final void X0() {
        try {
            this.f25820m = new c.h.a.i.q.g(this.f25815h);
            this.f25819l = new c.h.a.i.q.f(this.f25815h);
            this.f25821n = new c.h.a.i.q.a(this.f25815h);
            c.h.a.f.g.f16758b = new c.h.a.f.g(this);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
            this.K = sharedPreferences;
            this.L = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = getSharedPreferences("sharedPreference", 0);
            this.N = sharedPreferences2;
            this.M = sharedPreferences2.edit();
            this.O = getSharedPreferences("loginPrefs", 0);
            this.y = (RadioGroup) findViewById(R.id.rg_radio);
            if (c.h.a.h.n.a.f17040d.booleanValue()) {
                this.rl_playlist_name.setVisibility(0);
                this.etName.requestFocus();
                this.rl_list_users.setVisibility(0);
            } else {
                this.rl_playlist_name.setVisibility(8);
                this.rbFile.requestFocus();
                this.rl_list_users.setVisibility(4);
                this.tv_add_user.setText(getResources().getString(R.string.login_user));
            }
            this.f25822o = this.f25815h.getSharedPreferences("allowedFormat", 0);
            Button button = this.bt_browse;
            button.setOnFocusChangeListener(new j(button));
            RelativeLayout relativeLayout = this.rl_add_user;
            relativeLayout.setOnFocusChangeListener(new j(relativeLayout));
            RelativeLayout relativeLayout2 = this.rl_list_users;
            relativeLayout2.setOnFocusChangeListener(new j(relativeLayout2));
            this.vpn_button.setOnClickListener(new a());
            this.rl_list_users.setOnClickListener(new b());
        } catch (Resources.NotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public void Y0() {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    return;
                }
                a.i.h.a.q(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
            }
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.f.c
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public void d0(String str, int i2, boolean z) {
        Toast toastMakeText;
        if (z) {
            boolean z2 = true;
            if (i2 == 1) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    c.h.a.f.b.f16734a = jSONObject;
                    if (jSONObject.getString("status").equalsIgnoreCase("true")) {
                        this.G = c.h.a.f.b.f16734a.getString("su");
                        this.H = c.h.a.f.b.f16734a.getString("ndd");
                        this.I = System.currentTimeMillis();
                        c.h.a.f.f.e(this, c.h.a.f.b.f16734a.optString("su"));
                        this.J = Z0(c.h.a.f.b.f16734a.optString("su") + "*" + c.h.a.f.f.d(this) + "*" + c.h.a.f.b.f16735b);
                        if (c.h.a.f.b.f16734a.getString("sc").equalsIgnoreCase(this.J)) {
                            if (c.h.a.h.n.a.f17040d.booleanValue()) {
                                String str2 = this.G;
                                if (str2 != null && !str2.equals(BuildConfig.FLAVOR) && !this.G.isEmpty()) {
                                    this.Q = new ArrayList<>(Arrays.asList(this.G.split(",")));
                                }
                                ArrayList<String> arrayList = this.Q;
                                if (arrayList == null || arrayList.size() < 1) {
                                    toastMakeText = Toast.makeText(this, this.f25815h.getResources().getString(R.string.please_check_portal), 0);
                                } else {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= this.Q.size()) {
                                            z2 = false;
                                            break;
                                        }
                                        String str3 = this.P;
                                        if (str3 != null && str3.contains(this.Q.get(i3))) {
                                            O0();
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (z2) {
                                        return;
                                    }
                                    c.h.a.h.n.e.I();
                                    toastMakeText = Toast.makeText(this, this.f25815h.getResources().getString(R.string.file_is_invalid), 0);
                                }
                            } else {
                                String str4 = this.P;
                                if (str4 != null && str4.contains(c.h.a.f.f.a(this))) {
                                    O0();
                                    return;
                                } else {
                                    c.h.a.h.n.e.I();
                                    toastMakeText = Toast.makeText(this, this.f25815h.getResources().getString(R.string.invalid_server_url), 0);
                                }
                            }
                            toastMakeText.show();
                        }
                    }
                } catch (Exception e2) {
                    Log.e("Login check", e2.getMessage());
                }
            }
        }
    }

    public final void b1(Intent intent) throws Throwable {
        String str;
        if (intent == null || Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            this.U = intent.getData();
            ContentResolver contentResolver = getContentResolver();
            String string = BuildConfig.FLAVOR;
            if ((contentResolver == null || getContentResolver().getType(this.U) == null || !a.i.q.c.a(getContentResolver().getType(this.U), "audio/mpegurl")) && (getContentResolver() == null || getContentResolver().getType(this.U) == null || !a.i.q.c.a(getContentResolver().getType(this.U), "audio/x-mpegurl"))) {
                Toast.makeText(this, this.f25815h.getResources().getString(R.string.file_is_invalid), 0).show();
            } else {
                Cursor cursorQuery = null;
                if (DocumentsContract.isDocumentUri(this.f25815h.getApplicationContext(), this.U)) {
                    if (c.h.a.k.h.b.c(this.U)) {
                        Uri uri = this.U;
                        if (uri != null && uri.getPath() != null && this.U.getPathSegments() != null && this.U.getPathSegments().size() >= 2) {
                            String[] strArrSplit = this.U.getPathSegments().get(1).split(":");
                            String str2 = strArrSplit[0];
                            if (str2.contains("primary")) {
                                str = Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                            } else if (str2.contains("raw")) {
                                str = strArrSplit[1];
                            } else {
                                str = "/storage/" + str2 + "/" + strArrSplit[1];
                            }
                            string = str;
                        }
                    } else if (c.h.a.k.h.b.b(this.U)) {
                        try {
                            Cursor cursorQuery2 = this.f25815h.getContentResolver().query(this.U, new String[]{"_display_name"}, null, null, null);
                            if (cursorQuery2 != null) {
                                try {
                                    if (cursorQuery2.moveToFirst()) {
                                        string = Environment.getExternalStorageDirectory().toString() + "/Download/" + cursorQuery2.getString(0);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursorQuery = cursorQuery2;
                                    throw th;
                                }
                            }
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                if (string.length() == 0) {
                    try {
                        cursorQuery = this.f25815h.getContentResolver().query(this.U, new String[]{"_data"}, null, null, null);
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                        cursorQuery.moveToFirst();
                        string = cursorQuery.getString(columnIndexOrThrow);
                        cursorQuery.close();
                    } finally {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
            }
            this.etM3uLineFile.setText(string);
            this.tv_browse_error.setVisibility(8);
            this.tv_file_path.setVisibility(0);
            this.tv_file_path.setText(string);
        } catch (Exception e2) {
            Log.e("EditProfile>>>", "Execpetion >>>" + e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:3:0x0003, B:5:0x000f, B:7:0x0017, B:9:0x001f, B:11:0x0027, B:12:0x003a, B:14:0x003e, B:17:0x0046, B:19:0x004e, B:21:0x0052, B:23:0x0060, B:27:0x006a, B:28:0x007a, B:24:0x0064, B:29:0x0082, B:30:0x008d, B:32:0x0091, B:34:0x009b, B:35:0x009f), top: B:39:0x0003 }] */
    @Override // c.h.a.f.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(int r5) {
        /*
            r4 = this;
            c.h.a.h.n.e.I()
            java.lang.Boolean r5 = c.h.a.h.n.a.f17040d     // Catch: java.lang.Exception -> Lad
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> Lad
            r0 = 2132018301(0x7f14047d, float:1.9674905E38)
            r1 = 0
            if (r5 == 0) goto L8d
            java.lang.String r5 = c.h.a.f.f.a(r4)     // Catch: java.lang.Exception -> Lad
            r4.G = r5     // Catch: java.lang.Exception -> Lad
            if (r5 == 0) goto L3a
            java.lang.String r2 = ""
            boolean r5 = r5.equals(r2)     // Catch: java.lang.Exception -> Lad
            if (r5 != 0) goto L3a
            java.lang.String r5 = r4.G     // Catch: java.lang.Exception -> Lad
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Exception -> Lad
            if (r5 != 0) goto L3a
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lad
            java.lang.String r2 = r4.G     // Catch: java.lang.Exception -> Lad
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Exception -> Lad
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Exception -> Lad
            r5.<init>(r2)     // Catch: java.lang.Exception -> Lad
            r4.Q = r5     // Catch: java.lang.Exception -> Lad
        L3a:
            java.util.ArrayList<java.lang.String> r5 = r4.Q     // Catch: java.lang.Exception -> Lad
            if (r5 == 0) goto L82
            int r5 = r5.size()     // Catch: java.lang.Exception -> Lad
            r2 = 1
            if (r5 < r2) goto L82
            r5 = 0
        L46:
            java.util.ArrayList<java.lang.String> r0 = r4.Q     // Catch: java.lang.Exception -> Lad
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lad
            if (r5 >= r0) goto L67
            java.lang.String r0 = r4.P     // Catch: java.lang.Exception -> Lad
            if (r0 == 0) goto L64
            java.util.ArrayList<java.lang.String> r3 = r4.Q     // Catch: java.lang.Exception -> Lad
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Exception -> Lad
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Exception -> Lad
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Exception -> Lad
            if (r0 == 0) goto L64
            r4.O0()     // Catch: java.lang.Exception -> Lad
            goto L68
        L64:
            int r5 = r5 + 1
            goto L46
        L67:
            r2 = 0
        L68:
            if (r2 != 0) goto Lad
            c.h.a.h.n.e.I()     // Catch: java.lang.Exception -> Lad
            android.content.Context r5 = r4.f25815h     // Catch: java.lang.Exception -> Lad
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Exception -> Lad
            r0 = 2132017771(0x7f14026b, float:1.967383E38)
            java.lang.String r5 = r5.getString(r0)     // Catch: java.lang.Exception -> Lad
        L7a:
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)     // Catch: java.lang.Exception -> Lad
            r5.show()     // Catch: java.lang.Exception -> Lad
            goto Lad
        L82:
            android.content.Context r5 = r4.f25815h     // Catch: java.lang.Exception -> Lad
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Exception -> Lad
            java.lang.String r5 = r5.getString(r0)     // Catch: java.lang.Exception -> Lad
            goto L7a
        L8d:
            java.lang.String r5 = r4.P     // Catch: java.lang.Exception -> Lad
            if (r5 == 0) goto L9f
            java.lang.String r2 = c.h.a.f.f.a(r4)     // Catch: java.lang.Exception -> Lad
            boolean r5 = r5.contains(r2)     // Catch: java.lang.Exception -> Lad
            if (r5 == 0) goto L9f
            r4.O0()     // Catch: java.lang.Exception -> Lad
            goto Lad
        L9f:
            c.h.a.h.n.e.I()     // Catch: java.lang.Exception -> Lad
            android.content.Context r5 = r4.f25815h     // Catch: java.lang.Exception -> Lad
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Exception -> Lad
            java.lang.String r5 = r5.getString(r0)     // Catch: java.lang.Exception -> Lad
            goto L7a
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.LoginM3uActivity.n(int):void");
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) throws Throwable {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 101) {
            try {
                Y0();
            } catch (Exception unused) {
            }
        } else if (i2 == 201) {
            b1(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    @SuppressLint({"RtlHardcoded"})
    public void onCreate(Bundle bundle) {
        this.f25815h = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25815h);
        f25813f = aVar;
        String strA = aVar.A();
        this.S = strA;
        setContentView(strA.equals(c.h.a.h.n.a.s0) ? R.layout.activity_login_m3u_tv : R.layout.activity_login_m3u);
        ButterKnife.a(this);
        Y0();
        X0();
        if (c.h.a.h.n.a.M.booleanValue()) {
            return;
        }
        P0();
        y0();
        W0();
        z0();
        R0();
    }

    public void onRadioButtonClicked(View view) {
        boolean zIsChecked = ((RadioButton) view).isChecked();
        int id = view.getId();
        if (id == R.id.rb_file) {
            if (zIsChecked) {
                this.tv_file_path.setVisibility(0);
                this.bt_browse.setVisibility(0);
                this.etM3uLine.setVisibility(8);
                this.tv_browse_error.setVisibility(8);
                return;
            }
            return;
        }
        if (id == R.id.rb_m3u && zIsChecked) {
            this.tv_file_path.setVisibility(8);
            this.bt_browse.setVisibility(8);
            this.tv_browse_error.setVisibility(8);
            this.etM3uLine.setVisibility(0);
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                Y0();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                onBackPressed();
            } else {
                b.a aVar = new b.a(this, R.style.AlertDialogCustom);
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.permission_alertbox, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(R.id.btn_grant);
                Button button2 = (Button) viewInflate.findViewById(R.id.btn_cancel);
                button.setOnFocusChangeListener(new e.j(button, this));
                button2.setOnFocusChangeListener(new e.j(button2, this));
                button.requestFocus();
                button.setOnClickListener(new d());
                button2.setOnClickListener(new e());
                aVar.setView(viewInflate);
                this.T = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.T.getWindow();
                window.getClass();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.T.show();
                this.T.getWindow().setAttributes(layoutParams);
                this.T.setCancelable(false);
                this.T.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        c.h.a.h.n.e.g(this.f25815h);
    }

    @OnClick
    public void onViewClicked(View view) {
        int i2;
        int id = view.getId();
        if (id == R.id.bt_browse) {
            try {
                if (!this.S.equals(c.h.a.h.n.a.s0) && (i2 = Build.VERSION.SDK_INT) >= 23) {
                    Intent intent = new Intent();
                    intent.setType((i2 == 23 || i2 == 24 || i2 == 25 || i2 == 26 || i2 == 27 || i2 == 28) ? "audio/mpegurl" : (i2 == 29 || i2 == 30) ? "audio/x-mpegurl" : "audio/*");
                    intent.setAction("android.intent.action.GET_CONTENT");
                    startActivityForResult(Intent.createChooser(intent, "Select File"), 201);
                } else {
                    V0();
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (id != R.id.rl_add_user) {
            return;
        }
        int checkedRadioButtonId = this.y.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.rb_file && T0()) {
            this.f25818k = this.etName.getText().toString().trim();
            this.f25817j = this.etM3uLineFile.getText().toString().trim();
            this.R = TransferTable.COLUMN_FILE;
            new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f25817j);
        }
        if (checkedRadioButtonId == R.id.rb_m3u && U0()) {
            this.f25816i = this.etM3uLine.getText().toString().trim();
            this.f25818k = this.etName.getText().toString().trim();
            this.R = "url";
            new i().execute(new Void[0]);
        }
    }

    public void y0() {
        this.D = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    public void z0() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.F = iNextInt;
        c.h.a.f.b.f16735b = String.valueOf(iNextInt);
    }
}
