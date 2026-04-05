package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ahg implements zy<ahg> {
    public final String s;
    public final List<String> t;
    public final boolean u;

    public ahg(String str, List<String> list, boolean z) {
        this.s = str;
        this.t = Collections.unmodifiableList(list);
        this.u = z;
    }
}
