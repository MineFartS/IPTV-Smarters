package com.nst.iptvsmarterstvbox.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;

/* JADX INFO: loaded from: classes2.dex */
public class LoginCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("user_info")
    public UserLoginInfoCallback f25016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("server_info")
    public ServerInfoCallback f25017b;

    public ServerInfoCallback a() {
        return this.f25017b;
    }

    public UserLoginInfoCallback b() {
        return this.f25016a;
    }
}
