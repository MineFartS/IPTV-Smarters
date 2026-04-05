package c.h.a.h;

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
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.utility.ListViewMaxHeight;
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
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f16877c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0215g f16881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.k.b.e f16882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.k.b.g f16883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f16884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f16885k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ListViewMaxHeight f16887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AlertDialog.Builder f16888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AlertDialog f16889o;
    public File p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16875a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16878d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f16879e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f16880f = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap<String, String> f16886l = new HashMap<>();

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            g.this.f16885k.setVisibility(0);
            g.this.p = new File((String) g.this.f16880f.get(i2));
            if (g.this.p != null && g.this.p.isFile()) {
                g gVar = g.this;
                gVar.f16878d = gVar.p.getName();
                if (!g.this.f16878d.endsWith(".m3u") && !g.this.f16878d.endsWith(".m3u8")) {
                    Toast.makeText(g.this.f16877c, "Please select .m3u File", 0).show();
                    return;
                } else {
                    if (g.this.f16881g != null) {
                        g.this.f16881g.a(g.this.p.getPath());
                        g.this.f16889o.dismiss();
                        return;
                    }
                    return;
                }
            }
            g gVar2 = g.this;
            gVar2.f16878d = gVar2.p.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (g.this.f16878d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                g gVar3 = g.this;
                gVar3.s(gVar3.p);
                return;
            }
            arrayList.add(g.this.p.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (g.this.p.list() != null) {
                int i3 = 0;
                while (true) {
                    String[] list = g.this.p.list();
                    list.getClass();
                    if (i3 >= list.length) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(g.this.p.getPath());
                    sb.append("/");
                    String[] list2 = g.this.p.list();
                    list2.getClass();
                    sb.append(list2[i3]);
                    arrayList.add(sb.toString());
                    i3++;
                }
            }
            g.this.f16880f.clear();
            g.this.f16880f.addAll(arrayList);
            g.this.f16883i.notifyDataSetChanged();
            g.this.f16887m.setSelection(0);
            if (g.this.f16887m != null) {
                g.this.f16887m.requestFocus();
            }
        }
    }

    public class b implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.this.f16889o.dismiss();
            }
        }

        /* JADX INFO: renamed from: c.h.a.h.g$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0214b implements View.OnClickListener {
            public ViewOnClickListenerC0214b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (g.this.f16880f == null || g.this.f16880f.get(0) == null) {
                    return;
                }
                g.this.s(new File((String) g.this.f16880f.get(0)));
            }
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            g gVar = g.this;
            gVar.f16884j = gVar.f16889o.getButton(-2);
            g gVar2 = g.this;
            gVar2.f16885k = gVar2.f16889o.getButton(-3);
            if (g.this.p == null || g.this.p.getParent() == null || g.this.p.getParent().equals("/storage/emulated/0")) {
                g.this.f16885k.setVisibility(4);
            } else {
                g.this.f16885k.setVisibility(0);
            }
            g.this.f16884j.setTag("1");
            g.this.f16885k.setTag("3");
            Button button = g.this.f16884j;
            g gVar3 = g.this;
            button.setOnFocusChangeListener(gVar3.new h(gVar3.f16884j));
            g.this.f16884j.setTextColor(g.this.f16877c.getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g.this.f16884j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) g.this.f16885k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new c.h.a.k.d.a.a(g.this.f16877c).A();
            if (strA.equals(c.h.a.h.n.a.s0)) {
                g.this.f16884j.setTextSize(16.0f);
                g.this.f16884j.setBackground(g.this.f16877c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                g.this.f16884j.setTextSize(14.0f);
                g.this.f16884j.setBackground(g.this.f16877c.getResources().getDrawable(R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            g.this.f16884j.setOnClickListener(new a());
            g.this.f16885k.setOnClickListener(new ViewOnClickListenerC0214b());
            Button button2 = g.this.f16885k;
            g gVar4 = g.this;
            button2.setOnFocusChangeListener(gVar4.new h(gVar4.f16885k));
            g.this.f16885k.setTextColor(g.this.f16877c.getResources().getColor(R.color.white));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                g.this.f16885k.setTextSize(16.0f);
                g.this.f16885k.setBackground(g.this.f16877c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            g.this.f16885k.setTextSize(14.0f);
            g.this.f16885k.setBackground(g.this.f16877c.getResources().getDrawable(R.drawable.logout_btn_effect));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            g gVar;
            StringBuilder sb;
            String str;
            String string;
            if (((String) g.this.f16880f.get(i2)).equals("Internal Storage")) {
                gVar = g.this;
                string = g.this.f16878d + "/emulated/0";
            } else {
                if (g.this.f16880f.get(i2) != null && i2 == 0 && ((String) g.this.f16880f.get(i2)).equals("..")) {
                    g.this.f16885k.performClick();
                    g.this.z();
                }
                if (g.this.f16886l == null || g.this.f16886l.get(g.this.f16880f.get(i2)) == null || ((String) g.this.f16886l.get(g.this.f16880f.get(i2))).equals(BuildConfig.FLAVOR)) {
                    gVar = g.this;
                    sb = new StringBuilder();
                    sb.append(g.this.f16878d);
                    sb.append("/");
                    str = (String) g.this.f16880f.get(i2);
                    sb.append(str);
                    string = sb.toString();
                } else {
                    gVar = g.this;
                    sb = new StringBuilder();
                    sb.append(g.this.f16878d);
                    sb.append("/");
                    sb.append((String) g.this.f16886l.get(g.this.f16880f.get(i2)));
                    sb.append("/Android/data/");
                    str = "minefarts.iptvsmarters";
                    sb.append(str);
                    string = sb.toString();
                }
            }
            gVar.f16878d = string;
            g.this.z();
        }
    }

    public class d implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g gVar;
                File file;
                if (g.this.f16878d.equals(g.this.f16876b)) {
                    return;
                }
                if (!g.this.f16878d.equals("/storage/emulated/0")) {
                    g.this.f16878d = new File(g.this.f16878d).getParent();
                    String[] strArrSplit = g.this.f16878d.split("/");
                    if (strArrSplit.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                            if (g.this.f16878d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                                g.this.f16878d = "/storage/" + strArrSplit[2];
                                gVar = g.this;
                                file = new File(g.this.f16878d);
                            }
                        }
                        if (new File(g.this.f16878d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            g.this.f16878d = "/storage/" + strArrSplit[2] + "/Android/data/minefarts.iptvsmarters";
                        }
                    }
                    g.this.z();
                }
                g.this.f16878d = "/storage/emulated";
                gVar = g.this;
                file = new File(g.this.f16878d);
                gVar.f16878d = file.getParent();
                g.this.z();
            }
        }

        public d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            g gVar = g.this;
            gVar.f16884j = gVar.f16889o.getButton(-2);
            g gVar2 = g.this;
            gVar2.f16885k = gVar2.f16889o.getButton(-3);
            if (g.this.f16878d.equals(g.this.f16876b)) {
                g.this.f16885k.setVisibility(4);
            } else {
                g.this.f16885k.setVisibility(0);
            }
            g.this.f16884j.setTag("1");
            g.this.f16885k.setTag("3");
            Button button = g.this.f16884j;
            g gVar3 = g.this;
            button.setOnFocusChangeListener(gVar3.new h(gVar3.f16884j));
            g.this.f16884j.setTextColor(g.this.f16877c.getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g.this.f16884j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) g.this.f16885k.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new c.h.a.k.d.a.a(g.this.f16877c).A();
            if (strA.equals(c.h.a.h.n.a.s0)) {
                g.this.f16884j.setTextSize(16.0f);
                g.this.f16884j.setBackground(g.this.f16877c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                g.this.f16884j.setTextSize(14.0f);
                g.this.f16884j.setBackground(g.this.f16877c.getResources().getDrawable(R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            Button button2 = g.this.f16885k;
            g gVar4 = g.this;
            button2.setOnFocusChangeListener(gVar4.new h(gVar4.f16885k));
            g.this.f16885k.setTextColor(g.this.f16877c.getResources().getColor(R.color.white));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                g.this.f16885k.setTextSize(16.0f);
                g.this.f16885k.setBackground(g.this.f16877c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                g.this.f16885k.setTextSize(14.0f);
                g.this.f16885k.setBackground(g.this.f16877c.getResources().getDrawable(R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 255;
                marginLayoutParams2.height = 135;
            }
            g.this.f16885k.setOnClickListener(new a());
        }
    }

    public class e implements DialogInterface.OnKeyListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            g gVar;
            File file;
            if (i2 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (g.this.f16878d.equals(g.this.f16876b)) {
                g.this.f16889o.dismiss();
                return true;
            }
            if (!g.this.f16878d.equals("/storage/emulated/0")) {
                g.this.f16878d = new File(g.this.f16878d).getParent();
                String[] strArrSplit = g.this.f16878d.split("/");
                if (strArrSplit.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                        if (g.this.f16878d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            g.this.f16878d = "/storage/" + strArrSplit[2];
                            gVar = g.this;
                            file = new File(g.this.f16878d);
                        }
                    }
                    if (new File(g.this.f16878d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                        g.this.f16878d = "/storage/" + strArrSplit[2] + "/Android/data/minefarts.iptvsmarters";
                    }
                }
                g.this.z();
                return true;
            }
            g.this.f16878d = "/storage/emulated";
            gVar = g.this;
            file = new File(g.this.f16878d);
            gVar.f16878d = file.getParent();
            g.this.z();
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

    /* JADX INFO: renamed from: c.h.a.h.g$g, reason: collision with other inner class name */
    public interface InterfaceC0215g {
        void a(String str);
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f16899b;

        public h(View view) {
            this.f16899b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16899b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16899b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            if (z) {
                View view2 = this.f16899b;
                if (view2 == null || view2.getTag() == null || !this.f16899b.getTag().equals("6")) {
                    f = z ? 1.12f : 1.0f;
                    a(f);
                    b(f);
                    View view3 = this.f16899b;
                    if (view3 != null && view3.getTag() != null && this.f16899b.getTag().equals("1") && g.this.f16884j != null) {
                        g.this.f16884j.setBackgroundResource(R.drawable.back_btn_effect);
                    }
                    View view4 = this.f16899b;
                    if (view4 == null || view4.getTag() == null || !this.f16899b.getTag().equals("3") || g.this.f16885k == null) {
                        return;
                    }
                    g.this.f16885k.setBackgroundResource(R.drawable.blue_btn_effect);
                    return;
                }
                if (z) {
                    f = 1.18f;
                }
            } else {
                if (z) {
                    return;
                }
                View view5 = this.f16899b;
                if (view5 != null && view5.getTag() != null && this.f16899b.getTag().equals("1") && g.this.f16884j != null) {
                    g.this.f16884j.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view6 = this.f16899b;
                if (view6 != null && view6.getTag() != null && this.f16899b.getTag().equals("3") && g.this.f16885k != null) {
                    g.this.f16885k.setBackgroundResource(R.drawable.black_button_dark);
                }
            }
            a(f);
            b(f);
        }
    }

    public g(Context context, InterfaceC0215g interfaceC0215g) {
        this.f16876b = BuildConfig.FLAVOR;
        this.f16881g = null;
        this.f16877c = context;
        if (Build.VERSION.SDK_INT >= 19) {
            int length = context.getExternalFilesDirs("external").length;
        }
        this.f16876b = "/storage";
        this.f16881g = interfaceC0215g;
        try {
            this.f16876b = new File(this.f16876b).getCanonicalPath();
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
                    this.f16885k.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f16885k.setVisibility(0);
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
            this.f16880f.clear();
            this.f16880f.addAll(arrayList);
            this.f16883i.notifyDataSetChanged();
            this.f16887m.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.f16887m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public void t(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f16876b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f16878d = canonicalPath;
            this.f16879e = x(canonicalPath);
            this.f16880f = x(BuildConfig.FLAVOR);
            y(this.f16879e);
            AlertDialog.Builder builderW = w(canonicalPath, this.f16880f);
            this.f16888n = builderW;
            builderW.setNegativeButton(this.f16877c.getResources().getString(R.string.set_cancel), (DialogInterface.OnClickListener) null);
            this.f16888n.setNeutralButton(this.f16877c.getResources().getString(R.string.set_back), (DialogInterface.OnClickListener) null);
            c.h.a.k.b.e eVar = new c.h.a.k.b.e(this.f16877c, this.f16880f);
            this.f16882h = eVar;
            ListViewMaxHeight listViewMaxHeight = this.f16887m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) eVar);
                this.f16887m.setOnItemClickListener(new c());
            }
            AlertDialog alertDialogCreate = this.f16888n.create();
            this.f16889o = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new d());
            this.f16889o.setOnKeyListener(new e());
            this.f16889o.show();
            if (this.f16889o.getWindow() != null) {
                this.f16889o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f16889o.getWindow().setLayout(v(650.0f, this.f16877c), -2);
            }
        } catch (IOException unused) {
        }
    }

    public void u(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory(BuildConfig.FLAVOR).getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f16880f = arrayList;
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
                    this.f16880f.add(new File(Environment.getExternalStoragePublicDirectory(list2[i2]).toString()).getPath());
                    i2++;
                }
            }
            AlertDialog.Builder builderW = w(BuildConfig.FLAVOR, this.f16880f);
            this.f16888n = builderW;
            builderW.setNegativeButton(this.f16877c.getResources().getString(R.string.set_cancel), (DialogInterface.OnClickListener) null);
            this.f16888n.setNeutralButton(this.f16877c.getResources().getString(R.string.set_back), (DialogInterface.OnClickListener) null);
            c.h.a.k.b.g gVar = new c.h.a.k.b.g(this.f16877c, this.f16880f, "m3u");
            this.f16883i = gVar;
            ListViewMaxHeight listViewMaxHeight = this.f16887m;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) gVar);
                this.f16887m.setOnItemClickListener(new a());
            }
            AlertDialog alertDialogCreate = this.f16888n.create();
            this.f16889o = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new b());
            this.f16889o.show();
            if (this.f16889o.getWindow() != null) {
                this.f16889o.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f16889o.getWindow().setLayout(v(650.0f, this.f16877c), -2);
            }
        } catch (Exception unused) {
        }
    }

    public final AlertDialog.Builder w(String str, List<String> list) {
        this.f16888n = new AlertDialog.Builder(this.f16877c, R.style.AlertDialogCustom);
        LinearLayout linearLayout = new LinearLayout(this.f16877c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f16877c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.f16877c.getResources().getString(R.string.choose_m3u_file));
        Drawable drawable = this.f16877c.getResources().getDrawable(R.drawable.cast_genre);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f16877c.getResources().getColor(android.R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.f16888n.setCustomTitle(linearLayout);
        View viewInflate = ((LayoutInflater) this.f16877c.getSystemService("layout_inflater")).inflate(R.layout.directory_listview, (ViewGroup) null);
        this.f16888n.setView(viewInflate);
        this.f16887m = (ListViewMaxHeight) viewInflate.findViewById(R.id.lv_ch);
        this.f16888n.setCancelable(true);
        return this.f16888n;
    }

    public final List<String> x(String str) {
        File file;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(str);
        } catch (Exception unused) {
        }
        if (file.exists() && file.isDirectory()) {
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    if (file2.isDirectory()) {
                        arrayList.add(file2.getName());
                    }
                    if ((file2.isFile() && file2.getName().endsWith(".m3u")) || (file2.isFile() && file2.getName().endsWith(".m3u8"))) {
                        arrayList.add(file2.getName());
                    }
                }
            }
            Collections.sort(arrayList, new f());
            return arrayList;
        }
        return arrayList;
    }

    public final void y(List<String> list) {
        this.f16880f.clear();
        boolean z = false;
        for (String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f16886l.put("SD Card", str);
                    this.f16880f.add("SD Card");
                } else {
                    this.f16880f.add(str);
                }
            }
        }
        if (z) {
            this.f16880f.add(0, "Internal Storage");
        }
    }

    public final void z() {
        TextView textView;
        try {
            if (!this.f16878d.endsWith(".m3u") && !this.f16878d.endsWith(".m3u8")) {
                if (this.f16878d.equals(this.f16876b)) {
                    y(x(this.f16878d));
                } else {
                    this.f16880f.clear();
                    this.f16880f.add("..");
                    this.f16880f.addAll(x(this.f16878d));
                }
                AlertDialog alertDialog = this.f16889o;
                if (alertDialog != null && (textView = (TextView) alertDialog.findViewById(android.R.id.message)) != null) {
                    textView.setText(this.f16878d);
                }
                if (this.f16878d.equals(this.f16876b)) {
                    this.f16885k.setVisibility(4);
                } else {
                    this.f16885k.setVisibility(0);
                }
                this.f16882h.notifyDataSetChanged();
                this.f16887m.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.f16887m;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            InterfaceC0215g interfaceC0215g = this.f16881g;
            if (interfaceC0215g != null) {
                interfaceC0215g.a(this.f16878d);
                this.f16889o.dismiss();
            }
        } catch (Exception unused) {
        }
    }
}
