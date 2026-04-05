package com.nst.iptvsmarterstvbox.model.pojo;

import c.f.d.v.a;
import c.f.d.v.c;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class SearchTMDBTVShowsResultPojo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("original_name")
    public String f25154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c(Name.MARK)
    public Integer f25155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a
    @c("name")
    public String f25156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a
    @c("vote_average")
    public Double f25157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a
    @c("first_air_date")
    public String f25158e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a
    @c("backdrop_path")
    public String f25160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a
    @c("overview")
    public String f25161h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a
    @c("genre_ids")
    public List<Integer> f25159f = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a
    @c("origin_country")
    public List<String> f25162i = null;

    public String a() {
        return this.f25160g;
    }

    public String b() {
        return this.f25158e;
    }

    public Integer c() {
        return this.f25155b;
    }

    public String d() {
        return this.f25156c;
    }

    public String e() {
        return this.f25154a;
    }

    public String f() {
        return this.f25161h;
    }

    public Double g() {
        return this.f25157d;
    }
}
