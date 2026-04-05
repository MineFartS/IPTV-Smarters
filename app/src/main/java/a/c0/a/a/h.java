package a.c0.a.a;

import a.i.j.c;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class h extends a.c0.a.a.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PorterDuff.Mode f1071c = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0017h f1072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuffColorFilter f1073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorFilter f1074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable.ConstantState f1077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f1078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Matrix f1079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f1080l;

    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        @Override // a.c0.a.a.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (a.i.i.e.g.r(xmlPullParser, "pathData")) {
                TypedArray typedArrayS = a.i.i.e.g.s(resources, theme, attributeSet, a.c0.a.a.a.f1044d);
                f(typedArrayS, xmlPullParser);
                typedArrayS.recycle();
            }
        }

        public final void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1106b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f1105a = a.i.j.c.d(string2);
            }
            this.f1107c = a.i.i.e.g.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f1081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a.i.i.e.b f1082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a.i.i.e.b f1084h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f1085i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1086j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f1087k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1088l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f1089m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Paint.Cap f1090n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Paint.Join f1091o;
        public float p;

        public c() {
            this.f1083g = 0.0f;
            this.f1085i = 1.0f;
            this.f1086j = 1.0f;
            this.f1087k = 0.0f;
            this.f1088l = 1.0f;
            this.f1089m = 0.0f;
            this.f1090n = Paint.Cap.BUTT;
            this.f1091o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f1083g = 0.0f;
            this.f1085i = 1.0f;
            this.f1086j = 1.0f;
            this.f1087k = 0.0f;
            this.f1088l = 1.0f;
            this.f1089m = 0.0f;
            this.f1090n = Paint.Cap.BUTT;
            this.f1091o = Paint.Join.MITER;
            this.p = 4.0f;
            this.f1081e = cVar.f1081e;
            this.f1082f = cVar.f1082f;
            this.f1083g = cVar.f1083g;
            this.f1085i = cVar.f1085i;
            this.f1084h = cVar.f1084h;
            this.f1107c = cVar.f1107c;
            this.f1086j = cVar.f1086j;
            this.f1087k = cVar.f1087k;
            this.f1088l = cVar.f1088l;
            this.f1089m = cVar.f1089m;
            this.f1090n = cVar.f1090n;
            this.f1091o = cVar.f1091o;
            this.p = cVar.p;
        }

        @Override // a.c0.a.a.h.e
        public boolean a() {
            return this.f1084h.i() || this.f1082f.i();
        }

        @Override // a.c0.a.a.h.e
        public boolean b(int[] iArr) {
            return this.f1082f.j(iArr) | this.f1084h.j(iArr);
        }

        public final Paint.Cap e(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join f(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = a.i.i.e.g.s(resources, theme, attributeSet, a.c0.a.a.a.f1043c);
            h(typedArrayS, xmlPullParser, theme);
            typedArrayS.recycle();
        }

        public float getFillAlpha() {
            return this.f1086j;
        }

        public int getFillColor() {
            return this.f1084h.e();
        }

        public float getStrokeAlpha() {
            return this.f1085i;
        }

        public int getStrokeColor() {
            return this.f1082f.e();
        }

        public float getStrokeWidth() {
            return this.f1083g;
        }

        public float getTrimPathEnd() {
            return this.f1088l;
        }

        public float getTrimPathOffset() {
            return this.f1089m;
        }

        public float getTrimPathStart() {
            return this.f1087k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f1081e = null;
            if (a.i.i.e.g.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f1106b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f1105a = a.i.j.c.d(string2);
                }
                this.f1084h = a.i.i.e.g.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f1086j = a.i.i.e.g.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f1086j);
                this.f1090n = e(a.i.i.e.g.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f1090n);
                this.f1091o = f(a.i.i.e.g.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f1091o);
                this.p = a.i.i.e.g.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f1082f = a.i.i.e.g.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f1085i = a.i.i.e.g.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f1085i);
                this.f1083g = a.i.i.e.g.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f1083g);
                this.f1088l = a.i.i.e.g.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f1088l);
                this.f1089m = a.i.i.e.g.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f1089m);
                this.f1087k = a.i.i.e.g.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f1087k);
                this.f1107c = a.i.i.e.g.k(typedArray, xmlPullParser, "fillType", 13, this.f1107c);
            }
        }

        public void setFillAlpha(float f2) {
            this.f1086j = f2;
        }

        public void setFillColor(int i2) {
            this.f1084h.k(i2);
        }

        public void setStrokeAlpha(float f2) {
            this.f1085i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f1082f.k(i2);
        }

        public void setStrokeWidth(float f2) {
            this.f1083g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.f1088l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.f1089m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.f1087k = f2;
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f1092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<e> f1093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f1097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1099h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f1100i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Matrix f1101j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1102k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f1103l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f1104m;

        public d() {
            super();
            this.f1092a = new Matrix();
            this.f1093b = new ArrayList<>();
            this.f1094c = 0.0f;
            this.f1095d = 0.0f;
            this.f1096e = 0.0f;
            this.f1097f = 1.0f;
            this.f1098g = 1.0f;
            this.f1099h = 0.0f;
            this.f1100i = 0.0f;
            this.f1101j = new Matrix();
            this.f1104m = null;
        }

        public d(d dVar, a.f.a<String, Object> aVar) {
            f bVar;
            super();
            this.f1092a = new Matrix();
            this.f1093b = new ArrayList<>();
            this.f1094c = 0.0f;
            this.f1095d = 0.0f;
            this.f1096e = 0.0f;
            this.f1097f = 1.0f;
            this.f1098g = 1.0f;
            this.f1099h = 0.0f;
            this.f1100i = 0.0f;
            Matrix matrix = new Matrix();
            this.f1101j = matrix;
            this.f1104m = null;
            this.f1094c = dVar.f1094c;
            this.f1095d = dVar.f1095d;
            this.f1096e = dVar.f1096e;
            this.f1097f = dVar.f1097f;
            this.f1098g = dVar.f1098g;
            this.f1099h = dVar.f1099h;
            this.f1100i = dVar.f1100i;
            this.f1103l = dVar.f1103l;
            String str = dVar.f1104m;
            this.f1104m = str;
            this.f1102k = dVar.f1102k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f1101j);
            ArrayList<e> arrayList = dVar.f1093b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f1093b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f1093b.add(bVar);
                    String str2 = bVar.f1106b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        @Override // a.c0.a.a.h.e
        public boolean a() {
            for (int i2 = 0; i2 < this.f1093b.size(); i2++) {
                if (this.f1093b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // a.c0.a.a.h.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i2 = 0; i2 < this.f1093b.size(); i2++) {
                zB |= this.f1093b.get(i2).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = a.i.i.e.g.s(resources, theme, attributeSet, a.c0.a.a.a.f1042b);
            e(typedArrayS, xmlPullParser);
            typedArrayS.recycle();
        }

        public final void d() {
            this.f1101j.reset();
            this.f1101j.postTranslate(-this.f1095d, -this.f1096e);
            this.f1101j.postScale(this.f1097f, this.f1098g);
            this.f1101j.postRotate(this.f1094c, 0.0f, 0.0f);
            this.f1101j.postTranslate(this.f1099h + this.f1095d, this.f1100i + this.f1096e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f1103l = null;
            this.f1094c = a.i.i.e.g.j(typedArray, xmlPullParser, "rotation", 5, this.f1094c);
            this.f1095d = typedArray.getFloat(1, this.f1095d);
            this.f1096e = typedArray.getFloat(2, this.f1096e);
            this.f1097f = a.i.i.e.g.j(typedArray, xmlPullParser, "scaleX", 3, this.f1097f);
            this.f1098g = a.i.i.e.g.j(typedArray, xmlPullParser, "scaleY", 4, this.f1098g);
            this.f1099h = a.i.i.e.g.j(typedArray, xmlPullParser, "translateX", 6, this.f1099h);
            this.f1100i = a.i.i.e.g.j(typedArray, xmlPullParser, "translateY", 7, this.f1100i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1104m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f1104m;
        }

        public Matrix getLocalMatrix() {
            return this.f1101j;
        }

        public float getPivotX() {
            return this.f1095d;
        }

        public float getPivotY() {
            return this.f1096e;
        }

        public float getRotation() {
            return this.f1094c;
        }

        public float getScaleX() {
            return this.f1097f;
        }

        public float getScaleY() {
            return this.f1098g;
        }

        public float getTranslateX() {
            return this.f1099h;
        }

        public float getTranslateY() {
            return this.f1100i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f1095d) {
                this.f1095d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f1096e) {
                this.f1096e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f1094c) {
                this.f1094c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f1097f) {
                this.f1097f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f1098g) {
                this.f1098g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f1099h) {
                this.f1099h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f1100i) {
                this.f1100i = f2;
                d();
            }
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static abstract class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.b[] f1105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1108d;

        public f() {
            super();
            this.f1105a = null;
            this.f1107c = 0;
        }

        public f(f fVar) {
            super();
            this.f1105a = null;
            this.f1107c = 0;
            this.f1106b = fVar.f1106b;
            this.f1108d = fVar.f1108d;
            this.f1105a = a.i.j.c.f(fVar.f1105a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f1105a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f1105a;
        }

        public String getPathName() {
            return this.f1106b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (a.i.j.c.b(this.f1105a, bVarArr)) {
                a.i.j.c.j(this.f1105a, bVarArr);
            } else {
                this.f1105a = a.i.j.c.f(bVarArr);
            }
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Matrix f1109a = new Matrix();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f1110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Path f1111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Matrix f1112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f1113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Paint f1114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PathMeasure f1115g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1116h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final d f1117i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1118j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f1119k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1120l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f1121m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1122n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f1123o;
        public Boolean p;
        public final a.f.a<String, Object> q;

        public g() {
            this.f1112d = new Matrix();
            this.f1118j = 0.0f;
            this.f1119k = 0.0f;
            this.f1120l = 0.0f;
            this.f1121m = 0.0f;
            this.f1122n = 255;
            this.f1123o = null;
            this.p = null;
            this.q = new a.f.a<>();
            this.f1117i = new d();
            this.f1110b = new Path();
            this.f1111c = new Path();
        }

        public g(g gVar) {
            this.f1112d = new Matrix();
            this.f1118j = 0.0f;
            this.f1119k = 0.0f;
            this.f1120l = 0.0f;
            this.f1121m = 0.0f;
            this.f1122n = 255;
            this.f1123o = null;
            this.p = null;
            a.f.a<String, Object> aVar = new a.f.a<>();
            this.q = aVar;
            this.f1117i = new d(gVar.f1117i, aVar);
            this.f1110b = new Path(gVar.f1110b);
            this.f1111c = new Path(gVar.f1111c);
            this.f1118j = gVar.f1118j;
            this.f1119k = gVar.f1119k;
            this.f1120l = gVar.f1120l;
            this.f1121m = gVar.f1121m;
            this.f1116h = gVar.f1116h;
            this.f1122n = gVar.f1122n;
            this.f1123o = gVar.f1123o;
            String str = gVar.f1123o;
            if (str != null) {
                aVar.put(str, this);
            }
            this.p = gVar.p;
        }

        public static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.f1117i, f1109a, canvas, i2, i3, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.f1092a.set(matrix);
            dVar.f1092a.preConcat(dVar.f1101j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.f1093b.size(); i4++) {
                e eVar = dVar.f1093b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f1092a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = i2 / this.f1120l;
            float f3 = i3 / this.f1121m;
            float fMin = Math.min(f2, f3);
            Matrix matrix = dVar.f1092a;
            this.f1112d.set(matrix);
            this.f1112d.postScale(f2, f3);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f1110b);
            Path path = this.f1110b;
            this.f1111c.reset();
            if (fVar.c()) {
                this.f1111c.setFillType(fVar.f1107c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f1111c.addPath(path, this.f1112d);
                canvas.clipPath(this.f1111c);
                return;
            }
            c cVar = (c) fVar;
            float f4 = cVar.f1087k;
            if (f4 != 0.0f || cVar.f1088l != 1.0f) {
                float f5 = cVar.f1089m;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (cVar.f1088l + f5) % 1.0f;
                if (this.f1115g == null) {
                    this.f1115g = new PathMeasure();
                }
                this.f1115g.setPath(this.f1110b, false);
                float length = this.f1115g.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f1115g.getSegment(f8, length, path, true);
                    this.f1115g.getSegment(0.0f, f9, path, true);
                } else {
                    this.f1115g.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f1111c.addPath(path, this.f1112d);
            if (cVar.f1084h.l()) {
                a.i.i.e.b bVar = cVar.f1084h;
                if (this.f1114f == null) {
                    Paint paint = new Paint(1);
                    this.f1114f = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f1114f;
                if (bVar.h()) {
                    Shader shaderF = bVar.f();
                    shaderF.setLocalMatrix(this.f1112d);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f1086j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(bVar.e(), cVar.f1086j));
                }
                paint2.setColorFilter(colorFilter);
                this.f1111c.setFillType(cVar.f1107c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f1111c, paint2);
            }
            if (cVar.f1082f.l()) {
                a.i.i.e.b bVar2 = cVar.f1082f;
                if (this.f1113e == null) {
                    Paint paint3 = new Paint(1);
                    this.f1113e = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f1113e;
                Paint.Join join = cVar.f1091o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f1090n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.p);
                if (bVar2.h()) {
                    Shader shaderF2 = bVar2.f();
                    shaderF2.setLocalMatrix(this.f1112d);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f1085i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(h.a(bVar2.e(), cVar.f1085i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f1083g * fMin * fE);
                canvas.drawPath(this.f1111c, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.p == null) {
                this.p = Boolean.valueOf(this.f1117i.a());
            }
            return this.p.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f1117i.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f1122n;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f1122n = i2;
        }
    }

    /* JADX INFO: renamed from: a.c0.a.a.h$h, reason: collision with other inner class name */
    public static class C0017h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f1125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f1126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f1127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bitmap f1129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f1130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f1131h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1132i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f1133j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f1134k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint f1135l;

        public C0017h() {
            this.f1126c = null;
            this.f1127d = h.f1071c;
            this.f1125b = new g();
        }

        public C0017h(C0017h c0017h) {
            this.f1126c = null;
            this.f1127d = h.f1071c;
            if (c0017h != null) {
                this.f1124a = c0017h.f1124a;
                g gVar = new g(c0017h.f1125b);
                this.f1125b = gVar;
                if (c0017h.f1125b.f1114f != null) {
                    gVar.f1114f = new Paint(c0017h.f1125b.f1114f);
                }
                if (c0017h.f1125b.f1113e != null) {
                    this.f1125b.f1113e = new Paint(c0017h.f1125b.f1113e);
                }
                this.f1126c = c0017h.f1126c;
                this.f1127d = c0017h.f1127d;
                this.f1128e = c0017h.f1128e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f1129f.getWidth() && i3 == this.f1129f.getHeight();
        }

        public boolean b() {
            return !this.f1134k && this.f1130g == this.f1126c && this.f1131h == this.f1127d && this.f1133j == this.f1128e && this.f1132i == this.f1125b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f1129f == null || !a(i2, i3)) {
                this.f1129f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f1134k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f1129f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f1135l == null) {
                Paint paint = new Paint();
                this.f1135l = paint;
                paint.setFilterBitmap(true);
            }
            this.f1135l.setAlpha(this.f1125b.getRootAlpha());
            this.f1135l.setColorFilter(colorFilter);
            return this.f1135l;
        }

        public boolean f() {
            return this.f1125b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f1125b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1124a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f1125b.g(iArr);
            this.f1134k |= zG;
            return zG;
        }

        public void i() {
            this.f1130g = this.f1126c;
            this.f1131h = this.f1127d;
            this.f1132i = this.f1125b.getRootAlpha();
            this.f1133j = this.f1128e;
            this.f1134k = false;
        }

        public void j(int i2, int i3) {
            this.f1129f.eraseColor(0);
            this.f1125b.b(new Canvas(this.f1129f), i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f1136a;

        public i(Drawable.ConstantState constantState) {
            this.f1136a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1136a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1136a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f1070b = (VectorDrawable) this.f1136a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f1070b = (VectorDrawable) this.f1136a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f1070b = (VectorDrawable) this.f1136a.newDrawable(resources, theme);
            return hVar;
        }
    }

    public h() {
        this.f1076h = true;
        this.f1078j = new float[9];
        this.f1079k = new Matrix();
        this.f1080l = new Rect();
        this.f1072d = new C0017h();
    }

    public h(C0017h c0017h) {
        this.f1076h = true;
        this.f1078j = new float[9];
        this.f1079k = new Matrix();
        this.f1080l = new Rect();
        this.f1072d = c0017h;
        this.f1073e = j(this.f1073e, c0017h.f1126c, c0017h.f1127d);
    }

    public static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static h b(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f1070b = a.i.i.e.f.a(resources, i2, theme);
            hVar.f1077i = new i(hVar.f1070b.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    public static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1070b;
        if (drawable == null) {
            return false;
        }
        a.i.j.l.a.b(drawable);
        return false;
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public Object d(String str) {
        return this.f1072d.f1125b.q.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f1080l);
        if (this.f1080l.width() <= 0 || this.f1080l.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1074f;
        if (colorFilter == null) {
            colorFilter = this.f1073e;
        }
        canvas.getMatrix(this.f1079k);
        this.f1079k.getValues(this.f1078j);
        float fAbs = Math.abs(this.f1078j[0]);
        float fAbs2 = Math.abs(this.f1078j[4]);
        float fAbs3 = Math.abs(this.f1078j[1]);
        float fAbs4 = Math.abs(this.f1078j[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f1080l.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f1080l.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f1080l;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f1080l.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f1080l.offsetTo(0, 0);
        this.f1072d.c(iMin, iMin2);
        if (!this.f1076h) {
            this.f1072d.j(iMin, iMin2);
        } else if (!this.f1072d.b()) {
            this.f1072d.j(iMin, iMin2);
            this.f1072d.i();
        }
        this.f1072d.d(canvas, colorFilter, this.f1080l);
        canvas.restoreToCount(iSave);
    }

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
    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i2;
        int i3;
        f fVar;
        C0017h c0017h = this.f1072d;
        g gVar = c0017h.f1125b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f1117i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1093b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.q.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    fVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1093b.add(bVar);
                    String pathName = bVar.getPathName();
                    fVar = bVar;
                    if (pathName != null) {
                        gVar.q.put(bVar.getPathName(), bVar);
                        fVar = bVar;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1093b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.q.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = c0017h.f1124a;
                    i3 = dVar2.f1102k;
                    c0017h.f1124a = i3 | i2;
                }
                i2 = c0017h.f1124a;
                i3 = fVar.f1108d;
                c0017h.f1124a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && a.i.j.l.a.f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1070b;
        return drawable != null ? a.i.j.l.a.d(drawable) : this.f1072d.f1125b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1072d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1070b;
        return drawable != null ? a.i.j.l.a.e(drawable) : this.f1074f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1070b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f1070b.getConstantState());
        }
        this.f1072d.f1124a = getChangingConfigurations();
        return this.f1072d;
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1072d.f1125b.f1119k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1072d.f1125b.f1118j;
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void h(boolean z) {
        this.f1076h = z;
    }

    public final void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0017h c0017h = this.f1072d;
        g gVar = c0017h.f1125b;
        c0017h.f1127d = g(a.i.i.e.g.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = a.i.i.e.g.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            c0017h.f1126c = colorStateListG;
        }
        c0017h.f1128e = a.i.i.e.g.e(typedArray, xmlPullParser, "autoMirrored", 5, c0017h.f1128e);
        gVar.f1120l = a.i.i.e.g.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f1120l);
        float fJ = a.i.i.e.g.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f1121m);
        gVar.f1121m = fJ;
        if (gVar.f1120l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f1118j = typedArray.getDimension(3, gVar.f1118j);
        float dimension = typedArray.getDimension(2, gVar.f1119k);
        gVar.f1119k = dimension;
        if (gVar.f1118j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(a.i.i.e.g.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f1123o = string;
            gVar.q.put(string, gVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0017h c0017h = this.f1072d;
        c0017h.f1125b = new g();
        TypedArray typedArrayS = a.i.i.e.g.s(resources, theme, attributeSet, a.c0.a.a.a.f1041a);
        i(typedArrayS, xmlPullParser, theme);
        typedArrayS.recycle();
        c0017h.f1124a = getChangingConfigurations();
        c0017h.f1134k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f1073e = j(this.f1073e, c0017h.f1126c, c0017h.f1127d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1070b;
        return drawable != null ? a.i.j.l.a.h(drawable) : this.f1072d.f1128e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0017h c0017h;
        ColorStateList colorStateList;
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c0017h = this.f1072d) != null && (c0017h.g() || ((colorStateList = this.f1072d.f1126c) != null && colorStateList.isStateful())));
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1075g && super.mutate() == this) {
            this.f1072d = new C0017h(this.f1072d);
            this.f1075g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0017h c0017h = this.f1072d;
        ColorStateList colorStateList = c0017h.f1126c;
        if (colorStateList != null && (mode = c0017h.f1127d) != null) {
            this.f1073e = j(this.f1073e, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!c0017h.g() || !c0017h.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f1072d.f1125b.getRootAlpha() != i2) {
            this.f1072d.f1125b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.j(drawable, z);
        } else {
            this.f1072d.f1128e = z;
        }
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1074f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // a.c0.a.a.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTint(int i2) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.o(drawable, colorStateList);
            return;
        }
        C0017h c0017h = this.f1072d;
        if (c0017h.f1126c != colorStateList) {
            c0017h.f1126c = colorStateList;
            this.f1073e = j(this.f1073e, colorStateList, c0017h.f1127d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            a.i.j.l.a.p(drawable, mode);
            return;
        }
        C0017h c0017h = this.f1072d;
        if (c0017h.f1127d != mode) {
            c0017h.f1127d = mode;
            this.f1073e = j(this.f1073e, c0017h.f1126c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1070b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1070b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
