package com.amplifyframework.core;

import android.content.Context;
import android.content.res.Resources;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Resources {

    public static final class ResourceLoadingException extends Exception {
        private static final long serialVersionUID = 1;

        public ResourceLoadingException(String str, Throwable th) {
            super(str, th);
        }
    }

    private Resources() {
    }

    public static int getRawResourceId(Context context, String str) throws ResourceLoadingException {
        try {
            return context.getResources().getIdentifier(str, "raw", context.getPackageName());
        } catch (Exception e2) {
            throw new ResourceLoadingException("No such resource with identifier " + str, e2);
        }
    }

    public static JSONObject readJsonResource(Context context, String str) {
        return readJsonResourceFromId(context, getRawResourceId(context, str));
    }

    public static JSONObject readJsonResourceFromId(Context context, int i2) throws ResourceLoadingException {
        try {
            Scanner scanner = new Scanner(context.getResources().openRawResource(i2));
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
            scanner.close();
            try {
                return new JSONObject(sb.toString());
            } catch (JSONException e2) {
                throw new ResourceLoadingException("Failed to read the resource with ID " + i2 + InstructionFileId.DOT, e2);
            }
        } catch (Resources.NotFoundException e3) {
            throw new ResourceLoadingException("No such resource with ID = " + i2, e3);
        }
    }
}
