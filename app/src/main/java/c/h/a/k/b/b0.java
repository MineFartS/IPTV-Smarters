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
import com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class b0 extends RecyclerView.h<d> implements Filterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f17404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.a f17405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.k f17406j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f17408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.f f17409m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f17407k = new b(this, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<c.h.a.i.e> f17401e = c.h.a.i.p.b().f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f17402f = c.h.a.i.p.b().f();

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f17411c;

        public a(int i2, d dVar) {
            this.f17410b = i2;
            this.f17411c = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((VodAllDataSingleActivity) b0.this.f17404h).p1();
            b0 b0Var = b0.this;
            b0Var.f17403g = ((c.h.a.i.e) b0Var.f17402f.get(this.f17410b)).b();
            this.f17411c.w.setBackground(b0.this.f17404h.getResources().getDrawable(R.color.hp_cyan));
            if (b0.this.f17404h instanceof VodAllDataSingleActivity) {
                AsyncTask asyncTask = c.h.a.h.n.e.f17064f;
                if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    c.h.a.h.n.e.f17064f.cancel(true);
                }
                ((VodAllDataSingleActivity) b0.this.f17404h).j1(((c.h.a.i.e) b0.this.f17402f.get(this.f17410b)).b(), ((c.h.a.i.e) b0.this.f17402f.get(this.f17410b)).c());
            }
            b0.this.w();
        }
    }

    public class b extends Filter {
        public b() {
        }

        public /* synthetic */ b(b0 b0Var, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = b0.this.f17401e;
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
                b0.this.f17402f = (ArrayList) filterResults.values;
                b0.this.w();
                if (b0.this.f17402f == null || b0.this.f17402f.size() != 0) {
                    ((VodAllDataSingleActivity) b0.this.f17404h).Y0();
                } else {
                    ((VodAllDataSingleActivity) b0.this.f17404h).k1();
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f17415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17416d;

        public c(View view, d dVar, int i2) {
            this.f17416d = 0;
            this.f17414b = view;
            this.f17415c = dVar;
            this.f17416d = i2;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            d dVar;
            TextView textView;
            if (!z || (dVar = this.f17415c) == null || (textView = dVar.u) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    public static class d extends RecyclerView.e0 {
        public TextView u;
        public TextView v;
        public RelativeLayout w;

        public d(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.tv_cat_name);
            this.v = (TextView) view.findViewById(R.id.tv_cat_count);
            this.w = (RelativeLayout) view.findViewById(R.id.rl_sidebar);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class e extends AsyncTask<d, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f17418a;

        public e(d dVar) {
            this.f17418a = dVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(d... dVarArr) {
            try {
                return c.h.a.i.q.m.f(b0.this.f17404h).equals("m3u") ? Integer.valueOf(b0.this.f17409m.A1("movie")) : Integer.valueOf(b0.this.f17405i.s("vod", c.h.a.i.q.m.z(b0.this.f17404h)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f17418a.v.setText("0");
            } else {
                this.f17418a.v.setText(String.valueOf(num));
            }
            this.f17418a.v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17418a.v.setVisibility(8);
        }
    }

    public b0(Context context, String str) {
        this.f17408l = "mobile";
        this.f17404h = context;
        this.f17405i = new c.h.a.i.q.a(context);
        this.f17409m = new c.h.a.i.q.f(context);
        this.f17406j = new c.h.a.i.q.k(context);
        this.f17403g = str;
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.f17408l = "tv";
        } else {
            this.f17408l = "mobile";
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f17407k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void F(@NotNull d dVar, int i2) {
        String strValueOf;
        TextView textView;
        RelativeLayout relativeLayout;
        Drawable drawable;
        try {
            dVar.u.setText(this.f17402f.get(i2).c());
            if (this.f17402f.get(i2).b().equalsIgnoreCase("-1")) {
                n0(dVar);
            } else {
                if (this.f17402f.get(i2).b().equalsIgnoreCase("-4")) {
                    int iY = this.f17406j.y();
                    if (iY == 0 || iY == -1) {
                        dVar.v.setText("0");
                    } else {
                        textView = dVar.v;
                        strValueOf = String.valueOf(iY);
                    }
                } else {
                    strValueOf = String.valueOf(this.f17402f.get(i2).d());
                    textView = dVar.v;
                }
                textView.setText(strValueOf);
            }
            dVar.w.setOnClickListener(new a(i2, dVar));
            if (!this.f17403g.equals(this.f17402f.get(i2).b())) {
                relativeLayout = dVar.w;
                drawable = this.f17404h.getResources().getDrawable(R.drawable.left_recycler_sidebar_tv);
            } else {
                if (!((VodAllDataSingleActivity) this.f17404h).M0()) {
                    dVar.w.setBackground(this.f17404h.getResources().getDrawable(R.color.hp_cyan));
                    if (!((VodAllDataSingleActivity) this.f17404h).h1()) {
                        dVar.w.requestFocus();
                    }
                    RelativeLayout relativeLayout2 = dVar.w;
                    relativeLayout2.setOnFocusChangeListener(new c(relativeLayout2, dVar, i2));
                }
                relativeLayout = dVar.w;
                drawable = this.f17404h.getResources().getDrawable(R.color.hp_cyan);
            }
            relativeLayout.setBackground(drawable);
            RelativeLayout relativeLayout22 = dVar.w;
            relativeLayout22.setOnFocusChangeListener(new c(relativeLayout22, dVar, i2));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public d H(ViewGroup viewGroup, int i2) {
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.series_all_data_left_adapter, viewGroup, false));
    }

    public final void n0(d dVar) {
        new e(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        ArrayList<c.h.a.i.e> arrayList = this.f17402f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void o0(String str) {
        this.f17403g = str;
    }
}
