package a.d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f1186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1192k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new a.f.a(), new a.f.a(), new a.f.a());
    }

    public c(Parcel parcel, int i2, int i3, String str, a.f.a<String, Method> aVar, a.f.a<String, Method> aVar2, a.f.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1185d = new SparseIntArray();
        this.f1190i = -1;
        this.f1191j = 0;
        this.f1192k = -1;
        this.f1186e = parcel;
        this.f1187f = i2;
        this.f1188g = i3;
        this.f1191j = i2;
        this.f1189h = str;
    }

    @Override // a.d0.b
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f1186e.writeInt(-1);
        } else {
            this.f1186e.writeInt(bArr.length);
            this.f1186e.writeByteArray(bArr);
        }
    }

    @Override // a.d0.b
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1186e, 0);
    }

    @Override // a.d0.b
    public void E(int i2) {
        this.f1186e.writeInt(i2);
    }

    @Override // a.d0.b
    public void G(Parcelable parcelable) {
        this.f1186e.writeParcelable(parcelable, 0);
    }

    @Override // a.d0.b
    public void I(String str) {
        this.f1186e.writeString(str);
    }

    @Override // a.d0.b
    public void a() {
        int i2 = this.f1190i;
        if (i2 >= 0) {
            int i3 = this.f1185d.get(i2);
            int iDataPosition = this.f1186e.dataPosition();
            this.f1186e.setDataPosition(i3);
            this.f1186e.writeInt(iDataPosition - i3);
            this.f1186e.setDataPosition(iDataPosition);
        }
    }

    @Override // a.d0.b
    public b b() {
        Parcel parcel = this.f1186e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f1191j;
        if (i2 == this.f1187f) {
            i2 = this.f1188g;
        }
        return new c(parcel, iDataPosition, i2, this.f1189h + "  ", this.f1182a, this.f1183b, this.f1184c);
    }

    @Override // a.d0.b
    public boolean g() {
        return this.f1186e.readInt() != 0;
    }

    @Override // a.d0.b
    public byte[] i() {
        int i2 = this.f1186e.readInt();
        if (i2 < 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        this.f1186e.readByteArray(bArr);
        return bArr;
    }

    @Override // a.d0.b
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1186e);
    }

    @Override // a.d0.b
    public boolean m(int i2) {
        while (this.f1191j < this.f1188g) {
            int i3 = this.f1192k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f1186e.setDataPosition(this.f1191j);
            int i4 = this.f1186e.readInt();
            this.f1192k = this.f1186e.readInt();
            this.f1191j += i4;
        }
        return this.f1192k == i2;
    }

    @Override // a.d0.b
    public int o() {
        return this.f1186e.readInt();
    }

    @Override // a.d0.b
    public <T extends Parcelable> T q() {
        return (T) this.f1186e.readParcelable(c.class.getClassLoader());
    }

    @Override // a.d0.b
    public String s() {
        return this.f1186e.readString();
    }

    @Override // a.d0.b
    public void w(int i2) {
        a();
        this.f1190i = i2;
        this.f1185d.put(i2, this.f1186e.dataPosition());
        E(0);
        E(i2);
    }

    @Override // a.d0.b
    public void y(boolean z) {
        this.f1186e.writeInt(z ? 1 : 0);
    }
}
