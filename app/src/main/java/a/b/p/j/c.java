package a.b.p.j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.f.i<a.i.l.a.b, MenuItem> f421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.f.i<a.i.l.a.c, SubMenu> f422c;

    public c(Context context) {
        this.f420a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof a.i.l.a.b)) {
            return menuItem;
        }
        a.i.l.a.b bVar = (a.i.l.a.b) menuItem;
        if (this.f421b == null) {
            this.f421b = new a.f.i<>();
        }
        MenuItem menuItem2 = this.f421b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f420a, bVar);
        this.f421b.put(bVar, jVar);
        return jVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof a.i.l.a.c)) {
            return subMenu;
        }
        a.i.l.a.c cVar = (a.i.l.a.c) subMenu;
        if (this.f422c == null) {
            this.f422c = new a.f.i<>();
        }
        SubMenu subMenu2 = this.f422c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f420a, cVar);
        this.f422c.put(cVar, sVar);
        return sVar;
    }

    public final void e() {
        a.f.i<a.i.l.a.b, MenuItem> iVar = this.f421b;
        if (iVar != null) {
            iVar.clear();
        }
        a.f.i<a.i.l.a.c, SubMenu> iVar2 = this.f422c;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    public final void f(int i2) {
        if (this.f421b == null) {
            return;
        }
        int i3 = 0;
        while (i3 < this.f421b.size()) {
            if (this.f421b.j(i3).getGroupId() == i2) {
                this.f421b.l(i3);
                i3--;
            }
            i3++;
        }
    }

    public final void g(int i2) {
        if (this.f421b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f421b.size(); i3++) {
            if (this.f421b.j(i3).getItemId() == i2) {
                this.f421b.l(i3);
                return;
            }
        }
    }
}
