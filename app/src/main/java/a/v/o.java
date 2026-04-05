package a.v;

import a.v.d;
import a.v.h;
import a.v.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f3595a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f3596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f3597c;

    public o(Context context, t tVar) {
        this.f3596b = context;
        this.f3597c = tVar;
    }

    public static q a(TypedValue typedValue, q qVar, q qVar2, String str, String str2) throws XmlPullParserException {
        if (qVar == null || qVar == qVar2) {
            return qVar != null ? qVar : qVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public final k b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i2) throws XmlPullParserException {
        int depth;
        k kVarA = this.f3597c.e(xmlResourceParser.getName()).a();
        kVarA.F(this.f3596b, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    g(resources, kVarA, attributeSet, i2);
                } else if ("deepLink".equals(name)) {
                    h(resources, kVarA, attributeSet);
                } else if ("action".equals(name)) {
                    d(resources, kVarA, attributeSet, xmlResourceParser, i2);
                } else if ("include".equals(name) && (kVarA instanceof l)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, v.r);
                    ((l) kVarA).N(c(typedArrayObtainAttributes.getResourceId(v.s, 0)));
                    typedArrayObtainAttributes.recycle();
                } else if (kVarA instanceof l) {
                    ((l) kVarA).N(b(resources, xmlResourceParser, attributeSet, i2));
                }
            }
        }
        return kVarA;
    }

    @SuppressLint({"ResourceType"})
    public l c(int i2) {
        int next;
        Resources resources = this.f3596b.getResources();
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i2) + " line " + xml.getLineNumber(), e2);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        k kVarB = b(resources, xml, attributeSetAsAttributeSet, i2);
        if (kVarB instanceof l) {
            return (l) kVarB;
        }
        throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
    }

    public final void d(Resources resources, k kVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i2) throws XmlPullParserException {
        int depth;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.v.w.a.f3652f);
        int resourceId = typedArrayObtainAttributes.getResourceId(a.v.w.a.f3653g, 0);
        c cVar = new c(typedArrayObtainAttributes.getResourceId(a.v.w.a.f3654h, 0));
        p.a aVar = new p.a();
        aVar.d(typedArrayObtainAttributes.getBoolean(a.v.w.a.f3657k, false));
        aVar.g(typedArrayObtainAttributes.getResourceId(a.v.w.a.f3660n, -1), typedArrayObtainAttributes.getBoolean(a.v.w.a.f3661o, false));
        aVar.b(typedArrayObtainAttributes.getResourceId(a.v.w.a.f3655i, -1));
        aVar.c(typedArrayObtainAttributes.getResourceId(a.v.w.a.f3656j, -1));
        aVar.e(typedArrayObtainAttributes.getResourceId(a.v.w.a.f3658l, -1));
        aVar.f(typedArrayObtainAttributes.getResourceId(a.v.w.a.f3659m, -1));
        cVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                f(resources, bundle, attributeSet, i2);
            }
        }
        if (!bundle.isEmpty()) {
            cVar.d(bundle);
        }
        kVar.I(resourceId, cVar);
        typedArrayObtainAttributes.recycle();
    }

    public final d e(TypedArray typedArray, Resources resources, int i2) throws XmlPullParserException {
        float f2;
        int dimension;
        d.a aVar = new d.a();
        aVar.c(typedArray.getBoolean(a.v.w.a.t, false));
        ThreadLocal<TypedValue> threadLocal = f3595a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(a.v.w.a.s);
        Object objK = null;
        q<?> qVarA = string != null ? q.a(string, resources.getResourcePackageName(i2)) : null;
        int i3 = a.v.w.a.r;
        if (typedArray.getValue(i3, typedValue)) {
            q<Integer> qVar = q.f3613b;
            if (qVarA == qVar) {
                dimension = typedValue.resourceId;
                if (dimension != 0) {
                    objK = Integer.valueOf(dimension);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + qVarA.c() + ". Must be a reference to a resource.");
                    }
                    objK = 0;
                }
            } else {
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    if (qVarA != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + qVarA.c() + ". You must use a \"" + qVar.c() + "\" type to reference other resources.");
                    }
                    qVarA = qVar;
                    objK = Integer.valueOf(i4);
                } else if (qVarA == q.f3621j) {
                    objK = typedArray.getString(i3);
                } else {
                    int i5 = typedValue.type;
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 == 5) {
                                qVarA = a(typedValue, qVarA, q.f3612a, string, "dimension");
                                dimension = (int) typedValue.getDimension(resources.getDisplayMetrics());
                            } else if (i5 == 18) {
                                qVarA = a(typedValue, qVarA, q.f3619h, string, "boolean");
                                objK = Boolean.valueOf(typedValue.data != 0);
                            } else {
                                if (i5 < 16 || i5 > 31) {
                                    throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                }
                                q<Float> qVar2 = q.f3617f;
                                if (qVarA == qVar2) {
                                    qVarA = a(typedValue, qVarA, qVar2, string, "float");
                                    f2 = typedValue.data;
                                } else {
                                    qVarA = a(typedValue, qVarA, q.f3612a, string, "integer");
                                    dimension = typedValue.data;
                                }
                            }
                            objK = Integer.valueOf(dimension);
                        } else {
                            qVarA = a(typedValue, qVarA, q.f3617f, string, "float");
                            f2 = typedValue.getFloat();
                        }
                        objK = Float.valueOf(f2);
                    } else {
                        String string2 = typedValue.string.toString();
                        if (qVarA == null) {
                            qVarA = q.d(string2);
                        }
                        objK = qVarA.k(string2);
                    }
                }
            }
        }
        if (objK != null) {
            aVar.b(objK);
        }
        if (qVarA != null) {
            aVar.d(qVarA);
        }
        return aVar.a();
    }

    public final void f(Resources resources, Bundle bundle, AttributeSet attributeSet, int i2) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.v.w.a.p);
        String string = typedArrayObtainAttributes.getString(a.v.w.a.q);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        d dVarE = e(typedArrayObtainAttributes, resources, i2);
        if (dVarE.b()) {
            dVarE.c(string, bundle);
        }
        typedArrayObtainAttributes.recycle();
    }

    public final void g(Resources resources, k kVar, AttributeSet attributeSet, int i2) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.v.w.a.p);
        String string = typedArrayObtainAttributes.getString(a.v.w.a.q);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        kVar.a(string, e(typedArrayObtainAttributes, resources, i2));
        typedArrayObtainAttributes.recycle();
    }

    public final void h(Resources resources, k kVar, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.v.w.a.u);
        String string = typedArrayObtainAttributes.getString(a.v.w.a.x);
        String string2 = typedArrayObtainAttributes.getString(a.v.w.a.v);
        String string3 = typedArrayObtainAttributes.getString(a.v.w.a.w);
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        h.a aVar = new h.a();
        if (string != null) {
            aVar.d(string.replace("${applicationId}", this.f3596b.getPackageName()));
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar.b(string2.replace("${applicationId}", this.f3596b.getPackageName()));
        }
        if (string3 != null) {
            aVar.c(string3.replace("${applicationId}", this.f3596b.getPackageName()));
        }
        kVar.b(aVar.a());
        typedArrayObtainAttributes.recycle();
    }
}
