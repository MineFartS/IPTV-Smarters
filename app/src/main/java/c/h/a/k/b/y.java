package c.h.a.k.b;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.NativeAd;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.activity.TVArchiveActivityLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class y extends RecyclerView.h<RecyclerView.e0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Object> f17730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f17731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<Object> f17732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<Object> f17733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f17736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.a f17737l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f17740o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17738m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<String> f17739n = new ArrayList<>();
    public int p = 0;

    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f17741b;

        public a(RecyclerView recyclerView) {
            this.f17741b = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            y yVar;
            int i3;
            RecyclerView.p layoutManager = this.f17741b.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i2 == 20) {
                yVar = y.this;
                i3 = 1;
            } else {
                if (i2 != 19) {
                    return false;
                }
                yVar = y.this;
                i3 = -1;
            }
            return yVar.u0(layoutManager, i3);
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
        public final /* synthetic */ RecyclerView.e0 f17745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f17747d;

        public d(RecyclerView.e0 e0Var, String str, String str2) {
            this.f17745b = e0Var;
            this.f17746c = str;
            this.f17747d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y.this.p = this.f17745b.r();
            Intent intent = new Intent(y.this.f17731f, (Class<?>) TVArchiveActivityLayout.class);
            intent.putExtra("category_id", this.f17746c);
            intent.putExtra("category_name", this.f17747d);
            y.this.f17731f.startActivity(intent);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f17750c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                y yVar;
                List list;
                if (!TextUtils.isEmpty(e.this.f17749b)) {
                    if (!y.this.f17732g.isEmpty() || y.this.f17732g.isEmpty()) {
                        yVar = y.this;
                        list = yVar.f17732g;
                    }
                    if (y.this.f17730e != null && y.this.f17730e.size() == 0) {
                        e.this.f17750c.setVisibility(0);
                    }
                    y yVar2 = y.this;
                    yVar2.f17734i = yVar2.f17735j;
                    y.this.w();
                }
                yVar = y.this;
                list = yVar.f17733h;
                yVar.f17730e = list;
                if (y.this.f17730e != null) {
                    e.this.f17750c.setVisibility(0);
                }
                y yVar22 = y.this;
                yVar22.f17734i = yVar22.f17735j;
                y.this.w();
            }
        }

        public e(String str, TextView textView) {
            this.f17749b = str;
            this.f17750c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.f17732g = new ArrayList();
            y.this.f17735j = this.f17749b.length();
            if (y.this.f17732g != null) {
                y.this.f17732g.clear();
            }
            if (TextUtils.isEmpty(this.f17749b)) {
                y.this.f17732g.addAll(y.this.f17733h);
            } else {
                if ((y.this.f17730e != null && y.this.f17730e.size() == 0) || y.this.f17734i > y.this.f17735j) {
                    y yVar = y.this;
                    yVar.f17730e = yVar.f17733h;
                }
                if (y.this.f17730e != null) {
                    for (int i2 = 0; i2 < y.this.f17730e.size(); i2++) {
                        try {
                            m mVar = (m) y.this.f17730e.get(i2);
                            if (mVar.b().toLowerCase().contains(this.f17749b.toLowerCase())) {
                                y.this.f17732g.add(mVar);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            ((Activity) y.this.f17731f).runOnUiThread(new a());
        }
    }

    public class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f17753b;

        public f(View view) {
            this.f17753b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17753b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17753b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17753b, "scaleY", f2);
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
                Log.e("id is", BuildConfig.FLAVOR + this.f17753b.getTag());
                view2 = this.f17753b;
                i2 = R.drawable.shape_list_categories_focused;
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                view2 = this.f17753b;
                i2 = R.drawable.shape_list_categories;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public static class g extends RecyclerView.e0 {
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
            L(false);
        }
    }

    public y(List<Object> list, Context context) {
        this.f17740o = BuildConfig.FLAVOR;
        ArrayList arrayList = new ArrayList();
        this.f17732g = arrayList;
        arrayList.addAll(list);
        this.f17733h = list;
        this.f17730e = list;
        this.f17731f = context;
        this.f17736k = new c.h.a.i.q.f(context);
        this.f17737l = new c.h.a.i.q.a(context);
        this.f17740o = context.getSharedPreferences("selected_language", 0).getString("selected_language", BuildConfig.FLAVOR);
        String string = context.getSharedPreferences("sortcatch", 0).getString("sort", BuildConfig.FLAVOR);
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

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void F(RecyclerView.e0 e0Var, int i2) {
        TextView textView;
        try {
            Bundle bundle = new Bundle();
            int i3 = 0;
            if (r(i2) == 1) {
                n nVar = (n) e0Var;
                NativeAd nativeAd = (NativeAd) this.f17730e.get(i2);
                nVar.V().setText(nativeAd.getAdvertiserName());
                nVar.U().setText(nativeAd.getAdSocialContext());
                nVar.S().setText(nativeAd.getAdCallToAction());
                Button buttonS = nVar.S();
                if (!nativeAd.hasCallToAction()) {
                    i3 = 4;
                }
                buttonS.setVisibility(i3);
                ArrayList arrayList = new ArrayList();
                arrayList.add(nVar.S());
                arrayList.add(nVar.R());
                nativeAd.registerViewForInteraction(nVar.R(), nVar.T(), arrayList);
                return;
            }
            g gVar = (g) e0Var;
            m mVar = (m) this.f17730e.get(i2);
            String strB = mVar.b();
            String strA = mVar.a();
            int iC = mVar.c();
            bundle.putString("category_id", strA);
            bundle.putString("category_name", strB);
            if (strB != null && !strB.equals(BuildConfig.FLAVOR) && !strB.isEmpty()) {
                gVar.u.setText(strB);
            }
            byte b2 = -1;
            if (strA.hashCode() == 48 && strA.equals("0")) {
                b2 = 0;
            }
            if (b2 != 0) {
                textView = gVar.z;
            } else {
                ArrayList<c.h.a.i.f> arrayListU0 = this.f17736k.U0("0");
                if (arrayListU0 == null || arrayListU0.size() == 0) {
                    gVar.z.setText(BuildConfig.FLAVOR);
                    if (new c.h.a.k.d.a.a(this.f17731f).A().equals(c.h.a.h.n.a.s0) && this.f17735j == 0 && !c.h.a.h.n.a.T.booleanValue() && i2 == this.p) {
                        gVar.w.requestFocus();
                        r0(1.09f, gVar.w);
                        s0(1.09f, gVar.w);
                        gVar.w.setBackgroundResource(R.drawable.shape_list_categories_focused);
                    }
                    gVar.w.setOnClickListener(new d(e0Var, strA, strB));
                    gVar.w.setOnFocusChangeListener(new f(gVar.w));
                    if (i2 == 0 || !this.f17738m) {
                    }
                    gVar.w.requestFocus();
                    this.f17738m = false;
                    return;
                }
                textView = gVar.z;
                iC = arrayListU0.size();
            }
            textView.setText(String.valueOf(iC));
            if (new c.h.a.k.d.a.a(this.f17731f).A().equals(c.h.a.h.n.a.s0)) {
                gVar.w.requestFocus();
                r0(1.09f, gVar.w);
                s0(1.09f, gVar.w);
                gVar.w.setBackgroundResource(R.drawable.shape_list_categories_focused);
            }
            gVar.w.setOnClickListener(new d(e0Var, strA, strB));
            gVar.w.setOnFocusChangeListener(new f(gVar.w));
            if (i2 == 0) {
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 H(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_unified_fb, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_live_new_flow_list_item, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_foraward_arrow);
        if (c.h.a.i.q.m.t(this.f17731f).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(R.drawable.left_icon_cat);
        }
        return new g(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f17730e.size();
    }

    public void q0(String str, TextView textView) {
        new Thread(new e(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return this.f17730e.get(i2) instanceof NativeAd ? 1 : 0;
    }

    public final void r0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void s0(float f2, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f2);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public void t0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final boolean u0(RecyclerView.p pVar, int i2) {
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
