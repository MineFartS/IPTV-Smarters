package a.j.a;

import a.j.a.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cursor f2165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f2166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0048a f2168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DataSetObserver f2169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a.j.a.b f2170i;

    /* JADX INFO: renamed from: a.j.a.a$a, reason: collision with other inner class name */
    public class C0048a extends ContentObserver {
        public C0048a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            a.this.i();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f2163b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f2163b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorJ = j(cursor);
        if (cursorJ != null) {
            cursorJ.close();
        }
    }

    @Override // a.j.a.b.a
    public Cursor b() {
        return this.f2165d;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i2) {
        b bVar;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f2164c = true;
        } else {
            this.f2164c = false;
        }
        boolean z = cursor != null;
        this.f2165d = cursor;
        this.f2163b = z;
        this.f2166e = context;
        this.f2167f = z ? cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID) : -1;
        if ((i2 & 2) == 2) {
            this.f2168g = new C0048a();
            bVar = new b();
        } else {
            bVar = null;
            this.f2168g = null;
        }
        this.f2169h = bVar;
        if (z) {
            C0048a c0048a = this.f2168g;
            if (c0048a != null) {
                cursor.registerContentObserver(c0048a);
            }
            DataSetObserver dataSetObserver = this.f2169h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f2163b || (cursor = this.f2165d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f2163b) {
            return null;
        }
        this.f2165d.moveToPosition(i2);
        if (view == null) {
            view = g(this.f2166e, this.f2165d, viewGroup);
        }
        e(view, this.f2166e, this.f2165d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f2170i == null) {
            this.f2170i = new a.j.a.b(this);
        }
        return this.f2170i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f2163b || (cursor = this.f2165d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f2165d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f2163b && (cursor = this.f2165d) != null && cursor.moveToPosition(i2)) {
            return this.f2165d.getLong(this.f2167f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f2163b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f2165d.moveToPosition(i2)) {
            if (view == null) {
                view = h(this.f2166e, this.f2165d, viewGroup);
            }
            e(view, this.f2166e, this.f2165d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i2);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (!this.f2164c || (cursor = this.f2165d) == null || cursor.isClosed()) {
            return;
        }
        this.f2163b = this.f2165d.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f2165d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0048a c0048a = this.f2168g;
            if (c0048a != null) {
                cursor2.unregisterContentObserver(c0048a);
            }
            DataSetObserver dataSetObserver = this.f2169h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2165d = cursor;
        if (cursor != null) {
            C0048a c0048a2 = this.f2168g;
            if (c0048a2 != null) {
                cursor.registerContentObserver(c0048a2);
            }
            DataSetObserver dataSetObserver2 = this.f2169h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f2167f = cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID);
            this.f2163b = true;
            notifyDataSetChanged();
        } else {
            this.f2167f = -1;
            this.f2163b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
