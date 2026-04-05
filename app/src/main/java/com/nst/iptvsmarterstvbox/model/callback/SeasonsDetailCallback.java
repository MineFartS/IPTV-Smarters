package com.nst.iptvsmarterstvbox.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class SeasonsDetailCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("air_date")
    public String f25026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("episode_count")
    public Integer f25027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a
    @c(Name.MARK)
    public Integer f25028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a
    @c("name")
    public String f25029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a
    @c("overview")
    public String f25030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a
    @c("season_number")
    public Integer f25031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a
    @c("cover")
    public String f25032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a
    @c("cover_big")
    public String f25033h;

    public String a() {
        return this.f25032g;
    }

    public String b() {
        return this.f25033h;
    }

    public Integer c() {
        return this.f25031f;
    }

    public void d(String str) {
        this.f25026a = str;
    }

    public void e(String str) {
        this.f25032g = str;
    }

    public void f(String str) {
        this.f25033h = str;
    }

    public void g(Integer num) {
        this.f25027b = num;
    }

    public void h(Integer num) {
        this.f25028c = num;
    }

    public void i(String str) {
        this.f25029d = str;
    }

    public void j(String str) {
        this.f25030e = str;
    }

    public void k(Integer num) {
        this.f25031f = num;
    }
}
