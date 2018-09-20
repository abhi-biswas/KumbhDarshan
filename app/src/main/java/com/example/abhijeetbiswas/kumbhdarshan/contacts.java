package com.example.abhijeetbiswas.kumbhdarshan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.content.pm.PackageManager;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link contacts.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link contacts#newInstance} factory method to
 * create an instance of this fragment.
 */
public class contacts extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
   /* private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public contacts() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment contacts.
     */
    // TODO: Rename and change types and number of parameters
   /* public static contacts newInstance(String param1, String param2) {
        contacts fragment = new contacts();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }*/
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_contacts, container, false);
        Button button=(Button)view.findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String phoneNumber = String.format("tel:+915322500775");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse(phoneNumber));
                startActivity(dialIntent);
            }
        });
        Button button2=(Button)view.findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // click bottom code here
                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                String[] add={"Test@gmail.com"};
                sendIntent.putExtra(Intent.EXTRA_EMAIL,add);
                sendIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject");
                sendIntent.putExtra(Intent.EXTRA_TEXT,"Body");
                sendIntent.setType("message/rfc822");
                startActivity(Intent.createChooser(sendIntent,"Send email..."));
            }
        });
        Button button3=(Button)view.findViewById(R.id.button7);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String phoneNumber = String.format("tel:+915322504011");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse(phoneNumber));
                startActivity(dialIntent);
            }
        });
        Button button4=(Button)view.findViewById(R.id.button8);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String phoneNumber = String.format("tel:101");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse(phoneNumber));
                startActivity(dialIntent);
            }
        });
        Button button5=(Button)view.findViewById(R.id.button9);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String phoneNumber = String.format("tel:102");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse(phoneNumber));
                startActivity(dialIntent);
            }
        });
        Button button6=(Button)view.findViewById(R.id.button10);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String phoneNumber = String.format("tel:100");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse(phoneNumber));
                startActivity(dialIntent);
            }
        });
        Button button7=(Button)view.findViewById(R.id.button11);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String phoneNumber = String.format("tel:108");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse(phoneNumber));
                startActivity(dialIntent);
            }
        });
        return view;
    }

  /*  @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


   }*/


  /*
  Intent intent = new Intent(android.content.Intent.ACTION_SEND);
intent.setType("text/html");
// intent.setType("text/plain");
final PackageManager pm = getPackageManager();
final List<ResolveInfo> matches = pm.queryIntentActivities(intent, 0);
ResolveInfo best = null;
for (final ResolveInfo info : matches) {
    if (info.activityInfo.packageName.endsWith(".gm") || info.activityInfo.name.toLowerCase().contains("gmail")) {
        best = info;
        break;
    }
}
if (best != null) {
    intent.setClassName(best.activityInfo.packageName, best.activityInfo.name);
}
intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "YOUR SUBJECT");
intent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml("YOUR EXTRAS"));

startActivity(intent);
*/

}
