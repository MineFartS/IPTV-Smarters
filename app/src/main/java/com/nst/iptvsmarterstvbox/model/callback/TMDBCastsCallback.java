package com.nst.iptvsmarterstvbox.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;
import com.nst.iptvsmarterstvbox.model.pojo.TMDBCastsPojo;
import com.nst.iptvsmarterstvbox.model.pojo.TMDBCrewPojo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TMDBCastsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("cast")
    public List<TMDBCastsPojo> f25055a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("crew")
    public List<TMDBCrewPojo> f25056b = null;

    public List<TMDBCastsPojo> a() {
        return this.f25055a;
    }

    public List<TMDBCrewPojo> b() {
        return this.f25056b;
    }
}
