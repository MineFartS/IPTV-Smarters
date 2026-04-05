package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ahx implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f19761d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ahx f19760c = new ahx(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ahx f19759b = new ahx(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ahx f19758a = new ahx();

    private /* synthetic */ ahx() {
    }

    private /* synthetic */ ahx(int i2) {
        this.f19761d = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2 = this.f19761d;
        if (i2 != 0) {
            if (i2 == 1) {
                return ((ke) obj2).f22152h - ((ke) obj).f22152h;
            }
            int i3 = aig.f19827a;
            return 0;
        }
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        int i4 = aig.f19827a;
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }
}
