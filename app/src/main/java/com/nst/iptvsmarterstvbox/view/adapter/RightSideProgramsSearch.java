package minefarts.iptvsmarters.view.adapter;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.f.a.c.d.l;
import c.f.a.c.d.u.d;
import c.h.a.i.e;
import c.h.a.i.p;
import c.h.a.i.q.f;
import c.h.a.i.q.m;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import minefarts.iptvsmarters.view.activity.SearchActivity;
import minefarts.iptvsmarters.view.activity.SearchActivityLowerSDK;
import minefarts.iptvsmarters.view.demo.NSTEXOPlayerSkyTvActivity;
import minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class RightSideProgramsSearch extends RecyclerView.h<RecyclerView.e0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f27716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f27717f;
    public SimpleDateFormat C;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<XMLTVProgrammePojo> f27718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f27719h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.a f27721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Animation f27722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f27723l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ProgressDialog f27725n;
    public d q;
    public Handler s;
    public f u;
    public ArrayList<c.h.a.i.f> x;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f27720i = Boolean.FALSE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f27724m = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27726o = false;
    public int p = -1;
    public String r = BuildConfig.FLAVOR;
    public int v = -1;
    public String y = BuildConfig.FLAVOR;
    public String z = BuildConfig.FLAVOR;
    public String A = BuildConfig.FLAVOR;
    public int B = 0;
    public int D = 0;
    public ArrayList<e> t = new ArrayList<>();
    public ArrayList<e> w = new ArrayList<>();

    public static class ViewHolder extends RecyclerView.e0 {

        @BindView
        public LinearLayout ll_list_view;

        @BindView
        public LinearLayout ll_pb_recent_watch;

        @BindView
        public ProgressBar pb_recent_watch;

        @BindView
        public TextView tvProgramStartDate;

        @BindView
        public TextView tvProgramStopDate;

        @BindView
        public TextView tvProgramTitle;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewHolder f27727b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f27727b = viewHolder;
            viewHolder.tvProgramTitle = (TextView) b.c.c.c(view, R.id.tv_program_title, "field 'tvProgramTitle'", TextView.class);
            viewHolder.tvProgramStartDate = (TextView) b.c.c.c(view, R.id.tv_program_start_date, "field 'tvProgramStartDate'", TextView.class);
            viewHolder.tvProgramStopDate = (TextView) b.c.c.c(view, R.id.tv_program_stop_date, "field 'tvProgramStopDate'", TextView.class);
            viewHolder.ll_pb_recent_watch = (LinearLayout) b.c.c.c(view, R.id.ll_pb_recent_watch, "field 'll_pb_recent_watch'", LinearLayout.class);
            viewHolder.pb_recent_watch = (ProgressBar) b.c.c.c(view, R.id.pb_recent_watch, "field 'pb_recent_watch'", ProgressBar.class);
            viewHolder.ll_list_view = (LinearLayout) b.c.c.c(view, R.id.ll_list_view, "field 'll_list_view'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ViewHolder viewHolder = this.f27727b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27727b = null;
            viewHolder.tvProgramTitle = null;
            viewHolder.tvProgramStartDate = null;
            viewHolder.tvProgramStopDate = null;
            viewHolder.ll_pb_recent_watch = null;
            viewHolder.pb_recent_watch = null;
            viewHolder.ll_list_view = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f27730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f27733g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27734h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f27735i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f27736j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f27737k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f27738l;

        public a(int i2, String str, int i3, String str2, String str3, String str4, ViewHolder viewHolder, String str5, String str6, String str7, int i4) {
            this.f27728b = i2;
            this.f27729c = str;
            this.f27730d = i3;
            this.f27731e = str2;
            this.f27732f = str3;
            this.f27733g = str4;
            this.f27734h = viewHolder;
            this.f27735i = str5;
            this.f27736j = str6;
            this.f27737k = str7;
            this.f27738l = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f27728b != RightSideProgramsSearch.this.D) {
                RightSideProgramsSearch.this.D = this.f27728b;
                this.f27734h.ll_list_view.setBackground(RightSideProgramsSearch.this.f27719h.getResources().getDrawable(R.color.hp_cyan));
                if (Build.VERSION.SDK_INT >= 23) {
                    ((SearchActivity) RightSideProgramsSearch.this.f27719h).J0(this.f27731e, this.f27735i, this.f27736j, this.f27737k, this.f27738l);
                } else {
                    ((SearchActivityLowerSDK) RightSideProgramsSearch.this.f27719h).w(this.f27731e, this.f27735i, this.f27736j, this.f27737k, this.f27738l);
                }
                RightSideProgramsSearch.this.w();
                return;
            }
            try {
                RightSideProgramsSearch rightSideProgramsSearch = RightSideProgramsSearch.this;
                rightSideProgramsSearch.q = c.f.a.c.d.u.b.e(rightSideProgramsSearch.f27719h).c().c();
            } catch (Exception unused) {
            }
            if (RightSideProgramsSearch.this.q == null || !RightSideProgramsSearch.this.q.c()) {
                RightSideProgramsSearch.this.w0(this.f27730d, this.f27733g, this.f27729c);
                return;
            }
            if (RightSideProgramsSearch.this.q != null && RightSideProgramsSearch.this.q.p() != null && RightSideProgramsSearch.this.q.p().j() != null && RightSideProgramsSearch.this.q.p().j().K() != null) {
                RightSideProgramsSearch rightSideProgramsSearch2 = RightSideProgramsSearch.this;
                rightSideProgramsSearch2.r = rightSideProgramsSearch2.q.p().j().K();
            }
            String strF = m.f(RightSideProgramsSearch.this.f27719h).equals("m3u") ? this.f27729c : c.h.a.h.n.e.F(RightSideProgramsSearch.this.f27719h, this.f27730d, "m3u8", "live");
            if (RightSideProgramsSearch.this.r.contains(String.valueOf(strF))) {
                RightSideProgramsSearch.this.f27719h.startActivity(new Intent(RightSideProgramsSearch.this.f27719h, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            l lVar = new l(1);
            lVar.N("com.google.android.gms.cast.metadata.TITLE", this.f27731e);
            lVar.b(new c.f.a.c.f.p.a(Uri.parse(this.f27732f)));
            RightSideProgramsSearch rightSideProgramsSearch3 = RightSideProgramsSearch.this;
            c.h.a.h.m.a.b(rightSideProgramsSearch3.s, rightSideProgramsSearch3.q.p(), strF, lVar, RightSideProgramsSearch.this.f27719h);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class b extends AsyncTask<String, Void, String> {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return RightSideProgramsSearch.this.r0(strArr[1]);
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            RightSideProgramsSearch.this.t0();
            RightSideProgramsSearch.this.W();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class c extends AsyncTask<String, Void, Boolean> {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return RightSideProgramsSearch.this.u0();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            RightSideProgramsSearch.this.x0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            RightSideProgramsSearch.this.y0();
            super.onPreExecute();
        }
    }

    public RightSideProgramsSearch(Context context, ArrayList<XMLTVProgrammePojo> arrayList) {
        this.f27723l = "mobile";
        this.f27719h = context;
        this.f27718g = arrayList;
        this.f27721j = new c.h.a.i.q.a(context);
        this.f27722k = AnimationUtils.loadAnimation(context, R.anim.bounce);
        this.u = new f(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("timeFormat", 0);
        f27716e = sharedPreferences;
        this.C = new SimpleDateFormat(sharedPreferences.getString("timeFormat", c.h.a.h.n.a.m0), Locale.US);
        if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0)) {
            this.f27723l = "tv";
        } else {
            this.f27723l = "mobile";
        }
        this.s = new Handler(Looper.getMainLooper());
        if (this.f27723l.equals("mobile")) {
            try {
                this.q = c.f.a.c.d.u.b.e(context).c().c();
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @SuppressLint({"SetTextI18n"})
    public void F(@NotNull RecyclerView.e0 e0Var, int i2) {
        int i3;
        String str;
        String str2;
        TextView textView;
        String str3;
        String str4;
        int i4;
        ViewHolder viewHolder;
        int i5;
        LinearLayout linearLayout;
        r(i2);
        this.f27719h.getSharedPreferences("showhidemoviename", 0).getInt("livestream", 1);
        ViewHolder viewHolder2 = (ViewHolder) e0Var;
        try {
            ArrayList<XMLTVProgrammePojo> arrayList = this.f27718g;
            if (arrayList == null || arrayList.size() <= 0 || this.f27719h == null) {
                return;
            }
            XMLTVProgrammePojo xMLTVProgrammePojo = this.f27718g.get(i2);
            String strM = xMLTVProgrammePojo.f() != null ? xMLTVProgrammePojo.m() : BuildConfig.FLAVOR;
            String strB = xMLTVProgrammePojo.b() != null ? xMLTVProgrammePojo.b() : BuildConfig.FLAVOR;
            String strD = xMLTVProgrammePojo.d() != null ? xMLTVProgrammePojo.d() : BuildConfig.FLAVOR;
            String strN = xMLTVProgrammePojo.n() != null ? xMLTVProgrammePojo.n() : BuildConfig.FLAVOR;
            String strE = xMLTVProgrammePojo.e() != null ? xMLTVProgrammePojo.e() : BuildConfig.FLAVOR;
            if (xMLTVProgrammePojo.h() != null) {
                try {
                    i3 = Integer.parseInt(xMLTVProgrammePojo.h());
                } catch (NumberFormatException unused) {
                    i3 = 0;
                }
            } else {
                i3 = -1;
            }
            String strReplace = strM.trim().replace("'", " ");
            viewHolder2.tvProgramTitle.setText(strReplace);
            String strJ = xMLTVProgrammePojo.j();
            String strL = xMLTVProgrammePojo.l();
            Long lValueOf = Long.valueOf(c.h.a.h.n.e.n(strJ, this.f27719h));
            Long lValueOf2 = Long.valueOf(c.h.a.h.n.e.n(strL, this.f27719h));
            if (c.h.a.h.n.e.L(lValueOf.longValue(), lValueOf2.longValue(), this.f27719h)) {
                int iZ = c.h.a.h.n.e.z(lValueOf.longValue(), lValueOf2.longValue(), this.f27719h);
                if (iZ != 0) {
                    iZ = 100 - iZ;
                    if (iZ != 0) {
                        String str5 = this.C.format(lValueOf);
                        String str6 = " - " + this.C.format(lValueOf2);
                        viewHolder2.tvProgramStartDate.setText(str5);
                        viewHolder2.tvProgramStopDate.setText(str6);
                        viewHolder2.pb_recent_watch.setProgress(iZ);
                        viewHolder2.ll_pb_recent_watch.setVisibility(0);
                        i4 = iZ;
                        str3 = str6;
                        str4 = str5;
                    } else {
                        linearLayout = viewHolder2.ll_pb_recent_watch;
                        i5 = 8;
                    }
                } else {
                    i5 = 8;
                    linearLayout = viewHolder2.ll_pb_recent_watch;
                }
                linearLayout.setVisibility(i5);
                i4 = iZ;
                str4 = BuildConfig.FLAVOR;
                str3 = str4;
            } else {
                viewHolder2.ll_pb_recent_watch.setVisibility(8);
                Date date = new Date();
                Locale locale = Locale.US;
                String str7 = new SimpleDateFormat("dd", locale).format(date);
                String str8 = new SimpleDateFormat("dd", locale).format(lValueOf);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd", locale);
                if (str7.equals(str8)) {
                    str = this.C.format(lValueOf);
                    str2 = " - " + this.C.format(lValueOf2);
                    viewHolder2.tvProgramStartDate.setText(str);
                    textView = viewHolder2.tvProgramStopDate;
                } else {
                    str = simpleDateFormat.format(lValueOf) + ", " + this.C.format(lValueOf);
                    str2 = " - " + this.C.format(lValueOf2);
                    viewHolder2.tvProgramStartDate.setText(str);
                    textView = viewHolder2.tvProgramStopDate;
                }
                textView.setText(str2);
                str3 = str2;
                str4 = str;
                i4 = 0;
            }
            viewHolder2.ll_list_view.setOnClickListener(new a(i2, strN, i3, strReplace, strE, strD, viewHolder2, strB, str4, str3, i4));
            if (this.D == i2) {
                viewHolder = viewHolder2;
                viewHolder.ll_list_view.setBackground(this.f27719h.getResources().getDrawable(R.color.hp_cyan));
                viewHolder.ll_list_view.requestFocus();
            } else {
                viewHolder = viewHolder2;
                viewHolder.ll_list_view.setBackground(this.f27719h.getResources().getDrawable(R.drawable.left_recycler_sidebar_tv));
            }
            if (i2 != f27717f || this.f27726o) {
                return;
            }
            this.f27726o = true;
            viewHolder.ll_list_view.setBackground(this.f27719h.getResources().getDrawable(R.color.hp_cyan));
            if (Build.VERSION.SDK_INT >= 23) {
                ((SearchActivity) this.f27719h).J0(strReplace, strB, str4, str3, i4);
            } else {
                ((SearchActivityLowerSDK) this.f27719h).w(strReplace, strB, str4, str3, i4);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.e0 H(@NotNull ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        if (this.f27723l.equals("tv")) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.right_side_programs_search_adapter_tv;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.right_side_programs_search_adapter;
        }
        return new ViewHolder(layoutInflaterFrom.inflate(i3, viewGroup, false));
    }

    public void W() {
        try {
            int iS0 = m.f(this.f27719h).equals("m3u") ? s0(this.A, "m3u") : s0(String.valueOf(this.B), "api");
            if (!this.f27723l.equals("tv")) {
                ArrayList<c.h.a.i.f> arrayList = this.x;
                if (arrayList == null || arrayList.size() <= 0) {
                    p.b().j(null);
                    return;
                } else {
                    p.b().j(this.x);
                    c.h.a.h.n.e.X(this.f27719h, "Built-in Player ( Default )", this.B, "live", iS0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, this.y, this.A, this.z);
                    return;
                }
            }
            String strL = m.l(this.f27719h);
            Intent intent = (strL == null || !strL.equalsIgnoreCase("default_native")) ? new Intent(this.f27719h, (Class<?>) NSTIJKPlayerSkyTvActivity.class) : new Intent(this.f27719h, (Class<?>) NSTEXOPlayerSkyTvActivity.class);
            intent.putExtra("OPENED_STREAM_ID", this.B);
            intent.putExtra("VIDEO_NUM", iS0);
            intent.putExtra("OPENED_CAT_ID", this.y);
            intent.putExtra("VIDEO_URL", this.A);
            intent.putExtra("OPENED_CAT_NAME", this.z);
            intent.putExtra("FROM_SEARCH", "true");
            this.f27719h.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        ArrayList<XMLTVProgrammePojo> arrayList = this.f27718g;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f27718g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int r(int i2) {
        return 0;
    }

    public String r0(String str) {
        try {
            this.x = this.u.W0(str, "live");
            return "get_all";
        } catch (Exception unused) {
            return "get_all";
        }
    }

    public int s0(String str, String str2) {
        ArrayList<c.h.a.i.f> arrayList = this.x;
        if (arrayList != null && arrayList.size() > 0) {
            if (str2.equals("m3u")) {
                for (int i2 = 0; i2 < this.x.size(); i2++) {
                    if (this.x.get(i2).e0().equals(str)) {
                        return i2;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.x.size(); i3++) {
                    if (this.x.get(i3).Y().equals(str)) {
                        return i3;
                    }
                }
            }
        }
        return 0;
    }

    public final void t0() {
        ProgressDialog progressDialog = this.f27725n;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f27725n.dismiss();
    }

    public final Boolean u0() {
        try {
            if (this.f27719h != null) {
                ArrayList<e> arrayList = this.t;
                if (arrayList != null) {
                    arrayList.clear();
                }
                this.t = this.u.o1();
                e eVar = new e();
                e eVar2 = new e();
                e eVar3 = new e();
                int iQ1 = this.u.Q1("live");
                eVar.g("0");
                eVar.h(this.f27719h.getResources().getString(R.string.all));
                eVar.i(iQ1);
                eVar2.g("-1");
                eVar2.h(this.f27719h.getResources().getString(R.string.favourites));
                this.v = m.f(this.f27719h).equals("m3u") ? this.u.W1("live") : this.u.T1("-2", "live");
                int i2 = this.v;
                if (i2 != 0 && i2 > 0) {
                    eVar3.g("-2");
                    eVar3.h(this.f27719h.getResources().getString(R.string.uncategories));
                    eVar3.i(this.v);
                    ArrayList<e> arrayList2 = this.t;
                    arrayList2.add(arrayList2.size(), eVar3);
                }
                this.t.add(0, eVar);
                this.t.add(1, eVar2);
            }
            return Boolean.TRUE;
        } catch (NullPointerException unused) {
            return Boolean.FALSE;
        } catch (Exception unused2) {
            return Boolean.FALSE;
        }
    }

    public final void v0() {
        new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public final void w0(int i2, String str, String str2) {
        this.y = str;
        this.B = i2;
        this.A = str2;
        v0();
    }

    public final void x0() {
        ArrayList<e> arrayList = this.t;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList<e> arrayList2 = this.w;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<e> arrayList3 = new ArrayList<>();
        this.w = arrayList3;
        arrayList3.addAll(this.t);
        int i2 = 0;
        while (true) {
            if (i2 >= this.t.size()) {
                break;
            }
            if (this.y.equals(String.valueOf(this.t.get(i2).b()))) {
                this.z = this.t.get(i2).c();
                break;
            }
            i2++;
        }
        ArrayList<e> arrayList4 = this.w;
        if (arrayList4 == null || arrayList4.size() <= 0) {
            return;
        }
        p.b().i(this.w);
        c.h.a.h.n.e.f17065g = new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", this.y);
    }

    public final void y0() {
        ProgressDialog progressDialog = new ProgressDialog(this.f27719h);
        this.f27725n = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f27725n.setMessage(this.f27719h.getResources().getString(R.string.please_wait));
        this.f27725n.show();
    }
}
