package minefarts.iptvsmarters.view.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.h.n.e;
import c.h.a.i.f;
import c.h.a.i.q.m;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import minefarts.iptvsmarters.view.activity.SubTVArchiveActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TVArchiveAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f28291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f28292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<f> f28293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences f28294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<f> f28295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<f> f28296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.a f28297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.f f28298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MyViewHolder f28299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f28300n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SimpleDateFormat f28301o;

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public CardView cardView;

        @BindView
        public ImageView ivChannelLogo;

        @BindView
        public ImageView ivFavourite;

        @BindView
        public LinearLayout llMenu;

        @BindView
        public ProgressBar progressBar;

        @BindView
        public RelativeLayout rlChannelBottom;

        @BindView
        public RelativeLayout rlMovieImage;

        @BindView
        public RelativeLayout rlStreamsLayout;

        @BindView
        public TextView tvChannelName;

        @BindView
        public TextView tvCurrentLive;

        @BindView
        public TextView tvStreamOptions;

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
        public MyViewHolder f28302b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f28302b = myViewHolder;
            myViewHolder.ivChannelLogo = (ImageView) b.c.c.c(view, R.id.iv_channel_logo, "field 'ivChannelLogo'", ImageView.class);
            myViewHolder.tvChannelName = (TextView) b.c.c.c(view, R.id.tv_movie_name, "field 'tvChannelName'", TextView.class);
            myViewHolder.cardView = (CardView) b.c.c.c(view, R.id.card_view, "field 'cardView'", CardView.class);
            myViewHolder.tvStreamOptions = (TextView) b.c.c.c(view, R.id.tv_streamOptions, "field 'tvStreamOptions'", TextView.class);
            myViewHolder.ivFavourite = (ImageView) b.c.c.c(view, R.id.iv_favourite, "field 'ivFavourite'", ImageView.class);
            myViewHolder.rlStreamsLayout = (RelativeLayout) b.c.c.c(view, R.id.rl_streams_layout, "field 'rlStreamsLayout'", RelativeLayout.class);
            myViewHolder.rlChannelBottom = (RelativeLayout) b.c.c.c(view, R.id.rl_channel_bottom, "field 'rlChannelBottom'", RelativeLayout.class);
            myViewHolder.llMenu = (LinearLayout) b.c.c.c(view, R.id.ll_menu, "field 'llMenu'", LinearLayout.class);
            myViewHolder.progressBar = (ProgressBar) b.c.c.c(view, R.id.progressBar, "field 'progressBar'", ProgressBar.class);
            myViewHolder.tvCurrentLive = (TextView) b.c.c.c(view, R.id.tv_current_live, "field 'tvCurrentLive'", TextView.class);
            myViewHolder.tvTime = (TextView) b.c.c.c(view, R.id.tv_time, "field 'tvTime'", TextView.class);
            myViewHolder.rlMovieImage = (RelativeLayout) b.c.c.c(view, R.id.rl_movie_image, "field 'rlMovieImage'", RelativeLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f28302b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f28302b = null;
            myViewHolder.ivChannelLogo = null;
            myViewHolder.tvChannelName = null;
            myViewHolder.cardView = null;
            myViewHolder.tvStreamOptions = null;
            myViewHolder.ivFavourite = null;
            myViewHolder.rlStreamsLayout = null;
            myViewHolder.rlChannelBottom = null;
            myViewHolder.llMenu = null;
            myViewHolder.progressBar = null;
            myViewHolder.tvCurrentLive = null;
            myViewHolder.tvTime = null;
            myViewHolder.rlMovieImage = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28308g;

        public a(String str, int i2, String str2, String str3, String str4, String str5) {
            this.f28303b = str;
            this.f28304c = i2;
            this.f28305d = str2;
            this.f28306e = str3;
            this.f28307f = str4;
            this.f28308g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(TVArchiveAdapter.this.f28292f, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f28303b);
            intent.putExtra("OPENED_STREAM_ID", this.f28304c);
            intent.putExtra("OPENED_NUM", this.f28305d);
            intent.putExtra("OPENED_NAME", this.f28306e);
            intent.putExtra("OPENED_STREAM_ICON", this.f28307f);
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f28308g);
            TVArchiveAdapter.this.f28292f.startActivity(intent);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28315g;

        public b(String str, int i2, String str2, String str3, String str4, String str5) {
            this.f28310b = str;
            this.f28311c = i2;
            this.f28312d = str2;
            this.f28313e = str3;
            this.f28314f = str4;
            this.f28315g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(TVArchiveAdapter.this.f28292f, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f28310b);
            intent.putExtra("OPENED_STREAM_ID", this.f28311c);
            intent.putExtra("OPENED_NUM", this.f28312d);
            intent.putExtra("OPENED_NAME", this.f28313e);
            intent.putExtra("OPENED_STREAM_ICON", this.f28314f);
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f28315g);
            TVArchiveAdapter.this.f28292f.startActivity(intent);
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28322g;

        public c(String str, int i2, String str2, String str3, String str4, String str5) {
            this.f28317b = str;
            this.f28318c = i2;
            this.f28319d = str2;
            this.f28320e = str3;
            this.f28321f = str4;
            this.f28322g = str5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(TVArchiveAdapter.this.f28292f, (Class<?>) SubTVArchiveActivity.class);
            intent.putExtra("OPENED_CHANNEL_ID", this.f28317b);
            intent.putExtra("OPENED_STREAM_ID", this.f28318c);
            intent.putExtra("OPENED_NUM", this.f28319d);
            intent.putExtra("OPENED_NAME", this.f28320e);
            intent.putExtra("OPENED_STREAM_ICON", this.f28321f);
            intent.putExtra("OPENED_ARCHIVE_DURATION", this.f28322g);
            TVArchiveAdapter.this.f28292f.startActivity(intent);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f28325c;

        public class a implements Runnable {
            public a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r2 = this;
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter$d r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.d.this
                    java.lang.String r0 = r0.f28324b
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L16
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter$d r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.d.this
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.this
                    java.util.List r1 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.e0(r0)
                L12:
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.h0(r0, r1)
                    goto L3b
                L16:
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter$d r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.d.this
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.this
                    java.util.List r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.Z(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L32
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter$d r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.d.this
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.this
                    java.util.List r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.Z(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L3b
                L32:
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter$d r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.d.this
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.this
                    java.util.List r1 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.Z(r0)
                    goto L12
                L3b:
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter$d r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.d.this
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.this
                    java.util.List r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.g0(r0)
                    int r0 = r0.size()
                    if (r0 != 0) goto L51
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter$d r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.d.this
                    android.widget.TextView r0 = r0.f28325c
                    r1 = 0
                    r0.setVisibility(r1)
                L51:
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter$d r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.d.this
                    minefarts.iptvsmarters.view.adapter.TVArchiveAdapter r0 = minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.this
                    r0.w()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.TVArchiveAdapter.d.a.run():void");
            }
        }

        public d(String str, TextView textView) {
            this.f28324b = str;
            this.f28325c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            TVArchiveAdapter.this.f28295i = new ArrayList();
            if (TVArchiveAdapter.this.f28295i != null) {
                TVArchiveAdapter.this.f28295i.clear();
            }
            if (TextUtils.isEmpty(this.f28324b)) {
                TVArchiveAdapter.this.f28295i.addAll(TVArchiveAdapter.this.f28296j);
            } else {
                for (f fVar : TVArchiveAdapter.this.f28293g) {
                    if (fVar.getName().toLowerCase().contains(this.f28324b.toLowerCase())) {
                        TVArchiveAdapter.this.f28295i.add(fVar);
                    }
                }
            }
            ((Activity) TVArchiveAdapter.this.f28292f).runOnUiThread(new a());
        }
    }

    public TVArchiveAdapter(List<f> list, Context context) {
        this.f28293g = list;
        this.f28292f = context;
        ArrayList arrayList = new ArrayList();
        this.f28295i = arrayList;
        arrayList.addAll(list);
        this.f28296j = list;
        this.f28297k = new c.h.a.i.q.a(context);
        this.f28298l = new c.h.a.i.q.f(context);
    }

    public void i0(String str, TextView textView) {
        new Thread(new d(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @SuppressLint({"SimpleDateFormat", "SetTextI18n"})
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        int i3;
        int i4;
        ImageView imageView;
        int i5;
        c.h.a.i.q.f fVar;
        ArrayList<XMLTVProgrammePojo> arrayListV1;
        int iZ;
        Context context = this.f28292f;
        if (context != null) {
            this.f28294h = context.getSharedPreferences("selectedPlayer", 0);
            try {
                i3 = Integer.parseInt(this.f28293g.get(i2).Y().trim());
            } catch (NumberFormatException unused) {
                i3 = -1;
            }
            String strG = this.f28293g.get(i2).g();
            String strI = this.f28293g.get(i2).I();
            myViewHolder.tvTime.setText(BuildConfig.FLAVOR);
            myViewHolder.progressBar.setVisibility(8);
            myViewHolder.tvCurrentLive.setText(BuildConfig.FLAVOR);
            if (strI == null || strI.equals(BuildConfig.FLAVOR) || (fVar = this.f28298l) == null || (arrayListV1 = fVar.v1(strI)) == null) {
                i4 = i3;
            } else {
                int i6 = 0;
                while (i6 < arrayListV1.size()) {
                    String strJ = arrayListV1.get(i6).j();
                    String strL = arrayListV1.get(i6).l();
                    String strM = arrayListV1.get(i6).m();
                    arrayListV1.get(i6).b();
                    Long lValueOf = Long.valueOf(e.n(strJ, this.f28292f));
                    Long lValueOf2 = Long.valueOf(e.n(strL, this.f28292f));
                    i4 = i3;
                    if (!e.L(lValueOf.longValue(), lValueOf2.longValue(), this.f28292f) || (iZ = e.z(lValueOf.longValue(), lValueOf2.longValue(), this.f28292f)) == 0) {
                        i6++;
                        i3 = i4;
                    } else {
                        int i7 = 100 - iZ;
                        if (i7 == 0 || strM.equals(BuildConfig.FLAVOR)) {
                            myViewHolder.tvTime.setVisibility(8);
                            myViewHolder.progressBar.setVisibility(8);
                            myViewHolder.tvCurrentLive.setVisibility(8);
                        } else {
                            if (c.h.a.h.n.a.u == 0) {
                                myViewHolder.tvTime.setVisibility(0);
                                SharedPreferences sharedPreferences = this.f28292f.getSharedPreferences("timeFormat", 0);
                                f28291e = sharedPreferences;
                                this.f28301o = new SimpleDateFormat(sharedPreferences.getString("timeFormat", c.h.a.h.n.a.m0));
                                myViewHolder.tvTime.setText(this.f28301o.format(lValueOf) + " - " + this.f28301o.format(lValueOf2));
                            }
                            myViewHolder.progressBar.setVisibility(0);
                            myViewHolder.progressBar.setProgress(i7);
                            myViewHolder.tvCurrentLive.setVisibility(0);
                            myViewHolder.tvCurrentLive.setText(strM);
                        }
                    }
                }
                i4 = i3;
            }
            String strP = this.f28293g.get(i2).P();
            String name = this.f28293g.get(i2).getName();
            myViewHolder.tvChannelName.setText(this.f28293g.get(i2).getName());
            String strX = this.f28293g.get(i2).X();
            String strI2 = this.f28293g.get(i2).I();
            String strB0 = this.f28293g.get(i2).b0();
            myViewHolder.ivChannelLogo.setImageDrawable(null);
            if (strX != null && !strX.equals(BuildConfig.FLAVOR)) {
                t.q(this.f28292f).l(strX).j(R.drawable.logo_placeholder_white).g(myViewHolder.ivChannelLogo);
            } else if (Build.VERSION.SDK_INT >= 21) {
                myViewHolder.ivChannelLogo.setImageDrawable(this.f28292f.getResources().getDrawable(R.drawable.logo_placeholder_white, null));
            } else {
                myViewHolder.ivChannelLogo.setImageDrawable(a.i.i.b.f(this.f28292f, R.drawable.logo_placeholder_white));
            }
            int i8 = i4;
            myViewHolder.cardView.setOnClickListener(new a(strI2, i8, strP, name, strX, strB0));
            myViewHolder.rlMovieImage.setOnClickListener(new b(strI2, i8, strP, name, strX, strB0));
            myViewHolder.rlStreamsLayout.setOnClickListener(new c(strI2, i8, strP, name, strX, strB0));
            ArrayList<c.h.a.i.b> arrayListL = this.f28297k.l(i8, strG, "live", m.z(this.f28292f));
            if (arrayListL == null || arrayListL.size() <= 0) {
                imageView = myViewHolder.ivFavourite;
                i5 = 4;
            } else {
                imageView = myViewHolder.ivFavourite;
                i5 = 0;
            }
            imageView.setVisibility(i5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        SharedPreferences sharedPreferences = this.f28292f.getSharedPreferences("listgridview", 0);
        this.f28300n = sharedPreferences;
        int i3 = sharedPreferences.getInt("livestream", 0);
        c.h.a.h.n.a.u = i3;
        MyViewHolder myViewHolder = i3 == 1 ? new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_streams_grid_layout, viewGroup, false)) : new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_streams_linear_layout, viewGroup, false));
        this.f28299m = myViewHolder;
        return myViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f28293g.size();
    }
}
