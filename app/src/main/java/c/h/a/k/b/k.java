package c.h.a.k.b;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.NativeAd;
import minefarts.iptvsmarters.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class k extends RecyclerView.h<RecyclerView.e0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Object> f17520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f17521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<Object> f17522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<Object> f17523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f17526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.a f17527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17528m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17529n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AsyncTask f17530o = null;
    public int p = 0;

    public class a implements Comparator<Object> {
        public a() {
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

    public class b implements Comparator<Object> {
        public b() {
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

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f17533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f17535d;

        public c(g gVar, String str, String str2) {
            this.f17533b = gVar;
            this.f17534c = str;
            this.f17535d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k.this.p = this.f17533b.r();
            c.h.a.h.n.e.X(k.this.f17521f, "Built-in Player ( Default )", -1, "live", 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, this.f17534c, BuildConfig.FLAVOR, this.f17535d);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f17538c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k kVar;
                List list;
                if (!TextUtils.isEmpty(d.this.f17537b)) {
                    if (!k.this.f17522g.isEmpty() || k.this.f17522g.isEmpty()) {
                        kVar = k.this;
                        list = kVar.f17522g;
                    }
                    if (k.this.f17520e != null && k.this.f17520e.size() == 0) {
                        d.this.f17538c.setVisibility(0);
                    }
                    k kVar2 = k.this;
                    kVar2.f17524i = kVar2.f17525j;
                    k.this.w();
                }
                kVar = k.this;
                list = kVar.f17523h;
                kVar.f17520e = list;
                if (k.this.f17520e != null) {
                    d.this.f17538c.setVisibility(0);
                }
                k kVar22 = k.this;
                kVar22.f17524i = kVar22.f17525j;
                k.this.w();
            }
        }

        public d(String str, TextView textView) {
            this.f17537b = str;
            this.f17538c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f17522g = new ArrayList();
            k.this.f17525j = this.f17537b.length();
            if (k.this.f17522g != null) {
                k.this.f17522g.clear();
            }
            if (TextUtils.isEmpty(this.f17537b)) {
                k.this.f17522g.addAll(k.this.f17523h);
            } else {
                if ((k.this.f17520e != null && k.this.f17520e.size() == 0) || k.this.f17524i > k.this.f17525j) {
                    k kVar = k.this;
                    kVar.f17520e = kVar.f17523h;
                }
                if (k.this.f17520e != null) {
                    for (int i2 = 0; i2 < k.this.f17520e.size(); i2++) {
                        try {
                            m mVar = (m) k.this.f17520e.get(i2);
                            if (mVar.b().toLowerCase().contains(this.f17537b.toLowerCase())) {
                                k.this.f17522g.add(mVar);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            ((Activity) k.this.f17521f).runOnUiThread(new a());
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class e extends AsyncTask<g, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f17541a;

        public e(g gVar) {
            this.f17541a = gVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(g... gVarArr) {
            try {
                return c.h.a.i.q.m.f(k.this.f17521f).equals("m3u") ? Integer.valueOf(k.this.f17526k.A1("live")) : Integer.valueOf(k.this.f17527l.s("live", c.h.a.i.q.m.z(k.this.f17521f)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f17541a.z.setText("0");
            } else {
                this.f17541a.z.setText(String.valueOf(num));
            }
            this.f17541a.z.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17541a.z.setVisibility(8);
        }
    }

    public class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17543b;

        public f(View view) {
            this.f17543b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17543b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17543b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17543b, "scaleY", f2);
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
                Log.e("id is", BuildConfig.FLAVOR + this.f17543b.getTag());
                view2 = this.f17543b;
                i2 = R.drawable.shape_list_categories_focused;
            } else {
                if (z) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(false);
                view2 = this.f17543b;
                i2 = R.drawable.shape_list_categories;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public static class g extends RecyclerView.e0 {
        public ImageView A;
        public TextView u;
        public ProgressBar v;
        public RelativeLayout w;
        public RelativeLayout x;
        public RelativeLayout y;
        public TextView z;

        public g(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.tv_movie_category_name);
            this.v = (ProgressBar) view.findViewById(R.id.pb_paging_loader);
            this.w = (RelativeLayout) view.findViewById(R.id.rl_outer);
            this.y = (RelativeLayout) view.findViewById(R.id.testing);
            this.x = (RelativeLayout) view.findViewById(R.id.rl_list_of_categories);
            this.z = (TextView) view.findViewById(R.id.tv_sub_cat_count);
            this.A = (ImageView) view.findViewById(R.id.iv_foraward_arrow);
            L(false);
        }
    }

    public k(List<Object> list, Context context) {
        ArrayList arrayList = new ArrayList();
        this.f17522g = arrayList;
        arrayList.addAll(list);
        this.f17523h = list;
        this.f17520e = list;
        this.f17521f = context;
        this.f17526k = new c.h.a.i.q.f(context);
        this.f17527l = new c.h.a.i.q.a(context);
        String strJ = c.h.a.i.q.m.j(context);
        if (strJ.equals("1")) {
            Collections.sort(list, new a());
        }
        if (strJ.equals("2")) {
            Collections.sort(list, new b());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void F(RecyclerView.e0 e0Var, @SuppressLint({"RecyclerView"}) int i2) {
        try {
            if (r(i2) == 1) {
                n nVar = (n) e0Var;
                NativeAd nativeAd = (NativeAd) this.f17520e.get(i2);
                nVar.V().setText(nativeAd.getAdvertiserName());
                nVar.U().setText(nativeAd.getAdSocialContext());
                nVar.S().setText(nativeAd.getAdCallToAction());
                nVar.S().setVisibility(nativeAd.hasCallToAction() ? 0 : 4);
                ArrayList arrayList = new ArrayList();
                arrayList.add(nVar.S());
                arrayList.add(nVar.R());
                nativeAd.registerViewForInteraction(nVar.R(), nVar.T(), arrayList);
                return;
            }
            g gVar = (g) e0Var;
            m mVar = (m) this.f17520e.get(i2);
            String strB = mVar.b();
            String strA = mVar.a();
            int iC = mVar.c();
            if (strB != null && !strB.equals(BuildConfig.FLAVOR) && !strB.isEmpty()) {
                gVar.u.setText(strB);
            }
            if (c.h.a.i.q.m.f(this.f17521f).equals("m3u")) {
                if (strA.equals("-1")) {
                    u0(gVar);
                } else {
                    gVar.z.setText(String.valueOf(iC));
                }
                if (strA.equals("0")) {
                    this.f17529n = iC;
                }
            } else {
                if (strA.equals("-1")) {
                    u0(gVar);
                } else {
                    gVar.z.setText(String.valueOf(iC));
                }
                if (strA.equals("0")) {
                    int iQ1 = this.f17526k.Q1("live");
                    if (iQ1 == 0 || iQ1 == -1) {
                        gVar.z.setText(BuildConfig.FLAVOR);
                    } else {
                        gVar.z.setText(String.valueOf(iQ1));
                    }
                }
            }
            if (new c.h.a.k.d.a.a(this.f17521f).A().equals(c.h.a.h.n.a.s0) && this.f17525j == 0 && !c.h.a.h.n.a.T.booleanValue() && i2 == this.p) {
                gVar.w.requestFocus();
                s0(1.09f, gVar.w);
                t0(1.09f, gVar.w);
                gVar.w.setBackgroundResource(R.drawable.shape_list_categories_focused);
            }
            gVar.w.setOnClickListener(new c(gVar, strA, strB));
            gVar.w.setOnFocusChangeListener(new f(gVar.w));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 H(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_unified_fb, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_live_new_flow_list_item, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_foraward_arrow);
        if (c.h.a.i.q.m.t(this.f17521f).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(R.drawable.left_icon_cat);
        }
        return new g(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        List<Object> list = this.f17520e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return this.f17520e.get(i2) instanceof NativeAd ? 1 : 0;
    }

    public void r0(String str, TextView textView) {
        new Thread(new d(str, textView)).start();
    }

    public final void s0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void t0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void u0(g gVar) {
        new e(gVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, gVar);
    }

    public void v0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }
}
