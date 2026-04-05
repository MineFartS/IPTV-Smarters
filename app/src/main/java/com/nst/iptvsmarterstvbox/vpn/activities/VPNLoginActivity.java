package com.nst.iptvsmarterstvbox.vpn.activities;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import c.h.a.l.a.d;
import com.nst.iptvsmarterstvbox.R;
import d.a.a.d.i;
import d.a.a.d.v;
import de.blinkt.openvpn.LaunchVPN;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.renderer.DefaultRenderer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class VPNLoginActivity extends a.b.k.c {

    @BindView
    public Button btn_back;

    @BindView
    public Button btn_connect;

    @BindView
    public Button btn_save;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f29959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<File> f29960e;

    @BindView
    public EditText et_password;

    @BindView
    public EditText et_username;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f29961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.l.a.d f29962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f29964i;

    @BindView
    public ImageView iv_spinner_down;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f29967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f29968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f29969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f29970o;
    public String p;

    @BindView
    public LinearLayout password_p;

    @BindView
    public Spinner spinner_server;
    public c.h.a.l.c.a t;
    public Intent u;

    @BindView
    public LinearLayout username_p;
    public i w;
    public String q = BuildConfig.FLAVOR;
    public String r = BuildConfig.FLAVOR;
    public int s = 0;
    public String v = BuildConfig.FLAVOR;
    public ServiceConnection x = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            VPNLoginActivity.this.w = i.a.J(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            VPNLoginActivity.this.w = null;
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            ((TextView) VPNLoginActivity.this.spinner_server.getSelectedView()).setTextColor(VPNLoginActivity.this.getResources().getColor(R.color.White));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class c implements d.a {
        public c() {
        }

        @Override // c.h.a.l.a.d.a
        public void a() {
            c.h.a.l.e.b bVar = new c.h.a.l.e.b();
            bVar.f(VPNLoginActivity.this.f29966k);
            bVar.d(VPNLoginActivity.this.f29967l);
            bVar.e(VPNLoginActivity.this.f29968m);
            bVar.l(VPNLoginActivity.this.f29963h);
            bVar.h(VPNLoginActivity.this.f29964i);
        }

        @Override // c.h.a.l.a.d.a
        public void b(String str) {
            Toast.makeText(VPNLoginActivity.this.f29959d, VPNLoginActivity.this.getResources().getString(R.string.failed_import), 0).show();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class d extends AsyncTask<Boolean, Void, Boolean> {
        public d() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return VPNLoginActivity.this.D0();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            c.h.a.h.n.e.I();
            if (bool.booleanValue()) {
                VPNLoginActivity.this.J0();
            } else {
                Toast.makeText(VPNLoginActivity.this.f29959d, VPNLoginActivity.this.getResources().getString(R.string.list_not_found), 0).show();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            c.h.a.h.n.e.j0(VPNLoginActivity.this.f29959d);
        }
    }

    public class e extends ArrayAdapter<List<File>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f29975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<File> f29976c;

        public e(Context context, int i2, List<File> list) {
            super(context, i2, Collections.singletonList(list));
            this.f29975b = context;
            this.f29976c = list;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<File> getItem(int i2) {
            return this.f29976c;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public int getCount() {
            return this.f29976c.size();
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, @NotNull ViewGroup viewGroup) {
            TextView textView = (TextView) super.getDropDownView(i2, view, viewGroup);
            textView.setTextColor(DefaultRenderer.BACKGROUND_COLOR);
            String name = this.f29976c.get(i2).getName();
            if (name != null && name.endsWith(".ovpn")) {
                name = name.replaceAll(".ovpn", BuildConfig.FLAVOR);
            }
            textView.setText(name);
            return textView;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NotNull
        public View getView(int i2, View view, @NotNull ViewGroup viewGroup) {
            TextView textView = (TextView) super.getView(i2, view, viewGroup);
            textView.setTextColor(DefaultRenderer.BACKGROUND_COLOR);
            String name = this.f29976c.get(i2).getName();
            textView.setText((name == null || !name.endsWith(".ovpn")) ? this.f29976c.get(i2).getName() : name.replaceAll(".ovpn", BuildConfig.FLAVOR));
            return textView;
        }
    }

    public void B0(String str, String str2) {
        File file = new File(str);
        try {
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String str3 = BuildConfig.FLAVOR;
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    str3 = (str3 + line) + "\n";
                }
                if (str3.contains("\n")) {
                    String[] strArrSplit = str3.split("\n");
                    if (strArrSplit.length == 2) {
                        this.f29963h = strArrSplit[0];
                        this.f29964i = strArrSplit[1];
                        if (str2.equals("connect")) {
                            G0();
                        } else {
                            I0();
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Log.d(BuildConfig.FLAVOR, BuildConfig.FLAVOR + e2);
        }
    }

    public final void C0() {
        Context context;
        Resources resources;
        int i2;
        String str;
        String str2;
        this.t = new c.h.a.l.c.a(this.f29959d);
        this.f29963h = this.et_username.getText().toString();
        this.f29964i = this.et_password.getText().toString();
        this.v = "connect";
        if (this.f29969n.equals("typeovpn")) {
            str2 = this.f29970o;
        } else {
            if (!this.q.endsWith(".ovpn")) {
                String str3 = this.f29963h;
                if (str3 != null && str3.trim().isEmpty() && (str = this.f29964i) != null && str.trim().isEmpty()) {
                    F0(this.v);
                    return;
                }
                String str4 = this.f29963h;
                if (str4 == null || !str4.trim().isEmpty()) {
                    String str5 = this.f29964i;
                    if (str5 != null && str5.trim().isEmpty()) {
                        context = this.f29959d;
                        resources = getResources();
                        i2 = R.string.please_enter_password;
                    }
                    G0();
                }
                context = this.f29959d;
                resources = getResources();
                i2 = R.string.please_enter_username;
                Toast.makeText(context, resources.getString(i2), 0).show();
                return;
            }
            str2 = this.q;
        }
        this.f29967l = str2;
        G0();
    }

    public Boolean D0() {
        try {
            this.f29960e = new ArrayList();
            this.f29961f = new ArrayList();
            String str = this.q;
            if (str == null || str.isEmpty()) {
                return Boolean.FALSE;
            }
            File[] fileArrListFiles = new File(this.q).listFiles();
            if (this.f29969n.equals("typeovpn")) {
                this.f29960e.add(new File(this.q));
                return Boolean.TRUE;
            }
            if (this.q.endsWith(".ovpn")) {
                this.f29960e.add(new File(this.q));
                return Boolean.TRUE;
            }
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return Boolean.FALSE;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().endsWith(".ovpn")) {
                    this.f29960e.add(file);
                }
            }
            List<File> list = this.f29960e;
            return (list == null || list.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public void E0(Reader reader, String str) {
        String line;
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            try {
                try {
                    line = bufferedReader.readLine();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                if (line == null) {
                    return;
                }
                if (line.startsWith("auth-user-pass") && line.contains(" ")) {
                    String[] strArrSplit = line.split(" ");
                    if (strArrSplit.length == 2) {
                        String str2 = strArrSplit[0];
                        B0(this.f29966k.replaceAll(this.f29967l, strArrSplit[1]), str);
                    }
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    public final void F0(String str) {
        if (this.f29960e.size() != 0) {
            this.f29966k = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getAbsolutePath();
            this.f29967l = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getName();
            try {
                E0(new BufferedReader(new InputStreamReader(new FileInputStream(new File(this.f29966k)))), str);
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void G0() {
        if (this.f29960e.size() != 0) {
            this.f29967l = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getName();
            this.f29968m = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getName();
            if (this.f29969n.equals("typeovpn")) {
                String name = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getName();
                this.f29967l = name;
                if (!name.startsWith("http://")) {
                    K0();
                }
            } else {
                this.f29966k = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getAbsolutePath();
                this.f29967l = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getName();
                this.f29968m = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getName();
            }
            String str = this.f29967l;
            if (str != null && str.contains(".ovpn")) {
                this.f29967l = this.f29967l.replaceAll(".ovpn", BuildConfig.FLAVOR);
            }
            try {
                c.h.a.l.a.d dVar = new c.h.a.l.a.d(this, new FileInputStream(new File(this.f29966k)), this.f29967l, this.f29966k, this.f29968m, new c());
                this.f29962g = dVar;
                dVar.execute(new Void[0]);
            } catch (FileNotFoundException e2) {
                Toast.makeText(this.f29959d, BuildConfig.FLAVOR + e2, 0).show();
                e2.printStackTrace();
            } catch (Exception e3) {
                Toast.makeText(this.f29959d, BuildConfig.FLAVOR + e3, 0).show();
            }
        }
    }

    public final void H0() {
        Context context;
        Resources resources;
        int i2;
        String str;
        this.t = new c.h.a.l.c.a(this.f29959d);
        this.f29963h = this.et_username.getText().toString();
        this.f29964i = this.et_password.getText().toString();
        this.v = "save";
        List<File> list = this.f29960e;
        if (list != null && list.size() > 0) {
            this.f29966k = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getAbsolutePath();
            this.f29967l = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getName();
            this.f29968m = this.f29960e.get(this.spinner_server.getSelectedItemPosition()).getName();
        }
        String str2 = this.f29963h;
        if (str2 != null && str2.trim().isEmpty() && (str = this.f29964i) != null && str.trim().isEmpty()) {
            F0(this.v);
            return;
        }
        String str3 = this.f29963h;
        if (str3 == null || !str3.trim().isEmpty()) {
            String str4 = this.f29964i;
            if (str4 != null && str4.trim().isEmpty()) {
                context = this.f29959d;
                resources = getResources();
                i2 = R.string.please_enter_password;
            } else if (this.f29966k != null) {
                I0();
                return;
            } else {
                context = this.f29959d;
                resources = getResources();
                i2 = R.string.please_add_server;
            }
        } else {
            context = this.f29959d;
            resources = getResources();
            i2 = R.string.please_enter_username;
        }
        Toast.makeText(context, resources.getString(i2), 0).show();
    }

    public final void I0() {
        List<File> list = this.f29960e;
        if (list == null || list.size() <= 0) {
            return;
        }
        c.h.a.l.e.b bVar = new c.h.a.l.e.b();
        bVar.f(this.f29966k);
        String str = this.f29967l;
        if (str != null && str.endsWith(".ovpn")) {
            this.f29967l = this.f29967l.replaceAll(".ovpn", BuildConfig.FLAVOR);
        }
        bVar.d(this.f29967l);
        bVar.e(this.f29968m);
        bVar.l(this.f29963h);
        bVar.h(this.f29964i);
        bVar.k(-1);
        try {
            String str2 = this.f29965j;
            if (str2 == null || !str2.equalsIgnoreCase("vpneditprofile")) {
                return;
            }
            bVar.g(this.s);
        } catch (Exception e2) {
            Toast.makeText(this.f29959d, BuildConfig.FLAVOR + e2, 0).show();
        }
    }

    public final void J0() {
        this.spinner_server.setAdapter((SpinnerAdapter) new e(this, R.layout.spinner_list_item, this.f29960e));
        String str = this.f29965j;
        if (str == null || !str.equalsIgnoreCase("vpneditprofile") || this.f29966k == null) {
            return;
        }
        File file = new File(this.f29966k);
        if (file.exists()) {
            for (int i2 = 0; i2 < this.f29960e.size(); i2++) {
                if (this.f29960e.get(i2).getAbsolutePath().equals(file.getAbsolutePath())) {
                    this.spinner_server.setSelection(i2);
                    return;
                }
            }
        }
    }

    public void K0() {
        try {
            L0(v.g(this).j(this.f29967l));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void L0(d.a.a.a aVar) {
        c.h.a.h.n.a.Q = this.f29964i;
        c.h.a.h.n.a.P = this.f29963h;
        c.h.a.h.n.a.N = this.s;
        String str = this.f29967l;
        if (str != null && str.contains(".ovpn")) {
            this.f29967l = this.f29967l.replaceAll(".ovpn", BuildConfig.FLAVOR);
        }
        c.h.a.h.n.a.O = this.f29967l;
        c.h.a.h.n.a.R = this.f29966k;
        c.h.a.h.n.a.N = this.s;
        Intent intent = new Intent(this.f29959d, (Class<?>) LaunchVPN.class);
        intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", aVar.E().toString());
        intent.setAction("android.intent.action.MAIN");
        startActivity(intent);
        finish();
    }

    public void M0() {
        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Boolean[0]);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this, (Class<?>) ProfileActivity.class);
        intent.putExtra("typeid", this.f29969n);
        startActivity(intent);
        super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ee, code lost:
    
        if (r8.exists() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x008a, code lost:
    
        if (r8.exists() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008c, code lost:
    
        r8 = r8.getParent();
     */
    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.vpn.activities.VPNLoginActivity.onCreate(android.os.Bundle):void");
    }

    @OnClick
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.btn_back /* 2131427631 */:
                onBackPressed();
                break;
            case R.id.btn_connect /* 2131427639 */:
                C0();
                break;
            case R.id.btn_save /* 2131427667 */:
                H0();
                break;
            case R.id.ll_import_certificate /* 2131428386 */:
                Intent intent = new Intent(this.f29959d, (Class<?>) ImportVPNActivity.class);
                this.u = intent;
                intent.putExtra("typeid", this.f29969n);
                startActivity(this.u);
                finish();
                break;
        }
    }
}
