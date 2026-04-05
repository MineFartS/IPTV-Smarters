package c.f.a.c.j.c;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class i1<E> extends l1<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f12873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12875c;

    public i1(int i2) {
        g1.a(4, "initialCapacity");
        this.f12873a = new Object[4];
        this.f12874b = 0;
    }

    public i1<E> a(E e2) {
        c1.a(e2);
        int i2 = this.f12874b + 1;
        Object[] objArr = this.f12873a;
        if (objArr.length >= i2) {
            if (this.f12875c) {
                this.f12873a = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.f12873a;
            int i3 = this.f12874b;
            this.f12874b = i3 + 1;
            objArr2[i3] = e2;
            return this;
        }
        int length = objArr.length;
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = length + (length >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            iHighestOneBit = Integer.MAX_VALUE;
        }
        this.f12873a = Arrays.copyOf(objArr, iHighestOneBit);
        this.f12875c = false;
        Object[] objArr22 = this.f12873a;
        int i32 = this.f12874b;
        this.f12874b = i32 + 1;
        objArr22[i32] = e2;
        return this;
    }
}
