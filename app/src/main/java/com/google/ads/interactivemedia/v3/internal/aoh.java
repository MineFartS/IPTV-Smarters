package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class aoh<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f20282c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ aoh(int i2, String str, Object obj) {
        this.f20280a = i2;
        this.f20281b = str;
        this.f20282c = obj;
        aob.a().b(this);
    }

    public static aoh<Boolean> e(int i2, String str, Boolean bool) {
        return new aoc(i2, str, bool);
    }

    public static void i(String str, float f2) {
        new aof(str, Float.valueOf(f2));
    }

    public static void j(String str, int i2) {
        new aod(str, Integer.valueOf(i2));
    }

    public static aoh<Long> k(String str, long j2) {
        return new aoe(str, Long.valueOf(j2));
    }

    public static aoh<String> l(String str, String str2) {
        return new aog(str, str2);
    }

    public abstract T a(JSONObject jSONObject);

    public abstract T b(Bundle bundle);

    public abstract T c(SharedPreferences sharedPreferences);

    public final int d() {
        return this.f20280a;
    }

    public final T f() {
        return (T) aob.b().b(this);
    }

    public final T g() {
        return this.f20282c;
    }

    public final String h() {
        return this.f20281b;
    }
}
