package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class aua<K, V> extends aui<K, V> implements auo<K, V> {
    private static final long serialVersionUID = 0;

    public aua(aud<K, aty<V>> audVar, int i2) {
        super(audVar, i2);
    }

    public static <K, V> atz<K, V> b() {
        return new atz<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Invalid key count ");
            sb.append(i2);
            throw new InvalidObjectException(sb.toString());
        }
        aub aubVarC = aud.c();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object object = objectInputStream.readObject();
            int i5 = objectInputStream.readInt();
            if (i5 <= 0) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid value count ");
                sb2.append(i5);
                throw new InvalidObjectException(sb2.toString());
            }
            atu atuVarI = aty.i();
            for (int i6 = 0; i6 < i5; i6++) {
                atuVarI.d(objectInputStream.readObject());
            }
            aubVarC.b(object, atuVarI.c());
            i3 += i5;
        }
        try {
            aug.f20571a.b(this, aubVarC.a());
            aug.f20572b.a(this, i3);
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(w().size());
        for (Map.Entry<K, Collection<V>> entry : w().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public final aty<V> a(K k2) {
        aty<V> atyVar = (aty) ((aui) this).f20574b.get(k2);
        return atyVar == null ? aty.n() : atyVar;
    }
}
