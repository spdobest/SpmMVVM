package mvvm.nstech.spm_mvvm.dto;

/**
 * Created by webwerks on 24/4/17.
 */

public class MyInfoModel {
    String name;
    String email;
    String mobile;
    String profileImage;
    boolean isActive;

    public MyInfoModel(String name, String email, String mobile, String profileImage,boolean isActive) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.profileImage = profileImage;
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
