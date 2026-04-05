package a.b.p;

import a.b.j;
import a.b.q.b0;
import a.b.q.u0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.amazonaws.event.ProgressEvent;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?>[] f361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f366f;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Class<?>[] f367a = {MenuItem.class};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f369c;

        public a(Object obj, String str) {
            this.f368b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f369c = cls.getMethod(str, f367a);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f369c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f369c.invoke(this.f368b, menuItem)).booleanValue();
                }
                this.f369c.invoke(this.f368b, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public class b {
        public a.i.r.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Menu f370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f376g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f377h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f378i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f379j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f380k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f381l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f382m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f383n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f384o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.f370a = menu;
            h();
        }

        public void a() {
            this.f377h = true;
            i(this.f370a.add(this.f371b, this.f378i, this.f379j, this.f380k));
        }

        public SubMenu b() {
            this.f377h = true;
            SubMenu subMenuAddSubMenu = this.f370a.addSubMenu(this.f371b, this.f378i, this.f379j, this.f380k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f377h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f365e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f365e.obtainStyledAttributes(attributeSet, j.z1);
            this.f371b = typedArrayObtainStyledAttributes.getResourceId(j.B1, 0);
            this.f372c = typedArrayObtainStyledAttributes.getInt(j.D1, 0);
            this.f373d = typedArrayObtainStyledAttributes.getInt(j.E1, 0);
            this.f374e = typedArrayObtainStyledAttributes.getInt(j.F1, 0);
            this.f375f = typedArrayObtainStyledAttributes.getBoolean(j.C1, true);
            this.f376g = typedArrayObtainStyledAttributes.getBoolean(j.A1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            u0 u0VarU = u0.u(g.this.f365e, attributeSet, j.G1);
            this.f378i = u0VarU.n(j.J1, 0);
            this.f379j = (u0VarU.k(j.M1, this.f372c) & (-65536)) | (u0VarU.k(j.N1, this.f373d) & 65535);
            this.f380k = u0VarU.p(j.O1);
            this.f381l = u0VarU.p(j.P1);
            this.f382m = u0VarU.n(j.H1, 0);
            this.f383n = c(u0VarU.o(j.Q1));
            this.f384o = u0VarU.k(j.X1, ProgressEvent.PART_FAILED_EVENT_CODE);
            this.p = c(u0VarU.o(j.R1));
            this.q = u0VarU.k(j.b2, ProgressEvent.PART_FAILED_EVENT_CODE);
            int i2 = j.S1;
            this.r = u0VarU.s(i2) ? u0VarU.a(i2, false) : this.f374e;
            this.s = u0VarU.a(j.K1, false);
            this.t = u0VarU.a(j.L1, this.f375f);
            this.u = u0VarU.a(j.I1, this.f376g);
            this.v = u0VarU.k(j.c2, -1);
            this.z = u0VarU.o(j.T1);
            this.w = u0VarU.n(j.U1, 0);
            this.x = u0VarU.o(j.W1);
            String strO = u0VarU.o(j.V1);
            this.y = strO;
            boolean z = strO != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (a.i.r.b) e(strO, g.f362b, g.this.f364d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u0VarU.p(j.Y1);
            this.C = u0VarU.p(j.d2);
            int i3 = j.a2;
            if (u0VarU.s(i3)) {
                this.E = b0.e(u0VarU.k(i3, -1), this.E);
            } else {
                this.E = null;
            }
            int i4 = j.Z1;
            if (u0VarU.s(i4)) {
                this.D = u0VarU.c(i4);
            } else {
                this.D = null;
            }
            u0VarU.w();
            this.f377h = false;
        }

        public void h() {
            this.f371b = 0;
            this.f372c = 0;
            this.f373d = 0;
            this.f374e = 0;
            this.f375f = true;
            this.f376g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.f381l).setIcon(this.f382m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (g.this.f365e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof a.b.p.j.i) {
                    ((a.b.p.j.i) menuItem).t(true);
                } else if (menuItem instanceof a.b.p.j.j) {
                    ((a.b.p.j.j) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f361a, g.this.f363c));
                z = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            a.i.r.b bVar = this.A;
            if (bVar != null) {
                a.i.r.j.c(menuItem, bVar);
            }
            a.i.r.j.e(menuItem, this.B);
            a.i.r.j.i(menuItem, this.C);
            a.i.r.j.d(menuItem, this.f383n, this.f384o);
            a.i.r.j.h(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                a.i.r.j.g(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                a.i.r.j.f(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f361a = clsArr;
        f362b = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f365e = context;
        Object[] objArr = {context};
        this.f363c = objArr;
        this.f364d = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f366f == null) {
            this.f366f = a(this.f365e);
        }
        return this.f366f;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            a.i.r.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.b()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof a.i.l.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f365e.getResources().getLayout(i2);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
