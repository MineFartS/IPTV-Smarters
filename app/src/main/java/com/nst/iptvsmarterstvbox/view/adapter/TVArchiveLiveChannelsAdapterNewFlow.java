package com.nst.iptvsmarterstvbox.view.adapter;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
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
import c.f.b.b.n;
import c.h.a.h.n.e;
import c.h.a.i.f;
import c.k.b.t;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.SubTVArchiveActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TVArchiveLiveChannelsAdapterNewFlow extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f28328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<f> f28329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f28330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<f> f28331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<f> f28332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.f f28333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SimpleDateFormat f28334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f28335l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f28336m;

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
        public MyViewHolder f28337b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f28337b = myViewHolder;
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
            MyViewHolder myViewHolder = this.f28337b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f28337b = null;
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
        public final /* synthetic */ f f28339b;

        public b(f fVar) {
            this.f28339b = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(TVArchiveLiveChannelsAdapterNewFlow.this.f28330g, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f28339b.I());
            intent.putExtra("OPENED_STREAM_ID", this.f28339b.Y());
            intent.putExtra("OPENED_NUM", this.f28339b.P());
            intent.putExtra("OPENED_NAME", this.f28339b.getName());
            intent.putExtra("OPENED_STREAM_ICON", this.f28339b.X());
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f28339b.b0());
            TVArchiveLiveChannelsAdapterNewFlow.this.f28330g.startActivity(intent);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f28341b;

        public c(f fVar) {
            this.f28341b = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.e("data Value Categories", ">>>>>>>>>>>>>>" + this.f28341b);
            Intent intent = new Intent(TVArchiveLiveChannelsAdapterNewFlow.this.f28330g, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f28341b.I());
            intent.putExtra("OPENED_STREAM_ID", this.f28341b.Y());
            intent.putExtra("OPENED_NUM", this.f28341b.P());
            intent.putExtra("OPENED_NAME", this.f28341b.getName());
            intent.putExtra("OPENED_STREAM_ICON", this.f28341b.X());
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f28341b.b0());
            TVArchiveLiveChannelsAdapterNewFlow.this.f28330g.startActivity(intent);
        }
    }

    public class d implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f28343b;

        public d(View view) {
            this.f28343b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28343b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28343b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28343b, "scaleY", f2);
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
                Log.e("id is", BuildConfig.FLAVOR + this.f28343b.getTag());
                view2 = this.f28343b;
                i2 = R.drawable.shape_list_categories_focused;
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                view2 = this.f28343b;
                i2 = R.drawable.shape_list_categories;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public TVArchiveLiveChannelsAdapterNewFlow(List<f> list, Context context) {
        this.f28336m = BuildConfig.FLAVOR;
        ArrayList arrayList = new ArrayList();
        this.f28331h = arrayList;
        arrayList.addAll(list);
        this.f28332i = list;
        this.f28329f = list;
        this.f28330g = context;
        this.f28333j = new c.h.a.i.q.f(context);
        this.f28336m = context.getSharedPreferences("selected_language", 0).getString("selected_language", BuildConfig.FLAVOR);
        Collections.sort(this.f28329f, new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @SuppressLint({"SimpleDateFormat", "SetTextI18n"})
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        c.h.a.i.q.f fVar;
        int iZ;
        f fVar2 = this.f28329f.get(i2);
        String name = fVar2.getName();
        fVar2.Y();
        String strP = fVar2.P();
        String strI = fVar2.I();
        String strX = fVar2.X();
        if (name != null && !name.equals(BuildConfig.FLAVOR) && !name.isEmpty()) {
            myViewHolder.tvMovieCategoryName.setText(name);
        }
        TextView textView = myViewHolder.tvChannelId;
        if (textView != null) {
            textView.setText(strP);
        }
        myViewHolder.tvTime.setText(BuildConfig.FLAVOR);
        myViewHolder.progressBar.setVisibility(8);
        myViewHolder.tvCurrentLive.setText(BuildConfig.FLAVOR);
        if (strI != null && !strI.equals(BuildConfig.FLAVOR) && (fVar = this.f28333j) != null) {
            ArrayList<XMLTVProgrammePojo> arrayListV1 = fVar.v1(strI);
            if (arrayListV1 != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayListV1.size()) {
                        break;
                    }
                    String strJ = arrayListV1.get(i3).j();
                    String strL = arrayListV1.get(i3).l();
                    String strM = arrayListV1.get(i3).m();
                    arrayListV1.get(i3).b();
                    Long lValueOf = Long.valueOf(e.n(strJ, this.f28330g));
                    Long lValueOf2 = Long.valueOf(e.n(strL, this.f28330g));
                    ArrayList<XMLTVProgrammePojo> arrayList = arrayListV1;
                    if (!e.L(lValueOf.longValue(), lValueOf2.longValue(), this.f28330g) || (iZ = e.z(lValueOf.longValue(), lValueOf2.longValue(), this.f28330g)) == 0) {
                        i3++;
                        arrayListV1 = arrayList;
                    } else {
                        int i4 = 100 - iZ;
                        if (i4 == 0 || strM == null || strM.equals(BuildConfig.FLAVOR)) {
                            myViewHolder.tvTime.setVisibility(8);
                            myViewHolder.progressBar.setVisibility(8);
                            myViewHolder.tvCurrentLive.setVisibility(8);
                        } else {
                            if (c.h.a.h.n.a.u == 0) {
                                myViewHolder.tvTime.setVisibility(0);
                                SharedPreferences sharedPreferences = this.f28330g.getSharedPreferences("timeFormat", 0);
                                f28328e = sharedPreferences;
                                this.f28334k = new SimpleDateFormat(sharedPreferences.getString("timeFormat", c.h.a.h.n.a.m0));
                                myViewHolder.tvTime.setText(this.f28334k.format(lValueOf) + " - " + this.f28334k.format(lValueOf2));
                            }
                            myViewHolder.progressBar.setVisibility(0);
                            myViewHolder.progressBar.setProgress(i4);
                            myViewHolder.tvCurrentLive.setVisibility(0);
                            myViewHolder.tvCurrentLive.setText(strM);
                        }
                    }
                }
            }
            myViewHolder.ivChannelLogo.setImageDrawable(null);
            if (strX != null && !strX.equals(BuildConfig.FLAVOR)) {
                t.q(this.f28330g).l(strX).j(R.drawable.tv_icon).g(myViewHolder.ivChannelLogo);
            } else if (Build.VERSION.SDK_INT >= 21) {
                myViewHolder.ivChannelLogo.setImageDrawable(this.f28330g.getResources().getDrawable(R.drawable.tv_icon, null));
            } else {
                myViewHolder.ivChannelLogo.setImageDrawable(a.i.i.b.f(this.f28330g, R.drawable.tv_icon));
            }
        }
        myViewHolder.rlOuter.setOnClickListener(new b(fVar2));
        myViewHolder.rlListOfCategories.setOnClickListener(new c(fVar2));
        RelativeLayout relativeLayout = myViewHolder.rlOuter;
        relativeLayout.setOnFocusChangeListener(new d(relativeLayout));
        if (i2 == 0 && this.f28335l) {
            myViewHolder.rlOuter.requestFocus();
            this.f28335l = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_channels_on_video, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_foraward_arrow);
        if (this.f28336m.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(R.drawable.left_icon_cat);
        }
        return new MyViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f28329f.size();
    }
}
