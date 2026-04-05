package minefarts.iptvsmarters.view.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.q.c;
import c.h.a.i.q.e;
import c.h.a.i.q.f;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.activity.EPGSettingsActivity;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class EPGSourcesAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f27233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f27234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<c> f27235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MyViewHolder f27236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.k.d.a.a f27237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27238j;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public ImageView iv_checkbox;

        @BindView
        public LinearLayout ll_list_view;

        @BindView
        public LinearLayout ll_status;

        @BindView
        public LinearLayout ll_status_updating;

        @BindView
        public LinearLayout ll_updating;

        @BindView
        public TextView tv_last_updated;

        @BindView
        public TextView tv_source_name;

        @BindView
        public TextView tv_source_url;

        @BindView
        public TextView tv_status;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f27239b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27239b = myViewHolder;
            myViewHolder.tv_source_name = (TextView) b.c.c.c(view, R.id.tv_source_name, "field 'tv_source_name'", TextView.class);
            myViewHolder.tv_source_url = (TextView) b.c.c.c(view, R.id.tv_source_url, "field 'tv_source_url'", TextView.class);
            myViewHolder.iv_checkbox = (ImageView) b.c.c.c(view, R.id.iv_checkbox, "field 'iv_checkbox'", ImageView.class);
            myViewHolder.ll_list_view = (LinearLayout) b.c.c.c(view, R.id.ll_list_view, "field 'll_list_view'", LinearLayout.class);
            myViewHolder.ll_updating = (LinearLayout) b.c.c.c(view, R.id.ll_updating, "field 'll_updating'", LinearLayout.class);
            myViewHolder.ll_status = (LinearLayout) b.c.c.c(view, R.id.ll_status, "field 'll_status'", LinearLayout.class);
            myViewHolder.tv_status = (TextView) b.c.c.c(view, R.id.tv_status, "field 'tv_status'", TextView.class);
            myViewHolder.ll_status_updating = (LinearLayout) b.c.c.c(view, R.id.ll_status_updating, "field 'll_status_updating'", LinearLayout.class);
            myViewHolder.tv_last_updated = (TextView) b.c.c.c(view, R.id.tv_last_updated, "field 'tv_last_updated'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f27239b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27239b = null;
            myViewHolder.tv_source_name = null;
            myViewHolder.tv_source_url = null;
            myViewHolder.iv_checkbox = null;
            myViewHolder.ll_list_view = null;
            myViewHolder.ll_updating = null;
            myViewHolder.ll_status = null;
            myViewHolder.tv_status = null;
            myViewHolder.ll_status_updating = null;
            myViewHolder.tv_last_updated = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27240b;

        public a(int i2) {
            this.f27240b = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (EPGSourcesAdapter.this.f27234f instanceof EPGSettingsActivity) {
                ((EPGSettingsActivity) EPGSourcesAdapter.this.f27234f).O0((c) EPGSourcesAdapter.this.f27235g.get(this.f27240b));
            }
        }
    }

    public EPGSourcesAdapter(Context context, ArrayList<c> arrayList) {
        this.f27238j = "mobile";
        ArrayList<c> arrayList2 = new ArrayList<>();
        this.f27235g = arrayList2;
        arrayList2.addAll(arrayList);
        this.f27234f = context;
        this.f27233e = new f(context);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(context);
        this.f27237i = aVar;
        if (aVar.A().equals(c.h.a.h.n.a.s0)) {
            this.f27238j = "tv";
        } else {
            this.f27238j = "mobile";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        TextView textView;
        String string;
        if (this.f27234f != null) {
            int iC = this.f27235g.get(i2).c();
            myViewHolder.ll_list_view.setBackground(this.f27234f.getResources().getDrawable(R.drawable.ripple_left_sidebar_live_cat));
            if (this.f27235g.get(i2).a().equals("1")) {
                String strD = this.f27235g.get(i2).d();
                if (this.f27235g.get(i2).e().equals("panel")) {
                    if (c.h.a.h.n.a.f17040d.booleanValue()) {
                        myViewHolder.tv_source_name.setText(strD + " - " + this.f27234f.getResources().getString(R.string.inbuilt_epg_source) + " " + this.f27234f.getResources().getString(R.string.default_option));
                    } else {
                        myViewHolder.tv_source_name.setText(this.f27234f.getResources().getString(R.string.inbuilt_epg_source) + " " + this.f27234f.getResources().getString(R.string.default_option));
                    }
                    myViewHolder.tv_source_url.setVisibility(8);
                } else {
                    myViewHolder.tv_source_name.setText(strD + " " + this.f27234f.getResources().getString(R.string.default_option));
                    myViewHolder.tv_source_url.setVisibility(0);
                }
                myViewHolder.iv_checkbox.setVisibility(0);
                myViewHolder.iv_checkbox.setImageResource(R.drawable.green_tick);
                Context context = this.f27234f;
                if (context instanceof EPGSettingsActivity) {
                    ((EPGSettingsActivity) context).W0(strD);
                }
            } else {
                String strD2 = this.f27235g.get(i2).d();
                myViewHolder.iv_checkbox.setImageResource(R.drawable.empty_circle);
                myViewHolder.iv_checkbox.setVisibility(8);
                myViewHolder.ll_updating.setVisibility(8);
                myViewHolder.ll_status.setVisibility(8);
                myViewHolder.ll_status_updating.setVisibility(8);
                myViewHolder.tv_last_updated.setVisibility(8);
                if (this.f27235g.get(i2).e().equals("panel")) {
                    if (c.h.a.h.n.a.f17040d.booleanValue()) {
                        myViewHolder.tv_source_name.setText(strD2 + " - " + this.f27234f.getResources().getString(R.string.inbuilt_epg_source));
                    } else {
                        myViewHolder.tv_source_name.setText(this.f27234f.getResources().getString(R.string.inbuilt_epg_source));
                    }
                    myViewHolder.tv_source_url.setVisibility(8);
                } else {
                    myViewHolder.tv_source_name.setText(strD2);
                    myViewHolder.tv_source_url.setVisibility(0);
                }
            }
            e eVarZ1 = this.f27233e.Z1("epg", String.valueOf(iC));
            if (eVarZ1 != null) {
                if (eVarZ1.d() == null || !eVarZ1.d().equals("3")) {
                    if (eVarZ1.d() == null || !eVarZ1.d().equals("1")) {
                        if ((eVarZ1.d() != null && eVarZ1.d().equals("0")) || eVarZ1.d() == null || !eVarZ1.d().equals("2")) {
                            myViewHolder.ll_updating.setVisibility(8);
                            myViewHolder.ll_status.setVisibility(0);
                            textView = myViewHolder.tv_status;
                            string = this.f27234f.getResources().getString(R.string.not_downloaded);
                        }
                        textView.setText(string);
                        myViewHolder.tv_status.setTextColor(this.f27234f.getResources().getColor(R.color.red));
                        myViewHolder.ll_status_updating.setVisibility(0);
                        myViewHolder.tv_last_updated.setVisibility(8);
                    } else {
                        myViewHolder.ll_updating.setVisibility(8);
                        myViewHolder.ll_status.setVisibility(0);
                        myViewHolder.tv_status.setText(this.f27234f.getResources().getString(R.string.downloaded));
                        myViewHolder.tv_status.setTextColor(this.f27234f.getResources().getColor(R.color.green_status));
                        long jCurrentTimeMillis = 0;
                        if (eVarZ1.e() != null && !eVarZ1.e().equals(BuildConfig.FLAVOR)) {
                            jCurrentTimeMillis = System.currentTimeMillis() - Long.parseLong(eVarZ1.e());
                        }
                        myViewHolder.tv_last_updated.setText(this.f27234f.getResources().getString(R.string.last_updated) + " " + c.h.a.h.n.e.n0(jCurrentTimeMillis));
                        myViewHolder.tv_last_updated.setVisibility(0);
                        myViewHolder.ll_status_updating.setVisibility(0);
                    }
                } else if (Long.valueOf(System.currentTimeMillis() - Long.parseLong(eVarZ1.e())).longValue() <= 600000) {
                    myViewHolder.ll_updating.setVisibility(0);
                    myViewHolder.ll_status.setVisibility(8);
                    myViewHolder.ll_status_updating.setVisibility(0);
                    myViewHolder.tv_last_updated.setVisibility(8);
                }
                myViewHolder.ll_updating.setVisibility(8);
                myViewHolder.ll_status.setVisibility(0);
                textView = myViewHolder.tv_status;
                string = this.f27234f.getResources().getString(R.string.d_failed);
                textView.setText(string);
                myViewHolder.tv_status.setTextColor(this.f27234f.getResources().getColor(R.color.red));
                myViewHolder.ll_status_updating.setVisibility(0);
                myViewHolder.tv_last_updated.setVisibility(8);
            }
            myViewHolder.tv_source_url.setText(this.f27235g.get(i2).b());
            myViewHolder.ll_list_view.setOnClickListener(new a(i2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        if (this.f27238j.equals(c.h.a.h.n.a.s0)) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.epg_sources_layout_tv;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.epg_sources_layout;
        }
        MyViewHolder myViewHolder = new MyViewHolder(layoutInflaterFrom.inflate(i3, viewGroup, false));
        this.f27236h = myViewHolder;
        return myViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27235g.size();
    }
}
