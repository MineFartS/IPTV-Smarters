package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Map;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.Verbosity;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotationFactory {
    private final Format format;
    private final boolean required;

    public AnnotationFactory(Detail detail, Support support) {
        this.required = detail.isRequired();
        this.format = support.getFormat();
    }

    private ClassLoader getClassLoader() {
        return AnnotationFactory.class.getClassLoader();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.annotation.Annotation getInstance(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.ClassLoader r0 = r3.getClassLoader()
            java.lang.Class r1 = r4.getComponentType()
            boolean r2 = r4.isArray()
            if (r2 == 0) goto L1e
            boolean r4 = r3.isPrimitive(r1)
            if (r4 == 0) goto L1b
        L14:
            java.lang.Class<org.simpleframework.xml.Element> r4 = org.simpleframework.xml.Element.class
        L16:
            java.lang.annotation.Annotation r4 = r3.getInstance(r0, r4)
            return r4
        L1b:
            java.lang.Class<org.simpleframework.xml.ElementArray> r4 = org.simpleframework.xml.ElementArray.class
            goto L16
        L1e:
            boolean r4 = r3.isPrimitive(r4)
            if (r4 == 0) goto L14
            boolean r4 = r3.isAttribute()
            if (r4 == 0) goto L14
            java.lang.Class<org.simpleframework.xml.Attribute> r4 = org.simpleframework.xml.Attribute.class
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.core.AnnotationFactory.getInstance(java.lang.Class):java.lang.annotation.Annotation");
    }

    private Annotation getInstance(ClassLoader classLoader, Class cls) {
        return getInstance(classLoader, cls, false);
    }

    private Annotation getInstance(ClassLoader classLoader, Class cls, boolean z) {
        return (Annotation) Proxy.newProxyInstance(classLoader, new Class[]{cls}, new AnnotationHandler(cls, this.required, z));
    }

    private boolean isAttribute() {
        Verbosity verbosity = this.format.getVerbosity();
        return verbosity != null && verbosity == Verbosity.LOW;
    }

    private boolean isPrimitive(Class cls) {
        if (Number.class.isAssignableFrom(cls) || cls == Boolean.class || cls == Character.class) {
            return true;
        }
        return cls.isPrimitive();
    }

    private boolean isPrimitiveKey(Class[] clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return false;
        }
        Class superclass = clsArr[0].getSuperclass();
        Class cls = clsArr[0];
        if (superclass == null || !(superclass.isEnum() || cls.isEnum())) {
            return isPrimitive(cls);
        }
        return true;
    }

    public Annotation getInstance(Class cls, Class[] clsArr) {
        ClassLoader classLoader = getClassLoader();
        return Map.class.isAssignableFrom(cls) ? (isPrimitiveKey(clsArr) && isAttribute()) ? getInstance(classLoader, ElementMap.class, true) : getInstance(classLoader, ElementMap.class) : Collection.class.isAssignableFrom(cls) ? getInstance(classLoader, ElementList.class) : getInstance(cls);
    }
}
