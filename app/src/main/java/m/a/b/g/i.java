package m.a.b.g;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class i implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31162b = 1179403647;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileChannel f31163c;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f31163c = new FileInputStream(file).getChannel();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31163c.close();
    }

    public final long d(d dVar, long j2, long j3) {
        for (long j4 = 0; j4 < j2; j4++) {
            e eVarB = dVar.b(j4);
            if (eVarB.f31155a == 1) {
                long j5 = eVarB.f31157c;
                if (j5 <= j3 && j3 <= eVarB.f31158d + j5) {
                    return (j3 - j5) + eVarB.f31156b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public d i() throws IOException {
        this.f31163c.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (r(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sN = n(byteBufferAllocate, 4L);
        boolean z = n(byteBufferAllocate, 5L) == 2;
        if (sN == 1) {
            return new g(z, this);
        }
        if (sN == 2) {
            return new h(z, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List<String> l() throws IOException {
        long j2;
        this.f31163c.position(0L);
        ArrayList arrayList = new ArrayList();
        d dVarI = i();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVarI.f31146a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = dVarI.f31151f;
        int i2 = 0;
        if (j3 == 65535) {
            j3 = dVarI.c(0).f31159a;
        }
        long j4 = 0;
        while (true) {
            if (j4 >= j3) {
                j2 = 0;
                break;
            }
            e eVarB = dVarI.b(j4);
            if (eVarB.f31155a == 2) {
                j2 = eVarB.f31156b;
                break;
            }
            j4++;
        }
        if (j2 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j5 = 0;
        while (true) {
            c cVarA = dVarI.a(j2, i2);
            long j6 = j2;
            long j7 = cVarA.f31144a;
            if (j7 == 1) {
                arrayList2.add(Long.valueOf(cVarA.f31145b));
            } else if (j7 == 5) {
                j5 = cVarA.f31145b;
            }
            i2++;
            if (cVarA.f31144a == 0) {
                break;
            }
            j2 = j6;
        }
        if (j5 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jD = d(dVarI, j3, j5);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(q(byteBufferAllocate, ((Long) it.next()).longValue() + jD));
        }
        return arrayList;
    }

    public void m(ByteBuffer byteBuffer, long j2, int i2) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        long j3 = 0;
        while (j3 < i2) {
            int i3 = this.f31163c.read(byteBuffer, j2 + j3);
            if (i3 == -1) {
                throw new EOFException();
            }
            j3 += (long) i3;
        }
        byteBuffer.position(0);
    }

    public short n(ByteBuffer byteBuffer, long j2) throws IOException {
        m(byteBuffer, j2, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int o(ByteBuffer byteBuffer, long j2) throws IOException {
        m(byteBuffer, j2, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long p(ByteBuffer byteBuffer, long j2) throws IOException {
        m(byteBuffer, j2, 8);
        return byteBuffer.getLong();
    }

    public String q(ByteBuffer byteBuffer, long j2) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j3 = 1 + j2;
            short sN = n(byteBuffer, j2);
            if (sN == 0) {
                return sb.toString();
            }
            sb.append((char) sN);
            j2 = j3;
        }
    }

    public long r(ByteBuffer byteBuffer, long j2) throws IOException {
        m(byteBuffer, j2, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
