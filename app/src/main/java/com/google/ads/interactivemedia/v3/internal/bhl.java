package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bhl<K, V> extends bfv<Map<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bfv<K> f21137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bfv<V> f21138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bgw<? extends Map<K, V>> f21139c;

    public bhl(bfg bfgVar, Type type, bfv bfvVar, Type type2, bfv bfvVar2, bgw bgwVar) {
        this.f21137a = new bhv(bfgVar, bfvVar, type);
        this.f21138b = new bhv(bfgVar, bfvVar2, type2);
        this.f21139c = bgwVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Object read(bjj bjjVar) {
        int iP = bjjVar.p();
        if (iP == 9) {
            bjjVar.k();
            return null;
        }
        Map<K, V> mapA = this.f21139c.a();
        if (iP == 1) {
            bjjVar.g();
            while (bjjVar.n()) {
                bjjVar.g();
                K k2 = this.f21137a.read(bjjVar);
                if (mapA.put(k2, this.f21138b.read(bjjVar)) != null) {
                    String strValueOf = String.valueOf(k2);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 15);
                    sb.append("duplicate key: ");
                    sb.append(strValueOf);
                    throw new bfs(sb.toString());
                }
                bjjVar.i();
            }
            bjjVar.i();
        } else {
            bjjVar.h();
            while (bjjVar.n()) {
                bgm.f21086a.a(bjjVar);
                K k3 = this.f21137a.read(bjjVar);
                if (mapA.put(k3, this.f21138b.read(bjjVar)) != null) {
                    String strValueOf2 = String.valueOf(k3);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 15);
                    sb2.append("duplicate key: ");
                    sb2.append(strValueOf2);
                    throw new bfs(sb2.toString());
                }
            }
            bjjVar.j();
        }
        return mapA;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            bjlVar.g();
            return;
        }
        bjlVar.c();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            bjlVar.f(String.valueOf(entry.getKey()));
            this.f21138b.write(bjlVar, entry.getValue());
        }
        bjlVar.e();
    }
}
