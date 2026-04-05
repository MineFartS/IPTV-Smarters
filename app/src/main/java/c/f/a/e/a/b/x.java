package c.f.a.e.a.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends c.f.a.e.a.e.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f15662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f15663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NavigableMap<Long, File> f15664d = new TreeMap();

    public x(File file, File file2) throws IOException {
        this.f15662b = file;
        this.f15663c = file2;
        List<File> listA = a2.a(file, file2);
        if (listA.isEmpty()) {
            throw new k0(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long length = 0;
        for (File file3 : listA) {
            this.f15664d.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // c.f.a.e.a.e.q
    public final long d() {
        Map.Entry<Long, File> entryLastEntry = this.f15664d.lastEntry();
        return entryLastEntry.getKey().longValue() + entryLastEntry.getValue().length();
    }

    @Override // c.f.a.e.a.e.q
    public final InputStream i(long j2, long j3) {
        if (j2 < 0 || j3 < 0) {
            throw new k0(String.format("Invalid input parameters %s, %s", Long.valueOf(j2), Long.valueOf(j3)));
        }
        long j4 = j2 + j3;
        if (j4 > d()) {
            throw new k0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(d()), Long.valueOf(j4)));
        }
        Long lFloorKey = this.f15664d.floorKey(Long.valueOf(j2));
        Long lFloorKey2 = this.f15664d.floorKey(Long.valueOf(j4));
        if (lFloorKey.equals(lFloorKey2)) {
            return new w(m(j2, lFloorKey), j3);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m(j2, lFloorKey));
        Collection<File> collectionValues = this.f15664d.subMap(lFloorKey, false, lFloorKey2, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new k1(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new w(new FileInputStream((File) this.f15664d.get(lFloorKey2)), j3 - (lFloorKey2.longValue() - j2)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public final InputStream m(long j2, Long l2) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f15664d.get(l2));
        if (fileInputStream.skip(j2 - l2.longValue()) == j2 - l2.longValue()) {
            return fileInputStream;
        }
        throw new k0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l2));
    }
}
