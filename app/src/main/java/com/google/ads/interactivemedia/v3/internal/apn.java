package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import com.google.android.gms.common.internal.Hide;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class apn<T> extends apl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f20341a;

    private apn(T t) {
        this.f20341a = t;
    }

    public static <T> apm c(T t) {
        return new apn(t);
    }

    public static <T> T d(apm apmVar) {
        if (apmVar instanceof apn) {
            return ((apn) apmVar).f20341a;
        }
        IBinder iBinderAsBinder = apmVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (((Field) c.f.a.c.f.q.o.i(field)).isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException("Binder object is null.", e3);
        }
    }
}
