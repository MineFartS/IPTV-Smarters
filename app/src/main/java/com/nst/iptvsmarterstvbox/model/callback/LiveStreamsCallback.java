package com.nst.iptvsmarterstvbox.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;
import java.io.Serializable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class LiveStreamsCallback implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("num")
    public Integer f25002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a
    @c("name")
    public String f25003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a
    @c("stream_type")
    public String f25004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a
    @c("stream_id")
    public Integer f25005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a
    @c("stream_icon")
    public String f25006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a
    @c("epg_channel_id")
    public String f25007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a
    @c("added")
    public String f25008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a
    @c("category_id")
    public String f25009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @a
    @c("custom_sid")
    public String f25010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @a
    @c("tv_archive")
    public Integer f25011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @a
    @c("direct_source")
    public String f25012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @a
    @c("tv_archive_duration")
    public Integer f25013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f25014n = BuildConfig.FLAVOR;

    public String a() {
        return this.f25008h;
    }

    public String b() {
        return this.f25009i;
    }

    public String c() {
        return this.f25010j;
    }

    public String d() {
        return this.f25012l;
    }

    public String e() {
        return this.f25007g;
    }

    public String f() {
        return this.f25003c;
    }

    public Integer g() {
        return this.f25002b;
    }

    public String h() {
        return this.f25006f;
    }

    public Integer i() {
        return this.f25005e;
    }

    public String j() {
        return this.f25004d;
    }

    public Integer k() {
        return this.f25011k;
    }

    public Integer l() {
        return this.f25013m;
    }
}
