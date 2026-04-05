package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class auc<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20563b;

    public auc(aud<K, V> audVar) {
        Object[] objArr = new Object[audVar.size()];
        Object[] objArr2 = new Object[audVar.size()];
        avt<Map.Entry<K, V>> avtVarListIterator = audVar.entrySet().listIterator();
        int i2 = 0;
        while (avtVarListIterator.hasNext()) {
            Map.Entry<K, V> next = avtVarListIterator.next();
            objArr[i2] = next.getKey();
            objArr2[i2] = next.getValue();
            i2++;
        }
        this.f20562a = objArr;
        this.f20563b = objArr2;
    }

    public static final aub<K, V> a(int i2) {
        return new aub<>(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object obj = this.f20562a;
        if (obj instanceof auk) {
            auk aukVar = (auk) obj;
            ats atsVar = (ats) this.f20563b;
            aub aubVarA = a(aukVar.size());
            avt avtVarListIterator = aukVar.listIterator();
            avt avtVarListIterator2 = atsVar.listIterator();
            while (avtVarListIterator.hasNext()) {
                aubVarA.b(avtVarListIterator.next(), avtVarListIterator2.next());
            }
            return aubVarA.a();
        }
        Object[] objArr = (Object[]) obj;
        Object[] objArr2 = (Object[]) this.f20563b;
        aub aubVarA2 = a(objArr.length);
        for (int i2 = 0; i2 < objArr.length; i2++) {
            aubVarA2.b(objArr[i2], objArr2[i2]);
        }
        return aubVarA2.a();
    }
}
