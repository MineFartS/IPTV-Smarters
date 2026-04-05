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
import com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class l extends RecyclerView.h<f> implements Filterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f17548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.a f17549i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f17551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f17552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.f f17553m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f17550j = new b(this, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<c.h.a.i.e> f17545e = c.h.a.i.p.b().c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f17546f = c.h.a.i.p.b().c();

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f17555c;

        public a(int i2, f fVar) {
            this.f17554b = i2;
            this.f17555c = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((LiveAllDataSingleActivity) l.this.f17548h).p1();
            l lVar = l.this;
            lVar.f17547g = ((c.h.a.i.e) lVar.f17546f.get(this.f17554b)).b();
            this.f17555c.w.setBackground(l.this.f17548h.getResources().getDrawable(R.color.hp_cyan));
            if (l.this.f17548h instanceof LiveAllDataSingleActivity) {
                AsyncTask asyncTask = c.h.a.h.n.e.f17065g;
                if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    c.h.a.h.n.e.f17065g.cancel(true);
                }
                ((LiveAllDataSingleActivity) l.this.f17548h).j1(((c.h.a.i.e) l.this.f17546f.get(this.f17554b)).b(), ((c.h.a.i.e) l.this.f17546f.get(this.f17554b)).c());
            }
            l.this.w();
        }
    }

    public class b extends Filter {
        public b() {
        }

        public /* synthetic */ b(l lVar, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = l.this.f17545e;
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
                l.this.f17546f = (ArrayList) filterResults.values;
                l.this.w();
                if (l.this.f17546f == null || l.this.f17546f.size() != 0) {
                    ((LiveAllDataSingleActivity) l.this.f17548h).Y0();
                } else {
                    ((LiveAllDataSingleActivity) l.this.f17548h).k1();
                }
            } catch (Exception unused) {
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class c extends AsyncTask<f, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f17558a;

        public c(f fVar) {
            this.f17558a = fVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            return Integer.valueOf(c.h.a.i.q.m.f(l.this.f17548h).equals("m3u") ? l.this.f17553m.A1("live") : l.this.f17552l.equals("true") ? l.this.f17549i.s("radio_streams", c.h.a.i.q.m.z(l.this.f17548h)) : l.this.f17549i.s("live", c.h.a.i.q.m.z(l.this.f17548h)));
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f17558a.v.setText("0");
            } else {
                this.f17558a.v.setText(String.valueOf(num));
            }
            this.f17558a.v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17558a.v.setVisibility(8);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class d extends AsyncTask<f, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f17560a;

        public d(f fVar) {
            this.f17560a = fVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            try {
                return Integer.valueOf(l.this.f17553m.d2());
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f17560a.v.setText("0");
            } else {
                this.f17560a.v.setText(String.valueOf(num));
            }
            this.f17560a.v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17560a.v.setVisibility(8);
        }
    }

    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f17563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17564d;

        public e(View view, f fVar, int i2) {
            this.f17564d = 0;
            this.f17562b = view;
            this.f17563c = fVar;
            this.f17564d = i2;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            f fVar;
            TextView textView;
            if (!z || (fVar = this.f17563c) == null || (textView = fVar.u) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    public static class f extends RecyclerView.e0 {
        public TextView u;
        public TextView v;
        public RelativeLayout w;

        public f(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.tv_cat_name);
            this.v = (TextView) view.findViewById(R.id.tv_cat_count);
            this.w = (RelativeLayout) view.findViewById(R.id.rl_sidebar);
        }
    }

    public l(Context context, String str, String str2) {
        this.f17551k = "mobile";
        this.f17552l = "false";
        this.f17548h = context;
        this.f17549i = new c.h.a.i.q.a(context);
        this.f17553m = new c.h.a.i.q.f(context);
        this.f17547g = str2;
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.f17551k = "tv";
        } else {
            this.f17551k = "mobile";
        }
        this.f17552l = str;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f17550j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void F(@NotNull f fVar, int i2) {
        RelativeLayout relativeLayout;
        Drawable drawable;
        try {
            fVar.u.setText(this.f17546f.get(i2).c());
            if (this.f17546f.get(i2).b().equalsIgnoreCase("-1")) {
                o0(fVar);
            } else if (this.f17546f.get(i2).b().equalsIgnoreCase("-6")) {
                p0(fVar);
            } else {
                fVar.v.setText(String.valueOf(this.f17546f.get(i2).d()));
            }
            fVar.w.setOnClickListener(new a(i2, fVar));
            if (!this.f17547g.equals(this.f17546f.get(i2).b())) {
                relativeLayout = fVar.w;
                drawable = this.f17548h.getResources().getDrawable(R.drawable.left_recycler_sidebar_tv);
            } else {
                if (!((LiveAllDataSingleActivity) this.f17548h).M0()) {
                    fVar.w.setBackground(this.f17548h.getResources().getDrawable(R.color.hp_cyan));
                    if (!((LiveAllDataSingleActivity) this.f17548h).g1()) {
                        fVar.w.requestFocus();
                    }
                    RelativeLayout relativeLayout2 = fVar.w;
                    relativeLayout2.setOnFocusChangeListener(new e(relativeLayout2, fVar, i2));
                }
                relativeLayout = fVar.w;
                drawable = this.f17548h.getResources().getDrawable(R.color.hp_cyan);
            }
            relativeLayout.setBackground(drawable);
            RelativeLayout relativeLayout22 = fVar.w;
            relativeLayout22.setOnFocusChangeListener(new e(relativeLayout22, fVar, i2));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public f H(ViewGroup viewGroup, int i2) {
        return new f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.series_all_data_left_adapter, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        ArrayList<c.h.a.i.e> arrayList = this.f17546f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void o0(f fVar) {
        new c(fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }

    public final void p0(f fVar) {
        new d(fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }

    public void q0(String str) {
        this.f17547g = str;
    }
}
