package com.nst.iptvsmarterstvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
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
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.e;
import c.h.a.i.q.f;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.activity.VodActivityLayout;
import com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSecondSubCategories;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class VodSubCatAdpaterNew extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<e> f28625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f28626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f28627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<e> f28628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<e> f28629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28631k;

    public static class MyViewHolder extends RecyclerView.e0 {

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

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f28632b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f28632b = myViewHolder;
            myViewHolder.ivTvIcon = (ImageView) b.c.c.c(view, R.id.iv_tv_icon, "field 'ivTvIcon'", ImageView.class);
            myViewHolder.tvMovieCategoryName = (TextView) b.c.c.c(view, R.id.tv_movie_category_name, "field 'tvMovieCategoryName'", TextView.class);
            myViewHolder.ivForawardArrow = (ImageView) b.c.c.c(view, R.id.iv_foraward_arrow, "field 'ivForawardArrow'", ImageView.class);
            myViewHolder.pbPagingLoader = (ProgressBar) b.c.c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
            myViewHolder.rlListOfCategories = (RelativeLayout) b.c.c.c(view, R.id.rl_list_of_categories, "field 'rlListOfCategories'", RelativeLayout.class);
            myViewHolder.rlOuter = (RelativeLayout) b.c.c.c(view, R.id.rl_outer, "field 'rlOuter'", RelativeLayout.class);
            myViewHolder.tvXubCount = (TextView) b.c.c.c(view, R.id.tv_sub_cat_count, "field 'tvXubCount'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f28632b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f28632b = null;
            myViewHolder.ivTvIcon = null;
            myViewHolder.tvMovieCategoryName = null;
            myViewHolder.ivForawardArrow = null;
            myViewHolder.pbPagingLoader = null;
            myViewHolder.rlListOfCategories = null;
            myViewHolder.rlOuter = null;
            myViewHolder.tvXubCount = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f28633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28635d;

        public a(MyViewHolder myViewHolder, String str, String str2) {
            this.f28633b = myViewHolder;
            this.f28634c = str;
            this.f28635d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new VodActivityLayout().L0(this.f28633b.pbPagingLoader);
            ProgressBar progressBar = this.f28633b.pbPagingLoader;
            if (progressBar != null) {
                progressBar.getIndeterminateDrawable().setColorFilter(DefaultRenderer.BACKGROUND_COLOR, PorterDuff.Mode.SRC_IN);
                this.f28633b.pbPagingLoader.setVisibility(0);
            }
            Intent intent = VodSubCatAdpaterNew.this.f28627g.Z0(this.f28634c).size() > 0 ? new Intent(VodSubCatAdpaterNew.this.f28626f, (Class<?>) VodActivityNewFlowSecondSubCategories.class) : new Intent(VodSubCatAdpaterNew.this.f28626f, (Class<?>) VodActivityLayout.class);
            intent.putExtra("category_id", this.f28634c);
            intent.putExtra("category_name", this.f28635d);
            VodSubCatAdpaterNew.this.f28626f.startActivity(intent);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f28638c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                VodSubCatAdpaterNew vodSubCatAdpaterNew;
                List list;
                if (!TextUtils.isEmpty(b.this.f28637b)) {
                    if (!VodSubCatAdpaterNew.this.f28628h.isEmpty() || VodSubCatAdpaterNew.this.f28628h.isEmpty()) {
                        vodSubCatAdpaterNew = VodSubCatAdpaterNew.this;
                        list = vodSubCatAdpaterNew.f28628h;
                    }
                    if (VodSubCatAdpaterNew.this.f28625e != null && VodSubCatAdpaterNew.this.f28625e.size() == 0) {
                        b.this.f28638c.setVisibility(0);
                    }
                    VodSubCatAdpaterNew vodSubCatAdpaterNew2 = VodSubCatAdpaterNew.this;
                    vodSubCatAdpaterNew2.f28630j = vodSubCatAdpaterNew2.f28631k;
                    VodSubCatAdpaterNew.this.w();
                }
                vodSubCatAdpaterNew = VodSubCatAdpaterNew.this;
                list = vodSubCatAdpaterNew.f28629i;
                vodSubCatAdpaterNew.f28625e = list;
                if (VodSubCatAdpaterNew.this.f28625e != null) {
                    b.this.f28638c.setVisibility(0);
                }
                VodSubCatAdpaterNew vodSubCatAdpaterNew22 = VodSubCatAdpaterNew.this;
                vodSubCatAdpaterNew22.f28630j = vodSubCatAdpaterNew22.f28631k;
                VodSubCatAdpaterNew.this.w();
            }
        }

        public b(String str, TextView textView) {
            this.f28637b = str;
            this.f28638c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            VodSubCatAdpaterNew.this.f28628h = new ArrayList();
            VodSubCatAdpaterNew.this.f28631k = this.f28637b.length();
            if (VodSubCatAdpaterNew.this.f28628h != null) {
                VodSubCatAdpaterNew.this.f28628h.clear();
            }
            if (TextUtils.isEmpty(this.f28637b)) {
                VodSubCatAdpaterNew.this.f28628h.addAll(VodSubCatAdpaterNew.this.f28629i);
            } else {
                if ((VodSubCatAdpaterNew.this.f28625e != null && VodSubCatAdpaterNew.this.f28625e.size() == 0) || VodSubCatAdpaterNew.this.f28630j > VodSubCatAdpaterNew.this.f28631k) {
                    VodSubCatAdpaterNew vodSubCatAdpaterNew = VodSubCatAdpaterNew.this;
                    vodSubCatAdpaterNew.f28625e = vodSubCatAdpaterNew.f28629i;
                }
                if (VodSubCatAdpaterNew.this.f28625e != null) {
                    for (e eVar : VodSubCatAdpaterNew.this.f28625e) {
                        if (eVar.c() != null && eVar.c().toLowerCase().contains(this.f28637b.toLowerCase())) {
                            VodSubCatAdpaterNew.this.f28628h.add(eVar);
                        }
                    }
                }
            }
            ((Activity) VodSubCatAdpaterNew.this.f28626f).runOnUiThread(new a());
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f28641b;

        public c(View view) {
            this.f28641b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28641b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28641b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28641b, "scaleY", f2);
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
                Log.e("id is", BuildConfig.FLAVOR + this.f28641b.getTag());
                view2 = this.f28641b;
                i2 = R.drawable.shape_list_categories_focused;
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                view2 = this.f28641b;
                i2 = R.drawable.shape_list_categories;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public VodSubCatAdpaterNew() {
    }

    public VodSubCatAdpaterNew(List<e> list, Context context, f fVar) {
        ArrayList arrayList = new ArrayList();
        this.f28628h = arrayList;
        arrayList.addAll(list);
        this.f28629i = list;
        this.f28625e = list;
        this.f28626f = context;
        this.f28627g = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f28625e.size();
    }

    public void p0(String str, TextView textView) {
        new Thread(new b(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        e eVar = this.f28625e.get(i2);
        String strC = eVar.c();
        String strB = eVar.b();
        Bundle bundle = new Bundle();
        bundle.putString("category_id", strB);
        bundle.putString("category_name", strC);
        if (strC != null && !strC.equals(BuildConfig.FLAVOR) && !strC.isEmpty()) {
            myViewHolder.tvMovieCategoryName.setText(strC);
        }
        int iR1 = this.f28627g.R1(eVar.b(), "movie");
        if (iR1 == 0 || iR1 == -1) {
            myViewHolder.tvXubCount.setText(BuildConfig.FLAVOR);
        } else {
            myViewHolder.tvXubCount.setText(String.valueOf(iR1));
        }
        RelativeLayout relativeLayout = myViewHolder.rlOuter;
        relativeLayout.setOnFocusChangeListener(new c(relativeLayout));
        myViewHolder.rlOuter.setOnClickListener(new a(myViewHolder, strB, strC));
        if (this.f28625e.size() != 0) {
            myViewHolder.rlOuter.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_vod_new_flow_list_item, viewGroup, false));
    }

    public void s0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }
}
