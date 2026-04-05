package a.j.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LayoutInflater f2176l;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f2175k = i2;
        this.f2174j = i2;
        this.f2176l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // a.j.a.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2176l.inflate(this.f2175k, viewGroup, false);
    }

    @Override // a.j.a.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2176l.inflate(this.f2174j, viewGroup, false);
    }
}
