package com.amazonaws.mobile.config;

import android.content.Context;
import com.amazonaws.ClientConfiguration;

/* JADX INFO: loaded from: classes.dex */
public interface AWSConfigurable {
    AWSConfigurable initialize(Context context);

    AWSConfigurable initialize(Context context, AWSConfiguration aWSConfiguration);

    AWSConfigurable initialize(Context context, AWSConfiguration aWSConfiguration, ClientConfiguration clientConfiguration);
}
