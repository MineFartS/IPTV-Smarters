package c.h.a.k.b;

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
import com.facebook.ads.NativeAd;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat;
import minefarts.iptvsmarters.view.activity.SeriesActivityNewFlowSubCategoriesM3U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class v extends RecyclerView.h<RecyclerView.e0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Object> f17676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f17677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.i.q.f f17678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<Object> f17679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Object> f17680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.a f17683l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.h.a.i.q.l f17686o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f17684m = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17685n = 0;
    public int p = 0;

    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f17687b;

        public a(RecyclerView recyclerView) {
            this.f17687b = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            v vVar;
            int i3;
            RecyclerView.p layoutManager = this.f17687b.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i2 == 20) {
                vVar = v.this;
                i3 = 1;
            } else {
                if (i2 != 19) {
                    return false;
                }
                vVar = v.this;
                i3 = -1;
            }
            return vVar.r0(layoutManager, i3);
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
        public final /* synthetic */ RecyclerView.e0 f17691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f17693d;

        public d(RecyclerView.e0 e0Var, String str, String str2) {
            this.f17691b = e0Var;
            this.f17692c = str;
            this.f17693d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v.this.p = this.f17691b.r();
            Intent intent = c.h.a.i.q.m.f(v.this.f17677f).equals("m3u") ? new Intent(v.this.f17677f, (Class<?>) SeriesActivityNewFlowSubCategoriesM3U.class) : new Intent(v.this.f17677f, (Class<?>) SeriesActivitNewFlowSubCat.class);
            intent.putExtra("category_id", this.f17692c);
            intent.putExtra("category_name", this.f17693d);
            v.this.f17677f.startActivity(intent);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f17696c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v vVar;
                List list;
                if (!TextUtils.isEmpty(e.this.f17695b)) {
                    if (!v.this.f17679h.isEmpty() || v.this.f17679h.isEmpty()) {
                        vVar = v.this;
                        list = vVar.f17679h;
                    }
                    if (v.this.f17676e != null && v.this.f17676e.size() == 0) {
                        e.this.f17696c.setVisibility(0);
                        e eVar = e.this;
                        eVar.f17696c.setText(v.this.f17677f.getResources().getString(R.string.no_record_found));
                    }
                    v vVar2 = v.this;
                    vVar2.f17681j = vVar2.f17682k;
                    vVar2.w();
                }
                vVar = v.this;
                list = vVar.f17680i;
                vVar.f17676e = list;
                if (v.this.f17676e != null) {
                    e.this.f17696c.setVisibility(0);
                    e eVar2 = e.this;
                    eVar2.f17696c.setText(v.this.f17677f.getResources().getString(R.string.no_record_found));
                }
                v vVar22 = v.this;
                vVar22.f17681j = vVar22.f17682k;
                vVar22.w();
            }
        }

        public e(String str, TextView textView) {
            this.f17695b = str;
            this.f17696c = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                c.h.a.k.b.v r0 = c.h.a.k.b.v.this
                java.lang.String r1 = r4.f17695b
                int r1 = r1.length()
                r0.f17682k = r1
                c.h.a.k.b.v r0 = c.h.a.k.b.v.this
                java.util.List r0 = c.h.a.k.b.v.e0(r0)
                if (r0 == 0) goto L1b
                c.h.a.k.b.v r0 = c.h.a.k.b.v.this
                java.util.List r0 = c.h.a.k.b.v.e0(r0)
                r0.clear()
            L1b:
                java.lang.String r0 = r4.f17695b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L33
                c.h.a.k.b.v r0 = c.h.a.k.b.v.this
                java.util.List r0 = c.h.a.k.b.v.e0(r0)
                c.h.a.k.b.v r1 = c.h.a.k.b.v.this
                java.util.List r1 = c.h.a.k.b.v.g0(r1)
                r0.addAll(r1)
                goto L99
            L33:
                c.h.a.k.b.v r0 = c.h.a.k.b.v.this
                java.util.List r0 = c.h.a.k.b.v.h0(r0)
                if (r0 == 0) goto L47
                c.h.a.k.b.v r0 = c.h.a.k.b.v.this
                java.util.List r0 = c.h.a.k.b.v.h0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L4f
            L47:
                c.h.a.k.b.v r0 = c.h.a.k.b.v.this
                int r1 = r0.f17681j
                int r0 = r0.f17682k
                if (r1 <= r0) goto L58
            L4f:
                c.h.a.k.b.v r0 = c.h.a.k.b.v.this
                java.util.List r1 = c.h.a.k.b.v.g0(r0)
                c.h.a.k.b.v.i0(r0, r1)
            L58:
                c.h.a.k.b.v r0 = c.h.a.k.b.v.this
                java.util.List r0 = c.h.a.k.b.v.h0(r0)
                if (r0 == 0) goto L99
                r0 = 0
            L61:
                c.h.a.k.b.v r1 = c.h.a.k.b.v.this
                java.util.List r1 = c.h.a.k.b.v.h0(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto L99
                c.h.a.k.b.v r1 = c.h.a.k.b.v.this     // Catch: java.lang.Exception -> L96
                java.util.List r1 = c.h.a.k.b.v.h0(r1)     // Catch: java.lang.Exception -> L96
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L96
                c.h.a.k.b.m r1 = (c.h.a.k.b.m) r1     // Catch: java.lang.Exception -> L96
                java.lang.String r2 = r1.b()     // Catch: java.lang.Exception -> L96
                java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> L96
                java.lang.String r3 = r4.f17695b     // Catch: java.lang.Exception -> L96
                java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> L96
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> L96
                if (r2 == 0) goto L96
                c.h.a.k.b.v r2 = c.h.a.k.b.v.this     // Catch: java.lang.Exception -> L96
                java.util.List r2 = c.h.a.k.b.v.e0(r2)     // Catch: java.lang.Exception -> L96
                r2.add(r1)     // Catch: java.lang.Exception -> L96
            L96:
                int r0 = r0 + 1
                goto L61
            L99:
                c.h.a.k.b.v r0 = c.h.a.k.b.v.this
                android.content.Context r0 = c.h.a.k.b.v.c0(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                c.h.a.k.b.v$e$a r1 = new c.h.a.k.b.v$e$a
                r1.<init>()
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.b.v.e.run():void");
        }
    }

    public class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17699b;

        public f(View view) {
            this.f17699b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17699b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17699b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17699b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            int i2;
            if (z) {
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                Log.e("id is", BuildConfig.FLAVOR + this.f17699b.getTag());
                view2 = this.f17699b;
                i2 = R.drawable.shape_list_categories_focused;
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                view2 = this.f17699b;
                i2 = R.drawable.shape_list_categories;
            }
            view2.setBackgroundResource(i2);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class g extends AsyncTask<h, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f17701a;

        public g(h hVar) {
            this.f17701a = hVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(h... hVarArr) {
            try {
                return Integer.valueOf(v.this.f17678g.A1("series"));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f17701a.z.setText("0");
            } else {
                this.f17701a.z.setText(String.valueOf(num));
            }
            this.f17701a.z.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17701a.z.setVisibility(8);
        }
    }

    public static class h extends RecyclerView.e0 {
        public ImageView A;
        public ImageView B;
        public TextView u;
        public ProgressBar v;
        public RelativeLayout w;
        public RelativeLayout x;
        public RelativeLayout y;
        public TextView z;

        public h(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.tv_movie_category_name);
            this.v = (ProgressBar) view.findViewById(R.id.pb_paging_loader);
            this.w = (RelativeLayout) view.findViewById(R.id.rl_outer);
            this.y = (RelativeLayout) view.findViewById(R.id.testing);
            this.x = (RelativeLayout) view.findViewById(R.id.rl_list_of_categories);
            this.z = (TextView) view.findViewById(R.id.tv_sub_cat_count);
            this.B = (ImageView) view.findViewById(R.id.iv_foraward_arrow);
            this.A = (ImageView) view.findViewById(R.id.iv_tv_icon);
            L(false);
        }
    }

    public v(List<Object> list, Context context) {
        ArrayList arrayList = new ArrayList();
        this.f17679h = arrayList;
        arrayList.addAll(list);
        this.f17680i = list;
        this.f17676e = list;
        this.f17677f = context;
        this.f17678g = new c.h.a.i.q.f(context);
        this.f17683l = new c.h.a.i.q.a(context);
        this.f17686o = new c.h.a.i.q.l(context);
        String strH = c.h.a.i.q.m.H(context);
        if (strH.equals("1")) {
            Collections.sort(list, new b());
        }
        if (strH.equals("2")) {
            Collections.sort(list, new c());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void E(RecyclerView recyclerView) {
        super.E(recyclerView);
        recyclerView.setOnKeyListener(new a(recyclerView));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
    
        if (r4 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        if (r4 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        r1 = r0.z;
        r4 = java.lang.String.valueOf(r4);
     */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(androidx.recyclerview.widget.RecyclerView.e0 r9, @android.annotation.SuppressLint({"RecyclerView"}) int r10) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.b.v.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 H(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_unified_fb, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_vod_new_flow_list_item, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_foraward_arrow);
        if (c.h.a.i.q.m.t(this.f17677f).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(R.drawable.left_icon_cat);
        }
        return new h(viewInflate);
    }

    public void m0(String str, TextView textView) {
        new Thread(new e(str, textView)).start();
    }

    public final void n0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f17676e.size();
    }

    public final void o0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void p0(h hVar) {
        new g(hVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, hVar);
    }

    public void q0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return this.f17676e.get(i2) instanceof NativeAd ? 1 : 0;
    }

    public final boolean r0(RecyclerView.p pVar, int i2) {
        int i3 = this.p + i2;
        if (i3 < 0 || i3 >= o()) {
            return false;
        }
        y(this.p);
        this.p = i3;
        y(i3);
        pVar.A1(this.p);
        return true;
    }
}
