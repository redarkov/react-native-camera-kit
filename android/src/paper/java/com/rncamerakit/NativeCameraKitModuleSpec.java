
/**
 * This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * Do not edit this file as changes may cause incorrect behavior and will be lost
 * once the code is regenerated.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 *
 * @nolint
 */

package com.rncamerakit;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class NativeCameraKitModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
  public static final String NAME = "RNCameraKitModule";

  public NativeCameraKitModuleSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public @Nonnull String getName() {
    return NAME;
  }

  @ReactMethod
  @DoNotStrip
  public abstract void capture(@Nullable ReadableMap options, @Nullable Double tag, Promise promise);

  @ReactMethod
  @DoNotStrip
  public abstract void requestDeviceCameraAuthorization(Promise promise);

  @ReactMethod
  @DoNotStrip
  public abstract void checkDeviceCameraAuthorizationStatus(Promise promise);
}
