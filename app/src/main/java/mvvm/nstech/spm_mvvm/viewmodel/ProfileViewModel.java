package mvvm.nstech.spm_mvvm.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.os.Handler;

import mvvm.nstech.spm_mvvm.BR;

public class ProfileViewModel extends BaseObservable {
 
    public static final int LOADING_SHORT = 1000;
 
    private boolean isLoaded;
    private boolean isFriend;
 
    public ProfileViewModel(boolean isFriend) {
        this.isFriend = isFriend;
        this.isLoaded = true;
    }
 
    @Bindable
    public boolean getIsLoaded() {
        return this.isLoaded;
    }
 
    public void setIsLoaded(boolean isLoaded) {
        this.isLoaded = isLoaded;
        notifyPropertyChanged(BR.isLoaded);
    }
 
    @Bindable
    public boolean getIsFriend() {
        return this.isFriend;
    }
 
    public void setIsFriend(boolean isFriend) {
        this.isFriend = isFriend;
        notifyPropertyChanged(BR.isFriend);
    }
 
    public void changeFriendshipStatus() {
//        load(() -> setIsFriend(!isFriend));

        load(new Runnable() {
            @Override
            public void run() {
                setIsFriend(!isFriend);
            }
        });
    }
 
    private void load(Runnable onLoaded) {
        setIsLoaded(false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setIsFriend(!isFriend);
                setIsLoaded(true);
            }
        },LOADING_SHORT);
    }
}