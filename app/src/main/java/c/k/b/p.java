package c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public enum p {
    NO_CACHE(1),
    NO_STORE(2);

    public final int index;

    p(int i2) {
        this.index = i2;
    }

    public static boolean shouldReadFromMemoryCache(int i2) {
        return (i2 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToMemoryCache(int i2) {
        return (i2 & NO_STORE.index) == 0;
    }
}
