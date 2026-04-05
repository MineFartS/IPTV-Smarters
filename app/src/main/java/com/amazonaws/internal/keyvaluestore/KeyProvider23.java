package com.amazonaws.internal.keyvaluestore;

import android.security.keystore.KeyGenParameterSpec;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
public class KeyProvider23 implements KeyProvider {
    private static final String AES_KEY_ALGORITHM = "AES";
    private static final String ANDROID_KEY_STORE_NAME = "AndroidKeyStore";
    public static final String AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX = ".aesKeyStoreAlias";
    private static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    private static final Log logger = LogFactory.getLog((Class<?>) KeyProvider23.class);

    @Override // com.amazonaws.internal.keyvaluestore.KeyProvider
    public synchronized void deleteKey(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry(str);
        } catch (Exception e2) {
            logger.error("Error in deleting the key for keyAlias: " + str + " from Android KeyStore.", e2);
        }
    }

    @Override // com.amazonaws.internal.keyvaluestore.KeyProvider
    public synchronized Key generateKey(String str) {
        SecretKey secretKeyGenerateKey;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias(str)) {
                throw new KeyNotGeneratedException("Key already exists for the keyAlias: " + str + " in AndroidKeyStore");
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).setRandomizedEncryptionRequired(false).build());
            secretKeyGenerateKey = keyGenerator.generateKey();
            logger.info("Generated the encryption key identified by the keyAlias: " + str + " using AndroidKeyStore");
        } catch (Exception e2) {
            throw new KeyNotGeneratedException("Cannot generate a key for alias: " + str + " in AndroidKeyStore", e2);
        }
        return secretKeyGenerateKey;
    }

    @Override // com.amazonaws.internal.keyvaluestore.KeyProvider
    public synchronized Key retrieveKey(String str) {
        Key key;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(str)) {
                throw new KeyNotFoundException("AndroidKeyStore does not contain the keyAlias: " + str);
            }
            Log log = logger;
            log.debug("AndroidKeyStore contains keyAlias " + str);
            log.debug("Loading the encryption key from Android KeyStore.");
            key = keyStore.getKey(str, null);
            if (key == null) {
                throw new KeyNotFoundException("Key is null even though the keyAlias: " + str + " is present in AndroidKeyStore");
            }
        } catch (Exception e2) {
            throw new KeyNotFoundException("Error occurred while accessing AndroidKeyStore to retrieve the key for keyAlias: " + str, e2);
        }
        return key;
    }
}
