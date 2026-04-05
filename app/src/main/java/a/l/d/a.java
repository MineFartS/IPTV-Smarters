package a.l.d;

import a.l.d.n;
import a.l.d.y;
import a.p.f;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends y implements n.o {
    public final n t;
    public boolean u;
    public int v;

    public a(n nVar) {
        super(nVar.r0(), nVar.u0() != null ? nVar.u0().f().getClassLoader() : null);
        this.v = -1;
        this.t = nVar;
    }

    public static boolean I(y.a aVar) {
        Fragment fragment = aVar.f2508b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    public void A(String str, PrintWriter printWriter) {
        B(str, printWriter, true);
    }

    public void B(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2502k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.f2499h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2499h));
            }
            if (this.f2495d != 0 || this.f2496e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2495d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2496e));
            }
            if (this.f2497f != 0 || this.f2498g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2497f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2498g));
            }
            if (this.f2503l != 0 || this.f2504m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2503l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2504m);
            }
            if (this.f2505n != 0 || this.f2506o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2505n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2506o);
            }
        }
        if (this.f2494c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f2494c.size();
        for (int i2 = 0; i2 < size; i2++) {
            y.a aVar = this.f2494c.get(i2);
            switch (aVar.f2507a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f2507a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f2508b);
            if (z) {
                if (aVar.f2509c != 0 || aVar.f2510d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2509c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2510d));
                }
                if (aVar.f2511e != 0 || aVar.f2512f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2511e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2512f));
                }
            }
        }
    }

    public void C() {
        int size = this.f2494c.size();
        for (int i2 = 0; i2 < size; i2++) {
            y.a aVar = this.f2494c.get(i2);
            Fragment fragment = aVar.f2508b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f2499h);
                fragment.setSharedElementNames(this.p, this.q);
            }
            switch (aVar.f2507a) {
                case 1:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.o1(fragment, false);
                    this.t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2507a);
                case 3:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.f1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.D0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.o1(fragment, false);
                    this.t.s1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.y(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.o1(fragment, false);
                    this.t.l(fragment);
                    break;
                case 8:
                    this.t.q1(fragment);
                    break;
                case 9:
                    this.t.q1(null);
                    break;
                case 10:
                    this.t.p1(fragment, aVar.f2514h);
                    break;
            }
            if (!this.r && aVar.f2507a != 1 && fragment != null && !n.f2403b) {
                this.t.Q0(fragment);
            }
        }
        if (this.r || n.f2403b) {
            return;
        }
        n nVar = this.t;
        nVar.R0(nVar.s, true);
    }

    public void D(boolean z) {
        for (int size = this.f2494c.size() - 1; size >= 0; size--) {
            y.a aVar = this.f2494c.get(size);
            Fragment fragment = aVar.f2508b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(n.k1(this.f2499h));
                fragment.setSharedElementNames(this.q, this.p);
            }
            switch (aVar.f2507a) {
                case 1:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.o1(fragment, true);
                    this.t.f1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2507a);
                case 3:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.g(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.s1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.o1(fragment, true);
                    this.t.D0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.l(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f2509c, aVar.f2510d, aVar.f2511e, aVar.f2512f);
                    this.t.o1(fragment, true);
                    this.t.y(fragment);
                    break;
                case 8:
                    this.t.q1(null);
                    break;
                case 9:
                    this.t.q1(fragment);
                    break;
                case 10:
                    this.t.p1(fragment, aVar.f2513g);
                    break;
            }
            if (!this.r && aVar.f2507a != 3 && fragment != null && !n.f2403b) {
                this.t.Q0(fragment);
            }
        }
        if (this.r || !z || n.f2403b) {
            return;
        }
        n nVar = this.t;
        nVar.R0(nVar.s, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.fragment.app.Fragment E(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<a.l.d.y$a> r5 = r0.f2494c
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<a.l.d.y$a> r5 = r0.f2494c
            java.lang.Object r5 = r5.get(r4)
            a.l.d.y$a r5 = (a.l.d.y.a) r5
            int r6 = r5.f2507a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<a.l.d.y$a> r6 = r0.f2494c
            a.l.d.y$a r7 = new a.l.d.y$a
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f2508b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f2508b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f2508b
            if (r5 != r3) goto Lb7
            java.util.ArrayList<a.l.d.y$a> r3 = r0.f2494c
            a.l.d.y$a r6 = new a.l.d.y$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f2508b
            int r9 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = 1
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<a.l.d.y$a> r3 = r0.f2494c
            a.l.d.y$a r15 = new a.l.d.y$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            a.l.d.y$a r15 = new a.l.d.y$a
            r15.<init>(r10, r14)
            int r2 = r5.f2509c
            r15.f2509c = r2
            int r2 = r5.f2511e
            r15.f2511e = r2
            int r2 = r5.f2510d
            r15.f2510d = r2
            int r2 = r5.f2512f
            r15.f2512f = r2
            java.util.ArrayList<a.l.d.y$a> r2 = r0.f2494c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<a.l.d.y$a> r2 = r0.f2494c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f2507a = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f2508b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.d.a.E(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String F() {
        return this.f2502k;
    }

    public boolean G(int i2) {
        int size = this.f2494c.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f2494c.get(i3).f2508b;
            int i4 = fragment != null ? fragment.mContainerId : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean H(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f2494c.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.f2494c.get(i5).f2508b;
            int i6 = fragment != null ? fragment.mContainerId : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.f2494c.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.f2494c.get(i8).f2508b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    public boolean J() {
        for (int i2 = 0; i2 < this.f2494c.size(); i2++) {
            if (I(this.f2494c.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void K() {
        if (this.s != null) {
            for (int i2 = 0; i2 < this.s.size(); i2++) {
                this.s.get(i2).run();
            }
            this.s = null;
        }
    }

    public void L(Fragment.l lVar) {
        for (int i2 = 0; i2 < this.f2494c.size(); i2++) {
            y.a aVar = this.f2494c.get(i2);
            if (I(aVar)) {
                aVar.f2508b.setOnStartEnterTransitionListener(lVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.fragment.app.Fragment M(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<a.l.d.y$a> r0 = r5.f2494c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<a.l.d.y$a> r2 = r5.f2494c
            java.lang.Object r2 = r2.get(r0)
            a.l.d.y$a r2 = (a.l.d.y.a) r2
            int r3 = r2.f2507a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            a.p.f$c r3 = r2.f2513g
            r2.f2514h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f2508b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f2508b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f2508b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.d.a.M(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // a.l.d.n.o
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.G0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2500i) {
            return true;
        }
        this.t.e(this);
        return true;
    }

    @Override // a.l.d.y
    public int j() {
        return z(false);
    }

    @Override // a.l.d.y
    public int k() {
        return z(true);
    }

    @Override // a.l.d.y
    public void l() {
        o();
        this.t.c0(this, false);
    }

    @Override // a.l.d.y
    public void m() {
        o();
        this.t.c0(this, true);
    }

    @Override // a.l.d.y
    public y n(Fragment fragment) {
        n nVar = fragment.mFragmentManager;
        if (nVar == null || nVar == this.t) {
            return super.n(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // a.l.d.y
    public void p(int i2, Fragment fragment, String str, int i3) {
        super.p(i2, fragment, str, i3);
        fragment.mFragmentManager = this.t;
    }

    @Override // a.l.d.y
    public y q(Fragment fragment) {
        n nVar = fragment.mFragmentManager;
        if (nVar == null || nVar == this.t) {
            return super.q(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.f2502k != null) {
            sb.append(" ");
            sb.append(this.f2502k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // a.l.d.y
    public y v(Fragment fragment, f.c cVar) {
        if (fragment.mFragmentManager != this.t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.t);
        }
        if (cVar == f.c.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        }
        if (cVar != f.c.DESTROYED) {
            return super.v(fragment, cVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // a.l.d.y
    public y w(Fragment fragment) {
        n nVar;
        if (fragment == null || (nVar = fragment.mFragmentManager) == null || nVar == this.t) {
            return super.w(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void y(int i2) {
        if (this.f2500i) {
            if (n.G0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f2494c.size();
            for (int i3 = 0; i3 < size; i3++) {
                y.a aVar = this.f2494c.get(i3);
                Fragment fragment = aVar.f2508b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (n.G0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f2508b + " to " + aVar.f2508b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public int z(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (n.G0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new d0("FragmentManager"));
            A("  ", printWriter);
            printWriter.close();
        }
        this.u = true;
        this.v = this.f2500i ? this.t.j() : -1;
        this.t.Z(this, z);
        return this.v;
    }
}
