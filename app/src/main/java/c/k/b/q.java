package c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public enum q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    public final int index;

    q(int i2) {
        this.index = i2;
    }

    public static boolean isOfflineOnly(int i2) {
        return (i2 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i2) {
        return (i2 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i2) {
        return (i2 & NO_STORE.index) == 0;
    }
}
