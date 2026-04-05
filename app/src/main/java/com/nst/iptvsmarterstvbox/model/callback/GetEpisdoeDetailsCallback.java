package minefarts.iptvsmarters.model.callback;

import c.f.d.v.c;
import c.h.a.h.n.a;
import java.io.Serializable;
import java.util.Comparator;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class GetEpisdoeDetailsCallback implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Comparator<GetEpisdoeDetailsCallback> f24966b = new Comparator<GetEpisdoeDetailsCallback>() { // from class: minefarts.iptvsmarters.model.callback.GetEpisdoeDetailsCallback.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(GetEpisdoeDetailsCallback getEpisdoeDetailsCallback, GetEpisdoeDetailsCallback getEpisdoeDetailsCallback2) {
            if (a.B == a.C) {
                return getEpisdoeDetailsCallback.u().toUpperCase().compareTo(getEpisdoeDetailsCallback2.u().toUpperCase());
            }
            if (a.B == a.D) {
                return getEpisdoeDetailsCallback2.u().toUpperCase().compareTo(getEpisdoeDetailsCallback.u().toUpperCase());
            }
            if (a.B != a.E) {
                return 0;
            }
            return getEpisdoeDetailsCallback2.a().toUpperCase().compareTo(getEpisdoeDetailsCallback.a().toUpperCase());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @c.f.d.v.a
    @c(Name.MARK)
    public String f24967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @c.f.d.v.a
    @c(ChartFactory.TITLE)
    public String f24968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @c.f.d.v.a
    @c("container_extension")
    public String f24969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @c.f.d.v.a
    @c("custom_sid")
    public String f24970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @c.f.d.v.a
    @c("added")
    public String f24971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @c.f.d.v.a
    @c("direct_source")
    public String f24972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f24973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f24975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f24976l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f24977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f24978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f24979o;
    public String p;
    public String q;
    public String r;
    public int s;
    public String t;
    public String u;
    public String v;
    public String w;

    @c.f.d.v.a
    @c("season")
    public Integer x;
    public Integer y;

    public void A(String str) {
        this.f24972h = str;
    }

    public void B(String str) {
        this.q = str;
    }

    public void C(String str) {
        this.r = str;
    }

    public void D(String str) {
        this.f24977m = str;
    }

    public void E(Integer num) {
        this.y = num;
    }

    public void F(int i2) {
        this.s = i2;
    }

    public void G(String str) {
        this.f24967c = str;
    }

    public void H(String str) {
        this.f24974j = str;
    }

    public void I(String str) {
        this.t = str;
    }

    public void J(String str) {
        this.u = str;
    }

    public void K(String str) {
        this.f24973i = str;
    }

    public void L(String str) {
        this.f24979o = str;
    }

    public void M(Integer num) {
        this.x = num;
    }

    public void N(String str) {
        this.f24976l = str;
    }

    public void O(String str) {
        this.f24978n = str;
    }

    public void P(String str) {
        this.w = str;
    }

    public void Q(String str) {
        this.v = str;
    }

    public void R(String str) {
        this.f24968d = str;
    }

    public String a() {
        return this.f24971g;
    }

    public String b() {
        return this.f24975k;
    }

    public String c() {
        return this.f24969e;
    }

    public String d() {
        return this.p;
    }

    public String e() {
        return this.q;
    }

    public String f() {
        return this.r;
    }

    public String g() {
        return this.f24977m;
    }

    public Integer h() {
        return this.y;
    }

    public int i() {
        return this.s;
    }

    public String j() {
        return this.f24967c;
    }

    public String k() {
        return this.f24974j;
    }

    public String l() {
        return this.t;
    }

    public String m() {
        return this.u;
    }

    public String n() {
        return this.f24973i;
    }

    public String o() {
        return this.f24979o;
    }

    public Integer p() {
        return this.x;
    }

    public String q() {
        return this.f24976l;
    }

    public String r() {
        return this.f24978n;
    }

    public String s() {
        return this.w;
    }

    public String t() {
        return this.v;
    }

    public String u() {
        return this.f24968d;
    }

    public void v(String str) {
        this.f24971g = str;
    }

    public void w(String str) {
        this.f24975k = str;
    }

    public void x(String str) {
        this.f24969e = str;
    }

    public void y(String str) {
        this.f24970f = str;
    }

    public void z(String str) {
        this.p = str;
    }
}
