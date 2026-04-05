package minefarts.iptvsmarters.view.activity;

import a.i.i.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.i.f;
import c.h.a.i.m;
import c.h.a.i.p;
import c.h.a.k.a.l;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.SeriesDBModel;
import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import minefarts.iptvsmarters.view.adapter.LeftSideChannelsSearch;
import minefarts.iptvsmarters.view.adapter.LiveAllDataRightSideAdapterSearch;
import minefarts.iptvsmarters.view.adapter.RightSideProgramsSearch;
import minefarts.iptvsmarters.view.adapter.SeriesAllDataRightSideAdapter;
import minefarts.iptvsmarters.view.adapter.VodAllDataRightSideAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class SearchActivity extends l implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c.h.a.k.d.a.a f26248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LiveAllDataRightSideAdapterSearch f26249c;

    @BindView
    public RecyclerView channelRecyclerView;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VodAllDataRightSideAdapter f26250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SeriesAllDataRightSideAdapter f26251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LeftSideChannelsSearch f26252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<XMLTVProgrammePojo> f26253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RightSideProgramsSearch f26254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f26255i;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26256j = 1;

    @BindView
    public RecyclerView liveRecyclerView;

    @BindView
    public TextView live_channels_tab;

    @BindView
    public LinearLayout llProgramBox;

    @BindView
    public LinearLayout ll_pb_recent_watch;

    @BindView
    public RecyclerView movieRecyclerView;

    @BindView
    public TextView movies_tab;

    @BindView
    public ProgressBar pb_recent_watch;

    @BindView
    public RecyclerView programRecyclerView;

    @BindView
    public TextView program_tab;

    @BindView
    public RecyclerView seriesRecyclerView;

    @BindView
    public TextView series_tab;

    @BindView
    public LinearLayout tabs_layout;

    @BindView
    public TextView tv_description;

    @BindView
    public TextView tv_no_record_found;

    @BindView
    public TextView tv_program_name_right_side;

    @BindView
    public TextView tv_program_start_date_right;

    @BindView
    public TextView tv_program_stop_date_right;

    public class a implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26257b;

        public a(View view) {
            this.f26257b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26257b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26257b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            View view2;
            int i2;
            TextView textView;
            TextView textView2;
            TextView textView3;
            if (z) {
                View view3 = this.f26257b;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                boolean zEquals = this.f26257b.getTag().equals("10");
                i2 = R.drawable.episode_cast_tab_background_hover;
                if (zEquals) {
                    RecyclerView recyclerView = SearchActivity.this.liveRecyclerView;
                    if (recyclerView != null && recyclerView.getVisibility() == 0) {
                        textView3 = SearchActivity.this.live_channels_tab;
                    }
                    textView2 = SearchActivity.this.live_channels_tab;
                } else if (this.f26257b.getTag().equals("11")) {
                    RecyclerView recyclerView2 = SearchActivity.this.movieRecyclerView;
                    if (recyclerView2 != null && recyclerView2.getVisibility() == 0) {
                        textView3 = SearchActivity.this.movies_tab;
                    }
                    textView2 = SearchActivity.this.movies_tab;
                } else if (this.f26257b.getTag().equals("12")) {
                    RecyclerView recyclerView3 = SearchActivity.this.seriesRecyclerView;
                    if (recyclerView3 != null && recyclerView3.getVisibility() == 0) {
                        textView3 = SearchActivity.this.series_tab;
                    }
                    textView2 = SearchActivity.this.series_tab;
                } else if (!this.f26257b.getTag().equals("13")) {
                    a(1.15f);
                    b(1.15f);
                    return;
                } else {
                    LinearLayout linearLayout = SearchActivity.this.llProgramBox;
                    if (linearLayout != null && linearLayout.getVisibility() == 0) {
                        textView3 = SearchActivity.this.program_tab;
                    }
                    textView2 = SearchActivity.this.program_tab;
                }
                textView3.setBackgroundResource(R.drawable.episode_cast_tab_background_hover_clicked);
                return;
            }
            if (z || (view2 = this.f26257b) == null || view2.getTag() == null) {
                return;
            }
            float f2 = z ? 1.09f : 1.0f;
            a(f2);
            b(f2);
            Object tag = this.f26257b.getTag();
            i2 = R.drawable.episode_cast_tab_background_clicked;
            if (tag != null && this.f26257b.getTag().equals("10")) {
                RecyclerView recyclerView4 = SearchActivity.this.liveRecyclerView;
                if (recyclerView4 == null || recyclerView4.getVisibility() != 0) {
                    textView = SearchActivity.this.live_channels_tab;
                }
                textView2 = SearchActivity.this.live_channels_tab;
            } else if (this.f26257b.getTag() != null && this.f26257b.getTag().equals("11")) {
                RecyclerView recyclerView5 = SearchActivity.this.movieRecyclerView;
                if (recyclerView5 == null || recyclerView5.getVisibility() != 0) {
                    textView = SearchActivity.this.movies_tab;
                }
                textView2 = SearchActivity.this.movies_tab;
            } else if (this.f26257b.getTag() != null && this.f26257b.getTag().equals("12")) {
                RecyclerView recyclerView6 = SearchActivity.this.seriesRecyclerView;
                if (recyclerView6 == null || recyclerView6.getVisibility() != 0) {
                    textView = SearchActivity.this.series_tab;
                }
                textView2 = SearchActivity.this.series_tab;
            } else {
                if (this.f26257b.getTag() == null || !this.f26257b.getTag().equals("13")) {
                    return;
                }
                LinearLayout linearLayout2 = SearchActivity.this.llProgramBox;
                if (linearLayout2 == null || linearLayout2.getVisibility() != 0) {
                    textView = SearchActivity.this.program_tab;
                }
                textView2 = SearchActivity.this.program_tab;
            }
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background);
            return;
            textView2.setBackgroundResource(i2);
        }
    }

    public void A0() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public void B0() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background_clicked);
        }
        TextView textView2 = this.movies_tab;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
        TextView textView3 = this.series_tab;
        if (textView3 != null) {
            textView3.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public void C0() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public void D0() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background_clicked);
        }
        TextView textView2 = this.live_channels_tab;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
        TextView textView3 = this.series_tab;
        if (textView3 != null) {
            textView3.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public final void E0() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.movies_tab;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.series_tab;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        this.iv_back_button.setOnClickListener(this);
    }

    public final void F0() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setOnFocusChangeListener(new a(textView));
        }
        TextView textView2 = this.movies_tab;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new a(textView2));
        }
        TextView textView3 = this.series_tab;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new a(textView3));
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new a(textView4));
        }
    }

    public void G0() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public void H0() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background_clicked);
        }
        TextView textView2 = this.live_channels_tab;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
        TextView textView3 = this.movies_tab;
        if (textView3 != null) {
            textView3.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
        TextView textView4 = this.series_tab;
        if (textView4 != null) {
            textView4.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public final void I0() {
        if (b.a(this, "android.permission.RECORD_AUDIO") == 0) {
            b.a(this, "android.permission.RECORD_AUDIO");
        } else if (a.i.h.a.u(this, "android.permission.RECORD_AUDIO")) {
            a.i.h.a.q(this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
        } else {
            a.i.h.a.q(this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
        }
    }

    public void J0(String str, String str2, String str3, String str4, int i2) {
        TextView textView = this.tv_program_name_right_side;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.tv_description;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = this.tv_program_start_date_right;
        if (textView3 != null) {
            textView3.setText(str3);
        }
        TextView textView4 = this.tv_program_stop_date_right;
        if (textView4 != null) {
            textView4.setText(str4);
        }
        if (i2 != 0) {
            ProgressBar progressBar = this.pb_recent_watch;
            if (progressBar != null) {
                progressBar.setProgress(i2);
            }
            LinearLayout linearLayout = this.ll_pb_recent_watch;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.ll_pb_recent_watch;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        ProgressBar progressBar2 = this.pb_recent_watch;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
    }

    public void K0() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public void L0() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background_clicked);
        }
        TextView textView2 = this.live_channels_tab;
        if (textView2 != null) {
            textView2.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
        TextView textView3 = this.movies_tab;
        if (textView3 != null) {
            textView3.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public void M0(ArrayList<XMLTVProgrammePojo> arrayList, int i2) {
        try {
            this.f26253g = arrayList;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < this.f26253g.size(); i3++) {
                if (!arrayList3.contains(this.f26253g.get(i3).f())) {
                    arrayList3.add(this.f26253g.get(i3).f());
                    arrayList2.add(this.f26253g.get(i3));
                }
            }
            if (arrayList2.size() > 0) {
                Log.e("honey", "setLeftChannelsAdapter: " + arrayList2.size());
            }
            this.channelRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.channelRecyclerView.setItemAnimator(null);
            LeftSideChannelsSearch leftSideChannelsSearch = new LeftSideChannelsSearch(this.f26255i, arrayList2, i2);
            this.f26252f = leftSideChannelsSearch;
            this.channelRecyclerView.setAdapter(leftSideChannelsSearch);
            this.channelRecyclerView.n1(i2);
        } catch (Exception unused) {
        }
    }

    public void N0(ArrayList<f> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    p.b().j(arrayList);
                    this.liveRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.liveRecyclerView.setItemAnimator(null);
                    LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = new LiveAllDataRightSideAdapterSearch(this.f26255i, arrayList);
                    this.f26249c = liveAllDataRightSideAdapterSearch;
                    this.liveRecyclerView.setAdapter(liveAllDataRightSideAdapterSearch);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void O0(ArrayList<f> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    p.b().m(arrayList);
                    this.movieRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.movieRecyclerView.setItemAnimator(null);
                    VodAllDataRightSideAdapter vodAllDataRightSideAdapter = new VodAllDataRightSideAdapter(this.f26255i, "vod");
                    this.f26250d = vodAllDataRightSideAdapter;
                    this.movieRecyclerView.setAdapter(vodAllDataRightSideAdapter);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void P0(ArrayList<SeriesDBModel> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    m.b().g(arrayList);
                    this.seriesRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.seriesRecyclerView.setItemAnimator(null);
                    SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = new SeriesAllDataRightSideAdapter(this.f26255i, "series");
                    this.f26251e = seriesAllDataRightSideAdapter;
                    this.seriesRecyclerView.setAdapter(seriesAllDataRightSideAdapter);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void Q0() {
        RecyclerView recyclerView = this.liveRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        B0();
    }

    public void R0() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void S0() {
        RecyclerView recyclerView = this.movieRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        D0();
    }

    public void T0() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void U0(String str) {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setText(str);
            this.tv_no_record_found.setVisibility(0);
        }
    }

    public void V0() {
        LinearLayout linearLayout = this.llProgramBox;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        H0();
    }

    public void W0() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void X0() {
        RecyclerView recyclerView = this.seriesRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        L0();
    }

    public void Y0() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void Z0(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList<XMLTVProgrammePojo> arrayList2 = this.f26253g;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        try {
            if (c.h.a.i.q.m.f(this.f26255i).equals("m3u")) {
                for (int i2 = 0; i2 < this.f26253g.size(); i2++) {
                    if (this.f26253g.get(i2).n().equals(str)) {
                        arrayList.add(this.f26253g.get(i2));
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.f26253g.size(); i3++) {
                    if (this.f26253g.get(i3).h().equals(str)) {
                        arrayList.add(this.f26253g.get(i3));
                    }
                }
            }
            this.programRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.programRecyclerView.setItemAnimator(null);
            RightSideProgramsSearch rightSideProgramsSearch = new RightSideProgramsSearch(this.f26255i, arrayList);
            this.f26254h = rightSideProgramsSearch;
            this.programRecyclerView.setAdapter(rightSideProgramsSearch);
        } catch (Exception unused) {
        }
    }

    public void m0(int i2) {
        M0(this.f26253g, i2);
    }

    public boolean n0() {
        TextView textView = this.live_channels_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    public boolean o0() {
        TextView textView = this.movies_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back_button /* 2131428111 */:
                onBackPressed();
                break;
            case R.id.live_channels_tab /* 2131428272 */:
                B0();
                s0();
                x0();
                v0();
                Q0();
                break;
            case R.id.movies_tab /* 2131428627 */:
                D0();
                q0();
                x0();
                v0();
                S0();
                break;
            case R.id.program_tab /* 2131428818 */:
                H0();
                q0();
                s0();
                x0();
                V0();
                break;
            case R.id.series_tab /* 2131429092 */:
                L0();
                q0();
                s0();
                v0();
                X0();
                break;
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26255i = this;
        super.onCreate(bundle);
        f26248b = new c.h.a.k.d.a.a(this.f26255i);
        if (c.h.a.h.n.a.M.booleanValue() && !f26248b.m().booleanValue()) {
            finish();
            startActivity(new Intent(this, (Class<?>) APPInPurchaseActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        }
        setContentView(f26248b.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_search_tv : R.layout.activity_search);
        ButterKnife.a(this);
        I0();
        E0();
        F0();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 != 1) {
            return;
        }
        try {
            if (iArr.length > 0) {
                int i3 = iArr[0];
            }
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.k.a.l, android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        z0();
    }

    public boolean p0() {
        TextView textView = this.series_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    public void q0() {
        RecyclerView recyclerView = this.liveRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        A0();
    }

    public void r0() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void s0() {
        RecyclerView recyclerView = this.movieRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        C0();
    }

    public void t0() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void u0() {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void v0() {
        LinearLayout linearLayout = this.llProgramBox;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        G0();
    }

    public void w0() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void x0() {
        RecyclerView recyclerView = this.seriesRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        K0();
    }

    public void y0() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void z0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }
}
