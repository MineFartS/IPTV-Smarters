package minefarts.iptvsmarters.view.adapter;

import a.b.q.j0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
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
import c.h.a.i.q.m;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class LiveStreamsAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f27490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f27491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<c.h.a.i.f> f27492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences f27493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<c.h.a.i.f> f27494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<c.h.a.i.f> f27495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.a f27496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.f f27497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MyViewHolder f27498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f27499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SimpleDateFormat f27500o;
    public int p;
    public int q;

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
        public MyViewHolder f27501b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27501b = myViewHolder;
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
            MyViewHolder myViewHolder = this.f27501b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27501b = null;
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
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27509f;

        public d(MyViewHolder myViewHolder, int i2, String str, String str2, String str3) {
            this.f27505b = myViewHolder;
            this.f27506c = i2;
            this.f27507d = str;
            this.f27508e = str2;
            this.f27509f = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LiveStreamsAdapter.this.p0(this.f27505b, this.f27506c, this.f27507d, this.f27508e, this.f27509f);
            return true;
        }
    }

    public class e implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27515f;

        public e(MyViewHolder myViewHolder, int i2, String str, String str2, String str3) {
            this.f27511b = myViewHolder;
            this.f27512c = i2;
            this.f27513d = str;
            this.f27514e = str2;
            this.f27515f = str3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            LiveStreamsAdapter.this.p0(this.f27511b, this.f27512c, this.f27513d, this.f27514e, this.f27515f);
            return true;
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27520e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f27521f;

        public f(MyViewHolder myViewHolder, int i2, String str, String str2, String str3) {
            this.f27517b = myViewHolder;
            this.f27518c = i2;
            this.f27519d = str;
            this.f27520e = str2;
            this.f27521f = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LiveStreamsAdapter.this.p0(this.f27517b, this.f27518c, this.f27519d, this.f27520e, this.f27521f);
        }
    }

    public class g implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27527e;

        public g(MyViewHolder myViewHolder, String str, int i2, String str2, String str3) {
            this.f27523a = myViewHolder;
            this.f27524b = str;
            this.f27525c = i2;
            this.f27526d = str2;
            this.f27527e = str3;
        }

        public final void a() {
            c.h.a.i.b bVar = new c.h.a.i.b();
            bVar.h(this.f27524b);
            bVar.m(this.f27525c);
            bVar.k(this.f27526d);
            bVar.l(this.f27527e);
            bVar.o(m.z(LiveStreamsAdapter.this.f27491f));
            LiveStreamsAdapter.this.f27496k.i(bVar, "live");
            this.f27523a.ivFavourite.setVisibility(0);
        }

        public final void b() {
            this.f27523a.cardView.performClick();
        }

        public final void c() {
            LiveStreamsAdapter.this.f27496k.o(this.f27525c, this.f27524b, "live", this.f27526d, m.z(LiveStreamsAdapter.this.f27491f));
            this.f27523a.ivFavourite.setVisibility(4);
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.nav_add_to_fav) {
                a();
                return false;
            }
            if (itemId == R.id.nav_play) {
                b();
                return false;
            }
            if (itemId != R.id.nav_remove_from_fav) {
                return false;
            }
            c();
            return false;
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f27530c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                LiveStreamsAdapter liveStreamsAdapter;
                List list;
                if (!TextUtils.isEmpty(h.this.f27529b)) {
                    if (!LiveStreamsAdapter.this.f27494i.isEmpty() || LiveStreamsAdapter.this.f27494i.isEmpty()) {
                        liveStreamsAdapter = LiveStreamsAdapter.this;
                        list = liveStreamsAdapter.f27494i;
                    }
                    if (LiveStreamsAdapter.this.f27492g != null && LiveStreamsAdapter.this.f27492g.size() == 0) {
                        h.this.f27530c.setVisibility(0);
                    }
                    LiveStreamsAdapter liveStreamsAdapter2 = LiveStreamsAdapter.this;
                    liveStreamsAdapter2.p = liveStreamsAdapter2.q;
                    liveStreamsAdapter2.w();
                }
                liveStreamsAdapter = LiveStreamsAdapter.this;
                list = liveStreamsAdapter.f27495j;
                liveStreamsAdapter.f27492g = list;
                if (LiveStreamsAdapter.this.f27492g != null) {
                    h.this.f27530c.setVisibility(0);
                }
                LiveStreamsAdapter liveStreamsAdapter22 = LiveStreamsAdapter.this;
                liveStreamsAdapter22.p = liveStreamsAdapter22.q;
                liveStreamsAdapter22.w();
            }
        }

        public h(String str, TextView textView) {
            this.f27529b = str;
            this.f27530c = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r4 = this;
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.g0(r0, r1)
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.lang.String r1 = r4.f27529b
                int r1 = r1.length()
                r0.q = r1
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.e0(r0)
                if (r0 == 0) goto L25
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.e0(r0)
                r0.clear()
            L25:
                java.lang.String r0 = r4.f27529b
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L3d
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.e0(r0)
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r1 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.List r1 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.h0(r1)
                r0.addAll(r1)
                goto La4
            L3d:
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.i0(r0)
                if (r0 == 0) goto L51
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.i0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L59
            L51:
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                int r1 = r0.p
                int r0 = r0.q
                if (r1 <= r0) goto L62
            L59:
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.List r1 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.h0(r0)
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.l0(r0, r1)
            L62:
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.i0(r0)
                if (r0 == 0) goto La4
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.List r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.i0(r0)
                java.util.Iterator r0 = r0.iterator()
            L74:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto La4
                java.lang.Object r1 = r0.next()
                c.h.a.i.f r1 = (c.h.a.i.f) r1
                java.lang.String r2 = r1.getName()
                if (r2 == 0) goto L74
                java.lang.String r2 = r1.getName()
                java.lang.String r2 = r2.toLowerCase()
                java.lang.String r3 = r4.f27529b
                java.lang.String r3 = r3.toLowerCase()
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L74
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r2 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                java.util.List r2 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.e0(r2)
                r2.add(r1)
                goto L74
            La4:
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.this
                android.content.Context r0 = minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.Z(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter$h$a r1 = new minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter$h$a
                r1.<init>()
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter.h.run():void");
        }
    }

    public LiveStreamsAdapter(List<c.h.a.i.f> list, Context context) {
        this.f27492g = list;
        this.f27491f = context;
        ArrayList arrayList = new ArrayList();
        this.f27494i = arrayList;
        arrayList.addAll(list);
        this.f27495j = list;
        this.f27496k = new c.h.a.i.q.a(context);
        this.f27497l = new c.h.a.i.q.f(context);
    }

    public void m0(String str, TextView textView) {
        new Thread(new h(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @SuppressLint({"SimpleDateFormat", "SetTextI18n"})
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        int i3;
        String str;
        ImageView imageView;
        Drawable drawableF;
        ImageView imageView2;
        int i4;
        c.h.a.i.q.f fVar;
        ArrayList<XMLTVProgrammePojo> arrayListV1;
        int iZ;
        Context context = this.f27491f;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
            this.f27493h = sharedPreferences;
            String str2 = BuildConfig.FLAVOR;
            sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
            try {
                i3 = Integer.parseInt(this.f27492g.get(i2).Y().trim());
            } catch (NumberFormatException unused) {
                i3 = -1;
            }
            String strG = this.f27492g.get(i2).g();
            this.f27492g.get(i2).Z();
            String strI = this.f27492g.get(i2).I();
            String strP = this.f27492g.get(i2).P();
            myViewHolder.tvTime.setText(BuildConfig.FLAVOR);
            myViewHolder.progressBar.setVisibility(8);
            myViewHolder.tvCurrentLive.setText(BuildConfig.FLAVOR);
            if (strI == null || strI.equals(BuildConfig.FLAVOR) || (fVar = this.f27497l) == null || (arrayListV1 = fVar.v1(strI)) == null) {
                str = str2;
            } else {
                int i5 = 0;
                while (i5 < arrayListV1.size()) {
                    String strJ = arrayListV1.get(i5).j();
                    String strL = arrayListV1.get(i5).l();
                    String strM = arrayListV1.get(i5).m();
                    arrayListV1.get(i5).b();
                    Long lValueOf = Long.valueOf(c.h.a.h.n.e.n(strJ, this.f27491f));
                    Long lValueOf2 = Long.valueOf(c.h.a.h.n.e.n(strL, this.f27491f));
                    String str3 = str2;
                    if (!c.h.a.h.n.e.L(lValueOf.longValue(), lValueOf2.longValue(), this.f27491f) || (iZ = c.h.a.h.n.e.z(lValueOf.longValue(), lValueOf2.longValue(), this.f27491f)) == 0) {
                        i5++;
                        str2 = str3;
                    } else {
                        int i6 = 100 - iZ;
                        str = str3;
                        if (i6 == 0 || strM.equals(str)) {
                            myViewHolder.tvTime.setVisibility(8);
                            myViewHolder.progressBar.setVisibility(8);
                            myViewHolder.tvCurrentLive.setVisibility(8);
                        } else {
                            if (c.h.a.h.n.a.u == 0) {
                                myViewHolder.tvTime.setVisibility(0);
                                SharedPreferences sharedPreferences2 = this.f27491f.getSharedPreferences("timeFormat", 0);
                                f27490e = sharedPreferences2;
                                this.f27500o = new SimpleDateFormat(sharedPreferences2.getString("timeFormat", c.h.a.h.n.a.m0));
                                myViewHolder.tvTime.setText(this.f27500o.format(lValueOf) + " - " + this.f27500o.format(lValueOf2));
                            }
                            myViewHolder.progressBar.setVisibility(0);
                            myViewHolder.progressBar.setProgress(i6);
                            myViewHolder.tvCurrentLive.setVisibility(0);
                            myViewHolder.tvCurrentLive.setText(strM);
                        }
                    }
                }
                str = str2;
            }
            this.f27492g.get(i2).P();
            String name = this.f27492g.get(i2).getName();
            myViewHolder.tvChannelName.setText(this.f27492g.get(i2).getName());
            String strX = this.f27492g.get(i2).X();
            this.f27492g.get(i2).I();
            myViewHolder.ivChannelLogo.setImageDrawable(null);
            if (strX == null || strX.equals(str)) {
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView = myViewHolder.ivChannelLogo;
                    drawableF = this.f27491f.getResources().getDrawable(R.drawable.logo_placeholder_white, null);
                } else {
                    imageView = myViewHolder.ivChannelLogo;
                    drawableF = a.i.i.b.f(this.f27491f, R.drawable.logo_placeholder_white);
                }
                imageView.setImageDrawable(drawableF);
            } else {
                t.q(this.f27491f).l(strX).j(R.drawable.logo_placeholder_white).g(myViewHolder.ivChannelLogo);
            }
            myViewHolder.cardView.setOnClickListener(new a());
            myViewHolder.rlMovieImage.setOnClickListener(new b());
            myViewHolder.rlStreamsLayout.setOnClickListener(new c());
            ArrayList<c.h.a.i.b> arrayListL = this.f27496k.l(i3, strG, "live", m.z(this.f27491f));
            if (arrayListL == null || arrayListL.size() <= 0) {
                imageView2 = myViewHolder.ivFavourite;
                i4 = 4;
            } else {
                imageView2 = myViewHolder.ivFavourite;
                i4 = 0;
            }
            imageView2.setVisibility(i4);
            int i7 = i3;
            myViewHolder.rlStreamsLayout.setOnLongClickListener(new d(myViewHolder, i7, strG, name, strP));
            myViewHolder.rlMovieImage.setOnLongClickListener(new e(myViewHolder, i7, strG, name, strP));
            myViewHolder.llMenu.setOnClickListener(new f(myViewHolder, i7, strG, name, strP));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        List<c.h.a.i.f> list = this.f27492g;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        SharedPreferences sharedPreferences = this.f27491f.getSharedPreferences("listgridview", 0);
        this.f27499n = sharedPreferences;
        int i3 = sharedPreferences.getInt("livestream", 0);
        c.h.a.h.n.a.u = i3;
        MyViewHolder myViewHolder = i3 == 1 ? new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_streams_grid_layout, viewGroup, false)) : new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_streams_linear_layout, viewGroup, false));
        this.f27498m = myViewHolder;
        return myViewHolder;
    }

    public final void p0(MyViewHolder myViewHolder, int i2, String str, String str2, String str3) {
        j0 j0Var = new j0(this.f27491f, myViewHolder.tvStreamOptions);
        j0Var.d(R.menu.menu_card_live_streams);
        (this.f27496k.l(i2, str, "live", m.z(this.f27491f)).size() > 0 ? j0Var.b().getItem(2) : j0Var.b().getItem(1)).setVisible(true);
        j0Var.f(new g(myViewHolder, str, i2, str2, str3));
        j0Var.g();
    }
}
