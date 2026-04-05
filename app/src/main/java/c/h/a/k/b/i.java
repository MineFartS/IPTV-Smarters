package c.h.a.k.b;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
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
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.activity.NewEPGActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class i extends RecyclerView.h<RecyclerView.e0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f17490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<Object> f17491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<Object> f17492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.f f17495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.a f17496k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f17498m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<Object> f17500o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17497l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17499n = 0;

    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f17501b;

        public a(RecyclerView recyclerView) {
            this.f17501b = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            i iVar;
            int i3;
            RecyclerView.p layoutManager = this.f17501b.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i2 == 20) {
                iVar = i.this;
                i3 = 1;
            } else {
                if (i2 != 19) {
                    return false;
                }
                iVar = i.this;
                i3 = -1;
            }
            return iVar.x0(layoutManager, i3);
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
        public final /* synthetic */ RecyclerView.e0 f17505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f17507d;

        public d(RecyclerView.e0 e0Var, String str, String str2) {
            this.f17505b = e0Var;
            this.f17506c = str;
            this.f17507d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.f17499n = this.f17505b.r();
            Intent intent = new Intent(i.this.f17490e, (Class<?>) NewEPGActivity.class);
            intent.putExtra("category_id", this.f17506c);
            intent.putExtra("category_name", this.f17507d);
            i.this.f17490e.startActivity(intent);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f17510c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i iVar;
                List list;
                if (!TextUtils.isEmpty(e.this.f17509b)) {
                    if (!i.this.f17491f.isEmpty() || i.this.f17491f.isEmpty()) {
                        iVar = i.this;
                        list = iVar.f17491f;
                    }
                    if (i.this.f17500o != null && i.this.f17500o.size() == 0) {
                        e.this.f17510c.setVisibility(0);
                    }
                    i iVar2 = i.this;
                    iVar2.f17493h = iVar2.f17494i;
                    i.this.w();
                }
                iVar = i.this;
                list = iVar.f17492g;
                iVar.f17500o = list;
                if (i.this.f17500o != null) {
                    e.this.f17510c.setVisibility(0);
                }
                i iVar22 = i.this;
                iVar22.f17493h = iVar22.f17494i;
                i.this.w();
            }
        }

        public e(String str, TextView textView) {
            this.f17509b = str;
            this.f17510c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f17491f = new ArrayList();
            i.this.f17494i = this.f17509b.length();
            if (i.this.f17491f != null) {
                i.this.f17491f.clear();
            }
            if (TextUtils.isEmpty(this.f17509b)) {
                i.this.f17491f.addAll(i.this.f17492g);
            } else {
                if ((i.this.f17500o != null && i.this.f17500o.size() == 0) || i.this.f17493h > i.this.f17494i) {
                    i iVar = i.this;
                    iVar.f17500o = iVar.f17492g;
                }
                if (i.this.f17500o != null) {
                    for (int i2 = 0; i2 < i.this.f17500o.size(); i2++) {
                        try {
                            m mVar = (m) i.this.f17500o.get(i2);
                            if (mVar.b().toLowerCase().contains(this.f17509b.toLowerCase())) {
                                i.this.f17491f.add(mVar);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            ((Activity) i.this.f17490e).runOnUiThread(new a());
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class f extends AsyncTask<g, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f17513a;

        public f(g gVar) {
            this.f17513a = gVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(g... gVarArr) {
            try {
                return c.h.a.i.q.m.f(i.this.f17490e).equals("m3u") ? Integer.valueOf(i.this.f17495j.A1("live")) : Integer.valueOf(i.this.f17496k.s("live", c.h.a.i.q.m.z(i.this.f17490e)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f17513a.y.setText("0");
            } else {
                this.f17513a.y.setText(String.valueOf(num));
            }
            this.f17513a.y.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f17513a.y.setVisibility(8);
        }
    }

    public static class g extends RecyclerView.e0 {
        public TextView u;
        public ProgressBar v;
        public RelativeLayout w;
        public RelativeLayout x;
        public TextView y;

        public g(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.tv_movie_category_name);
            this.v = (ProgressBar) view.findViewById(R.id.pb_paging_loader);
            this.w = (RelativeLayout) view.findViewById(R.id.rl_outer);
            this.x = (RelativeLayout) view.findViewById(R.id.rl_list_of_categories);
            this.y = (TextView) view.findViewById(R.id.tv_sub_cat_count);
            L(false);
        }
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17515b;

        public h(View view) {
            this.f17515b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17515b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17515b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17515b, "scaleY", f2);
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
                Log.e("id is", BuildConfig.FLAVOR + this.f17515b.getTag());
                view2 = this.f17515b;
                i2 = R.drawable.shape_list_categories_focused;
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                view2 = this.f17515b;
                i2 = R.drawable.shape_list_categories;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public i(Context context, List<Object> list) {
        this.f17498m = BuildConfig.FLAVOR;
        this.f17500o = list;
        ArrayList arrayList = new ArrayList();
        this.f17491f = arrayList;
        arrayList.addAll(list);
        this.f17492g = list;
        this.f17490e = context;
        this.f17495j = new c.h.a.i.q.f(context);
        this.f17496k = new c.h.a.i.q.a(context);
        this.f17498m = context.getSharedPreferences("selected_language", 0).getString("selected_language", BuildConfig.FLAVOR);
        String string = context.getSharedPreferences("sortepg", 0).getString("sort", BuildConfig.FLAVOR);
        if (string.equals("1")) {
            Collections.sort(list, new b());
        }
        if (string.equals("2")) {
            Collections.sort(list, new c());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void E(RecyclerView recyclerView) {
        super.E(recyclerView);
        recyclerView.setOnKeyListener(new a(recyclerView));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[PHI: r1
  0x00b3: PHI (r1v17 int) = (r1v15 int), (r1v20 int) binds: [B:40:0x00b1, B:36:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(androidx.recyclerview.widget.RecyclerView.e0 r12, int r13) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.k.b.i.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 H(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_unified_fb, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_live_new_flow_list_item, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_foraward_arrow);
        if (this.f17498m.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(R.drawable.left_icon_cat);
        }
        return new g(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f17500o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return this.f17500o.get(i2) instanceof NativeAd ? 1 : 0;
    }

    public void s0(String str, TextView textView) {
        new Thread(new e(str, textView)).start();
    }

    public final void t0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void u0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void v0(g gVar) {
        new f(gVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, gVar);
    }

    public void w0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final boolean x0(RecyclerView.p pVar, int i2) {
        int i3 = this.f17499n + i2;
        if (i3 < 0 || i3 >= o()) {
            return false;
        }
        y(this.f17499n);
        this.f17499n = i3;
        y(i3);
        pVar.A1(this.f17499n);
        return true;
    }
}
