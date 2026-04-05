package com.nst.iptvsmarterstvbox.model.pojo;

import c.f.d.v.a;
import c.f.d.v.c;
import java.util.List;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class SearchTMDBMoviesResultPojo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c(Name.MARK)
    public Integer f25146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("vote_average")
    public Double f25147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a
    @c(ChartFactory.TITLE)
    public String f25148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a
    @c("original_title")
    public String f25149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a
    @c("genre_ids")
    public List<Integer> f25150e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a
    @c("backdrop_path")
    public String f25151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a
    @c("overview")
    public String f25152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a
    @c("release_date")
    public String f25153h;

    public String a() {
        return this.f25151f;
    }

    public Integer b() {
        return this.f25146a;
    }

    public String c() {
        return this.f25149d;
    }

    public String d() {
        return this.f25152g;
    }

    public String e() {
        return this.f25153h;
    }

    public String f() {
        return this.f25148c;
    }

    public Double g() {
        return this.f25147b;
    }
}
