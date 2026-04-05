package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class avo<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f20624a;

    public /* synthetic */ avo(Field field) {
        this.f20624a = field;
        field.setAccessible(true);
    }

    public final void a(T t, int i2) {
        try {
            this.f20624a.set(t, Integer.valueOf(i2));
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void b(T t, Object obj) {
        try {
            this.f20624a.set(t, obj);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
