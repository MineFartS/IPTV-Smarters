package org.simpleframework.xml.convert;

import java.lang.reflect.Constructor;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* JADX INFO: loaded from: classes2.dex */
public class ConverterFactory {
    private final Cache<Converter> cache = new ConcurrentCache();

    private Constructor getConstructor(Class cls) throws NoSuchMethodException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    private Converter getConverter(Class cls) throws ConvertException, NoSuchMethodException {
        Constructor constructor = getConstructor(cls);
        if (constructor != null) {
            return getConverter(cls, constructor);
        }
        throw new ConvertException("No default constructor for %s", cls);
    }

    private Converter getConverter(Class cls, Constructor constructor) {
        Converter converter = (Converter) constructor.newInstance(new Object[0]);
        if (converter != null) {
            this.cache.cache(cls, converter);
        }
        return converter;
    }

    public Converter getInstance(Class cls) {
        Converter converterFetch = this.cache.fetch(cls);
        return converterFetch == null ? getConverter(cls) : converterFetch;
    }

    public Converter getInstance(Convert convert) throws ConvertException {
        Class<? extends Converter> clsValue = convert.value();
        if (clsValue.isInterface()) {
            throw new ConvertException("Can not instantiate %s", clsValue);
        }
        return getInstance(clsValue);
    }
}
