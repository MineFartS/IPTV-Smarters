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
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c.h.a.k.d.a.a f16816a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f16819d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<String> f16822g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Integer> f16824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<Integer> f16825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f16826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.k.b.f f16827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.k.b.h f16828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f16829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f16830o;
    public ListViewMaxHeight q;
    public AlertDialog.Builder r;
    public AlertDialog s;
    public List<String> u;
    public File v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16817b = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16820e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<String> f16821f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<String> f16823h = null;
    public HashMap<String, String> p = new HashMap<>();
    public Boolean t = Boolean.TRUE;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            Intent intent;
            e.this.f16830o.setVisibility(0);
            e.this.v = new File((String) e.this.f16823h.get(i2));
            if (e.this.v != null && e.this.v.isFile()) {
                e eVar = e.this;
                eVar.f16820e = eVar.v.getName();
                if (e.this.f16826k != null) {
                    if (e.this.f16819d != null) {
                        c.h.a.k.d.a.a unused = e.f16816a = new c.h.a.k.d.a.a(e.this.f16819d);
                        if (e.f16816a.x() == 3) {
                            e.f16816a.U(e.this.f16819d.getResources().getString(R.string.hardware_decoder));
                            intent = new Intent(e.this.f16819d, (Class<?>) HoneyPlayer.class);
                        } else {
                            intent = new Intent(e.this.f16819d, (Class<?>) HoneyPlayer.class);
                        }
                        intent.putExtra("type", "devicedata");
                        intent.putExtra("VIDEO_NUM", 0);
                        intent.putExtra("VIDEO_PATH", e.this.v.getPath());
                        e.this.f16819d.startActivity(intent);
                    }
                    e.this.s.dismiss();
                    return;
                }
                return;
            }
            e eVar2 = e.this;
            eVar2.f16820e = eVar2.v.getName();
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            if (e.this.f16820e.equals("!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#")) {
                e eVar3 = e.this;
                eVar3.u(eVar3.v);
                return;
            }
            arrayList.add(e.this.v.getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
            if (e.this.v.list() != null) {
                int i3 = 0;
                while (true) {
                    String[] list = e.this.v.list();
                    list.getClass();
                    if (i3 >= list.length) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.this.v.getPath());
                    sb.append("/");
                    String[] list2 = e.this.v.list();
                    list2.getClass();
                    sb.append(list2[i3]);
                    arrayList.add(sb.toString());
                    i3++;
                }
            }
            e.this.f16823h.clear();
            e.this.f16823h.addAll(arrayList);
            e.this.f16828m.notifyDataSetChanged();
            e.this.q.setSelection(0);
            if (e.this.q != null) {
                e.this.q.requestFocus();
            }
        }
    }

    public class b implements DialogInterface.OnShowListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.s.dismiss();
            }
        }

        /* JADX INFO: renamed from: c.h.a.h.e$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0211b implements View.OnClickListener {
            public ViewOnClickListenerC0211b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (e.this.f16823h == null || e.this.f16823h.get(0) == null) {
                    return;
                }
                e.this.u(new File((String) e.this.f16823h.get(0)));
            }
        }

        public b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            e eVar = e.this;
            eVar.f16829n = eVar.s.getButton(-2);
            e eVar2 = e.this;
            eVar2.f16830o = eVar2.s.getButton(-3);
            if (e.this.v == null || e.this.v.getParent() == null || e.this.v.getParent().equals("/storage/emulated/0")) {
                e.this.f16830o.setVisibility(4);
            } else {
                e.this.f16830o.setVisibility(0);
            }
            e.this.f16829n.setTag("1");
            e.this.f16830o.setTag("3");
            Button button = e.this.f16829n;
            e eVar3 = e.this;
            button.setOnFocusChangeListener(eVar3.new h(eVar3.f16829n));
            e.this.f16829n.setTextColor(e.this.f16819d.getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.this.f16829n.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e.this.f16830o.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new c.h.a.k.d.a.a(e.this.f16819d).A();
            if (strA.equals(c.h.a.h.n.a.s0)) {
                e.this.f16829n.setTextSize(16.0f);
                e.this.f16829n.setBackground(e.this.f16819d.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams.width = 230;
                marginLayoutParams.height = 90;
            } else {
                e.this.f16829n.setTextSize(14.0f);
                e.this.f16829n.setBackground(e.this.f16819d.getResources().getDrawable(R.drawable.back_btn_effect));
                marginLayoutParams.width = 255;
                marginLayoutParams.height = 135;
            }
            e.this.f16829n.setOnClickListener(new a());
            e.this.f16830o.setOnClickListener(new ViewOnClickListenerC0211b());
            Button button2 = e.this.f16830o;
            e eVar4 = e.this;
            button2.setOnFocusChangeListener(eVar4.new h(eVar4.f16830o));
            e.this.f16830o.setTextColor(e.this.f16819d.getResources().getColor(R.color.white));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                e.this.f16830o.setTextSize(16.0f);
                e.this.f16830o.setBackground(e.this.f16819d.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                marginLayoutParams2.height = 90;
                return;
            }
            e.this.f16830o.setTextSize(14.0f);
            e.this.f16830o.setBackground(e.this.f16819d.getResources().getDrawable(R.drawable.logout_btn_effect));
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
            if (((String) e.this.f16823h.get(i2)).equals("Internal Storage")) {
                eVar = e.this;
                string = e.this.f16820e + "/emulated/0";
            } else {
                if (e.this.f16823h.get(i2) != null && i2 == 0 && ((String) e.this.f16823h.get(i2)).equals("..")) {
                    e.this.f16830o.performClick();
                    e.this.B();
                }
                if (e.this.p == null || e.this.p.get(e.this.f16823h.get(i2)) == null || ((String) e.this.p.get(e.this.f16823h.get(i2))).equals(BuildConfig.FLAVOR)) {
                    eVar = e.this;
                    sb = new StringBuilder();
                    sb.append(e.this.f16820e);
                    sb.append("/");
                    str = (String) e.this.f16823h.get(i2);
                    sb.append(str);
                    string = sb.toString();
                } else {
                    eVar = e.this;
                    sb = new StringBuilder();
                    sb.append(e.this.f16820e);
                    sb.append("/");
                    sb.append((String) e.this.p.get(e.this.f16823h.get(i2)));
                    sb.append("/Android/data/");
                    str = "minefarts.iptvsmarters";
                    sb.append(str);
                    string = sb.toString();
                }
            }
            eVar.f16820e = string;
            e.this.B();
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
                if (e.this.f16820e.equals(e.this.f16818c)) {
                    e.this.f16829n.performClick();
                    return;
                }
                if (!e.this.f16820e.equals("/storage/emulated/0")) {
                    e.this.f16820e = new File(e.this.f16820e).getParent();
                    String[] strArrSplit = e.this.f16820e.split("/");
                    if (strArrSplit.length >= 3) {
                        if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                            if (e.this.f16820e.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                                e.this.f16820e = "/storage/" + strArrSplit[2];
                                eVar = e.this;
                                file = new File(e.this.f16820e);
                            }
                        }
                        if (new File(e.this.f16820e).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            e.this.f16820e = "/storage/" + strArrSplit[2] + "/Android/data/minefarts.iptvsmarters";
                        }
                    }
                    e.this.B();
                }
                e.this.f16820e = "/storage/emulated";
                eVar = e.this;
                file = new File(e.this.f16820e);
                eVar.f16820e = file.getParent();
                e.this.B();
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
            eVar.f16829n = eVar.s.getButton(-2);
            e eVar2 = e.this;
            eVar2.f16830o = eVar2.s.getButton(-3);
            if (e.this.f16820e.equals(e.this.f16818c)) {
                e.this.f16830o.setVisibility(4);
            } else {
                e.this.f16830o.setVisibility(0);
            }
            e.this.f16829n.setTag("1");
            e.this.f16830o.setTag("3");
            Button button2 = e.this.f16829n;
            e eVar3 = e.this;
            button2.setOnFocusChangeListener(eVar3.new h(eVar3.f16829n));
            e.this.f16829n.setTextColor(e.this.f16819d.getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.this.f16829n.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e.this.f16830o.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 50, 0);
            String strA = new c.h.a.k.d.a.a(e.this.f16819d).A();
            if (strA.equals(c.h.a.h.n.a.s0)) {
                e.this.f16829n.setTextSize(16.0f);
                button = e.this.f16829n;
                drawable = e.this.f16819d.getResources().getDrawable(R.drawable.black_button_dark);
            } else {
                e.this.f16829n.setTextSize(14.0f);
                button = e.this.f16829n;
                drawable = e.this.f16819d.getResources().getDrawable(R.drawable.back_btn_effect);
            }
            button.setBackground(drawable);
            marginLayoutParams.width = 255;
            marginLayoutParams.height = 135;
            Button button3 = e.this.f16830o;
            e eVar4 = e.this;
            button3.setOnFocusChangeListener(eVar4.new h(eVar4.f16830o));
            e.this.f16830o.setTextColor(e.this.f16819d.getResources().getColor(R.color.white));
            if (strA.equals(c.h.a.h.n.a.s0)) {
                e.this.f16830o.setTextSize(16.0f);
                e.this.f16830o.setBackground(e.this.f16819d.getResources().getDrawable(R.drawable.black_button_dark));
                marginLayoutParams2.width = 230;
                i2 = 90;
            } else {
                e.this.f16830o.setTextSize(14.0f);
                e.this.f16830o.setBackground(e.this.f16819d.getResources().getDrawable(R.drawable.logout_btn_effect));
                marginLayoutParams2.width = 250;
                i2 = 110;
            }
            marginLayoutParams2.height = i2;
            e.this.f16830o.setOnClickListener(new a());
        }
    }

    /* JADX INFO: renamed from: c.h.a.h.e$e, reason: collision with other inner class name */
    public class DialogInterfaceOnKeyListenerC0212e implements DialogInterface.OnKeyListener {
        public DialogInterfaceOnKeyListenerC0212e() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            e eVar;
            File file;
            if (i2 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            if (e.this.f16820e.equals(e.this.f16818c)) {
                e.this.s.dismiss();
                return true;
            }
            if (!e.this.f16820e.equals("/storage/emulated/0")) {
                e.this.f16820e = new File(e.this.f16820e).getParent();
                String[] strArrSplit = e.this.f16820e.split("/");
                if (strArrSplit.length >= 3) {
                    if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(strArrSplit[2]).matches()) {
                        if (e.this.f16820e.equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                            e.this.f16820e = "/storage/" + strArrSplit[2];
                            eVar = e.this;
                            file = new File(e.this.f16820e);
                        }
                    }
                    if (new File(e.this.f16820e).getParent().equals("/storage/" + strArrSplit[2] + "/Android/data")) {
                        e.this.f16820e = "/storage/" + strArrSplit[2] + "/Android/data/minefarts.iptvsmarters";
                    }
                }
                e.this.B();
                return true;
            }
            e.this.f16820e = "/storage/emulated";
            eVar = e.this;
            file = new File(e.this.f16820e);
            eVar.f16820e = file.getParent();
            e.this.B();
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
        public final View f16840b;

        public h(View view) {
            this.f16840b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16840b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f16840b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            if (z) {
                View view2 = this.f16840b;
                if (view2 == null || view2.getTag() == null || !this.f16840b.getTag().equals("6")) {
                    f = z ? 1.12f : 1.0f;
                    a(f);
                    b(f);
                    View view3 = this.f16840b;
                    if (view3 != null && view3.getTag() != null && this.f16840b.getTag().equals("1") && e.this.f16829n != null) {
                        e.this.f16829n.setBackgroundResource(R.drawable.back_btn_effect);
                    }
                    View view4 = this.f16840b;
                    if (view4 == null || view4.getTag() == null || !this.f16840b.getTag().equals("3") || e.this.f16830o == null) {
                        return;
                    }
                    e.this.f16830o.setBackgroundResource(R.drawable.blue_btn_effect);
                    return;
                }
                if (z) {
                    f = 1.18f;
                }
            } else {
                if (z) {
                    return;
                }
                View view5 = this.f16840b;
                if (view5 != null && view5.getTag() != null && this.f16840b.getTag().equals("1") && e.this.f16829n != null) {
                    e.this.f16829n.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view6 = this.f16840b;
                if (view6 != null && view6.getTag() != null && this.f16840b.getTag().equals("3") && e.this.f16830o != null) {
                    e.this.f16830o.setBackgroundResource(R.drawable.black_button_dark);
                }
            }
            a(f);
            b(f);
        }
    }

    public e(Context context, g gVar) {
        this.f16818c = BuildConfig.FLAVOR;
        this.f16822g = null;
        this.f16826k = null;
        this.f16819d = context;
        if (Build.VERSION.SDK_INT >= 19) {
            int length = context.getExternalFilesDirs("external").length;
        }
        this.f16822g = new ArrayList();
        this.u = new ArrayList();
        this.f16824i = new ArrayList();
        this.f16825j = new ArrayList();
        this.f16818c = "/storage";
        this.f16826k = gVar;
        try {
            this.f16818c = new File(this.f16818c).getCanonicalPath();
        } catch (IOException unused) {
        }
    }

    public static int x(float f2, Context context) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void A(List<String> list) {
        this.f16823h.clear();
        boolean z = false;
        for (String str : list) {
            if (!str.equals("self")) {
                if (str.equals("emulated")) {
                    z = true;
                } else if (Pattern.compile("^\\(?(.{4})\\)?[- ]?(.{4})$").matcher(str).matches()) {
                    this.p.put("SD Card", str);
                    this.f16823h.add("SD Card");
                } else {
                    this.f16823h.add(str);
                }
            }
        }
        if (z) {
            this.f16823h.add(0, "Internal Storage");
        }
    }

    public final void B() {
        Intent intent;
        List<String> list;
        String str;
        try {
            if (!this.f16820e.contains(".mp4") && !this.f16820e.contains(".mp3") && !this.f16820e.contains(".3gp") && !this.f16820e.contains(".ts") && !this.f16820e.contains(".webm") && !this.f16820e.contains(".mkv") && !this.f16820e.contains(".flv") && !this.f16820e.contains(".wmv") && !this.f16820e.contains(".MP3")) {
                if (this.f16820e.equals(this.f16818c)) {
                    A(z(this.f16820e));
                } else if (this.f16820e.endsWith(".zip") || this.f16820e.endsWith(".apk") || this.f16820e.endsWith(".txt") || this.f16820e.endsWith(".pdf") || this.f16820e.endsWith(".m3u") || this.f16820e.endsWith(".xml")) {
                    Toast.makeText(this.f16819d, "File Not Supported !!", 1).show();
                    this.f16830o.performClick();
                } else {
                    if (this.f16820e.indexOf(InstructionFileId.DOT) != this.f16820e.lastIndexOf(InstructionFileId.DOT)) {
                        if (this.f16820e.endsWith(".zip") || this.f16820e.endsWith(".apk") || !this.f16820e.endsWith(".mp4") || !this.f16820e.endsWith(".ts") || !this.f16820e.endsWith(".mp3") || !this.f16820e.endsWith(".webm") || !this.f16820e.endsWith(".3gp") || !this.f16820e.endsWith(".mkv") || !this.f16820e.endsWith(".flv") || !this.f16820e.endsWith(".wmv")) {
                            Toast.makeText(this.f16819d, "File Not Supported !!", 1).show();
                            this.f16830o.performClick();
                        }
                        this.f16823h.clear();
                        this.f16823h.add("..");
                        list = this.f16823h;
                        str = this.f16820e;
                    } else {
                        this.f16823h.clear();
                        this.f16823h.add("..");
                        list = this.f16823h;
                        str = this.f16820e;
                    }
                    list.addAll(z(str));
                }
                AlertDialog alertDialog = this.s;
                if (alertDialog != null) {
                    ((TextView) alertDialog.findViewById(android.R.id.message)).setText(this.f16820e);
                }
                if (this.f16820e.equals(this.f16818c)) {
                    this.f16830o.setVisibility(4);
                } else {
                    this.f16830o.setVisibility(0);
                }
                this.f16827l.f17443c.clear();
                this.f16827l.f17443c.add(this.f16820e);
                c.h.a.k.b.f fVar = this.f16827l;
                fVar.t++;
                fVar.notifyDataSetChanged();
                this.q.setSelection(0);
                ListViewMaxHeight listViewMaxHeight = this.q;
                if (listViewMaxHeight != null) {
                    listViewMaxHeight.requestFocus();
                    return;
                }
                return;
            }
            if (this.f16826k != null) {
                if (this.f16819d != null && this.t.booleanValue()) {
                    c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f16819d);
                    f16816a = aVar;
                    if (aVar.x() == 3) {
                        f16816a.U(this.f16819d.getResources().getString(R.string.hardware_decoder));
                        intent = new Intent(this.f16819d, (Class<?>) HoneyPlayer.class);
                    } else {
                        intent = new Intent(this.f16819d, (Class<?>) HoneyPlayer.class);
                    }
                    intent.putExtra("type", "devicedata");
                    intent.putExtra("VIDEO_NUM", 0);
                    intent.putExtra("VIDEO_PATH", this.f16820e);
                    this.f16819d.startActivity(intent);
                }
                this.f16830o.performClick();
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
                    this.f16830o.setVisibility(4);
                } else {
                    arrayList.add(new File(parent).getParent() + "/!c2@f3qc@!V#VEVSD3gg3VC43hh&*%#H2252B@rv3F#RCD5%$#$V#");
                    this.f16830o.setVisibility(0);
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
            this.f16823h.clear();
            this.f16823h.addAll(arrayList);
            this.f16828m.notifyDataSetChanged();
            this.q.setSelection(0);
            ListViewMaxHeight listViewMaxHeight = this.q;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.requestFocus();
            }
        } catch (Exception unused) {
        }
    }

    public void v(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            str = this.f16818c;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            this.u.clear();
            this.f16820e = canonicalPath;
            this.f16821f = z(canonicalPath);
            this.f16823h = z(BuildConfig.FLAVOR);
            A(this.f16821f);
            this.r = y(canonicalPath, this.f16823h);
            c.h.a.k.b.f fVar = new c.h.a.k.b.f(this.f16819d, this.f16823h);
            this.f16827l = fVar;
            ListViewMaxHeight listViewMaxHeight = this.q;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) fVar);
                this.q.setOnItemClickListener(new c());
            }
            AlertDialog alertDialogCreate = this.r.create();
            this.s = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new d());
            this.s.setOnKeyListener(new DialogInterfaceOnKeyListenerC0212e());
            this.s.show();
            this.s.getWindow().setLayout(-1, -1);
            this.s.getWindow().setBackgroundDrawableResource(R.color.vw_BgRv);
        } catch (IOException unused) {
        }
    }

    public void w(String str) {
        try {
            File absoluteFile = Environment.getExternalStoragePublicDirectory(BuildConfig.FLAVOR).getAbsoluteFile();
            ArrayList arrayList = new ArrayList();
            this.f16823h = arrayList;
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
                    this.f16823h.add(new File(Environment.getExternalStoragePublicDirectory(list2[i2]).toString()).getPath());
                    i2++;
                }
            }
            AlertDialog.Builder builderY = y(BuildConfig.FLAVOR, this.f16823h);
            this.r = builderY;
            builderY.setNegativeButton(this.f16819d.getResources().getString(R.string.set_cancel), (DialogInterface.OnClickListener) null);
            this.r.setNeutralButton(this.f16819d.getResources().getString(R.string.set_back), (DialogInterface.OnClickListener) null);
            c.h.a.k.b.h hVar = new c.h.a.k.b.h(this.f16819d, this.f16823h);
            this.f16828m = hVar;
            ListViewMaxHeight listViewMaxHeight = this.q;
            if (listViewMaxHeight != null) {
                listViewMaxHeight.setAdapter((ListAdapter) hVar);
                this.q.setOnItemClickListener(new a());
            }
            AlertDialog alertDialogCreate = this.r.create();
            this.s = alertDialogCreate;
            alertDialogCreate.setOnShowListener(new b());
            this.s.show();
            if (this.s.getWindow() != null) {
                this.s.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.s.getWindow().setLayout(x(650.0f, this.f16819d), -2);
            }
        } catch (Exception unused) {
        }
    }

    public final AlertDialog.Builder y(String str, List<String> list) {
        this.r = new AlertDialog.Builder(this.f16819d, R.style.AlertDialogCustom2);
        LinearLayout linearLayout = new LinearLayout(this.f16819d);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f16819d);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setText(this.f16819d.getResources().getString(R.string.choose_data));
        Drawable drawable = this.f16819d.getResources().getDrawable(R.drawable.cast_genre);
        drawable.setBounds(0, 0, 80, 80);
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setTextSize(22.0f);
        textView.setTextColor(this.f16819d.getResources().getColor(android.R.color.white));
        textView.setPadding(50, 50, 0, 0);
        textView.setTypeface(null, 1);
        linearLayout.addView(textView);
        this.r.setCustomTitle(linearLayout);
        View viewInflate = ((LayoutInflater) this.f16819d.getSystemService("layout_inflater")).inflate(R.layout.directory_listview2, (ViewGroup) null);
        this.r.setView(viewInflate);
        this.q = (ListViewMaxHeight) viewInflate.findViewById(R.id.lv_ch);
        this.r.setCancelable(true);
        return this.r;
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
