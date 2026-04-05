package minefarts.iptvsmarters.view.adapter;

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
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.activity.ParentalControlActivitity;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlVODCatAdapter extends RecyclerView.h<ViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Typeface f27664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<e> f27665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<e> f27666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<e> f27667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ParentalControlActivitity f27668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewHolder f27669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f27670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f27671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SharedPreferences f27672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f27673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f27674o;

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
        public ViewHolder f27675b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f27675b = viewHolder;
            viewHolder.categoryNameTV = (TextView) b.c.c.c(view, R.id.tv_category_name, "field 'categoryNameTV'", TextView.class);
            viewHolder.categoryRL = (RelativeLayout) b.c.c.c(view, R.id.rl_category, "field 'categoryRL'", RelativeLayout.class);
            viewHolder.categoryRL1 = (RelativeLayout) b.c.c.c(view, R.id.rl_category1, "field 'categoryRL1'", RelativeLayout.class);
            viewHolder.lockIV = (ImageView) b.c.c.c(view, R.id.iv_lock_staus, "field 'lockIV'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ViewHolder viewHolder = this.f27675b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27675b = null;
            viewHolder.categoryNameTV = null;
            viewHolder.categoryRL = null;
            viewHolder.categoryRL1 = null;
            viewHolder.lockIV = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27678d;

        public a(String str, ViewHolder viewHolder, String str2) {
            this.f27676b = str;
            this.f27677c = viewHolder;
            this.f27678d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i2;
            Context context;
            StringBuilder sb;
            Resources resources;
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = ParentalControlVODCatAdapter.this;
            parentalControlVODCatAdapter.f27674o = parentalControlVODCatAdapter.f27673n.J1(ParentalControlVODCatAdapter.this.f27671l, this.f27676b, m.z(ParentalControlVODCatAdapter.this.f27670k));
            if (ParentalControlVODCatAdapter.this.f27674o == null || ParentalControlVODCatAdapter.this.f27674o.a() == null || !ParentalControlVODCatAdapter.this.f27674o.a().equals("1")) {
                i iVar = ParentalControlVODCatAdapter.this.f27674o;
                i2 = R.string.locked;
                if (iVar != null && ParentalControlVODCatAdapter.this.f27674o.a() != null && ParentalControlVODCatAdapter.this.f27674o.a().equals("0")) {
                    this.f27677c.lockIV.setImageResource(R.drawable.lock);
                    ParentalControlVODCatAdapter.this.f27673n.x2(ParentalControlVODCatAdapter.this.f27671l, this.f27676b, "1", m.z(ParentalControlVODCatAdapter.this.f27670k));
                    if (ParentalControlVODCatAdapter.this.f27670k == null) {
                        return;
                    }
                    context = ParentalControlVODCatAdapter.this.f27670k;
                    sb = new StringBuilder();
                } else {
                    if (ParentalControlVODCatAdapter.this.f27674o == null) {
                        return;
                    }
                    ParentalControlVODCatAdapter.this.f27674o.g(this.f27676b);
                    ParentalControlVODCatAdapter.this.f27674o.h(ParentalControlVODCatAdapter.this.f27671l);
                    ParentalControlVODCatAdapter.this.f27674o.f("1");
                    ParentalControlVODCatAdapter.this.f27674o.i(m.z(ParentalControlVODCatAdapter.this.f27670k));
                    ParentalControlVODCatAdapter.this.f27673n.x(ParentalControlVODCatAdapter.this.f27674o);
                    this.f27677c.lockIV.setImageResource(R.drawable.lock);
                    if (ParentalControlVODCatAdapter.this.f27670k == null) {
                        return;
                    }
                    context = ParentalControlVODCatAdapter.this.f27670k;
                    sb = new StringBuilder();
                }
                resources = ParentalControlVODCatAdapter.this.f27670k.getResources();
            } else {
                this.f27677c.lockIV.setImageResource(R.drawable.lock_open);
                ParentalControlVODCatAdapter.this.f27673n.x2(ParentalControlVODCatAdapter.this.f27671l, this.f27676b, "0", m.z(ParentalControlVODCatAdapter.this.f27670k));
                if (ParentalControlVODCatAdapter.this.f27670k == null) {
                    return;
                }
                context = ParentalControlVODCatAdapter.this.f27670k;
                sb = new StringBuilder();
                resources = ParentalControlVODCatAdapter.this.f27670k.getResources();
                i2 = R.string.unlocked;
            }
            sb.append(resources.getString(i2));
            sb.append(" ");
            sb.append(this.f27678d);
            c.h.a.h.n.e.l0(context, sb.toString());
        }
    }

    public class b implements View.OnKeyListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27680b;

        public b(ViewHolder viewHolder) {
            this.f27680b = viewHolder;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i2 != 23 && i2 != 66) {
                return false;
            }
            this.f27680b.categoryRL.performClick();
            return true;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f27683c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ParentalControlVODCatAdapter parentalControlVODCatAdapter;
                ArrayList arrayList;
                if (!TextUtils.isEmpty(c.this.f27682b)) {
                    if (ParentalControlVODCatAdapter.this.f27666g.size() == 0) {
                        ParentalControlVODCatAdapter parentalControlVODCatAdapter2 = ParentalControlVODCatAdapter.this;
                        parentalControlVODCatAdapter2.f27665f = parentalControlVODCatAdapter2.f27666g;
                        c.this.f27683c.setVisibility(0);
                        if (ParentalControlVODCatAdapter.this.f27670k != null) {
                            c cVar = c.this;
                            cVar.f27683c.setText(ParentalControlVODCatAdapter.this.f27670k.getResources().getString(R.string.no_record_found));
                        }
                    } else if (!ParentalControlVODCatAdapter.this.f27666g.isEmpty() || ParentalControlVODCatAdapter.this.f27666g.isEmpty()) {
                        parentalControlVODCatAdapter = ParentalControlVODCatAdapter.this;
                        arrayList = parentalControlVODCatAdapter.f27666g;
                    }
                    ParentalControlVODCatAdapter.this.w();
                }
                parentalControlVODCatAdapter = ParentalControlVODCatAdapter.this;
                arrayList = parentalControlVODCatAdapter.f27667h;
                parentalControlVODCatAdapter.f27665f = arrayList;
                c.this.f27683c.setVisibility(4);
                ParentalControlVODCatAdapter.this.w();
            }
        }

        public c(String str, TextView textView) {
            this.f27682b = str;
            this.f27683c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            ParentalControlVODCatAdapter.this.f27666g = new ArrayList();
            if (ParentalControlVODCatAdapter.this.f27666g != null) {
                ParentalControlVODCatAdapter.this.f27666g.clear();
            }
            if (TextUtils.isEmpty(this.f27682b)) {
                ParentalControlVODCatAdapter.this.f27666g.addAll(ParentalControlVODCatAdapter.this.f27667h);
            } else {
                for (e eVar : ParentalControlVODCatAdapter.this.f27667h) {
                    if (eVar.c().toLowerCase().contains(this.f27682b.toLowerCase())) {
                        ParentalControlVODCatAdapter.this.f27666g.add(eVar);
                    }
                }
            }
            ((Activity) ParentalControlVODCatAdapter.this.f27670k).runOnUiThread(new a());
        }
    }

    public ParentalControlVODCatAdapter(ArrayList<e> arrayList, Context context, ParentalControlActivitity parentalControlActivitity, Typeface typeface) {
        this.f27671l = BuildConfig.FLAVOR;
        this.f27665f = arrayList;
        this.f27670k = context;
        this.f27668i = parentalControlActivitity;
        this.f27664e = typeface;
        this.f27667h = arrayList;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            this.f27672m = sharedPreferences;
            this.f27671l = sharedPreferences.getString("username", BuildConfig.FLAVOR);
            this.f27673n = new f(context);
            this.f27674o = new i();
        }
    }

    public void n0(String str, TextView textView, ProgressDialog progressDialog) {
        new Thread(new c(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27665f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void F(ViewHolder viewHolder, int i2) {
        ArrayList<e> arrayList = this.f27665f;
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
        this.f27669j = viewHolder;
        return viewHolder;
    }

    public final void q0(ViewHolder viewHolder, String str) {
        this.f27673n.d1(m.z(this.f27670k));
        this.f27674o = this.f27673n.J1(this.f27671l, str, m.z(this.f27670k));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 21) {
            viewHolder.lockIV.setImageResource(R.drawable.lock_open);
        }
        if (i2 >= 21) {
            viewHolder.lockIV.setImageDrawable(this.f27670k.getResources().getDrawable(R.drawable.lock_open, null));
        }
        i iVar = this.f27674o;
        if (iVar == null || iVar.a() == null || !this.f27674o.a().equals("1")) {
            return;
        }
        if (i2 <= 21) {
            viewHolder.lockIV.setImageResource(R.drawable.lock);
        }
        if (i2 >= 21) {
            viewHolder.lockIV.setImageDrawable(this.f27670k.getResources().getDrawable(R.drawable.lock, null));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return 0;
    }
}
