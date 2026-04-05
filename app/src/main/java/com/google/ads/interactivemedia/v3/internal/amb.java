package com.google.ads.interactivemedia.v3.internal;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class amb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<ama> f20103a = alz.f20094b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator<ama> f20104b = alz.f20093a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20111i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20105c = AdError.SERVER_ERROR_CODE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ama[] f20107e = new ama[5];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<ama> f20106d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20108f = -1;

    public amb(int i2) {
    }

    public final void a(int i2, float f2) {
        ama amaVar;
        int i3;
        ama amaVar2;
        int i4;
        if (this.f20108f != 1) {
            Collections.sort(this.f20106d, f20103a);
            this.f20108f = 1;
        }
        int i5 = this.f20111i;
        if (i5 > 0) {
            ama[] amaVarArr = this.f20107e;
            int i6 = i5 - 1;
            this.f20111i = i6;
            amaVar = amaVarArr[i6];
        } else {
            amaVar = new ama(null);
        }
        int i7 = this.f20109g;
        this.f20109g = i7 + 1;
        amaVar.f20100a = i7;
        amaVar.f20101b = i2;
        amaVar.f20102c = f2;
        this.f20106d.add(amaVar);
        int i8 = this.f20110h + i2;
        while (true) {
            this.f20110h = i8;
            while (true) {
                int i9 = this.f20110h;
                if (i9 <= 2000) {
                    return;
                }
                i3 = i9 - 2000;
                amaVar2 = this.f20106d.get(0);
                i4 = amaVar2.f20101b;
                if (i4 <= i3) {
                    this.f20110h -= i4;
                    this.f20106d.remove(0);
                    int i10 = this.f20111i;
                    if (i10 < 5) {
                        ama[] amaVarArr2 = this.f20107e;
                        this.f20111i = i10 + 1;
                        amaVarArr2[i10] = amaVar2;
                    }
                }
            }
            amaVar2.f20101b = i4 - i3;
            i8 = this.f20110h - i3;
        }
    }

    public final void b() {
        this.f20106d.clear();
        this.f20108f = -1;
        this.f20109g = 0;
        this.f20110h = 0;
    }

    public final float c() {
        if (this.f20108f != 0) {
            Collections.sort(this.f20106d, f20104b);
            this.f20108f = 0;
        }
        float f2 = this.f20110h * 0.5f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f20106d.size(); i3++) {
            ama amaVar = this.f20106d.get(i3);
            i2 += amaVar.f20101b;
            if (i2 >= f2) {
                return amaVar.f20102c;
            }
        }
        if (this.f20106d.isEmpty()) {
            return Float.NaN;
        }
        return this.f20106d.get(r0.size() - 1).f20102c;
    }
}
