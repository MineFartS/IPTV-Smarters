package minefarts.iptvsmarters.model.pojo;

import c.f.d.v.a;
import c.f.d.v.c;
import org.achartengine.ChartFactory;

/* JADX INFO: loaded from: classes2.dex */
public class EpgListingPojo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c(ChartFactory.TITLE)
    public String f25115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("start")
    public String f25116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a
    @c("end")
    public String f25117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a
    @c("description")
    public String f25118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @a
    @c("channel_id")
    public String f25119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @a
    @c("start_timestamp")
    public String f25120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a
    @c("stop_timestamp")
    public String f25121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a
    @c("has_archive")
    public Integer f25122h;

    public String a() {
        return this.f25119e;
    }

    public String b() {
        return this.f25118d;
    }

    public String c() {
        return this.f25117c;
    }

    public Integer d() {
        return this.f25122h;
    }

    public String e() {
        return this.f25116b;
    }

    public String f() {
        return this.f25120f;
    }

    public String g() {
        return this.f25121g;
    }

    public String h() {
        return this.f25115a;
    }
}
