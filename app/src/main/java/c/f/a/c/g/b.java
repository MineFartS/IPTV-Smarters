package c.f.a.c.g;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;
import c.f.a.c.g.a;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class b<T> extends a.AbstractBinderC0161a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f12730b;

    public b(T t) {
        this.f12730b = t;
    }

    @RecentlyNonNull
    public static <T> T I2(@RecentlyNonNull a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f12730b;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
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
        o.i(field);
        if (field.isAccessible()) {
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

    @RecentlyNonNull
    public static <T> a K2(@RecentlyNonNull T t) {
        return new b(t);
    }
}
