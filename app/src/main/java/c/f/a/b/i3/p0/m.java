package c.f.a.b.i3.p0;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import c.f.a.b.j3.m0;
import c.f.a.b.j3.x0;
import c.f.b.b.x;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.CryptoRuntime;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, l> f9014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<String> f9015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f9016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f9017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f9018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9019f;

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[] f9020a = {Name.MARK, TransferTable.COLUMN_KEY, "metadata"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.b.u2.b f9021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<l> f9022c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f9024e;

        public a(c.f.a.b.u2.b bVar) {
            this.f9021b = bVar;
        }

        public static void j(c.f.a.b.u2.b bVar, String str) throws c.f.a.b.u2.a {
            try {
                String strN = n(str);
                SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    c.f.a.b.u2.d.c(writableDatabase, 1, str);
                    l(writableDatabase, strN);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new c.f.a.b.u2.a(e2);
            }
        }

        public static void l(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        public static String n(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void a() throws c.f.a.b.u2.a {
            j(this.f9021b, (String) c.f.a.b.j3.g.e(this.f9023d));
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void b(l lVar, boolean z) {
            if (z) {
                this.f9022c.delete(lVar.f9007a);
            } else {
                this.f9022c.put(lVar.f9007a, null);
            }
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void c(HashMap<String, l> map) throws c.f.a.b.u2.a {
            try {
                SQLiteDatabase writableDatabase = this.f9021b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o(writableDatabase);
                    Iterator<l> it = map.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f9022c.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new c.f.a.b.u2.a(e2);
            }
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void d(l lVar) {
            this.f9022c.put(lVar.f9007a, lVar);
        }

        @Override // c.f.a.b.i3.p0.m.c
        public boolean e() {
            return c.f.a.b.u2.d.b(this.f9021b.getReadableDatabase(), 1, (String) c.f.a.b.j3.g.e(this.f9023d)) != -1;
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void f(HashMap<String, l> map) throws c.f.a.b.u2.a {
            if (this.f9022c.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f9021b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i2 = 0; i2 < this.f9022c.size(); i2++) {
                    try {
                        l lVarValueAt = this.f9022c.valueAt(i2);
                        if (lVarValueAt == null) {
                            k(writableDatabase, this.f9022c.keyAt(i2));
                        } else {
                            i(writableDatabase, lVarValueAt);
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f9022c.clear();
            } catch (SQLException e2) {
                throw new c.f.a.b.u2.a(e2);
            }
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void g(long j2) {
            String hexString = Long.toHexString(j2);
            this.f9023d = hexString;
            this.f9024e = n(hexString);
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void h(HashMap<String, l> map, SparseArray<String> sparseArray) throws c.f.a.b.u2.a {
            c.f.a.b.j3.g.g(this.f9022c.size() == 0);
            try {
                if (c.f.a.b.u2.d.b(this.f9021b.getReadableDatabase(), 1, (String) c.f.a.b.j3.g.e(this.f9023d)) != 1) {
                    SQLiteDatabase writableDatabase = this.f9021b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        o(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursorM = m();
                while (cursorM.moveToNext()) {
                    try {
                        l lVar = new l(cursorM.getInt(0), (String) c.f.a.b.j3.g.e(cursorM.getString(1)), m.q(new DataInputStream(new ByteArrayInputStream(cursorM.getBlob(2)))));
                        map.put(lVar.f9008b, lVar);
                        sparseArray.put(lVar.f9007a, lVar.f9008b);
                    } finally {
                    }
                }
                cursorM.close();
            } catch (SQLiteException e2) {
                map.clear();
                sparseArray.clear();
                throw new c.f.a.b.u2.a(e2);
            }
        }

        public final void i(SQLiteDatabase sQLiteDatabase, l lVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m.t(lVar.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put(Name.MARK, Integer.valueOf(lVar.f9007a));
            contentValues.put(TransferTable.COLUMN_KEY, lVar.f9008b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) c.f.a.b.j3.g.e(this.f9024e), null, contentValues);
        }

        public final void k(SQLiteDatabase sQLiteDatabase, int i2) {
            sQLiteDatabase.delete((String) c.f.a.b.j3.g.e(this.f9024e), "id = ?", new String[]{Integer.toString(i2)});
        }

        public final Cursor m() {
            return this.f9021b.getReadableDatabase().query((String) c.f.a.b.j3.g.e(this.f9024e), f9020a, null, null, null, null, null);
        }

        public final void o(SQLiteDatabase sQLiteDatabase) throws c.f.a.b.u2.a {
            c.f.a.b.u2.d.d(sQLiteDatabase, 1, (String) c.f.a.b.j3.g.e(this.f9023d), 1);
            l(sQLiteDatabase, (String) c.f.a.b.j3.g.e(this.f9024e));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f9024e + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f9025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cipher f9026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SecretKeySpec f9027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SecureRandom f9028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c.f.a.b.j3.h f9029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public m0 f9031g;

        public b(File file, byte[] bArr, boolean z) {
            Cipher cipherI;
            SecretKeySpec secretKeySpec;
            c.f.a.b.j3.g.g((bArr == null && z) ? false : true);
            if (bArr != null) {
                c.f.a.b.j3.g.a(bArr.length == 16);
                try {
                    cipherI = m.i();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                    throw new IllegalStateException(e2);
                }
            } else {
                c.f.a.b.j3.g.a(!z);
                cipherI = null;
                secretKeySpec = null;
            }
            this.f9025a = z;
            this.f9026b = cipherI;
            this.f9027c = secretKeySpec;
            this.f9028d = z ? new SecureRandom() : null;
            this.f9029e = new c.f.a.b.j3.h(file);
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void a() {
            this.f9029e.a();
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void b(l lVar, boolean z) {
            this.f9030f = true;
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void c(HashMap<String, l> map) throws Throwable {
            m(map);
            this.f9030f = false;
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void d(l lVar) {
            this.f9030f = true;
        }

        @Override // c.f.a.b.i3.p0.m.c
        public boolean e() {
            return this.f9029e.c();
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void f(HashMap<String, l> map) throws Throwable {
            if (this.f9030f) {
                c(map);
            }
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void g(long j2) {
        }

        @Override // c.f.a.b.i3.p0.m.c
        public void h(HashMap<String, l> map, SparseArray<String> sparseArray) {
            c.f.a.b.j3.g.g(!this.f9030f);
            if (k(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f9029e.a();
        }

        public final int i(l lVar, int i2) {
            int iHashCode = (lVar.f9007a * 31) + lVar.f9008b.hashCode();
            if (i2 >= 2) {
                return (iHashCode * 31) + lVar.d().hashCode();
            }
            long jA = n.a(lVar.d());
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }

        public final l j(int i2, DataInputStream dataInputStream) throws IOException {
            q qVarQ;
            int i3 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i2 < 2) {
                long j2 = dataInputStream.readLong();
                p pVar = new p();
                p.g(pVar, j2);
                qVarQ = q.f9034a.e(pVar);
            } else {
                qVarQ = m.q(dataInputStream);
            }
            return new l(i3, utf, qVarQ);
        }

        public final boolean k(HashMap<String, l> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.f9029e.c()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f9029e.d());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i2 = dataInputStream2.readInt();
                    if (i2 >= 0 && i2 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f9026b == null) {
                                x0.o(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f9026b.init(2, (Key) x0.i(this.f9027c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f9026b));
                            } catch (InvalidAlgorithmParameterException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e3) {
                                e = e3;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f9025a) {
                            this.f9030f = true;
                        }
                        int i3 = dataInputStream2.readInt();
                        int i4 = 0;
                        for (int i5 = 0; i5 < i3; i5++) {
                            l lVarJ = j(i2, dataInputStream2);
                            map.put(lVarJ.f9008b, lVarJ);
                            sparseArray.put(lVarJ.f9007a, lVarJ.f9008b);
                            i4 += i(lVarJ, i2);
                        }
                        int i6 = dataInputStream2.readInt();
                        boolean z = dataInputStream2.read() == -1;
                        if (i6 == i4 && z) {
                            x0.o(dataInputStream2);
                            return true;
                        }
                        x0.o(dataInputStream2);
                        return false;
                    }
                    x0.o(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        x0.o(dataInputStream);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        x0.o(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final void l(l lVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(lVar.f9007a);
            dataOutputStream.writeUTF(lVar.f9008b);
            m.t(lVar.d(), dataOutputStream);
        }

        public final void m(HashMap<String, l> map) throws Throwable {
            m0 m0Var;
            DataOutputStream dataOutputStream;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream outputStreamF = this.f9029e.f();
                m0 m0Var2 = this.f9031g;
                if (m0Var2 == null) {
                    this.f9031g = new m0(outputStreamF);
                } else {
                    m0Var2.d(outputStreamF);
                }
                m0Var = this.f9031g;
                dataOutputStream = new DataOutputStream(m0Var);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(2);
                int i2 = 0;
                dataOutputStream.writeInt(this.f9025a ? 1 : 0);
                if (this.f9025a) {
                    byte[] bArr = new byte[16];
                    ((SecureRandom) x0.i(this.f9028d)).nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        ((Cipher) x0.i(this.f9026b)).init(1, (Key) x0.i(this.f9027c), new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(m0Var, this.f9026b));
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(map.size());
                for (l lVar : map.values()) {
                    l(lVar, dataOutputStream);
                    i2 += i(lVar, 2);
                }
                dataOutputStream.writeInt(i2);
                this.f9029e.b(dataOutputStream);
                x0.o(null);
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream2 = dataOutputStream;
                x0.o(dataOutputStream2);
                throw th;
            }
        }
    }

    public interface c {
        void a();

        void b(l lVar, boolean z);

        void c(HashMap<String, l> map);

        void d(l lVar);

        boolean e();

        void f(HashMap<String, l> map);

        void g(long j2);

        void h(HashMap<String, l> map, SparseArray<String> sparseArray);
    }

    public m(c.f.a.b.u2.b bVar, File file, byte[] bArr, boolean z, boolean z2) {
        c.f.a.b.j3.g.g((bVar == null && file == null) ? false : true);
        this.f9014a = new HashMap<>();
        this.f9015b = new SparseArray<>();
        this.f9016c = new SparseBooleanArray();
        this.f9017d = new SparseBooleanArray();
        a aVar = bVar != null ? new a(bVar) : null;
        b bVar2 = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z) : null;
        if (aVar == null || (bVar2 != null && z2)) {
            this.f9018e = (c) x0.i(bVar2);
            this.f9019f = aVar;
        } else {
            this.f9018e = aVar;
            this.f9019f = bVar2;
        }
    }

    @SuppressLint({"GetInstance"})
    public static Cipher i() {
        if (x0.f9296a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", CryptoRuntime.BOUNCY_CASTLE_PROVIDER);
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public static int l(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i2 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i2 < size && i2 == sparseArray.keyAt(i2)) {
            i2++;
        }
        return i2;
    }

    public static boolean o(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    public static q q(DataInputStream dataInputStream) throws IOException {
        int i2 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String utf = dataInputStream.readUTF();
            int i4 = dataInputStream.readInt();
            if (i4 < 0) {
                throw new IOException("Invalid value size: " + i4);
            }
            int iMin = Math.min(i4, 10485760);
            byte[] bArrCopyOf = x0.f9301f;
            int i5 = 0;
            while (i5 != i4) {
                int i6 = i5 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                dataInputStream.readFully(bArrCopyOf, i5, iMin);
                iMin = Math.min(i4 - i6, 10485760);
                i5 = i6;
            }
            map.put(utf, bArrCopyOf);
        }
        return new q(map);
    }

    public static void t(q qVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setF = qVar.f();
        dataOutputStream.writeInt(setF.size());
        for (Map.Entry<String, byte[]> entry : setF) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public final l d(String str) {
        int iL = l(this.f9015b);
        l lVar = new l(iL, str);
        this.f9014a.put(str, lVar);
        this.f9015b.put(iL, str);
        this.f9017d.put(iL, true);
        this.f9018e.d(lVar);
        return lVar;
    }

    public void e(String str, p pVar) {
        l lVarM = m(str);
        if (lVarM.b(pVar)) {
            this.f9018e.d(lVarM);
        }
    }

    public int f(String str) {
        return m(str).f9007a;
    }

    public l g(String str) {
        return this.f9014a.get(str);
    }

    public Collection<l> h() {
        return Collections.unmodifiableCollection(this.f9014a.values());
    }

    public o j(String str) {
        l lVarG = g(str);
        return lVarG != null ? lVarG.d() : q.f9034a;
    }

    public String k(int i2) {
        return this.f9015b.get(i2);
    }

    public l m(String str) {
        l lVar = this.f9014a.get(str);
        return lVar == null ? d(str) : lVar;
    }

    public void n(long j2) {
        c cVar;
        this.f9018e.g(j2);
        c cVar2 = this.f9019f;
        if (cVar2 != null) {
            cVar2.g(j2);
        }
        if (this.f9018e.e() || (cVar = this.f9019f) == null || !cVar.e()) {
            this.f9018e.h(this.f9014a, this.f9015b);
        } else {
            this.f9019f.h(this.f9014a, this.f9015b);
            this.f9018e.c(this.f9014a);
        }
        c cVar3 = this.f9019f;
        if (cVar3 != null) {
            cVar3.a();
            this.f9019f = null;
        }
    }

    public void p(String str) {
        l lVar = this.f9014a.get(str);
        if (lVar != null && lVar.g() && lVar.i()) {
            this.f9014a.remove(str);
            int i2 = lVar.f9007a;
            boolean z = this.f9017d.get(i2);
            this.f9018e.b(lVar, z);
            SparseArray<String> sparseArray = this.f9015b;
            if (z) {
                sparseArray.remove(i2);
                this.f9017d.delete(i2);
            } else {
                sparseArray.put(i2, null);
                this.f9016c.put(i2, true);
            }
        }
    }

    public void r() {
        Iterator it = x.B(this.f9014a.keySet()).iterator();
        while (it.hasNext()) {
            p((String) it.next());
        }
    }

    public void s() {
        this.f9018e.f(this.f9014a);
        int size = this.f9016c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f9015b.remove(this.f9016c.keyAt(i2));
        }
        this.f9016c.clear();
        this.f9017d.clear();
    }
}
