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
import android.widget.EditText;
import android.widget.ImageView;
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
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f16844c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f16848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.k.b.e f16849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.k.b.g f16850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f16851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f16852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f16853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f16854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f16855n;
    public ListViewMaxHeight p;
    public ImageView q;
    public AlertDialog.Builder r;
    public AlertDialog s;
    public File t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16842a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16845d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f16846e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f16847f = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap<String, String> f16856o = new HashMap<>();
    public String u = BuildConfig.FLAVOR;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (f.this.f16848g != null) {
                f.this.f16848g.a(f.this.u);
            }
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            f.this.f16853l.setVisibility(0);
            f.this.f16852k.setVisibility(0);
            f.this.t = new File((String) f.this.f16847f.get(i2));
            if (f.this.t == null || !f.this.t.isFile()) {
                f fVar = f.this;
                fVar.f16845d = fVar.t.getName();
                f fVar2 = f.this;
                fVar2.u = fVar2.t.getPath();
                ArrayList arrayList = new ArrayList();
                arrayList.clear();
                if (f.this.f16845d.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    f fVar3 = f.this;
                    fVar3.B(fVar3.t);
                    return;
                }
                arrayList.add(f.this.t.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                if (f.this.t.list() != null) {
                    int i3 = 0;
                    while (true) {
                        String[] list = f.this.t.list();
                        list.getClass();
                        if (i3 >= list.length) {
                            break;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(f.this.t.getPath());
                        sb.append("/");
                        String[] list2 = f.this.t.list();
                        list2.getClass();
                        sb.append(list2[i3]);
                        if (new File(sb.toString()).isDirectory()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f.this.t.getPath());
                            sb2.append("/");
                            String[] list3 = f.this.t.list();
                            list3.getClass();
                            sb2.append(list3[i3]);
                            arrayList.add(sb2.toString());
                        }
                        i3++;
                    }
                }
                f.this.f16847f.clear();
                f.this.f16847f.addAll(arrayList);
                f.this.f16850i.notifyDataSetChanged();
                f.this.p.setSelection(0);
                if (f.this.p != null) {
                    f.this.p.requestFocus();
                }
            }
        }
    }

    public class c implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                f.this.s.dismiss();
            }
        }

        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (f.this.f16847f == null || f.this.f16847f.get(0) == null) {
                    return;
                }
                f.this.B(new File((String) f.this.f16847f.get(0)));
            }
        }

        public c() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            f fVar = f.this;
            fVar.f16851j = fVar.s.getButton(-2);
            f fVar2 = f.this;
            fVar2.f16852k = fVar2.s.getButton(-1);
            f fVar3 = f.this;
            fVar3.f16853l = fVar3.s.getButton(-3);
            if (f.this.t == null || f.this.t.getParent() == null || f.this.t.getParent().equals("/storage/emulated/0")) {
                f.this.f16853l.setVisibility(4);
                f.this.f16852k.setVisibility(4);
            } else {
                f.this.f16853l.setVisibility(0);
                f.this.f16852k.setVisibility(0);
            }
            f.this.f16851j.setTag("1");
            f.this.f16852k.setTag("2");
            f.this.f16853l.setTag("3");
            Button button = f.this.f16851j;
            f fVar4 = f.this;
            button.setOnFocusChangeListener(fVar4.new k(fVar4.f16851j));
            f.this.f16851j.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f.this.f16851j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) f.this.f16852k.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) f.this.f16853l.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new c.h.a.k.d.a.a(f.this.f16844c).A();
            if (strA.equals(c.h.a.h.n.a.s0)) {
                f.this.f16851j.setTextSize(16.0f);
                f.this.f16851j.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                f.this.f16851j.setTextSize(14.0f);
                f.this.f16851j.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            f.this.f16851j.setOnClickListener(new a());
            f.this.f16853l.setOnClickListener(new b());
            Button button2 = f.this.f16852k;
            f fVar5 = f.this;
            button2.setOnFocusChangeListener(fVar5.new k(fVar5.f16852k));
            marginLayoutParams2.setMargins(0, 0, 70, 0);
            if (strA.equals(c.h.a.h.n.a.s0)) {
                f.this.f16852k.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
                f.this.f16852k.setTextSize(16.0f);
                f.this.f16852k.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                f.this.f16852k.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
                f.this.f16852k.setTextSize(14.0f);
                f.this.f16852k.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 255;
                marginLayoutParams2.height = 135;
            }
            Button button3 = f.this.f16853l;
            f fVar6 = f.this;
            button3.setOnFocusChangeListener(fVar6.new k(fVar6.f16853l));
            f.this.f16853l.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                f.this.f16853l.setTextSize(16.0f);
                f.this.f16853l.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams3.width = 230;
                marginLayoutParams3.height = 90;
                return;
            }
            f.this.f16853l.setTextSize(14.0f);
            f.this.f16853l.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.logout_btn_effect));
            marginLayoutParams3.width = 255;
            marginLayoutParams3.height = 135;
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (f.this.f16848g != null) {
                f.this.f16848g.a(f.this.f16845d);
            }
        }
    }

    public class e implements AdapterView.OnItemClickListener {
        public e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            f fVar;
            StringBuilder sb;
            String str;
            String string;
            if (((String) f.this.f16847f.get(i2)).equals("Internal Storage")) {
                fVar = f.this;
                string = f.this.f16845d + "/emulated/0";
            } else {
                if (f.this.f16847f.get(i2) != null && i2 == 0 && ((String) f.this.f16847f.get(i2)).equals("..")) {
                    f.this.f16853l.performClick();
                    f.this.K();
                }
                if (f.this.f16856o == null || f.this.f16856o.get(f.this.f16847f.get(i2)) == null || ((String) f.this.f16856o.get(f.this.f16847f.get(i2))).equals(BuildConfig.FLAVOR)) {
                    fVar = f.this;
                    sb = new StringBuilder();
                    sb.append(f.this.f16845d);
                    sb.append("/");
                    str = (String) f.this.f16847f.get(i2);
                    sb.append(str);
                    string = sb.toString();
                } else {
                    fVar = f.this;
                    sb = new StringBuilder();
                    sb.append(f.this.f16845d);
                    sb.append("/");
                    sb.append((String) f.this.f16856o.get(f.this.f16847f.get(i2)));
                    sb.append("/Android/data/");
                    str = "com.nst.iptvsmarterstvbox";
                    sb.append(str);
                    string = sb.toString();
                }
            }
            fVar.f16845d = string;
            f.this.K();
        }
    }

    /* JADX INFO: renamed from: c.h.a.h.f$f, reason: collision with other inner class name */
    public class DialogInterfaceOnShowListenerC0213f implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: c.h.a.h.f$f$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                f fVar;
                File file;
                if (f.this.f16845d.equals(f.this.f16843b)) {
                    return;
                }
                if (!f.this.f16845d.equals("/storage/emulated/0")) {
                    f.this.f16845d = new File(f.this.f16845d).getParent();
                    String[] strArrSplit = f.this.f16845d.split("/");
                    if (strArrSplit.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                            if (f.this.f16845d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                                f.this.f16845d = "/storage/" + strArrSplit[2];
                                fVar = f.this;
                                file = new File(f.this.f16845d);
                            }
                        }
                        if (new File(f.this.f16845d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            f.this.f16845d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                        }
                    }
                    f.this.K();
                }
                f.this.f16845d = "/storage/emulated";
                fVar = f.this;
                file = new File(f.this.f16845d);
                fVar.f16845d = file.getParent();
                f.this.K();
            }
        }

        public DialogInterfaceOnShowListenerC0213f() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            f fVar = f.this;
            fVar.f16851j = fVar.s.getButton(-2);
            f fVar2 = f.this;
            fVar2.f16852k = fVar2.s.getButton(-1);
            f fVar3 = f.this;
            fVar3.f16853l = fVar3.s.getButton(-3);
            if (f.this.f16845d.equals(f.this.f16843b)) {
                f.this.f16853l.setVisibility(4);
                f.this.f16852k.setVisibility(8);
            } else {
                f.this.f16853l.setVisibility(0);
                f.this.f16852k.setVisibility(0);
            }
            f.this.f16851j.setTag("1");
            f.this.f16852k.setTag("2");
            f.this.f16853l.setTag("3");
            Button button = f.this.f16851j;
            f fVar4 = f.this;
            button.setOnFocusChangeListener(fVar4.new k(fVar4.f16851j));
            f.this.f16851j.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f.this.f16851j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) f.this.f16852k.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) f.this.f16853l.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new c.h.a.k.d.a.a(f.this.f16844c).A();
            if (strA.equals(c.h.a.h.n.a.s0)) {
                f.this.f16851j.setTextSize(16.0f);
                f.this.f16851j.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                f.this.f16851j.setTextSize(14.0f);
                f.this.f16851j.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.back_btn_effect));
                marginLayoutParams.width = 250;
                marginLayoutParams.height = 110;
            }
            Button button2 = f.this.f16852k;
            f fVar5 = f.this;
            button2.setOnFocusChangeListener(fVar5.new k(fVar5.f16852k));
            marginLayoutParams2.setMargins(0, 0, 70, 0);
            if (strA.equals(c.h.a.h.n.a.s0)) {
                f.this.f16852k.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
                f.this.f16852k.setTextSize(16.0f);
                f.this.f16852k.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                f.this.f16852k.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
                f.this.f16852k.setTextSize(14.0f);
                f.this.f16852k.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = 110;
            }
            Button button3 = f.this.f16853l;
            f fVar6 = f.this;
            button3.setOnFocusChangeListener(fVar6.new k(fVar6.f16853l));
            f.this.f16853l.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                f.this.f16853l.setTextSize(16.0f);
                f.this.f16853l.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams3.width = 230;
                marginLayoutParams3.height = 90;
            } else {
                f.this.f16853l.setTextSize(14.0f);
                f.this.f16853l.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.logout_btn_effect));
                marginLayoutParams3.width = 250;
                marginLayoutParams3.height = 110;
            }
            f.this.f16853l.setOnClickListener(new a());
        }
    }

    public class g implements DialogInterface.OnKeyListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            f fVar;
            File file;
            if (i2 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (f.this.f16845d.equals(f.this.f16843b)) {
                f.this.s.dismiss();
                return true;
            }
            if (!f.this.f16845d.equals("/storage/emulated/0")) {
                f.this.f16845d = new File(f.this.f16845d).getParent();
                String[] strArrSplit = f.this.f16845d.split("/");
                if (strArrSplit.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                        if (f.this.f16845d.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            f.this.f16845d = "/storage/" + strArrSplit[2];
                            fVar = f.this;
                            file = new File(f.this.f16845d);
                        }
                    }
                    if (new File(f.this.f16845d).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                        f.this.f16845d = "/storage/" + strArrSplit[2] + "/Android/data/com.nst.iptvsmarterstvbox";
                    }
                }
                f.this.K();
                return true;
            }
            f.this.f16845d = "/storage/emulated";
            fVar = f.this;
            file = new File(f.this.f16845d);
            fVar.f16845d = file.getParent();
            f.this.K();
            return true;
        }
    }

    public class h implements Comparator<String> {
        public h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public class i implements View.OnClickListener {

        public class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditText f16869b;

            public a(EditText editText) {
                this.f16869b = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                Context context;
                StringBuilder sb;
                f fVar;
                File file;
                String string = this.f16869b.getText().toString();
                if (Build.VERSION.SDK_INT < 30) {
                    if (f.this.G(f.this.f16845d + "/" + string)) {
                        f.this.f16845d = f.this.f16845d + "/" + string;
                        f.this.K();
                        return;
                    }
                    context = f.this.f16844c;
                    sb = new StringBuilder();
                    sb.append(f.this.f16844c.getResources().getString(R.string.failed_to_create));
                    sb.append("'");
                } else if (f.this.u.equals(BuildConfig.FLAVOR) || f.this.u.equals("/storage/emulated/0/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    if (f.this.G(new File("/storage/emulated/0/" + string).toString())) {
                        fVar = f.this;
                        file = new File("/storage/emulated/0/" + string);
                        fVar.B(file);
                        return;
                    }
                    context = f.this.f16844c;
                    sb = new StringBuilder();
                    sb.append(f.this.f16844c.getResources().getString(R.string.failed_to_create));
                    sb.append(" '");
                } else if (f.this.u.contains("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                    f fVar2 = f.this;
                    fVar2.u = fVar2.u.replace("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#", BuildConfig.FLAVOR);
                    if (f.this.G(f.this.u + "/" + string)) {
                        fVar = f.this;
                        file = new File(f.this.u + "/" + string);
                        fVar.B(file);
                        return;
                    }
                    context = f.this.f16844c;
                    sb = new StringBuilder();
                    sb.append(f.this.f16844c.getResources().getString(R.string.failed_to_create));
                    sb.append(" '");
                } else {
                    if (f.this.G(f.this.u + "/" + string)) {
                        fVar = f.this;
                        file = new File(f.this.u + "/" + string);
                        fVar.B(file);
                        return;
                    }
                    context = f.this.f16844c;
                    sb = new StringBuilder();
                    sb.append(f.this.f16844c.getResources().getString(R.string.failed_to_create));
                    sb.append(" '");
                }
                sb.append(string);
                sb.append("' ");
                sb.append(f.this.f16844c.getResources().getString(R.string.folder));
                Toast.makeText(context, sb.toString(), 0).show();
            }
        }

        public class b implements DialogInterface.OnShowListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AlertDialog f16871a;

            public b(AlertDialog alertDialog) {
                this.f16871a = alertDialog;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                f.this.f16855n = this.f16871a.getButton(-3);
                f.this.f16854m = this.f16871a.getButton(-1);
                f.this.f16855n.setTag("4");
                f.this.f16854m.setTag("5");
                Button button = f.this.f16855n;
                f fVar = f.this;
                button.setOnFocusChangeListener(fVar.new k(fVar.f16855n));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f.this.f16855n.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) f.this.f16854m.getLayoutParams();
                marginLayoutParams.setMargins(70, 0, 0, 0);
                marginLayoutParams2.setMargins(0, 0, 70, 0);
                String strA = new c.h.a.k.d.a.a(f.this.f16844c).A();
                if (strA.equals(c.h.a.h.n.a.s0)) {
                    f.this.f16855n.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
                    f.this.f16855n.setTextSize(16.0f);
                    f.this.f16855n.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.black_button_dark));
                    marginLayoutParams.width = 230;
                    marginLayoutParams.height = 70;
                } else {
                    f.this.f16855n.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
                    f.this.f16855n.setTextSize(14.0f);
                    f.this.f16855n.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.back_btn_effect));
                    marginLayoutParams.width = 250;
                    marginLayoutParams.height = 110;
                }
                Button button2 = f.this.f16854m;
                f fVar2 = f.this;
                button2.setOnFocusChangeListener(fVar2.new k(fVar2.f16854m));
                f.this.f16854m.setTextColor(f.this.f16844c.getResources().getColor(R.color.white));
                if (strA.equals(c.h.a.h.n.a.s0)) {
                    f.this.f16854m.setTextSize(16.0f);
                    f.this.f16854m.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.black_button_dark));
                    marginLayoutParams2.width = 230;
                    marginLayoutParams2.height = 70;
                    return;
                }
                f.this.f16854m.setTextSize(14.0f);
                f.this.f16854m.setBackground(f.this.f16844c.getResources().getDrawable(R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = 110;
            }
        }

        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = new EditText(f.this.f16844c);
            editText.setLayoutParams(new ViewGroup.LayoutParams(-1, 100));
            AlertDialog.Builder builder = new AlertDialog.Builder(f.this.f16844c, R.style.AlertDialogCustom);
            builder.setTitle(f.this.f16844c.getResources().getString(R.string.new_folder_name)).setView(editText).setPositiveButton(f.this.f16844c.getResources().getString(R.string.set_ok), new a(editText)).setNeutralButton(f.this.f16844c.getResources().getString(R.string.set_cancel), (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setOnShowListener(new b(alertDialogCreate));
            alertDialogCreate.show();
            if (alertDialogCreate.getWindow() != null) {
                alertDialogCreate.getWindow().setLayout(750, 350);
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
            }
        }
    }

    public interface j {
        void a(String str);
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f16873b;

        public k(View view) {
            this.f16873b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16873b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16873b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            if (z) {
                View view2 = this.f16873b;
                if (view2 == null || view2.getTag() == null || !this.f16873b.getTag().equals("6")) {
                    f = z ? 1.12f : 1.0f;
                    a(f);
                    b(f);
                    View view3 = this.f16873b;
                    if (view3 != null && view3.getTag() != null && this.f16873b.getTag().equals("1") && f.this.f16851j != null) {
                        f.this.f16851j.setBackgroundResource(R.drawable.back_btn_effect);
                    }
                    View view4 = this.f16873b;
                    if (view4 != null && view4.getTag() != null && this.f16873b.getTag().equals("2") && f.this.f16852k != null) {
                        f.this.f16852k.setBackgroundResource(R.drawable.logout_btn_effect);
                    }
                    View view5 = this.f16873b;
                    if (view5 != null && view5.getTag() != null && this.f16873b.getTag().equals("3") && f.this.f16853l != null) {
                        f.this.f16853l.setBackgroundResource(R.drawable.blue_btn_effect);
                    }
                    View view6 = this.f16873b;
                    if (view6 != null && view6.getTag() != null && this.f16873b.getTag().equals("4") && f.this.f16855n != null) {
                        f.this.f16855n.setBackgroundResource(R.drawable.back_btn_effect);
                    }
                    View view7 = this.f16873b;
                    if (view7 == null || view7.getTag() == null || !this.f16873b.getTag().equals("5") || f.this.f16854m == null) {
                        return;
                    }
                    f.this.f16854m.setBackgroundResource(R.drawable.logout_btn_effect);
                    return;
                }
                if (z) {
                    f = 1.18f;
                }
            } else {
                if (z) {
                    return;
                }
                View view8 = this.f16873b;
                if (view8 != null && view8.getTag() != null && this.f16873b.getTag().equals("1") && f.this.f16851j != null) {
                    f.this.f16851j.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view9 = this.f16873b;
                if (view9 != null && view9.getTag() != null && this.f16873b.getTag().equals("2") && f.this.f16852k != null) {
                    f.this.f16852k.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view10 = this.f16873b;
                if (view10 != null && view10.getTag() != null && this.f16873b.getTag().equals("3") && f.this.f16853l != null) {
                    f.this.f16853l.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view11 = this.f16873b;
                if (view11 != null && view11.getTag() != null && this.f16873b.getTag().equals("4") && f.this.f16855n != null) {
                    f.this.f16855n.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view12 = this.f16873b;
                if (view12 != null && view12.getTag() != null && this.f16873b.getTag().equals("5") && f.this.f16854m != null) {
                    f.this.f16854m.setBackgroundResource(R.drawable.black_button_dark);
                }
            }
            a(f);
            b(f);
        }
    }

    public f(Context context, j jVar) {
        this.f16843b = BuildConfig.FLAVOR;
        this.f16848g = null;
        this.f16844c = context;
        if (Build.VERSION.SDK_INT >= 19) {
            int length = context.getExternalFilesDirs("external").length;
        }
        this.f16843b = "/storage";
        this.f16848g = jVar;
        try {
            this.f16843b = new File(this.f16843b).getCanonicalPath();
        } catch (IOException unused) {
        }
    }

    public static int E(float f2, Context context) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void B(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f16853l.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f16853l.setVisibility(0);
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
                        if (new File(sb.toString()).isDirectory()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(file.getParent());
                            sb2.append("/");
                            String[] list3 = file2.list();
                            list3.getClass();
                            sb2.append(list3[i2]);
                            arrayList.add(sb2.toString());
                        }
                        i2++;
                    }
                }
            }
            this.f16847f.clear();
            this.f16847f.addAll(arrayList);
            this.f16850i.notifyDataSetChanged();
            this.p.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public void C(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f16843b;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.f16845d = canonicalPath;
            this.f16846e = H(canonicalPath);
            this.f16847f = H(BuildConfig.FLAVOR);
            I(this.f16846e);
            AlertDialog.Builder builderF = F(canonicalPath, this.f16847f);
            this.r = builderF;
            builderF.setNegativeButton(this.f16844c.getResources().getString(R.string.set_cancel), (DialogInterface.OnClickListener) null);
            this.r.setNeutralButton(this.f16844c.getResources().getString(R.string.set_back), (DialogInterface.OnClickListener) null);
            this.r.setPositiveButton(this.f16844c.getResources().getString(R.string.set_ok), new d());
            c.h.a.k.b.e eVar = new c.h.a.k.b.e(this.f16844c, this.f16847f);
            this.f16849h = eVar;
            ListViewMaxHeight listViewMaxHeight = this.p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) eVar);
                this.p.setOnItemClickListener(new e());
            }
            AlertDialog alertDialogCreate = this.r.create();
            this.s = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new DialogInterfaceOnShowListenerC0213f());
            this.s.setOnKeyListener(new g());
            this.s.show();
            if (this.s.getWindow() != null) {
                this.s.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.s.getWindow().setLayout(E(650.0f, this.f16844c), -2);
            }
        } catch (IOException unused) {
        }
    }

    public void D(String str) {
        try {
            this.u = BuildConfig.FLAVOR;
            File absoluteFile = Environment.getExternalStoragePublicDirectory(BuildConfig.FLAVOR).getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f16847f = arrayList;
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
                    File file = new File(Environment.getExternalStoragePublicDirectory(list2[i2]).toString());
                    if (file.isDirectory()) {
                        this.f16847f.add(file.getPath());
                    }
                    i2++;
                }
            }
            AlertDialog.Builder builderF = F(BuildConfig.FLAVOR, this.f16847f);
            this.r = builderF;
            builderF.setNegativeButton(this.f16844c.getResources().getString(R.string.set_cancel), (DialogInterface.OnClickListener) null);
            this.r.setNeutralButton(this.f16844c.getResources().getString(R.string.set_back), (DialogInterface.OnClickListener) null);
            this.r.setPositiveButton(this.f16844c.getResources().getString(R.string.set_ok), new a());
            c.h.a.k.b.g gVar = new c.h.a.k.b.g(this.f16844c, this.f16847f, "recording");
            this.f16850i = gVar;
            ListViewMaxHeight listViewMaxHeight = this.p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) gVar);
                this.p.setOnItemClickListener(new b());
            }
            AlertDialog alertDialogCreate = this.r.create();
            this.s = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new c());
            this.s.show();
            if (this.s.getWindow() != null) {
                this.s.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.s.getWindow().setLayout(E(650.0f, this.f16844c), -2);
            }
        } catch (Exception unused) {
        }
    }

    public final AlertDialog.Builder F(String str, List<String> list) {
        this.r = new AlertDialog.Builder(this.f16844c, R.style.AlertDialogCustom);
        LinearLayout linearLayout = new LinearLayout(this.f16844c);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f16844c);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.f16844c.getResources().getString(R.string.choose_recording_directory));
        Drawable drawable = this.f16844c.getResources().getDrawable(R.drawable.cast_genre);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f16844c.getResources().getColor(android.R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        ImageView imageView = new ImageView(this.f16844c);
        this.q = imageView;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.q.setPadding(20, 20, 0, 0);
        this.q.setTag("6");
        this.q.setId(R.id.testing1);
        this.q.setFocusable(true);
        ImageView imageView2 = this.q;
        imageView2.setOnFocusChangeListener(new k(imageView2));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 21) {
            this.q.setImageResource(R.drawable.addfolder_icon);
        }
        if (i2 >= 21) {
            this.q.setImageDrawable(this.f16844c.getResources().getDrawable(R.drawable.addfolder_icon, null));
        }
        ((LinearLayout.LayoutParams) this.q.getLayoutParams()).gravity = 8388613;
        this.q.setOnClickListener(new i());
        linearLayout.addView(textView);
        linearLayout.addView(this.q);
        this.r.setCustomTitle(linearLayout);
        View viewInflate = ((LayoutInflater) this.f16844c.getSystemService("layout_inflater")).inflate(R.layout.directory_listview, (ViewGroup) null);
        this.r.setView(viewInflate);
        this.p = (ListViewMaxHeight) viewInflate.findViewById(R.id.lv_ch);
        this.r.setCancelable(false);
        return this.r;
    }

    public final boolean G(String str) {
        File file = new File(str);
        if (file.exists()) {
            return false;
        }
        return file.mkdir();
    }

    public final List<String> H(String str) {
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
            }
            Collections.sort(arrayList, new h());
            return arrayList;
        }
        return arrayList;
    }

    public final void I(List<String> list) {
        this.f16847f.clear();
        boolean z = false;
        for (String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f16856o.put("SD Card", str);
                    this.f16847f.add("SD Card");
                } else {
                    this.f16847f.add(str);
                }
            }
        }
        if (z) {
            this.f16847f.add(0, "Internal Storage");
        }
    }

    public void J(boolean z) {
        this.f16842a = z;
    }

    public final void K() {
        TextView textView;
        try {
            if (this.f16845d.equals(this.f16843b)) {
                I(H(this.f16845d));
            } else {
                this.f16847f.clear();
                this.f16847f.add("..");
                this.f16847f.addAll(H(this.f16845d));
            }
            AlertDialog alertDialog = this.s;
            if (alertDialog != null && (textView = (TextView) alertDialog.findViewById(android.R.id.message)) != null) {
                textView.setText(this.f16845d);
            }
            if (this.f16845d.equals(this.f16843b)) {
                this.f16853l.setVisibility(4);
                this.f16852k.setVisibility(8);
            } else {
                this.f16853l.setVisibility(0);
                this.f16852k.setVisibility(0);
            }
            this.f16849h.notifyDataSetChanged();
            this.p.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }
}
