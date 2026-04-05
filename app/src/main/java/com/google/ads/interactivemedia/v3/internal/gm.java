package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class gm implements gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile hc f21852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MotionEvent f21853b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f21862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f21863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f21864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f21865n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f21866o;
    public DisplayMetrics q;
    private double r;
    private double s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList<MotionEvent> f21854c = new LinkedList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21855d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21856e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21857f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21858g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21859h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21860i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21861j = 0;
    private boolean t = false;
    public boolean p = false;

    public gm(Context context) {
        try {
            if (aoo.f20311n.f().booleanValue()) {
                fu.c();
            } else {
                hd.a(f21852a);
            }
            this.q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4 A[Catch: Exception -> 0x00ea, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ea, blocks: (B:45:0x00b2, B:48:0x00bf, B:56:0x00db, B:57:0x00e4), top: B:74:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String j(android.content.Context r19, java.lang.String r20, int r21, byte[] r22) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.gm.j(android.content.Context, java.lang.String, int, byte[]):java.lang.String");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gl
    public final String a(Context context) {
        if (hf.e()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return j(context, null, 1, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gl
    public final void b(MotionEvent motionEvent) {
        Long l2;
        if (this.t) {
            this.f21859h = 0L;
            this.f21855d = 0L;
            this.f21856e = 0L;
            this.f21857f = 0L;
            this.f21858g = 0L;
            this.f21860i = 0L;
            this.f21861j = 0L;
            if (this.f21854c.size() > 0) {
                Iterator<MotionEvent> it = this.f21854c.iterator();
                while (it.hasNext()) {
                    it.next().recycle();
                }
                this.f21854c.clear();
            } else {
                MotionEvent motionEvent2 = this.f21853b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
            }
            this.f21853b = null;
            this.t = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21862k = 0.0d;
            this.r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d2 = this.r;
            Double.isNaN(rawX);
            double d3 = rawX - d2;
            double d4 = this.s;
            Double.isNaN(rawY);
            double d5 = rawY - d4;
            this.f21862k += Math.sqrt((d3 * d3) + (d5 * d5));
            this.r = rawX;
            this.s = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.f21853b = motionEventObtain;
                    this.f21854c.add(motionEventObtain);
                    if (this.f21854c.size() > 6) {
                        this.f21854c.remove().recycle();
                    }
                    this.f21857f++;
                    this.f21859h = d(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.f21856e += (long) (motionEvent.getHistorySize() + 1);
                    he heVarF = f(motionEvent);
                    Long l3 = heVarF.f21911d;
                    if (l3 != null && heVarF.f21914g != null) {
                        this.f21860i += l3.longValue() + heVarF.f21914g.longValue();
                    }
                    if (this.q != null && (l2 = heVarF.f21912e) != null && heVarF.f21915h != null) {
                        this.f21861j += l2.longValue() + heVarF.f21915h.longValue();
                    }
                } else if (action2 == 3) {
                    this.f21858g++;
                }
            } catch (gv unused) {
            }
        } else {
            this.f21863l = motionEvent.getX();
            this.f21864m = motionEvent.getY();
            this.f21865n = motionEvent.getRawX();
            this.f21866o = motionEvent.getRawY();
            this.f21855d++;
        }
        this.p = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gl
    public final String c(Context context, String str) {
        return j(context, str, 3, null);
    }

    public abstract long d(StackTraceElement[] stackTraceElementArr);

    public abstract k e(Context context, f fVar);

    public abstract he f(MotionEvent motionEvent);

    public final String g(Context context, byte[] bArr) {
        if (hf.e()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return j(context, null, 1, bArr);
    }

    public abstract k h(Context context);

    public abstract k i(Context context);
}
