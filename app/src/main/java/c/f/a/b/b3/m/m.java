package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import c.f.a.b.q1;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6591d;

    public static class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i2) {
            return new m[i2];
        }
    }

    public m(Parcel parcel) {
        super((String) x0.i(parcel.readString()));
        this.f6590c = parcel.readString();
        this.f6591d = (String) x0.i(parcel.readString());
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f6590c = str2;
        this.f6591d = str3;
    }

    public static List<Integer> b(String str) {
        int i2;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                i2 = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        i2 = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                i2 = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(i2));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return x0.b(this.f6579b, mVar.f6579b) && x0.b(this.f6590c, mVar.f6590c) && x0.b(this.f6591d, mVar.f6591d);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f6579b.hashCode()) * 31;
        String str = this.f6590c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6591d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // c.f.a.b.b3.m.i, c.f.a.b.b3.a.b
    public void populateMediaMetadata(q1.b bVar) {
        String str = this.f6579b;
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b2 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b2 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b2 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b2 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b2 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b2 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b2 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b2 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b2 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b2 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b2 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b2 = 11;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b2 = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b2 = DateTimeFieldType.HALFDAY_OF_DAY;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b2 = DateTimeFieldType.HOUR_OF_HALFDAY;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_HALFDAY;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_DAY;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b2 = DateTimeFieldType.HOUR_OF_DAY;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b2 = DateTimeFieldType.MINUTE_OF_DAY;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b2 = DateTimeFieldType.MINUTE_OF_HOUR;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b2 = DateTimeFieldType.SECOND_OF_DAY;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b2 = DateTimeFieldType.SECOND_OF_MINUTE;
                }
                break;
        }
        try {
            switch (b2) {
                case 0:
                case 10:
                    bVar.K(this.f6591d);
                    break;
                case 1:
                case 11:
                    bVar.M(this.f6591d);
                    break;
                case 2:
                case 12:
                    bVar.Q(Integer.valueOf(Integer.parseInt(this.f6591d.substring(2, 4)))).P(Integer.valueOf(Integer.parseInt(this.f6591d.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    bVar.L(this.f6591d);
                    break;
                case 4:
                case 18:
                    bVar.J(this.f6591d);
                    break;
                case 5:
                case 19:
                    bVar.N(this.f6591d);
                    break;
                case 6:
                case 20:
                    String[] strArrU0 = x0.U0(this.f6591d, "/");
                    bVar.X(Integer.valueOf(Integer.parseInt(strArrU0[0]))).W(strArrU0.length > 1 ? Integer.valueOf(Integer.parseInt(strArrU0[1])) : null);
                    break;
                case 7:
                case 16:
                    bVar.V(this.f6591d);
                    break;
                case 8:
                case 15:
                    bVar.Y(this.f6591d);
                    break;
                case 9:
                case 21:
                    bVar.R(Integer.valueOf(Integer.parseInt(this.f6591d)));
                    break;
                case 13:
                    List<Integer> listB = b(this.f6591d);
                    int size = listB.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.P(listB.get(2));
                            }
                        }
                        bVar.Q(listB.get(1));
                    }
                    bVar.R(listB.get(0));
                    break;
                case 14:
                    List<Integer> listB2 = b(this.f6591d);
                    int size2 = listB2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.S(listB2.get(2));
                            }
                        }
                        bVar.T(listB2.get(1));
                    }
                    bVar.U(listB2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // c.f.a.b.b3.m.i
    public String toString() {
        return this.f6579b + ": description=" + this.f6590c + ": value=" + this.f6591d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6579b);
        parcel.writeString(this.f6590c);
        parcel.writeString(this.f6591d);
    }
}
