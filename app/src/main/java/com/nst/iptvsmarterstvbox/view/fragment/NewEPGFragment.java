package minefarts.iptvsmarters.view.fragment;

import a.b.k.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import c.f.b.b.d0;
import c.h.a.h.l;
import c.h.a.i.q.f;
import c.h.a.i.q.i;
import c.h.a.i.q.m;
import com.google.android.exoplayer2.ui.PlayerView;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import minefarts.iptvsmarters.view.activity.NewDashboardActivity;
import minefarts.iptvsmarters.view.activity.SettingsActivity;
import minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG;
import minefarts.iptvsmarters.view.utility.epg.EPG;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes2.dex */
public class NewEPGFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f28896b = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c.h.a.k.d.a.a f28897c;
    public SharedPreferences A;
    public SharedPreferences D;
    public String E;
    public String F;

    @BindView
    public LinearLayout app_video_box;

    @BindView
    public ProgressBar app_video_loading;

    @BindView
    public LinearLayout app_video_status;

    @BindView
    public TextView app_video_status_text;

    @BindView
    public TextView currentEvent;

    @BindView
    public TextView currentEventDescription;

    @BindView
    public TextView currentEventTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f28898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.h.a.i.q.a f28899e;

    @BindView
    public EPG epg;

    @BindView
    public RelativeLayout epgFragment;

    @BindView
    public LinearLayout epgView;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Unbinder f28900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f28901g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SharedPreferences f28904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f28905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f28906l;

    @BindView
    public NSTIJKPlayerSmallEPG mVideoView;
    public Toolbar p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public PlayerView player_view;
    public TextView q;
    public TextView r;

    @BindView
    public RelativeLayout rl_add_channel_to_fav;
    public TextView s;
    public Handler t;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;

    @BindView
    public TextView tv_cat_title;
    public SharedPreferences w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.f f28902h = new c.h.a.i.f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<?> f28903i = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.b f28907m = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.q.b f28908n = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f28909o = new ArrayList<>();
    public int u = 0;
    public boolean v = false;
    public String x = "0";
    public String y = "ALL";
    public AsyncTask z = null;
    public int B = 4;
    public int C = f28896b[0];
    public l G = new l();

    public class a implements View.OnKeyListener {
        public a() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            EPG epg;
            if (keyEvent.getAction() == 1) {
                return false;
            }
            if ((i2 == 20 || i2 == 19 || i2 == 22 || i2 == 21 || i2 == 23 || i2 == 66) && (epg = NewEPGFragment.this.epg) != null) {
                return epg.onKeyDown(i2, keyEvent);
            }
            return false;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class b extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EPG f28911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28912b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f28914d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList<i> f28916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList<c.h.a.i.f> f28917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList<c.h.a.i.f> f28918h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ArrayList<c.h.a.i.f> f28919i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ArrayList<c.h.a.i.f> f28920j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f28922l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f28923m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28913c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<String> f28915e = new ArrayList<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Map<c.h.a.k.h.d.c.a, List<c.h.a.k.h.d.c.b>> f28921k = d0.g();

        public b(EPG epg, int i2, String str, RelativeLayout relativeLayout) {
            this.f28922l = str;
            this.f28923m = relativeLayout;
            this.f28912b = 0;
            this.f28912b = i2;
            this.f28911a = epg;
            epg.a1 = 1;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            String string = NewEPGFragment.this.f28898d.getSharedPreferences("epgchannelupdate", 0).getString("epgchannelupdate", BuildConfig.FLAVOR);
            this.f28914d = NewEPGFragment.this.f28898d.getSharedPreferences("auto_start", 0).getBoolean("full_epg", false);
            try {
                if (string.equals("all")) {
                    h(this.f28922l);
                } else {
                    g(this.f28922l);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return Boolean.TRUE;
        }

        public ArrayList<c.h.a.i.f> b() {
            Context context = NewEPGFragment.this.f28898d;
            if (context == null) {
                return null;
            }
            if (m.f(context).equals("m3u")) {
                NewEPGFragment.this.f28901g = new f(NewEPGFragment.this.f28898d);
                ArrayList<c.h.a.i.c> arrayListB1 = NewEPGFragment.this.f28901g.B1("live");
                ArrayList<c.h.a.i.f> arrayList = new ArrayList<>();
                for (c.h.a.i.c cVar : arrayListB1) {
                    ArrayList<c.h.a.i.f> arrayListF1 = NewEPGFragment.this.f28901g.F1(cVar.a(), cVar.c());
                    if (arrayListF1 != null && arrayListF1.size() > 0) {
                        arrayList.add(arrayListF1.get(0));
                    }
                }
                if (arrayList.size() != 0) {
                    return arrayList;
                }
                return null;
            }
            NewEPGFragment.this.f28899e = new c.h.a.i.q.a(NewEPGFragment.this.f28898d);
            NewEPGFragment newEPGFragment = NewEPGFragment.this;
            ArrayList<c.h.a.i.b> arrayListP = newEPGFragment.f28899e.p("live", m.z(newEPGFragment.f28898d));
            ArrayList<c.h.a.i.f> arrayList2 = new ArrayList<>();
            for (c.h.a.i.b bVar : arrayListP) {
                c.h.a.i.f fVarD1 = new f(NewEPGFragment.this.f28898d).D1(bVar.a(), String.valueOf(bVar.e()));
                if (fVarD1 != null) {
                    arrayList2.add(fVarD1);
                }
            }
            if (arrayList2.size() != 0) {
                return arrayList2;
            }
            return null;
        }

        public final ArrayList<String> c() {
            NewEPGFragment newEPGFragment = NewEPGFragment.this;
            ArrayList<i> arrayListD1 = newEPGFragment.f28901g.d1(m.z(newEPGFragment.f28898d));
            this.f28916f = arrayListD1;
            if (arrayListD1 != null) {
                for (i iVar : arrayListD1) {
                    if (iVar.a().equals("1")) {
                        this.f28915e.add(iVar.b());
                    }
                }
            }
            return this.f28915e;
        }

        public final ArrayList<c.h.a.i.f> d(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
            ArrayList<c.h.a.i.f> arrayList3;
            if (arrayList == null) {
                return null;
            }
            for (c.h.a.i.f fVar : arrayList) {
                boolean z = false;
                if (arrayList2 != null) {
                    Iterator<String> it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (fVar.g().equals(it.next())) {
                            z = true;
                            break;
                        }
                    }
                    if (!z && (arrayList3 = this.f28917g) != null) {
                        arrayList3.add(fVar);
                    }
                }
            }
            return this.f28917g;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            Map<c.h.a.k.h.d.c.a, List<c.h.a.k.h.d.c.b>> map;
            EPG epg;
            if (NewEPGFragment.this.epgView == null || (map = this.f28921k) == null || map.size() <= 0 || (epg = this.f28911a) == null) {
                LinearLayout linearLayout = NewEPGFragment.this.epgView;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    NewEPGFragment.this.tvNoRecordFound.setVisibility(0);
                    NewEPGFragment newEPGFragment = NewEPGFragment.this;
                    newEPGFragment.tvNoRecordFound.setText(newEPGFragment.getResources().getString(R.string.no_epg_guide_found));
                }
            } else {
                epg.a1 = 0;
                epg.c0();
                NewEPGFragment.this.epgView.setVisibility(0);
                try {
                    this.f28911a.setEPGData(new c.h.a.k.h.d.d.a(this.f28921k));
                    EPG epg2 = this.f28911a;
                    epg2.i0(null, false, this.f28923m, epg2);
                } catch (Exception unused) {
                }
            }
            ProgressBar progressBar = NewEPGFragment.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            EPG epg;
            Map<c.h.a.k.h.d.c.a, List<c.h.a.k.h.d.c.b>> map = this.f28921k;
            if (map == null || map.size() <= 0) {
                return;
            }
            ProgressBar progressBar = NewEPGFragment.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (NewEPGFragment.this.epgView == null || (epg = this.f28911a) == null) {
                return;
            }
            epg.c0();
            NewEPGFragment.this.epgView.setVisibility(0);
            try {
                this.f28911a.setEPGData(new c.h.a.k.h.d.d.a(this.f28921k));
                EPG epg2 = this.f28911a;
                epg2.i0(null, false, this.f28923m, epg2);
            } catch (Exception unused) {
            }
        }

        public final void g(String str) {
            if (this.f28914d) {
                i(str);
            } else {
                j(str);
            }
        }

        public final void h(String str) {
            if (this.f28914d) {
                k(str);
            } else {
                l(str);
            }
        }

        public final void i(String str) {
            c.h.a.k.h.d.c.a aVar;
            c.h.a.k.h.d.c.a aVar2;
            l lVar;
            c.h.a.k.h.d.c.b bVar;
            NewEPGFragment.this.f28901g = new f(NewEPGFragment.this.f28898d);
            try {
                ArrayList<c.h.a.i.f> arrayListB = str.equals("-1") ? b() : new f(NewEPGFragment.this.f28898d).X0(str, "live");
                this.f28916f = new ArrayList<>();
                this.f28917g = new ArrayList<>();
                this.f28918h = new ArrayList<>();
                this.f28919i = new ArrayList<>();
                this.f28920j = new ArrayList<>();
                NewEPGFragment newEPGFragment = NewEPGFragment.this;
                if (newEPGFragment.f28901g.I1(m.z(newEPGFragment.f28898d)) > 0 && arrayListB != null) {
                    ArrayList<String> arrayListC = c();
                    this.f28915e = arrayListC;
                    if (arrayListC != null) {
                        this.f28918h = d(arrayListB, arrayListC);
                    }
                    arrayListB = this.f28918h;
                }
                this.f28919i = arrayListB;
                if (this.f28919i != null) {
                    int i2 = -1;
                    c.h.a.k.h.d.c.a aVar3 = null;
                    c.h.a.k.h.d.c.a aVar4 = null;
                    aVar2 = null;
                    int i3 = 0;
                    c.h.a.k.h.d.c.b bVar2 = null;
                    for (int i4 = 0; i4 < this.f28919i.size(); i4++) {
                        l lVar2 = NewEPGFragment.this.G;
                        if (lVar2 != null) {
                            lVar2.e();
                        }
                        if ((NewEPGFragment.this.z != null && NewEPGFragment.this.z.isCancelled()) || ((lVar = NewEPGFragment.this.G) != null && lVar.b())) {
                            break;
                        }
                        String name = this.f28919i.get(i4).getName();
                        String strI = this.f28919i.get(i4).I();
                        String strX = this.f28919i.get(i4).X();
                        String strY = this.f28919i.get(i4).Y();
                        String strP = this.f28919i.get(i4).P();
                        String strI2 = this.f28919i.get(i4).I();
                        String strE0 = this.f28919i.get(i4).e0();
                        String strG = this.f28919i.get(i4).g();
                        if (!strI.equals(BuildConfig.FLAVOR)) {
                            int i5 = i2 + 1;
                            ArrayList<XMLTVProgrammePojo> arrayListV1 = NewEPGFragment.this.f28901g.v1(strI);
                            if (arrayListV1 == null || arrayListV1.size() == 0) {
                                aVar4 = aVar4;
                                i2 = i5;
                            } else {
                                ArrayList<XMLTVProgrammePojo> arrayList = arrayListV1;
                                c.h.a.k.h.d.c.a aVar5 = aVar4;
                                c.h.a.k.h.d.c.a aVar6 = new c.h.a.k.h.d.c.a(strX, name, i3, strY, strP, strI2, strG, strE0, str);
                                i3++;
                                if (aVar2 == null) {
                                    aVar2 = aVar6;
                                }
                                if (aVar5 != null) {
                                    aVar6.o(aVar5);
                                    aVar5.n(aVar6);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                this.f28921k.put(aVar6, arrayList2);
                                c.h.a.k.h.d.c.b bVar3 = bVar2;
                                int i6 = 0;
                                Long l2 = null;
                                while (i6 < arrayList.size() && (NewEPGFragment.this.z == null || !NewEPGFragment.this.z.isCancelled())) {
                                    ArrayList<XMLTVProgrammePojo> arrayList3 = arrayList;
                                    String strJ = arrayList3.get(i6).j();
                                    String strL = arrayList3.get(i6).l();
                                    String strM = arrayList3.get(i6).m();
                                    String strB = arrayList3.get(i6).b();
                                    Long lValueOf = Long.valueOf(c.h.a.h.n.e.n(strJ, NewEPGFragment.this.f28898d));
                                    Long lValueOf2 = Long.valueOf(c.h.a.h.n.e.n(strL, NewEPGFragment.this.f28898d));
                                    if (l2 != null && lValueOf.equals(l2)) {
                                        bVar = new c.h.a.k.h.d.c.b(aVar6, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                        if (bVar3 != null) {
                                            bVar.k(bVar3);
                                            bVar3.j(bVar);
                                        }
                                        aVar6.a(bVar);
                                    } else if (l2 != null) {
                                        c.h.a.k.h.d.c.b bVar4 = new c.h.a.k.h.d.c.b(aVar6, l2.longValue(), lValueOf.longValue(), NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                        if (bVar3 != null) {
                                            bVar4.k(bVar3);
                                            bVar3.j(bVar4);
                                        }
                                        aVar6.a(bVar4);
                                        arrayList2.add(bVar4);
                                        bVar = new c.h.a.k.h.d.c.b(aVar6, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                        bVar.k(bVar4);
                                        bVar4.j(bVar);
                                        aVar6.a(bVar);
                                    } else {
                                        bVar = new c.h.a.k.h.d.c.b(aVar6, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                        if (bVar3 != null) {
                                            bVar.k(bVar3);
                                            bVar3.j(bVar);
                                        }
                                        aVar6.a(bVar);
                                    }
                                    arrayList2.add(bVar);
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    if (i6 == arrayList3.size() - 1 && lValueOf2.longValue() < jCurrentTimeMillis) {
                                        long jLongValue = lValueOf2.longValue();
                                        c.h.a.k.h.d.c.b bVar5 = new c.h.a.k.h.d.c.b(aVar6, jLongValue, jLongValue + jCurrentTimeMillis + Long.parseLong("7200000"), NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                        bVar5.k(bVar);
                                        bVar.j(bVar5);
                                        aVar6.a(bVar5);
                                        arrayList2.add(bVar5);
                                        bVar = bVar5;
                                    }
                                    if (i6 != 0 || lValueOf.longValue() <= jCurrentTimeMillis) {
                                        bVar3 = bVar;
                                    } else {
                                        bVar3 = new c.h.a.k.h.d.c.b(aVar6, jCurrentTimeMillis - Long.parseLong("86400000"), lValueOf.longValue(), NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                        bVar3.k(bVar);
                                        bVar.j(bVar3);
                                        aVar6.a(bVar3);
                                        arrayList2.add(bVar3);
                                    }
                                    i6++;
                                    arrayList = arrayList3;
                                    l2 = lValueOf2;
                                }
                                bVar2 = bVar3;
                                i2 = i5;
                                aVar3 = aVar6;
                                aVar4 = aVar3;
                            }
                        }
                        if (i2 == 10 || (i2 != 0 && i2 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i2));
                        }
                    }
                    aVar = aVar3;
                } else {
                    aVar = null;
                    aVar2 = null;
                }
                if (aVar != null) {
                    aVar.n(aVar2);
                }
                if (aVar2 != null) {
                    aVar2.o(aVar);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th.getMessage(), th);
            }
        }

        public final void j(String str) {
            c.h.a.k.h.d.c.a aVar;
            c.h.a.k.h.d.c.a aVar2;
            l lVar;
            int i2;
            ArrayList<XMLTVProgrammePojo> arrayListV1;
            int i3;
            c.h.a.k.h.d.c.b bVar;
            NewEPGFragment.this.f28901g = new f(NewEPGFragment.this.f28898d);
            try {
                ArrayList<c.h.a.i.f> arrayListB = str.equals("-1") ? b() : new f(NewEPGFragment.this.f28898d).X0(str, "live");
                this.f28916f = new ArrayList<>();
                this.f28917g = new ArrayList<>();
                this.f28918h = new ArrayList<>();
                this.f28919i = new ArrayList<>();
                this.f28920j = new ArrayList<>();
                NewEPGFragment newEPGFragment = NewEPGFragment.this;
                if (newEPGFragment.f28901g.I1(m.z(newEPGFragment.f28898d)) > 0 && arrayListB != null) {
                    ArrayList<String> arrayListC = c();
                    this.f28915e = arrayListC;
                    if (arrayListC != null) {
                        this.f28918h = d(arrayListB, arrayListC);
                    }
                    arrayListB = this.f28918h;
                }
                this.f28919i = arrayListB;
                if (this.f28919i != null) {
                    int i4 = -1;
                    c.h.a.k.h.d.c.a aVar3 = null;
                    c.h.a.k.h.d.c.a aVar4 = null;
                    int i5 = 0;
                    aVar2 = null;
                    int i6 = 0;
                    c.h.a.k.h.d.c.b bVar2 = null;
                    while (i5 < this.f28919i.size()) {
                        l lVar2 = NewEPGFragment.this.G;
                        if (lVar2 != null) {
                            lVar2.e();
                        }
                        if ((NewEPGFragment.this.z != null && NewEPGFragment.this.z.isCancelled()) || ((lVar = NewEPGFragment.this.G) != null && lVar.b())) {
                            break;
                        }
                        String name = this.f28919i.get(i5).getName();
                        String strI = this.f28919i.get(i5).I();
                        String strX = this.f28919i.get(i5).X();
                        String strY = this.f28919i.get(i5).Y();
                        String strP = this.f28919i.get(i5).P();
                        String strI2 = this.f28919i.get(i5).I();
                        String strE0 = this.f28919i.get(i5).e0();
                        String strG = this.f28919i.get(i5).g();
                        if (strI.equals(BuildConfig.FLAVOR) || (arrayListV1 = NewEPGFragment.this.f28901g.v1(strI)) == null || arrayListV1.size() == 0) {
                            i2 = i5;
                            aVar4 = aVar4;
                        } else {
                            int i7 = i4 + 1;
                            c.h.a.k.h.d.c.a aVar5 = aVar4;
                            c.h.a.k.h.d.c.a aVar6 = new c.h.a.k.h.d.c.a(strX, name, i6, strY, strP, strI2, strG, strE0, str);
                            i6++;
                            if (aVar2 == null) {
                                aVar2 = aVar6;
                            }
                            if (aVar5 != null) {
                                aVar6.o(aVar5);
                                aVar5.n(aVar6);
                            }
                            ArrayList arrayList = new ArrayList();
                            this.f28921k.put(aVar6, arrayList);
                            c.h.a.k.h.d.c.b bVar3 = bVar2;
                            boolean z = false;
                            int i8 = 0;
                            Long l2 = null;
                            while (i8 < arrayListV1.size()) {
                                String strJ = arrayListV1.get(i8).j();
                                String strL = arrayListV1.get(i8).l();
                                String strM = arrayListV1.get(i8).m();
                                String strB = arrayListV1.get(i8).b();
                                Long lValueOf = Long.valueOf(c.h.a.h.n.e.n(strJ, NewEPGFragment.this.f28898d));
                                Long lValueOf2 = Long.valueOf(c.h.a.h.n.e.n(strL, NewEPGFragment.this.f28898d));
                                if (NewEPGFragment.this.z != null && NewEPGFragment.this.z.isCancelled()) {
                                    break;
                                }
                                int i9 = i5;
                                c.h.a.k.h.d.c.a aVar7 = aVar2;
                                int i10 = i8;
                                if (c.h.a.h.n.e.L(lValueOf.longValue(), lValueOf2.longValue(), NewEPGFragment.this.f28898d) || z) {
                                    long millis = LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(NewEPGFragment.this.f28898d);
                                    if (lValueOf.longValue() <= 12600000 + millis) {
                                        if (l2 != null && lValueOf.equals(l2)) {
                                            bVar = new c.h.a.k.h.d.c.b(aVar6, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                            if (bVar3 != null) {
                                                bVar.k(bVar3);
                                                bVar3.j(bVar);
                                            }
                                            aVar6.a(bVar);
                                        } else if (l2 != null) {
                                            c.h.a.k.h.d.c.b bVar4 = new c.h.a.k.h.d.c.b(aVar6, l2.longValue(), lValueOf.longValue(), NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                            if (bVar3 != null) {
                                                bVar4.k(bVar3);
                                                bVar3.j(bVar4);
                                            }
                                            aVar6.a(bVar4);
                                            arrayList.add(bVar4);
                                            bVar3 = new c.h.a.k.h.d.c.b(aVar6, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                            bVar3.k(bVar4);
                                            bVar4.j(bVar3);
                                            aVar6.a(bVar3);
                                            arrayList.add(bVar3);
                                        } else {
                                            bVar = new c.h.a.k.h.d.c.b(aVar6, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                            if (bVar3 != null) {
                                                bVar.k(bVar3);
                                                bVar3.j(bVar);
                                            }
                                            aVar6.a(bVar);
                                        }
                                        arrayList.add(bVar);
                                        bVar3 = bVar;
                                    }
                                    i3 = i10;
                                    if (i3 == arrayListV1.size() - 1 && lValueOf2.longValue() < millis) {
                                        long jLongValue = lValueOf2.longValue();
                                        long j2 = Long.parseLong("3600000") + jLongValue;
                                        long j3 = jLongValue;
                                        int i11 = 0;
                                        while (i11 < 3 && (NewEPGFragment.this.z == null || !NewEPGFragment.this.z.isCancelled())) {
                                            c.h.a.k.h.d.c.b bVar5 = new c.h.a.k.h.d.c.b(aVar6, j3, j2, NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                            if (bVar3 != null) {
                                                bVar5.k(bVar3);
                                                bVar3.j(bVar5);
                                            }
                                            aVar6.a(bVar5);
                                            arrayList.add(bVar5);
                                            i11++;
                                            bVar3 = bVar5;
                                            j3 = j2;
                                            j2 += Long.parseLong("3600000");
                                        }
                                    }
                                    if (i3 == 0 && lValueOf.longValue() > millis) {
                                        long jLongValue2 = lValueOf.longValue();
                                        long j4 = millis;
                                        int i12 = 0;
                                        while (i12 < 3 && (NewEPGFragment.this.z == null || !NewEPGFragment.this.z.isCancelled())) {
                                            c.h.a.k.h.d.c.b bVar6 = new c.h.a.k.h.d.c.b(aVar6, j4, jLongValue2, NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                            if (bVar3 != null) {
                                                bVar6.k(bVar3);
                                                bVar3.j(bVar6);
                                            }
                                            aVar6.a(bVar6);
                                            arrayList.add(bVar6);
                                            i12++;
                                            bVar3 = bVar6;
                                            j4 = jLongValue2;
                                            jLongValue2 = Long.parseLong("3600000") + jLongValue2;
                                        }
                                    }
                                    l2 = lValueOf2;
                                    z = true;
                                } else {
                                    i3 = i10;
                                }
                                i8 = i3 + 1;
                                i5 = i9;
                                aVar2 = aVar7;
                            }
                            i2 = i5;
                            bVar2 = bVar3;
                            aVar3 = aVar6;
                            aVar4 = aVar3;
                            i4 = i7;
                            aVar2 = aVar2;
                        }
                        if (i4 == 10 || (i4 != 0 && i4 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i4));
                        }
                        i5 = i2 + 1;
                    }
                    aVar = aVar3;
                } else {
                    aVar = null;
                    aVar2 = null;
                }
                if (aVar != null) {
                    aVar.n(aVar2);
                }
                if (aVar2 != null) {
                    aVar2.o(aVar);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th.getMessage(), th);
            }
        }

        public final void k(String str) {
            c.h.a.k.h.d.c.a aVar;
            c.h.a.k.h.d.c.a aVar2;
            l lVar;
            c.h.a.k.h.d.c.b bVar;
            c.h.a.k.h.d.c.b bVar2;
            NewEPGFragment.this.f28901g = new f(NewEPGFragment.this.f28898d);
            try {
                ArrayList<c.h.a.i.f> arrayListB = str.equals("-1") ? b() : new f(NewEPGFragment.this.f28898d).X0(str, "live");
                this.f28916f = new ArrayList<>();
                this.f28917g = new ArrayList<>();
                this.f28918h = new ArrayList<>();
                this.f28919i = new ArrayList<>();
                this.f28920j = new ArrayList<>();
                NewEPGFragment newEPGFragment = NewEPGFragment.this;
                if (newEPGFragment.f28901g.I1(m.z(newEPGFragment.f28898d)) > 0 && arrayListB != null) {
                    ArrayList<String> arrayListC = c();
                    this.f28915e = arrayListC;
                    if (arrayListC != null) {
                        this.f28918h = d(arrayListB, arrayListC);
                    }
                    arrayListB = this.f28918h;
                }
                this.f28919i = arrayListB;
                if (this.f28919i != null) {
                    c.h.a.k.h.d.c.a aVar3 = null;
                    c.h.a.k.h.d.c.a aVar4 = null;
                    int i2 = -1;
                    int i3 = 0;
                    c.h.a.k.h.d.c.a aVar5 = null;
                    c.h.a.k.h.d.c.b bVar3 = null;
                    while (i3 < this.f28919i.size()) {
                        l lVar2 = NewEPGFragment.this.G;
                        if (lVar2 != null) {
                            lVar2.e();
                        }
                        if ((NewEPGFragment.this.z != null && NewEPGFragment.this.z.isCancelled()) || ((lVar = NewEPGFragment.this.G) != null && lVar.b())) {
                            break;
                        }
                        String name = this.f28919i.get(i3).getName();
                        String strI = this.f28919i.get(i3).I();
                        String strX = this.f28919i.get(i3).X();
                        c.h.a.k.h.d.c.a aVar6 = aVar4;
                        c.h.a.k.h.d.c.a aVar7 = new c.h.a.k.h.d.c.a(strX, name, i3, this.f28919i.get(i3).Y(), this.f28919i.get(i3).P(), this.f28919i.get(i3).I(), this.f28919i.get(i3).g(), this.f28919i.get(i3).e0(), str);
                        if (aVar5 == null) {
                            aVar5 = aVar7;
                        }
                        if (aVar6 != null) {
                            aVar7.o(aVar6);
                            aVar6.n(aVar7);
                        }
                        ArrayList arrayList = new ArrayList();
                        this.f28921k.put(aVar7, arrayList);
                        if (strI.equals(BuildConfig.FLAVOR)) {
                            long jCurrentTimeMillis = System.currentTimeMillis() - Long.parseLong("86400000");
                            long j2 = Long.parseLong("7200000") + jCurrentTimeMillis;
                            long j3 = jCurrentTimeMillis;
                            c.h.a.k.h.d.c.b bVar4 = bVar3;
                            int i4 = 0;
                            while (i4 < 50 && (NewEPGFragment.this.z == null || !NewEPGFragment.this.z.isCancelled())) {
                                c.h.a.k.h.d.c.b bVar5 = new c.h.a.k.h.d.c.b(aVar7, j3, j2, NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                if (bVar4 != null) {
                                    bVar5.k(bVar4);
                                    bVar4.j(bVar5);
                                }
                                aVar7.a(bVar5);
                                arrayList.add(bVar5);
                                i4++;
                                bVar4 = bVar5;
                                j3 = j2;
                                j2 += Long.parseLong("7200000");
                            }
                            bVar3 = bVar4;
                        } else {
                            i2++;
                            ArrayList<XMLTVProgrammePojo> arrayListV1 = NewEPGFragment.this.f28901g.v1(strI);
                            if (arrayListV1 == null || arrayListV1.size() == 0) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - Long.parseLong("86400000");
                                long j4 = Long.parseLong("7200000") + jCurrentTimeMillis2;
                                long j5 = jCurrentTimeMillis2;
                                c.h.a.k.h.d.c.b bVar6 = bVar3;
                                int i5 = 0;
                                while (i5 < 50 && (NewEPGFragment.this.z == null || !NewEPGFragment.this.z.isCancelled())) {
                                    c.h.a.k.h.d.c.b bVar7 = new c.h.a.k.h.d.c.b(aVar7, j5, j4, NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                    if (bVar6 != null) {
                                        bVar7.k(bVar6);
                                        bVar6.j(bVar7);
                                    }
                                    aVar7.a(bVar7);
                                    arrayList.add(bVar7);
                                    i5++;
                                    bVar6 = bVar7;
                                    j5 = j4;
                                    j4 += Long.parseLong("7200000");
                                }
                                bVar = bVar6;
                            } else {
                                bVar = bVar3;
                                int i6 = 0;
                                Long l2 = null;
                                while (i6 < arrayListV1.size() && (NewEPGFragment.this.z == null || !NewEPGFragment.this.z.isCancelled())) {
                                    String strJ = arrayListV1.get(i6).j();
                                    String strL = arrayListV1.get(i6).l();
                                    String strM = arrayListV1.get(i6).m();
                                    String strB = arrayListV1.get(i6).b();
                                    Long lValueOf = Long.valueOf(c.h.a.h.n.e.n(strJ, NewEPGFragment.this.f28898d));
                                    Long lValueOf2 = Long.valueOf(c.h.a.h.n.e.n(strL, NewEPGFragment.this.f28898d));
                                    if (l2 != null && lValueOf.equals(l2)) {
                                        bVar2 = new c.h.a.k.h.d.c.b(aVar7, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                        if (bVar != null) {
                                            bVar2.k(bVar);
                                            bVar.j(bVar2);
                                        }
                                        aVar7.a(bVar2);
                                    } else if (l2 != null) {
                                        c.h.a.k.h.d.c.b bVar8 = new c.h.a.k.h.d.c.b(aVar7, l2.longValue(), lValueOf.longValue(), NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                        if (bVar != null) {
                                            bVar8.k(bVar);
                                            bVar.j(bVar8);
                                        }
                                        aVar7.a(bVar8);
                                        arrayList.add(bVar8);
                                        bVar2 = new c.h.a.k.h.d.c.b(aVar7, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                        bVar2.k(bVar8);
                                        bVar8.j(bVar2);
                                        aVar7.a(bVar2);
                                    } else {
                                        bVar2 = new c.h.a.k.h.d.c.b(aVar7, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                        if (bVar != null) {
                                            bVar2.k(bVar);
                                            bVar.j(bVar2);
                                        }
                                        aVar7.a(bVar2);
                                    }
                                    arrayList.add(bVar2);
                                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                                    if (i6 == arrayListV1.size() - 1 && lValueOf2.longValue() < jCurrentTimeMillis3) {
                                        long jLongValue = lValueOf2.longValue();
                                        c.h.a.k.h.d.c.b bVar9 = new c.h.a.k.h.d.c.b(aVar7, jLongValue, jLongValue + jCurrentTimeMillis3 + Long.parseLong("7200000"), NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                        bVar9.k(bVar2);
                                        bVar2.j(bVar9);
                                        aVar7.a(bVar9);
                                        arrayList.add(bVar9);
                                        bVar2 = bVar9;
                                    }
                                    if (i6 != 0 || lValueOf.longValue() <= jCurrentTimeMillis3) {
                                        bVar = bVar2;
                                    } else {
                                        bVar = new c.h.a.k.h.d.c.b(aVar7, jCurrentTimeMillis3 - Long.parseLong("86400000"), lValueOf.longValue(), NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                        bVar.k(bVar2);
                                        bVar2.j(bVar);
                                        aVar7.a(bVar);
                                        arrayList.add(bVar);
                                    }
                                    i6++;
                                    l2 = lValueOf2;
                                }
                            }
                            bVar3 = bVar;
                        }
                        if (i2 == 10 || (i2 != 0 && i2 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i2));
                        }
                        i3++;
                        aVar3 = aVar7;
                        aVar4 = aVar3;
                    }
                    aVar2 = aVar3;
                    aVar = aVar5;
                } else {
                    aVar = null;
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar2.n(aVar);
                }
                if (aVar != null) {
                    aVar.o(aVar2);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th.getMessage(), th);
            }
        }

        public final void l(String str) {
            c.h.a.k.h.d.c.a aVar;
            c.h.a.k.h.d.c.a aVar2;
            l lVar;
            c.h.a.k.h.d.c.b bVar;
            c.h.a.k.h.d.c.b bVar2;
            NewEPGFragment.this.f28901g = new f(NewEPGFragment.this.f28898d);
            try {
                ArrayList<c.h.a.i.f> arrayListB = str.equals("-1") ? b() : new f(NewEPGFragment.this.f28898d).X0(str, "live");
                this.f28916f = new ArrayList<>();
                this.f28917g = new ArrayList<>();
                this.f28918h = new ArrayList<>();
                this.f28919i = new ArrayList<>();
                this.f28920j = new ArrayList<>();
                NewEPGFragment newEPGFragment = NewEPGFragment.this;
                if (newEPGFragment.f28901g.I1(m.z(newEPGFragment.f28898d)) > 0 && arrayListB != null) {
                    ArrayList<String> arrayListC = c();
                    this.f28915e = arrayListC;
                    if (arrayListC != null) {
                        this.f28918h = d(arrayListB, arrayListC);
                    }
                    arrayListB = this.f28918h;
                }
                this.f28919i = arrayListB;
                if (this.f28919i != null) {
                    c.h.a.k.h.d.c.a aVar3 = null;
                    c.h.a.k.h.d.c.a aVar4 = null;
                    int i2 = -1;
                    int i3 = 0;
                    c.h.a.k.h.d.c.a aVar5 = null;
                    c.h.a.k.h.d.c.b bVar3 = null;
                    while (i3 < this.f28919i.size()) {
                        l lVar2 = NewEPGFragment.this.G;
                        if (lVar2 != null) {
                            lVar2.e();
                        }
                        if ((NewEPGFragment.this.z != null && NewEPGFragment.this.z.isCancelled()) || ((lVar = NewEPGFragment.this.G) != null && lVar.b())) {
                            break;
                        }
                        String name = this.f28919i.get(i3).getName();
                        String strI = this.f28919i.get(i3).I();
                        String strX = this.f28919i.get(i3).X();
                        c.h.a.k.h.d.c.a aVar6 = aVar4;
                        c.h.a.k.h.d.c.a aVar7 = new c.h.a.k.h.d.c.a(strX, name, i3, this.f28919i.get(i3).Y(), this.f28919i.get(i3).P(), this.f28919i.get(i3).I(), this.f28919i.get(i3).g(), this.f28919i.get(i3).e0(), str);
                        if (aVar5 == null) {
                            aVar5 = aVar7;
                        }
                        if (aVar6 != null) {
                            aVar7.o(aVar6);
                            aVar6.n(aVar7);
                        }
                        ArrayList arrayList = new ArrayList();
                        this.f28921k.put(aVar7, arrayList);
                        if (strI == null || strI.equals(BuildConfig.FLAVOR)) {
                            long millis = LocalDateTime.now().toDateTime().getMillis();
                            long j2 = Long.parseLong("3600000") + millis;
                            long j3 = millis;
                            c.h.a.k.h.d.c.b bVar4 = bVar3;
                            int i4 = 0;
                            while (i4 < 3 && (NewEPGFragment.this.z == null || !NewEPGFragment.this.z.isCancelled())) {
                                c.h.a.k.h.d.c.b bVar5 = new c.h.a.k.h.d.c.b(aVar7, j3, j2, NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                if (bVar4 != null) {
                                    bVar5.k(bVar4);
                                    bVar4.j(bVar5);
                                }
                                aVar7.a(bVar5);
                                arrayList.add(bVar5);
                                i4++;
                                bVar4 = bVar5;
                                j3 = j2;
                                j2 += Long.parseLong("3600000");
                            }
                            bVar3 = bVar4;
                        } else {
                            i2++;
                            ArrayList<XMLTVProgrammePojo> arrayListV1 = NewEPGFragment.this.f28901g.v1(strI);
                            if (arrayListV1 == null || arrayListV1.size() == 0) {
                                long millis2 = LocalDateTime.now().toDateTime().getMillis();
                                long j4 = Long.parseLong("3600000") + millis2;
                                long j5 = millis2;
                                c.h.a.k.h.d.c.b bVar6 = bVar3;
                                int i5 = 0;
                                while (i5 < 3 && (NewEPGFragment.this.z == null || !NewEPGFragment.this.z.isCancelled())) {
                                    c.h.a.k.h.d.c.b bVar7 = new c.h.a.k.h.d.c.b(aVar7, j5, j4, NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                    if (bVar6 != null) {
                                        bVar7.k(bVar6);
                                        bVar6.j(bVar7);
                                    }
                                    aVar7.a(bVar7);
                                    arrayList.add(bVar7);
                                    i5++;
                                    bVar6 = bVar7;
                                    j5 = j4;
                                    j4 += Long.parseLong("3600000");
                                }
                                bVar = bVar6;
                            } else {
                                bVar = bVar3;
                                int i6 = 0;
                                boolean z = false;
                                Long l2 = null;
                                while (i6 < arrayListV1.size() && (NewEPGFragment.this.z == null || !NewEPGFragment.this.z.isCancelled())) {
                                    String strJ = arrayListV1.get(i6).j();
                                    String strL = arrayListV1.get(i6).l();
                                    String strM = arrayListV1.get(i6).m();
                                    String strB = arrayListV1.get(i6).b();
                                    Long lValueOf = Long.valueOf(c.h.a.h.n.e.n(strJ, NewEPGFragment.this.f28898d));
                                    Long lValueOf2 = Long.valueOf(c.h.a.h.n.e.n(strL, NewEPGFragment.this.f28898d));
                                    int i7 = i6;
                                    ArrayList<XMLTVProgrammePojo> arrayList2 = arrayListV1;
                                    if (c.h.a.h.n.e.L(lValueOf.longValue(), lValueOf2.longValue(), NewEPGFragment.this.f28898d) || z) {
                                        if (lValueOf.longValue() <= LocalDateTime.now().toDateTime().getMillis() + c.h.a.h.n.e.D(NewEPGFragment.this.f28898d) + 12600000) {
                                            if (l2 != null && lValueOf.equals(l2)) {
                                                bVar2 = new c.h.a.k.h.d.c.b(aVar7, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                                if (bVar != null) {
                                                    bVar2.k(bVar);
                                                    bVar.j(bVar2);
                                                }
                                                aVar7.a(bVar2);
                                            } else if (l2 != null) {
                                                c.h.a.k.h.d.c.b bVar8 = new c.h.a.k.h.d.c.b(aVar7, l2.longValue(), lValueOf.longValue(), NewEPGFragment.this.f28898d.getResources().getString(R.string.no_information), strX, BuildConfig.FLAVOR);
                                                if (bVar != null) {
                                                    bVar8.k(bVar);
                                                    bVar.j(bVar8);
                                                }
                                                aVar7.a(bVar8);
                                                arrayList.add(bVar8);
                                                c.h.a.k.h.d.c.b bVar9 = new c.h.a.k.h.d.c.b(aVar7, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                                bVar9.k(bVar8);
                                                bVar8.j(bVar9);
                                                aVar7.a(bVar9);
                                                arrayList.add(bVar9);
                                                bVar2 = bVar9;
                                                bVar = bVar2;
                                                l2 = lValueOf2;
                                            } else {
                                                bVar2 = new c.h.a.k.h.d.c.b(aVar7, lValueOf.longValue(), lValueOf2.longValue(), strM, strX, strB);
                                                if (bVar != null) {
                                                    bVar2.k(bVar);
                                                    bVar.j(bVar2);
                                                }
                                                aVar7.a(bVar2);
                                            }
                                            arrayList.add(bVar2);
                                            bVar = bVar2;
                                            l2 = lValueOf2;
                                        }
                                        z = true;
                                    }
                                    i6 = i7 + 1;
                                    arrayListV1 = arrayList2;
                                }
                            }
                            bVar3 = bVar;
                        }
                        if (i2 == 10 || (i2 != 0 && i2 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i2));
                        }
                        i3++;
                        aVar3 = aVar7;
                        aVar4 = aVar3;
                    }
                    aVar2 = aVar3;
                    aVar = aVar5;
                } else {
                    aVar = null;
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar2.n(aVar);
                }
                if (aVar != null) {
                    aVar.o(aVar2);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th.getMessage(), th);
            }
        }
    }

    public class c implements c.h.a.k.h.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28925a;

        public c(String str) {
            this.f28925a = str;
        }

        @Override // c.h.a.k.h.d.a
        public void a(int i2, c.h.a.k.h.d.c.a aVar) {
            int i3;
            try {
                i3 = Integer.parseInt(aVar.l());
            } catch (NumberFormatException unused) {
                i3 = -1;
            }
            String strG = aVar.g();
            String strI = aVar.i();
            String strD = aVar.d();
            String strF = aVar.f();
            String strB = aVar.b();
            String strM = aVar.m();
            String strJ = aVar.j();
            EPG epg = NewEPGFragment.this.epg;
            if (epg != null) {
                epg.G();
            }
            NewEPGFragment newEPGFragment = NewEPGFragment.this;
            EPG epg2 = newEPGFragment.epg;
            if (epg2 != null) {
                epg2.a(newEPGFragment.getContext(), this.f28925a, i3, strI, strG, strD, strF, strJ, strM, strB);
            }
        }

        @Override // c.h.a.k.h.d.a
        public void b(int i2, int i3, c.h.a.k.h.d.c.b bVar) {
            int i4;
            try {
                i4 = Integer.parseInt(bVar.a().l());
            } catch (NumberFormatException unused) {
                i4 = -1;
            }
            String strG = bVar.a().g();
            String strI = bVar.a().i();
            String strD = bVar.a().d();
            String strF = bVar.a().f();
            String strB = bVar.a().b();
            String strJ = bVar.a().j();
            String strM = bVar.a().m();
            NewEPGFragment.this.epg.o0(bVar, true);
            EPG epg = NewEPGFragment.this.epg;
            if (epg != null) {
                epg.G();
            }
            NewEPGFragment newEPGFragment = NewEPGFragment.this;
            EPG epg2 = newEPGFragment.epg;
            if (epg2 != null) {
                epg2.a(newEPGFragment.getContext(), this.f28925a, i4, strI, strG, strD, strF, strJ, strM, strB);
            }
        }

        @Override // c.h.a.k.h.d.a
        public void c() {
            NewEPGFragment.this.epg.n0();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(NewEPGFragment.this.f28898d);
        }
    }

    public static NewEPGFragment r(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("ACTIVE_LIVE_STREAM_CATEGORY_ID", str);
        bundle.putString("ACTIVE_LIVE_STREAM_CATEGORY_NAME", str2);
        NewEPGFragment newEPGFragment = new NewEPGFragment();
        newEPGFragment.setArguments(bundle);
        return newEPGFragment;
    }

    public ArrayList<c.h.a.i.b> n() {
        ArrayList<c.h.a.i.b> arrayListP;
        if (this.f28898d == null) {
            return null;
        }
        c.h.a.i.q.a aVar = new c.h.a.i.q.a(this.f28898d);
        this.f28899e = aVar;
        if (aVar == null || (arrayListP = aVar.p("live", m.z(this.f28898d))) == null || arrayListP.size() == 0) {
            return null;
        }
        return arrayListP;
    }

    public ArrayList<c.h.a.i.c> o() {
        f fVar;
        ArrayList<c.h.a.i.c> arrayListB1;
        if (this.f28898d == null || (fVar = this.f28901g) == null || (arrayListB1 = fVar.B1("live")) == null || arrayListB1.size() == 0) {
            return null;
        }
        return arrayListB1;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.f28898d = context;
        f28897c = new c.h.a.k.d.a.a(context);
        SharedPreferences sharedPreferences = this.f28898d.getSharedPreferences("loginPrefs", 0);
        this.D = sharedPreferences;
        this.B = sharedPreferences.getInt("aspect_ratio", this.B);
        Context context2 = this.f28898d;
        if (context2 != null) {
            SharedPreferences sharedPreferences2 = context2.getSharedPreferences("openedVideo", 0);
            this.w = sharedPreferences2;
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            this.A = this.f28898d.getSharedPreferences("epgSyncStopped", 0);
            editorEdit.putInt("openedVideoID", 0);
            editorEdit.putString("LOGIN_PREF_OPENED_VIDEO_URL_M3U", BuildConfig.FLAVOR);
            editorEdit.apply();
        }
        if (getArguments() != null) {
            this.x = getArguments().getString("ACTIVE_LIVE_STREAM_CATEGORY_ID");
            this.y = getArguments().getString("ACTIVE_LIVE_STREAM_CATEGORY_NAME");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f28898d == null || this.p == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f28898d.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f28898d.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.p.getChildCount(); i2++) {
            if (this.p.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.p.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        if (f28897c.x() == 3) {
            c.f.a.b.h3.h1.a.a().b("epg");
            i2 = R.layout.fragment_new_epg_exo;
        } else {
            i2 = R.layout.fragment_new_epg_streams;
        }
        View viewInflate = layoutInflater.inflate(i2, viewGroup, false);
        this.f28900f = ButterKnife.b(this, viewInflate);
        a.i.h.a.n(getActivity());
        setHasOptionsMenu(true);
        try {
            w();
        } catch (Exception unused) {
        }
        q();
        this.currentEvent.setSelected(true);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        EPG epg = this.epg;
        if (epg != null) {
            epg.G();
            this.epg.H();
            this.epg.f1 = true;
        }
        AsyncTask asyncTask = this.z;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            this.z.cancel(true);
        }
        EPG epg2 = this.epg;
        if (epg2 != null && epg2.a1 == 1) {
            this.G.a();
        }
        SharedPreferences sharedPreferences = this.f28898d.getSharedPreferences("openedVideo", 0);
        this.w = sharedPreferences;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.apply();
        super.onDestroyView();
        this.f28900f.a();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this.f28898d, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this.f28898d, (Class<?>) SettingsActivity.class));
        }
        if (itemId != R.id.action_logout1 || (context = this.f28898d) == null) {
            return false;
        }
        new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new e()).g(getResources().getString(R.string.no), new d()).n();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        EPG epg = this.epg;
        if (epg != null) {
            epg.G();
            this.epg.H();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        l lVar;
        SharedPreferences sharedPreferences = this.f28898d.getSharedPreferences("openedVideo", 0);
        this.w = sharedPreferences;
        int i2 = sharedPreferences.getInt("openedVideoID", 0);
        String string = this.w.getString("LOGIN_PREF_OPENED_VIDEO_URL_M3U", BuildConfig.FLAVOR);
        if (i2 != 0) {
            this.w.edit().apply();
            if (this.epg != null) {
                if (f28897c.x() == 3) {
                    if (m.f(this.f28898d).equals("m3u")) {
                        this.epg.d1 = Uri.parse(string);
                    } else {
                        this.epg.d1 = Uri.parse(this.E + i2 + this.F);
                    }
                    EPG epg = this.epg;
                    epg.f1 = false;
                    epg.N0 = 0;
                    epg.Q0 = false;
                } else {
                    if (m.f(this.f28898d).equals("m3u")) {
                        this.mVideoView.b0(Uri.parse(string), true, BuildConfig.FLAVOR);
                    } else {
                        this.mVideoView.b0(Uri.parse(this.E + i2 + this.F), true, BuildConfig.FLAVOR);
                    }
                    NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = this.mVideoView;
                    nSTIJKPlayerSmallEPG.L = 0;
                    nSTIJKPlayerSmallEPG.N = false;
                    nSTIJKPlayerSmallEPG.start();
                }
            }
        }
        EPG epg2 = this.epg;
        if (epg2 != null && epg2.a1 == 1 && (lVar = this.G) != null) {
            lVar.d();
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        EPG epg = this.epg;
        if (epg != null) {
            epg.G();
            this.epg.H();
        }
        try {
            EPG epg2 = this.epg;
            if (epg2 != null && epg2.a1 == 1) {
                this.G.c();
            }
        } catch (Exception unused) {
        }
        super.onStop();
        this.t.removeCallbacksAndMessages(null);
    }

    @OnClick
    public void onViewClicked() {
        u((this.epg == null || this.epg.getSelectedEvent() == null) ? false : true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getView() != null) {
            getView().setOnKeyListener(new a());
        }
    }

    public final void q() {
        RelativeLayout relativeLayout;
        this.f28898d = getContext();
        this.f28901g = new f(this.f28898d);
        if (this.f28898d != null) {
            u(false);
            if (!this.x.equals("-1")) {
                if ((m.f(this.f28898d).equals("m3u") ? this.f28901g.t1(this.x, "live") : this.f28901g.E1(this.x)) == 0 && !this.x.equals("0")) {
                    ProgressBar progressBar = this.pbLoader;
                    if (progressBar != null) {
                        progressBar.setVisibility(4);
                    }
                    TextView textView = this.tvNoStream;
                    if (textView != null) {
                        textView.setVisibility(0);
                        return;
                    }
                    return;
                }
            } else if (m.f(this.f28898d).equals("m3u")) {
                ArrayList<c.h.a.i.c> arrayListO = o();
                if (arrayListO == null || arrayListO.size() == 0) {
                    ProgressBar progressBar2 = this.pbLoader;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(4);
                    }
                    TextView textView2 = this.tvNoStream;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    relativeLayout = this.rl_add_channel_to_fav;
                    if (relativeLayout == null) {
                        return;
                    }
                    relativeLayout.setVisibility(0);
                    return;
                }
            } else {
                ArrayList<c.h.a.i.b> arrayListN = n();
                if (arrayListN == null || arrayListN.size() == 0) {
                    ProgressBar progressBar3 = this.pbLoader;
                    if (progressBar3 != null) {
                        progressBar3.setVisibility(4);
                    }
                    TextView textView3 = this.tvNoStream;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    relativeLayout = this.rl_add_channel_to_fav;
                    if (relativeLayout == null) {
                        return;
                    }
                    relativeLayout.setVisibility(0);
                    return;
                }
            }
            v(this.x, this.epgFragment, R.id.epg);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(boolean r17) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.fragment.NewEPGFragment.u(boolean):void");
    }

    public final void v(String str, RelativeLayout relativeLayout, int i2) {
        this.z = new b(this.epg, 0, str, relativeLayout).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    public final void w() {
        this.p = (Toolbar) getActivity().findViewById(R.id.toolbar);
    }
}
