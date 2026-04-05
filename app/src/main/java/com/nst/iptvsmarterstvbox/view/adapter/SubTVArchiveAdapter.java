package com.nst.iptvsmarterstvbox.view.adapter;

import a.b.q.j0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.h.n.e;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SubTVArchiveAdapter extends RecyclerView.h<MyViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SharedPreferences f28258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f28260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f28261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f28262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f28263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f28264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f28265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f28266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f28267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f28268o;
    public ArrayList<XMLTVProgrammePojo> p;
    public SharedPreferences q;
    public String r = new SimpleDateFormat("dd-MMM-yyyy", Locale.US).format(new Date());

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public LinearLayout ll_main_layout;

        @BindView
        public RelativeLayout rl_archive_layout;

        @BindView
        public TextView tvChannelName;

        @BindView
        public TextView tvDateTime;

        @BindView
        public TextView tvNowPlaying;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f28269b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f28269b = myViewHolder;
            myViewHolder.tvDateTime = (TextView) b.c.c.c(view, R.id.tv_date_time, "field 'tvDateTime'", TextView.class);
            myViewHolder.tvChannelName = (TextView) b.c.c.c(view, R.id.tv_channel_name, "field 'tvChannelName'", TextView.class);
            myViewHolder.tvNowPlaying = (TextView) b.c.c.c(view, R.id.tv_now_playing, "field 'tvNowPlaying'", TextView.class);
            myViewHolder.rl_archive_layout = (RelativeLayout) b.c.c.c(view, R.id.rl_archive_layout, "field 'rl_archive_layout'", RelativeLayout.class);
            myViewHolder.ll_main_layout = (LinearLayout) b.c.c.c(view, R.id.ll_main_layout, "field 'll_main_layout'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f28269b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f28269b = null;
            myViewHolder.tvDateTime = null;
            myViewHolder.tvChannelName = null;
            myViewHolder.tvNowPlaying = null;
            myViewHolder.rl_archive_layout = null;
            myViewHolder.ll_main_layout = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28272d;

        public a(String str, String str2, String str3) {
            this.f28270b = str;
            this.f28271c = str2;
            this.f28272d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i2;
            try {
                i2 = Integer.parseInt(SubTVArchiveAdapter.this.f28262i);
            } catch (NumberFormatException unused) {
                i2 = -1;
            }
            SubTVArchiveAdapter subTVArchiveAdapter = SubTVArchiveAdapter.this;
            subTVArchiveAdapter.p0(view, subTVArchiveAdapter.f28268o, this.f28270b, i2, SubTVArchiveAdapter.this.f28263j, SubTVArchiveAdapter.this.f28264k, SubTVArchiveAdapter.this.f28266m, SubTVArchiveAdapter.this.f28265l, this.f28271c, SubTVArchiveAdapter.this.f28267n, this.f28272d);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f28276d;

        public b(String str, String str2, String str3) {
            this.f28274b = str;
            this.f28275c = str2;
            this.f28276d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i2;
            try {
                i2 = Integer.parseInt(SubTVArchiveAdapter.this.f28262i);
            } catch (NumberFormatException unused) {
                i2 = -1;
            }
            e.U(SubTVArchiveAdapter.this.f28268o, this.f28274b, i2, SubTVArchiveAdapter.this.f28263j, SubTVArchiveAdapter.this.f28264k, SubTVArchiveAdapter.this.f28266m, SubTVArchiveAdapter.this.f28265l, this.f28275c, SubTVArchiveAdapter.this.f28267n, this.f28276d);
        }
    }

    public class c implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f28278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f28279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f28280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f28281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f28282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f28283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f28284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f28285h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f28286i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f28287j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f28288k;

        public c(ArrayList arrayList, Context context, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f28278a = arrayList;
            this.f28279b = context;
            this.f28280c = str;
            this.f28281d = i2;
            this.f28282e = str2;
            this.f28283f = str3;
            this.f28284g = str4;
            this.f28285h = str5;
            this.f28286i = str6;
            this.f28287j = str7;
            this.f28288k = str8;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ArrayList arrayList = this.f28278a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < this.f28278a.size()) {
                            if (menuItem.getItemId() != i2) {
                                i2++;
                            } else if (menuItem.getItemId() == 0) {
                                e.U(this.f28279b, this.f28280c, this.f28281d, this.f28282e, this.f28283f, this.f28284g, this.f28285h, this.f28286i, this.f28287j, this.f28288k);
                            } else {
                                String strE = e.E(this.f28279b, this.f28281d, this.f28286i, this.f28288k);
                                Intent intent = new Intent(this.f28279b, (Class<?>) PlayExternalPlayerActivity.class);
                                intent.putExtra("url", strE);
                                intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f28278a.get(i2)).a());
                                intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f28278a.get(i2)).b());
                                this.f28279b.startActivity(intent);
                            }
                        }
                    }
                }
                break;
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public class d implements j0.c {
        public d() {
        }

        @Override // a.b.q.j0.c
        public void a(j0 j0Var) {
        }
    }

    public SubTVArchiveAdapter(ArrayList arrayList, int i2, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, Context context) {
        this.p = arrayList;
        this.f28268o = context;
        this.f28259f = i2;
        this.f28260g = str;
        this.f28261h = z;
        this.f28262i = str2;
        this.f28263j = str3;
        this.f28264k = str4;
        this.f28265l = str5;
        this.f28266m = str6;
        this.f28267n = str7;
    }

    public final long m0(String str, String str2) {
        long time;
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        new Date(System.currentTimeMillis());
        new SimpleDateFormat("yyyy-MM-dd", locale);
        try {
            time = simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime();
        } catch (ParseException e2) {
            e2.printStackTrace();
            time = -1;
        }
        long j2 = time / 1000;
        long j3 = j2 / 60;
        long j4 = j2 % 60;
        return j3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void F(MyViewHolder myViewHolder, int i2) {
        RelativeLayout relativeLayout;
        int color;
        try {
            Context context = this.f28268o;
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("selectedPlayer", 0);
                this.q = sharedPreferences;
                String string = sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
                String strJ = this.p.get(i2).j();
                String strL = this.p.get(i2).l();
                SharedPreferences sharedPreferences2 = this.f28268o.getSharedPreferences("timeFormat", 0);
                f28258e = sharedPreferences2;
                new SimpleDateFormat(sharedPreferences2.getString("timeFormat", BuildConfig.FLAVOR), Locale.US);
                String strX = e.x(strJ, this.f28268o);
                String strX2 = e.x(strL, this.f28268o);
                DateFormat.getInstance();
                String strValueOf = String.valueOf(m0(strJ, strL));
                String strQ0 = q0(strJ);
                String str = new String(Base64.decode(this.p.get(i2).m(), 0), StandardCharsets.UTF_8);
                myViewHolder.tvDateTime.setText(strX + " - " + strX2);
                myViewHolder.tvChannelName.setText(str);
                String str2 = this.r;
                if (str2 != null && str2.equals(this.f28260g) && i2 == this.f28259f && this.f28261h) {
                    relativeLayout = myViewHolder.rl_archive_layout;
                    color = this.f28268o.getResources().getColor(R.color.active_green);
                    relativeLayout.setBackgroundColor(color);
                    myViewHolder.rl_archive_layout.setOnClickListener(new a(string, strQ0, strValueOf));
                    myViewHolder.ll_main_layout.setOnClickListener(new b(string, strQ0, strValueOf));
                }
                relativeLayout = myViewHolder.rl_archive_layout;
                Resources resources = this.f28268o.getResources();
                color = resources.getColor(R.color.tv_archive);
                relativeLayout.setBackgroundColor(color);
                myViewHolder.rl_archive_layout.setOnClickListener(new a(string, strQ0, strValueOf));
                myViewHolder.ll_main_layout.setOnClickListener(new b(string, strQ0, strValueOf));
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.p.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_streams_epg_layout, viewGroup, false);
        if (viewInflate != null) {
            viewInflate.setFocusable(true);
        }
        return new MyViewHolder(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca A[Catch: Exception -> 0x00ce, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ce, blocks: (B:12:0x00be, B:14:0x00ca), top: B:18:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p0(android.view.View r16, android.content.Context r17, java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.adapter.SubTVArchiveAdapter.p0(android.view.View, android.content.Context, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final String q0(String str) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        new Date(System.currentTimeMillis());
        try {
            return new SimpleDateFormat("yyyy-MM-dd:HH-mm", locale).format(simpleDateFormat.parse(str));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
