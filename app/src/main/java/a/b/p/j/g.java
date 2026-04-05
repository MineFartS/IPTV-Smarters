package a.b.p.j;

import a.i.r.y;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g implements a.i.l.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f463a = {1, 4, 5, 3, 2, 0};
    public boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f468f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f477o;
    public Drawable p;
    public View q;
    public i y;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f475m = 0;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public ArrayList<i> w = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<m>> x = new CopyOnWriteArrayList<>();
    public boolean z = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<i> f469g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<i> f470h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f471i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<i> f472j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<i> f473k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f474l = true;

    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.f464b = context;
        this.f465c = context.getResources();
        b0(true);
    }

    public static int B(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = f463a;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int n(ArrayList<i> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean A() {
        return this.u;
    }

    public Resources C() {
        return this.f465c;
    }

    public g D() {
        return this;
    }

    public ArrayList<i> E() {
        if (!this.f471i) {
            return this.f470h;
        }
        this.f470h.clear();
        int size = this.f469g.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f469g.get(i2);
            if (iVar.isVisible()) {
                this.f470h.add(iVar);
            }
        }
        this.f471i = false;
        this.f474l = true;
        return this.f470h;
    }

    public boolean F() {
        return this.z;
    }

    public boolean G() {
        return this.f466d;
    }

    public boolean H() {
        return this.f467e;
    }

    public void I(i iVar) {
        this.f474l = true;
        K(true);
    }

    public void J(i iVar) {
        this.f471i = true;
        K(true);
    }

    public void K(boolean z) {
        if (this.r) {
            this.s = true;
            if (z) {
                this.t = true;
                return;
            }
            return;
        }
        if (z) {
            this.f471i = true;
            this.f474l = true;
        }
        i(z);
    }

    public boolean L(MenuItem menuItem, int i2) {
        return M(menuItem, null, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[PHI: r1
  0x002d: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:35:0x0068, B:23:0x003c, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean M(android.view.MenuItem r7, a.b.p.j.m r8, int r9) {
        /*
            r6 = this;
            a.b.p.j.i r7 = (a.b.p.j.i) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.k()
            a.i.r.b r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.b()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            a.b.p.j.r r9 = new a.b.p.j.r
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            a.b.p.j.r r7 = (a.b.p.j.r) r7
            if (r4 == 0) goto L63
            r2.g(r7)
        L63:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.j.g.M(android.view.MenuItem, a.b.p.j.m, int):boolean");
    }

    public final void N(int i2, boolean z) {
        if (i2 < 0 || i2 >= this.f469g.size()) {
            return;
        }
        this.f469g.remove(i2);
        if (z) {
            K(true);
        }
    }

    public void O(m mVar) {
        for (WeakReference<m> weakReference : this.x) {
            m mVar2 = weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.x.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).P(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f468f = aVar;
    }

    public g S(int i2) {
        this.f475m = i2;
        return this;
    }

    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f469g.size();
        d0();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f469g.get(i2);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        c0();
    }

    public g U(int i2) {
        W(0, null, i2, null, null);
        return this;
    }

    public g V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    public final void W(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.q = view;
            this.f477o = null;
            this.p = null;
        } else {
            if (i2 > 0) {
                this.f477o = resourcesC.getText(i2);
            } else if (charSequence != null) {
                this.f477o = charSequence;
            }
            if (i3 > 0) {
                this.p = a.i.i.b.f(u(), i3);
            } else if (drawable != null) {
                this.p = drawable;
            }
            this.q = null;
        }
        K(false);
    }

    public g X(int i2) {
        W(i2, null, 0, null, null);
        return this;
    }

    public g Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    public g Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int iB = B(i4);
        i iVarG = g(i2, i3, i4, iB, charSequence, this.f475m);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f476n;
        if (contextMenuInfo != null) {
            iVarG.v(contextMenuInfo);
        }
        ArrayList<i> arrayList = this.f469g;
        arrayList.add(n(arrayList, iB), iVarG);
        K(true);
        return iVarG;
    }

    public void a0(boolean z) {
        this.A = z;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f465c.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f465c.getString(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f464b.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f465c.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f465c.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.f464b, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.f464b);
    }

    public final void b0(boolean z) {
        this.f467e = z && this.f465c.getConfiguration().keyboard != 1 && y.e(ViewConfiguration.get(this.f464b), this.f464b);
    }

    public void c(m mVar, Context context) {
        this.x.add(new WeakReference<>(mVar));
        mVar.h(context, this);
        this.f474l = true;
    }

    public void c0() {
        this.r = false;
        if (this.s) {
            this.s = false;
            K(this.t);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.y;
        if (iVar != null) {
            f(iVar);
        }
        this.f469g.clear();
        K(true);
    }

    public void clearHeader() {
        this.p = null;
        this.f477o = null;
        this.q = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f468f;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.r) {
            return;
        }
        this.r = true;
        this.s = false;
        this.t = false;
    }

    public final void e(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        for (WeakReference<m> weakReference : this.x) {
            m mVar = weakReference.get();
            if (mVar == null) {
                this.x.remove(weakReference);
            } else {
                mVar.b(this, z);
            }
        }
        this.v = false;
    }

    public boolean f(i iVar) {
        boolean zE = false;
        if (!this.x.isEmpty() && this.y == iVar) {
            d0();
            for (WeakReference<m> weakReference : this.x) {
                m mVar = weakReference.get();
                if (mVar != null) {
                    zE = mVar.e(this, iVar);
                    if (zE) {
                        break;
                    }
                } else {
                    this.x.remove(weakReference);
                }
            }
            c0();
            if (zE) {
                this.y = null;
            }
        }
        return zE;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f469g.get(i3);
            if (iVar.getItemId() == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (menuItemFindItem = iVar.getSubMenu().findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final i g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new i(this, i2, i3, i4, i5, charSequence, i6);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f469g.get(i2);
    }

    public boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f468f;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.A) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f469g.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.x.isEmpty()) {
            return;
        }
        d0();
        for (WeakReference<m> weakReference : this.x) {
            m mVar = weakReference.get();
            if (mVar == null) {
                this.x.remove(weakReference);
            } else {
                mVar.c(z);
            }
        }
        c0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return p(i2, keyEvent) != null;
    }

    public final boolean j(r rVar, m mVar) {
        if (this.x.isEmpty()) {
            return false;
        }
        boolean zJ = mVar != null ? mVar.j(rVar) : false;
        for (WeakReference<m> weakReference : this.x) {
            m mVar2 = weakReference.get();
            if (mVar2 == null) {
                this.x.remove(weakReference);
            } else if (!zJ) {
                zJ = mVar2.j(rVar);
            }
        }
        return zJ;
    }

    public boolean k(i iVar) {
        boolean zF = false;
        if (this.x.isEmpty()) {
            return false;
        }
        d0();
        for (WeakReference<m> weakReference : this.x) {
            m mVar = weakReference.get();
            if (mVar != null) {
                zF = mVar.f(this, iVar);
                if (zF) {
                    break;
                }
            } else {
                this.x.remove(weakReference);
            }
        }
        c0();
        if (zF) {
            this.y = iVar;
        }
        return zF;
    }

    public int l(int i2) {
        return m(i2, 0);
    }

    public int m(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f469g.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public int o(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f469g.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public i p(int i2, KeyEvent keyEvent) {
        ArrayList<i> arrayList = this.w;
        arrayList.clear();
        q(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zG = G();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return L(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i iVarP = p(i2, keyEvent);
        boolean zL = iVarP != null ? L(iVarP, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    public void q(List<i> list, int i2, KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f469g.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = this.f469g.get(i3);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i2, keyEvent);
                }
                char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((zG ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<i> arrayListE = E();
        if (this.f474l) {
            boolean zD = false;
            for (WeakReference<m> weakReference : this.x) {
                m mVar = weakReference.get();
                if (mVar == null) {
                    this.x.remove(weakReference);
                } else {
                    zD |= mVar.d();
                }
            }
            if (zD) {
                this.f472j.clear();
                this.f473k.clear();
                int size = arrayListE.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = arrayListE.get(i2);
                    (iVar.l() ? this.f472j : this.f473k).add(iVar);
                }
            } else {
                this.f472j.clear();
                this.f473k.clear();
                this.f473k.addAll(E());
            }
            this.f474l = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int iL = l(i2);
        if (iL >= 0) {
            int size = this.f469g.size() - iL;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f469g.get(iL).getGroupId() != i2) {
                    break;
                }
                N(iL, false);
                i3 = i4;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        N(o(i2), true);
    }

    public ArrayList<i> s() {
        r();
        return this.f472j;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.f469g.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f469g.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.z = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        int size = this.f469g.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f469g.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        int size = this.f469g.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f469g.get(i3);
            if (iVar.getGroupId() == i2 && iVar.y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f466d = z;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f469g.size();
    }

    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f464b;
    }

    public i v() {
        return this.y;
    }

    public Drawable w() {
        return this.p;
    }

    public CharSequence x() {
        return this.f477o;
    }

    public View y() {
        return this.q;
    }

    public ArrayList<i> z() {
        r();
        return this.f473k;
    }
}
