package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes.dex */
public final class bgd implements bgw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21062a;

    public bgd() {
    }

    public bgd(int i2) {
        this.f21062a = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bgw
    public final Object a() {
        switch (this.f21062a) {
            case 0:
                return new TreeMap();
            case 1:
                return new ConcurrentHashMap();
            case 2:
                return new LinkedHashMap();
            case 3:
                return new bgv();
            case 4:
                return new TreeSet();
            case 5:
                return new LinkedHashSet();
            case 6:
                return new ArrayDeque();
            case 7:
                return new ArrayList();
            default:
                return new ConcurrentSkipListMap();
        }
    }
}
