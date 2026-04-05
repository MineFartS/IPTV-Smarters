package com.nst.iptvsmarterstvbox.vpn.activities;

import a.b.k.b;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.n.e;
import c.h.a.l.a.c;
import c.h.a.l.a.e;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.util.Mimetypes;
import com.nst.iptvsmarterstvbox.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ImportVPNActivity extends a.b.k.c implements c.h.a.l.b.b.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c.h.a.k.d.a.a f29907d;

    @BindView
    public Button bt_browse;

    @BindView
    public Button btn_back;

    @BindView
    public Button btn_import;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f29908e;

    @BindView
    public EditText et_certificate;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a.b.k.b f29909f;

    @BindView
    public LinearLayout ll_url;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<File> f29917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<String> f29918o;
    public String r;

    @BindView
    public RadioButton rb_file;

    @BindView
    public RadioButton rb_url;

    @BindView
    public LinearLayout rl_browse;
    public Uri s;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_browse_error;

    @BindView
    public TextView tv_file_path;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29910g = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29911h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f29912i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29913j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29914k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f29915l = "url";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f29916m = BuildConfig.FLAVOR;
    public ArrayList<c.h.a.l.e.a> p = null;
    public Thread q = null;

    public class a implements c.a {
        public a() {
        }

        @Override // c.h.a.l.a.c.a
        public void a(File file) {
            Log.i("main", "file download completed");
            if (file == null || !file.exists()) {
                Toast.makeText(ImportVPNActivity.this.f29908e, ImportVPNActivity.this.getResources().getString(R.string.failed_to_get_file), 0).show();
                c.h.a.h.n.e.I();
            } else {
                ImportVPNActivity importVPNActivity = ImportVPNActivity.this;
                new c.h.a.l.a.a(importVPNActivity, file, importVPNActivity).b();
            }
            Log.i("main", "file unzip completed");
        }
    }

    public class b implements e.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f29920a;

        public b(String[] strArr) {
            this.f29920a = strArr;
        }

        @Override // c.h.a.l.a.e.g
        public void a(String str) {
            this.f29920a[0] = str;
            if (!str.endsWith(".zip") && !str.endsWith(".ovpn")) {
                ImportVPNActivity.this.tv_file_path.setVisibility(8);
                ImportVPNActivity.this.tv_browse_error.setVisibility(0);
                ImportVPNActivity importVPNActivity = ImportVPNActivity.this;
                importVPNActivity.tv_browse_error.setText(importVPNActivity.getResources().getString(R.string.file_not_spt));
                return;
            }
            ImportVPNActivity.this.tv_file_path.setVisibility(0);
            ImportVPNActivity.this.tv_file_path.setText(str);
            ImportVPNActivity.this.f29916m = str;
            if (!ImportVPNActivity.this.r.equals(c.h.a.h.n.a.s0) && Build.VERSION.SDK_INT >= 23) {
                ImportVPNActivity.this.L0(str);
            } else {
                ImportVPNActivity.this.M0(str);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(ImportVPNActivity.this.f29908e);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = ImportVPNActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = ImportVPNActivity.this.date;
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
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ImportVPNActivity.this.getPackageName(), null));
                ImportVPNActivity.this.startActivityForResult(intent, 101);
                Toast.makeText(ImportVPNActivity.this.f29908e, ImportVPNActivity.this.f29908e.getResources().getString(R.string.grant_the_permission), 1).show();
            } catch (Exception unused) {
            }
            ImportVPNActivity.this.f29909f.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImportVPNActivity.this.f29909f.dismiss();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ImportVPNActivity.this.D0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void C0() {
        c.h.a.l.a.e eVar = new c.h.a.l.a.e(this.f29908e, new b(new String[]{BuildConfig.FLAVOR}));
        if (Build.VERSION.SDK_INT >= 30) {
            eVar.u(BuildConfig.FLAVOR);
        } else {
            eVar.t(BuildConfig.FLAVOR);
        }
    }

    public void D0() {
        runOnUiThread(new c());
    }

    public final void E0() {
        String str = this.f29915l;
        if (str != null && str.equalsIgnoreCase("url")) {
            F0();
            return;
        }
        try {
            if (!this.r.equals(c.h.a.h.n.a.s0) && Build.VERSION.SDK_INT >= 23) {
                Intent intent = new Intent();
                intent.setType("application/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                startActivityForResult(Intent.createChooser(intent, "Select File"), 201);
            } else {
                C0();
            }
        } catch (Exception unused) {
        }
    }

    public final void F0() {
        File file;
        c.h.a.h.n.e.i0(this);
        if (!this.r.equals(c.h.a.h.n.a.s0)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                file = new File(this.f29908e.getFilesDir() + "/VPNIPTVSmarters/vpncertificate.zip");
            } else if (i2 >= 19) {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters/vpncertificate.zip");
            } else {
                file = new File(Environment.getExternalStorageDirectory() + "/Documents", "VPNIPTVSmarters/vpncertificate.zip");
            }
        } else if (Build.VERSION.SDK_INT >= 19) {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters/vpncertificate.zip");
        } else {
            file = new File(Environment.getExternalStorageDirectory() + "/Documents", "VPNIPTVSmarters/vpncertificate.zip");
        }
        File file2 = new File(String.valueOf(file));
        if (file2.exists()) {
            file2.deleteOnExit();
        }
        new c.h.a.l.a.c(String.valueOf(file), this, new a()).execute(this.f29911h);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:8|(3:119|13|14)(1:15)|(2:123|16)|(9:17|(1:19)(1:131)|129|21|(1:23)|27|(1:29)|30|(2:32|(1:34)(1:35))(2:36|(1:38)(1:(1:40)(1:41))))|20|129|21|(0)|27|(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca A[Catch: Exception -> 0x00d6, TRY_LEAVE, TryCatch #7 {Exception -> 0x00d6, blocks: (B:21:0x00a6, B:23:0x00ca), top: B:129:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G0(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.vpn.activities.ImportVPNActivity.G0(java.lang.String, java.lang.String):void");
    }

    public final void H0(Intent intent) throws Throwable {
        String str;
        if (intent == null || Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            this.s = intent.getData();
            ContentResolver contentResolver = getContentResolver();
            String string = BuildConfig.FLAVOR;
            if ((contentResolver == null || getContentResolver().getType(this.s) == null || !a.i.q.c.a(getContentResolver().getType(this.s), Mimetypes.MIMETYPE_OCTET_STREAM)) && (getContentResolver() == null || getContentResolver().getType(this.s) == null || !a.i.q.c.a(getContentResolver().getType(this.s), "application/zip"))) {
                Toast.makeText(this, this.f29908e.getResources().getString(R.string.file_is_invalid), 0).show();
            } else {
                Cursor cursorQuery = null;
                if (DocumentsContract.isDocumentUri(this.f29908e.getApplicationContext(), this.s)) {
                    if (c.h.a.k.h.b.c(this.s)) {
                        Uri uri = this.s;
                        if (uri != null && uri.getPath() != null && this.s.getPathSegments() != null && this.s.getPathSegments().size() >= 2) {
                            String[] strArrSplit = this.s.getPathSegments().get(1).split(":");
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
                    } else if (c.h.a.k.h.b.b(this.s)) {
                        try {
                            Cursor cursorQuery2 = this.f29908e.getContentResolver().query(this.s, new String[]{"_display_name"}, null, null, null);
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
                        cursorQuery = this.f29908e.getContentResolver().query(this.s, new String[]{"_data"}, null, null, null);
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
            this.tv_file_path.setVisibility(0);
            this.tv_file_path.setText(string);
            this.f29916m = string;
            L0(string);
        } catch (Exception e2) {
            Log.e("EditProfile>>>", "Execpetion >>>" + e2);
        }
    }

    public final void I0(String str, String str2, String str3, File file) {
        c.h.a.l.e.a aVar = new c.h.a.l.e.a();
        if (str3.contains("auth-user-pass")) {
            aVar.k("1");
        } else {
            aVar.k("0");
        }
        aVar.o("0");
        aVar.t(BuildConfig.FLAVOR);
        aVar.s(BuildConfig.FLAVOR);
        aVar.q(str2);
        aVar.l(str);
        aVar.r("0");
        aVar.p(String.valueOf(file));
        this.p.add(aVar);
    }

    public final void J0() {
        c.h.a.h.n.e.I();
        startActivity(new Intent(this, (Class<?>) ProfileActivity.class));
        finish();
    }

    public final void K0() {
        String str = this.f29915l;
        if (str == null || !str.equalsIgnoreCase("url")) {
            String str2 = this.f29916m;
            if (str2 == null || !str2.trim().isEmpty()) {
                if (!this.r.equals(c.h.a.h.n.a.s0) && Build.VERSION.SDK_INT >= 23) {
                    L0(this.f29916m);
                    return;
                } else {
                    M0(this.f29916m);
                    return;
                }
            }
        } else {
            String string = this.et_certificate.getText().toString();
            this.f29911h = string;
            if (string == null || !string.isEmpty()) {
                E0();
                return;
            }
        }
        Toast.makeText(this.f29908e, getResources().getString(R.string.provide_crt_url), 0).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L0(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.vpn.activities.ImportVPNActivity.L0(java.lang.String):void");
    }

    public void M0(String str) {
        File file;
        c.h.a.h.n.e.j0(this.f29908e);
        if (Build.VERSION.SDK_INT >= 19) {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "VPNIPTVSmarters");
        } else {
            file = new File(Environment.getExternalStorageDirectory() + "/Documents", "VPNIPTVSmarters");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(str);
        if (file2.exists() && str.contains(".zip")) {
            new c.h.a.l.a.b(this, file2, this).b();
        } else if (str.contains(".ovpn")) {
            G0(str, ".ovpn");
        } else {
            Toast.makeText(this.f29908e, getResources().getString(R.string.failed_get_file), 0).show();
            c.h.a.h.n.e.I();
        }
    }

    @Override // c.h.a.l.b.b.a
    public void P(String str) {
        G0(str, ".zip");
    }

    @Override // c.h.a.l.b.b.a
    public void Q(String str) {
        c.h.a.h.n.e.I();
        Toast.makeText(this.f29908e, BuildConfig.FLAVOR + str, 0).show();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) throws Throwable {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 201) {
            H0(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this.f29908e, (Class<?>) ProfileActivity.class);
        intent.putExtra("typeid", this.f29912i);
        startActivity(intent);
        super.onBackPressed();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29908e = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f29908e);
        f29907d = aVar;
        String strA = aVar.A();
        this.r = strA;
        setContentView(strA.equals(c.h.a.h.n.a.s0) ? R.layout.activity_import_vpn_tv : R.layout.activity_import_vpn);
        ButterKnife.a(this);
        Thread thread = this.q;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.q = thread2;
            thread2.start();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f29912i = intent.getStringExtra("typeid");
        }
        Button button = this.btn_import;
        button.setOnFocusChangeListener(new e.j(button, this));
        Button button2 = this.btn_back;
        button2.setOnFocusChangeListener(new e.j(button2, this));
        Button button3 = this.bt_browse;
        button3.setOnFocusChangeListener(new e.j(button3, this));
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.q;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.q.interrupt();
        } catch (Exception unused) {
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean zIsChecked = ((RadioButton) view).isChecked();
        int id = view.getId();
        if (id != R.id.rb_file) {
            if (id == R.id.rb_url && zIsChecked) {
                this.f29915l = "url";
                this.ll_url.setVisibility(0);
                this.rl_browse.setVisibility(8);
                return;
            }
            return;
        }
        if (zIsChecked) {
            this.f29915l = TransferTable.COLUMN_FILE;
            this.ll_url.setVisibility(8);
            this.rl_browse.setVisibility(0);
            this.tv_browse_error.setVisibility(8);
            this.tv_file_path.setVisibility(8);
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                E0();
            } else if (Build.VERSION.SDK_INT >= 23 && !shouldShowRequestPermissionRationale(strArr[0])) {
                b.a aVar = new b.a(this, R.style.AlertDialogCustom);
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.permission_alertbox, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(R.id.btn_grant);
                Button button2 = (Button) viewInflate.findViewById(R.id.btn_cancel);
                button.setOnFocusChangeListener(new e.j(button, this));
                button2.setOnFocusChangeListener(new e.j(button2, this));
                button.setOnClickListener(new d());
                button2.setOnClickListener(new e());
                aVar.setView(viewInflate);
                this.f29909f = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f29909f.getWindow();
                window.getClass();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f29909f.show();
                this.f29909f.getWindow().setAttributes(layoutParams);
                this.f29909f.setCancelable(false);
                this.f29909f.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.q;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.q = thread2;
            thread2.start();
        }
    }

    @OnClick
    public void onclick(View view) {
        int id = view.getId();
        if (id == R.id.bt_browse) {
            E0();
        } else if (id == R.id.btn_back) {
            onBackPressed();
        } else {
            if (id != R.id.btn_import) {
                return;
            }
            K0();
        }
    }
}
