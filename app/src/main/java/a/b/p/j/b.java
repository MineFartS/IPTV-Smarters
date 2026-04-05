package a.b.p.j;

import a.b.p.j.m;
import a.b.p.j.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LayoutInflater f414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m.a f415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f419k;

    public b(Context context, int i2, int i3) {
        this.f410b = context;
        this.f413e = LayoutInflater.from(context);
        this.f416h = i2;
        this.f417i = i3;
    }

    public void a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f418j).addView(view, i2);
    }

    @Override // a.b.p.j.m
    public void b(g gVar, boolean z) {
        m.a aVar = this.f415g;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.b.p.j.m
    public void c(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f418j;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f412d;
        int i2 = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList<i> arrayListE = this.f412d.E();
            int size = arrayListE.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i iVar = arrayListE.get(i4);
                if (q(i3, iVar)) {
                    View childAt = viewGroup.getChildAt(i3);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View viewN = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i2)) {
                i2++;
            }
        }
    }

    @Override // a.b.p.j.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.p.j.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.p.j.m
    public void g(m.a aVar) {
        this.f415g = aVar;
    }

    @Override // a.b.p.j.m
    public void h(Context context, g gVar) {
        this.f411c = context;
        this.f414f = LayoutInflater.from(context);
        this.f412d = gVar;
    }

    public abstract void i(i iVar, n.a aVar);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.b.p.j.m
    public boolean j(r rVar) {
        m.a aVar = this.f415g;
        g gVar = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            gVar = this.f412d;
        }
        return aVar.c(gVar);
    }

    public n.a k(ViewGroup viewGroup) {
        return (n.a) this.f413e.inflate(this.f417i, viewGroup, false);
    }

    public boolean l(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public m.a m() {
        return this.f415g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a aVarK = view instanceof n.a ? (n.a) view : k(viewGroup);
        i(iVar, aVarK);
        return (View) aVarK;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f418j == null) {
            n nVar = (n) this.f413e.inflate(this.f416h, viewGroup, false);
            this.f418j = nVar;
            nVar.b(this.f412d);
            c(true);
        }
        return this.f418j;
    }

    public void p(int i2) {
        this.f419k = i2;
    }

    public abstract boolean q(int i2, i iVar);
}
