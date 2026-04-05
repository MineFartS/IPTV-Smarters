package c.h.a.l.a;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.utility.ListViewMaxHeight;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f17958c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f17962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.k.b.e f17963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.k.b.g f17964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f17965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f17966k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ListViewMaxHeight f17968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AlertDialog.Builder f17969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AlertDialog f17970o;
    public File p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17956a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17959d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f17960e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f17961f = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap<String, String> f17967l = new HashMap<>();

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            e.this.f17966k.setVisibility(0);
            e.this.p = new File((String) e.this.f17961f.get(i2));
            if (e.this.p != null && e.this.p.isFile()) {
                e eVar = e.this;
                eVar.f17959d = eVar.p.getName();
                if (!e.this.f17959d.endsWith(".zip") && !e.this.f17959d.endsWith(".ovpn")) {
                    Toast.makeText(e.this.f17958c, "Please select .zip or .ovpn File", 0).show();
                    return;
                } else {
                    if (e.this.f17962g != null) {
                        e.this.f17962g.a(e.this.p.getPath());
                        e.this.f17970o.dismiss();
                        return;
                    }
                    return;
                }
            }
            e eVar2 = e.this;
            eVar2.f17959d = eVar2.p.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (e.this.f17959d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                e eVar3 = e.this;
                eVar3.s(eVar3.p);
                return;
            }
            arrayList.add(e.this.p.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (e.this.p.list() != null) {
                int i3 = 0;
                while (true) {
                    String[] list = e.this.p.list();
                    list.getClass();
                    if (i3 >= list.length) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.this.p.getPath());
                    sb.append("/");
                    String[] list2 = e.this.p.list();
                    list2.getClass();
                    sb.append(list2[i3]);
                    arrayList.add(sb.toString());
                    i3++;
                }
            }
            e.this.f17961f.clear();
            e.this.f17961f.addAll(arrayList);
            e.this.f17964i.notifyDataSetChanged();
            e.this.f17968m.setSelection(0);
            if (e.this.f17968m != null) {
                e.this.f17968m.requestFocus();
            }
        }
    }

    public class b implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.f17970o.dismiss();
            }
        }

        /* JADX INFO: renamed from: c.h.a.l.a.e$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0238b implements View.OnClickListener {
            public ViewOnClickListenerC0238b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (e.this.f17961f == null || e.this.f17961f.get(0) == null) {
                    return;
                }
                e.this.s(new File((String) e.this.f17961f.get(0)));
            }
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            e eVar = e.this;
            eVar.f17965j = eVar.f17970o.getButton(-2);
            e eVar2 = e.this;
            eVar2.f17966k = eVar2.f17970o.getButton(-3);
            if (e.this.p == null || e.this.p.getParent() == null || e.this.p.getParent().equals("/storage/emulated/0")) {
                e.this.f17966k.setVisibility(4);
            } else {
                e.this.f17966k.setVisibility(0);
            }
            e.this.f17965j.setTag("1");
            e.this.f17966k.setTag("3");
            Button button = e.this.f17965j;
            e eVar3 = e.this;
            button.setOnFocusChangeListener(eVar3.new h(eVar3.f17965j));
            e.this.f17965j.setTextColor(e.this.f17958c.getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.this.f17965j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e.this.f17966k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new c.h.a.k.d.a.a(e.this.f17958c).A();
            if (strA.equals(c.h.a.h.n.a.s0)) {
                e.this.f17965j.setTextSize(16.0f);
                e.this.f17965j.setBackground(e.this.f17958c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                e.this.f17965j.setTextSize(14.0f);
                e.this.f17965j.setBackground(e.this.f17958c.getResources().getDrawable(R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            e.this.f17965j.setOnClickListener(new a());
            e.this.f17966k.setOnClickListener(new ViewOnClickListenerC0238b());
            Button button2 = e.this.f17966k;
            e eVar4 = e.this;
            button2.setOnFocusChangeListener(eVar4.new h(eVar4.f17966k));
            e.this.f17966k.setTextColor(e.this.f17958c.getResources().getColor(R.color.white));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                e.this.f17966k.setTextSize(16.0f);
                e.this.f17966k.setBackground(e.this.f17958c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            e.this.f17966k.setTextSize(14.0f);
            e.this.f17966k.setBackground(e.this.f17958c.getResources().getDrawable(R.drawable.logout_btn_effect));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            e eVar;
            StringBuilder sb;
            String str;
            String string;
            if (((String) e.this.f17961f.get(i2)).equals("Internal Storage")) {
                eVar = e.this;
                string = e.this.f17959d + "/emulated/0";
            } else {
                if (e.this.f17961f.get(i2) != null && i2 == 0 && ((String) e.this.f17961f.get(i2)).equals("..")) {
                    e.this.f17966k.performClick();
                    e.this.z();
                }
                if (e.this.f17967l == null || e.this.f17967l.get(e.this.f17961f.get(i2)) == null || ((String) e.this.f17967l.get(e.this.f17961f.get(i2))).equals(BuildConfig.FLAVOR)) {
                    eVar = e.this;
                    sb = new StringBuilder();
                    sb.append(e.this.f17959d);
                    sb.append("/");
                    str = (String) e.this.f17961f.get(i2);
                    sb.append(str);
                    string = sb.toString();
                } else {
                    eVar = e.this;
                    sb = new StringBuilder();
                    sb.append(e.this.f17959d);
                    sb.append("/");
                    sb.append((String) e.this.f17967l.get(e.this.f17961f.get(i2)));
                    sb.append("/Android/data/");
                    str = "com.nst.iptvsmarterstvbox";
                    sb.append(str);
                    string = sb.toString();
                }
            }
            eVar.f17959d = string;
            e.this.z();
        }
    }

    public class d implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar;
                File file;
                if (e.this.f17959d.equals(e.this.f17957b)) {
                    return;
                }
                if (!e.this.f17959d.equals("/storage/emulated/0")) {
                    e.this.f17959d = new File(e.this.f17959d).getParent();
                    String[] strArrSplit = e.this.f17959d.split("/");
                    if (strArrSplit.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                            if (e.this.f17959d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                                e.this.f17959d = "/storage/" + strArrSplit[2];
                                eVar = e.this;
                                file = new File(e.this.f17959d);
                            }
                        }
                        if (new File(e.this.f17959d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            e.this.f17959d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                        }
                    }
                    e.this.z();
                }
                e.this.f17959d = "/storage/emulated";
                eVar = e.this;
                file = new File(e.this.f17959d);
                eVar.f17959d = file.getParent();
                e.this.z();
            }
        }

        public d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Button button;
            Drawable drawable;
            int i2;
            e eVar = e.this;
            eVar.f17965j = eVar.f17970o.getButton(-2);
            e eVar2 = e.this;
            eVar2.f17966k = eVar2.f17970o.getButton(-3);
            if (e.this.f17959d.equals(e.this.f17957b)) {
                e.this.f17966k.setVisibility(4);
            } else {
                e.this.f17966k.setVisibility(0);
            }
            e.this.f17965j.setTag("1");
            e.this.f17966k.setTag("3");
            Button button2 = e.this.f17965j;
            e eVar3 = e.this;
            button2.setOnFocusChangeListener(eVar3.new h(eVar3.f17965j));
            e.this.f17965j.setTextColor(e.this.f17958c.getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.this.f17965j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e.this.f17966k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new c.h.a.k.d.a.a(e.this.f17958c).A();
            if (strA.equals(c.h.a.h.n.a.s0)) {
                e.this.f17965j.setTextSize(16.0f);
                button = e.this.f17965j;
                drawable = e.this.f17958c.getResources().getDrawable(R.drawable.black_button_dark);
            } else {
                e.this.f17965j.setTextSize(14.0f);
                button = e.this.f17965j;
                drawable = e.this.f17958c.getResources().getDrawable(R.drawable.back_btn_effect);
            }
            button.setBackground(drawable);
            marginLayoutParams.width = 255;
            marginLayoutParams.height = 135;
            Button button3 = e.this.f17966k;
            e eVar4 = e.this;
            button3.setOnFocusChangeListener(eVar4.new h(eVar4.f17966k));
            e.this.f17966k.setTextColor(e.this.f17958c.getResources().getColor(R.color.white));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                e.this.f17966k.setTextSize(16.0f);
                e.this.f17966k.setBackground(e.this.f17958c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                i2 = 90;
            } else {
                e.this.f17966k.setTextSize(14.0f);
                e.this.f17966k.setBackground(e.this.f17958c.getResources().getDrawable(R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 250;
                i2 = 110;
            }
            marginLayoutParams2.height = i2;
            e.this.f17966k.setOnClickListener(new a());
        }
    }

    /* JADX INFO: renamed from: c.h.a.l.a.e$e, reason: collision with other inner class name */
    public class DialogInterfaceOnKeyListenerC0239e implements DialogInterface.OnKeyListener {
        public DialogInterfaceOnKeyListenerC0239e() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            e eVar;
            File file;
            if (i2 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (e.this.f17959d.equals(e.this.f17957b)) {
                e.this.f17970o.dismiss();
                return true;
            }
            if (!e.this.f17959d.equals("/storage/emulated/0")) {
                e.this.f17959d = new File(e.this.f17959d).getParent();
                String[] strArrSplit = e.this.f17959d.split("/");
                if (strArrSplit.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                        if (e.this.f17959d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            e.this.f17959d = "/storage/" + strArrSplit[2];
                            eVar = e.this;
                            file = new File(e.this.f17959d);
                        }
                    }
                    if (new File(e.this.f17959d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                        e.this.f17959d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                    }
                }
                e.this.z();
                return true;
            }
            e.this.f17959d = "/storage/emulated";
            eVar = e.this;
            file = new File(e.this.f17959d);
            eVar.f17959d = file.getParent();
            e.this.z();
            return true;
        }
    }

    public class f implements Comparator<String> {
        public f() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public interface g {
        void a(String str);
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17980b;

        public h(View view) {
            this.f17980b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17980b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17980b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            if (z) {
                View view2 = this.f17980b;
                if (view2 == null || view2.getTag() == null || !this.f17980b.getTag().equals("6")) {
                    f = z ? 1.12f : 1.0f;
                    a(f);
                    b(f);
                    View view3 = this.f17980b;
                    if (view3 != null && view3.getTag() != null && this.f17980b.getTag().equals("1") && e.this.f17965j != null) {
                        e.this.f17965j.setBackgroundResource(R.drawable.back_btn_effect);
                    }
                    View view4 = this.f17980b;
                    if (view4 == null || view4.getTag() == null || !this.f17980b.getTag().equals("3") || e.this.f17966k == null) {
                        return;
                    }
                    e.this.f17966k.setBackgroundResource(R.drawable.blue_btn_effect);
                    return;
                }
                if (z) {
                    f = 1.18f;
                }
            } else {
                if (z) {
                    return;
                }
                View view5 = this.f17980b;
                if (view5 != null && view5.getTag() != null && this.f17980b.getTag().equals("1") && e.this.f17965j != null) {
                    e.this.f17965j.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view6 = this.f17980b;
                if (view6 != null && view6.getTag() != null && this.f17980b.getTag().equals("3") && e.this.f17966k != null) {
                    e.this.f17966k.setBackgroundResource(R.drawable.black_button_dark);
                }
            }
            a(f);
            b(f);
        }
    }

    public e(Context context, g gVar) {
        this.f17957b = BuildConfig.FLAVOR;
        this.f17962g = null;
        this.f17958c = context;
        if (Build.VERSION.SDK_INT >= 19) {
            int length = context.getExternalFilesDirs("external").length;
        }
        this.f17957b = "/storage";
        this.f17962g = gVar;
        try {
            this.f17957b = new File(this.f17957b).getCanonicalPath();
        } catch (IOException unused) {
        }
    }

    public static int v(float f2, Context context) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void s(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f17966k.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f17966k.setVisibility(0);
                }
                File file2 = new File(file.getParent());
                if (file2.list() != null) {
                    int i2 = 0;
                    while (true) {
                        String[] list = file2.list();
                        list.getClass();
                        if (i2 >= list.length) {
                            break;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getParent());
                        sb.append("/");
                        String[] list2 = file2.list();
                        list2.getClass();
                        sb.append(list2[i2]);
                        arrayList.add(sb.toString());
                        i2++;
                    }
                }
            }
            this.f17961f.clear();
            this.f17961f.addAll(arrayList);
            this.f17964i.notifyDataSetChanged();
            this.f17968m.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f17968m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public void t(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f17957b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f17959d = canonicalPath;
            this.f17960e = x(canonicalPath);
            this.f17961f = x(BuildConfig.FLAVOR);
            y(this.f17960e);
            AlertDialog.Builder builderW = w(canonicalPath, this.f17961f);
            this.f17969n = builderW;
            builderW.setNegativeButton(this.f17958c.getResources().getString(R.string.set_cancel), (DialogInterface.OnClickListener) null);
            this.f17969n.setNeutralButton(this.f17958c.getResources().getString(R.string.set_back), (DialogInterface.OnClickListener) null);
            c.h.a.k.b.e eVar = new c.h.a.k.b.e(this.f17958c, this.f17961f);
            this.f17963h = eVar;
            ListViewMaxHeight listViewMaxHeight = this.f17968m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) eVar);
                this.f17968m.setOnItemClickListener(new c());
            }
            AlertDialog alertDialogCreate = this.f17969n.create();
            this.f17970o = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new d());
            this.f17970o.setOnKeyListener(new DialogInterfaceOnKeyListenerC0239e());
            this.f17970o.show();
            if (this.f17970o.getWindow() != null) {
                this.f17970o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f17970o.getWindow().setLayout(v(650.0f, this.f17958c), -2);
            }
        } catch (IOException unused) {
        }
    }

    public void u(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory(BuildConfig.FLAVOR).getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f17961f = arrayList;
            arrayList.clear();
            if (absoluteFile.list() != null) {
                int i2 = 0;
                while (true) {
                    String[] list = absoluteFile.list();
                    list.getClass();
                    if (i2 >= list.length) {
                        break;
                    }
                    String[] list2 = absoluteFile.list();
                    list2.getClass();
                    this.f17961f.add(new File(Environment.getExternalStoragePublicDirectory(list2[i2]).toString()).getPath());
                    i2++;
                }
            }
            AlertDialog.Builder builderW = w(BuildConfig.FLAVOR, this.f17961f);
            this.f17969n = builderW;
            builderW.setNegativeButton(this.f17958c.getResources().getString(R.string.set_cancel), (DialogInterface.OnClickListener) null);
            this.f17969n.setNeutralButton(this.f17958c.getResources().getString(R.string.set_back), (DialogInterface.OnClickListener) null);
            c.h.a.k.b.g gVar = new c.h.a.k.b.g(this.f17958c, this.f17961f, "vpn");
            this.f17964i = gVar;
            ListViewMaxHeight listViewMaxHeight = this.f17968m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) gVar);
                this.f17968m.setOnItemClickListener(new a());
            }
            AlertDialog alertDialogCreate = this.f17969n.create();
            this.f17970o = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new b());
            this.f17970o.show();
            if (this.f17970o.getWindow() != null) {
                this.f17970o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f17970o.getWindow().setLayout(v(650.0f, this.f17958c), -2);
            }
        } catch (Exception unused) {
        }
    }

    public final AlertDialog.Builder w(String str, List<String> list) {
        this.f17969n = new AlertDialog.Builder(this.f17958c, R.style.AlertDialogCustom);
        LinearLayout linearLayout = new LinearLayout(this.f17958c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f17958c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText("Choose Certificate Zip File or ovpn File");
        Drawable drawable = this.f17958c.getResources().getDrawable(R.drawable.cast_genre);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f17958c.getResources().getColor(android.R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f17969n.setCustomTitle(linearLayout);
        View viewInflate = ((LayoutInflater) this.f17958c.getSystemService("layout_inflater")).inflate(R.layout.directory_listview, (ViewGroup) null);
        this.f17969n.setView(viewInflate);
        this.f17968m = (ListViewMaxHeight) viewInflate.findViewById(R.id.lv_ch);
        this.f17969n.setCancelable(true);
        return this.f17969n;
    }

    public final List<String> x(String str) {
        File file;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(str);
        } catch (Exception unused) {
        }
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
                if ((file2.isFile() && file2.getName().endsWith(".zip")) || file2.getName().endsWith(".ovpn")) {
                    arrayList.add(file2.getName());
                }
            }
            Collections.sort(arrayList, new f());
            return arrayList;
        }
        return arrayList;
    }

    public final void y(List<String> list) {
        this.f17961f.clear();
        boolean z = false;
        for (String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f17967l.put("SD Card", str);
                    this.f17961f.add("SD Card");
                } else {
                    this.f17961f.add(str);
                }
            }
        }
        if (z) {
            this.f17961f.add(0, "Internal Storage");
        }
    }

    public final void z() {
        TextView textView;
        try {
            if (!this.f17959d.endsWith(".zip") && !this.f17959d.endsWith(".ovpn")) {
                if (this.f17959d.equals(this.f17957b)) {
                    y(x(this.f17959d));
                } else {
                    this.f17961f.clear();
                    this.f17961f.add("..");
                    this.f17961f.addAll(x(this.f17959d));
                }
                AlertDialog alertDialog = this.f17970o;
                if (alertDialog != null && (textView = (TextView) alertDialog.findViewById(android.R.id.message)) != null) {
                    textView.setText(this.f17959d);
                }
                if (this.f17959d.equals(this.f17957b)) {
                    this.f17966k.setVisibility(4);
                } else {
                    this.f17966k.setVisibility(0);
                }
                this.f17963h.notifyDataSetChanged();
                this.f17968m.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.f17968m;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            g gVar = this.f17962g;
            if (gVar != null) {
                gVar.a(this.f17959d);
                this.f17970o.dismiss();
            }
        } catch (Exception unused) {
        }
    }
}
