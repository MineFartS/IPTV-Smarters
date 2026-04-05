package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.utility.LoadingGearSpinner;

/* JADX INFO: loaded from: classes2.dex */
public class ImportM3uActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImportM3uActivity f25704b;

    public ImportM3uActivity_ViewBinding(ImportM3uActivity importM3uActivity, View view) {
        this.f25704b = importM3uActivity;
        importM3uActivity.tvSettingStreams = (TextView) c.c(view, R.id.tv_setting_streams, "field 'tvSettingStreams'", TextView.class);
        importM3uActivity.tvImportingStreams = (TextView) c.c(view, R.id.tv_importing_streams, "field 'tvImportingStreams'", TextView.class);
        importM3uActivity.progressBar = (ProgressBar) c.c(view, R.id.progressBar, "field 'progressBar'", ProgressBar.class);
        importM3uActivity.tvPercentage = (TextView) c.c(view, R.id.tv_percentage, "field 'tvPercentage'", TextView.class);
        importM3uActivity.tvCountings = (TextView) c.c(view, R.id.tv_countings, "field 'tvCountings'", TextView.class);
        importM3uActivity.rlImportProcess = (LinearLayout) c.c(view, R.id.rl_import_process, "field 'rlImportProcess'", LinearLayout.class);
        importM3uActivity.rlImportLayout = (RelativeLayout) c.c(view, R.id.rl_import_layout, "field 'rlImportLayout'", RelativeLayout.class);
        importM3uActivity.ivGearLoader = (LoadingGearSpinner) c.c(view, R.id.iv_gear_loader, "field 'ivGearLoader'", LoadingGearSpinner.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ImportM3uActivity importM3uActivity = this.f25704b;
        if (importM3uActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25704b = null;
        importM3uActivity.tvSettingStreams = null;
        importM3uActivity.tvImportingStreams = null;
        importM3uActivity.progressBar = null;
        importM3uActivity.tvPercentage = null;
        importM3uActivity.tvCountings = null;
        importM3uActivity.rlImportProcess = null;
        importM3uActivity.rlImportLayout = null;
        importM3uActivity.ivGearLoader = null;
    }
}
