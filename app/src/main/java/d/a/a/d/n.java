package d.a.a.d;

import android.os.Build;
import java.math.BigInteger;
import java.net.Inet6Address;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TreeSet<a> f30151a = new TreeSet<>();

    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BigInteger f30152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f30154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f30155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public BigInteger f30156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public BigInteger f30157g;

        public a(b bVar, boolean z) {
            this.f30154d = z;
            this.f30152b = BigInteger.valueOf(bVar.b());
            this.f30153c = bVar.f30095b;
            this.f30155e = true;
        }

        public a(BigInteger bigInteger, int i2, boolean z, boolean z2) {
            this.f30152b = bigInteger;
            this.f30153c = i2;
            this.f30154d = z;
            this.f30155e = z2;
        }

        public a(Inet6Address inet6Address, int i2, boolean z) {
            this.f30153c = i2;
            this.f30154d = z;
            this.f30152b = BigInteger.ZERO;
            int length = inet6Address.getAddress().length;
            int i3 = 128;
            for (int i4 = 0; i4 < length; i4++) {
                i3 -= 8;
                this.f30152b = this.f30152b.add(BigInteger.valueOf(r6[i4] & 255).shiftLeft(i3));
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int iCompareTo = d().compareTo(aVar.d());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int i2 = this.f30153c;
            int i3 = aVar.f30153c;
            if (i2 > i3) {
                return -1;
            }
            return i3 == i2 ? 0 : 1;
        }

        public boolean c(a aVar) {
            BigInteger bigIntegerD = d();
            BigInteger bigIntegerO = o();
            return (bigIntegerD.compareTo(aVar.d()) != 1) && (bigIntegerO.compareTo(aVar.o()) != -1);
        }

        public BigInteger d() {
            if (this.f30156f == null) {
                this.f30156f = p(false);
            }
            return this.f30156f;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            return this.f30153c == aVar.f30153c && aVar.d().equals(d());
        }

        public String g() {
            long jLongValue = this.f30152b.longValue();
            return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf((jLongValue >> 24) % 256), Long.valueOf((jLongValue >> 16) % 256), Long.valueOf((jLongValue >> 8) % 256), Long.valueOf(jLongValue % 256));
        }

        public String i() {
            BigInteger bigIntegerShiftRight = this.f30152b;
            String str = null;
            boolean z = true;
            while (bigIntegerShiftRight.compareTo(BigInteger.ZERO) == 1) {
                long jLongValue = bigIntegerShiftRight.mod(BigInteger.valueOf(65536L)).longValue();
                if (str != null || jLongValue != 0) {
                    if (str == null && !z) {
                        str = ":";
                    }
                    str = z ? String.format(Locale.US, "%x", Long.valueOf(jLongValue), str) : String.format(Locale.US, "%x:%s", Long.valueOf(jLongValue), str);
                }
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(16);
                z = false;
            }
            return str == null ? "::" : str;
        }

        public BigInteger o() {
            if (this.f30157g == null) {
                this.f30157g = p(true);
            }
            return this.f30157g;
        }

        public final BigInteger p(boolean z) {
            BigInteger bit = this.f30152b;
            int i2 = this.f30155e ? 32 - this.f30153c : 128 - this.f30153c;
            for (int i3 = 0; i3 < i2; i3++) {
                bit = z ? bit.setBit(i3) : bit.clearBit(i3);
            }
            return bit;
        }

        public a[] q() {
            a aVar = new a(d(), this.f30153c + 1, this.f30154d, this.f30155e);
            return new a[]{aVar, new a(aVar.o().add(BigInteger.ONE), this.f30153c + 1, this.f30154d, this.f30155e)};
        }

        public String toString() {
            return this.f30155e ? String.format(Locale.US, "%s/%d", g(), Integer.valueOf(this.f30153c)) : String.format(Locale.US, "%s/%d", i(), Integer.valueOf(this.f30153c));
        }
    }

    public void a(b bVar, boolean z) {
        this.f30151a.add(new a(bVar, z));
    }

    public void b(b bVar, boolean z) {
        for (a aVar : new a(bVar, z).q()) {
            this.f30151a.add(aVar);
        }
    }

    public void c(Inet6Address inet6Address, int i2, boolean z) {
        this.f30151a.add(new a(inet6Address, i2, z));
    }

    public void d() {
        this.f30151a.clear();
    }

    public TreeSet<a> e() {
        PriorityQueue priorityQueue = new PriorityQueue((SortedSet) this.f30151a);
        TreeSet<a> treeSet = new TreeSet<>();
        a aVar = (a) priorityQueue.poll();
        if (aVar == null) {
            return treeSet;
        }
        while (aVar != null) {
            a aVar2 = (a) priorityQueue.poll();
            if (aVar2 == null || aVar.o().compareTo(aVar2.d()) == -1) {
                treeSet.add(aVar);
                aVar = aVar2;
            } else if (!aVar.d().equals(aVar2.d()) || aVar.f30153c < aVar2.f30153c) {
                if (aVar.f30154d != aVar2.f30154d) {
                    a[] aVarArrQ = aVar.q();
                    if (aVarArrQ[1].f30153c != aVar2.f30153c) {
                        priorityQueue.add(aVarArrQ[1]);
                    }
                    priorityQueue.add(aVar2);
                    aVar = aVarArrQ[0];
                }
            } else if (aVar.f30154d == aVar2.f30154d) {
                aVar = aVar2;
            } else {
                a[] aVarArrQ2 = aVar2.q();
                if (!priorityQueue.contains(aVarArrQ2[1])) {
                    priorityQueue.add(aVarArrQ2[1]);
                }
                if (!aVarArrQ2[0].o().equals(aVar.o()) && !priorityQueue.contains(aVarArrQ2[0])) {
                    priorityQueue.add(aVarArrQ2[0]);
                }
            }
        }
        return treeSet;
    }

    public Collection<a> f(boolean z) {
        Vector vector = new Vector();
        for (a aVar : this.f30151a) {
            if (aVar.f30154d == z) {
                vector.add(aVar);
            }
        }
        return vector;
    }

    public Collection<a> g() {
        TreeSet<a> treeSetE = e();
        Vector vector = new Vector();
        for (a aVar : treeSetE) {
            if (aVar.f30154d) {
                vector.add(aVar);
            }
        }
        if (Build.VERSION.SDK_INT < 19) {
            for (a aVar2 : this.f30151a) {
                if (aVar2.f30154d && !treeSetE.contains(aVar2)) {
                    boolean z = false;
                    Iterator<a> it = treeSetE.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        a next = it.next();
                        if (!next.f30154d && aVar2.c(next)) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        vector.add(aVar2);
                    }
                }
            }
        }
        return vector;
    }
}
