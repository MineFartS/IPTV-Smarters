package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aib extends ain {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private aty<String> f19803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19805o;
    private boolean p;
    private aty<String> q;
    private boolean r;
    private boolean s;
    private final SparseArray<Map<act, aid>> t;
    private final SparseBooleanArray u;

    @Deprecated
    public aib() {
        c();
        this.t = new SparseArray<>();
        this.u = new SparseBooleanArray();
    }

    public aib(Context context) {
        b(context);
        c();
        this.t = new SparseArray<>();
        this.u = new SparseBooleanArray();
        Point pointT = amn.t(context);
        int i2 = pointT.x;
        int i3 = pointT.y;
        this.f19800j = i2;
        this.f19801k = i3;
        this.f19802l = true;
    }

    private final void c() {
        this.f19794d = Integer.MAX_VALUE;
        this.f19795e = Integer.MAX_VALUE;
        this.f19796f = Integer.MAX_VALUE;
        this.f19797g = Integer.MAX_VALUE;
        this.f19798h = true;
        this.f19799i = true;
        this.f19800j = Integer.MAX_VALUE;
        this.f19801k = Integer.MAX_VALUE;
        this.f19802l = true;
        this.f19803m = aty.n();
        this.f19804n = Integer.MAX_VALUE;
        this.f19805o = Integer.MAX_VALUE;
        this.p = true;
        this.q = aty.n();
        this.r = true;
        this.s = true;
    }

    public final aia a() {
        return new aia(this.f19794d, this.f19795e, this.f19796f, this.f19797g, this.f19798h, this.f19799i, this.f19800j, this.f19801k, this.f19802l, this.f19803m, this.f19841a, this.f19804n, this.f19805o, this.p, this.q, this.f19842b, this.f19843c, this.r, this.s, this.t, this.u);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ain
    public final /* bridge */ /* synthetic */ void b(Context context) {
        super.b(context);
    }
}
