package c.c.b.w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<byte[]> f5271a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<byte[]> f5272b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<byte[]> f5273c = new ArrayList(64);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5274d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5275e;

    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i2) {
        this.f5275e = i2;
    }

    public synchronized byte[] a(int i2) {
        for (int i3 = 0; i3 < this.f5273c.size(); i3++) {
            byte[] bArr = this.f5273c.get(i3);
            if (bArr.length >= i2) {
                this.f5274d -= bArr.length;
                this.f5273c.remove(i3);
                this.f5272b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i2];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f5275e) {
                this.f5272b.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f5273c, bArr, f5271a);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f5273c.add(iBinarySearch, bArr);
                this.f5274d += bArr.length;
                c();
            }
        }
    }

    public final synchronized void c() {
        while (this.f5274d > this.f5275e) {
            byte[] bArrRemove = this.f5272b.remove(0);
            this.f5273c.remove(bArrRemove);
            this.f5274d -= bArrRemove.length;
        }
    }
}
