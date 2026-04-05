package m.a.a;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class e extends View.BaseSavedState {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[][] f31118b;

    public static class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i2) {
            return new e[i2];
        }
    }

    public e(Parcel parcel) {
        super(parcel);
        this.f31118b = new long[parcel.readInt()][];
        int i2 = 0;
        while (true) {
            long[][] jArr = this.f31118b;
            if (i2 >= jArr.length) {
                return;
            }
            jArr[i2] = parcel.createLongArray();
            i2++;
        }
    }

    public /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
    }

    public e(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f31118b = new long[drawableArr.length][];
        for (int i2 = 0; i2 < drawableArr.length; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable instanceof b) {
                this.f31118b[i2] = ((b) drawable).f31106h.j();
            } else {
                this.f31118b[i2] = null;
            }
        }
    }

    public void b(Drawable drawable, int i2) {
        if (this.f31118b[i2] == null || !(drawable instanceof b)) {
            return;
        }
        ((b) drawable).j(r3.f31106h.s(r0[i2], r3.f31105g));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f31118b.length);
        for (long[] jArr : this.f31118b) {
            parcel.writeLongArray(jArr);
        }
    }
}
