package c.h.a.k.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class w extends RecyclerView.h<e> implements Filterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f17706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.a f17707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.l f17708j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f17710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.f f17711m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f17709k = new b(this, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<c.h.a.i.e> f17703e = c.h.a.i.m.b().c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f17704f = c.h.a.i.m.b().c();

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f17713c;

        public a(int i2, e eVar) {
            this.f17712b = i2;
            this.f17713c = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((SeriesAllDataSingleActivity) w.this.f17706h).p1();
            w wVar = w.this;
            wVar.f17705g = ((c.h.a.i.e) wVar.f17704f.get(this.f17712b)).b();
            this.f17713c.w.setBackground(w.this.f17706h.getResources().getDrawable(R.color.hp_cyan));
            if (w.this.f17706h instanceof SeriesAllDataSingleActivity) {
                AsyncTask asyncTask = c.h.a.h.n.e.f17063e;
                if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    c.h.a.h.n.e.f17063e.cancel(true);
                }
                ((SeriesAllDataSingleActivity) w.this.f17706h).j1(((c.h.a.i.e) w.this.f17704f.get(this.f17712b)).b(), ((c.h.a.i.e) w.this.f17704f.get(this.f17712b)).c());
            }
            w.this.w();
        }
    }

    public class b extends Filter {
        public b() {
        }

        public /* synthetic */ b(w wVar, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = w.this.f17703e;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                c.h.a.i.e eVar = (c.h.a.i.e) arrayList.get(i2);
                if (eVar.c().toLowerCase().contains(lowerCase) || eVar.c().contains(lowerCase)) {
                    arrayList2.add(eVar);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                w.this.f17704f = (ArrayList) filterResults.values;
                w.this.w();
                if (w.this.f17704f == null || w.this.f17704f.size() != 0) {
                    ((SeriesAllDataSingleActivity) w.this.f17706h).Y0();
                } else {
                    ((SeriesAllDataSingleActivity) w.this.f17706h).k1();
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f17717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17718d;

        public c(View view, e eVar, int i2) {
            this.f17718d = 0;
            this.f17716b = view;
            this.f17717c = eVar;
            this.f17718d = i2;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            e eVar;
            TextView textView;
            if (!z || (eVar = this.f17717c) == null || (textView = eVar.u) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class d extends AsyncTask<e, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f17720a;

        public d(e eVar) {
            this.f17720a = eVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(e... eVarArr) {
            try {
                return c.h.a.i.q.m.f(w.this.f17706h).equals("m3u") ? Integer.valueOf(w.this.f17711m.A1("series")) : Integer.valueOf(w.this.f17707i.s("series", c.h.a.i.q.m.z(w.this.f17706h)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f17720a.v.setText("0");
            } else {
                this.f17720a.v.setText(String.valueOf(num));
            }
            this.f17720a.v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17720a.v.setVisibility(8);
        }
    }

    public static class e extends RecyclerView.e0 {
        public TextView u;
        public TextView v;
        public RelativeLayout w;

        public e(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.tv_cat_name);
            this.v = (TextView) view.findViewById(R.id.tv_cat_count);
            this.w = (RelativeLayout) view.findViewById(R.id.rl_sidebar);
        }
    }

    public w(Context context, String str) {
        this.f17710l = "mobile";
        this.f17706h = context;
        this.f17707i = new c.h.a.i.q.a(context);
        this.f17711m = new c.h.a.i.q.f(context);
        this.f17708j = new c.h.a.i.q.l(context);
        this.f17705g = str;
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.f17710l = "tv";
        } else {
            this.f17710l = "mobile";
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f17709k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void F(@NotNull e eVar, int i2) {
        String strValueOf;
        TextView textView;
        RelativeLayout relativeLayout;
        Drawable drawable;
        try {
            eVar.u.setText(this.f17704f.get(i2).c());
            if (this.f17704f.get(i2).b().equalsIgnoreCase("-1")) {
                n0(eVar);
            } else {
                if (this.f17704f.get(i2).b().equalsIgnoreCase("-4")) {
                    int iU = this.f17708j.u();
                    if (iU == 0 || iU == -1) {
                        eVar.v.setText("0");
                    } else {
                        textView = eVar.v;
                        strValueOf = String.valueOf(iU);
                    }
                } else {
                    strValueOf = String.valueOf(this.f17704f.get(i2).d());
                    textView = eVar.v;
                }
                textView.setText(strValueOf);
            }
            eVar.w.setOnClickListener(new a(i2, eVar));
            if (!this.f17705g.equals(this.f17704f.get(i2).b())) {
                relativeLayout = eVar.w;
                drawable = this.f17706h.getResources().getDrawable(R.drawable.left_recycler_sidebar_tv);
            } else {
                if (!((SeriesAllDataSingleActivity) this.f17706h).M0()) {
                    eVar.w.setBackground(this.f17706h.getResources().getDrawable(R.color.hp_cyan));
                    if (!((SeriesAllDataSingleActivity) this.f17706h).h1()) {
                        eVar.w.requestFocus();
                    }
                    RelativeLayout relativeLayout2 = eVar.w;
                    relativeLayout2.setOnFocusChangeListener(new c(relativeLayout2, eVar, i2));
                }
                relativeLayout = eVar.w;
                drawable = this.f17706h.getResources().getDrawable(R.color.hp_cyan);
            }
            relativeLayout.setBackground(drawable);
            RelativeLayout relativeLayout22 = eVar.w;
            relativeLayout22.setOnFocusChangeListener(new c(relativeLayout22, eVar, i2));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public e H(ViewGroup viewGroup, int i2) {
        return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.series_all_data_left_adapter, viewGroup, false));
    }

    public final void n0(e eVar) {
        new d(eVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, eVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        ArrayList<c.h.a.i.e> arrayList = this.f17704f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void o0(String str) {
        this.f17705g = str;
    }
}
