package io.realm.internal;

import e.a.g.e;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class Collection implements e.a.g.d {
    public static final byte AGGREGATE_FUNCTION_AVERAGE = 3;
    public static final byte AGGREGATE_FUNCTION_MAXIMUM = 2;
    public static final byte AGGREGATE_FUNCTION_MINIMUM = 1;
    public static final byte AGGREGATE_FUNCTION_SUM = 4;
    private static final String CLOSED_REALM_MESSAGE = "This Realm instance has already been closed, making it unusable.";
    public static final byte MODE_EMPTY = 0;
    public static final byte MODE_LINKVIEW = 3;
    public static final byte MODE_QUERY = 2;
    public static final byte MODE_TABLE = 1;
    public static final byte MODE_TABLEVIEW = 4;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final e.a.g.c context;
    private boolean isSnapshot;
    private boolean loaded;
    private final long nativePtr;
    private final e.a.g.e<c> observerPairs;
    private final SharedRealm sharedRealm;
    private final Table table;

    public enum a {
        MINIMUM((byte) 1),
        MAXIMUM((byte) 2),
        AVERAGE((byte) 3),
        SUM((byte) 4);

        private final byte value;

        a(byte b2) {
            this.value = b2;
        }

        public byte getValue() {
            return this.value;
        }
    }

    public static class b implements e.a<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e.a.b f30391a;

        public b(e.a.b bVar) {
            this.f30391a = bVar;
        }

        @Override // e.a.g.e.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c cVar, Object obj) {
            cVar.a(obj, this.f30391a);
        }
    }

    public static class c<T> extends e.b<T, Object> {
        public c(T t, Object obj) {
            super(t, obj);
        }

        public void a(T t, e.a.b bVar) {
            S s = this.f30348b;
            if (s instanceof e.a.c) {
                ((e.a.c) s).a(t, bVar);
            } else {
                if (s instanceof e.a.d) {
                    ((e.a.d) s).a(t);
                    return;
                }
                throw new RuntimeException("Unsupported listener type: " + this.f30348b);
            }
        }
    }

    public enum d {
        EMPTY,
        TABLE,
        QUERY,
        LINKVIEW,
        TABLEVIEW;

        public static d getByValue(byte b2) {
            if (b2 == 0) {
                return EMPTY;
            }
            if (b2 == 1) {
                return TABLE;
            }
            if (b2 == 2) {
                return QUERY;
            }
            if (b2 == 3) {
                return LINKVIEW;
            }
            if (b2 == 4) {
                return TABLEVIEW;
            }
            throw new IllegalArgumentException("Invalid value: " + ((int) b2));
        }
    }

    public static class e<T> implements e.a.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e.a.d<T> f30392a;

        public e(e.a.d<T> dVar) {
            this.f30392a = dVar;
        }

        @Override // e.a.c
        public void a(T t, e.a.b bVar) {
            this.f30392a.a(t);
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f30392a == ((e) obj).f30392a;
        }

        public int hashCode() {
            return this.f30392a.hashCode();
        }
    }

    public Collection(SharedRealm sharedRealm, LinkView linkView, SortDescriptor sortDescriptor) {
        this.isSnapshot = false;
        this.observerPairs = new e.a.g.e<>();
        throw null;
    }

    private Collection(SharedRealm sharedRealm, Table table, long j2) {
        this(sharedRealm, table, j2, false);
    }

    private Collection(SharedRealm sharedRealm, Table table, long j2, boolean z) {
        this.isSnapshot = false;
        this.observerPairs = new e.a.g.e<>();
        throw null;
    }

    public Collection(SharedRealm sharedRealm, TableQuery tableQuery) {
        this(sharedRealm, tableQuery, (SortDescriptor) null, (SortDescriptor) null);
    }

    public Collection(SharedRealm sharedRealm, TableQuery tableQuery, SortDescriptor sortDescriptor) {
        this(sharedRealm, tableQuery, sortDescriptor, (SortDescriptor) null);
    }

    public Collection(SharedRealm sharedRealm, TableQuery tableQuery, SortDescriptor sortDescriptor, SortDescriptor sortDescriptor2) {
        this.isSnapshot = false;
        this.observerPairs = new e.a.g.e<>();
        tableQuery.a();
        throw null;
    }

    public static Collection createBacklinksCollection(SharedRealm sharedRealm, UncheckedRow uncheckedRow, Table table, String str) {
        throw null;
    }

    private static native Object nativeAggregate(long j2, long j3, byte b2);

    private static native void nativeClear(long j2);

    private static native boolean nativeContains(long j2, long j3);

    private static native long nativeCreateResults(long j2, long j3, SortDescriptor sortDescriptor, SortDescriptor sortDescriptor2);

    private static native long nativeCreateResultsFromBacklinks(long j2, long j3, long j4, long j5);

    private static native long nativeCreateResultsFromLinkView(long j2, long j3, SortDescriptor sortDescriptor);

    private static native long nativeCreateSnapshot(long j2);

    private static native void nativeDelete(long j2, long j3);

    private static native boolean nativeDeleteFirst(long j2);

    private static native boolean nativeDeleteLast(long j2);

    private static native long nativeDistinct(long j2, SortDescriptor sortDescriptor);

    private static native long nativeFirstRow(long j2);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j2);

    private static native long nativeGetRow(long j2, int i2);

    private static native long nativeIndexOf(long j2, long j3);

    private static native long nativeIndexOfBySourceRowIndex(long j2, long j3);

    private static native boolean nativeIsValid(long j2);

    private static native long nativeLastRow(long j2);

    private static native long nativeSize(long j2);

    private static native long nativeSort(long j2, SortDescriptor sortDescriptor);

    private native void nativeStartListening(long j2);

    private native void nativeStopListening(long j2);

    private static native long nativeWhere(long j2);

    private void notifyChangeListeners(long j2) {
        if (j2 == 0 && isLoaded()) {
            return;
        }
        boolean z = this.loaded;
        this.loaded = true;
        this.observerPairs.c(new b((j2 == 0 || !z) ? null : new CollectionChangeSet(j2)));
    }

    public <T> void addListener(T t, e.a.c<T> cVar) {
        if (this.observerPairs.d()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.a(new c(t, cVar));
    }

    public <T> void addListener(T t, e.a.d<T> dVar) {
        addListener(t, new e(dVar));
    }

    public Date aggregateDate(a aVar, long j2) {
        return (Date) nativeAggregate(this.nativePtr, j2, aVar.getValue());
    }

    public Number aggregateNumber(a aVar, long j2) {
        return (Number) nativeAggregate(this.nativePtr, j2, aVar.getValue());
    }

    public void clear() {
        nativeClear(this.nativePtr);
    }

    public boolean contains(UncheckedRow uncheckedRow) {
        throw null;
    }

    public Collection createSnapshot() {
        if (this.isSnapshot) {
            return this;
        }
        Collection collection = new Collection(this.sharedRealm, this.table, nativeCreateSnapshot(this.nativePtr));
        collection.isSnapshot = true;
        return collection;
    }

    public void delete(long j2) {
        nativeDelete(this.nativePtr, j2);
    }

    public boolean deleteFirst() {
        return nativeDeleteFirst(this.nativePtr);
    }

    public boolean deleteLast() {
        return nativeDeleteLast(this.nativePtr);
    }

    public Collection distinct(SortDescriptor sortDescriptor) {
        return new Collection(this.sharedRealm, this.table, nativeDistinct(this.nativePtr, sortDescriptor));
    }

    public UncheckedRow firstUncheckedRow() {
        if (nativeFirstRow(this.nativePtr) == 0) {
            return null;
        }
        throw null;
    }

    public d getMode() {
        return d.getByValue(nativeGetMode(this.nativePtr));
    }

    @Override // e.a.g.d
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // e.a.g.d
    public long getNativePtr() {
        return this.nativePtr;
    }

    public Table getTable() {
        return this.table;
    }

    public UncheckedRow getUncheckedRow(int i2) {
        nativeGetRow(this.nativePtr, i2);
        throw null;
    }

    public int indexOf(long j2) {
        long jNativeIndexOfBySourceRowIndex = nativeIndexOfBySourceRowIndex(this.nativePtr, j2);
        if (jNativeIndexOfBySourceRowIndex > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jNativeIndexOfBySourceRowIndex;
    }

    public int indexOf(UncheckedRow uncheckedRow) {
        throw null;
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public boolean isValid() {
        return nativeIsValid(this.nativePtr);
    }

    public UncheckedRow lastUncheckedRow() {
        if (nativeLastRow(this.nativePtr) == 0) {
            return null;
        }
        throw null;
    }

    public void load() {
        if (this.loaded) {
            return;
        }
        notifyChangeListeners(0L);
    }

    public void removeAllListeners() {
        this.observerPairs.b();
        nativeStopListening(this.nativePtr);
    }

    public <T> void removeListener(T t, e.a.c<T> cVar) {
        this.observerPairs.e(t, cVar);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public <T> void removeListener(T t, e.a.d<T> dVar) {
        removeListener(t, new e(dVar));
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public Collection sort(SortDescriptor sortDescriptor) {
        return new Collection(this.sharedRealm, this.table, nativeSort(this.nativePtr, sortDescriptor));
    }

    public TableQuery where() {
        return new TableQuery(this.context, this.table, nativeWhere(this.nativePtr));
    }
}
