package a.l.d;

import a.a.e.e;
import a.l.d.f;
import a.l.d.y;
import a.l.d.z;
import a.p.f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import com.amazonaws.services.s3.internal.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f2402a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2403b = true;
    public a.a.e.c<Intent> B;
    public a.a.e.c<a.a.e.e> C;
    public a.a.e.c<String[]> D;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList<a.l.d.a> K;
    public ArrayList<Boolean> L;
    public ArrayList<Fragment> M;
    public ArrayList<q> N;
    public a.l.d.q O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2405d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<a.l.d.a> f2407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<Fragment> f2408g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OnBackPressedDispatcher f2410i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<InterfaceC0054n> f2415n;
    public a.l.d.k<?> t;
    public a.l.d.g u;
    public Fragment v;
    public Fragment w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<o> f2404c = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f2406e = new x();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a.l.d.l f2409h = new a.l.d.l(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a.a.b f2411j = new c(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f2412k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, Bundle> f2413l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<String, ?> f2414m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map<Fragment, HashSet<a.i.n.b>> f2416o = Collections.synchronizedMap(new HashMap());
    public final z.g p = new d();
    public final a.l.d.m q = new a.l.d.m(this);
    public final CopyOnWriteArrayList<r> r = new CopyOnWriteArrayList<>();
    public int s = -1;
    public a.l.d.j x = null;
    public a.l.d.j y = new e();
    public f0 z = null;
    public f0 A = new f();
    public ArrayDeque<m> E = new ArrayDeque<>();
    public Runnable P = new g();

    public class a implements a.a.e.b<a.a.e.a> {
        public a() {
        }

        @Override // a.a.e.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(a.a.e.a aVar) {
            m mVarPollFirst = n.this.E.pollFirst();
            if (mVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = mVarPollFirst.f2431b;
            int i2 = mVarPollFirst.f2432c;
            Fragment fragmentI = n.this.f2406e.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i2, aVar.c(), aVar.b());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public class b implements a.a.e.b<Map<String, Boolean>> {
        public b() {
        }

        @Override // a.a.e.b
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            m mVarPollFirst = n.this.E.pollFirst();
            if (mVarPollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = mVarPollFirst.f2431b;
                int i3 = mVarPollFirst.f2432c;
                Fragment fragmentI = n.this.f2406e.i(str);
                if (fragmentI != null) {
                    fragmentI.onRequestPermissionsResult(i3, strArr, iArr);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class c extends a.a.b {
        public c(boolean z) {
            super(z);
        }

        @Override // a.a.b
        public void b() {
            n.this.C0();
        }
    }

    public class d implements z.g {
        public d() {
        }

        @Override // a.l.d.z.g
        public void a(Fragment fragment, a.i.n.b bVar) {
            if (bVar.c()) {
                return;
            }
            n.this.e1(fragment, bVar);
        }

        @Override // a.l.d.z.g
        public void b(Fragment fragment, a.i.n.b bVar) {
            n.this.f(fragment, bVar);
        }
    }

    public class e extends a.l.d.j {
        public e() {
        }

        @Override // a.l.d.j
        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.u0().b(n.this.u0().f(), str, null);
        }
    }

    public class f implements f0 {
        public f() {
        }

        @Override // a.l.d.f0
        public e0 a(ViewGroup viewGroup) {
            return new a.l.d.c(viewGroup);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.b0(true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Fragment f2426d;

        public h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2424b = viewGroup;
            this.f2425c = view;
            this.f2426d = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2424b.endViewTransition(this.f2425c);
            animator.removeListener(this);
            Fragment fragment = this.f2426d;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    public class i implements r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f2428b;

        public i(Fragment fragment) {
            this.f2428b = fragment;
        }

        @Override // a.l.d.r
        public void a(n nVar, Fragment fragment) {
            this.f2428b.onAttachFragment(fragment);
        }
    }

    public class j implements a.a.e.b<a.a.e.a> {
        public j() {
        }

        @Override // a.a.e.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(a.a.e.a aVar) {
            m mVarPollFirst = n.this.E.pollFirst();
            if (mVarPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = mVarPollFirst.f2431b;
            int i2 = mVarPollFirst.f2432c;
            Fragment fragmentI = n.this.f2406e.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i2, aVar.c(), aVar.b());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public static class k extends a.a.e.f.a<a.a.e.e, a.a.e.a> {
        @Override // a.a.e.f.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, a.a.e.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentB = eVar.b();
            if (intentB != null && (bundleExtra = intentB.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentB.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentB.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.b(eVar.e()).b(null).c(eVar.d(), eVar.c()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (n.G0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // a.a.e.f.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a.a.e.a c(int i2, Intent intent) {
            return new a.a.e.a(i2, intent);
        }
    }

    public static abstract class l {
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2432c;

        public class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i2) {
                return new m[i2];
            }
        }

        public m(Parcel parcel) {
            this.f2431b = parcel.readString();
            this.f2432c = parcel.readInt();
        }

        public m(String str, int i2) {
            this.f2431b = str;
            this.f2432c = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f2431b);
            parcel.writeInt(this.f2432c);
        }
    }

    /* JADX INFO: renamed from: a.l.d.n$n, reason: collision with other inner class name */
    public interface InterfaceC0054n {
        void a();
    }

    public interface o {
        boolean a(ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2435c;

        public p(String str, int i2, int i3) {
            this.f2433a = str;
            this.f2434b = i2;
            this.f2435c = i3;
        }

        @Override // a.l.d.n.o
        public boolean a(ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.w;
            if (fragment == null || this.f2434b >= 0 || this.f2433a != null || !fragment.getChildFragmentManager().Z0()) {
                return n.this.b1(arrayList, arrayList2, this.f2433a, this.f2434b, this.f2435c);
            }
            return false;
        }
    }

    public static class q implements Fragment.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.l.d.a f2438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2439c;

        public q(a.l.d.a aVar, boolean z) {
            this.f2437a = z;
            this.f2438b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void a() {
            this.f2439c++;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void b() {
            int i2 = this.f2439c - 1;
            this.f2439c = i2;
            if (i2 != 0) {
                return;
            }
            this.f2438b.t.n1();
        }

        public void c() {
            a.l.d.a aVar = this.f2438b;
            aVar.t.u(aVar, this.f2437a, false, false);
        }

        public void d() {
            boolean z = this.f2439c > 0;
            for (Fragment fragment : this.f2438b.t.t0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            a.l.d.a aVar = this.f2438b;
            aVar.t.u(aVar, this.f2437a, !z, true);
        }

        public boolean e() {
            return this.f2439c == 0;
        }
    }

    public static Fragment A0(View view) {
        Object tag = view.getTag(a.l.b.f2218a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean G0(int i2) {
        return f2402a || Log.isLoggable("FragmentManager", i2);
    }

    public static void d0(ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            a.l.d.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.y(-1);
                aVar.D(i2 == i3 + (-1));
            } else {
                aVar.y(1);
                aVar.C();
            }
            i2++;
        }
    }

    public static int k1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public void A() {
        this.G = false;
        this.H = false;
        this.O.o(false);
        T(0);
    }

    public void B(Configuration configuration) {
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public a.p.x B0(Fragment fragment) {
        return this.O.l(fragment);
    }

    public boolean C(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void C0() {
        b0(true);
        if (this.f2411j.c()) {
            Z0();
        } else {
            this.f2410i.c();
        }
    }

    public void D() {
        this.G = false;
        this.H = false;
        this.O.o(false);
        T(1);
    }

    public void D0(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        r1(fragment);
    }

    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.s < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment != null && I0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f2408g != null) {
            for (int i2 = 0; i2 < this.f2408g.size(); i2++) {
                Fragment fragment2 = this.f2408g.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2408g = arrayList;
        return z;
    }

    public void E0(Fragment fragment) {
        if (fragment.mAdded && H0(fragment)) {
            this.F = true;
        }
    }

    public void F() {
        this.I = true;
        b0(true);
        Y();
        T(-1);
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.f2410i != null) {
            this.f2411j.d();
            this.f2410i = null;
        }
        a.a.e.c<Intent> cVar = this.B;
        if (cVar != null) {
            cVar.c();
            this.C.c();
            this.D.c();
        }
    }

    public boolean F0() {
        return this.I;
    }

    public void G() {
        T(1);
    }

    public void H() {
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public final boolean H0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.o();
    }

    public void I(boolean z) {
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public boolean I0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void J(Fragment fragment) {
        Iterator<r> it = this.r.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public boolean J0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.mFragmentManager;
        return fragment.equals(nVar.y0()) && J0(nVar.v);
    }

    public boolean K(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean K0(int i2) {
        return this.s >= i2;
    }

    public void L(Menu menu) {
        if (this.s < 1) {
            return;
        }
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public boolean L0() {
        return this.G || this.H;
    }

    public final void M(Fragment fragment) {
        if (fragment == null || !fragment.equals(g0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public void M0(Fragment fragment, String[] strArr, int i2) {
        if (this.D == null) {
            this.t.k(fragment, strArr, i2);
            return;
        }
        this.E.addLast(new m(fragment.mWho, i2));
        this.D.a(strArr);
    }

    public void N() {
        T(5);
    }

    public void N0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.B == null) {
            this.t.n(fragment, intent, i2, bundle);
            return;
        }
        this.E.addLast(new m(fragment.mWho, i2));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.B.a(intent);
    }

    public void O(boolean z) {
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public void O0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        Intent intent2;
        if (this.C == null) {
            this.t.o(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (G0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        a.a.e.e eVarA = new e.b(intentSender).b(intent2).c(i4, i3).a();
        this.E.addLast(new m(fragment.mWho, i2));
        if (G0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.C.a(eVarA);
    }

    public boolean P(Menu menu) {
        boolean z = false;
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment != null && I0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void P0(a.f.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragmentT = bVar.t(i2);
            if (!fragmentT.mAdded) {
                View viewRequireView = fragmentT.requireView();
                fragmentT.mPostponedAlpha = viewRequireView.getAlpha();
                viewRequireView.setAlpha(0.0f);
            }
        }
    }

    public void Q() {
        v1();
        M(this.w);
    }

    public void Q0(Fragment fragment) {
        if (!this.f2406e.c(fragment.mWho)) {
            if (G0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.s + "since it is not added to " + this);
                return;
            }
            return;
        }
        S0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f2 = fragment.mPostponedAlpha;
            if (f2 > 0.0f) {
                view.setAlpha(f2);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            f.d dVarC = a.l.d.f.c(this.t.f(), fragment, true, fragment.getPopDirection());
            if (dVarC != null) {
                Animation animation = dVarC.f2377a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    dVarC.f2378b.setTarget(fragment.mView);
                    dVarC.f2378b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            v(fragment);
        }
    }

    public void R() {
        this.G = false;
        this.H = false;
        this.O.o(false);
        T(7);
    }

    public void R0(int i2, boolean z) {
        a.l.d.k<?> kVar;
        if (this.t == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.s) {
            this.s = i2;
            if (f2403b) {
                this.f2406e.r();
            } else {
                Iterator<Fragment> it = this.f2406e.n().iterator();
                while (it.hasNext()) {
                    Q0(it.next());
                }
                for (v vVar : this.f2406e.k()) {
                    Fragment fragmentK = vVar.k();
                    if (!fragmentK.mIsNewlyAdded) {
                        Q0(fragmentK);
                    }
                    if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                        this.f2406e.q(vVar);
                    }
                }
            }
            t1();
            if (this.F && (kVar = this.t) != null && this.s == 7) {
                kVar.p();
                this.F = false;
            }
        }
    }

    public void S() {
        this.G = false;
        this.H = false;
        this.O.o(false);
        T(5);
    }

    public void S0(Fragment fragment) {
        T0(fragment, this.s);
    }

    public final void T(int i2) {
        try {
            this.f2405d = true;
            this.f2406e.d(i2);
            R0(i2, false);
            if (f2403b) {
                Iterator<e0> it = s().iterator();
                while (it.hasNext()) {
                    it.next().j();
                }
            }
            this.f2405d = false;
            b0(true);
        } catch (Throwable th) {
            this.f2405d = false;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.d.n.T0(androidx.fragment.app.Fragment, int):void");
    }

    public void U() {
        this.H = true;
        this.O.o(true);
        T(4);
    }

    public void U0() {
        if (this.t == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.O.o(false);
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void V() {
        T(2);
    }

    public void V0(a.l.d.h hVar) {
        View view;
        for (v vVar : this.f2406e.k()) {
            Fragment fragmentK = vVar.k();
            if (fragmentK.mContainerId == hVar.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = hVar;
                vVar.b();
            }
        }
    }

    public final void W() {
        if (this.J) {
            this.J = false;
            t1();
        }
    }

    public void W0(v vVar) {
        Fragment fragmentK = vVar.k();
        if (fragmentK.mDeferStart) {
            if (this.f2405d) {
                this.J = true;
                return;
            }
            fragmentK.mDeferStart = false;
            if (f2403b) {
                vVar.m();
            } else {
                S0(fragmentK);
            }
        }
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2406e.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2408g;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment = this.f2408g.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<a.l.d.a> arrayList2 = this.f2407f;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a.l.d.a aVar = this.f2407f.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.A(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2412k.get());
        synchronized (this.f2404c) {
            int size3 = this.f2404c.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    o oVar = this.f2404c.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(oVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public void X0(int i2, int i3) {
        if (i2 >= 0) {
            Z(new p(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public final void Y() {
        if (f2403b) {
            Iterator<e0> it = s().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
        } else {
            if (this.f2416o.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f2416o.keySet()) {
                n(fragment);
                S0(fragment);
            }
        }
    }

    public void Y0(String str, int i2) {
        Z(new p(str, -1, i2), false);
    }

    public void Z(o oVar, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (!this.I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            p();
        }
        synchronized (this.f2404c) {
            if (this.t == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f2404c.add(oVar);
                n1();
            }
        }
    }

    public boolean Z0() {
        return a1(null, -1, 0);
    }

    public final void a0(boolean z) {
        if (this.f2405d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.t == null) {
            if (!this.I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.t.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            p();
        }
        if (this.K == null) {
            this.K = new ArrayList<>();
            this.L = new ArrayList<>();
        }
        this.f2405d = true;
        try {
            f0(null, null);
        } finally {
            this.f2405d = false;
        }
    }

    public final boolean a1(String str, int i2, int i3) {
        b0(false);
        a0(true);
        Fragment fragment = this.w;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().Z0()) {
            return true;
        }
        boolean zB1 = b1(this.K, this.L, str, i2, i3);
        if (zB1) {
            this.f2405d = true;
            try {
                g1(this.K, this.L);
            } finally {
                q();
            }
        }
        v1();
        W();
        this.f2406e.b();
        return zB1;
    }

    public boolean b0(boolean z) {
        a0(z);
        boolean z2 = false;
        while (l0(this.K, this.L)) {
            this.f2405d = true;
            try {
                g1(this.K, this.L);
                q();
                z2 = true;
            } catch (Throwable th) {
                q();
                throw th;
            }
        }
        v1();
        W();
        this.f2406e.b();
        return z2;
    }

    public boolean b1(ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<a.l.d.a> arrayList3 = this.f2407f;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2407f.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a.l.d.a aVar = this.f2407f.get(size2);
                    if ((str != null && str.equals(aVar.F())) || (i2 >= 0 && i2 == aVar.v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a.l.d.a aVar2 = this.f2407f.get(size2);
                        if (str == null || !str.equals(aVar2.F())) {
                            if (i2 < 0 || i2 != aVar2.v) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f2407f.size() - 1) {
                return false;
            }
            for (int size3 = this.f2407f.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f2407f.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void c0(o oVar, boolean z) {
        if (z && (this.t == null || this.I)) {
            return;
        }
        a0(z);
        if (oVar.a(this.K, this.L)) {
            this.f2405d = true;
            try {
                g1(this.K, this.L);
            } finally {
                q();
            }
        }
        v1();
        W();
        this.f2406e.b();
    }

    public final int c1(ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, a.f.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            a.l.d.a aVar = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.J() && !aVar.H(arrayList, i5 + 1, i3)) {
                if (this.N == null) {
                    this.N = new ArrayList<>();
                }
                q qVar = new q(aVar, zBooleanValue);
                this.N.add(qVar);
                aVar.L(qVar);
                if (zBooleanValue) {
                    aVar.C();
                } else {
                    aVar.D(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                d(bVar);
            }
        }
        return i4;
    }

    public final void d(a.f.b<Fragment> bVar) {
        int i2 = this.s;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 5);
        for (Fragment fragment : this.f2406e.n()) {
            if (fragment.mState < iMin) {
                T0(fragment, iMin);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    bVar.add(fragment);
                }
            }
        }
    }

    public void d1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            u1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void e(a.l.d.a aVar) {
        if (this.f2407f == null) {
            this.f2407f = new ArrayList<>();
        }
        this.f2407f.add(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    public final void e0(ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ?? r1;
        boolean z;
        int i4;
        int i5;
        ArrayList<Boolean> arrayList3;
        int i6;
        int iC1;
        ArrayList<Boolean> arrayList4;
        int i7;
        boolean z2;
        boolean z3 = arrayList.get(i2).r;
        ArrayList<Fragment> arrayList5 = this.M;
        if (arrayList5 == null) {
            this.M = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.M.addAll(this.f2406e.n());
        Fragment fragmentY0 = y0();
        boolean z4 = false;
        for (int i8 = i2; i8 < i3; i8++) {
            a.l.d.a aVar = arrayList.get(i8);
            fragmentY0 = !arrayList2.get(i8).booleanValue() ? aVar.E(this.M, fragmentY0) : aVar.M(this.M, fragmentY0);
            z4 = z4 || aVar.f2500i;
        }
        this.M.clear();
        if (z3 || this.s < 1) {
            r1 = 1;
        } else if (f2403b) {
            for (int i9 = i2; i9 < i3; i9++) {
                Iterator<y.a> it = arrayList.get(i9).f2494c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f2508b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f2406e.p(w(fragment));
                    }
                }
            }
            r1 = 1;
        } else {
            r1 = 1;
            z.B(this.t.f(), this.u, arrayList, arrayList2, i2, i3, false, this.p);
        }
        d0(arrayList, arrayList2, i2, i3);
        if (f2403b) {
            boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
            for (int i10 = i2; i10 < i3; i10++) {
                a.l.d.a aVar2 = arrayList.get(i10);
                if (zBooleanValue) {
                    for (int size = aVar2.f2494c.size() - r1; size >= 0; size--) {
                        Fragment fragment2 = aVar2.f2494c.get(size).f2508b;
                        if (fragment2 != null) {
                            w(fragment2).m();
                        }
                    }
                } else {
                    Iterator<y.a> it2 = aVar2.f2494c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = it2.next().f2508b;
                        if (fragment3 != null) {
                            w(fragment3).m();
                        }
                    }
                }
            }
            R0(this.s, r1);
            for (e0 e0Var : t(arrayList, i2, i3)) {
                e0Var.r(zBooleanValue);
                e0Var.p();
                e0Var.g();
            }
            i7 = i3;
            arrayList4 = arrayList2;
        } else {
            if (z3) {
                a.f.b bVar = new a.f.b();
                d(bVar);
                i6 = 1;
                z = z3;
                i4 = i3;
                i5 = i2;
                arrayList3 = arrayList2;
                iC1 = c1(arrayList, arrayList2, i2, i3, bVar);
                P0(bVar);
            } else {
                z = z3;
                i4 = i3;
                i5 = i2;
                arrayList3 = arrayList2;
                i6 = 1;
                iC1 = i4;
            }
            if (iC1 == i5 || !z) {
                arrayList4 = arrayList3;
                i7 = i4;
            } else {
                if (this.s >= i6) {
                    arrayList4 = arrayList3;
                    int i11 = iC1;
                    i7 = i4;
                    z2 = true;
                    z.B(this.t.f(), this.u, arrayList, arrayList2, i2, i11, true, this.p);
                } else {
                    arrayList4 = arrayList3;
                    i7 = i4;
                    z2 = true;
                }
                R0(this.s, z2);
            }
        }
        for (int i12 = i2; i12 < i7; i12++) {
            a.l.d.a aVar3 = arrayList.get(i12);
            if (arrayList4.get(i12).booleanValue() && aVar3.v >= 0) {
                aVar3.v = -1;
            }
            aVar3.K();
        }
        if (z4) {
            i1();
        }
    }

    public void e1(Fragment fragment, a.i.n.b bVar) {
        HashSet<a.i.n.b> hashSet = this.f2416o.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f2416o.remove(fragment);
            if (fragment.mState < 5) {
                x(fragment);
                S0(fragment);
            }
        }
    }

    public void f(Fragment fragment, a.i.n.b bVar) {
        if (this.f2416o.get(fragment) == null) {
            this.f2416o.put(fragment, new HashSet<>());
        }
        this.f2416o.get(fragment).add(bVar);
    }

    public final void f0(ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<q> arrayList3 = this.N;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            q qVar = this.N.get(i2);
            if (arrayList == null || qVar.f2437a || (iIndexOf2 = arrayList.indexOf(qVar.f2438b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf2).booleanValue()) {
                if (qVar.e() || (arrayList != null && qVar.f2438b.H(arrayList, 0, arrayList.size()))) {
                    this.N.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || qVar.f2437a || (iIndexOf = arrayList.indexOf(qVar.f2438b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                        qVar.d();
                    }
                }
                i2++;
            } else {
                this.N.remove(i2);
                i2--;
                size--;
            }
            qVar.c();
            i2++;
        }
    }

    public void f1(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f2406e.s(fragment);
            if (H0(fragment)) {
                this.F = true;
            }
            fragment.mRemoving = true;
            r1(fragment);
        }
    }

    public v g(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        v vVarW = w(fragment);
        fragment.mFragmentManager = this;
        this.f2406e.p(vVarW);
        if (!fragment.mDetached) {
            this.f2406e.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (H0(fragment)) {
                this.F = true;
            }
        }
        return vVarW;
    }

    public Fragment g0(String str) {
        return this.f2406e.f(str);
    }

    public final void g1(ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        f0(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).r) {
                if (i3 != i2) {
                    e0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                        i3++;
                    }
                }
                e0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            e0(arrayList, arrayList2, i3, size);
        }
    }

    public void h(r rVar) {
        this.r.add(rVar);
    }

    public Fragment h0(int i2) {
        return this.f2406e.g(i2);
    }

    public void h1(Fragment fragment) {
        this.O.n(fragment);
    }

    public void i(Fragment fragment) {
        this.O.f(fragment);
    }

    public Fragment i0(String str) {
        return this.f2406e.h(str);
    }

    public final void i1() {
        if (this.f2415n != null) {
            for (int i2 = 0; i2 < this.f2415n.size(); i2++) {
                this.f2415n.get(i2).a();
            }
        }
    }

    public int j() {
        return this.f2412k.getAndIncrement();
    }

    public Fragment j0(String str) {
        return this.f2406e.i(str);
    }

    public void j1(Parcelable parcelable) {
        v vVar;
        if (parcelable == null) {
            return;
        }
        a.l.d.p pVar = (a.l.d.p) parcelable;
        if (pVar.f2440b == null) {
            return;
        }
        this.f2406e.t();
        for (u uVar : pVar.f2440b) {
            if (uVar != null) {
                Fragment fragmentH = this.O.h(uVar.f2462c);
                if (fragmentH != null) {
                    if (G0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentH);
                    }
                    vVar = new v(this.q, this.f2406e, fragmentH, uVar);
                } else {
                    vVar = new v(this.q, this.f2406e, this.t.f().getClassLoader(), r0(), uVar);
                }
                Fragment fragmentK = vVar.k();
                fragmentK.mFragmentManager = this;
                if (G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                vVar.o(this.t.f().getClassLoader());
                this.f2406e.p(vVar);
                vVar.u(this.s);
            }
        }
        for (Fragment fragment : this.O.k()) {
            if (!this.f2406e.c(fragment.mWho)) {
                if (G0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + pVar.f2440b);
                }
                this.O.n(fragment);
                fragment.mFragmentManager = this;
                v vVar2 = new v(this.q, this.f2406e, fragment);
                vVar2.u(1);
                vVar2.m();
                fragment.mRemoving = true;
                vVar2.m();
            }
        }
        this.f2406e.u(pVar.f2441c);
        if (pVar.f2442d != null) {
            this.f2407f = new ArrayList<>(pVar.f2442d.length);
            int i2 = 0;
            while (true) {
                a.l.d.b[] bVarArr = pVar.f2442d;
                if (i2 >= bVarArr.length) {
                    break;
                }
                a.l.d.a aVarB = bVarArr[i2].b(this);
                if (G0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + aVarB.v + "): " + aVarB);
                    PrintWriter printWriter = new PrintWriter(new d0("FragmentManager"));
                    aVarB.B("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2407f.add(aVarB);
                i2++;
            }
        } else {
            this.f2407f = null;
        }
        this.f2412k.set(pVar.f2443e);
        String str = pVar.f2444f;
        if (str != null) {
            Fragment fragmentG0 = g0(str);
            this.w = fragmentG0;
            M(fragmentG0);
        }
        ArrayList<String> arrayList = pVar.f2445g;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Bundle bundle = pVar.f2446h.get(i3);
                bundle.setClassLoader(this.t.f().getClassLoader());
                this.f2413l.put(arrayList.get(i3), bundle);
            }
        }
        this.E = new ArrayDeque<>(pVar.f2447i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(a.l.d.k<?> r3, a.l.d.g r4, androidx.fragment.app.Fragment r5) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.d.n.k(a.l.d.k, a.l.d.g, androidx.fragment.app.Fragment):void");
    }

    public final void k0() {
        if (f2403b) {
            Iterator<e0> it = s().iterator();
            while (it.hasNext()) {
                it.next().k();
            }
        } else if (this.N != null) {
            while (!this.N.isEmpty()) {
                this.N.remove(0).d();
            }
        }
    }

    public void l(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f2406e.a(fragment);
            if (G0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (H0(fragment)) {
                this.F = true;
            }
        }
    }

    public final boolean l0(ArrayList<a.l.d.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2404c) {
            if (this.f2404c.isEmpty()) {
                return false;
            }
            int size = this.f2404c.size();
            boolean zA = false;
            for (int i2 = 0; i2 < size; i2++) {
                zA |= this.f2404c.get(i2).a(arrayList, arrayList2);
            }
            this.f2404c.clear();
            this.t.g().removeCallbacks(this.P);
            return zA;
        }
    }

    public Parcelable l1() {
        int size;
        k0();
        Y();
        b0(true);
        this.G = true;
        this.O.o(true);
        ArrayList<u> arrayListV = this.f2406e.v();
        a.l.d.b[] bVarArr = null;
        if (arrayListV.isEmpty()) {
            if (G0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> arrayListW = this.f2406e.w();
        ArrayList<a.l.d.a> arrayList = this.f2407f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new a.l.d.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new a.l.d.b(this.f2407f.get(i2));
                if (G0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f2407f.get(i2));
                }
            }
        }
        a.l.d.p pVar = new a.l.d.p();
        pVar.f2440b = arrayListV;
        pVar.f2441c = arrayListW;
        pVar.f2442d = bVarArr;
        pVar.f2443e = this.f2412k.get();
        Fragment fragment = this.w;
        if (fragment != null) {
            pVar.f2444f = fragment.mWho;
        }
        pVar.f2445g.addAll(this.f2413l.keySet());
        pVar.f2446h.addAll(this.f2413l.values());
        pVar.f2447i = new ArrayList<>(this.E);
        return pVar;
    }

    public y m() {
        return new a.l.d.a(this);
    }

    public int m0() {
        ArrayList<a.l.d.a> arrayList = this.f2407f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public Fragment.m m1(Fragment fragment) {
        v vVarM = this.f2406e.m(fragment.mWho);
        if (vVarM == null || !vVarM.k().equals(fragment)) {
            u1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return vVarM.r();
    }

    public final void n(Fragment fragment) {
        HashSet<a.i.n.b> hashSet = this.f2416o.get(fragment);
        if (hashSet != null) {
            Iterator<a.i.n.b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            x(fragment);
            this.f2416o.remove(fragment);
        }
    }

    public final a.l.d.q n0(Fragment fragment) {
        return this.O.i(fragment);
    }

    public void n1() {
        synchronized (this.f2404c) {
            ArrayList<q> arrayList = this.N;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f2404c.size() == 1;
            if (z || z2) {
                this.t.g().removeCallbacks(this.P);
                this.t.g().post(this.P);
                v1();
            }
        }
    }

    public boolean o() {
        boolean zH0 = false;
        for (Fragment fragment : this.f2406e.l()) {
            if (fragment != null) {
                zH0 = H0(fragment);
            }
            if (zH0) {
                return true;
            }
        }
        return false;
    }

    public a.l.d.g o0() {
        return this.u;
    }

    public void o1(Fragment fragment, boolean z) {
        ViewGroup viewGroupQ0 = q0(fragment);
        if (viewGroupQ0 == null || !(viewGroupQ0 instanceof a.l.d.h)) {
            return;
        }
        ((a.l.d.h) viewGroupQ0).setDrawDisappearingViewsLast(!z);
    }

    public final void p() {
        if (L0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public Fragment p0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentG0 = g0(string);
        if (fragmentG0 == null) {
            u1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentG0;
    }

    public void p1(Fragment fragment, f.c cVar) {
        if (fragment.equals(g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void q() {
        this.f2405d = false;
        this.L.clear();
        this.K.clear();
    }

    public final ViewGroup q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.u.d()) {
            View viewC = this.u.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    public void q1(Fragment fragment) {
        if (fragment == null || (fragment.equals(g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.w;
            this.w = fragment;
            M(fragment2);
            M(this.w);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void r(String str) {
        this.f2413l.remove(str);
    }

    public a.l.d.j r0() {
        a.l.d.j jVar = this.x;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.v;
        return fragment != null ? fragment.mFragmentManager.r0() : this.y;
    }

    public final void r1(Fragment fragment) {
        ViewGroup viewGroupQ0 = q0(fragment);
        if (viewGroupQ0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i2 = a.l.b.f2220c;
        if (viewGroupQ0.getTag(i2) == null) {
            viewGroupQ0.setTag(i2, fragment);
        }
        ((Fragment) viewGroupQ0.getTag(i2)).setPopDirection(fragment.getPopDirection());
    }

    public final Set<e0> s() {
        HashSet hashSet = new HashSet();
        Iterator<v> it = this.f2406e.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(e0.o(viewGroup, z0()));
            }
        }
        return hashSet;
    }

    public x s0() {
        return this.f2406e;
    }

    public void s1(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final Set<e0> t(ArrayList<a.l.d.a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<y.a> it = arrayList.get(i2).f2494c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f2508b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(e0.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public List<Fragment> t0() {
        return this.f2406e.n();
    }

    public final void t1() {
        Iterator<v> it = this.f2406e.k().iterator();
        while (it.hasNext()) {
            W0(it.next());
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.v;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.v;
        } else {
            a.l.d.k<?> kVar = this.t;
            if (kVar == null) {
                sb.append(Constants.NULL_VERSION_ID);
                sb.append("}}");
                return sb.toString();
            }
            sb.append(kVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.t;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public void u(a.l.d.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.D(z3);
        } else {
            aVar.C();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.s >= 1) {
            z.B(this.t.f(), this.u, arrayList, arrayList2, 0, 1, true, this.p);
        }
        if (z3) {
            R0(this.s, true);
        }
        for (Fragment fragment : this.f2406e.l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.G(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public a.l.d.k<?> u0() {
        return this.t;
    }

    public final void u1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new d0("FragmentManager"));
        a.l.d.k<?> kVar = this.t;
        try {
            if (kVar != null) {
                kVar.h("  ", null, printWriter, new String[0]);
            } else {
                X("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void v(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            f.d dVarC = a.l.d.f.c(this.t.f(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (dVarC == null || (animator = dVarC.f2378b) == null) {
                if (dVarC != null) {
                    fragment.mView.startAnimation(dVarC.f2377a);
                    dVarC.f2377a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    dVarC.f2378b.addListener(new h(viewGroup, view, fragment));
                }
                dVarC.f2378b.start();
            }
        }
        E0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    public LayoutInflater.Factory2 v0() {
        return this.f2409h;
    }

    public final void v1() {
        synchronized (this.f2404c) {
            if (this.f2404c.isEmpty()) {
                this.f2411j.f(m0() > 0 && J0(this.v));
            } else {
                this.f2411j.f(true);
            }
        }
    }

    public v w(Fragment fragment) {
        v vVarM = this.f2406e.m(fragment.mWho);
        if (vVarM != null) {
            return vVarM;
        }
        v vVar = new v(this.q, this.f2406e, fragment);
        vVar.o(this.t.f().getClassLoader());
        vVar.u(this.s);
        return vVar;
    }

    public a.l.d.m w0() {
        return this.q;
    }

    public final void x(Fragment fragment) {
        fragment.performDestroyView();
        this.q.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.n(null);
        fragment.mInLayout = false;
    }

    public Fragment x0() {
        return this.v;
    }

    public void y(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (G0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f2406e.s(fragment);
            if (H0(fragment)) {
                this.F = true;
            }
            r1(fragment);
        }
    }

    public Fragment y0() {
        return this.w;
    }

    public void z() {
        this.G = false;
        this.H = false;
        this.O.o(false);
        T(4);
    }

    public f0 z0() {
        f0 f0Var = this.z;
        if (f0Var != null) {
            return f0Var;
        }
        Fragment fragment = this.v;
        return fragment != null ? fragment.mFragmentManager.z0() : this.A;
    }
}
