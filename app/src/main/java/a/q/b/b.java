package a.q.b;

import a.i.n.h;
import a.q.b.c;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b extends a<Cursor> {
    public final c<Cursor>.a p;
    public Uri q;
    public String[] r;
    public String s;
    public String[] t;
    public String u;
    public Cursor v;
    public a.i.n.b w;

    public b(Context context) {
        super(context);
        this.p = new c.a();
    }

    @Override // a.q.b.a
    public void A() {
        super.A();
        synchronized (this) {
            a.i.n.b bVar = this.w;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // a.q.b.c
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.v;
        this.v = cursor;
        if (l()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // a.q.b.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Cursor F() {
        synchronized (this) {
            if (E()) {
                throw new h();
            }
            this.w = new a.i.n.b();
        }
        try {
            Cursor cursorA = a.i.i.a.a(i().getContentResolver(), this.q, this.r, this.s, this.t, this.u, this.w);
            if (cursorA != null) {
                try {
                    cursorA.getCount();
                    cursorA.registerContentObserver(this.p);
                } catch (RuntimeException e2) {
                    cursorA.close();
                    throw e2;
                }
            }
            synchronized (this) {
                this.w = null;
            }
            return cursorA;
        } catch (Throwable th) {
            synchronized (this) {
                this.w = null;
                throw th;
            }
        }
    }

    @Override // a.q.b.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void G(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void L(String[] strArr) {
        this.r = strArr;
    }

    public void M(String str) {
        this.s = str;
    }

    public void N(String[] strArr) {
        this.t = strArr;
    }

    public void O(String str) {
        this.u = str;
    }

    public void P(Uri uri) {
        this.q = uri;
    }

    @Override // a.q.b.a, a.q.b.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.r));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.t));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f3063h);
    }

    @Override // a.q.b.c
    public void q() {
        super.q();
        s();
        Cursor cursor = this.v;
        if (cursor != null && !cursor.isClosed()) {
            this.v.close();
        }
        this.v = null;
    }

    @Override // a.q.b.c
    public void r() {
        Cursor cursor = this.v;
        if (cursor != null) {
            f(cursor);
        }
        if (y() || this.v == null) {
            h();
        }
    }

    @Override // a.q.b.c
    public void s() {
        b();
    }
}
