package minefarts.iptvsmarters.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import c.h.a.i.m;
import c.h.a.i.p;
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
public class SearchActivityLowerSDK extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c.h.a.k.d.a.a f26259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LiveAllDataRightSideAdapterSearch f26260c;

    @BindView
    public RecyclerView channelRecyclerView;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VodAllDataRightSideAdapter f26261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SeriesAllDataRightSideAdapter f26262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LeftSideChannelsSearch f26263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<XMLTVProgrammePojo> f26264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RightSideProgramsSearch f26265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f26266i;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26267j = 1;

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

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = SearchActivityLowerSDK.this.live_channels_tab;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = SearchActivityLowerSDK.this.liveRecyclerView;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            SearchActivityLowerSDK.this.o();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = SearchActivityLowerSDK.this.movies_tab;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = SearchActivityLowerSDK.this.movieRecyclerView;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            SearchActivityLowerSDK.this.q();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = SearchActivityLowerSDK.this.series_tab;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = SearchActivityLowerSDK.this.seriesRecyclerView;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            SearchActivityLowerSDK.this.x();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = SearchActivityLowerSDK.this.program_tab;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout = SearchActivityLowerSDK.this.llProgramBox;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            SearchActivityLowerSDK.this.u();
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f26276b;

        public i(String str) {
            this.f26276b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = SearchActivityLowerSDK.this.tv_no_record_found;
            if (textView != null) {
                textView.setText(this.f26276b);
                SearchActivityLowerSDK.this.tv_no_record_found.setVisibility(0);
            }
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26278b;

        public j(View view) {
            this.f26278b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26278b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26278b, "scaleY", f2);
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
                View view3 = this.f26278b;
                if (view3 == null || view3.getTag() == null) {
                    return;
                }
                boolean zEquals = this.f26278b.getTag().equals("10");
                i2 = R.drawable.episode_cast_tab_background_hover;
                if (zEquals) {
                    RecyclerView recyclerView = SearchActivityLowerSDK.this.liveRecyclerView;
                    if (recyclerView != null && recyclerView.getVisibility() == 0) {
                        textView3 = SearchActivityLowerSDK.this.live_channels_tab;
                    }
                    textView2 = SearchActivityLowerSDK.this.live_channels_tab;
                } else if (this.f26278b.getTag().equals("11")) {
                    RecyclerView recyclerView2 = SearchActivityLowerSDK.this.movieRecyclerView;
                    if (recyclerView2 != null && recyclerView2.getVisibility() == 0) {
                        textView3 = SearchActivityLowerSDK.this.movies_tab;
                    }
                    textView2 = SearchActivityLowerSDK.this.movies_tab;
                } else if (this.f26278b.getTag().equals("12")) {
                    RecyclerView recyclerView3 = SearchActivityLowerSDK.this.seriesRecyclerView;
                    if (recyclerView3 != null && recyclerView3.getVisibility() == 0) {
                        textView3 = SearchActivityLowerSDK.this.series_tab;
                    }
                    textView2 = SearchActivityLowerSDK.this.series_tab;
                } else if (!this.f26278b.getTag().equals("13")) {
                    a(1.15f);
                    b(1.15f);
                    return;
                } else {
                    LinearLayout linearLayout = SearchActivityLowerSDK.this.llProgramBox;
                    if (linearLayout != null && linearLayout.getVisibility() == 0) {
                        textView3 = SearchActivityLowerSDK.this.program_tab;
                    }
                    textView2 = SearchActivityLowerSDK.this.program_tab;
                }
                textView3.setBackgroundResource(R.drawable.episode_cast_tab_background_hover_clicked);
                return;
            }
            if (z || (view2 = this.f26278b) == null || view2.getTag() == null) {
                return;
            }
            float f2 = z ? 1.09f : 1.0f;
            a(f2);
            b(f2);
            Object tag = this.f26278b.getTag();
            i2 = R.drawable.episode_cast_tab_background_clicked;
            if (tag != null && this.f26278b.getTag().equals("10")) {
                RecyclerView recyclerView4 = SearchActivityLowerSDK.this.liveRecyclerView;
                if (recyclerView4 == null || recyclerView4.getVisibility() != 0) {
                    textView = SearchActivityLowerSDK.this.live_channels_tab;
                }
                textView2 = SearchActivityLowerSDK.this.live_channels_tab;
            } else if (this.f26278b.getTag() != null && this.f26278b.getTag().equals("11")) {
                RecyclerView recyclerView5 = SearchActivityLowerSDK.this.movieRecyclerView;
                if (recyclerView5 == null || recyclerView5.getVisibility() != 0) {
                    textView = SearchActivityLowerSDK.this.movies_tab;
                }
                textView2 = SearchActivityLowerSDK.this.movies_tab;
            } else if (this.f26278b.getTag() != null && this.f26278b.getTag().equals("12")) {
                RecyclerView recyclerView6 = SearchActivityLowerSDK.this.seriesRecyclerView;
                if (recyclerView6 == null || recyclerView6.getVisibility() != 0) {
                    textView = SearchActivityLowerSDK.this.series_tab;
                }
                textView2 = SearchActivityLowerSDK.this.series_tab;
            } else {
                if (this.f26278b.getTag() == null || !this.f26278b.getTag().equals("13")) {
                    return;
                }
                LinearLayout linearLayout2 = SearchActivityLowerSDK.this.llProgramBox;
                if (linearLayout2 == null || linearLayout2.getVisibility() != 0) {
                    textView = SearchActivityLowerSDK.this.program_tab;
                }
                textView2 = SearchActivityLowerSDK.this.program_tab;
            }
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background);
            return;
            textView2.setBackgroundResource(i2);
        }
    }

    public void A(ArrayList<c.h.a.i.f> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    p.b().j(arrayList);
                    this.liveRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.liveRecyclerView.setItemAnimator(null);
                    LiveAllDataRightSideAdapterSearch liveAllDataRightSideAdapterSearch = new LiveAllDataRightSideAdapterSearch(this.f26266i, arrayList);
                    this.f26260c = liveAllDataRightSideAdapterSearch;
                    this.liveRecyclerView.setAdapter(liveAllDataRightSideAdapterSearch);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void B(ArrayList<c.h.a.i.f> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    p.b().m(arrayList);
                    this.movieRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.movieRecyclerView.setItemAnimator(null);
                    VodAllDataRightSideAdapter vodAllDataRightSideAdapter = new VodAllDataRightSideAdapter(this.f26266i, "vod");
                    this.f26261d = vodAllDataRightSideAdapter;
                    this.movieRecyclerView.setAdapter(vodAllDataRightSideAdapter);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void C(ArrayList<SeriesDBModel> arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    m.b().g(arrayList);
                    this.seriesRecyclerView.setLayoutManager(new GridLayoutManager(this, 7));
                    this.seriesRecyclerView.setItemAnimator(null);
                    SeriesAllDataRightSideAdapter seriesAllDataRightSideAdapter = new SeriesAllDataRightSideAdapter(this.f26266i, "series");
                    this.f26262e = seriesAllDataRightSideAdapter;
                    this.seriesRecyclerView.setAdapter(seriesAllDataRightSideAdapter);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void D() {
        RecyclerView recyclerView = this.liveRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        p();
    }

    public void E() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void F() {
        RecyclerView recyclerView = this.movieRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        r();
    }

    public void G() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void H(String str) {
        runOnUiThread(new i(str));
    }

    public void I() {
        LinearLayout linearLayout = this.llProgramBox;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        v();
    }

    public void J() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void K() {
        RecyclerView recyclerView = this.seriesRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        y();
    }

    public void L() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public void M(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList<XMLTVProgrammePojo> arrayList2 = this.f26264g;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        try {
            if (c.h.a.i.q.m.f(this.f26266i).equals("m3u")) {
                for (int i2 = 0; i2 < this.f26264g.size(); i2++) {
                    if (this.f26264g.get(i2).n().equals(str)) {
                        arrayList.add(this.f26264g.get(i2));
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.f26264g.size(); i3++) {
                    if (this.f26264g.get(i3).h().equals(str)) {
                        arrayList.add(this.f26264g.get(i3));
                    }
                }
            }
            this.programRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.programRecyclerView.setItemAnimator(null);
            RightSideProgramsSearch rightSideProgramsSearch = new RightSideProgramsSearch(this.f26266i, arrayList);
            this.f26265h = rightSideProgramsSearch;
            this.programRecyclerView.setAdapter(rightSideProgramsSearch);
        } catch (Exception unused) {
        }
    }

    public void a(int i2) {
        z(this.f26264g, i2);
    }

    public boolean b() {
        TextView textView = this.live_channels_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    public boolean c() {
        TextView textView = this.movies_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    public boolean d() {
        TextView textView = this.series_tab;
        return textView != null && textView.getVisibility() == 0;
    }

    public void e() {
        runOnUiThread(new b());
    }

    public void f() {
        runOnUiThread(new a());
    }

    public void g() {
        runOnUiThread(new d());
    }

    public void h() {
        runOnUiThread(new c());
    }

    public void i() {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void j() {
        runOnUiThread(new h());
    }

    public void k() {
        runOnUiThread(new g());
    }

    public void l() {
        runOnUiThread(new f());
    }

    public void m() {
        runOnUiThread(new e());
    }

    public final void n() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public void o() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back_button /* 2131428111 */:
                onBackPressed();
                break;
            case R.id.live_channels_tab /* 2131428272 */:
                p();
                g();
                l();
                j();
                D();
                break;
            case R.id.movies_tab /* 2131428627 */:
                r();
                e();
                l();
                j();
                F();
                break;
            case R.id.program_tab /* 2131428818 */:
                v();
                e();
                g();
                l();
                I();
                break;
            case R.id.series_tab /* 2131429092 */:
                y();
                e();
                g();
                j();
                K();
                break;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26266i = this;
        super.onCreate(bundle);
        f26259b = new c.h.a.k.d.a.a(this.f26266i);
        if (c.h.a.h.n.a.M.booleanValue() && !f26259b.m().booleanValue()) {
            finish();
            startActivity(new Intent(this, (Class<?>) APPInPurchaseActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        }
        setContentView(f26259b.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_search_lower_sdk_tv : R.layout.activity_search_lower_sdk);
        ButterKnife.a(this);
        s();
        t();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        n();
    }

    public void p() {
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

    public void q() {
        TextView textView = this.movies_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public void r() {
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

    public final void s() {
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

    public final void t() {
        TextView textView = this.live_channels_tab;
        if (textView != null) {
            textView.setOnFocusChangeListener(new j(textView));
        }
        TextView textView2 = this.movies_tab;
        if (textView2 != null) {
            textView2.setOnFocusChangeListener(new j(textView2));
        }
        TextView textView3 = this.series_tab;
        if (textView3 != null) {
            textView3.setOnFocusChangeListener(new j(textView3));
        }
        TextView textView4 = this.program_tab;
        if (textView4 != null) {
            textView4.setOnFocusChangeListener(new j(textView4));
        }
    }

    public void u() {
        TextView textView = this.program_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public void v() {
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

    public void w(String str, String str2, String str3, String str4, int i2) {
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

    public void x() {
        TextView textView = this.series_tab;
        if (textView != null) {
            textView.setBackgroundResource(R.drawable.episode_cast_tab_background);
        }
    }

    public void y() {
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

    public void z(ArrayList<XMLTVProgrammePojo> arrayList, int i2) {
        try {
            this.f26264g = arrayList;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < this.f26264g.size(); i3++) {
                if (!arrayList3.contains(this.f26264g.get(i3).f())) {
                    arrayList3.add(this.f26264g.get(i3).f());
                    arrayList2.add(this.f26264g.get(i3));
                }
            }
            if (arrayList2.size() > 0) {
                Log.e("honey", "setLeftChannelsAdapter: " + arrayList2.size());
            }
            this.channelRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.channelRecyclerView.setItemAnimator(null);
            LeftSideChannelsSearch leftSideChannelsSearch = new LeftSideChannelsSearch(this.f26266i, arrayList2, i2);
            this.f26263f = leftSideChannelsSearch;
            this.channelRecyclerView.setAdapter(leftSideChannelsSearch);
            this.channelRecyclerView.n1(i2);
        } catch (Exception unused) {
        }
    }
}
