package c.h.a.k.d.c.a;

import a.b.k.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f17859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TableLayout f17860c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f17861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f17862b;

        public b() {
        }

        public void a(String str) {
            TextView textView = this.f17861a;
            if (textView != null) {
                textView.setText(str);
            }
        }

        public void b(String str) {
            TextView textView = this.f17862b;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    public h(Context context) {
        this(context, R.layout.table_media_info);
    }

    public h(Context context, int i2) {
        this.f17858a = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(i2, (ViewGroup) null);
        this.f17859b = viewGroup;
        this.f17860c = (TableLayout) viewGroup.findViewById(R.id.table);
    }

    public h(Context context, TableLayout tableLayout) {
        this.f17858a = context;
        this.f17859b = tableLayout;
        this.f17860c = tableLayout;
    }

    public static String a() {
        return "V";
    }

    public static String i() {
        return "GhlIGFwcCB5b3UgYXJlIHVzaW5nIGlzIG5vdCBvcmlnaW5hbC4=";
    }

    public View b(int i2, String str, String str2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f17858a).inflate(i2, (ViewGroup) this.f17860c, false);
        k(viewGroup, str, str2);
        this.f17860c.addView(viewGroup);
        return viewGroup;
    }

    public View c(int i2, String str) {
        return d(this.f17858a.getString(i2), str);
    }

    public View d(String str, String str2) {
        return b(R.layout.table_media_info_row2, str, str2);
    }

    public View e(int i2) {
        return f(this.f17858a.getString(i2));
    }

    public View f(String str) {
        return b(R.layout.table_media_info_section, str, null);
    }

    public b.a g() {
        b.a aVar = new b.a(this.f17858a);
        aVar.setView(h());
        return aVar;
    }

    public ViewGroup h() {
        return this.f17859b;
    }

    public b j(View view) {
        b bVar = (b) view.getTag();
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        bVar2.f17861a = (TextView) view.findViewById(R.id.name);
        bVar2.f17862b = (TextView) view.findViewById(R.id.value);
        view.setTag(bVar2);
        return bVar2;
    }

    public void k(View view, String str, String str2) {
        b bVarJ = j(view);
        bVarJ.a(str);
        bVarJ.b(str2);
    }

    public void l(View view, String str) {
        j(view).b(str);
    }
}
