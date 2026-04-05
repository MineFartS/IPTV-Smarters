package c.h.a.h;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
import com.amazonaws.services.s3.model.InstructionFileId;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.activity.HoneyPlayer;
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
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c.h.a.k.d.a.a f16790a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f16793d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<String> f16796g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Integer> f16798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<Integer> f16799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f16800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.k.b.f f16801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f16802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f16803n;
    public ListViewMaxHeight p;
    public AlertDialog.Builder q;
    public AlertDialog r;
    public List<String> t;
    public c.h.a.k.b.h u;
    public File v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16791b = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16794e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f16795f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<String> f16797h = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap<String, String> f16804o = new HashMap<>();
    public Boolean s = Boolean.TRUE;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            Intent intent;
            d.this.f16803n.setVisibility(0);
            d.this.v = new File((String) d.this.f16797h.get(i2));
            if (d.this.v != null && d.this.v.isFile()) {
                d dVar = d.this;
                dVar.f16794e = dVar.v.getName();
                if (d.this.f16800k != null) {
                    if (d.this.f16793d != null) {
                        c.h.a.k.d.a.a unused = d.f16790a = new c.h.a.k.d.a.a(d.this.f16793d);
                        if (d.f16790a.x() == 3) {
                            d.f16790a.U(d.this.f16793d.getResources().getString(R.string.hardware_decoder));
                            intent = new Intent(d.this.f16793d, (Class<?>) HoneyPlayer.class);
                        } else {
                            intent = new Intent(d.this.f16793d, (Class<?>) HoneyPlayer.class);
                        }
                        intent.putExtra("type", "devicedata");
                        intent.putExtra("VIDEO_NUM", 0);
                        intent.putExtra("VIDEO_PATH", d.this.v.getPath());
                        d.this.f16793d.startActivity(intent);
                    }
                    d.this.r.dismiss();
                    return;
                }
                return;
            }
            d dVar2 = d.this;
            dVar2.f16794e = dVar2.v.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (d.this.f16794e.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                d dVar3 = d.this;
                dVar3.u(dVar3.v);
                return;
            }
            arrayList.add(d.this.v.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (d.this.v.list() != null) {
                int i3 = 0;
                while (true) {
                    String[] list = d.this.v.list();
                    list.getClass();
                    if (i3 >= list.length) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(d.this.v.getPath());
                    sb.append("/");
                    String[] list2 = d.this.v.list();
                    list2.getClass();
                    sb.append(list2[i3]);
                    arrayList.add(sb.toString());
                    i3++;
                }
            }
            d.this.f16797h.clear();
            d.this.f16797h.addAll(arrayList);
            d.this.u.notifyDataSetChanged();
            d.this.p.setSelection(0);
            if (d.this.p != null) {
                d.this.p.requestFocus();
            }
        }
    }

    public class b implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.r.dismiss();
            }
        }

        /* JADX INFO: renamed from: c.h.a.h.d$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0209b implements View.OnClickListener {
            public ViewOnClickListenerC0209b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (d.this.f16797h == null || d.this.f16797h.get(0) == null) {
                    return;
                }
                d.this.u(new File((String) d.this.f16797h.get(0)));
            }
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            d dVar = d.this;
            dVar.f16802m = dVar.r.getButton(-2);
            d dVar2 = d.this;
            dVar2.f16803n = dVar2.r.getButton(-3);
            if (d.this.v == null || d.this.v.getParent() == null || d.this.v.getParent().equals("/storage/emulated/0")) {
                d.this.f16803n.setVisibility(4);
            } else {
                d.this.f16803n.setVisibility(0);
            }
            d.this.f16802m.setTag("1");
            d.this.f16803n.setTag("3");
            Button button = d.this.f16802m;
            d dVar3 = d.this;
            button.setOnFocusChangeListener(dVar3.new h(dVar3.f16802m));
            d.this.f16802m.setTextColor(d.this.f16793d.getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d.this.f16802m.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) d.this.f16803n.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new c.h.a.k.d.a.a(d.this.f16793d).A();
            if (strA.equals(c.h.a.h.n.a.s0)) {
                d.this.f16802m.setTextSize(16.0f);
                d.this.f16802m.setBackground(d.this.f16793d.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                d.this.f16802m.setTextSize(14.0f);
                d.this.f16802m.setBackground(d.this.f16793d.getResources().getDrawable(R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            d.this.f16802m.setOnClickListener(new a());
            d.this.f16803n.setOnClickListener(new ViewOnClickListenerC0209b());
            Button button2 = d.this.f16803n;
            d dVar4 = d.this;
            button2.setOnFocusChangeListener(dVar4.new h(dVar4.f16803n));
            d.this.f16803n.setTextColor(d.this.f16793d.getResources().getColor(R.color.white));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                d.this.f16803n.setTextSize(16.0f);
                d.this.f16803n.setBackground(d.this.f16793d.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            d.this.f16803n.setTextSize(14.0f);
            d.this.f16803n.setBackground(d.this.f16793d.getResources().getDrawable(R.drawable.logout_btn_effect));
            marginLayoutParams2.width = 255;
            marginLayoutParams2.height = 135;
        }
    }

    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            d dVar;
            StringBuilder sb;
            String str;
            String string;
            if (((String) d.this.f16797h.get(i2)).equals("Internal Storage")) {
                dVar = d.this;
                string = d.this.f16794e + "/emulated/0";
            } else {
                if (d.this.f16797h.get(i2) != null && i2 == 0 && ((String) d.this.f16797h.get(i2)).equals("..")) {
                    d.this.f16803n.performClick();
                    d.this.B();
                }
                if (d.this.f16804o == null || d.this.f16804o.get(d.this.f16797h.get(i2)) == null || ((String) d.this.f16804o.get(d.this.f16797h.get(i2))).equals(BuildConfig.FLAVOR)) {
                    dVar = d.this;
                    sb = new StringBuilder();
                    sb.append(d.this.f16794e);
                    sb.append("/");
                    str = (String) d.this.f16797h.get(i2);
                    sb.append(str);
                    string = sb.toString();
                } else {
                    dVar = d.this;
                    sb = new StringBuilder();
                    sb.append(d.this.f16794e);
                    sb.append("/");
                    sb.append((String) d.this.f16804o.get(d.this.f16797h.get(i2)));
                    sb.append("/Android/data/");
                    str = "minefarts.iptvsmarters";
                    sb.append(str);
                    string = sb.toString();
                }
            }
            dVar.f16794e = string;
            d.this.B();
        }
    }

    /* JADX INFO: renamed from: c.h.a.h.d$d, reason: collision with other inner class name */
    public class DialogInterfaceOnShowListenerC0210d implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: c.h.a.h.d$d$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d dVar;
                File file;
                if (d.this.f16794e.equals(d.this.f16792c)) {
                    d.this.f16802m.performClick();
                    return;
                }
                if (!d.this.f16794e.equals("/storage/emulated/0")) {
                    d.this.f16794e = new File(d.this.f16794e).getParent();
                    String[] strArrSplit = d.this.f16794e.split("/");
                    if (strArrSplit.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                            if (d.this.f16794e.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                                d.this.f16794e = "/storage/" + strArrSplit[2];
                                dVar = d.this;
                                file = new File(d.this.f16794e);
                            }
                        }
                        if (new File(d.this.f16794e).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            d.this.f16794e = "/storage/" + strArrSplit[2] + "/Android/data/minefarts.iptvsmarters";
                        }
                    }
                    d.this.B();
                }
                d.this.f16794e = "/storage/emulated";
                dVar = d.this;
                file = new File(d.this.f16794e);
                dVar.f16794e = file.getParent();
                d.this.B();
            }
        }

        public DialogInterfaceOnShowListenerC0210d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            d dVar = d.this;
            dVar.f16802m = dVar.r.getButton(-2);
            d dVar2 = d.this;
            dVar2.f16803n = dVar2.r.getButton(-3);
            if (d.this.f16794e.equals(d.this.f16792c)) {
                d.this.f16803n.setVisibility(4);
            } else {
                d.this.f16803n.setVisibility(0);
            }
            d.this.f16802m.setTag("1");
            d.this.f16803n.setTag("3");
            Button button = d.this.f16802m;
            d dVar3 = d.this;
            button.setOnFocusChangeListener(dVar3.new h(dVar3.f16802m));
            d.this.f16802m.setTextColor(d.this.f16793d.getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d.this.f16802m.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) d.this.f16803n.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new c.h.a.k.d.a.a(d.this.f16793d).A();
            if (strA.equals(c.h.a.h.n.a.s0)) {
                d.this.f16802m.setTextSize(16.0f);
                d.this.f16802m.setBackground(d.this.f16793d.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                d.this.f16802m.setTextSize(14.0f);
                d.this.f16802m.setBackground(d.this.f16793d.getResources().getDrawable(R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            Button button2 = d.this.f16803n;
            d dVar4 = d.this;
            button2.setOnFocusChangeListener(dVar4.new h(dVar4.f16803n));
            d.this.f16803n.setTextColor(d.this.f16793d.getResources().getColor(R.color.white));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                d.this.f16803n.setTextSize(16.0f);
                d.this.f16803n.setBackground(d.this.f16793d.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
            } else {
                d.this.f16803n.setTextSize(14.0f);
                d.this.f16803n.setBackground(d.this.f16793d.getResources().getDrawable(R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 250;
                marginLayoutParams2.height = 110;
            }
            d.this.f16803n.setOnClickListener(new a());
        }
    }

    public class e implements DialogInterface.OnKeyListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            d dVar;
            File file;
            if (i2 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (d.this.f16794e.equals(d.this.f16792c)) {
                d.this.r.dismiss();
                return true;
            }
            if (!d.this.f16794e.equals("/storage/emulated/0")) {
                d.this.f16794e = new File(d.this.f16794e).getParent();
                String[] strArrSplit = d.this.f16794e.split("/");
                if (strArrSplit.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                        if (d.this.f16794e.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            d.this.f16794e = "/storage/" + strArrSplit[2];
                            dVar = d.this;
                            file = new File(d.this.f16794e);
                        }
                    }
                    if (new File(d.this.f16794e).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                        d.this.f16794e = "/storage/" + strArrSplit[2] + "/Android/data/minefarts.iptvsmarters";
                    }
                }
                d.this.B();
                return true;
            }
            d.this.f16794e = "/storage/emulated";
            dVar = d.this;
            file = new File(d.this.f16794e);
            dVar.f16794e = file.getParent();
            d.this.B();
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
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f16814b;

        public h(View view) {
            this.f16814b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16814b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16814b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            if (z) {
                View view2 = this.f16814b;
                if (view2 == null || view2.getTag() == null || !this.f16814b.getTag().equals("6")) {
                    f = z ? 1.12f : 1.0f;
                    a(f);
                    b(f);
                    View view3 = this.f16814b;
                    if (view3 != null && view3.getTag() != null && this.f16814b.getTag().equals("1") && d.this.f16802m != null) {
                        d.this.f16802m.setBackgroundResource(R.drawable.back_btn_effect);
                    }
                    View view4 = this.f16814b;
                    if (view4 == null || view4.getTag() == null || !this.f16814b.getTag().equals("3") || d.this.f16803n == null) {
                        return;
                    }
                    d.this.f16803n.setBackgroundResource(R.drawable.blue_btn_effect);
                    return;
                }
                if (z) {
                    f = 1.18f;
                }
            } else {
                if (z) {
                    return;
                }
                View view5 = this.f16814b;
                if (view5 != null && view5.getTag() != null && this.f16814b.getTag().equals("1") && d.this.f16802m != null) {
                    d.this.f16802m.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view6 = this.f16814b;
                if (view6 != null && view6.getTag() != null && this.f16814b.getTag().equals("3") && d.this.f16803n != null) {
                    d.this.f16803n.setBackgroundResource(R.drawable.black_button_dark);
                }
            }
            a(f);
            b(f);
        }
    }

    public d(Context context, g gVar) {
        this.f16792c = BuildConfig.FLAVOR;
        this.f16796g = null;
        this.f16800k = null;
        this.f16793d = context;
        if (Build.VERSION.SDK_INT >= 19) {
            int length = context.getExternalFilesDirs("external").length;
        }
        this.f16796g = new ArrayList();
        this.t = new ArrayList();
        this.f16798i = new ArrayList();
        this.f16799j = new ArrayList();
        this.f16792c = "/storage";
        this.f16800k = gVar;
        try {
            this.f16792c = new File(this.f16792c).getCanonicalPath();
        } catch (IOException unused) {
        }
    }

    public static int x(float f2, Context context) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void A(List<String> list) {
        this.f16797h.clear();
        boolean z = false;
        for (String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.f16804o.put("SD Card", str);
                    this.f16797h.add("SD Card");
                } else {
                    this.f16797h.add(str);
                }
            }
        }
        if (z) {
            this.f16797h.add(0, "Internal Storage");
        }
    }

    public final void B() {
        Intent intent;
        List<String> list;
        String str;
        try {
            if (!this.f16794e.contains(".mp4") && !this.f16794e.contains(".mp3") && !this.f16794e.contains(".3gp") && !this.f16794e.contains(".ts") && !this.f16794e.contains(".webm") && !this.f16794e.contains(".mkv") && !this.f16794e.contains(".flv") && !this.f16794e.contains(".wmv") && !this.f16794e.contains(".MP3")) {
                if (this.f16794e.equals(this.f16792c)) {
                    A(z(this.f16794e));
                } else if (this.f16794e.endsWith(".zip") || this.f16794e.endsWith(".apk") || this.f16794e.endsWith(".txt") || this.f16794e.endsWith(".pdf") || this.f16794e.endsWith(".m3u") || this.f16794e.endsWith(".xml")) {
                    Toast.makeText(this.f16793d, "File Not Supported !!", 1).show();
                    this.f16803n.performClick();
                } else {
                    if (this.f16794e.indexOf(InstructionFileId.DOT) != this.f16794e.lastIndexOf(InstructionFileId.DOT)) {
                        if (this.f16794e.endsWith(".zip") || this.f16794e.endsWith(".apk") || !this.f16794e.endsWith(".mp4") || !this.f16794e.endsWith(".ts") || !this.f16794e.endsWith(".mp3") || !this.f16794e.endsWith(".webm") || !this.f16794e.endsWith(".3gp") || !this.f16794e.endsWith(".mkv") || !this.f16794e.endsWith(".flv") || !this.f16794e.endsWith(".wmv")) {
                            Toast.makeText(this.f16793d, "File Not Supported !!", 1).show();
                            this.f16803n.performClick();
                        }
                        this.f16797h.clear();
                        this.f16797h.add("..");
                        list = this.f16797h;
                        str = this.f16794e;
                    } else {
                        this.f16797h.clear();
                        this.f16797h.add("..");
                        list = this.f16797h;
                        str = this.f16794e;
                    }
                    list.addAll(z(str));
                }
                AlertDialog alertDialog = this.r;
                if (alertDialog != null) {
                    ((TextView) alertDialog.findViewById(android.R.id.message)).setText(this.f16794e);
                }
                if (this.f16794e.equals(this.f16792c)) {
                    this.f16803n.setVisibility(4);
                } else {
                    this.f16803n.setVisibility(0);
                }
                this.f16801l.f17443c.clear();
                this.f16801l.f17443c.add(this.f16794e);
                c.h.a.k.b.f fVar = this.f16801l;
                fVar.t++;
                fVar.notifyDataSetChanged();
                this.p.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.p;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            if (this.f16800k != null) {
                if (this.f16793d != null && this.s.booleanValue()) {
                    c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f16793d);
                    f16790a = aVar;
                    if (aVar.x() == 3) {
                        f16790a.U(this.f16793d.getResources().getString(R.string.hardware_decoder));
                        intent = new Intent(this.f16793d, (Class<?>) HoneyPlayer.class);
                    } else {
                        intent = new Intent(this.f16793d, (Class<?>) HoneyPlayer.class);
                    }
                    intent.putExtra("type", "devicedata");
                    intent.putExtra("VIDEO_NUM", 0);
                    intent.putExtra("VIDEO_PATH", this.f16794e);
                    this.f16793d.startActivity(intent);
                }
                this.f16803n.performClick();
            }
        } catch (Exception unused) {
        }
    }

    public final void u(File file) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (file.getParent() != null) {
                String parent = file.getParent();
                if (parent.equals("/storage/emulated/0")) {
                    this.f16803n.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f16803n.setVisibility(0);
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
            this.f16797h.clear();
            this.f16797h.addAll(arrayList);
            this.u.notifyDataSetChanged();
            this.p.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public void v(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f16792c;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.t.clear();
            this.f16794e = canonicalPath;
            this.f16795f = z(canonicalPath);
            this.f16797h = z(BuildConfig.FLAVOR);
            A(this.f16795f);
            AlertDialog.Builder builderY = y(canonicalPath, this.f16797h);
            this.q = builderY;
            builderY.setNegativeButton(this.f16793d.getResources().getString(R.string.set_cancel), (DialogInterface.OnClickListener) null);
            this.q.setNeutralButton(this.f16793d.getResources().getString(R.string.set_back), (DialogInterface.OnClickListener) null);
            c.h.a.k.b.f fVar = new c.h.a.k.b.f(this.f16793d, this.f16797h);
            this.f16801l = fVar;
            ListViewMaxHeight listViewMaxHeight = this.p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) fVar);
                this.p.setOnItemClickListener(new c());
            }
            AlertDialog alertDialogCreate = this.q.create();
            this.r = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new DialogInterfaceOnShowListenerC0210d());
            this.r.setOnKeyListener(new e());
            this.r.show();
            if (this.r.getWindow() != null) {
                this.r.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.r.getWindow().setLayout(x(650.0f, this.f16793d), -2);
            }
        } catch (IOException unused) {
        }
    }

    public void w(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory(BuildConfig.FLAVOR).getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f16797h = arrayList;
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
                    this.f16797h.add(new File(Environment.getExternalStoragePublicDirectory(list2[i2]).toString()).getPath());
                    i2++;
                }
            }
            AlertDialog.Builder builderY = y(BuildConfig.FLAVOR, this.f16797h);
            this.q = builderY;
            builderY.setNegativeButton(this.f16793d.getResources().getString(R.string.set_cancel), (DialogInterface.OnClickListener) null);
            this.q.setNeutralButton(this.f16793d.getResources().getString(R.string.set_back), (DialogInterface.OnClickListener) null);
            c.h.a.k.b.h hVar = new c.h.a.k.b.h(this.f16793d, this.f16797h);
            this.u = hVar;
            ListViewMaxHeight listViewMaxHeight = this.p;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) hVar);
                this.p.setOnItemClickListener(new a());
            }
            AlertDialog alertDialogCreate = this.q.create();
            this.r = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new b());
            this.r.show();
            if (this.r.getWindow() != null) {
                this.r.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.r.getWindow().setLayout(x(650.0f, this.f16793d), -2);
            }
        } catch (Exception unused) {
        }
    }

    public final AlertDialog.Builder y(String str, List<String> list) {
        this.q = new AlertDialog.Builder(this.f16793d, R.style.AlertDialogCustom);
        LinearLayout linearLayout = new LinearLayout(this.f16793d);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f16793d);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(this.f16793d.getResources().getString(R.string.choose_data));
        Drawable drawable = this.f16793d.getResources().getDrawable(R.drawable.cast_genre);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f16793d.getResources().getColor(android.R.color.black));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.q.setCustomTitle(linearLayout);
        View viewInflate = ((LayoutInflater) this.f16793d.getSystemService("layout_inflater")).inflate(R.layout.directory_listview, (ViewGroup) null);
        this.q.setView(viewInflate);
        this.p = (ListViewMaxHeight) viewInflate.findViewById(R.id.lv_ch);
        this.q.setCancelable(false);
        return this.q;
    }

    public final List<String> z(String str) {
        File file;
        String name;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(str);
        } catch (Exception unused) {
        }
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                try {
                    if (file2.isDirectory()) {
                        name = file2.getName();
                    } else {
                        c.f.b.d.a.a(file2.getName());
                        name = file2.getName();
                    }
                    arrayList.add(name);
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
            Collections.sort(arrayList, new f());
            return arrayList;
        }
        return arrayList;
    }
}
