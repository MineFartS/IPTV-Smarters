package minefarts.iptvsmarters.model.pojo;

import c.f.d.v.a;
import c.f.d.v.c;

/* JADX INFO: loaded from: classes2.dex */
public class VPNServerPojo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("servername")
    public String f25176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("ovpnfile")
    public String f25177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a
    @c("credentials")
    public VPNCredentialsPojo f25178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a
    @c("flag")
    public String f25179d;

    public VPNCredentialsPojo a() {
        return this.f25178c;
    }

    public String b() {
        return this.f25179d;
    }

    public String c() {
        return this.f25177b;
    }

    public String d() {
        return this.f25176a;
    }
}
