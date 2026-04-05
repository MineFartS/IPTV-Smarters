package a.f;

/* JADX INFO: loaded from: classes.dex */
public class j<E> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f1304b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f1307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1308f;

    public j() {
        this(10);
    }

    public j(int i2) {
        this.f1305c = false;
        if (i2 == 0) {
            this.f1306d = e.f1266a;
            this.f1307e = e.f1268c;
        } else {
            int iE = e.e(i2);
            this.f1306d = new int[iE];
            this.f1307e = new Object[iE];
        }
    }

    public void a(int i2, E e2) {
        int i3 = this.f1308f;
        if (i3 != 0 && i2 <= this.f1306d[i3 - 1]) {
            k(i2, e2);
            return;
        }
        if (this.f1305c && i3 >= this.f1306d.length) {
            e();
        }
        int i4 = this.f1308f;
        if (i4 >= this.f1306d.length) {
            int iE = e.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f1306d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1307e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1306d = iArr;
            this.f1307e = objArr;
        }
        this.f1306d[i4] = i2;
        this.f1307e[i4] = e2;
        this.f1308f = i4 + 1;
    }

    public void b() {
        int i2 = this.f1308f;
        Object[] objArr = this.f1307e;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1308f = 0;
        this.f1305c = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j<E> clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.f1306d = (int[]) this.f1306d.clone();
            jVar.f1307e = (Object[]) this.f1307e.clone();
            return jVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void e() {
        int i2 = this.f1308f;
        int[] iArr = this.f1306d;
        Object[] objArr = this.f1307e;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1304b) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1305c = false;
        this.f1308f = i3;
    }

    public E f(int i2) {
        return g(i2, null);
    }

    public E g(int i2, E e2) {
        int iA = e.a(this.f1306d, this.f1308f, i2);
        if (iA >= 0) {
            Object[] objArr = this.f1307e;
            if (objArr[iA] != f1304b) {
                return (E) objArr[iA];
            }
        }
        return e2;
    }

    public int h(E e2) {
        if (this.f1305c) {
            e();
        }
        for (int i2 = 0; i2 < this.f1308f; i2++) {
            if (this.f1307e[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    public int j(int i2) {
        if (this.f1305c) {
            e();
        }
        return this.f1306d[i2];
    }

    public void k(int i2, E e2) {
        int iA = e.a(this.f1306d, this.f1308f, i2);
        if (iA >= 0) {
            this.f1307e[iA] = e2;
            return;
        }
        int iA2 = iA ^ (-1);
        int i3 = this.f1308f;
        if (iA2 < i3) {
            Object[] objArr = this.f1307e;
            if (objArr[iA2] == f1304b) {
                this.f1306d[iA2] = i2;
                objArr[iA2] = e2;
                return;
            }
        }
        if (this.f1305c && i3 >= this.f1306d.length) {
            e();
            iA2 = e.a(this.f1306d, this.f1308f, i2) ^ (-1);
        }
        int i4 = this.f1308f;
        if (i4 >= this.f1306d.length) {
            int iE = e.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f1306d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1307e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1306d = iArr;
            this.f1307e = objArr2;
        }
        int i5 = this.f1308f;
        if (i5 - iA2 != 0) {
            int[] iArr3 = this.f1306d;
            int i6 = iA2 + 1;
            System.arraycopy(iArr3, iA2, iArr3, i6, i5 - iA2);
            Object[] objArr4 = this.f1307e;
            System.arraycopy(objArr4, iA2, objArr4, i6, this.f1308f - iA2);
        }
        this.f1306d[iA2] = i2;
        this.f1307e[iA2] = e2;
        this.f1308f++;
    }

    public void l(int i2) {
        Object[] objArr = this.f1307e;
        Object obj = objArr[i2];
        Object obj2 = f1304b;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f1305c = true;
        }
    }

    public int m() {
        if (this.f1305c) {
            e();
        }
        return this.f1308f;
    }

    public E n(int i2) {
        if (this.f1305c) {
            e();
        }
        return (E) this.f1307e[i2];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1308f * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1308f; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(j(i2));
            sb.append('=');
            E eN = n(i2);
            if (eN != this) {
                sb.append(eN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
