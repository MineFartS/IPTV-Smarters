package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tx extends tz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ty> f23134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<tx> f23135c;

    public tx(int i2, long j2) {
        super(i2);
        this.f23133a = j2;
        this.f23134b = new ArrayList();
        this.f23135c = new ArrayList();
    }

    public final tx a(int i2) {
        int size = this.f23135c.size();
        for (int i3 = 0; i3 < size; i3++) {
            tx txVar = this.f23135c.get(i3);
            if (txVar.f23137d == i2) {
                return txVar;
            }
        }
        return null;
    }

    public final ty b(int i2) {
        int size = this.f23134b.size();
        for (int i3 = 0; i3 < size; i3++) {
            ty tyVar = this.f23134b.get(i3);
            if (tyVar.f23137d == i2) {
                return tyVar;
            }
        }
        return null;
    }

    public final void c(tx txVar) {
        this.f23135c.add(txVar);
    }

    public final void d(ty tyVar) {
        this.f23134b.add(tyVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tz
    public final String toString() {
        String strG = tz.g(this.f23137d);
        String string = Arrays.toString(this.f23134b.toArray());
        String string2 = Arrays.toString(this.f23135c.toArray());
        int length = String.valueOf(strG).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append(strG);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }
}
