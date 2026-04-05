package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class arp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aro f20432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aro f20433c;

    public /* synthetic */ arp(String str) {
        aro aroVar = new aro(null);
        this.f20432b = aroVar;
        this.f20433c = aroVar;
        ars.g(str);
        this.f20431a = str;
    }

    public final arp a(Object obj) {
        aro aroVar = new aro(null);
        this.f20433c.f20430b = aroVar;
        this.f20433c = aroVar;
        aroVar.f20429a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f20431a);
        sb.append('{');
        aro aroVar = this.f20432b.f20430b;
        String str = BuildConfig.FLAVOR;
        while (aroVar != null) {
            Object obj = aroVar.f20429a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            aroVar = aroVar.f20430b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
