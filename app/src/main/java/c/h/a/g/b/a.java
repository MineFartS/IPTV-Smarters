package c.h.a.g.b;

import a.q.a.a;
import a.q.b.c;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import c.h.a.g.c.e;
import c.h.a.g.c.f;
import c.h.a.g.d.d;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.ChartFactory;

/* JADX INFO: loaded from: classes2.dex */
public class a implements a.InterfaceC0062a<Cursor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f16763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f16764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f16766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a.q.b.b f16767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16768f;

    public a(Context context, b bVar, int i2) {
        this(context, bVar, i2, null);
    }

    public a(Context context, b bVar, int i2, String[] strArr) {
        this.f16765c = 0;
        this.f16763a = new WeakReference<>(context);
        this.f16764b = bVar;
        this.f16765c = i2;
        this.f16766d = strArr;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f16768f = e(strArr);
    }

    @Override // a.q.a.a.InterfaceC0062a
    public c<Cursor> b(int i2, Bundle bundle) {
        a.q.b.b cVar;
        int i3 = this.f16765c;
        if (i3 == 0) {
            cVar = new c.h.a.g.d.c(this.f16763a.get());
        } else if (i3 == 1) {
            cVar = new d(this.f16763a.get());
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    cVar = new c.h.a.g.d.b(this.f16763a.get());
                }
                return this.f16767e;
            }
            cVar = new c.h.a.g.d.a(this.f16763a.get());
        }
        this.f16767e = cVar;
        return this.f16767e;
    }

    @Override // a.q.a.a.InterfaceC0062a
    public void c(c<Cursor> cVar) {
    }

    public final boolean d(String str) {
        return Pattern.compile(this.f16768f, 2).matcher(c.h.a.d.b(str)).matches();
    }

    public final String e(String[] strArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (i2 == 0) {
                str = strArr[i2];
            } else {
                sb.append("|\\.");
                str = strArr[i2];
            }
            sb.append(str.replace(InstructionFileId.DOT, BuildConfig.FLAVOR));
        }
        return ".+(\\." + sb.toString() + ")$";
    }

    public final void f(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            c.h.a.g.c.a aVar = new c.h.a.g.c.a();
            aVar.z(cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID)));
            aVar.A(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
            aVar.C(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
            aVar.G(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
            aVar.y(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
            aVar.I(cursor.getLong(cursor.getColumnIndexOrThrow("duration")));
            c.h.a.g.c.c cVar = new c.h.a.g.c.c();
            cVar.f(c.h.a.d.b(c.h.a.d.c(aVar.q())));
            cVar.g(c.h.a.d.c(aVar.q()));
            if (arrayList.contains(cVar)) {
                ((c.h.a.g.c.c) arrayList.get(arrayList.indexOf(cVar))).a(aVar);
            } else {
                cVar.a(aVar);
                arrayList.add(cVar);
            }
        }
        b bVar = this.f16764b;
        if (bVar != null) {
            bVar.a(arrayList);
        }
    }

    public final void g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            if (string != null && d(string)) {
                e eVar = new e();
                eVar.z(cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID)));
                eVar.A(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
                eVar.C(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
                eVar.G(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
                eVar.y(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
                eVar.I(cursor.getString(cursor.getColumnIndexOrThrow("mime_type")));
                c.h.a.g.c.c cVar = new c.h.a.g.c.c();
                cVar.f(c.h.a.d.b(c.h.a.d.c(eVar.q())));
                cVar.g(c.h.a.d.c(eVar.q()));
                if (arrayList.contains(cVar)) {
                    ((c.h.a.g.c.c) arrayList.get(arrayList.indexOf(cVar))).a(eVar);
                } else {
                    cVar.a(eVar);
                    arrayList.add(cVar);
                }
            }
        }
        b bVar = this.f16764b;
        if (bVar != null) {
            bVar.a(arrayList);
        }
    }

    public final void h(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            c.h.a.g.c.d dVar = new c.h.a.g.c.d();
            dVar.z(cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID)));
            dVar.A(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
            dVar.C(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
            dVar.G(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
            dVar.u(cursor.getString(cursor.getColumnIndexOrThrow("bucket_id")));
            dVar.w(cursor.getString(cursor.getColumnIndexOrThrow("bucket_display_name")));
            dVar.y(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
            dVar.H(cursor.getInt(cursor.getColumnIndexOrThrow("orientation")));
            c.h.a.g.c.c cVar = new c.h.a.g.c.c();
            cVar.e(dVar.l());
            cVar.f(dVar.m());
            cVar.g(c.h.a.d.c(dVar.q()));
            if (arrayList.contains(cVar)) {
                ((c.h.a.g.c.c) arrayList.get(arrayList.indexOf(cVar))).a(dVar);
            } else {
                cVar.a(dVar);
                arrayList.add(cVar);
            }
        }
        b bVar = this.f16764b;
        if (bVar != null) {
            bVar.a(arrayList);
        }
    }

    @Override // a.q.a.a.InterfaceC0062a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(c<Cursor> cVar, Cursor cursor) {
        if (cursor == null) {
            return;
        }
        int i2 = this.f16765c;
        if (i2 == 0) {
            h(cursor);
            return;
        }
        if (i2 == 1) {
            j(cursor);
        } else if (i2 == 2) {
            f(cursor);
        } else {
            if (i2 != 3) {
                return;
            }
            g(cursor);
        }
    }

    public final void j(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.getPosition() != -1) {
            cursor.moveToPosition(-1);
        }
        while (cursor.moveToNext()) {
            f fVar = new f();
            fVar.z(cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID)));
            fVar.A(cursor.getString(cursor.getColumnIndexOrThrow(ChartFactory.TITLE)));
            fVar.C(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
            fVar.G(cursor.getLong(cursor.getColumnIndexOrThrow("_size")));
            fVar.u(cursor.getString(cursor.getColumnIndexOrThrow("bucket_id")));
            fVar.w(cursor.getString(cursor.getColumnIndexOrThrow("bucket_display_name")));
            fVar.y(cursor.getLong(cursor.getColumnIndexOrThrow("date_added")));
            fVar.J(cursor.getLong(cursor.getColumnIndexOrThrow("duration")));
            c.h.a.g.c.c cVar = new c.h.a.g.c.c();
            cVar.e(fVar.l());
            cVar.f(fVar.m());
            cVar.g(c.h.a.d.c(fVar.q()));
            if (arrayList.contains(cVar)) {
                ((c.h.a.g.c.c) arrayList.get(arrayList.indexOf(cVar))).a(fVar);
            } else {
                cVar.a(fVar);
                arrayList.add(cVar);
            }
        }
        b bVar = this.f16764b;
        if (bVar != null) {
            bVar.a(arrayList);
        }
    }
}
