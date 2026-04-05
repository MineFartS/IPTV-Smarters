package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class BackupAndRestoreActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BackupAndRestoreActivity f25421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25423d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BackupAndRestoreActivity f25424d;

        public a(BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f25424d = backupAndRestoreActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25424d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BackupAndRestoreActivity f25426d;

        public b(BackupAndRestoreActivity backupAndRestoreActivity) {
            this.f25426d = backupAndRestoreActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25426d.onViewClicked(view);
        }
    }

    public BackupAndRestoreActivity_ViewBinding(BackupAndRestoreActivity backupAndRestoreActivity, View view) {
        this.f25421b = backupAndRestoreActivity;
        backupAndRestoreActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        backupAndRestoreActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        View viewB = c.b(view, R.id.bt_backup_now, "field 'btSaveChanges' and method 'onViewClicked'");
        backupAndRestoreActivity.btSaveChanges = (Button) c.a(viewB, R.id.bt_backup_now, "field 'btSaveChanges'", Button.class);
        this.f25422c = viewB;
        viewB.setOnClickListener(new a(backupAndRestoreActivity));
        View viewB2 = c.b(view, R.id.bt_restore_from_cloud, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        backupAndRestoreActivity.btnBackPlayerselection = (Button) c.a(viewB2, R.id.bt_restore_from_cloud, "field 'btnBackPlayerselection'", Button.class);
        this.f25423d = viewB2;
        viewB2.setOnClickListener(new b(backupAndRestoreActivity));
        backupAndRestoreActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        backupAndRestoreActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        backupAndRestoreActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        BackupAndRestoreActivity backupAndRestoreActivity = this.f25421b;
        if (backupAndRestoreActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25421b = null;
        backupAndRestoreActivity.toolbar = null;
        backupAndRestoreActivity.appbarToolbar = null;
        backupAndRestoreActivity.btSaveChanges = null;
        backupAndRestoreActivity.btnBackPlayerselection = null;
        backupAndRestoreActivity.date = null;
        backupAndRestoreActivity.time = null;
        backupAndRestoreActivity.logo = null;
        this.f25422c.setOnClickListener(null);
        this.f25422c = null;
        this.f25423d.setOnClickListener(null);
        this.f25423d = null;
    }
}
