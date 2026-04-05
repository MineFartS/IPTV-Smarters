package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.blz;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class axf<KeyFormatProtoT extends blz, KeyT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<KeyFormatProtoT> f20682a;

    public axf(Class<KeyFormatProtoT> cls) {
        this.f20682a = cls;
    }

    public abstract KeyFormatProtoT a(bkd bkdVar);

    public final Class<KeyFormatProtoT> b() {
        return this.f20682a;
    }

    public abstract KeyT c(KeyFormatProtoT keyformatprotot);

    public Map<String, axe<KeyFormatProtoT>> d() {
        return Collections.emptyMap();
    }

    public abstract void e(KeyFormatProtoT keyformatprotot);
}
