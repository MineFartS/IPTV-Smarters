package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bw implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bw f21515a = new bw();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f21516b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f21517c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Runnable f21518d = new bt(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Runnable f21519e = new bt();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21521g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f21525k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<bv> f21520f = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final bq f21523i = new bq();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final bg f21522h = new bg();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final br f21524j = new br(new bz());

    public static bw d() {
        return f21515a;
    }

    public static /* synthetic */ void g(bw bwVar) {
        bwVar.f21521g = 0;
        bwVar.f21525k = System.nanoTime();
        bwVar.f21523i.i();
        long jNanoTime = System.nanoTime();
        bf bfVarA = bwVar.f21522h.a();
        if (bwVar.f21523i.e().size() > 0) {
            for (String str : bwVar.f21523i.e()) {
                JSONObject jSONObjectA = bfVarA.a(null);
                View viewA = bwVar.f21523i.a(str);
                bf bfVarB = bwVar.f21522h.b();
                String strC = bwVar.f21523i.c(str);
                if (strC != null) {
                    JSONObject jSONObjectA2 = bfVarB.a(viewA);
                    bo.c(jSONObjectA2, str);
                    bo.f(jSONObjectA2, strC);
                    bo.d(jSONObjectA, jSONObjectA2);
                }
                bo.i(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                bwVar.f21524j.c(jSONObjectA, hashSet, jNanoTime);
            }
        }
        if (bwVar.f21523i.f().size() > 0) {
            JSONObject jSONObjectA3 = bfVarA.a(null);
            bwVar.k(null, bfVarA, jSONObjectA3, 1);
            bo.i(jSONObjectA3);
            bwVar.f21524j.d(jSONObjectA3, bwVar.f21523i.f(), jNanoTime);
        } else {
            bwVar.f21524j.b();
        }
        bwVar.f21523i.g();
        long jNanoTime2 = System.nanoTime() - bwVar.f21525k;
        if (bwVar.f21520f.size() > 0) {
            for (bv bvVar : bwVar.f21520f) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                bvVar.b();
                if (bvVar instanceof bu) {
                    ((bu) bvVar).a();
                }
            }
        }
    }

    private final void k(View view, bf bfVar, JSONObject jSONObject, int i2) {
        bfVar.b(view, jSONObject, this, i2 == 1);
    }

    private static final void l() {
        Handler handler = f21517c;
        if (handler != null) {
            handler.removeCallbacks(f21519e);
            f21517c = null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.be
    public final void a(View view, bf bfVar, JSONObject jSONObject) {
        int iJ;
        if (ly.e(view) != null || (iJ = this.f21523i.j(view)) == 3) {
            return;
        }
        JSONObject jSONObjectA = bfVar.a(view);
        bo.d(jSONObject, jSONObjectA);
        String strD = this.f21523i.d(view);
        if (strD != null) {
            bo.c(jSONObjectA, strD);
            this.f21523i.h();
        } else {
            bp bpVarB = this.f21523i.b(view);
            if (bpVarB != null) {
                bo.e(jSONObjectA, bpVarB);
            }
            k(view, bfVar, jSONObjectA, iJ);
        }
        this.f21521g++;
    }

    public final void h() {
        l();
    }

    public final void i() {
        if (f21517c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21517c = handler;
            handler.post(f21518d);
            f21517c.postDelayed(f21519e, 200L);
        }
    }

    public final void j() {
        l();
        this.f21520f.clear();
        f21516b.post(new bs(this));
    }
}
