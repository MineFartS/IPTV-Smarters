package minefarts.iptvsmarters.view.ijkplayer.activities;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import c.f.a.b.j3.x0;
import c.h.a.k.a.m;
import com.amazonaws.services.s3.model.InstructionFileId;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.GetEpisdoeDetailsCallback;
import minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerVOD;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerVODActivity extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f29401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f29402e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f29403f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f29404g;
    public SeekBar A;
    public View A0;
    public Date B;
    public View B0;
    public LinearLayout C;
    public Handler C0;
    public ProgressBar D;
    public Handler D0;
    public DateFormat E;
    public c.h.a.i.q.f F;
    public LinearLayout F0;
    public ArrayList<File> G;
    public TextView G0;
    public SharedPreferences H0;
    public SharedPreferences I;
    public SharedPreferences.Editor I0;
    public SharedPreferences J;
    public SharedPreferences K;
    public String K0;
    public SharedPreferences L;
    public String L0;
    public SharedPreferences M;
    public c.h.a.i.q.k M0;
    public SharedPreferences N;
    public String N0;
    public SharedPreferences O;
    public ImageView O0;
    public SharedPreferences P;
    public TextView P0;
    public SharedPreferences Q;
    public Button Q0;
    public String R;
    public Button R0;
    public AppCompatImageView S;
    public a.b.k.b S0;
    public AppCompatImageView T;
    public ArrayList<c.h.a.i.f> U;
    public NSTIJKPlayerVOD U0;
    public ArrayList<c.h.a.i.f> V;
    public SharedPreferences V0;
    public Button W0;
    public Spinner X0;
    public RelativeLayout Y;
    public SharedPreferences Y0;
    public int Z;
    public SharedPreferences.Editor Z0;
    public RelativeLayout a1;
    public List<GetEpisdoeDetailsCallback> b1;
    public SharedPreferences.Editor f0;
    public SharedPreferences.Editor g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.e.a.a.a f29405h;
    public TextView h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f29406i;
    public TextView i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29407j;
    public TextView j0;
    public c.h.a.i.q.l j1;
    public TextView k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f29409l;
    public TextView l0;
    public c.h.a.k.d.a.a l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f29410m;
    public String m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f29411n;
    public Handler n0;
    public m n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f29412o;
    public Handler o0;
    public View p;
    public PopupWindow p0;
    public View q;
    public SharedPreferences.Editor q0;
    public View r;
    public SharedPreferences.Editor r0;
    public View s;
    public SharedPreferences.Editor s0;
    public View t;
    public String t0;
    public View u;
    public View v;
    public SimpleDateFormat w;
    public LinearLayout x;
    public SharedPreferences.Editor x0;
    public TextView y;
    public String y0;
    public TextView z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f29408k = false;
    public ArrayList<File> H = new ArrayList<>();
    public boolean W = false;
    public boolean X = false;
    public String u0 = BuildConfig.FLAVOR;
    public String v0 = BuildConfig.FLAVOR;
    public String w0 = BuildConfig.FLAVOR;
    public int z0 = 0;
    public int E0 = 0;
    public int J0 = -1;
    public Boolean T0 = Boolean.TRUE;
    public String c1 = BuildConfig.FLAVOR;
    public String d1 = BuildConfig.FLAVOR;
    public String e1 = BuildConfig.FLAVOR;
    public String f1 = BuildConfig.FLAVOR;
    public String g1 = BuildConfig.FLAVOR;
    public String h1 = BuildConfig.FLAVOR;
    public int i1 = 0;
    public int k1 = 4;
    public String m1 = BuildConfig.FLAVOR;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            NSTIJKPlayerVODActivity.this.g1();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            String string = NSTIJKPlayerVODActivity.this.X0.getItemAtPosition(i2).toString();
            NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = NSTIJKPlayerVODActivity.this;
            nSTIJKPlayerVODActivity.Y0 = nSTIJKPlayerVODActivity.getSharedPreferences("pref.using_sub_font_size", 0);
            NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity2 = NSTIJKPlayerVODActivity.this;
            nSTIJKPlayerVODActivity2.Z0 = nSTIJKPlayerVODActivity2.Y0.edit();
            if (NSTIJKPlayerVODActivity.this.Z0 != null) {
                NSTIJKPlayerVODActivity.this.Z0.putString("pref.using_sub_font_size", string);
                NSTIJKPlayerVODActivity.this.Z0.apply();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (NSTIJKPlayerVODActivity.this.U0 != null) {
                NSTIJKPlayerVODActivity.this.U0.o1();
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerVODActivity.this.S0.setCancelable(true);
            NSTIJKPlayerVODActivity.this.onBackPressed();
            NSTIJKPlayerVODActivity.this.onBackPressed();
            NSTIJKPlayerVODActivity.this.S0.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f29418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f29419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ NSTIJKPlayerVODActivity f29420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f29421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f29422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f29423h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f29424i;

        public e(ArrayList arrayList, int i2, String str, NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity, int i3, String str2, String str3, int i4) {
            this.f29417b = arrayList;
            this.f29418c = i2;
            this.f29419d = str;
            this.f29420e = nSTIJKPlayerVODActivity;
            this.f29421f = i3;
            this.f29422g = str2;
            this.f29423h = str3;
            this.f29424i = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String name = ((c.h.a.i.f) this.f29417b.get(this.f29418c)).getName();
            new c.h.a.i.f();
            ArrayList arrayListE1 = NSTIJKPlayerVODActivity.this.K0.equals("m3u") ? NSTIJKPlayerVODActivity.this.e1(String.valueOf(Uri.parse(this.f29419d)), c.h.a.i.q.m.z(this.f29420e)) : NSTIJKPlayerVODActivity.this.d1(this.f29421f, c.h.a.i.q.m.z(this.f29420e));
            long jO = 0;
            if (arrayListE1 != null) {
                try {
                    if (arrayListE1.size() > 0) {
                        jO = ((c.h.a.i.f) arrayListE1.get(0)).O();
                    }
                } catch (Exception unused) {
                }
            }
            long j2 = jO;
            if (NSTIJKPlayerVODActivity.this.U0 != null && NSTIJKPlayerVODActivity.this.T0.booleanValue()) {
                NSTIJKPlayerVODActivity.this.t1();
                String strValueOf = String.valueOf(Uri.parse(NSTIJKPlayerVODActivity.this.f29407j + this.f29421f + InstructionFileId.DOT + this.f29422g));
                NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.U0;
                NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = NSTIJKPlayerVODActivity.this;
                nSTIJKPlayerVOD.J1(strValueOf, nSTIJKPlayerVODActivity.W, name, 0L, this.f29421f, this.f29423h, nSTIJKPlayerVODActivity.V, this.f29418c, this.f29424i, NSTIJKPlayerVODActivity.this.K0, "nst");
                c.h.a.k.e.a.f().t(this.f29421f);
                c.h.a.k.e.a.f().m(this.f29417b);
                c.h.a.k.e.a.f().o(this.f29418c);
                NSTIJKPlayerVODActivity.this.U0.setCurrentPositionSeekbar((int) j2);
                NSTIJKPlayerVODActivity.this.U0.setProgress(true);
                if (NSTIJKPlayerVODActivity.this.U0 != null) {
                    NSTIJKPlayerVODActivity.this.U0.K = 0;
                    NSTIJKPlayerVODActivity.this.U0.M = false;
                    NSTIJKPlayerVODActivity.this.U0.V0 = true;
                    NSTIJKPlayerVODActivity.this.U0.C0 = false;
                    NSTIJKPlayerVODActivity.this.U0.start();
                }
            }
            NSTIJKPlayerVODActivity.this.S0.dismiss();
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f29428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f29429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f29430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f29431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29432h;

        public f(int i2, String str, String str2, String str3, int i3, int i4, ArrayList arrayList) {
            this.f29426b = i2;
            this.f29427c = str;
            this.f29428d = str2;
            this.f29429e = str3;
            this.f29430f = i3;
            this.f29431g = i4;
            this.f29432h = arrayList;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerVODActivity.this.t1();
            String strValueOf = String.valueOf(Uri.parse(NSTIJKPlayerVODActivity.this.f29407j + this.f29426b + InstructionFileId.DOT + this.f29427c));
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.U0;
            NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = NSTIJKPlayerVODActivity.this;
            nSTIJKPlayerVOD.J1(strValueOf, nSTIJKPlayerVODActivity.W, this.f29428d, 0L, this.f29426b, this.f29429e, nSTIJKPlayerVODActivity.V, this.f29430f, this.f29431g, NSTIJKPlayerVODActivity.this.K0, "nst");
            if (NSTIJKPlayerVODActivity.this.U0 != null) {
                c.h.a.k.e.a.f().t(this.f29426b);
                c.h.a.k.e.a.f().m(this.f29432h);
                c.h.a.k.e.a.f().o(this.f29430f);
                if (NSTIJKPlayerVODActivity.this.U0 != null) {
                    NSTIJKPlayerVODActivity.this.U0.Q0 = true;
                    NSTIJKPlayerVODActivity.this.U0.L0 = true;
                    NSTIJKPlayerVODActivity.this.U0.O0 = 0L;
                    NSTIJKPlayerVODActivity.this.U0.V0 = true;
                    NSTIJKPlayerVODActivity.this.U0.C0 = false;
                    NSTIJKPlayerVODActivity.this.U0.K = 0;
                    NSTIJKPlayerVODActivity.this.U0.M = false;
                    NSTIJKPlayerVODActivity.this.U0.start();
                }
            }
            NSTIJKPlayerVODActivity.this.S0.dismiss();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerVODActivity.this.h1();
            if (c.h.a.h.n.a.f17047k.booleanValue()) {
                NSTIJKPlayerVODActivity.this.findViewById(R.id.watrmrk).setVisibility(0);
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29435b;

        public h(int i2) {
            this.f29435b = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 432
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerVODActivity.h.run():void");
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29437b;

        public i(int i2) {
            this.f29437b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strValueOf;
            NSTIJKPlayerVOD nSTIJKPlayerVOD;
            boolean z;
            String str;
            long j2;
            int i2;
            String str2;
            ArrayList<c.h.a.i.f> arrayList;
            int i3;
            int i4;
            String str3;
            NSTIJKPlayerVODActivity.this.t1();
            if (!NSTIJKPlayerVODActivity.this.K0.equals("m3u") || NSTIJKPlayerVODActivity.this.c1.equals("recording")) {
                if (NSTIJKPlayerVODActivity.this.c1.equals("recording")) {
                    nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.U0;
                    NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = NSTIJKPlayerVODActivity.this;
                    strValueOf = nSTIJKPlayerVODActivity.f29407j;
                    z = nSTIJKPlayerVODActivity.W;
                    str = nSTIJKPlayerVODActivity.e1;
                    j2 = 0;
                    i2 = 0;
                    arrayList = null;
                    i3 = 0;
                    i4 = 0;
                    str3 = nSTIJKPlayerVODActivity.K0;
                    str2 = BuildConfig.FLAVOR;
                } else {
                    strValueOf = String.valueOf(Uri.parse(NSTIJKPlayerVODActivity.this.f29407j + NSTIJKPlayerVODActivity.this.i1 + InstructionFileId.DOT + NSTIJKPlayerVODActivity.this.h1));
                    nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.U0;
                    NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity2 = NSTIJKPlayerVODActivity.this;
                    z = nSTIJKPlayerVODActivity2.W;
                    str = nSTIJKPlayerVODActivity2.e1;
                    j2 = 0;
                    i2 = nSTIJKPlayerVODActivity2.i1;
                    str2 = nSTIJKPlayerVODActivity2.g1;
                    arrayList = nSTIJKPlayerVODActivity2.V;
                    i3 = this.f29437b;
                    i4 = NSTIJKPlayerVODActivity.this.z0;
                    str3 = NSTIJKPlayerVODActivity.this.K0;
                }
                nSTIJKPlayerVOD.J1(strValueOf, z, str, j2, i2, str2, arrayList, i3, i4, str3, "nst");
            } else {
                NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVODActivity.this.U0;
                String str4 = NSTIJKPlayerVODActivity.this.L0;
                NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity3 = NSTIJKPlayerVODActivity.this;
                nSTIJKPlayerVOD2.J1(str4, nSTIJKPlayerVODActivity3.W, nSTIJKPlayerVODActivity3.e1, 0L, 0, BuildConfig.FLAVOR, null, this.f29437b, 0, nSTIJKPlayerVODActivity3.K0, "nst");
                c.h.a.k.e.a.f().l("m3u");
            }
            NSTIJKPlayerVODActivity.this.U0.K = 0;
            NSTIJKPlayerVODActivity.this.U0.M = false;
            NSTIJKPlayerVODActivity.this.U0.V0 = false;
            NSTIJKPlayerVODActivity.this.U0.setProgress(false);
            NSTIJKPlayerVODActivity.this.U0.start();
            if (NSTIJKPlayerVODActivity.this.c1.equals("movies")) {
                c.h.a.k.e.a.f().t(c.h.a.h.n.e.R(((c.h.a.i.f) NSTIJKPlayerVODActivity.this.U.get(this.f29437b)).Y()));
                c.h.a.k.e.a.f().m(NSTIJKPlayerVODActivity.this.U);
            } else if (NSTIJKPlayerVODActivity.this.c1.equals("series")) {
                c.h.a.k.e.a.f().p(NSTIJKPlayerVODActivity.this.m1);
                c.h.a.i.a.c().f(NSTIJKPlayerVODActivity.this.b1);
                c.h.a.k.e.a.f().t(c.h.a.h.n.e.R(((GetEpisdoeDetailsCallback) NSTIJKPlayerVODActivity.this.b1.get(this.f29437b)).j()));
                c.h.a.k.e.a.f().n(NSTIJKPlayerVODActivity.this.b1);
            }
            c.h.a.k.e.a.f().o(this.f29437b);
            NSTIJKPlayerVODActivity.this.U0.setProgress(false);
        }
    }

    public class j implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerVODActivity.this.E0 = 0;
                NSTIJKPlayerVODActivity.this.F0.setVisibility(8);
            }
        }

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerVODActivity.this.U0.seekTo(NSTIJKPlayerVODActivity.this.U0.getCurrentPosition() + NSTIJKPlayerVODActivity.this.E0);
            NSTIJKPlayerVODActivity.this.C0.removeCallbacksAndMessages(null);
            NSTIJKPlayerVODActivity.this.C0.postDelayed(new a(), 3000L);
        }
    }

    public class k implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerVODActivity.this.E0 = 0;
                NSTIJKPlayerVODActivity.this.F0.setVisibility(8);
            }
        }

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerVOD nSTIJKPlayerVOD;
            int currentPosition;
            if (NSTIJKPlayerVODActivity.this.U0.getCurrentPosition() + NSTIJKPlayerVODActivity.this.E0 > 0) {
                nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.U0;
                currentPosition = NSTIJKPlayerVODActivity.this.U0.getCurrentPosition() + NSTIJKPlayerVODActivity.this.E0;
            } else {
                nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.U0;
                currentPosition = 0;
            }
            nSTIJKPlayerVOD.seekTo(currentPosition);
            NSTIJKPlayerVODActivity.this.C0.removeCallbacksAndMessages(null);
            NSTIJKPlayerVODActivity.this.C0.postDelayed(new a(), 3000L);
        }
    }

    public class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f29443b;

        public l(View view) {
            this.f29443b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29443b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29443b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29443b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            float f3;
            if (!z) {
                if (z) {
                    return;
                }
                if (this.f29443b.getTag().equals("15")) {
                    f3 = z ? 1.04f : 1.0f;
                    b(f3);
                    c(f3);
                } else {
                    f2 = z ? 1.02f : 1.0f;
                    b(f2);
                    c(f2);
                }
                a(z);
                View view2 = this.f29443b;
                if (view2 != null && view2.getTag() != null && this.f29443b.getTag().equals("1") && NSTIJKPlayerVODActivity.this.W0 != null) {
                    NSTIJKPlayerVODActivity.this.W0.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view3 = this.f29443b;
                if (view3 != null && view3.getTag() != null && this.f29443b.getTag().equals("9")) {
                    NSTIJKPlayerVODActivity.this.Q0.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view4 = this.f29443b;
                if (view4 != null && view4.getTag() != null && this.f29443b.getTag().equals("8")) {
                    NSTIJKPlayerVODActivity.this.R0.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view5 = this.f29443b;
                if (view5 == null || view5.getTag() == null || !this.f29443b.getTag().equals("15")) {
                    return;
                }
                NSTIJKPlayerVODActivity.this.O0.setImageDrawable(NSTIJKPlayerVODActivity.this.getResources().getDrawable(R.drawable.ic_cancel));
                return;
            }
            Log.e("id is", BuildConfig.FLAVOR + this.f29443b.getTag());
            View view6 = this.f29443b;
            if (view6 != null && view6.getTag() != null && this.f29443b.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerVODActivity.this.getResources().getDrawable(R.drawable.selector_checkbox));
                return;
            }
            View view7 = this.f29443b;
            if (view7 == null || !view7.getTag().equals("15")) {
                f2 = z ? 1.02f : 1.0f;
                b(f2);
                c(f2);
            } else {
                f3 = z ? 1.04f : 1.0f;
                b(f3);
                c(f3);
            }
            View view8 = this.f29443b;
            if (view8 != null && view8.getTag() != null && this.f29443b.getTag().equals("1") && NSTIJKPlayerVODActivity.this.W0 != null) {
                NSTIJKPlayerVODActivity.this.W0.setBackgroundResource(R.drawable.back_btn_effect);
            }
            View view9 = this.f29443b;
            if (view9 != null && view9.getTag() != null && this.f29443b.getTag().equals("9")) {
                NSTIJKPlayerVODActivity.this.Q0.setBackgroundResource(R.drawable.back_btn_effect);
            }
            View view10 = this.f29443b;
            if (view10 != null && view10.getTag() != null && this.f29443b.getTag().equals("8")) {
                NSTIJKPlayerVODActivity.this.R0.setBackgroundResource(R.drawable.logout_btn_effect);
            }
            View view11 = this.f29443b;
            if (view11 == null || view11.getTag() == null || !this.f29443b.getTag().equals("15")) {
                return;
            }
            NSTIJKPlayerVODActivity.this.O0.setImageDrawable(NSTIJKPlayerVODActivity.this.getResources().getDrawable(R.drawable.ic_cancel_focus));
            NSTIJKPlayerVODActivity.this.Q0.setBackgroundResource(R.drawable.black_button_dark);
            NSTIJKPlayerVODActivity.this.R0.setBackgroundResource(R.drawable.black_button_dark);
        }
    }

    public static long X0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String Z0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public static String f1(String str) {
        Matcher matcher = Pattern.compile("(?:youtube(?:-nocookie)?\\.com\\/(?:[^\\/\\n\\s]+\\/\\S+\\/|(?:v|e(?:mbed)?)\\/|\\S*?[?&]v=)|youtu\\.be\\/)([a-zA-Z0-9_-]{11})", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public void W0() {
        File[] fileArrB = c.h.a.h.n.e.B(this.f29406i);
        for (File file : fileArrB) {
            if (file.toString().endsWith(".ts")) {
                Arrays.asList(file);
            }
        }
        if (fileArrB.length > 0) {
            for (File file2 : fileArrB) {
                if (file2.toString().endsWith(".ts")) {
                    this.H.addAll(Arrays.asList(file2));
                }
            }
            Collections.reverse(this.H);
            this.G = this.H;
        }
    }

    public void Y0() {
        TextView textView;
        this.U0.o1();
        NSTIJKPlayerVOD nSTIJKPlayerVOD = this.U0;
        if (nSTIJKPlayerVOD != null && (textView = nSTIJKPlayerVOD.i0) != null) {
            textView.setVisibility(0);
        }
        this.Y.setVisibility(8);
        this.U0.k1(Boolean.valueOf(this.W));
        w1();
        u1();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            String str = this.c1;
            if (str == null || str.equals(BuildConfig.FLAVOR)) {
                return;
            }
            if (!this.c1.equals("devicedata") && !this.c1.equals("loadurl")) {
                return;
            }
        }
        i1();
    }

    public int a1(ArrayList<c.h.a.i.f> arrayList, int i2) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (c.h.a.h.n.e.S(arrayList.get(i3).P()) == i2) {
                return i3;
            }
        }
        return 0;
    }

    public int b1(List<GetEpisdoeDetailsCallback> list, int i2) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (c.h.a.h.n.e.S(list.get(i3).j()) == i2) {
                return i3;
            }
        }
        return 0;
    }

    public final ArrayList<c.h.a.i.f> d1(int i2, int i3) {
        return this.M0.x(String.valueOf(i2), i3);
    }

    public final ArrayList<c.h.a.i.f> e1(String str, int i2) {
        return this.F.P1(str, i2);
    }

    public final void g1() {
        try {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.U0;
            if (nSTIJKPlayerVOD != null) {
                nSTIJKPlayerVOD.setSystemUiVisibility(4871);
            }
        } catch (Exception unused) {
        }
    }

    public void h1() {
        findViewById(R.id.app_video_top_box).setVisibility(8);
        findViewById(R.id.controls).setVisibility(8);
        findViewById(R.id.ll_seekbar_time).setVisibility(8);
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            findViewById(R.id.watrmrk).setVisibility(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x013c  */
    @android.annotation.SuppressLint({"StaticFieldLeak"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i1() {
        /*
            Method dump skipped, instruction units count: 2254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerVODActivity.i1():void");
    }

    public void j1() {
        w1();
        v1();
        u1();
    }

    public final void k1() {
        int iD;
        iD = c.h.a.k.e.a.f().d();
        String str = this.c1;
        str.hashCode();
        switch (str) {
            case "movies":
                if (iD == this.U.size() - 1) {
                    c.h.a.k.e.a.f().o(0);
                    return;
                }
                break;
            case "series":
                if (iD == this.b1.size() - 1) {
                    c.h.a.k.e.a.f().o(0);
                    return;
                }
                break;
            case "recording":
                if (iD == this.G.size() - 1) {
                    c.h.a.k.e.a.f().o(0);
                    return;
                }
                break;
        }
        c.h.a.k.e.a.f().o(iD + 1);
    }

    public void l1() {
        h1();
        this.x.setVisibility(0);
        this.y.setText(getResources().getString(R.string.no_channel_found));
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            findViewById(R.id.watrmrk).setVisibility(8);
        }
    }

    public final void m1(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity, int i2, String str, String str2, int i3, String str3, ArrayList<c.h.a.i.f> arrayList, int i4, String str4) {
        String name = arrayList.get(i4).getName();
        b.a aVar = new b.a(this, R.style.CustomAlertDialogbox);
        aVar.h(new c());
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.layout_resume_player, (ViewGroup) null);
        this.P0 = (TextView) viewInflate.findViewById(R.id.tv_movie_id);
        this.Q0 = (Button) viewInflate.findViewById(R.id.bt_resume);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_cancel);
        this.O0 = imageView;
        imageView.setOnClickListener(new d());
        this.R0 = (Button) viewInflate.findViewById(R.id.bt_start_over);
        TextView textView = this.P0;
        if (textView != null) {
            textView.setText(i3 + "-" + str2);
        }
        Button button = this.Q0;
        if (button != null) {
            button.setOnFocusChangeListener(new l(button));
        }
        Button button2 = this.R0;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new l(button2));
        }
        ImageView imageView2 = this.O0;
        if (imageView2 != null) {
            imageView2.setOnFocusChangeListener(new l(imageView2));
        }
        this.Q0.requestFocus();
        this.Q0.setOnClickListener(new e(arrayList, i4, str4, nSTIJKPlayerVODActivity, i2, str, str3, i3));
        this.R0.setOnClickListener(new f(i2, str, name, str3, i4, i3, arrayList));
        aVar.setView(viewInflate);
        this.S0 = aVar.create();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.S0.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.S0.show();
        this.S0.getWindow().setAttributes(layoutParams);
        this.S0.setCancelable(false);
        this.S0.show();
    }

    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public final void n1(ArrayList<c.h.a.i.f> arrayList, int i2) {
        boolean z;
        ?? r13;
        String strValueOf;
        NSTIJKPlayerVOD nSTIJKPlayerVOD;
        boolean z2;
        long j2;
        String str;
        int i3;
        ArrayList<c.h.a.i.f> arrayList2;
        int i4;
        int i5;
        String str2;
        String str3;
        String str4;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int iA1 = a1(arrayList, i2);
        String name = arrayList.get(iA1).getName();
        String strP = arrayList.get(iA1).P();
        String strO0 = c.h.a.h.n.e.o0(c.h.a.k.e.b.a.a() + c.h.a.k.e.b.a.b());
        String strZ = arrayList.get(iA1).Z();
        int iR = c.h.a.h.n.e.R(arrayList.get(iA1).Y());
        String strC = arrayList.get(iA1).C();
        c.h.a.k.e.a.f().o(iA1);
        if (this.c1.equals("movies")) {
            this.L0 = arrayList.get(iA1).e0();
            SharedPreferences.Editor editor = this.f0;
            if (editor != null) {
                editor.putString("currentlyPlayingVideo", String.valueOf(this.U.get(iA1).Y()));
                this.f0.apply();
            }
        }
        SharedPreferences.Editor editor2 = this.g0;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideoPosition", String.valueOf(iA1));
            this.g0.apply();
        }
        SimpleDateFormat simpleDateFormat = this.w;
        if (X0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.f29406i))), this.E.format(this.B)) >= c.h.a.k.d.c.a.d.p() && (str3 = this.y0) != null && this.N0 != null && (!f29404g.equals(str3) || (this.y0 != null && (str4 = this.N0) != null && !f29401d.equals(str4)))) {
            this.T0 = Boolean.FALSE;
            this.f29405h.a(R.id.app_video_status).d();
            this.f29405h.a(R.id.app_video_status_text).b(strO0 + this.m0 + this.t0);
        }
        this.Z = iR;
        int iS = c.h.a.h.n.e.S(strP);
        this.U0.setTitle(iS + " - " + name);
        this.f29405h.a(R.id.app_video_title).b(iS + " - " + name);
        if (this.U0.getFullScreenValue().booleanValue()) {
            this.W = this.U0.getFullScreenValue().booleanValue();
        } else {
            this.W = false;
        }
        this.U0.C1();
        NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.U0;
        nSTIJKPlayerVOD2.K = 0;
        nSTIJKPlayerVOD2.M = false;
        nSTIJKPlayerVOD2.L0 = true;
        int iY1 = this.K0.equals("m3u") ? y1(String.valueOf(Uri.parse(this.L0)), c.h.a.i.q.m.z(this.f29406i)) : x1(iR, c.h.a.i.q.m.z(this.f29406i));
        this.V0 = this.f29406i.getSharedPreferences("loginPrefs", 0);
        if (!f29402e) {
            iY1 = 0;
        }
        if (iY1 == 0) {
            if (this.T0.booleanValue()) {
                t1();
                if (this.K0.equals("m3u")) {
                    nSTIJKPlayerVOD = this.U0;
                    strValueOf = this.L0;
                    z2 = this.W;
                    j2 = 0;
                    i3 = 0;
                    arrayList2 = null;
                    i4 = 0;
                    i5 = 0;
                    String str5 = this.K0;
                    strZ = BuildConfig.FLAVOR;
                    str = "nst";
                    str2 = str5;
                } else {
                    strValueOf = String.valueOf(Uri.parse(this.f29407j + iR + InstructionFileId.DOT + strC));
                    nSTIJKPlayerVOD = this.U0;
                    z2 = this.W;
                    j2 = 0;
                    str = "nst";
                    i3 = iR;
                    arrayList2 = this.V;
                    i4 = iA1;
                    i5 = iS;
                    str2 = this.K0;
                }
                nSTIJKPlayerVOD.J1(strValueOf, z2, name, j2, i3, strZ, arrayList2, i4, i5, str2, str);
                c.h.a.k.e.a.f().t(iR);
                c.h.a.k.e.a.f().m(arrayList);
                c.h.a.k.e.a.f().o(iA1);
                NSTIJKPlayerVOD nSTIJKPlayerVOD3 = this.U0;
                if (nSTIJKPlayerVOD3 != null) {
                    nSTIJKPlayerVOD3.K = 0;
                    nSTIJKPlayerVOD3.M = false;
                    nSTIJKPlayerVOD3.V0 = true;
                    nSTIJKPlayerVOD3.C0 = false;
                    nSTIJKPlayerVOD3.start();
                }
                h1();
            }
        } else if (iY1 > 0) {
            if (isFinishing() || !this.T0.booleanValue()) {
                z = true;
                r13 = 0;
            } else {
                this.H0 = getSharedPreferences("currentSeekTime", 0);
                h1();
                z = true;
                r13 = 0;
                m1(this, iR, strC, name, iS, strZ, arrayList, iA1, this.L0);
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD4 = this.U0;
            if (nSTIJKPlayerVOD4 != null) {
                nSTIJKPlayerVOD4.K = r13;
                nSTIJKPlayerVOD4.M = r13;
                nSTIJKPlayerVOD4.V0 = z;
                nSTIJKPlayerVOD4.C0 = r13;
                nSTIJKPlayerVOD4.start();
            }
        }
        h1();
    }

    public final void o1(ArrayList<File> arrayList, int i2) {
        String str;
        String str2;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String name = arrayList.get(i2).getName();
        String strO0 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.h.a() + c.h.a.k.d.c.a.h.i());
        SimpleDateFormat simpleDateFormat = this.w;
        if (X0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.f29406i))), this.E.format(this.B)) >= c.h.a.k.d.c.a.d.p() && (str = this.y0) != null && this.N0 != null && (!f29404g.equals(str) || (this.y0 != null && (str2 = this.N0) != null && !f29401d.equals(str2)))) {
            this.T0 = Boolean.FALSE;
            this.f29405h.a(R.id.app_video_status).d();
            this.f29405h.a(R.id.app_video_status_text).b(strO0 + this.m0 + this.t0);
        }
        if (this.T0.booleanValue()) {
            c.h.a.k.e.a.f().o(i2);
            this.U0.setTitle(name);
            if (this.U0.getFullScreenValue().booleanValue()) {
                this.W = this.U0.getFullScreenValue().booleanValue();
            } else {
                this.W = false;
            }
            this.U0.C1();
            t1();
            this.U0.J1(this.f29407j, this.W, name, 0L, 0, BuildConfig.FLAVOR, null, 0, 0, this.K0, "nst");
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.U0;
            if (nSTIJKPlayerVOD != null) {
                nSTIJKPlayerVOD.K = 0;
                nSTIJKPlayerVOD.M = false;
                nSTIJKPlayerVOD.V0 = true;
                nSTIJKPlayerVOD.C0 = false;
                nSTIJKPlayerVOD.start();
            }
        }
        h1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (findViewById(R.id.app_video_top_box).getVisibility() == 0) {
            h1();
            return;
        }
        String str = this.d1;
        if (str != null && !str.equals(BuildConfig.FLAVOR)) {
            this.U0.T1();
            this.U0.z1(true);
            this.U0.S1();
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0159  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 2302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerVODActivity.onClick(android.view.View):void");
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29406i = getApplicationContext();
        c.h.a.i.l.a().b("vod");
        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception | UnsatisfiedLinkError unused) {
        }
        this.c1 = getIntent().getStringExtra("type");
        Intent intent = getIntent();
        if ("android.intent.action.VIEW".equals(intent.getAction())) {
            intent.getData();
            intent.getType();
            this.d1 = intent.getDataString();
            setContentView(R.layout.nst_vlc_player_vod_for_device_data);
        }
        String str = this.c1;
        if (str != null && !str.equals(BuildConfig.FLAVOR) && (this.c1.equals("devicedata") || this.c1.equals("loadurl"))) {
            setRequestedOrientation(new c.h.a.k.d.a.a(this.f29406i).A().equals(c.h.a.h.n.a.s0) ? 0 : 4);
        }
        String str2 = this.c1;
        if (str2 != null && !str2.equals(BuildConfig.FLAVOR)) {
            if (this.c1.equals("devicedata") || this.c1.equals("loadurl")) {
                setContentView(R.layout.nst_vlc_player_vod_for_device_data);
            } else {
                setContentView(R.layout.nst_vlc_player_vod);
            }
        }
        i1();
        c.h.a.h.n.e.d0(this.f29406i);
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        Button button;
        super.onDestroy();
        try {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.U0;
            if (nSTIJKPlayerVOD != null && (button = nSTIJKPlayerVOD.u1) != null) {
                button.performClick();
            }
        } catch (Exception e2) {
            Log.e("fsgd", "fdfh", e2);
        }
        try {
            t1();
        } catch (Exception unused) {
        }
    }

    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        String str;
        int i3;
        String str2;
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        RelativeLayout relativeLayout = this.a1;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (i2 == 19) {
            str = this.d1;
            if ((str == null && !str.equals(BuildConfig.FLAVOR)) || this.c1.equals("devicedata") || this.c1.equals("ofd") || this.c1.equals("loadurl") || this.c1.equals("catch_up")) {
                return false;
            }
            j1();
            i3 = R.id.exo_next;
        } else if (i2 == 20) {
            str2 = this.d1;
            if ((str2 == null && !str2.equals(BuildConfig.FLAVOR)) || this.c1.equals("devicedata") || this.c1.equals("ofd") || this.c1.equals("loadurl") || this.c1.equals("catch_up")) {
                return false;
            }
            j1();
            i3 = R.id.exo_prev;
        } else if (i2 == 89) {
            j1();
            i3 = R.id.exo_rew;
        } else {
            if (i2 != 90) {
                if (i2 != 166) {
                    if (i2 != 167) {
                        if (i2 != 274) {
                            if (i2 != 275) {
                                return super.onKeyDown(i2, keyEvent);
                            }
                            j1();
                            i3 = R.id.exo_rew;
                        }
                    }
                    str2 = this.d1;
                    if (str2 == null) {
                    }
                    j1();
                    i3 = R.id.exo_prev;
                }
                str = this.d1;
                if (str == null) {
                }
                j1();
                i3 = R.id.exo_next;
            }
            j1();
            i3 = R.id.exo_ffwd;
        }
        findViewById(i3).performClick();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008a, code lost:
    
        if (r5.c1.equals("loadurl") == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074  */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyUp(int r6, android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerVODActivity.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        NSTIJKPlayerVOD nSTIJKPlayerVOD;
        super.onPause();
        String action = getIntent().getAction();
        if (x0.f9296a <= 23) {
            t1();
        }
        if (!"android.intent.action.VIEW".equals(action) || (nSTIJKPlayerVOD = this.U0) == null) {
            return;
        }
        if (nSTIJKPlayerVOD.t1()) {
            this.U0.j1();
        } else {
            this.U0.pause();
        }
        IjkMediaPlayer.native_profileEnd();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        c.h.a.h.n.e.g(this.f29406i);
        NSTIJKPlayerVOD nSTIJKPlayerVOD = this.U0;
        if (nSTIJKPlayerVOD != null) {
            nSTIJKPlayerVOD.o1();
            if (this.f29408k) {
                f29402e = false;
                this.f29408k = false;
                ArrayList<c.h.a.i.f> arrayList = this.U;
                if (arrayList == null || arrayList.size() == 0) {
                    l1();
                } else {
                    n1(this.U, this.z0);
                }
            }
            Y0();
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        Button button;
        super.onStop();
        try {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.U0;
            if (nSTIJKPlayerVOD != null && (button = nSTIJKPlayerVOD.u1) != null) {
                button.performClick();
                this.f29408k = false;
            }
        } catch (Exception e2) {
            Log.e("fsgd", "fdfh", e2);
        }
        try {
            t1();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0301  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p1(java.util.List<minefarts.iptvsmarters.model.callback.GetEpisdoeDetailsCallback> r31, int r32) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.ijkplayer.activities.NSTIJKPlayerVODActivity.p1(java.util.List, int):void");
    }

    public final void q1() {
        this.f29410m.setVisibility(8);
        this.f29409l.setVisibility(0);
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            findViewById(R.id.watrmrk).setVisibility(0);
        }
    }

    public final void r1() {
        this.f29409l.setVisibility(8);
        this.f29410m.setVisibility(0);
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            findViewById(R.id.watrmrk).setVisibility(0);
        }
    }

    public final void s1() {
        int iD;
        iD = c.h.a.k.e.a.f().d();
        String str = this.c1;
        str.hashCode();
        switch (str) {
            case "movies":
                if (iD == 0) {
                    c.h.a.k.e.a.f().o(this.U.size() - 1);
                    return;
                }
                break;
            case "series":
                if (iD == 0) {
                    c.h.a.k.e.a.f().o(this.b1.size() - 1);
                    return;
                }
                break;
            case "recording":
                if (iD == 0) {
                    c.h.a.k.e.a.f().o(this.G.size() - 1);
                    return;
                }
                break;
        }
        c.h.a.k.e.a.f().o(iD - 1);
    }

    public final void t1() {
        try {
            if (this.U0 != null) {
                this.H0 = this.f29406i.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = this.U0.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f29406i.getSharedPreferences("currentSeekTime", 0);
                this.H0 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.I0 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.I0.apply();
                NSTIJKPlayerVOD nSTIJKPlayerVOD = this.U0;
                if (nSTIJKPlayerVOD != null && currentPosition != -1 && currentPosition != 0) {
                    nSTIJKPlayerVOD.setCurrentPositionSeekbar(nSTIJKPlayerVOD.getCurrentPosition());
                    this.U0.setProgress(true);
                    this.U0.B1(true);
                }
                if (this.c1.equals("movies")) {
                    if (!this.K0.equals("m3u") && this.U0 != null && c.h.a.k.e.a.f().k() != -1 && currentPosition != -1 && currentPosition != 0) {
                        if (c.h.a.k.e.a.f().j() == c.h.a.k.e.a.f().k()) {
                            z1(c.h.a.k.e.a.f().k(), 0L);
                            c.h.a.k.e.a.f().r(0);
                        } else {
                            z1(c.h.a.k.e.a.f().k(), currentPosition);
                        }
                    }
                } else if (this.c1.equals("series") && ((this.U0 == null || c.h.a.k.e.a.f().b() == null || !this.K0.equals("m3u")) && c.h.a.k.e.a.f() != null && c.h.a.k.e.a.f().e() != null && currentPosition != -1 && currentPosition != 0)) {
                    if (c.h.a.k.e.a.f().j() == Integer.parseInt(c.h.a.k.e.a.f().e())) {
                        this.n1.j(c.h.a.k.e.a.f().e(), 0L);
                        c.h.a.k.e.a.f().r(0);
                    } else {
                        this.n1.j(c.h.a.k.e.a.f().e(), currentPosition);
                    }
                }
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.U0;
            if (nSTIJKPlayerVOD2 != null) {
                if (nSTIJKPlayerVOD2.t1()) {
                    this.U0.j1();
                } else {
                    this.U0.T1();
                    this.U0.z1(true);
                    this.U0.S1();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused) {
        }
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    public final void u1() {
        this.o0.postDelayed(new g(), 7000L);
    }

    public void v1() {
        findViewById(R.id.app_video_top_box).setVisibility(0);
        findViewById(R.id.controls).setVisibility(0);
        findViewById(R.id.ll_seekbar_time).setVisibility(0);
        if (c.h.a.h.n.a.f17047k.booleanValue()) {
            findViewById(R.id.watrmrk).setVisibility(0);
        }
    }

    public final void w1() {
        Handler handler = this.o0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final int x1(int i2, int i3) {
        return this.M0.Q(String.valueOf(i2), i3);
    }

    @SuppressLint({"ResourceType"})
    public final void y0(Context context) {
        if (this.U0 != null) {
            View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.subtitle_layout, (RadioGroup) findViewById(R.id.subtitle_radio_group));
            PopupWindow popupWindow = new PopupWindow(context);
            this.p0 = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.p0.setWidth(-1);
            this.p0.setHeight(-1);
            this.p0.setFocusable(true);
            this.p0.setOnDismissListener(new a());
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.subtitle_radio_group);
            RadioGroup radioGroup2 = (RadioGroup) viewInflate.findViewById(R.id.audio_radio_group);
            RadioGroup radioGroup3 = (RadioGroup) viewInflate.findViewById(R.id.video_radio_group);
            this.j0 = (TextView) viewInflate.findViewById(R.id.tv_no_audio_track);
            this.k0 = (TextView) viewInflate.findViewById(R.id.tv_no_subtitle_track);
            this.l0 = (TextView) viewInflate.findViewById(R.id.tv_no_video_track);
            Spinner spinner = (Spinner) viewInflate.findViewById(R.id.subtitle_font_size);
            this.X0 = spinner;
            try {
                ArrayAdapter arrayAdapter = (ArrayAdapter) spinner.getAdapter();
                SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
                this.Y0 = sharedPreferences;
                this.X0.setSelection(arrayAdapter.getPosition(sharedPreferences.getString("pref.using_sub_font_size", c.h.a.h.n.a.f0)));
            } catch (Exception unused) {
            }
            Spinner spinner2 = this.X0;
            if (spinner2 != null) {
                spinner2.setOnItemSelectedListener(new b());
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.U0;
            if (nSTIJKPlayerVOD != null) {
                nSTIJKPlayerVOD.Q1(radioGroup3, radioGroup2, radioGroup, this.p0, this.l0, this.j0, this.k0);
            }
            this.p0.showAtLocation(viewInflate, 1, 0, 0);
        }
    }

    public final int y1(String str, int i2) {
        return this.F.c2(str, i2);
    }

    public final void z1(int i2, long j2) {
        c.h.a.i.q.k kVar = this.M0;
        if (kVar != null) {
            kVar.c0(String.valueOf(i2), "movie", false, j2);
        }
    }
}
