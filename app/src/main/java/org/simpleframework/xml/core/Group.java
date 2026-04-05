package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
public interface Group {
    LabelMap getElements();

    Label getLabel(Class cls);

    Label getText();

    boolean isInline();

    boolean isTextList();

    String toString();
}
