package a.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1511b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1512c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray<a> f1513d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<d> f1514e = new SparseArray<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<b> f1516b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f1518d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f1517c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.E4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.F4) {
                    this.f1515a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1515a);
                } else if (index == i.G4) {
                    this.f1517c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1517c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1517c);
                    context.getResources().getResourceName(this.f1517c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1518d = dVar;
                        dVar.f(context, this.f1517c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f1516b.add(bVar);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f1519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f1520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f1524f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f1519a = Float.NaN;
            this.f1520b = Float.NaN;
            this.f1521c = Float.NaN;
            this.f1522d = Float.NaN;
            this.f1523e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.a5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.b5) {
                    this.f1523e = typedArrayObtainStyledAttributes.getResourceId(index, this.f1523e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1523e);
                    context.getResources().getResourceName(this.f1523e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1524f = dVar;
                        dVar.f(context, this.f1523e);
                    }
                } else if (index == i.c5) {
                    this.f1522d = typedArrayObtainStyledAttributes.getDimension(index, this.f1522d);
                } else if (index == i.d5) {
                    this.f1520b = typedArrayObtainStyledAttributes.getDimension(index, this.f1520b);
                } else if (index == i.e5) {
                    this.f1521c = typedArrayObtainStyledAttributes.getDimension(index, this.f1521c);
                } else if (index == i.f5) {
                    this.f1519a = typedArrayObtainStyledAttributes.getDimension(index, this.f1519a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public c(Context context, ConstraintLayout constraintLayout, int i2) {
        this.f1510a = constraintLayout;
        a(context, i2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    byte b2 = -1;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b2 = 4;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = 2;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b2 = 1;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b2 = 0;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b2 = 3;
                            }
                            break;
                    }
                    if (b2 != 0 && b2 != 1) {
                        if (b2 == 2) {
                            aVar = new a(context, xml);
                            this.f1513d.put(aVar.f1515a, aVar);
                        } else if (b2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (b2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (Name.MARK.equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), Name.MARK, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.n(context, xmlPullParser);
                this.f1514e.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}
