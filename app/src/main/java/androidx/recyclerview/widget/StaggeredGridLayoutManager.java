package androidx.recyclerview.widget;

import a.y.e.i;
import a.y.e.j;
import a.y.e.l;
import a.y.e.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {
    public BitSet B;
    public boolean G;
    public boolean H;
    public e I;
    public int J;
    public int[] O;
    public f[] t;
    public l u;
    public l v;
    public int w;
    public int x;
    public final i y;
    public int s = -1;
    public boolean z = false;
    public boolean A = false;
    public int C = -1;
    public int D = Integer.MIN_VALUE;
    public d E = new d();
    public int F = 2;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public final Runnable P = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.W1();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f4931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f4932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f4933f;

        public b() {
            c();
        }

        public void a() {
            this.f4929b = this.f4930c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.m();
        }

        public void b(int i2) {
            this.f4929b = this.f4930c ? StaggeredGridLayoutManager.this.u.i() - i2 : StaggeredGridLayoutManager.this.u.m() + i2;
        }

        public void c() {
            this.f4928a = -1;
            this.f4929b = Integer.MIN_VALUE;
            this.f4930c = false;
            this.f4931d = false;
            this.f4932e = false;
            int[] iArr = this.f4933f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f4933f;
            if (iArr == null || iArr.length < length) {
                this.f4933f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.f4933f[i2] = fVarArr[i2].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f f4935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f4936f;

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public boolean g() {
            return this.f4936f;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f4937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<a> f4938b;

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0095a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f4939b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f4940c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f4941d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f4942e;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0095a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i2) {
                    return new a[i2];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f4939b = parcel.readInt();
                this.f4940c = parcel.readInt();
                this.f4942e = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    this.f4941d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int b(int i2) {
                int[] iArr = this.f4941d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4939b + ", mGapDir=" + this.f4940c + ", mHasUnwantedGapAfter=" + this.f4942e + ", mGapPerSpan=" + Arrays.toString(this.f4941d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f4939b);
                parcel.writeInt(this.f4940c);
                parcel.writeInt(this.f4942e ? 1 : 0);
                int[] iArr = this.f4941d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4941d);
                }
            }
        }

        public void a(a aVar) {
            if (this.f4938b == null) {
                this.f4938b = new ArrayList();
            }
            int size = this.f4938b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar2 = this.f4938b.get(i2);
                if (aVar2.f4939b == aVar.f4939b) {
                    this.f4938b.remove(i2);
                }
                if (aVar2.f4939b >= aVar.f4939b) {
                    this.f4938b.add(i2, aVar);
                    return;
                }
            }
            this.f4938b.add(aVar);
        }

        public void b() {
            int[] iArr = this.f4937a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4938b = null;
        }

        public void c(int i2) {
            int[] iArr = this.f4937a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i2, 10) + 1];
                this.f4937a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int[] iArr3 = new int[o(i2)];
                this.f4937a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4937a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i2) {
            List<a> list = this.f4938b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4938b.get(size).f4939b >= i2) {
                        this.f4938b.remove(size);
                    }
                }
            }
            return h(i2);
        }

        public a e(int i2, int i3, int i4, boolean z) {
            List<a> list = this.f4938b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = this.f4938b.get(i5);
                int i6 = aVar.f4939b;
                if (i6 >= i3) {
                    return null;
                }
                if (i6 >= i2 && (i4 == 0 || aVar.f4940c == i4 || (z && aVar.f4942e))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i2) {
            List<a> list = this.f4938b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4938b.get(size);
                if (aVar.f4939b == i2) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i2) {
            int[] iArr = this.f4937a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        public int h(int i2) {
            int[] iArr = this.f4937a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int i3 = i(i2);
            if (i3 == -1) {
                int[] iArr2 = this.f4937a;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.f4937a.length;
            }
            int iMin = Math.min(i3 + 1, this.f4937a.length);
            Arrays.fill(this.f4937a, i2, iMin, -1);
            return iMin;
        }

        public final int i(int i2) {
            if (this.f4938b == null) {
                return -1;
            }
            a aVarF = f(i2);
            if (aVarF != null) {
                this.f4938b.remove(aVarF);
            }
            int size = this.f4938b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (this.f4938b.get(i3).f4939b >= i2) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return -1;
            }
            a aVar = this.f4938b.get(i3);
            this.f4938b.remove(i3);
            return aVar.f4939b;
        }

        public void j(int i2, int i3) {
            int[] iArr = this.f4937a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            c(i4);
            int[] iArr2 = this.f4937a;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill(this.f4937a, i2, i4, -1);
            l(i2, i3);
        }

        public void k(int i2, int i3) {
            int[] iArr = this.f4937a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            c(i4);
            int[] iArr2 = this.f4937a;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.f4937a;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            m(i2, i3);
        }

        public final void l(int i2, int i3) {
            List<a> list = this.f4938b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4938b.get(size);
                int i4 = aVar.f4939b;
                if (i4 >= i2) {
                    aVar.f4939b = i4 + i3;
                }
            }
        }

        public final void m(int i2, int i3) {
            List<a> list = this.f4938b;
            if (list == null) {
                return;
            }
            int i4 = i2 + i3;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4938b.get(size);
                int i5 = aVar.f4939b;
                if (i5 >= i2) {
                    if (i5 < i4) {
                        this.f4938b.remove(size);
                    } else {
                        aVar.f4939b = i5 - i3;
                    }
                }
            }
        }

        public void n(int i2, f fVar) {
            c(i2);
            this.f4937a[i2] = fVar.f4957e;
        }

        public int o(int i2) {
            int length = this.f4937a.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4945d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f4946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4947f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int[] f4948g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<d.a> f4949h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f4950i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f4951j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f4952k;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f4943b = parcel.readInt();
            this.f4944c = parcel.readInt();
            int i2 = parcel.readInt();
            this.f4945d = i2;
            if (i2 > 0) {
                int[] iArr = new int[i2];
                this.f4946e = iArr;
                parcel.readIntArray(iArr);
            }
            int i3 = parcel.readInt();
            this.f4947f = i3;
            if (i3 > 0) {
                int[] iArr2 = new int[i3];
                this.f4948g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4950i = parcel.readInt() == 1;
            this.f4951j = parcel.readInt() == 1;
            this.f4952k = parcel.readInt() == 1;
            this.f4949h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f4945d = eVar.f4945d;
            this.f4943b = eVar.f4943b;
            this.f4944c = eVar.f4944c;
            this.f4946e = eVar.f4946e;
            this.f4947f = eVar.f4947f;
            this.f4948g = eVar.f4948g;
            this.f4950i = eVar.f4950i;
            this.f4951j = eVar.f4951j;
            this.f4952k = eVar.f4952k;
            this.f4949h = eVar.f4949h;
        }

        public void b() {
            this.f4946e = null;
            this.f4945d = 0;
            this.f4943b = -1;
            this.f4944c = -1;
        }

        public void c() {
            this.f4946e = null;
            this.f4945d = 0;
            this.f4947f = 0;
            this.f4948g = null;
            this.f4949h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f4943b);
            parcel.writeInt(this.f4944c);
            parcel.writeInt(this.f4945d);
            if (this.f4945d > 0) {
                parcel.writeIntArray(this.f4946e);
            }
            parcel.writeInt(this.f4947f);
            if (this.f4947f > 0) {
                parcel.writeIntArray(this.f4948g);
            }
            parcel.writeInt(this.f4950i ? 1 : 0);
            parcel.writeInt(this.f4951j ? 1 : 0);
            parcel.writeInt(this.f4952k ? 1 : 0);
            parcel.writeList(this.f4949h);
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<View> f4953a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4954b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4955c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4956d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4957e;

        public f(int i2) {
            this.f4957e = i2;
        }

        public void a(View view) {
            c cVarN = n(view);
            cVarN.f4935e = this;
            this.f4953a.add(view);
            this.f4955c = Integer.MIN_VALUE;
            if (this.f4953a.size() == 1) {
                this.f4954b = Integer.MIN_VALUE;
            }
            if (cVarN.d() || cVarN.c()) {
                this.f4956d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void b(boolean z, int i2) {
            int iL = z ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iL >= StaggeredGridLayoutManager.this.u.i()) {
                if (z || iL <= StaggeredGridLayoutManager.this.u.m()) {
                    if (i2 != Integer.MIN_VALUE) {
                        iL += i2;
                    }
                    this.f4955c = iL;
                    this.f4954b = iL;
                }
            }
        }

        public void c() {
            d.a aVarF;
            ArrayList<View> arrayList = this.f4953a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f4955c = StaggeredGridLayoutManager.this.u.d(view);
            if (cVarN.f4936f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.b())) != null && aVarF.f4940c == 1) {
                this.f4955c += aVarF.b(this.f4957e);
            }
        }

        public void d() {
            d.a aVarF;
            View view = this.f4953a.get(0);
            c cVarN = n(view);
            this.f4954b = StaggeredGridLayoutManager.this.u.g(view);
            if (cVarN.f4936f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.b())) != null && aVarF.f4940c == -1) {
                this.f4954b -= aVarF.b(this.f4957e);
            }
        }

        public void e() {
            this.f4953a.clear();
            q();
            this.f4956d = 0;
        }

        public int f() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.z) {
                size = this.f4953a.size() - 1;
                size2 = -1;
            } else {
                size = 0;
                size2 = this.f4953a.size();
            }
            return i(size, size2, true);
        }

        public int g() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.z) {
                size = 0;
                size2 = this.f4953a.size();
            } else {
                size = this.f4953a.size() - 1;
                size2 = -1;
            }
            return i(size, size2, true);
        }

        public int h(int i2, int i3, boolean z, boolean z2, boolean z3) {
            int iM = StaggeredGridLayoutManager.this.u.m();
            int i4 = StaggeredGridLayoutManager.this.u.i();
            int i5 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.f4953a.get(i2);
                int iG = StaggeredGridLayoutManager.this.u.g(view);
                int iD = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iG >= i4 : iG > i4;
                if (!z3 ? iD > iM : iD >= iM) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iG >= iM && iD <= i4) {
                            return StaggeredGridLayoutManager.this.j0(view);
                        }
                    } else if (z2 || iG < iM || iD > i4) {
                        return StaggeredGridLayoutManager.this.j0(view);
                    }
                }
                i2 += i5;
            }
            return -1;
        }

        public int i(int i2, int i3, boolean z) {
            return h(i2, i3, false, false, z);
        }

        public int j() {
            return this.f4956d;
        }

        public int k() {
            int i2 = this.f4955c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            c();
            return this.f4955c;
        }

        public int l(int i2) {
            int i3 = this.f4955c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f4953a.size() == 0) {
                return i2;
            }
            c();
            return this.f4955c;
        }

        public View m(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.f4953a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4953a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.j0(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.j0(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4953a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.f4953a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.j0(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.j0(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i2 = this.f4954b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            d();
            return this.f4954b;
        }

        public int p(int i2) {
            int i3 = this.f4954b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f4953a.size() == 0) {
                return i2;
            }
            d();
            return this.f4954b;
        }

        public void q() {
            this.f4954b = Integer.MIN_VALUE;
            this.f4955c = Integer.MIN_VALUE;
        }

        public void r(int i2) {
            int i3 = this.f4954b;
            if (i3 != Integer.MIN_VALUE) {
                this.f4954b = i3 + i2;
            }
            int i4 = this.f4955c;
            if (i4 != Integer.MIN_VALUE) {
                this.f4955c = i4 + i2;
            }
        }

        public void s() {
            int size = this.f4953a.size();
            View viewRemove = this.f4953a.remove(size - 1);
            c cVarN = n(viewRemove);
            cVarN.f4935e = null;
            if (cVarN.d() || cVarN.c()) {
                this.f4956d -= StaggeredGridLayoutManager.this.u.e(viewRemove);
            }
            if (size == 1) {
                this.f4954b = Integer.MIN_VALUE;
            }
            this.f4955c = Integer.MIN_VALUE;
        }

        public void t() {
            View viewRemove = this.f4953a.remove(0);
            c cVarN = n(viewRemove);
            cVarN.f4935e = null;
            if (this.f4953a.size() == 0) {
                this.f4955c = Integer.MIN_VALUE;
            }
            if (cVarN.d() || cVarN.c()) {
                this.f4956d -= StaggeredGridLayoutManager.this.u.e(viewRemove);
            }
            this.f4954b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c cVarN = n(view);
            cVarN.f4935e = this;
            this.f4953a.add(0, view);
            this.f4954b = Integer.MIN_VALUE;
            if (this.f4953a.size() == 1) {
                this.f4955c = Integer.MIN_VALUE;
            }
            if (cVarN.d() || cVarN.c()) {
                this.f4956d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        public void v(int i2) {
            this.f4954b = i2;
            this.f4955c = i2;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.p.d dVarK0 = RecyclerView.p.k0(context, attributeSet, i2, i3);
        L2(dVarK0.f4902a);
        N2(dVarK0.f4903b);
        M2(dVarK0.f4904c);
        this.y = new i();
        e2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A1(int i2) {
        e eVar = this.I;
        if (eVar != null && eVar.f4943b != i2) {
            eVar.b();
        }
        this.C = i2;
        this.D = Integer.MIN_VALUE;
        w1();
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.b0 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return J2(i2, wVar, b0Var);
    }

    public final boolean B2(int i2) {
        if (this.w == 0) {
            return (i2 == -1) != this.A;
        }
        return ((i2 == -1) == this.A) == x2();
    }

    public void C2(int i2, RecyclerView.b0 b0Var) {
        int iN2;
        int i3;
        if (i2 > 0) {
            iN2 = o2();
            i3 = 1;
        } else {
            iN2 = n2();
            i3 = -1;
        }
        this.y.f3942a = true;
        S2(iN2, b0Var);
        K2(i3);
        i iVar = this.y;
        iVar.f3944c = iN2 + iVar.f3945d;
        iVar.f3943b = Math.abs(i2);
    }

    public final void D2(View view) {
        for (int i2 = this.s - 1; i2 >= 0; i2--) {
            this.t[i2].u(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r4.f3946e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E2(androidx.recyclerview.widget.RecyclerView.w r3, a.y.e.i r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3942a
            if (r0 == 0) goto L4d
            boolean r0 = r4.f3950i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f3943b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f3946e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f3948g
        L14:
            r2.F2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f3947f
        L1a:
            r2.G2(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f3946e
            if (r0 != r1) goto L37
            int r0 = r4.f3947f
            int r1 = r2.q2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f3948g
            int r4 = r4.f3943b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f3948g
            int r0 = r2.r2(r0)
            int r1 = r4.f3948g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f3947f
            int r4 = r4.f3943b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.E2(androidx.recyclerview.widget.RecyclerView$w, a.y.e.i):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F0(int i2) {
        super.F0(i2);
        for (int i3 = 0; i3 < this.s; i3++) {
            this.t[i3].r(i2);
        }
    }

    public final void F2(RecyclerView.w wVar, int i2) {
        for (int iL = L() - 1; iL >= 0; iL--) {
            View viewK = K(iL);
            if (this.u.g(viewK) < i2 || this.u.q(viewK) < i2) {
                return;
            }
            c cVar = (c) viewK.getLayoutParams();
            if (cVar.f4936f) {
                for (int i3 = 0; i3 < this.s; i3++) {
                    if (this.t[i3].f4953a.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.s; i4++) {
                    this.t[i4].s();
                }
            } else if (cVar.f4935e.f4953a.size() == 1) {
                return;
            } else {
                cVar.f4935e.s();
            }
            p1(viewK, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q G(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G0(int i2) {
        super.G0(i2);
        for (int i3 = 0; i3 < this.s; i3++) {
            this.t[i3].r(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(Rect rect, int i2, int i3) {
        int iO;
        int iO2;
        int iG0 = g0() + h0();
        int iI0 = i0() + f0();
        if (this.w == 1) {
            iO2 = RecyclerView.p.o(i3, rect.height() + iI0, d0());
            iO = RecyclerView.p.o(i2, (this.x * this.s) + iG0, e0());
        } else {
            iO = RecyclerView.p.o(i2, rect.width() + iG0, e0());
            iO2 = RecyclerView.p.o(i3, (this.x * this.s) + iI0, d0());
        }
        F1(iO, iO2);
    }

    public final void G2(RecyclerView.w wVar, int i2) {
        while (L() > 0) {
            View viewK = K(0);
            if (this.u.d(viewK) > i2 || this.u.p(viewK) > i2) {
                return;
            }
            c cVar = (c) viewK.getLayoutParams();
            if (cVar.f4936f) {
                for (int i3 = 0; i3 < this.s; i3++) {
                    if (this.t[i3].f4953a.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.s; i4++) {
                    this.t[i4].t();
                }
            } else if (cVar.f4935e.f4953a.size() == 1) {
                return;
            } else {
                cVar.f4935e.t();
            }
            p1(viewK, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q H(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].e();
        }
    }

    public final void H2() {
        if (this.v.k() == 1073741824) {
            return;
        }
        float fMax = 0.0f;
        int iL = L();
        for (int i2 = 0; i2 < iL; i2++) {
            View viewK = K(i2);
            float fE = this.v.e(viewK);
            if (fE >= fMax) {
                if (((c) viewK.getLayoutParams()).g()) {
                    fE = (fE * 1.0f) / this.s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i3 = this.x;
        int iRound = Math.round(fMax * this.s);
        if (this.v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.v.n());
        }
        T2(iRound);
        if (this.x == i3) {
            return;
        }
        for (int i4 = 0; i4 < iL; i4++) {
            View viewK2 = K(i4);
            c cVar = (c) viewK2.getLayoutParams();
            if (!cVar.f4936f) {
                if (x2() && this.w == 1) {
                    int i5 = this.s;
                    int i6 = cVar.f4935e.f4957e;
                    viewK2.offsetLeftAndRight(((-((i5 - 1) - i6)) * this.x) - ((-((i5 - 1) - i6)) * i3));
                } else {
                    int i7 = cVar.f4935e.f4957e;
                    int i8 = this.w;
                    int i9 = (this.x * i7) - (i7 * i3);
                    if (i8 == 1) {
                        viewK2.offsetLeftAndRight(i9);
                    } else {
                        viewK2.offsetTopAndBottom(i9);
                    }
                }
            }
        }
    }

    public final void I2() {
        this.A = (this.w == 1 || !x2()) ? this.z : !this.z;
    }

    public int J2(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (L() == 0 || i2 == 0) {
            return 0;
        }
        C2(i2, b0Var);
        int iF2 = f2(wVar, this.y, b0Var);
        if (this.y.f3943b >= iF2) {
            i2 = i2 < 0 ? -iF2 : iF2;
        }
        this.u.r(-i2);
        this.G = this.A;
        i iVar = this.y;
        iVar.f3943b = 0;
        E2(wVar, iVar);
        return i2;
    }

    public final void K2(int i2) {
        i iVar = this.y;
        iVar.f3946e = i2;
        iVar.f3945d = this.A != (i2 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.L0(recyclerView, wVar);
        r1(this.P);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].e();
        }
        recyclerView.requestLayout();
    }

    public void L2(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        h(null);
        if (i2 == this.w) {
            return;
        }
        this.w = i2;
        l lVar = this.u;
        this.u = this.v;
        this.v = lVar;
        w1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View M0(View view, int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View viewD;
        View viewM;
        if (L() == 0 || (viewD = D(view)) == null) {
            return null;
        }
        I2();
        int iB2 = b2(i2);
        if (iB2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewD.getLayoutParams();
        boolean z = cVar.f4936f;
        f fVar = cVar.f4935e;
        int iO2 = iB2 == 1 ? o2() : n2();
        S2(iO2, b0Var);
        K2(iB2);
        i iVar = this.y;
        iVar.f3944c = iVar.f3945d + iO2;
        iVar.f3943b = (int) (this.u.n() * 0.33333334f);
        i iVar2 = this.y;
        iVar2.f3949h = true;
        iVar2.f3942a = false;
        f2(wVar, iVar2, b0Var);
        this.G = this.A;
        if (!z && (viewM = fVar.m(iO2, iB2)) != null && viewM != viewD) {
            return viewM;
        }
        if (B2(iB2)) {
            for (int i3 = this.s - 1; i3 >= 0; i3--) {
                View viewM2 = this.t[i3].m(iO2, iB2);
                if (viewM2 != null && viewM2 != viewD) {
                    return viewM2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.s; i4++) {
                View viewM3 = this.t[i4].m(iO2, iB2);
                if (viewM3 != null && viewM3 != viewD) {
                    return viewM3;
                }
            }
        }
        boolean z2 = (this.z ^ true) == (iB2 == -1);
        if (!z) {
            View viewE = E(z2 ? fVar.f() : fVar.g());
            if (viewE != null && viewE != viewD) {
                return viewE;
            }
        }
        if (B2(iB2)) {
            for (int i5 = this.s - 1; i5 >= 0; i5--) {
                if (i5 != fVar.f4957e) {
                    f[] fVarArr = this.t;
                    View viewE2 = E(z2 ? fVarArr[i5].f() : fVarArr[i5].g());
                    if (viewE2 != null && viewE2 != viewD) {
                        return viewE2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.s; i6++) {
                f[] fVarArr2 = this.t;
                View viewE3 = E(z2 ? fVarArr2[i6].f() : fVarArr2[i6].g());
                if (viewE3 != null && viewE3 != viewD) {
                    return viewE3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i2) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i2);
        N1(jVar);
    }

    public void M2(boolean z) {
        h(null);
        e eVar = this.I;
        if (eVar != null && eVar.f4950i != z) {
            eVar.f4950i = z;
        }
        this.z = z;
        w1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(AccessibilityEvent accessibilityEvent) {
        super.N0(accessibilityEvent);
        if (L() > 0) {
            View viewI2 = i2(false);
            View viewH2 = h2(false);
            if (viewI2 == null || viewH2 == null) {
                return;
            }
            int iJ0 = j0(viewI2);
            int iJ02 = j0(viewH2);
            if (iJ0 < iJ02) {
                accessibilityEvent.setFromIndex(iJ0);
                accessibilityEvent.setToIndex(iJ02);
            } else {
                accessibilityEvent.setFromIndex(iJ02);
                accessibilityEvent.setToIndex(iJ0);
            }
        }
    }

    public void N2(int i2) {
        h(null);
        if (i2 != this.s) {
            w2();
            this.s = i2;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i3 = 0; i3 < this.s; i3++) {
                this.t[i3] = new f(i3);
            }
            w1();
        }
    }

    public final void O2(int i2, int i3) {
        for (int i4 = 0; i4 < this.s; i4++) {
            if (!this.t[i4].f4953a.isEmpty()) {
                U2(this.t[i4], i2, i3);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.I == null;
    }

    public final boolean P2(RecyclerView.b0 b0Var, b bVar) {
        boolean z = this.G;
        int iC = b0Var.c();
        bVar.f4928a = z ? k2(iC) : g2(iC);
        bVar.f4929b = Integer.MIN_VALUE;
        return true;
    }

    public final void Q1(View view) {
        for (int i2 = this.s - 1; i2 >= 0; i2--) {
            this.t[i2].a(view);
        }
    }

    public boolean Q2(RecyclerView.b0 b0Var, b bVar) {
        int i2;
        int iM;
        int iG;
        if (!b0Var.h() && (i2 = this.C) != -1) {
            if (i2 >= 0 && i2 < b0Var.c()) {
                e eVar = this.I;
                if (eVar == null || eVar.f4943b == -1 || eVar.f4945d < 1) {
                    View viewE = E(this.C);
                    if (viewE != null) {
                        bVar.f4928a = this.A ? o2() : n2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f4930c) {
                                iM = this.u.i() - this.D;
                                iG = this.u.d(viewE);
                            } else {
                                iM = this.u.m() + this.D;
                                iG = this.u.g(viewE);
                            }
                            bVar.f4929b = iM - iG;
                            return true;
                        }
                        if (this.u.e(viewE) > this.u.n()) {
                            bVar.f4929b = bVar.f4930c ? this.u.i() : this.u.m();
                            return true;
                        }
                        int iG2 = this.u.g(viewE) - this.u.m();
                        if (iG2 < 0) {
                            bVar.f4929b = -iG2;
                            return true;
                        }
                        int i3 = this.u.i() - this.u.d(viewE);
                        if (i3 < 0) {
                            bVar.f4929b = i3;
                            return true;
                        }
                        bVar.f4929b = Integer.MIN_VALUE;
                    } else {
                        int i4 = this.C;
                        bVar.f4928a = i4;
                        int i5 = this.D;
                        if (i5 == Integer.MIN_VALUE) {
                            bVar.f4930c = V1(i4) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i5);
                        }
                        bVar.f4931d = true;
                    }
                } else {
                    bVar.f4929b = Integer.MIN_VALUE;
                    bVar.f4928a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void R1(b bVar) {
        boolean z;
        e eVar = this.I;
        int i2 = eVar.f4945d;
        if (i2 > 0) {
            if (i2 == this.s) {
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].e();
                    e eVar2 = this.I;
                    int i4 = eVar2.f4946e[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        i4 += eVar2.f4951j ? this.u.i() : this.u.m();
                    }
                    this.t[i3].v(i4);
                }
            } else {
                eVar.c();
                e eVar3 = this.I;
                eVar3.f4943b = eVar3.f4944c;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f4952k;
        M2(eVar4.f4950i);
        I2();
        e eVar5 = this.I;
        int i5 = eVar5.f4943b;
        if (i5 != -1) {
            this.C = i5;
            z = eVar5.f4951j;
        } else {
            z = this.A;
        }
        bVar.f4930c = z;
        if (eVar5.f4947f > 1) {
            d dVar = this.E;
            dVar.f4937a = eVar5.f4948g;
            dVar.f4938b = eVar5.f4949h;
        }
    }

    public void R2(RecyclerView.b0 b0Var, b bVar) {
        if (Q2(b0Var, bVar) || P2(b0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f4928a = 0;
    }

    public boolean S1() {
        int iL = this.t[0].l(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.s; i2++) {
            if (this.t[i2].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S2(int r5, androidx.recyclerview.widget.RecyclerView.b0 r6) {
        /*
            r4 = this;
            a.y.e.i r0 = r4.y
            r1 = 0
            r0.f3943b = r1
            r0.f3944c = r5
            boolean r0 = r4.A0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.f()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            a.y.e.l r5 = r4.u
            int r5 = r5.n()
            goto L2f
        L25:
            a.y.e.l r5 = r4.u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.O()
            if (r0 == 0) goto L4d
            a.y.e.i r0 = r4.y
            a.y.e.l r3 = r4.u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f3947f = r3
            a.y.e.i r6 = r4.y
            a.y.e.l r0 = r4.u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f3948g = r0
            goto L5d
        L4d:
            a.y.e.i r0 = r4.y
            a.y.e.l r3 = r4.u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f3948g = r3
            a.y.e.i r5 = r4.y
            int r6 = -r6
            r5.f3947f = r6
        L5d:
            a.y.e.i r5 = r4.y
            r5.f3949h = r1
            r5.f3942a = r2
            a.y.e.l r6 = r4.u
            int r6 = r6.k()
            if (r6 != 0) goto L74
            a.y.e.l r6 = r4.u
            int r6 = r6.h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f3950i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S2(int, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    public boolean T1() {
        int iP = this.t[0].p(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.s; i2++) {
            if (this.t[i2].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    public void T2(int i2) {
        this.x = i2 / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i2, this.v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i2, int i3) {
        u2(i2, i3, 1);
    }

    public final void U1(View view, c cVar, i iVar) {
        if (iVar.f3946e == 1) {
            if (cVar.f4936f) {
                Q1(view);
                return;
            } else {
                cVar.f4935e.a(view);
                return;
            }
        }
        if (cVar.f4936f) {
            D2(view);
        } else {
            cVar.f4935e.u(view);
        }
    }

    public final void U2(f fVar, int i2, int i3) {
        int iJ = fVar.j();
        if (i2 == -1) {
            if (fVar.o() + iJ > i3) {
                return;
            }
        } else if (fVar.k() - iJ < i3) {
            return;
        }
        this.B.set(fVar.f4957e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView) {
        this.E.b();
        w1();
    }

    public final int V1(int i2) {
        if (L() == 0) {
            return this.A ? 1 : -1;
        }
        return (i2 < n2()) != this.A ? -1 : 1;
    }

    public final int V2(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i2, int i3, int i4) {
        u2(i2, i3, 8);
    }

    public boolean W1() {
        int iN2;
        int iO2;
        if (L() == 0 || this.F == 0 || !u0()) {
            return false;
        }
        if (this.A) {
            iN2 = o2();
            iO2 = n2();
        } else {
            iN2 = n2();
            iO2 = o2();
        }
        if (iN2 == 0 && v2() != null) {
            this.E.b();
        } else {
            if (!this.M) {
                return false;
            }
            int i2 = this.A ? -1 : 1;
            int i3 = iO2 + 1;
            d.a aVarE = this.E.e(iN2, i3, i2, true);
            if (aVarE == null) {
                this.M = false;
                this.E.d(i3);
                return false;
            }
            d.a aVarE2 = this.E.e(iN2, aVarE.f4939b, i2 * (-1), true);
            if (aVarE2 == null) {
                this.E.d(aVarE.f4939b);
            } else {
                this.E.d(aVarE2.f4939b + 1);
            }
        }
        x1();
        w1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i2, int i3) {
        u2(i2, i3, 2);
    }

    public final boolean X1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.u.i()) {
                ArrayList<View> arrayList = fVar.f4953a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f4936f;
            }
        } else if (fVar.o() > this.u.m()) {
            return !fVar.n(fVar.f4953a.get(0)).f4936f;
        }
        return false;
    }

    public final int Y1(RecyclerView.b0 b0Var) {
        if (L() == 0) {
            return 0;
        }
        return o.a(b0Var, this.u, i2(!this.N), h2(!this.N), this, this.N);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        u2(i2, i3, 4);
    }

    public final int Z1(RecyclerView.b0 b0Var) {
        if (L() == 0) {
            return 0;
        }
        return o.b(b0Var, this.u, i2(!this.N), h2(!this.N), this, this.N, this.A);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i2) {
        int iV1 = V1(i2);
        PointF pointF = new PointF();
        if (iV1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = iV1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iV1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        A2(wVar, b0Var, true);
    }

    public final int a2(RecyclerView.b0 b0Var) {
        if (L() == 0) {
            return 0;
        }
        return o.c(b0Var, this.u, i2(!this.N), h2(!this.N), this, this.N);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.b0 b0Var) {
        super.b1(b0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public final int b2(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.w == 1) ? 1 : Integer.MIN_VALUE : this.w == 0 ? 1 : Integer.MIN_VALUE : this.w == 1 ? -1 : Integer.MIN_VALUE : this.w == 0 ? -1 : Integer.MIN_VALUE : (this.w != 1 && x2()) ? -1 : 1 : (this.w != 1 && x2()) ? 1 : -1;
    }

    public final d.a c2(int i2) {
        d.a aVar = new d.a();
        aVar.f4941d = new int[this.s];
        for (int i3 = 0; i3 < this.s; i3++) {
            aVar.f4941d[i3] = i2 - this.t[i3].l(i2);
        }
        return aVar;
    }

    public final d.a d2(int i2) {
        d.a aVar = new d.a();
        aVar.f4941d = new int[this.s];
        for (int i3 = 0; i3 < this.s; i3++) {
            aVar.f4941d[i3] = this.t[i3].p(i2) - i2;
        }
        return aVar;
    }

    public final void e2() {
        this.u = l.b(this, this.w);
        this.v = l.b(this, 1 - this.w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.I = eVar;
            if (this.C != -1) {
                eVar.b();
                this.I.c();
            }
            w1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int f2(RecyclerView.w wVar, i iVar, RecyclerView.b0 b0Var) {
        int i2;
        f fVarT2;
        int iE;
        int i3;
        int iE2;
        int iE3;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        View view;
        int i4;
        int i5;
        ?? r9 = 0;
        this.B.set(0, this.s, true);
        if (this.y.f3950i) {
            i2 = iVar.f3946e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i2 = iVar.f3946e == 1 ? iVar.f3948g + iVar.f3943b : iVar.f3947f - iVar.f3943b;
        }
        O2(iVar.f3946e, i2);
        int i6 = this.A ? this.u.i() : this.u.m();
        boolean z = false;
        while (iVar.a(b0Var) && (this.y.f3950i || !this.B.isEmpty())) {
            View viewB = iVar.b(wVar);
            c cVar = (c) viewB.getLayoutParams();
            int iB = cVar.b();
            int iG = this.E.g(iB);
            boolean z2 = iG == -1;
            if (z2) {
                fVarT2 = cVar.f4936f ? this.t[r9] : t2(iVar);
                this.E.n(iB, fVarT2);
            } else {
                fVarT2 = this.t[iG];
            }
            f fVar = fVarT2;
            cVar.f4935e = fVar;
            if (iVar.f3946e == 1) {
                e(viewB);
            } else {
                f(viewB, r9);
            }
            z2(viewB, cVar, r9);
            if (iVar.f3946e == 1) {
                int iP2 = cVar.f4936f ? p2(i6) : fVar.l(i6);
                int iE4 = this.u.e(viewB) + iP2;
                if (z2 && cVar.f4936f) {
                    d.a aVarC2 = c2(iP2);
                    aVarC2.f4940c = -1;
                    aVarC2.f4939b = iB;
                    this.E.a(aVarC2);
                }
                i3 = iE4;
                iE = iP2;
            } else {
                int iS2 = cVar.f4936f ? s2(i6) : fVar.p(i6);
                iE = iS2 - this.u.e(viewB);
                if (z2 && cVar.f4936f) {
                    d.a aVarD2 = d2(iS2);
                    aVarD2.f4940c = 1;
                    aVarD2.f4939b = iB;
                    this.E.a(aVarD2);
                }
                i3 = iS2;
            }
            if (cVar.f4936f && iVar.f3945d == -1) {
                if (z2) {
                    this.M = true;
                } else {
                    if (!(iVar.f3946e == 1 ? S1() : T1())) {
                        d.a aVarF = this.E.f(iB);
                        if (aVarF != null) {
                            aVarF.f4942e = true;
                        }
                        this.M = true;
                    }
                }
            }
            U1(viewB, cVar, iVar);
            if (x2() && this.w == 1) {
                int i7 = cVar.f4936f ? this.v.i() : this.v.i() - (((this.s - 1) - fVar.f4957e) * this.x);
                iE3 = i7;
                iE2 = i7 - this.v.e(viewB);
            } else {
                int iM = cVar.f4936f ? this.v.m() : (fVar.f4957e * this.x) + this.v.m();
                iE2 = iM;
                iE3 = this.v.e(viewB) + iM;
            }
            if (this.w == 1) {
                staggeredGridLayoutManager = this;
                view = viewB;
                i4 = iE2;
                iE2 = iE;
                i5 = iE3;
            } else {
                staggeredGridLayoutManager = this;
                view = viewB;
                i4 = iE;
                i5 = i3;
                i3 = iE3;
            }
            staggeredGridLayoutManager.C0(view, i4, iE2, i5, i3);
            if (cVar.f4936f) {
                O2(this.y.f3946e, i2);
            } else {
                U2(fVar, this.y.f3946e, i2);
            }
            E2(wVar, this.y);
            if (this.y.f3949h && viewB.hasFocusable()) {
                if (cVar.f4936f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar.f4957e, false);
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            E2(wVar, this.y);
        }
        int iM2 = this.y.f3946e == -1 ? this.u.m() - s2(this.u.m()) : p2(this.u.i()) - this.u.i();
        if (iM2 > 0) {
            return Math.min(iVar.f3943b, iM2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable g1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f4950i = this.z;
        eVar.f4951j = this.G;
        eVar.f4952k = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f4937a) == null) {
            eVar.f4947f = 0;
        } else {
            eVar.f4948g = iArr;
            eVar.f4947f = iArr.length;
            eVar.f4949h = dVar.f4938b;
        }
        if (L() > 0) {
            eVar.f4943b = this.G ? o2() : n2();
            eVar.f4944c = j2();
            int i2 = this.s;
            eVar.f4945d = i2;
            eVar.f4946e = new int[i2];
            for (int i3 = 0; i3 < this.s; i3++) {
                if (this.G) {
                    iP = this.t[i3].l(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.u.i();
                        iP -= iM;
                    }
                } else {
                    iP = this.t[i3].p(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.u.m();
                        iP -= iM;
                    }
                }
                eVar.f4946e[i3] = iP;
            }
        } else {
            eVar.f4943b = -1;
            eVar.f4944c = -1;
            eVar.f4945d = 0;
        }
        return eVar;
    }

    public final int g2(int i2) {
        int iL = L();
        for (int i3 = 0; i3 < iL; i3++) {
            int iJ0 = j0(K(i3));
            if (iJ0 >= 0 && iJ0 < i2) {
                return iJ0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h(String str) {
        if (this.I == null) {
            super.h(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(int i2) {
        if (i2 == 0) {
            W1();
        }
    }

    public View h2(boolean z) {
        int iM = this.u.m();
        int i2 = this.u.i();
        View view = null;
        for (int iL = L() - 1; iL >= 0; iL--) {
            View viewK = K(iL);
            int iG = this.u.g(viewK);
            int iD = this.u.d(viewK);
            if (iD > iM && iG < i2) {
                if (iD <= i2 || !z) {
                    return viewK;
                }
                if (view == null) {
                    view = viewK;
                }
            }
        }
        return view;
    }

    public View i2(boolean z) {
        int iM = this.u.m();
        int i2 = this.u.i();
        int iL = L();
        View view = null;
        for (int i3 = 0; i3 < iL; i3++) {
            View viewK = K(i3);
            int iG = this.u.g(viewK);
            if (this.u.d(viewK) > iM && iG < i2) {
                if (iG >= iM || !z) {
                    return viewK;
                }
                if (view == null) {
                    view = viewK;
                }
            }
        }
        return view;
    }

    public int j2() {
        View viewH2 = this.A ? h2(true) : i2(true);
        if (viewH2 == null) {
            return -1;
        }
        return j0(viewH2);
    }

    public final int k2(int i2) {
        for (int iL = L() - 1; iL >= 0; iL--) {
            int iJ0 = j0(K(iL));
            if (iJ0 >= 0 && iJ0 < i2) {
                return iJ0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.w == 0;
    }

    public final void l2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
        int i2;
        int iP2 = p2(Integer.MIN_VALUE);
        if (iP2 != Integer.MIN_VALUE && (i2 = this.u.i() - iP2) > 0) {
            int i3 = i2 - (-J2(-i2, wVar, b0Var));
            if (!z || i3 <= 0) {
                return;
            }
            this.u.r(i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m() {
        return this.w == 1;
    }

    public final void m2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
        int iM;
        int iS2 = s2(Integer.MAX_VALUE);
        if (iS2 != Integer.MAX_VALUE && (iM = iS2 - this.u.m()) > 0) {
            int iJ2 = iM - J2(iM, wVar, b0Var);
            if (!z || iJ2 <= 0) {
                return;
            }
            this.u.r(-iJ2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean n(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    public int n2() {
        if (L() == 0) {
            return 0;
        }
        return j0(K(0));
    }

    public int o2() {
        int iL = L();
        if (iL == 0) {
            return 0;
        }
        return j0(K(iL - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i2, int i3, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.w != 0) {
            i2 = i3;
        }
        if (L() == 0 || i2 == 0) {
            return;
        }
        C2(i2, b0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.s) {
            this.O = new int[this.s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.s; i5++) {
            i iVar = this.y;
            if (iVar.f3945d == -1) {
                iL = iVar.f3947f;
                iP = this.t[i5].p(iL);
            } else {
                iL = this.t[i5].l(iVar.f3948g);
                iP = this.y.f3948g;
            }
            int i6 = iL - iP;
            if (i6 >= 0) {
                this.O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.y.a(b0Var); i7++) {
            cVar.a(this.y.f3944c, this.O[i7]);
            i iVar2 = this.y;
            iVar2.f3944c += iVar2.f3945d;
        }
    }

    public final int p2(int i2) {
        int iL = this.t[0].l(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int iL2 = this.t[i3].l(i2);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    public final int q2(int i2) {
        int iP = this.t[0].p(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int iP2 = this.t[i3].p(i2);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.b0 b0Var) {
        return Y1(b0Var);
    }

    public final int r2(int i2) {
        int iL = this.t[0].l(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int iL2 = this.t[i3].l(i2);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    public final int s2(int i2) {
        int iP = this.t[0].p(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int iP2 = this.t[i3].p(i2);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    public final f t2(i iVar) {
        int i2;
        int i3;
        int i4 = -1;
        if (B2(iVar.f3946e)) {
            i2 = this.s - 1;
            i3 = -1;
        } else {
            i2 = 0;
            i4 = this.s;
            i3 = 1;
        }
        f fVar = null;
        if (iVar.f3946e == 1) {
            int i5 = Integer.MAX_VALUE;
            int iM = this.u.m();
            while (i2 != i4) {
                f fVar2 = this.t[i2];
                int iL = fVar2.l(iM);
                if (iL < i5) {
                    fVar = fVar2;
                    i5 = iL;
                }
                i2 += i3;
            }
            return fVar;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = this.u.i();
        while (i2 != i4) {
            f fVar3 = this.t[i2];
            int iP = fVar3.p(i7);
            if (iP > i6) {
                fVar = fVar3;
                i6 = iP;
            }
            i2 += i3;
        }
        return fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.b0 b0Var) {
        return Y1(b0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.o2()
            goto Ld
        L9:
            int r0 = r6.n2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.n2()
            goto L51
        L4d:
            int r7 = r6.o2()
        L51:
            if (r3 > r7) goto L56
            r6.w1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.b0 b0Var) {
        return Z1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v0() {
        return this.F != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View v2() {
        /*
            r12 = this;
            int r0 = r12.L()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.x2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.K(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4935e
            int r9 = r9.f4957e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4935e
            boolean r9 = r12.X1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4935e
            int r9 = r9.f4957e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f4936f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.K(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            a.y.e.l r10 = r12.u
            int r10 = r10.d(r7)
            a.y.e.l r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            a.y.e.l r10 = r12.u
            int r10 = r10.g(r7)
            a.y.e.l r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f4935e
            int r8 = r8.f4957e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f4935e
            int r9 = r9.f4957e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.v2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.b0 b0Var) {
        return a2(b0Var);
    }

    public void w2() {
        this.E.b();
        w1();
    }

    public boolean x2() {
        return b0() == 1;
    }

    public final void y2(View view, int i2, int i3, boolean z) {
        k(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iV2 = V2(i2, i4 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i5 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iV22 = V2(i3, i5 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? L1(view, iV2, iV22, cVar) : J1(view, iV2, iV22, cVar)) {
            view.measure(iV2, iV22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return J2(i2, wVar, b0Var);
    }

    public final void z2(View view, c cVar, boolean z) {
        int iM;
        int iM2;
        if (cVar.f4936f) {
            if (this.w != 1) {
                y2(view, RecyclerView.p.M(q0(), r0(), g0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
                return;
            }
            iM = this.J;
        } else {
            if (this.w != 1) {
                iM = RecyclerView.p.M(q0(), r0(), g0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                iM2 = RecyclerView.p.M(this.x, Z(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
                y2(view, iM, iM2, z);
            }
            iM = RecyclerView.p.M(this.x, r0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        iM2 = RecyclerView.p.M(Y(), Z(), i0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        y2(view, iM, iM2, z);
    }
}
