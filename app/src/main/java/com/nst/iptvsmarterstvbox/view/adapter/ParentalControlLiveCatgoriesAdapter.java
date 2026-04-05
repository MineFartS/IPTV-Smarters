package com.nst.iptvsmarterstvbox.view.adapter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.e;
import c.h.a.i.q.f;
import c.h.a.i.q.i;
import c.h.a.i.q.m;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.activity.ParentalControlActivitity;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlLiveCatgoriesAdapter extends RecyclerView.h<ViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Typeface f27642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<e> f27643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<e> f27644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<e> f27645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ParentalControlActivitity f27646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewHolder f27647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f27648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f27649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SharedPreferences f27650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f27651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f27652o;

    public class ViewHolder extends RecyclerView.e0 {

        @BindView
        public TextView categoryNameTV;

        @BindView
        public RelativeLayout categoryRL;

        @BindView
        public RelativeLayout categoryRL1;

        @BindView
        public ImageView lockIV;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewHolder f27653b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f27653b = viewHolder;
            viewHolder.categoryNameTV = (TextView) b.c.c.c(view, R.id.tv_category_name, "field 'categoryNameTV'", TextView.class);
            viewHolder.categoryRL = (RelativeLayout) b.c.c.c(view, R.id.rl_category, "field 'categoryRL'", RelativeLayout.class);
            viewHolder.categoryRL1 = (RelativeLayout) b.c.c.c(view, R.id.rl_category1, "field 'categoryRL1'", RelativeLayout.class);
            viewHolder.lockIV = (ImageView) b.c.c.c(view, R.id.iv_lock_staus, "field 'lockIV'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ViewHolder viewHolder = this.f27653b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27653b = null;
            viewHolder.categoryNameTV = null;
            viewHolder.categoryRL = null;
            viewHolder.categoryRL1 = null;
            viewHolder.lockIV = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27656d;

        public a(String str, ViewHolder viewHolder, String str2) {
            this.f27654b = str;
            this.f27655c = viewHolder;
            this.f27656d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i2;
            Context context;
            StringBuilder sb;
            Resources resources;
            ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter = ParentalControlLiveCatgoriesAdapter.this;
            parentalControlLiveCatgoriesAdapter.f27652o = parentalControlLiveCatgoriesAdapter.f27651n.J1(ParentalControlLiveCatgoriesAdapter.this.f27649l, this.f27654b, m.z(ParentalControlLiveCatgoriesAdapter.this.f27648k));
            if (ParentalControlLiveCatgoriesAdapter.this.f27652o == null || ParentalControlLiveCatgoriesAdapter.this.f27652o.a() == null || !ParentalControlLiveCatgoriesAdapter.this.f27652o.a().equals("1")) {
                i iVar = ParentalControlLiveCatgoriesAdapter.this.f27652o;
                i2 = R.string.locked;
                if (iVar != null && ParentalControlLiveCatgoriesAdapter.this.f27652o.a() != null && ParentalControlLiveCatgoriesAdapter.this.f27652o.a().equals("0")) {
                    this.f27655c.lockIV.setImageResource(R.drawable.lock);
                    ParentalControlLiveCatgoriesAdapter.this.f27651n.x2(ParentalControlLiveCatgoriesAdapter.this.f27649l, this.f27654b, "1", m.z(ParentalControlLiveCatgoriesAdapter.this.f27648k));
                    if (ParentalControlLiveCatgoriesAdapter.this.f27648k == null) {
                        return;
                    }
                    context = ParentalControlLiveCatgoriesAdapter.this.f27648k;
                    sb = new StringBuilder();
                } else {
                    if (ParentalControlLiveCatgoriesAdapter.this.f27652o == null) {
                        return;
                    }
                    ParentalControlLiveCatgoriesAdapter.this.f27652o.g(this.f27654b);
                    ParentalControlLiveCatgoriesAdapter.this.f27652o.h(ParentalControlLiveCatgoriesAdapter.this.f27649l);
                    ParentalControlLiveCatgoriesAdapter.this.f27652o.f("1");
                    ParentalControlLiveCatgoriesAdapter.this.f27652o.i(m.z(ParentalControlLiveCatgoriesAdapter.this.f27648k));
                    ParentalControlLiveCatgoriesAdapter.this.f27651n.x(ParentalControlLiveCatgoriesAdapter.this.f27652o);
                    this.f27655c.lockIV.setImageResource(R.drawable.lock);
                    if (ParentalControlLiveCatgoriesAdapter.this.f27648k == null) {
                        return;
                    }
                    context = ParentalControlLiveCatgoriesAdapter.this.f27648k;
                    sb = new StringBuilder();
                }
                resources = ParentalControlLiveCatgoriesAdapter.this.f27648k.getResources();
            } else {
                this.f27655c.lockIV.setImageResource(R.drawable.lock_open);
                ParentalControlLiveCatgoriesAdapter.this.f27651n.x2(ParentalControlLiveCatgoriesAdapter.this.f27649l, this.f27654b, "0", m.z(ParentalControlLiveCatgoriesAdapter.this.f27648k));
                if (ParentalControlLiveCatgoriesAdapter.this.f27648k == null) {
                    return;
                }
                context = ParentalControlLiveCatgoriesAdapter.this.f27648k;
                sb = new StringBuilder();
                resources = ParentalControlLiveCatgoriesAdapter.this.f27648k.getResources();
                i2 = R.string.unlocked;
            }
            sb.append(resources.getString(i2));
            sb.append(" ");
            sb.append(this.f27656d);
            c.h.a.h.n.e.l0(context, sb.toString());
        }
    }

    public class b implements View.OnKeyListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27658b;

        public b(ViewHolder viewHolder) {
            this.f27658b = viewHolder;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i2 != 23 && i2 != 66) {
                return false;
            }
            this.f27658b.categoryRL.performClick();
            return true;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f27661c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter;
                ArrayList arrayList;
                if (!TextUtils.isEmpty(c.this.f27660b)) {
                    if (ParentalControlLiveCatgoriesAdapter.this.f27644g.size() == 0) {
                        ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter2 = ParentalControlLiveCatgoriesAdapter.this;
                        parentalControlLiveCatgoriesAdapter2.f27643f = parentalControlLiveCatgoriesAdapter2.f27644g;
                        c.this.f27661c.setVisibility(0);
                        if (ParentalControlLiveCatgoriesAdapter.this.f27648k != null) {
                            c cVar = c.this;
                            cVar.f27661c.setText(ParentalControlLiveCatgoriesAdapter.this.f27648k.getResources().getString(R.string.no_record_found));
                        }
                    } else if (!ParentalControlLiveCatgoriesAdapter.this.f27644g.isEmpty() || ParentalControlLiveCatgoriesAdapter.this.f27644g.isEmpty()) {
                        parentalControlLiveCatgoriesAdapter = ParentalControlLiveCatgoriesAdapter.this;
                        arrayList = parentalControlLiveCatgoriesAdapter.f27644g;
                    }
                    ParentalControlLiveCatgoriesAdapter.this.w();
                }
                parentalControlLiveCatgoriesAdapter = ParentalControlLiveCatgoriesAdapter.this;
                arrayList = parentalControlLiveCatgoriesAdapter.f27645h;
                parentalControlLiveCatgoriesAdapter.f27643f = arrayList;
                c.this.f27661c.setVisibility(4);
                ParentalControlLiveCatgoriesAdapter.this.w();
            }
        }

        public c(String str, TextView textView) {
            this.f27660b = str;
            this.f27661c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            ParentalControlLiveCatgoriesAdapter.this.f27644g = new ArrayList();
            if (ParentalControlLiveCatgoriesAdapter.this.f27644g != null) {
                ParentalControlLiveCatgoriesAdapter.this.f27644g.clear();
            }
            if (TextUtils.isEmpty(this.f27660b)) {
                ParentalControlLiveCatgoriesAdapter.this.f27644g.addAll(ParentalControlLiveCatgoriesAdapter.this.f27645h);
            } else {
                for (e eVar : ParentalControlLiveCatgoriesAdapter.this.f27645h) {
                    if (eVar.c().toLowerCase().contains(this.f27660b.toLowerCase())) {
                        ParentalControlLiveCatgoriesAdapter.this.f27644g.add(eVar);
                    }
                }
            }
            ((Activity) ParentalControlLiveCatgoriesAdapter.this.f27648k).runOnUiThread(new a());
        }
    }

    public ParentalControlLiveCatgoriesAdapter(ArrayList<e> arrayList, Context context, ParentalControlActivitity parentalControlActivitity, Typeface typeface) {
        this.f27649l = BuildConfig.FLAVOR;
        this.f27643f = arrayList;
        this.f27648k = context;
        this.f27646i = parentalControlActivitity;
        this.f27642e = typeface;
        this.f27645h = arrayList;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            this.f27650m = sharedPreferences;
            this.f27649l = sharedPreferences.getString("username", BuildConfig.FLAVOR);
            this.f27651n = new f(context);
            this.f27652o = new i();
        }
    }

    public void n0(String str, TextView textView, ProgressDialog progressDialog) {
        new Thread(new c(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27643f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void F(ViewHolder viewHolder, int i2) {
        ArrayList<e> arrayList = this.f27643f;
        if (arrayList != null) {
            e eVar = arrayList.get(i2);
            String strB = eVar.b();
            String strC = eVar.c();
            q0(viewHolder, strB);
            viewHolder.categoryNameTV.setText(eVar.c());
            viewHolder.categoryRL.setOnClickListener(new a(strB, viewHolder, strC));
        }
        viewHolder.categoryRL1.setOnKeyListener(new b(viewHolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public ViewHolder H(ViewGroup viewGroup, int i2) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_live_category_list_item, viewGroup, false));
        this.f27647j = viewHolder;
        return viewHolder;
    }

    public final void q0(ViewHolder viewHolder, String str) {
        this.f27651n.d1(m.z(this.f27648k));
        this.f27652o = this.f27651n.J1(this.f27649l, str, m.z(this.f27648k));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 21) {
            viewHolder.lockIV.setImageResource(R.drawable.lock_open);
        }
        if (i2 >= 21) {
            viewHolder.lockIV.setImageDrawable(this.f27648k.getResources().getDrawable(R.drawable.lock_open, null));
        }
        i iVar = this.f27652o;
        if (iVar == null || iVar.a() == null || !this.f27652o.a().equals("1")) {
            return;
        }
        if (i2 <= 21) {
            viewHolder.lockIV.setImageResource(R.drawable.lock);
        }
        if (i2 >= 21) {
            viewHolder.lockIV.setImageDrawable(this.f27648k.getResources().getDrawable(R.drawable.lock, null));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return 0;
    }
}
