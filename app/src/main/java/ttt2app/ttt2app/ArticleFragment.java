package ttt2app.ttt2app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// EI KÄYTETÄ VIELÄ MIHINKÄÄN, JOS KOSKAAN MUUTENKAAN

public class ArticleFragment extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.activity_article, container, false); // article view muutettu activity_article
        }
}
