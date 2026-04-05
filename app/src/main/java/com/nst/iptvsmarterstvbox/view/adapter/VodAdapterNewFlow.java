package minefarts.iptvsmarters.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.q.k;
import c.h.a.k.b.m;
import c.h.a.k.b.n;
import com.facebook.ads.NativeAd;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.activity.VodActivityNewFlowSubCategories;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class VodAdapterNewFlow extends RecyclerView.h<RecyclerView.e0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Object> f28459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f28460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.i.q.f f28461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<Object> f28462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Object> f28463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.a f28466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f28468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f28469o;
    public int p;
    public int q;

    public static class ViewHolder extends RecyclerView.e0 {

        @BindView
        public ImageView ivForawardArrow;

        @BindView
        public ImageView ivTvIcon;

        @BindView
        public ProgressBar pbPagingLoader;

        @BindView
        public RelativeLayout rlListOfCategories;

        @BindView
        public RelativeLayout rlOuter;

        @BindView
        public TextView tvMovieCategoryName;

        @BindView
        public TextView tvXubCount;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewHolder f28470b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f28470b = viewHolder;
            viewHolder.ivTvIcon = (ImageView) b.c.c.c(view, R.id.iv_tv_icon, "field 'ivTvIcon'", ImageView.class);
            viewHolder.tvMovieCategoryName = (TextView) b.c.c.c(view, R.id.tv_movie_category_name, "field 'tvMovieCategoryName'", TextView.class);
            viewHolder.ivForawardArrow = (ImageView) b.c.c.c(view, R.id.iv_foraward_arrow, "field 'ivForawardArrow'", ImageView.class);
            viewHolder.pbPagingLoader = (ProgressBar) b.c.c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
            viewHolder.rlListOfCategories = (RelativeLayout) b.c.c.c(view, R.id.rl_list_of_categories, "field 'rlListOfCategories'", RelativeLayout.class);
            viewHolder.rlOuter = (RelativeLayout) b.c.c.c(view, R.id.rl_outer, "field 'rlOuter'", RelativeLayout.class);
            viewHolder.tvXubCount = (TextView) b.c.c.c(view, R.id.tv_sub_cat_count, "field 'tvXubCount'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ViewHolder viewHolder = this.f28470b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f28470b = null;
            viewHolder.ivTvIcon = null;
            viewHolder.tvMovieCategoryName = null;
            viewHolder.ivForawardArrow = null;
            viewHolder.pbPagingLoader = null;
            viewHolder.rlListOfCategories = null;
            viewHolder.rlOuter = null;
            viewHolder.tvXubCount = null;
        }
    }

    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f28471b;

        public a(RecyclerView recyclerView) {
            this.f28471b = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            VodAdapterNewFlow vodAdapterNewFlow;
            int i3;
            RecyclerView.p layoutManager = this.f28471b.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i2 == 20) {
                vodAdapterNewFlow = VodAdapterNewFlow.this;
                i3 = 1;
            } else {
                if (i2 != 19) {
                    return false;
                }
                vodAdapterNewFlow = VodAdapterNewFlow.this;
                i3 = -1;
            }
            return vodAdapterNewFlow.t0(layoutManager, i3);
        }
    }

    public class b implements Comparator<Object> {
        public b() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            try {
                return ((m) obj).b().compareTo(((m) obj2).b());
            } catch (Exception unused) {
                return -1;
            }
        }
    }

    public class c implements Comparator<Object> {
        public c() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            try {
                return ((m) obj2).b().compareTo(((m) obj).b());
            } catch (Exception unused) {
                return -1;
            }
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f28475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28477d;

        public d(RecyclerView.e0 e0Var, String str, String str2) {
            this.f28475b = e0Var;
            this.f28476c = str;
            this.f28477d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodAdapterNewFlow.this.q = this.f28475b.r();
            Intent intent = new Intent(VodAdapterNewFlow.this.f28460f, (Class<?>) VodActivityNewFlowSubCategories.class);
            intent.putExtra("category_id", this.f28476c);
            intent.putExtra("category_name", this.f28477d);
            VodAdapterNewFlow.this.f28460f.startActivity(intent);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f28480c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                VodAdapterNewFlow vodAdapterNewFlow;
                List list;
                if (!TextUtils.isEmpty(e.this.f28479b)) {
                    if (!VodAdapterNewFlow.this.f28462h.isEmpty() || VodAdapterNewFlow.this.f28462h.isEmpty()) {
                        vodAdapterNewFlow = VodAdapterNewFlow.this;
                        list = vodAdapterNewFlow.f28462h;
                    }
                    if (VodAdapterNewFlow.this.f28459e != null && VodAdapterNewFlow.this.f28459e.size() == 0) {
                        e.this.f28480c.setVisibility(0);
                        e eVar = e.this;
                        eVar.f28480c.setText(VodAdapterNewFlow.this.f28460f.getResources().getString(R.string.no_record_found));
                    }
                    VodAdapterNewFlow vodAdapterNewFlow2 = VodAdapterNewFlow.this;
                    vodAdapterNewFlow2.f28464j = vodAdapterNewFlow2.f28465k;
                    vodAdapterNewFlow2.w();
                }
                vodAdapterNewFlow = VodAdapterNewFlow.this;
                list = vodAdapterNewFlow.f28463i;
                vodAdapterNewFlow.f28459e = list;
                if (VodAdapterNewFlow.this.f28459e != null) {
                    e.this.f28480c.setVisibility(0);
                    e eVar2 = e.this;
                    eVar2.f28480c.setText(VodAdapterNewFlow.this.f28460f.getResources().getString(R.string.no_record_found));
                }
                VodAdapterNewFlow vodAdapterNewFlow22 = VodAdapterNewFlow.this;
                vodAdapterNewFlow22.f28464j = vodAdapterNewFlow22.f28465k;
                vodAdapterNewFlow22.w();
            }
        }

        public e(String str, TextView textView) {
            this.f28479b = str;
            this.f28480c = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.g0(r0, r1)
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.lang.String r1 = r4.f28479b
                int r1 = r1.length()
                r0.f28465k = r1
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.e0(r0)
                if (r0 == 0) goto L25
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.e0(r0)
                r0.clear()
            L25:
                java.lang.String r0 = r4.f28479b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L3d
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.e0(r0)
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r1 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.util.List r1 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.h0(r1)
                r0.addAll(r1)
                goto La3
            L3d:
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.i0(r0)
                if (r0 == 0) goto L51
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.i0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L59
            L51:
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                int r1 = r0.f28464j
                int r0 = r0.f28465k
                if (r1 <= r0) goto L62
            L59:
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.util.List r1 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.h0(r0)
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.l0(r0, r1)
            L62:
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.i0(r0)
                if (r0 == 0) goto La3
                r0 = 0
            L6b:
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r1 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                java.util.List r1 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.i0(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto La3
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r1 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this     // Catch: java.lang.Exception -> La0
                java.util.List r1 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.i0(r1)     // Catch: java.lang.Exception -> La0
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> La0
                c.h.a.k.b.m r1 = (c.h.a.k.b.m) r1     // Catch: java.lang.Exception -> La0
                java.lang.String r2 = r1.b()     // Catch: java.lang.Exception -> La0
                java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> La0
                java.lang.String r3 = r4.f28479b     // Catch: java.lang.Exception -> La0
                java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> La0
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> La0
                if (r2 == 0) goto La0
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r2 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this     // Catch: java.lang.Exception -> La0
                java.util.List r2 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.e0(r2)     // Catch: java.lang.Exception -> La0
                r2.add(r1)     // Catch: java.lang.Exception -> La0
            La0:
                int r0 = r0 + 1
                goto L6b
            La3:
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.this
                android.content.Context r0 = minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.c0(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow$e$a r1 = new minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow$e$a
                r1.<init>()
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.e.run():void");
        }
    }

    public class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f28483b;

        public f(View view) {
            this.f28483b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28483b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28483b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28483b, "scaleY", f2);
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
                Log.e("id is", BuildConfig.FLAVOR + this.f28483b.getTag());
                view2 = this.f28483b;
                i2 = R.drawable.shape_list_categories_focused;
            } else {
                if (z) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(false);
                view2 = this.f28483b;
                i2 = R.drawable.shape_list_categories;
            }
            view2.setBackgroundResource(i2);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class g extends AsyncTask<ViewHolder, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewHolder f28485a;

        public g(ViewHolder viewHolder) {
            this.f28485a = viewHolder;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(ViewHolder... viewHolderArr) {
            try {
                return c.h.a.i.q.m.f(VodAdapterNewFlow.this.f28460f).equals("m3u") ? Integer.valueOf(VodAdapterNewFlow.this.f28461g.A1("movie")) : Integer.valueOf(VodAdapterNewFlow.this.f28466l.s("vod", c.h.a.i.q.m.z(VodAdapterNewFlow.this.f28460f)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f28485a.tvXubCount.setText("0");
            } else {
                this.f28485a.tvXubCount.setText(String.valueOf(num));
            }
            this.f28485a.tvXubCount.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f28485a.tvXubCount.setVisibility(8);
        }
    }

    public VodAdapterNewFlow() {
        this.f28467m = -1;
        this.f28469o = BuildConfig.FLAVOR;
        this.p = 0;
        this.q = 0;
    }

    public VodAdapterNewFlow(List<Object> list, Context context) {
        this.f28467m = -1;
        this.f28469o = BuildConfig.FLAVOR;
        this.p = 0;
        this.q = 0;
        ArrayList arrayList = new ArrayList();
        this.f28462h = arrayList;
        arrayList.addAll(list);
        this.f28463i = list;
        this.f28459e = list;
        this.f28460f = context;
        this.f28461g = new c.h.a.i.q.f(context);
        this.f28466l = new c.h.a.i.q.a(context);
        this.f28467m = c.h.a.i.q.m.z(context);
        this.f28468n = new k(context);
        String strF = c.h.a.i.q.m.F(context);
        if (strF.equals("1")) {
            Collections.sort(list, new b());
        }
        if (strF.equals("2")) {
            Collections.sort(list, new c());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void E(RecyclerView recyclerView) {
        super.E(recyclerView);
        recyclerView.setOnKeyListener(new a(recyclerView));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012e, code lost:
    
        if (r12 != (-1)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014a, code lost:
    
        if (r12 != (-1)) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    @android.annotation.SuppressLint({"RecyclerView"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(androidx.recyclerview.widget.RecyclerView.e0 r12, int r13) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 H(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_unified_fb, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_vod_new_flow_list_item, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_foraward_arrow);
        if (this.f28469o.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(R.drawable.left_icon_cat);
        }
        return new ViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f28459e.size();
    }

    public void o0(String str, TextView textView) {
        new Thread(new e(str, textView)).start();
    }

    public final void p0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void q0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return this.f28459e.get(i2) instanceof NativeAd ? 1 : 0;
    }

    public final void r0(ViewHolder viewHolder) {
        new g(viewHolder).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, viewHolder);
    }

    public void s0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final boolean t0(RecyclerView.p pVar, int i2) {
        int i3 = this.q + i2;
        if (i3 < 0 || i3 >= o()) {
            return false;
        }
        y(this.q);
        this.q = i3;
        y(i3);
        pVar.A1(this.q);
        return true;
    }
}
