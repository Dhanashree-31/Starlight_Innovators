package com.example.starlight_innovators.module;

import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.sceneform.ux.ArFragment;

public class FaceArFragment extends ArFragment {

    @Override
    protected Config getSessionConfiguration(Session session) {
        Config config = new Config(session);
        config.setAugmentedFaceMode(Config.AugmentedFaceMode.MESH3D);
        this.getArSceneView().setupSession(session);
        return config;
    }

    @Override
    public boolean isArRequired() {
        return true;
    }

    @Override
    public String[] getAdditionalPermissions() {
        String[] additionalPermissions = super.getAdditionalPermissions();
        int permissionLength = additionalPermissions != null ? additionalPermissions.length : 0;
        String[] permissions = new String[permissionLength + 1];
        permissions[0] = android.Manifest.permission.CAMERA;
        if (permissionLength > 0) {
            System.arraycopy(additionalPermissions, 0, permissions, 1, permissionLength);
        }
        return permissions;
    }

    public void setOnFaceArFragmentListener(Object o) {

    }
}
