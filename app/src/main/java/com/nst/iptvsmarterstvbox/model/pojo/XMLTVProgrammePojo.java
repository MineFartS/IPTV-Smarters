package com.nst.iptvsmarterstvbox.model.pojo;

import java.io.Serializable;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

/* JADX INFO: loaded from: classes2.dex */
@Root(name = "programme", strict = false)
public class XMLTVProgrammePojo implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Attribute(name = "start", required = false)
    public String f25192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Attribute(name = "channel", required = false)
    public String f25193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Attribute(name = "stop", required = false)
    public String f25194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Text(required = false)
    @Path(ChartFactory.TITLE)
    public String f25195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Text(required = false)
    @Path("desc")
    public String f25196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Text(required = false)
    @Path("category")
    public String f25197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Text(required = false)
    @Path("episode-num")
    public String f25198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Text(required = false)
    @Path("date")
    public String f25199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Text(required = false)
    @Path("sub-title")
    public String f25200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Text(required = false)
    @Path("icon")
    public String f25201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Text(required = false)
    @Path("country")
    public String f25202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f25203m = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f25204n = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f25205o = BuildConfig.FLAVOR;
    public String p = BuildConfig.FLAVOR;
    public String q = BuildConfig.FLAVOR;
    public String r = BuildConfig.FLAVOR;
    public String s = BuildConfig.FLAVOR;
    public String t;
    public String u;

    public void A(String str) {
        this.f25195e = str;
    }

    public void B(String str) {
        this.r = str;
    }

    public String a() {
        return this.f25193c;
    }

    public String b() {
        return this.f25196f;
    }

    public String c() {
        return this.u;
    }

    public String d() {
        return this.q;
    }

    public String e() {
        return this.f25204n;
    }

    public String f() {
        return this.f25203m;
    }

    public String g() {
        return this.p;
    }

    public String h() {
        return this.f25205o;
    }

    public String i() {
        return this.s;
    }

    public String j() {
        return this.f25192b;
    }

    public String k() {
        return this.t;
    }

    public String l() {
        return this.f25194d;
    }

    public String m() {
        return this.f25195e;
    }

    public String n() {
        return this.r;
    }

    public void o(String str) {
        this.f25193c = str;
    }

    public void p(String str) {
        this.f25196f = str;
    }

    public void q(String str) {
        this.u = str;
    }

    public void r(String str) {
        this.q = str;
    }

    public void s(String str) {
        this.f25204n = str;
    }

    public void t(String str) {
        this.f25203m = str;
    }

    public String toString() {
        return "ClassPojo [stop = " + this.f25194d + ",  title = " + this.f25195e + ", category = " + this.f25197g + ", episode-num = " + this.f25198h + ", date = " + this.f25199i + ", country = " + this.f25202l + ", icon = " + this.f25201k + ", sub-title = " + this.f25200j + ",desc = " + this.f25196f + ", start = " + this.f25192b + ", channel = " + this.f25193c + "]";
    }

    public void u(String str) {
        this.p = str;
    }

    public void v(String str) {
        this.f25205o = str;
    }

    public void w(String str) {
        this.s = str;
    }

    public void x(String str) {
        this.f25192b = str;
    }

    public void y(String str) {
        this.t = str;
    }

    public void z(String str) {
        this.f25194d = str;
    }
}
