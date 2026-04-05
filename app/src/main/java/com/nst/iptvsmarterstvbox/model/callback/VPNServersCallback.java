package com.nst.iptvsmarterstvbox.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;
import com.nst.iptvsmarterstvbox.model.pojo.VPNServerPojo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VPNServersCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("status")
    public Boolean f25082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("sc")
    public String f25083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a
    @c("servers")
    public List<VPNServerPojo> f25084c = null;

    public String a() {
        return this.f25083b;
    }

    public List<VPNServerPojo> b() {
        return this.f25084c;
    }

    public Boolean c() {
        return this.f25082a;
    }
}
