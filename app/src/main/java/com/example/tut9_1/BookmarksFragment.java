package com.example.tut9_1;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class BookmarksFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BookmarksFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BookmarksFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BookmarksFragment newInstance(String param1, String param2) {
        BookmarksFragment fragment = new BookmarksFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //     View view = inflater.inflate(R.layout.fragment_web_view, container, false);
        View view = inflater.inflate(R.layout.fragment_bookmarks, container, false);
        //  LinearLayout fragmen1 = view.findViewById(R.id.fragmen1);
        ImageButton btn_zing = (ImageButton) view.findViewById(R.id.im_zing);
        ImageButton btn_fb = (ImageButton) view.findViewById(R.id.im_fb);
        ImageButton btn_gg = (ImageButton) view.findViewById(R.id.im_gg);
        ImageButton btn_bz = (ImageButton) view.findViewById(R.id.im_bluezone);


        btn_zing.setOnClickListener(this);
        btn_bz.setOnClickListener(this);
        btn_gg.setOnClickListener(this);
        btn_fb.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {

            // In landscape
            switch (v.getId()) {
                case R.id.im_gg:

                    FragmentManager managerGG = getFragmentManager();
                    Fragment fragmentGG = new WebViewFragment();

                    Bundle argsGG = new Bundle();
                    argsGG.putString("KEY", "https://www.google.com/"); // putInt, putDouble...
                    fragmentGG.setArguments(argsGG);
                    managerGG.beginTransaction()
                            .replace(R.id.webcontain_land, fragmentGG)
                            .addToBackStack("back")
                            .commit();
                    break;
                case R.id.im_bluezone:
                    FragmentManager managerBZ = getFragmentManager();
                    Fragment fragmentBZ = new WebViewFragment();

                    Bundle args1 = new Bundle();
                    args1.putString("KEY", "https://bluezone.gov.vn/"); // putInt, putDouble...
                    fragmentBZ.setArguments(args1);
                    managerBZ.beginTransaction()
                            .replace(R.id.webcontain_land, fragmentBZ)
                            .addToBackStack("back")
                            .commit();
                    break;
                case R.id.im_fb:
                    FragmentManager managerFB = getFragmentManager();
                    Fragment fragmentFB = new WebViewFragment();

                    Bundle argFB = new Bundle();
                    argFB.putString("KEY", "https://fb.com"); // putInt, putDouble...
                    fragmentFB.setArguments(argFB);
                    managerFB.beginTransaction()
                            .replace(R.id.webcontain_land, fragmentFB)
                            .addToBackStack("back")
                            .commit();
                    break;
                case R.id.im_zing:
                    FragmentManager managerZ = getFragmentManager();
                    Fragment fragmentZ = new WebViewFragment();

                    Bundle argsZ = new Bundle();
                    argsZ.putString("KEY", "https://zingmp3.vn"); // putInt, putDouble...
                    fragmentZ.setArguments(argsZ);
                    managerZ.beginTransaction()
                            .replace(R.id.webcontain_land, fragmentZ)
                            .addToBackStack("back")
                            .commit();
                    break;

                default:
                    Toast.makeText(getActivity(), "..!!!", Toast.LENGTH_SHORT).show();
            }
        } else{
                // In portrait
                switch (v.getId()) {
                    case R.id.im_gg:

                        FragmentManager managerGG = getFragmentManager();
                        Fragment fragmentGG = new WebViewFragment();

                        Bundle argsGG = new Bundle();
                        argsGG.putString("KEY", "https://www.google.com/"); // putInt, putDouble...
                        fragmentGG.setArguments(argsGG);
                        managerGG.beginTransaction()
                                .replace(R.id.container, fragmentGG)
                                .addToBackStack("back")
                                .commit();
                        break;
                    case R.id.im_bluezone:
                        FragmentManager managerBZ = getFragmentManager();
                        Fragment fragmentBZ = new WebViewFragment();

                        Bundle args1 = new Bundle();
                        args1.putString("KEY", "https://bluezone.gov.vn/"); // putInt, putDouble...
                        fragmentBZ.setArguments(args1);
                        managerBZ.beginTransaction()
                                .replace(R.id.container, fragmentBZ)
                                .addToBackStack("back")
                                .commit();
                        break;
                    case R.id.im_fb:
                        FragmentManager managerFB = getFragmentManager();
                        Fragment fragmentFB = new WebViewFragment();

                        Bundle argFB = new Bundle();
                        argFB.putString("KEY", "https://fb.com"); // putInt, putDouble...
                        fragmentFB.setArguments(argFB);
                        managerFB.beginTransaction()
                                .replace(R.id.container, fragmentFB)
                                .addToBackStack("back")
                                .commit();
                        break;
                    case R.id.im_zing:
                        FragmentManager managerZ = getFragmentManager();
                        Fragment fragmentZ = new WebViewFragment();

                        Bundle argsZ = new Bundle();
                        argsZ.putString("KEY", "https://zingmp3.vn"); // putInt, putDouble...
                        fragmentZ.setArguments(argsZ);
                        managerZ.beginTransaction()
                                .replace(R.id.container, fragmentZ)
                                .addToBackStack("back")
                                .commit();
                        break;
                    default:
                        Toast.makeText(getActivity(), "..!!!", Toast.LENGTH_SHORT).show();
                }

            }


        }
    }
