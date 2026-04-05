package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bjb<T extends Enum<T>> extends bfv<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, T> f21192a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<T, String> f21193b = new HashMap();

    public bjb(Class<T> cls) {
        try {
            for (T t : cls.getEnumConstants()) {
                String strName = t.name();
                bfy bfyVar = (bfy) cls.getField(strName).getAnnotation(bfy.class);
                if (bfyVar != null) {
                    strName = bfyVar.a();
                    for (String str : bfyVar.b()) {
                        this.f21192a.put(str, t);
                    }
                }
                this.f21192a.put(strName, t);
                this.f21193b.put(t, strName);
            }
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Object read(bjj bjjVar) {
        if (bjjVar.p() != 9) {
            return this.f21192a.get(bjjVar.f());
        }
        bjjVar.k();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Object obj) throws IOException {
        Enum r3 = (Enum) obj;
        bjlVar.k(r3 == null ? null : this.f21193b.get(r3));
    }
}
