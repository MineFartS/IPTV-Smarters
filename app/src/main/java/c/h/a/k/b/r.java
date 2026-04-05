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
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.demo.NSTEXOPlayerSkyActivity;
import minefarts.iptvsmarters.view.demo.NSTEXOPlayerSkyTvActivity;
import minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyActivity;
import minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class r extends RecyclerView.h<f> implements Filterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f17586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.a f17587i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f17589k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f17591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f17592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.h.a.i.q.f f17593o;
    public c.h.a.k.d.a.a p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f17588j = new b(this, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17590l = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<c.h.a.i.e> f17583e = c.h.a.i.p.b().c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f17584f = c.h.a.i.p.b().c();

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f17595c;

        public a(int i2, f fVar) {
            this.f17594b = i2;
            this.f17595c = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r rVar = r.this;
            rVar.f17585g = ((c.h.a.i.e) rVar.f17584f.get(this.f17594b)).b();
            this.f17595c.w.setBackground(r.this.f17586h.getResources().getDrawable(R.color.hp_cyan));
            if (r.this.f17589k.equals("mobile")) {
                if (r.this.f17586h instanceof NSTIJKPlayerSkyActivity) {
                    AsyncTask asyncTask = c.h.a.h.n.e.f17065g;
                    if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                        c.h.a.h.n.e.f17065g.cancel(true);
                    }
                    ((NSTIJKPlayerSkyActivity) r.this.f17586h).r2(((c.h.a.i.e) r.this.f17584f.get(this.f17594b)).b(), ((c.h.a.i.e) r.this.f17584f.get(this.f17594b)).c());
                } else if (r.this.f17586h instanceof NSTEXOPlayerSkyActivity) {
                    AsyncTask asyncTask2 = c.h.a.h.n.e.f17065g;
                    if (asyncTask2 != null && asyncTask2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                        c.h.a.h.n.e.f17065g.cancel(true);
                    }
                    ((NSTEXOPlayerSkyActivity) r.this.f17586h).J2(((c.h.a.i.e) r.this.f17584f.get(this.f17594b)).b(), ((c.h.a.i.e) r.this.f17584f.get(this.f17594b)).c());
                }
            } else if (r.this.f17586h instanceof NSTIJKPlayerSkyTvActivity) {
                AsyncTask asyncTask3 = c.h.a.h.n.e.f17065g;
                if (asyncTask3 != null && asyncTask3.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    c.h.a.h.n.e.f17065g.cancel(true);
                }
                ((NSTIJKPlayerSkyTvActivity) r.this.f17586h).D2(((c.h.a.i.e) r.this.f17584f.get(this.f17594b)).b());
            } else if (r.this.f17586h instanceof NSTEXOPlayerSkyTvActivity) {
                AsyncTask asyncTask4 = c.h.a.h.n.e.f17065g;
                if (asyncTask4 != null && asyncTask4.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    c.h.a.h.n.e.f17065g.cancel(true);
                }
                ((NSTEXOPlayerSkyTvActivity) r.this.f17586h).K2(((c.h.a.i.e) r.this.f17584f.get(this.f17594b)).b());
            }
            r.this.w();
        }
    }

    public class b extends Filter {
        public b() {
        }

        public /* synthetic */ b(r rVar, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = r.this.f17583e;
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
                r.this.f17584f = (ArrayList) filterResults.values;
                r.this.w();
                if (r.this.f17584f == null || r.this.f17584f.size() != 0) {
                    if (r.this.f17589k.equals("mobile")) {
                        if (r.this.f17586h instanceof NSTIJKPlayerSkyActivity) {
                            ((NSTIJKPlayerSkyActivity) r.this.f17586h).l2();
                        } else if (r.this.f17586h instanceof NSTEXOPlayerSkyActivity) {
                            ((NSTEXOPlayerSkyActivity) r.this.f17586h).z2();
                        }
                    } else if (r.this.f17586h instanceof NSTIJKPlayerSkyTvActivity) {
                        ((NSTIJKPlayerSkyTvActivity) r.this.f17586h).x2();
                    } else if (r.this.f17586h instanceof NSTEXOPlayerSkyTvActivity) {
                        ((NSTEXOPlayerSkyTvActivity) r.this.f17586h).B2();
                    }
                } else if (r.this.f17589k.equals("mobile")) {
                    if (r.this.f17586h instanceof NSTIJKPlayerSkyActivity) {
                        ((NSTIJKPlayerSkyActivity) r.this.f17586h).w2();
                    } else if (r.this.f17586h instanceof NSTEXOPlayerSkyActivity) {
                        ((NSTEXOPlayerSkyActivity) r.this.f17586h).O2();
                    }
                } else if (r.this.f17586h instanceof NSTIJKPlayerSkyTvActivity) {
                    ((NSTIJKPlayerSkyTvActivity) r.this.f17586h).G2();
                } else if (r.this.f17586h instanceof NSTEXOPlayerSkyTvActivity) {
                    ((NSTEXOPlayerSkyTvActivity) r.this.f17586h).N2();
                }
            } catch (Exception unused) {
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class c extends AsyncTask<f, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f17598a;

        public c(f fVar) {
            this.f17598a = fVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            return Integer.valueOf(c.h.a.i.q.m.f(r.this.f17586h).equals("m3u") ? r.this.f17593o.A1("live") : r.this.f17592n.equals("true") ? r.this.f17587i.s("radio_streams", c.h.a.i.q.m.z(r.this.f17586h)) : r.this.f17587i.s("live", c.h.a.i.q.m.z(r.this.f17586h)));
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f17598a.v.setText("0");
            } else {
                this.f17598a.v.setText(String.valueOf(num));
            }
            this.f17598a.v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17598a.v.setVisibility(8);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class d extends AsyncTask<f, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f17600a;

        public d(f fVar) {
            this.f17600a = fVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            try {
                return Integer.valueOf(r.this.f17593o.d2());
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f17600a.v.setText("0");
            } else {
                this.f17600a.v.setText(String.valueOf(num));
            }
            this.f17600a.v.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17600a.v.setVisibility(8);
        }
    }

    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f17603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17604d;

        public e(View view, f fVar, int i2) {
            this.f17604d = 0;
            this.f17602b = view;
            this.f17603c = fVar;
            this.f17604d = i2;
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            f fVar;
            TextView textView;
            if (!z || (fVar = this.f17603c) == null || (textView = fVar.u) == null) {
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

    public r(Context context, String str, String str2, String str3) {
        this.f17585g = "0";
        this.f17589k = "mobile";
        this.f17591m = BuildConfig.FLAVOR;
        this.f17592n = "false";
        this.f17586h = context;
        this.f17587i = new c.h.a.i.q.a(context);
        this.f17585g = str;
        this.f17591m = str2;
        this.f17593o = new c.h.a.i.q.f(context);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(context);
        this.p = aVar;
        if (aVar.A().equals(c.h.a.h.n.a.s0)) {
            this.f17589k = "tv";
        } else {
            this.f17589k = "mobile";
        }
        this.f17592n = str3;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f17588j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void F(@NotNull f fVar, int i2) {
        RelativeLayout relativeLayout;
        Drawable drawable;
        try {
            fVar.u.setText(this.f17584f.get(i2).c());
            if (this.f17584f.get(i2).b().equalsIgnoreCase("-1")) {
                p0(fVar);
            } else if (this.f17584f.get(i2).b().equalsIgnoreCase("-6")) {
                q0(fVar);
            } else {
                fVar.v.setText(String.valueOf(this.f17584f.get(i2).d()));
            }
            fVar.w.setOnClickListener(new a(i2, fVar));
            if (this.f17585g.equals(this.f17584f.get(i2).b())) {
                if (!this.f17590l) {
                    this.f17590l = true;
                    if (this.f17589k.equals("mobile")) {
                        Context context = this.f17586h;
                        if (context instanceof NSTIJKPlayerSkyActivity) {
                            ((NSTIJKPlayerSkyActivity) context).Q1(i2, this.f17584f.get(i2).b(), this.f17584f.get(i2).c());
                        } else if (context instanceof NSTEXOPlayerSkyActivity) {
                            ((NSTEXOPlayerSkyActivity) context).d2(i2, this.f17584f.get(i2).b(), this.f17584f.get(i2).c());
                        }
                    } else {
                        Context context2 = this.f17586h;
                        if (context2 instanceof NSTIJKPlayerSkyTvActivity) {
                            ((NSTIJKPlayerSkyTvActivity) context2).a2(i2, this.f17584f.get(i2).b(), this.f17584f.get(i2).c());
                        } else if (context2 instanceof NSTEXOPlayerSkyTvActivity) {
                            ((NSTEXOPlayerSkyTvActivity) context2).e2(i2, this.f17584f.get(i2).b(), this.f17584f.get(i2).c());
                        }
                    }
                }
                if (this.f17589k.equals("mobile")) {
                    Context context3 = this.f17586h;
                    if (context3 instanceof NSTIJKPlayerSkyActivity) {
                        ((NSTIJKPlayerSkyActivity) context3).E3 = this.f17585g;
                    } else if (context3 instanceof NSTEXOPlayerSkyActivity) {
                        ((NSTEXOPlayerSkyActivity) context3).F3 = this.f17585g;
                    }
                } else {
                    Context context4 = this.f17586h;
                    if (context4 instanceof NSTIJKPlayerSkyTvActivity) {
                        ((NSTIJKPlayerSkyTvActivity) context4).m3 = this.f17585g;
                    } else if (context4 instanceof NSTEXOPlayerSkyTvActivity) {
                        ((NSTEXOPlayerSkyTvActivity) context4).n3 = this.f17585g;
                    }
                }
                relativeLayout = fVar.w;
                drawable = this.f17586h.getResources().getDrawable(R.color.hp_cyan);
            } else {
                relativeLayout = fVar.w;
                drawable = this.f17586h.getResources().getDrawable(R.drawable.left_recycler_sidebar_tv);
            }
            relativeLayout.setBackground(drawable);
            RelativeLayout relativeLayout2 = fVar.w;
            relativeLayout2.setOnFocusChangeListener(new e(relativeLayout2, fVar, i2));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        ArrayList<c.h.a.i.e> arrayList = this.f17584f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public f H(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        if (this.f17591m.equals("player")) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.player_live_all_data_left_cat_adapter_player;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.player_live_all_data_left_cat_adapter;
        }
        return new f(layoutInflaterFrom.inflate(i3, viewGroup, false));
    }

    public final void p0(f fVar) {
        new c(fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }

    public final void q0(f fVar) {
        new d(fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }
}
