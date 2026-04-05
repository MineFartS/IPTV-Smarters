package com.nst.iptvsmarterstvbox.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;

/* JADX INFO: loaded from: classes2.dex */
public class ActivationCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("result")
    public String f24938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("message")
    public String f24939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a
    @c("logindetails")
    public Logindetails f24940c;

    public class Logindetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @a
        @c("username")
        public String f24941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a
        @c("password")
        public String f24942b;

        public String a() {
            return this.f24942b;
        }

        public String b() {
            return this.f24941a;
        }
    }

    public Logindetails a() {
        return this.f24940c;
    }

    public String b() {
        return this.f24939b;
    }

    public String c() {
        return this.f24938a;
    }
}
