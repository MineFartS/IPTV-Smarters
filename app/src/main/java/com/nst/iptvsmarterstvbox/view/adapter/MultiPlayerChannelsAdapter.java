package com.nst.iptvsmarterstvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.f.b.b.n;
import c.h.a.i.f;
import c.h.a.i.q.m;
import c.h.a.k.f.g;
import com.nst.iptvsmarterstvbox.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class MultiPlayerChannelsAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f27558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<f> f27559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f27560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<f> f27561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<f> f27562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.f f27563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SimpleDateFormat f27564k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f27566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PopupWindow f27567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PopupWindow f27568o;
    public g p;
    public SharedPreferences q;
    public SharedPreferences r;
    public String s;
    public String u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27565l = true;
    public String t = BuildConfig.FLAVOR;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public ImageView ivChannelLogo;

        @BindView
        public ProgressBar pbPagingLoader;

        @BindView
        public ProgressBar progressBar;

        @BindView
        public RelativeLayout rlListOfCategories;

        @BindView
        public RelativeLayout rlOuter;

        @BindView
        public RelativeLayout testing;

        @BindView
        public TextView tvChannelId;

        @BindView
        public TextView tvCurrentLive;

        @BindView
        public TextView tvMovieCategoryName;

        @BindView
        public TextView tvTime;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f27569b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27569b = myViewHolder;
            myViewHolder.tvMovieCategoryName = (TextView) b.c.c.c(view, R.id.tv_movie_category_name, "field 'tvMovieCategoryName'", TextView.class);
            myViewHolder.pbPagingLoader = (ProgressBar) b.c.c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
            myViewHolder.rlOuter = (RelativeLayout) b.c.c.c(view, R.id.rl_outer, "field 'rlOuter'", RelativeLayout.class);
            myViewHolder.rlListOfCategories = (RelativeLayout) b.c.c.c(view, R.id.rl_list_of_categories, "field 'rlListOfCategories'", RelativeLayout.class);
            myViewHolder.testing = (RelativeLayout) b.c.c.c(view, R.id.testing, "field 'testing'", RelativeLayout.class);
            myViewHolder.tvChannelId = (TextView) b.c.c.c(view, R.id.tv_channel_id, "field 'tvChannelId'", TextView.class);
            myViewHolder.tvTime = (TextView) b.c.c.c(view, R.id.tv_time, "field 'tvTime'", TextView.class);
            myViewHolder.progressBar = (ProgressBar) b.c.c.c(view, R.id.progressBar, "field 'progressBar'", ProgressBar.class);
            myViewHolder.tvCurrentLive = (TextView) b.c.c.c(view, R.id.tv_current_live, "field 'tvCurrentLive'", TextView.class);
            myViewHolder.ivChannelLogo = (ImageView) b.c.c.c(view, R.id.iv_tv_icon, "field 'ivChannelLogo'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f27569b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27569b = null;
            myViewHolder.tvMovieCategoryName = null;
            myViewHolder.pbPagingLoader = null;
            myViewHolder.rlOuter = null;
            myViewHolder.rlListOfCategories = null;
            myViewHolder.testing = null;
            myViewHolder.tvChannelId = null;
            myViewHolder.tvTime = null;
            myViewHolder.progressBar = null;
            myViewHolder.tvCurrentLive = null;
            myViewHolder.ivChannelLogo = null;
        }
    }

    public class a implements Comparator<f> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return n.j().d(fVar.K(), fVar2.K()).i();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f27571b;

        public b(f fVar) {
            this.f27571b = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g gVar;
            String strE0;
            if (MultiPlayerChannelsAdapter.this.f27567n != null) {
                MultiPlayerChannelsAdapter.this.f27567n.dismiss();
            }
            if (MultiPlayerChannelsAdapter.this.f27568o != null) {
                MultiPlayerChannelsAdapter.this.f27568o.dismiss();
            }
            if (MultiPlayerChannelsAdapter.this.p != null) {
                if (m.f(MultiPlayerChannelsAdapter.this.f27560g).equals("m3u")) {
                    gVar = MultiPlayerChannelsAdapter.this.p;
                    strE0 = this.f27571b.e0();
                } else {
                    gVar = MultiPlayerChannelsAdapter.this.p;
                    strE0 = MultiPlayerChannelsAdapter.this.u + this.f27571b.Y() + MultiPlayerChannelsAdapter.this.s;
                }
                gVar.r(String.valueOf(Uri.parse(strE0)), this.f27571b.P());
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f27573b;

        public c(f fVar) {
            this.f27573b = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g gVar;
            String strE0;
            if (MultiPlayerChannelsAdapter.this.f27567n != null) {
                MultiPlayerChannelsAdapter.this.f27567n.dismiss();
            }
            if (MultiPlayerChannelsAdapter.this.f27568o != null) {
                MultiPlayerChannelsAdapter.this.f27568o.dismiss();
            }
            if (m.f(MultiPlayerChannelsAdapter.this.f27560g).equals("m3u")) {
                gVar = MultiPlayerChannelsAdapter.this.p;
                strE0 = this.f27573b.e0();
            } else {
                gVar = MultiPlayerChannelsAdapter.this.p;
                strE0 = MultiPlayerChannelsAdapter.this.u + this.f27573b.Y() + MultiPlayerChannelsAdapter.this.s;
            }
            gVar.r(String.valueOf(Uri.parse(strE0)), this.f27573b.P());
        }
    }

    public class d implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27575b;

        public d(View view) {
            this.f27575b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27575b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27575b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27575b, "scaleY", f2);
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
                Log.e("id is", BuildConfig.FLAVOR + this.f27575b.getTag());
                view2 = this.f27575b;
                i2 = R.drawable.shape_list_categories_focused;
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                view2 = this.f27575b;
                i2 = R.drawable.shape_list_categories;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public MultiPlayerChannelsAdapter(List<f> list, Context context, PopupWindow popupWindow, g gVar, PopupWindow popupWindow2) {
        this.f27566m = BuildConfig.FLAVOR;
        ArrayList arrayList = new ArrayList();
        this.f27561h = arrayList;
        arrayList.addAll(list);
        this.f27562i = list;
        this.p = gVar;
        this.f27559f = list;
        this.f27560g = context;
        this.f27563j = new c.h.a.i.q.f(context);
        this.f27566m = context.getSharedPreferences("selected_language", 0).getString("selected_language", BuildConfig.FLAVOR);
        Collections.sort(this.f27559f, new a());
        this.f27567n = popupWindow;
        this.f27568o = popupWindow2;
        if (m.f(context).equals("m3u")) {
            return;
        }
        i0();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x016e A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:40:0x0154, B:42:0x015a, B:43:0x016e, B:45:0x0172, B:46:0x017e, B:47:0x0182), top: B:60:0x0154 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    @android.annotation.SuppressLint({"SimpleDateFormat", "SetTextI18n"})
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(com.nst.iptvsmarterstvbox.view.adapter.MultiPlayerChannelsAdapter.MyViewHolder r18, int r19) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.adapter.MultiPlayerChannelsAdapter.F(com.nst.iptvsmarterstvbox.view.adapter.MultiPlayerChannelsAdapter$MyViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_channels_on_video, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_foraward_arrow);
        if (this.f27566m.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(R.drawable.left_icon_cat);
        }
        return new MyViewHolder(viewInflate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0() {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.adapter.MultiPlayerChannelsAdapter.i0():void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27559f.size();
    }
}
