package a.b.p.j;

import a.b.p.j.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f458c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f462g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f460e = z;
        this.f461f = layoutInflater;
        this.f457b = gVar;
        this.f462g = i2;
        a();
    }

    public void a() {
        i iVarV = this.f457b.v();
        if (iVarV != null) {
            ArrayList<i> arrayListZ = this.f457b.z();
            int size = arrayListZ.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayListZ.get(i2) == iVarV) {
                    this.f458c = i2;
                    return;
                }
            }
        }
        this.f458c = -1;
    }

    public g b() {
        return this.f457b;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i2) {
        ArrayList<i> arrayListZ = this.f460e ? this.f457b.z() : this.f457b.E();
        int i3 = this.f458c;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return arrayListZ.get(i2);
    }

    public void d(boolean z) {
        this.f459d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> arrayListZ = this.f460e ? this.f457b.z() : this.f457b.E();
        int i2 = this.f458c;
        int size = arrayListZ.size();
        return i2 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f461f.inflate(this.f462g, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f457b.F() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f459d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
