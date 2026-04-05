package a.f;

/* JADX INFO: loaded from: classes.dex */
public class f<E> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f1269b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f1271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f1272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1273f;

    public f() {
        this(10);
    }

    public f(int i2) {
        this.f1270c = false;
        if (i2 == 0) {
            this.f1271d = e.f1267b;
            this.f1272e = e.f1268c;
        } else {
            int iF = e.f(i2);
            this.f1271d = new long[iF];
            this.f1272e = new Object[iF];
        }
    }

    public void a(long j2, E e2) {
        int i2 = this.f1273f;
        if (i2 != 0 && j2 <= this.f1271d[i2 - 1]) {
            k(j2, e2);
            return;
        }
        if (this.f1270c && i2 >= this.f1271d.length) {
            e();
        }
        int i3 = this.f1273f;
        if (i3 >= this.f1271d.length) {
            int iF = e.f(i3 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.f1271d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1272e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1271d = jArr;
            this.f1272e = objArr;
        }
        this.f1271d[i3] = j2;
        this.f1272e[i3] = e2;
        this.f1273f = i3 + 1;
    }

    public void b() {
        int i2 = this.f1273f;
        Object[] objArr = this.f1272e;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1273f = 0;
        this.f1270c = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f1271d = (long[]) this.f1271d.clone();
            fVar.f1272e = (Object[]) this.f1272e.clone();
            return fVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void e() {
        int i2 = this.f1273f;
        long[] jArr = this.f1271d;
        Object[] objArr = this.f1272e;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1269b) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1270c = false;
        this.f1273f = i3;
    }

    public E f(long j2) {
        return g(j2, null);
    }

    public E g(long j2, E e2) {
        int iB = e.b(this.f1271d, this.f1273f, j2);
        if (iB >= 0) {
            Object[] objArr = this.f1272e;
            if (objArr[iB] != f1269b) {
                return (E) objArr[iB];
            }
        }
        return e2;
    }

    public int h(long j2) {
        if (this.f1270c) {
            e();
        }
        return e.b(this.f1271d, this.f1273f, j2);
    }

    public long j(int i2) {
        if (this.f1270c) {
            e();
        }
        return this.f1271d[i2];
    }

    public void k(long j2, E e2) {
        int iB = e.b(this.f1271d, this.f1273f, j2);
        if (iB >= 0) {
            this.f1272e[iB] = e2;
            return;
        }
        int iB2 = iB ^ (-1);
        int i2 = this.f1273f;
        if (iB2 < i2) {
            Object[] objArr = this.f1272e;
            if (objArr[iB2] == f1269b) {
                this.f1271d[iB2] = j2;
                objArr[iB2] = e2;
                return;
            }
        }
        if (this.f1270c && i2 >= this.f1271d.length) {
            e();
            iB2 = e.b(this.f1271d, this.f1273f, j2) ^ (-1);
        }
        int i3 = this.f1273f;
        if (i3 >= this.f1271d.length) {
            int iF = e.f(i3 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f1271d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1272e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1271d = jArr;
            this.f1272e = objArr2;
        }
        int i4 = this.f1273f;
        if (i4 - iB2 != 0) {
            long[] jArr3 = this.f1271d;
            int i5 = iB2 + 1;
            System.arraycopy(jArr3, iB2, jArr3, i5, i4 - iB2);
            Object[] objArr4 = this.f1272e;
            System.arraycopy(objArr4, iB2, objArr4, i5, this.f1273f - iB2);
        }
        this.f1271d[iB2] = j2;
        this.f1272e[iB2] = e2;
        this.f1273f++;
    }

    public void l(long j2) {
        int iB = e.b(this.f1271d, this.f1273f, j2);
        if (iB >= 0) {
            Object[] objArr = this.f1272e;
            Object obj = objArr[iB];
            Object obj2 = f1269b;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f1270c = true;
            }
        }
    }

    public void m(int i2) {
        Object[] objArr = this.f1272e;
        Object obj = objArr[i2];
        Object obj2 = f1269b;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f1270c = true;
        }
    }

    public int n() {
        if (this.f1270c) {
            e();
        }
        return this.f1273f;
    }

    public E o(int i2) {
        if (this.f1270c) {
            e();
        }
        return (E) this.f1272e[i2];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1273f * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1273f; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(j(i2));
            sb.append('=');
            E eO = o(i2);
            if (eO != this) {
                sb.append(eO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
