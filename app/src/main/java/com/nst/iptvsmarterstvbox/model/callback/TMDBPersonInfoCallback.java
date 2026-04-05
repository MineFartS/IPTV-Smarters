package com.nst.iptvsmarterstvbox.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;
import com.nst.iptvsmarterstvbox.model.pojo.TMDBPersonImagesPojo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TMDBPersonInfoCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("birthday")
    public String f25059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("known_for_department")
    public String f25060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a
    @c("deathday")
    public String f25061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a
    @c("name")
    public String f25062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a
    @c("images")
    public TMDBPersonImagesPojo f25063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a
    @c("also_known_as")
    public List<String> f25064f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a
    @c("gender")
    public Integer f25065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a
    @c("biography")
    public String f25066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a
    @c("place_of_birth")
    public String f25067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @a
    @c("profile_path")
    public String f25068j;

    public String a() {
        return this.f25066h;
    }

    public String b() {
        return this.f25059a;
    }

    public String c() {
        return this.f25061c;
    }

    public Integer d() {
        return this.f25065g;
    }

    public TMDBPersonImagesPojo e() {
        return this.f25063e;
    }

    public String f() {
        return this.f25060b;
    }

    public String g() {
        return this.f25062d;
    }

    public String h() {
        return this.f25067i;
    }

    public String i() {
        return this.f25068j;
    }
}
