package a.b.p.j;

import a.b.p.j.n;
import a.i.r.b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.amazonaws.event.ProgressEvent;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class i implements a.i.l.a.b {
    public View A;
    public a.i.r.b B;
    public MenuItem.OnActionExpandListener C;
    public ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f489h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f491j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f493l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r f496o;
    public Runnable p;
    public MenuItem.OnMenuItemClickListener q;
    public CharSequence r;
    public CharSequence s;
    public int z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f490i = ProgressEvent.PART_FAILED_EVENT_CODE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f492k = ProgressEvent.PART_FAILED_EVENT_CODE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f494m = 0;
    public ColorStateList t = null;
    public PorterDuff.Mode u = null;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public int y = 16;
    public boolean D = false;

    public class a implements b.InterfaceC0041b {
        public a() {
        }

        @Override // a.i.r.b.InterfaceC0041b
        public void onActionProviderVisibilityChanged(boolean z) {
            i iVar = i.this;
            iVar.f495n.J(iVar);
        }
    }

    public i(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.z = 0;
        this.f495n = gVar;
        this.f482a = i3;
        this.f483b = i2;
        this.f484c = i4;
        this.f485d = i5;
        this.f486e = charSequence;
        this.z = i6;
    }

    public static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public boolean A() {
        return this.f495n.H() && g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    @Override // a.i.l.a.b
    public a.i.l.a.b a(a.i.r.b bVar) {
        a.i.r.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.j();
        }
        this.A = null;
        this.B = bVar;
        this.f495n.K(true);
        a.i.r.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.l(new a());
        }
        return this;
    }

    @Override // a.i.l.a.b
    public a.i.r.b b() {
        return this.B;
    }

    public void c() {
        this.f495n.I(this);
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f495n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = a.i.j.l.a.r(drawable).mutate();
            if (this.v) {
                a.i.j.l.a.o(drawable, this.t);
            }
            if (this.w) {
                a.i.j.l.a.p(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f495n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f485d;
    }

    public char g() {
        return this.f495n.G() ? this.f491j : this.f489h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        a.i.r.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewE = bVar.e(this);
        this.A = viewE;
        return viewE;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f492k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f491j;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f483b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f493l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f494m == 0) {
            return null;
        }
        Drawable drawableD = a.b.l.a.a.d(this.f495n.u(), this.f494m);
        this.f494m = 0;
        this.f493l = drawableD;
        return e(drawableD);
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f488g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f482a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f490i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f489h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f484c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f496o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f486e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f487f;
        if (charSequence == null) {
            charSequence = this.f486e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    public String h() {
        int i2;
        char cG = g();
        if (cG == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources resources = this.f495n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f495n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(a.b.h.f113m));
        }
        int i3 = this.f495n.G() ? this.f492k : this.f490i;
        d(sb, i3, 65536, resources.getString(a.b.h.f109i));
        d(sb, i3, ProgressEvent.PART_FAILED_EVENT_CODE, resources.getString(a.b.h.f105e));
        d(sb, i3, 2, resources.getString(a.b.h.f104d));
        d(sb, i3, 1, resources.getString(a.b.h.f110j));
        d(sb, i3, 4, resources.getString(a.b.h.f112l));
        d(sb, i3, 8, resources.getString(a.b.h.f108h));
        if (cG == '\b') {
            i2 = a.b.h.f106f;
        } else if (cG == '\n') {
            i2 = a.b.h.f107g;
        } else {
            if (cG != ' ') {
                sb.append(cG);
                return sb.toString();
            }
            i2 = a.b.h.f111k;
        }
        sb.append(resources.getString(i2));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f496o != null;
    }

    public CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        a.i.r.b bVar = this.B;
        return (bVar == null || !bVar.h()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.c();
    }

    public boolean j() {
        a.i.r.b bVar;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.e(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f495n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f488g != null) {
            try {
                this.f495n.u().startActivity(this.f488g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        a.i.r.b bVar = this.B;
        return bVar != null && bVar.f();
    }

    public boolean l() {
        return (this.y & 32) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public a.i.l.a.b setActionView(int i2) {
        Context contextU = this.f495n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i2, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public a.i.l.a.b setActionView(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.f482a) > 0) {
            view.setId(i2);
        }
        this.f495n.I(this);
        return this;
    }

    public void r(boolean z) {
        this.D = z;
        this.f495n.K(false);
    }

    public void s(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 2 : 0) | (i2 & (-3));
        this.y = i3;
        if (i2 != i3) {
            this.f495n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f491j == c2) {
            return this;
        }
        this.f491j = Character.toLowerCase(c2);
        this.f495n.K(false);
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f491j == c2 && this.f492k == i2) {
            return this;
        }
        this.f491j = Character.toLowerCase(c2);
        this.f492k = KeyEvent.normalizeMetaState(i2);
        this.f495n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.y = i3;
        if (i2 != i3) {
            this.f495n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.f495n.T(this);
        } else {
            s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public a.i.l.a.b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.f495n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.y = z ? this.y | 16 : this.y & (-17);
        this.f495n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f493l = null;
        this.f494m = i2;
        this.x = true;
        this.f495n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f494m = 0;
        this.f493l = drawable;
        this.x = true;
        this.f495n.K(false);
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.f495n.K(false);
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.f495n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f488g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f489h == c2) {
            return this;
        }
        this.f489h = c2;
        this.f495n.K(false);
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f489h == c2 && this.f490i == i2) {
            return this;
        }
        this.f489h = c2;
        this.f490i = KeyEvent.normalizeMetaState(i2);
        this.f495n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f489h = c2;
        this.f491j = Character.toLowerCase(c3);
        this.f495n.K(false);
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f489h = c2;
        this.f490i = KeyEvent.normalizeMetaState(i2);
        this.f491j = Character.toLowerCase(c3);
        this.f492k = KeyEvent.normalizeMetaState(i3);
        this.f495n.K(false);
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = i2;
        this.f495n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.f495n.u().getString(i2));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f486e = charSequence;
        this.f495n.K(false);
        r rVar = this.f496o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f487f = charSequence;
        this.f495n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public a.i.l.a.b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.f495n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (y(z)) {
            this.f495n.J(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f486e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z) {
        this.y = z ? this.y | 32 : this.y & (-33);
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a.i.l.a.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(r rVar) {
        this.f496o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 0 : 8) | (i2 & (-9));
        this.y = i3;
        return i2 != i3;
    }

    public boolean z() {
        return this.f495n.A();
    }
}
