package org.simpleframework.xml.transform;

import java.lang.reflect.Constructor;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class DateFactory<T extends Date> {
    private final Constructor<T> factory;

    public DateFactory(Class<T> cls) {
        this(cls, Long.TYPE);
    }

    public DateFactory(Class<T> cls, Class... clsArr) {
        this.factory = cls.getDeclaredConstructor(clsArr);
    }

    public T getInstance(Object... objArr) {
        return this.factory.newInstance(objArr);
    }
}
