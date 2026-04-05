package c.f.d;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public g d() {
        if (s()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public m f() {
        if (v()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public o g() {
        if (x()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean s() {
        return this instanceof g;
    }

    public boolean t() {
        return this instanceof l;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c.f.d.y.c cVar = new c.f.d.y.c(stringWriter);
            cVar.c0(true);
            c.f.d.w.l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean v() {
        return this instanceof m;
    }

    public boolean x() {
        return this instanceof o;
    }
}
