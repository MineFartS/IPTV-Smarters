package com.nst.iptvsmarterstvbox.model.pojo;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ExternalPlayerModelClass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25123a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25124b = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25125c = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25126d = BuildConfig.FLAVOR;

    public String a() {
        return this.f25124b;
    }

    public String b() {
        return this.f25125c;
    }

    public void c(String str) {
        this.f25126d = str;
    }

    public void d(String str) {
        this.f25124b = str;
    }

    public void e(int i2) {
        this.f25123a = i2;
    }

    public void f(String str) {
        this.f25125c = str;
    }
}
