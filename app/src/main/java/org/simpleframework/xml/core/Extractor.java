package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public interface Extractor<T extends Annotation> {
    T[] getAnnotations();

    Label getLabel(T t);

    Class getType(T t);
}
