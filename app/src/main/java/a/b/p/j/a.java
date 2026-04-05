package a.b.p.j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.amazonaws.event.ProgressEvent;

/* JADX INFO: loaded from: classes.dex */
public class a implements a.i.l.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f401g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f403i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f409o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f402h = ProgressEvent.PART_FAILED_EVENT_CODE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f404j = ProgressEvent.PART_FAILED_EVENT_CODE;
    public ColorStateList p = null;
    public PorterDuff.Mode q = null;
    public boolean r = false;
    public boolean s = false;
    public int t = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f406l = context;
        this.f395a = i3;
        this.f396b = i2;
        this.f397c = i5;
        this.f398d = charSequence;
    }

    @Override // a.i.l.a.b
    public a.i.l.a.b a(a.i.r.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // a.i.l.a.b
    public a.i.r.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f405k;
        if (drawable != null) {
            if (this.r || this.s) {
                Drawable drawableR = a.i.j.l.a.r(drawable);
                this.f405k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f405k = drawableMutate;
                if (this.r) {
                    a.i.j.l.a.o(drawableMutate, this.p);
                }
                if (this.s) {
                    a.i.j.l.a.p(this.f405k, this.q);
                }
            }
        }
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a.i.l.a.b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public a.i.l.a.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a.i.l.a.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f404j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f403i;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f408n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f396b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f405k;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.p;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f400f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f395a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f402h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f401g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f397c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f398d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f399e;
        return charSequence != null ? charSequence : this.f398d;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f409o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f403i = Character.toLowerCase(c2);
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f403i = Character.toLowerCase(c2);
        this.f404j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.t = (z ? 1 : 0) | (this.t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.t = (z ? 2 : 0) | (this.t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public a.i.l.a.b setContentDescription(CharSequence charSequence) {
        this.f408n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.t = (z ? 16 : 0) | (this.t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f405k = a.i.i.b.f(this.f406l, i2);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f405k = drawable;
        c();
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.p = colorStateList;
        this.r = true;
        c();
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.q = mode;
        this.s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f400f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f401g = c2;
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f401g = c2;
        this.f402h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f407m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f401g = c2;
        this.f403i = Character.toLowerCase(c3);
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f401g = c2;
        this.f402h = KeyEvent.normalizeMetaState(i2);
        this.f403i = Character.toLowerCase(c3);
        this.f404j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // a.i.l.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f398d = this.f406l.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f398d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f399e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public a.i.l.a.b setTooltipText(CharSequence charSequence) {
        this.f409o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.t = (this.t & 8) | (z ? 0 : 8);
        return this;
    }
}
