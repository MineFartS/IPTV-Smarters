package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class avb<K, V> extends arw<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient aru<? extends List<V>> f20597a;

    public avb(Map<K, Collection<V>> map, aru<? extends List<V>> aruVar) {
        super(map);
        this.f20597a = aruVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f20597a = (aru) objectInputStream.readObject();
        p((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f20597a);
        objectOutputStream.writeObject(i());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.arw, com.google.ads.interactivemedia.v3.internal.asm
    public final /* bridge */ /* synthetic */ Collection a() {
        return this.f20597a.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asm, com.google.ads.interactivemedia.v3.internal.asp
    public final Map<K, Collection<V>> j() {
        return k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asm, com.google.ads.interactivemedia.v3.internal.asp
    public final Set<K> l() {
        return m();
    }
}
