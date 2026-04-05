package org.simpleframework.xml.core;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface Instantiator {
    List<Creator> getCreators();

    Object getInstance();

    Object getInstance(Criteria criteria);

    Parameter getParameter(String str);

    List<Parameter> getParameters();

    boolean isDefault();
}
