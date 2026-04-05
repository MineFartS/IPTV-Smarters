package minefarts.iptvsmarters.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.q.i;
import c.h.a.i.q.m;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class MultiPlayerCategoriesAdapter extends RecyclerView.h<MyViewHolder> {
    public MultiPlayerChannelsAdapter A;
    public GridLayoutManager B;
    public TextView C;
    public TextView D;
    public c.h.a.k.f.g E;
    public PopupWindow F;
    public ArrayList<c.h.a.i.f> G;
    public ArrayList<c.h.a.i.f> H;
    public ArrayList<i> J;
    public ArrayList<c.h.a.i.c> K;
    public ArrayList<c.h.a.i.b> L;
    public c.h.a.i.q.a M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<c.h.a.i.e> f27533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f27534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<c.h.a.i.e> f27535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<c.h.a.i.e> f27536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.f f27537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.a f27538j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f27543o;
    public ProgressBar p;
    public RelativeLayout q;
    public AppBarLayout s;
    public PopupWindow t;
    public ArrayList<c.h.a.i.f> v;
    public ArrayList<c.h.a.i.f> w;
    public ArrayList<c.h.a.i.f> x;
    public ArrayList<c.h.a.i.f> y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27539k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f27540l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AsyncTask f27541m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27542n = 0;
    public AsyncTask r = null;
    public AsyncTask u = null;
    public String z = BuildConfig.FLAVOR;
    public ArrayList<String> I = new ArrayList<>();

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public ImageView iv_foraward_arrow;

        @BindView
        public ProgressBar pbPagingLoader;

        @BindView
        public RelativeLayout rlListOfCategories;

        @BindView
        public RelativeLayout rlOuter;

        @BindView
        public RelativeLayout testing;

        @BindView
        public TextView tvMovieCategoryName;

        @BindView
        public TextView tvXubCount;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f27544b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27544b = myViewHolder;
            myViewHolder.tvMovieCategoryName = (TextView) b.c.c.c(view, R.id.tv_movie_category_name, "field 'tvMovieCategoryName'", TextView.class);
            myViewHolder.pbPagingLoader = (ProgressBar) b.c.c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
            myViewHolder.rlOuter = (RelativeLayout) b.c.c.c(view, R.id.rl_outer, "field 'rlOuter'", RelativeLayout.class);
            myViewHolder.rlListOfCategories = (RelativeLayout) b.c.c.c(view, R.id.rl_list_of_categories, "field 'rlListOfCategories'", RelativeLayout.class);
            myViewHolder.testing = (RelativeLayout) b.c.c.c(view, R.id.testing, "field 'testing'", RelativeLayout.class);
            myViewHolder.tvXubCount = (TextView) b.c.c.c(view, R.id.tv_sub_cat_count, "field 'tvXubCount'", TextView.class);
            myViewHolder.iv_foraward_arrow = (ImageView) b.c.c.c(view, R.id.iv_foraward_arrow, "field 'iv_foraward_arrow'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f27544b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27544b = null;
            myViewHolder.tvMovieCategoryName = null;
            myViewHolder.pbPagingLoader = null;
            myViewHolder.rlOuter = null;
            myViewHolder.rlListOfCategories = null;
            myViewHolder.testing = null;
            myViewHolder.tvXubCount = null;
            myViewHolder.iv_foraward_arrow = null;
        }
    }

    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f27545b;

        public a(RecyclerView recyclerView) {
            this.f27545b = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter;
            int i3;
            RecyclerView.p layoutManager = this.f27545b.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i2 == 20) {
                multiPlayerCategoriesAdapter = MultiPlayerCategoriesAdapter.this;
                i3 = 1;
            } else {
                if (i2 != 19) {
                    return false;
                }
                multiPlayerCategoriesAdapter = MultiPlayerCategoriesAdapter.this;
                i3 = -1;
            }
            return multiPlayerCategoriesAdapter.I0(layoutManager, i3);
        }
    }

    public class b implements Comparator<c.h.a.i.e> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c.h.a.i.e eVar, c.h.a.i.e eVar2) {
            return eVar.c().compareTo(eVar2.c());
        }
    }

    public class c implements Comparator<c.h.a.i.e> {
        public c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c.h.a.i.e eVar, c.h.a.i.e eVar2) {
            return eVar2.c().compareTo(eVar.c());
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27550c;

        public d(MyViewHolder myViewHolder, String str) {
            this.f27549b = myViewHolder;
            this.f27550c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiPlayerCategoriesAdapter.this.f27542n = this.f27549b.r();
            MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter = MultiPlayerCategoriesAdapter.this;
            multiPlayerCategoriesAdapter.u0(multiPlayerCategoriesAdapter.f27534f, view, this.f27550c);
        }
    }

    public class e implements PopupWindow.OnDismissListener {
        public e() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class f extends AsyncTask<MyViewHolder, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MyViewHolder f27553a;

        public f(MyViewHolder myViewHolder) {
            this.f27553a = myViewHolder;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(MyViewHolder... myViewHolderArr) {
            try {
                return m.f(MultiPlayerCategoriesAdapter.this.f27534f).equals("m3u") ? Integer.valueOf(MultiPlayerCategoriesAdapter.this.f27537i.A1("live")) : Integer.valueOf(MultiPlayerCategoriesAdapter.this.f27538j.s("live", m.z(MultiPlayerCategoriesAdapter.this.f27534f)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f27553a.tvXubCount.setText("0");
            } else {
                this.f27553a.tvXubCount.setText(String.valueOf(num));
            }
            this.f27553a.tvXubCount.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f27553a.tvXubCount.setVisibility(8);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class g extends AsyncTask<String, Void, String> {
        public g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r0 = 0
                r7 = r7[r0]     // Catch: java.lang.Exception -> L55
                r1 = -1
                int r2 = r7.hashCode()     // Catch: java.lang.Exception -> L55
                r3 = -74797390(0xfffffffffb8aaeb2, float:-1.4401604E36)
                r4 = 2
                r5 = 1
                if (r2 == r3) goto L2d
                r3 = 47612238(0x2d6814e, float:3.1518691E-37)
                if (r2 == r3) goto L23
                r3 = 613425326(0x249020ae, float:6.2505407E-17)
                if (r2 == r3) goto L1a
                goto L37
            L1a:
                java.lang.String r2 = "all_channels"
                boolean r7 = r7.equals(r2)     // Catch: java.lang.Exception -> L55
                if (r7 == 0) goto L37
                goto L38
            L23:
                java.lang.String r0 = "all_channels_with_cat"
                boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L55
                if (r7 == 0) goto L37
                r0 = 1
                goto L38
            L2d:
                java.lang.String r0 = "get_fav"
                boolean r7 = r7.equals(r0)     // Catch: java.lang.Exception -> L55
                if (r7 == 0) goto L37
                r0 = 2
                goto L38
            L37:
                r0 = -1
            L38:
                if (r0 == 0) goto L4e
                if (r0 == r5) goto L47
                if (r0 == r4) goto L40
                r7 = 0
                return r7
            L40:
                minefarts.iptvsmarters.view.adapter.MultiPlayerCategoriesAdapter r7 = minefarts.iptvsmarters.view.adapter.MultiPlayerCategoriesAdapter.this     // Catch: java.lang.Exception -> L55
                java.lang.String r7 = r7.x0()     // Catch: java.lang.Exception -> L55
                return r7
            L47:
                minefarts.iptvsmarters.view.adapter.MultiPlayerCategoriesAdapter r7 = minefarts.iptvsmarters.view.adapter.MultiPlayerCategoriesAdapter.this     // Catch: java.lang.Exception -> L55
                java.lang.String r7 = minefarts.iptvsmarters.view.adapter.MultiPlayerCategoriesAdapter.l0(r7)     // Catch: java.lang.Exception -> L55
                return r7
            L4e:
                minefarts.iptvsmarters.view.adapter.MultiPlayerCategoriesAdapter r7 = minefarts.iptvsmarters.view.adapter.MultiPlayerCategoriesAdapter.this     // Catch: java.lang.Exception -> L55
                java.lang.String r7 = minefarts.iptvsmarters.view.adapter.MultiPlayerCategoriesAdapter.i0(r7)     // Catch: java.lang.Exception -> L55
                return r7
            L55:
                java.lang.String r7 = "error"
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.MultiPlayerCategoriesAdapter.g.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (MultiPlayerCategoriesAdapter.this.v == null || MultiPlayerCategoriesAdapter.this.v.size() == 0) {
                    ProgressBar progressBar = MultiPlayerCategoriesAdapter.this.p;
                    if (progressBar != null) {
                        progressBar.setVisibility(4);
                        MultiPlayerCategoriesAdapter.this.D.setVisibility(0);
                    }
                } else {
                    MultiPlayerCategoriesAdapter multiPlayerCategoriesAdapter = MultiPlayerCategoriesAdapter.this;
                    multiPlayerCategoriesAdapter.H0(multiPlayerCategoriesAdapter.v);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27556b;

        public h(View view) {
            this.f27556b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27556b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27556b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27556b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            View view2;
            int i2;
            if (z) {
                b(1.09f);
                c(1.09f);
                Log.e("id is", BuildConfig.FLAVOR + this.f27556b.getTag());
                view2 = this.f27556b;
                i2 = R.drawable.shape_list_categories_focused;
            } else {
                if (z) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(false);
                view2 = this.f27556b;
                i2 = R.drawable.shape_list_categories;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public MultiPlayerCategoriesAdapter(List<c.h.a.i.e> list, Context context, c.h.a.k.f.g gVar, PopupWindow popupWindow, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f27535g = arrayList;
        arrayList.addAll(list);
        this.f27536h = list;
        this.f27533e = list;
        this.f27534f = context;
        this.f27537i = new c.h.a.i.q.f(context);
        this.f27538j = new c.h.a.i.q.a(context);
        this.v = new ArrayList<>();
        this.w = new ArrayList<>();
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
        this.E = gVar;
        this.F = popupWindow;
        this.M = new c.h.a.i.q.a(context);
        String strJ = m.j(context);
        if (strJ.equals("1")) {
            Collections.sort(list, new b());
        }
        if (strJ.equals("2")) {
            Collections.sort(list, new c());
        }
    }

    public final ArrayList<c.h.a.i.b> A0(ArrayList<c.h.a.i.b> arrayList, ArrayList<String> arrayList2) {
        try {
            this.L = new ArrayList<>();
            for (c.h.a.i.b bVar : arrayList) {
                boolean z = false;
                Iterator<String> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (bVar.a().equals(it.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    this.L.add(bVar);
                }
            }
        } catch (Exception unused) {
        }
        return this.L;
    }

    public final ArrayList<c.h.a.i.c> B0(ArrayList<c.h.a.i.c> arrayList, ArrayList<String> arrayList2) {
        this.K = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
        try {
            for (c.h.a.i.c cVar : arrayList) {
                boolean z = false;
                if (arrayList2 != null) {
                    Iterator<String> it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (cVar.a().equals(it.next())) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        this.K.add(cVar);
                    }
                }
            }
            return this.K;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        c.h.a.i.e eVar = this.f27533e.get(i2);
        String strC = eVar.c();
        String strB = eVar.b();
        Bundle bundle = new Bundle();
        bundle.putString("category_id", strB);
        bundle.putString("category_name", strC);
        if (strC != null && !strC.equals(BuildConfig.FLAVOR) && !strC.isEmpty()) {
            myViewHolder.tvMovieCategoryName.setText(strC);
        }
        if (m.f(this.f27534f).equals("m3u")) {
            if (eVar.b().equals("-1")) {
                G0(myViewHolder);
            } else {
                myViewHolder.tvXubCount.setText(String.valueOf(eVar.d()));
            }
            if (strB.equals("0")) {
                this.f27540l = eVar.d();
            }
        } else {
            if (eVar.b().equals("-1")) {
                G0(myViewHolder);
            } else {
                myViewHolder.tvXubCount.setText(String.valueOf(eVar.d()));
            }
            if (strB.equals("0")) {
                int iQ1 = this.f27537i.Q1("live");
                if (iQ1 == 0 || iQ1 == -1) {
                    myViewHolder.tvXubCount.setText(BuildConfig.FLAVOR);
                } else {
                    myViewHolder.tvXubCount.setText(String.valueOf(iQ1));
                }
            }
        }
        if (new c.h.a.k.d.a.a(this.f27534f).A().equals(c.h.a.h.n.a.s0) && i2 == this.f27542n) {
            myViewHolder.rlOuter.requestFocus();
            E0(1.09f, myViewHolder.rlOuter);
            F0(1.09f, myViewHolder.rlOuter);
            myViewHolder.rlOuter.setBackgroundResource(R.drawable.shape_list_categories_focused);
        }
        myViewHolder.rlOuter.setOnClickListener(new d(myViewHolder, strB));
        RelativeLayout relativeLayout = myViewHolder.rlOuter;
        relativeLayout.setOnFocusChangeListener(new h(relativeLayout));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_live_new_flow_list_item, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_foraward_arrow);
        if (m.t(this.f27534f).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(R.drawable.left_icon_cat);
        }
        return new MyViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void E(RecyclerView recyclerView) {
        super.E(recyclerView);
        recyclerView.setOnKeyListener(new a(recyclerView));
    }

    public final void E0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void F0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void G0(MyViewHolder myViewHolder) {
        new f(myViewHolder).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, myViewHolder);
    }

    public final void H0(ArrayList<c.h.a.i.f> arrayList) {
        this.A = new MultiPlayerChannelsAdapter(arrayList, this.f27534f, this.t, this.E, this.F);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f27534f, 1);
        this.B = gridLayoutManager;
        this.f27543o.setLayoutManager(gridLayoutManager);
        this.f27543o.setItemAnimator(new a.y.e.c());
        this.f27543o.setAdapter(this.A);
        ProgressBar progressBar = this.p;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    public final boolean I0(RecyclerView.p pVar, int i2) {
        int i3 = this.f27542n + i2;
        if (i3 < 0 || i3 >= o()) {
            return false;
        }
        y(this.f27542n);
        this.f27542n = i3;
        y(i3);
        pVar.A1(this.f27542n);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27533e.size();
    }

    public void p0() {
        v0();
        this.u = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }

    public final String q0() {
        try {
            ArrayList<c.h.a.i.f> arrayList = this.v;
            if (arrayList != null && this.w != null) {
                arrayList.clear();
                this.w.clear();
            }
            int iI1 = this.f27537i.I1(m.z(this.f27534f));
            ArrayList<c.h.a.i.f> arrayListW0 = this.f27537i.W0("0", "live");
            this.H = arrayListW0;
            if (iI1 <= 0 || arrayListW0 == null) {
                this.v = arrayListW0;
                return "all_channels";
            }
            ArrayList<String> arrayList2 = this.I;
            if (arrayList2 != null) {
                this.x = z0(arrayListW0, arrayList2);
            }
            this.v = this.x;
            return "all_channels";
        } catch (Exception unused) {
            return "all_channels";
        }
    }

    public void r0() {
        v0();
        this.u = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    public final String s0() {
        try {
            ArrayList<c.h.a.i.f> arrayList = this.v;
            if (arrayList != null && this.w != null) {
                arrayList.clear();
                this.w.clear();
            }
            c.h.a.i.q.f fVar = this.f27537i;
            if (fVar != null) {
                this.y = fVar.W0(this.z, "live");
            }
            this.v = this.y;
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    public void t0() {
        v0();
        this.u = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    @SuppressLint({"ResourceType"})
    public final void u0(Context context, View view, String str) {
        this.z = str;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.categories_popup, (LinearLayout) view.findViewById(R.id.ll_root));
        this.p = (ProgressBar) viewInflate.findViewById(R.id.pb_loader);
        this.f27543o = (RecyclerView) viewInflate.findViewById(R.id.my_recycler_view);
        this.q = (RelativeLayout) viewInflate.findViewById(R.id.rl_no_arrangement_found);
        this.s = (AppBarLayout) viewInflate.findViewById(R.id.appbar_toolbar);
        this.C = (TextView) viewInflate.findViewById(R.id.tv_settings);
        this.D = (TextView) viewInflate.findViewById(R.id.no_record);
        this.C.setText(context.getResources().getString(R.string.live_channels));
        PopupWindow popupWindow = new PopupWindow(context);
        this.t = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.t.setWidth(-1);
        this.t.setHeight(-1);
        this.t.setFocusable(true);
        this.t.setOnDismissListener(new e());
        ProgressBar progressBar = this.p;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        AppBarLayout appBarLayout = this.s;
        if (appBarLayout != null) {
            appBarLayout.setBackground(context.getResources().getDrawable(R.color.trasparent_light));
        }
        this.I = y0();
        String str2 = this.z;
        if (str2 == null || str2.equals(BuildConfig.FLAVOR) || !this.z.equals("0")) {
            String str3 = this.z;
            if (str3 == null || str3.equals(BuildConfig.FLAVOR) || !this.z.equals("-1")) {
                r0();
            } else {
                t0();
            }
        } else {
            p0();
        }
        this.t.showAtLocation(viewInflate, 1, 0, 0);
    }

    public final void v0() {
        AsyncTask asyncTask = this.u;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            m.K(0, this.f27534f);
        } else {
            m.K(1, this.f27534f);
            this.u.cancel(true);
        }
    }

    public void w0() {
        ArrayList<c.h.a.i.f> arrayList;
        try {
            if (m.f(this.f27534f).equals("m3u")) {
                new ArrayList();
                c.h.a.i.q.f fVar = this.f27537i;
                if (fVar == null) {
                    return;
                }
                ArrayList<c.h.a.i.c> arrayListB1 = fVar.B1("live");
                arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = this.I;
                if (arrayList2 != null && arrayList2.size() > 0 && arrayListB1 != null && arrayListB1.size() > 0) {
                    arrayListB1 = B0(arrayListB1, this.I);
                }
                for (c.h.a.i.c cVar : arrayListB1) {
                    ArrayList<c.h.a.i.f> arrayListF1 = this.f27537i.F1(cVar.a(), cVar.c());
                    if (arrayListF1 != null && arrayListF1.size() > 0) {
                        arrayList.add(arrayListF1.get(0));
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
            } else {
                new ArrayList();
                c.h.a.i.q.a aVar = this.M;
                if (aVar == null) {
                    return;
                }
                ArrayList<c.h.a.i.b> arrayListP = aVar.p("live", m.z(this.f27534f));
                arrayList = new ArrayList<>();
                ArrayList<String> arrayList3 = this.I;
                if (arrayList3 != null && arrayList3.size() > 0 && arrayListP != null && arrayListP.size() > 0) {
                    arrayListP = A0(arrayListP, this.I);
                }
                for (c.h.a.i.b bVar : arrayListP) {
                    c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f27534f).D1(bVar.a(), String.valueOf(bVar.e()));
                    if (fVarD1 != null) {
                        arrayList.add(fVarD1);
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
            }
            this.G = arrayList;
        } catch (Exception unused) {
        }
    }

    public String x0() {
        try {
            ArrayList<c.h.a.i.f> arrayList = this.v;
            if (arrayList != null && this.w != null) {
                arrayList.clear();
                this.w.clear();
            }
            this.G = new ArrayList<>();
            w0();
            this.v = this.G;
            return "get_fav";
        } catch (Exception unused) {
            return "get_fav";
        }
    }

    public final ArrayList<String> y0() {
        ArrayList<i> arrayListD1 = this.f27537i.d1(m.z(this.f27534f));
        this.J = arrayListD1;
        if (arrayListD1 != null) {
            for (i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.I.add(iVar.b());
                }
            }
        }
        return this.I;
    }

    public final ArrayList<c.h.a.i.f> z0(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
        try {
            for (c.h.a.i.f fVar : arrayList) {
                boolean z = false;
                Iterator<String> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (fVar.g().equals(it.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    this.w.add(fVar);
                }
            }
        } catch (Exception unused) {
        }
        return this.w;
    }
}
