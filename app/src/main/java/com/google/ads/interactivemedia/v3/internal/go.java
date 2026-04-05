package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class go extends gm {
    public static final Object r = new Object();
    public static boolean s = false;
    private static final String u = "go";
    private static long v;
    public final String t;

    public go(Context context) {
        super(context);
        this.t = BuildConfig.FLAVOR;
    }

    public go(Context context, byte[] bArr) {
        super(context);
        this.t = "a.3.24.0";
    }

    public static hc o(Context context, boolean z) {
        if (gm.f21852a == null) {
            synchronized (r) {
                if (gm.f21852a == null) {
                    hc hcVarS = hc.s(context, z);
                    if (hcVarS.n()) {
                        try {
                            if (aoo.f20309l.f().booleanValue()) {
                                hcVarS.t("gRg4fCi0LCTpnQrV3PsNLy90ZesL/QRa6YWri3+gAi7rRcznZqsXWOYXHOmcY7vO", "3pkKTVgLDXVJJ5N8zGXuZSULCDRtq3PN/ITUaJE7BOs=", new Class[0]);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        hcVarS.t("llqwiPI9WBGdX3ILtNQP0ldd/oo65vCmZGiUmTtHOSQw67bDkVyvEAM6wctf4g5A", "ciEjxtHwaQq5vQY33BpqQuStjcQqNXynEA7E/ixfFmM=", Context.class);
                        hcVarS.t("Ta7q+IK2mYjuCH0of+Vj0vM5Rtwz8hWo89Z4HIfL3B2t8tHFxG0TQ0Yh0ikc7raQ", "BnUGtdO8J5ukLmkm+ZGsWDuDWstQiBaJlb5Kf+8oxak=", Context.class);
                        hcVarS.t("h706sF1zmcc4AioWh+Jfvy0LKolmQxQ7/qBdFNEqjMTCjpxVey9eXR4ewnu7+Xxj", "PpTasJ7rye0SEy8bP+e639N2f2p/VqK1Ye1mnYIaTjk=", Context.class);
                        hcVarS.t("TiB8Pl2o8LKtvrRgwN2UZPBx2FfVwXaA2LJIyoIsON4gk8JWSfnQXytrQilOHtcO", "aBYwH2ThFYuy1U18GzcFTBDhpF5mRbr30vOPELmr1Hc=", Context.class);
                        hcVarS.t("wZfQ+wDgR9IoosBg1su/yp7pQRnlrEzlYNBZbby3s7Z70mOof0UhZ+SwlYLoIxzT", "DXH16eFlLWYw0RtLAgHDBKxBeg2exJb8qLqayb1oQwo=", Context.class);
                        Class<?> cls = Boolean.TYPE;
                        hcVarS.t("4GWYMakWxK9XLQ6iDAU2C2VTll8aRULhAGrQnxilr2Nj0cSsO+IgSBJ8ViB0NlP9", "taliwg2sD442czfWRrq8VGyNA1t1bXjQxpcCvWnfA/c=", Context.class, cls);
                        hcVarS.t("FiLUZy/XwdzoXuv+wZ8fpBUMomrb2qDVGXE0AhvrFclxf2680Tj+s03XL4ZGGoFK", "G77t423Wv8U+IX+CBfR4k5CGTg8kBFUl+lsHl5zHfM8=", Context.class);
                        hcVarS.t("C4ABHXMC4Or135sUJAGmAZL7HooHNZP1UfgRABckcZiPz1ZmVgJdnOYsXpFfGNDm", "g3OSAw6b49bJrXDnrxpVD58FlN62AVv4SO1GAfJ7rnU=", Context.class);
                        hcVarS.t("enqIddPeKRqzFvVteSKtHxsfYkr9j2sQcVvzi4qN22kodz5l8F1EhNG7Vy+jrIdF", "ugRDevdIiSCQKB4w29ZHZLzgZXa3WguWUJypfhKkgpE=", MotionEvent.class, DisplayMetrics.class);
                        hcVarS.t("O8xHH+SQOcjF3BJdz0zTyJmLBvbpWLOG8WSxjEODJJ+MImKFrTu/OMcO8AkFY+Pq", "kel/WTUFttZVEFo0c79yp61JugW4yicQRy1hbDIEKZQ=", MotionEvent.class, DisplayMetrics.class);
                        hcVarS.t("zu63YSe1kidAeMcutkZVGzck9psTtGHz7PCNeED4MwOFY27ac/4JVy5q1i6kfidt", "NW4aS3lNi8fmvEi+Ve4jL+4aAzt/ssbWQU153xX+T2c=", new Class[0]);
                        hcVarS.t("cPHMZVY/KwIUfpGqtJoe3sZWjmRLYCJUzedPb6Eusduzq1fr7QzoocP3s4SDqjiP", "Wq/IKBdmFHBPtcQG2uw+enxSoneybsCZd6x3sGCEaqo=", new Class[0]);
                        hcVarS.t("QusX5FxCSt7YALporGf+YBQ7+D9RItA2wCGYVD5mk8FUIvZ7EQ6LwVnumJjBeUBd", "rfyFxeBVRrcpHOkzoebVIka/58kwozJ0Dt9pVZcWCXE=", new Class[0]);
                        hcVarS.t("lJImmJcZfYR8hdrMtfVgK5wxyzq2Tz1kfG0dB54yhkfwwl7Exs4yXjgCxWvlOEKN", "xAGN8erZZwMSW/Fu3r0voEWCBbBpqzcnOOBzjHGoZvo=", new Class[0]);
                        hcVarS.t("2dswfnJ/W5wvAmGjTx8kzB+odO16I5BX/UKh5zlazknHfACvhbFP+Zqb0TpxIZsQ", "ejLzeiJ5qubwImg6nJzCiB7UFg2tGEG87mpwCGv3DVQ=", new Class[0]);
                        hcVarS.t("vqUJad0IKYPcLSc6wz31ENI5WnkoRer3N0DDhyZAihcW/s/bFNITftupRFfgp5qw", "9clJleQw8UkEhJcm6dFXqXawxyXf3mRG67a4lWsdtlk=", new Class[0]);
                        hcVarS.t("1EA+kmHznPumSxbhAp5gNBZCuE/8gd/8nXHr3+4N+BC7/aHUweFYbF77Za3km6PL", "n+EIVanZgVE5bWZK/bmUeAKMrsDwbmyGU+LX/MkMxZ0=", Context.class, cls, String.class);
                        hcVarS.t("vuf0ICTkN+8t3/Roe9XcG+iOkkRVIongIbQ07rmD3KnIXUvNCzewBpWyZLB3p3/7", "wNtnu9iz9FxlWQ/xUwtzm8lbyA6loylNTisLT38FjBA=", StackTraceElement[].class);
                        hcVarS.t("omAlF62gEMrNCr0H2QBW8XF28QiQE0CMIbyOpElqQZ4tBrxF8DZXvihPhTWIx0tC", "dyzDhPt8uBzEduoVVJNMFQS7AR2KfsUmAWoQzpkryTU=", View.class, DisplayMetrics.class, cls);
                        hcVarS.t("zC/fwdDuQM8Ntp2Exq4j6LLE+G4/I91mCFjFlTTx2t2L43JC1sGihEzWo+AiDO3l", "m91XZsk+YhuzWKD4cAkZ4TbV2JwQi634x6I7GtEZSF0=", Context.class, cls);
                        hcVarS.t("rJ0kz5REr7A9K6ozGPC9p0oxIBL7S4eVwdLIqy6EWt/H1xyroUvdpxSKqrgIZI+n", "8IixZ0CbQtqPEft6f86OLqdXtqxnPQDWPkO7PVnus4g=", View.class, Activity.class, cls);
                        hcVarS.t("HGo1ox5JLQS5or5cJa/Y/rh1xBDCHENOhVObQPPiVgVWewsU7bgdJYYTcTgXDqTz", "4/LuQCxE41OF3+ELaCV0AA8Jaj2RFLkgJd6cCnnHOg0=", Long.TYPE);
                        try {
                            if (aoo.p.f().booleanValue()) {
                                hcVarS.t("VkS+X+TtwRpHm8NnTYcac+8VmOK3ly2dr/dAyJrO24Sc1GEe26lkfA2Nk61lr0mw", "iqnfwKKqiNqrk8VWEttLTKe7o3UJQGSCfPqGJpMmsBc=", Context.class);
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        hcVarS.t("b9XzHrtU52kppUFx5howa5WHGE86IaMftNEAtcnJuYi+uEVxQTZmNq8DYIFxWMDO", "GrB7raJKFFs9kqGoJu059MGrbQoaWMXN8wftnS9PR9E=", Context.class);
                        try {
                            if (aoo.q.f().booleanValue()) {
                                hcVarS.t("Ae9mLw6DieU6CkEK/7YH/OzafEdqC4DFUzWP+JjqqVRigWL+f2BfdAU5N7woTkgh", "polEyvU3tCmJkXt7bnSM/FeltrQOydBw/hlfUSqZ8J0=", Context.class);
                            }
                        } catch (IllegalStateException unused3) {
                        }
                    }
                    gm.f21852a = hcVarS;
                }
            }
        }
        return gm.f21852a;
    }

    public static he p(hc hcVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws gv {
        Method methodH = hcVar.h("enqIddPeKRqzFvVteSKtHxsfYkr9j2sQcVvzi4qN22kodz5l8F1EhNG7Vy+jrIdF", "ugRDevdIiSCQKB4w29ZHZLzgZXa3WguWUJypfhKkgpE=");
        if (methodH == null || motionEvent == null) {
            throw new gv();
        }
        try {
            return new he((String) methodH.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new gv(e2);
        }
    }

    public static synchronized void q(Context context, boolean z) {
        if (s) {
            return;
        }
        v = System.currentTimeMillis() / 1000;
        gm.f21852a = o(context, z);
        s = true;
    }

    public static final void s(List<Callable<Void>> list) {
        ExecutorService executorServiceI;
        if (gm.f21852a == null || (executorServiceI = gm.f21852a.i()) == null || list.isEmpty()) {
            return;
        }
        try {
            executorServiceI.invokeAll(list, aoo.f20304g.f().longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            Log.d(u, String.format("class methods got exception: %s", hf.d(e2)));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gm
    public final long d(StackTraceElement[] stackTraceElementArr) throws gv {
        Method methodH = gm.f21852a.h("vuf0ICTkN+8t3/Roe9XcG+iOkkRVIongIbQ07rmD3KnIXUvNCzewBpWyZLB3p3/7", "wNtnu9iz9FxlWQ/xUwtzm8lbyA6loylNTisLT38FjBA=");
        if (methodH == null || stackTraceElementArr == null) {
            throw new gv();
        }
        try {
            return new gw((String) methodH.invoke(null, stackTraceElementArr)).f21877a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new gv(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gm
    public final k e(Context context, f fVar) {
        k kVarA = u.a();
        if (!TextUtils.isEmpty(this.t)) {
            kVarA.d(this.t);
        }
        m(o(context, false), context, kVarA, fVar);
        if (fVar != null && fVar.g() && aoo.f20307j.f().booleanValue() && !hf.f(fVar.e().e())) {
            ae aeVarA = af.a();
            aeVarA.a(fVar.e().e());
            kVarA.C(aeVarA.ac());
        }
        return kVarA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gm
    public final he f(MotionEvent motionEvent) throws gv {
        Method methodH = gm.f21852a.h("O8xHH+SQOcjF3BJdz0zTyJmLBvbpWLOG8WSxjEODJJ+MImKFrTu/OMcO8AkFY+Pq", "kel/WTUFttZVEFo0c79yp61JugW4yicQRy1hbDIEKZQ=");
        if (methodH == null || motionEvent == null) {
            throw new gv();
        }
        try {
            return new he((String) methodH.invoke(null, motionEvent, this.q));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new gv(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gm
    public k h(Context context) {
        k kVarA = u.a();
        if (!TextUtils.isEmpty(this.t)) {
            kVarA.d(this.t);
        }
        r(o(context, false), kVarA, true);
        return kVarA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gm
    public k i(Context context) {
        k kVarA = u.a();
        kVarA.d(this.t);
        r(o(context, false), kVarA, false);
        return kVarA;
    }

    public List<Callable<Void>> l(hc hcVar, Context context, k kVar, f fVar) {
        int iA = hcVar.a();
        ArrayList arrayList = new ArrayList();
        if (!hcVar.n()) {
            kVar.B(o.PSN_INITIALIZATION_FAIL.a());
            return arrayList;
        }
        arrayList.add(new hj(hcVar, kVar, iA, context, fVar));
        arrayList.add(new hm(hcVar, kVar, v, iA));
        arrayList.add(new ht(hcVar, kVar, iA));
        arrayList.add(new hw(hcVar, kVar, iA));
        arrayList.add(new ib(hcVar, kVar, iA));
        arrayList.add(new hi(hcVar, kVar, iA, context));
        arrayList.add(new hk(hcVar, kVar, iA));
        arrayList.add(new hs(hcVar, kVar, iA));
        arrayList.add(new hu(hcVar, kVar, iA));
        arrayList.add(new hl(hcVar, kVar, iA));
        arrayList.add(new hp(hcVar, kVar, iA));
        arrayList.add(new ic(hcVar, kVar, iA));
        arrayList.add(new hh(hcVar, kVar, iA));
        arrayList.add(new hz(hcVar, kVar, iA));
        arrayList.add(new hx(hcVar, kVar, iA));
        if (aoo.q.f().booleanValue()) {
            arrayList.add(new hr(hcVar, kVar, iA));
        }
        if (aoo.p.f().booleanValue()) {
            arrayList.add(new hv(hcVar, kVar, iA));
        }
        arrayList.add(new hq(hcVar, kVar, iA));
        return arrayList;
    }

    public void m(hc hcVar, Context context, k kVar, f fVar) {
        if (hcVar.i() == null) {
            return;
        }
        s(l(hcVar, context, kVar, fVar));
    }

    public final void r(hc hcVar, k kVar, boolean z) {
        List listAsList;
        Long lValueOf;
        MotionEvent motionEvent;
        if (hcVar.n()) {
            try {
                he heVarP = p(hcVar, this.f21853b, this.q);
                Long l2 = heVarP.f21908a;
                if (l2 != null) {
                    kVar.M(l2.longValue());
                }
                Long l3 = heVarP.f21909b;
                if (l3 != null) {
                    kVar.N(l3.longValue());
                }
                Long l4 = heVarP.f21910c;
                if (l4 != null) {
                    kVar.K(l4.longValue());
                }
                if (this.p) {
                    Long l5 = heVarP.f21911d;
                    if (l5 != null) {
                        kVar.J(l5.longValue());
                    }
                    Long l6 = heVarP.f21912e;
                    if (l6 != null) {
                        kVar.G(l6.longValue());
                    }
                }
            } catch (gv unused) {
            }
            q qVarA = r.a();
            if (this.f21855d > 0 && hf.g(this.q)) {
                qVarA.f(hf.a(this.f21862k, this.q));
                qVarA.s(hf.a(this.f21865n - this.f21863l, this.q));
                qVarA.t(hf.a(this.f21866o - this.f21864m, this.q));
                qVarA.l(hf.a(this.f21863l, this.q));
                qVarA.n(hf.a(this.f21864m, this.q));
                if (this.p && (motionEvent = this.f21853b) != null) {
                    long jA = hf.a(((this.f21863l - this.f21865n) + motionEvent.getRawX()) - this.f21853b.getX(), this.q);
                    if (jA != 0) {
                        qVarA.q(jA);
                    }
                    long jA2 = hf.a(((this.f21864m - this.f21866o) + this.f21853b.getRawY()) - this.f21853b.getY(), this.q);
                    if (jA2 != 0) {
                        qVarA.r(jA2);
                    }
                }
            }
            try {
                he heVarF = f(this.f21853b);
                Long l7 = heVarF.f21908a;
                if (l7 != null) {
                    qVarA.m(l7.longValue());
                }
                Long l8 = heVarF.f21909b;
                if (l8 != null) {
                    qVarA.o(l8.longValue());
                }
                qVarA.k(heVarF.f21910c.longValue());
                if (this.p) {
                    Long l9 = heVarF.f21912e;
                    if (l9 != null) {
                        qVarA.i(l9.longValue());
                    }
                    Long l10 = heVarF.f21911d;
                    if (l10 != null) {
                        qVarA.j(l10.longValue());
                    }
                    Long l11 = heVarF.f21913f;
                    if (l11 != null) {
                        qVarA.e(l11.longValue() != 0 ? ab.ENUM_TRUE : ab.ENUM_FALSE);
                    }
                    if (this.f21856e > 0) {
                        if (hf.g(this.q)) {
                            double d2 = this.f21861j;
                            double d3 = this.f21856e;
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            lValueOf = Long.valueOf(Math.round(d2 / d3));
                        } else {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            qVarA.b(lValueOf.longValue());
                        } else {
                            qVarA.a();
                        }
                        double d4 = this.f21860i;
                        double d5 = this.f21856e;
                        Double.isNaN(d4);
                        Double.isNaN(d5);
                        qVarA.c(Math.round(d4 / d5));
                    }
                    Long l12 = heVarF.f21916i;
                    if (l12 != null) {
                        qVarA.g(l12.longValue());
                    }
                    Long l13 = heVarF.f21917j;
                    if (l13 != null) {
                        qVarA.p(l13.longValue());
                    }
                    Long l14 = heVarF.f21918k;
                    if (l14 != null) {
                        qVarA.d(l14.longValue() != 0 ? ab.ENUM_TRUE : ab.ENUM_FALSE);
                    }
                }
            } catch (gv unused2) {
            }
            long j2 = this.f21859h;
            if (j2 > 0) {
                qVarA.h(j2);
            }
            kVar.O(qVarA.ac());
            long j3 = this.f21855d;
            if (j3 > 0) {
                kVar.H(j3);
            }
            long j4 = this.f21856e;
            if (j4 > 0) {
                kVar.I(j4);
            }
            long j5 = this.f21857f;
            if (j5 > 0) {
                kVar.L(j5);
            }
            long j6 = this.f21858g;
            if (j6 > 0) {
                kVar.F(j6);
            }
            try {
                int size = this.f21854c.size() - 1;
                if (size > 0) {
                    kVar.b();
                    for (int i2 = 0; i2 < size; i2++) {
                        he heVarP2 = p(gm.f21852a, this.f21854c.get(i2), this.q);
                        q qVarA2 = r.a();
                        qVarA2.m(heVarP2.f21908a.longValue());
                        qVarA2.o(heVarP2.f21909b.longValue());
                        kVar.a(qVarA2.ac());
                    }
                }
            } catch (gv unused3) {
                kVar.b();
            }
            ArrayList arrayList = new ArrayList();
            if (hcVar.i() != null) {
                int iA = hcVar.a();
                arrayList.add(new ho(hcVar, kVar));
                arrayList.add(new ht(hcVar, kVar, iA));
                arrayList.add(new hm(hcVar, kVar, v, iA));
                arrayList.add(new hl(hcVar, kVar, iA));
                arrayList.add(new hs(hcVar, kVar, iA));
                arrayList.add(new hu(hcVar, kVar, iA));
                arrayList.add(new hp(hcVar, kVar, iA));
                arrayList.add(new hk(hcVar, kVar, iA));
                arrayList.add(new ic(hcVar, kVar, iA));
                arrayList.add(new hh(hcVar, kVar, iA));
                arrayList.add(new hz(hcVar, kVar, iA));
                arrayList.add(new hy(hcVar, kVar, iA, new Throwable().getStackTrace()));
                arrayList.add(new id(hcVar, kVar, iA));
                arrayList.add(new hx(hcVar, kVar, iA));
                if (aoo.f20305h.f().booleanValue()) {
                    arrayList.add(new hg(hcVar, kVar, iA));
                }
                if (z && aoo.f20306i.f().booleanValue()) {
                    arrayList.add(new ia(hcVar, kVar, iA));
                }
            }
            listAsList = arrayList;
        } else {
            kVar.B(o.PSN_INITIALIZATION_FAIL.a());
            listAsList = Arrays.asList(new ho(hcVar, kVar));
        }
        s(listAsList);
    }
}
