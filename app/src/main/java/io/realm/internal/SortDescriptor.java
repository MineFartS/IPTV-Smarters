package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@KeepMember
public class SortDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<RealmFieldType> f30409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<RealmFieldType> f30410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[][] f30411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f30412d;

    static {
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType3 = RealmFieldType.STRING;
        RealmFieldType realmFieldType4 = RealmFieldType.DATE;
        f30409a = Collections.unmodifiableSet(new HashSet(Arrays.asList(realmFieldType, realmFieldType2, RealmFieldType.FLOAT, RealmFieldType.DOUBLE, realmFieldType3, realmFieldType4)));
        f30410b = Collections.unmodifiableSet(new HashSet(Arrays.asList(realmFieldType, realmFieldType2, realmFieldType3, realmFieldType4)));
    }

    @KeepMember
    private long getTablePtr() {
        throw null;
    }

    @KeepMember
    public boolean[] getAscendings() {
        return this.f30412d;
    }

    @KeepMember
    public long[][] getColumnIndices() {
        return this.f30411c;
    }
}
